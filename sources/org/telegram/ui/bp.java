package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class bp extends v4.i0 {
    public final Context f46272c;
    public final cp d;

    public bp(cp cpVar, Context context) {
        this.d = cpVar;
        this.f46272c = context;
    }

    @Override
    public final int b() {
        int i7;
        cp cpVar = this.d;
        if (!cpVar.d.isEmpty()) {
            i7 = cpVar.f46602n.size() + 1;
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
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        View view = f1Var.f59122a;
        int d = d(i7);
        cp cpVar = this.d;
        if (d != 0) {
            if (d != 1) {
                if (d == 2) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) cpVar.f46602n.get(i7 - 3);
                    boolean contains = cpVar.d.contains(tL_availableReaction.reaction);
                    i10 = ((org.telegram.ui.ActionBar.h2) cpVar).currentAccount;
                    ((org.telegram.ui.Cells.x) view).a(tL_availableReaction, contains, i10);
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.gd.M0(2131747629, null));
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        org.telegram.ui.ActionBar.u6.U(z8Var.getTextView(), org.telegram.ui.ActionBar.n6.B6, null);
        int i11 = cpVar.f46604s;
        if (i11 == 1) {
            z8Var.setText(org.telegram.messenger.gd.M0(2131751136, null));
        } else if (i11 == 0) {
            z8Var.setText(org.telegram.messenger.gd.M0(2131751148, null));
        } else if (i11 == 2) {
            z8Var.setText(org.telegram.messenger.gd.M0(2131751418, null));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f46272c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    return new v4.f1(new org.telegram.ui.Cells.x(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                cp cpVar = this.d;
                org.telegram.messenger.g0.E2(cpVar.f46603r);
                frameLayout.addView(cpVar.f46603r);
                frameLayout.setLayoutParams(new v4.q0(-1, -2));
                return new v4.f1(frameLayout);
            }
            return new v4.f1(new org.telegram.ui.Cells.n4(context, 23));
        }
        return new v4.f1(new org.telegram.ui.Cells.z8(context));
    }
}
