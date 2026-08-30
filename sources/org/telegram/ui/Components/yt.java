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
public final class yt extends vt {
    public Drawable f31099c;
    public final int d;
    public final du e;

    public yt(du duVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.e = duVar;
        this.d = i10;
        this.f31099c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z4;
        du duVar = this.e;
        if (duVar.a()) {
            if (duVar.I == 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            org.telegram.ui.xn.k8(menu, null, z4, true, true, true);
            return;
        }
        duVar.i(menu);
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
        boolean z4;
        super.onSelectionChanged(i10, i11);
        du duVar = this.e;
        yl0 yl0Var = duVar.f24369c;
        if (yl0Var != null) {
            boolean z10 = false;
            if (i11 != i10) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (duVar.a() && z4) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (duVar.f24371n != z10) {
                duVar.f24371n = z10;
                if (z10) {
                    this.f31099c = yl0Var.d;
                    yl0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                yl0Var.b(this.f31099c, true);
                this.f31099c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        zt ztVar;
        du duVar = this.e;
        if (duVar.e && motionEvent.getAction() == 0) {
            duVar.u();
            if (duVar.f24375x && (ztVar = duVar.d) != null) {
                ztVar.t(false);
                duVar.f24375x = false;
                duVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                duVar.x(i10);
            }
            duVar.v();
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
