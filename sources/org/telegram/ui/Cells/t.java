package org.telegram.ui.Cells;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.ob0;
public final class t extends mm0 implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList V2;
    public s4.b0 W2;
    public int X2;

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStatusChangedGlobal) {
            x1();
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

    public final void x1() {
        ArrayList arrayList = this.V2;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(ob0.values()));
        if (MessagesController.getInstance(this.X2).premiumFeaturesBlocked()) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (((ob0) arrayList.get(i10)).e) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        getAdapter().l();
        a0();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (w7.h6.a((ob0) arrayList.get(i11))) {
                this.W2.h1(i11, AndroidUtilities.dp(16.0f));
                return;
            }
        }
    }
}
