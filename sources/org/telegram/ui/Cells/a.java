package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.dl0;
import org.telegram.ui.g10;
import org.telegram.ui.hp0;
import org.telegram.ui.i10;
import org.telegram.ui.jp0;

public final class a implements View.OnClickListener {

    public final int f24046a;

    public final Object f24047b;

    public a(Object obj, int i10) {
        this.f24046a = i10;
        this.f24047b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24046a;
        Object obj = this.f24047b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                break;
            case 1:
                m mVar = (m) obj;
                if (mVar.f24645e.size() != 1) {
                    new gh.f(mVar.getContext()).show();
                } else {
                    new gh.v(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.f24645e.get(0)).show();
                }
                break;
            case 2:
                ((w) obj).toggle();
                break;
            case 3:
                ri0 ri0Var = ((v2) obj).f25795f;
                if (!ri0Var.b()) {
                    ri0Var.setProgress(0.0f);
                    ri0Var.d();
                }
                break;
            case 4:
                ((m3) obj).getClass();
                break;
            case 5:
                b4 b4Var = (b4) obj;
                b4Var.d(b4Var);
                break;
            case 6:
                ((m4) obj).performClick();
                break;
            case 7:
                y4 y4Var = (y4) obj;
                y4Var.H.d(y4Var, true);
                break;
            case 8:
                r5 r5Var = (r5) obj;
                r5Var.d = r5Var.f25219e[((Integer) ((RadioButton) view).getTag()).intValue()];
                r5Var.b(true);
                r5Var.f25218c.onClick(r5Var);
                break;
            case 9:
                v5 v5Var = (v5) obj;
                u5 u5Var = v5Var.d;
                if (u5Var != null) {
                    jp0.U(((hp0) ((dl0) u5Var).f37438b).d, v5Var.f25806b[((Integer) view.getTag()).intValue()]);
                }
                break;
            case 10:
                p7 p7Var = (p7) obj;
                if (p7Var.d != null) {
                    int iIntValue = ((Integer) view.getTag()).intValue();
                    m7 m7Var = p7Var.d;
                    int i11 = p7Var.f24994c[iIntValue];
                    MessageObject messageObject = p7Var.f24993b[iIntValue];
                    i10 i10Var = ((g10) ((org.telegram.ui.g) m7Var).f38248b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = i10.f38933o0;
                    i10Var.f(i11, p7Var, messageObject, iIntValue);
                }
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
