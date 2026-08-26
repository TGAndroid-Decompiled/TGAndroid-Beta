package org.telegram.ui.bots;

import android.content.Context;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda3;
import org.telegram.ui.UserInfoActivity;

public final class SuggestedAffiliateProgramsFragment extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public BackDrawable backDrawable;
    public final long dialogId;
    public UniversalRecyclerView listView;

    public SuggestedAffiliateProgramsFragment(long j) {
        super(null);
        this.dialogId = j;
    }

    @Override
    public final View createView(Context context) {
        ActionBar actionBar = this.actionBar;
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        actionBar.setBackButtonDrawable(backDrawable);
        this.backDrawable.animationTime = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new UserInfoActivity.AnonymousClass4(this, 6));
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        ActionBar actionBar2 = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar2.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), true);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultSelector, false), false);
        this.actionBar.setTitleColor(Theme.getColor(null, i, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context, null);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new TodoItemMenu$$ExternalSyntheticLambda17(this, 14), new TodoItemMenu$$ExternalSyntheticLambda3(this, 9), null, getResourceProvider());
        this.listView = universalRecyclerView;
        sizeNotifierFrameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1, 119));
        this.fragmentView = sizeNotifierFrameLayout;
        return sizeNotifierFrameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        UniversalRecyclerView universalRecyclerView;
        if (i == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.dialogId && (universalRecyclerView = this.listView) != null && (universalRecyclerView.getAdapter() instanceof UniversalAdapter)) {
            ((UniversalAdapter) this.listView.getAdapter()).update(true);
        }
    }

    public final void fillItems$1(ArrayList arrayList, UniversalAdapter universalAdapter) {
        BotStarsController.ChannelSuggestedBots channelSuggestedBots = BotStarsController.getInstance(this.currentAccount).getChannelSuggestedBots(this.dialogId);
        int i = 0;
        while (true) {
            ArrayList arrayList2 = channelSuggestedBots.bots;
            if (i >= arrayList2.size()) {
                break;
            }
            Object obj = arrayList2.get(i);
            int i2 = ChannelAffiliateProgramsFragment.BotCell.Factory.$r8$clinit;
            UItem uItemOfFactory = UItem.ofFactory(ChannelAffiliateProgramsFragment.BotCell.Factory.class);
            uItemOfFactory.object = obj;
            uItemOfFactory.red = false;
            arrayList.add(uItemOfFactory);
            i++;
        }
        if (channelSuggestedBots.loading) {
            UItem uItem = new UItem(34);
            uItem.intValue = 29;
            UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItem, 34);
            uItemM.intValue = 29;
            UItem uItemM2 = ArticleViewer.IBlock.CC.m(arrayList, uItemM, 34);
            uItemM2.intValue = 29;
            arrayList.add(uItemM2);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().isClosed) {
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
            if (this.actionBar.isActionModeShowed()) {
                color = Theme.getColor(null, Theme.key_actionBarActionModeDefault, false);
            }
            if (ColorUtils.calculateLuminance(color) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        super.onFragmentDestroy();
    }

    public final void onItemClick$2(UItem uItem) {
        Object obj = uItem.object;
        if (obj instanceof TL_payments.starRefProgram) {
            ChannelAffiliateProgramsFragment.showConnectAffiliateAlert(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.dialogId, this.resourceProvider, false);
        }
    }
}
