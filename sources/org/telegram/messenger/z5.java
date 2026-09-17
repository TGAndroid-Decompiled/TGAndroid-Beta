package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18049a;
    public final MediaController f18050b;
    public final int f18051c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18049a = i11;
        this.f18050b = mediaController;
        this.f18051c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18049a) {
            case 0:
                this.f18050b.lambda$onAudioFocusChange$5(this.f18051c);
                return;
            default:
                this.f18050b.lambda$stopRecording$42(this.f18051c);
                return;
        }
    }
}
