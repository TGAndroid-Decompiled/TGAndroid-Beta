package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class k11 extends PopupWindow {
    public static final Field f47134c;
    public static final org.telegram.ui.ActionBar.a1 d = new org.telegram.ui.ActionBar.a1(2);
    public final ViewTreeObserver.OnScrollChangedListener f47135a;
    public ViewTreeObserver f47136b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f47134c = field;
    }

    public k11(t11 t11Var) {
        super(t11Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f47134c;
        if (field != null) {
            try {
                this.f47135a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f47135a = null;
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
        if (getContentView() instanceof t11) {
            ((t11) getContentView()).s(new j11(this, 1));
        }
        if (this.f47135a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f47136b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f47136b.removeOnScrollChangedListener(this.f47135a);
                }
                this.f47136b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f47135a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof t11) {
            t11 t11Var = (t11) getContentView();
            j11 j11Var = new j11(this, 0);
            Integer num = t11Var.Z1;
            if (num != null) {
                t11.d2.put(num, t11Var.f50055r0.e0());
            }
            ValueAnimator valueAnimator = t11Var.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                t11Var.W1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            t11Var.W1 = ofFloat;
            ofFloat.addUpdateListener(new wz0(t11Var, 3));
            t11Var.W1.addListener(new org.telegram.ui.Components.v50(15, t11Var, j11Var));
            t11Var.W1.setDuration(200L);
            t11Var.W1.setInterpolator(org.telegram.ui.Components.wq.h);
            t11Var.W1.start();
            l01 l01Var = t11Var.f50032f0;
            if (l01Var != null) {
                org.telegram.messenger.g0.v1(l01Var.h);
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
        if (this.f47135a != null && (viewTreeObserver = this.f47136b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f47136b.removeOnScrollChangedListener(this.f47135a);
            }
            this.f47136b = null;
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
