package org.telegram.ui.Components;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.UserConfig;
public final class hw implements Runnable {
    public final int f23768a;
    public final rz f23769b;

    public hw(rz rzVar, int i10) {
        this.f23768a = i10;
        this.f23769b = rzVar;
    }

    @Override
    public final void run() {
        switch (this.f23768a) {
            case 0:
                rz rzVar = this.f23769b;
                rzVar.Z(false);
                rzVar.F();
                return;
            case 1:
                rz rzVar2 = this.f23769b;
                rzVar2.P.postOnAnimation(new hw(rzVar2, 6));
                return;
            case 2:
                yx yxVar = this.f23769b.R;
                if (yxVar != null) {
                    yxVar.F(true);
                    return;
                }
                return;
            case 3:
                rz rzVar3 = this.f23769b;
                rzVar3.f26820h0.postOnAnimation(new hw(rzVar3, 6));
                return;
            case 4:
                rz rzVar4 = this.f23769b;
                rzVar4.D0.postOnAnimation(new hw(rzVar4, 6));
                return;
            case 5:
                rz rzVar5 = this.f23769b;
                sy syVar = rzVar5.f26858t1;
                if (syVar != null) {
                    syVar.t(rzVar5.R.h);
                    return;
                }
                return;
            case 6:
                this.f23769b.C();
                return;
            case 7:
                sy syVar2 = this.f23769b.f26858t1;
                if (syVar2 != null) {
                    syVar2.q();
                    return;
                }
                return;
            case 8:
                rz rzVar6 = this.f23769b;
                rzVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(rzVar6.f26805c1).getClientUserId());
                rzVar6.Y1.presentFragment(new org.telegram.ui.eo(bundle));
                return;
            default:
                rz rzVar7 = this.f23769b;
                ArrayList<dy> emojipacks = rzVar7.getEmojipacks();
                for (int i10 = 0; i10 < emojipacks.size(); i10++) {
                    if (emojipacks.get(i10).f22503i) {
                        int i11 = rzVar7.R.f29521s.get(EmojiData.dataColored.length + i10);
                        rzVar7.P.B0();
                        rzVar7.W(i11);
                        rzVar7.I(i11, AndroidUtilities.dp(-9.0f));
                        rzVar7.n(null, 0);
                    }
                }
                return;
        }
    }
}
