package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public abstract class UniversalFragment extends BaseFragment {
    public UniversalRecyclerView listView;
    private int savedScrollOffset;
    private int savedScrollPosition;

    public UniversalFragment() {
        super(null);
        this.savedScrollPosition = -1;
    }

    public void applyScrolledPosition() {
        int i = this.savedScrollPosition;
        if (i >= 0) {
            UniversalRecyclerView universalRecyclerView = this.listView;
            universalRecyclerView.layoutManager.scrollToPositionWithOffset(i, this.savedScrollOffset - universalRecyclerView.getPaddingTop());
        }
    }

    @Override
    public View createView(Context context) {
        zzki.m(this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(getTitle());
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    UniversalFragment.this.finishFragment();
                }
            }
        });
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
            }
        };
        sizeNotifierFrameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new EmojiView$$ExternalSyntheticLambda18(this, 21), new UniversalFragment$$ExternalSyntheticLambda1(this), new UniversalFragment$$ExternalSyntheticLambda1(this)) {
            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                UniversalFragment.this.savedScrollPosition = -1;
            }

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
            }
        };
        this.listView = universalRecyclerView;
        sizeNotifierFrameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f));
        this.fragmentView = sizeNotifierFrameLayout;
        return sizeNotifierFrameLayout;
    }

    public abstract void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter);

    public abstract CharSequence getTitle();

    public abstract void onClick(UItem uItem, View view, int i, float f, float f2);

    public abstract boolean onLongClick(UItem uItem, View view, int i, float f, float f2);

    public void saveScrollPosition() {
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || universalRecyclerView.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int top = Integer.MAX_VALUE;
        int i = -1;
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            UniversalRecyclerView universalRecyclerView2 = this.listView;
            int childAdapterPosition = universalRecyclerView2.getChildAdapterPosition(universalRecyclerView2.getChildAt(i2));
            View childAt = this.listView.getChildAt(i2);
            if (childAdapterPosition != -1 && childAt.getTop() < top) {
                top = childAt.getTop();
                i = childAdapterPosition;
                view = childAt;
            }
        }
        if (view != null) {
            this.savedScrollPosition = i;
            int top2 = view.getTop();
            this.savedScrollOffset = top2;
            if (this.savedScrollPosition == 0 && top2 > AndroidUtilities.dp(88.0f)) {
                this.savedScrollOffset = AndroidUtilities.dp(88.0f);
            }
            this.listView.layoutManager.scrollToPositionWithOffset(i, view.getTop() - this.listView.getPaddingTop());
        }
    }
}
