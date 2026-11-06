package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p41;
import org.telegram.ui.c61;
public final class m4 implements c20 {
    public final int f42771a;
    public final y5 f42772b;

    public m4(y5 y5Var, int i7) {
        this.f42771a = i7;
        this.f42772b = y5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42771a) {
            case 0:
                Boolean bool = (Boolean) obj;
                y5 y5Var = this.f42772b;
                y5Var.B0.setClickable(!bool.booleanValue());
                y5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    y5Var.f43371e0 = 1;
                    y5Var.f43383p0.setPosition(1);
                    y5Var.f43383p0.post(new f4(y5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                y5 y5Var2 = this.f42772b;
                y5Var2.f43378k0 = lowerCase;
                p41[] p41VarArr = y5Var2.f43386r0;
                p41 p41Var = p41VarArr[1];
                if (p41Var != null) {
                    y5.Y0(p41Var, true);
                    p41VarArr[1].v0(0);
                    p41VarArr[1].post(new f4(y5Var2, 6));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                y5 y5Var3 = this.f42772b;
                if (y5Var3.A0 != floatValue) {
                    y5Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i7 = 0;
                    for (int i10 = 0; i10 < y5Var3.f43398z0.getChildCount(); i10++) {
                        View childAt = y5Var3.f43398z0.getChildAt(i10);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    c61 c61Var = y5Var3.f43398z0;
                    if (floatValue != 0.0f) {
                        i7 = 4;
                    }
                    c61Var.setImportantForAccessibility(i7);
                    y5Var3.f43398z0.requestLayout();
                    return;
                }
                return;
            case 3:
                y5.j0(this.f42772b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                y5 y5Var4 = this.f42772b;
                if (!y5Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new f4(y5Var4, 11));
                        return;
                    } else {
                        y5Var4.presentFragment(new n9(user));
                        return;
                    }
                }
                return;
        }
    }
}
