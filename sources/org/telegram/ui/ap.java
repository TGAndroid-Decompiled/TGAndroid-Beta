package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class ap extends v4.h0 {
    public final Context f45623c;
    public final bp d;

    public ap(bp bpVar, Context context) {
        this.d = bpVar;
        this.f45623c = context;
    }

    @Override
    public final int b() {
        int i7;
        bp bpVar = this.d;
        if (!bpVar.d.isEmpty()) {
            i7 = bpVar.f46253n.size() + 1;
        } else {
            i7 = 0;
        }
        return i7 + 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 3;
        }
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        View view = e1Var.f59111a;
        int d = d(i7);
        bp bpVar = this.d;
        if (d != 0) {
            if (d != 1) {
                if (d == 2) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) bpVar.f46253n.get(i7 - 3);
                    boolean contains = bpVar.d.contains(tL_availableReaction.reaction);
                    i10 = ((org.telegram.ui.ActionBar.g2) bpVar).currentAccount;
                    ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i10);
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.hd.N0(2131747628, null));
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        org.telegram.ui.ActionBar.t6.U(a9Var.getTextView(), org.telegram.ui.ActionBar.m6.B6, null);
        int i11 = bpVar.f46255s;
        if (i11 == 1) {
            a9Var.setText(org.telegram.messenger.hd.N0(2131751135, null));
        } else if (i11 == 0) {
            a9Var.setText(org.telegram.messenger.hd.N0(2131751147, null));
        } else if (i11 == 2) {
            a9Var.setText(org.telegram.messenger.hd.N0(2131751417, null));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f45623c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    return new v4.e1(new org.telegram.ui.Cells.x(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                bp bpVar = this.d;
                org.telegram.messenger.g0.E2(bpVar.f46254r);
                frameLayout.addView(bpVar.f46254r);
                frameLayout.setLayoutParams(new v4.p0(-1, -2));
                return new v4.e1(frameLayout);
            }
            return new v4.e1(new org.telegram.ui.Cells.o4(context, 23));
        }
        return new v4.e1(new org.telegram.ui.Cells.a9(context));
    }
}
