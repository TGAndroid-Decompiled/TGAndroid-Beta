package org.telegram.ui.Business;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.web.HistoryFragment;

public final class OpeningHoursDayActivity extends BaseFragment {
    public boolean enabled;
    public UniversalRecyclerView listView;
    public final int max;
    public final int maxPeriodsCount;
    public final int min;
    public final ArrayList periods;
    public final CharSequence title;
    public ChatbotSheet$$ExternalSyntheticLambda0 whenApplied;
    public ChatActionCell$$ExternalSyntheticLambda8 whenDone;

    public OpeningHoursDayActivity(int i, ArrayList arrayList, CharSequence charSequence, int i2, int i3) {
        super(null);
        this.title = charSequence;
        this.periods = arrayList;
        this.min = i;
        this.max = i2;
        this.maxPeriodsCount = i3;
        this.enabled = !arrayList.isEmpty();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.title);
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new GiftSheet$$ExternalSyntheticLambda8(this, 9), new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 13), null);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final boolean is24() {
        ArrayList arrayList = this.periods;
        return arrayList.size() == 1 && ((OpeningHoursActivity.Period) arrayList.get(0)).start == 0 && ((OpeningHoursActivity.Period) arrayList.get(0)).end == 1439;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ChatActionCell$$ExternalSyntheticLambda8 chatActionCell$$ExternalSyntheticLambda8 = this.whenDone;
        if (chatActionCell$$ExternalSyntheticLambda8 != null) {
            chatActionCell$$ExternalSyntheticLambda8.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.enabled) {
            return;
        }
        ArrayList arrayList = this.periods;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.clear();
        ChatbotSheet$$ExternalSyntheticLambda0 chatbotSheet$$ExternalSyntheticLambda0 = this.whenApplied;
        if (chatbotSheet$$ExternalSyntheticLambda0 != null) {
            chatbotSheet$$ExternalSyntheticLambda0.run();
        }
    }

    public final boolean showAddButton() {
        ArrayList arrayList = this.periods;
        if (arrayList.size() >= this.maxPeriodsCount) {
            return false;
        }
        return arrayList.isEmpty() || is24() || ((OpeningHoursActivity.Period) zzin.m(1, arrayList)).end < Math.min(1438, this.max + (-2));
    }
}
