package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class rt extends mt {
    public Drawable f39404e2;
    public final int f39405f2;
    public final wt f39406g2;

    public rt(wt wtVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.f39406g2 = wtVar;
        this.f39405f2 = i7;
        this.f39404e2 = null;
    }

    @Override
    public final void G(int i7, int i10) {
        this.f39406g2.q(i7, i10);
    }

    @Override
    public final int e() {
        return this.f39406g2.h();
    }

    @Override
    public final int getActionModeStyle() {
        int i7 = this.f39405f2;
        if (i7 == 2 || i7 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        boolean z10;
        wt wtVar = this.f39406g2;
        if (wtVar.a()) {
            if (wtVar.M == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.bn.C8(menu, null, z10, true, true, true);
            return;
        }
        wtVar.i(actionMode, menu);
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        boolean z10;
        super.onSelectionChanged(i7, i10);
        wt wtVar = this.f39406g2;
        mk0 mk0Var = wtVar.f41721c;
        if (mk0Var != null) {
            boolean z11 = false;
            if (i10 != i7) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (wtVar.a() && z10) {
                org.telegram.messenger.c6.i();
                z11 = true;
            }
            if (wtVar.f41724n != z11) {
                wtVar.f41724n = z11;
                if (z11) {
                    this.f39404e2 = mk0Var.d;
                    mk0Var.a(2131232121, true);
                    return;
                }
                mk0Var.b(this.f39404e2, true);
                this.f39404e2 = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        st stVar;
        wt wtVar = this.f39406g2;
        if (wtVar.f41722e && motionEvent.getAction() == 0) {
            wtVar.u();
            if (wtVar.f41729y && (stVar = wtVar.d) != null) {
                stVar.t(false);
                wtVar.f41729y = false;
                wtVar.k(true);
                org.telegram.messenger.g0.I3(this);
            } else {
                if (org.telegram.messenger.g0.D) {
                    i7 = 0;
                } else {
                    i7 = 2;
                }
                wtVar.x(i7);
            }
            wtVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!org.telegram.messenger.g0.I3(this)) {
                clearFocus();
                requestFocus();
            }
            if (!isFocused) {
                setSelection(getText().length());
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i7, int i10) {
        if (this.f39406g2.t(i10)) {
            super.scrollTo(i7, i10);
        }
    }
}
