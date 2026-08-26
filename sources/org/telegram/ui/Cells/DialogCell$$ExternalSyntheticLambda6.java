package org.telegram.ui.Cells;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.TextureView;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda74;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.BusinessRecipientsHelper;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.GreetMessagesActivity;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.ChannelColorActivity;
import org.telegram.ui.ChannelColorActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda151;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda488;
import org.telegram.ui.ChatRightsEditActivity;
import org.telegram.ui.ChatUsersActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CaptionPhotoViewer;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DialogsBotsAdapter;
import org.telegram.ui.Components.HintView$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.Paint.Input;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.Painting$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Shape;
import org.telegram.ui.Components.Paint.Views.StoryLinkPreviewDialog;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.PhonebookShareAlert;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.PaintView;

public final class DialogCell$$ExternalSyntheticLambda6 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public DialogCell$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        UniversalAdapter universalAdapter;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        switch (this.$r8$classId) {
            case 0:
                ((DialogCell) this.f$0).updatePremiumBlocked(true);
                break;
            case 1:
                ((DialogsAdapter) this.f$0).onOpenBot((TLRPC.User) obj);
                break;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                SearchViewPager.AnonymousClass1 anonymousClass1 = (SearchViewPager.AnonymousClass1) ((DialogsSearchAdapter) this.f$0);
                if (user != null) {
                    DialogsActivity.AnonymousClass47 anonymousClass47 = anonymousClass1.this$0;
                    DialogsActivity dialogsActivity = anonymousClass47.parent;
                    if (dialogsActivity != null) {
                        dialogsActivity.closeSearching();
                    }
                    MessagesController.getInstance(anonymousClass47.currentAccount).openApp(user, 0);
                    anonymousClass1.putRecentSearch(user.id, user);
                    break;
                }
                break;
            case 3:
                ArticleViewer.Sheet sheet = (ArticleViewer.Sheet) this.f$0;
                sheet.getClass();
                ArticleViewer.this.keyboardVisible = ((Integer) obj).intValue() - AndroidUtilities.navigationBarHeight > AndroidUtilities.dp(20.0f);
                break;
            case 4:
                BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) this.f$0;
                businessIntroActivity.getClass();
                boolean z = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (businessIntroActivity.keyboardVisible != z) {
                    businessIntroActivity.keyboardVisible = z;
                    if (!z) {
                        businessIntroActivity.listView.smoothScrollToPosition(0);
                    }
                    break;
                }
                break;
            case 5:
                AndroidUtilities.forEachViews((RecyclerView) ((ChatAttachAlertQuickRepliesLayout) this.f$0).listView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(2));
                break;
            case 6:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                ChatbotsActivity chatbotsActivity = (ChatbotsActivity) this.f$0;
                chatbotsActivity.currentValue = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : chatbotsActivity.currentValue.connected_bots.get(0);
                chatbotsActivity.currentBot = tL_connectedBot;
                chatbotsActivity.selectedBot = tL_connectedBot == null ? null : chatbotsActivity.getMessagesController().getUser(Long.valueOf(chatbotsActivity.currentBot.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = chatbotsActivity.currentBot;
                chatbotsActivity.rights = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = chatbotsActivity.currentBot;
                chatbotsActivity.exclude = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                BusinessRecipientsHelper businessRecipientsHelper = chatbotsActivity.recipientsHelper;
                if (businessRecipientsHelper != null) {
                    businessRecipientsHelper.setValue(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                UniversalRecyclerView universalRecyclerView = chatbotsActivity.listView;
                if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
                    universalAdapter.update(true);
                }
                chatbotsActivity.checkDone$6(true);
                chatbotsActivity.valueSet = true;
                break;
            case 7:
                int iIntValue = ((Integer) obj).intValue();
                GreetMessagesActivity greetMessagesActivity = (GreetMessagesActivity) this.f$0;
                greetMessagesActivity.inactivityDays = greetMessagesActivity.daysOfInactivity[iIntValue];
                greetMessagesActivity.checkDone$1$1(true);
                break;
            case 8:
                AndroidUtilities.hideKeyboard((QuickRepliesActivity.AnonymousClass3) this.f$0);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 9:
                QuickRepliesActivity quickRepliesActivity = (QuickRepliesActivity) this.f$0;
                quickRepliesActivity.getClass();
                Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(5, "chatMode");
                bundleM.putLong("user_id", quickRepliesActivity.getUserConfig().getClientUserId());
                bundleM.putString("quick_reply", (String) obj);
                ChatActivity chatActivity = new ChatActivity(bundleM);
                chatActivity.forceHistoryEmpty = true;
                quickRepliesActivity.presentFragment(chatActivity);
                break;
            case 10:
                ((HintDialogCell) this.f$0).updatePremiumBlocked(true);
                break;
            case 11:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                ChannelColorActivity channelColorActivity = (ChannelColorActivity) this.f$0;
                channelColorActivity.currentWallpaper = wallPaper;
                channelColorActivity.selectedWallpaper = wallPaper;
                channelColorActivity.galleryWallpaper = wallPaper;
                channelColorActivity.updateButton(false);
                channelColorActivity.updateMessagesPreview(false);
                AndroidUtilities.runOnUIThread(new ChannelColorActivity$$ExternalSyntheticLambda14(channelColorActivity, 1), 350L);
                break;
            case 12:
                ChatRightsEditActivity.this.currentRank = (String) obj;
                break;
            case 13:
                ChatUsersActivity.ListAdapter listAdapter = (ChatUsersActivity.ListAdapter) this.f$0;
                listAdapter.getClass();
                long jIntValue = ((Integer) obj).intValue();
                ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                chatUsersActivity.starsPrice = jIntValue;
                AndroidUtilities.updateVisibleRow(chatUsersActivity.listView, chatUsersActivity.priceInfoRow);
                break;
            case 14:
                ((ArticleViewer$$ExternalSyntheticLambda74) this.f$0).run();
                break;
            case 15:
                CharSequence charSequence = (CharSequence) obj;
                CaptionContainerView.AnonymousClass3 anonymousClass3 = ((CaptionPhotoViewer) this.f$0).editText;
                anonymousClass3.setText(charSequence);
                anonymousClass3.editText.setSelection(charSequence.length(), charSequence.length());
                break;
            case 16:
                ChatAttachAlertPhotoLayout.PhotoAttachAdapter photoAttachAdapter = (ChatAttachAlertPhotoLayout.PhotoAttachAdapter) this.f$0;
                photoAttachAdapter.getClass();
                long jLongValue = ((Long) obj).longValue();
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
                chatAttachAlertPhotoLayout.showAvatarConstructorFragment(null, null, jLongValue);
                chatAttachAlertPhotoLayout.parentAlert.lambda$showGiftOfferSheet$15();
                break;
            case 17:
                MessagesController.getInstance(((DialogsBotsAdapter) this.f$0).currentAccount).openApp((TLRPC.User) obj, 0);
                break;
            case 18:
                HintView$1$$ExternalSyntheticLambda0 hintView$1$$ExternalSyntheticLambda0 = (HintView$1$$ExternalSyntheticLambda0) this.f$0;
                if (hintView$1$$ExternalSyntheticLambda0 != null) {
                    hintView$1$$ExternalSyntheticLambda0.run();
                }
                break;
            case 19:
                ((MediaActivity) this.f$0).sharedMediaLayout.scrollToPage(((Integer) obj).intValue() + 8);
                break;
            case 20:
                Integer num = (Integer) obj;
                ChatActivity.AnonymousClass64 anonymousClass64 = (ChatActivity.AnonymousClass64) this.f$0;
                MessagePreviewView.TabsView tabsView = anonymousClass64.tabsView;
                ArrayList arrayList = tabsView.tabs;
                MessagePreviewView.AnonymousClass2 anonymousClass2 = anonymousClass64.viewPager;
                if (((MessagePreviewView.TabsView.Tab) arrayList.get(anonymousClass2.getCurrentPosition())).id != num.intValue()) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList2 = tabsView.tabs;
                        if (i2 < arrayList2.size()) {
                            if (((MessagePreviewView.TabsView.Tab) arrayList2.get(i2)).id == num.intValue()) {
                                i = i2;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (anonymousClass2.getCurrentPosition() != i) {
                        anonymousClass2.scrollToPosition$1(i);
                        break;
                    }
                }
                break;
            case 21:
                Shape shape = (Shape) obj;
                Input input = (Input) this.f$0;
                RenderView renderView = input.renderView;
                if (shape != null) {
                    float currentWeight = renderView.getCurrentWeight();
                    shape.thickness = currentWeight;
                    double d = input.thicknessSum;
                    if (d > 0.0d) {
                        shape.thickness = (float) ((d / input.thicknessCount) * ((double) currentWeight));
                    }
                    if (shape.brush.getShapeShaderType() == 4) {
                        shape.arrowTriangleLength *= shape.thickness;
                    }
                }
                Painting painting = renderView.getPainting();
                if (painting.helperApplyAnimator == null) {
                    painting.renderView.performInContext(new Painting$$ExternalSyntheticLambda0(painting, shape, 1));
                    break;
                }
                break;
            case 22:
                TextureView textureView = (TextureView) obj;
                PaintView.AnonymousClass26 anonymousClass26 = (PaintView.AnonymousClass26) this.f$0;
                anonymousClass26.textureView = textureView;
                if (textureView != null) {
                    anonymousClass26.container.addView(textureView, 0);
                }
                break;
            case 23:
                StoryLinkPreviewDialog storyLinkPreviewDialog = (StoryLinkPreviewDialog) this.f$0;
                storyLinkPreviewDialog.blurBitmap = (Bitmap) obj;
                Paint paint = new Paint(1);
                storyLinkPreviewDialog.blurBitmapPaint = paint;
                Bitmap bitmap = storyLinkPreviewDialog.blurBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                storyLinkPreviewDialog.blurBitmapShader = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? -0.02f : -0.07f);
                storyLinkPreviewDialog.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                storyLinkPreviewDialog.blurMatrix = new Matrix();
                break;
            case 24:
                Integer num2 = (Integer) obj;
                PasscodeView passcodeView = (PasscodeView) this.f$0;
                if (passcodeView.getContext() != null) {
                    boolean z2 = passcodeView.getContext().getResources().getConfiguration().orientation == 2;
                    int iIntValue2 = num2.intValue() - AndroidUtilities.navigationBarHeight;
                    if (SharedConfig.passcodeType == 1) {
                        FrameLayout frameLayout = passcodeView.passwordFrameLayout;
                        ViewPropertyAnimator duration = frameLayout.animate().translationY(iIntValue2 <= AndroidUtilities.dp(20.0f) ? 0.0f : (((passcodeView.getHeight() - iIntValue2) / 2.0f) - (frameLayout.getHeight() / (z2 ? 1.0f : 2.0f))) - frameLayout.getTop()).setDuration(320L);
                        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                        duration.setInterpolator(cubicBezierInterpolator).start();
                        passcodeView.imageView.animate().alpha(iIntValue2 > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator);
                    }
                    break;
                }
                break;
            case 25:
                PhonebookShareAlert phonebookShareAlert = (PhonebookShareAlert) this.f$0;
                phonebookShareAlert.delegate.didSelectContact(phonebookShareAlert.currentUser, true, 0, ((Long) obj).longValue());
                phonebookShareAlert.lambda$showGiftOfferSheet$15();
                break;
            case 26:
                ((LimitReachedBottomSheet) this.f$0).sendInviteMessages((HashMap) obj);
                break;
            case 27:
                StarParticlesView starParticlesView = (StarParticlesView) this.f$0;
                starParticlesView.getClass();
                boolean zIsEnabled = LiteMode.isEnabled(131072);
                if (starParticlesView.isLiteModeParticlesAllowed != zIsEnabled) {
                    starParticlesView.isLiteModeParticlesAllowed = zIsEnabled;
                    starParticlesView.invalidate();
                }
                break;
            case 28:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                MessageObject messageObject = (MessageObject) this.f$0;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia;
                    tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                    tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                    tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                    tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                    tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                    tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                    if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                        tL_messageMediaGiveaway.flags |= 32;
                        tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                    }
                } else {
                    tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                }
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
                long j = ((long) messageObject.messageOwner.date) * 1000;
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment != null) {
                    String forwardedName = messageObject.getForwardedName();
                    if (forwardedName == null) {
                        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-MessageObject.getPeerId(messageObject.messageOwner.peer_id)));
                        forwardedName = chat != null ? chat.title : "";
                    }
                    String str = forwardedName;
                    TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    boolean z3 = chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2);
                    Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(lastFragment.getParentActivity(), lastFragment.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        lottieLayout.setAnimation(R.raw.chats_infotip, 30, 30, new String[0]);
                        lottieLayout.textView.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            lottieLayout.setAnimation(R.raw.forward, 30, 30, new String[0]);
                            lottieLayout.textView.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            lottieLayout.setAnimation(R.raw.chats_infotip, 30, 30, new String[0]);
                            lottieLayout.textView.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    lottieLayout.textView.setSingleLine(false);
                    lottieLayout.textView.setMaxLines(2);
                    Bulletin.UndoButton undoButton = new Bulletin.UndoButton(lastFragment.getParentActivity(), lastFragment.getResourceProvider(), true, false);
                    String string = LocaleController.getString(R.string.LearnMore);
                    TextView textView = undoButton.undoTextView;
                    if (textView != null) {
                        textView.setText(string);
                    }
                    undoButton.undoAction = new ChatActivity$$ExternalSyntheticLambda488(payments_giveawayinfo, z3, str, j, tL_messageMediaGiveaway2, lastFragment);
                    lottieLayout.setButton(undoButton);
                    Bulletin.make(lastFragment, lottieLayout, 2750).show();
                    break;
                }
                break;
            default:
                ReassignBoostBottomSheet reassignBoostBottomSheet = (ReassignBoostBottomSheet) this.f$0;
                reassignBoostBottomSheet.actionButton.setLoading(false);
                BoostDialogs.showToastError(reassignBoostBottomSheet.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
