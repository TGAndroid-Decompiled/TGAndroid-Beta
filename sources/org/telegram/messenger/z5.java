package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f18291a;
    public final MediaController f18292b;
    public final int f18293c;

    public z5(MediaController mediaController, int i10, int i11) {
        this.f18291a = i11;
        this.f18292b = mediaController;
        this.f18293c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18291a) {
            case 0:
                this.f18292b.lambda$onAudioFocusChange$5(this.f18293c);
                return;
            default:
                this.f18292b.lambda$stopRecording$42(this.f18293c);
                return;
        }
    }
}
