package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class uw implements Runnable {
    public final int f31733a;
    public final b00 f31734b;

    public uw(b00 b00Var, int i10) {
        this.f31733a = i10;
        this.f31734b = b00Var;
    }

    @Override
    public final void run() {
        switch (this.f31733a) {
            case 0:
                b00 b00Var = this.f31734b;
                b00Var.X(false);
                b00Var.E();
                return;
            case 1:
                ky kyVar = this.f31734b.R;
                if (kyVar != null) {
                    kyVar.F(true);
                    return;
                }
                return;
            case 2:
                b00 b00Var2 = this.f31734b;
                bz bzVar = b00Var2.f24785t1;
                if (bzVar != null) {
                    bzVar.t(b00Var2.R.h);
                    return;
                }
                return;
            case 3:
                bz bzVar2 = this.f31734b.f24785t1;
                if (bzVar2 != null) {
                    bzVar2.q();
                    return;
                }
                return;
            case 4:
                b00 b00Var3 = this.f31734b;
                b00Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(b00Var3.f24731c1).getClientUserId());
                b00Var3.Y1.presentFragment(new org.telegram.ui.zn(bundle));
                return;
            default:
                b00 b00Var4 = this.f31734b;
                ArrayList<oy> emojipacks = b00Var4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f29656i) {
                        int i11 = b00Var4.R.f28154s.get(EmojiData.dataColored.length + i10);
                        b00Var4.P.B0();
                        b00Var4.U(i11);
                        b00Var4.G(i11, AndroidUtilities.dp(-9.0f));
                        b00Var4.o(0, null);
                    }
                }
                return;
        }
    }
}
