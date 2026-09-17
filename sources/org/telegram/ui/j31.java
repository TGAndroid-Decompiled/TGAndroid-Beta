package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class j31 extends org.telegram.ui.Components.ll0 {
    public final Context f34768c;
    public final n31 d;

    public j31(n31 n31Var, Context context) {
        this.d = n31Var;
        this.f34768c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42700f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        n31 n31Var = this.d;
        int i11 = n31Var.h;
        if (n31Var.f35931f < 0) {
            i10 = n31Var.getMediaDataController().getReactionsList().size();
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
        n31 n31Var = this.d;
        if (i10 == n31Var.d) {
            return 2;
        }
        if (i10 == n31Var.f35931f) {
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
        n31 n31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = n31Var.getMediaDataController().getReactionsList().get(i10 - n31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.o2) n31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.o2) n31Var).currentAccount;
        ((org.telegram.ui.Cells.y) c1Var.f42697a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        m31 m31Var;
        n31 n31Var = this.d;
        Context context = this.f34768c;
        if (i10 == 0) {
            e5Var = ((org.telegram.ui.ActionBar.o2) n31Var).parentLayout;
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context, e5Var, 2);
            jaVar.setImportantForAccessibility(4);
            jaVar.f20353r = n31Var;
            m31Var = jaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    m31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View knVar = new org.telegram.ui.Components.kn(context, 23);
                    knVar.setTag(-33024);
                    m31Var = knVar;
                }
            } else {
                m31 m31Var2 = new m31(n31Var, context);
                m31Var2.a(false);
                m31Var = m31Var2;
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            m31Var = e9Var;
        }
        return new s4.c1(m31Var);
    }
}
