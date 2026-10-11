package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.eu;
public final class c5 implements lp0 {
    public final eu f21910a;

    public c5(eu euVar) {
        this.f21910a = euVar;
    }

    @Override
    public final void X(float f7, boolean z10) {
        float e7;
        int i10;
        if (f7 <= 0.25f) {
            e7 = a1.g.e(f7, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f7 - 0.25f;
            if (f10 < 0.25f) {
                e7 = a1.g.e(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                if (f11 <= 0.25f) {
                    e7 = a1.g.e(f11, 0.25f, 9.437184E7f, 10485760);
                } else {
                    e7 = a1.g.e(f11 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i11 = (int) e7;
        eu euVar = this.f21910a;
        long j3 = i11;
        boolean z11 = true;
        euVar.f21961b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j3)));
        euVar.d = j3;
        w8[] w8VarArr = euVar.h;
        AnimatorSet[] animatorSetArr = euVar.f37457n;
        int i12 = euVar.f37455e;
        i10 = euVar.f37458r.videosRow;
        if (i12 == i10) {
            euVar.f37456f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j3)));
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
                animatorSetArr[0].addListener(new k91(euVar, 15));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        eu euVar = this.f21910a;
        sb2.append((Object) euVar.f21960a.getText());
        sb2.append(" ");
        sb2.append((Object) euVar.f21961b.getText());
        return sb2.toString();
    }

    @Override
    public final int i0() {
        return 0;
    }

    @Override
    public final void z() {
    }
}
