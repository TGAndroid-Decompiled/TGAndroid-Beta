package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class lj extends org.telegram.ui.Components.h90 {
    public boolean V;
    public final cn W;

    public lj(cn cnVar, Context context, long j3, long j10, cn cnVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, j3, j10, cnVar2, g6Var);
        this.W = cnVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        cn cnVar = this.W;
        if (cnVar.S.getVisibility() == 0 && !cnVar.B3) {
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
        this.W.Zc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        cn cnVar = this.W;
        if (cnVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                cnVar.Ya(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] g12 = org.telegram.messenger.ij.g1(botInlineResult);
            th thVar = cnVar.eb;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.wt.N0(cnVar, null, thVar, str, str2, str3, str3, g12[0], g12[1], -1, cnVar.U9());
        }
    }

    @Override
    public final void l(boolean z9) {
        String str;
        cn cnVar = this.W;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            jg.i1 adapter = getAdapter();
            TLRPC.User user = adapter.f16802w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f16793q0;
                if (str2 != null && str2.equals("gif")) {
                    str = org.telegram.messenger.id.M0(2131745764, null);
                } else {
                    str = null;
                }
            }
            sjVar.setCaption(str);
            org.telegram.ui.Components.fe feVar = cnVar.Z.P1;
            if (feVar != null) {
                if (z9) {
                    feVar.f36765e = true;
                    feVar.f36763b = System.currentTimeMillis();
                    feVar.invalidateSelf();
                    return;
                }
                feVar.f36765e = false;
            }
        }
    }

    @Override
    public final void m() {
        cn cnVar = this.W;
        if (cnVar.f44576p5 && ((getAdapter().R == null || cnVar.f44589q5 || cnVar.f44603r5) && cnVar.h != null && getAdapter().R != null)) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.f44709za);
                String M0 = org.telegram.messenger.id.M0(2131689472, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131745694, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                cnVar.showDialog(u1Var);
                e12.edit().putBoolean("secretbot", true).commit();
            }
        }
        cnVar.Zc();
    }

    @Override
    public final void n(boolean z9) {
        boolean z10;
        if (this.V != z9) {
            cn cnVar = this.W;
            org.telegram.ui.Components.pw0 pw0Var = cnVar.f44599r1;
            if (!cnVar.isInPreviewMode() && z9) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.messenger.g0.V3(pw0Var, z10, false);
            this.V = z9;
        }
    }
}
