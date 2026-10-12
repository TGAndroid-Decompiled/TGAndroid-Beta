package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.jq0;
import org.telegram.ui.kq0;
import org.telegram.ui.mq0;
import org.telegram.ui.w10;
import org.telegram.ui.y10;
public final class a implements View.OnClickListener {
    public final int f21539a;
    public final Object f21540b;

    public a(Object obj, int i10) {
        this.f21539a = i10;
        this.f21540b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f21539a;
        Object obj = this.f21540b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f22200e.size() == 1) {
                    new xh.o(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.f22200e.get(0)).show();
                    return;
                } else {
                    new xh.f(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                ik0 ik0Var = ((y2) obj).f23526f;
                if (!ik0Var.b()) {
                    ik0Var.setProgress(0.0f);
                    ik0Var.d();
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
                b5Var.L.c(b5Var, true);
                return;
            case 8:
                u5 u5Var = (u5) obj;
                u5Var.d = u5Var.f23270e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f23269c.onClick(u5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    mq0.U(((kq0) ((jq0) x5Var).f39266b).d, y5Var.f23537b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                u7 u7Var = (u7) obj;
                if (u7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = u7Var.d;
                    int i11 = u7Var.f23284c[intValue];
                    MessageObject messageObject = u7Var.f23283b[intValue];
                    y10 y10Var = ((w10) ((org.telegram.ui.g) r7Var).f37879b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = y10.f44240s0;
                    y10Var.f(i11, u7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
