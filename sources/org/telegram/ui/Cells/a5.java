package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.wt;
public final class a5 implements zn0 {
    public final wt f24080a;

    public a5(wt wtVar) {
        this.f24080a = wtVar;
    }

    @Override
    public final void W(float f9, boolean z10) {
        float c3;
        int i10;
        if (f9 <= 0.25f) {
            c3 = u3.c.c(f9, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f9 - 0.25f;
            if (f10 < 0.25f) {
                c3 = u3.c.c(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                if (f11 <= 0.25f) {
                    c3 = u3.c.c(f11, 0.25f, 9.437184E7f, 10485760);
                } else {
                    c3 = u3.c.c(f11 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i11 = (int) c3;
        wt wtVar = this.f24080a;
        long j10 = i11;
        boolean z11 = true;
        wtVar.f24116b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        wtVar.d = j10;
        q8[] q8VarArr = wtVar.h;
        AnimatorSet[] animatorSetArr = wtVar.f44372n;
        int i12 = wtVar.f44370e;
        i10 = wtVar.f44373r.videosRow;
        if (i12 == i10) {
            wtVar.f44371f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            if (i11 <= 2097152) {
                z11 = false;
            }
            if (z11 != q8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                q8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new p11(wtVar, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        wt wtVar = this.f24080a;
        sb2.append((Object) wtVar.f24115a.getText());
        sb2.append(" ");
        sb2.append((Object) wtVar.f24116b.getText());
        return sb2.toString();
    }

    @Override
    public final int k0() {
        return 0;
    }

    @Override
    public final void v() {
    }
}
