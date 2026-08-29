package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class uv implements Runnable {
    public final int f33323a;
    public final fz f33324b;

    public uv(fz fzVar, int i10) {
        this.f33323a = i10;
        this.f33324b = fzVar;
    }

    @Override
    public final void run() {
        switch (this.f33323a) {
            case 0:
                fz fzVar = this.f33324b;
                fzVar.Z(false);
                fzVar.F();
                return;
            case 1:
                fz fzVar2 = this.f33324b;
                fzVar2.L.postOnAnimation(new uv(fzVar2, 6));
                return;
            case 2:
                nx nxVar = this.f33324b.N;
                if (nxVar != null) {
                    nxVar.F(true);
                    return;
                }
                return;
            case 3:
                fz fzVar3 = this.f33324b;
                fzVar3.f28585d0.postOnAnimation(new uv(fzVar3, 6));
                return;
            case 4:
                fz fzVar4 = this.f33324b;
                fzVar4.f28657z0.postOnAnimation(new uv(fzVar4, 6));
                return;
            case 5:
                fz fzVar5 = this.f33324b;
                fy fyVar = fzVar5.f28623p1;
                if (fyVar != null) {
                    fyVar.t(fzVar5.N.h);
                    return;
                }
                return;
            case 6:
                this.f33324b.C();
                return;
            case 7:
                fy fyVar2 = this.f33324b.f28623p1;
                if (fyVar2 != null) {
                    fyVar2.q();
                    return;
                }
                return;
            case 8:
                fz fzVar6 = this.f33324b;
                fzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(fzVar6.Y0).getClientUserId());
                fzVar6.U1.presentFragment(new org.telegram.ui.tn(bundle));
                return;
            default:
                fz fzVar7 = this.f33324b;
                ArrayList<rx> emojipacks = fzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f32407i) {
                        int i11 = fzVar7.N.f31163s.get(EmojiData.dataColored.length + i10);
                        fzVar7.L.B0();
                        fzVar7.W(i11);
                        fzVar7.H(i11, AndroidUtilities.dp(-9.0f));
                        fzVar7.n(null, 0);
                    }
                }
                return;
        }
    }
}
