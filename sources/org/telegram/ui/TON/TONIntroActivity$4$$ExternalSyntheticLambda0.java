package org.telegram.ui.TON;

import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Premium.boosts.cells.HeaderCell;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class TONIntroActivity$4$$ExternalSyntheticLambda0 implements Utilities.CallbackReturn {
    public final int $r8$classId;
    public final View f$0;

    public TONIntroActivity$4$$ExternalSyntheticLambda0(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                TONIntroActivity.AnonymousClass4 anonymousClass4 = (TONIntroActivity.AnonymousClass4) this.f$0;
                return anonymousClass4.paints[((Integer) obj).intValue() % anonymousClass4.paints.length];
            case 1:
                return ((LPhotoPaintView) this.f$0).lambda$openStickersView$20((Integer) obj);
            case 2:
                HeaderCell headerCell = (HeaderCell) this.f$0;
                headerCell.getClass();
                int iIntValue = ((Integer) obj).intValue();
                Paint[] paintArr = headerCell.paints;
                return paintArr[iIntValue % paintArr.length];
            default:
                StarsIntroActivity.AnonymousClass4 anonymousClass5 = (StarsIntroActivity.AnonymousClass4) this.f$0;
                return anonymousClass5.paints[((Integer) obj).intValue() % anonymousClass5.paints.length];
        }
    }
}
