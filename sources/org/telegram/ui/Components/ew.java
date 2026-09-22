package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class ew implements Runnable {
    public final int f24048a;
    public final kz f24049b;

    public ew(kz kzVar, int i10) {
        this.f24048a = i10;
        this.f24049b = kzVar;
    }

    @Override
    public final void run() {
        switch (this.f24048a) {
            case 0:
                kz kzVar = this.f24049b;
                kzVar.X(false);
                kzVar.D();
                return;
            case 1:
                tx txVar = this.f24049b.R;
                if (txVar != null) {
                    txVar.F(true);
                    return;
                }
                return;
            case 2:
                kz kzVar2 = this.f24049b;
                ly lyVar = kzVar2.f25911t1;
                if (lyVar != null) {
                    lyVar.t(kzVar2.R.h);
                    return;
                }
                return;
            case 3:
                ly lyVar2 = this.f24049b.f25911t1;
                if (lyVar2 != null) {
                    lyVar2.q();
                    return;
                }
                return;
            case 4:
                kz kzVar3 = this.f24049b;
                kzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(kzVar3.f25858c1).getClientUserId());
                kzVar3.Y1.presentFragment(new org.telegram.ui.zn(bundle));
                return;
            default:
                kz kzVar4 = this.f24049b;
                ArrayList<xx> emojipacks = kzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f30426i) {
                        int i11 = kzVar4.R.f28550s.get(EmojiData.dataColored.length + i10);
                        kzVar4.P.C0();
                        kzVar4.U(i11);
                        kzVar4.F(i11, AndroidUtilities.dp(-9.0f));
                        kzVar4.n(0, null);
                    }
                }
                return;
        }
    }
}
