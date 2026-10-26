package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class lw implements Runnable {
    public final int f30300a;
    public final sz f30301b;

    public lw(sz szVar, int i10) {
        this.f30300a = i10;
        this.f30301b = szVar;
    }

    @Override
    public final void run() {
        switch (this.f30300a) {
            case 0:
                sz szVar = this.f30301b;
                szVar.X(false);
                szVar.D();
                return;
            case 1:
                zx zxVar = this.f30301b.R;
                if (zxVar != null) {
                    zxVar.F(true);
                    return;
                }
                return;
            case 2:
                sz szVar2 = this.f30301b;
                ty tyVar = szVar2.f32772t1;
                if (tyVar != null) {
                    tyVar.t(szVar2.R.h);
                    return;
                }
                return;
            case 3:
                ty tyVar2 = this.f30301b.f32772t1;
                if (tyVar2 != null) {
                    tyVar2.q();
                    return;
                }
                return;
            case 4:
                sz szVar3 = this.f30301b;
                szVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(szVar3.f32719c1).getClientUserId());
                szVar3.Y1.presentFragment(new org.telegram.ui.un(bundle));
                return;
            default:
                sz szVar4 = this.f30301b;
                ArrayList<ey> emojipacks = szVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f28012i) {
                        int i11 = szVar4.R.f35431s.get(EmojiData.dataColored.length + i10);
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
