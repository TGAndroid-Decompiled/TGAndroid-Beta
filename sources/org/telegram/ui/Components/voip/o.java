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
import org.telegram.ui.Components.n90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fi1;
import org.telegram.ui.j20;
import org.telegram.ui.rg;
import org.telegram.ui.wl0;
import yh.k7;
import yh.m7;
import yh.v5;
import yh.w3;
import yh.w7;
public final class o implements View.OnClickListener {
    public final int f29517a;
    public final Object f29518b;

    public o(Object obj, int i10) {
        this.f29517a = i10;
        this.f29518b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.m2 R;
        org.telegram.ui.ActionBar.m2 R2;
        switch (this.f29517a) {
            case 0:
                u uVar = (u) this.f29518b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 1:
                x0 x0Var = (x0) this.f29518b;
                if (!x0Var.f29738a) {
                    if (x0Var.f29746x == 0 && x0Var.f29747y) {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        x0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 2:
                fi1 fi1Var = (fi1) this.f29518b;
                if (!fi1Var.f29302a) {
                    if (fi1Var.f29309w == 0) {
                        ((Activity) fi1Var.getContext()).startActivityForResult(((MediaProjectionManager) fi1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        fi1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 3:
                Context context = (Context) this.f29518b;
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
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f29518b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 5:
                ((pg.x) this.f29518b).dismiss();
                return;
            case 6:
                ((wl0) this.f29518b).run();
                return;
            case 7:
                ((qg.t2) this.f29518b).onBackPressed();
                return;
            case 8:
                ((rg) this.f29518b).run();
                return;
            case 9:
                ((n90) this.f29518b).performClick();
                return;
            case 10:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((rg.k1) this.f29518b).f42647t0, null, "profile", null);
                return;
            case 11:
                final tg.g0 g0Var = (tg.g0) this.f29518b;
                vg.a aVar = g0Var.Q0;
                if (!aVar.f44579a.N) {
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
                ((tg.j0) this.f29518b).dismiss();
                return;
            case 13:
                ((tg.b0) ((ug.e) this.f29518b)).f43381r.dismiss();
                return;
            case 14:
                Runnable runnable = ((xg.c) this.f29518b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ((xh.c) this.f29518b).dismiss();
                return;
            case 16:
                ((xh.c0) this.f29518b).dismiss();
                return;
            case 17:
                if (((xh.r1) this.f29518b).f46373f0.f47625f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19582a = true;
                    R.showAsSheet(new w7(), obj);
                    return;
                }
                return;
            case 18:
                ((yh.s) this.f29518b).dismiss();
                return;
            case 19:
                ((yh.e0) this.f29518b).dismiss();
                return;
            case 20:
                yh.i0 i0Var = (yh.i0) this.f29518b;
                zf.b bVar = i0Var.E.f49226a;
                zf.b bVar2 = zf.b.f49229b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.f49228a;
                }
                i0Var.n(zf.a.i(0L, bVar2), true, false, true);
                i0Var.f47495c.setText("");
                return;
            case 21:
                ((yh.s0) this.f29518b).dismiss();
                return;
            case 22:
                ((yh.r1) this.f29518b).run();
                return;
            case 23:
                ((yh.r1) this.f29518b).run();
                return;
            case 24:
                yh.c3 c3Var = (yh.c3) this.f29518b;
                c3Var.getClass();
                new m7(c3Var.f47256b, c3Var.f47259g).show();
                return;
            case 25:
                ((w3) this.f29518b).dismiss();
                return;
            case 26:
                ((v5) this.f29518b).run();
                return;
            case 27:
                if (((k7) ((j20) this.f29518b).d).f47625f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19582a = true;
                    R2.showAsSheet(new w7(), obj2);
                    return;
                }
                return;
            default:
                zg.b0 b0Var = (zg.b0) this.f29518b;
                if (b0Var.f49253k) {
                    b0Var.d();
                    return;
                }
                return;
        }
    }
}
