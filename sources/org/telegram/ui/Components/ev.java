package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ev extends PopupWindow {
    public static Field f25975f;
    public static final org.telegram.ui.ActionBar.f1 f25976g = new org.telegram.ui.ActionBar.f1(1);
    public ViewTreeObserver.OnScrollChangedListener f25977a;
    public ViewTreeObserver f25978b;
    public final dv f25979c;
    public boolean d;
    public final int e;

    public ev(dv dvVar) {
        super(dvVar);
        float f7;
        if (AndroidUtilities.isTablet()) {
            f7 = 40.0f;
        } else {
            f7 = 32.0f;
        }
        this.e = AndroidUtilities.dp(f7);
        this.f25979c = dvVar;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        dvVar.setFocusableInTouchMode(true);
        dvVar.setOnKeyListener(new wn(this, 1));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.f25977a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.f25978b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.f25978b.removeOnScrollChangedListener(this.f25977a);
                }
                this.f25978b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.f25977a);
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
        if (this.f25977a != null && (viewTreeObserver = this.f25978b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f25978b.removeOnScrollChangedListener(this.f25977a);
            }
            this.f25978b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i10, int i11) {
        try {
            super.showAsDropDown(view, i10, i11);
            a(view);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i10, i11, i12);
        if (this.f25977a != null && (viewTreeObserver = this.f25978b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.f25978b.removeOnScrollChangedListener(this.f25977a);
            }
            this.f25978b = null;
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
