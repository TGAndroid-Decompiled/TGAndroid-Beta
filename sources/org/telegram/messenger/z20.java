package org.telegram.messenger;
public final class z20 implements Runnable {
    public final int f19661a;
    public final VideoEncodingService f19662b;

    public z20(VideoEncodingService videoEncodingService, int i10) {
        this.f19661a = i10;
        this.f19662b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i10 = this.f19661a;
        VideoEncodingService videoEncodingService = this.f19662b;
        switch (i10) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                videoEncodingService.getClass();
                kf kfVar = MediaController.B().f14439a0;
                if (kfVar != null) {
                    videoEncodingService.a(kfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.e;
                videoEncodingService.b();
                return;
        }
    }
}
