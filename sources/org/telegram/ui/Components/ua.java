package org.telegram.ui.Components;

public final class ua implements Runnable {

    public final int f33023a;

    public final jb f33024b;

    public ua(jb jbVar, int i10) {
        this.f33023a = i10;
        this.f33024b = jbVar;
    }

    @Override
    public final void run() {
        switch (this.f33023a) {
            case 0:
                this.f33024b.onExitTransitionStart();
                break;
            default:
                this.f33024b.onEnterTransitionStart();
                break;
        }
    }
}
