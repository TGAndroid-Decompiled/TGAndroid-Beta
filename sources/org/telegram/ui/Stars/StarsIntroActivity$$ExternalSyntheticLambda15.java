package org.telegram.ui.Stars;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.LivePlayer;

public final class StarsIntroActivity$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId = 0;
    public final int f$0;
    public final Object f$1;
    public final long f$2;
    public final long f$3;
    public final Object f$4;
    public final Object f$5;

    public StarsIntroActivity$$ExternalSyntheticLambda15(int i, Context context, long j, long j2, BottomSheet[] bottomSheetArr, Theme.ResourcesProvider resourcesProvider) {
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
                botStarsController.getConnectedBot(context, j, this.f$3, new StarsIntroActivity$$ExternalSyntheticLambda38(bottomSheetArr, context, i, j, resourcesProvider, 0));
                break;
            case 1:
                int[] iArr = (int[]) this.f$5;
                ((MessagesController) this.f$1).lambda$deleteSavedDialog$144(this.f$2, this.f$3, (TLRPC.InputPeer) this.f$4, this.f$0, iArr);
                break;
            case 2:
                BaseFragment baseFragment = (BaseFragment) this.f$4;
                ChatNotificationsPopupWrapper.lambda$addAsItemOptions$18((ItemOptions) this.f$1, this.f$0, this.f$2, this.f$3, baseFragment, (Theme.ResourcesProvider) this.f$5);
                break;
            default:
                int i2 = this.f$0;
                LiveCommentsView liveCommentsView = (LiveCommentsView) this.f$1;
                liveCommentsView.delete(i2);
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f$4;
                if ("BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                    Context context2 = liveCommentsView.getContext();
                    DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
                    long j2 = this.f$3;
                    TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f$5;
                    long j3 = this.f$2;
                    new StarsIntroActivity.StarsNeededSheet(context2, darkThemeResourceProvider, j3, 17, "", new StarGiftSheet$$ExternalSyntheticLambda199(liveCommentsView, j2, tL_textWithEntities, j3, 12), liveCommentsView.dialogId).show();
                } else if (!"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    BulletinFactory.of(liveCommentsView.topBulletinContainer, new DarkThemeResourceProvider()).showForError(tL_error, true);
                } else {
                    LivePlayer livePlayer = liveCommentsView.livePlayer;
                    if (livePlayer != null) {
                        livePlayer.storyDeleted();
                    }
                }
                break;
        }
    }

    public StarsIntroActivity$$ExternalSyntheticLambda15(MessagesController messagesController, long j, long j2, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        this.f$1 = messagesController;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = inputPeer;
        this.f$0 = i;
        this.f$5 = iArr;
    }

    public StarsIntroActivity$$ExternalSyntheticLambda15(ItemOptions itemOptions, int i, long j, long j2, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this.f$1 = itemOptions;
        this.f$0 = i;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = baseFragment;
        this.f$5 = resourcesProvider;
    }

    public StarsIntroActivity$$ExternalSyntheticLambda15(LiveCommentsView liveCommentsView, int i, TLRPC.TL_error tL_error, long j, long j2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f$1 = liveCommentsView;
        this.f$0 = i;
        this.f$4 = tL_error;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$5 = tL_textWithEntities;
    }
}
