package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Storage.CacheModel;

public final class ArticleViewer$$ExternalSyntheticLambda53 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ArticleViewer$$ExternalSyntheticLambda53(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((ArticleViewer) this.f$0).lambda$setParentActivity$24((Activity) this.f$1, view);
                break;
            case 1:
                ((AvatarPreviewer.Layout) this.f$0).lambda$setData$3((AvatarPreviewer.MenuItem) this.f$1, view);
                break;
            case 2:
                ((CacheControlActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$3((CheckBoxCell) this.f$1, view);
                break;
            case 3:
                ((CachedMediaLayout.AnonymousClass1) this.f$0).lambda$createView$4((CachedMediaLayout.ItemInner) this.f$1, view);
                break;
            case 4:
                ((CallLogActivity) this.f$0).lambda$onCallClick$8((CallLogActivity.CallLogRow) this.f$1, view);
                break;
            case 5:
                ((ContentPreviewViewer.AnonymousClass1) this.f$0).lambda$run$10((ArrayList) this.f$1, view);
                break;
            case 6:
                ((FiltersSetupActivity.ListAdapter) this.f$0).lambda$onCreateViewHolder$9((FiltersSetupActivity.SuggestedFilterCell) this.f$1, view);
                break;
            case 7:
                ((GroupCallActivity.AnonymousClass20) this.f$0).lambda$createTextView$0((TextView) this.f$1, view);
                break;
            case 8:
                ((MessageStatisticActivity.ListAdapter) this.f$0).lambda$onBindViewHolder$0((MessageObject) this.f$1, view);
                break;
            case 9:
                ((SelectAnimatedEmojiDialog.SelectStatusDurationDialog) this.f$0).lambda$new$6((Context) this.f$1, view);
                break;
            case 10:
                ((StatisticActivity.Adapter) this.f$0).lambda$onBindViewHolder$0((StatisticActivity.RecentPostInfo) this.f$1, view);
                break;
            case 11:
                ((StatisticActivity.BaseChartCell.CheckBoxHolder) this.f$0).lambda$setData$0((LineViewData) this.f$1, view);
                break;
            case 12:
                ((ArticleViewer.BlockChannelCell) this.f$0).lambda$new$0((IArticleViewer) this.f$1, view);
                break;
            case 13:
                ((ChannelMonetizationLayout) this.f$0).lambda$new$6((BaseFragment) this.f$1, view);
                break;
            case 14:
                ChannelMonetizationLayout.lambda$showTransactionSheet$38((Context) this.f$0, (TL_stats.TL_broadcastRevenueTransactionWithdrawal) this.f$1, view);
                break;
            case 15:
                ChatActivity.lambda$openAttachBotLayout$215((CheckBoxCell) this.f$0, (AtomicBoolean) this.f$1, view);
                break;
            case 16:
                ((ChatActivity) this.f$0).lambda$updateTopPanel$228((ItemOptions) this.f$1, view);
                break;
            case 17:
                ((ChatActivity) this.f$0).lambda$createView$78((Context) this.f$1, view);
                break;
            case 18:
                ((ChatActivity) this.f$0).lambda$createMenu$269((MessageObject) this.f$1, view);
                break;
            case 19:
                ((ChatActivity) this.f$0).lambda$updatePinnedMessageView$226((String) this.f$1, view);
                break;
            case 20:
                ((ChatEditActivity) this.f$0).lambda$createView$22((Context) this.f$1, view);
                break;
            case 21:
                ((ChatEditActivity) this.f$0).lambda$createView$27((FrameLayout) this.f$1, view);
                break;
            case 22:
                ((ChatRightsEditActivity) this.f$0).lambda$createView$5((BottomSheet.Builder) this.f$1, view);
                break;
            case 23:
                ((ContactAddActivity) this.f$0).lambda$createView$14((TLRPC.User) this.f$1, view);
                break;
            case 24:
                ((DialogCacheBottomSheet) this.f$0).lambda$new$0((CacheModel) this.f$1, view);
                break;
            case 25:
                DialogsActivity.lambda$showChatPreview$96((ActionBarPopupWindow.ActionBarPopupWindowLayout[]) this.f$0, (int[]) this.f$1, view);
                break;
            case 26:
                ((DialogsActivity) this.f$0).lambda$showChatPreview$102((ArrayList) this.f$1, view);
                break;
            case 27:
                ((DialogsActivity) this.f$0).lambda$updateDialogsHint$44((BirthdayController.BirthdayState) this.f$1, view);
                break;
            case 28:
                ((DialogsActivity) this.f$0).lambda$updateDialogsHint$65((String) this.f$1, view);
                break;
            default:
                ((DialogsActivity) this.f$0).lambda$createView$28((AlertDialog[]) this.f$1, view);
                break;
        }
    }
}
