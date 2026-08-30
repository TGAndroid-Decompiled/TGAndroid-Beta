package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.il0;
import org.telegram.ui.np0;
import org.telegram.ui.pp0;
import org.telegram.ui.r10;
import org.telegram.ui.t10;
public final class a implements View.OnClickListener {
    public final int f20809a;
    public final Object f20810b;

    public a(Object obj, int i10) {
        this.f20809a = i10;
        this.f20810b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f20809a;
        Object obj = this.f20810b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.e.size() == 1) {
                    new kh.s(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    return;
                } else {
                    new kh.f(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                jj0 jj0Var = ((x2) obj).f22572f;
                if (!jj0Var.b()) {
                    jj0Var.setProgress(0.0f);
                    jj0Var.d();
                    return;
                }
                return;
            case 4:
                ((o3) obj).getClass();
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
                b5Var.I.c(b5Var, true);
                return;
            case 8:
                u5 u5Var = (u5) obj;
                u5Var.d = u5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f22401c.onClick(u5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    pp0.U(((np0) ((il0) x5Var).f35137b).d, y5Var.f22616b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                s7 s7Var = (s7) obj;
                if (s7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    p7 p7Var = s7Var.d;
                    int i11 = s7Var.f21947c[intValue];
                    MessageObject messageObject = s7Var.f21946b[intValue];
                    t10 t10Var = ((r10) ((org.telegram.ui.h) p7Var).f34709b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = t10.f38471p0;
                    t10Var.f(i11, s7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
