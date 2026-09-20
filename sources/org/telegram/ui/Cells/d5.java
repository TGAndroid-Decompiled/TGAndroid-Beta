package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.iu;
public final class d5 implements ro0 {
    public final iu f20128a;

    public d5(iu iuVar) {
        this.f20128a = iuVar;
    }

    @Override
    public final void X(float f7, boolean z10) {
        float e;
        int i10;
        if (f7 <= 0.25f) {
            e = a4.a.e(f7, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f7 - 0.25f;
            if (f10 < 0.25f) {
                e = a4.a.e(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                if (f11 <= 0.25f) {
                    e = a4.a.e(f11, 0.25f, 9.437184E7f, 10485760);
                } else {
                    e = a4.a.e(f11 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i11 = (int) e;
        iu iuVar = this.f20128a;
        long j3 = i11;
        boolean z11 = true;
        iuVar.f20180b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j3)));
        iuVar.d = j3;
        x8[] x8VarArr = iuVar.h;
        AnimatorSet[] animatorSetArr = iuVar.f34684n;
        int i12 = iuVar.e;
        i10 = iuVar.f34685r.videosRow;
        if (i12 == i10) {
            iuVar.f34683f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j3)));
            if (i11 <= 2097152) {
                z11 = false;
            }
            if (z11 != x8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                x8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new r81(iuVar, 15));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        iu iuVar = this.f20128a;
        sb2.append((Object) iuVar.f20179a.getText());
        sb2.append(" ");
        sb2.append((Object) iuVar.f20180b.getText());
        return sb2.toString();
    }

    @Override
    public final int l0() {
        return 0;
    }

    @Override
    public final void B() {
    }
}
