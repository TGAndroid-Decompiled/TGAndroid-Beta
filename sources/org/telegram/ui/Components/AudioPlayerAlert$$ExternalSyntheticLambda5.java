package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.Cells.AudioPlayerCell;

public final class AudioPlayerAlert$$ExternalSyntheticLambda5 implements ActionBarMenuItem.ActionBarMenuItemDelegate, RecyclerListView.OnItemLongClickListener {
    public final int $r8$classId;
    public final AudioPlayerAlert f$0;

    public AudioPlayerAlert$$ExternalSyntheticLambda5(AudioPlayerAlert audioPlayerAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = audioPlayerAlert;
    }

    @Override
    public void onItemClick(int i) {
        switch (this.$r8$classId) {
            case 1:
                AudioPlayerAlert audioPlayerAlert = this.f$0;
                audioPlayerAlert.getClass();
                if (i == 1 || i == 2) {
                    boolean z = SharedConfig.playOrderReversed;
                    if ((z && i == 1) || (SharedConfig.shuffleMusic && i == 2)) {
                        MediaController.getInstance().setPlaybackOrderType(0);
                    } else {
                        MediaController.getInstance().setPlaybackOrderType(i);
                    }
                    audioPlayerAlert.listAdapter.notifyDataSetChanged();
                    if (z != SharedConfig.playOrderReversed) {
                        audioPlayerAlert.listView.stopScroll();
                        audioPlayerAlert.scrollToCurrentSong(false);
                    }
                } else if (i == 4) {
                    if (SharedConfig.repeatMode == 1) {
                        SharedConfig.setRepeatMode(0);
                    } else {
                        SharedConfig.setRepeatMode(1);
                    }
                } else if (SharedConfig.repeatMode == 2) {
                    SharedConfig.setRepeatMode(0);
                } else {
                    SharedConfig.setRepeatMode(2);
                }
                audioPlayerAlert.updateRepeatButton();
                break;
            case 2:
                this.f$0.onSubItemClick(i);
                break;
            default:
                AudioPlayerAlert audioPlayerAlert2 = this.f$0;
                audioPlayerAlert2.getClass();
                if (i >= 0) {
                    float[] fArr = AudioPlayerAlert.speeds;
                    if (i < 6) {
                        MediaController.getInstance().setPlaybackSpeed(true, fArr[i]);
                        audioPlayerAlert2.updatePlaybackButton(true);
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        AudioPlayerAlert audioPlayerAlert = this.f$0;
        audioPlayerAlert.getClass();
        if (!(view instanceof AudioPlayerCell) || audioPlayerAlert.isMyList()) {
            return false;
        }
        AudioPlayerCell audioPlayerCell = (AudioPlayerCell) view;
        audioPlayerAlert.showOptions(audioPlayerCell, audioPlayerCell.getMessageObject());
        return true;
    }
}
