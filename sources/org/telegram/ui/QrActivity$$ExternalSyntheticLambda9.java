package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.InviteUserCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.RecyclerListView;

public final class QrActivity$$ExternalSyntheticLambda9 implements ThemeDescription.ThemeDescriptionDelegate {
    public final int $r8$classId;
    public final BaseFragment f$0;

    public QrActivity$$ExternalSyntheticLambda9(int i, BaseFragment baseFragment) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
    }

    private final void onAnimationProgress$org$telegram$ui$IntroActivity$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$InviteContactsActivity$$ExternalSyntheticLambda1(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$LinkEditActivity$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$LocationActivity$$ExternalSyntheticLambda17(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$LoginActivity$$ExternalSyntheticLambda9(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$MainTabsActivity$$ExternalSyntheticLambda7(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ManageLinksActivity$$ExternalSyntheticLambda2(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$MessageStatisticActivity$$ExternalSyntheticLambda3(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$NotificationsCustomSettingsActivity$$ExternalSyntheticLambda1(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$PeerColorActivity$$ExternalSyntheticLambda3(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$PremiumPreviewFragment$$ExternalSyntheticLambda2(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$PrivacyUsersActivity$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ProfileActivity$$ExternalSyntheticLambda28(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ProfileNotificationsActivity$$ExternalSyntheticLambda1(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ProxySettingsActivity$$ExternalSyntheticLambda6(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$QrActivity$$ExternalSyntheticLambda9(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ReactionsDoubleTapManageActivity$$ExternalSyntheticLambda1(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$StatisticActivity$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ThemeActivity$$ExternalSyntheticLambda5(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ThemePreviewActivity$$ExternalSyntheticLambda1(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$TooManyCommunitiesActivity$$ExternalSyntheticLambda1(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$TopicsFragment$$ExternalSyntheticLambda1(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$UsersSelectActivity$$ExternalSyntheticLambda3(float f) {
    }

    @Override
    public final void didSetColor() {
        ValueAnimator valueAnimator;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                QrActivity qrActivity = (QrActivity) this.f$0;
                qrActivity.getClass();
                qrActivity.setNavigationBarColor(qrActivity.getThemedColor(Theme.key_windowBackgroundGray));
                break;
            case 1:
                ((IntroActivity) this.f$0).updateColors$1(true);
                break;
            case 2:
                InviteContactsActivity inviteContactsActivity = (InviteContactsActivity) this.f$0;
                RecyclerListView recyclerListView = inviteContactsActivity.listView;
                if (recyclerListView != null) {
                    int childCount = recyclerListView.getChildCount();
                    while (i < childCount) {
                        View childAt = inviteContactsActivity.listView.getChildAt(i);
                        if (childAt instanceof InviteUserCell) {
                            ((InviteUserCell) childAt).update();
                        }
                        i++;
                    }
                }
                break;
            case 3:
                LinkEditActivity linkEditActivity = (LinkEditActivity) this.f$0;
                TextInfoPrivacyCell textInfoPrivacyCell = linkEditActivity.dividerUses;
                if (textInfoPrivacyCell != null) {
                    textInfoPrivacyCell.getContext();
                    LinkEditActivity.AnonymousClass5 anonymousClass5 = linkEditActivity.usesEditText;
                    int i2 = Theme.key_windowBackgroundWhiteBlackText;
                    anonymousClass5.setTextColor(Theme.getColor(null, i2, false));
                    LinkEditActivity.AnonymousClass5 anonymousClass6 = linkEditActivity.usesEditText;
                    int i3 = Theme.key_windowBackgroundWhiteGrayText;
                    anonymousClass6.setHintTextColor(Theme.getColor(null, i3, false));
                    linkEditActivity.timeEditText.setTextColor(Theme.getColor(null, i2, false));
                    linkEditActivity.timeEditText.setHintTextColor(Theme.getColor(null, i3, false));
                    TextSettingsCell textSettingsCell = linkEditActivity.revokeLink;
                    if (textSettingsCell != null) {
                        textSettingsCell.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
                    }
                    linkEditActivity.createTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
                    linkEditActivity.nameEditText.setTextColor(Theme.getColor(null, i2, false));
                    linkEditActivity.nameEditText.setHintTextColor(Theme.getColor(null, i3, false));
                }
                break;
            case 4:
                LocationActivity locationActivity = (LocationActivity) this.f$0;
                locationActivity.mapTypeButton.setIconColor(locationActivity.getThemedColor(Theme.key_location_actionIcon));
                locationActivity.mapTypeButton.redrawPopup(locationActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
                locationActivity.mapTypeButton.setPopupItemsColor(locationActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), true);
                locationActivity.mapTypeButton.setPopupItemsColor(locationActivity.getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false);
                locationActivity.shadowDrawable.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
                locationActivity.shadow.invalidate();
                if (locationActivity.map != null) {
                    int i4 = AndroidUtilities.computePerceivedBrightness(locationActivity.getThemedColor(Theme.key_windowBackgroundWhite)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i4 != 0) {
                        if (!locationActivity.currentMapStyleDark) {
                            locationActivity.currentMapStyleDark = true;
                            locationActivity.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i4));
                            IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                locationActivity.proximityCircle.setFillColor(553648127);
                            }
                        }
                    } else if (locationActivity.currentMapStyleDark) {
                        locationActivity.currentMapStyleDark = false;
                        locationActivity.map.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = locationActivity.proximityCircle;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            locationActivity.proximityCircle.setFillColor(536870912);
                        }
                    }
                }
                break;
            case 5:
                ((LoginActivity) this.f$0).updateColors$4();
                break;
            case 6:
                ((MainTabsActivity) this.f$0).blur3_updateColors();
                break;
            case 7:
                ManageLinksActivity manageLinksActivity = (ManageLinksActivity) this.f$0;
                RecyclerListView recyclerListView2 = manageLinksActivity.listView;
                if (recyclerListView2 != null) {
                    int childCount2 = recyclerListView2.getChildCount();
                    for (int i5 = 0; i5 < childCount2; i5++) {
                        View childAt2 = manageLinksActivity.listView.getChildAt(i5);
                        if (childAt2 instanceof ManageChatUserCell) {
                            ((ManageChatUserCell) childAt2).update(0);
                        }
                        if (childAt2 instanceof LinkActionView) {
                            ((LinkActionView) childAt2).updateColors();
                        }
                    }
                }
                InviteLinkBottomSheet inviteLinkBottomSheet = manageLinksActivity.inviteLinkBottomSheet;
                if (inviteLinkBottomSheet != null) {
                    inviteLinkBottomSheet.updateColors$1();
                }
                break;
            case 8:
                MessageStatisticActivity messageStatisticActivity = (MessageStatisticActivity) this.f$0;
                RecyclerListView recyclerListView3 = messageStatisticActivity.listView;
                if (recyclerListView3 != null) {
                    int childCount3 = recyclerListView3.getChildCount();
                    for (int i6 = 0; i6 < childCount3; i6++) {
                        messageStatisticActivity.recolorRecyclerItem(messageStatisticActivity.listView.getChildAt(i6));
                    }
                    int hiddenChildCount = messageStatisticActivity.listView.getHiddenChildCount();
                    for (int i7 = 0; i7 < hiddenChildCount; i7++) {
                        messageStatisticActivity.recolorRecyclerItem(messageStatisticActivity.listView.getHiddenChildAt(i7));
                    }
                    int cachedChildCount = messageStatisticActivity.listView.getCachedChildCount();
                    for (int i8 = 0; i8 < cachedChildCount; i8++) {
                        messageStatisticActivity.recolorRecyclerItem(messageStatisticActivity.listView.getCachedChildAt(i8));
                    }
                    int attachedScrapChildCount = messageStatisticActivity.listView.getAttachedScrapChildCount();
                    while (i < attachedScrapChildCount) {
                        messageStatisticActivity.recolorRecyclerItem(messageStatisticActivity.listView.getAttachedScrapChildAt(i));
                        i++;
                    }
                    messageStatisticActivity.listView.getRecycledViewPool().clear();
                }
                BaseChartView.SharedUiComponents sharedUiComponents = messageStatisticActivity.sharedUi;
                if (sharedUiComponents != null) {
                    sharedUiComponents.invalidate = true;
                }
                View subtitleTextView = messageStatisticActivity.avatarContainer.getSubtitleTextView();
                if (subtitleTextView instanceof SimpleTextView) {
                    ((SimpleTextView) subtitleTextView).setLinkTextColor(Theme.getColor(Theme.key_player_actionBarSubtitle, messageStatisticActivity.getResourceProvider()));
                }
                break;
            case 9:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f$0;
                RecyclerListView recyclerListView4 = notificationsCustomSettingsActivity.listView;
                if (recyclerListView4 != null) {
                    int childCount4 = recyclerListView4.getChildCount();
                    for (int i9 = 0; i9 < childCount4; i9++) {
                        View childAt3 = notificationsCustomSettingsActivity.listView.getChildAt(i9);
                        if (childAt3 instanceof UserCell) {
                            ((UserCell) childAt3).update(0);
                        }
                    }
                }
                break;
            case 10:
                ((PeerColorActivity) this.f$0).updateColors$5();
                break;
            case 11:
                ((PremiumPreviewFragment) this.f$0).updateColors$6();
                break;
            case 12:
                PrivacyUsersActivity privacyUsersActivity = (PrivacyUsersActivity) this.f$0;
                RecyclerListView recyclerListView5 = privacyUsersActivity.listView;
                if (recyclerListView5 != null) {
                    int childCount5 = recyclerListView5.getChildCount();
                    for (int i10 = 0; i10 < childCount5; i10++) {
                        View childAt4 = privacyUsersActivity.listView.getChildAt(i10);
                        if (childAt4 instanceof ManageChatUserCell) {
                            ((ManageChatUserCell) childAt4).update(0);
                        }
                    }
                }
                break;
            case 13:
                ((ProfileActivity) this.f$0).lambda$getThemeDescriptions$117();
                break;
            case 14:
                ProfileNotificationsActivity profileNotificationsActivity = (ProfileNotificationsActivity) this.f$0;
                RecyclerListView recyclerListView6 = profileNotificationsActivity.listView;
                if (recyclerListView6 != null) {
                    int childCount6 = recyclerListView6.getChildCount();
                    while (i < childCount6) {
                        View childAt5 = profileNotificationsActivity.listView.getChildAt(i);
                        if (childAt5 instanceof UserCell2) {
                            ((UserCell2) childAt5).update();
                        }
                        i++;
                    }
                }
                break;
            case 15:
                ProxySettingsActivity proxySettingsActivity = (ProxySettingsActivity) this.f$0;
                if (proxySettingsActivity.shareCell != null && ((valueAnimator = proxySettingsActivity.shareDoneAnimator) == null || !valueAnimator.isRunning())) {
                    proxySettingsActivity.shareCell.setTextColor(Theme.getColor(null, proxySettingsActivity.shareDoneEnabled ? Theme.key_windowBackgroundWhiteBlueText4 : Theme.key_windowBackgroundWhiteGrayText2, false));
                }
                if (proxySettingsActivity.inputFields != null) {
                    int i11 = 0;
                    while (true) {
                        EditTextBoldCursor[] editTextBoldCursorArr = proxySettingsActivity.inputFields;
                        if (i11 < editTextBoldCursorArr.length) {
                            editTextBoldCursorArr[i11].setLineColors(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false), Theme.getColor(null, Theme.key_text_RedRegular, false));
                            i11++;
                        }
                    }
                }
                break;
            case 16:
                ReactionsDoubleTapManageActivity reactionsDoubleTapManageActivity = (ReactionsDoubleTapManageActivity) this.f$0;
                reactionsDoubleTapManageActivity.contentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                reactionsDoubleTapManageActivity.listAdapter.mObservable.notifyChanged();
                break;
            case 17:
                StatisticActivity statisticActivity = (StatisticActivity) this.f$0;
                StatisticActivity.AnonymousClass7 anonymousClass7 = statisticActivity.recyclerListView;
                if (anonymousClass7 != null) {
                    int childCount7 = anonymousClass7.getChildCount();
                    for (int i12 = 0; i12 < childCount7; i12++) {
                        StatisticActivity.recolorRecyclerItem$1(statisticActivity.recyclerListView.getChildAt(i12));
                    }
                    int hiddenChildCount2 = statisticActivity.recyclerListView.getHiddenChildCount();
                    for (int i13 = 0; i13 < hiddenChildCount2; i13++) {
                        StatisticActivity.recolorRecyclerItem$1(statisticActivity.recyclerListView.getHiddenChildAt(i13));
                    }
                    int cachedChildCount2 = statisticActivity.recyclerListView.getCachedChildCount();
                    for (int i14 = 0; i14 < cachedChildCount2; i14++) {
                        StatisticActivity.recolorRecyclerItem$1(statisticActivity.recyclerListView.getCachedChildAt(i14));
                    }
                    int attachedScrapChildCount2 = statisticActivity.recyclerListView.getAttachedScrapChildCount();
                    while (i < attachedScrapChildCount2) {
                        StatisticActivity.recolorRecyclerItem$1(statisticActivity.recyclerListView.getAttachedScrapChildAt(i));
                        i++;
                    }
                    statisticActivity.recyclerListView.getRecycledViewPool().clear();
                }
                BaseChartView.SharedUiComponents sharedUiComponents2 = statisticActivity.sharedUi;
                if (sharedUiComponents2 != null) {
                    sharedUiComponents2.invalidate = true;
                }
                break;
            case 18:
                int i15 = 0;
                while (true) {
                    ThemeActivity themeActivity = (ThemeActivity) this.f$0;
                    if (i15 >= themeActivity.listView.getChildCount()) {
                        for (int i16 = 0; i16 < themeActivity.listView.getCachedChildCount(); i16++) {
                            View cachedChildAt = themeActivity.listView.getCachedChildAt(i16);
                            if (cachedChildAt instanceof AppIconsSelectorCell) {
                                ((AppIconsSelectorCell) cachedChildAt).getAdapter().notifyDataSetChanged();
                            } else if (cachedChildAt instanceof PeerColorActivity.ChangeNameColorCell) {
                                ((PeerColorActivity.ChangeNameColorCell) cachedChildAt).updateColors();
                            }
                        }
                        for (int i17 = 0; i17 < themeActivity.listView.getHiddenChildCount(); i17++) {
                            View hiddenChildAt = themeActivity.listView.getHiddenChildAt(i17);
                            if (hiddenChildAt instanceof AppIconsSelectorCell) {
                                ((AppIconsSelectorCell) hiddenChildAt).getAdapter().notifyDataSetChanged();
                            } else if (hiddenChildAt instanceof PeerColorActivity.ChangeNameColorCell) {
                                ((PeerColorActivity.ChangeNameColorCell) hiddenChildAt).updateColors();
                            }
                        }
                        while (i < themeActivity.listView.getAttachedScrapChildCount()) {
                            View attachedScrapChildAt = themeActivity.listView.getAttachedScrapChildAt(i);
                            if (attachedScrapChildAt instanceof AppIconsSelectorCell) {
                                ((AppIconsSelectorCell) attachedScrapChildAt).getAdapter().notifyDataSetChanged();
                            } else if (attachedScrapChildAt instanceof PeerColorActivity.ChangeNameColorCell) {
                                ((PeerColorActivity.ChangeNameColorCell) attachedScrapChildAt).updateColors();
                            }
                            i++;
                        }
                    } else {
                        View childAt6 = themeActivity.listView.getChildAt(i15);
                        if (childAt6 instanceof AppIconsSelectorCell) {
                            ((AppIconsSelectorCell) childAt6).getAdapter().notifyDataSetChanged();
                        } else if (childAt6 instanceof PeerColorActivity.ChangeNameColorCell) {
                            ((PeerColorActivity.ChangeNameColorCell) childAt6).updateColors();
                        }
                        i15++;
                    }
                    break;
                }
                break;
            case 19:
                ((ThemePreviewActivity) this.f$0).lambda$getThemeDescriptionsInternal$33();
                break;
            case 20:
                TooManyCommunitiesActivity tooManyCommunitiesActivity = (TooManyCommunitiesActivity) this.f$0;
                RecyclerListView recyclerListView7 = tooManyCommunitiesActivity.listView;
                if (recyclerListView7 != null) {
                    int childCount8 = recyclerListView7.getChildCount();
                    for (int i18 = 0; i18 < childCount8; i18++) {
                        View childAt7 = tooManyCommunitiesActivity.listView.getChildAt(i18);
                        if (childAt7 instanceof GroupCreateUserCell) {
                            ((GroupCreateUserCell) childAt7).update(0);
                        }
                    }
                }
                RecyclerListView recyclerListView8 = tooManyCommunitiesActivity.searchListView;
                if (recyclerListView8 != null) {
                    int childCount9 = recyclerListView8.getChildCount();
                    for (int i19 = 0; i19 < childCount9; i19++) {
                        View childAt8 = tooManyCommunitiesActivity.searchListView.getChildAt(i19);
                        if (childAt8 instanceof GroupCreateUserCell) {
                            ((GroupCreateUserCell) childAt8).update(0);
                        }
                    }
                }
                tooManyCommunitiesActivity.buttonTextView.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
                tooManyCommunitiesActivity.progressBar.setProgressColor(Theme.getColor(null, Theme.key_progressCircle, false));
                break;
            case 21:
                ((TopicsFragment) this.f$0).lambda$getThemeDescriptions$24$1();
                break;
            default:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f$0;
                RecyclerListView recyclerListView9 = usersSelectActivity.listView;
                if (recyclerListView9 != null) {
                    int childCount10 = recyclerListView9.getChildCount();
                    for (int i20 = 0; i20 < childCount10; i20++) {
                        View childAt9 = usersSelectActivity.listView.getChildAt(i20);
                        if (childAt9 instanceof GroupCreateUserCell) {
                            ((GroupCreateUserCell) childAt9).update(0);
                        }
                    }
                }
                break;
        }
    }

    @Override
    public final void onAnimationProgress(float f) {
        int i = this.$r8$classId;
    }
}
