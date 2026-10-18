package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.n31;
import org.telegram.ui.vt;
public final class b5 implements bp0 {
    public final vt f22043a;

    public b5(vt vtVar) {
        this.f22043a = vtVar;
    }

    @Override
    public final void L(float f7, boolean z10) {
        float d;
        int i10;
        if (f7 <= 0.25f) {
            d = a1.g.d(f7, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f7 - 0.25f;
            if (f10 < 0.25f) {
                d = a1.g.d(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                if (f11 <= 0.25f) {
                    d = a1.g.d(f11, 0.25f, 9.437184E7f, 10485760);
                } else {
                    d = a1.g.d(f11 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i11 = (int) d;
        vt vtVar = this.f22043a;
        long j10 = i11;
        boolean z11 = true;
        vtVar.f22085b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        vtVar.d = j10;
        v8[] v8VarArr = vtVar.h;
        AnimatorSet[] animatorSetArr = vtVar.f42269n;
        int i12 = vtVar.e;
        i10 = vtVar.f42270r.videosRow;
        if (i12 == i10) {
            vtVar.f42268f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            if (i11 <= 2097152) {
                z11 = false;
            }
            if (z11 != v8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                v8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new n31(vtVar, 20));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final int Y() {
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        vt vtVar = this.f22043a;
        sb2.append((Object) vtVar.f22084a.getText());
        sb2.append(" ");
        sb2.append((Object) vtVar.f22085b.getText());
        return sb2.toString();
    }

    @Override
    public final void v() {
    }
}
