package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18223a;
    public final MediaController f18224b;
    public final int f18225c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18223a = i11;
        this.f18224b = mediaController;
        this.f18225c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18223a) {
            case 0:
                this.f18224b.lambda$onAudioFocusChange$5(this.f18225c);
                return;
            default:
                this.f18224b.lambda$stopRecording$42(this.f18225c);
                return;
        }
    }
}
