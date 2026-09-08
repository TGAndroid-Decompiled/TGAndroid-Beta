package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class yh implements Runnable {
    public final int f19765a = 0;
    public final RichMessageLayout.Text f19766b;
    public final RichMessageLayout f19767c;
    public final View d;

    public yh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19766b = text;
        this.d = view;
        this.f19767c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19765a) {
            case 0:
                this.f19766b.lambda$revealSpoilers$4(this.d, this.f19767c);
                return;
            default:
                this.f19766b.lambda$revealSpoilers$3(this.f19767c, this.d);
                return;
        }
    }

    public yh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19766b = text;
        this.f19767c = richMessageLayout;
        this.d = view;
    }
}
