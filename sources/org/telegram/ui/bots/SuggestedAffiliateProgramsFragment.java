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
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.iv.RichEditor$3$$ExternalSyntheticLambda0;
import org.telegram.ui.web.HistoryFragment;

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
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 17));
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        ActionBar actionBar2 = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar2.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), true);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarActionModeDefaultSelector, false), false);
        this.actionBar.setTitleColor(Theme.getColor(null, i, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new BotDownloads$$ExternalSyntheticLambda0(this, 13), new RichEditor$3$$ExternalSyntheticLambda0(this, 7), null);
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

    public final void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
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
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
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

    public final void onItemClick(UItem uItem) {
        Object obj = uItem.object;
        if (obj instanceof TL_payments.starRefProgram) {
            ChannelAffiliateProgramsFragment.showConnectAffiliateAlert(getContext(), this.currentAccount, (TL_payments.starRefProgram) obj, this.dialogId, this.resourceProvider, false);
        }
    }
}
