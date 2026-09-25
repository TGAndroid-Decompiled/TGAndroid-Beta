package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18274a;
    public final MediaController f18275b;
    public final int f18276c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18274a = i11;
        this.f18275b = mediaController;
        this.f18276c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18274a) {
            case 0:
                this.f18275b.lambda$onAudioFocusChange$5(this.f18276c);
                return;
            default:
                this.f18275b.lambda$stopRecording$42(this.f18276c);
                return;
        }
    }
}
