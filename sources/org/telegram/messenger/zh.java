package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class zh implements Runnable {
    public final int f18273a = 0;
    public final RichMessageLayout.Text f18274b;
    public final RichMessageLayout f18275c;
    public final View d;

    public zh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18274b = text;
        this.d = view;
        this.f18275c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18273a) {
            case 0:
                this.f18274b.lambda$revealSpoilers$4(this.d, this.f18275c);
                return;
            default:
                this.f18274b.lambda$revealSpoilers$3(this.f18275c, this.d);
                return;
        }
    }

    public zh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18274b = text;
        this.f18275c = richMessageLayout;
        this.d = view;
    }
}
