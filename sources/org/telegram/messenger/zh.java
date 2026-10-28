package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class zh implements Runnable {
    public final int f22003a = 0;
    public final RichMessageLayout.Text f22004b;
    public final RichMessageLayout f22005c;
    public final View d;

    public zh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f22004b = text;
        this.d = view;
        this.f22005c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f22003a) {
            case 0:
                this.f22004b.lambda$revealSpoilers$4(this.d, this.f22005c);
                return;
            default:
                this.f22004b.lambda$revealSpoilers$3(this.f22005c, this.d);
                return;
        }
    }

    public zh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f22004b = text;
        this.f22005c = richMessageLayout;
        this.d = view;
    }
}
