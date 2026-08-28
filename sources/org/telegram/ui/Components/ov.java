package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class ov implements Runnable {
    public final int f31447a;
    public final wy f31448b;

    public ov(wy wyVar, int i9) {
        this.f31447a = i9;
        this.f31448b = wyVar;
    }

    @Override
    public final void run() {
        switch (this.f31447a) {
            case 0:
                wy wyVar = this.f31448b;
                wyVar.Y(false);
                wyVar.F();
                return;
            case 1:
                wy wyVar2 = this.f31448b;
                wyVar2.L.postOnAnimation(new ov(wyVar2, 6));
                return;
            case 2:
                fx fxVar = this.f31448b.N;
                if (fxVar != null) {
                    fxVar.F(true);
                    return;
                }
                return;
            case 3:
                wy wyVar3 = this.f31448b;
                wyVar3.f34394d0.postOnAnimation(new ov(wyVar3, 6));
                return;
            case 4:
                wy wyVar4 = this.f31448b;
                wyVar4.f34466z0.postOnAnimation(new ov(wyVar4, 6));
                return;
            case 5:
                wy wyVar5 = this.f31448b;
                wx wxVar = wyVar5.f34432p1;
                if (wxVar != null) {
                    wxVar.t(wyVar5.N.h);
                    return;
                }
                return;
            case 6:
                this.f31448b.C();
                return;
            case 7:
                wx wxVar2 = this.f31448b.f34432p1;
                if (wxVar2 != null) {
                    wxVar2.q();
                    return;
                }
                return;
            case 8:
                wy wyVar6 = this.f31448b;
                wyVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(wyVar6.Y0).getClientUserId());
                wyVar6.U1.presentFragment(new org.telegram.ui.qn(bundle));
                return;
            default:
                wy wyVar7 = this.f31448b;
                ArrayList<jx> emojipacks = wyVar7.getEmojipacks();
                for (int i9 = 0; i9 < emojipacks.size(); i9++) {
                    if (emojipacks.get(i9).f29870i) {
                        int i10 = wyVar7.N.f28593s.get(EmojiData.dataColored.length + i9);
                        wyVar7.L.B0();
                        wyVar7.V(i10);
                        wyVar7.H(i10, AndroidUtilities.dp(-9.0f));
                        wyVar7.n(null, 0);
                    }
                }
                return;
        }
    }
}
