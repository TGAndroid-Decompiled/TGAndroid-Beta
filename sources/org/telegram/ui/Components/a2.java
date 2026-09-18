package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class a2 implements Runnable {
    public final int f22466a;
    public final Utilities.Callback f22467b;
    public final HashMap f22468c;

    public a2(Utilities.Callback callback, HashMap hashMap, int i10) {
        this.f22466a = i10;
        this.f22467b = callback;
        this.f22468c = hashMap;
    }

    @Override
    public final void run() {
        switch (this.f22466a) {
            case 0:
                this.f22467b.run(this.f22468c);
                return;
            default:
                this.f22467b.run(this.f22468c);
                return;
        }
    }
}
