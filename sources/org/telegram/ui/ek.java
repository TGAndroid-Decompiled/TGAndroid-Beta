package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ek extends org.telegram.ui.Components.y90 {
    public boolean V;
    public final un W;

    public ek(un unVar, Context context, long j10, long j11, un unVar2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, j10, j11, unVar2, p6Var);
        this.W = unVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        un unVar = this.W;
        if (unVar.S.getVisibility() == 0 && !unVar.B3) {
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
        this.W.Rc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        un unVar = this.W;
        if (unVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                unVar.Ra(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] h12 = org.telegram.messenger.kj.h1(botInlineResult);
            ii iiVar = unVar.f42028cb;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.hu.K0(unVar, null, iiVar, str, str2, str3, str3, h12[0], h12[1], -1, unVar.O9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        un unVar = this.W;
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            zf.x0 adapter = getAdapter();
            TLRPC.User user = adapter.f55690w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f55681q0;
                if (str2 != null && str2.equals("gif")) {
                    str = org.telegram.messenger.dd.L0(2131745781, null);
                } else {
                    str = null;
                }
            }
            mkVar.setCaption(str);
            org.telegram.ui.Components.ae aeVar = unVar.Z.P1;
            if (aeVar != null) {
                if (z10) {
                    aeVar.e = true;
                    aeVar.f31864b = System.currentTimeMillis();
                    aeVar.invalidateSelf();
                    return;
                }
                aeVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        un unVar = this.W;
        if (unVar.p5 && ((getAdapter().R == null || unVar.f42194q5 || unVar.f42206r5) && unVar.h != null && getAdapter().R != null)) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            if (!d12.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.f42288xa);
                String L0 = org.telegram.messenger.dd.L0(2131689472, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131745711, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                unVar.showDialog(x1Var);
                d12.edit().putBoolean("secretbot", true).commit();
            }
        }
        unVar.Rc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            un unVar = this.W;
            org.telegram.ui.Components.tx0 tx0Var = unVar.f42202r1;
            if (!unVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            org.telegram.messenger.i0.U3(tx0Var, z11, false);
            this.V = z10;
        }
    }
}
