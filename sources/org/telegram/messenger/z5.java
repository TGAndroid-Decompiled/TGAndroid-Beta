package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f19984a;
    public final MediaController f19985b;
    public final int f19986c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f19984a = i11;
        this.f19985b = mediaController;
        this.f19986c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19984a) {
            case 0:
                this.f19985b.lambda$onAudioFocusChange$5(this.f19986c);
                return;
            default:
                this.f19985b.lambda$stopRecording$42(this.f19986c);
                return;
        }
    }
}
