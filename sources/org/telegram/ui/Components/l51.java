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
public final class l51 implements Runnable {
    public final int f35537a;
    public final Object f35538b;
    public final Object f35539c;

    public l51(int i7, Object obj, Object obj2) {
        this.f35537a = i7;
        this.f35538b = obj;
        this.f35539c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        String str;
        pj0 pj0Var;
        int i10;
        int i11 = this.f35537a;
        long j3 = 0;
        ArrayList arrayList = null;
        int i12 = 0;
        Object obj = this.f35539c;
        Object obj2 = this.f35538b;
        switch (i11) {
            case 0:
                t51 t51Var = (t51) obj2;
                e2.v0 v0Var = (e2.v0) obj;
                Throwable cause = v0Var.getCause();
                if ((cause instanceof u2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.qp.e1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = t51.f38248l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = t51Var.N;
                    if (arrayList2 != null) {
                        int i13 = 0;
                        while (i13 < arrayList2.size()) {
                            p51 p51Var = (p51) arrayList2.get(i13);
                            int i14 = 0;
                            while (true) {
                                ArrayList arrayList3 = p51Var.d;
                                if (i14 < arrayList3.size()) {
                                    r51 r51Var = (r51) arrayList3.get(i14);
                                    if (!TextUtils.isEmpty(r51Var.f37531m) && !t51.D0(r51Var.f37531m)) {
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
                    t51Var.N = arrayList;
                    if (arrayList != null) {
                        t51Var.k0(arrayList, t51Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = t51Var.f38263n;
                if (textureView != null && ((!t51Var.E && (cause instanceof u2.p)) || (cause instanceof d3.v))) {
                    t51Var.E = true;
                    if (t51Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(t51Var.f38263n);
                            viewGroup.removeView(t51Var.f38263n);
                            viewGroup.addView(t51Var.f38263n, indexOfChild);
                        }
                        org.telegram.messenger.q5 q5Var = t51Var.f38251b;
                        if (q5Var != null) {
                            q5Var.postRunnable(new ir0(t51Var, 29));
                            return;
                        }
                        l2.i0 i0Var = t51Var.d;
                        TextureView textureView2 = t51Var.f38263n;
                        i0Var.F1();
                        if (textureView2 != null && textureView2 == i0Var.X) {
                            i0Var.F1();
                            i0Var.s1();
                            i0Var.x1(null);
                            i0Var.q1(0, 0);
                        }
                        t51Var.d.z1(t51Var.f38263n);
                        ArrayList arrayList4 = t51Var.N;
                        if (arrayList4 != null) {
                            t51Var.k0(arrayList4, t51Var.O);
                        } else if (t51Var.U) {
                            t51Var.l0(t51Var.Q, t51Var.S, t51Var.R, t51Var.T);
                        } else {
                            t51Var.j0(t51Var.Q, t51Var.S);
                        }
                        t51Var.h0();
                        return;
                    }
                    return;
                }
                t51Var.J.onError(t51Var, v0Var);
                return;
            case 1:
                ((t51) ((li.b6) obj2).f18485f).K.F(true, (float[]) obj);
                return;
            case 2:
                z51 z51Var = (z51) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (z51Var.f40914x != null) {
                        Bitmap bitmap2 = z51Var.f40913w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        z51Var.f40913w = z51Var.f40914x;
                    }
                    z51Var.f40914x = bitmap;
                    Bitmap bitmap3 = z51Var.f40914x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    z51Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(z51Var.L);
                    z51Var.J.setShader(z51Var.G);
                    z51Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i7 = (int) (L / width);
                    } else {
                        i7 = L;
                        L = (int) (L * width);
                    }
                    ViewGroup.LayoutParams layoutParams = z51Var.getLayoutParams();
                    if (z51Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i7) {
                        layoutParams.width = L;
                        layoutParams.height = i7;
                        z51Var.setVisibility(0);
                        z51Var.requestLayout();
                    }
                }
                z51Var.f40907f = null;
                return;
            case 3:
                final k71 k71Var = (k71) obj2;
                k71Var.f35250e.f35572b.evaluateJavascript((String) obj, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj3) {
                        String str2 = (String) obj3;
                        k71 k71Var2 = k71.this;
                        String[] strArr = k71Var2.f35249c;
                        String str3 = strArr[0];
                        String str4 = k71Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        k71Var2.f35248b.countDown();
                    }
                });
                return;
            case 4:
                ((org.telegram.ui.Components.voip.q) obj2).f39475a.setOnClickListener((View.OnClickListener) obj);
                return;
            case 5:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap hashMap2 = yVar.F.h;
                org.telegram.messenger.s3 s3Var = yVar.f39656x;
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
                pj0 pj0Var2 = (pj0) obj2;
                if (pj0Var2 != null) {
                    pj0Var2.setOnItemClickListener((bj0) obj);
                    return;
                }
                return;
            case 8:
                oj ojVar = (oj) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new l51(9, ojVar, new ArrayList()));
                    return;
                }
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = ojVar.f36651f;
                int size = arrayList6.size();
                while (i12 < size) {
                    Object obj3 = arrayList6.get(i12);
                    i12++;
                    org.telegram.ui.ms msVar = (org.telegram.ui.ms) obj3;
                    String str2 = msVar.f47869a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.g0.O3(msVar.f47869a).toLowerCase();
                    String str4 = msVar.f47870b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.g0.O3(msVar.f47870b).toLowerCase();
                    String str5 = msVar.f47871c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(O3) || lowerCase3.contains(" ".concat(O3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(O3) || lowerCase5.contains(" ".concat(O3)) || str5.startsWith(lowerCase) || str3.startsWith(lowerCase)) {
                        arrayList5.add(msVar);
                    }
                }
                org.telegram.messenger.g0.h3(new l51(9, ojVar, arrayList5));
                return;
            case 9:
                oj ojVar2 = (oj) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) ojVar2.f36652n;
                if (qsVar.f49307f) {
                    ojVar2.f36650e = arrayList7;
                    if (qsVar.f49306e && (pj0Var = qsVar.f49303a) != null) {
                        v4.g0 adapter = pj0Var.getAdapter();
                        oj ojVar3 = qsVar.d;
                        if (adapter != ojVar3) {
                            qsVar.f49303a.setAdapter(ojVar3);
                            qsVar.f49303a.setFastScrollVisible(false);
                        }
                    }
                    ojVar2.f();
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.qp.s1(((org.telegram.ui.ss) obj2).f28616a).O3((TLRPC.Updates) obj, false);
                return;
            case 11:
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) obj2;
                a0.h hVar = (a0.h) obj;
                org.telegram.ui.qt qtVar = ptVar.R2;
                Activity parentActivity = qtVar.getParentActivity();
                kg.l1 l1Var = qtVar.f36244b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f26960id;
                }
                hc.x(parentActivity, l1Var, m10, j3, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, ptVar.I0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, ptVar.I0)).j();
                return;
            case 12:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) obj2;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) obj;
                org.telegram.ui.ActionBar.v2 v2Var = v2VarArr[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                    v2VarArr[0] = null;
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.cu(wwVar, 10), 300L);
                return;
            case 13:
                org.telegram.ui.ww wwVar2 = (org.telegram.ui.ww) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.messenger.qp messagesController = wwVar2.getMessagesController();
                if (wwVar2.W2 == 0 && wwVar2.Y2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.e(arrayList8, i10, -1, null, 0L);
                return;
            case 14:
                hi.a3.n(((org.telegram.ui.ww) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                return;
            case 15:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.ww wwVar3 = ((org.telegram.ui.dv) obj2).f45140a;
                wwVar3.H2 = null;
                po0 po0Var = wwVar3.G2;
                if (po0Var != null && po0Var.h) {
                    po0Var.e(charSequence, false);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.ActionBar.f2[] f2VarArr = (org.telegram.ui.ActionBar.f2[]) obj;
                ((org.telegram.ui.xv) obj2).f51983b.removeSelfFromStack();
                if (f2VarArr[1] != null) {
                    f2VarArr[0].removeSelfFromStack();
                    f2VarArr[1].finishFragment();
                    return;
                }
                f2VarArr[0].finishFragment();
                return;
            case 17:
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.ww wwVar4 = ((org.telegram.ui.nw) obj2).f48150b;
                wwVar4.M4(true, true);
                wwVar4.z3();
                while (i12 < arrayList9.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList9.get(i12)).f26960id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i12);
                    if (wwVar4.getMessagesController().t2(j10) || wwVar4.getMessagesController().z2(j10)) {
                        org.telegram.messenger.qp messagesController2 = wwVar4.getMessagesController();
                        org.telegram.messenger.yr messagesStorage = messagesController2.getMessagesStorage();
                        org.telegram.messenger.rl rlVar = new org.telegram.messenger.rl(messagesController2, j10);
                        org.telegram.messenger.p5 p5Var = messagesStorage.f26719a;
                        org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j10, rlVar, 5);
                        j10 = j10;
                        p5Var.c(a4Var);
                    }
                    wwVar4.getMessagesController().o3(j10, 0L);
                    org.telegram.messenger.qp messagesController3 = wwVar4.getMessagesController();
                    int i15 = dialog.top_message;
                    messagesController3.j3(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 18:
                ((org.telegram.ui.nw) obj2).d((org.telegram.messenger.vo) obj);
                return;
            case 19:
                org.telegram.ui.ix ixVar = (org.telegram.ui.ix) obj2;
                org.telegram.ui.an anVar = ixVar.f46762a;
                yv0 yv0Var = new yv0(anVar.getParentActivity(), ixVar.f46762a, org.telegram.messenger.ij.k1(((org.telegram.messenger.ij) obj).f23262k), null, anVar.Z, anVar.getResourceProvider());
                boolean T9 = anVar.T9();
                yv0Var.f28635h0 = T9;
                yv0Var.f28640n = T9;
                anVar.showDialog(yv0Var);
                return;
            case 20:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj2;
                eyVar.getClass();
                ((org.telegram.ui.ActionBar.u1) obj).dismiss();
                org.telegram.ui.fy fyVar = eyVar.E;
                org.telegram.ui.gy gyVar = fyVar.f45720c;
                org.telegram.messenger.c20 c20Var = gyVar.f46152x;
                if (c20Var != null) {
                    c20Var.a(gyVar.d);
                }
                fyVar.f45720c.finishFragment();
                return;
            case 21:
                org.telegram.ui.gz gzVar = (org.telegram.ui.gz) obj2;
                org.telegram.ui.gy gyVar2 = new org.telegram.ui.gy(gzVar.f46167r, ((org.telegram.ui.yy) obj).f52355m);
                gyVar2.f46153y = new org.telegram.ui.ky(gzVar, 1);
                gyVar2.f46152x = new org.telegram.ui.ky(gzVar, 2);
                gzVar.presentFragment(gyVar2);
                return;
            case 22:
                org.telegram.ui.gz gzVar2 = (org.telegram.ui.gz) obj2;
                gzVar2.h = false;
                gzVar2.f46168s = false;
                gzVar2.f46167r.f26075g = gzVar2.D;
                gzVar2.o0(true);
                gzVar2.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 23:
                org.telegram.ui.gz gzVar3 = (org.telegram.ui.gz) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList10 = gzVar3.L;
                gzVar3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    gzVar3.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                    gzVar3.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                    arrayList10.clear();
                    arrayList10.addAll(tL_chatlists_exportedInvites.invites);
                    gzVar3.C0();
                }
                gzVar3.M = 0;
                return;
            case 24:
                org.telegram.ui.gz gzVar4 = (org.telegram.ui.gz) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj;
                org.telegram.messenger.vo voVar = gzVar4.f46167r;
                if (u1Var != null) {
                    try {
                        u1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                gzVar4.getMessagesController().h4(voVar);
                org.telegram.messenger.yr messagesStorage2 = gzVar4.getMessagesStorage();
                messagesStorage2.f26719a.c(new org.telegram.messenger.zq(0, messagesStorage2, voVar));
                gzVar4.finishFragment();
                return;
            case 25:
                org.telegram.ui.gz gzVar5 = (org.telegram.ui.gz) obj2;
                gzVar5.getClass();
                gzVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 26:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.f41246y) {
                    filtersSetupActivity.f41246y = true;
                    filtersSetupActivity.f0(new org.telegram.ui.zz(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 27:
                FiltersSetupActivity filtersSetupActivity2 = ((org.telegram.ui.e00) obj2).f45165e;
                filtersSetupActivity2.getMessagesController().V0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 28:
                ArrayList arrayList11 = (ArrayList) obj;
                ArrayList arrayList12 = ((org.telegram.ui.c40) obj2).P3;
                for (int i16 = 0; i16 < arrayList12.size(); i16++) {
                    if (((org.telegram.ui.Components.voip.y) arrayList12.get(i16)).f39656x != null) {
                        arrayList11.remove(((org.telegram.ui.Components.voip.y) arrayList12.get(i16)).f39656x);
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
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj2;
                org.telegram.messenger.qs.f(c40Var.f44588k1.f21765a).k(75, 6, ((TLRPC.TL_error) obj).text);
                c40Var.dismiss();
                return;
        }
    }

    public l51(org.telegram.ui.pt ptVar, a0.h hVar, int i7) {
        this.f35537a = 11;
        this.f35538b = ptVar;
        this.f35539c = hVar;
    }
}
