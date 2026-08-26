package org.telegram.ui;

import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.RecyclerListView;

public final class LaunchActivity$$ExternalSyntheticLambda23 implements RecyclerListView.IntReturnCallback, AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended, LocationActivity.LocationActivityDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public LaunchActivity$$ExternalSyntheticLambda23(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        LaunchActivity.lambda$didReceivedNotification$150((HashMap) this.f$0, this.f$1, messageMedia, i, z, i2, j);
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        int i2 = this.$r8$classId;
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((LaunchActivity) this.f$0).lambda$didReceivedNotification$148(this.f$1, alertDialog, i);
                break;
            case 2:
                ((PassportActivity.AnonymousClass3) this.f$0).lambda$onIdentityDone$1(this.f$1, alertDialog, i);
                break;
            case 6:
                ((LoginActivity.PhoneView) this.f$0).lambda$onNextPressed$18(this.f$1, alertDialog, i);
                break;
            case 8:
                ((PrivacyControlActivity) this.f$0).lambda$finished$11(this.f$1, alertDialog, i);
                break;
            default:
                ((ProfileActivity) this.f$0).lambda$editNotes$123(this.f$1, alertDialog, i);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        int i2 = this.$r8$classId;
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        switch (this.$r8$classId) {
            case 3:
                ((ContactsActivity) this.f$0).lambda$createView$5(this.f$1, view, i, f, f2);
                break;
            default:
                ((MultiContactsSelectorBottomSheet) this.f$0).lambda$new$4(this.f$1, view, i, f, f2);
                break;
        }
    }

    @Override
    public int run() {
        switch (this.$r8$classId) {
            case 1:
                return ((DataUsage2Activity.ListView) this.f$0).lambda$scrollTo$3(this.f$1);
            default:
                return ((LiteModeSettingsActivity) this.f$0).lambda$highlightRow$2(this.f$1);
        }
    }
}
