package org.telegram.ui.Stories.recorder;

import android.os.SystemClock;

public final class RecordControl$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final RecordControl f$0;

    public RecordControl$$ExternalSyntheticLambda2(RecordControl recordControl, int i) {
        this.$r8$classId = i;
        this.f$0 = recordControl;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RecordControl recordControl = this.f$0;
                recordControl.recording = false;
                recordControl.longpressRecording = false;
                recordControl.recordingLoadingStart = SystemClock.elapsedRealtime();
                recordControl.recordingLoading = true;
                recordControl.touch = false;
                recordControl.recordButton.setPressed(false);
                recordControl.flipButton.setPressed(false);
                recordControl.lockButton.setPressed(false);
                ((StoryRecorder.AnonymousClass13) recordControl.delegate).onVideoRecordEnd(true);
                break;
            case 1:
                RecordControl recordControl2 = this.f$0;
                recordControl2.getClass();
                recordControl2.recordingStart = System.currentTimeMillis();
                recordControl2.lastDuration = 0L;
                recordControl2.recording = true;
                StoryRecorder.this.videoTimerView.setDuration(0L, true);
                break;
            case 2:
                RecordControl recordControl3 = this.f$0;
                if (!recordControl3.recording && !recordControl3.hasCheck()) {
                    if (!StoryRecorder.access$9600(StoryRecorder.this)) {
                        recordControl3.touch = false;
                        recordControl3.recordButton.setPressed(false);
                        recordControl3.flipButton.setPressed(false);
                        recordControl3.lockButton.setPressed(false);
                    } else {
                        recordControl3.longpressRecording = true;
                        recordControl3.showLock = true;
                        ((StoryRecorder.AnonymousClass13) recordControl3.delegate).onVideoRecordStart(true, new RecordControl$$ExternalSyntheticLambda2(recordControl3, 4));
                    }
                    break;
                }
                break;
            case 3:
                RecordControl recordControl4 = this.f$0;
                if (!recordControl4.recording && !recordControl4.hasCheck()) {
                    StoryRecorder.AnonymousClass25 anonymousClass25 = StoryRecorder.this.cameraView;
                    if (anonymousClass25 != null) {
                        anonymousClass25.toggleDual();
                    }
                    recordControl4.rotateFlip(360.0f);
                    recordControl4.touch = false;
                    recordControl4.recordButton.setPressed(false);
                    recordControl4.flipButton.setPressed(false);
                    recordControl4.lockButton.setPressed(false);
                    break;
                }
                break;
            default:
                RecordControl recordControl5 = this.f$0;
                recordControl5.getClass();
                recordControl5.recordingStart = System.currentTimeMillis();
                recordControl5.recording = true;
                RecordControl.Delegate delegate = recordControl5.delegate;
                recordControl5.lastDuration = 0L;
                StoryRecorder.this.videoTimerView.setDuration(0L, true);
                break;
        }
    }
}
