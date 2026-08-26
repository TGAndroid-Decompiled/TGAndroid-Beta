package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;

public final class StatisticActivity$$ExternalSyntheticLambda13 implements Utilities.Callback0Return {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public StatisticActivity$$ExternalSyntheticLambda13(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final Object run() {
        View childAt;
        switch (this.$r8$classId) {
            case 0:
                StatisticActivity statisticActivity = (StatisticActivity) this.f$0;
                int childCount = statisticActivity.recyclerListView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt2 = statisticActivity.recyclerListView.getChildAt(i);
                    if (childAt2 instanceof StatisticActivity.ChartCell) {
                        StatisticActivity.ChartCell chartCell = (StatisticActivity.ChartCell) childAt2;
                        if (chartCell.data == ((StatisticActivity.ChartViewData) this.f$1)) {
                            return chartCell;
                        }
                    }
                }
                statisticActivity.recyclerListView.setItemAnimator(null);
                statisticActivity.diffUtilsCallback.update();
                return null;
            default:
                UniversalAdapter universalAdapter = (UniversalAdapter) this.f$0;
                universalAdapter.getClass();
                Object obj = ((UItem) this.f$1).object;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 < universalAdapter.items.size()) {
                        UItem item = universalAdapter.getItem(i3);
                        if (item == null || item.object != obj) {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                if (i3 == -1) {
                    childAt = null;
                } else {
                    while (true) {
                        RecyclerListView recyclerListView = universalAdapter.listView;
                        if (i2 < recyclerListView.getChildCount()) {
                            childAt = recyclerListView.getChildAt(i2);
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                            if (childAdapterPosition == -1 || childAdapterPosition != i3) {
                                i2++;
                            }
                        } else {
                            childAt = null;
                        }
                    }
                }
                if (childAt instanceof StatisticActivity.UniversalChartCell) {
                    return (StatisticActivity.UniversalChartCell) childAt;
                }
                return null;
        }
    }
}
