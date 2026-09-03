package org.telegram.ui.Cells;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.bb0;
public final class t extends sl0 implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList U2;
    public f2.j0 V2;
    public int W2;

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStatusChangedGlobal) {
            v1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.premiumStatusChangedGlobal);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.premiumStatusChangedGlobal);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a0();
    }

    public final void v1() {
        ArrayList arrayList = this.U2;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(bb0.values()));
        if (MessagesController.getInstance(this.W2).premiumFeaturesBlocked()) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (((bb0) arrayList.get(i10)).f35427e) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        getAdapter().l();
        a0();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (k7.j6.a((bb0) arrayList.get(i11))) {
                this.V2.h1(i11, AndroidUtilities.dp(16.0f));
                return;
            }
        }
    }
}
