package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m extends org.telegram.ui.Components.sk0 {
    public final Context f39446c;
    public final n d;

    public m(n nVar, Context context) {
        this.d = nVar;
        this.f39446c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.G;
    }

    @Override
    public final int d(int i10) {
        n nVar = this.d;
        if (i10 >= nVar.f39807y && i10 < nVar.D) {
            return 0;
        }
        if (i10 == nVar.E) {
            return 1;
        }
        if (i10 != nVar.F && i10 != nVar.f39806x) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        View view = c1Var.f47898a;
        n nVar = this.d;
        a0.h hVar = nVar.f39798a;
        ArrayList arrayList = nVar.h;
        if (d(i10) == 0) {
            int i12 = i10 - nVar.f39807y;
            org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
            if (i12 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            vVar.b(stickerSetCovered, z10);
            org.telegram.ui.Components.ch0 ch0Var = vVar.f23161f;
            boolean B0 = org.telegram.messenger.ui.b0(n.Z(nVar)).B0(stickerSetCovered.set.f19820id, true);
            vVar.a(B0, false, false);
            if (B0) {
                hVar.l(stickerSetCovered.set.f19820id);
                if (ch0Var != null) {
                    ch0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f19820id) >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (ch0Var != null) {
                    ch0Var.a(z11, false);
                }
            }
            vVar.setOnCheckedChangeListener(new ng.d(1, this, stickerSetCovered));
        } else if (d(i10) == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == nVar.f39806x) {
                b9Var.setTopPadding(17);
                b9Var.setBottomPadding(10);
                if (nVar.H == 5) {
                    i11 = 2131754135;
                } else {
                    i11 = 2131754124;
                }
                b9Var.setText(org.telegram.messenger.cd.L0(i11, null));
                return;
            }
            b9Var.setTopPadding(10);
            b9Var.setBottomPadding(17);
            b9Var.setText(null);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.f39446c;
        View view = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.b9(context);
                }
            } else {
                view = new org.telegram.ui.Cells.v4(context);
            }
        } else {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, vVar, null);
            view = vVar;
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(view);
    }
}
