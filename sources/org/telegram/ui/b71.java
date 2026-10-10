package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class b71 extends PopupWindow {
    public static final Field f36199c;
    public static final org.telegram.ui.ActionBar.g1 d = new org.telegram.ui.ActionBar.g1(2);
    public final ViewTreeObserver.OnScrollChangedListener f36200a;
    public ViewTreeObserver f36201b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f36199c = field;
    }

    public b71(k71 k71Var) {
        super(k71Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f36199c;
        if (field != null) {
            try {
                this.f36200a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f36200a = null;
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
        if (getContentView() instanceof k71) {
            ((k71) getContentView()).s(new a71(this, 1));
        }
        if (this.f36200a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f36201b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f36201b.removeOnScrollChangedListener(this.f36200a);
                }
                this.f36201b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f36200a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof k71) {
            k71 k71Var = (k71) getContentView();
            a71 a71Var = new a71(this, 0);
            Integer num = k71Var.Y1;
            if (num != null) {
                k71.f39156c2.put(num, k71Var.f39196r0.e0());
            }
            ValueAnimator valueAnimator = k71Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                k71Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            k71Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new l51(k71Var, 3));
            k71Var.V1.addListener(new org.telegram.ui.Components.vl0(15, k71Var, a71Var));
            k71Var.V1.setDuration(200L);
            k71Var.V1.setInterpolator(org.telegram.ui.Components.is.h);
            k71Var.V1.start();
            b61 b61Var = k71Var.f39172f0;
            if (b61Var != null) {
                AndroidUtilities.hideKeyboard(b61Var.h);
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
        if (this.f36200a != null && (viewTreeObserver = this.f36201b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f36201b.removeOnScrollChangedListener(this.f36200a);
            }
            this.f36201b = null;
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
