package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public class mg extends ri0 {

    public kg f30672r;

    public lg f30673s;
    public final int v;

    public final hc.f f30674w;

    public mg(Context context) {
        this(context, 32);
    }

    public kg getCurrentState() {
        return this.f30672r;
    }

    public final void j(kg kgVar, boolean z10) {
        kg kgVar2;
        int i10;
        lg lgVar;
        if (z10 && kgVar == this.f30672r) {
            return;
        }
        kg kgVar3 = this.f30672r;
        this.f30672r = kgVar;
        lg lgVar2 = null;
        hc.f fVar = this.f30674w;
        if (!z10 || kgVar3 == null) {
            kgVar2 = this.f30672r;
            for (lg lgVar3 : lg.values()) {
                if (lgVar3.f30372a == kgVar2) {
                    lgVar2 = lgVar3;
                    break;
                }
            }
            oi0 oi0Var = (oi0) fVar.get(lgVar2);
            oi0Var.stop();
            oi0Var.Q(kgVar != kg.f30097a ? 0.0f : 0.5f, false);
            setAnimation(oi0Var);
        } else {
            lg[] lgVarArrValues = lg.values();
            int length = lgVarArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    lgVar = null;
                    break;
                }
                lgVar = lgVarArrValues[i11];
                if (lgVar.f30372a == kgVar3 && lgVar.f30373b == kgVar) {
                    break;
                } else {
                    i11++;
                }
            }
            if (lgVar == null) {
                kgVar2 = this.f30672r;
                while (i10 < r6) {
                    if (lgVar3.f30372a == kgVar2) {
                        lgVar2 = lgVar3;
                        break;
                    }
                }
                oi0 oi0Var2 = (oi0) fVar.get(lgVar2);
                oi0Var2.stop();
                oi0Var2.Q(kgVar != kg.f30097a ? 0.0f : 0.5f, false);
                setAnimation(oi0Var2);
            } else {
                kg kgVar4 = this.f30672r;
                for (lg lgVar4 : lg.values()) {
                    if (lgVar4.f30372a == kgVar3 && lgVar4.f30373b == kgVar4) {
                        lgVar2 = lgVar4;
                        break;
                    }
                }
                if (lgVar2 == this.f30673s) {
                    return;
                }
                this.f30673s = lgVar2;
                oi0 oi0Var3 = (oi0) fVar.get(lgVar2);
                oi0Var3.stop();
                if (lgVar2 == lg.f30370e) {
                    oi0Var3.N(30);
                    oi0Var3.Q(0.0f, false);
                } else if (lgVar2 == lg.d) {
                    oi0Var3.N(60);
                    oi0Var3.Q(0.5f, false);
                } else {
                    oi0Var3.Q(0.0f, false);
                }
                oi0Var3.I(0);
                oi0Var3.f31326q0 = new bg(this, 20);
                setAnimation(oi0Var3);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(oi0Var3, 1));
            }
        }
        int iOrdinal = kgVar.ordinal();
        if (iOrdinal == 0) {
            setContentDescription(LocaleController.getString(R.string.AccDescrVoiceMessage));
        } else {
            if (iOrdinal != 1) {
                return;
            }
            setContentDescription(LocaleController.getString(R.string.AccDescrVideoMessage));
        }
    }

    public mg(Context context, int i10) {
        super(context);
        this.f30674w = new hc.f(this, 1);
        this.v = i10;
    }
}
