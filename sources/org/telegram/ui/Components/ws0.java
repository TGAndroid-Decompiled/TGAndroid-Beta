package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

public final class ws0 implements Runnable {

    public final int f34320a;

    public final xs0 f34321b;

    public final String f34322c;

    public ws0(xs0 xs0Var, String str, int i10) {
        this.f34320a = i10;
        this.f34321b = xs0Var;
        this.f34322c = str;
    }

    @Override
    public final void run() {
        switch (this.f34320a) {
            case 0:
                xs0 xs0Var = this.f34321b;
                String str = this.f34322c;
                xs0Var.getClass();
                AndroidUtilities.runOnUIThread(new ws0(xs0Var, str, 1));
                break;
            default:
                xs0 xs0Var2 = this.f34321b;
                String str2 = this.f34322c;
                ArrayList arrayList = null;
                xs0Var2.f34694f = null;
                if (!ChatObject.isChannel(xs0Var2.f34695n) && xs0Var2.f34697s.Z0 != null) {
                    arrayList = new ArrayList(xs0Var2.f34697s.Z0.participants.participants);
                }
                xs0Var2.f34696r = 2;
                if (arrayList != null) {
                    Utilities.searchQueue.postRunnable(new gs0(xs0Var2, str2, arrayList, 2));
                } else {
                    xs0Var2.f34696r = 1;
                }
                xs0Var2.f34693e.g(str2, false, false, true, false, ChatObject.isChannel(xs0Var2.f34695n) ? xs0Var2.f34695n.f22380id : 0L, false, 2, 1);
                break;
        }
    }
}
