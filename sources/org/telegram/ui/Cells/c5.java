package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.lu;
public final class c5 implements fp0 {
    public final lu f20716a;

    public c5(lu luVar) {
        this.f20716a = luVar;
    }

    @Override
    public final void X(float f7, boolean z10) {
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
        lu luVar = this.f20716a;
        long j10 = i11;
        boolean z11 = true;
        luVar.f20762b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        luVar.d = j10;
        w8[] w8VarArr = luVar.h;
        AnimatorSet[] animatorSetArr = luVar.f37829n;
        int i12 = luVar.e;
        i10 = luVar.f37830r.videosRow;
        if (i12 == i10) {
            luVar.f37828f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
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
                animatorSetArr[0].addListener(new v61(luVar, 18));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        lu luVar = this.f20716a;
        sb2.append((Object) luVar.f20761a.getText());
        sb2.append(" ");
        sb2.append((Object) luVar.f20762b.getText());
        return sb2.toString();
    }

    @Override
    public final int k0() {
        return 0;
    }

    @Override
    public final void z() {
    }
}
