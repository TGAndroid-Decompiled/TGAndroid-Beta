package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n extends org.telegram.ui.Components.oj0 {
    public final Context f47923c;
    public final o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.f47923c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57047f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.G;
    }

    @Override
    public final int d(int i7) {
        o oVar = this.d;
        if (i7 >= oVar.f48190y && i7 < oVar.D) {
            return 0;
        }
        if (i7 == oVar.E) {
            return 1;
        }
        if (i7 != oVar.F && i7 != oVar.f48189x) {
            return 0;
        }
        return 2;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        boolean z9;
        boolean z10;
        View view = d1Var.f57043a;
        o oVar = this.d;
        a0.h hVar = oVar.f48180a;
        ArrayList arrayList = oVar.h;
        if (d(i7) == 0) {
            int i11 = i7 - oVar.f48190y;
            org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
            if (i11 != arrayList.size() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            vVar.b(stickerSetCovered, z9);
            org.telegram.ui.Components.ag0 ag0Var = vVar.f30606f;
            boolean B0 = org.telegram.messenger.ui.b0(o.a0(oVar)).B0(stickerSetCovered.set.f26983id, true);
            vVar.a(B0, false, false);
            if (B0) {
                hVar.l(stickerSetCovered.set.f26983id);
                if (ag0Var != null) {
                    ag0Var.a(false, false);
                }
            } else {
                if (hVar.h(stickerSetCovered.set.f26983id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (ag0Var != null) {
                    ag0Var.a(z10, false);
                }
            }
            vVar.setOnCheckedChangeListener(new ni.c(1, this, stickerSetCovered));
        } else if (d(i7) == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == oVar.f48189x) {
                z8Var.setTopPadding(17);
                z8Var.setBottomPadding(10);
                if (oVar.H == 5) {
                    i10 = 2131754135;
                } else {
                    i10 = 2131754124;
                }
                z8Var.setText(org.telegram.messenger.id.M0(i10, null));
                return;
            }
            z8Var.setTopPadding(10);
            z8Var.setBottomPadding(17);
            z8Var.setText(null);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f47923c;
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
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, vVar, null);
            view = vVar;
        }
        view.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(view);
    }
}
