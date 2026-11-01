package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class rt extends mt {
    public Drawable Y1;
    public final int Z1;
    public final wt a2;

    public rt(wt wtVar, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, p6Var);
        this.a2 = wtVar;
        this.Z1 = i10;
        this.Y1 = null;
    }

    @Override
    public final void F(int i10, int i11) {
        this.a2.q(i10, i11);
    }

    @Override
    public final int e() {
        return this.a2.h();
    }

    @Override
    public final int getActionModeStyle() {
        int i10 = this.Z1;
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        boolean z10;
        wt wtVar = this.a2;
        if (wtVar.a()) {
            if (wtVar.L == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.un.x8(menu, null, z10, true, true, true);
            return;
        }
        wtVar.i(actionMode, menu);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        boolean z10;
        super.onSelectionChanged(i10, i11);
        wt wtVar = this.a2;
        cl0 cl0Var = wtVar.f32310c;
        if (cl0Var != null) {
            boolean z11 = false;
            if (i11 != i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (wtVar.a() && z10) {
                org.telegram.messenger.d6.i();
                z11 = true;
            }
            if (wtVar.f32312n != z11) {
                wtVar.f32312n = z11;
                if (z11) {
                    this.Y1 = cl0Var.d;
                    cl0Var.a(2131232115, true);
                    return;
                }
                cl0Var.b(this.Y1, true);
                this.Y1 = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        st stVar;
        wt wtVar = this.a2;
        if (wtVar.e && motionEvent.getAction() == 0) {
            wtVar.u();
            if (wtVar.f32317y && (stVar = wtVar.d) != null) {
                stVar.t(false);
                wtVar.f32317y = false;
                wtVar.k(true);
                org.telegram.messenger.i0.J3(this);
            } else {
                if (org.telegram.messenger.i0.D) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                wtVar.x(i10);
            }
            wtVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!org.telegram.messenger.i0.J3(this)) {
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
            org.telegram.messenger.f8.g(e, true);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i10, int i11) {
        if (this.a2.t(i11)) {
            super.scrollTo(i10, i11);
        }
    }
}
