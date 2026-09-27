package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class b31 extends org.telegram.ui.Components.xl0 {
    public final Context f32227c;
    public final f31 d;

    public b31(f31 f31Var, Context context) {
        this.d = f31Var;
        this.f32227c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f43008f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        f31 f31Var = this.d;
        int i11 = f31Var.h;
        if (f31Var.f33404f < 0) {
            i10 = f31Var.getMediaDataController().getReactionsList().size();
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
        f31 f31Var = this.d;
        if (i10 == f31Var.d) {
            return 2;
        }
        if (i10 == f31Var.f33404f) {
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
        f31 f31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = f31Var.getMediaDataController().getReactionsList().get(i10 - f31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.o2) f31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.o2) f31Var).currentAccount;
        ((org.telegram.ui.Cells.y) c1Var.f43005a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        e31 e31Var;
        f31 f31Var = this.d;
        Context context = this.f32227c;
        if (i10 == 0) {
            d5Var = ((org.telegram.ui.ActionBar.o2) f31Var).parentLayout;
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, d5Var, 2);
            iaVar.setImportantForAccessibility(4);
            iaVar.f20472r = f31Var;
            e31Var = iaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    e31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View mnVar = new org.telegram.ui.Components.mn(context, 23);
                    mnVar.setTag(-33024);
                    e31Var = mnVar;
                }
            } else {
                e31 e31Var2 = new e31(f31Var, context);
                e31Var2.a(false);
                e31Var = e31Var2;
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            e31Var = e9Var;
        }
        return new s4.c1(e31Var);
    }
}
