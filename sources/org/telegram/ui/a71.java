package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class a71 extends PopupWindow {
    public static final Field f35912c;
    public static final org.telegram.ui.ActionBar.f1 d = new org.telegram.ui.ActionBar.f1(2);
    public final ViewTreeObserver.OnScrollChangedListener f35913a;
    public ViewTreeObserver f35914b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f35912c = field;
    }

    public a71(j71 j71Var) {
        super(j71Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f35912c;
        if (field != null) {
            try {
                this.f35913a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f35913a = null;
            }
        }
    }

    public final void b() {
        View rootView = getContentView().getRootView();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = 0.2f;
        ((WindowManager) getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
    }

    public final void c(View view) {
        ViewTreeObserver viewTreeObserver;
        if (getContentView() instanceof j71) {
            ((j71) getContentView()).s(new z61(this, 1));
        }
        if (this.f35913a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f35914b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f35914b.removeOnScrollChangedListener(this.f35913a);
                }
                this.f35914b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f35913a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof j71) {
            j71 j71Var = (j71) getContentView();
            z61 z61Var = new z61(this, 0);
            Integer num = j71Var.Y1;
            if (num != null) {
                j71.f38874c2.put(num, j71Var.f38914r0.e0());
            }
            ValueAnimator valueAnimator = j71Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                j71Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            j71Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new k51(j71Var, 3));
            j71Var.V1.addListener(new org.telegram.ui.Components.wl0(15, j71Var, z61Var));
            j71Var.V1.setDuration(200L);
            j71Var.V1.setInterpolator(org.telegram.ui.Components.is.h);
            j71Var.V1.start();
            a61 a61Var = j71Var.f38890f0;
            if (a61Var != null) {
                AndroidUtilities.hideKeyboard(a61Var.h);
            }
            View rootView = getContentView().getRootView();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
                try {
                    int i10 = layoutParams.flags;
                    if ((i10 & 2) != 0) {
                        layoutParams.flags = i10 & (-3);
                        layoutParams.dimAmount = 0.0f;
                        windowManager.updateViewLayout(rootView, layoutParams);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        super.dismiss();
    }

    @Override
    public final void showAsDropDown(View view) {
        super.showAsDropDown(view);
        c(view);
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i10, i11, i12);
        if (this.f35913a != null && (viewTreeObserver = this.f35914b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f35914b.removeOnScrollChangedListener(this.f35913a);
            }
            this.f35914b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        super.showAsDropDown(view, i10, i11);
        c(view);
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11, int i12) {
        super.showAsDropDown(view, i10, i11, i12);
        c(view);
    }
}
