package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class yh implements Runnable {
    public final int f21924a = 0;
    public final RichMessageLayout.Text f21925b;
    public final RichMessageLayout f21926c;
    public final View d;

    public yh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f21925b = text;
        this.d = view;
        this.f21926c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f21924a) {
            case 0:
                this.f21925b.lambda$revealSpoilers$4(this.d, this.f21926c);
                return;
            default:
                this.f21925b.lambda$revealSpoilers$3(this.f21926c, this.d);
                return;
        }
    }

    public yh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f21925b = text;
        this.f21926c = richMessageLayout;
        this.d = view;
    }
}
