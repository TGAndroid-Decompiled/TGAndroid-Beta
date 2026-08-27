package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.tl.TL_stories;

public final class o80 implements d5.d {

    public final int f41032a = 0;

    public final LaunchActivity f41033b;

    public final we.d f41034c;
    public final Runnable d;

    public final Long f41035e;

    public final org.telegram.ui.Cells.s1 f41036f;

    public final Object f41037g;

    public o80(LaunchActivity launchActivity, we.d dVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.s1 s1Var, Runnable runnable) {
        this.f41033b = launchActivity;
        this.f41034c = dVar;
        this.f41035e = l10;
        this.f41037g = tL_premium_boostsStatus;
        this.f41036f = s1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f41032a;
        Object obj2 = this.f41037g;
        switch (i10) {
            case 0:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                we.d dVar = this.f41034c;
                if (dVar != null) {
                    dVar.b();
                }
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR instanceof qg0) {
                    n2VarR = ((qg0) n2VarR).X();
                }
                org.telegram.ui.ActionBar.n2 n2Var = n2VarR;
                if (n2Var != null) {
                    org.telegram.ui.ActionBar.c6 resourceProvider = n2Var.getResourceProvider();
                    if (n2Var.getLastStoryViewer() != null && n2Var.getLastStoryViewer().G0) {
                        resourceProvider = n2Var.getLastStoryViewer().f13515y;
                    }
                    LaunchActivity launchActivity = this.f41033b;
                    ag.i1 i1Var = new ag.i1(19, launchActivity.K, launchActivity, n2Var, resourceProvider);
                    i1Var.G1(canApplyBoost);
                    boolean z10 = n2Var instanceof rn;
                    Long l10 = this.f41035e;
                    boolean z11 = true;
                    boolean z12 = false;
                    if (z10) {
                        if (((rn) n2Var).a() != l10.longValue()) {
                            z11 = false;
                        }
                        z12 = z11;
                    } else if (n2Var instanceof gy) {
                        bx bxVar = ((gy) n2Var).B3;
                        if (bxVar == null || bxVar.getCurrentFragmetDialogId() != l10.longValue()) {
                            z11 = false;
                        }
                        z12 = z11;
                    }
                    i1Var.F1(tL_premium_boostsStatus, z12);
                    i1Var.H1(l10.longValue());
                    i1Var.f431c0 = this.f41036f;
                    n2Var.showDialog(i1Var);
                    Runnable runnable = this.d;
                    if (runnable != null) {
                        try {
                            runnable.run();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                ChannelBoostsController channelBoostsController = (ChannelBoostsController) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                Pattern pattern2 = LaunchActivity.f35496x1;
                we.d dVar2 = this.f41034c;
                Runnable runnable2 = this.d;
                if (tL_premium_boostsStatus2 != null) {
                    Long l11 = this.f41035e;
                    channelBoostsController.userCanBoostChannel(l11.longValue(), tL_premium_boostsStatus2, new o80(this.f41033b, dVar2, l11, tL_premium_boostsStatus2, this.f41036f, runnable2));
                } else {
                    if (dVar2 != null) {
                        dVar2.b();
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
                break;
        }
    }

    public o80(LaunchActivity launchActivity, we.d dVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.s1 s1Var) {
        this.f41033b = launchActivity;
        this.f41034c = dVar;
        this.d = runnable;
        this.f41037g = channelBoostsController;
        this.f41035e = l10;
        this.f41036f = s1Var;
    }
}
