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
import org.telegram.ui.Components.d90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fi1;
import org.telegram.ui.l20;
import org.telegram.ui.sg;
import org.telegram.ui.yl0;
import yh.k7;
import yh.m7;
import yh.w5;
import yh.w7;
import yh.x3;
public final class o implements View.OnClickListener {
    public final int f29086a;
    public final Object f29087b;

    public o(Object obj, int i10) {
        this.f29086a = i10;
        this.f29087b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.n2 R;
        org.telegram.ui.ActionBar.n2 R2;
        switch (this.f29086a) {
            case 0:
                u uVar = (u) this.f29087b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                uVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 1:
                x0 x0Var = (x0) this.f29087b;
                if (!x0Var.f29311a) {
                    if (x0Var.f29319x == 0 && x0Var.f29320y) {
                        ((Activity) x0Var.getContext()).startActivityForResult(((MediaProjectionManager) x0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        x0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 2:
                fi1 fi1Var = (fi1) this.f29087b;
                if (!fi1Var.f28876a) {
                    if (fi1Var.f28883w == 0) {
                        ((Activity) fi1Var.getContext()).startActivityForResult(((MediaProjectionManager) fi1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        fi1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 3:
                Context context = (Context) this.f29087b;
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
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f29087b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 5:
                ((pg.x) this.f29087b).dismiss();
                return;
            case 6:
                ((yl0) this.f29087b).run();
                return;
            case 7:
                ((qg.v2) this.f29087b).onBackPressed();
                return;
            case 8:
                ((sg) this.f29087b).run();
                return;
            case 9:
                ((d90) this.f29087b).performClick();
                return;
            case 10:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((rg.k1) this.f29087b).f42313t0, null, "profile", null);
                return;
            case 11:
                final tg.h0 h0Var = (tg.h0) this.f29087b;
                vg.a aVar = h0Var.Q0;
                if (!aVar.f44247a.N) {
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
                ((tg.k0) this.f29087b).dismiss();
                return;
            case 13:
                ((tg.c0) ((ug.e) this.f29087b)).f43068r.dismiss();
                return;
            case 14:
                Runnable runnable = ((xg.c) this.f29087b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ((xh.c) this.f29087b).dismiss();
                return;
            case 16:
                ((xh.c0) this.f29087b).dismiss();
                return;
            case 17:
                if (((xh.r1) this.f29087b).f46044f0.f47307f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f19352a = true;
                    R.showAsSheet(new w7(), obj);
                    return;
                }
                return;
            case 18:
                ((yh.s) this.f29087b).dismiss();
                return;
            case 19:
                ((yh.e0) this.f29087b).dismiss();
                return;
            case 20:
                yh.i0 i0Var = (yh.i0) this.f29087b;
                zf.b bVar = i0Var.E.f48896a;
                zf.b bVar2 = zf.b.f48899b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.f48898a;
                }
                i0Var.n(zf.a.i(0L, bVar2), true, false, true);
                i0Var.f47188c.setText("");
                return;
            case 21:
                ((yh.s0) this.f29087b).dismiss();
                return;
            case 22:
                ((yh.r1) this.f29087b).run();
                return;
            case 23:
                ((yh.r1) this.f29087b).run();
                return;
            case 24:
                yh.d3 d3Var = (yh.d3) this.f29087b;
                d3Var.getClass();
                new m7(d3Var.f46972b, d3Var.f46975g).show();
                return;
            case 25:
                ((x3) this.f29087b).dismiss();
                return;
            case 26:
                ((w5) this.f29087b).run();
                return;
            case 27:
                if (((k7) ((l20) this.f29087b).d).f47307f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f19352a = true;
                    R2.showAsSheet(new w7(), obj2);
                    return;
                }
                return;
            default:
                zg.c0 c0Var = (zg.c0) this.f29087b;
                if (c0Var.f48934k) {
                    c0Var.d();
                    return;
                }
                return;
        }
    }
}
