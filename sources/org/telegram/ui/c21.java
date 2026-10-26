package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class c21 extends org.telegram.ui.Components.lm0 {
    public final Context f38234c;
    public final g21 d;

    public c21(g21 g21Var, Context context) {
        this.d = g21Var;
        this.f38234c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        g21 g21Var = this.d;
        int i11 = g21Var.f39529f;
        if (g21Var.e < 0) {
            i10 = g21Var.getMediaDataController().getReactionsList().size();
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
        g21 g21Var = this.d;
        if (i10 == g21Var.f39528c) {
            return 2;
        }
        if (i10 == g21Var.e) {
            return 3;
        }
        if (i10 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        g21 g21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = g21Var.getMediaDataController().getReactionsList().get(i10 - g21Var.d);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.r2) g21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.r2) g21Var).currentAccount;
        ((org.telegram.ui.Cells.x) e1Var.f47738a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        f21 f21Var;
        g21 g21Var = this.d;
        Context context = this.f38234c;
        if (i10 == 0) {
            j5Var = ((org.telegram.ui.ActionBar.r2) g21Var).parentLayout;
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, j5Var, 2);
            kaVar.setImportantForAccessibility(4);
            kaVar.f24364r = g21Var;
            f21Var = kaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    f21Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View vnVar = new org.telegram.ui.Components.vn(context, 23);
                    vnVar.setTag(-33024);
                    f21Var = vnVar;
                }
            } else {
                f21 f21Var2 = new f21(g21Var, context);
                f21Var2.a(false);
                f21Var = f21Var2;
            }
        } else {
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
            i9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            f21Var = i9Var;
        }
        return new s4.e1(f21Var);
    }
}
