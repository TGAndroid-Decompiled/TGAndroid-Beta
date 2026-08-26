package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;

public class FfmpegAudioWaveformLoader {
    private Utilities.Callback2<short[], Integer> onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i, Utilities.Callback2<short[], Integer> callback2) {
        this.onChunkReceived = callback2;
        Utilities.phoneBookQueue.postRunnable(new RichTextCell$2$$ExternalSyntheticLambda1(this, str, i, 20));
    }

    public native void lambda$new$0(String str, int i);

    public void lambda$destroy$2() {
        this.running = false;
    }

    public void lambda$receiveChunk$1(short[] sArr, int i) {
        this.onChunkReceived.run(sArr, Integer.valueOf(i));
    }

    private void receiveChunk(short[] sArr, int i) {
        AndroidUtilities.runOnUIThread(new RichTextCell$2$$ExternalSyntheticLambda1(this, sArr, i, 21));
    }

    public void destroy() {
        Utilities.phoneBookQueue.postRunnable(new PreviewView$$ExternalSyntheticLambda12(this, 11));
    }
}
