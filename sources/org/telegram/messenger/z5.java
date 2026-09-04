package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f19790a;
    public final MediaController f19791b;
    public final int f19792c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f19790a = i11;
        this.f19791b = mediaController;
        this.f19792c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19790a) {
            case 0:
                this.f19791b.lambda$onAudioFocusChange$5(this.f19792c);
                return;
            default:
                this.f19791b.lambda$stopRecording$42(this.f19792c);
                return;
        }
    }
}
