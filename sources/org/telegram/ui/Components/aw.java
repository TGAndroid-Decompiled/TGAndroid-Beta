package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class aw implements Runnable {
    public final int f25377a;
    public final mz f25378b;

    public aw(mz mzVar, int i10) {
        this.f25377a = i10;
        this.f25378b = mzVar;
    }

    @Override
    public final void run() {
        switch (this.f25377a) {
            case 0:
                mz mzVar = this.f25378b;
                mzVar.Z(false);
                mzVar.F();
                return;
            case 1:
                mz mzVar2 = this.f25378b;
                mzVar2.M.postOnAnimation(new aw(mzVar2, 6));
                return;
            case 2:
                tx txVar = this.f25378b.O;
                if (txVar != null) {
                    txVar.F(true);
                    return;
                }
                return;
            case 3:
                mz mzVar3 = this.f25378b;
                mzVar3.f29280e0.postOnAnimation(new aw(mzVar3, 6));
                return;
            case 4:
                mz mzVar4 = this.f25378b;
                mzVar4.A0.postOnAnimation(new aw(mzVar4, 6));
                return;
            case 5:
                mz mzVar5 = this.f25378b;
                my myVar = mzVar5.f29317q1;
                if (myVar != null) {
                    myVar.t(mzVar5.O.h);
                    return;
                }
                return;
            case 6:
                this.f25378b.C();
                return;
            case 7:
                my myVar2 = this.f25378b.f29317q1;
                if (myVar2 != null) {
                    myVar2.q();
                    return;
                }
                return;
            case 8:
                mz mzVar6 = this.f25378b;
                mzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(mzVar6.Z0).getClientUserId());
                mzVar6.V1.presentFragment(new org.telegram.ui.xn(bundle));
                return;
            default:
                mz mzVar7 = this.f25378b;
                ArrayList<xx> emojipacks = mzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f33217i) {
                        int i11 = mzVar7.O.f31430s.get(EmojiData.dataColored.length + i10);
                        mzVar7.M.B0();
                        mzVar7.W(i11);
                        mzVar7.H(i11, AndroidUtilities.dp(-9.0f));
                        mzVar7.n(null, 0);
                    }
                }
                return;
        }
    }
}
