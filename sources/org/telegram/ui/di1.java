package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.OnFailureListener;
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

public final class di1 implements org.telegram.ui.ActionBar.a2, Utilities.Callback3Return, oc0, rh.l0, org.telegram.ui.Components.jt, rh.a4, androidx.car.app.utils.d, y9.a, OnFailureListener {

    public final int f37411a;

    public final Object f37412b;

    public final Object f37413c;

    public di1(int i10, Object obj, Object obj2) {
        this.f37411a = i10;
        this.f37412b = obj;
        this.f37413c = obj2;
    }

    @Override
    public void b(y9.b bVar) {
        y9.a aVar = (y9.a) this.f37412b;
        y9.a aVar2 = (y9.a) this.f37413c;
        aVar.b(bVar);
        aVar2.b(bVar);
    }

    @Override
    public Object call() {
        IStartCarApp iStartCarApp = (IStartCarApp) this.f37412b;
        Intent intent = (Intent) this.f37413c;
        int i10 = CarAppNotificationBroadcastReceiver.f1144a;
        iStartCarApp.startCarApp(intent);
        return null;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        String str;
        qf.t0 t0Var;
        qf.w0 w0Var = (qf.w0) this.f37412b;
        tc0 tc0Var = (tc0) this.f37413c;
        w0Var.f46479x = messageMedia.geo;
        if (TextUtils.isEmpty(w0Var.f46480y)) {
            hc0 hc0Var = tc0Var.P;
            if (!TextUtils.isEmpty(hc0Var != null ? hc0Var.N : null)) {
                w0Var.A = true;
                hc0 hc0Var2 = tc0Var.P;
                if (hc0Var2 != null) {
                }
                w0Var.f46480y = str;
                if (str == null) {
                    w0Var.f46480y = "";
                }
                t0Var = w0Var.f46474f;
                if (t0Var != null) {
                    w0Var.d = true;
                    t0Var.setText(w0Var.f46480y);
                    qf.t0 t0Var2 = w0Var.f46474f;
                    t0Var2.setSelection(t0Var2.getText().length());
                    w0Var.d = false;
                }
            } else if (w0Var.A) {
                w0Var.A = true;
                hc0 hc0Var3 = tc0Var.P;
                if (hc0Var3 != null) {
                }
                w0Var.f46480y = str;
                if (str == null) {
                    w0Var.f46480y = "";
                }
                t0Var = w0Var.f46474f;
                if (t0Var != null) {
                    w0Var.d = true;
                    t0Var.setText(w0Var.f46480y);
                    qf.t0 t0Var3 = w0Var.f46474f;
                    t0Var3.setSelection(t0Var3.getText().length());
                    w0Var.d = false;
                }
            }
        } else if (w0Var.A) {
            w0Var.A = true;
            hc0 hc0Var4 = tc0Var.P;
            str = hc0Var4 != null ? hc0Var4.N : null;
            w0Var.f46480y = str;
            if (str == null) {
                w0Var.f46480y = "";
            }
            t0Var = w0Var.f46474f;
            if (t0Var != null) {
                w0Var.d = true;
                t0Var.setText(w0Var.f46480y);
                qf.t0 t0Var4 = w0Var.f46474f;
                t0Var4.setSelection(t0Var4.getText().length());
                w0Var.d = false;
            }
        }
        w0Var.Y();
        w0Var.f46470a.U2.N(true);
        w0Var.U(true);
    }

    @Override
    public org.telegram.ui.Components.b70 e(rh.d1 d1Var) {
        i6 i6Var = (i6) this.f37412b;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f37413c;
        rh.p pVar = (rh.p) i6Var.f38985c;
        org.telegram.ui.Components.b70 b70Var = new org.telegram.ui.Components.b70(pVar, c6Var, d1Var, false, false, true);
        pVar.D = b70Var;
        return b70Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37411a) {
            case 0:
                d5.d dVar = (d5.d) this.f37412b;
                boolean[] zArr = (boolean[]) this.f37413c;
                dVar.accept(Boolean.TRUE);
                zArr[0] = true;
                b2Var.dismiss();
                break;
            case 1:
                org.telegram.ui.web.p.Y((org.telegram.ui.web.p) this.f37412b, (HashSet) this.f37413c);
                break;
            case 2:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f37412b;
                String[] strArr = (String[]) this.f37413c;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(z0Var.I).getInputUser(z0Var.Q);
                ConnectionsManager.getInstance(z0Var.I).sendRequest(allowsendmessage, new cg.y(z0Var, strArr, b2Var, 24));
                break;
            case 3:
                boolean[] zArr2 = (boolean[]) this.f37413c;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f37412b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    jsPromptResult.cancel();
                }
                break;
            case 4:
                pf.u0 u0Var = (pf.u0) this.f37412b;
                boolean[] zArr3 = (boolean[]) this.f37413c;
                u0Var.getClass();
                zArr3[0] = true;
                u0Var.Q();
                break;
            default:
                qf.s sVar = (qf.s) this.f37412b;
                qf.v.d(sVar.currentAccount).a(sVar, ((TL_account.TL_businessChatLink) this.f37413c).link);
                break;
        }
    }

    @Override
    public void k1() {
        switch (this.f37411a) {
            case 9:
                rh.h0 h0Var = (rh.h0) this.f37412b;
                rh.g0 g0Var = (rh.g0) this.f37413c;
                h0Var.i();
                g0Var.X0();
                break;
            default:
                rh.g5 g5Var = (rh.g5) this.f37412b;
                rh.j5 j5Var = (rh.j5) this.f37413c;
                TL_iv.pageTableCell pagetablecell = j5Var.f47227b;
                if (pagetablecell != null) {
                    rh.x5.d(pagetablecell, j5Var.f47226a.getText());
                }
                rh.w2 w2Var = g5Var.A;
                if (w2Var != null && g5Var.f47594a != null) {
                    rh.p3.O1(w2Var.f47536a);
                    break;
                }
                break;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        zf.x1 x1Var = (zf.x1) this.f37412b;
        Bitmap bitmap = (Bitmap) this.f37413c;
        x1Var.f50773x0 = false;
        FileLog.e(exc);
        if (Build.VERSION.SDK_INT >= 24 && (exc instanceof va.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && x1Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new rh.o2(11, x1Var, bitmap), 2000L);
        } else {
            x1Var.f50774y0 = true;
        }
    }

    @Override
    public void run(long j10) {
        rh.m3 m3Var = (rh.m3) this.f37412b;
        String str = (String) this.f37413c;
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        m3Var.a(str, tL_inlineButtonTypeUserProfile);
    }

    public di1(boolean[] zArr, JsPromptResult jsPromptResult) {
        this.f37411a = 3;
        this.f37413c = zArr;
        this.f37412b = jsPromptResult;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        qf.m mVar = (qf.m) this.f37412b;
        View view = (View) this.f37413c;
        TLRPC.Document document = (TLRPC.Document) obj2;
        mVar.f46356w = false;
        AndroidUtilities.cancelRunOnUIThread(mVar.d);
        qf.k kVar = mVar.f46353n;
        mVar.f46357x = document;
        kVar.setSticker(document);
        ((org.telegram.ui.Cells.l8) view).setValueSticker(document);
        mVar.e0(true);
        return Boolean.TRUE;
    }
}
