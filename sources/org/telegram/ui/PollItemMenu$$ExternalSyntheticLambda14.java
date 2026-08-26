package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Components.Premium.boosts.adapters.BoostAdapter;
import org.telegram.ui.Components.Premium.boosts.adapters.GiftInfoAdapter;
import org.telegram.ui.Components.Premium.boosts.adapters.SelectorAdapter;
import org.telegram.ui.Components.SuggestBirthdayActionLayout;
import org.telegram.ui.Components.Tooltip$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.inset.KeyboardState;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.Components.poll.PollAddOptionFieldLayout;
import org.telegram.ui.Components.poll.PollAttachedMedia;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.quickforward.QuickShareSelectorDrawable;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Gifts.ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.Stars.GiftOfferSheet;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.bots.AffiliateProgramFragment;

public final class PollItemMenu$$ExternalSyntheticLambda14 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;

    public PollItemMenu$$ExternalSyntheticLambda14(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(Object obj) {
        int i;
        TLRPC.TL_help_country tL_help_country;
        int i2 = 3;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((PollItemMenu.AnonymousClass3) obj2).scrollToPosition$1(((Integer) obj).intValue());
                break;
            case 1:
                HashMap map = ((BoostAdapter) obj2).chatsParticipantsCount;
                map.clear();
                map.putAll((HashMap) obj);
                break;
            case 2:
                ((GiftInfoAdapter) obj2).onObjectClicked((TLObject) obj);
                break;
            case 3:
                HashMap map2 = ((SelectorAdapter) obj2).chatsParticipantsCount;
                map2.clear();
                map2.putAll((HashMap) obj);
                break;
            case 4:
                Bitmap bitmap = (Bitmap) obj;
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? -0.04f : -0.07f);
                Bitmap bitmapApplyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                bitmapApplyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(Theme.currentTheme.isDark() ? 2.0f : 3.0f);
                if (!Theme.currentTheme.isDark()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, Theme.currentTheme.isDark() ? -0.2f : -0.07f);
                }
                Bitmap bitmapApplyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                bitmapApplyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                ((Utilities.Callback2) obj2).run(bitmapApplyColorMatrix, bitmapApplyColorMatrix2);
                break;
            case 5:
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                SuggestBirthdayActionLayout suggestBirthdayActionLayout = (SuggestBirthdayActionLayout) obj2;
                suggestBirthdayActionLayout.getClass();
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                int i3 = suggestBirthdayActionLayout.currentAccount;
                TLRPC.UserFull userFull = MessagesController.getInstance(i3).getUserFull(UserConfig.getInstance(i3).getClientUserId());
                TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
                if (userFull != null) {
                    userFull.flags2 |= 32;
                    userFull.birthday = tL_birthday;
                    MessagesStorage.getInstance(i3).updateUserInfo(userFull, false);
                }
                ConnectionsManager.getInstance(i3).sendRequest(updatebirthday, new BoostsActivity$$ExternalSyntheticLambda7(suggestBirthdayActionLayout, userFull, tL_birthday2, 24), 1024);
                MessagesController.getInstance(i3).invalidateContentSettings();
                MessagesController.getInstance(i3).removeSuggestion(0L, "BIRTHDAY_SETUP");
                NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                break;
            case 6:
                WindowInsetsStateHolder windowInsetsStateHolder = (WindowInsetsStateHolder) obj2;
                if (((KeyboardState.State) obj) == KeyboardState.State.STATE_FULLY_VISIBLE && ((i = windowInsetsStateHolder.inAppKeyboardState) == 2 || i == 3)) {
                    windowInsetsStateHolder.inAppKeyboardState = 1;
                }
                windowInsetsStateHolder.onUpdateListener.run();
                break;
            case 7:
                PollAttachedMedia pollAttachedMedia = (PollAttachedMedia) obj;
                PollAddOptionFieldLayout pollAddOptionFieldLayout = (PollAddOptionFieldLayout) obj2;
                pollAddOptionFieldLayout.attachedMedia = pollAttachedMedia;
                pollAddOptionFieldLayout.attachButton.setAttachedMedia(pollAttachedMedia, true);
                AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(pollAddOptionFieldLayout, 20), 200L);
                break;
            case 8:
                Pair pair = (Pair) obj;
                CountrySelectBottomSheet countrySelectBottomSheet = (CountrySelectBottomSheet) obj2;
                HashMap map3 = countrySelectBottomSheet.countriesMap;
                map3.putAll((Map) pair.first);
                ArrayList arrayList = countrySelectBottomSheet.countriesLetters;
                arrayList.addAll((Collection) pair.second);
                j$.util.Map.EL.forEach(map3, new SelectorBottomSheet$$ExternalSyntheticLambda16(countrySelectBottomSheet, 1));
                HashSet<String> hashSet = countrySelectBottomSheet.countriesToSelect;
                HashMap map4 = countrySelectBottomSheet.selectedCountries;
                if (hashSet != null) {
                    for (String str : hashSet) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                Object obj3 = arrayList.get(i4);
                                i4++;
                                Iterator it = ((List) map3.get((String) obj3)).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        tL_help_country = (TLRPC.TL_help_country) it.next();
                                        if (TextUtils.equals(str, tL_help_country.iso2)) {
                                        }
                                    }
                                }
                            } else {
                                tL_help_country = null;
                            }
                        }
                        if (tL_help_country != null) {
                            GroupCreateSpan groupCreateSpan = new GroupCreateSpan(countrySelectBottomSheet.getContext(), tL_help_country);
                            groupCreateSpan.setOnClickListener(new CountrySelectBottomSheet$$ExternalSyntheticLambda0(countrySelectBottomSheet, i2));
                            countrySelectBottomSheet.spansContainer.spansContainer.addSpan(groupCreateSpan);
                            map4.put(tL_help_country.iso2, groupCreateSpan);
                        }
                    }
                }
                countrySelectBottomSheet.adapter.update(true);
                countrySelectBottomSheet.button.setCount(map4.size(), true);
                break;
            case 9:
                Bitmap bitmap2 = (Bitmap) obj;
                QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) obj2;
                if (quickShareSelectorDrawable.isDestroyed) {
                    quickShareSelectorDrawable.globalBlurBitmap.recycle();
                } else {
                    quickShareSelectorDrawable.globalBlurBitmap = bitmap2;
                    Bitmap bitmap3 = quickShareSelectorDrawable.globalBlurBitmap;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    quickShareSelectorDrawable.bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    Paint paint = new Paint(2);
                    quickShareSelectorDrawable.globalBlurBitmapPaint = paint;
                    paint.setShader(quickShareSelectorDrawable.bitmapShader);
                    ColorMatrix colorMatrix3 = new ColorMatrix();
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, Theme.currentTheme.isDark() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, Theme.currentTheme.isDark() ? 0.02f : -0.15f);
                    quickShareSelectorDrawable.globalBlurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                    Matrix matrix = quickShareSelectorDrawable.bitmapMatrix;
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    quickShareSelectorDrawable.bitmapShader.setLocalMatrix(matrix);
                }
                break;
            case 10:
                ((ContactAddActivity) obj2).lambda$createView$13((TL_account.TL_birthday) obj);
                break;
            case 11:
                FiltersSetupActivity.this.updateRows$3(true);
                break;
            case 12:
                ((GiftSheet.StarsBackground) obj2).checkParticlesAllowed();
                break;
            case 13:
                ((ResaleGiftsFragment) obj2).updateList$1(((Boolean) obj).booleanValue());
                break;
            case 14:
                ((Boolean) obj).getClass();
                ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7 resaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7 = ((ResaleGiftsFragment.SelectGiftSheet.State) obj2).currentListener;
                if (resaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7 != null) {
                    resaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7.run();
                }
                break;
            case 15:
                BoostDialogs.showToastError(((SendGiftSheet) obj2).getContext(), (TLRPC.TL_error) obj);
                break;
            case 16:
                ((GroupCallActivity.EmojiSlot) obj2).updateEmoji();
                break;
            case 17:
                ((LiteModeSettingsActivity) obj2).updateValues();
                break;
            case 18:
                String str2 = (String) obj;
                LoginActivity.LoginPayView loginPayView = (LoginActivity.LoginPayView) obj2;
                loginPayView.getClass();
                FileLog.d("LoginBilling purchased done " + str2);
                if ("CANCELLED".equalsIgnoreCase(str2)) {
                    loginPayView.button.setLoading(false);
                }
                break;
            case 19:
                Integer num = (Integer) obj;
                MessageSendPreview messageSendPreview = (MessageSendPreview) obj2;
                messageSendPreview.getClass();
                boolean z = num.intValue() - messageSendPreview.insets.bottom > AndroidUtilities.dp(20.0f);
                messageSendPreview.keyboardVisible = z;
                messageSendPreview.effectSelectorContainer.animate().translationY((z ? Math.min(messageSendPreview.effectSelectorContainerY, (messageSendPreview.windowView.getHeight() - num.intValue()) - messageSendPreview.effectSelectorContainer.getMeasuredHeight()) : messageSendPreview.effectSelectorContainerY) - messageSendPreview.effectSelectorContainer.getTop()).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
                break;
            case 20:
                MultiContactsSelectorBottomSheet multiContactsSelectorBottomSheet = (MultiContactsSelectorBottomSheet) obj2;
                multiContactsSelectorBottomSheet.query = (String) obj;
                LaunchActivity.AnonymousClass18 anonymousClass18 = multiContactsSelectorBottomSheet.remoteSearchRunnable;
                AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                AndroidUtilities.runOnUIThread(anonymousClass18, 100L);
                break;
            case 21:
                NewContactBottomSheet newContactBottomSheet = (NewContactBottomSheet) obj2;
                newContactBottomSheet.getClass();
                if (((Boolean) obj).booleanValue()) {
                    newContactBottomSheet.done();
                }
                break;
            case 22:
                Integer num2 = (Integer) obj;
                PollItemMenu.AnonymousClass3 anonymousClass3 = ((PeerColorActivity) obj2).viewPager;
                if (anonymousClass3 != null) {
                    anonymousClass3.scrollToPosition$1(num2.intValue());
                }
                break;
            case 23:
                PeerColorActivity.Page.this.update();
                break;
            case 24:
                PostSuggestionsEditActivity postSuggestionsEditActivity = (PostSuggestionsEditActivity) obj2;
                postSuggestionsEditActivity.getClass();
                postSuggestionsEditActivity.suggestionsStarsCount = ((Integer) obj).intValue();
                View viewFindViewByItemId = postSuggestionsEditActivity.listView.findViewByItemId(4);
                if (viewFindViewByItemId instanceof TextInfoPrivacyCell) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewFindViewByItemId;
                    if (textInfoPrivacyCell.getFixedSize() > 0 || postSuggestionsEditActivity.suggestionsStarsCount <= 0) {
                        postSuggestionsEditActivity.listView.adapter.update(true);
                    } else {
                        int i5 = postSuggestionsEditActivity.getMessagesController().starsPaidMessageCommissionPermille;
                        textInfoPrivacyCell.setText(LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, AffiliateProgramFragment.percents(i5), String.valueOf(((double) ((int) ((((double) (postSuggestionsEditActivity.suggestionsStarsCount * (i5 / 1000.0f))) / 1000.0d) * ((double) postSuggestionsEditActivity.getMessagesController().starsUsdWithdrawRate1000)))) / 100.0d)));
                    }
                } else {
                    postSuggestionsEditActivity.listView.adapter.update(true);
                }
                postSuggestionsEditActivity.checkDone$7(true);
                break;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                ArrayList arrayList2 = privacySettingsActivity.biometryBots;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                privacySettingsActivity.updateRows(true);
                break;
            case 26:
                Boolean bool = (Boolean) obj;
                LinkSpanDrawable.LinksTextView[] linksTextViewArr = (LinkSpanDrawable.LinksTextView[]) obj2;
                ViewPropertyAnimator viewPropertyAnimatorScaleY = linksTextViewArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                OKLCH.m(viewPropertyAnimatorScaleY, cubicBezierInterpolator, 600L);
                linksTextViewArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(cubicBezierInterpolator).setDuration(600L).start();
                break;
            case 27:
                QrActivity.QrView qrView = (QrActivity.QrView) obj2;
                qrView.getClass();
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(11, qrView, (TLRPC.TL_exportedContactToken) obj));
                break;
            case 28:
                GiftOfferSheet giftOfferSheet = (GiftOfferSheet) obj2;
                giftOfferSheet.getClass();
                int i6 = GiftOfferSheet.ALLOWED_DURATIONS[((Integer) obj).intValue()];
                if (giftOfferSheet.selectedDuration != i6) {
                    giftOfferSheet.selectedDuration = i6;
                    giftOfferSheet.publishingTimeField.setText(LocaleController.formatPluralString("GiftOfferHours", i6 / 3600, new Object[0]));
                }
                giftOfferSheet.checkButtonEnabled(true);
                break;
            default:
                StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) obj2;
                starGiftPreviewSheet.itemAnimator.endAnimations();
                starGiftPreviewSheet.adapter.update(true);
                break;
        }
    }
}
