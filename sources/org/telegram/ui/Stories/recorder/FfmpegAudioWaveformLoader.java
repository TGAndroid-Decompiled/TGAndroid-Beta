package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda2;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;

public class FfmpegAudioWaveformLoader {
    private Utilities.Callback2<short[], Integer> onChunkReceived;
    private volatile boolean running = true;

    public FfmpegAudioWaveformLoader(String str, int i, Utilities.Callback2<short[], Integer> callback2) {
        this.onChunkReceived = callback2;
        Utilities.phoneBookQueue.postRunnable(new TodoItemMenu$$ExternalSyntheticLambda2(this, str, i, 10));
    }

    public native void lambda$new$0(String str, int i);

    public void lambda$destroy$2() {
        this.running = false;
    }

    public void lambda$receiveChunk$1(short[] sArr, int i) {
        this.onChunkReceived.run(sArr, Integer.valueOf(i));
    }

    private void receiveChunk(short[] sArr, int i) {
        AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(this, sArr, i, 11));
    }

    public void destroy() {
        Utilities.phoneBookQueue.postRunnable(new VoIPFragment$12$$ExternalSyntheticLambda0(this, 9));
    }
}
