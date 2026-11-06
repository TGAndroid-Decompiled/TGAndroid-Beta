package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q41;
import org.telegram.ui.c61;
public final class m4 implements c20 {
    public final int f42770a;
    public final y5 f42771b;

    public m4(y5 y5Var, int i7) {
        this.f42770a = i7;
        this.f42771b = y5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42770a) {
            case 0:
                Boolean bool = (Boolean) obj;
                y5 y5Var = this.f42771b;
                y5Var.B0.setClickable(!bool.booleanValue());
                y5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    y5Var.f43370e0 = 1;
                    y5Var.f43382p0.setPosition(1);
                    y5Var.f43382p0.post(new f4(y5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                y5 y5Var2 = this.f42771b;
                y5Var2.f43377k0 = lowerCase;
                q41[] q41VarArr = y5Var2.f43385r0;
                q41 q41Var = q41VarArr[1];
                if (q41Var != null) {
                    y5.Y0(q41Var, true);
                    q41VarArr[1].v0(0);
                    q41VarArr[1].post(new f4(y5Var2, 6));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                y5 y5Var3 = this.f42771b;
                if (y5Var3.A0 != floatValue) {
                    y5Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i7 = 0;
                    for (int i10 = 0; i10 < y5Var3.f43397z0.getChildCount(); i10++) {
                        View childAt = y5Var3.f43397z0.getChildAt(i10);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    c61 c61Var = y5Var3.f43397z0;
                    if (floatValue != 0.0f) {
                        i7 = 4;
                    }
                    c61Var.setImportantForAccessibility(i7);
                    y5Var3.f43397z0.requestLayout();
                    return;
                }
                return;
            case 3:
                y5.j0(this.f42771b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                y5 y5Var4 = this.f42771b;
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
