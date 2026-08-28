package org.telegram.ui.Cells;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.pa0;
public final class t extends wk0 implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList T2;
    public f2.m0 U2;
    public int V2;

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.premiumStatusChangedGlobal) {
            w1();
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        a0();
    }

    public final void w1() {
        ArrayList arrayList = this.T2;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(pa0.values()));
        if (MessagesController.getInstance(this.V2).premiumFeaturesBlocked()) {
            int i9 = 0;
            while (i9 < arrayList.size()) {
                if (((pa0) arrayList.get(i9)).f41389e) {
                    arrayList.remove(i9);
                    i9--;
                }
                i9++;
            }
        }
        getAdapter().l();
        a0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (g7.l6.a((pa0) arrayList.get(i10))) {
                this.U2.h1(i10, AndroidUtilities.dp(16.0f));
                return;
            }
        }
    }
}
