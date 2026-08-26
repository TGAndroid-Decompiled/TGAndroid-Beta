package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.poll.PollAttachedMediaPack;

public final class ChatAttachAlert$$ExternalSyntheticLambda1 implements ChatAttachAlertLocationLayout.LocationActivityDelegate, ChatAttachAlertPollLayout.PollCreateActivityDelegate, AlertsCreator.ScheduleDatePickerDelegate, AlertDialog.OnButtonClickListener, ChatAttachAlertAudioLayout.AudioSelectDelegate, RecyclerListView.OnItemLongClickListener, BlurredBackgroundProviderBuilder.ColorProvider, ActionBarMenuItem.ActionBarMenuItemDelegate, AndroidUtilities.IntColorCallback {
    public final int $r8$classId;
    public final ChatAttachAlert f$0;

    public ChatAttachAlert$$ExternalSyntheticLambda1(ChatAttachAlert chatAttachAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlert;
    }

    @Override
    public void didSelectAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
        this.f$0.lambda$openAudioLayout$54(arrayList, charSequence, z, i, i2, j, z2, j2);
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        switch (this.$r8$classId) {
            case 3:
                this.f$0.lambda$onWriteButtonPressed$42(z, i, i2);
                break;
            default:
                this.f$0.lambda$new$30(z, i, i2);
                break;
        }
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$init$65(messageMedia, i, z, i2, j);
                break;
            case 1:
                this.f$0.lambda$new$9(messageMedia, i, z, i2, j);
                break;
            default:
                this.f$0.lambda$openAttachLayoutForType$48(messageMedia, i, z, i2, j);
                break;
        }
    }

    @Override
    public int getColor(Theme.ResourcesProvider resourcesProvider, boolean z) {
        switch (this.$r8$classId) {
            case 10:
                return this.f$0.lambda$new$38(resourcesProvider, z);
            case 11:
                return this.f$0.lambda$new$39(resourcesProvider, z);
            case 12:
                return this.f$0.lambda$new$40(resourcesProvider, z);
            default:
                return this.f$0.lambda$new$41(resourcesProvider, z);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$dismiss$69(alertDialog, i);
    }

    @Override
    public void onItemClick(int i) {
        this.f$0.lambda$new$1(i);
    }

    @Override
    public void run(int i) {
        this.f$0.lambda$dismiss$72(i);
    }

    @Override
    public void sendPoll(TLRPC.MessageMedia messageMedia, CharSequence charSequence, PollAttachedMediaPack pollAttachedMediaPack, ArrayList arrayList, boolean z, int i, long j) {
        switch (this.$r8$classId) {
            case 2:
                this.f$0.lambda$new$10(messageMedia, charSequence, pollAttachedMediaPack, arrayList, z, i, j);
                break;
            default:
                this.f$0.lambda$showPollLayout$49(messageMedia, charSequence, pollAttachedMediaPack, arrayList, z, i, j);
                break;
        }
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$new$15(view, i);
    }
}
