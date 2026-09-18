package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class yh implements Runnable {
    public final int f18003a = 0;
    public final RichMessageLayout.Text f18004b;
    public final RichMessageLayout f18005c;
    public final View d;

    public yh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18004b = text;
        this.d = view;
        this.f18005c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18003a) {
            case 0:
                this.f18004b.lambda$revealSpoilers$4(this.d, this.f18005c);
                return;
            default:
                this.f18004b.lambda$revealSpoilers$3(this.f18005c, this.d);
                return;
        }
    }

    public yh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18004b = text;
        this.f18005c = richMessageLayout;
        this.d = view;
    }
}
