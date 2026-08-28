package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.d10;
import org.telegram.ui.dl0;
import org.telegram.ui.f10;
import org.telegram.ui.gp0;
import org.telegram.ui.ip0;
public final class a implements View.OnClickListener {
    public final int f24039a;
    public final Object f24040b;

    public a(Object obj, int i9) {
        this.f24039a = i9;
        this.f24040b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i9 = this.f24039a;
        Object obj = this.f24040b;
        switch (i9) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f24681e.size() == 1) {
                    new fh.x(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.f24681e.get(0)).show();
                    return;
                } else {
                    new fh.f(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                pi0 pi0Var = ((x2) obj).f25934f;
                if (!pi0Var.b()) {
                    pi0Var.setProgress(0.0f);
                    pi0Var.d();
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
                b5Var.H.d(b5Var, true);
                return;
            case 8:
                u5 u5Var = (u5) obj;
                u5Var.d = u5Var.f25747e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f25746c.onClick(u5Var);
                return;
            case 9:
                y5 y5Var = (y5) obj;
                x5 x5Var = y5Var.d;
                if (x5Var != null) {
                    ip0.T(((gp0) ((dl0) x5Var).f37560b).d, y5Var.f25992b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                s7 s7Var = (s7) obj;
                if (s7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    p7 p7Var = s7Var.d;
                    int i10 = s7Var.f25282c[intValue];
                    MessageObject messageObject = s7Var.f25281b[intValue];
                    f10 f10Var = ((d10) ((org.telegram.ui.g) p7Var).f38388b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = f10.f38084o0;
                    f10Var.f(i10, s7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
