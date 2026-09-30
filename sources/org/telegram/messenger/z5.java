package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18276a;
    public final MediaController f18277b;
    public final int f18278c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18276a = i11;
        this.f18277b = mediaController;
        this.f18278c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18276a) {
            case 0:
                this.f18277b.lambda$onAudioFocusChange$5(this.f18278c);
                return;
            default:
                this.f18277b.lambda$stopRecording$42(this.f18278c);
                return;
        }
    }
}
