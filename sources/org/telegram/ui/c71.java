package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
public abstract class c71 extends PopupWindow {
    public static final Field f31556c;
    public static final org.telegram.ui.ActionBar.h1 d = new org.telegram.ui.ActionBar.h1(2);
    public final ViewTreeObserver.OnScrollChangedListener f31557a;
    public ViewTreeObserver f31558b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        f31556c = field;
    }

    public c71(l71 l71Var) {
        super(l71Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = f31556c;
        if (field != null) {
            try {
                this.f31557a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.f31557a = null;
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
        if (getContentView() instanceof l71) {
            ((l71) getContentView()).s(new b71(this, 1));
        }
        if (this.f31557a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f31558b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f31558b.removeOnScrollChangedListener(this.f31557a);
                }
                this.f31558b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f31557a);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof l71) {
            l71 l71Var = (l71) getContentView();
            b71 b71Var = new b71(this, 0);
            Integer num = l71Var.Y1;
            if (num != null) {
                l71.f34551c2.put(num, l71Var.f34590r0.e0());
            }
            ValueAnimator valueAnimator = l71Var.V1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                l71Var.V1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            l71Var.V1 = ofFloat;
            ofFloat.addUpdateListener(new o51(l71Var, 3));
            l71Var.V1.addListener(new org.telegram.ui.Components.vv0(13, (Object) l71Var, (Object) b71Var));
            l71Var.V1.setDuration(200L);
            l71Var.V1.setInterpolator(org.telegram.ui.Components.wr.h);
            l71Var.V1.start();
            c61 c61Var = l71Var.f34566f0;
            if (c61Var != null) {
                AndroidUtilities.hideKeyboard(c61Var.h);
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
        if (this.f31557a != null && (viewTreeObserver = this.f31558b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f31558b.removeOnScrollChangedListener(this.f31557a);
            }
            this.f31558b = null;
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
