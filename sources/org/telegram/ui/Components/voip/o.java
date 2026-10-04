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
import org.telegram.ui.Components.q90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.am0;
import org.telegram.ui.fi1;
import org.telegram.ui.o20;
import org.telegram.ui.ug;
import yh.l7;
import yh.n7;
import yh.w3;
import yh.x7;
import yh.z5;
public final class o implements View.OnClickListener {
    public final int f32040a;
    public final Object f32041b;

    public o(Object obj, int i10) {
        this.f32040a = i10;
        this.f32041b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f32040a) {
            case 0:
                u uVar = (u) this.f32041b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 1:
                x0 x0Var = (x0) this.f32041b;
                if (!x0Var.f32278a) {
                    if (x0Var.f32287x == 0 && x0Var.f32288y) {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        x0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 2:
                fi1 fi1Var = (fi1) this.f32041b;
                if (!fi1Var.f31809a) {
                    if (fi1Var.f31817w == 0) {
                        ((Activity) fi1Var.getContext()).startActivityForResult(((MediaProjectionManager) fi1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        fi1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 3:
                Context context = (Context) this.f32041b;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(context, LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    if (!(context instanceof Activity)) {
                        action.addFlags(268435456);
                    }
                    context.startActivity(action);
                    k1.j();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f32041b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 5:
                ((pg.x) this.f32041b).dismiss();
                return;
            case 6:
                ((am0) this.f32041b).run();
                return;
            case 7:
                ((qg.t2) this.f32041b).onBackPressed();
                return;
            case 8:
                ((ug) this.f32041b).run();
                return;
            case 9:
                ((q90) this.f32041b).performClick();
                return;
            case 10:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((rg.m1) this.f32041b).f46211t0, null, "profile", null);
                return;
            case 11:
                final tg.g0 g0Var = (tg.g0) this.f32041b;
                vg.a aVar = g0Var.Q0;
                if (!aVar.f48273a.N) {
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
                                    g0.c0(g0Var, (TLRPC.TL_error) obj);
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
                                    g0.c0(g0Var, (TLRPC.TL_error) obj);
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
                ((tg.j0) this.f32041b).dismiss();
                return;
            case 13:
                ((tg.b0) ((ug.e) this.f32041b)).f46988r.dismiss();
                return;
            case 14:
                Runnable runnable = ((xg.c) this.f32041b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ((xh.c) this.f32041b).dismiss();
                return;
            case 16:
                ((xh.c0) this.f32041b).dismiss();
                return;
            case 17:
                if (((xh.q1) this.f32041b).f50193f0.f51593f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21354a = true;
                    R.showAsSheet(new x7(), obj);
                    return;
                }
                return;
            case 18:
                ((yh.s) this.f32041b).dismiss();
                return;
            case 19:
                ((yh.e0) this.f32041b).dismiss();
                return;
            case 20:
                yh.i0 i0Var = (yh.i0) this.f32041b;
                zf.b bVar = i0Var.E.f53300a;
                zf.b bVar2 = zf.b.f53303b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.f53302a;
                }
                i0Var.n(zf.a.i(0L, bVar2), true, false, true);
                i0Var.f51407c.setText("");
                return;
            case 21:
                ((yh.s0) this.f32041b).dismiss();
                return;
            case 22:
                ((yh.r1) this.f32041b).run();
                return;
            case 23:
                ((yh.r1) this.f32041b).run();
                return;
            case 24:
                yh.c3 c3Var = (yh.c3) this.f32041b;
                c3Var.getClass();
                new n7(c3Var.f51157b, c3Var.f51161g).show();
                return;
            case 25:
                ((w3) this.f32041b).dismiss();
                return;
            case 26:
                ((z5) this.f32041b).run();
                return;
            case 27:
                if (((l7) ((o20) this.f32041b).d).f51593f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21354a = true;
                    R2.showAsSheet(new x7(), obj2);
                    return;
                }
                return;
            default:
                zg.b0 b0Var = (zg.b0) this.f32041b;
                if (b0Var.f53330k) {
                    b0Var.d();
                    return;
                }
                return;
        }
    }
}
