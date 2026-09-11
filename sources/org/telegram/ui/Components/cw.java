package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class cw implements Runnable {
    public final int f25098a;
    public final kz f25099b;

    public cw(kz kzVar, int i10) {
        this.f25098a = i10;
        this.f25099b = kzVar;
    }

    @Override
    public final void run() {
        switch (this.f25098a) {
            case 0:
                kz kzVar = this.f25099b;
                kzVar.Z(false);
                kzVar.G();
                return;
            case 1:
                kz kzVar2 = this.f25099b;
                kzVar2.P.postOnAnimation(new cw(kzVar2, 6));
                return;
            case 2:
                tx txVar = this.f25099b.R;
                if (txVar != null) {
                    txVar.F(true);
                    return;
                }
                return;
            case 3:
                kz kzVar3 = this.f25099b;
                kzVar3.f27948h0.postOnAnimation(new cw(kzVar3, 6));
                return;
            case 4:
                kz kzVar4 = this.f25099b;
                kzVar4.D0.postOnAnimation(new cw(kzVar4, 6));
                return;
            case 5:
                kz kzVar5 = this.f25099b;
                ly lyVar = kzVar5.f27986t1;
                if (lyVar != null) {
                    lyVar.t(kzVar5.R.h);
                    return;
                }
                return;
            case 6:
                this.f25099b.C();
                return;
            case 7:
                ly lyVar2 = this.f25099b.f27986t1;
                if (lyVar2 != null) {
                    lyVar2.q();
                    return;
                }
                return;
            case 8:
                kz kzVar6 = this.f25099b;
                kzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(kzVar6.f27932c1).getClientUserId());
                kzVar6.Y1.presentFragment(new org.telegram.ui.co(bundle));
                return;
            default:
                kz kzVar7 = this.f25099b;
                ArrayList<xx> emojipacks = kzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f32769i) {
                        int i11 = kzVar7.R.f30729s.get(EmojiData.dataColored.length + i10);
                        kzVar7.P.B0();
                        kzVar7.W(i11);
                        kzVar7.I(i11, AndroidUtilities.dp(-9.0f));
                        kzVar7.n(null, 0);
                    }
                }
                return;
        }
    }
}
