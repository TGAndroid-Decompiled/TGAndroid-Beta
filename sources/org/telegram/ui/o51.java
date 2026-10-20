package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class o51 extends PopupWindow {
    public static final Field f39778c;
    public static final org.telegram.ui.ActionBar.f1 d = new org.telegram.ui.ActionBar.f1(2);
    public final ViewTreeObserver.OnScrollChangedListener f39779a;
    public ViewTreeObserver f39780b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f39778c = field;
    }

    public o51(x51 x51Var) {
        super(x51Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f39778c;
        if (field != null) {
            try {
                this.f39779a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f39779a = null;
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
        if (getContentView() instanceof x51) {
            ((x51) getContentView()).s(new n51(this, 1));
        }
        if (this.f39779a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f39780b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f39780b.removeOnScrollChangedListener(this.f39779a);
                }
                this.f39780b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f39779a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof x51) {
            x51 x51Var = (x51) getContentView();
            n51 n51Var = new n51(this, 0);
            Integer num = x51Var.Y1;
            if (num != null) {
                x51.f43042c2.put(num, x51Var.f43081r0.e0());
            }
            ValueAnimator valueAnimator = x51Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                x51Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            x51Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new y31(x51Var, 3));
            x51Var.V1.addListener(new org.telegram.ui.Components.nl0(15, x51Var, n51Var));
            x51Var.V1.setDuration(200L);
            x51Var.V1.setInterpolator(org.telegram.ui.Components.bs.h);
            x51Var.V1.start();
            o41 o41Var = x51Var.f43057f0;
            if (o41Var != null) {
                AndroidUtilities.hideKeyboard(o41Var.h);
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
        if (this.f39779a != null && (viewTreeObserver = this.f39780b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f39780b.removeOnScrollChangedListener(this.f39779a);
            }
            this.f39780b = null;
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
