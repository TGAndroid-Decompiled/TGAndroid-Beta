package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.StickersSearchAdapter;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.SharedLinkCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.Premium.PremiumTierCell;
import org.telegram.ui.Components.Reactions.CustomEmojiReactionsWindow;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.StickersDialogs;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.WallpaperUpdater;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class PhotoViewer$$ExternalSyntheticLambda61 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda61(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final void onItemClick$org$telegram$ui$PollCreateActivity$$ExternalSyntheticLambda4(int i, View view) {
        boolean z;
        PollCreateActivity pollCreateActivity = (PollCreateActivity) this.f$0;
        if (i == pollCreateActivity.addAnswerRow) {
            pollCreateActivity.addNewField$1();
            return;
        }
        if (view instanceof TextCheckCell) {
            TextCheckCell textCheckCell = (TextCheckCell) view;
            boolean z2 = pollCreateActivity.quizPoll;
            SuggestEmojiView suggestEmojiView = pollCreateActivity.suggestEmojiPanel;
            if (suggestEmojiView != null) {
                suggestEmojiView.forceClose();
            }
            if (pollCreateActivity.onlyAdding) {
                int i2 = -pollCreateActivity.shiftDp;
                pollCreateActivity.shiftDp = i2;
                AndroidUtilities.shakeViewSpring(textCheckCell, i2);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            int i3 = pollCreateActivity.anonymousRow;
            boolean[] zArr = pollCreateActivity.answersChecks;
            if (i == i3) {
                z = !pollCreateActivity.anonymousPoll;
                pollCreateActivity.anonymousPoll = z;
            } else {
                int i4 = pollCreateActivity.allowAddingRow;
                if (i == i4) {
                    z = !pollCreateActivity.allowAdding;
                    pollCreateActivity.allowAdding = z;
                } else if (i == pollCreateActivity.allowMarkingRow) {
                    boolean z3 = !pollCreateActivity.allowMarking;
                    pollCreateActivity.allowMarking = z3;
                    pollCreateActivity.updateRows$12$1();
                    int i5 = pollCreateActivity.allowAddingRow;
                    if (i5 >= 0 && i4 < 0) {
                        pollCreateActivity.listAdapter.mObservable.notifyItemRangeInserted(i5, 1);
                    } else if (i4 >= 0 && i5 < 0) {
                        pollCreateActivity.listAdapter.mObservable.notifyItemRangeRemoved(i4, 1);
                    }
                    z = z3;
                } else if (i == pollCreateActivity.multipleRow) {
                    boolean z4 = pollCreateActivity.multipleChoise;
                    boolean z5 = !z4;
                    pollCreateActivity.multipleChoise = z5;
                    if (!z4 && pollCreateActivity.quizPoll) {
                        int i6 = pollCreateActivity.solutionRow;
                        pollCreateActivity.quizPoll = false;
                        pollCreateActivity.updateRows$12$1();
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = pollCreateActivity.listView.findViewHolderForAdapterPosition(pollCreateActivity.quizRow);
                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                            ((TextCheckCell) viewHolderFindViewHolderForAdapterPosition.itemView).setChecked(false);
                        } else {
                            pollCreateActivity.listAdapter.notifyItemChanged(pollCreateActivity.quizRow);
                        }
                        pollCreateActivity.listAdapter.mObservable.notifyItemRangeRemoved(i6, 2);
                    }
                    z = z5;
                } else {
                    if (pollCreateActivity.quizOnly != 0) {
                        return;
                    }
                    z = !pollCreateActivity.quizPoll;
                    pollCreateActivity.quizPoll = z;
                    int i7 = pollCreateActivity.solutionRow;
                    pollCreateActivity.updateRows$12$1();
                    if (pollCreateActivity.quizPoll) {
                        pollCreateActivity.listAdapter.mObservable.notifyItemRangeInserted(pollCreateActivity.solutionRow, 2);
                    } else {
                        pollCreateActivity.listAdapter.mObservable.notifyItemRangeRemoved(i7, 2);
                    }
                    if (pollCreateActivity.quizPoll && pollCreateActivity.multipleChoise) {
                        pollCreateActivity.multipleChoise = false;
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = pollCreateActivity.listView.findViewHolderForAdapterPosition(pollCreateActivity.multipleRow);
                        if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                            ((TextCheckCell) viewHolderFindViewHolderForAdapterPosition2.itemView).setChecked(false);
                        } else {
                            pollCreateActivity.listAdapter.notifyItemChanged(pollCreateActivity.multipleRow);
                        }
                    }
                    if (pollCreateActivity.quizPoll) {
                        boolean z6 = false;
                        for (int i8 = 0; i8 < zArr.length; i8++) {
                            if (z6) {
                                zArr[i8] = false;
                            } else if (zArr[i8]) {
                                z6 = true;
                            }
                        }
                    }
                }
            }
            if (pollCreateActivity.hintShowed && !pollCreateActivity.quizPoll) {
                pollCreateActivity.hintView.hide(true);
            }
            pollCreateActivity.listView.getChildCount();
            for (int i9 = pollCreateActivity.answerStartRow; i9 < pollCreateActivity.answerStartRow + pollCreateActivity.answersCount; i9++) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = pollCreateActivity.listView.findViewHolderForAdapterPosition(i9);
                if (viewHolderFindViewHolderForAdapterPosition3 != null) {
                    View view2 = viewHolderFindViewHolderForAdapterPosition3.itemView;
                    if (view2 instanceof PollEditTextCell) {
                        PollEditTextCell pollEditTextCell = (PollEditTextCell) view2;
                        pollEditTextCell.setShowCheckBox(pollCreateActivity.quizPoll, true);
                        pollEditTextCell.checkBox.checkBoxBase.setChecked(-1, zArr[i9 - pollCreateActivity.answerStartRow], z2);
                        if (pollEditTextCell.getTop() > AndroidUtilities.dp(40.0f) && i == pollCreateActivity.quizRow && !pollCreateActivity.hintShowed) {
                            pollCreateActivity.hintView.showForView(pollEditTextCell.getCheckBox(), true);
                            pollCreateActivity.hintShowed = true;
                        }
                    }
                }
            }
            textCheckCell.setChecked(z);
            pollCreateActivity.checkDoneButton$2();
        }
    }

    private final void onItemClick$org$telegram$ui$PremiumPreviewFragment$BackgroundView$$ExternalSyntheticLambda0(int i, View view) {
        PremiumPreviewFragment.BackgroundView.AnonymousClass2 anonymousClass2;
        PremiumPreviewFragment.SubscriptionTier subscriptionTier;
        PremiumPreviewFragment.BackgroundView backgroundView = (PremiumPreviewFragment.BackgroundView) this.f$0;
        backgroundView.getClass();
        if (view.isEnabled() && (view instanceof PremiumTierCell)) {
            PremiumTierCell premiumTierCell = (PremiumTierCell) view;
            PremiumPreviewFragment premiumPreviewFragment = PremiumPreviewFragment.this;
            ArrayList arrayList = premiumPreviewFragment.subscriptionTiers;
            premiumPreviewFragment.selectedTierIndex = arrayList.indexOf(premiumTierCell.getTier());
            boolean z = true;
            premiumPreviewFragment.updateButtonText(true);
            premiumTierCell.setChecked(true, true);
            int i2 = 0;
            while (true) {
                anonymousClass2 = backgroundView.tierListView;
                if (i2 >= anonymousClass2.getChildCount()) {
                    break;
                }
                View childAt = anonymousClass2.getChildAt(i2);
                if (childAt instanceof PremiumTierCell) {
                    PremiumTierCell premiumTierCell2 = (PremiumTierCell) childAt;
                    if (premiumTierCell2.getTier() != premiumTierCell.getTier()) {
                        premiumTierCell2.setChecked(false, true);
                    }
                }
                i2++;
            }
            for (int i3 = 0; i3 < anonymousClass2.getHiddenChildCount(); i3++) {
                View hiddenChildAt = anonymousClass2.getHiddenChildAt(i3);
                if (hiddenChildAt instanceof PremiumTierCell) {
                    PremiumTierCell premiumTierCell3 = (PremiumTierCell) hiddenChildAt;
                    if (premiumTierCell3.getTier() != premiumTierCell.getTier()) {
                        premiumTierCell3.setChecked(false, true);
                    }
                }
            }
            for (int i4 = 0; i4 < anonymousClass2.getCachedChildCount(); i4++) {
                View cachedChildAt = anonymousClass2.getCachedChildAt(i4);
                if (cachedChildAt instanceof PremiumTierCell) {
                    PremiumTierCell premiumTierCell4 = (PremiumTierCell) cachedChildAt;
                    if (premiumTierCell4.getTier() != premiumTierCell.getTier()) {
                        premiumTierCell4.setChecked(false, true);
                    }
                }
            }
            for (int i5 = 0; i5 < anonymousClass2.getAttachedScrapChildCount(); i5++) {
                View attachedScrapChildAt = anonymousClass2.getAttachedScrapChildAt(i5);
                if (attachedScrapChildAt instanceof PremiumTierCell) {
                    PremiumTierCell premiumTierCell5 = (PremiumTierCell) attachedScrapChildAt;
                    if (premiumTierCell5.getTier() != premiumTierCell.getTier()) {
                        premiumTierCell5.setChecked(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.buttonContainer;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((subscriptionTier = premiumPreviewFragment.currentSubscriptionTier) == null || subscriptionTier.subscriptionOption.months >= ((PremiumPreviewFragment.SubscriptionTier) arrayList.get(premiumPreviewFragment.selectedTierIndex)).subscriptionOption.months || premiumPreviewFragment.forcePremium)) {
                z = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z);
        }
    }

    private final void onItemClick$org$telegram$ui$PrivacyControlActivity$$ExternalSyntheticLambda0(int i, View view) {
        boolean z;
        int i2;
        PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.f$0;
        if (i == privacyControlActivity.currentPhotoForRestRow) {
            AlertDialog alertDialog = AlertsCreator.createSimpleAlert(privacyControlActivity.getParentActivity(), LocaleController.getString(R.string.RemovePublicPhoto), LocaleController.getString(R.string.RemovePhotoForRestDescription), LocaleController.getString(R.string.Remove), new PrivacyControlActivity$$ExternalSyntheticLambda5(privacyControlActivity, 0), null).alertDialog;
            alertDialog.show();
            alertDialog.redPositive();
            return;
        }
        int i3 = 0;
        z = false;
        boolean z2 = false;
        if (i == privacyControlActivity.photoForRestRow) {
            ImageUpdater imageUpdater = privacyControlActivity.imageUpdater;
            if (imageUpdater != null) {
                imageUpdater.openMenu(false, new ChatActivity$$ExternalSyntheticLambda470(5), new OAuthSheet$$ExternalSyntheticLambda11(privacyControlActivity, 27), 0);
                privacyControlActivity.cameraDrawable.setCurrentFrame(0, true, false);
                privacyControlActivity.cameraDrawable.setCustomEndFrame(43);
                privacyControlActivity.setAvatarCell.imageView.playAnimation();
                return;
            }
            return;
        }
        int i4 = privacyControlActivity.rulesType;
        if (i4 == 10 && i == privacyControlActivity.myContactsRow && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium()) {
            BulletinFactory.of(privacyControlActivity).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new PrivacyControlActivity$$ExternalSyntheticLambda5(privacyControlActivity, 2)).show();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i5 = -privacyControlActivity.shakeDp;
            privacyControlActivity.shakeDp = i5;
            AndroidUtilities.shakeViewSpring(view, i5);
            return;
        }
        if (i4 == 8 && ((i == privacyControlActivity.myContactsRow || i == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().isPremium())) {
            BulletinFactory.of(privacyControlActivity).createSimpleBulletin(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new PrivacyControlActivity$$ExternalSyntheticLambda5(privacyControlActivity, 3)).show();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i6 = -privacyControlActivity.shakeDp;
            privacyControlActivity.shakeDp = i6;
            AndroidUtilities.shakeViewSpring(view, i6);
            return;
        }
        if (i == privacyControlActivity.nobodyRow || i == privacyControlActivity.everybodyRow || i == privacyControlActivity.myContactsRow || i == privacyControlActivity.payRow) {
            if (i4 == 12 && privacyControlActivity.areAllStarGiftsDisabled()) {
                int i7 = -privacyControlActivity.shakeDp;
                privacyControlActivity.shakeDp = i7;
                AndroidUtilities.shakeViewSpring(view, i7);
                return;
            }
            if (i == privacyControlActivity.nobodyRow) {
                i3 = 1;
            } else if (i != privacyControlActivity.everybodyRow) {
                i3 = i == privacyControlActivity.payRow ? 3 : 2;
            }
            if (i3 == privacyControlActivity.currentType) {
                return;
            }
            privacyControlActivity.currentType = i3;
            Bulletin bulletin = Bulletin.visibleBulletin;
            if (bulletin != null) {
                bulletin.hide();
            }
            privacyControlActivity.updateDoneButton();
            privacyControlActivity.updateRows$6(true);
            return;
        }
        if (i == privacyControlActivity.phoneContactsRow || i == privacyControlActivity.phoneEverybodyRow) {
            int i8 = i != privacyControlActivity.phoneEverybodyRow ? 1 : 0;
            if (i8 == privacyControlActivity.currentSubType) {
                return;
            }
            privacyControlActivity.currentSubType = i8;
            privacyControlActivity.updateDoneButton();
            privacyControlActivity.updateRows$6(true);
            return;
        }
        if (i == privacyControlActivity.neverShareRow || i == privacyControlActivity.alwaysShareRow) {
            if (i4 == 12 && privacyControlActivity.areAllStarGiftsDisabled()) {
                int i9 = -privacyControlActivity.shakeDp;
                privacyControlActivity.shakeDp = i9;
                AndroidUtilities.shakeViewSpring(view, i9);
                return;
            }
            ArrayList arrayList = i == privacyControlActivity.neverShareRow ? privacyControlActivity.currentMinus : privacyControlActivity.currentPlus;
            Bundle bundle = new Bundle();
            bundle.putBoolean(i == privacyControlActivity.neverShareRow ? "isNeverShare" : "isAlwaysShare", true);
            bundle.putInt("chatAddType", i4 != 0 ? 1 : 0);
            if (i == privacyControlActivity.alwaysShareRow && i4 == 1) {
                bundle.putBoolean("allowPremium", true);
            }
            boolean z3 = i4 == 12 && ((i2 = privacyControlActivity.currentType) != 1 ? !(i2 != 2 ? !(i2 == 0 && i == privacyControlActivity.neverShareRow) : i != privacyControlActivity.alwaysShareRow) : i == privacyControlActivity.alwaysShareRow);
            bundle.putBoolean("allowMiniapps", z3);
            GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle);
            if (i4 == 10) {
                groupCreateActivity.customTitle = LocaleController.getString(R.string.RemoveMessageFeeTitle);
            }
            if (i != privacyControlActivity.alwaysShareRow) {
                z = false;
            } else {
                if (privacyControlActivity.currentPlusPremium[privacyControlActivity.currentType == 2 ? (char) 0 : (char) 1]) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z3 && privacyControlActivity.currentPlusMiniapps[privacyControlActivity.currentType]) {
                z2 = true;
            }
            groupCreateActivity.select(arrayList, z, z2);
            groupCreateActivity.delegate = new PrivacyControlActivity$$ExternalSyntheticLambda9(i, privacyControlActivity, z3);
            groupCreateActivity.showDiscardConfirm = true;
            privacyControlActivity.presentFragment(groupCreateActivity);
            return;
        }
        if (i == privacyControlActivity.p2pRow) {
            privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
            return;
        }
        if (i == privacyControlActivity.readRow) {
            privacyControlActivity.selectedReadValue = !privacyControlActivity.selectedReadValue;
            privacyControlActivity.updateDoneButton();
            ((TextCheckCell) view).setChecked(privacyControlActivity.selectedReadValue);
            return;
        }
        if (i == privacyControlActivity.readPremiumRow) {
            privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
            return;
        }
        if (i == privacyControlActivity.showGiftIconRow) {
            privacyControlActivity.selectedGiftIconValue = !privacyControlActivity.selectedGiftIconValue;
            privacyControlActivity.updateDoneButton();
            ((TextCheckCell) view).setChecked(privacyControlActivity.selectedGiftIconValue);
            return;
        }
        if (i == privacyControlActivity.giftTypeLimitedRow) {
            if (privacyControlActivity.selectedGiftLimitedValue && !privacyControlActivity.getUserConfig().isPremium()) {
                int i10 = -privacyControlActivity.shakeDp;
                privacyControlActivity.shakeDp = i10;
                AndroidUtilities.shakeViewSpring(view, i10);
                privacyControlActivity.showPremiumBulletin();
                return;
            }
            boolean zAreAllStarGiftsDisabled = privacyControlActivity.areAllStarGiftsDisabled();
            privacyControlActivity.selectedGiftLimitedValue = !privacyControlActivity.selectedGiftLimitedValue;
            privacyControlActivity.updateDoneButton();
            TextCheckCell textCheckCell = (TextCheckCell) view;
            textCheckCell.setChecked(privacyControlActivity.selectedGiftLimitedValue);
            if (privacyControlActivity.selectedGiftLimitedValue && !privacyControlActivity.getUserConfig().isPremium()) {
                textCheckCell.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zAreAllStarGiftsDisabled != privacyControlActivity.areAllStarGiftsDisabled()) {
                privacyControlActivity.updateRows$6(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.listView);
                return;
            }
            return;
        }
        if (i == privacyControlActivity.giftTypeUnlimitedRow) {
            if (privacyControlActivity.selectedGiftUnlimitedValue && !privacyControlActivity.getUserConfig().isPremium()) {
                int i11 = -privacyControlActivity.shakeDp;
                privacyControlActivity.shakeDp = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                privacyControlActivity.showPremiumBulletin();
                return;
            }
            boolean zAreAllStarGiftsDisabled2 = privacyControlActivity.areAllStarGiftsDisabled();
            privacyControlActivity.selectedGiftUnlimitedValue = !privacyControlActivity.selectedGiftUnlimitedValue;
            privacyControlActivity.updateDoneButton();
            TextCheckCell textCheckCell2 = (TextCheckCell) view;
            textCheckCell2.setChecked(privacyControlActivity.selectedGiftUnlimitedValue);
            if (privacyControlActivity.selectedGiftUnlimitedValue && !privacyControlActivity.getUserConfig().isPremium()) {
                textCheckCell2.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zAreAllStarGiftsDisabled2 != privacyControlActivity.areAllStarGiftsDisabled()) {
                privacyControlActivity.updateRows$6(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.listView);
                return;
            }
            return;
        }
        if (i == privacyControlActivity.giftTypeUniqueRow) {
            if (privacyControlActivity.selectedGiftUniqueValue && !privacyControlActivity.getUserConfig().isPremium()) {
                int i12 = -privacyControlActivity.shakeDp;
                privacyControlActivity.shakeDp = i12;
                AndroidUtilities.shakeViewSpring(view, i12);
                privacyControlActivity.showPremiumBulletin();
                return;
            }
            boolean zAreAllStarGiftsDisabled3 = privacyControlActivity.areAllStarGiftsDisabled();
            privacyControlActivity.selectedGiftUniqueValue = !privacyControlActivity.selectedGiftUniqueValue;
            privacyControlActivity.updateDoneButton();
            TextCheckCell textCheckCell3 = (TextCheckCell) view;
            textCheckCell3.setChecked(privacyControlActivity.selectedGiftUniqueValue);
            if (privacyControlActivity.selectedGiftUniqueValue && !privacyControlActivity.getUserConfig().isPremium()) {
                textCheckCell3.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zAreAllStarGiftsDisabled3 != privacyControlActivity.areAllStarGiftsDisabled()) {
                privacyControlActivity.updateRows$6(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.listView);
                return;
            }
            return;
        }
        if (i == privacyControlActivity.giftTypeChannelsRow) {
            if (privacyControlActivity.selectedGiftChannelsValue && !privacyControlActivity.getUserConfig().isPremium()) {
                int i13 = -privacyControlActivity.shakeDp;
                privacyControlActivity.shakeDp = i13;
                AndroidUtilities.shakeViewSpring(view, i13);
                privacyControlActivity.showPremiumBulletin();
                return;
            }
            boolean zAreAllStarGiftsDisabled4 = privacyControlActivity.areAllStarGiftsDisabled();
            privacyControlActivity.selectedGiftChannelsValue = !privacyControlActivity.selectedGiftChannelsValue;
            privacyControlActivity.updateDoneButton();
            TextCheckCell textCheckCell4 = (TextCheckCell) view;
            textCheckCell4.setChecked(privacyControlActivity.selectedGiftChannelsValue);
            if (privacyControlActivity.selectedGiftChannelsValue && !privacyControlActivity.getUserConfig().isPremium()) {
                textCheckCell4.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zAreAllStarGiftsDisabled4 != privacyControlActivity.areAllStarGiftsDisabled()) {
                privacyControlActivity.updateRows$6(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.listView);
                return;
            }
            return;
        }
        if (i == privacyControlActivity.giftTypePremiumRow) {
            if (privacyControlActivity.selectedGiftPremiumValue && !privacyControlActivity.getUserConfig().isPremium()) {
                int i14 = -privacyControlActivity.shakeDp;
                privacyControlActivity.shakeDp = i14;
                AndroidUtilities.shakeViewSpring(view, i14);
                privacyControlActivity.showPremiumBulletin();
                return;
            }
            boolean zAreAllStarGiftsDisabled5 = privacyControlActivity.areAllStarGiftsDisabled();
            privacyControlActivity.selectedGiftPremiumValue = !privacyControlActivity.selectedGiftPremiumValue;
            privacyControlActivity.updateDoneButton();
            TextCheckCell textCheckCell5 = (TextCheckCell) view;
            textCheckCell5.setChecked(privacyControlActivity.selectedGiftPremiumValue);
            if (privacyControlActivity.selectedGiftPremiumValue && !privacyControlActivity.getUserConfig().isPremium()) {
                textCheckCell5.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zAreAllStarGiftsDisabled5 != privacyControlActivity.areAllStarGiftsDisabled()) {
                privacyControlActivity.updateRows$6(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.listView);
            }
        }
    }

    @Override
    public final void onItemClick(int i, View view) throws Throwable {
        int i2;
        SuggestEmojiView.AnchorViewDelegate anchorViewDelegate;
        int iIntValue;
        int iIntValue2;
        ?? r10;
        int i3;
        SuggestEmojiView.AnonymousClass2 anonymousClass2;
        ?? fontMetricsInt;
        int i4;
        CharSequence charSequenceReplaceEmoji;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        Emoji.EmojiSpan[] emojiSpanArr;
        int i5;
        AnimatedEmojiSpan animatedEmojiSpan;
        Paint.FontMetricsInt fontMetricsInt2;
        ArrayList arrayList;
        ArrayList arrayList2;
        TLRPC.StickerSetCovered stickerSetCovered;
        CountrySelectActivity.CountrySelectActivityDelegate countrySelectActivityDelegate;
        FilterCreateActivity.ItemInner itemInner;
        UItem item;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i6 = 8;
        int i7 = 7;
        int i8 = 3;
        int i9 = 4;
        CountrySelectActivity.Country country = null;
        boolean z = true;
        boolean z2 = true;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f$0;
                ArrayList arrayList3 = photoViewer.imagesArrLocals;
                if (!arrayList3.isEmpty() && (i2 = photoViewer.currentIndex) >= 0 && i2 < arrayList3.size()) {
                    Object obj = arrayList3.get(photoViewer.currentIndex);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.getCurrentVideoEditedInfo();
                    }
                }
                photoViewer.ignoreDidSetImage = true;
                int iIndexOf = arrayList3.indexOf(view.getTag());
                if (iIndexOf >= 0) {
                    photoViewer.currentIndex = -1;
                    photoViewer.setImageIndex(iIndexOf);
                }
                photoViewer.ignoreDidSetImage = false;
                return;
            case 1:
                ((StickersAlert) this.f$0).lambda$init$11(i, view);
                return;
            case 2:
                ?? r4 = (SuggestEmojiView) this.f$0;
                r4.getClass();
                String str = ((SuggestEmojiView.EmojiImageView) view).emoji;
                if (r4.show && (anchorViewDelegate = r4.enterView) != null && (anchorViewDelegate.getFieldText() instanceof Spanned)) {
                    if (r4.arrowToSpan != null) {
                        iIntValue = ((Spanned) r4.enterView.getFieldText()).getSpanStart(r4.arrowToSpan);
                        iIntValue2 = ((Spanned) r4.enterView.getFieldText()).getSpanEnd(r4.arrowToSpan);
                    } else {
                        Integer num = r4.arrowToStart;
                        if (num == null || r4.arrowToEnd == null) {
                            return;
                        }
                        iIntValue = num.intValue();
                        iIntValue2 = r4.arrowToEnd.intValue();
                        r4.arrowToEnd = null;
                        r4.arrowToStart = null;
                    }
                    ?? editText = r4.enterView.getEditText();
                    if (editText == 0 || iIntValue < 0 || iIntValue2 < 0 || iIntValue > editText.length() || iIntValue2 > editText.length()) {
                        return;
                    }
                    if (r4.arrowToSpan != null) {
                        if (r4.enterView.getFieldText() instanceof Spannable) {
                            ((Spannable) r4.enterView.getFieldText()).removeSpan(r4.arrowToSpan);
                        }
                        r4.arrowToSpan = null;
                    }
                    String string = editText.toString();
                    String strSubstring = string.substring(iIntValue, iIntValue2);
                    int length = strSubstring.length();
                    int i10 = iIntValue2 - length;
                    while (true) {
                        if (i10 >= 0) {
                            int i11 = i10 + length;
                            if (string.substring(i10, i11).equals(strSubstring)) {
                                if (r4.enterView.getEditField() != null) {
                                    fontMetricsInt2 = r4.enterView.getEditField().getPaint().getFontMetricsInt();
                                } else {
                                    fontMetricsInt = country;
                                }
                                if (fontMetricsInt == 0) {
                                    fontMetricsInt = fontMetricsInt2;
                                    Paint paint = new Paint();
                                    paint.setTextSize(AndroidUtilities.dp(18.0f));
                                    fontMetricsInt = paint.getFontMetricsInt();
                                }
                                if (str == null || !str.startsWith("animated_")) {
                                    string = string;
                                    i4 = i11;
                                    length = length;
                                    charSequenceReplaceEmoji = Emoji.replaceEmoji(str, fontMetricsInt, z);
                                } else {
                                    try {
                                        i4 = i11;
                                        try {
                                            long j = Long.parseLong(str.substring(9));
                                            TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(r4.currentAccount, j);
                                            SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(documentFindDocument));
                                            if (documentFindDocument == null) {
                                                try {
                                                    animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.2f, fontMetricsInt);
                                                } catch (Exception unused) {
                                                    string = string;
                                                    length = length;
                                                    charSequenceReplaceEmoji = null;
                                                }
                                            } else {
                                                AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(documentFindDocument.id, 1.2f, fontMetricsInt);
                                                animatedEmojiSpan2.document = documentFindDocument;
                                                animatedEmojiSpan = animatedEmojiSpan2;
                                            }
                                            try {
                                                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                                                charSequenceReplaceEmoji = spannableString;
                                            } catch (Exception unused2) {
                                                charSequenceReplaceEmoji = null;
                                            }
                                        } catch (Exception unused3) {
                                            length = length;
                                            charSequenceReplaceEmoji = null;
                                            if (charSequenceReplaceEmoji != null) {
                                                int i12 = i4;
                                                animatedEmojiSpanArr = (AnimatedEmojiSpan[]) editText.getSpans(i10, i12, AnimatedEmojiSpan.class);
                                                if (animatedEmojiSpanArr != null) {
                                                }
                                                emojiSpanArr = (Emoji.EmojiSpan[]) editText.getSpans(i10, i12, Emoji.EmojiSpan.class);
                                                if (emojiSpanArr != null) {
                                                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                                        editText.removeSpan(emojiSpan);
                                                    }
                                                }
                                                editText.replace(i10, i12, "");
                                                editText.insert(i10, charSequenceReplaceEmoji);
                                                i10 -= length;
                                                string = string;
                                                length = length;
                                                z = true;
                                                country = null;
                                            } else {
                                                r10 = 1;
                                                i3 = 3;
                                            }
                                            r4.performHapticFeedback(i3, r10);
                                            Emoji.addRecentEmoji(str);
                                            r4.show = false;
                                            r4.forceClose = r10;
                                            r4.lastQueryType = 0;
                                            anonymousClass2 = r4.containerView;
                                            if (anonymousClass2 != null) {
                                                anonymousClass2.invalidate();
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Exception unused4) {
                                        i4 = i11;
                                    }
                                }
                                if (charSequenceReplaceEmoji != null) {
                                    int i13 = i4;
                                    animatedEmojiSpanArr = (AnimatedEmojiSpan[]) editText.getSpans(i10, i13, AnimatedEmojiSpan.class);
                                    if (animatedEmojiSpanArr != null || animatedEmojiSpanArr.length <= 0) {
                                        emojiSpanArr = (Emoji.EmojiSpan[]) editText.getSpans(i10, i13, Emoji.EmojiSpan.class);
                                        if (emojiSpanArr != null) {
                                            while (i5 < emojiSpanArr.length) {
                                                editText.removeSpan(emojiSpan);
                                            }
                                        }
                                        editText.replace(i10, i13, "");
                                        editText.insert(i10, charSequenceReplaceEmoji);
                                        i10 -= length;
                                        string = string;
                                        length = length;
                                        z = true;
                                        country = null;
                                    } else {
                                        i3 = 3;
                                        r10 = 1;
                                    }
                                }
                                break;
                            }
                        }
                        r10 = 1;
                        i3 = 3;
                    }
                    try {
                        r4.performHapticFeedback(i3, r10);
                        break;
                    } catch (Exception unused5) {
                    }
                    Emoji.addRecentEmoji(str);
                    r4.show = false;
                    r4.forceClose = r10;
                    r4.lastQueryType = 0;
                    anonymousClass2 = r4.containerView;
                    if (anonymousClass2 != null) {
                        anonymousClass2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) this.f$0;
                if (i == 0) {
                    editorAlert.getClass();
                    return;
                }
                RecyclerView.Adapter adapter = editorAlert.listView.getAdapter();
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                FloatingDebugView.AnonymousClass3 anonymousClass3 = editorAlert.listAdapter;
                if (adapter == anonymousClass3) {
                    int i14 = i - 1;
                    if (i14 >= 0) {
                        if (i14 < ((ArrayList) anonymousClass3.this$0).size()) {
                            arrayList2 = (ArrayList) ((ArrayList) anonymousClass3.this$0).get(i14);
                        }
                        themeEditorView.currentThemeDesription = arrayList2;
                    } else {
                        anonymousClass3.getClass();
                    }
                    arrayList2 = null;
                    themeEditorView.currentThemeDesription = arrayList2;
                } else {
                    int i15 = i - 1;
                    ThemeEditorView.EditorAlert.SearchAdapter searchAdapter = editorAlert.searchAdapter;
                    if (i15 >= 0) {
                        if (i15 < searchAdapter.searchResult.size()) {
                            arrayList = (ArrayList) searchAdapter.searchResult.get(i15);
                        }
                        themeEditorView.currentThemeDesription = arrayList;
                    } else {
                        searchAdapter.getClass();
                    }
                    arrayList = null;
                    themeEditorView.currentThemeDesription = arrayList;
                }
                themeEditorView.currentThemeDesriptionPosition = i;
                for (int i16 = 0; i16 < themeEditorView.currentThemeDesription.size(); i16++) {
                    ThemeDescription themeDescription = (ThemeDescription) themeEditorView.currentThemeDesription.get(i16);
                    int i17 = themeDescription.currentKey;
                    if (i17 == Theme.key_chat_wallpaper) {
                        WallpaperUpdater wallpaperUpdater = themeEditorView.wallpaperUpdater;
                        wallpaperUpdater.getClass();
                        BottomSheet bottomSheet = new BottomSheet(wallpaperUpdater.parentActivity, null, false, false);
                        bottomSheet.fixNavigationBar();
                        bottomSheet.title = LocaleController.getString(R.string.ChoosePhoto);
                        bottomSheet.bigTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                        DialogsActivity$$ExternalSyntheticLambda124 dialogsActivity$$ExternalSyntheticLambda124 = new DialogsActivity$$ExternalSyntheticLambda124(wallpaperUpdater, z2 ? 1 : 0);
                        bottomSheet.items = charSequenceArr;
                        bottomSheet.itemIcons = null;
                        bottomSheet.onClickListener = dialogsActivity$$ExternalSyntheticLambda124;
                        bottomSheet.show();
                        return;
                    }
                    int color = Theme.getColor(themeDescription.previousIsDefault, i17, false);
                    themeDescription.previousColor = color;
                    if (i16 == 0) {
                        editorAlert.colorPicker.setColor(color);
                    }
                }
                editorAlert.setColorPickerVisible(true);
                return;
            case 4:
                TrendingStickersLayout trendingStickersLayout = (TrendingStickersLayout) this.f$0;
                RecyclerView.Adapter adapter2 = trendingStickersLayout.listView.getAdapter();
                StickersSearchAdapter stickersSearchAdapter = trendingStickersLayout.searchAdapter;
                if (adapter2 == stickersSearchAdapter) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) stickersSearchAdapter.positionsToSets.get(i);
                } else {
                    TrendingStickersLayout.TrendingStickersAdapter trendingStickersAdapter = trendingStickersLayout.adapter;
                    stickerSetCovered = i < trendingStickersAdapter.totalItems ? (TLRPC.StickerSetCovered) trendingStickersAdapter.positionsToSets.get(i) : null;
                }
                if (stickerSetCovered != null) {
                    trendingStickersLayout.showStickerSet(stickerSetCovered.set, null);
                    return;
                }
                return;
            case 5:
                ContentPreviewViewer.AnonymousClass1 anonymousClass1 = (ContentPreviewViewer.AnonymousClass1) this.f$0;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ContentPreviewViewer.StickerPackNameView) view).cover;
                ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.this;
                CustomEmojiReactionsWindow reactionsWindow = contentPreviewViewer.reactionsLayout.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.dismissed) {
                    reactionsWindow.dismiss();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    StickersDialogs.showNameEditorDialog(null, contentPreviewViewer.resourcesProvider, contentPreviewViewer.containerView.getContext(), new GiftSheet$$ExternalSyntheticLambda8(anonymousClass1, 17));
                    return;
                }
                ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate = contentPreviewViewer.delegate;
                if (contentPreviewViewerDelegate != null) {
                    contentPreviewViewerDelegate.stickerSetSelected(stickerSetCovered2.set, TextUtils.join("", contentPreviewViewer.selectedEmojis));
                }
                contentPreviewViewer.dismissPopupWindow();
                return;
            case 6:
                CountrySelectActivity countrySelectActivity = (CountrySelectActivity) this.f$0;
                if (countrySelectActivity.searching && countrySelectActivity.searchWas) {
                    CountrySelectActivity.CountrySearchAdapter countrySearchAdapter = countrySelectActivity.searchListViewAdapter;
                    ArrayList arrayList4 = countrySearchAdapter.searchResult;
                    if (arrayList4 != null && i >= 0 && i < arrayList4.size()) {
                        country = (CountrySelectActivity.Country) countrySearchAdapter.searchResult.get(i);
                    }
                } else {
                    int sectionForPosition = countrySelectActivity.listViewAdapter.getSectionForPosition(i);
                    int positionInSectionForPosition = countrySelectActivity.listViewAdapter.getPositionInSectionForPosition(i);
                    if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
                        return;
                    }
                    CountrySelectActivity.CountryAdapter countryAdapter = countrySelectActivity.listViewAdapter;
                    if (sectionForPosition < 0) {
                        countryAdapter.getClass();
                    } else if (sectionForPosition < countryAdapter.sortedCountries.size()) {
                        ArrayList arrayList5 = (ArrayList) countryAdapter.countries.get(countryAdapter.sortedCountries.get(sectionForPosition));
                        if (positionInSectionForPosition >= 0 && positionInSectionForPosition < arrayList5.size()) {
                            country = (CountrySelectActivity.Country) arrayList5.get(positionInSectionForPosition);
                        }
                    }
                }
                if (i < 0) {
                    return;
                }
                countrySelectActivity.finishFragment();
                if (country == null || (countrySelectActivityDelegate = countrySelectActivity.delegate) == null) {
                    return;
                }
                countrySelectActivityDelegate.didSelectCountry(country);
                return;
            case 7:
                DataUsage2Activity.ListView listView = (DataUsage2Activity.ListView) this.f$0;
                listView.getClass();
                boolean z3 = view instanceof DataUsage2Activity.Cell;
                DataUsage2Activity dataUsage2Activity = DataUsage2Activity.this;
                if (z3 && i >= 0) {
                    ArrayList arrayList6 = listView.itemInners;
                    if (i < arrayList6.size()) {
                        DataUsage2Activity.ItemInner itemInner2 = (DataUsage2Activity.ItemInner) arrayList6.get(i);
                        if (itemInner2 != null) {
                            int i18 = itemInner2.index;
                            if (i18 >= 0) {
                                boolean[] zArr = listView.collapsed;
                                zArr[i18] = !zArr[i18];
                                listView.updateRows$10(true);
                                return;
                            } else {
                                if (i18 == -2) {
                                    dataUsage2Activity.presentFragment(new DataAutoDownloadActivity(listView.currentType - 1));
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
                if (view instanceof TextCell) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(dataUsage2Activity.getParentActivity(), 0, null);
                    String string2 = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string2;
                    alertDialog.message = LocaleController.getString(R.string.ResetStatisticsAlert);
                    builder.setPositiveButton(LocaleController.getString(R.string.Reset), new DataUsage2Activity$ListView$$ExternalSyntheticLambda0(listView));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    dataUsage2Activity.showDialog(alertDialog);
                    TextView textView = (TextView) alertDialog.getButton(-1);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((MemberRequestsActivity.AnonymousClass1) this.f$0).onItemClick(view);
                return;
            case 9:
                ((MemberRequestsDelegate) this.f$0).onItemClick(view);
                return;
            case 10:
                ((FilterChatlistActivity) this.f$0).lambda$createView$0$6(i, view);
                return;
            case 11:
                FilterCreateActivity filterCreateActivity = (FilterCreateActivity) this.f$0;
                if (filterCreateActivity.getParentActivity() == null || (itemInner = (FilterCreateActivity.ItemInner) filterCreateActivity.items.get(i)) == null) {
                    return;
                }
                View.OnClickListener onClickListener = itemInner.onClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                int i19 = itemInner.viewType;
                if (i19 == 1) {
                    UserCell userCell = (UserCell) view;
                    filterCreateActivity.showRemoveAlert(itemInner, userCell.getName(), userCell.getCurrentObject(), itemInner.include);
                    return;
                }
                if (i19 == 7) {
                    DialogsActivity$$ExternalSyntheticLambda8 dialogsActivity$$ExternalSyntheticLambda8 = new DialogsActivity$$ExternalSyntheticLambda8(28, filterCreateActivity, itemInner);
                    if (filterCreateActivity.doneItem.isEnabled()) {
                        filterCreateActivity.save(dialogsActivity$$ExternalSyntheticLambda8, false);
                        return;
                    } else {
                        dialogsActivity$$ExternalSyntheticLambda8.run();
                        return;
                    }
                }
                if (i19 == 8 || (i19 == 4 && itemInner.iconResId == R.drawable.msg2_link2)) {
                    if (filterCreateActivity.creatingNew && filterCreateActivity.doneItem.getAlpha() > 0.0f) {
                        float f = -filterCreateActivity.shiftDp;
                        filterCreateActivity.shiftDp = f;
                        AndroidUtilities.shakeViewSpring(view, f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        filterCreateActivity.doNotCloseWhenSave = true;
                        FilterCreateActivity.AnonymousClass5 anonymousClass5 = filterCreateActivity.saveHintView;
                        if (anonymousClass5 == null || anonymousClass5.getVisibility() != 0) {
                            FilterCreateActivity.AnonymousClass5 anonymousClass6 = new FilterCreateActivity.AnonymousClass5(6, filterCreateActivity.getParentActivity(), null, true);
                            filterCreateActivity.saveHintView = anonymousClass6;
                            anonymousClass6.textView.setMaxWidth(AndroidUtilities.displaySize.x);
                            filterCreateActivity.saveHintView.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                            filterCreateActivity.saveHintView.setText(LocaleController.getString(R.string.FilterFinishCreating));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                            ((ActionBarLayout) filterCreateActivity.getParentLayout()).getOverlayContainerView().addView(filterCreateActivity.saveHintView, marginLayoutParams);
                            filterCreateActivity.saveHintView.showForView(filterCreateActivity.doneItem, true);
                            return;
                        }
                        return;
                    }
                    boolean zIsEmpty = TextUtils.isEmpty(filterCreateActivity.newFilterName);
                    MessagesController.DialogFilter dialogFilter = filterCreateActivity.filter;
                    if (!(zIsEmpty && TextUtils.isEmpty(dialogFilter.name)) && (filterCreateActivity.newFilterFlags & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && filterCreateActivity.newNeverShow.isEmpty() && !filterCreateActivity.newAlwaysShow.isEmpty()) {
                        filterCreateActivity.save(new FilterCreateActivity$$ExternalSyntheticLambda16(filterCreateActivity, 1), false);
                        return;
                    }
                    float f2 = -filterCreateActivity.shiftDp;
                    filterCreateActivity.shiftDp = f2;
                    AndroidUtilities.shakeViewSpring(view, f2);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (TextUtils.isEmpty(filterCreateActivity.newFilterName) && TextUtils.isEmpty(dialogFilter.name)) {
                        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.FilterInviteErrorEmptyName, BulletinFactory.of(filterCreateActivity), null);
                        return;
                    }
                    if ((filterCreateActivity.newFilterFlags & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                        if (filterCreateActivity.newNeverShow.isEmpty()) {
                            UserNameResolver$$ExternalSyntheticOutline0.m(R.string.FilterInviteErrorTypes, BulletinFactory.of(filterCreateActivity), null);
                            return;
                        } else {
                            UserNameResolver$$ExternalSyntheticOutline0.m(R.string.FilterInviteErrorTypesExcluded, BulletinFactory.of(filterCreateActivity), null);
                            return;
                        }
                    }
                    if (filterCreateActivity.newAlwaysShow.isEmpty()) {
                        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.FilterInviteErrorEmpty, BulletinFactory.of(filterCreateActivity), null);
                        return;
                    } else {
                        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.FilterInviteErrorExcluded, BulletinFactory.of(filterCreateActivity), null);
                        return;
                    }
                }
                return;
            case 12:
                int i20 = i - 1;
                FilterCreateActivity.FilterInvitesBottomSheet filterInvitesBottomSheet = (FilterCreateActivity.FilterInvitesBottomSheet) this.f$0;
                if (i20 < 0) {
                    filterInvitesBottomSheet.getClass();
                    return;
                }
                ArrayList arrayList7 = filterInvitesBottomSheet.items;
                if (i20 >= arrayList7.size()) {
                    return;
                }
                FilterCreateActivity.ItemInner itemInner3 = (FilterCreateActivity.ItemInner) arrayList7.get(i20);
                int i21 = itemInner3.viewType;
                if (i21 == 7) {
                    filterInvitesBottomSheet.lambda$showGiftOfferSheet$15();
                    filterInvitesBottomSheet.baseFragment.presentFragment(new FilterChatlistActivity(filterInvitesBottomSheet.filter, itemInner3.link));
                    return;
                } else {
                    if (i21 == 8) {
                        filterInvitesBottomSheet.createLink();
                        return;
                    }
                    return;
                }
            case 13:
                FilteredSearchView filteredSearchView = (FilteredSearchView) this.f$0;
                filteredSearchView.getClass();
                if (view instanceof SharedDocumentCell) {
                    filteredSearchView.onItemClick(i, (ViewGroup) view, ((SharedDocumentCell) view).getMessage(), 0);
                    return;
                }
                if (view instanceof SharedLinkCell) {
                    filteredSearchView.onItemClick(i, (ViewGroup) view, ((SharedLinkCell) view).getMessage(), 0);
                    return;
                }
                if (view instanceof SharedAudioCell) {
                    filteredSearchView.onItemClick(i, (ViewGroup) view, ((SharedAudioCell) view).getMessage(), 0);
                    return;
                } else if (view instanceof ContextLinkCell) {
                    filteredSearchView.onItemClick(i, (ViewGroup) view, ((ContextLinkCell) view).getMessageObject(), 0);
                    return;
                } else {
                    if (view instanceof DialogCell) {
                        filteredSearchView.onItemClick(i, (ViewGroup) view, ((DialogCell) view).getMessage(), 0);
                        return;
                    }
                    return;
                }
            case 14:
                ProfileGiftsContainer.SelectGiftsBottomSheet selectGiftsBottomSheet = (ProfileGiftsContainer.SelectGiftsBottomSheet) this.f$0;
                UniversalAdapter universalAdapter = selectGiftsBottomSheet.adapter;
                if (universalAdapter == null || (item = universalAdapter.getItem(i - 1)) == null) {
                    return;
                }
                Object obj2 = item.object;
                if (obj2 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                    int i22 = savedStarGift.msg_id;
                    long j2 = i22 == 0 ? savedStarGift.saved_id : i22;
                    HashSet hashSet = selectGiftsBottomSheet.selectedGiftIds;
                    if (hashSet.contains(Long.valueOf(j2))) {
                        hashSet.remove(Long.valueOf(j2));
                        ((GiftSheet.GiftCell) view).setChecked(false, true);
                    } else {
                        hashSet.add(Long.valueOf(j2));
                        ((GiftSheet.GiftCell) view).setChecked(true, true);
                    }
                    ButtonWithCounterView buttonWithCounterView = selectGiftsBottomSheet.button;
                    buttonWithCounterView.setEnabled(hashSet.size() > 0);
                    buttonWithCounterView.setCount(hashSet.size(), true);
                    return;
                }
                return;
            case 15:
                GroupInviteActivity groupInviteActivity = (GroupInviteActivity) this.f$0;
                if (groupInviteActivity.getParentActivity() == null) {
                    return;
                }
                if (i == groupInviteActivity.copyLinkRow || i == 0) {
                    if (groupInviteActivity.invite == null) {
                        return;
                    }
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", groupInviteActivity.invite.link));
                        BulletinFactory.of(groupInviteActivity).createCopyLinkBulletin(false).show();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                if (i != groupInviteActivity.shareLinkRow) {
                    if (i == groupInviteActivity.revokeLinkRow) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(groupInviteActivity.getParentActivity(), 0, null);
                        builder2.alertDialog.message = LocaleController.getString(R.string.RevokeAlert);
                        builder2.alertDialog.title = LocaleController.getString(R.string.RevokeLink);
                        builder2.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new VideoEditTextureView$$ExternalSyntheticLambda1(groupInviteActivity, 28));
                        builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        groupInviteActivity.showDialog(builder2.alertDialog);
                        return;
                    }
                    return;
                }
                if (groupInviteActivity.invite == null) {
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", groupInviteActivity.invite.link);
                    groupInviteActivity.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                    return;
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
            case 16:
                ((GroupStickersActivity) this.f$0).lambda$createView$0$1(i, view);
                return;
            case 17:
                ((InviteContactsActivity) this.f$0).lambda$createView$0$2(i, view);
                return;
            case 18:
                ((LanguageSelectActivity) this.f$0).lambda$createView$4(i, view);
                return;
            case 19:
                LocationActivity locationActivity = (LocationActivity) this.f$0;
                locationActivity.selectedMarkerId = -1L;
                int i23 = locationActivity.locationType;
                if (i23 == 4) {
                    if (i != 1 || (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) locationActivity.adapter.getItem(i)) == null) {
                        return;
                    }
                    if (locationActivity.dialogId == 0) {
                        locationActivity.delegate.didSelectLocation(tL_messageMediaVenue, 4, true, 0, 0L);
                        locationActivity.finishFragment();
                        return;
                    }
                    AlertDialog[] alertDialogArr = {new AlertDialog(locationActivity.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                    tL_channels_editLocation.address = tL_messageMediaVenue.address;
                    tL_channels_editLocation.channel = locationActivity.getMessagesController().getInputChannel(-locationActivity.dialogId);
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                    TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                    tL_inputGeoPoint.lat = geoPoint.lat;
                    tL_inputGeoPoint._long = geoPoint._long;
                    alertDialogArr[0].setOnCancelListener(new ChatEditActivity$$ExternalSyntheticLambda52(locationActivity, locationActivity.getConnectionsManager().sendRequest(tL_channels_editLocation, new LinkManager$$ExternalSyntheticLambda0(locationActivity, alertDialogArr, tL_messageMediaVenue, i6)), i7));
                    locationActivity.showDialog(alertDialogArr[0]);
                    return;
                }
                if (i23 == 5) {
                    IMapsProvider.IMap iMap = locationActivity.map;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = locationActivity.chatLocation.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), locationActivity.map.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
                if (i == 1 && (messageObject = locationActivity.messageObject) != null && (!messageObject.isLiveLocation() || i23 == 6)) {
                    IMapsProvider.IMap iMap2 = locationActivity.map;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = locationActivity.messageObject.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), locationActivity.map.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
                if (i == 1 && i23 != 2) {
                    if (locationActivity.delegate == null || locationActivity.userLocation == null) {
                        return;
                    }
                    FrameLayout frameLayout = locationActivity.lastPressedMarkerView;
                    if (frameLayout != null) {
                        frameLayout.callOnClick();
                        return;
                    }
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(locationActivity.userLocation.getLatitude());
                    tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(locationActivity.userLocation.getLongitude());
                    locationActivity.delegate.didSelectLocation(tL_messageMediaGeo, locationActivity.locationType, true, 0, 0L);
                    locationActivity.finishFragment();
                    return;
                }
                if (i23 == 2 && locationActivity.getLocationController().isSharingLocation(locationActivity.dialogId) && locationActivity.adapter.getItemViewType(i) == 7) {
                    locationActivity.getLocationController().removeSharingLocation(locationActivity.dialogId);
                    locationActivity.adapter.mObservable.notifyChanged();
                    locationActivity.finishFragment();
                    return;
                }
                if (i23 == 2 && locationActivity.getLocationController().isSharingLocation(locationActivity.dialogId) && locationActivity.adapter.getItemViewType(i) == 6) {
                    locationActivity.openShareLiveLocation(locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId).period != Integer.MAX_VALUE);
                    return;
                }
                if ((i == 2 && i23 == 1) || ((i == 1 && i23 == 2) || (i == 3 && i23 == 3))) {
                    if (!locationActivity.getLocationController().isSharingLocation(locationActivity.dialogId)) {
                        locationActivity.openShareLiveLocation(false);
                        return;
                    }
                    locationActivity.getLocationController().removeSharingLocation(locationActivity.dialogId);
                    locationActivity.adapter.mObservable.notifyChanged();
                    locationActivity.finishFragment();
                    return;
                }
                Object item2 = locationActivity.adapter.getItem(i);
                if (item2 instanceof TLRPC.TL_messageMediaVenue) {
                    locationActivity.delegate.didSelectLocation((TLRPC.TL_messageMediaVenue) item2, locationActivity.locationType, true, 0, 0L);
                    locationActivity.finishFragment();
                    return;
                } else {
                    if (item2 instanceof LocationActivity.LiveLocation) {
                        LocationActivity.LiveLocation liveLocation = (LocationActivity.LiveLocation) item2;
                        locationActivity.selectedMarkerId = liveLocation.id;
                        if (locationActivity.showAllMode) {
                            locationActivity.showAllMode = false;
                            locationActivity.updateShowAllButton();
                        }
                        locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(liveLocation.marker.getPosition(), locationActivity.map.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
            case 20:
                ((MessageSendPreview) this.f$0).onBackPressed();
                return;
            case 21:
                MessageStatisticActivity messageStatisticActivity = (MessageStatisticActivity) this.f$0;
                int i24 = messageStatisticActivity.startRow;
                if (i < i24 || i >= messageStatisticActivity.endRow) {
                    return;
                }
                MessageObject messageObject2 = (MessageObject) messageStatisticActivity.messages.get(i - i24);
                if (messageObject2.isStory()) {
                    if (messageObject2.isStory() && (messageObject2.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.StoryNotFound, BulletinFactory.of(messageStatisticActivity), R.raw.story_bomb1, 36);
                        return;
                    } else {
                        messageStatisticActivity.getOrCreateStoryViewer().open(UserConfig.selectedAccount, messageStatisticActivity.getParentActivity(), messageObject2.storyItem, new StoriesListPlaceProvider(messageStatisticActivity.listView, false));
                        return;
                    }
                }
                long dialogId = MessageObject.getDialogId(messageObject2.messageOwner);
                Bundle bundle = new Bundle();
                if (DialogObject.isUserDialog(dialogId)) {
                    bundle.putLong("user_id", dialogId);
                } else {
                    bundle.putLong("chat_id", -dialogId);
                }
                bundle.putInt("message_id", messageObject2.getId());
                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                if (messageStatisticActivity.getMessagesController().checkCanOpenChat(bundle, messageStatisticActivity)) {
                    messageStatisticActivity.presentFragment(new ChatActivity(bundle));
                    return;
                }
                return;
            case 22:
                ((PasscodeActivity) this.f$0).lambda$createView$5(i, view);
                return;
            case 23:
                PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) this.f$0;
                ArrayList<MediaController.PhotoEntry> arrayList8 = photoPickerActivity.searchResult;
                MediaController.AlbumEntry albumEntry = photoPickerActivity.selectedAlbum;
                if (albumEntry == null && arrayList8.isEmpty()) {
                    ArrayList arrayList9 = photoPickerActivity.recentSearches;
                    if (i < arrayList9.size()) {
                        String str2 = (String) arrayList9.get(i);
                        PhotoPickerActivity.PhotoPickerActivitySearchDelegate photoPickerActivitySearchDelegate = photoPickerActivity.searchDelegate;
                        if (photoPickerActivitySearchDelegate != null) {
                            photoPickerActivitySearchDelegate.shouldSearchText(str2);
                            return;
                        }
                        photoPickerActivity.searchItem.getSearchField().setText(str2);
                        photoPickerActivity.searchItem.getSearchField().setSelection(str2.length());
                        photoPickerActivity.processSearch(photoPickerActivity.searchItem.getSearchField());
                        return;
                    }
                    if (i == arrayList9.size() + 1) {
                        AlertDialog.Builder builder3 = new AlertDialog.Builder(photoPickerActivity.getParentActivity(), 0, null);
                        String string3 = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        AlertDialog alertDialog2 = builder3.alertDialog;
                        alertDialog2.title = string3;
                        alertDialog2.message = LocaleController.getString(R.string.ClearSearchAlert);
                        builder3.setPositiveButton(LocaleController.getString(R.string.ClearButton), new PhotoPickerActivity$$ExternalSyntheticLambda1(photoPickerActivity, i9));
                        builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        photoPickerActivity.showDialog(alertDialog2);
                        TextView textView2 = (TextView) alertDialog2.getButton(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (albumEntry != null) {
                    arrayList8 = albumEntry.photos;
                }
                if (i < 0 || i >= arrayList8.size()) {
                    return;
                }
                ActionBarMenuItem actionBarMenuItem = photoPickerActivity.searchItem;
                if (actionBarMenuItem != null) {
                    AndroidUtilities.hideKeyboard(actionBarMenuItem.getSearchField());
                }
                if (photoPickerActivity.listSort) {
                    photoPickerActivity.onListItemClick(view, arrayList8.get(i));
                    return;
                }
                int i25 = photoPickerActivity.selectPhotoType;
                if (i25 == 1 || i25 == 3) {
                    i8 = 1;
                } else if (i25 != 2) {
                    i8 = 10;
                    if (i25 != 10) {
                        i8 = photoPickerActivity.chatActivity == null ? 4 : 0;
                    }
                }
                PhotoViewer.getInstance().setParentActivity(null, photoPickerActivity, null);
                PhotoViewer photoViewer2 = PhotoViewer.getInstance();
                int i26 = photoPickerActivity.maxSelectedPhotos;
                boolean z4 = photoPickerActivity.allowOrder;
                photoViewer2.maxSelectedPhotos = i26;
                photoViewer2.allowOrder = z4;
                PhotoViewer.getInstance().openPhotoForSelect(arrayList8, i, i8, photoPickerActivity.isDocumentsPicker, photoPickerActivity.provider, photoPickerActivity.chatActivity);
                return;
            case 24:
                onItemClick$org$telegram$ui$PollCreateActivity$$ExternalSyntheticLambda4(i, view);
                return;
            case 25:
                ((PremiumPreviewFragment) this.f$0).lambda$createView$5$1(i, view);
                return;
            case 26:
                onItemClick$org$telegram$ui$PremiumPreviewFragment$BackgroundView$$ExternalSyntheticLambda0(i, view);
                return;
            case 27:
                onItemClick$org$telegram$ui$PrivacyControlActivity$$ExternalSyntheticLambda0(i, view);
                return;
            case 28:
                PrivacyUsersActivity privacyUsersActivity = (PrivacyUsersActivity) this.f$0;
                if (i == privacyUsersActivity.deleteAllRow) {
                    AlertDialog alertDialog3 = AlertsCreator.createSimpleAlert(privacyUsersActivity.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new PrivacyUsersActivity$$ExternalSyntheticLambda5(privacyUsersActivity), null).alertDialog;
                    alertDialog3.show();
                    alertDialog3.redPositive();
                    return;
                }
                int i27 = privacyUsersActivity.blockUserRow;
                int i28 = privacyUsersActivity.currentType;
                if (i == i27) {
                    if (i28 == 1) {
                        privacyUsersActivity.presentFragment(new DialogOrContactPickerActivity());
                        return;
                    }
                    Bundle bundleM = zzkw.m("isNeverShare", true);
                    if (i28 == 2) {
                        bundleM.putInt("chatAddType", 2);
                    }
                    GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundleM);
                    groupCreateActivity.delegate = new PrivacyUsersActivity$$ExternalSyntheticLambda1(privacyUsersActivity);
                    privacyUsersActivity.presentFragment(groupCreateActivity);
                    return;
                }
                if (i < privacyUsersActivity.usersStartRow || i >= privacyUsersActivity.usersEndRow) {
                    return;
                }
                if (i28 != 1) {
                    new Bundle();
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", privacyUsersActivity.getMessagesController().blockePeers.keyAt(i - privacyUsersActivity.usersStartRow));
                privacyUsersActivity.presentFragment(new ProfileActivity(bundle2, null));
                return;
            default:
                ((ProfileActivity) this.f$0).lambda$createView$30(i);
                return;
        }
    }
}
