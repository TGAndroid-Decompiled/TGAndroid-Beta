package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r71;
import org.telegram.ui.xa1;
public final class v3 implements Utilities.Callback {
    public final int f37375a;
    public final m5 f37376b;

    public v3(m5 m5Var, int i10) {
        this.f37375a = i10;
        this.f37376b = m5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37375a) {
            case 0:
                Boolean bool = (Boolean) obj;
                m5 m5Var = this.f37376b;
                m5Var.B0.setClickable(!bool.booleanValue());
                m5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    m5Var.f36940e0 = 1;
                    m5Var.f36952p0.setPosition(1);
                    m5Var.f36952p0.post(new o3(m5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                m5 m5Var2 = this.f37376b;
                m5Var2.f36947k0 = lowerCase;
                r71[] r71VarArr = m5Var2.f36955r0;
                r71 r71Var = r71VarArr[1];
                if (r71Var != null) {
                    m5.U0(r71Var, true);
                    r71VarArr[1].v0(0);
                    r71VarArr[1].post(new o3(m5Var2, 6));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                m5 m5Var3 = this.f37376b;
                if (m5Var3.A0 != floatValue) {
                    m5Var3.A0 = floatValue;
                    float v = org.telegram.ui.d3.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i10 = 0;
                    for (int i11 = 0; i11 < m5Var3.f36967z0.getChildCount(); i11++) {
                        View childAt = m5Var3.f36967z0.getChildAt(i11);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    xa1 xa1Var = m5Var3.f36967z0;
                    if (floatValue != 0.0f) {
                        i10 = 4;
                    }
                    xa1Var.setImportantForAccessibility(i10);
                    m5Var3.f36967z0.requestLayout();
                    return;
                }
                return;
            case 3:
                m5.f0(this.f37376b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                m5 m5Var4 = this.f37376b;
                if (!m5Var4.isFinished) {
                    if (user == null) {
                        AndroidUtilities.runOnUIThread(new o3(m5Var4, 11));
                        return;
                    } else {
                        m5Var4.presentFragment(new i9(user));
                        return;
                    }
                }
                return;
        }
    }
}
