package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18259a;
    public final MediaController f18260b;
    public final int f18261c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18259a = i11;
        this.f18260b = mediaController;
        this.f18261c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18259a) {
            case 0:
                this.f18260b.lambda$onAudioFocusChange$5(this.f18261c);
                return;
            default:
                this.f18260b.lambda$stopRecording$42(this.f18261c);
                return;
        }
    }
}
