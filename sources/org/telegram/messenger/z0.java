package org.telegram.messenger;

import android.view.View;
import java.util.List;

public final class z0 implements Utilities.Callback {

    public final int f22281a;

    public final Object f22282b;

    public z0(Object obj, int i10) {
        this.f22281a = i10;
        this.f22282b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22281a) {
            case 0:
                ((ChatThemeController) this.f22282b).lambda$init$0((List) obj);
                break;
            case 1:
                ((Runnable) this.f22282b).run();
                break;
            default:
                ((View) this.f22282b).invalidate();
                break;
        }
    }
}
