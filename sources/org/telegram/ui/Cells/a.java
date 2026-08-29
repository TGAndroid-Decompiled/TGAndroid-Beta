package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.f10;
import org.telegram.ui.fp0;
import org.telegram.ui.h10;
import org.telegram.ui.hp0;
import org.telegram.ui.zk0;
public final class a implements View.OnClickListener {
    public final int f24059a;
    public final Object f24060b;

    public a(Object obj, int i10) {
        this.f24059a = i10;
        this.f24060b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24059a;
        Object obj = this.f24060b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.f24663e.size() == 1) {
                    new ih.t(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.f24663e.get(0)).show();
                    return;
                } else {
                    new ih.f(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                aj0 aj0Var = ((v2) obj).f25825f;
                if (!aj0Var.b()) {
                    aj0Var.setProgress(0.0f);
                    aj0Var.d();
                    return;
                }
                return;
            case 4:
                ((m3) obj).getClass();
                return;
            case 5:
                c4 c4Var = (c4) obj;
                c4Var.d(c4Var);
                return;
            case 6:
                ((n4) obj).performClick();
                return;
            case 7:
                z4 z4Var = (z4) obj;
                z4Var.H.d(z4Var, true);
                return;
            case 8:
                s5 s5Var = (s5) obj;
                s5Var.d = s5Var.f25656e[((Integer) ((RadioButton) view).getTag()).intValue()];
                s5Var.b(true);
                s5Var.f25655c.onClick(s5Var);
                return;
            case 9:
                w5 w5Var = (w5) obj;
                v5 v5Var = w5Var.d;
                if (v5Var != null) {
                    hp0.U(((fp0) ((zk0) v5Var).f45255b).d, w5Var.f25867b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                q7 q7Var = (q7) obj;
                if (q7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    n7 n7Var = q7Var.d;
                    int i11 = q7Var.f25074c[intValue];
                    MessageObject messageObject = q7Var.f25073b[intValue];
                    h10 h10Var = ((f10) ((org.telegram.ui.h) n7Var).f38706b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = h10.f38717o0;
                    h10Var.f(i11, q7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
