package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class yh implements Runnable {
    public final int f17994a = 0;
    public final RichMessageLayout.Text f17995b;
    public final RichMessageLayout f17996c;
    public final View d;

    public yh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f17995b = text;
        this.d = view;
        this.f17996c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f17994a) {
            case 0:
                this.f17995b.lambda$revealSpoilers$4(this.d, this.f17996c);
                return;
            default:
                this.f17995b.lambda$revealSpoilers$3(this.f17996c, this.d);
                return;
        }
    }

    public yh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f17995b = text;
        this.f17996c = richMessageLayout;
        this.d = view;
    }
}
