package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class ft extends zs {
    public Drawable Y1;
    public final int Z1;
    public final lt f33643a2;

    public ft(lt ltVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.f33643a2 = ltVar;
        this.Z1 = i7;
        this.Y1 = null;
    }

    @Override
    public final void F(int i7, int i10) {
        this.f33643a2.q(i7, i10);
    }

    @Override
    public final int e() {
        return this.f33643a2.h();
    }

    @Override
    public final int getActionModeStyle() {
        int i7 = this.Z1;
        if (i7 == 2 || i7 == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        boolean z9;
        lt ltVar = this.f33643a2;
        if (ltVar.a()) {
            if (ltVar.L == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            org.telegram.ui.an.A8(menu, null, z9, true, true, true);
            return;
        }
        ltVar.i(actionMode, menu);
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        boolean z9;
        super.onSelectionChanged(i7, i10);
        lt ltVar = this.f33643a2;
        xj0 xj0Var = ltVar.f35779c;
        if (xj0Var != null) {
            boolean z10 = false;
            if (i10 != i7) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (ltVar.a() && z9) {
                org.telegram.messenger.as.i();
                z10 = true;
            }
            if (ltVar.f35782n != z10) {
                ltVar.f35782n = z10;
                if (z10) {
                    this.Y1 = xj0Var.d;
                    xj0Var.a(2131232116, true);
                    return;
                }
                xj0Var.b(this.Y1, true);
                this.Y1 = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        gt gtVar;
        lt ltVar = this.f33643a2;
        if (ltVar.f35780e && motionEvent.getAction() == 0) {
            ltVar.u();
            if (ltVar.f35787y && (gtVar = ltVar.d) != null) {
                gtVar.t(false);
                ltVar.f35787y = false;
                ltVar.k(true);
                org.telegram.messenger.g0.K3(this);
            } else {
                if (org.telegram.messenger.g0.D) {
                    i7 = 0;
                } else {
                    i7 = 2;
                }
                ltVar.x(i7);
            }
            ltVar.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!org.telegram.messenger.g0.K3(this)) {
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
        if (this.f33643a2.t(i10)) {
            super.scrollTo(i7, i10);
        }
    }
}
