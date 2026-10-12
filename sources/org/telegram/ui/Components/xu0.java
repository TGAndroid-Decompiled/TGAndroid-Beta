package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;
public final class xu0 implements Runnable {
    public final int f32873a;
    public final yu0 f32874b;
    public final String f32875c;

    public xu0(yu0 yu0Var, String str, int i10) {
        this.f32873a = i10;
        this.f32874b = yu0Var;
        this.f32875c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f32873a) {
            case 0:
                yu0 yu0Var = this.f32874b;
                String str = this.f32875c;
                yu0Var.getClass();
                AndroidUtilities.runOnUIThread(new xu0(yu0Var, str, 1));
                return;
            default:
                yu0 yu0Var2 = this.f32874b;
                String str2 = this.f32875c;
                ArrayList arrayList = null;
                yu0Var2.f33172f = null;
                if (!ChatObject.isChannel(yu0Var2.f33173n) && yu0Var2.f33175s.f26933d1 != null) {
                    arrayList = new ArrayList(yu0Var2.f33175s.f26933d1.participants.participants);
                }
                yu0Var2.f33174r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new mh0(yu0Var2, str2, arrayList, 7));
                } else {
                    yu0Var2.f33174r = 1;
                }
                gg.b2 b2Var = yu0Var2.f33171e;
                if (ChatObject.isChannel(yu0Var2.f33173n)) {
                    j3 = yu0Var2.f33173n.f19802id;
                } else {
                    j3 = 0;
                }
                b2Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
