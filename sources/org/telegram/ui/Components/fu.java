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
public final class fu extends cu {
    public Drawable f24088c;
    public final int d;
    public final ku e;

    public fu(ku kuVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.e = kuVar;
        this.d = i10;
        this.f24088c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        ku kuVar = this.e;
        if (kuVar.a()) {
            if (kuVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.xn.k8(menu, null, z10, true, true, true);
            return;
        }
        kuVar.i(menu);
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
        ku kuVar = this.e;
        rl0 rl0Var = kuVar.f25695c;
        if (rl0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (kuVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (kuVar.f25697n != z11) {
                kuVar.f25697n = z11;
                if (z11) {
                    this.f24088c = rl0Var.d;
                    rl0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                rl0Var.b(this.f24088c, true);
                this.f24088c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        gu guVar;
        ku kuVar = this.e;
        if (kuVar.e && motionEvent.getAction() == 0) {
            kuVar.u();
            if (kuVar.f25701x && (guVar = kuVar.d) != null) {
                guVar.t(false);
                kuVar.f25701x = false;
                kuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                kuVar.x(i10);
            }
            kuVar.v();
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
