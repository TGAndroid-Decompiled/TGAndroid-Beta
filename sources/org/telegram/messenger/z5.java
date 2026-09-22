package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18037a;
    public final MediaController f18038b;
    public final int f18039c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18037a = i11;
        this.f18038b = mediaController;
        this.f18039c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18037a) {
            case 0:
                this.f18038b.lambda$onAudioFocusChange$5(this.f18039c);
                return;
            default:
                this.f18038b.lambda$stopRecording$42(this.f18039c);
                return;
        }
    }
}
