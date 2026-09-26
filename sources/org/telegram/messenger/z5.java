package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18273a;
    public final MediaController f18274b;
    public final int f18275c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18273a = i11;
        this.f18274b = mediaController;
        this.f18275c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18273a) {
            case 0:
                this.f18274b.lambda$onAudioFocusChange$5(this.f18275c);
                return;
            default:
                this.f18274b.lambda$stopRecording$42(this.f18275c);
                return;
        }
    }
}
