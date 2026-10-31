package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;
import org.telegram.messenger.j20;
import org.telegram.ui.Wallet.x0;
import vh.d0;
public class FfmpegAudioWaveformLoader {
    private j20 onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i10, j20 j20Var) {
        this.onChunkReceived = j20Var;
        Utilities.h.c(new x0(this, str, i10, 19));
    }

    public native void lambda$new$0(String str, int i10);

    public void lambda$destroy$2() {
        this.running = false;
    }

    public void lambda$receiveChunk$1(short[] sArr, int i10) {
        this.onChunkReceived.a(sArr, Integer.valueOf(i10));
    }

    private void receiveChunk(short[] sArr, int i10) {
        i0.g3(new x0(this, sArr, i10, 20));
    }

    public void destroy() {
        Utilities.h.c(new d0(this, 7));
    }
}
