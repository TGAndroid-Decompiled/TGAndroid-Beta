package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.gq0;
import org.telegram.ui.hq0;
import org.telegram.ui.jq0;
import org.telegram.ui.t10;
import org.telegram.ui.v10;
public final class a implements View.OnClickListener {
    public final int f21801a;
    public final Object f21802b;

    public a(Object obj, int i10) {
        this.f21801a = i10;
        this.f21802b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f21801a;
        Object obj = this.f21802b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f22465e.size() == 1) {
                    new xh.o(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.f22465e.get(0)).show();
                    return;
                } else {
                    new xh.f(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                gk0 gk0Var = ((y2) obj).f23789f;
                if (!gk0Var.b()) {
                    gk0Var.setProgress(0.0f);
                    gk0Var.d();
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
                u5Var.d = u5Var.f23526e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f23525c.onClick(u5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    jq0.U(((hq0) ((gq0) x5Var).f38186b).d, y5Var.f23800b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                u7 u7Var = (u7) obj;
                if (u7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = u7Var.d;
                    int i11 = u7Var.f23540c[intValue];
                    MessageObject messageObject = u7Var.f23539b[intValue];
                    v10 v10Var = ((t10) ((org.telegram.ui.g) r7Var).f37850b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = v10.f42861s0;
                    v10Var.f(i11, u7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
