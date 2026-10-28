package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i31;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.wt;
public final class g5 implements lp0 {
    public final wt f24164a;

    public g5(wt wtVar) {
        this.f24164a = wtVar;
    }

    @Override
    public final void U(float f7, boolean z10) {
        float c10;
        int i10;
        if (f7 <= 0.25f) {
            c10 = a1.g.c(f7, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f7 - 0.25f;
            if (f10 < 0.25f) {
                c10 = a1.g.c(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                if (f11 <= 0.25f) {
                    c10 = a1.g.c(f11, 0.25f, 9.437184E7f, 10485760);
                } else {
                    c10 = a1.g.c(f11 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i11 = (int) c10;
        wt wtVar = this.f24164a;
        long j10 = i11;
        boolean z11 = true;
        wtVar.f24197b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        wtVar.d = j10;
        a9[] a9VarArr = wtVar.h;
        AnimatorSet[] animatorSetArr = wtVar.f45399n;
        int i12 = wtVar.e;
        i10 = wtVar.f45400r.videosRow;
        if (i12 == i10) {
            wtVar.f45398f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            if (i11 <= 2097152) {
                z11 = false;
            }
            if (z11 != a9VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                a9VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new i31(wtVar, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        wt wtVar = this.f24164a;
        sb2.append((Object) wtVar.f24196a.getText());
        sb2.append(" ");
        sb2.append((Object) wtVar.f24197b.getText());
        return sb2.toString();
    }

    @Override
    public final int k0() {
        return 0;
    }

    @Override
    public final void y() {
    }
}
