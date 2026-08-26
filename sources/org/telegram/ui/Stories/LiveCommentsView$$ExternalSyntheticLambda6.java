package org.telegram.ui.Stories;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.AppIconsSelectorCell;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LauncherIconController;

public final class LiveCommentsView$$ExternalSyntheticLambda6 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final ViewGroup f$0;
    public final Object f$1;
    public final Object f$2;

    public LiveCommentsView$$ExternalSyntheticLambda6(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = viewGroup;
        this.f$1 = obj;
        this.f$2 = obj2;
    }

    @Override
    public final void onItemClick(View view, int i) {
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        ViewGroup viewGroup = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) viewGroup;
                LiveCommentsView.LiveCommentView liveCommentView = (LiveCommentsView.LiveCommentView) view;
                LiveCommentsView.Message message = liveCommentView.message;
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((StoryViewer.AnonymousClass3) obj2, new DarkThemeResourceProvider(), view);
                itemOptionsMakeOptions.addText(LocaleController.formatString(R.string.LiveStoryMessageSent, LocaleController.formatDateTime(message.date, true)), 15);
                itemOptionsMakeOptions.addGap();
                itemOptionsMakeOptions.add(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new LivePlayer$$ExternalSyntheticLambda17(19, (StoryViewer) obj, message));
                itemOptionsMakeOptions.addIf(!message.isReaction, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new LivePlayer$$ExternalSyntheticLambda17(20, anonymousClass10, liveCommentView));
                itemOptionsMakeOptions.addIf(anonymousClass10.dialogId == UserConfig.getInstance(anonymousClass10.currentAccount).getClientUserId() || anonymousClass10.isAdmin(), R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new LivePlayer$$ExternalSyntheticLambda17(21, anonymousClass10, message));
                itemOptionsMakeOptions.show();
                break;
            default:
                AppIconsSelectorCell appIconsSelectorCell = (AppIconsSelectorCell) viewGroup;
                appIconsSelectorCell.getClass();
                AppIconsSelectorCell.IconHolderView iconHolderView = (AppIconsSelectorCell.IconHolderView) view;
                LauncherIconController.LauncherIcon launcherIcon = (LauncherIconController.LauncherIcon) appIconsSelectorCell.availableIcons.get(i);
                if (launcherIcon.premium && !UserConfig.hasPremiumOnAccounts()) {
                    BaseFragment baseFragment = (BaseFragment) obj2;
                    baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 10, true));
                    break;
                } else if (!LauncherIconController.isEnabled(launcherIcon)) {
                    AppIconsSelectorCell.AnonymousClass3 anonymousClass3 = new AppIconsSelectorCell.AnonymousClass3((Context) obj);
                    anonymousClass3.setTargetPosition(i);
                    appIconsSelectorCell.linearLayoutManager.startSmoothScroll(anonymousClass3);
                    LauncherIconController.setIcon(launcherIcon);
                    int i2 = AppIconsSelectorCell.IconHolderView.$r8$clinit;
                    iconHolderView.setSelected(true, true);
                    for (int i3 = 0; i3 < appIconsSelectorCell.getChildCount(); i3++) {
                        AppIconsSelectorCell.IconHolderView iconHolderView2 = (AppIconsSelectorCell.IconHolderView) appIconsSelectorCell.getChildAt(i3);
                        if (iconHolderView2 != iconHolderView) {
                            iconHolderView2.setSelected(false, true);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 5, launcherIcon);
                    break;
                }
                break;
        }
    }
}
