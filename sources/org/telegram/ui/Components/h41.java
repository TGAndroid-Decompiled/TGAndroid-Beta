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
public final class h41 implements Runnable {
    public final int f34159a;
    public final Object f34160b;
    public final Object f34161c;

    public h41(int i7, Object obj, Object obj2) {
        this.f34159a = i7;
        this.f34160b = obj;
        this.f34161c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        String str;
        ArrayList arrayList;
        pj0 pj0Var;
        long j3;
        int i10;
        switch (this.f34159a) {
            case 0:
                ((x31) this.f34160b).D.onClick((org.telegram.ui.Cells.q8) this.f34161c);
                return;
            case 1:
                t51 t51Var = (t51) this.f34160b;
                e2.v0 v0Var = (e2.v0) this.f34161c;
                Throwable cause = v0Var.getCause();
                ArrayList arrayList2 = null;
                if ((cause instanceof u2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.qp.e1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = t51.f38193l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList3 = t51Var.N;
                    if (arrayList3 != null) {
                        int i11 = 0;
                        while (i11 < arrayList3.size()) {
                            p51 p51Var = (p51) arrayList3.get(i11);
                            int i12 = 0;
                            while (true) {
                                ArrayList arrayList4 = p51Var.d;
                                if (i12 < arrayList4.size()) {
                                    r51 r51Var = (r51) arrayList4.get(i12);
                                    if (!TextUtils.isEmpty(r51Var.f37520m) && !t51.D0(r51Var.f37520m)) {
                                        arrayList4.remove(i12);
                                        i12--;
                                    }
                                    i12++;
                                } else {
                                    if (arrayList4.isEmpty()) {
                                        arrayList3.remove(i11);
                                        i11--;
                                    }
                                    i11++;
                                }
                            }
                        }
                        arrayList2 = arrayList3;
                    }
                    t51Var.N = arrayList2;
                    if (arrayList2 != null) {
                        t51Var.k0(arrayList2, t51Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = t51Var.f38208n;
                if (textureView != null && ((!t51Var.E && (cause instanceof u2.p)) || (cause instanceof d3.v))) {
                    t51Var.E = true;
                    if (t51Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(t51Var.f38208n);
                            viewGroup.removeView(t51Var.f38208n);
                            viewGroup.addView(t51Var.f38208n, indexOfChild);
                        }
                        org.telegram.messenger.q5 q5Var = t51Var.f38196b;
                        if (q5Var != null) {
                            q5Var.postRunnable(new jr0(t51Var, 29));
                            return;
                        }
                        l2.i0 i0Var = t51Var.d;
                        TextureView textureView2 = t51Var.f38208n;
                        i0Var.F1();
                        if (textureView2 != null && textureView2 == i0Var.X) {
                            i0Var.F1();
                            i0Var.s1();
                            i0Var.x1(null);
                            i0Var.q1(0, 0);
                        }
                        t51Var.d.z1(t51Var.f38208n);
                        ArrayList arrayList5 = t51Var.N;
                        if (arrayList5 != null) {
                            t51Var.k0(arrayList5, t51Var.O);
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
            case 2:
                ((t51) ((li.b6) this.f34160b).f18488f).K.F(true, (float[]) this.f34161c);
                return;
            case 3:
                z51 z51Var = (z51) this.f34160b;
                Bitmap bitmap = (Bitmap) this.f34161c;
                if (bitmap != null) {
                    if (z51Var.f40881x != null) {
                        Bitmap bitmap2 = z51Var.f40880w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        z51Var.f40880w = z51Var.f40881x;
                    }
                    z51Var.f40881x = bitmap;
                    Bitmap bitmap3 = z51Var.f40881x;
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
                        L = (int) (L * width);
                        i7 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = z51Var.getLayoutParams();
                    if (z51Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i7) {
                        layoutParams.width = L;
                        layoutParams.height = i7;
                        z51Var.setVisibility(0);
                        z51Var.requestLayout();
                    }
                }
                z51Var.f40874f = null;
                return;
            case 4:
                final k71 k71Var = (k71) this.f34160b;
                k71Var.f35238e.f35582b.evaluateJavascript((String) this.f34161c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str2 = (String) obj;
                        k71 k71Var2 = k71.this;
                        String[] strArr = k71Var2.f35237c;
                        String str3 = strArr[0];
                        String str4 = k71Var2.d;
                        strArr[0] = str3.replace(str4, "/signature/" + str2.substring(1, str2.length() - 1));
                        k71Var2.f35236b.countDown();
                    }
                });
                return;
            case 5:
                ((org.telegram.ui.Components.voip.q) this.f34160b).f39484a.setOnClickListener((View.OnClickListener) this.f34161c);
                return;
            case 6:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.f34160b;
                Bitmap bitmap4 = (Bitmap) this.f34161c;
                HashMap hashMap2 = yVar.F.h;
                org.telegram.messenger.s3 s3Var = yVar.f39667x;
                boolean z9 = s3Var.f25414b;
                TLRPC.GroupCallParticipant groupCallParticipant = s3Var.f25413a;
                if (z9) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 7:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.f34161c;
                ((org.telegram.ui.Components.voip.k0) this.f34160b).getClass();
                yVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.w(yVar2, 4)).setDuration(150L).start();
                return;
            case 8:
                pj0 pj0Var2 = (pj0) this.f34160b;
                if (pj0Var2 != null) {
                    pj0Var2.setOnItemClickListener((bj0) this.f34161c);
                    return;
                }
                return;
            case 9:
                nj njVar = (nj) this.f34160b;
                String lowerCase = ((String) this.f34161c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new h41(10, njVar, new ArrayList()));
                    return;
                }
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = njVar.f36319f;
                int size = arrayList7.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList7.get(i13);
                    i13++;
                    org.telegram.ui.ps psVar = (org.telegram.ui.ps) obj;
                    String str2 = psVar.f48826a;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String lowerCase2 = str2.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.g0.O3(psVar.f48826a).toLowerCase();
                    String str4 = psVar.f48827b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase4 = str4.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.g0.O3(psVar.f48827b).toLowerCase();
                    String str5 = psVar.f48828c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str3 = "+".concat(str5);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList7;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(O3) && !lowerCase3.contains(" ".concat(O3)) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(O3) && !lowerCase5.contains(" ".concat(O3)) && !str5.startsWith(lowerCase) && !str3.startsWith(lowerCase)) {
                            arrayList7 = arrayList;
                        }
                    } else {
                        arrayList = arrayList7;
                    }
                    arrayList6.add(psVar);
                    arrayList7 = arrayList;
                }
                org.telegram.messenger.g0.h3(new h41(10, njVar, arrayList6));
                return;
            case 10:
                nj njVar2 = (nj) this.f34160b;
                ArrayList arrayList8 = (ArrayList) this.f34161c;
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) njVar2.f36320n;
                if (tsVar.f50334f) {
                    njVar2.f36318e = arrayList8;
                    if (tsVar.f50333e && (pj0Var = tsVar.f50330a) != null) {
                        v4.g0 adapter = pj0Var.getAdapter();
                        nj njVar3 = tsVar.d;
                        if (adapter != njVar3) {
                            tsVar.f50330a.setAdapter(njVar3);
                            tsVar.f50330a.setFastScrollVisible(false);
                        }
                    }
                    njVar2.f();
                    return;
                }
                return;
            case 11:
                org.telegram.messenger.qp.s1(((org.telegram.ui.vs) this.f34160b).f28669a).O3((TLRPC.Updates) this.f34161c, false);
                return;
            case 12:
                org.telegram.ui.st stVar = (org.telegram.ui.st) this.f34160b;
                a0.h hVar = (a0.h) this.f34161c;
                org.telegram.ui.tt ttVar = stVar.U2;
                Activity parentActivity = ttVar.getParentActivity();
                kg.l1 l1Var = ttVar.f36519b;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) hVar.n(0)).f26964id;
                } else {
                    j3 = 0;
                }
                gc.x(parentActivity, l1Var, m10, j3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tj, stVar.I0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.vj, stVar.I0)).j();
                return;
            case 13:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) this.f34160b;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.f34161c;
                org.telegram.ui.ActionBar.w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                    w2VarArr[0] = null;
                }
                org.telegram.messenger.g0.i3(new org.telegram.ui.fu(zwVar, 10), 300L);
                return;
            case 14:
                org.telegram.ui.zw zwVar2 = (org.telegram.ui.zw) this.f34160b;
                ArrayList arrayList9 = (ArrayList) this.f34161c;
                org.telegram.messenger.qp messagesController = zwVar2.getMessagesController();
                if (zwVar2.X2 == 0 && zwVar2.Z2 == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                messagesController.e(arrayList9, i10, -1, null, 0L);
                return;
            case 15:
                hi.a3.n(((org.telegram.ui.zw) this.f34160b).currentAccount, ((TLRPC.TL_attachMenuBot) this.f34161c).bot_id, null);
                return;
            case 16:
                CharSequence charSequence = (CharSequence) this.f34161c;
                org.telegram.ui.zw zwVar3 = ((org.telegram.ui.gv) this.f34160b).f46162a;
                zwVar3.I2 = null;
                po0 po0Var = zwVar3.H2;
                if (po0Var != null && po0Var.h) {
                    po0Var.e(charSequence, false);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.ActionBar.f2[] f2VarArr = (org.telegram.ui.ActionBar.f2[]) this.f34161c;
                ((org.telegram.ui.aw) this.f34160b).f43827b.removeSelfFromStack();
                if (f2VarArr[1] != null) {
                    f2VarArr[0].removeSelfFromStack();
                    f2VarArr[1].finishFragment();
                    return;
                }
                f2VarArr[0].finishFragment();
                return;
            case 18:
                ArrayList arrayList10 = (ArrayList) this.f34161c;
                org.telegram.ui.zw zwVar4 = ((org.telegram.ui.qw) this.f34160b).f49166b;
                zwVar4.M4(true, true);
                zwVar4.z3();
                for (int i14 = 0; i14 < arrayList10.size(); i14++) {
                    long j10 = ((TLRPC.Dialog) arrayList10.get(i14)).f26964id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList10.get(i14);
                    if (zwVar4.getMessagesController().t2(j10) || zwVar4.getMessagesController().z2(j10)) {
                        org.telegram.messenger.qp messagesController2 = zwVar4.getMessagesController();
                        org.telegram.messenger.yr messagesStorage = messagesController2.getMessagesStorage();
                        org.telegram.messenger.rl rlVar = new org.telegram.messenger.rl(messagesController2, j10);
                        org.telegram.messenger.p5 p5Var = messagesStorage.f26723a;
                        org.telegram.messenger.a4 a4Var = new org.telegram.messenger.a4(messagesStorage, j10, rlVar, 5);
                        j10 = j10;
                        p5Var.c(a4Var);
                    }
                    zwVar4.getMessagesController().o3(j10, 0L);
                    org.telegram.messenger.qp messagesController3 = zwVar4.getMessagesController();
                    int i15 = dialog.top_message;
                    messagesController3.j3(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                }
                return;
            case 19:
                ((org.telegram.ui.qw) this.f34160b).d((org.telegram.messenger.vo) this.f34161c);
                return;
            case 20:
                org.telegram.ui.lx lxVar = (org.telegram.ui.lx) this.f34160b;
                org.telegram.ui.cn cnVar = lxVar.f47710a;
                yv0 yv0Var = new yv0(cnVar.getParentActivity(), lxVar.f47710a, org.telegram.messenger.ij.j1(((org.telegram.messenger.ij) this.f34161c).f23266k), null, cnVar.Z, cnVar.getResourceProvider());
                boolean U9 = cnVar.U9();
                yv0Var.f28688h0 = U9;
                yv0Var.f28696n = U9;
                cnVar.showDialog(yv0Var);
                return;
            case 21:
                org.telegram.ui.hy hyVar = (org.telegram.ui.hy) this.f34160b;
                hyVar.getClass();
                ((org.telegram.ui.ActionBar.u1) this.f34161c).dismiss();
                org.telegram.ui.iy iyVar = hyVar.E;
                org.telegram.ui.jy jyVar = iyVar.f46769c;
                org.telegram.messenger.c20 c20Var = jyVar.f47102x;
                if (c20Var != null) {
                    c20Var.a(jyVar.d);
                }
                iyVar.f46769c.finishFragment();
                return;
            case 22:
                org.telegram.ui.jz jzVar = (org.telegram.ui.jz) this.f34160b;
                org.telegram.ui.jy jyVar2 = new org.telegram.ui.jy(jzVar.f47114r, ((org.telegram.ui.bz) this.f34161c).f44183m);
                jyVar2.f47103y = new org.telegram.ui.ny(jzVar, 1);
                jyVar2.f47102x = new org.telegram.ui.ny(jzVar, 2);
                jzVar.presentFragment(jyVar2);
                return;
            case 23:
                org.telegram.ui.jz jzVar2 = (org.telegram.ui.jz) this.f34160b;
                jzVar2.h = false;
                jzVar2.f47115s = false;
                jzVar2.f47114r.f26079g = jzVar2.D;
                jzVar2.o0(true);
                jzVar2.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) this.f34161c).run();
                return;
            case 24:
                org.telegram.ui.jz jzVar3 = (org.telegram.ui.jz) this.f34160b;
                TLObject tLObject = (TLObject) this.f34161c;
                ArrayList arrayList11 = jzVar3.L;
                jzVar3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    jzVar3.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                    jzVar3.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                    arrayList11.clear();
                    arrayList11.addAll(tL_chatlists_exportedInvites.invites);
                    jzVar3.C0();
                }
                jzVar3.M = 0;
                return;
            case 25:
                org.telegram.ui.jz jzVar4 = (org.telegram.ui.jz) this.f34160b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f34161c;
                org.telegram.messenger.vo voVar = jzVar4.f47114r;
                if (u1Var != null) {
                    try {
                        u1Var.dismiss();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                jzVar4.getMessagesController().h4(voVar);
                org.telegram.messenger.yr messagesStorage2 = jzVar4.getMessagesStorage();
                messagesStorage2.f26723a.c(new org.telegram.messenger.zq(0, messagesStorage2, voVar));
                jzVar4.finishFragment();
                return;
            case 26:
                org.telegram.ui.jz jzVar5 = (org.telegram.ui.jz) this.f34160b;
                jzVar5.getClass();
                jzVar5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) this.f34161c).invite);
                return;
            case 27:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) this.f34160b;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) this.f34161c).enabled && !filtersSetupActivity.f41244y) {
                    filtersSetupActivity.f41244y = true;
                    filtersSetupActivity.f0(new org.telegram.ui.c00(filtersSetupActivity, 3));
                    return;
                }
                return;
            case 28:
                FiltersSetupActivity filtersSetupActivity2 = ((org.telegram.ui.h00) this.f34160b).f46189e;
                filtersSetupActivity2.getMessagesController().V0.remove((TLRPC.TL_dialogFilterSuggested) this.f34161c);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            default:
                ArrayList arrayList12 = (ArrayList) this.f34161c;
                ArrayList arrayList13 = ((org.telegram.ui.f40) this.f34160b).S3;
                for (int i16 = 0; i16 < arrayList13.size(); i16++) {
                    if (((org.telegram.ui.Components.voip.y) arrayList13.get(i16)).f39667x != null) {
                        arrayList12.remove(((org.telegram.ui.Components.voip.y) arrayList13.get(i16)).f39667x);
                    }
                }
                for (int i17 = 0; i17 < arrayList12.size(); i17++) {
                    org.telegram.messenger.s3 s3Var2 = (org.telegram.messenger.s3) arrayList12.get(i17);
                    if (s3Var2.f25413a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, s3Var2.f25414b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(s3Var2.f25413a, s3Var2.f25414b);
                    }
                }
                return;
        }
    }

    public h41(org.telegram.ui.st stVar, a0.h hVar, int i7) {
        this.f34159a = 12;
        this.f34160b = stVar;
        this.f34161c = hVar;
    }
}
