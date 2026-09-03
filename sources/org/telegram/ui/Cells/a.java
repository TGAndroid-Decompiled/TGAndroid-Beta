package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.kl0;
import org.telegram.ui.r10;
import org.telegram.ui.t10;
import org.telegram.ui.up0;
import org.telegram.ui.wp0;
public final class a implements View.OnClickListener {
    public final int f22531a;
    public final Object f22532b;

    public a(Object obj, int i10) {
        this.f22531a = i10;
        this.f22532b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f22531a;
        Object obj = this.f22532b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f23145e.size() == 1) {
                    new lh.s(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.f23145e.get(0)).show();
                    return;
                } else {
                    new lh.f(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                kj0 kj0Var = ((x2) obj).f24396f;
                if (!kj0Var.b()) {
                    kj0Var.setProgress(0.0f);
                    kj0Var.d();
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
                u5Var.d = u5Var.f24212e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f24211c.onClick(u5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    wp0.U(((up0) ((kl0) x5Var).f38342b).d, y5Var.f24444b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                s7 s7Var = (s7) obj;
                if (s7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    p7 p7Var = s7Var.d;
                    int i11 = s7Var.f23746c[intValue];
                    MessageObject messageObject = s7Var.f23745b[intValue];
                    t10 t10Var = ((r10) ((org.telegram.ui.h) p7Var).f37188b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = t10.f41354p0;
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
