package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class q61 extends PopupWindow {
    public static final Field f36302c;
    public static final org.telegram.ui.ActionBar.g1 d = new org.telegram.ui.ActionBar.g1(2);
    public final ViewTreeObserver.OnScrollChangedListener f36303a;
    public ViewTreeObserver f36304b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f36302c = field;
    }

    public q61(z61 z61Var) {
        super(z61Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f36302c;
        if (field != null) {
            try {
                this.f36303a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f36303a = null;
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
        if (getContentView() instanceof z61) {
            ((z61) getContentView()).s(new p61(this, 1));
        }
        if (this.f36303a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f36304b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f36304b.removeOnScrollChangedListener(this.f36303a);
                }
                this.f36304b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f36303a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof z61) {
            z61 z61Var = (z61) getContentView();
            p61 p61Var = new p61(this, 0);
            Integer num = z61Var.Y1;
            if (num != null) {
                z61.f40002c2.put(num, z61Var.f40041r0.e0());
            }
            ValueAnimator valueAnimator = z61Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                z61Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            z61Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new b51(z61Var, 3));
            z61Var.V1.addListener(new org.telegram.ui.Components.qk0(15, z61Var, p61Var));
            z61Var.V1.setDuration(200L);
            z61Var.V1.setInterpolator(org.telegram.ui.Components.rr.h);
            z61Var.V1.start();
            q51 q51Var = z61Var.f40017f0;
            if (q51Var != null) {
                AndroidUtilities.hideKeyboard(q51Var.h);
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
        if (this.f36303a != null && (viewTreeObserver = this.f36304b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f36304b.removeOnScrollChangedListener(this.f36303a);
            }
            this.f36304b = null;
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
