package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.jq0;
import org.telegram.ui.lq0;
import org.telegram.ui.ol0;
import org.telegram.ui.v10;
import org.telegram.ui.x10;
public final class a implements View.OnClickListener {
    public final int f20010a;
    public final Object f20011b;

    public a(Object obj, int i10) {
        this.f20010a = i10;
        this.f20011b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f20010a;
        Object obj = this.f20011b;
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
                nj0 nj0Var = ((y2) obj).f21895f;
                if (!nj0Var.b()) {
                    nj0Var.setProgress(0.0f);
                    nj0Var.d();
                    return;
                }
                return;
            case 4:
                ((q3) obj).getClass();
                return;
            case 5:
                f4 f4Var = (f4) obj;
                f4Var.d(f4Var);
                return;
            case 6:
                ((q4) obj).performClick();
                return;
            case 7:
                c5 c5Var = (c5) obj;
                c5Var.L.c(c5Var, true);
                return;
            case 8:
                v5 v5Var = (v5) obj;
                v5Var.d = v5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                v5Var.b(true);
                v5Var.f21696c.onClick(v5Var);
                return;
            case 9:
                z5 z5Var = (z5) obj;
                y5 y5Var = z5Var.d;
                if (y5Var != null) {
                    lq0.U(((jq0) ((ol0) y5Var).f36361b).d, z5Var.f21931b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                v7 v7Var = (v7) obj;
                if (v7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    s7 s7Var = v7Var.d;
                    int i11 = v7Var.f21709c[intValue];
                    MessageObject messageObject = v7Var.f21708b[intValue];
                    x10 x10Var = ((v10) ((org.telegram.ui.g) s7Var).f33799b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = x10.f39315s0;
                    x10Var.f(i11, v7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
