package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n extends org.telegram.ui.Components.dk0 {
    public final Context f50037c;
    public final o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.f50037c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f == 0) {
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
        if (i7 >= oVar.f50386y && i7 < oVar.E) {
            return 0;
        }
        if (i7 == oVar.F) {
            return 1;
        }
        if (i7 != oVar.G && i7 != oVar.f50385x) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        boolean z10;
        View view = e1Var.f59111a;
        o oVar = this.d;
        a0.h hVar = oVar.f50376a;
        ArrayList arrayList = oVar.h;
        if (d(i7) == 0) {
            int i11 = i7 - oVar.f50386y;
            org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
            boolean z11 = true;
            if (i11 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            vVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.pg0 pg0Var = vVar.f32054f;
            boolean E0 = org.telegram.messenger.si.d0(o.a0(oVar)).E0(stickerSetCovered.set.f28425id, true);
            vVar.a(E0, false, false);
            if (E0) {
                hVar.l(stickerSetCovered.set.f28425id);
                if (pg0Var != null) {
                    pg0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f28425id) < 0) {
                    z11 = false;
                }
                if (pg0Var != null) {
                    pg0Var.a(z11, false);
                }
            }
            vVar.setOnCheckedChangeListener(new oi.e0(3, this, stickerSetCovered));
        } else if (d(i7) == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i7 == oVar.f50385x) {
                a9Var.setTopPadding(17);
                a9Var.setBottomPadding(10);
                if (oVar.I == 5) {
                    i10 = 2131754132;
                } else {
                    i10 = 2131754121;
                }
                a9Var.setText(org.telegram.messenger.hd.N0(i10, null));
                return;
            }
            a9Var.setTopPadding(10);
            a9Var.setBottomPadding(17);
            a9Var.setText(null);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f50037c;
        View view = null;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    view = new org.telegram.ui.Cells.a9(context);
                }
            } else {
                view = new org.telegram.ui.Cells.u4(context);
            }
        } else {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, vVar, null);
            view = vVar;
        }
        view.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(view);
    }
}
