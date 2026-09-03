package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.fu;
public final class c5 implements jo0 {
    public final fu f22648a;

    public c5(fu fuVar) {
        this.f22648a = fuVar;
    }

    @Override
    public final void X(float f10, boolean z4) {
        float c3;
        int i10;
        if (f10 <= 0.25f) {
            c3 = w.c.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c3 = w.c.c(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                if (f12 <= 0.25f) {
                    c3 = w.c.c(f12, 0.25f, 9.437184E7f, 10485760);
                } else {
                    c3 = w.c.c(f12 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i11 = (int) c3;
        fu fuVar = this.f22648a;
        long j10 = i11;
        boolean z10 = true;
        fuVar.f22677b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        fuVar.d = j10;
        s8[] s8VarArr = fuVar.h;
        AnimatorSet[] animatorSetArr = fuVar.f36915n;
        int i12 = fuVar.f36913e;
        i10 = fuVar.f36916r.videosRow;
        if (i12 == i10) {
            fuVar.f36914f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            if (i11 <= 2097152) {
                z10 = false;
            }
            if (z10 != s8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                s8VarArr[0].e(arrayList, z10);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new f91(fuVar, 13));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        fu fuVar = this.f22648a;
        sb.append((Object) fuVar.f22676a.getText());
        sb.append(" ");
        sb.append((Object) fuVar.f22677b.getText());
        return sb.toString();
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final void A() {
    }
}
