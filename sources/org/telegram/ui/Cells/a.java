package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.bq0;
import org.telegram.ui.dq0;
import org.telegram.ui.nl0;
import org.telegram.ui.s10;
import org.telegram.ui.u10;
public final class a implements View.OnClickListener {
    public final int f19745a;
    public final Object f19746b;

    public a(Object obj, int i10) {
        this.f19745a = i10;
        this.f19746b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f19745a;
        Object obj = this.f19746b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.e.size() == 1) {
                    new xh.m(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    return;
                } else {
                    new xh.e(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                bj0 bj0Var = ((x2) obj).f21587f;
                if (!bj0Var.b()) {
                    bj0Var.setProgress(0.0f);
                    bj0Var.d();
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
                b5Var.L.c(b5Var, true);
                return;
            case 8:
                u5 u5Var = (u5) obj;
                u5Var.d = u5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f21408c.onClick(u5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    dq0.U(((bq0) ((nl0) x5Var).f35552b).d, y5Var.f21634b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                u7 u7Var = (u7) obj;
                if (u7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = u7Var.d;
                    int i11 = u7Var.f21421c[intValue];
                    MessageObject messageObject = u7Var.f21420b[intValue];
                    u10 u10Var = ((s10) ((org.telegram.ui.g) r7Var).f33402b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = u10.f37843s0;
                    u10Var.f(i11, u7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
