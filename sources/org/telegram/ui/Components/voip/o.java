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
import org.telegram.ui.Components.k90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fm0;
import org.telegram.ui.mi1;
import org.telegram.ui.o20;
import org.telegram.ui.ug;
import yh.k7;
import yh.m7;
import yh.w7;
import yh.x3;
import yh.x5;
public final class o implements View.OnClickListener {
    public final int f29518a;
    public final Object f29519b;

    public o(Object obj, int i10) {
        this.f29518a = i10;
        this.f29519b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f29518a) {
            case 0:
                u uVar = (u) this.f29519b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 1:
                x0 x0Var = (x0) this.f29519b;
                if (!x0Var.f29743a) {
                    if (x0Var.f29751x == 0 && x0Var.f29752y) {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        x0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 2:
                mi1 mi1Var = (mi1) this.f29519b;
                if (!mi1Var.f29308a) {
                    if (mi1Var.f29315w == 0) {
                        ((Activity) mi1Var.getContext()).startActivityForResult(((MediaProjectionManager) mi1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        mi1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 3:
                Context context = (Context) this.f29519b;
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
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f29519b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 5:
                ((pg.x) this.f29519b).dismiss();
                return;
            case 6:
                ((fm0) this.f29519b).run();
                return;
            case 7:
                ((qg.t2) this.f29519b).onBackPressed();
                return;
            case 8:
                ((ug) this.f29519b).run();
                return;
            case 9:
                ((k90) this.f29519b).performClick();
                return;
            case 10:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((rg.k1) this.f29519b).f42660t0, null, "profile", null);
                return;
            case 11:
                final tg.g0 g0Var = (tg.g0) this.f29519b;
                vg.a aVar = g0Var.Q0;
                if (!aVar.f44594a.N) {
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
                ((tg.j0) this.f29519b).dismiss();
                return;
            case 13:
                ((tg.b0) ((ug.e) this.f29519b)).f43394r.dismiss();
                return;
            case 14:
                Runnable runnable = ((xg.c) this.f29519b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ((xh.c) this.f29519b).dismiss();
                return;
            case 16:
                ((xh.c0) this.f29519b).dismiss();
                return;
            case 17:
                if (((xh.r1) this.f29519b).f46392f0.f47660f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19577a = true;
                    R.showAsSheet(new w7(), obj);
                    return;
                }
                return;
            case 18:
                ((yh.s) this.f29519b).dismiss();
                return;
            case 19:
                ((yh.e0) this.f29519b).dismiss();
                return;
            case 20:
                yh.i0 i0Var = (yh.i0) this.f29519b;
                zf.b bVar = i0Var.E.f49252a;
                zf.b bVar2 = zf.b.f49255b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.f49254a;
                }
                i0Var.n(zf.a.i(0L, bVar2), true, false, true);
                i0Var.f47541c.setText("");
                return;
            case 21:
                ((yh.s0) this.f29519b).dismiss();
                return;
            case 22:
                ((yh.r1) this.f29519b).run();
                return;
            case 23:
                ((yh.r1) this.f29519b).run();
                return;
            case 24:
                yh.d3 d3Var = (yh.d3) this.f29519b;
                d3Var.getClass();
                new m7(d3Var.f47325b, d3Var.f47328g).show();
                return;
            case 25:
                ((x3) this.f29519b).dismiss();
                return;
            case 26:
                ((x5) this.f29519b).run();
                return;
            case 27:
                if (((k7) ((o20) this.f29519b).d).f47660f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19577a = true;
                    R2.showAsSheet(new w7(), obj2);
                    return;
                }
                return;
            default:
                zg.b0 b0Var = (zg.b0) this.f29519b;
                if (b0Var.f49279k) {
                    b0Var.d();
                    return;
                }
                return;
        }
    }
}
