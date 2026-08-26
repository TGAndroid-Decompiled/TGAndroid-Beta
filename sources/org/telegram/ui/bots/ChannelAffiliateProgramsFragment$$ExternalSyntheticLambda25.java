package org.telegram.ui.bots;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatUsersActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda25 implements Runnable {
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

    public ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda25(ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter, int i, TLRPC.TL_error tL_error, TLObject tLObject, AccountInstance accountInstance, boolean z, String str, ArrayList arrayList, long j, long j2, ArrayList arrayList2, ArrayList arrayList3) {
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
        TL_payments.connectedBotStarRef connectedbotstarref;
        BaseFragment safeLastFragment;
        int i;
        Object obj = this.f$10;
        Object obj2 = this.f$9;
        long j = this.f$6;
        Object obj3 = this.f$8;
        Object obj4 = this.f$5;
        boolean z = this.f$7;
        Object obj5 = this.f$4;
        TLObject tLObject = this.f$1;
        TLRPC.TL_error tL_error = this.f$11;
        Object obj6 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ButtonWithCounterView) obj6).setLoading(false);
                BottomSheet bottomSheet = (BottomSheet) obj5;
                Theme.ResourcesProvider resourcesProvider = (Theme.ResourcesProvider) obj2;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i2 = this.f$2;
                    BotStarsController botStarsController = BotStarsController.getInstance(i2);
                    long j2 = this.f$3;
                    BotStarsController.ChannelConnectedBots channelConnectedBots = botStarsController.getChannelConnectedBots(j2);
                    int i3 = channelConnectedBots.currentAccount;
                    MessagesController.getInstance(i3).putUsers(connectedstarrefbots.users, false);
                    channelConnectedBots.count = 0;
                    channelConnectedBots.error = false;
                    channelConnectedBots.endReached = false;
                    ArrayList arrayList = channelConnectedBots.bots;
                    arrayList.clear();
                    if (channelConnectedBots.reqId != 0) {
                        ConnectionsManager.getInstance(i3).cancelRequest(channelConnectedBots.reqId, true);
                        channelConnectedBots.reqId = 0;
                    }
                    channelConnectedBots.loading = false;
                    channelConnectedBots.count = connectedstarrefbots.count;
                    arrayList.addAll(connectedstarrefbots.connected_bots);
                    channelConnectedBots.endReached = connectedstarrefbots.connected_bots.isEmpty() || arrayList.size() >= channelConnectedBots.count;
                    channelConnectedBots.error = false;
                    NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(channelConnectedBots.dialogId));
                    channelConnectedBots.load();
                    bottomSheet.lambda$showGiftOfferSheet$15();
                    int i4 = 0;
                    while (true) {
                        if (i4 < connectedstarrefbots.connected_bots.size()) {
                            connectedbotstarref = connectedstarrefbots.connected_bots.get(i4);
                            if (connectedbotstarref.bot_id != ((TL_payments.starRefProgram) obj4).bot_id) {
                                i4++;
                            }
                        } else {
                            connectedbotstarref = null;
                        }
                    }
                    if ((j != j2 || z) && (safeLastFragment = LaunchActivity.getSafeLastFragment()) != null && (!(safeLastFragment instanceof ChannelAffiliateProgramsFragment) || ((ChannelAffiliateProgramsFragment) safeLastFragment).dialogId != j2)) {
                        safeLastFragment.presentFragment(new ChannelAffiliateProgramsFragment(j2));
                    }
                    if (connectedbotstarref != null) {
                        BotStarsController.ChannelSuggestedBots channelSuggestedBots = BotStarsController.getInstance(i2).getChannelSuggestedBots(j2);
                        long j3 = connectedbotstarref.bot_id;
                        int i5 = 0;
                        while (true) {
                            ArrayList arrayList2 = channelSuggestedBots.bots;
                            if (i5 < arrayList2.size()) {
                                if (((TL_payments.starRefProgram) arrayList2.get(i5)).bot_id == j3) {
                                    arrayList2.remove(i5);
                                    channelSuggestedBots.count--;
                                    NotificationCenter.getInstance(channelSuggestedBots.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(channelSuggestedBots.dialogId));
                                } else {
                                    i5++;
                                }
                            }
                        }
                        new BulletinFactory(ChannelAffiliateProgramsFragment.showShareAffiliateAlert((Context) obj3, i2, connectedbotstarref, j2, resourcesProvider).topBulletinContainer, resourcesProvider).createUsersBulletin(Arrays.asList((TLRPC.User) obj), LocaleController.getString(R.string.AffiliateProgramJoinedTitle), LocaleController.getString(R.string.AffiliateProgramJoinedText), null).show();
                    }
                } else if (tL_error != null) {
                    zzlu.m(bottomSheet.topBulletinContainer, resourcesProvider, tL_error);
                }
                break;
            default:
                ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = (ChatAttachAlertDocumentLayout.SearchAdapter) obj6;
                if (this.f$2 == searchAdapter.requestIndex) {
                    searchAdapter.isLoading = false;
                    ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
                    if (tL_error == null) {
                        chatAttachAlertDocumentLayout.emptyView.showProgress(false, true);
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        searchAdapter.nextSearchRate = messages_messages.next_rate;
                        AccountInstance accountInstance = (AccountInstance) obj5;
                        accountInstance.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        accountInstance.getMessagesController().putUsers(messages_messages.users, false);
                        accountInstance.getMessagesController().putChats(messages_messages.chats, false);
                        ArrayList arrayList3 = searchAdapter.sections;
                        SparseArray sparseArray = searchAdapter.messagesById;
                        HashMap map = searchAdapter.sectionArrays;
                        ArrayList arrayList4 = searchAdapter.messages;
                        if (!z) {
                            arrayList4.clear();
                            sparseArray.clear();
                            arrayList3.clear();
                            map.clear();
                        }
                        int size = messages_messages.count;
                        String str = (String) obj4;
                        searchAdapter.currentDataQuery = str;
                        ArrayList arrayList5 = (ArrayList) obj3;
                        int size2 = arrayList5.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            int i7 = i6;
                            MessageObject messageObject = (MessageObject) arrayList5.get(i6);
                            Object obj7 = obj2;
                            ArrayList arrayList6 = (ArrayList) map.get(messageObject.monthKey);
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                                map.put(messageObject.monthKey, arrayList6);
                                arrayList3.add(messageObject.monthKey);
                            }
                            arrayList6.add(messageObject);
                            arrayList4.add(messageObject);
                            sparseArray.put(messageObject.getId(), messageObject);
                            i6 = i7 + 1;
                            obj2 = obj7;
                            j = j;
                        }
                        Object obj8 = obj2;
                        long j4 = j;
                        if (arrayList4.size() > size) {
                            size = arrayList4.size();
                        }
                        searchAdapter.endReached = arrayList4.size() >= size;
                        if (arrayList4.isEmpty()) {
                            boolean zIsEmpty = TextUtils.isEmpty(searchAdapter.currentDataQuery);
                            ChatAttachAlertDocumentLayout.AnonymousClass3 anonymousClass3 = chatAttachAlertDocumentLayout.emptyView;
                            if (zIsEmpty && this.f$3 == 0 && j4 == 0) {
                                anonymousClass3.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle));
                                LinkSpanDrawable.LinksTextView linksTextView = anonymousClass3.subtitle;
                                linksTextView.setVisibility(0);
                                linksTextView.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitleFiles));
                            } else {
                                anonymousClass3.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                                LinkSpanDrawable.LinksTextView linksTextView2 = anonymousClass3.subtitle;
                                linksTextView2.setVisibility(0);
                                linksTextView2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                            }
                        }
                        if (!z) {
                            ArrayList arrayList7 = searchAdapter.localTipChats;
                            arrayList7.clear();
                            ArrayList arrayList8 = (ArrayList) obj8;
                            if (arrayList8 != null) {
                                arrayList7.addAll(arrayList8);
                            }
                            if (str.length() >= 3 && (LocaleController.getString(R.string.SavedMessages).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= arrayList7.size()) {
                                        arrayList7.add(0, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                    } else if (!(arrayList7.get(i8) instanceof TLRPC.User) || UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != ((TLRPC.User) arrayList7.get(i8)).id) {
                                        i8++;
                                    }
                                }
                            }
                            ArrayList arrayList9 = searchAdapter.localTipDates;
                            arrayList9.clear();
                            arrayList9.addAll((ArrayList) obj);
                            searchAdapter.updateFiltersView(arrayList7, arrayList9, TextUtils.isEmpty(searchAdapter.currentDataQuery));
                        }
                        View view = null;
                        int childAdapterPosition = -1;
                        int i9 = 0;
                        while (true) {
                            ChatAttachAlertDocumentLayout.AnonymousClass4 anonymousClass4 = chatAttachAlertDocumentLayout.listView;
                            if (i9 >= size2) {
                                if (view != null) {
                                    anonymousClass4.removeView(view);
                                }
                                if (chatAttachAlertDocumentLayout.loadingView.getVisibility() == 0) {
                                    i = 1;
                                    if (anonymousClass4.getChildCount() <= 1) {
                                        chatAttachAlertDocumentLayout.getViewTreeObserver().addOnPreDrawListener(new ChatUsersActivity.AnonymousClass12(searchAdapter, (FlickerLoadingView) view, childAdapterPosition, i));
                                    }
                                    searchAdapter.notifyDataSetChanged();
                                } else {
                                    i = 1;
                                }
                                if (view != null) {
                                    chatAttachAlertDocumentLayout.getViewTreeObserver().addOnPreDrawListener(new ChatUsersActivity.AnonymousClass12(searchAdapter, (FlickerLoadingView) view, childAdapterPosition, i));
                                }
                                searchAdapter.notifyDataSetChanged();
                            } else {
                                View childAt = anonymousClass4.getChildAt(i9);
                                if (childAt instanceof FlickerLoadingView) {
                                    childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                                    view = childAt;
                                }
                                i9++;
                            }
                        }
                    } else {
                        chatAttachAlertDocumentLayout.emptyView.title.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
                        ChatAttachAlertDocumentLayout.AnonymousClass3 anonymousClass5 = chatAttachAlertDocumentLayout.emptyView;
                        anonymousClass5.subtitle.setVisibility(0);
                        anonymousClass5.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                        anonymousClass5.showProgress(false, true);
                    }
                    break;
                }
                break;
        }
    }

    public ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda25(ButtonWithCounterView buttonWithCounterView, TLObject tLObject, int i, long j, BottomSheet bottomSheet, TL_payments.starRefProgram starrefprogram, long j2, boolean z, Context context, Theme.ResourcesProvider resourcesProvider, TLRPC.User user, TLRPC.TL_error tL_error) {
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
