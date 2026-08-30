package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.eu;
public final class c5 implements jo0 {
    public final eu f20914a;

    public c5(eu euVar) {
        this.f20914a = euVar;
    }

    @Override
    public final void Y(float f10, boolean z4) {
        float c3;
        int i10;
        if (f10 <= 0.25f) {
            c3 = vh.v2.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c3 = vh.v2.c(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                if (f12 <= 0.25f) {
                    c3 = vh.v2.c(f12, 0.25f, 9.437184E7f, 10485760);
                } else {
                    c3 = vh.v2.c(f12 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i11 = (int) c3;
        eu euVar = this.f20914a;
        long j10 = i11;
        boolean z10 = true;
        euVar.f20940b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        euVar.d = j10;
        s8[] s8VarArr = euVar.h;
        AnimatorSet[] animatorSetArr = euVar.f34086n;
        int i12 = euVar.e;
        i10 = euVar.f34087r.videosRow;
        if (i12 == i10) {
            euVar.f34085f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
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
                animatorSetArr[0].addListener(new f91(euVar, 13));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        eu euVar = this.f20914a;
        sb.append((Object) euVar.f20939a.getText());
        sb.append(" ");
        sb.append((Object) euVar.f20940b.getText());
        return sb.toString();
    }

    @Override
    public final int j0() {
        return 0;
    }

    @Override
    public final void B() {
    }
}
