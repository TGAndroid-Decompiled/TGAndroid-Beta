package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class c21 extends org.telegram.ui.Components.yk0 {

    public final Context f36925c;
    public final g21 d;

    public c21(g21 g21Var, Context context) {
        this.d = g21Var;
        this.f36925c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 3 || i10 == 2;
    }

    @Override
    public final int h() {
        g21 g21Var = this.d;
        return g21Var.h + (g21Var.f38292f < 0 ? g21Var.getMediaDataController().getReactionsList().size() : 0) + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        g21 g21Var = this.d;
        if (i10 == g21Var.d) {
            return 2;
        }
        if (i10 == g21Var.f38292f) {
            return 3;
        }
        return i10 == h() - 1 ? 4 : 1;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (j(i10) != 1) {
            return;
        }
        org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) o1Var.f5789a;
        g21 g21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = g21Var.getMediaDataController().getReactionsList().get(i10 - g21Var.f38291e);
        yVar.a(tL_availableReaction, tL_availableReaction.reaction.contains(MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) g21Var).currentAccount).getDoubleTapReaction()), ((org.telegram.ui.ActionBar.n2) g21Var).currentAccount);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View yVar;
        g21 g21Var = this.d;
        Context context = this.f36925c;
        if (i10 == 0) {
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, ((org.telegram.ui.ActionBar.n2) g21Var).parentLayout, 2);
            baVar.setImportantForAccessibility(4);
            baVar.f24135r = g21Var;
            yVar = baVar;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            x8Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            yVar = x8Var;
        } else if (i10 == 3) {
            f21 f21Var = new f21(g21Var, context);
            f21Var.a(false);
            yVar = f21Var;
        } else if (i10 != 4) {
            yVar = new org.telegram.ui.Cells.y(context, true, true);
        } else {
            org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(context, 22);
            zmVar.setTag(-33024);
            yVar = zmVar;
        }
        return new org.telegram.ui.Components.lk0(yVar);
    }
}
