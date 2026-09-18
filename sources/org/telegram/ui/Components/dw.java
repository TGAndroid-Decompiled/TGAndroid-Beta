package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class dw implements Runnable {
    public final int f23397a;
    public final kz f23398b;

    public dw(kz kzVar, int i10) {
        this.f23397a = i10;
        this.f23398b = kzVar;
    }

    @Override
    public final void run() {
        switch (this.f23397a) {
            case 0:
                kz kzVar = this.f23398b;
                kzVar.X(false);
                kzVar.E();
                return;
            case 1:
                sx sxVar = this.f23398b.R;
                if (sxVar != null) {
                    sxVar.F(true);
                    return;
                }
                return;
            case 2:
                kz kzVar2 = this.f23398b;
                ky kyVar = kzVar2.f25769t1;
                if (kyVar != null) {
                    kyVar.t(kzVar2.R.h);
                    return;
                }
                return;
            case 3:
                ky kyVar2 = this.f23398b.f25769t1;
                if (kyVar2 != null) {
                    kyVar2.q();
                    return;
                }
                return;
            case 4:
                kz kzVar3 = this.f23398b;
                kzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(kzVar3.f25716c1).getClientUserId());
                kzVar3.Y1.presentFragment(new org.telegram.ui.bo(bundle));
                return;
            default:
                kz kzVar4 = this.f23398b;
                ArrayList<wx> emojipacks = kzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f29766i) {
                        int i11 = kzVar4.R.f27949s.get(EmojiData.dataColored.length + i10);
                        kzVar4.P.C0();
                        kzVar4.U(i11);
                        kzVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        kzVar4.n(0, null);
                    }
                }
                return;
        }
    }
}
