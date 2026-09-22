package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class yh implements Runnable {
    public final int f18234a = 0;
    public final RichMessageLayout.Text f18235b;
    public final RichMessageLayout f18236c;
    public final View d;

    public yh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f18235b = text;
        this.d = view;
        this.f18236c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f18234a) {
            case 0:
                this.f18235b.lambda$revealSpoilers$4(this.d, this.f18236c);
                return;
            default:
                this.f18235b.lambda$revealSpoilers$3(this.f18236c, this.d);
                return;
        }
    }

    public yh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f18235b = text;
        this.f18236c = richMessageLayout;
        this.d = view;
    }
}
