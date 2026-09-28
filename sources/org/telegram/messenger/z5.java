package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18275a;
    public final MediaController f18276b;
    public final int f18277c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18275a = i11;
        this.f18276b = mediaController;
        this.f18277c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18275a) {
            case 0:
                this.f18276b.lambda$onAudioFocusChange$5(this.f18277c);
                return;
            default:
                this.f18276b.lambda$stopRecording$42(this.f18277c);
                return;
        }
    }
}
