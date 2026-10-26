package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o4 extends org.telegram.ui.Components.lm0 {
    public final Context f42087c;

    public o4(Context context) {
        this.f42087c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        if (b10 != 1) {
            wi.a aVar = wi.e.f51277b;
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        wi.a aVar = wi.e.f51277b;
        aVar.a();
        boolean z10 = aVar.d;
        int i12 = e1Var.f47741f;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.q4) e1Var.f47738a).setText(LocaleController.getString(R.string.AudioRecorderGeneral));
        } else if (i12 == 1) {
            ((org.telegram.ui.Cells.a9) e1Var.f47738a).f(LocaleController.getString(R.string.AudioRecorderUseNewRecorder), z10, false);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) e1Var.f47738a;
            gaVar.setEnabled(z10);
            String string = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
            if (((ui.h) wi.e.f51278c.a()) == ui.h.f49930b) {
                i11 = R.string.AudioRecorderNoiseSuppressionRNNoise;
            } else {
                i11 = R.string.AudioRecorderNoiseSuppressionOff;
            }
            gaVar.c(string, LocaleController.getString(i11), false, false);
        } else {
            ((org.telegram.ui.Cells.i9) e1Var.f47738a).setText(LocaleController.getString(R.string.AudioRecorderGeneralInfo));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ga gaVar;
        Context context = this.f42087c;
        if (i10 == 0) {
            gaVar = new org.telegram.ui.Cells.q4(context);
        } else if (i10 == 1) {
            gaVar = new org.telegram.ui.Cells.a9(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ga gaVar2 = new org.telegram.ui.Cells.ga(context);
            gaVar2.setCanDisable(true);
            gaVar = gaVar2;
        } else {
            gaVar = new org.telegram.ui.Cells.i9(context);
        }
        gaVar.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(gaVar);
    }
}
