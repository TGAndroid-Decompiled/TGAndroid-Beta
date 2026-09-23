package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class a31 extends org.telegram.ui.Components.ll0 {
    public final Context f31650c;
    public final e31 d;

    public a31(e31 e31Var, Context context) {
        this.d = e31Var;
        this.f31650c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        e31 e31Var = this.d;
        int i11 = e31Var.h;
        if (e31Var.f32787f < 0) {
            i10 = e31Var.getMediaDataController().getReactionsList().size();
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
        e31 e31Var = this.d;
        if (i10 == e31Var.d) {
            return 2;
        }
        if (i10 == e31Var.f32787f) {
            return 3;
        }
        if (i10 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        e31 e31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = e31Var.getMediaDataController().getReactionsList().get(i10 - e31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) e31Var).currentAccount;
        ((org.telegram.ui.Cells.y) c1Var.f42627a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        d31 d31Var;
        e31 e31Var = this.d;
        Context context = this.f31650c;
        if (i10 == 0) {
            c5Var = ((org.telegram.ui.ActionBar.n2) e31Var).parentLayout;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, c5Var, 2);
            kaVar.setImportantForAccessibility(4);
            kaVar.f20348r = e31Var;
            d31Var = kaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    d31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View lnVar = new org.telegram.ui.Components.ln(context, 23);
                    lnVar.setTag(-33024);
                    d31Var = lnVar;
                }
            } else {
                d31 d31Var2 = new d31(e31Var, context);
                d31Var2.a(false);
                d31Var = d31Var2;
            }
        } else {
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            f9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            d31Var = f9Var;
        }
        return new s4.c1(d31Var);
    }
}
