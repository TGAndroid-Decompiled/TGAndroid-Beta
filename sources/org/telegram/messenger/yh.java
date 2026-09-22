package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class yh implements Runnable {
    public final int f17990a = 0;
    public final RichMessageLayout.Text f17991b;
    public final RichMessageLayout f17992c;
    public final View d;

    public yh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f17991b = text;
        this.d = view;
        this.f17992c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f17990a) {
            case 0:
                this.f17991b.lambda$revealSpoilers$4(this.d, this.f17992c);
                return;
            default:
                this.f17991b.lambda$revealSpoilers$3(this.f17992c, this.d);
                return;
        }
    }

    public yh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f17991b = text;
        this.f17992c = richMessageLayout;
        this.d = view;
    }
}
