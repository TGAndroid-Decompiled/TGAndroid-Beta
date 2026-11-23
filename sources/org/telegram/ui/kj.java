package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kj extends org.telegram.ui.Components.v90 {
    public boolean W;
    public final bn f49331a0;

    public kj(bn bnVar, Context context, long j3, long j10, bn bnVar2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, j3, j10, bnVar2, h6Var);
        this.f49331a0 = bnVar;
        this.W = true;
    }

    @Override
    public final boolean a() {
        bn bnVar = this.f49331a0;
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
        this.f49331a0.ad();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        bn bnVar = this.f49331a0;
        if (bnVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                bnVar.Za(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] g12 = org.telegram.messenger.gj.g1(botInlineResult);
            rh rhVar = bnVar.f46043gb;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.iu.O0(bnVar, null, rhVar, str, str2, str3, str3, g12[0], g12[1], -1, bnVar.V9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        bn bnVar = this.f49331a0;
        rj rjVar = bnVar.f45950a0;
        if (rjVar != null) {
            jg.h1 adapter = getAdapter();
            TLRPC.User user = adapter.f17558x0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f17549r0;
                if (str2 != null && str2.equals("gif")) {
                    str = org.telegram.messenger.hd.N0(2131745568, null);
                } else {
                    str = null;
                }
            }
            rjVar.setCaption(str);
            org.telegram.ui.Components.qe qeVar = bnVar.f45950a0.F2;
            if (qeVar != null) {
                if (z10) {
                    qeVar.f35304e = true;
                    qeVar.f35302b = System.currentTimeMillis();
                    qeVar.invalidateSelf();
                    return;
                }
                qeVar.f35304e = false;
            }
        }
    }

    @Override
    public final void m() {
        bn bnVar = this.f49331a0;
        if (bnVar.f46178r5 && ((getAdapter().S == null || bnVar.s5 || bnVar.f46203t5) && bnVar.h != null && getAdapter().S != null)) {
            SharedPreferences g12 = org.telegram.messenger.np.g1();
            if (!g12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.Ba);
                String N0 = org.telegram.messenger.hd.N0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131745498, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                bnVar.showDialog(t1Var);
                g12.edit().putBoolean("secretbot", true).commit();
            }
        }
        bnVar.ad();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.W != z10) {
            bn bnVar = this.f49331a0;
            org.telegram.ui.Components.ax0 ax0Var = bnVar.f46188s1;
            if (!bnVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.T3(ax0Var, z11, false);
            this.W = z10;
        }
    }
}
