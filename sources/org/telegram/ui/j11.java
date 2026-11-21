package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class j11 extends PopupWindow {
    public static final Field f48864c;
    public static final org.telegram.ui.ActionBar.z0 d = new org.telegram.ui.ActionBar.z0(2);
    public final ViewTreeObserver.OnScrollChangedListener f48865a;
    public ViewTreeObserver f48866b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f48864c = field;
    }

    public j11(s11 s11Var) {
        super(s11Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f48864c;
        if (field != null) {
            try {
                this.f48865a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f48865a = null;
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
        if (getContentView() instanceof s11) {
            ((s11) getContentView()).s(new i11(this, 1));
        }
        if (this.f48865a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f48866b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f48866b.removeOnScrollChangedListener(this.f48865a);
                }
                this.f48866b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f48865a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof s11) {
            s11 s11Var = (s11) getContentView();
            i11 i11Var = new i11(this, 0);
            Integer num = s11Var.f51821a2;
            if (num != null) {
                s11.f51817e2.put(num, s11Var.f51860s0.e0());
            }
            ValueAnimator valueAnimator = s11Var.X1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                s11Var.X1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            s11Var.X1 = ofFloat;
            ofFloat.addUpdateListener(new vz0(s11Var, 3));
            s11Var.X1.addListener(new org.telegram.ui.Components.h10(16, s11Var, i11Var));
            s11Var.X1.setDuration(200L);
            s11Var.X1.setInterpolator(org.telegram.ui.Components.nr.h);
            s11Var.X1.start();
            k01 k01Var = s11Var.f51836g0;
            if (k01Var != null) {
                org.telegram.messenger.g0.v1(k01Var.h);
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
        if (this.f48865a != null && (viewTreeObserver = this.f48866b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f48866b.removeOnScrollChangedListener(this.f48865a);
            }
            this.f48866b = null;
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
