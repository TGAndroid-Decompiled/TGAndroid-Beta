package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class FfmpegAudioWaveformLoader {
    private Utilities.Callback2<short[], Integer> onChunkReceived;
    private volatile boolean running = true;

    public native void init(String str, int i);

    public FfmpegAudioWaveformLoader(final String str, final int i, Utilities.Callback2<short[], Integer> callback2) {
        this.onChunkReceived = callback2;
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.init(str, i);
            }
        });
    }

    private void receiveChunk(final short[] sArr, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.onChunkReceived.run(sArr, Integer.valueOf(i));
            }
        });
    }

    public void destroy() {
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.running = false;
            }
        });
    }
}
