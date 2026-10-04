package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f19969a;
    public final MediaController f19970b;
    public final int f19971c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f19969a = i11;
        this.f19970b = mediaController;
        this.f19971c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19969a) {
            case 0:
                this.f19970b.lambda$onAudioFocusChange$5(this.f19971c);
                return;
            default:
                this.f19970b.lambda$stopRecording$42(this.f19971c);
                return;
        }
    }
}
