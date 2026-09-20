package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class yh implements Runnable {
    public final int f18219a = 0;
    public final RichMessageLayout.Text f18220b;
    public final RichMessageLayout f18221c;
    public final View d;

    public yh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18220b = text;
        this.d = view;
        this.f18221c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18219a) {
            case 0:
                this.f18220b.lambda$revealSpoilers$4(this.d, this.f18221c);
                return;
            default:
                this.f18220b.lambda$revealSpoilers$3(this.f18221c, this.d);
                return;
        }
    }

    public yh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18220b = text;
        this.f18221c = richMessageLayout;
        this.d = view;
    }
}
