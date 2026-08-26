package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class LogoutActivity$$ExternalSyntheticLambda1 implements RecyclerListView.IntReturnCallback, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final int f$0;

    public LogoutActivity$$ExternalSyntheticLambda1(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        LogoutActivity.lambda$makeLogOutDialog$1(this.f$0, alertDialog, i);
    }

    @Override
    public int run() {
        switch (this.$r8$classId) {
            case 1:
                return CacheControlActivity.ListAdapter.AnonymousClass1.lambda$onSectionDown$0(this.f$0);
            default:
                return DataUsage2Activity.ListView.Adapter.AnonymousClass1.lambda$onSectionDown$0(this.f$0);
        }
    }
}
