package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kj extends org.telegram.ui.Components.t90 {
    public boolean W;
    public final bn f49280a0;

    public kj(bn bnVar, Context context, long j3, long j10, bn bnVar2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, j3, j10, bnVar2, i6Var);
        this.f49280a0 = bnVar;
        this.W = true;
    }

    @Override
    public final boolean a() {
        bn bnVar = this.f49280a0;
        if (bnVar.T.getVisibility() == 0 && !bnVar.C3) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void j() {
        this.f49280a0.ad();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        bn bnVar = this.f49280a0;
        if (bnVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                bnVar.Za(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] g12 = org.telegram.messenger.fj.g1(botInlineResult);
            qh qhVar = bnVar.f46025gb;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.gu.O0(bnVar, null, qhVar, str, str2, str3, str3, g12[0], g12[1], -1, bnVar.V9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        bn bnVar = this.f49280a0;
        rj rjVar = bnVar.f45932a0;
        if (rjVar != null) {
            jg.h1 adapter = getAdapter();
            TLRPC.User user = adapter.f17533x0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f17524r0;
                if (str2 != null && str2.equals("gif")) {
                    str = org.telegram.messenger.gd.M0(2131745569, null);
                } else {
                    str = null;
                }
            }
            rjVar.setCaption(str);
            org.telegram.ui.Components.qe qeVar = bnVar.f45932a0.D2;
            if (qeVar != null) {
                if (z10) {
                    qeVar.f34484e = true;
                    qeVar.f34482b = System.currentTimeMillis();
                    qeVar.invalidateSelf();
                    return;
                }
                qeVar.f34484e = false;
            }
        }
    }

    @Override
    public final void m() {
        bn bnVar = this.f49280a0;
        if (bnVar.f46160r5 && ((getAdapter().S == null || bnVar.s5 || bnVar.f46185t5) && bnVar.h != null && getAdapter().S != null)) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                String M0 = org.telegram.messenger.gd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131745499, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                bnVar.showDialog(u1Var);
                g12.edit().putBoolean("secretbot", true).commit();
            }
        }
        bnVar.ad();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.W != z10) {
            bn bnVar = this.f49280a0;
            org.telegram.ui.Components.yw0 yw0Var = bnVar.f46170s1;
            if (!bnVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.T3(yw0Var, z11, false);
            this.W = z10;
        }
    }
}
