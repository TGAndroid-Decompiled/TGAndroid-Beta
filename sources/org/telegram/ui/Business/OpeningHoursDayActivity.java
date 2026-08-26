package org.telegram.ui.Business;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda3;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda8;
import org.telegram.ui.CallLogActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class OpeningHoursDayActivity extends BaseFragment {
    public boolean enabled;
    public UniversalRecyclerView listView;
    public final int max;
    public final int maxPeriodsCount;
    public final int min;
    public final ArrayList periods;
    public final CharSequence title;
    public ArticleViewer$$ExternalSyntheticLambda3 whenApplied;
    public ArticleViewer$$ExternalSyntheticLambda8 whenDone;

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
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 11));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(getParentActivity(), getCurrentAccount(), getClassGuid(), new CallLogActivity$$ExternalSyntheticLambda3(this, 10), new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 22), null, getResourceProvider());
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final boolean is24() {
        ArrayList arrayList = this.periods;
        return arrayList.size() == 1 && ((OpeningHoursActivity.Period) arrayList.get(0)).start == 0 && ((OpeningHoursActivity.Period) arrayList.get(0)).end == 1439;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ArticleViewer$$ExternalSyntheticLambda8 articleViewer$$ExternalSyntheticLambda8 = this.whenDone;
        if (articleViewer$$ExternalSyntheticLambda8 != null) {
            articleViewer$$ExternalSyntheticLambda8.run();
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
        ArticleViewer$$ExternalSyntheticLambda3 articleViewer$$ExternalSyntheticLambda3 = this.whenApplied;
        if (articleViewer$$ExternalSyntheticLambda3 != null) {
            articleViewer$$ExternalSyntheticLambda3.run();
        }
    }

    public final boolean showAddButton() {
        ArrayList arrayList = this.periods;
        if (arrayList.size() >= this.maxPeriodsCount) {
            return false;
        }
        return arrayList.isEmpty() || is24() || ((OpeningHoursActivity.Period) zziq.m(1, arrayList)).end < Math.min(1438, this.max + (-2));
    }
}
