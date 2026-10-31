package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u51;
import org.telegram.ui.u71;
public final class m4 implements q20 {
    public final int f34899a;
    public final b6 f34900b;

    public m4(b6 b6Var, int i10) {
        this.f34899a = i10;
        this.f34900b = b6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f34899a) {
            case 0:
                Boolean bool = (Boolean) obj;
                b6 b6Var = this.f34900b;
                b6Var.B0.setClickable(!bool.booleanValue());
                b6Var.C0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    b6Var.f34245e0 = 1;
                    b6Var.f34257p0.setPosition(1);
                    b6Var.f34257p0.post(new f4(b6Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                b6 b6Var2 = this.f34900b;
                b6Var2.f34252k0 = lowerCase;
                u51[] u51VarArr = b6Var2.f34260r0;
                u51 u51Var = u51VarArr[1];
                if (u51Var != null) {
                    b6.X0(u51Var, true);
                    u51VarArr[1].v0(0);
                    u51VarArr[1].post(new f4(b6Var2, 6));
                    return;
                }
                return;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                b6 b6Var3 = this.f34900b;
                if (b6Var3.A0 != floatValue) {
                    b6Var3.A0 = floatValue;
                    float v = org.telegram.ui.Cells.f1.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i10 = 0;
                    for (int i11 = 0; i11 < b6Var3.f34272z0.getChildCount(); i11++) {
                        View childAt = b6Var3.f34272z0.getChildAt(i11);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    u71 u71Var = b6Var3.f34272z0;
                    if (floatValue != 0.0f) {
                        i10 = 4;
                    }
                    u71Var.setImportantForAccessibility(i10);
                    b6Var3.f34272z0.requestLayout();
                    return;
                }
                return;
            case 3:
                b6.i0(this.f34900b, (String) obj);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                b6 b6Var4 = this.f34900b;
                if (!b6Var4.isFinished) {
                    if (user == null) {
                        org.telegram.messenger.i0.g3(new f4(b6Var4, 11));
                        return;
                    } else {
                        b6Var4.presentFragment(new r9(user));
                        return;
                    }
                }
                return;
        }
    }
}
