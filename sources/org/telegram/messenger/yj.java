package org.telegram.messenger;

import java.util.ArrayList;
public final class yj implements Runnable {
    public final int f28111a;
    public final np f28112b;
    public final ArrayList f28113c;

    public yj(np npVar, ArrayList arrayList, int i7) {
        this.f28111a = i7;
        this.f28112b = npVar;
        this.f28113c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f28111a) {
            case 0:
                g0.g3(new yj(this.f28112b, this.f28113c, 2));
                return;
            case 1:
                this.f28112b.getNotificationsController().K(this.f28113c, true, false, null);
                return;
            case 2:
                this.f28112b.getNotificationsController().K(this.f28113c, true, false, null);
                return;
            case 3:
                g0.g3(new yj(this.f28112b, this.f28113c, 5));
                return;
            case 4:
                np npVar = this.f28112b;
                npVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f28113c;
                    if (i7 < arrayList.size()) {
                        npVar.j4(npVar.l1(-((Long) arrayList.get(i7)).longValue()), 0L);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 5:
                this.f28112b.getNotificationsController().K(this.f28113c, true, false, null);
                return;
            case 6:
                this.f28112b.getNotificationsController().K(this.f28113c, true, false, null);
                return;
            default:
                g0.g3(new yj(this.f28112b, this.f28113c, 1));
                return;
        }
    }
}
