package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class xv implements Runnable {
    public final int f30720a;
    public final kz f30721b;

    public xv(kz kzVar, int i10) {
        this.f30720a = i10;
        this.f30721b = kzVar;
    }

    @Override
    public final void run() {
        switch (this.f30720a) {
            case 0:
                kz kzVar = this.f30721b;
                kzVar.Z(false);
                kzVar.F();
                return;
            case 1:
                kz kzVar2 = this.f30721b;
                kzVar2.M.postOnAnimation(new xv(kzVar2, 6));
                return;
            case 2:
                rx rxVar = this.f30721b.O;
                if (rxVar != null) {
                    rxVar.F(true);
                    return;
                }
                return;
            case 3:
                kz kzVar3 = this.f30721b;
                kzVar3.f26435e0.postOnAnimation(new xv(kzVar3, 6));
                return;
            case 4:
                kz kzVar4 = this.f30721b;
                kzVar4.A0.postOnAnimation(new xv(kzVar4, 6));
                return;
            case 5:
                kz kzVar5 = this.f30721b;
                ky kyVar = kzVar5.f26472q1;
                if (kyVar != null) {
                    kyVar.t(kzVar5.O.h);
                    return;
                }
                return;
            case 6:
                this.f30721b.C();
                return;
            case 7:
                ky kyVar2 = this.f30721b.f26472q1;
                if (kyVar2 != null) {
                    kyVar2.q();
                    return;
                }
                return;
            case 8:
                kz kzVar6 = this.f30721b;
                kzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(kzVar6.Z0).getClientUserId());
                kzVar6.V1.presentFragment(new org.telegram.ui.zn(bundle));
                return;
            default:
                kz kzVar7 = this.f30721b;
                ArrayList<vx> emojipacks = kzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f30068i) {
                        int i11 = kzVar7.O.f28601s.get(EmojiData.dataColored.length + i10);
                        kzVar7.M.B0();
                        kzVar7.W(i11);
                        kzVar7.H(i11, AndroidUtilities.dp(-9.0f));
                        kzVar7.n(null, 0);
                    }
                }
                return;
        }
    }
}
