package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f19817a;
    public final MediaController f19818b;
    public final int f19819c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f19817a = i11;
        this.f19818b = mediaController;
        this.f19819c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19817a) {
            case 0:
                this.f19818b.lambda$onAudioFocusChange$5(this.f19819c);
                return;
            default:
                this.f19818b.lambda$stopRecording$42(this.f19819c);
                return;
        }
    }
}
