package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class ww implements Runnable {
    public final int f32573a;
    public final d00 f32574b;

    public ww(d00 d00Var, int i10) {
        this.f32573a = i10;
        this.f32574b = d00Var;
    }

    @Override
    public final void run() {
        switch (this.f32573a) {
            case 0:
                d00 d00Var = this.f32574b;
                d00Var.X(false);
                d00Var.E();
                return;
            case 1:
                my myVar = this.f32574b.R;
                if (myVar != null) {
                    myVar.F(true);
                    return;
                }
                return;
            case 2:
                d00 d00Var2 = this.f32574b;
                dz dzVar = d00Var2.f25126t1;
                if (dzVar != null) {
                    dzVar.t(d00Var2.R.h);
                    return;
                }
                return;
            case 3:
                dz dzVar2 = this.f32574b.f25126t1;
                if (dzVar2 != null) {
                    dzVar2.q();
                    return;
                }
                return;
            case 4:
                d00 d00Var3 = this.f32574b;
                d00Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(d00Var3.f25072c1).getClientUserId());
                d00Var3.Y1.presentFragment(new org.telegram.ui.eo(bundle));
                return;
            default:
                d00 d00Var4 = this.f32574b;
                ArrayList<qy> emojipacks = d00Var4.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f29953i) {
                        int i11 = d00Var4.R.f28670s.get(EmojiData.dataColored.length + i10);
                        d00Var4.P.B0();
                        d00Var4.U(i11);
                        d00Var4.G(i11, AndroidUtilities.dp(-9.0f));
                        d00Var4.o(0, null);
                    }
                }
                return;
        }
    }
}
