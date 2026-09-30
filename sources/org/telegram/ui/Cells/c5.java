package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.cu;
public final class c5 implements uo0 {
    public final cu f20111a;

    public c5(cu cuVar) {
        this.f20111a = cuVar;
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
        cu cuVar = this.f20111a;
        long j3 = i11;
        boolean z11 = true;
        cuVar.f20149b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j3)));
        cuVar.d = j3;
        w8[] w8VarArr = cuVar.h;
        AnimatorSet[] animatorSetArr = cuVar.f32873n;
        int i12 = cuVar.e;
        i10 = cuVar.f32874r.videosRow;
        if (i12 == i10) {
            cuVar.f32872f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j3)));
            if (i11 <= 2097152) {
                z11 = false;
            }
            if (z11 != w8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                w8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new s81(cuVar, 15));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        cu cuVar = this.f20111a;
        sb2.append((Object) cuVar.f20148a.getText());
        sb2.append(" ");
        sb2.append((Object) cuVar.f20149b.getText());
        return sb2.toString();
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final void B() {
    }
}
