package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class yh implements Runnable {
    public final int f19738a = 0;
    public final RichMessageLayout.Text f19739b;
    public final RichMessageLayout f19740c;
    public final View d;

    public yh(RichMessageLayout.Text text, View view, RichMessageLayout richMessageLayout) {
        this.f19739b = text;
        this.d = view;
        this.f19740c = richMessageLayout;
    }

    @Override
    public final void run() {
        switch (this.f19738a) {
            case 0:
                this.f19739b.lambda$revealSpoilers$4(this.d, this.f19740c);
                return;
            default:
                this.f19739b.lambda$revealSpoilers$3(this.f19740c, this.d);
                return;
        }
    }

    public yh(RichMessageLayout.Text text, RichMessageLayout richMessageLayout, View view) {
        this.f19739b = text;
        this.f19740c = richMessageLayout;
        this.d = view;
    }
}
