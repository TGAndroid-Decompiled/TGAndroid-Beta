package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mj0;
public final class l1 implements Runnable {
    public final int f29366a;
    public final p1 f29367b;
    public final mj0 f29368c;

    public l1(p1 p1Var, mj0 mj0Var, int i10) {
        this.f29366a = i10;
        this.f29367b = p1Var;
        this.f29368c = mj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29366a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f29367b, this.f29368c, 1));
                return;
            default:
                this.f29367b.removeView(this.f29368c);
                return;
        }
    }
}
