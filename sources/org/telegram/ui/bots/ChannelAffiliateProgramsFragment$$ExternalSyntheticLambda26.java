package org.telegram.ui.bots;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda26 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final TLObject f$1;
    public final Object f$10;
    public final TLRPC.TL_error f$11;
    public final int f$2;
    public final long f$3;
    public final Object f$4;
    public final Object f$5;
    public final long f$6;
    public final boolean f$7;
    public final Object f$8;
    public final Object f$9;

    public ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda26(ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter, int i, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z, String str, ArrayList arrayList, long j, long j2, ArrayList arrayList2, ArrayList arrayList3) {
        this.f$0 = searchAdapter;
        this.f$2 = i;
        this.f$11 = tL_error;
        this.f$1 = tLObject;
        this.f$4 = accountInstance;
        this.f$7 = z;
        this.f$5 = str;
        this.f$8 = arrayList;
        this.f$3 = j;
        this.f$6 = j2;
        this.f$9 = arrayList2;
        this.f$10 = arrayList3;
    }

    @Override
    public final void run() {
        char c;
        TL_payments.connectedBotStarRef connectedbotstarref;
        BaseFragment safeLastFragment;
        Object obj = this.f$10;
        Object obj2 = this.f$9;
        Object obj3 = this.f$5;
        Object obj4 = this.f$4;
        Object obj5 = this.f$8;
        Object obj6 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ButtonWithCounterView) obj6).setLoading(false);
                TLObject tLObject = this.f$1;
                BottomSheet bottomSheet = (BottomSheet) obj4;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) obj2;
                if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
                    TLRPC.TL_error tL_error = this.f$11;
                    if (tL_error != null) {
                        BulletinFactory.of(bottomSheet.topBulletinContainer, resourcesProvider).showForError(tL_error);
                    }
                } else {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i = this.f$2;
                    BotStarsController botStarsController = BotStarsController.getInstance(i);
                    long j = this.f$3;
                    BotStarsController.ChannelConnectedBots channelConnectedBots = botStarsController.getChannelConnectedBots(j);
                    int i2 = channelConnectedBots.currentAccount;
                    MessagesController.getInstance(i2).putUsers(connectedstarrefbots.users, false);
                    channelConnectedBots.count = 0;
                    channelConnectedBots.error = false;
                    channelConnectedBots.endReached = false;
                    ArrayList arrayList = channelConnectedBots.bots;
                    arrayList.clear();
                    if (channelConnectedBots.reqId != 0) {
                        ConnectionsManager.getInstance(i2).cancelRequest(channelConnectedBots.reqId, true);
                        channelConnectedBots.reqId = 0;
                    }
                    channelConnectedBots.loading = false;
                    channelConnectedBots.count = connectedstarrefbots.count;
                    arrayList.addAll(connectedstarrefbots.connected_bots);
                    channelConnectedBots.endReached = connectedstarrefbots.connected_bots.isEmpty() || arrayList.size() >= channelConnectedBots.count;
                    channelConnectedBots.error = false;
                    NotificationCenter.getInstance(i2).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(channelConnectedBots.dialogId));
                    channelConnectedBots.load();
                    bottomSheet.lambda$showGiftOfferSheet$15();
                    int i3 = 0;
                    while (true) {
                        if (i3 < connectedstarrefbots.connected_bots.size()) {
                            connectedbotstarref = connectedstarrefbots.connected_bots.get(i3);
                            c = 0;
                            if (connectedbotstarref.bot_id != ((TL_payments.starRefProgram) obj3).bot_id) {
                                i3++;
                            }
                        } else {
                            c = 0;
                            connectedbotstarref = null;
                        }
                    }
                    if ((this.f$6 != j || this.f$7) && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null && (!(safeLastFragment instanceof ChannelAffiliateProgramsFragment) || ((ChannelAffiliateProgramsFragment) safeLastFragment).dialogId != j)) {
                        safeLastFragment.presentFragment(new ChannelAffiliateProgramsFragment(j));
                    }
                    if (connectedbotstarref != null) {
                        BotStarsController.ChannelSuggestedBots channelSuggestedBots = BotStarsController.getInstance(i).getChannelSuggestedBots(j);
                        long j2 = connectedbotstarref.bot_id;
                        int i4 = 0;
                        while (true) {
                            ArrayList arrayList2 = channelSuggestedBots.bots;
                            if (i4 < arrayList2.size()) {
                                if (((TL_payments.starRefProgram) arrayList2.get(i4)).bot_id == j2) {
                                    arrayList2.remove(i4);
                                    channelSuggestedBots.count--;
                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(channelSuggestedBots.currentAccount);
                                    int i5 = NotificationCenter.channelSuggestedBotsUpdate;
                                    Object[] objArr = new Object[1];
                                    objArr[c] = Long.valueOf(channelSuggestedBots.dialogId);
                                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i5, objArr);
                                } else {
                                    i4++;
                                }
                            }
                        }
                        BulletinFactory.of(ChannelAffiliateProgramsFragment.showShareAffiliateAlert((Context) obj5, i, connectedbotstarref, j, resourcesProvider).topBulletinContainer, resourcesProvider).createUsersBulletin((TLRPC.User) obj, LocaleController.getString(R.string.AffiliateProgramJoinedTitle), LocaleController.getString(R.string.AffiliateProgramJoinedText)).show();
                    }
                }
                break;
            default:
                ((ChatAttachAlertDocumentLayout.SearchAdapter) obj6).lambda$searchGlobal$2(this.f$2, this.f$11, this.f$1, (AccountInstance) obj4, this.f$7, (String) obj3, (ArrayList) obj5, this.f$3, this.f$6, (ArrayList) obj2, (ArrayList) obj);
                break;
        }
    }

    public ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda26(ButtonWithCounterView buttonWithCounterView, TLObject tLObject, int i, long j, BottomSheet bottomSheet, TL_payments.starRefProgram starrefprogram, long j2, boolean z, Context context, Theme.ResourcesProvider resourcesProvider, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.f$0 = buttonWithCounterView;
        this.f$1 = tLObject;
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = bottomSheet;
        this.f$5 = starrefprogram;
        this.f$6 = j2;
        this.f$7 = z;
        this.f$8 = context;
        this.f$9 = resourcesProvider;
        this.f$10 = user;
        this.f$11 = tL_error;
    }
}
