package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class h11 extends PopupWindow {
    public static final Field f46193c;
    public static final org.telegram.ui.ActionBar.a1 d = new org.telegram.ui.ActionBar.a1(2);
    public final ViewTreeObserver.OnScrollChangedListener f46194a;
    public ViewTreeObserver f46195b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f46193c = field;
    }

    public h11(q11 q11Var) {
        super(q11Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f46193c;
        if (field != null) {
            try {
                this.f46194a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f46194a = null;
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
        if (this.f46194a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f46195b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f46195b.removeOnScrollChangedListener(this.f46194a);
                }
                this.f46195b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f46194a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof q11) {
            q11 q11Var = (q11) getContentView();
            g11 g11Var = new g11(this, 0);
            Integer num = q11Var.Z1;
            if (num != null) {
                q11.d2.put(num, q11Var.f49054r0.e0());
            }
            ValueAnimator valueAnimator = q11Var.W1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                q11Var.W1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            q11Var.W1 = ofFloat;
            ofFloat.addUpdateListener(new sz0(q11Var, 3));
            q11Var.W1.addListener(new org.telegram.ui.Components.v50(15, q11Var, g11Var));
            q11Var.W1.setDuration(200L);
            q11Var.W1.setInterpolator(org.telegram.ui.Components.xq.h);
            q11Var.W1.start();
            i01 i01Var = q11Var.f49031f0;
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
        if (this.f46194a != null && (viewTreeObserver = this.f46195b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f46195b.removeOnScrollChangedListener(this.f46194a);
            }
            this.f46195b = null;
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
