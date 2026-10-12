package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class pw implements Runnable {
    public final int f28434a;
    public final wz f28435b;

    public pw(wz wzVar, int i10) {
        this.f28434a = i10;
        this.f28435b = wzVar;
    }

    @Override
    public final void run() {
        switch (this.f28434a) {
            case 0:
                wz wzVar = this.f28435b;
                wzVar.X(false);
                wzVar.E();
                return;
            case 1:
                fy fyVar = this.f28435b.R;
                if (fyVar != null) {
                    fyVar.F(true);
                    return;
                }
                return;
            case 2:
                wz wzVar2 = this.f28435b;
                wy wyVar = wzVar2.f31067t1;
                if (wyVar != null) {
                    wyVar.t(wzVar2.R.h);
                    return;
                }
                return;
            case 3:
                wy wyVar2 = this.f28435b.f31067t1;
                if (wyVar2 != null) {
                    wyVar2.q();
                    return;
                }
                return;
            case 4:
                wz wzVar3 = this.f28435b;
                wzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(wzVar3.f31014c1).getClientUserId());
                wzVar3.Y1.presentFragment(new org.telegram.ui.fo(bundle));
                return;
            default:
                wz wzVar4 = this.f28435b;
                ArrayList<jy> emojipacks = wzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f26518i) {
                        int i11 = wzVar4.R.f25138s.get(EmojiData.dataColored.length + i10);
                        wzVar4.P.B0();
                        wzVar4.U(i11);
                        wzVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        wzVar4.n(0, null);
                    }
                }
                return;
        }
    }
}
