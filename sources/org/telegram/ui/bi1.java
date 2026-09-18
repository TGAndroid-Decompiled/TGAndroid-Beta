package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class bi1 implements View.OnClickListener {
    public final int f32390a;
    public final si1 f32391b;
    public final VoIPService f32392c;

    public bi1(si1 si1Var, VoIPService voIPService, int i10) {
        this.f32390a = i10;
        this.f32391b = si1Var;
        this.f32392c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32390a) {
            case 0:
                si1 si1Var = this.f32391b;
                AndroidUtilities.runOnUIThread(new ci1(si1Var, 8));
                int i10 = si1Var.L;
                if (i10 > 0) {
                    this.f32392c.sendCallRating(i10);
                    return;
                }
                return;
            default:
                si1 si1Var2 = this.f32391b;
                AndroidUtilities.runOnUIThread(new ci1(si1Var2, 10));
                int i11 = si1Var2.L;
                if (i11 > 0) {
                    this.f32392c.sendCallRating(i11);
                    return;
                }
                return;
        }
    }
}
