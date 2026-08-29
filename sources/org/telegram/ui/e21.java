package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class e21 extends org.telegram.ui.Components.il0 {
    public final Context f37684c;
    public final i21 d;

    public e21(i21 i21Var, Context context) {
        this.d = i21Var;
        this.f37684c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        i21 i21Var = this.d;
        int i11 = i21Var.h;
        if (i21Var.f39114f < 0) {
            i10 = i21Var.getMediaDataController().getReactionsList().size();
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
        i21 i21Var = this.d;
        if (i10 == i21Var.d) {
            return 2;
        }
        if (i10 == i21Var.f39114f) {
            return 3;
        }
        if (i10 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        if (j(i10) != 1) {
            return;
        }
        i21 i21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = i21Var.getMediaDataController().getReactionsList().get(i10 - i21Var.f39113e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.o2) i21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.o2) i21Var).currentAccount;
        ((org.telegram.ui.Cells.y) n1Var.f6432a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        h21 h21Var;
        i21 i21Var = this.d;
        Context context = this.f37684c;
        if (i10 == 0) {
            b5Var = ((org.telegram.ui.ActionBar.o2) i21Var).parentLayout;
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context, b5Var, 2);
            caVar.setImportantForAccessibility(4);
            caVar.f24192r = i21Var;
            h21Var = caVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    h21Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View fnVar = new org.telegram.ui.Components.fn(context, 21);
                    fnVar.setTag(-33024);
                    h21Var = fnVar;
                }
            } else {
                h21 h21Var2 = new h21(i21Var, context);
                h21Var2.a(false);
                h21Var = h21Var2;
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            h21Var = y8Var;
        }
        return new f2.n1(h21Var);
    }
}
