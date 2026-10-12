package org.telegram.ui.Stories.recorder;

import ah.o;
import bi.la;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class FfmpegAudioWaveformLoader {
    private Utilities.Callback2<short[], Integer> onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i10, Utilities.Callback2<short[], Integer> callback2) {
        this.onChunkReceived = callback2;
        Utilities.phoneBookQueue.postRunnable(new o(this, str, i10, 4));
    }

    public static void a(FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader, short[] sArr, int i10) {
        ffmpegAudioWaveformLoader.lambda$receiveChunk$1(sArr, i10);
    }

    public static void c(FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader, String str, int i10) {
        ffmpegAudioWaveformLoader.lambda$new$0(str, i10);
    }

    public native void lambda$new$0(String str, int i10);

    public void lambda$destroy$2() {
        this.running = false;
    }

    public void lambda$receiveChunk$1(short[] sArr, int i10) {
        this.onChunkReceived.run(sArr, Integer.valueOf(i10));
    }

    private void receiveChunk(short[] sArr, int i10) {
        AndroidUtilities.runOnUIThread(new o(this, sArr, i10, 5));
    }

    public void destroy() {
        Utilities.phoneBookQueue.postRunnable(new la(this, 24));
    }
}
