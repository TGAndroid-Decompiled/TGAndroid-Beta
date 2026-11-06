package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jj extends org.telegram.ui.Components.g90 {
    public boolean V;
    public final an W;

    public jj(an anVar, Context context, long j3, long j10, an anVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, j10, anVar2, f6Var);
        this.W = anVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        an anVar = this.W;
        if (anVar.S.getVisibility() == 0 && !anVar.B3) {
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
        this.W.Wc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        an anVar = this.W;
        if (anVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                anVar.Wa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] h12 = org.telegram.messenger.ij.h1(botInlineResult);
            rh rhVar = anVar.f43757cb;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.vt.N0(anVar, null, rhVar, str, str2, str3, str3, h12[0], h12[1], -1, anVar.T9());
        }
    }

    @Override
    public final void l(boolean z9) {
        String str;
        an anVar = this.W;
        qj qjVar = anVar.Z;
        if (qjVar != null) {
            jg.i1 adapter = getAdapter();
            TLRPC.User user = adapter.f16799w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f16790q0;
                if (str2 != null && str2.equals("gif")) {
                    str = org.telegram.messenger.hd.M0(2131745765, null);
                } else {
                    str = null;
                }
            }
            qjVar.setCaption(str);
            org.telegram.ui.Components.fe feVar = anVar.Z.P1;
            if (feVar != null) {
                if (z9) {
                    feVar.f36639e = true;
                    feVar.f36637b = System.currentTimeMillis();
                    feVar.invalidateSelf();
                    return;
                }
                feVar.f36639e = false;
            }
        }
    }

    @Override
    public final void m() {
        an anVar = this.W;
        if (anVar.f43914p5 && ((getAdapter().R == null || anVar.f43927q5 || anVar.f43941r5) && anVar.h != null && getAdapter().R != null)) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.f44023xa);
                String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131745695, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                anVar.showDialog(u1Var);
                e12.edit().putBoolean("secretbot", true).commit();
            }
        }
        anVar.Wc();
    }

    @Override
    public final void n(boolean z9) {
        boolean z10;
        if (this.V != z9) {
            an anVar = this.W;
            org.telegram.ui.Components.ow0 ow0Var = anVar.f43937r1;
            if (!anVar.isInPreviewMode() && z9) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.V3(ow0Var, z10, false);
            this.V = z9;
        }
    }
}
