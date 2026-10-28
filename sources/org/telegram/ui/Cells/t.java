package org.telegram.ui.Cells;

import a8.ze;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.ua0;
public final class t extends nm0 implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList f25424f3;
    public s4.c0 f25425g3;
    public int f25426h3;

    public final void C1() {
        ArrayList arrayList = this.f25424f3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(ua0.values()));
        if (MessagesController.getInstance(this.f25426h3).premiumFeaturesBlocked()) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (((ua0) arrayList.get(i10)).e) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        getAdapter().l();
        a0();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (ze.a((ua0) arrayList.get(i11))) {
                this.f25425g3.h1(i11, AndroidUtilities.dp(16.0f));
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.premiumStatusChangedGlobal) {
            C1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.premiumStatusChangedGlobal);
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
}
