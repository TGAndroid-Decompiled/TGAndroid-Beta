package org.telegram.ui.Stories;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LauncherIconController;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.ProfileNotificationsActivity;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.recorder.SelectAudioAlert;
import org.telegram.ui.Stories.recorder.StoryLinkSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ThemePreviewActivity;

public final class LiveCommentsView$$ExternalSyntheticLambda6 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public LiveCommentsView$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onItemClick(int i, View view) {
        Theme.ThemeInfo themeInfo;
        int i2 = 15;
        switch (this.$r8$classId) {
            case 0:
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.f$0;
                LiveCommentsView.LiveCommentView liveCommentView = (LiveCommentsView.LiveCommentView) view;
                LiveCommentsView.Message message = liveCommentView.message;
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((StoryViewer.AnonymousClass3) this.f$1, new DarkThemeResourceProvider(), view);
                itemOptionsMakeOptions.addText(15, -1, LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(message.date, true)));
                itemOptionsMakeOptions.addGap();
                itemOptionsMakeOptions.add(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new StickersActivity$$ExternalSyntheticLambda18(i2, (StoryViewer) this.f$2, message), false);
                itemOptionsMakeOptions.addIf(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new StickersActivity$$ExternalSyntheticLambda18(16, anonymousClass10, liveCommentView), !message.isReaction);
                itemOptionsMakeOptions.addIf(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new StickersActivity$$ExternalSyntheticLambda18(17, anonymousClass10, message), anonymousClass10.dialogId == UserConfig.getInstance(anonymousClass10.currentAccount).getClientUserId() || anonymousClass10.isAdmin());
                itemOptionsMakeOptions.show();
                break;
            case 1:
                AppIconsSelectorCell appIconsSelectorCell = (AppIconsSelectorCell) this.f$0;
                BaseFragment baseFragment = (BaseFragment) this.f$1;
                Context context = (Context) this.f$2;
                appIconsSelectorCell.getClass();
                AppIconsSelectorCell.IconHolderView iconHolderView = (AppIconsSelectorCell.IconHolderView) view;
                LauncherIconController.LauncherIcon launcherIcon = (LauncherIconController.LauncherIcon) appIconsSelectorCell.availableIcons.get(i);
                if (launcherIcon.premium && !UserConfig.hasPremiumOnAccounts()) {
                    baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 10, true));
                    break;
                } else if (!LauncherIconController.isEnabled(launcherIcon)) {
                    AppIconsSelectorCell.AnonymousClass3 anonymousClass3 = new AppIconsSelectorCell.AnonymousClass3(context);
                    anonymousClass3.mTargetPosition = i;
                    appIconsSelectorCell.linearLayoutManager.startSmoothScroll(anonymousClass3);
                    Context context2 = ApplicationLoader.applicationContext;
                    PackageManager packageManager = context2.getPackageManager();
                    LauncherIconController.LauncherIcon[] launcherIconArrValues = LauncherIconController.LauncherIcon.values();
                    int length = launcherIconArrValues.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        LauncherIconController.LauncherIcon launcherIcon2 = launcherIconArrValues[i3];
                        if (launcherIcon2.componentName == null) {
                            launcherIcon2.componentName = new ComponentName(context2.getPackageName(), "org.telegram.messenger.".concat(launcherIcon2.key));
                        }
                        packageManager.setComponentEnabledSetting(launcherIcon2.componentName, launcherIcon2 == launcherIcon ? 1 : 2, 1);
                    }
                    int i4 = AppIconsSelectorCell.IconHolderView.$r8$clinit;
                    iconHolderView.setSelected(true, true);
                    for (int i5 = 0; i5 < appIconsSelectorCell.getChildCount(); i5++) {
                        AppIconsSelectorCell.IconHolderView iconHolderView2 = (AppIconsSelectorCell.IconHolderView) appIconsSelectorCell.getChildAt(i5);
                        if (iconHolderView2 != iconHolderView) {
                            iconHolderView2.setSelected(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, launcherIcon);
                    break;
                }
                break;
            case 2:
                ((ProfileNotificationsActivity) this.f$0).lambda$createView$6((Context) this.f$1, (String) this.f$2, view, i);
                break;
            case 3:
                ((SelectAudioAlert) this.f$0).lambda$new$1((Utilities.Callback) this.f$1, (DarkThemeResourceProvider) this.f$2, view, i);
                break;
            case 4:
                ((StoryLinkSheet) this.f$0).lambda$new$4((Context) this.f$1, (StoryRecorder.AnonymousClass7) this.f$2, view, i);
                break;
            default:
                ThemeActivity themeActivity = ThemeActivity.this;
                int i6 = themeActivity.currentType;
                if (i6 == 1) {
                    themeInfo = Theme.currentNightTheme;
                } else {
                    themeInfo = Theme.currentDayTheme;
                    if (themeInfo == null) {
                        themeInfo = Theme.defaultTheme;
                    }
                }
                Theme.ThemeInfo themeInfo2 = themeInfo;
                ThemeActivity.ThemeAccentsListAdapter themeAccentsListAdapter = (ThemeActivity.ThemeAccentsListAdapter) this.f$1;
                if (i == themeAccentsListAdapter.getItemCount() - 1) {
                    themeActivity.presentFragment(new ThemePreviewActivity(themeInfo2, false, 1, false, i6 == 1));
                } else {
                    Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) themeAccentsListAdapter.themeAccents.get(i);
                    if (!TextUtils.isEmpty(themeAccent.patternSlug) && themeAccent.id != Theme.DEFALT_THEME_ACCENT_ID) {
                        Theme.PatternsLoader.createLoader(false);
                    }
                    int i7 = themeInfo2.currentAccentId;
                    int i8 = themeAccent.id;
                    if (i7 != i8) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo2, Boolean.valueOf(i6 == 1), null, Integer.valueOf(themeAccent.id));
                        EmojiThemes.saveCustomTheme(themeInfo2, themeAccent.id);
                        Theme.turnOffAutoNight(themeActivity);
                    } else {
                        themeActivity.presentFragment(new ThemePreviewActivity(themeInfo2, false, 1, i8 >= 100, i6 == 1));
                    }
                }
                int left = view.getLeft();
                int right = view.getRight();
                int iDp = AndroidUtilities.dp(52.0f);
                int i9 = left - iDp;
                MessageSeenView.AnonymousClass1 anonymousClass1 = (MessageSeenView.AnonymousClass1) this.f$2;
                if (i9 < 0) {
                    anonymousClass1.smoothScrollBy(i9, 0, null);
                } else {
                    int i10 = right + iDp;
                    if (i10 > anonymousClass1.getMeasuredWidth()) {
                        anonymousClass1.smoothScrollBy(i10 - anonymousClass1.getMeasuredWidth(), 0, null);
                    }
                }
                int childCount = anonymousClass1.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = anonymousClass1.getChildAt(i11);
                    if (childAt instanceof ThemeActivity.InnerAccentView) {
                        ((ThemeActivity.InnerAccentView) childAt).updateCheckedState(true);
                    }
                }
                break;
        }
    }
}
