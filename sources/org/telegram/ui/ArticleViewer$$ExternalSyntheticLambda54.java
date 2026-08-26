package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import com.android.billingclient.api.BillingResult;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda24;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.OutlineEditText;
import org.telegram.ui.Components.OverlayActionBarLayoutDialog;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.TableView;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.web.WebInstantView$4$$ExternalSyntheticLambda0;

public final class ArticleViewer$$ExternalSyntheticLambda54 implements OnFailureListener, AlertDialog.OnButtonClickListener, AlertsCreator.ScheduleDatePickerDelegate, DialogsActivity.DialogsActivityDelegate, NumberPicker.OnValueChangeListener, MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback, Utilities.Callback2Return, BillingController.ProductDetailsResponseListenerLegacy {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public ArticleViewer$$ExternalSyntheticLambda54(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public boolean canSelectStories() {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        switch (this.$r8$classId) {
            case 3:
                ((ChatActivity) this.f$0).lambda$createView$36((TLRPC.TL_document) this.f$2, (String) this.f$1, this.f$3, z, i);
                break;
            case 7:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.f$0;
                chatAttachAlertPollLayout.delegate.sendPoll((TLRPC.TL_messageMediaPoll) this.f$1, chatAttachAlertPollLayout.descriptionString, chatAttachAlertPollLayout.attachedMedia, (ArrayList) this.f$2, z, i, ((Long) this.f$3).longValue());
                chatAttachAlertPollLayout.parentAlert.dismiss(true);
                break;
            case 8:
                TLObject tLObject = (TLRPC.Document) this.f$1;
                if (tLObject == null) {
                    tLObject = (TLRPC.BotInlineResult) this.f$2;
                }
                ((ContentPreviewViewer.ContentPreviewViewerDelegate) this.f$0).sendGif(i, i2, this.f$3, tLObject, z);
                break;
            default:
                ((ContentPreviewViewer.ContentPreviewViewerDelegate) this.f$0).sendSticker((TLRPC.Document) this.f$2, (String) this.f$1, this.f$3, z, i, i2);
                break;
        }
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        switch (this.$r8$classId) {
            case 5:
                ((AudioPlayerAlert) this.f$0).lambda$forward$53((ArrayList) this.f$1, (TLRPC.TL_document) this.f$2, (MessageObject) this.f$3, dialogsActivity, arrayList, charSequence, z2, i);
                break;
            case 6:
                ChatAttachAlert.AnonymousClass1 anonymousClass1 = (ChatAttachAlert.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle bundleM = zzkw.m("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j)) {
                    bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j));
                } else if (DialogObject.isUserDialog(j)) {
                    bundleM.putLong("user_id", j);
                } else {
                    bundleM.putLong("chat_id", -j);
                }
                bundleM.putString("start_text", "@" + UserObject.getPublicUsername((TLRPC.User) this.f$2) + " " + ((String) this.f$1));
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                BaseFragment baseFragment = chatAttachAlert.baseFragment;
                if (MessagesController.getInstance(chatAttachAlert.currentAccount).checkCanOpenChat(bundleM, baseFragment)) {
                    ((OverlayActionBarLayoutDialog) this.f$3).dismiss();
                    chatAttachAlert.dismiss(true);
                    INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(new ChatActivity(bundleM));
                    navigationParams.removeLast = true;
                    baseFragment.presentFragment(navigationParams);
                }
                break;
            default:
                BotWebViewSheet.AnonymousClass3 anonymousClass3 = (BotWebViewSheet.AnonymousClass3) this.f$0;
                anonymousClass3.getClass();
                long j2 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle bundleM2 = zzkw.m("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j2)) {
                    bundleM2.putInt("enc_id", DialogObject.getEncryptedChatId(j2));
                } else if (DialogObject.isUserDialog(j2)) {
                    bundleM2.putLong("user_id", j2);
                } else {
                    bundleM2.putLong("chat_id", -j2);
                }
                bundleM2.putString("start_text", "@" + UserObject.getPublicUsername((TLRPC.User) this.f$2) + " " + ((String) this.f$1));
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                Activity activity = botWebViewSheet.parentActivity;
                if (activity instanceof LaunchActivity) {
                    BaseFragment lastFragment = ((ActionBarLayout) ((LaunchActivity) activity).getActionBarLayout()).getLastFragment();
                    if (MessagesController.getInstance(botWebViewSheet.currentAccount).checkCanOpenChat(bundleM2, lastFragment)) {
                        ((OverlayActionBarLayoutDialog) this.f$3).dismiss();
                        botWebViewSheet.dismissed = true;
                        AndroidUtilities.cancelRunOnUIThread(botWebViewSheet.pollRunnable);
                        botWebViewSheet.webViewContainer.destroyWebView();
                        NotificationCenter.getInstance(botWebViewSheet.currentAccount).removeObserver(botWebViewSheet, NotificationCenter.webViewResultSent);
                        NotificationCenter.getGlobalInstance().removeObserver(botWebViewSheet, NotificationCenter.didSetNewTheme);
                        if (!botWebViewSheet.superDismissed) {
                            super/*android.app.Dialog*/.dismiss();
                            botWebViewSheet.superDismissed = true;
                        }
                        INavigationLayout.NavigationParams navigationParams2 = new INavigationLayout.NavigationParams(new ChatActivity(bundleM2));
                        navigationParams2.removeLast = true;
                        lastFragment.presentFragment(navigationParams2);
                    }
                }
                break;
        }
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((ArticleViewer) this.f$0).openWebpageUrlInternal((String) this.f$1, (String) this.f$2, (ArticleViewer.AnonymousClass13) this.f$3);
                break;
            case 4:
                ((ChatActivity) this.f$0).lambda$openAttachBotLayout$214((TLRPC.User) this.f$1, (AtomicBoolean) this.f$2, (TLRPC.TL_attachMenuBot) this.f$3);
                break;
            case 11:
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                launchActivity.getClass();
                NewContactBottomSheet newContactBottomSheet = new NewContactBottomSheet(launchActivity, (BaseFragment) this.f$3);
                newContactBottomSheet.setInitialPhoneNumber((String) this.f$1, false);
                String str = (String) this.f$2;
                if (str != null) {
                    String[] strArrSplit = str.split(" ", 2);
                    String str2 = strArrSplit[0];
                    String str3 = strArrSplit.length > 1 ? strArrSplit[1] : null;
                    OutlineEditText outlineEditText = newContactBottomSheet.firstNameField;
                    if (outlineEditText != null) {
                        outlineEditText.getEditText().setText(str2);
                    } else {
                        newContactBottomSheet.initialFirstName = str2;
                    }
                    OutlineEditText outlineEditText2 = newContactBottomSheet.lastNameField;
                    if (outlineEditText2 != null) {
                        outlineEditText2.getEditText().setText(str3);
                    } else {
                        newContactBottomSheet.initialLastName = str3;
                    }
                }
                newContactBottomSheet.show();
                break;
            case 12:
                ((LoginActivity) this.f$0).lambda$tryResetAccount$33((String) this.f$1, (String) this.f$2, (String) this.f$3);
                break;
            case 13:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f$0;
                notificationsCustomSettingsActivity.getClass();
                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f$2).edit();
                editorEdit.putBoolean((String) this.f$1, ((boolean[]) this.f$3)[0]);
                editorEdit.apply();
                notificationsCustomSettingsActivity.updateRows(true);
                notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(notificationsCustomSettingsActivity.currentType);
                break;
            default:
                TopicsFragment topicsFragment = (TopicsFragment) this.f$0;
                topicsFragment.getClass();
                HashSet hashSet = new HashSet();
                topicsFragment.excludeTopics = hashSet;
                HashSet hashSet2 = (HashSet) this.f$1;
                hashSet.addAll(hashSet2);
                topicsFragment.updateTopicsList(true, false);
                BulletinFactory.of(topicsFragment).createUndoBulletin(LocaleController.getPluralString("TopicsDeleted", hashSet2.size()), false, new TopicsFragment$$ExternalSyntheticLambda8(topicsFragment, 6), new TodoItemMenu$$ExternalSyntheticLambda8(topicsFragment, (ArrayList) this.f$2, (Runnable) this.f$3, 21)).show();
                topicsFragment.clearSelectedTopics();
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public void onFailure(final Exception e) {
        switch (this.$r8$classId) {
            case 1:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27((CredentialProviderPlayServicesImpl) this.f$0, (CancellationSignal) this.f$1, (Executor) this.f$2, (CredentialManagerCallback) this.f$3, e);
                break;
            default:
                Intrinsics.checkNotNullParameter(e, "e");
                final Executor executor = (Executor) this.f$2;
                final CredentialManagerCallback credentialManagerCallback = (CredentialManagerCallback) this.f$3;
                final CreatePublicKeyCredentialController createPublicKeyCredentialController = (CreatePublicKeyCredentialController) this.f$1;
                Function0 function0 = new Function0() {
                    @Override
                    public final Object invoke() {
                        Object createCredentialCustomException;
                        Exception exc = e;
                        createPublicKeyCredentialController.getClass();
                        if (exc instanceof ApiException) {
                            int statusCode = ((ApiException) exc).getStatusCode();
                            if (statusCode == 16) {
                                createCredentialCustomException = new CreateCredentialCancellationException(exc.getMessage());
                            } else if (statusCode == 17) {
                                createCredentialCustomException = new CreateCredentialCustomException("API is not supported: " + exc.getMessage(), 3);
                            } else if (statusCode == 8) {
                                createCredentialCustomException = new CreateCredentialNoCreateOptionException(exc.getMessage());
                            } else if (CredentialProviderController.retryables.contains(Integer.valueOf(statusCode))) {
                                createCredentialCustomException = new CreateCredentialInterruptedException(exc.getMessage());
                            } else {
                                createCredentialCustomException = new CreateCredentialCustomException("Conditional create failed, failure: " + exc.getMessage(), 2);
                            }
                        } else if (exc instanceof UnsupportedApiCallException) {
                            createCredentialCustomException = new CreateCredentialCustomException("API is unsupported", 3);
                        } else {
                            createCredentialCustomException = new CreateCredentialCustomException("Conditional create failed, failure: " + exc, 2);
                        }
                        executor.execute(new ExoPlayerImpl$$ExternalSyntheticLambda24(11, credentialManagerCallback, createCredentialCustomException));
                        return Unit.INSTANCE;
                    }
                };
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release((CancellationSignal) this.f$0)) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }

    @Override
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        switch (this.$r8$classId) {
            case 18:
                AndroidUtilities.runOnUIThread(new WebInstantView$4$$ExternalSyntheticLambda0(list, (Utilities.Callback2) this.f$0, (TLRPC.TL_inputStorePaymentStarsTopup) this.f$1, (TL_stars.TL_starsTopupOption) this.f$2, (Activity) this.f$3, 1));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda375((StarsController) this.f$0, list, (OAuthSheet$$ExternalSyntheticLambda18) this.f$1, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f$2, billingResult, (Activity) this.f$3, 14));
                break;
        }
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i) {
        GroupCallActivity groupCallActivity = (GroupCallActivity) this.f$0;
        groupCallActivity.getClass();
        try {
            groupCallActivity.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AlertsCreator.checkScheduleDate(groupCallActivity.scheduleButtonTextView, groupCallActivity.scheduleInfoTextView, 0L, 604800L, 2, (NumberPicker) this.f$1, (GroupCallActivity.AnonymousClass40) this.f$2, (GroupCallActivity.AnonymousClass41) this.f$3);
    }

    @Override
    public void run(long j) {
        ((SelectChatUserSheet) this.f$0).lambda$initTransfer$3((TLRPC.User) this.f$1, (TLRPC.TL_inputCheckPasswordSRP) this.f$2, (TwoStepVerificationActivity) this.f$3, j);
    }

    public ArticleViewer$$ExternalSyntheticLambda54(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = str;
        this.f$3 = obj3;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        Context context = (Context) this.f$0;
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        int iIntValue = num.intValue() - 1;
        int[] iArr = (int[]) this.f$1;
        imageView.setImageResource(iArr[iIntValue]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        linearLayout.addView(imageView, LayoutHelper.createLinear(24, 24));
        if (num.intValue() == 7) {
            for (int i = 0; i < 2; i++) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(iArr[num.intValue() - 1]);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                linearLayout.addView(imageView2, LayoutHelper.createLinear(24, 24));
            }
        }
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, (Theme.ResourcesProvider) this.f$2));
        StringBuilder sb = new StringBuilder("x");
        float fFloatValue = f.floatValue();
        Object obj3 = f;
        if (fFloatValue <= 0.0f) {
            obj3 = "0";
        }
        sb.append(obj3);
        textView.setText(sb.toString());
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        return new TableView.TableRowContent((TableView) this.f$3, linearLayoutM, false);
    }

    public ArticleViewer$$ExternalSyntheticLambda54(LaunchActivity launchActivity, BaseFragment baseFragment, String str, String str2) {
        this.$r8$classId = 11;
        this.f$0 = launchActivity;
        this.f$3 = baseFragment;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        switch (this.$r8$classId) {
            case 14:
                TLRPC.messages_AvailableEffects availableEffects = MessagesController.getInstance(((SelectAnimatedEmojiDialog) this.f$0).currentAccount).getAvailableEffects();
                HashSet hashSet = new HashSet();
                if (availableEffects != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        try {
                            if (!((MediaDataController.KeywordResult) arrayList.get(i)).emoji.startsWith("animated_")) {
                                String strFixEmoji = Emoji.fixEmoji(((MediaDataController.KeywordResult) arrayList.get(i)).emoji);
                                for (int i2 = 0; i2 < availableEffects.effects.size(); i2++) {
                                    TLRPC.TL_availableEffect tL_availableEffect = availableEffects.effects.get(i2);
                                    if (!hashSet.contains(Long.valueOf(tL_availableEffect.id)) && (tL_availableEffect.emoticon.contains(strFixEmoji) || strFixEmoji.contains(tL_availableEffect.emoticon))) {
                                        ((ArrayList) (tL_availableEffect.effect_animation_id == 0 ? this.f$1 : this.f$2)).add(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_availableEffect));
                                        hashSet.add(Long.valueOf(tL_availableEffect.id));
                                    }
                                }
                            }
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
                ((Runnable) this.f$3).run();
                break;
            default:
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i3)).emoji;
                    HashMap map = (HashMap) this.f$0;
                    ArrayList arrayList2 = map != null ? (ArrayList) map.get(str2) : null;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        HashMap map2 = (HashMap) this.f$1;
                        if (!map2.containsKey(arrayList2)) {
                            map2.put(arrayList2, str2);
                            ((ArrayList) this.f$2).add(arrayList2);
                        }
                    }
                }
                ((Runnable) this.f$3).run();
                break;
        }
    }
}
