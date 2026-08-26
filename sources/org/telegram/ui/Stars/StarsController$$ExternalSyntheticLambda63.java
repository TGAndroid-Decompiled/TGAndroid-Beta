package org.telegram.ui.Stars;

import android.app.Activity;
import android.os.Bundle;
import android.os.CancellationSignal;
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
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.OverlayActionBarLayoutDialog;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda24;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda10;
import org.telegram.ui.bots.BotWebViewSheet;

public final class StarsController$$ExternalSyntheticLambda63 implements OnFailureListener, BillingController.ProductDetailsResponseListenerLegacy, DialogsActivity.DialogsActivityDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public StarsController$$ExternalSyntheticLambda63(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override
    public boolean canSelectStories() {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        BotWebViewSheet.AnonymousClass3 anonymousClass3 = (BotWebViewSheet.AnonymousClass3) this.f$0;
        anonymousClass3.getClass();
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j)) {
            bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j));
        } else if (DialogObject.isUserDialog(j)) {
            bundleM.putLong("user_id", j);
        } else {
            bundleM.putLong("chat_id", -j);
        }
        bundleM.putString("start_text", "@" + UserObject.getPublicUsername((TLRPC.User) this.f$1) + " " + ((String) this.f$2));
        BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
        Activity activity = botWebViewSheet.parentActivity;
        if (activity instanceof LaunchActivity) {
            BaseFragment lastFragment = ((ActionBarLayout) ((LaunchActivity) activity).getActionBarLayout()).getLastFragment();
            if (MessagesController.getInstance(botWebViewSheet.currentAccount).checkCanOpenChat(bundleM, lastFragment)) {
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
                INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(new ChatActivity(bundleM));
                navigationParams.removeLast = true;
                lastFragment.presentFragment(navigationParams);
            }
        }
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
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
            case 0:
                AndroidUtilities.runOnUIThread(new SendGiftSheet$$ExternalSyntheticLambda16((Object) list, this.f$0, this.f$1, this.f$2, this.f$3, 16));
                break;
            default:
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda24((StarsController) this.f$0, list, (BotBiometry$$ExternalSyntheticLambda10) this.f$1, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f$2, billingResult, (Activity) this.f$3, 10));
                break;
        }
    }
}
