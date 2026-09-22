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
import org.telegram.ui.Components.c90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.em0;
import org.telegram.ui.ni1;
import org.telegram.ui.o20;
import org.telegram.ui.ug;
import yh.l7;
import yh.n7;
import yh.x5;
import yh.x7;
import yh.y3;
public final class o implements View.OnClickListener {
    public final int f29112a;
    public final Object f29113b;

    public o(Object obj, int i10) {
        this.f29112a = i10;
        this.f29113b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f29112a) {
            case 0:
                u uVar = (u) this.f29113b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 1:
                x0 x0Var = (x0) this.f29113b;
                if (!x0Var.f29337a) {
                    if (x0Var.f29345x == 0 && x0Var.f29346y) {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        x0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 2:
                ni1 ni1Var = (ni1) this.f29113b;
                if (!ni1Var.f28902a) {
                    if (ni1Var.f28909w == 0) {
                        ((Activity) ni1Var.getContext()).startActivityForResult(((MediaProjectionManager) ni1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        ni1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 3:
                Context context = (Context) this.f29113b;
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
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f29113b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f18435a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 5:
                ((pg.x) this.f29113b).dismiss();
                return;
            case 6:
                ((em0) this.f29113b).run();
                return;
            case 7:
                ((qg.v2) this.f29113b).onBackPressed();
                return;
            case 8:
                ((ug) this.f29113b).run();
                return;
            case 9:
                ((c90) this.f29113b).performClick();
                return;
            case 10:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((rg.k1) this.f29113b).f42358t0, null, "profile", null);
                return;
            case 11:
                final tg.h0 h0Var = (tg.h0) this.f29113b;
                vg.a aVar = h0Var.Q0;
                if (!aVar.f44293a.N) {
                    aVar.b(true);
                    String str = h0Var.R0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    h0 h0Var2 = h0Var;
                                    h0Var2.Q0.b(false);
                                    h0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new f0(h0Var2, 1), 200L);
                                    return;
                                default:
                                    h0.c0(h0Var, (TLRPC.TL_error) obj);
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
                                    h0 h0Var2 = h0Var;
                                    h0Var2.Q0.b(false);
                                    h0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new f0(h0Var2, 1), 200L);
                                    return;
                                default:
                                    h0.c0(h0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.q(callback2, callback, 0), 2);
                    return;
                }
                return;
            case 12:
                ((tg.k0) this.f29113b).dismiss();
                return;
            case 13:
                ((tg.c0) ((ug.e) this.f29113b)).f43113r.dismiss();
                return;
            case 14:
                Runnable runnable = ((xg.c) this.f29113b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ((xh.c) this.f29113b).dismiss();
                return;
            case 16:
                ((xh.c0) this.f29113b).dismiss();
                return;
            case 17:
                if (((xh.q1) this.f29113b).f46077f0.f47375f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19364a = true;
                    R.showAsSheet(new x7(), obj);
                    return;
                }
                return;
            case 18:
                ((yh.s) this.f29113b).dismiss();
                return;
            case 19:
                ((yh.e0) this.f29113b).dismiss();
                return;
            case 20:
                yh.i0 i0Var = (yh.i0) this.f29113b;
                zf.b bVar = i0Var.E.f48945a;
                zf.b bVar2 = zf.b.f48948b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.f48947a;
                }
                i0Var.n(zf.a.i(0L, bVar2), true, false, true);
                i0Var.f47213c.setText("");
                return;
            case 21:
                ((yh.s0) this.f29113b).dismiss();
                return;
            case 22:
                ((yh.r1) this.f29113b).run();
                return;
            case 23:
                ((yh.r1) this.f29113b).run();
                return;
            case 24:
                yh.e3 e3Var = (yh.e3) this.f29113b;
                e3Var.getClass();
                new n7(e3Var.f47045b, e3Var.f47048g).show();
                return;
            case 25:
                ((y3) this.f29113b).dismiss();
                return;
            case 26:
                ((x5) this.f29113b).run();
                return;
            case 27:
                if (((l7) ((o20) this.f29113b).d).f47375f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19364a = true;
                    R2.showAsSheet(new x7(), obj2);
                    return;
                }
                return;
            default:
                zg.c0 c0Var = (zg.c0) this.f29113b;
                if (c0Var.f48983k) {
                    c0Var.d();
                    return;
                }
                return;
        }
    }
}
