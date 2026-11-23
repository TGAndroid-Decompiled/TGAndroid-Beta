package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class h11 extends PopupWindow {
    public static final Field f48406c;
    public static final org.telegram.ui.ActionBar.z0 d = new org.telegram.ui.ActionBar.z0(2);
    public final ViewTreeObserver.OnScrollChangedListener f48407a;
    public ViewTreeObserver f48408b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f48406c = field;
    }

    public h11(q11 q11Var) {
        super(q11Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f48406c;
        if (field != null) {
            try {
                this.f48407a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f48407a = null;
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
        if (getContentView() instanceof q11) {
            ((q11) getContentView()).s(new g11(this, 1));
        }
        if (this.f48407a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f48408b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f48408b.removeOnScrollChangedListener(this.f48407a);
                }
                this.f48408b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f48407a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof q11) {
            q11 q11Var = (q11) getContentView();
            g11 g11Var = new g11(this, 0);
            Integer num = q11Var.f51228a2;
            if (num != null) {
                q11.f51224e2.put(num, q11Var.f51267s0.e0());
            }
            ValueAnimator valueAnimator = q11Var.X1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                q11Var.X1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            q11Var.X1 = ofFloat;
            ofFloat.addUpdateListener(new tz0(q11Var, 3));
            q11Var.X1.addListener(new org.telegram.ui.Components.f10(16, q11Var, g11Var));
            q11Var.X1.setDuration(200L);
            q11Var.X1.setInterpolator(org.telegram.ui.Components.kr.h);
            q11Var.X1.start();
            i01 i01Var = q11Var.f51243g0;
            if (i01Var != null) {
                org.telegram.messenger.g0.v1(i01Var.h);
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
        if (this.f48407a != null && (viewTreeObserver = this.f48408b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f48408b.removeOnScrollChangedListener(this.f48407a);
            }
            this.f48408b = null;
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
