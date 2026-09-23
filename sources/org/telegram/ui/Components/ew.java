package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class ew implements Runnable {
    public final int f23753a;
    public final lz f23754b;

    public ew(lz lzVar, int i10) {
        this.f23753a = i10;
        this.f23754b = lzVar;
    }

    @Override
    public final void run() {
        switch (this.f23753a) {
            case 0:
                lz lzVar = this.f23754b;
                lzVar.X(false);
                lzVar.E();
                return;
            case 1:
                tx txVar = this.f23754b.R;
                if (txVar != null) {
                    txVar.F(true);
                    return;
                }
                return;
            case 2:
                lz lzVar2 = this.f23754b;
                ly lyVar = lzVar2.f26021t1;
                if (lyVar != null) {
                    lyVar.t(lzVar2.R.h);
                    return;
                }
                return;
            case 3:
                ly lyVar2 = this.f23754b.f26021t1;
                if (lyVar2 != null) {
                    lyVar2.q();
                    return;
                }
                return;
            case 4:
                lz lzVar3 = this.f23754b;
                lzVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(lzVar3.f25968c1).getClientUserId());
                lzVar3.Y1.presentFragment(new org.telegram.ui.xn(bundle));
                return;
            default:
                lz lzVar4 = this.f23754b;
                ArrayList<xx> emojipacks = lzVar4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f30092i) {
                        int i11 = lzVar4.R.f28327s.get(EmojiData.dataColored.length + i10);
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
