package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u41;
import org.telegram.ui.z51;
public final class l4 implements z10 {
    public final int f44119a;
    public final y5 f44120b;

    public l4(y5 y5Var, int i7) {
        this.f44119a = i7;
        this.f44120b = y5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f44119a) {
            case 0:
                Boolean bool = (Boolean) obj;
                y5 y5Var = this.f44120b;
                y5Var.C0.setClickable(!bool.booleanValue());
                y5Var.D0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    y5Var.f44734f0 = 1;
                    y5Var.f44745q0.setPosition(1);
                    y5Var.f44745q0.post(new e4(y5Var, 7));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                y5 y5Var2 = this.f44120b;
                y5Var2.f44740l0 = lowerCase;
                u41[] u41VarArr = y5Var2.f44749s0;
                u41 u41Var = u41VarArr[1];
                if (u41Var != null) {
                    y5.Z0(u41Var, true);
                    u41VarArr[1].v0(0);
                    u41VarArr[1].post(new e4(y5Var2, 7));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                y5 y5Var3 = this.f44120b;
                if (y5Var3.B0 != floatValue) {
                    y5Var3.B0 = floatValue;
                    float z10 = org.telegram.ui.Cells.y0.z(floatValue, 0.6f, 1.0f, 0.0f);
                    int i7 = 0;
                    for (int i10 = 0; i10 < y5Var3.A0.getChildCount(); i10++) {
                        View childAt = y5Var3.A0.getChildAt(i10);
                        childAt.setAlpha(z10);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    z51 z51Var = y5Var3.A0;
                    if (floatValue != 0.0f) {
                        i7 = 4;
                    }
                    z51Var.setImportantForAccessibility(i7);
                    y5Var3.A0.requestLayout();
                    return;
                }
                return;
            case 3:
                y5.j0(this.f44120b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                y5 y5Var4 = this.f44120b;
                if (!y5Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new e4(y5Var4, 11));
                        return;
                    } else {
                        y5Var4.presentFragment(new p9(user));
                        return;
                    }
                }
                return;
        }
    }
}
