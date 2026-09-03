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
public final class xt extends ut {
    public Drawable f30712c;
    public final int d;
    public final cu e;

    public xt(cu cuVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, f6Var);
        this.e = cuVar;
        this.d = i10;
        this.f30712c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z4;
        cu cuVar = this.e;
        if (cuVar.a()) {
            if (cuVar.I == 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            org.telegram.ui.zn.k8(menu, null, z4, true, true, true);
            return;
        }
        cuVar.i(menu);
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
        cu cuVar = this.e;
        xl0 xl0Var = cuVar.f24032c;
        if (xl0Var != null) {
            boolean z10 = false;
            if (i11 != i10) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (cuVar.a() && z4) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (cuVar.f24034n != z10) {
                cuVar.f24034n = z10;
                if (z10) {
                    this.f30712c = xl0Var.d;
                    xl0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                xl0Var.b(this.f30712c, true);
                this.f30712c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        yt ytVar;
        cu cuVar = this.e;
        if (cuVar.e && motionEvent.getAction() == 0) {
            cuVar.u();
            if (cuVar.f24038x && (ytVar = cuVar.d) != null) {
                ytVar.t(false);
                cuVar.f24038x = false;
                cuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                cuVar.x(i10);
            }
            cuVar.v();
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
