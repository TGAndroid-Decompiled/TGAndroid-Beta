package org.telegram.ui.Stories.recorder;

import android.media.MediaCodec;
import java.io.IOException;
import org.telegram.ui.Stories.recorder.TimelineView;

public final class TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0 implements Runnable {
    public final TimelineView.AudioWaveformLoader f$0;

    public TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0(TimelineView.AudioWaveformLoader audioWaveformLoader) {
        this.f$0 = audioWaveformLoader;
    }

    @Override
    public final void run() throws MediaCodec.CryptoException, IOException {
        this.f$0.run();
    }
}
