package org.telegram.ui.Stories.recorder;

import ai.e0;
import di.s7;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.v10;
public class FfmpegAudioWaveformLoader {
    private v10 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i7, v10 v10Var) {
        this.onChunkReceived = v10Var;
        Utilities.h.c(new e0(this, str, i7, 9));
    }

    public native void lambda$new$0(String str, int i7);

    public void lambda$destroy$2() {
        this.running = false;
    }

    public void lambda$receiveChunk$1(short[] sArr, int i7) {
        this.onChunkReceived.a(sArr, Integer.valueOf(i7));
    }

    private void receiveChunk(short[] sArr, int i7) {
        g0.h3(new e0(this, sArr, i7, 10));
    }

    public void destroy() {
        Utilities.h.c(new s7(this, 22));
    }
}
