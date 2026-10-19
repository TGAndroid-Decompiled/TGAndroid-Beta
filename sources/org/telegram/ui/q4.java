package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q4 extends org.telegram.ui.Components.hm0 {
    public final Context f40367c;

    public q4(Context context) {
        this.f40367c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        if (b10 != 1) {
            ti.a aVar = ti.e.f47213b;
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
        ti.a aVar = ti.e.f47213b;
        aVar.a();
        boolean z10 = aVar.d;
        int i12 = b1Var.f45913f;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.l4) b1Var.f45910a).setText(LocaleController.getString(R.string.AudioRecorderGeneral));
        } else if (i12 == 1) {
            ((org.telegram.ui.Cells.v8) b1Var.f45910a).f(LocaleController.getString(R.string.AudioRecorderUseNewRecorder), z10, false);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) b1Var.f45910a;
            baVar.setEnabled(z10);
            String string = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
            if (((ri.i) ti.e.f47214c.a()) == ri.i.f45806b) {
                i11 = R.string.AudioRecorderNoiseSuppressionRNNoise;
            } else {
                i11 = R.string.AudioRecorderNoiseSuppressionOff;
            }
            baVar.c(string, LocaleController.getString(i11), false, false);
        } else {
            ((org.telegram.ui.Cells.d9) b1Var.f45910a).setText(LocaleController.getString(R.string.AudioRecorderGeneralInfo));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ba baVar;
        Context context = this.f40367c;
        if (i10 == 0) {
            baVar = new org.telegram.ui.Cells.l4(context);
        } else if (i10 == 1) {
            baVar = new org.telegram.ui.Cells.v8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.ba baVar2 = new org.telegram.ui.Cells.ba(context);
            baVar2.setCanDisable(true);
            baVar = baVar2;
        } else {
            baVar = new org.telegram.ui.Cells.d9(context);
        }
        baVar.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(baVar);
    }
}
