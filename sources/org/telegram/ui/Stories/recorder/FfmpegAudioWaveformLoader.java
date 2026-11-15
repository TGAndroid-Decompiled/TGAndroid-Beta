package org.telegram.ui.Stories.recorder;

import ai.a1;
import hi.e1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.s10;
public class FfmpegAudioWaveformLoader {
    private s10 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i7, s10 s10Var) {
        this.onChunkReceived = s10Var;
        Utilities.h.c(new a1(this, str, i7, 13));
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
        g0.h3(new a1(this, sArr, i7, 14));
    }

    public void destroy() {
        Utilities.h.c(new e1(this, 5));
    }
}
