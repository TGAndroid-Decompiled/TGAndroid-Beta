package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f19970a;
    public final MediaController f19971b;
    public final int f19972c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f19970a = i11;
        this.f19971b = mediaController;
        this.f19972c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19970a) {
            case 0:
                this.f19971b.lambda$onAudioFocusChange$5(this.f19972c);
                return;
            default:
                this.f19971b.lambda$stopRecording$42(this.f19972c);
                return;
        }
    }
}
