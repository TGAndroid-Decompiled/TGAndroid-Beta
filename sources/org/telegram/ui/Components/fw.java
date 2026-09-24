package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class fw implements Runnable {
    public final int f24263a;
    public final lz f24264b;

    public fw(lz lzVar, int i10) {
        this.f24263a = i10;
        this.f24264b = lzVar;
    }

    @Override
    public final void run() {
        switch (this.f24263a) {
            case 0:
                lz lzVar = this.f24264b;
                lzVar.X(false);
                lzVar.E();
                return;
            case 1:
                ux uxVar = this.f24264b.R;
                if (uxVar != null) {
                    uxVar.F(true);
                    return;
                }
                return;
            case 2:
                lz lzVar2 = this.f24264b;
                my myVar = lzVar2.f26282t1;
                if (myVar != null) {
                    myVar.t(lzVar2.R.h);
                    return;
                }
                return;
            case 3:
                my myVar2 = this.f24264b.f26282t1;
                if (myVar2 != null) {
                    myVar2.q();
                    return;
                }
                return;
            case 4:
                lz lzVar3 = this.f24264b;
                lzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(lzVar3.f26229c1).getClientUserId());
                lzVar3.Y1.presentFragment(new org.telegram.ui.wn(bundle));
                return;
            default:
                lz lzVar4 = this.f24264b;
                ArrayList<yx> emojipacks = lzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f30709i) {
                        int i11 = lzVar4.R.f28934s.get(EmojiData.dataColored.length + i10);
                        lzVar4.P.B0();
                        lzVar4.U(i11);
                        lzVar4.G(i11, AndroidUtilities.dp(-9.0f));
                        lzVar4.n(0, null);
                    }
                }
                return;
        }
    }
}
