package org.telegram.ui.Stories.recorder;

import ag.v0;
import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class FfmpegAudioWaveformLoader {
    private Utilities.Callback2<short[], Integer> onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i10, Utilities.Callback2<short[], Integer> callback2) {
        this.onChunkReceived = callback2;
        Utilities.phoneBookQueue.postRunnable(new v0(this, str, i10, 13));
    }

    public static void b(FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader) {
        ffmpegAudioWaveformLoader.lambda$destroy$2();
    }

    public native void lambda$new$0(String str, int i10);

    public void lambda$destroy$2() {
        this.running = false;
    }

    public void lambda$receiveChunk$1(short[] sArr, int i10) {
        this.onChunkReceived.run(sArr, Integer.valueOf(i10));
    }

    private void receiveChunk(short[] sArr, int i10) {
        AndroidUtilities.runOnUIThread(new v0(this, sArr, i10, 14));
    }

    public void destroy() {
        Utilities.phoneBookQueue.postRunnable(new m5(this, 26));
    }
}
