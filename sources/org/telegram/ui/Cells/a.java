package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.iq0;
import org.telegram.ui.kq0;
import org.telegram.ui.ul0;
import org.telegram.ui.x10;
import org.telegram.ui.z10;
public final class a implements View.OnClickListener {
    public final int f18862a;
    public final Object f18863b;

    public a(Object obj, int i10) {
        this.f18862a = i10;
        this.f18863b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f18862a;
        Object obj = this.f18863b;
        switch (i10) {
            case 0:
                ((j) obj).h();
                return;
            case 1:
                m mVar = (m) obj;
                if (mVar.e.size() == 1) {
                    new wh.m(mVar.getContext(), null, null, (GiftAuctionController.Auction) mVar.e.get(0)).show();
                    return;
                } else {
                    new wh.e(mVar.getContext()).show();
                    return;
                }
            case 2:
                ((w) obj).toggle();
                return;
            case 3:
                kj0 kj0Var = ((x2) obj).f20702f;
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
                d4 d4Var = (d4) obj;
                d4Var.d(d4Var);
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
                u5Var.d = u5Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                u5Var.b(true);
                u5Var.f20490c.onClick(u5Var);
                return;
            case 9:
                z5 z5Var = (z5) obj;
                y5 y5Var = z5Var.d;
                if (y5Var != null) {
                    kq0.U(((iq0) ((ul0) y5Var).f37294b).d, z5Var.f20785b[((Integer) view.getTag()).intValue()]);
                    return;
                }
                return;
            case 10:
                v7 v7Var = (v7) obj;
                if (v7Var.d != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    s7 s7Var = v7Var.d;
                    int i11 = v7Var.f20561c[intValue];
                    MessageObject messageObject = v7Var.f20560b[intValue];
                    z10 z10Var = ((x10) ((org.telegram.ui.g) s7Var).f32950b).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = z10.f39159s0;
                    z10Var.f(i11, v7Var, messageObject, intValue);
                    return;
                }
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
