package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jj extends org.telegram.ui.Components.i90 {
    public boolean W;
    public final an f48367a0;

    public jj(an anVar, Context context, long j3, long j10, an anVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j3, j10, anVar2, e6Var);
        this.f48367a0 = anVar;
        this.W = true;
    }

    @Override
    public final boolean a() {
        an anVar = this.f48367a0;
        if (anVar.T.getVisibility() == 0 && !anVar.C3) {
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
        this.f48367a0.ad();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        an anVar = this.f48367a0;
        if (anVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                anVar.Za(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] g12 = org.telegram.messenger.gj.g1(botInlineResult);
            rh rhVar = anVar.f45198fb;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.bu.N0(anVar, null, rhVar, str, str2, str3, str3, g12[0], g12[1], -1, anVar.V9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        an anVar = this.f48367a0;
        qj qjVar = anVar.f45118a0;
        if (qjVar != null) {
            jg.h1 adapter = getAdapter();
            TLRPC.User user = adapter.f17147x0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f17138r0;
                if (str2 != null && str2.equals("gif")) {
                    str = org.telegram.messenger.hd.M0(2131745764, null);
                } else {
                    str = null;
                }
            }
            qjVar.setCaption(str);
            org.telegram.ui.Components.ge geVar = anVar.f45118a0.f32318x2;
            if (geVar != null) {
                if (z10) {
                    geVar.f41417e = true;
                    geVar.f41415b = System.currentTimeMillis();
                    geVar.invalidateSelf();
                    return;
                }
                geVar.f41417e = false;
            }
        }
    }

    @Override
    public final void m() {
        an anVar = this.f48367a0;
        if (anVar.f45331q5 && ((getAdapter().S == null || anVar.f45345r5 || anVar.s5) && anVar.h != null && getAdapter().S != null)) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (!e12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.Aa);
                String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131745694, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                anVar.showDialog(t1Var);
                e12.edit().putBoolean("secretbot", true).commit();
            }
        }
        anVar.ad();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.W != z10) {
            an anVar = this.f48367a0;
            org.telegram.ui.Components.rw0 rw0Var = anVar.f45355s1;
            if (!anVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.U3(rw0Var, z11, false);
            this.W = z10;
        }
    }
}
