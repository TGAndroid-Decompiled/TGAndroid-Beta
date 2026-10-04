package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class hw implements Runnable {
    public final int f27255a;
    public final nz f27256b;

    public hw(nz nzVar, int i10) {
        this.f27255a = i10;
        this.f27256b = nzVar;
    }

    @Override
    public final void run() {
        switch (this.f27255a) {
            case 0:
                nz nzVar = this.f27256b;
                nzVar.W(false);
                nzVar.C();
                return;
            case 1:
                wx wxVar = this.f27256b.R;
                if (wxVar != null) {
                    wxVar.F(true);
                    return;
                }
                return;
            case 2:
                nz nzVar2 = this.f27256b;
                oy oyVar = nzVar2.f29151t1;
                if (oyVar != null) {
                    oyVar.t(nzVar2.R.h);
                    return;
                }
                return;
            case 3:
                oy oyVar2 = this.f27256b.f29151t1;
                if (oyVar2 != null) {
                    oyVar2.q();
                    return;
                }
                return;
            case 4:
                nz nzVar3 = this.f27256b;
                nzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(nzVar3.f29097c1).getClientUserId());
                nzVar3.Y1.presentFragment(new org.telegram.ui.yn(bundle));
                return;
            default:
                nz nzVar4 = this.f27256b;
                ArrayList<ay> emojipacks = nzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f24713i) {
                        int i11 = nzVar4.R.f32662s.get(EmojiData.dataColored.length + i10);
                        nzVar4.P.C0();
                        nzVar4.S(i11);
                        nzVar4.E(i11, AndroidUtilities.dp(-9.0f));
                        nzVar4.n(0, null);
                    }
                }
                return;
        }
    }
}
