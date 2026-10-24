package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.g10;
import org.telegram.ui.i10;
import org.telegram.ui.rp0;
import org.telegram.ui.sp0;
import org.telegram.ui.up0;
public final class a implements View.OnClickListener {
    public final int f22070a;
    public final Object f22071b;

    public a(Object obj, int i10) {
        this.f22070a = i10;
        this.f22071b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f22070a;
        Object obj = this.f22071b;
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
                ((v) obj).toggle();
                return;
            case 3:
                ak0 ak0Var = ((w2) obj).f23900f;
                if (!ak0Var.b()) {
                    ak0Var.setProgress(0.0f);
                    ak0Var.d();
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
                a5Var.L.c(a5Var, true);
                return;
            case 8:
                t5 t5Var = (t5) obj;
                t5Var.d = t5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                t5Var.b(true);
                t5Var.f23694c.onClick(t5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    up0.U(((sp0) ((rp0) x5Var).f41206b).d, y5Var.f23978b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                t7 t7Var = (t7) obj;
                if (t7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    q7 q7Var = t7Var.d;
                    int i11 = t7Var.f23707c[intValue];
                    MessageObject messageObject = t7Var.f23706b[intValue];
                    i10 i10Var = ((g10) ((org.telegram.ui.f) q7Var).f37153b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = i10.f38092s0;
                    i10Var.f(i11, t7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
