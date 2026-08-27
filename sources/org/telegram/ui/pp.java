package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class pp extends f2.q0 {

    public final Context f41406c;
    public final qp d;

    public pp(qp qpVar, Context context) {
        this.d = qpVar;
        this.f41406c = context;
    }

    @Override
    public final int h() {
        qp qpVar = this.d;
        ArrayList arrayList = qpVar.f41724r;
        if (qpVar.C) {
            return (qpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 1;
        }
        return (qpVar.d.isEmpty() ? 0 : arrayList.size() + 1) + 2;
    }

    @Override
    public final int j(int i10) {
        if (this.d.C) {
            if (i10 == 0) {
                return 0;
            }
            return i10 == 1 ? 1 : 2;
        }
        if (i10 == 0) {
            return 3;
        }
        if (i10 == 1) {
            return 0;
        }
        return i10 == 2 ? 1 : 2;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.f5789a;
        int iJ = j(i10);
        qp qpVar = this.d;
        if (iJ != 0) {
            if (iJ == 1) {
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                j4Var.setText(LocaleController.getString(R.string.OnlyAllowThisReactions));
                j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                return;
            } else {
                if (iJ != 2) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) qpVar.f41724r.get(i10 - (qpVar.C ? 2 : 3));
                yVar.a(tL_availableReaction, qpVar.d.contains(tL_availableReaction.reaction), ((org.telegram.ui.ActionBar.n2) qpVar).currentAccount);
                return;
            }
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        x8Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        if (qpVar.C) {
            x8Var.setText(ChatObject.isChannelAndNotMegaGroup(qpVar.f41718a) ? LocaleController.getString(R.string.EnableReactionsChannelInfo) : LocaleController.getString(R.string.EnableReactionsGroupInfo));
            return;
        }
        int i11 = qpVar.v;
        if (i11 == 1) {
            x8Var.setText(LocaleController.getString(R.string.EnableSomeReactionsInfo));
        } else if (i11 == 0) {
            x8Var.setText(LocaleController.getString(R.string.EnableAllReactionsInfo));
        } else if (i11 == 2) {
            x8Var.setText(LocaleController.getString(R.string.DisableReactionsInfo));
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.f41406c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.lk0(new org.telegram.ui.Cells.x8(context));
        }
        if (i10 == 1) {
            return new org.telegram.ui.Components.lk0(new org.telegram.ui.Cells.j4(context, 23));
        }
        if (i10 != 3) {
            return new org.telegram.ui.Components.lk0(new org.telegram.ui.Cells.y(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        qp qpVar = this.d;
        if (qpVar.f41725s.getParent() != null) {
            ((ViewGroup) qpVar.f41725s.getParent()).removeView(qpVar.f41725s);
        }
        frameLayout.addView(qpVar.f41725s);
        frameLayout.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(frameLayout);
    }
}
