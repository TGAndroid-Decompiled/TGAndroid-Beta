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
import org.telegram.ui.di1;
import org.telegram.ui.o20;
import org.telegram.ui.ug;
import yh.a6;
import yh.m7;
import yh.p7;
import yh.x3;
import yh.z7;
public final class o implements View.OnClickListener {
    public final int f32107a;
    public final Object f32108b;

    public o(Object obj, int i10) {
        this.f32107a = i10;
        this.f32108b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f32107a) {
            case 0:
                u uVar = (u) this.f32108b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 1:
                x0 x0Var = (x0) this.f32108b;
                if (!x0Var.f32345a) {
                    if (x0Var.f32354x == 0 && x0Var.f32355y) {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        x0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 2:
                di1 di1Var = (di1) this.f32108b;
                if (!di1Var.f31876a) {
                    if (di1Var.f31884w == 0) {
                        ((Activity) di1Var.getContext()).startActivityForResult(((MediaProjectionManager) di1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        di1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 3:
                Context context = (Context) this.f32108b;
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
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f32108b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 5:
                ((pg.x) this.f32108b).dismiss();
                return;
            case 6:
                ((am0) this.f32108b).run();
                return;
            case 7:
                ((qg.t2) this.f32108b).onBackPressed();
                return;
            case 8:
                ((ug) this.f32108b).run();
                return;
            case 9:
                ((q90) this.f32108b).performClick();
                return;
            case 10:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((rg.m1) this.f32108b).f46218t0, null, "profile", null);
                return;
            case 11:
                final tg.g0 g0Var = (tg.g0) this.f32108b;
                vg.a aVar = g0Var.Q0;
                if (!aVar.f48280a.N) {
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
                ((tg.j0) this.f32108b).dismiss();
                return;
            case 13:
                ((tg.b0) ((ug.e) this.f32108b)).f46995r.dismiss();
                return;
            case 14:
                Runnable runnable = ((xg.c) this.f32108b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ((xh.c) this.f32108b).dismiss();
                return;
            case 16:
                ((xh.c0) this.f32108b).dismiss();
                return;
            case 17:
                if (((xh.q1) this.f32108b).f50200f0.f51660f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21358a = true;
                    R.showAsSheet(new z7(), obj);
                    return;
                }
                return;
            case 18:
                ((yh.t) this.f32108b).dismiss();
                return;
            case 19:
                ((yh.f0) this.f32108b).dismiss();
                return;
            case 20:
                yh.j0 j0Var = (yh.j0) this.f32108b;
                zf.b bVar = j0Var.E.f53321a;
                zf.b bVar2 = zf.b.f53324b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.f53323a;
                }
                j0Var.n(zf.a.i(0L, bVar2), true, false, true);
                j0Var.f51472c.setText("");
                return;
            case 21:
                ((yh.t0) this.f32108b).dismiss();
                return;
            case 22:
                ((yh.s1) this.f32108b).run();
                return;
            case 23:
                ((yh.s1) this.f32108b).run();
                return;
            case 24:
                yh.d3 d3Var = (yh.d3) this.f32108b;
                d3Var.getClass();
                new p7(d3Var.f51213b, d3Var.f51217g).show();
                return;
            case 25:
                ((x3) this.f32108b).dismiss();
                return;
            case 26:
                ((a6) this.f32108b).run();
                return;
            case 27:
                if (((m7) ((o20) this.f32108b).d).f51660f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21358a = true;
                    R2.showAsSheet(new z7(), obj2);
                    return;
                }
                return;
            default:
                zg.z zVar = (zg.z) this.f32108b;
                if (zVar.f53558k) {
                    zVar.d();
                    return;
                }
                return;
        }
    }
}
