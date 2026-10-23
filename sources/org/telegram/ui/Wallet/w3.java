package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c71;
import org.telegram.ui.qa1;
public final class w3 implements Utilities.Callback {
    public final int f35066a;
    public final o5 f35067b;

    public w3(o5 o5Var, int i10) {
        this.f35066a = i10;
        this.f35067b = o5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35066a) {
            case 0:
                Boolean bool = (Boolean) obj;
                o5 o5Var = this.f35067b;
                o5Var.A0.setClickable(!bool.booleanValue());
                o5Var.B0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    o5Var.f34649d0 = 1;
                    o5Var.f34661o0.setPosition(1);
                    o5Var.f34661o0.post(new p3(o5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                o5 o5Var2 = this.f35067b;
                o5Var2.f34656j0 = lowerCase;
                c71[] c71VarArr = o5Var2.f34663q0;
                c71 c71Var = c71VarArr[1];
                if (c71Var != null) {
                    o5.S0(c71Var, true);
                    c71VarArr[1].u0(0);
                    c71VarArr[1].post(new p3(o5Var2, 6));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                o5 o5Var3 = this.f35067b;
                if (o5Var3.f34677z0 != floatValue) {
                    o5Var3.f34677z0 = floatValue;
                    float v = org.telegram.ui.Cells.c1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i10 = 0;
                    for (int i11 = 0; i11 < o5Var3.f34676y0.getChildCount(); i11++) {
                        View childAt = o5Var3.f34676y0.getChildAt(i11);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    qa1 qa1Var = o5Var3.f34676y0;
                    if (floatValue != 0.0f) {
                        i10 = 4;
                    }
                    qa1Var.setImportantForAccessibility(i10);
                    o5Var3.f34676y0.requestLayout();
                    return;
                }
                return;
            case 3:
                o5.e0(this.f35067b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                o5 o5Var4 = this.f35067b;
                if (!o5Var4.isFinished) {
                    if (user == null) {
                        AndroidUtilities.runOnUIThread(new p3(o5Var4, 11));
                        return;
                    } else {
                        o5Var4.presentFragment(new i9(user));
                        return;
                    }
                }
                return;
        }
    }
}
