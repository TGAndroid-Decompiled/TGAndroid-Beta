package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.aq0;
import org.telegram.ui.cq0;
import org.telegram.ui.ml0;
import org.telegram.ui.r10;
import org.telegram.ui.t10;
public final class a implements View.OnClickListener {
    public final int f20000a;
    public final Object f20001b;

    public a(Object obj, int i10) {
        this.f20000a = i10;
        this.f20001b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f20000a;
        Object obj = this.f20001b;
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
                lj0 lj0Var = ((y2) obj).f21870f;
                if (!lj0Var.b()) {
                    lj0Var.setProgress(0.0f);
                    lj0Var.d();
                    return;
                }
                return;
            case 4:
                ((p3) obj).getClass();
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
                b5Var.L.e(b5Var, true);
                return;
            case 8:
                u5 u5Var = (u5) obj;
                u5Var.d = u5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f21646c.onClick(u5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    cq0.U(((aq0) ((ml0) x5Var).f35620b).d, y5Var.f21880b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                u7 u7Var = (u7) obj;
                if (u7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = u7Var.d;
                    int i11 = u7Var.f21659c[intValue];
                    MessageObject messageObject = u7Var.f21658b[intValue];
                    t10 t10Var = ((r10) ((org.telegram.ui.g) r7Var).f33787b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = t10.f37919s0;
                    t10Var.f(i11, u7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
