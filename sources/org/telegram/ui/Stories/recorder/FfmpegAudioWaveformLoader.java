package org.telegram.ui.Stories.recorder;

import ai.c1;
import hi.l;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.q10;
public class FfmpegAudioWaveformLoader {
    private q10 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i7, q10 q10Var) {
        this.onChunkReceived = q10Var;
        Utilities.h.c(new c1(this, str, i7, 14));
    }

    public static void b(FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader) {
        ffmpegAudioWaveformLoader.lambda$destroy$2();
    }

    public native void lambda$new$0(String str, int i7);

    public void lambda$destroy$2() {
        this.running = false;
    }

    public void lambda$receiveChunk$1(short[] sArr, int i7) {
        this.onChunkReceived.a(sArr, Integer.valueOf(i7));
    }

    private void receiveChunk(short[] sArr, int i7) {
        g0.g3(new c1(this, sArr, i7, 15));
    }

    public void destroy() {
        Utilities.h.c(new l(this, 9));
    }
}
