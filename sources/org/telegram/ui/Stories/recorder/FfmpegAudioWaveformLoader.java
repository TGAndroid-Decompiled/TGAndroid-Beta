package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class FfmpegAudioWaveformLoader {
    private Utilities.Callback2<short[], Integer> onChunkReceived;
    private volatile boolean running = true;

    public native void lambda$new$0(String str, int i);

    public FfmpegAudioWaveformLoader(final String str, final int i, Utilities.Callback2<short[], Integer> callback2) {
        this.onChunkReceived = callback2;
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FfmpegAudioWaveformLoader.this.lambda$new$0(str, i);
            }
        });
    }

    private void receiveChunk(final short[] sArr, final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                FfmpegAudioWaveformLoader.this.lambda$receiveChunk$1(sArr, i);
            }
        });
    }

    public void lambda$receiveChunk$1(short[] sArr, int i) {
        this.onChunkReceived.run(sArr, Integer.valueOf(i));
    }

    public void destroy() {
        Utilities.phoneBookQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                FfmpegAudioWaveformLoader.this.lambda$destroy$2();
            }
        });
    }

    public void lambda$destroy$2() {
        this.running = false;
    }
}
