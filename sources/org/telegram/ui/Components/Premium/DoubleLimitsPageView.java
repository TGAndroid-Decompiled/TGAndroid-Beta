package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.UserConfig;

public final class DoubleLimitsPageView extends BaseListPageView {
    public DoubledLimitsBottomSheet$Adapter adapter;

    @Override
    public final RecyclerView.Adapter createAdapter() {
        DoubledLimitsBottomSheet$Adapter doubledLimitsBottomSheet$Adapter = new DoubledLimitsBottomSheet$Adapter(UserConfig.selectedAccount, this.resourcesProvider);
        this.adapter = doubledLimitsBottomSheet$Adapter;
        doubledLimitsBottomSheet$Adapter.containerView = this;
        return doubledLimitsBottomSheet$Adapter;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        DoubledLimitsBottomSheet$Adapter doubledLimitsBottomSheet$Adapter = this.adapter;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        doubledLimitsBottomSheet$Adapter.getClass();
        DoubledLimitsBottomSheet$LimitCell doubledLimitsBottomSheet$LimitCell = new DoubledLimitsBottomSheet$LimitCell(context, doubledLimitsBottomSheet$Adapter.resourcesProvider);
        int i3 = 0;
        int measuredHeight2 = 0;
        while (true) {
            ArrayList arrayList = doubledLimitsBottomSheet$Adapter.limits;
            if (i3 >= arrayList.size()) {
                doubledLimitsBottomSheet$Adapter.totalGradientHeight = measuredHeight2;
                return;
            }
            DoubledLimitsBottomSheet$Limit doubledLimitsBottomSheet$Limit = (DoubledLimitsBottomSheet$Limit) arrayList.get(i3);
            doubledLimitsBottomSheet$LimitCell.title.setText(doubledLimitsBottomSheet$Limit.title);
            doubledLimitsBottomSheet$LimitCell.subtitle.setText(doubledLimitsBottomSheet$Limit.subtitle);
            LimitPreviewView limitPreviewView = doubledLimitsBottomSheet$LimitCell.previewView;
            limitPreviewView.premiumCount.setText(String.format("%d", Integer.valueOf(doubledLimitsBottomSheet$Limit.premiumLimit)));
            limitPreviewView.defaultCount.setText(String.format("%d", Integer.valueOf(doubledLimitsBottomSheet$Limit.defaultLimit)));
            doubledLimitsBottomSheet$LimitCell.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((DoubledLimitsBottomSheet$Limit) arrayList.get(i3)).yOffset = measuredHeight2;
            measuredHeight2 += doubledLimitsBottomSheet$LimitCell.getMeasuredHeight();
            i3++;
        }
    }
}
