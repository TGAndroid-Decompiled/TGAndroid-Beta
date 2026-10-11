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
import org.telegram.ui.ai0;
import org.telegram.ui.l20;
import org.telegram.ui.ni1;
import org.telegram.ui.sg;
import yh.d7;
import yh.f7;
import yh.p7;
import yh.q5;
import yh.r3;
public final class p implements View.OnClickListener {
    public final int f32238a;
    public final Object f32239b;

    public p(Object obj, int i10) {
        this.f32238a = i10;
        this.f32239b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.m2 R;
        org.telegram.ui.ActionBar.m2 R2;
        switch (this.f32238a) {
            case 0:
                v vVar = (v) this.f32239b;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                vVar.N.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                return;
            case 1:
                y0 y0Var = (y0) this.f32239b;
                if (!y0Var.f32481a) {
                    if (y0Var.f32490x == 0 && y0Var.f32491y) {
                        ((Activity) y0Var.getContext()).startActivityForResult(((MediaProjectionManager) y0Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        y0Var.b(false, true);
                        return;
                    }
                }
                return;
            case 2:
                ni1 ni1Var = (ni1) this.f32239b;
                if (!ni1Var.f32022a) {
                    if (ni1Var.f32030w == 0) {
                        ((Activity) ni1Var.getContext()).startActivityForResult(((MediaProjectionManager) ni1Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        ni1Var.a(false, true);
                        return;
                    }
                }
                return;
            case 3:
                Context context = (Context) this.f32239b;
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
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f32239b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getContext());
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.web.a(kVar));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 5:
                ((pg.x) this.f32239b).dismiss();
                return;
            case 6:
                ((ai0) this.f32239b).run();
                return;
            case 7:
                ((qg.t2) this.f32239b).onBackPressed();
                return;
            case 8:
                ((sg) this.f32239b).run();
                return;
            case 9:
                ((ea0) this.f32239b).performClick();
                return;
            case 10:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((rg.l1) this.f32239b).f47463t0, null, "profile", null);
                return;
            case 11:
                final tg.f0 f0Var = (tg.f0) this.f32239b;
                vg.a aVar = f0Var.Q0;
                if (!aVar.f49684a.N) {
                    aVar.b(true);
                    String str = f0Var.R0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    f0 f0Var2 = f0Var;
                                    f0Var2.Q0.b(false);
                                    f0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new d0(f0Var2, 1), 200L);
                                    return;
                                default:
                                    f0.d0(f0Var, (TLRPC.TL_error) obj);
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
                                    f0 f0Var2 = f0Var;
                                    f0Var2.Q0.b(false);
                                    f0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new d0(f0Var2, 1), 200L);
                                    return;
                                default:
                                    f0.d0(f0Var, (TLRPC.TL_error) obj);
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
                ((tg.i0) this.f32239b).dismiss();
                return;
            case 13:
                ((tg.a0) ((ug.e) this.f32239b)).f48390r.dismiss();
                return;
            case 14:
                Runnable runnable = ((xg.c) this.f32239b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                ((xh.d) this.f32239b).dismiss();
                return;
            case 16:
                ((xh.e0) this.f32239b).dismiss();
                return;
            case 17:
                if (((xh.r1) this.f32239b).f51605f0.f52524f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f21349a = true;
                    R.showAsSheet(new p7(), obj);
                    return;
                }
                return;
            case 18:
                ((yh.s) this.f32239b).dismiss();
                return;
            case 19:
                ((yh.c0) this.f32239b).dismiss();
                return;
            case 20:
                yh.h0 h0Var = (yh.h0) this.f32239b;
                zf.b bVar = h0Var.E.f54562a;
                zf.b bVar2 = zf.b.f54565b;
                if (bVar == bVar2) {
                    bVar2 = zf.b.f54564a;
                }
                h0Var.p(zf.a.i(0L, bVar2), true, false, true);
                h0Var.f52725c.setText("");
                return;
            case 21:
                ((yh.r0) this.f32239b).dismiss();
                return;
            case 22:
                ((yh.p1) this.f32239b).run();
                return;
            case 23:
                ((yh.p1) this.f32239b).run();
                return;
            case 24:
                yh.y2 y2Var = (yh.y2) this.f32239b;
                y2Var.getClass();
                new f7(y2Var.f53531b, y2Var.f53535g).show();
                return;
            case 25:
                ((r3) this.f32239b).dismiss();
                return;
            case 26:
                ((q5) this.f32239b).run();
                return;
            case 27:
                if (((d7) ((l20) this.f32239b).d).f52524f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f21349a = true;
                    R2.showAsSheet(new p7(), obj2);
                    return;
                }
                return;
            default:
                zg.a0 a0Var = (zg.a0) this.f32239b;
                if (a0Var.f54578k) {
                    a0Var.d();
                    return;
                }
                return;
        }
    }
}
