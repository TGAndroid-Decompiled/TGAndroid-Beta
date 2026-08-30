package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class yv implements Runnable {
    public final int f31162a;
    public final kz f31163b;

    public yv(kz kzVar, int i10) {
        this.f31162a = i10;
        this.f31163b = kzVar;
    }

    @Override
    public final void run() {
        switch (this.f31162a) {
            case 0:
                kz kzVar = this.f31163b;
                kzVar.Z(false);
                kzVar.F();
                return;
            case 1:
                kz kzVar2 = this.f31163b;
                kzVar2.M.postOnAnimation(new yv(kzVar2, 6));
                return;
            case 2:
                rx rxVar = this.f31163b.O;
                if (rxVar != null) {
                    rxVar.F(true);
                    return;
                }
                return;
            case 3:
                kz kzVar3 = this.f31163b;
                kzVar3.f26423e0.postOnAnimation(new yv(kzVar3, 6));
                return;
            case 4:
                kz kzVar4 = this.f31163b;
                kzVar4.A0.postOnAnimation(new yv(kzVar4, 6));
                return;
            case 5:
                kz kzVar5 = this.f31163b;
                ky kyVar = kzVar5.f26460q1;
                if (kyVar != null) {
                    kyVar.t(kzVar5.O.h);
                    return;
                }
                return;
            case 6:
                this.f31163b.C();
                return;
            case 7:
                ky kyVar2 = this.f31163b.f26460q1;
                if (kyVar2 != null) {
                    kyVar2.q();
                    return;
                }
                return;
            case 8:
                kz kzVar6 = this.f31163b;
                kzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(kzVar6.Z0).getClientUserId());
                kzVar6.V1.presentFragment(new org.telegram.ui.xn(bundle));
                return;
            default:
                kz kzVar7 = this.f31163b;
                ArrayList<vx> emojipacks = kzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f30104i) {
                        int i11 = kzVar7.O.f28552s.get(EmojiData.dataColored.length + i10);
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
