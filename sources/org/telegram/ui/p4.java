package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p4 extends org.telegram.ui.Components.km0 {
    public final Context f40325c;

    public p4(Context context) {
        this.f40325c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 != 1) {
            ti.a aVar = ti.e.f47658b;
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        ti.a aVar = ti.e.f47658b;
        aVar.a();
        boolean z10 = aVar.d;
        int i12 = b1Var.f46345f;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.l4) b1Var.f46342a).setText(LocaleController.getString(R.string.AudioRecorderGeneral));
        } else if (i12 == 1) {
            ((org.telegram.ui.Cells.w8) b1Var.f46342a).f(LocaleController.getString(R.string.AudioRecorderUseNewRecorder), z10, false);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) b1Var.f46342a;
            caVar.setEnabled(z10);
            String string = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
            if (((ri.h) ti.e.f47659c.a()) == ri.h.f46237b) {
                i11 = R.string.AudioRecorderNoiseSuppressionRNNoise;
            } else {
                i11 = R.string.AudioRecorderNoiseSuppressionOff;
            }
            caVar.c(string, LocaleController.getString(i11), false, false);
        } else {
            ((org.telegram.ui.Cells.e9) b1Var.f46342a).setText(LocaleController.getString(R.string.AudioRecorderGeneralInfo));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ca caVar;
        Context context = this.f40325c;
        if (i10 == 0) {
            caVar = new org.telegram.ui.Cells.l4(context);
        } else if (i10 == 1) {
            caVar = new org.telegram.ui.Cells.w8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ca caVar2 = new org.telegram.ui.Cells.ca(context);
            caVar2.setCanDisable(true);
            caVar = caVar2;
        } else {
            caVar = new org.telegram.ui.Cells.e9(context);
        }
        caVar.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(caVar);
    }
}
