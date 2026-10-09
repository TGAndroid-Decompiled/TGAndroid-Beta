package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bi0;
import org.telegram.ui.m20;
import org.telegram.ui.pi1;
import org.telegram.ui.tg;
import yh.d7;
import yh.f7;
import yh.p5;
import yh.p7;
import yh.r3;
public final class o implements View.OnClickListener {
    public final int f32115a;
    public final Object f32116b;

    public o(Object obj, int i10) {
        this.f32115a = i10;
        this.f32116b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f32115a) {
            case 0:
                u uVar = (u) this.f32116b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 1:
                x0 x0Var = (x0) this.f32116b;
                if (!x0Var.f32358a) {
                    if (x0Var.f32367x == 0 && x0Var.f32368y) {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        x0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 2:
                pi1 pi1Var = (pi1) this.f32116b;
                if (!pi1Var.f31889a) {
                    if (pi1Var.f31897w == 0) {
                        ((Activity) pi1Var.getContext()).startActivityForResult(((MediaProjectionManager) pi1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        pi1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 3:
                Context context = (Context) this.f32116b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    j1.j();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f32116b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 5:
                ((pg.x) this.f32116b).dismiss();
                return;
            case 6:
                ((bi0) this.f32116b).run();
                return;
            case 7:
                ((qg.u2) this.f32116b).onBackPressed();
                return;
            case 8:
                ((tg) this.f32116b).run();
                return;
            case 9:
                ((ea0) this.f32116b).performClick();
                return;
            case 10:
                PremiumPreviewFragment.q0();
                PremiumPreviewFragment.l0(((rg.l1) this.f32116b).f47337t0, null, "profile", null);
                return;
            case 11:
                final tg.g0 g0Var = (tg.g0) this.f32116b;
                vg.a aVar = g0Var.Q0;
                if (!aVar.f49561a.N) {
                    aVar.b(true);
                    String str = g0Var.R0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.Q0.b(false);
                                    g0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0.d0(g0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.Q0.b(false);
                                    g0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0.d0(g0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.o(callback2, callback, 0), 2);
                    return;
                }
                return;
            case 12:
                ((tg.j0) this.f32116b).dismiss();
                return;
            case 13:
                ((tg.b0) ((ug.e) this.f32116b)).f48294r.dismiss();
                return;
            case 14:
                Runnable runnable = ((xg.c) this.f32116b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ((xh.d) this.f32116b).dismiss();
                return;
            case 16:
                ((xh.e0) this.f32116b).dismiss();
                return;
            case 17:
                if (((xh.r1) this.f32116b).f51482f0.f52401f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21357a = true;
                    R.showAsSheet(new p7(), obj);
                    return;
                }
                return;
            case 18:
                ((yh.s) this.f32116b).dismiss();
                return;
            case 19:
                ((yh.c0) this.f32116b).dismiss();
                return;
            case 20:
                yh.h0 h0Var = (yh.h0) this.f32116b;
                zf.b bVar = h0Var.E.f54439a;
                zf.b bVar2 = zf.b.f54442b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.f54441a;
                }
                h0Var.p(zf.a.i(0L, bVar2), true, false, true);
                h0Var.f52601c.setText("");
                return;
            case 21:
                ((yh.r0) this.f32116b).dismiss();
                return;
            case 22:
                ((yh.p1) this.f32116b).run();
                return;
            case 23:
                ((yh.p1) this.f32116b).run();
                return;
            case 24:
                yh.y2 y2Var = (yh.y2) this.f32116b;
                y2Var.getClass();
                new f7(y2Var.f53408b, y2Var.f53412g).show();
                return;
            case 25:
                ((r3) this.f32116b).dismiss();
                return;
            case 26:
                ((p5) this.f32116b).run();
                return;
            case 27:
                if (((d7) ((m20) this.f32116b).d).f52401f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21357a = true;
                    R2.showAsSheet(new p7(), obj2);
                    return;
                }
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f32116b;
                if (a0Var.f54455k) {
                    a0Var.d();
                    return;
                }
                return;
        }
    }
}
