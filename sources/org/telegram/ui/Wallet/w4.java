package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g51;
import org.telegram.ui.b61;
public final class w4 implements w10 {
    public final int f45333a;
    public final o6 f45334b;

    public w4(o6 o6Var, int i7) {
        this.f45333a = i7;
        this.f45334b = o6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45333a) {
            case 0:
                Boolean bool = (Boolean) obj;
                o6 o6Var = this.f45334b;
                o6Var.E0.setClickable(!bool.booleanValue());
                o6Var.F0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    o6Var.f44800f0 = 1;
                    o6Var.f44815s0.setPosition(1);
                    o6Var.f44815s0.post(new r4(o6Var, 3));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                o6 o6Var2 = this.f45334b;
                o6Var2.f44806l0 = lowerCase;
                g51[] g51VarArr = o6Var2.f44817u0;
                g51 g51Var = g51VarArr[1];
                if (g51Var != null) {
                    o6.d1(g51Var, true);
                    g51VarArr[1].v0(0);
                    g51VarArr[1].post(new r4(o6Var2, 3));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                o6 o6Var3 = this.f45334b;
                if (o6Var3.D0 != floatValue) {
                    o6Var3.D0 = floatValue;
                    float B = org.telegram.ui.Cells.c0.B(floatValue, 0.6f, 1.0f, 0.0f);
                    int i7 = 0;
                    for (int i10 = 0; i10 < o6Var3.C0.getChildCount(); i10++) {
                        View childAt = o6Var3.C0.getChildAt(i10);
                        childAt.setAlpha(B);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    b61 b61Var = o6Var3.C0;
                    if (floatValue != 0.0f) {
                        i7 = 4;
                    }
                    b61Var.setImportantForAccessibility(i7);
                    o6Var3.C0.requestLayout();
                    return;
                }
                return;
            case 3:
                o6.k0(this.f45334b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                o6 o6Var4 = this.f45334b;
                if (!o6Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.g3(new r4(o6Var4, 9));
                        return;
                    } else {
                        o6Var4.presentFragment(new ea(user));
                        return;
                    }
                }
                return;
        }
    }
}
