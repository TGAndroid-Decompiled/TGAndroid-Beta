package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class n31 extends org.telegram.ui.Components.ul0 {
    public final Context f35112c;
    public final r31 d;

    public n31(r31 r31Var, Context context) {
        this.d = r31Var;
        this.f35112c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        r31 r31Var = this.d;
        int i11 = r31Var.h;
        if (r31Var.f36207f < 0) {
            i10 = r31Var.getMediaDataController().getReactionsList().size();
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
        r31 r31Var = this.d;
        if (i10 == r31Var.d) {
            return 2;
        }
        if (i10 == r31Var.f36207f) {
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
        r31 r31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = r31Var.getMediaDataController().getReactionsList().get(i10 - r31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.p2) r31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.p2) r31Var).currentAccount;
        ((org.telegram.ui.Cells.y) c1Var.f41610a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        q31 q31Var;
        r31 r31Var = this.d;
        Context context = this.f35112c;
        if (i10 == 0) {
            f5Var = ((org.telegram.ui.ActionBar.p2) r31Var).parentLayout;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, f5Var, 2);
            kaVar.setImportantForAccessibility(4);
            kaVar.f19458r = r31Var;
            q31Var = kaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    q31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View qnVar = new org.telegram.ui.Components.qn(context, 22);
                    qnVar.setTag(-33024);
                    q31Var = qnVar;
                }
            } else {
                q31 q31Var2 = new q31(r31Var, context);
                q31Var2.a(false);
                q31Var = q31Var2;
            }
        } else {
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            f9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            q31Var = f9Var;
        }
        return new s4.c1(q31Var);
    }
}
