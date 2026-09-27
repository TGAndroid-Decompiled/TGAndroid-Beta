package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18267a;
    public final MediaController f18268b;
    public final int f18269c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18267a = i11;
        this.f18268b = mediaController;
        this.f18269c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18267a) {
            case 0:
                this.f18268b.lambda$onAudioFocusChange$5(this.f18269c);
                return;
            default:
                this.f18268b.lambda$stopRecording$42(this.f18269c);
                return;
        }
    }
}
