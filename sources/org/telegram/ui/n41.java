package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class n41 extends org.telegram.ui.Components.ul0 {
    public final Context f35890c;

    public n41(Context context) {
        this.f35890c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        if (b10 != 1) {
            if (MessagesController.getGlobalMainSettings().getBoolean("round_video_camera2_enabled", true)) {
                if (b10 != 2 && b10 != 3 && b10 != 4 && b10 != 5 && b10 != 8) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return 10;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0 && i10 != 7) {
            if (i10 == 1 || i10 == 8) {
                return 1;
            }
            if (i10 != 6 && i10 != 9) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        String string2;
        boolean z10;
        String string3;
        boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("round_video_camera2_enabled", true);
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        if (i11 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i10 == 0) {
                string3 = LocaleController.getString(R.string.RoundVideoGeneral);
            } else {
                string3 = LocaleController.getString(R.string.RoundVideoComposition);
            }
            n4Var.setText(string3);
        } else if (i11 == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 != 1 && !z11) {
                z10 = false;
            } else {
                z10 = true;
            }
            x8Var.setEnabled(z10);
            if (i10 == 1) {
                x8Var.f(LocaleController.getString(R.string.RoundVideoUseNewRecorder), z11, false);
            } else {
                x8Var.f(LocaleController.getString(R.string.RoundVideoCompositionEnabled), w7.a6.a(), false);
            }
        } else if (i11 == 2) {
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
            faVar.setEnabled(z11);
            if (i10 == 2) {
                faVar.c(LocaleController.getString(R.string.RoundVideoOutputResolution), a4.a.n(((ki.m0) w7.a6.c("round_video_output_resolution", ki.m0.P480, ki.m0.class)).f13772a, "p", new StringBuilder()), false, true);
            } else if (i10 == 3) {
                String string4 = LocaleController.getString(R.string.RoundVideoCameraResolution);
                ki.i0 i0Var = ki.i0.f13731a;
                ki.i0 i0Var2 = (ki.i0) w7.a6.c("round_video_camera_resolution", i0Var, ki.i0.class);
                if (i0Var2 == i0Var) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionHigh);
                } else if (i0Var2 == ki.i0.f13732b) {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionMedium);
                } else {
                    string2 = LocaleController.getString(R.string.RoundVideoCameraResolutionLow);
                }
                faVar.c(string4, string2, false, true);
            } else if (i10 == 4) {
                faVar.c(LocaleController.getString(R.string.RoundVideoFrameRate), a4.a.n(((ki.j0) w7.a6.c("round_video_frame_rate", ki.j0.FPS_30, ki.j0.class)).f13758a, " FPS", new StringBuilder()), false, true);
            } else {
                faVar.c(LocaleController.getString(R.string.RoundVideoBitrate), o41.U(Math.max(1, MessagesController.getGlobalMainSettings().getInt("round_video_video_bitrate", 1000000))), false, false);
            }
        } else {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == 6) {
                string = LocaleController.getString(R.string.RoundVideoGeneralInfo);
            } else {
                string = LocaleController.getString(R.string.RoundVideoCompositionInfo);
            }
            f9Var.setText(string);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.fa faVar;
        Context context = this.f35890c;
        if (i10 == 0) {
            faVar = new org.telegram.ui.Cells.n4(context);
        } else if (i10 == 1) {
            faVar = new org.telegram.ui.Cells.x8(context);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.fa faVar2 = new org.telegram.ui.Cells.fa(context);
            faVar2.setCanDisable(true);
            faVar = faVar2;
        } else {
            faVar = new org.telegram.ui.Cells.f9(context);
        }
        faVar.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(faVar);
    }
}
