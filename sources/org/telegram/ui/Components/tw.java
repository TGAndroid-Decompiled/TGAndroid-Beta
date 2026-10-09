package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class tw implements Runnable {
    public final int f31292a;
    public final a00 f31293b;

    public tw(a00 a00Var, int i10) {
        this.f31292a = i10;
        this.f31293b = a00Var;
    }

    @Override
    public final void run() {
        switch (this.f31292a) {
            case 0:
                a00 a00Var = this.f31293b;
                a00Var.X(false);
                a00Var.E();
                return;
            case 1:
                jy jyVar = this.f31293b.R;
                if (jyVar != null) {
                    jyVar.F(true);
                    return;
                }
                return;
            case 2:
                a00 a00Var2 = this.f31293b;
                az azVar = a00Var2.f24455t1;
                if (azVar != null) {
                    azVar.t(a00Var2.R.h);
                    return;
                }
                return;
            case 3:
                az azVar2 = this.f31293b.f24455t1;
                if (azVar2 != null) {
                    azVar2.q();
                    return;
                }
                return;
            case 4:
                a00 a00Var3 = this.f31293b;
                a00Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(a00Var3.f24401c1).getClientUserId());
                a00Var3.Y1.presentFragment(new org.telegram.ui.zn(bundle));
                return;
            default:
                a00 a00Var4 = this.f31293b;
                ArrayList<ny> emojipacks = a00Var4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f29306i) {
                        int i11 = a00Var4.R.f27798s.get(EmojiData.dataColored.length + i10);
                        a00Var4.P.B0();
                        a00Var4.U(i11);
                        a00Var4.G(i11, AndroidUtilities.dp(-9.0f));
                        a00Var4.o(0, null);
                    }
                }
                return;
        }
    }
}
