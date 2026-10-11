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
public final class vu extends su {
    public Drawable f32548c;
    public final int d;
    public final av f32549e;

    public vu(av avVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.f32549e = avVar;
        this.d = i10;
        this.f32548c = null;
    }

    @Override
    public final int emojiCacheType() {
        return this.f32549e.h();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        boolean z10;
        av avVar = this.f32549e;
        if (avVar.a()) {
            if (avVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.zn.n8(menu, null, z10, true, true, true);
            return;
        }
        avVar.i(menu);
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
        this.f32549e.q(i10, i11);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        boolean z10;
        super.onSelectionChanged(i10, i11);
        av avVar = this.f32549e;
        wm0 wm0Var = avVar.f24681c;
        if (wm0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (avVar.a() && z10) {
                XiaomiUtilities.isMIUI();
                z11 = true;
            }
            if (avVar.f24684n != z11) {
                avVar.f24684n = z11;
                if (z11) {
                    this.f32548c = wm0Var.d;
                    wm0Var.a(R.drawable.msg_edit, true);
                    return;
                }
                wm0Var.b(this.f32548c, true);
                this.f32548c = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        wu wuVar;
        av avVar = this.f32549e;
        if (avVar.f24682e && motionEvent.getAction() == 0) {
            avVar.u();
            if (avVar.f24688x && (wuVar = avVar.d) != null) {
                wuVar.u(false);
                avVar.f24688x = false;
                avVar.k(true);
                AndroidUtilities.showKeyboard(this);
            } else {
                if (AndroidUtilities.usingHardwareInput) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                avVar.x(i10);
            }
            avVar.v();
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
        if (this.f32549e.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
