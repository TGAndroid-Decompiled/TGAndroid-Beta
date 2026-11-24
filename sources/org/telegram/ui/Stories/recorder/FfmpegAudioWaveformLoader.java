package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;
public class FfmpegAudioWaveformLoader {
    private jac onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i, jac jacVar) {
        this.onChunkReceived = jacVar;
        Utilities.h.c(new wc7(this, str, i, (byte) 25));
    }

    public static void a(FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader, short[] sArr, int i) {
        ffmpegAudioWaveformLoader.lambda$receiveChunk$1(sArr, i);
    }

    public static void c(FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader, String str, int i) {
        ffmpegAudioWaveformLoader.lambda$new$0(str, i);
    }

    public native void lambda$new$0(String str, int i);

    public void lambda$destroy$2() {
        this.running = false;
    }

    public void lambda$receiveChunk$1(short[] sArr, int i) {
        this.onChunkReceived.a(sArr, Integer.valueOf(i));
    }

    private void receiveChunk(short[] sArr, int i) {
        gm.c3(new wc7(this, sArr, i, (byte) 26));
    }

    public void destroy() {
        Utilities.h.c(new a14(this, (byte) 11));
    }
}
