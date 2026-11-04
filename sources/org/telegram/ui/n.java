package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n extends org.telegram.ui.Components.sj0 {
    public final Context f47843c;
    public final o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.f47843c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.H;
    }

    @Override
    public final int d(int i3) {
        o oVar = this.d;
        if (i3 >= oVar.f48159y && i3 < oVar.E) {
            return 0;
        }
        if (i3 == oVar.F) {
            return 1;
        }
        if (i3 != oVar.G && i3 != oVar.f48158x) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        boolean z10;
        View view = d1Var.f55540a;
        o oVar = this.d;
        a0.h hVar = oVar.f48149a;
        ArrayList arrayList = oVar.h;
        if (d(i3) == 0) {
            int i11 = i3 - oVar.f48159y;
            org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
            boolean z11 = true;
            if (i11 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            vVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.dg0 dg0Var = vVar.f30700f;
            boolean B0 = org.telegram.messenger.li.b0(o.a0(oVar)).B0(stickerSetCovered.set.f27028id, true);
            vVar.a(B0, false, false);
            if (B0) {
                hVar.l(stickerSetCovered.set.f27028id);
                if (dg0Var != null) {
                    dg0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f27028id) < 0) {
                    z11 = false;
                }
                if (dg0Var != null) {
                    dg0Var.a(z11, false);
                }
            }
            vVar.setOnCheckedChangeListener(new mi.d4(11, this, stickerSetCovered));
        } else if (d(i3) == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 == oVar.f48158x) {
                y8Var.setTopPadding(17);
                y8Var.setBottomPadding(10);
                if (oVar.I == 5) {
                    i10 = 2131754135;
                } else {
                    i10 = 2131754124;
                }
                y8Var.setText(org.telegram.messenger.bd.M0(i10, null));
                return;
            }
            y8Var.setTopPadding(10);
            y8Var.setBottomPadding(17);
            y8Var.setText(null);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = this.f47843c;
        View view = null;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    view = new org.telegram.ui.Cells.y8(context);
                }
            } else {
                view = new org.telegram.ui.Cells.t4(context);
            }
        } else {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, vVar, null);
            view = vVar;
        }
        view.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(view);
    }
}
