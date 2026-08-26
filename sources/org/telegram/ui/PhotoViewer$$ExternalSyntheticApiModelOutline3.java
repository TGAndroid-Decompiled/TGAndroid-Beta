package org.telegram.ui;

import android.graphics.RadialGradient;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.projection.MediaProjection;

public abstract class PhotoViewer$$ExternalSyntheticApiModelOutline3 {
    public static RenderNode m$2() {
        return new RenderNode("CallActivity.Blur");
    }

    public static RenderNode m$3() {
        return new RenderNode("photo viewer");
    }

    public static RenderNode m$4() {
        return new RenderNode("pv_s_blur_false");
    }

    public static RenderNode m$5() {
        return new RenderNode("StoryRecorder.PreviewView");
    }

    public static RenderNode m$6() {
        return new RenderNode("WebViewSwipeContainer");
    }

    public static RenderNode m$1() {
        return new RenderNode("BlurredFill");
    }

    public static RadialGradient m(float f, float f2, float f3, long[] jArr, float[] fArr) {
        return new RadialGradient(f, f2, f3, jArr, fArr, Shader.TileMode.CLAMP);
    }

    public static RenderNode m1095m() {
        return new RenderNode("BlurredNode");
    }

    public static AudioPlaybackCaptureConfiguration.Builder m(MediaProjection mediaProjection) {
        return new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
    }

    public static void m1096m() {
    }
}
