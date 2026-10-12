package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class xu0 implements Runnable {
    public final int f32866a;
    public final yu0 f32867b;
    public final String f32868c;

    public xu0(yu0 yu0Var, String str, int i10) {
        this.f32866a = i10;
        this.f32867b = yu0Var;
        this.f32868c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f32866a) {
            case 0:
                yu0 yu0Var = this.f32867b;
                String str = this.f32868c;
                yu0Var.getClass();
                AndroidUtilities.runOnUIThread(new xu0(yu0Var, str, 1));
                return;
            default:
                yu0 yu0Var2 = this.f32867b;
                String str2 = this.f32868c;
                ArrayList arrayList = null;
                yu0Var2.f33178f = null;
                if (!ChatObject.isChannel(yu0Var2.f33179n) && yu0Var2.f33181s.f26918d1 != null) {
                    arrayList = new ArrayList(yu0Var2.f33181s.f26918d1.participants.participants);
                }
                yu0Var2.f33180r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new mh0(yu0Var2, str2, arrayList, 7));
                } else {
                    yu0Var2.f33180r = 1;
                }
                gg.b2 b2Var = yu0Var2.f33177e;
                if (ChatObject.isChannel(yu0Var2.f33179n)) {
                    j3 = yu0Var2.f33179n.f19803id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
