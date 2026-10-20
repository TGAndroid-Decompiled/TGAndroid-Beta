package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.c10;
import org.telegram.ui.e10;
import org.telegram.ui.pp0;
import org.telegram.ui.qp0;
import org.telegram.ui.sp0;
public final class a implements View.OnClickListener {
    public final int f21951a;
    public final Object f21952b;

    public a(Object obj, int i10) {
        this.f21951a = i10;
        this.f21952b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f21951a;
        Object obj = this.f21952b;
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
                yj0 yj0Var = ((x2) obj).f23794f;
                if (!yj0Var.b()) {
                    yj0Var.setProgress(0.0f);
                    yj0Var.d();
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
                t5Var.f23189c.onClick(t5Var);
                return;
            case 9:
                x5 x5Var = (x5) obj;
                w5 w5Var = x5Var.d;
                if (w5Var != null) {
                    sp0.U(((qp0) ((pp0) w5Var).f40278b).d, x5Var.f23804b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                t7 t7Var = (t7) obj;
                if (t7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    q7 q7Var = t7Var.d;
                    int i11 = t7Var.f23202c[intValue];
                    MessageObject messageObject = t7Var.f23201b[intValue];
                    e10 e10Var = ((c10) ((org.telegram.ui.g) q7Var).f37149b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = e10.f36490s0;
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
