package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class i31 extends org.telegram.ui.Components.kl0 {
    public final Context f34408c;
    public final m31 d;

    public i31(m31 m31Var, Context context) {
        this.d = m31Var;
        this.f34408c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42674f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        int i10;
        m31 m31Var = this.d;
        int i11 = m31Var.h;
        if (m31Var.f35592f < 0) {
            i10 = m31Var.getMediaDataController().getReactionsList().size();
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
        m31 m31Var = this.d;
        if (i10 == m31Var.d) {
            return 2;
        }
        if (i10 == m31Var.f35592f) {
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
        m31 m31Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = m31Var.getMediaDataController().getReactionsList().get(i10 - m31Var.e);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.n2) m31Var).currentAccount;
        boolean contains = str.contains(MediaDataController.getInstance(i11).getDoubleTapReaction());
        i12 = ((org.telegram.ui.ActionBar.n2) m31Var).currentAccount;
        ((org.telegram.ui.Cells.y) c1Var.f42671a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        l31 l31Var;
        m31 m31Var = this.d;
        Context context = this.f34408c;
        if (i10 == 0) {
            d5Var = ((org.telegram.ui.ActionBar.n2) m31Var).parentLayout;
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context, d5Var, 2);
            jaVar.setImportantForAccessibility(4);
            jaVar.f20318r = m31Var;
            l31Var = jaVar;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    l31Var = new org.telegram.ui.Cells.y(context, true, true);
                } else {
                    View knVar = new org.telegram.ui.Components.kn(context, 23);
                    knVar.setTag(-33024);
                    l31Var = knVar;
                }
            } else {
                l31 l31Var2 = new l31(m31Var, context);
                l31Var2.a(false);
                l31Var = l31Var2;
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.DoubleTapPreviewRational));
            l31Var = e9Var;
        }
        return new s4.c1(l31Var);
    }
}
