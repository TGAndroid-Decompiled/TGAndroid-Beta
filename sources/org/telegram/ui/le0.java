package org.telegram.ui;

import java.util.TimerTask;
public final class le0 extends TimerTask {
    public final int f39223a;
    public final me0 f39224b;

    public le0(me0 me0Var, int i10) {
        this.f39223a = i10;
        this.f39224b = me0Var;
    }

    @Override
    public final void run() {
        switch (this.f39223a) {
            case 0:
                org.telegram.messenger.i0.g3(new zy(this, 26));
                return;
            default:
                if (this.f39224b.T != null) {
                    org.telegram.messenger.i0.g3(new zy(this, 27));
                    return;
                }
                return;
        }
    }
}
