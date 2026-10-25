package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.aq0;
import org.telegram.ui.f10;
import org.telegram.ui.h10;
import org.telegram.ui.hl0;
import org.telegram.ui.yp0;
public final class a implements View.OnClickListener {
    public final int f23833a;
    public final Object f23834b;

    public a(Object obj, int i10) {
        this.f23833a = i10;
        this.f23834b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f23833a;
        Object obj = this.f23834b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.e.size() == 1) {
                    new zh.m(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    return;
                } else {
                    new zh.e(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((v) obj).toggle();
                return;
            case 3:
                ak0 ak0Var = ((v2) obj).f25577f;
                if (!ak0Var.b()) {
                    ak0Var.setProgress(0.0f);
                    ak0Var.d();
                    return;
                }
                return;
            case 4:
                ((m3) obj).getClass();
                return;
            case 5:
                i4 i4Var = (i4) obj;
                i4Var.d(i4Var);
                return;
            case 6:
                ((t4) obj).performClick();
                return;
            case 7:
                f5 f5Var = (f5) obj;
                f5Var.L.b(f5Var, true);
                return;
            case 8:
                y5 y5Var = (y5) obj;
                y5Var.d = y5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                y5Var.b(true);
                y5Var.f25758c.onClick(y5Var);
                return;
            case 9:
                c6 c6Var = (c6) obj;
                b6 b6Var = c6Var.d;
                if (b6Var != null) {
                    aq0.V(((yp0) ((hl0) b6Var).f40032b).d, c6Var.f23928b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                x7 x7Var = (x7) obj;
                if (x7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    u7 u7Var = x7Var.d;
                    int i11 = x7Var.f25719c[intValue];
                    MessageObject messageObject = x7Var.f25718b[intValue];
                    h10 h10Var = ((f10) ((org.telegram.ui.f) u7Var).f39221b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = h10.f39822s0;
                    h10Var.f(i11, x7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
