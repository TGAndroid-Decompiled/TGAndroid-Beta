package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s71;
import org.telegram.ui.za1;
public final class v3 implements Utilities.Callback {
    public final int f37399a;
    public final m5 f37400b;

    public v3(m5 m5Var, int i10) {
        this.f37399a = i10;
        this.f37400b = m5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37399a) {
            case 0:
                Boolean bool = (Boolean) obj;
                m5 m5Var = this.f37400b;
                m5Var.B0.setClickable(!bool.booleanValue());
                m5Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    m5Var.f36945e0 = 1;
                    m5Var.f36957p0.setPosition(1);
                    m5Var.f36957p0.post(new o3(m5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                m5 m5Var2 = this.f37400b;
                m5Var2.f36952k0 = lowerCase;
                s71[] s71VarArr = m5Var2.f36960r0;
                s71 s71Var = s71VarArr[1];
                if (s71Var != null) {
                    m5.U0(s71Var, true);
                    s71VarArr[1].v0(0);
                    s71VarArr[1].post(new o3(m5Var2, 6));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                m5 m5Var3 = this.f37400b;
                if (m5Var3.A0 != floatValue) {
                    m5Var3.A0 = floatValue;
                    float v = org.telegram.ui.d3.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i10 = 0;
                    for (int i11 = 0; i11 < m5Var3.f36972z0.getChildCount(); i11++) {
                        View childAt = m5Var3.f36972z0.getChildAt(i11);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    za1 za1Var = m5Var3.f36972z0;
                    if (floatValue != 0.0f) {
                        i10 = 4;
                    }
                    za1Var.setImportantForAccessibility(i10);
                    m5Var3.f36972z0.requestLayout();
                    return;
                }
                return;
            case 3:
                m5.f0(this.f37400b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                m5 m5Var4 = this.f37400b;
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
