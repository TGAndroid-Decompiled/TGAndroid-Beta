package org.telegram.ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.StatsController;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.RecyclerListView;

public final class DataUsage2Activity$ListView$$ExternalSyntheticLambda0 implements RecyclerListView.IntReturnCallback, AlertDialog.OnButtonClickListener {
    public final DataUsage2Activity.ListView f$0;

    public DataUsage2Activity$ListView$$ExternalSyntheticLambda0(DataUsage2Activity.ListView listView) {
        this.f$0 = listView;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        DataUsage2Activity.ListView listView = this.f$0;
        ArrayList arrayList = listView.removedSegments;
        arrayList.clear();
        int i2 = 0;
        while (true) {
            DataUsage2Activity.ListView.Size[] sizeArr = listView.segments;
            if (i2 >= sizeArr.length) {
                DataUsage2Activity dataUsage2Activity = DataUsage2Activity.this;
                StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).resetStats(0);
                StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).resetStats(1);
                StatsController.getInstance(((BaseFragment) dataUsage2Activity).currentAccount).resetStats(2);
                listView.animateChart = true;
                listView.setup();
                listView.updateRows$10(true);
                return;
            }
            DataUsage2Activity.ListView.Size size = sizeArr[i2];
            if (size.size > 0) {
                arrayList.add(Integer.valueOf(size.index));
            }
            i2++;
        }
    }

    @Override
    public int run() {
        DataUsage2Activity.ListView listView;
        int i = 0;
        while (true) {
            listView = this.f$0;
            ArrayList arrayList = listView.itemInners;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            if (((DataUsage2Activity.ItemInner) arrayList.get(i)).viewType == 5) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return -1;
        }
        int iDp = AndroidUtilities.dp(60.0f);
        LinearLayoutManager linearLayoutManager = listView.layoutManager;
        linearLayoutManager.scrollToPositionWithOffset(i, iDp, linearLayoutManager.mShouldReverseLayout);
        return i;
    }
}
