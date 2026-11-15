package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class e11 extends PopupWindow {
    public static final Field f46522c;
    public static final org.telegram.ui.ActionBar.a1 d = new org.telegram.ui.ActionBar.a1(2);
    public final ViewTreeObserver.OnScrollChangedListener f46523a;
    public ViewTreeObserver f46524b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f46522c = field;
    }

    public e11(n11 n11Var) {
        super(n11Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f46522c;
        if (field != null) {
            try {
                this.f46523a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f46523a = null;
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
        if (getContentView() instanceof n11) {
            ((n11) getContentView()).s(new d11(this, 1));
        }
        if (this.f46523a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f46524b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f46524b.removeOnScrollChangedListener(this.f46523a);
                }
                this.f46524b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f46523a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof n11) {
            n11 n11Var = (n11) getContentView();
            d11 d11Var = new d11(this, 0);
            Integer num = n11Var.f49367a2;
            if (num != null) {
                n11.f49363e2.put(num, n11Var.f49406s0.e0());
            }
            ValueAnimator valueAnimator = n11Var.X1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                n11Var.X1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            n11Var.X1 = ofFloat;
            ofFloat.addUpdateListener(new qz0(n11Var, 3));
            n11Var.X1.addListener(new org.telegram.ui.Components.y50(15, n11Var, d11Var));
            n11Var.X1.setDuration(200L);
            n11Var.X1.setInterpolator(org.telegram.ui.Components.er.h);
            n11Var.X1.start();
            f01 f01Var = n11Var.f49382g0;
            if (f01Var != null) {
                org.telegram.messenger.g0.v1(f01Var.h);
            }
            View rootView = getContentView().getRootView();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
                try {
                    int i7 = layoutParams.flags;
                    if ((i7 & 2) != 0) {
                        layoutParams.flags = i7 & (-3);
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
    public final void showAtLocation(View view, int i7, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i7, i10, i11);
        if (this.f46523a != null && (viewTreeObserver = this.f46524b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f46524b.removeOnScrollChangedListener(this.f46523a);
            }
            this.f46524b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i7, int i10) {
        super.showAsDropDown(view, i7, i10);
        c(view);
    }

    @Override
    public final void showAsDropDown(View view, int i7, int i10, int i11) {
        super.showAsDropDown(view, i7, i10, i11);
        c(view);
    }
}
