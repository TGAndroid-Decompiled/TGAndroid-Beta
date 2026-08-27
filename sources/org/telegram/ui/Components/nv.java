package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;

public final class nv implements Runnable {

    public final int f31035a;

    public final yy f31036b;

    public nv(yy yyVar, int i10) {
        this.f31035a = i10;
        this.f31036b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f31035a) {
            case 0:
                yy yyVar = this.f31036b;
                yyVar.Z(false);
                yyVar.G();
                break;
            case 1:
                yy yyVar2 = this.f31036b;
                yyVar2.L.postOnAnimation(new nv(yyVar2, 6));
                break;
            case 2:
                gx gxVar = this.f31036b.N;
                if (gxVar != null) {
                    gxVar.F(true);
                }
                break;
            case 3:
                yy yyVar3 = this.f31036b;
                yyVar3.f34987d0.postOnAnimation(new nv(yyVar3, 6));
                break;
            case 4:
                yy yyVar4 = this.f31036b;
                yyVar4.f35059z0.postOnAnimation(new nv(yyVar4, 6));
                break;
            case 5:
                yy yyVar5 = this.f31036b;
                xx xxVar = yyVar5.f35025p1;
                if (xxVar != null) {
                    xxVar.t(yyVar5.N.h);
                }
                break;
            case 6:
                this.f31036b.D();
                break;
            case 7:
                xx xxVar2 = this.f31036b.f35025p1;
                if (xxVar2 != null) {
                    xxVar2.q();
                }
                break;
            case 8:
                yy yyVar6 = this.f31036b;
                yyVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(yyVar6.Y0).getClientUserId());
                yyVar6.U1.presentFragment(new uw(bundle));
                break;
            default:
                yy yyVar7 = this.f31036b;
                ArrayList<kx> emojipacks = yyVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f30210i) {
                        int i11 = yyVar7.N.f28860s.get(EmojiData.dataColored.length + i10);
                        yyVar7.L.B0();
                        yyVar7.W(i11);
                        yyVar7.I(i11, AndroidUtilities.dp(-9.0f));
                        yyVar7.n(null, 0);
                    }
                }
                break;
        }
    }
}
