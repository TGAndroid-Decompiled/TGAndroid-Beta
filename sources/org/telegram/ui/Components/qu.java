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
public final class qu extends nu {
    public Drawable f28674c;
    public final int d;
    public final vu e;

    public qu(vu vuVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.e = vuVar;
        this.d = i10;
        this.f28674c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        vu vuVar = this.e;
        if (vuVar.a()) {
            if (vuVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.fo.n8(menu, null, z10, true, true, true);
            return;
        }
        vuVar.i(menu);
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
        vu vuVar = this.e;
        rm0 rm0Var = vuVar.f30651c;
        if (rm0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (vuVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (vuVar.f30653n != z11) {
                vuVar.f30653n = z11;
                if (z11) {
                    this.f28674c = rm0Var.d;
                    rm0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                rm0Var.b(this.f28674c, true);
                this.f28674c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        ru ruVar;
        vu vuVar = this.e;
        if (vuVar.e && motionEvent.getAction() == 0) {
            vuVar.u();
            if (vuVar.f30657x && (ruVar = vuVar.d) != null) {
                ruVar.u(false);
                vuVar.f30657x = false;
                vuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                vuVar.x(i10);
            }
            vuVar.v();
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
