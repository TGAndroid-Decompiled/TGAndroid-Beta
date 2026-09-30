package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class gw implements Runnable {
    public final int f24680a;
    public final nz f24681b;

    public gw(nz nzVar, int i10) {
        this.f24680a = i10;
        this.f24681b = nzVar;
    }

    @Override
    public final void run() {
        switch (this.f24680a) {
            case 0:
                nz nzVar = this.f24681b;
                nzVar.X(false);
                nzVar.E();
                return;
            case 1:
                wx wxVar = this.f24681b.R;
                if (wxVar != null) {
                    wxVar.F(true);
                    return;
                }
                return;
            case 2:
                nz nzVar2 = this.f24681b;
                oy oyVar = nzVar2.f26871t1;
                if (oyVar != null) {
                    oyVar.t(nzVar2.R.h);
                    return;
                }
                return;
            case 3:
                oy oyVar2 = this.f24681b.f26871t1;
                if (oyVar2 != null) {
                    oyVar2.q();
                    return;
                }
                return;
            case 4:
                nz nzVar3 = this.f24681b;
                nzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(nzVar3.f26818c1).getClientUserId());
                nzVar3.Y1.presentFragment(new org.telegram.ui.wn(bundle));
                return;
            default:
                nz nzVar4 = this.f24681b;
                ArrayList<ay> emojipacks = nzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f22729i) {
                        int i11 = nzVar4.R.f30079s.get(EmojiData.dataColored.length + i10);
                        nzVar4.P.C0();
                        nzVar4.U(i11);
                        nzVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        nzVar4.n(0, null);
                    }
                }
                return;
        }
    }
}
