package org.telegram.ui.Stories.recorder;

import ai.j1;
import hi.l;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.r10;
public class FfmpegAudioWaveformLoader {
    private r10 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i7, r10 r10Var) {
        this.onChunkReceived = r10Var;
        Utilities.h.c(new j1(this, str, i7, 13));
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
        g0.g3(new j1(this, sArr, i7, 14));
    }

    public void destroy() {
        Utilities.h.c(new l(this, 9));
    }
}
