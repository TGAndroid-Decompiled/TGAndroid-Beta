package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.yt;

public final class z4 implements pn0 {

    public final yt f26030a;

    public z4(yt ytVar) {
        this.f26030a = ytVar;
    }

    @Override
    public final void P(float f10, boolean z10) {
        float fC;
        if (f10 <= 0.25f) {
            fC = s3.c.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                fC = s3.c.c(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                fC = f12 <= 0.25f ? s3.c.c(f12, 0.25f, 9.437184E7f, 10485760) : s3.c.c(f12 - 0.25f, 0.25f, 2097152000 - ((long) 104857600), 104857600);
            }
        }
        int i10 = (int) fC;
        yt ytVar = this.f26030a;
        long j10 = i10;
        ytVar.f24061b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        ytVar.d = j10;
        p8[] p8VarArr = ytVar.h;
        AnimatorSet[] animatorSetArr = ytVar.f44896n;
        if (ytVar.f44894e == ytVar.f44897r.videosRow) {
            ytVar.f44895f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            boolean z11 = i10 > 2097152;
            if (z11 != p8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                p8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new f11(ytVar, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final int a0() {
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        yt ytVar = this.f26030a;
        sb2.append((Object) ytVar.f24060a.getText());
        sb2.append(" ");
        sb2.append((Object) ytVar.f24061b.getText());
        return sb2.toString();
    }

    @Override
    public final void r() {
    }
}
