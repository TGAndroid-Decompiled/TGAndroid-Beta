package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18025a;
    public final MediaController f18026b;
    public final int f18027c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18025a = i11;
        this.f18026b = mediaController;
        this.f18027c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18025a) {
            case 0:
                this.f18026b.lambda$onAudioFocusChange$5(this.f18027c);
                return;
            default:
                this.f18026b.lambda$stopRecording$42(this.f18027c);
                return;
        }
    }
}
