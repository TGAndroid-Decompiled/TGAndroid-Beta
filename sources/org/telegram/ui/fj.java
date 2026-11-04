package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fj extends org.telegram.ui.Components.c90 {
    public boolean W;
    public final wm f45291a0;

    public fj(wm wmVar, Context context, long j10, long j11, wm wmVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, j10, j11, wmVar2, e6Var);
        this.f45291a0 = wmVar;
        this.W = true;
    }

    @Override
    public final boolean a() {
        wm wmVar = this.f45291a0;
        if (wmVar.T.getVisibility() == 0 && !wmVar.C3) {
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
        this.f45291a0.Wc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        wm wmVar = this.f45291a0;
        if (wmVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                wmVar.Wa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] h12 = org.telegram.messenger.zi.h1(botInlineResult);
            nh nhVar = wmVar.f51289db;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.ut.K0(wmVar, null, nhVar, str, str2, str3, str3, h12[0], h12[1], -1, wmVar.T9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        wm wmVar = this.f45291a0;
        mj mjVar = wmVar.f51237a0;
        if (mjVar != null) {
            kg.e1 adapter = getAdapter();
            TLRPC.User user = adapter.f17020x0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f17011r0;
                if (str2 != null && str2.equals("gif")) {
                    str = org.telegram.messenger.bd.M0(2131745774, null);
                } else {
                    str = null;
                }
            }
            mjVar.setCaption(str);
            org.telegram.ui.Components.de deVar = wmVar.f51237a0.Q1;
            if (deVar != null) {
                if (z10) {
                    deVar.f36918e = true;
                    deVar.f36916b = System.currentTimeMillis();
                    deVar.invalidateSelf();
                    return;
                }
                deVar.f36918e = false;
            }
        }
    }

    @Override
    public final void m() {
        wm wmVar = this.f45291a0;
        if (wmVar.f51450q5 && ((getAdapter().S == null || wmVar.r5 || wmVar.f51476s5) && wmVar.h != null && getAdapter().S != null)) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (!e12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.f51557ya);
                String M0 = org.telegram.messenger.bd.M0(2131689472, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131745704, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                wmVar.showDialog(s1Var);
                e12.edit().putBoolean("secretbot", true).commit();
            }
        }
        wmVar.Wc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.W != z10) {
            wm wmVar = this.f45291a0;
            org.telegram.ui.Components.ow0 ow0Var = wmVar.f51472s1;
            if (!wmVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.g0.V3(ow0Var, z11, false);
            this.W = z10;
        }
    }
}
