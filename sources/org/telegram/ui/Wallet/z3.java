package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a71;
import org.telegram.ui.sa1;
public final class z3 implements Utilities.Callback {
    public final int f35169a;
    public final m5 f35170b;

    public z3(m5 m5Var, int i10) {
        this.f35169a = i10;
        this.f35170b = m5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35169a) {
            case 0:
                Boolean bool = (Boolean) obj;
                m5 m5Var = this.f35170b;
                m5Var.C0.setClickable(!bool.booleanValue());
                m5Var.D0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    m5Var.f34573f0 = 1;
                    m5Var.f34584q0.setPosition(1);
                    m5Var.f34584q0.post(new n3(m5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                m5 m5Var2 = this.f35170b;
                m5Var2.f34579l0 = lowerCase;
                a71[] a71VarArr = m5Var2.f34588s0;
                a71 a71Var = a71VarArr[1];
                if (a71Var != null) {
                    m5.R0(a71Var, true);
                    a71VarArr[1].u0(0);
                    a71VarArr[1].post(new n3(m5Var2, 6));
                    return;
                }
                return;
            default:
                float floatValue = ((Float) obj).floatValue();
                m5 m5Var3 = this.f35170b;
                if (m5Var3.B0 != floatValue) {
                    m5Var3.B0 = floatValue;
                    float v = org.telegram.ui.Cells.c1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i10 = 0;
                    for (int i11 = 0; i11 < m5Var3.A0.getChildCount(); i11++) {
                        View childAt = m5Var3.A0.getChildAt(i11);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    sa1 sa1Var = m5Var3.A0;
                    if (floatValue != 0.0f) {
                        i10 = 4;
                    }
                    sa1Var.setImportantForAccessibility(i10);
                    m5Var3.A0.requestLayout();
                    return;
                }
                return;
        }
    }
}
