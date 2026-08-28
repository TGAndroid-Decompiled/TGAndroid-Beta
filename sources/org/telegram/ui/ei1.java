package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class ei1 implements org.telegram.ui.ActionBar.b2, Utilities.Callback3Return, kc0, qh.l0, org.telegram.ui.Components.kt, qh.z3, androidx.car.app.utils.e, x9.a, OnFailureListener {
    public final int f37964a;
    public final Object f37965b;
    public final Object f37966c;

    public ei1(int i9, Object obj, Object obj2) {
        this.f37964a = i9;
        this.f37965b = obj;
        this.f37966c = obj2;
    }

    @Override
    public void call() {
        int i9 = CarAppNotificationBroadcastReceiver.f640a;
        ((IStartCarApp) this.f37965b).startCarApp((Intent) this.f37966c);
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ei1.d(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void e(x9.b bVar) {
        ((x9.a) this.f37965b).e(bVar);
        ((x9.a) this.f37966c).e(bVar);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f37964a) {
            case 0:
                ((d5.d) this.f37965b).accept(Boolean.TRUE);
                ((boolean[]) this.f37966c)[0] = true;
                c2Var.dismiss();
                return;
            case 1:
                org.telegram.ui.web.o.X((org.telegram.ui.web.o) this.f37965b, (HashSet) this.f37966c);
                return;
            case 2:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f37965b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(y0Var.I).getInputUser(y0Var.Q);
                ConnectionsManager.getInstance(y0Var.I).sendRequest(allowsendmessage, new bg.b0(y0Var, (String[]) this.f37966c, c2Var, 24));
                return;
            case 3:
                boolean[] zArr = (boolean[]) this.f37966c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f37965b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 4:
            default:
                zf.j0.P((zf.j0) this.f37965b, (ArrayList) this.f37966c);
                return;
            case 5:
                pf.r.Y((pf.r) this.f37965b, (TL_account.TL_businessChatLink) this.f37966c);
                return;
        }
    }

    @Override
    public org.telegram.ui.Components.x60 g(qh.d1 d1Var) {
        qh.p pVar = (qh.p) ((org.telegram.ui.Cells.e3) this.f37965b).f24287c;
        org.telegram.ui.Components.x60 x60Var = new org.telegram.ui.Components.x60(pVar, (org.telegram.ui.ActionBar.b6) this.f37966c, d1Var, false, false, true);
        pVar.D = x60Var;
        return x60Var;
    }

    @Override
    public void m1() {
        switch (this.f37964a) {
            case 8:
                ((qh.h0) this.f37965b).i();
                ((qh.g0) this.f37966c).N0();
                return;
            default:
                qh.f5 f5Var = (qh.f5) this.f37965b;
                qh.i5 i5Var = (qh.i5) this.f37966c;
                TL_iv.pageTableCell pagetablecell = i5Var.f46449b;
                if (pagetablecell != null) {
                    qh.w5.d(pagetablecell, i5Var.f46448a.getText());
                }
                qh.v2 v2Var = f5Var.A;
                if (v2Var != null && f5Var.f46834a != null) {
                    qh.o3.O1(v2Var.f46757a);
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        yf.x1 x1Var = (yf.x1) this.f37965b;
        Bitmap bitmap = (Bitmap) this.f37966c;
        x1Var.f50178x0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof ua.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && x1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new xf.o0(5, x1Var, bitmap), 2000L);
        } else {
            x1Var.f50179y0 = true;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        ((qh.l3) this.f37965b).a((String) this.f37966c, tL_inlineButtonTypeUserProfile);
    }

    public ei1(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.f37964a = 3;
        this.f37966c = zArr;
        this.f37965b = jsPromptResult;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        pf.l lVar = (pf.l) this.f37965b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        lVar.f45672w = false;
        AndroidUtilities.cancelRunOnUIThread(lVar.d);
        pf.j jVar = lVar.f45669n;
        lVar.f45673x = document;
        jVar.setSticker(document);
        ((org.telegram.ui.Cells.p8) ((View) this.f37966c)).setValueSticker(document);
        lVar.d0(true);
        return Boolean.TRUE;
    }
}
