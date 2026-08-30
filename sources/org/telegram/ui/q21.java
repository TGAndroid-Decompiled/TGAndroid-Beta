package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q21 extends org.telegram.ui.Components.rl0 {
    public final Context f37579c;
    public final u21 d;

    public q21(u21 u21Var, Context context) {
        this.d = u21Var;
        this.f37579c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        u21 u21Var = this.d;
        int i11 = u21Var.h;
        if (u21Var.f38832f < 0) {
            i10 = u21Var.getMediaDataController().getReactionsList().size();
        } else {
            i10 = 0;
        }
        return i11 + i10 + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        u21 u21Var = this.d;
        if (i10 == u21Var.d) {
            return 2;
        }
        if (i10 == u21Var.f38832f) {
            return 3;
        }
        if (i10 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        u21 u21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = u21Var.getMediaDataController().getReactionsList().get(i10 - u21Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.p2) u21Var).currentAccount;
        ((org.telegram.ui.Cells.y) l1Var.f5785a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        t21 t21Var;
        u21 u21Var = this.d;
        Context context = this.f37579c;
        if (i10 == 0) {
            e5Var = ((org.telegram.ui.ActionBar.p2) u21Var).parentLayout;
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, e5Var, 2);
            eaVar.setImportantForAccessibility(4);
            eaVar.f21038r = u21Var;
            t21Var = eaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    t21Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View hnVar = new org.telegram.ui.Components.hn(context, 20);
                    hnVar.setTag(-33024);
                    t21Var = hnVar;
                }
            } else {
                t21 t21Var2 = new t21(u21Var, context);
                t21Var2.a(false);
                t21Var = t21Var2;
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            t21Var = a9Var;
        }
        return new f2.l1(t21Var);
    }
}
