package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.kl0;
import org.telegram.ui.pp0;
import org.telegram.ui.r10;
import org.telegram.ui.rp0;
import org.telegram.ui.t10;
public final class a implements View.OnClickListener {
    public final int f22529a;
    public final Object f22530b;

    public a(Object obj, int i10) {
        this.f22529a = i10;
        this.f22530b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f22529a;
        Object obj = this.f22530b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f23143e.size() == 1) {
                    new lh.s(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.f23143e.get(0)).show();
                    return;
                } else {
                    new lh.f(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                lj0 lj0Var = ((x2) obj).f24394f;
                if (!lj0Var.b()) {
                    lj0Var.setProgress(0.0f);
                    lj0Var.d();
                    return;
                }
                return;
            case 4:
                ((o3) obj).getClass();
                return;
            case 5:
                e4 e4Var = (e4) obj;
                e4Var.d(e4Var);
                return;
            case 6:
                ((p4) obj).performClick();
                return;
            case 7:
                b5 b5Var = (b5) obj;
                b5Var.I.c(b5Var, true);
                return;
            case 8:
                u5 u5Var = (u5) obj;
                u5Var.d = u5Var.f24210e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f24209c.onClick(u5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    rp0.U(((pp0) ((kl0) x5Var).f38438b).d, y5Var.f24442b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                s7 s7Var = (s7) obj;
                if (s7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    p7 p7Var = s7Var.d;
                    int i11 = s7Var.f23744c[intValue];
                    MessageObject messageObject = s7Var.f23743b[intValue];
                    t10 t10Var = ((r10) ((org.telegram.ui.h) p7Var).f37295b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = t10.f41424p0;
                    t10Var.f(i11, s7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
