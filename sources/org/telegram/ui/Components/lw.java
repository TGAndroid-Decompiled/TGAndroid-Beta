package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class lw implements Runnable {
    public final int f28319a;
    public final tz f28320b;

    public lw(tz tzVar, int i10) {
        this.f28319a = i10;
        this.f28320b = tzVar;
    }

    @Override
    public final void run() {
        switch (this.f28319a) {
            case 0:
                tz tzVar = this.f28320b;
                tzVar.X(false);
                tzVar.D();
                return;
            case 1:
                ay ayVar = this.f28320b.R;
                if (ayVar != null) {
                    ayVar.F(true);
                    return;
                }
                return;
            case 2:
                tz tzVar2 = this.f28320b;
                uy uyVar = tzVar2.f30821t1;
                if (uyVar != null) {
                    uyVar.t(tzVar2.R.h);
                    return;
                }
                return;
            case 3:
                uy uyVar2 = this.f28320b.f30821t1;
                if (uyVar2 != null) {
                    uyVar2.q();
                    return;
                }
                return;
            case 4:
                tz tzVar3 = this.f28320b;
                tzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(tzVar3.f30768c1).getClientUserId());
                tzVar3.Y1.presentFragment(new org.telegram.ui.qn(bundle));
                return;
            default:
                tz tzVar4 = this.f28320b;
                ArrayList<fy> emojipacks = tzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f26398i) {
                        int i11 = tzVar4.R.f24731s.get(EmojiData.dataColored.length + i10);
                        tzVar4.P.B0();
                        tzVar4.U(i11);
                        tzVar4.F(i11, AndroidUtilities.dp(-9.0f));
                        tzVar4.n(0, null);
                    }
                }
                return;
        }
    }
}
