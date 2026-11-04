package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.s51;
public final class k4 implements u10 {
    public final int f42751a;
    public final w5 f42752b;

    public k4(w5 w5Var, int i3) {
        this.f42751a = i3;
        this.f42752b = w5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42751a) {
            case 0:
                Boolean bool = (Boolean) obj;
                w5 w5Var = this.f42752b;
                w5Var.C0.setClickable(!bool.booleanValue());
                w5Var.D0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    w5Var.f43326f0 = 1;
                    w5Var.f43337q0.setPosition(1);
                    w5Var.f43337q0.post(new d4(w5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                w5 w5Var2 = this.f42752b;
                w5Var2.f43332l0 = lowerCase;
                l41[] l41VarArr = w5Var2.f43341s0;
                l41 l41Var = l41VarArr[1];
                if (l41Var != null) {
                    w5.Y0(l41Var, true);
                    l41VarArr[1].v0(0);
                    l41VarArr[1].post(new d4(w5Var2, 6));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                w5 w5Var3 = this.f42752b;
                if (w5Var3.B0 != floatValue) {
                    w5Var3.B0 = floatValue;
                    float y9 = org.telegram.ui.Cells.f1.y(floatValue, 0.6f, 1.0f, 0.0f);
                    int i3 = 0;
                    for (int i10 = 0; i10 < w5Var3.A0.getChildCount(); i10++) {
                        View childAt = w5Var3.A0.getChildAt(i10);
                        childAt.setAlpha(y9);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    s51 s51Var = w5Var3.A0;
                    if (floatValue != 0.0f) {
                        i3 = 4;
                    }
                    s51Var.setImportantForAccessibility(i3);
                    w5Var3.A0.requestLayout();
                    return;
                }
                return;
            case 3:
                w5.j0(this.f42752b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                w5 w5Var4 = this.f42752b;
                if (!w5Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new d4(w5Var4, 11));
                        return;
                    } else {
                        w5Var4.presentFragment(new m9(user));
                        return;
                    }
                }
                return;
        }
    }
}
