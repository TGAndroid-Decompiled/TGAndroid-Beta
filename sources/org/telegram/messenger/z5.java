package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18040a;
    public final MediaController f18041b;
    public final int f18042c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18040a = i11;
        this.f18041b = mediaController;
        this.f18042c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18040a) {
            case 0:
                this.f18041b.lambda$onAudioFocusChange$5(this.f18042c);
                return;
            default:
                this.f18041b.lambda$stopRecording$42(this.f18042c);
                return;
        }
    }
}
