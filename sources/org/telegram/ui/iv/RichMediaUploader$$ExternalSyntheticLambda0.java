package org.telegram.ui.iv;

import android.os.Build;
import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ringtone.RingtoneDataStore;
import org.telegram.messenger.ringtone.RingtoneUploader;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Business.AwayMessagesActivity;
import org.telegram.ui.Business.BusinessChatbotController;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.ThemesHorizontalListCell;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.PeerStoriesView$38$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda0;
import org.telegram.ui.web.WebInstantView;

public final class RichMediaUploader$$ExternalSyntheticLambda0 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public RichMediaUploader$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator cacheModel$$ExternalSyntheticLambda0;
        final Comparator cacheModel$$ExternalSyntheticLambda1;
        int i = 28;
        int i2 = 6;
        int i3 = 24;
        int i4 = 11;
        int i5 = 27;
        final int i6 = 0;
        int i7 = 4;
        final int i8 = 1;
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                RichMediaUploader richMediaUploader = (RichMediaUploader) obj;
                richMediaUploader.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(i5, richMediaUploader, tLObject));
                break;
            case 1:
                RingtoneDataStore ringtoneDataStore = (RingtoneDataStore) obj;
                ringtoneDataStore.getClass();
                AndroidUtilities.runOnUIThread(new ClickHelper$$ExternalSyntheticLambda0(5, ringtoneDataStore, tLObject));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2((RingtoneUploader) obj, tLObject, tL_error, i4));
                break;
            case 3:
                ((BaseLocationAdapter) obj).lambda$searchBotUser$3(tLObject, tL_error);
                break;
            case 4:
                ((DialogsSearchAdapter) obj).lambda$searchDialogs$17(tLObject, tL_error);
                break;
            case 5:
                AwayMessagesActivity awayMessagesActivity = (AwayMessagesActivity) obj;
                awayMessagesActivity.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(awayMessagesActivity, tL_error, tLObject, 23));
                break;
            case 6:
                BusinessChatbotController businessChatbotController = (BusinessChatbotController) obj;
                businessChatbotController.getClass();
                AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(i2, businessChatbotController, tLObject));
                break;
            case 7:
                BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) obj;
                businessIntroActivity.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(businessIntroActivity, tL_error, tLObject, i3));
                break;
            case 8:
                GreetMessagesActivity greetMessagesActivity = (GreetMessagesActivity) obj;
                greetMessagesActivity.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(greetMessagesActivity, tL_error, tLObject, i));
                break;
            case 9:
                OpeningHoursActivity openingHoursActivity = (OpeningHoursActivity) obj;
                openingHoursActivity.getClass();
                AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(openingHoursActivity, tL_error, tLObject, 29));
                break;
            case 10:
                QuickRepliesController quickRepliesController = (QuickRepliesController) obj;
                quickRepliesController.getClass();
                AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(i4, quickRepliesController, tLObject));
                break;
            case 11:
                ThemesHorizontalListCell.InnerThemeView innerThemeView = (ThemesHorizontalListCell.InnerThemeView) obj;
                innerThemeView.getClass();
                AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(20, innerThemeView, tLObject));
                break;
            case 12:
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i9 = 0; i9 < tL_help_countriesList.countries.size(); i9++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i9);
                        String str = tL_help_country.name;
                        if (str != null) {
                            tL_help_country.default_name = str;
                        }
                        if (!tL_help_country.hidden && !tL_help_country.iso2.equalsIgnoreCase("FT")) {
                            String upperCase = tL_help_country.default_name.substring(0, 1).toUpperCase();
                            List arrayList2 = (List) map.get(upperCase);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                map.put(upperCase, arrayList2);
                                arrayList.add(upperCase);
                            }
                            arrayList2.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        cacheModel$$ExternalSyntheticLambda0 = new TableModel$$ExternalSyntheticLambda0(collator, i7);
                    } else {
                        cacheModel$$ExternalSyntheticLambda0 = new CacheModel$$ExternalSyntheticLambda0(i7);
                    }
                    Collections.sort(arrayList, cacheModel$$ExternalSyntheticLambda0);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i6) {
                                    case 0:
                                        return cacheModel$$ExternalSyntheticLambda0.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return cacheModel$$ExternalSyntheticLambda0.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66((SelectorBottomSheet$$ExternalSyntheticLambda7) obj, map, arrayList, i7));
                }
                break;
            case 13:
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap map2 = new HashMap();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i10 = 0; i10 < tL_help_countriesList2.countries.size(); i10++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i10);
                        boolean zEqualsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || zEqualsIgnoreCase) {
                            if (zEqualsIgnoreCase) {
                                String string = LocaleController.getString(R.string.Fragment);
                                tL_help_country2.default_name = string;
                                tL_help_country2.name = string;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List arrayList4 = (List) map2.get(upperCase2);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                map2.put(upperCase2, arrayList4);
                                arrayList3.add(upperCase2);
                            }
                            arrayList4.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator2 = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        cacheModel$$ExternalSyntheticLambda1 = new TableModel$$ExternalSyntheticLambda0(collator2, i7);
                    } else {
                        cacheModel$$ExternalSyntheticLambda1 = new CacheModel$$ExternalSyntheticLambda0(i7);
                    }
                    Collections.sort(arrayList3, cacheModel$$ExternalSyntheticLambda1);
                    Iterator it2 = map2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country4 = (TLRPC.TL_help_country) obj3;
                                switch (i8) {
                                    case 0:
                                        return cacheModel$$ExternalSyntheticLambda1.compare(tL_help_country3.default_name, tL_help_country4.default_name);
                                    default:
                                        return cacheModel$$ExternalSyntheticLambda1.compare(tL_help_country3.default_name, tL_help_country4.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66((DialogCell$$ExternalSyntheticLambda6) obj, map2, arrayList3, 7));
                }
                break;
            case 14:
                UserSelectorBottomSheet userSelectorBottomSheet = (UserSelectorBottomSheet) obj;
                userSelectorBottomSheet.getClass();
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(8, userSelectorBottomSheet, tLObject));
                break;
            case 15:
                BotStarsActivity botStarsActivity = (BotStarsActivity) obj;
                botStarsActivity.getClass();
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66(botStarsActivity, tLObject, tL_error, 15));
                break;
            case 16:
                BotStarsController.ChannelConnectedBots channelConnectedBots = (BotStarsController.ChannelConnectedBots) obj;
                channelConnectedBots.getClass();
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(26, channelConnectedBots, tLObject));
                break;
            case 17:
                BotStarsController.ChannelSuggestedBots channelSuggestedBots = (BotStarsController.ChannelSuggestedBots) obj;
                channelSuggestedBots.getClass();
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(i5, channelSuggestedBots, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda17(i4, tLObject, (DialogCell$$ExternalSyntheticLambda6) obj));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda17(12, tLObject, (Utilities.Callback) obj));
                break;
            case 20:
                StarsController.GiftsList giftsList = (StarsController.GiftsList) obj;
                giftsList.getClass();
                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda17(13, giftsList, tLObject));
                break;
            case 21:
                StarsReactionsSheet starsReactionsSheet = (StarsReactionsSheet) obj;
                starsReactionsSheet.getClass();
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(starsReactionsSheet.currentAccount).putMessages(new ArrayList<>(Arrays.asList(starsReactionsSheet.messageObject.messageOwner)), true, true, true, 0, 0, 0L);
                }
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda17(i5, (PeerStoriesView$38$$ExternalSyntheticLambda1) obj, tL_error));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new BotSensors$1$$ExternalSyntheticLambda0((StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda1) obj, 2));
                break;
            case 24:
                StoriesController.SearchStoriesList searchStoriesList = (StoriesController.SearchStoriesList) obj;
                searchStoriesList.getClass();
                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda17(i, searchStoriesList, tLObject));
                break;
            case 25:
                StoriesController.StoriesCollections storiesCollections = (StoriesController.StoriesCollections) obj;
                storiesCollections.getClass();
                AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(i8, storiesCollections, tLObject));
                break;
            case 26:
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) obj;
                chatAttachAlertBotWebViewLayout.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(17, chatAttachAlertBotWebViewLayout, tL_error));
                break;
            case 27:
                RichAIComposeSheet richAIComposeSheet = (RichAIComposeSheet) obj;
                richAIComposeSheet.getClass();
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(22, richAIComposeSheet, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new WebActionBar$$ExternalSyntheticLambda0((WebInstantView.Loader) obj, tLObject, i2));
                break;
        }
    }
}
