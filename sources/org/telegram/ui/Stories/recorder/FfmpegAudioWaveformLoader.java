package org.telegram.ui.Stories.recorder;

import ai.e1;
import hi.w;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.p10;
public class FfmpegAudioWaveformLoader {
    private p10 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i7, p10 p10Var) {
        this.onChunkReceived = p10Var;
        Utilities.h.c(new e1(this, str, i7, 13));
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
        g0.g3(new e1(this, sArr, i7, 14));
    }

    public void destroy() {
        Utilities.h.c(new w(this, 10));
    }
}
