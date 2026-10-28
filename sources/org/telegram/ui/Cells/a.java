package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.aq0;
import org.telegram.ui.cq0;
import org.telegram.ui.h10;
import org.telegram.ui.j10;
import org.telegram.ui.jl0;
public final class a implements View.OnClickListener {
    public final int f23836a;
    public final Object f23837b;

    public a(Object obj, int i10) {
        this.f23836a = i10;
        this.f23837b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f23836a;
        Object obj = this.f23837b;
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
                bk0 bk0Var = ((v2) obj).f25581f;
                if (!bk0Var.b()) {
                    bk0Var.setProgress(0.0f);
                    bk0Var.d();
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
                y5Var.f25762c.onClick(y5Var);
                return;
            case 9:
                c6 c6Var = (c6) obj;
                b6 b6Var = c6Var.d;
                if (b6Var != null) {
                    cq0.V(((aq0) ((jl0) b6Var).f40560b).d, c6Var.f23931b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                x7 x7Var = (x7) obj;
                if (x7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    u7 u7Var = x7Var.d;
                    int i11 = x7Var.f25723c[intValue];
                    MessageObject messageObject = x7Var.f25722b[intValue];
                    j10 j10Var = ((h10) ((org.telegram.ui.f) u7Var).f39115b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = j10.f40319s0;
                    j10Var.f(i11, x7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
