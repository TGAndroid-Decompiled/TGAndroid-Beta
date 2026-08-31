package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class tu extends PopupWindow {
    public static Field f31455f;
    public static final org.telegram.ui.ActionBar.h1 f31456g = new org.telegram.ui.ActionBar.h1(1);
    public ViewTreeObserver.OnScrollChangedListener f31457a;
    public ViewTreeObserver f31458b;
    public final su f31459c;
    public boolean d;
    public final int f31460e;

    public tu(su suVar) {
        super(suVar);
        float f10;
        if (AndroidUtilities.isTablet()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f31460e = AndroidUtilities.dp(f10);
        this.f31459c = suVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        suVar.setFocusableInTouchMode(true);
        suVar.setOnKeyListener(new ln(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f31457a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f31458b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f31458b.removeOnScrollChangedListener(this.f31457a);
                }
                this.f31458b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f31457a);
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
        if (this.f31457a != null && (viewTreeObserver = this.f31458b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f31458b.removeOnScrollChangedListener(this.f31457a);
            }
            this.f31458b = null;
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
        if (this.f31457a != null && (viewTreeObserver = this.f31458b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f31458b.removeOnScrollChangedListener(this.f31457a);
            }
            this.f31458b = null;
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
