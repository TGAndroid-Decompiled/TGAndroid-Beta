package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class q51 extends PopupWindow {
    public static final Field f40317c;
    public static final org.telegram.ui.ActionBar.f1 d = new org.telegram.ui.ActionBar.f1(2);
    public final ViewTreeObserver.OnScrollChangedListener f40318a;
    public ViewTreeObserver f40319b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f40317c = field;
    }

    public q51(z51 z51Var) {
        super(z51Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f40317c;
        if (field != null) {
            try {
                this.f40318a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f40318a = null;
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
        if (getContentView() instanceof z51) {
            ((z51) getContentView()).s(new p51(this, 1));
        }
        if (this.f40318a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f40319b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f40319b.removeOnScrollChangedListener(this.f40318a);
                }
                this.f40319b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f40318a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof z51) {
            z51 z51Var = (z51) getContentView();
            p51 p51Var = new p51(this, 0);
            Integer num = z51Var.Y1;
            if (num != null) {
                z51.f43577c2.put(num, z51Var.f43616r0.e0());
            }
            ValueAnimator valueAnimator = z51Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                z51Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            z51Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new a41(z51Var, 3));
            z51Var.V1.addListener(new org.telegram.ui.Components.ml0(15, z51Var, p51Var));
            z51Var.V1.setDuration(200L);
            z51Var.V1.setInterpolator(org.telegram.ui.Components.bs.h);
            z51Var.V1.start();
            q41 q41Var = z51Var.f43592f0;
            if (q41Var != null) {
                AndroidUtilities.hideKeyboard(q41Var.h);
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
        if (this.f40318a != null && (viewTreeObserver = this.f40319b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f40319b.removeOnScrollChangedListener(this.f40318a);
            }
            this.f40319b = null;
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
