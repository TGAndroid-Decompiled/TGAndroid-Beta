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
public final class au extends xt {
    public Drawable f25373c;
    public final int d;
    public final fu f25374e;

    public au(fu fuVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, g6Var);
        this.f25374e = fuVar;
        this.d = i10;
        this.f25373c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.f25374e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z4;
        fu fuVar = this.f25374e;
        if (fuVar.a()) {
            if (fuVar.I == 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            org.telegram.ui.xn.k8(menu, null, z4, true, true, true);
            return;
        }
        fuVar.i(menu);
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
        this.f25374e.q(i10, i11);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        boolean z4;
        super.onSelectionChanged(i10, i11);
        fu fuVar = this.f25374e;
        yl0 yl0Var = fuVar.f26999c;
        if (yl0Var != null) {
            boolean z10 = false;
            if (i11 != i10) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fuVar.a() && z4) {
                XiaomiUtilities.isMIUI();
                z10 = true;
            }
            if (fuVar.f27002n != z10) {
                fuVar.f27002n = z10;
                if (z10) {
                    this.f25373c = yl0Var.d;
                    yl0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                yl0Var.b(this.f25373c, true);
                this.f25373c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        bu buVar;
        fu fuVar = this.f25374e;
        if (fuVar.f27000e && motionEvent.getAction() == 0) {
            fuVar.u();
            if (fuVar.f27006x && (buVar = fuVar.d) != null) {
                buVar.t(false);
                fuVar.f27006x = false;
                fuVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                fuVar.x(i10);
            }
            fuVar.v();
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
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i10, int i11) {
        if (this.f25374e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
