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
public final class eu extends bu {
    public Drawable f23752c;
    public final int d;
    public final ju e;

    public eu(ju juVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.e = juVar;
        this.d = i10;
        this.f23752c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        ju juVar = this.e;
        if (juVar.a()) {
            if (juVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.bo.k8(menu, null, z10, true, true, true);
            return;
        }
        juVar.i(menu);
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
        this.e.q(i10, i11);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        boolean z10;
        super.onSelectionChanged(i10, i11);
        ju juVar = this.e;
        ql0 ql0Var = juVar.f25421c;
        if (ql0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (juVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (juVar.f25423n != z11) {
                juVar.f25423n = z11;
                if (z11) {
                    this.f23752c = ql0Var.d;
                    ql0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                ql0Var.b(this.f23752c, true);
                this.f23752c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        fu fuVar;
        ju juVar = this.e;
        if (juVar.e && motionEvent.getAction() == 0) {
            juVar.u();
            if (juVar.f25427x && (fuVar = juVar.d) != null) {
                fuVar.t(false);
                juVar.f25427x = false;
                juVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                juVar.x(i10);
            }
            juVar.v();
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
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i10, int i11) {
        if (this.e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
