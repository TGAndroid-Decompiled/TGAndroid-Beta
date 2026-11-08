package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q41;
import org.telegram.ui.c61;
public final class l4 implements c20 {
    public final int f42740a;
    public final x5 f42741b;

    public l4(x5 x5Var, int i7) {
        this.f42740a = i7;
        this.f42741b = x5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f42740a) {
            case 0:
                Boolean bool = (Boolean) obj;
                x5 x5Var = this.f42741b;
                x5Var.B0.setClickable(!bool.booleanValue());
                x5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    x5Var.f43336e0 = 1;
                    x5Var.f43348p0.setPosition(1);
                    x5Var.f43348p0.post(new e4(x5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                x5 x5Var2 = this.f42741b;
                x5Var2.f43343k0 = lowerCase;
                q41[] q41VarArr = x5Var2.f43351r0;
                q41 q41Var = q41VarArr[1];
                if (q41Var != null) {
                    x5.Y0(q41Var, true);
                    q41VarArr[1].v0(0);
                    q41VarArr[1].post(new e4(x5Var2, 6));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                x5 x5Var3 = this.f42741b;
                if (x5Var3.A0 != floatValue) {
                    x5Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i7 = 0;
                    for (int i10 = 0; i10 < x5Var3.f43363z0.getChildCount(); i10++) {
                        View childAt = x5Var3.f43363z0.getChildAt(i10);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    c61 c61Var = x5Var3.f43363z0;
                    if (floatValue != 0.0f) {
                        i7 = 4;
                    }
                    c61Var.setImportantForAccessibility(i7);
                    x5Var3.f43363z0.requestLayout();
                    return;
                }
                return;
            case 3:
                x5.j0(this.f42741b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                x5 x5Var4 = this.f42741b;
                if (!x5Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.g0.h3(new e4(x5Var4, 11));
                        return;
                    } else {
                        x5Var4.presentFragment(new m9(user));
                        return;
                    }
                }
                return;
        }
    }
}
