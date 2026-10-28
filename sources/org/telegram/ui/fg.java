package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
public final class fg implements Runnable {
    public final int f39353a = 0;
    public final wn f39354b;
    public final boolean f39355c;
    public final long d;

    public fg(wn wnVar, long j10, boolean z10) {
        this.f39354b = wnVar;
        this.d = j10;
        this.f39355c = z10;
    }

    @Override
    public final void run() {
        long j10;
        long j11;
        switch (this.f39353a) {
            case 0:
                wn.u0(this.f39354b, this.d, this.f39355c);
                return;
            default:
                jk jkVar = this.f39354b.Y;
                if (jkVar != null) {
                    MediaController mediaController = MediaController.getInstance();
                    if (!jkVar.Y1 && !jkVar.F2 && mediaController.isRecordingAudio() && !mediaController.isRecordingPaused() && mediaController.getRecordingGuid() == jkVar.G2) {
                        jkVar.f25861c1 = false;
                        org.telegram.ui.Components.ve veVar = jkVar.f25854b1;
                        if (veVar != null) {
                            veVar.j(org.telegram.ui.Components.yg.f35047a, false);
                        }
                        jkVar.F2 = true;
                        jkVar.I1(0, true);
                        if (this.f39355c) {
                            jkVar.O = true;
                            org.telegram.ui.Components.sg sgVar = jkVar.O1;
                            if (sgVar != null) {
                                sgVar.f32591y.d(1, true, false);
                            }
                            MediaDataController mediaDataController = MediaDataController.getInstance(jkVar.Q);
                            long j12 = jkVar.Q2;
                            wn wnVar = jkVar.P2;
                            if (wnVar != null && wnVar.f45290t4) {
                                j11 = wnVar.b();
                            } else {
                                j11 = 0;
                            }
                            mediaDataController.toggleDraftVoiceOnce(j12, j11, true);
                        }
                        long j13 = this.d;
                        if (j13 > 0) {
                            j10 = System.currentTimeMillis() - j13;
                        } else {
                            j10 = mediaController.recordTimeCount;
                        }
                        jkVar.f25898i1 = j10;
                        org.telegram.ui.Components.xg xgVar = jkVar.Y0;
                        if (xgVar != null) {
                            xgVar.a(j10);
                        }
                        jkVar.f25959s4 = true;
                        jkVar.u1();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fg(wn wnVar, boolean z10, long j10) {
        this.f39354b = wnVar;
        this.f39355c = z10;
        this.d = j10;
    }
}
