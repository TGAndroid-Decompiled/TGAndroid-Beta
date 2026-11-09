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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.FiltersSetupActivity;
public final class m51 implements Runnable {
    public final int f35961a;
    public final Object f35962b;
    public final Object f35963c;

    public m51(int i7, Object obj, Object obj2) {
        this.f35961a = i7;
        this.f35962b = obj;
        this.f35963c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        String str;
        qj0 qj0Var;
        int i10;
        int i11 = this.f35961a;
        long j3 = 0;
        ArrayList arrayList = null;
        int i12 = 0;
        Object obj = this.f35963c;
        Object obj2 = this.f35962b;
        switch (i11) {
            case 0:
                u51 u51Var = (u51) obj2;
                e2.v0 v0Var = (e2.v0) obj;
                Throwable cause = v0Var.getCause();
                if ((cause instanceof u2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.qp.e1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = u51.f38602l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = u51Var.N;
                    if (arrayList2 != null) {
                        int i13 = 0;
                        while (i13 < arrayList2.size()) {
                            q51 q51Var = (q51) arrayList2.get(i13);
                            int i14 = 0;
                            while (true) {
                                ArrayList arrayList3 = q51Var.d;
                                if (i14 < arrayList3.size()) {
                                    s51 s51Var = (s51) arrayList3.get(i14);
                                    if (!TextUtils.isEmpty(s51Var.f37935m) && !u51.D0(s51Var.f37935m)) {
                                        arrayList3.remove(i14);
                                        i14--;
                                    }
                                    i14++;
                                } else {
                                    if (arrayList3.isEmpty()) {
                                        arrayList2.remove(i13);
                                        i13--;
                                    }
                                    i13++;
                                }
                            }
                        }
                        arrayList = arrayList2;
                    }
                    u51Var.N = arrayList;
                    if (arrayList != null) {
                        u51Var.k0(arrayList, u51Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = u51Var.f38617n;
                if (textureView != null && ((!u51Var.E && (cause instanceof u2.p)) || (cause instanceof d3.v))) {
                    u51Var.E = true;
                    if (u51Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(u51Var.f38617n);
                            viewGroup.removeView(u51Var.f38617n);
                            viewGroup.addView(u51Var.f38617n, indexOfChild);
                        }
                        org.telegram.messenger.q5 q5Var = u51Var.f38605b;
                        if (q5Var != null) {
                            q5Var.postRunnable(new kr0(u51Var, 29));
                            return;
                        }
                        l2.i0 i0Var = u51Var.d;
                        TextureView textureView2 = u51Var.f38617n;
                        i0Var.F1();
                        if (textureView2 != null && textureView2 == i0Var.X) {
                            i0Var.F1();
                            i0Var.s1();
                            i0Var.x1(null);
                            i0Var.q1(0, 0);
                        }
                        u51Var.d.z1(u51Var.f38617n);
                        ArrayList arrayList4 = u51Var.N;
                        if (arrayList4 != null) {
                            u51Var.k0(arrayList4, u51Var.O);
                        } else if (u51Var.U) {
                            u51Var.l0(u51Var.Q, u51Var.S, u51Var.R, u51Var.T);
                        } else {
                            u51Var.j0(u51Var.Q, u51Var.S);
                        }
                        u51Var.h0();
                        return;
                    }
                    return;
                }
                u51Var.J.onError(u51Var, v0Var);
                return;
            case 1:
                ((u51) ((li.b6) obj2).f18485f).K.F(true, (float[]) obj);
                return;
            case 2:
                a61 a61Var = (a61) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (a61Var.f31739x != null) {
                        Bitmap bitmap2 = a61Var.f31738w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        a61Var.f31738w = a61Var.f31739x;
                    }
                    a61Var.f31739x = bitmap;
                    Bitmap bitmap3 = a61Var.f31739x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    a61Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(a61Var.L);
                    a61Var.J.setShader(a61Var.G);
                    a61Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i7 = (int) (L / width);
                    } else {
                        i7 = L;
                        L = (int) (L * width);
                    }
                    ViewGroup.LayoutParams layoutParams = a61Var.getLayoutParams();
                    if (a61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i7) {
                        layoutParams.width = L;
                        layoutParams.height = i7;
                        a61Var.setVisibility(0);
                        a61Var.requestLayout();
                    }
                }
                a61Var.f31732f = null;
                return;
            case 3:
                final l71 l71Var = (l71) obj2;
                l71Var.f35636e.f35998b.evaluateJavascript((String) obj, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj3) {
                        String str2 = (String) obj3;
                        l71 l71Var2 = l71.this;
                        String[] strArr = l71Var2.f35635c;
                        String str3 = strArr[0];
                        String str4 = l71Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        l71Var2.f35634b.countDown();
                    }
                });
                return;
            case 4:
                ((org.telegram.ui.Components.voip.q) obj2).f39564a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 5:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap hashMap2 = yVar.F.h;
                org.telegram.messenger.s3 s3Var = yVar.f39745x;
                boolean z9 = s3Var.f25410b;
                TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f25409a;
                if (z9) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 6:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) obj;
                ((org.telegram.ui.Components.voip.k0) obj2).getClass();
                yVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.w(yVar2, 4)).setDuration(150L).start();
                return;
            case 7:
                qj0 qj0Var2 = (qj0) obj2;
                if (qj0Var2 != null) {
                    qj0Var2.setOnItemClickListener((cj0) obj);
                    return;
                }
                return;
            case 8:
                oj ojVar = (oj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new m51(9, ojVar, new ArrayList()));
                    return;
                }
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = ojVar.f36729f;
                int size = arrayList6.size();
                while (i12 < size) {
                    Object obj3 = arrayList6.get(i12);
                    i12++;
                    org.telegram.ui.os osVar = (org.telegram.ui.os) obj3;
                    String str2 = osVar.f48510a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.g0.O3(osVar.f48510a).toLowerCase();
                    String str4 = osVar.f48511b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.g0.O3(osVar.f48511b).toLowerCase();
                    String str5 = osVar.f48512c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(O3) || lowerCase3.contains(" ".concat(O3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(O3) || lowerCase5.contains(" ".concat(O3)) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList5.add(osVar);
                    }
                }
                org.telegram.messenger.g0.h3(new m51(9, ojVar, arrayList5));
                return;
            case 9:
                oj ojVar2 = (oj) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) ojVar2.f36730n;
                if (ssVar.f49985f) {
                    ojVar2.f36728e = arrayList7;
                    if (ssVar.f49984e && (qj0Var = ssVar.f49981a) != null) {
                        v4.g0 adapter = qj0Var.getAdapter();
                        oj ojVar3 = ssVar.d;
                        if (adapter != ojVar3) {
                            ssVar.f49981a.setAdapter(ojVar3);
                            ssVar.f49981a.setFastScrollVisible(false);
                        }
                    }
                    ojVar2.f();
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.qp.s1(((org.telegram.ui.us) obj2).f28621a).O3((TLRPC.Updates) obj, false);
                return;
            case 11:
                org.telegram.ui.rt rtVar = (org.telegram.ui.rt) obj2;
                a0.h hVar = (a0.h) obj;
                org.telegram.ui.st stVar = rtVar.R2;
                Activity parentActivity = stVar.getParentActivity();
                kg.l1 l1Var = stVar.f36650b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f26960id;
                }
                hc.x(parentActivity, l1Var, m10, j3, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.tj, rtVar.I0), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.vj, rtVar.I0)).j();
                return;
            case 12:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj2;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) obj;
                org.telegram.ui.ActionBar.v2 v2Var = v2VarArr[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                    v2VarArr[0] = null;
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.eu(ywVar, 10), 300L);
                return;
            case 13:
                org.telegram.ui.yw ywVar2 = (org.telegram.ui.yw) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.messenger.qp messagesController = ywVar2.getMessagesController();
                if (ywVar2.X2 == 0 && ywVar2.Z2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.e(arrayList8, i10, -1, null, 0L);
                return;
            case 14:
                hi.a3.n(((org.telegram.ui.yw) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 15:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.yw ywVar3 = ((org.telegram.ui.fv) obj2).f45795a;
                ywVar3.I2 = null;
                qo0 qo0Var = ywVar3.H2;
                if (qo0Var != null && qo0Var.h) {
                    qo0Var.e(charSequence, false);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.ActionBar.f2[] f2VarArr = (org.telegram.ui.ActionBar.f2[]) obj;
                ((org.telegram.ui.zv) obj2).f52678b.removeSelfFromStack();
                if (f2VarArr[1] != null) {
                    f2VarArr[0].removeSelfFromStack();
                    f2VarArr[1].finishFragment();
                    return;
                }
                f2VarArr[0].finishFragment();
                return;
            case 17:
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.yw ywVar4 = ((org.telegram.ui.pw) obj2).f48821b;
                ywVar4.M4(true, true);
                ywVar4.z3();
                while (i12 < arrayList9.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList9.get(i12)).f26960id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i12);
                    if (ywVar4.getMessagesController().t2(j10) || ywVar4.getMessagesController().z2(j10)) {
                        org.telegram.messenger.qp messagesController2 = ywVar4.getMessagesController();
                        org.telegram.messenger.yr messagesStorage = messagesController2.getMessagesStorage();
                        org.telegram.messenger.rl rlVar = new org.telegram.messenger.rl(messagesController2, j10);
                        org.telegram.messenger.p5 p5Var = messagesStorage.f26719a;
                        org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j10, rlVar, 5);
                        j10 = j10;
                        p5Var.c(a4Var);
                    }
                    ywVar4.getMessagesController().o3(j10, 0L);
                    org.telegram.messenger.qp messagesController3 = ywVar4.getMessagesController();
                    int i15 = dialog.top_message;
                    messagesController3.j3(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 18:
                ((org.telegram.ui.pw) obj2).d((org.telegram.messenger.vo) obj);
                return;
            case 19:
                org.telegram.ui.kx kxVar = (org.telegram.ui.kx) obj2;
                org.telegram.ui.cn cnVar = kxVar.f47386a;
                zv0 zv0Var = new zv0(cnVar.getParentActivity(), kxVar.f47386a, org.telegram.messenger.ij.j1(((org.telegram.messenger.ij) obj).f23262k), null, cnVar.Z, cnVar.getResourceProvider());
                boolean U9 = cnVar.U9();
                zv0Var.f28640h0 = U9;
                zv0Var.f28645n = U9;
                cnVar.showDialog(zv0Var);
                return;
            case 20:
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) obj2;
                gyVar.getClass();
                ((org.telegram.ui.ActionBar.u1) obj).dismiss();
                org.telegram.ui.hy hyVar = gyVar.E;
                org.telegram.ui.iy iyVar = hyVar.f46425c;
                org.telegram.messenger.c20 c20Var = iyVar.f46783x;
                if (c20Var != null) {
                    c20Var.a(iyVar.d);
                }
                hyVar.f46425c.finishFragment();
                return;
            case 21:
                org.telegram.ui.iz izVar = (org.telegram.ui.iz) obj2;
                org.telegram.ui.iy iyVar2 = new org.telegram.ui.iy(izVar.f46795r, ((org.telegram.ui.az) obj).f43836m);
                iyVar2.f46784y = new org.telegram.ui.my(izVar, 1);
                iyVar2.f46783x = new org.telegram.ui.my(izVar, 2);
                izVar.presentFragment(iyVar2);
                return;
            case 22:
                org.telegram.ui.iz izVar2 = (org.telegram.ui.iz) obj2;
                izVar2.h = false;
                izVar2.f46796s = false;
                izVar2.f46795r.f26075g = izVar2.D;
                izVar2.o0(true);
                izVar2.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 23:
                org.telegram.ui.iz izVar3 = (org.telegram.ui.iz) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList10 = izVar3.L;
                izVar3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    izVar3.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                    izVar3.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                    arrayList10.clear();
                    arrayList10.addAll(tL_chatlists_exportedInvites.invites);
                    izVar3.C0();
                }
                izVar3.M = 0;
                return;
            case 24:
                org.telegram.ui.iz izVar4 = (org.telegram.ui.iz) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj;
                org.telegram.messenger.vo voVar = izVar4.f46795r;
                if (u1Var != null) {
                    try {
                        u1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                izVar4.getMessagesController().h4(voVar);
                org.telegram.messenger.yr messagesStorage2 = izVar4.getMessagesStorage();
                messagesStorage2.f26719a.c(new org.telegram.messenger.zq(0, messagesStorage2, voVar));
                izVar4.finishFragment();
                return;
            case 25:
                org.telegram.ui.iz izVar5 = (org.telegram.ui.iz) obj2;
                izVar5.getClass();
                izVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 26:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f41253y) {
                    filtersSetupActivity.f41253y = true;
                    filtersSetupActivity.f0(new org.telegram.ui.b00(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 27:
                FiltersSetupActivity filtersSetupActivity2 = ((org.telegram.ui.g00) obj2).f45835e;
                filtersSetupActivity2.getMessagesController().V0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 28:
                ArrayList arrayList11 = (ArrayList) obj;
                ArrayList arrayList12 = ((org.telegram.ui.e40) obj2).P3;
                for (int i16 = 0; i16 < arrayList12.size(); i16++) {
                    if (((org.telegram.ui.Components.voip.y) arrayList12.get(i16)).f39745x != null) {
                        arrayList11.remove(((org.telegram.ui.Components.voip.y) arrayList12.get(i16)).f39745x);
                    }
                }
                while (i12 < arrayList11.size()) {
                    org.telegram.messenger.s3 s3Var2 = (org.telegram.messenger.s3) arrayList11.get(i12);
                    if (s3Var2.f25409a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, s3Var2.f25410b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(s3Var2.f25409a, s3Var2.f25410b);
                    }
                    i12++;
                }
                return;
            default:
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) obj2;
                org.telegram.messenger.qs.f(e40Var.f45228k1.f21765a).k(75, 6, ((TLRPC.TL_error) obj).text);
                e40Var.dismiss();
                return;
        }
    }

    public m51(org.telegram.ui.rt rtVar, a0.h hVar, int i7) {
        this.f35961a = 11;
        this.f35962b = rtVar;
        this.f35963c = hVar;
    }
}
