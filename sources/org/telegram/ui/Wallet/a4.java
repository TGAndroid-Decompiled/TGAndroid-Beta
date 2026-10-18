package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a71;
import org.telegram.ui.sa1;
public final class a4 implements Utilities.Callback {
    public final int f33975a;
    public final n5 f33976b;

    public a4(n5 n5Var, int i10) {
        this.f33975a = i10;
        this.f33976b = n5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33975a) {
            case 0:
                Boolean bool = (Boolean) obj;
                n5 n5Var = this.f33976b;
                n5Var.A0.setClickable(!bool.booleanValue());
                n5Var.B0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    n5Var.f34582d0 = 1;
                    n5Var.f34594o0.setPosition(1);
                    n5Var.f34594o0.post(new o3(n5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                n5 n5Var2 = this.f33976b;
                n5Var2.f34589j0 = lowerCase;
                a71[] a71VarArr = n5Var2.f34596q0;
                a71 a71Var = a71VarArr[1];
                if (a71Var != null) {
                    n5.R0(a71Var, true);
                    a71VarArr[1].u0(0);
                    a71VarArr[1].post(new o3(n5Var2, 6));
                    return;
                }
                return;
            default:
                float floatValue = ((Float) obj).floatValue();
                n5 n5Var3 = this.f33976b;
                if (n5Var3.f34610z0 != floatValue) {
                    n5Var3.f34610z0 = floatValue;
                    float v = org.telegram.ui.Cells.c1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i10 = 0;
                    for (int i11 = 0; i11 < n5Var3.f34609y0.getChildCount(); i11++) {
                        View childAt = n5Var3.f34609y0.getChildAt(i11);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    sa1 sa1Var = n5Var3.f34609y0;
                    if (floatValue != 0.0f) {
                        i10 = 4;
                    }
                    sa1Var.setImportantForAccessibility(i10);
                    n5Var3.f34609y0.requestLayout();
                    return;
                }
                return;
        }
    }
}
