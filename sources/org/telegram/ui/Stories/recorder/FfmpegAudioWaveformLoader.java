package org.telegram.ui.Stories.recorder;

import d5.i;
import kh.f1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class FfmpegAudioWaveformLoader {
    private Utilities.Callback2<short[], Integer> onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i9, Utilities.Callback2<short[], Integer> callback2) {
        this.onChunkReceived = callback2;
        Utilities.phoneBookQueue.postRunnable(new i(this, str, i9, 11));
    }

    public static void b(FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader) {
        ffmpegAudioWaveformLoader.lambda$destroy$2();
    }

    public native void lambda$new$0(String str, int i9);

    public void lambda$destroy$2() {
        this.running = false;
    }

    public void lambda$receiveChunk$1(short[] sArr, int i9) {
        this.onChunkReceived.run(sArr, Integer.valueOf(i9));
    }

    private void receiveChunk(short[] sArr, int i9) {
        AndroidUtilities.runOnUIThread(new i(this, sArr, i9, 12));
    }

    public void destroy() {
        Utilities.phoneBookQueue.postRunnable(new f1(this, 5));
    }
}
