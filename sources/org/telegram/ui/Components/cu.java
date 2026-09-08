package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.XiaomiUtilities;
public final class cu extends zt {
    public Drawable f25120c;
    public final int d;
    public final hu f25121e;

    public cu(hu huVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.f25121e = huVar;
        this.d = i10;
        this.f25120c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.f25121e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        hu huVar = this.f25121e;
        if (huVar.a()) {
            if (huVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.co.k8(menu, null, z10, true, true, true);
            return;
        }
        huVar.i(menu);
    }

    @Override
    public final int getActionModeStyle() {
        int i10 = this.d;
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void onLineCountChanged(int i10, int i11) {
        this.f25121e.q(i10, i11);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        boolean z10;
        super.onSelectionChanged(i10, i11);
        hu huVar = this.f25121e;
        ql0 ql0Var = huVar.f26876c;
        if (ql0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (huVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (huVar.f26879n != z11) {
                huVar.f26879n = z11;
                if (z11) {
                    this.f25120c = ql0Var.d;
                    ql0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                ql0Var.b(this.f25120c, true);
                this.f25120c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        du duVar;
        hu huVar = this.f25121e;
        if (huVar.f26877e && motionEvent.getAction() == 0) {
            huVar.u();
            if (huVar.f26883x && (duVar = huVar.d) != null) {
                duVar.t(false);
                huVar.f26883x = false;
                huVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                huVar.x(i10);
            }
            huVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!AndroidUtilities.showKeyboard(this)) {
                clearFocus();
                requestFocus();
            }
            if (!isFocused) {
                setSelection(getText().length());
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i10, int i11) {
        if (this.f25121e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
