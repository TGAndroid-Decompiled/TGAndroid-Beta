package org.telegram.ui;

import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AIEditorAlert;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Gifts.AuctionJoinSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda102;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda57;
import org.telegram.ui.web.BotWebViewContainer;

public final class ChatActivity$$ExternalSyntheticLambda464 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ChatActivity$$ExternalSyntheticLambda464(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        ButtonSpan buttonSpan;
        ButtonSpan buttonSpan2;
        final int i = 1;
        final int i2 = 0;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        Object obj5 = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                Boolean bool = (Boolean) obj;
                TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                ChatActivity chatActivity = (ChatActivity) obj4;
                chatActivity.getClass();
                if (bool.booleanValue() && !(webPage instanceof TLRPC.TL_webPagePending)) {
                    Iterator it = chatActivity.lastLinkPreviewResults.keySet().iterator();
                    while (it.hasNext() && chatActivity.lastLinkPreviewResults.size() > 5) {
                        it.next();
                        it.remove();
                    }
                    chatActivity.lastLinkPreviewResults.put(((TL_account.getWebPagePreview) obj5).message, webPage);
                }
                ((ChatActivity$$ExternalSyntheticLambda293) obj3).run(bool, webPage);
                break;
            case 1:
                ((ConnectionsManager) obj4).lambda$sendRequestTypedAndProcessUpdates$5((Executor) obj5, (Utilities.Callback2) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 2:
                ((float[]) obj4)[0] = ((Float) obj).floatValue();
                ((boolean[]) obj5)[0] = ((Boolean) obj2).booleanValue();
                ChatActivity$$ExternalSyntheticLambda271 chatActivity$$ExternalSyntheticLambda271 = (ChatActivity$$ExternalSyntheticLambda271) obj3;
                AndroidUtilities.cancelRunOnUIThread(chatActivity$$ExternalSyntheticLambda271);
                AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda271);
                break;
            case 3:
                ((AIEditorAlert) obj4).lambda$new$5((Browser.Progress) obj5, (TL_aicompose.TL_aiComposeTone) obj3);
                break;
            case 4:
                ((AIEditorAlert.AiStyleAlert) obj4).lambda$new$2((Theme.ResourcesProvider) obj5, (TL_aicompose.AiComposeTone) obj3, (TLRPC.TL_error) obj2);
                break;
            case 5:
                ((AIEditorAlert.CreateAiStyleAlert) obj4).lambda$new$3((Browser.Progress) obj5, (AlertDialog) obj3);
                break;
            case 6:
                BaseFragment baseFragment = (BaseFragment) obj;
                final Long l = (Long) obj2;
                final DialogsActivity dialogsActivity = (DialogsActivity) obj4;
                dialogsActivity.getClass();
                ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) obj5;
                AlertDialog alertDialog = (AlertDialog) obj3;
                Utilities.doCallbacks(new GiftSheet$$ExternalSyntheticLambda23(dialogsActivity, l, channelCreateActivity, baseFragment, 11), new ArticleViewer$$ExternalSyntheticLambda33(dialogsActivity, alertDialog, l, 10), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        switch (i2) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                DialogsActivity dialogsActivity2 = dialogsActivity;
                                if (dialogsActivity2.requestPeerType.bot_admin_rights == null) {
                                    runnable.run();
                                } else {
                                    TLRPC.User user = dialogsActivity2.getMessagesController().getUser(Long.valueOf(dialogsActivity2.requestPeerBotId));
                                    MessagesController messagesController = dialogsActivity2.getMessagesController();
                                    long jLongValue = l.longValue();
                                    TLRPC.RequestPeerType requestPeerType = dialogsActivity2.requestPeerType;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(jLongValue, user, tL_chatAdminRights, null, false, dialogsActivity2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new ChatActivity$$ExternalSyntheticLambda177(11, runnable));
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                DialogsActivity dialogsActivity3 = dialogsActivity;
                                if (dialogsActivity3.requestPeerType.user_admin_rights == null) {
                                    runnable2.run();
                                } else {
                                    MessagesController messagesController2 = dialogsActivity3.getMessagesController();
                                    Long l2 = l;
                                    dialogsActivity3.getMessagesController().setUserAdminRole(l2.longValue(), dialogsActivity3.getAccountInstance().getUserConfig().getCurrentUser(), ChatRightsEditActivity.rightsOR(messagesController2.getChat(l2).admin_rights, dialogsActivity3.requestPeerType.user_admin_rights), null, true, dialogsActivity3, false, true, null, runnable2, new ChatActivity$$ExternalSyntheticLambda177(10, runnable2));
                                }
                                break;
                        }
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj6) {
                        switch (i) {
                            case 0:
                                Runnable runnable = (Runnable) obj6;
                                DialogsActivity dialogsActivity2 = dialogsActivity;
                                if (dialogsActivity2.requestPeerType.bot_admin_rights == null) {
                                    runnable.run();
                                } else {
                                    TLRPC.User user = dialogsActivity2.getMessagesController().getUser(Long.valueOf(dialogsActivity2.requestPeerBotId));
                                    MessagesController messagesController = dialogsActivity2.getMessagesController();
                                    long jLongValue = l.longValue();
                                    TLRPC.RequestPeerType requestPeerType = dialogsActivity2.requestPeerType;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
                                    Boolean bool2 = requestPeerType.bot_participant;
                                    messagesController.setUserAdminRole(jLongValue, user, tL_chatAdminRights, null, false, dialogsActivity2, bool2 == null || !bool2.booleanValue(), true, null, runnable, new ChatActivity$$ExternalSyntheticLambda177(11, runnable));
                                }
                                break;
                            default:
                                Runnable runnable2 = (Runnable) obj6;
                                DialogsActivity dialogsActivity3 = dialogsActivity;
                                if (dialogsActivity3.requestPeerType.user_admin_rights == null) {
                                    runnable2.run();
                                } else {
                                    MessagesController messagesController2 = dialogsActivity3.getMessagesController();
                                    Long l2 = l;
                                    dialogsActivity3.getMessagesController().setUserAdminRole(l2.longValue(), dialogsActivity3.getAccountInstance().getUserConfig().getCurrentUser(), ChatRightsEditActivity.rightsOR(messagesController2.getChat(l2).admin_rights, dialogsActivity3.requestPeerType.user_admin_rights), null, true, dialogsActivity3, false, true, null, runnable2, new ChatActivity$$ExternalSyntheticLambda177(10, runnable2));
                                }
                                break;
                        }
                    }
                }, new ChatActivity$$ExternalSyntheticLambda155(dialogsActivity, alertDialog, l, channelCreateActivity, baseFragment, 4));
                break;
            case 7:
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                AuctionJoinSheet auctionJoinSheet = (AuctionJoinSheet) obj4;
                auctionJoinSheet.getClass();
                HintView2[] hintView2Arr = (HintView2[]) obj5;
                HintView2 hintView2 = hintView2Arr[0];
                if (hintView2 != null) {
                    hintView2.hide(true);
                }
                CharSequence charSequenceReplaceTags = AndroidUtilities.replaceTags(charSequence);
                float x = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof ButtonSpan.TextViewButtons) {
                    Layout layout = ((ButtonSpan.TextViewButtons) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        ButtonSpan[] buttonSpanArr = (ButtonSpan[]) spanned.getSpans(0, text.length(), ButtonSpan.class);
                        if (buttonSpanArr.length > 0 && (buttonSpan = buttonSpanArr[0]) != null) {
                            int spanStart = spanned.getSpanStart(buttonSpan);
                            x += layout.getPrimaryHorizontal(spanStart) + (buttonSpanArr[0].getSize() / 2);
                            y += layout.getLineTop(layout.getLineForOffset(spanStart));
                        }
                    }
                }
                HintView2 hintView3 = new HintView2(auctionJoinSheet.getContext(), 3);
                hintView2Arr[0] = hintView3;
                hintView3.setMultilineText(true);
                hintView3.setInnerPadding(11.0f, 8.0f, 11.0f, 7.0f);
                hintView3.setRounding(10.0f);
                hintView3.setText(charSequenceReplaceTags);
                hintView3.onHidden = new PhotoViewer$$ExternalSyntheticLambda127(hintView3, 2);
                hintView3.setTranslationY((-AndroidUtilities.dp(100.0f)) + y);
                hintView3.textMaxWidth = AndroidUtilities.dp(300.0f);
                hintView3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                hintView3.setJointPx(0.0f, x - AndroidUtilities.dp(4.0f));
                ((FrameLayout) obj3).addView(hintView3, LayoutHelper.createFrame(-1, 100, 55));
                hintView3.show();
                break;
            case 8:
                ResaleGiftsFragment.SelectGiftSheet selectGiftSheet = (ResaleGiftsFragment.SelectGiftSheet) obj4;
                selectGiftSheet.getClass();
                ((Browser.Progress) obj5).end();
                if (((Boolean) obj).booleanValue()) {
                    StarGiftSheet$$ExternalSyntheticLambda102 starGiftSheet$$ExternalSyntheticLambda102 = selectGiftSheet.onSelect;
                    if (starGiftSheet$$ExternalSyntheticLambda102 != null) {
                        starGiftSheet$$ExternalSyntheticLambda102.run((TL_stars.TL_starGiftUnique) obj3);
                    }
                    selectGiftSheet.lambda$showGiftOfferSheet$15();
                }
                break;
            case 9:
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                BottomSheet bottomSheet = (BottomSheet) obj4;
                if (passkeys == null) {
                    if (tL_error != null) {
                        new BulletinFactory(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError((String) obj3, false);
                    }
                    break;
                } else {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                    while (true) {
                        TL_account.Passkey passkey = (TL_account.Passkey) obj5;
                        if (i2 >= passkeys.passkeys.size()) {
                            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment != null) {
                                PasskeysActivity passkeysActivity = new PasskeysActivity(passkeys.passkeys);
                                safeLastFragment.presentFragment(passkeysActivity);
                                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(27, passkeysActivity, passkey), 150L);
                                break;
                            }
                        } else {
                            if (TextUtils.equals(passkeys.passkeys.get(i2).id, passkey.id)) {
                                passkeys.passkeys.remove(i2);
                                i2--;
                            }
                            i2++;
                        }
                    }
                }
                break;
            case 10:
                ((GiftOfferSheet) obj4).lambda$openConfirmAlert$8((Browser.Progress) obj5, (AlertDialog) obj3, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 11:
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj4;
                starGiftSheet.getClass();
                HintView2[] hintView2Arr2 = (HintView2[]) obj5;
                HintView2 hintView4 = hintView2Arr2[0];
                if (hintView4 != null) {
                    hintView4.hide(true);
                }
                CharSequence charSequenceReplaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x2 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y2 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof ButtonSpan.TextViewButtons) {
                    Layout layout2 = ((ButtonSpan.TextViewButtons) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        ButtonSpan[] buttonSpanArr2 = (ButtonSpan[]) spanned2.getSpans(0, text2.length(), ButtonSpan.class);
                        if (buttonSpanArr2.length > 0 && (buttonSpan2 = buttonSpanArr2[0]) != null) {
                            int spanStart2 = spanned2.getSpanStart(buttonSpan2);
                            x2 = layout2.getPrimaryHorizontal(spanStart2) + (buttonSpanArr2[0].getSize() / 2) + x2;
                            y2 += layout2.getLineTop(layout2.getLineForOffset(spanStart2));
                        }
                    }
                }
                HintView2 hintView5 = new HintView2(starGiftSheet.getContext(), 3);
                hintView2Arr2[0] = hintView5;
                hintView5.setMultilineText(true);
                hintView5.setInnerPadding(11.0f, 8.0f, 11.0f, 7.0f);
                hintView5.setRounding(10.0f);
                hintView5.setText(charSequenceReplaceTags2);
                hintView5.onHidden = new PhotoViewer$$ExternalSyntheticLambda127(hintView5, 5);
                hintView5.setTranslationY((-AndroidUtilities.dp(100.0f)) + y2);
                hintView5.textMaxWidth = AndroidUtilities.dp(300.0f);
                hintView5.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                hintView5.setJointPx(0.0f, x2 - AndroidUtilities.dp(4.0f));
                ((FrameLayout) obj3).addView(hintView5, LayoutHelper.createFrame(-1, 100, 55));
                hintView5.show();
                break;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str = (String) obj5;
                final BotWebViewContainer botWebViewContainer = (BotWebViewContainer) obj4;
                if (updates == null) {
                    Theme.ResourcesProvider resourcesProvider = botWebViewContainer.resourcesProvider;
                    if (tL_error2 == null) {
                        new BulletinFactory(botWebViewContainer, resourcesProvider).showForError("UNKNOWN_BUTTON", false);
                        botWebViewContainer.notifyEvent("requested_chat_failed", BotWebViewContainer.obj(str, "req_id"));
                    } else {
                        new BulletinFactory(botWebViewContainer, resourcesProvider).showForError(false, tL_error2);
                        botWebViewContainer.notifyEvent("requested_chat_failed", BotWebViewContainer.obj(str, "req_id"));
                    }
                } else {
                    MessagesController.getInstance(botWebViewContainer.currentAccount).processUpdates(updates, false);
                    botWebViewContainer.notifyEvent("requested_chat_sent", BotWebViewContainer.obj(str, "req_id"));
                    final long j = botWebViewContainer.botUser.id;
                    Bundle bundle = new Bundle();
                    final TLRPC.User user = (TLRPC.User) obj3;
                    bundle.putLong("user_id", user.id);
                    ChatActivity chatActivity2 = new ChatActivity(bundle) {
                        public boolean shownToast;
                        public final long val$managerId;
                        public final TLRPC.User val$newBot;

                        public AnonymousClass6(Bundle bundle2) {
                            super(bundle2);
                            user = user;
                            j = j;
                        }

                        @Override
                        public final void onBecomeFullyVisible() {
                            super.onBecomeFullyVisible();
                            if (this.shownToast) {
                                return;
                            }
                            this.shownToast = true;
                            BulletinFactory.of(this).createSimpleBulletin(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(user)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(BotWebViewContainer.this.botUser)), new RichEditor$$ExternalSyntheticLambda57(this, j, 3)), R.raw.contact_check).show();
                        }
                    };
                    BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment2 != null) {
                        safeLastFragment2.presentFragment(chatActivity2);
                    }
                    BotWebViewContainer.Delegate delegate = botWebViewContainer.delegate;
                    if (delegate != null) {
                        delegate.onCloseToTabs();
                    }
                }
                break;
        }
    }
}
