package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class lw implements Runnable {
    public final int f30298a;
    public final sz f30299b;

    public lw(sz szVar, int i10) {
        this.f30298a = i10;
        this.f30299b = szVar;
    }

    @Override
    public final void run() {
        switch (this.f30298a) {
            case 0:
                sz szVar = this.f30299b;
                szVar.X(false);
                szVar.D();
                return;
            case 1:
                zx zxVar = this.f30299b.R;
                if (zxVar != null) {
                    zxVar.F(true);
                    return;
                }
                return;
            case 2:
                sz szVar2 = this.f30299b;
                ty tyVar = szVar2.f32769t1;
                if (tyVar != null) {
                    tyVar.t(szVar2.R.h);
                    return;
                }
                return;
            case 3:
                ty tyVar2 = this.f30299b.f32769t1;
                if (tyVar2 != null) {
                    tyVar2.q();
                    return;
                }
                return;
            case 4:
                sz szVar3 = this.f30299b;
                szVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(szVar3.f32716c1).getClientUserId());
                szVar3.Y1.presentFragment(new org.telegram.ui.un(bundle));
                return;
            default:
                sz szVar4 = this.f30299b;
                ArrayList<ey> emojipacks = szVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f28010i) {
                        int i11 = szVar4.R.f35428s.get(EmojiData.dataColored.length + i10);
                        szVar4.P.C0();
                        szVar4.U(i11);
                        szVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        szVar4.n(0, null);
                    }
                }
                return;
        }
    }
}
