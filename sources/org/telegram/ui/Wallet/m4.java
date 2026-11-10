package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r41;
import org.telegram.ui.e61;
public final class m4 implements c20 {
    public final int f42823a;
    public final z5 f42824b;

    public m4(z5 z5Var, int i7) {
        this.f42823a = i7;
        this.f42824b = z5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42823a) {
            case 0:
                Boolean bool = (Boolean) obj;
                z5 z5Var = this.f42824b;
                z5Var.B0.setClickable(!bool.booleanValue());
                z5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    z5Var.f43449e0 = 1;
                    z5Var.f43461p0.setPosition(1);
                    z5Var.f43461p0.post(new f4(z5Var, 7));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                z5 z5Var2 = this.f42824b;
                z5Var2.f43456k0 = lowerCase;
                r41[] r41VarArr = z5Var2.f43464r0;
                r41 r41Var = r41VarArr[1];
                if (r41Var != null) {
                    z5.Z0(r41Var, true);
                    r41VarArr[1].v0(0);
                    r41VarArr[1].post(new f4(z5Var2, 7));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                z5 z5Var3 = this.f42824b;
                if (z5Var3.A0 != floatValue) {
                    z5Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i7 = 0;
                    for (int i10 = 0; i10 < z5Var3.f43476z0.getChildCount(); i10++) {
                        View childAt = z5Var3.f43476z0.getChildAt(i10);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    e61 e61Var = z5Var3.f43476z0;
                    if (floatValue != 0.0f) {
                        i7 = 4;
                    }
                    e61Var.setImportantForAccessibility(i7);
                    z5Var3.f43476z0.requestLayout();
                    return;
                }
                return;
            case 3:
                z5.j0(this.f42824b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                z5 z5Var4 = this.f42824b;
                if (!z5Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new f4(z5Var4, 11));
                        return;
                    } else {
                        z5Var4.presentFragment(new o9(user));
                        return;
                    }
                }
                return;
        }
    }
}
