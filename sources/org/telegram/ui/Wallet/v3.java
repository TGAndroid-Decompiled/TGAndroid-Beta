package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j71;
import org.telegram.ui.va1;
public final class v3 implements Utilities.Callback {
    public final int f35319a;
    public final o5 f35320b;

    public v3(o5 o5Var, int i10) {
        this.f35319a = i10;
        this.f35320b = o5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35319a) {
            case 0:
                Boolean bool = (Boolean) obj;
                o5 o5Var = this.f35320b;
                o5Var.A0.setClickable(!bool.booleanValue());
                o5Var.B0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    o5Var.f34936d0 = 1;
                    o5Var.f34948o0.setPosition(1);
                    o5Var.f34948o0.post(new o3(o5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                o5 o5Var2 = this.f35320b;
                o5Var2.f34943j0 = lowerCase;
                j71[] j71VarArr = o5Var2.f34950q0;
                j71 j71Var = j71VarArr[1];
                if (j71Var != null) {
                    o5.T0(j71Var, true);
                    j71VarArr[1].u0(0);
                    j71VarArr[1].post(new o3(o5Var2, 6));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                o5 o5Var3 = this.f35320b;
                if (o5Var3.f34964z0 != floatValue) {
                    o5Var3.f34964z0 = floatValue;
                    float t10 = org.telegram.ui.Cells.b1.t(floatValue, 0.6f, 1.0f, 0.0f);
                    int i10 = 0;
                    for (int i11 = 0; i11 < o5Var3.f34963y0.getChildCount(); i11++) {
                        View childAt = o5Var3.f34963y0.getChildAt(i11);
                        childAt.setAlpha(t10);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    va1 va1Var = o5Var3.f34963y0;
                    if (floatValue != 0.0f) {
                        i10 = 4;
                    }
                    va1Var.setImportantForAccessibility(i10);
                    o5Var3.f34963y0.requestLayout();
                    return;
                }
                return;
            case 3:
                o5.e0(this.f35320b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                o5 o5Var4 = this.f35320b;
                if (!o5Var4.isFinished) {
                    if (user == null) {
                        AndroidUtilities.runOnUIThread(new o3(o5Var4, 11));
                        return;
                    } else {
                        o5Var4.presentFragment(new j9(user));
                        return;
                    }
                }
                return;
        }
    }
}
