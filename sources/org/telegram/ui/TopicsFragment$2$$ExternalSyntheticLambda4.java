package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda42;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;

public final class TopicsFragment$2$$ExternalSyntheticLambda4 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final int f$3;
    public final Object f$4;
    public final long f$5;

    public TopicsFragment$2$$ExternalSyntheticLambda4(int i, long j, Context context, TL_payments.connectedBotStarRef connectedbotstarref, BottomSheet bottomSheet, Theme.ResourcesProvider resourcesProvider) {
        this.f$3 = i;
        this.f$0 = connectedbotstarref;
        this.f$1 = bottomSheet;
        this.f$2 = context;
        this.f$5 = j;
        this.f$4 = resourcesProvider;
    }

    @Override
    public final void run(Object obj) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        Object obj2 = this.f$0;
        Object obj3 = this.f$4;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                TopicsFragment.AnonymousClass2 anonymousClass2 = (TopicsFragment.AnonymousClass2) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj5;
                if (tL_messages_invitedUsers != null) {
                    tL_messages_invitedUsers2.missing_invitees.addAll(tL_messages_invitedUsers.missing_invitees);
                }
                int[] iArr = (int[]) obj4;
                int i = iArr[0] + 1;
                iArr[0] = i;
                if (i == this.f$3) {
                    boolean zIsEmpty = tL_messages_invitedUsers2.missing_invitees.isEmpty();
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    long j = this.f$5;
                    if (!zIsEmpty) {
                        AlertsCreator.checkRestrictedInviteUsers(((BaseFragment) topicsFragment).currentAccount, topicsFragment.getMessagesController().getChat(Long.valueOf(j)), tL_messages_invitedUsers2);
                    } else {
                        BulletinFactory bulletinFactoryOf = BulletinFactory.of(topicsFragment);
                        TLRPC.Chat chat = topicsFragment.getMessagesController().getChat(Long.valueOf(j));
                        ArrayList arrayList = (ArrayList) obj3;
                        bulletinFactoryOf.getClass();
                        if (arrayList.size() == 0) {
                            spannableStringBuilderReplaceTags = null;
                        } else if (arrayList.size() != 1) {
                            spannableStringBuilderReplaceTags = ChatObject.isChannelAndNotMegaGroup(chat) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedMembersToChannel", arrayList.size(), new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedSubscribersToChannel", arrayList.size(), new Object[0]));
                        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                        } else {
                            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                        }
                        bulletinFactoryOf.createUsersBulletin(arrayList, spannableStringBuilderReplaceTags, null, null).show();
                    }
                }
                break;
            default:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                BottomSheet bottomSheet = (BottomSheet) obj5;
                int i2 = this.f$3;
                Context context = (Context) obj4;
                long j2 = this.f$5;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) obj3;
                if (connectedbotstarref != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                    ChannelAffiliateProgramsFragment.showShareAffiliateAlert(context, i2, connectedbotstarref, j2, resourcesProvider);
                } else {
                    TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(((TL_payments.connectedBotStarRef) obj2).bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i2).loadFullUser(user, 0, true, new StarsIntroActivity$$ExternalSyntheticLambda42(bottomSheet, context, i2, j2, resourcesProvider, 2));
                    }
                }
                break;
        }
    }

    public TopicsFragment$2$$ExternalSyntheticLambda4(TopicsFragment.AnonymousClass2 anonymousClass2, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, ArrayList arrayList, long j) {
        this.f$0 = anonymousClass2;
        this.f$1 = tL_messages_invitedUsers;
        this.f$2 = iArr;
        this.f$3 = i;
        this.f$4 = arrayList;
        this.f$5 = j;
    }
}
