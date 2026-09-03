package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class tu extends PopupWindow {
    public static Field f31415f;
    public static final org.telegram.ui.ActionBar.h1 f31416g = new org.telegram.ui.ActionBar.h1(1);
    public ViewTreeObserver.OnScrollChangedListener f31417a;
    public ViewTreeObserver f31418b;
    public final su f31419c;
    public boolean d;
    public final int f31420e;

    public tu(su suVar) {
        super(suVar);
        float f10;
        if (AndroidUtilities.isTablet()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f31420e = AndroidUtilities.dp(f10);
        this.f31419c = suVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        suVar.setFocusableInTouchMode(true);
        suVar.setOnKeyListener(new kn(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f31417a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f31418b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f31418b.removeOnScrollChangedListener(this.f31417a);
                }
                this.f31418b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f31417a);
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        setFocusable(false);
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        if (this.f31417a != null && (viewTreeObserver = this.f31418b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f31418b.removeOnScrollChangedListener(this.f31417a);
            }
            this.f31418b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        try {
            super.showAsDropDown(view, i10, i11);
            a(view);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i10, i11, i12);
        if (this.f31417a != null && (viewTreeObserver = this.f31418b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f31418b.removeOnScrollChangedListener(this.f31417a);
            }
            this.f31418b = null;
        }
    }

    @Override
    public final void update(View view, int i10, int i11, int i12, int i13) {
        super.update(view, i10, i11, i12, i13);
        a(view);
    }

    @Override
    public final void update(View view, int i10, int i11) {
        super.update(view, i10, i11);
        a(view);
    }
}
