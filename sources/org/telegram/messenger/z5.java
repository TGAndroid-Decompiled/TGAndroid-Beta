package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f19979a;
    public final MediaController f19980b;
    public final int f19981c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f19979a = i11;
        this.f19980b = mediaController;
        this.f19981c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19979a) {
            case 0:
                this.f19980b.lambda$onAudioFocusChange$5(this.f19981c);
                return;
            default:
                this.f19980b.lambda$stopRecording$42(this.f19981c);
                return;
        }
    }
}
