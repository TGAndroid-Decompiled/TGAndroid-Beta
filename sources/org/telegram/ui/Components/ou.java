package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ou extends PopupWindow {
    public static Field f31477f;
    public static final org.telegram.ui.ActionBar.h1 f31478g = new org.telegram.ui.ActionBar.h1(1);
    public ViewTreeObserver.OnScrollChangedListener f31479a;
    public ViewTreeObserver f31480b;
    public final nu f31481c;
    public boolean d;
    public final int f31482e;

    public ou(nu nuVar) {
        super(nuVar);
        float f9;
        if (AndroidUtilities.isTablet()) {
            f9 = 40.0f;
        } else {
            f9 = 32.0f;
        }
        this.f31482e = AndroidUtilities.dp(f9);
        this.f31481c = nuVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        nuVar.setFocusableInTouchMode(true);
        nuVar.setOnKeyListener(new hn(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f31479a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f31480b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f31480b.removeOnScrollChangedListener(this.f31479a);
                }
                this.f31480b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f31479a);
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
        if (this.f31479a != null && (viewTreeObserver = this.f31480b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f31480b.removeOnScrollChangedListener(this.f31479a);
            }
            this.f31480b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        try {
            super.showAsDropDown(view, i10, i11);
            a(view);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i10, i11, i12);
        if (this.f31479a != null && (viewTreeObserver = this.f31480b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f31480b.removeOnScrollChangedListener(this.f31479a);
            }
            this.f31480b = null;
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
