package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n4 extends org.telegram.ui.Components.vm0 {
    public final Context f40203c;

    public n4(Context context) {
        this.f40203c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        if (b10 != 1) {
            ri.a aVar = ri.e.f47797b;
            aVar.a();
            if (!aVar.d || b10 != 2) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return 4;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        ri.a aVar = ri.e.f47797b;
        aVar.a();
        boolean z10 = aVar.d;
        int i12 = d1Var.f47901f;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.m4) d1Var.f47897a).setText(LocaleController.getString(R.string.AudioRecorderGeneral));
        } else if (i12 == 1) {
            ((org.telegram.ui.Cells.w8) d1Var.f47897a).f(LocaleController.getString(R.string.AudioRecorderUseNewRecorder), z10, false);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) d1Var.f47897a;
            caVar.setEnabled(z10);
            String string = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
            if (((pi.m) ri.e.f47798c.a()) == pi.m.f45799b) {
                i11 = R.string.AudioRecorderNoiseSuppressionRNNoise;
            } else {
                i11 = R.string.AudioRecorderNoiseSuppressionOff;
            }
            caVar.c(string, LocaleController.getString(i11), false, false);
        } else {
            ((org.telegram.ui.Cells.e9) d1Var.f47897a).setText(LocaleController.getString(R.string.AudioRecorderGeneralInfo));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ca caVar;
        Context context = this.f40203c;
        if (i10 == 0) {
            caVar = new org.telegram.ui.Cells.m4(context);
        } else if (i10 == 1) {
            caVar = new org.telegram.ui.Cells.w8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ca caVar2 = new org.telegram.ui.Cells.ca(context);
            caVar2.setCanDisable(true);
            caVar = caVar2;
        } else {
            caVar = new org.telegram.ui.Cells.e9(context);
        }
        caVar.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(caVar);
    }
}
