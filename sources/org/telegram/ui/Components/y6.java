package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

public final class y6 implements Utilities.Callback {

    public final int f34826a;

    public final b8 f34827b;

    public y6(b8 b8Var, int i10) {
        this.f34826a = i10;
        this.f34827b = b8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34826a) {
            case 0:
                b8.v(this.f34827b, (MessageObject) obj);
                break;
            default:
                b8.y(this.f34827b);
                break;
        }
    }
}
