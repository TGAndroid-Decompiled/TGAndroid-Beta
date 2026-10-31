package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s2 implements org.telegram.messenger.j20 {
    public final int f30096a = 0;
    public final long f30097b;
    public final int f30098c;
    public final Object d;
    public final Object e;
    public final Object f30099f;

    public s2(int i10, long j10, TLRPC.Photo photo, Context context, th.b bVar) {
        this.f30098c = i10;
        this.f30097b = j10;
        this.d = photo;
        this.e = context;
        this.f30099f = bVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        TLObject L0;
        TLObject L02;
        int i13;
        int i14;
        int i15 = this.f30096a;
        long j10 = this.f30097b;
        int i16 = this.f30098c;
        Object obj3 = this.f30099f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i15) {
            case 0:
                TLRPC.Photo photo = (TLRPC.Photo) obj5;
                Context context = (Context) obj4;
                th.b bVar = (th.b) obj3;
                Integer num = (Integer) obj;
                String str = (String) obj2;
                TL_account.reportProfilePhoto reportprofilephoto = new TL_account.reportProfilePhoto();
                reportprofilephoto.peer = org.telegram.messenger.vp.r1(i16).i1(j10);
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.f19812id = photo.f19817id;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputPhoto.access_hash = photo.access_hash;
                reportprofilephoto.photo_id = tL_inputPhoto;
                reportprofilephoto.message = "";
                if (num.intValue() == 0) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonSpam();
                } else if (num.intValue() == 1) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonViolence();
                } else if (num.intValue() == 2) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonChildAbuse();
                } else if (num.intValue() == 5) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPornography();
                } else if (num.intValue() == 3) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonIllegalDrugs();
                } else if (num.intValue() == 4) {
                    reportprofilephoto.reason = new TLRPC.TL_inputReportReasonPersonalDetails();
                }
                ConnectionsManager.getInstance(i16).sendRequest(reportprofilephoto, null);
                new cc(ra.a(context), bVar).E(bVar).j();
                return;
            case 1:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj5;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) obj4;
                JSONObject jSONObject = (JSONObject) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null && (bool instanceof TLRPC.TL_boolTrue)) {
                    boolean optBoolean = jSONObject.optBoolean("disconnect");
                    long j11 = this.f30097b;
                    int i17 = this.f30098c;
                    if (optBoolean) {
                        TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                        tonconnectclosesession.session_id = j11;
                        e2Var.f34448f.sendRequestTyped(tonconnectclosesession, new a3.b(1), new org.telegram.ui.Wallet.o1(e2Var, q20Var, j11, i17, 1));
                        return;
                    }
                    e2Var.e(i17, j11, q20Var);
                    return;
                }
                q20Var.a(org.telegram.ui.Wallet.e2.z(tL_error, "submitResponse"));
                return;
            case 2:
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj5;
                Runnable runnable = (Runnable) obj3;
                org.telegram.messenger.t9 t9Var = (org.telegram.messenger.t9) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (t9Var != null) {
                    int i18 = this.f30098c;
                    org.telegram.messenger.d20.i(i18);
                    long o10 = org.telegram.messenger.o5.o(t9Var.e.peer);
                    long j12 = this.f30097b;
                    if (j12 != o10 && j12 != 0 && o10 != 0) {
                        org.telegram.ui.Cells.e1 e1Var = new org.telegram.ui.Cells.e1(context2, i18, t9Var, j12, runnable);
                        if (i11 >= 0) {
                            L0 = org.telegram.messenger.vp.r1(i18).Z1(Long.valueOf(o10));
                            i12 = 0;
                        } else {
                            i12 = 0;
                            L0 = org.telegram.messenger.vp.r1(i18).L0(Long.valueOf(-o10));
                        }
                        if (i10 >= 0) {
                            L02 = org.telegram.messenger.vp.r1(i18).Z1(Long.valueOf(j12));
                        } else {
                            L02 = org.telegram.messenger.vp.r1(i18).L0(Long.valueOf(-j12));
                        }
                        LinearLayout f7 = org.telegram.messenger.m5.f(context2, 1);
                        f7.addView(new rh.b4(context2, L0, L02), w7.b6.t(-1, -2, 48, 0, -4, 0, 0));
                        TextView textView = new TextView(context2);
                        org.telegram.messenger.zs.i(textView);
                        textView.setText(org.telegram.messenger.cd.L0(2131750314, null));
                        int i19 = org.telegram.ui.ActionBar.t6.f21037j5;
                        org.telegram.messenger.m5.m(textView, i19, p6Var, 1, 20.0f);
                        if (org.telegram.messenger.cd.X) {
                            i13 = 5;
                        } else {
                            i13 = 3;
                        }
                        textView.setGravity(i13);
                        if (org.telegram.messenger.cd.X) {
                            i14 = 5;
                        } else {
                            i14 = 3;
                        }
                        f7.addView(textView, w7.b6.d(-2, -2.0f, i14 | 48, 24.0f, 19.0f, 24.0f, 2.0f));
                        TextView textView2 = new TextView(context2);
                        org.telegram.ui.ActionBar.a7.V(textView2, i19, p6Var);
                        textView2.setTextSize(1, 16.0f);
                        String t10 = org.telegram.messenger.o5.t(o10);
                        String t11 = org.telegram.messenger.o5.t(j12);
                        Object[] objArr = new Object[2];
                        objArr[i12] = t10;
                        objArr[1] = t11;
                        org.telegram.messenger.m5.q(null, null, 2131750313, objArr, textView2);
                        f7.addView(textView2, w7.b6.t(-1, -2, 48, 24, 4, 24, 4));
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i12, context2, p6Var);
                        alertDialog$Builder.o(f7);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new mg.l(e1Var, 20));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.f20134a.show();
                        return;
                    } else if (t9Var.e.bid_date > 0 && !t9Var.f()) {
                        ph.m mVar = new ph.m(context2, p6Var, null, t9Var);
                        mVar.f45218f2 = runnable;
                        mVar.show();
                        return;
                    } else {
                        new ph.w(context2, p6Var, j12, t9Var.d, runnable).show();
                        return;
                    }
                }
                return;
            default:
                qh.m0 m0Var = (qh.m0) obj5;
                qh.l0 l0Var = (qh.l0) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (m0Var.f45695x == ((int[]) obj4)[0]) {
                    m0Var.f45695x = 0;
                }
                if (l0Var != null && qh.m0.h(i16).get(j10) == l0Var) {
                    if (tL_error3 == null) {
                        l0Var.f45684b = SystemClock.elapsedRealtime();
                    } else {
                        qh.m0.h(i16).remove(j10);
                    }
                }
                if (tL_error3 != null) {
                    org.telegram.messenger.f8.d("QrShare: setShareTheme " + tL_error3.text);
                    if (!m0Var.E) {
                        qh.x0 x0Var = m0Var.f45688b;
                        x0Var.getClass();
                        x0Var.d1(2131232435, org.telegram.messenger.cd.L0(2131751106, null), null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public s2(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, long j10, Runnable runnable) {
        this.e = context;
        this.d = p6Var;
        this.f30098c = i10;
        this.f30097b = j10;
        this.f30099f = runnable;
    }

    public s2(org.telegram.ui.Wallet.e2 e2Var, org.telegram.messenger.q20 q20Var, JSONObject jSONObject, long j10, int i10) {
        this.d = e2Var;
        this.e = q20Var;
        this.f30099f = jSONObject;
        this.f30097b = j10;
        this.f30098c = i10;
    }

    public s2(qh.m0 m0Var, int[] iArr, qh.l0 l0Var, int i10, long j10) {
        this.d = m0Var;
        this.e = iArr;
        this.f30099f = l0Var;
        this.f30098c = i10;
        this.f30097b = j10;
    }
}
