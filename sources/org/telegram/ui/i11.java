package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class i11 extends PopupWindow {
    public static final Field f48530c;
    public static final org.telegram.ui.ActionBar.z0 d = new org.telegram.ui.ActionBar.z0(2);
    public final ViewTreeObserver.OnScrollChangedListener f48531a;
    public ViewTreeObserver f48532b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f48530c = field;
    }

    public i11(r11 r11Var) {
        super(r11Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f48530c;
        if (field != null) {
            try {
                this.f48531a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f48531a = null;
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
        if (getContentView() instanceof r11) {
            ((r11) getContentView()).s(new h11(this, 1));
        }
        if (this.f48531a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f48532b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f48532b.removeOnScrollChangedListener(this.f48531a);
                }
                this.f48532b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f48531a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof r11) {
            r11 r11Var = (r11) getContentView();
            h11 h11Var = new h11(this, 0);
            Integer num = r11Var.f51403a2;
            if (num != null) {
                r11.f51399e2.put(num, r11Var.f51442s0.e0());
            }
            ValueAnimator valueAnimator = r11Var.X1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                r11Var.X1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            r11Var.X1 = ofFloat;
            ofFloat.addUpdateListener(new uz0(r11Var, 3));
            r11Var.X1.addListener(new org.telegram.ui.Components.h10(16, r11Var, h11Var));
            r11Var.X1.setDuration(200L);
            r11Var.X1.setInterpolator(org.telegram.ui.Components.nr.h);
            r11Var.X1.start();
            j01 j01Var = r11Var.f51418g0;
            if (j01Var != null) {
                org.telegram.messenger.g0.v1(j01Var.h);
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
        if (this.f48531a != null && (viewTreeObserver = this.f48532b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f48532b.removeOnScrollChangedListener(this.f48531a);
            }
            this.f48532b = null;
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
