package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class h31 extends org.telegram.ui.Components.vl0 {
    public final Context f34029c;
    public final l31 d;

    public h31(l31 l31Var, Context context) {
        this.d = l31Var;
        this.f34029c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42932f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        l31 l31Var = this.d;
        int i11 = l31Var.h;
        if (l31Var.f35236f < 0) {
            i10 = l31Var.getMediaDataController().getReactionsList().size();
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
        l31 l31Var = this.d;
        if (i10 == l31Var.d) {
            return 2;
        }
        if (i10 == l31Var.f35236f) {
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
        l31 l31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = l31Var.getMediaDataController().getReactionsList().get(i10 - l31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) l31Var).currentAccount;
        ((org.telegram.ui.Cells.y) c1Var.f42929a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        k31 k31Var;
        l31 l31Var = this.d;
        Context context = this.f34029c;
        if (i10 == 0) {
            d5Var = ((org.telegram.ui.ActionBar.n2) l31Var).parentLayout;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, d5Var, 2);
            iaVar.setImportantForAccessibility(4);
            iaVar.f20434r = l31Var;
            k31Var = iaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    k31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View knVar = new org.telegram.ui.Components.kn(context, 23);
                    knVar.setTag(-33024);
                    k31Var = knVar;
                }
            } else {
                k31 k31Var2 = new k31(l31Var, context);
                k31Var2.a(false);
                k31Var = k31Var2;
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            k31Var = e9Var;
        }
        return new s4.c1(k31Var);
    }
}
