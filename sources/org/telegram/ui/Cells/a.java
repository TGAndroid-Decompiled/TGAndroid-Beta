package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.kl0;
import org.telegram.ui.s10;
import org.telegram.ui.u10;
import org.telegram.ui.up0;
import org.telegram.ui.wp0;
public final class a implements View.OnClickListener {
    public final int f20784a;
    public final Object f20785b;

    public a(Object obj, int i10) {
        this.f20784a = i10;
        this.f20785b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f20784a;
        Object obj = this.f20785b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.e.size() == 1) {
                    new kh.s(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    return;
                } else {
                    new kh.f(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                jj0 jj0Var = ((w2) obj).f22496f;
                if (!jj0Var.b()) {
                    jj0Var.setProgress(0.0f);
                    jj0Var.d();
                    return;
                }
                return;
            case 4:
                ((n3) obj).getClass();
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
                a5Var.I.c(a5Var, true);
                return;
            case 8:
                t5 t5Var = (t5) obj;
                t5Var.d = t5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                t5Var.b(true);
                t5Var.f22335c.onClick(t5Var);
                return;
            case 9:
                x5 x5Var = (x5) obj;
                w5 w5Var = x5Var.d;
                if (w5Var != null) {
                    wp0.U(((up0) ((kl0) w5Var).f35555b).d, x5Var.f22546b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                r7 r7Var = (r7) obj;
                if (r7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    o7 o7Var = r7Var.d;
                    int i11 = r7Var.f21878c[intValue];
                    MessageObject messageObject = r7Var.f21877b[intValue];
                    u10 u10Var = ((s10) ((org.telegram.ui.h) o7Var).f34532b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = u10.f38637p0;
                    u10Var.f(i11, r7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
