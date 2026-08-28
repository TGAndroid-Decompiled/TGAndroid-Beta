package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class d21 extends org.telegram.ui.Components.vk0 {
    public final Context f37392c;
    public final h21 d;

    public d21(h21 h21Var, Context context) {
        this.d = h21Var;
        this.f37392c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i9;
        h21 h21Var = this.d;
        int i10 = h21Var.h;
        if (h21Var.f38659f < 0) {
            i9 = h21Var.getMediaDataController().getReactionsList().size();
        } else {
            i9 = 0;
        }
        return i10 + i9 + 1;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        h21 h21Var = this.d;
        if (i9 == h21Var.d) {
            return 2;
        }
        if (i9 == h21Var.f38659f) {
            return 3;
        }
        if (i9 != h() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        if (j(i9) != 1) {
            return;
        }
        h21 h21Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = h21Var.getMediaDataController().getReactionsList().get(i9 - h21Var.f38658e);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.o2) h21Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i10).getDoubleTapReaction());
        i11 = ((org.telegram.ui.ActionBar.o2) h21Var).currentAccount;
        ((org.telegram.ui.Cells.y) q1Var.f5501a).a(tL_availableReaction, contains, i11);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b5 b5Var;
        g21 g21Var;
        h21 h21Var = this.d;
        Context context = this.f37392c;
        if (i9 == 0) {
            b5Var = ((org.telegram.ui.ActionBar.o2) h21Var).parentLayout;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, b5Var, 2);
            faVar.setImportantForAccessibility(4);
            faVar.f24356r = h21Var;
            g21Var = faVar;
        } else if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 4) {
                    g21Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View anVar = new org.telegram.ui.Components.an(context, 24);
                    anVar.setTag(-33024);
                    g21Var = anVar;
                }
            } else {
                g21 g21Var2 = new g21(h21Var, context);
                g21Var2.a(false);
                g21Var = g21Var2;
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            g21Var = b9Var;
        }
        return new f2.q1(g21Var);
    }
}
