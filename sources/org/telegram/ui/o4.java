package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
public final class o4 extends org.telegram.ui.Components.mm0 {
    public final Context f41966c;
    public final p4 d;

    public o4(p4 p4Var, Context context) {
        this.d = p4Var;
        this.f41966c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int b10 = e1Var.b();
        if (b10 != 1) {
            i10 = ((org.telegram.ui.ActionBar.r2) this.d).currentAccount;
            if (!MediaController.shouldUseAudioRecorderV2(i10) || b10 != 2) {
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
        int i12;
        i11 = ((org.telegram.ui.ActionBar.r2) this.d).currentAccount;
        boolean shouldUseAudioRecorderV2 = MediaController.shouldUseAudioRecorderV2(i11);
        int i13 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.AudioRecorderGeneral));
        } else if (i13 == 1) {
            ((org.telegram.ui.Cells.a9) view).f(LocaleController.getString(R.string.AudioRecorderUseNewRecorder), shouldUseAudioRecorderV2, false);
        } else if (i13 == 2) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            gaVar.setEnabled(shouldUseAudioRecorderV2);
            String string = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
            if (((ui.h) wi.e.f51336c.a()) == ui.h.f49965b) {
                i12 = R.string.AudioRecorderNoiseSuppressionRNNoise;
            } else {
                i12 = R.string.AudioRecorderNoiseSuppressionOff;
            }
            gaVar.c(string, LocaleController.getString(i12), false, false);
        } else {
            ((org.telegram.ui.Cells.i9) view).setText(LocaleController.getString(R.string.AudioRecorderGeneralInfo));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.ga gaVar;
        Context context = this.f41966c;
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
