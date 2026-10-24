package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class jw implements Runnable {
    public final int f27804a;
    public final rz f27805b;

    public jw(rz rzVar, int i10) {
        this.f27804a = i10;
        this.f27805b = rzVar;
    }

    @Override
    public final void run() {
        switch (this.f27804a) {
            case 0:
                rz rzVar = this.f27805b;
                rzVar.X(false);
                rzVar.D();
                return;
            case 1:
                yx yxVar = this.f27805b.R;
                if (yxVar != null) {
                    yxVar.F(true);
                    return;
                }
                return;
            case 2:
                rz rzVar2 = this.f27805b;
                sy syVar = rzVar2.f30363t1;
                if (syVar != null) {
                    syVar.t(rzVar2.R.h);
                    return;
                }
                return;
            case 3:
                sy syVar2 = this.f27805b.f30363t1;
                if (syVar2 != null) {
                    syVar2.q();
                    return;
                }
                return;
            case 4:
                rz rzVar3 = this.f27805b;
                rzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(rzVar3.f30310c1).getClientUserId());
                rzVar3.Y1.presentFragment(new org.telegram.ui.sn(bundle));
                return;
            default:
                rz rzVar4 = this.f27805b;
                ArrayList<dy> emojipacks = rzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f25860i) {
                        int i11 = rzVar4.R.f33074s.get(EmojiData.dataColored.length + i10);
                        rzVar4.P.B0();
                        rzVar4.U(i11);
                        rzVar4.F(i11, AndroidUtilities.dp(-9.0f));
                        rzVar4.n(0, null);
                    }
                }
                return;
        }
    }
}
