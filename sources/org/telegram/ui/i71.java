package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class i71 extends PopupWindow {
    public static final Field f37053c;
    public static final org.telegram.ui.ActionBar.f1 d = new org.telegram.ui.ActionBar.f1(2);
    public final ViewTreeObserver.OnScrollChangedListener f37054a;
    public ViewTreeObserver f37055b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f37053c = field;
    }

    public i71(r71 r71Var) {
        super(r71Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f37053c;
        if (field != null) {
            try {
                this.f37054a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f37054a = null;
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
        if (getContentView() instanceof r71) {
            ((r71) getContentView()).s(new h71(this, 1));
        }
        if (this.f37054a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f37055b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f37055b.removeOnScrollChangedListener(this.f37054a);
                }
                this.f37055b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f37054a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof r71) {
            r71 r71Var = (r71) getContentView();
            h71 h71Var = new h71(this, 0);
            Integer num = r71Var.Y1;
            if (num != null) {
                r71.f39618c2.put(num, r71Var.f39657r0.e0());
            }
            ValueAnimator valueAnimator = r71Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                r71Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            r71Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new s51(r71Var, 3));
            r71Var.V1.addListener(new org.telegram.ui.Components.ql0(15, r71Var, h71Var));
            r71Var.V1.setDuration(200L);
            r71Var.V1.setInterpolator(org.telegram.ui.Components.es.h);
            r71Var.V1.start();
            i61 i61Var = r71Var.f39633f0;
            if (i61Var != null) {
                AndroidUtilities.hideKeyboard(i61Var.h);
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
        if (this.f37054a != null && (viewTreeObserver = this.f37055b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f37055b.removeOnScrollChangedListener(this.f37054a);
            }
            this.f37055b = null;
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
