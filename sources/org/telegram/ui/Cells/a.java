package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.a20;
import org.telegram.ui.c20;
import org.telegram.ui.nq0;
import org.telegram.ui.oq0;
import org.telegram.ui.qq0;
public final class a implements View.OnClickListener {
    public final int f20888a;
    public final Object f20889b;

    public a(Object obj, int i10) {
        this.f20888a = i10;
        this.f20889b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f20888a;
        Object obj = this.f20889b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.e.size() == 1) {
                    new yh.n(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    return;
                } else {
                    new yh.f(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                bk0 bk0Var = ((y2) obj).f22770f;
                if (!bk0Var.b()) {
                    bk0Var.setProgress(0.0f);
                    bk0Var.d();
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
                b5Var.L.d(b5Var, true);
                return;
            case 8:
                u5 u5Var = (u5) obj;
                u5Var.d = u5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f22524c.onClick(u5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    qq0.U(((oq0) ((nq0) x5Var).f38783b).d, y5Var.f22780b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                u7 u7Var = (u7) obj;
                if (u7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = u7Var.d;
                    int i11 = u7Var.f22537c[intValue];
                    MessageObject messageObject = u7Var.f22536b[intValue];
                    c20 c20Var = ((a20) ((org.telegram.ui.g) r7Var).f36263b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = c20.f34678s0;
                    c20Var.f(i11, u7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
