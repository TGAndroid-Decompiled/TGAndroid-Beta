package org.telegram.ui.Stars;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda135;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda12;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class StarsController$$ExternalSyntheticLambda104 implements OnFailureListener, AlertDialog.OnButtonClickListener, NumberPicker.OnValueChangeListener, PurchasesResponseListener, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, StoryViewer.HolderClip {
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public StarsController$$ExternalSyntheticLambda104(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override
    public void clip(Canvas canvas, RectF rectF, float f, boolean z) {
        PhotoViewer.AnonymousClass49 anonymousClass49 = (PhotoViewer.AnonymousClass49) this.f$0;
        anonymousClass49.getClass();
        ProfileStoriesView.StoryCircle storyCircle = (ProfileStoriesView.StoryCircle) this.f$2;
        RectF rectF2 = storyCircle.cachedRect;
        RectF rectF3 = (RectF) this.f$1;
        rectF3.set(rectF2);
        ProfileStoriesView.StoryCircle storyCircle2 = (ProfileStoriesView.StoryCircle) this.f$4;
        RectF rectF4 = storyCircle2.cachedRect;
        RectF rectF5 = (RectF) this.f$3;
        rectF5.set(rectF4);
        rectF2.set(rectF);
        try {
            float fWidth = rectF.width() / rectF3.width();
            float fCenterX = rectF.centerX() - ((((1.0f - f) * 2.0f) + fWidth) * (rectF3.centerX() - rectF5.centerX()));
            float fCenterY = rectF.centerY();
            float fWidth2 = (rectF5.width() / 2.0f) * fWidth;
            float fHeight = (rectF5.height() / 2.0f) * fWidth;
            rectF4.set(fCenterX - fWidth2, fCenterY - fHeight, fCenterX + fWidth2, fCenterY + fHeight);
        } catch (Exception unused) {
        }
        int i = ProfileStoriesView.$r8$clinit;
        ((ProfileActivity.AnonymousClass27) anonymousClass49.this$0).clipCircle(canvas, storyCircle, storyCircle2);
        rectF2.set(rectF3);
        rectF4.set(rectF5);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        BottomSheetTabs bottomSheetTabs = (BottomSheetTabs) this.f$0;
        bottomSheetTabs.getClass();
        ((boolean[]) this.f$1)[0] = true;
        bottomSheetTabs.removeTab(bottomSheetTabs.currentAccount, (BottomSheetTabs.WebTabData) this.f$2, true);
        ((Utilities.Callback) this.f$3).run(Boolean.TRUE);
        ((AlertDialog[]) this.f$4)[0].dismiss();
    }

    @Override
    public void onFailure(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        GetCredentialRequest request = (GetCredentialRequest) this.f$0;
        Intrinsics.checkNotNullParameter(request, "request");
        for (GetPublicKeyCredentialOption getPublicKeyCredentialOption : request.credentialOptions) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new CredentialProviderBeginSignInController(((GetCredentialController) this.f$1).context).invokePlayServices(request, (CancellationSignal) this.f$4, (Executor) this.f$3, (CredentialManagerCallback) this.f$2);
    }

    @Override
    public void onProductDetailsResponse(BillingResult billingResult, List list) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda135((StarsController) this.f$0, list, (JoinGroupAlert$$ExternalSyntheticLambda3) this.f$1, (TLRPC.TL_inputStorePaymentStarsGift) this.f$2, (TL_stars.TL_starsGiftOption) this.f$3, billingResult, (Activity) this.f$4, 11));
    }

    @Override
    public void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) this.f$0;
        loginPayView.getClass();
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda135(loginPayView, billingResult, list, (String) this.f$1, (TLRPC.TL_inputStorePaymentAuthCode) this.f$2, (TLRPC.TL_payments_canPurchaseStore) this.f$3, (LinkManager$$ExternalSyntheticLambda12) this.f$4));
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i) {
        AlertsCreator.checkFormattedDateInput((ButtonWithCounterView) this.f$0, (NumberPicker) this.f$1, (NumberPicker) this.f$2, (NumberPicker) this.f$3, (NumberPicker) this.f$4);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        TLRPC.TL_availableReaction tL_availableReaction;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f$1;
        HashMap map = (HashMap) this.f$2;
        ArrayList arrayList2 = (ArrayList) this.f$3;
        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.f$0;
        selectAnimatedEmojiDialog.getClass();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (((MediaDataController.KeywordResult) arrayList.get(i)).emoji.startsWith("animated_")) {
                    linkedHashSet.add(Long.valueOf(Long.parseLong(((MediaDataController.KeywordResult) arrayList.get(i)).emoji.substring(9))));
                } else {
                    int i2 = selectAnimatedEmojiDialog.type;
                    if ((i2 == 1 || i2 == 11 || i2 == 2) && (tL_availableReaction = (TLRPC.TL_availableReaction) map.get(((MediaDataController.KeywordResult) arrayList.get(i)).emoji)) != null) {
                        ReactionsLayoutInBubble.VisibleReaction visibleReaction = new ReactionsLayoutInBubble.VisibleReaction();
                        String str2 = tL_availableReaction.reaction;
                        visibleReaction.emojicon = str2;
                        visibleReaction.hash = str2.hashCode();
                        arrayList2.add(visibleReaction);
                    }
                }
            } catch (Exception unused) {
            }
        }
        ((Runnable) this.f$4).run();
    }
}
