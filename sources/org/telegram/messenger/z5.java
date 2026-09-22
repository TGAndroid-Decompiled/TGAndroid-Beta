package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18281a;
    public final MediaController f18282b;
    public final int f18283c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18281a = i11;
        this.f18282b = mediaController;
        this.f18283c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18281a) {
            case 0:
                this.f18282b.lambda$onAudioFocusChange$5(this.f18283c);
                return;
            default:
                this.f18282b.lambda$stopRecording$42(this.f18283c);
                return;
        }
    }
}
