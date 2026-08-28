package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class iu extends PopupWindow {
    public static Field f29518f;
    public static final org.telegram.ui.ActionBar.h1 f29519g = new org.telegram.ui.ActionBar.h1(1);
    public ViewTreeObserver.OnScrollChangedListener f29520a;
    public ViewTreeObserver f29521b;
    public final hu f29522c;
    public boolean d;
    public final int f29523e;

    public iu(hu huVar) {
        super(huVar);
        float f10;
        if (AndroidUtilities.isTablet()) {
            f10 = 40.0f;
        } else {
            f10 = 32.0f;
        }
        this.f29523e = AndroidUtilities.dp(f10);
        this.f29522c = huVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        huVar.setFocusableInTouchMode(true);
        huVar.setOnKeyListener(new cn(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f29520a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f29521b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f29521b.removeOnScrollChangedListener(this.f29520a);
                }
                this.f29521b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f29520a);
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
        if (this.f29520a != null && (viewTreeObserver = this.f29521b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f29521b.removeOnScrollChangedListener(this.f29520a);
            }
            this.f29521b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i9, int i10) {
        try {
            super.showAsDropDown(view, i9, i10);
            a(view);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void showAtLocation(View view, int i9, int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i9, i10, i11);
        if (this.f29520a != null && (viewTreeObserver = this.f29521b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f29521b.removeOnScrollChangedListener(this.f29520a);
            }
            this.f29521b = null;
        }
    }

    @Override
    public final void update(View view, int i9, int i10, int i11, int i12) {
        super.update(view, i9, i10, i11, i12);
        a(view);
    }

    @Override
    public final void update(View view, int i9, int i10) {
        super.update(view, i9, i10);
        a(view);
    }
}
