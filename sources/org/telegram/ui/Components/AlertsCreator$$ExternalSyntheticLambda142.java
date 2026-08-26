package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;

public final class AlertsCreator$$ExternalSyntheticLambda142 implements Runnable {
    public final int $r8$classId;
    public final ArrayList f$0;

    public AlertsCreator$$ExternalSyntheticLambda142(ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override
    public final void run() {
        BaseFragment lastFragment;
        switch (this.$r8$classId) {
            case 0:
                if (this.f$0 != null && (lastFragment = LaunchActivity.getLastFragment()) != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    lastFragment.showAsSheet(new PrivacyControlActivity(11, false), bottomSheetParams);
                }
                break;
            case 1:
                ArrayList arrayList = this.f$0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Bitmap) obj).recycle();
                }
                break;
            case 2:
                PaintTypeface.typefaces = this.f$0;
                PaintTypeface.loadingTypefaces = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                break;
            default:
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f$0;
                    if (i2 < arrayList2.size()) {
                        ((View) arrayList2.get(i2)).setVisibility(8);
                        if (arrayList2.get(i2) instanceof ChatMessageCell) {
                            ((ChatMessageCell) arrayList2.get(i2)).setCheckBoxVisible(false, false);
                            ((ChatMessageCell) arrayList2.get(i2)).setChecked(false, false, false);
                        }
                        i2++;
                    }
                    break;
                }
                break;
        }
    }
}
