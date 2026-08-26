package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.community.CommunitySheet;

public final class ArticleViewer$$ExternalSyntheticLambda57 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;

    public ArticleViewer$$ExternalSyntheticLambda57(int i, BaseFragment baseFragment, Browser.Progress progress, AlertDialog alertDialog) {
        this.$r8$classId = 5;
        this.f$1 = i;
        this.f$0 = baseFragment;
        this.f$2 = progress;
        this.f$3 = alertDialog;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                ArticleViewer.BlockChannelCell blockChannelCell = (ArticleViewer.BlockChannelCell) this.f$0;
                int i = this.f$1;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(blockChannelCell, i, tL_error, (TLRPC.TL_channels_joinChannel) this.f$2, 0));
                } else {
                    boolean z2 = chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk;
                    TLRPC.Chat chat = (TLRPC.Chat) this.f$3;
                    boolean z3 = false;
                    if (z2) {
                        TLRPC.Updates updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i2 = 0;
                        while (true) {
                            if (i2 < updates.updates.size()) {
                                TLRPC.Update update = updates.updates.get(i2);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    z = true;
                                } else {
                                    i2++;
                                }
                            } else {
                                z = false;
                            }
                        }
                        MessagesController.getInstance(i).processUpdates(updates, false);
                        z3 = z;
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(i, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat, 10));
                        z3 = true;
                    }
                    if (!z3) {
                        MessagesController.getInstance(i).generateJoinMessage(chat.id, true);
                    }
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda3(blockChannelCell, 4));
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda74(i, chat, 0), 1000L);
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i);
                    long j = chat.id;
                    messagesStorage.updateDialogsWithDeletedMessages(-j, j, new ArrayList<>(), null);
                }
                break;
            case 1:
                ((AIEditorAlert) this.f$0).lambda$requestRich$32((SimpleTextView) this.f$2, this.f$1, (TLRPC.TL_messages_composeRichMessageWithAI) this.f$3, (TLRPC.TL_composedRichMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ((AIEditorAlert) this.f$0).lambda$request$31((SimpleTextView) this.f$2, this.f$1, (TLRPC.TL_messages_composeMessageWithAI) this.f$3, (TLRPC.TL_composedMessageWithAI) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                boolean[] zArr = (boolean[]) this.f$0;
                if (!zArr[0]) {
                    Utilities.Callback2 callback2 = (Utilities.Callback2) this.f$3;
                    if (str != null) {
                        ArrayList arrayList = (ArrayList) this.f$2;
                        arrayList.set(this.f$1, str);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (arrayList.get(i3) == null) {
                            }
                            break;
                        }
                        zArr[0] = true;
                        callback2.run(TextUtils.join("", arrayList), Boolean.FALSE);
                    } else {
                        zArr[0] = true;
                        callback2.run(null, bool);
                    }
                    break;
                }
                break;
            case 4:
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str2 = (String) obj2;
                ((ButtonWithCounterView) this.f$0).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str2)) {
                    boolean zEqualsIgnoreCase = "EMPTY".equalsIgnoreCase(str2);
                    BottomSheet bottomSheet = (BottomSheet) this.f$3;
                    if (zEqualsIgnoreCase) {
                        AlertDialog.Builder builder = new AlertDialog.Builder((Context) this.f$2, 0, null);
                        String string = LocaleController.getString(R.string.PasskeyNoOptionsTitle);
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.title = string;
                        alertDialog.message = LocaleController.getString(R.string.PasskeyNoOptionsText);
                        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                        alertDialog.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(bottomSheet, 25));
                        builder.show();
                        break;
                    } else {
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            if (str2 != null) {
                                new BulletinFactory(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError(str2, false);
                            } else if (passkey != null) {
                                int i4 = this.f$1;
                                MessagesController.getInstance(i4).removeSuggestion(0L, "SETUP_PASSKEY");
                                if (safeLastFragment instanceof PasskeysActivity) {
                                    bottomSheet.lambda$showGiftOfferSheet$15();
                                    ((PasskeysActivity) safeLastFragment).added(passkey);
                                } else if (safeLastFragment instanceof PrivacySettingsActivity) {
                                    bottomSheet.lambda$showGiftOfferSheet$15();
                                    PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) safeLastFragment;
                                    ArrayList arrayList2 = privacySettingsActivity.currentPasskeys;
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(passkey);
                                    privacySettingsActivity.updateRows(true);
                                    safeLastFragment.presentFragment(new PasskeysActivity(arrayList2));
                                } else {
                                    ConnectionsManager.getInstance(i4).sendRequestTyped(new TL_account.getPasskeys(), new AiTonesController$$ExternalSyntheticLambda0(), new ChatActivity$$ExternalSyntheticLambda464(bottomSheet, passkey, str2, 9));
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            case 5:
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (updates2 != null && tL_error2 == null) {
                    MessagesController.getInstance(this.f$1).processUpdates(updates2, false);
                }
                AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda149((BaseFragment) this.f$0, tL_error2, (Browser.Progress) this.f$2, (AlertDialog) this.f$3, 8));
                break;
            case 6:
                ((int[]) this.f$0)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                boolean z4 = messageMedia instanceof TLRPC.TL_messageMediaEmpty;
                final BotShareSheet$$ExternalSyntheticLambda2 botShareSheet$$ExternalSyntheticLambda2 = (BotShareSheet$$ExternalSyntheticLambda2) this.f$2;
                if (!z4) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage)) {
                            botShareSheet$$ExternalSyntheticLambda2.run(null);
                        } else if (webPage instanceof TLRPC.TL_webPagePending) {
                            final long j2 = webPage.id;
                            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.f$3;
                            final int i5 = this.f$1;
                            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = new NotificationCenter.NotificationCenterDelegate() {
                                @Override
                                public final void didReceivedNotification(int i6, int i7, Object... objArr) {
                                    LongSparseArray longSparseArray;
                                    int i8 = NotificationCenter.didReceivedWebpagesInUpdates;
                                    if (i6 != i8 || (longSparseArray = (LongSparseArray) objArr[0]) == null) {
                                        return;
                                    }
                                    long j3 = j2;
                                    if (longSparseArray.containsKey(j3)) {
                                        TLRPC.WebPage webPage2 = (TLRPC.WebPage) longSparseArray.get(j3);
                                        NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr2 = notificationCenterDelegateArr;
                                        if (notificationCenterDelegateArr2[0] != null) {
                                            NotificationCenter.getInstance(i5).addObserver(notificationCenterDelegateArr2[0], i8);
                                            notificationCenterDelegateArr2[0] = null;
                                        }
                                        if (!(webPage2 instanceof TLRPC.TL_webPage)) {
                                            webPage2 = null;
                                        }
                                        botShareSheet$$ExternalSyntheticLambda2.run(webPage2);
                                    }
                                }
                            };
                            notificationCenterDelegateArr[0] = notificationCenterDelegate;
                            NotificationCenter.getInstance(i5).addObserver(notificationCenterDelegate, NotificationCenter.didReceivedWebpagesInUpdates);
                        } else {
                            botShareSheet$$ExternalSyntheticLambda2.run(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                        }
                    }
                }
                botShareSheet$$ExternalSyntheticLambda2.run(null);
                break;
            default:
                ArrayList arrayList3 = (ArrayList) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.f$0;
                AlertDialog alertDialog2 = alertDialogArr[0];
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                    alertDialogArr[0] = null;
                }
                BaseFragment baseFragment = (BaseFragment) this.f$2;
                if (tL_error3 != null) {
                    BulletinFactory.of(baseFragment).showForError(false, tL_error3);
                } else if (arrayList3 != null) {
                    if (arrayList3.isEmpty()) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.CommunityNoChatsToAdd, BulletinFactory.of(baseFragment), R.raw.info, 36);
                    } else if (arrayList3.isEmpty()) {
                        BulletinFactory.of(baseFragment).createSimpleBulletinWithIconSize(R.raw.info, 36, "").show();
                    } else {
                        baseFragment.showDialog(new CommunitySheet(baseFragment, 0L, arrayList3, new CacheControlActivity$$ExternalSyntheticLambda23(baseFragment, (TLRPC.Chat) this.f$3, this.f$1, 5)));
                    }
                }
                break;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda57(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
        this.f$3 = obj3;
    }

    public ArticleViewer$$ExternalSyntheticLambda57(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = i;
    }

    public ArticleViewer$$ExternalSyntheticLambda57(ArticleViewer.BlockChannelCell blockChannelCell, int i, TLRPC.TL_channels_joinChannel tL_channels_joinChannel, TLRPC.Chat chat) {
        this.$r8$classId = 0;
        this.f$0 = blockChannelCell;
        this.f$1 = i;
        this.f$2 = tL_channels_joinChannel;
        this.f$3 = chat;
    }
}
