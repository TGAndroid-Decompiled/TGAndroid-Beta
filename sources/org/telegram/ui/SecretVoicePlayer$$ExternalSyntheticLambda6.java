package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.SeekBarWaveform;
import org.telegram.ui.Components.VideoPlayer;

public final class SecretVoicePlayer$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final SecretVoicePlayer f$0;

    public SecretVoicePlayer$$ExternalSyntheticLambda6(SecretVoicePlayer secretVoicePlayer, int i) {
        this.$r8$classId = i;
        this.f$0 = secretVoicePlayer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SecretVoicePlayer secretVoicePlayer = this.f$0;
                if (secretVoicePlayer.thanosEffect == null) {
                    AndroidUtilities.runOnUIThread(new SecretVoicePlayer$$ExternalSyntheticLambda6(secretVoicePlayer, 1));
                    ChatMessageCell chatMessageCell = secretVoicePlayer.cell;
                    if (chatMessageCell != null) {
                        chatMessageCell.setVisibility(0);
                        secretVoicePlayer.cell.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
            case 1:
                this.f$0.lambda$dismiss$6();
                break;
            case 2:
                this.f$0.lambda$dismiss$8();
                break;
            default:
                SecretVoicePlayer secretVoicePlayer2 = this.f$0;
                VideoPlayer videoPlayer = secretVoicePlayer2.player;
                if (videoPlayer != null) {
                    secretVoicePlayer2.progress = videoPlayer.getCurrentPosition() / secretVoicePlayer2.player.getDuration();
                    SecretVoicePlayer.AnonymousClass3 anonymousClass3 = secretVoicePlayer2.myCell;
                    if (anonymousClass3 != null) {
                        anonymousClass3.overridenDuration = (secretVoicePlayer2.player.getDuration() - secretVoicePlayer2.player.getCurrentPosition()) / 1000;
                        secretVoicePlayer2.myCell.updatePlayingMessageProgress();
                        SeekBarWaveform seekBarWaveform = secretVoicePlayer2.myCell.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f = secretVoicePlayer2.progress;
                            seekBarWaveform.exploding = true;
                            seekBarWaveform.explodeProgress = f;
                            ChatMessageCell chatMessageCell2 = seekBarWaveform.parentView;
                            if (chatMessageCell2 != null) {
                                chatMessageCell2.invalidate();
                            }
                        }
                    }
                    if (secretVoicePlayer2.player.isPlaying()) {
                        SecretVoicePlayer$$ExternalSyntheticLambda6 secretVoicePlayer$$ExternalSyntheticLambda6 = secretVoicePlayer2.checkTimeRunnable;
                        AndroidUtilities.cancelRunOnUIThread(secretVoicePlayer$$ExternalSyntheticLambda6);
                        AndroidUtilities.runOnUIThread(secretVoicePlayer$$ExternalSyntheticLambda6, 16L);
                    }
                    break;
                }
                break;
        }
    }
}
