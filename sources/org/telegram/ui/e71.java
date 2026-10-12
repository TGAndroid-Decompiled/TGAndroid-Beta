package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class e71 extends PopupWindow {
    public static final Field f37026c;
    public static final org.telegram.ui.ActionBar.f1 d = new org.telegram.ui.ActionBar.f1(2);
    public final ViewTreeObserver.OnScrollChangedListener f37027a;
    public ViewTreeObserver f37028b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f37026c = field;
    }

    public e71(n71 n71Var) {
        super(n71Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f37026c;
        if (field != null) {
            try {
                this.f37027a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f37027a = null;
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
        if (getContentView() instanceof n71) {
            ((n71) getContentView()).s(new d71(this, 1));
        }
        if (this.f37027a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f37028b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f37028b.removeOnScrollChangedListener(this.f37027a);
                }
                this.f37028b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f37027a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof n71) {
            n71 n71Var = (n71) getContentView();
            d71 d71Var = new d71(this, 0);
            Integer num = n71Var.Y1;
            if (num != null) {
                n71.f40255c2.put(num, n71Var.f40295r0.e0());
            }
            ValueAnimator valueAnimator = n71Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                n71Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            n71Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new o51(n71Var, 3));
            n71Var.V1.addListener(new org.telegram.ui.Components.am0(15, n71Var, d71Var));
            n71Var.V1.setDuration(200L);
            n71Var.V1.setInterpolator(org.telegram.ui.Components.js.h);
            n71Var.V1.start();
            e61 e61Var = n71Var.f40271f0;
            if (e61Var != null) {
                AndroidUtilities.hideKeyboard(e61Var.h);
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
        if (this.f37027a != null && (viewTreeObserver = this.f37028b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f37028b.removeOnScrollChangedListener(this.f37027a);
            }
            this.f37028b = null;
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
