package org.telegram.messenger;
public final class yl implements Runnable {
    public final int f18822a;
    public final VideoEncodingService f18823b;

    public yl(VideoEncodingService videoEncodingService, int i10) {
        this.f18822a = i10;
        this.f18823b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f18822a) {
            case 0:
                VideoEncodingService.a(this.f18823b);
                return;
            default:
                VideoEncodingService.b(this.f18823b);
                return;
        }
    }
}
