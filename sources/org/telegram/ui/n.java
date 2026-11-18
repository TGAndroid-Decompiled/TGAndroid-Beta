package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n extends org.telegram.ui.Components.bk0 {
    public final Context f50044c;
    public final o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.f50044c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59126f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.H;
    }

    @Override
    public final int d(int i7) {
        o oVar = this.d;
        if (i7 >= oVar.f50388y && i7 < oVar.E) {
            return 0;
        }
        if (i7 == oVar.F) {
            return 1;
        }
        if (i7 != oVar.G && i7 != oVar.f50387x) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        boolean z10;
        View view = f1Var.f59122a;
        o oVar = this.d;
        a0.h hVar = oVar.f50378a;
        ArrayList arrayList = oVar.h;
        if (d(i7) == 0) {
            int i11 = i7 - oVar.f50388y;
            org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
            boolean z11 = true;
            if (i11 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            vVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.ng0 ng0Var = vVar.f32144f;
            boolean E0 = org.telegram.messenger.ri.d0(o.a0(oVar)).E0(stickerSetCovered.set.f28432id, true);
            vVar.a(E0, false, false);
            if (E0) {
                hVar.l(stickerSetCovered.set.f28432id);
                if (ng0Var != null) {
                    ng0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f28432id) < 0) {
                    z11 = false;
                }
                if (ng0Var != null) {
                    ng0Var.a(z11, false);
                }
            }
            vVar.setOnCheckedChangeListener(new oi.e0(3, this, stickerSetCovered));
        } else if (d(i7) == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == oVar.f50387x) {
                z8Var.setTopPadding(17);
                z8Var.setBottomPadding(10);
                if (oVar.I == 5) {
                    i10 = 2131754133;
                } else {
                    i10 = 2131754122;
                }
                z8Var.setText(org.telegram.messenger.gd.M0(i10, null));
                return;
            }
            z8Var.setTopPadding(10);
            z8Var.setBottomPadding(17);
            z8Var.setText(null);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f50044c;
        View view = null;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    view = new org.telegram.ui.Cells.z8(context);
                }
            } else {
                view = new org.telegram.ui.Cells.t4(context);
            }
        } else {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, vVar, null);
            view = vVar;
        }
        view.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(view);
    }
}
