package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.c10;
import org.telegram.ui.e10;
import org.telegram.ui.pp0;
import org.telegram.ui.qp0;
import org.telegram.ui.sp0;
public final class a implements View.OnClickListener {
    public final int f21948a;
    public final Object f21949b;

    public a(Object obj, int i10) {
        this.f21948a = i10;
        this.f21949b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f21948a;
        Object obj = this.f21949b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.e.size() == 1) {
                    new yh.m(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    return;
                } else {
                    new yh.e(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                xj0 xj0Var = ((x2) obj).f23791f;
                if (!xj0Var.b()) {
                    xj0Var.setProgress(0.0f);
                    xj0Var.d();
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
                t5Var.d = t5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                t5Var.b(true);
                t5Var.f23186c.onClick(t5Var);
                return;
            case 9:
                x5 x5Var = (x5) obj;
                w5 w5Var = x5Var.d;
                if (w5Var != null) {
                    sp0.U(((qp0) ((pp0) w5Var).f40272b).d, x5Var.f23801b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                t7 t7Var = (t7) obj;
                if (t7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    q7 q7Var = t7Var.d;
                    int i11 = t7Var.f23199c[intValue];
                    MessageObject messageObject = t7Var.f23198b[intValue];
                    e10 e10Var = ((c10) ((org.telegram.ui.g) q7Var).f37143b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = e10.f36484s0;
                    e10Var.f(i11, t7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
