package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h51;
import org.telegram.ui.d61;
public final class v4 implements y10 {
    public final int f45171a;
    public final n6 f45172b;

    public v4(n6 n6Var, int i7) {
        this.f45171a = i7;
        this.f45172b = n6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45171a) {
            case 0:
                Boolean bool = (Boolean) obj;
                n6 n6Var = this.f45172b;
                n6Var.E0.setClickable(!bool.booleanValue());
                n6Var.F0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    n6Var.f44638f0 = 1;
                    n6Var.f44653s0.setPosition(1);
                    n6Var.f44653s0.post(new q4(n6Var, 3));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                n6 n6Var2 = this.f45172b;
                n6Var2.f44644l0 = lowerCase;
                h51[] h51VarArr = n6Var2.f44655u0;
                h51 h51Var = h51VarArr[1];
                if (h51Var != null) {
                    n6.d1(h51Var, true);
                    h51VarArr[1].v0(0);
                    h51VarArr[1].post(new q4(n6Var2, 3));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                n6 n6Var3 = this.f45172b;
                if (n6Var3.D0 != floatValue) {
                    n6Var3.D0 = floatValue;
                    float B = org.telegram.ui.Cells.c0.B(floatValue, 0.6f, 1.0f, 0.0f);
                    int i7 = 0;
                    for (int i10 = 0; i10 < n6Var3.C0.getChildCount(); i10++) {
                        View childAt = n6Var3.C0.getChildAt(i10);
                        childAt.setAlpha(B);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    d61 d61Var = n6Var3.C0;
                    if (floatValue != 0.0f) {
                        i7 = 4;
                    }
                    d61Var.setImportantForAccessibility(i7);
                    n6Var3.C0.requestLayout();
                    return;
                }
                return;
            case 3:
                n6.k0(this.f45172b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                n6 n6Var4 = this.f45172b;
                if (!n6Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.g3(new q4(n6Var4, 9));
                        return;
                    } else {
                        n6Var4.presentFragment(new da(user));
                        return;
                    }
                }
                return;
        }
    }
}
