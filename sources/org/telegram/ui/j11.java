package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class j11 extends PopupWindow {
    public static final Field f46815c;
    public static final org.telegram.ui.ActionBar.a1 d = new org.telegram.ui.ActionBar.a1(2);
    public final ViewTreeObserver.OnScrollChangedListener f46816a;
    public ViewTreeObserver f46817b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f46815c = field;
    }

    public j11(s11 s11Var) {
        super(s11Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f46815c;
        if (field != null) {
            try {
                this.f46816a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f46816a = null;
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
        if (this.f46816a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f46817b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f46817b.removeOnScrollChangedListener(this.f46816a);
                }
                this.f46817b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f46816a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof s11) {
            s11 s11Var = (s11) getContentView();
            i11 i11Var = new i11(this, 0);
            Integer num = s11Var.Z1;
            if (num != null) {
                s11.d2.put(num, s11Var.f49699r0.e0());
            }
            ValueAnimator valueAnimator = s11Var.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                s11Var.W1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            s11Var.W1 = ofFloat;
            ofFloat.addUpdateListener(new vz0(s11Var, 3));
            s11Var.W1.addListener(new org.telegram.ui.Components.w50(15, s11Var, i11Var));
            s11Var.W1.setDuration(200L);
            s11Var.W1.setInterpolator(org.telegram.ui.Components.xq.h);
            s11Var.W1.start();
            k01 k01Var = s11Var.f49676f0;
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
        if (this.f46816a != null && (viewTreeObserver = this.f46817b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f46817b.removeOnScrollChangedListener(this.f46816a);
            }
            this.f46817b = null;
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
