package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r41;
import org.telegram.ui.d61;
public final class k4 implements c20 {
    public final int f42659a;
    public final w5 f42660b;

    public k4(w5 w5Var, int i7) {
        this.f42659a = i7;
        this.f42660b = w5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42659a) {
            case 0:
                Boolean bool = (Boolean) obj;
                w5 w5Var = this.f42660b;
                w5Var.B0.setClickable(!bool.booleanValue());
                w5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    w5Var.f43254e0 = 1;
                    w5Var.f43266p0.setPosition(1);
                    w5Var.f43266p0.post(new d4(w5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                w5 w5Var2 = this.f42660b;
                w5Var2.f43261k0 = lowerCase;
                r41[] r41VarArr = w5Var2.f43269r0;
                r41 r41Var = r41VarArr[1];
                if (r41Var != null) {
                    w5.Y0(r41Var, true);
                    r41VarArr[1].v0(0);
                    r41VarArr[1].post(new d4(w5Var2, 6));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                w5 w5Var3 = this.f42660b;
                if (w5Var3.A0 != floatValue) {
                    w5Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i7 = 0;
                    for (int i10 = 0; i10 < w5Var3.f43281z0.getChildCount(); i10++) {
                        View childAt = w5Var3.f43281z0.getChildAt(i10);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    d61 d61Var = w5Var3.f43281z0;
                    if (floatValue != 0.0f) {
                        i7 = 4;
                    }
                    d61Var.setImportantForAccessibility(i7);
                    w5Var3.f43281z0.requestLayout();
                    return;
                }
                return;
            case 3:
                w5.j0(this.f42660b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                w5 w5Var4 = this.f42660b;
                if (!w5Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new d4(w5Var4, 11));
                        return;
                    } else {
                        w5Var4.presentFragment(new l9(user));
                        return;
                    }
                }
                return;
        }
    }
}
