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
public final class hu extends eu {
    public Drawable f27235c;
    public final int d;
    public final mu f27236e;

    public hu(mu muVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f27236e = muVar;
        this.d = i10;
        this.f27235c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.f27236e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        mu muVar = this.f27236e;
        if (muVar.a()) {
            if (muVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.yn.k8(menu, null, z10, true, true, true);
            return;
        }
        muVar.i(menu);
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
        this.f27236e.q(i10, i11);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        boolean z10;
        super.onSelectionChanged(i10, i11);
        mu muVar = this.f27236e;
        hm0 hm0Var = muVar.f28707c;
        if (hm0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (muVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (muVar.f28710n != z11) {
                muVar.f28710n = z11;
                if (z11) {
                    this.f27235c = hm0Var.d;
                    hm0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                hm0Var.b(this.f27235c, true);
                this.f27235c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        iu iuVar;
        mu muVar = this.f27236e;
        if (muVar.f28708e && motionEvent.getAction() == 0) {
            muVar.u();
            if (muVar.f28714x && (iuVar = muVar.d) != null) {
                iuVar.t(false);
                muVar.f28714x = false;
                muVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                muVar.x(i10);
            }
            muVar.v();
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
        if (this.f27236e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
