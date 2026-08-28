package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.y11;
import org.telegram.ui.vt;
public final class c5 implements on0 {
    public final vt f24194a;

    public c5(vt vtVar) {
        this.f24194a = vtVar;
    }

    @Override
    public final void Q(float f10, boolean z10) {
        float b10;
        int i9;
        if (f10 <= 0.25f) {
            b10 = j2.b(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                b10 = j2.b(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                if (f12 <= 0.25f) {
                    b10 = j2.b(f12, 0.25f, 9.437184E7f, 10485760);
                } else {
                    b10 = j2.b(f12 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i10 = (int) b10;
        vt vtVar = this.f24194a;
        long j10 = i10;
        boolean z11 = true;
        vtVar.f24221b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        vtVar.d = j10;
        t8[] t8VarArr = vtVar.h;
        AnimatorSet[] animatorSetArr = vtVar.f43583n;
        int i11 = vtVar.f43581e;
        i9 = vtVar.f43584r.videosRow;
        if (i11 == i9) {
            vtVar.f43582f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            if (i10 <= 2097152) {
                z11 = false;
            }
            if (z11 != t8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                t8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new y11(vtVar, 20));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public final int c0() {
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        vt vtVar = this.f24194a;
        sb2.append((Object) vtVar.f24220a.getText());
        sb2.append(" ");
        sb2.append((Object) vtVar.f24221b.getText());
        return sb2.toString();
    }

    @Override
    public final void n() {
    }
}
