package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class g31 extends org.telegram.ui.Components.qm0 {
    public final Context f37896c;
    public final k31 d;

    public g31(k31 k31Var, Context context) {
        this.d = k31Var;
        this.f37896c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47786f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        k31 k31Var = this.d;
        int i11 = k31Var.h;
        if (k31Var.f39218f < 0) {
            i10 = k31Var.getMediaDataController().getReactionsList().size();
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
        k31 k31Var = this.d;
        if (i10 == k31Var.d) {
            return 2;
        }
        if (i10 == k31Var.f39218f) {
            return 3;
        }
        if (i10 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        k31 k31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = k31Var.getMediaDataController().getReactionsList().get(i10 - k31Var.f39217e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.m2) k31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.m2) k31Var).currentAccount;
        ((org.telegram.ui.Cells.y) d1Var.f47782a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        j31 j31Var;
        k31 k31Var = this.d;
        Context context = this.f37896c;
        if (i10 == 0) {
            b5Var = ((org.telegram.ui.ActionBar.m2) k31Var).parentLayout;
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, b5Var, 2);
            gaVar.setImportantForAccessibility(4);
            gaVar.f22198r = k31Var;
            j31Var = gaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    j31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View aoVar = new org.telegram.ui.Components.ao(context, 23);
                    aoVar.setTag(-33024);
                    j31Var = aoVar;
                }
            } else {
                j31 j31Var2 = new j31(k31Var, context);
                j31Var2.a(false);
                j31Var = j31Var2;
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            j31Var = e9Var;
        }
        return new s4.d1(j31Var);
    }
}
