package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
public final class fi1 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.bl0, Utilities.Callback3Return, mc0, th.l0, org.telegram.ui.Components.qt, th.a4, androidx.car.app.utils.e {
    public final int f38189a;
    public final Object f38190b;
    public final Object f38191c;

    public fi1(int i10, Object obj, Object obj2) {
        this.f38189a = i10;
        this.f38190b = obj;
        this.f38191c = obj2;
    }

    @Override
    public org.telegram.ui.Components.j70 b(th.d1 d1Var) {
        th.p pVar = (th.p) ((oc.i) this.f38190b).f19484c;
        org.telegram.ui.Components.j70 j70Var = new org.telegram.ui.Components.j70(pVar, (org.telegram.ui.ActionBar.c6) this.f38191c, d1Var, false, false, true);
        pVar.D = j70Var;
        return j70Var;
    }

    @Override
    public boolean c(int i10, View view) {
        return ph.d3.B0((ph.d3) this.f38190b, (Context) this.f38191c, view, i10);
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f1134a;
        ((IStartCarApp) this.f38190b).startCarApp((Intent) this.f38191c);
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fi1.d(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void e1() {
        switch (this.f38189a) {
            case 11:
                ((th.h0) this.f38190b).i();
                ((th.g0) this.f38191c).l0();
                return;
            default:
                th.g5 g5Var = (th.g5) this.f38190b;
                th.j5 j5Var = (th.j5) this.f38191c;
                TL_iv.pageTableCell pagetablecell = j5Var.f48527b;
                if (pagetablecell != null) {
                    th.x5.d(pagetablecell, j5Var.f48526a.getText());
                }
                th.w2 w2Var = g5Var.A;
                if (w2Var != null && g5Var.f48892a != null) {
                    th.p3.O1(w2Var.f48834a);
                    return;
                }
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f38189a) {
            case 0:
                ((f5.d) this.f38190b).accept(Boolean.TRUE);
                ((boolean[]) this.f38191c)[0] = true;
                c2Var.dismiss();
                return;
            case 1:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.f38190b, (HashSet) this.f38191c);
                return;
            case 2:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f38190b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(z0Var.I).getInputUser(z0Var.Q);
                ConnectionsManager.getInstance(z0Var.I).sendRequest(allowsendmessage, new eg.z(z0Var, (String[]) this.f38191c, c2Var, 22));
                return;
            case 3:
                boolean[] zArr = (boolean[]) this.f38191c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f38190b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 4:
                ph.d3.y0((ph.d3) this.f38190b, (TL_payments.connectedBotStarRef) this.f38191c);
                return;
            case 5:
            default:
                sf.r.Z((sf.r) this.f38190b, (TL_account.TL_businessChatLink) this.f38191c);
                return;
            case 6:
                rf.v0 v0Var = (rf.v0) this.f38190b;
                v0Var.getClass();
                ((boolean[]) this.f38191c)[0] = true;
                v0Var.Q();
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        ((th.m3) this.f38190b).a((String) this.f38191c, tL_inlineButtonTypeUserProfile);
    }

    public fi1(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.f38189a = 3;
        this.f38191c = zArr;
        this.f38190b = jsPromptResult;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        sf.l lVar = (sf.l) this.f38190b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        lVar.f47846w = false;
        AndroidUtilities.cancelRunOnUIThread(lVar.d);
        sf.j jVar = lVar.f47843n;
        lVar.f47847x = document;
        jVar.setSticker(document);
        ((org.telegram.ui.Cells.m8) ((View) this.f38191c)).setValueSticker(document);
        lVar.e0(true);
        return Boolean.TRUE;
    }
}
