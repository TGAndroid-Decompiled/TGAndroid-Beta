package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.iq0;
import org.telegram.ui.kq0;
import org.telegram.ui.v10;
import org.telegram.ui.vl0;
import org.telegram.ui.x10;
public final class a implements View.OnClickListener {
    public final int f21590a;
    public final Object f21591b;

    public a(Object obj, int i10) {
        this.f21590a = i10;
        this.f21591b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f21590a;
        Object obj = this.f21591b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f22263e.size() == 1) {
                    new yh.m(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.f22263e.get(0)).show();
                    return;
                } else {
                    new yh.e(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                aj0 aj0Var = ((x2) obj).f23521f;
                if (!aj0Var.b()) {
                    aj0Var.setProgress(0.0f);
                    aj0Var.d();
                    return;
                }
                return;
            case 4:
                ((o3) obj).getClass();
                return;
            case 5:
                d4 d4Var = (d4) obj;
                d4Var.d(d4Var);
                return;
            case 6:
                ((o4) obj).performClick();
                return;
            case 7:
                a5 a5Var = (a5) obj;
                a5Var.L.d(a5Var, true);
                return;
            case 8:
                t5 t5Var = (t5) obj;
                t5Var.d = t5Var.f23246e[((Integer) ((RadioButton) view).getTag()).intValue()];
                t5Var.b(true);
                t5Var.f23245c.onClick(t5Var);
                return;
            case 9:
                x5 x5Var = (x5) obj;
                w5 w5Var = x5Var.d;
                if (w5Var != null) {
                    kq0.U(((iq0) ((vl0) w5Var).f41589b).d, x5Var.f23532b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                u7 u7Var = (u7) obj;
                if (u7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = u7Var.d;
                    int i11 = u7Var.f23339c[intValue];
                    MessageObject messageObject = u7Var.f23338b[intValue];
                    x10 x10Var = ((v10) ((org.telegram.ui.g) r7Var).f36515b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = x10.f42534s0;
                    x10Var.f(i11, u7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
