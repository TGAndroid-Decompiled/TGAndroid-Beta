package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.dq0;
import org.telegram.ui.fq0;
import org.telegram.ui.jl0;
import org.telegram.ui.v10;
import org.telegram.ui.x10;
public final class a implements View.OnClickListener {
    public final int f21772a;
    public final Object f21773b;

    public a(Object obj, int i10) {
        this.f21772a = i10;
        this.f21773b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f21772a;
        Object obj = this.f21773b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f22450e.size() == 1) {
                    new xh.m(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.f22450e.get(0)).show();
                    return;
                } else {
                    new xh.e(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                nj0 nj0Var = ((y2) obj).f23757f;
                if (!nj0Var.b()) {
                    nj0Var.setProgress(0.0f);
                    nj0Var.d();
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
                u5Var.d = u5Var.f23515e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f23514c.onClick(u5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    fq0.S(((dq0) ((jl0) x5Var).f37723b).d, y5Var.f23768b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                u7 u7Var = (u7) obj;
                if (u7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = u7Var.d;
                    int i11 = u7Var.f23529c[intValue];
                    MessageObject messageObject = u7Var.f23528b[intValue];
                    x10 x10Var = ((v10) ((org.telegram.ui.g) r7Var).f36456b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = x10.f42687s0;
                    x10Var.f(i11, u7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
