package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.hq0;
import org.telegram.ui.jq0;
import org.telegram.ui.tl0;
import org.telegram.ui.v10;
import org.telegram.ui.x10;
public final class a implements View.OnClickListener {
    public final int f19776a;
    public final Object f19777b;

    public a(Object obj, int i10) {
        this.f19776a = i10;
        this.f19777b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f19776a;
        Object obj = this.f19777b;
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
                aj0 aj0Var = ((x2) obj).f21614f;
                if (!aj0Var.b()) {
                    aj0Var.setProgress(0.0f);
                    aj0Var.d();
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
                a5Var.L.c(a5Var, true);
                return;
            case 8:
                t5 t5Var = (t5) obj;
                t5Var.d = t5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                t5Var.b(true);
                t5Var.f21360c.onClick(t5Var);
                return;
            case 9:
                x5 x5Var = (x5) obj;
                w5 w5Var = x5Var.d;
                if (w5Var != null) {
                    jq0.U(((hq0) ((tl0) w5Var).f37748b).d, x5Var.f21624b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                u7 u7Var = (u7) obj;
                if (u7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    r7 r7Var = u7Var.d;
                    int i11 = u7Var.f21444c[intValue];
                    MessageObject messageObject = u7Var.f21443b[intValue];
                    x10 x10Var = ((v10) ((org.telegram.ui.g) r7Var).f33719b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = x10.f39437s0;
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
