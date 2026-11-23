package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public final class ku extends PopupWindow {
    public static Field f36981f;
    public static final org.telegram.ui.ActionBar.z0 f36982g = new org.telegram.ui.ActionBar.z0(1);
    public ViewTreeObserver.OnScrollChangedListener f36983a;
    public ViewTreeObserver f36984b;
    public final ju f36985c;
    public boolean d;
    public final int f36986e;

    public ku(ju juVar) {
        super(juVar);
        float f10;
        if (org.telegram.messenger.g0.Q1()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f36986e = org.telegram.messenger.g0.L(f10);
        this.f36985c = juVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        juVar.setFocusableInTouchMode(true);
        juVar.setOnKeyListener(new nn(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f36983a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f36984b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f36984b.removeOnScrollChangedListener(this.f36983a);
                }
                this.f36984b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f36983a);
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
        if (this.f36983a != null && (viewTreeObserver = this.f36984b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f36984b.removeOnScrollChangedListener(this.f36983a);
            }
            this.f36984b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i7, int i10) {
        try {
            super.showAsDropDown(view, i7, i10);
            a(view);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void showAtLocation(View view, int i7, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i7, i10, i11);
        if (this.f36983a != null && (viewTreeObserver = this.f36984b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f36984b.removeOnScrollChangedListener(this.f36983a);
            }
            this.f36984b = null;
        }
    }

    @Override
    public final void update(View view, int i7, int i10, int i11, int i12) {
        super.update(view, i7, i10, i11, i12);
        a(view);
    }

    @Override
    public final void update(View view, int i7, int i10) {
        super.update(view, i7, i10);
        a(view);
    }
}
