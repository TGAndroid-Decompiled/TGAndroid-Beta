package org.telegram.tgnet;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlayerImpl;

public final class ConnectionsManager$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId = 0;
    public final int f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;

    public ConnectionsManager$$ExternalSyntheticLambda20(int i, int i2, String str, String str2) {
        this.f$0 = i;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = i2;
    }

    @Override
    public final void run() {
        int i = this.f$3;
        int i2 = this.f$0;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                ConnectionsManager.lambda$onIntegrityCheckClassic$27(i2, (String) obj2, (String) obj, i);
                break;
            default:
                int i3 = ExoPlayerImpl.$r8$clinit;
                ExoPlayerImpl exoPlayerImpl = ((ExoPlayerImpl.ComponentListener) obj2).this$0;
                exoPlayerImpl.getClass();
                Surface surface = new Surface((SurfaceTexture) obj);
                exoPlayerImpl.setVideoOutputInternal(surface);
                exoPlayerImpl.ownedSurface = surface;
                exoPlayerImpl.maybeNotifySurfaceSizeChanged(i2, i);
                break;
        }
    }

    public ConnectionsManager$$ExternalSyntheticLambda20(ExoPlayerImpl.ComponentListener componentListener, SurfaceTexture surfaceTexture, int i, int i2) {
        this.f$1 = componentListener;
        this.f$2 = surfaceTexture;
        this.f$0 = i;
        this.f$3 = i2;
    }
}
