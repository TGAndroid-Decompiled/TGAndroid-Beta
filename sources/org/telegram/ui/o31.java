package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o31 extends org.telegram.ui.Components.lm0 {
    public final Context f38539c;
    public final s31 d;

    public o31(s31 s31Var, Context context) {
        this.d = s31Var;
        this.f38539c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        s31 s31Var = this.d;
        int i11 = s31Var.h;
        if (s31Var.f39693f < 0) {
            i10 = s31Var.getMediaDataController().getReactionsList().size();
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
        s31 s31Var = this.d;
        if (i10 == s31Var.d) {
            return 2;
        }
        if (i10 == s31Var.f39693f) {
            return 3;
        }
        if (i10 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        s31 s31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = s31Var.getMediaDataController().getReactionsList().get(i10 - s31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.m2) s31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.m2) s31Var).currentAccount;
        ((org.telegram.ui.Cells.y) b1Var.f44838a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        r31 r31Var;
        s31 s31Var = this.d;
        Context context = this.f38539c;
        if (i10 == 0) {
            b5Var = ((org.telegram.ui.ActionBar.m2) s31Var).parentLayout;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, b5Var, 2);
            gaVar.setImportantForAccessibility(4);
            gaVar.f20948r = s31Var;
            r31Var = gaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    r31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View xnVar = new org.telegram.ui.Components.xn(context, 23);
                    xnVar.setTag(-33024);
                    r31Var = xnVar;
                }
            } else {
                r31 r31Var2 = new r31(s31Var, context);
                r31Var2.a(false);
                r31Var = r31Var2;
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            r31Var = e9Var;
        }
        return new s4.b1(r31Var);
    }
}
