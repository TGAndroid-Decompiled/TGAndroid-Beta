package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18266a;
    public final MediaController f18267b;
    public final int f18268c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18266a = i11;
        this.f18267b = mediaController;
        this.f18268c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18266a) {
            case 0:
                this.f18267b.lambda$onAudioFocusChange$5(this.f18268c);
                return;
            default:
                this.f18267b.lambda$stopRecording$42(this.f18268c);
                return;
        }
    }
}
