package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class hu extends PopupWindow {

    public static Field f29099f;

    public static final org.telegram.ui.ActionBar.g1 f29100g = new org.telegram.ui.ActionBar.g1(1);

    public ViewTreeObserver.OnScrollChangedListener f29101a;

    public ViewTreeObserver f29102b;

    public final gu f29103c;
    public boolean d;

    public final int f29104e;

    public hu(gu guVar) {
        super(guVar);
        this.f29104e = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        this.f29103c = guVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        guVar.setFocusableInTouchMode(true);
        guVar.setOnKeyListener(new bn(this, 1));
    }

    public final void a(View view) {
        if (this.f29101a != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.f29102b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f29102b.removeOnScrollChangedListener(this.f29101a);
                }
                this.f29102b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f29101a);
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
        if (this.f29101a == null || (viewTreeObserver = this.f29102b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.f29102b.removeOnScrollChangedListener(this.f29101a);
        }
        this.f29102b = null;
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        try {
            super.showAsDropDown(view, i10, i11);
            a(view);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i10, i11, i12);
        if (this.f29101a == null || (viewTreeObserver = this.f29102b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.f29102b.removeOnScrollChangedListener(this.f29101a);
        }
        this.f29102b = null;
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
