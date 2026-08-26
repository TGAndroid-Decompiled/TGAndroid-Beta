package org.telegram.ui.Stars;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda37;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.LivePlayer;

public final class StarsIntroActivity$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId = 0;
    public final int f$0;
    public final Object f$1;
    public final long f$2;
    public final long f$3;
    public final Object f$4;
    public final Object f$5;

    public StarsIntroActivity$$ExternalSyntheticLambda10(int i, Context context, long j, long j2, BottomSheet[] bottomSheetArr, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = i;
        this.f$1 = context;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = bottomSheetArr;
        this.f$5 = resourcesProvider;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                int i = this.f$0;
                BotStarsController botStarsController = BotStarsController.getInstance(i);
                BottomSheet[] bottomSheetArr = (BottomSheet[]) this.f$4;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) this.f$5;
                Context context = (Context) this.f$1;
                long j = this.f$2;
                botStarsController.getConnectedBot(context, j, this.f$3, new StarsIntroActivity$$ExternalSyntheticLambda42(bottomSheetArr, context, i, j, resourcesProvider, 0));
                break;
            case 1:
                ((MessagesController) this.f$1).lambda$deleteSavedDialog$144(this.f$2, this.f$3, (TLRPC.InputPeer) this.f$4, this.f$0, (int[]) this.f$5);
                break;
            case 2:
                ((ItemOptions) this.f$1).dismiss();
                int i2 = this.f$0;
                MessagesController messagesController = MessagesController.getInstance(i2);
                long j2 = this.f$2;
                long j3 = this.f$3;
                boolean zIsDialogMuted = messagesController.isDialogMuted(j2, j3);
                NotificationsController.getInstance(i2).muteDialog(j2, j3, !zIsDialogMuted);
                BaseFragment baseFragment = (BaseFragment) this.f$4;
                if (BulletinFactory.canShowBulletin(baseFragment)) {
                    BulletinFactory.createMuteBulletin(baseFragment, !zIsDialogMuted ? 3 : 4, !zIsDialogMuted ? Integer.MAX_VALUE : 0, (Theme.ResourcesProvider) this.f$5).show();
                }
                break;
            default:
                int i3 = this.f$0;
                LiveCommentsView liveCommentsView = (LiveCommentsView) this.f$1;
                liveCommentsView.delete(i3);
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$4;
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = liveCommentsView.getContext();
                    DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
                    long j4 = this.f$3;
                    TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f$5;
                    long j5 = this.f$2;
                    new StarsIntroActivity.StarsNeededSheet(context2, darkThemeResourceProvider, j5, 17, "", new LaunchActivity$$ExternalSyntheticLambda37(liveCommentsView, j4, tL_textWithEntities, j5, 12), liveCommentsView.dialogId).show();
                } else if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    new BulletinFactory(liveCommentsView.topBulletinContainer, new DarkThemeResourceProvider()).showForError(true, tL_error);
                } else {
                    LivePlayer livePlayer = liveCommentsView.livePlayer;
                    if (livePlayer != null) {
                        livePlayer.storyDeleted();
                    }
                }
                break;
        }
    }

    public StarsIntroActivity$$ExternalSyntheticLambda10(MessagesController messagesController, long j, long j2, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        this.f$1 = messagesController;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = inputPeer;
        this.f$0 = i;
        this.f$5 = iArr;
    }

    public StarsIntroActivity$$ExternalSyntheticLambda10(ItemOptions itemOptions, int i, long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this.f$1 = itemOptions;
        this.f$0 = i;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = baseFragment;
        this.f$5 = resourcesProvider;
    }

    public StarsIntroActivity$$ExternalSyntheticLambda10(LiveCommentsView liveCommentsView, int i, TLRPC.TL_error tL_error, long j, long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f$1 = liveCommentsView;
        this.f$0 = i;
        this.f$4 = tL_error;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$5 = tL_textWithEntities;
    }
}
