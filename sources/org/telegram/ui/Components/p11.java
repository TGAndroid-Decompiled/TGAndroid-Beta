package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
public final class p11 implements Runnable {
    public final int f37029a;
    public final Object f37030b;
    public final Object f37031c;

    public p11(int i3, Object obj, Object obj2) {
        this.f37029a = i3;
        this.f37030b = obj;
        this.f37031c = obj2;
    }

    @Override
    public final void run() {
        int i3;
        String str;
        tj0 tj0Var;
        int i10;
        int i11 = this.f37029a;
        long j10 = 0;
        ArrayList arrayList = null;
        int i12 = 0;
        Object obj = this.f37031c;
        Object obj2 = this.f37030b;
        switch (i11) {
            case 0:
                f21 f21Var = (f21) obj2;
                TLObject tLObject = (TLObject) obj;
                org.telegram.messenger.st stVar = f21Var.f33671q1;
                f21Var.f33666j1 = null;
                if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        f21Var.M1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (stVar != null) {
                            stVar.set(richMessage);
                            f21Var.F1.D(stVar);
                            return;
                        }
                        return;
                    }
                }
                if (f21Var.M1) {
                    f21Var.dismiss();
                    org.telegram.messenger.hs.e().k(292, 1, org.telegram.messenger.bd.M0(2131743956, null));
                    return;
                }
                org.telegram.messenger.k5.p(null, 2131743956, new fc((FrameLayout) f21Var.f28586b, f21Var.J0), null);
                b21 b21Var = f21Var.f33675u1.f32920e;
                String str2 = f21Var.f33674t1;
                f21Var.f33673s1 = str2;
                b21Var.setText(f21.O0(str2, null, null));
                return;
            case 1:
                org.telegram.ui.xj xjVar = (org.telegram.ui.xj) obj2;
                ((org.telegram.ui.ActionBar.f1) obj).d(true);
                v21.a(xjVar.getContext(), xjVar.d);
                return;
            case 2:
                ((org.telegram.messenger.x00) obj).J(((org.telegram.ui.xj) obj2).f38973b, false, false);
                return;
            case 3:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.f31686s.presentFragment(new org.telegram.ui.dl0((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                int i13 = UndoView.f31669j0;
                undoView.getClass();
                return;
            case 4:
                ((r31) obj2).D.onClick((org.telegram.ui.Cells.p8) obj);
                return;
            case 5:
                m51 m51Var = (m51) obj2;
                d2.x0 x0Var = (d2.x0) obj;
                Throwable cause = x0Var.getCause();
                if ((cause instanceof t2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.a8.g(x0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.hp.e1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = m51.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = m51Var.O;
                    if (arrayList2 != null) {
                        int i14 = 0;
                        while (i14 < arrayList2.size()) {
                            j51 j51Var = (j51) arrayList2.get(i14);
                            int i15 = 0;
                            while (true) {
                                ArrayList arrayList3 = j51Var.d;
                                if (i15 < arrayList3.size()) {
                                    l51 l51Var = (l51) arrayList3.get(i15);
                                    if (!TextUtils.isEmpty(l51Var.f35613m) && !m51.D0(l51Var.f35613m)) {
                                        arrayList3.remove(i15);
                                        i15--;
                                    }
                                    i15++;
                                } else {
                                    if (arrayList3.isEmpty()) {
                                        arrayList2.remove(i14);
                                        i14--;
                                    }
                                    i14++;
                                }
                            }
                        }
                        arrayList = arrayList2;
                    }
                    m51Var.O = arrayList;
                    if (arrayList != null) {
                        m51Var.k0(arrayList, m51Var.P);
                        return;
                    }
                    return;
                }
                TextureView textureView = m51Var.f36017n;
                if (textureView != null && ((!m51Var.F && (cause instanceof t2.p)) || (cause instanceof c3.v))) {
                    m51Var.F = true;
                    if (m51Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(m51Var.f36017n);
                            viewGroup.removeView(m51Var.f36017n);
                            viewGroup.addView(m51Var.f36017n, indexOfChild);
                        }
                        org.telegram.messenger.q5 q5Var = m51Var.f36004b;
                        if (q5Var != null) {
                            q5Var.postRunnable(new f51(m51Var, 0));
                            return;
                        }
                        k2.i0 i0Var = m51Var.d;
                        TextureView textureView2 = m51Var.f36017n;
                        i0Var.F1();
                        if (textureView2 != null && textureView2 == i0Var.X) {
                            i0Var.F1();
                            i0Var.s1();
                            i0Var.x1(null);
                            i0Var.q1(0, 0);
                        }
                        m51Var.d.z1(m51Var.f36017n);
                        ArrayList arrayList4 = m51Var.O;
                        if (arrayList4 != null) {
                            m51Var.k0(arrayList4, m51Var.P);
                        } else if (m51Var.V) {
                            m51Var.l0(m51Var.R, m51Var.T, m51Var.S, m51Var.U);
                        } else {
                            m51Var.j0(m51Var.R, m51Var.T);
                        }
                        m51Var.h0();
                        return;
                    }
                    return;
                }
                m51Var.K.onError(m51Var, x0Var);
                return;
            case 6:
                ((m51) ((mi.c6) obj2).f19553f).L.r(true, (float[]) obj);
                return;
            case 7:
                s51 s51Var = (s51) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (s51Var.f37930x != null) {
                        Bitmap bitmap2 = s51Var.f37929w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        s51Var.f37929w = s51Var.f37930x;
                    }
                    s51Var.f37930x = bitmap;
                    Bitmap bitmap3 = s51Var.f37930x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    s51Var.H = bitmapShader;
                    bitmapShader.setLocalMatrix(s51Var.M);
                    s51Var.K.setShader(s51Var.H);
                    s51Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i3 = (int) (L / width);
                    } else {
                        i3 = L;
                        L = (int) (L * width);
                    }
                    ViewGroup.LayoutParams layoutParams = s51Var.getLayoutParams();
                    if (s51Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i3) {
                        layoutParams.width = L;
                        layoutParams.height = i3;
                        s51Var.setVisibility(0);
                        s51Var.requestLayout();
                    }
                }
                s51Var.f37922f = null;
                return;
            case 8:
                final c71 c71Var = (c71) obj2;
                c71Var.f32589e.f32998b.evaluateJavascript((String) obj, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj3) {
                        String str3 = (String) obj3;
                        c71 c71Var2 = c71.this;
                        String[] strArr = c71Var2.f32588c;
                        String str4 = strArr[0];
                        String str5 = c71Var2.d;
                        strArr[0] = str4.replace(str5, "/signature/" + str3.substring(1, str3.length() - 1));
                        c71Var2.f32587b.countDown();
                    }
                });
                return;
            case 9:
                ((org.telegram.ui.Components.voip.j) obj2).f39413a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 10:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap hashMap2 = rVar.G.h;
                org.telegram.messenger.s3 s3Var = rVar.f39577x;
                boolean z10 = s3Var.f25271b;
                TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f25270a;
                if (z10) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 11:
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) obj;
                ((org.telegram.ui.Components.voip.x) obj2).getClass();
                rVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.p(rVar2, 4)).setDuration(150L).start();
                return;
            case 12:
                tj0 tj0Var2 = (tj0) obj2;
                if (tj0Var2 != null) {
                    tj0Var2.setOnItemClickListener((fj0) obj);
                    return;
                }
                return;
            case 13:
                nj njVar = (nj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new p11(14, njVar, new ArrayList()));
                    return;
                }
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = njVar.f36568f;
                int size = arrayList6.size();
                while (i12 < size) {
                    Object obj3 = arrayList6.get(i12);
                    i12++;
                    org.telegram.ui.ks ksVar = (org.telegram.ui.ks) obj3;
                    String str3 = ksVar.f47004a;
                    String str4 = "";
                    if (str3 == null) {
                        str3 = "";
                    }
                    String lowerCase2 = str3.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.g0.O3(ksVar.f47004a).toLowerCase();
                    String str5 = ksVar.f47005b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String lowerCase4 = str5.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.g0.O3(ksVar.f47005b).toLowerCase();
                    String str6 = ksVar.f47006c;
                    if (str6 == null) {
                        str6 = "";
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        str4 = "+".concat(str6);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(O3) || lowerCase3.contains(" ".concat(O3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(O3) || lowerCase5.contains(" ".concat(O3)) || str6.startsWith(lowerCase) || str4.startsWith(lowerCase)) {
                        arrayList5.add(ksVar);
                    }
                }
                org.telegram.messenger.g0.h3(new p11(14, njVar, arrayList5));
                return;
            case 14:
                nj njVar2 = (nj) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.os osVar = (org.telegram.ui.os) njVar2.f36569n;
                if (osVar.f48342f) {
                    njVar2.f36567e = arrayList7;
                    if (osVar.f48341e && (tj0Var = osVar.f48338a) != null) {
                        u4.h0 adapter = tj0Var.getAdapter();
                        nj njVar3 = osVar.d;
                        if (adapter != njVar3) {
                            osVar.f48338a.setAdapter(njVar3);
                            osVar.f48338a.setFastScrollVisible(false);
                        }
                    }
                    njVar2.f();
                    return;
                }
                return;
            case 15:
                org.telegram.messenger.hp.s1(((org.telegram.ui.qs) obj2).f28583a).O3((TLRPC.Updates) obj, false);
                return;
            case 16:
                org.telegram.ui.nt ntVar = (org.telegram.ui.nt) obj2;
                a0.h hVar = (a0.h) obj;
                org.telegram.ui.ot otVar = ntVar.S2;
                Activity parentActivity = otVar.getParentActivity();
                lg.m1 m1Var = otVar.f34299b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f27005id;
                }
                fc.x(parentActivity, m1Var, m10, j10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, ntVar.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, ntVar.J0)).j();
                return;
            case 17:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj2;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) obj;
                org.telegram.ui.ActionBar.t2 t2Var = t2VarArr[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                    t2VarArr[0] = null;
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.au(uwVar, 10), 300L);
                return;
            case 18:
                org.telegram.ui.uw uwVar2 = (org.telegram.ui.uw) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.messenger.hp messagesController = uwVar2.getMessagesController();
                if (uwVar2.X2 == 0 && uwVar2.Z2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.e(arrayList8, i10, -1, null, 0L);
                return;
            case 19:
                ii.a3.n(((org.telegram.ui.uw) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 20:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.uw uwVar3 = ((org.telegram.ui.av) obj2).f43848a;
                uwVar3.I2 = null;
                ro0 ro0Var = uwVar3.H2;
                if (ro0Var != null && ro0Var.h) {
                    ro0Var.e(charSequence, false);
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.d2[] d2VarArr = (org.telegram.ui.ActionBar.d2[]) obj;
                ((org.telegram.ui.uv) obj2).f50195b.removeSelfFromStack();
                if (d2VarArr[1] != null) {
                    d2VarArr[0].removeSelfFromStack();
                    d2VarArr[1].finishFragment();
                    return;
                }
                d2VarArr[0].finishFragment();
                return;
            case 22:
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.uw uwVar4 = ((org.telegram.ui.kw) obj2).f47036b;
                uwVar4.M4(true, true);
                uwVar4.z3();
                while (i12 < arrayList9.size()) {
                    long j11 = ((TLRPC.Dialog) arrayList9.get(i12)).f27005id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i12);
                    if (uwVar4.getMessagesController().t2(j11) || uwVar4.getMessagesController().z2(j11)) {
                        org.telegram.messenger.hp messagesController2 = uwVar4.getMessagesController();
                        org.telegram.messenger.qr messagesStorage = messagesController2.getMessagesStorage();
                        org.telegram.messenger.hl hlVar = new org.telegram.messenger.hl(messagesController2, j11);
                        org.telegram.messenger.p5 p5Var = messagesStorage.f24934a;
                        org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j11, hlVar, 5);
                        j11 = j11;
                        p5Var.c(a4Var);
                    }
                    uwVar4.getMessagesController().o3(j11, 0L);
                    org.telegram.messenger.hp messagesController3 = uwVar4.getMessagesController();
                    int i16 = dialog.top_message;
                    messagesController3.j3(j11, i16, i16, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 23:
                ((org.telegram.ui.kw) obj2).d((org.telegram.messenger.mo) obj);
                return;
            case 24:
                org.telegram.ui.fx fxVar = (org.telegram.ui.fx) obj2;
                org.telegram.ui.wm wmVar = fxVar.f45385a;
                xv0 xv0Var = new xv0(wmVar.getParentActivity(), fxVar.f45385a, org.telegram.messenger.zi.k1(((org.telegram.messenger.zi) obj).f26868k), null, wmVar.f51237a0, wmVar.getResourceProvider());
                boolean T9 = wmVar.T9();
                xv0Var.f28604i0 = T9;
                xv0Var.f28608n = T9;
                wmVar.showDialog(xv0Var);
                return;
            case 25:
                org.telegram.ui.zx zxVar = (org.telegram.ui.zx) obj2;
                zxVar.getClass();
                ((org.telegram.ui.ActionBar.s1) obj).dismiss();
                org.telegram.ui.ay ayVar = zxVar.F;
                org.telegram.ui.cy cyVar = ayVar.f43857c;
                org.telegram.messenger.u10 u10Var = cyVar.f44484x;
                if (u10Var != null) {
                    u10Var.a(cyVar.d);
                }
                ayVar.f43857c.finishFragment();
                return;
            case 26:
                org.telegram.ui.ez ezVar = (org.telegram.ui.ez) obj2;
                org.telegram.ui.cy cyVar2 = new org.telegram.ui.cy(ezVar.f45107r, ((org.telegram.ui.vy) obj).f50640m);
                cyVar2.f44485y = new org.telegram.ui.gy(ezVar, 1);
                cyVar2.f44484x = new org.telegram.ui.gy(ezVar, 2);
                ezVar.presentFragment(cyVar2);
                return;
            case 27:
                org.telegram.ui.ez ezVar2 = (org.telegram.ui.ez) obj2;
                ezVar2.h = false;
                ezVar2.f45108s = false;
                ezVar2.f45107r.f24242g = ezVar2.E;
                ezVar2.o0(true);
                ezVar2.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 28:
                org.telegram.ui.ez ezVar3 = (org.telegram.ui.ez) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList10 = ezVar3.M;
                ezVar3.O = false;
                if (tLObject3 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject3;
                    ezVar3.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                    ezVar3.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                    arrayList10.clear();
                    arrayList10.addAll(tL_chatlists_exportedInvites.invites);
                    ezVar3.C0();
                }
                ezVar3.N = 0;
                return;
            default:
                org.telegram.ui.ez ezVar4 = (org.telegram.ui.ez) obj2;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj;
                org.telegram.messenger.mo moVar = ezVar4.f45107r;
                if (s1Var != null) {
                    try {
                        s1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                ezVar4.getMessagesController().h4(moVar);
                org.telegram.messenger.qr messagesStorage2 = ezVar4.getMessagesStorage();
                messagesStorage2.f24934a.c(new org.telegram.messenger.pq(0, messagesStorage2, moVar));
                ezVar4.finishFragment();
                return;
        }
    }

    public p11(org.telegram.ui.nt ntVar, a0.h hVar, int i3) {
        this.f37029a = 16;
        this.f37030b = ntVar;
        this.f37031c = hVar;
    }
}
