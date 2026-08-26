package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ProfileChannelCell;
import org.telegram.ui.Stars.StarsController$$ExternalSyntheticLambda65;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class AlertsCreator$$ExternalSyntheticLambda16 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final int f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;
    public final Object f$4;

    public AlertsCreator$$ExternalSyntheticLambda16(int i, ButtonWithCounterView buttonWithCounterView, BottomSheet bottomSheet, long j, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = i;
        this.f$1 = buttonWithCounterView;
        this.f$2 = bottomSheet;
        this.f$3 = j;
        this.f$4 = resourcesProvider;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$showCallsForbidden$260(this.f$0, (ButtonWithCounterView) this.f$1, (BottomSheet) this.f$2, this.f$3, (Theme.ResourcesProvider) this.f$4, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f$1).lambda$loadFullUser$72(this.f$3, (Utilities.Callback) this.f$2, (TLRPC.User) this.f$4, this.f$0, tLObject, tL_error);
                break;
            default:
                ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher = (ProfileChannelCell.ChannelMessageFetcher) this.f$1;
                channelMessageFetcher.getClass();
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda65(channelMessageFetcher, tLObject, (MessagesStorage) this.f$2, this.f$3, this.f$0, (ArrayList) this.f$4));
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda16(MessagesController messagesController, long j, Utilities.Callback callback, TLRPC.User user, int i) {
        this.f$1 = messagesController;
        this.f$3 = j;
        this.f$2 = callback;
        this.f$4 = user;
        this.f$0 = i;
    }

    public AlertsCreator$$ExternalSyntheticLambda16(ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher, MessagesStorage messagesStorage, long j, int i, ArrayList arrayList) {
        this.f$1 = channelMessageFetcher;
        this.f$2 = messagesStorage;
        this.f$3 = j;
        this.f$0 = i;
        this.f$4 = arrayList;
    }
}
