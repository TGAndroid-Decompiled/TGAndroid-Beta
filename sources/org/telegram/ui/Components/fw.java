package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class fw implements Runnable {
    public final int f24317a;
    public final mz f24318b;

    public fw(mz mzVar, int i10) {
        this.f24317a = i10;
        this.f24318b = mzVar;
    }

    @Override
    public final void run() {
        switch (this.f24317a) {
            case 0:
                mz mzVar = this.f24318b;
                mzVar.X(false);
                mzVar.E();
                return;
            case 1:
                vx vxVar = this.f24318b.R;
                if (vxVar != null) {
                    vxVar.F(true);
                    return;
                }
                return;
            case 2:
                mz mzVar2 = this.f24318b;
                ny nyVar = mzVar2.f26601t1;
                if (nyVar != null) {
                    nyVar.t(mzVar2.R.h);
                    return;
                }
                return;
            case 3:
                ny nyVar2 = this.f24318b.f26601t1;
                if (nyVar2 != null) {
                    nyVar2.q();
                    return;
                }
                return;
            case 4:
                mz mzVar3 = this.f24318b;
                mzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(mzVar3.f26548c1).getClientUserId());
                mzVar3.Y1.presentFragment(new org.telegram.ui.wn(bundle));
                return;
            default:
                mz mzVar4 = this.f24318b;
                ArrayList<zx> emojipacks = mzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f30996i) {
                        int i11 = mzVar4.R.f29782s.get(EmojiData.dataColored.length + i10);
                        mzVar4.P.B0();
                        mzVar4.U(i11);
                        mzVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        mzVar4.n(0, null);
                    }
                }
                return;
        }
    }
}
