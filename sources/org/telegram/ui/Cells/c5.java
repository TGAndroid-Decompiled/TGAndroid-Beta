package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.so0;
import org.telegram.ui.fu;
public final class c5 implements so0 {
    public final fu f20096a;

    public c5(fu fuVar) {
        this.f20096a = fuVar;
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
        fu fuVar = this.f20096a;
        long j3 = i11;
        boolean z11 = true;
        fuVar.f20134b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j3)));
        fuVar.d = j3;
        w8[] w8VarArr = fuVar.h;
        AnimatorSet[] animatorSetArr = fuVar.f33632n;
        int i12 = fuVar.e;
        i10 = fuVar.f33633r.videosRow;
        if (i12 == i10) {
            fuVar.f33631f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j3)));
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
                animatorSetArr[0].addListener(new s81(fuVar, 15));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        fu fuVar = this.f20096a;
        sb2.append((Object) fuVar.f20133a.getText());
        sb2.append(" ");
        sb2.append((Object) fuVar.f20134b.getText());
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
