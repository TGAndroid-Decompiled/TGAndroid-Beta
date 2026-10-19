package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.o31;
import org.telegram.ui.tt;
public final class b5 implements bp0 {
    public final tt f22044a;

    public b5(tt ttVar) {
        this.f22044a = ttVar;
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
        tt ttVar = this.f22044a;
        long j10 = i11;
        boolean z11 = true;
        ttVar.f22086b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        ttVar.d = j10;
        v8[] v8VarArr = ttVar.h;
        AnimatorSet[] animatorSetArr = ttVar.f41740n;
        int i12 = ttVar.e;
        i10 = ttVar.f41741r.videosRow;
        if (i12 == i10) {
            ttVar.f41739f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
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
                animatorSetArr[0].addListener(new o31(ttVar, 20));
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
        tt ttVar = this.f22044a;
        sb2.append((Object) ttVar.f22085a.getText());
        sb2.append(" ");
        sb2.append((Object) ttVar.f22086b.getText());
        return sb2.toString();
    }

    @Override
    public final void v() {
    }
}
