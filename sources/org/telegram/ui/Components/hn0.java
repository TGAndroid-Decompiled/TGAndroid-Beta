package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PremiumPreviewFragment;
public final class hn0 implements Runnable {
    public final int f35934a;
    public final Object f35935b;
    public final Object f35936c;

    public hn0(int i7, Object obj, Object obj2) {
        this.f35934a = i7;
        this.f35935b = obj;
        this.f35936c = obj2;
    }

    @Override
    public final void run() {
        int i7;
        long j3;
        int i10;
        String str;
        ArrayList arrayList;
        ck0 ck0Var;
        int i11 = 2;
        ArrayList arrayList2 = null;
        int i12 = 0;
        switch (this.f35934a) {
            case 0:
                xe xeVar = (xe) this.f35935b;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.f35936c;
                if (bnVar != null) {
                    bnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    xeVar.dismiss();
                    return;
                }
                return;
            case 1:
                ((WindowManager) this.f35936c).removeView(((xe) this.f35935b).B);
                return;
            case 2:
                yo0 yo0Var = (yo0) this.f35935b;
                TLObject tLObject = (TLObject) this.f35936c;
                if (tLObject != null) {
                    yo0Var.f42558g2 = (TLRPC.TL_exportedMessageLink) tLObject;
                    yo0Var.b1();
                    if (yo0Var.f42560i2) {
                        yo0Var.N0();
                    }
                }
                yo0Var.f42559h2 = false;
                return;
            case 3:
                fi.i6 i6Var = (fi.i6) this.f35936c;
                hq0 hq0Var = ((gt0) this.f35935b).f35576c0;
                if (hq0Var != null) {
                    int i13 = i6Var.f12109a;
                    hq0Var.f50337b.e(i13, hq0Var.d.i(i13));
                    return;
                }
                return;
            case 4:
                bs0 bs0Var = (bs0) this.f35935b;
                bi.p2 p2Var = (bi.p2) this.f35936c;
                bs0Var.G = null;
                bs0Var.H = null;
                p2Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new q60(p2Var, 20)).start();
                return;
            case 5:
                di.o8 o8Var = (di.o8) this.f35935b;
                o8Var.f9461e = !o8Var.f9461e;
                ((Runnable[]) this.f35936c)[0].run();
                o8Var.k(true);
                return;
            case 6:
                lc.b0(((sr0) this.f35935b).f39833f.f35642y1).Q(2131623990, 36, org.telegram.messenger.gd.a0(null, null, 2131742578, ((TLRPC.Chat) this.f35936c).title)).k(true);
                return;
            case 7:
                ds0 ds0Var = (ds0) this.f35935b;
                String str2 = (String) this.f35936c;
                if (!ds0Var.f34499w.f35636w1[ds0Var.f34497r].f41412a.isEmpty() && ((i7 = ds0Var.f34497r) == 1 || i7 == 4)) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, ds0Var.f34499w.f35636w1[i7].f41412a);
                    int e12 = fjVar.e1();
                    long B0 = org.telegram.messenger.fj.B0(fjVar.f23965k);
                    gt0 gt0Var = ds0Var.f34499w;
                    if (gt0Var.f35606m1 == gt0Var.f35642y1.getUserConfig().e()) {
                        j3 = fjVar.P1();
                    } else {
                        j3 = 0;
                    }
                    ds0Var.F(e12, B0, j3, str2);
                    ds0Var = ds0Var;
                } else if (ds0Var.f34497r == 3) {
                    gt0 gt0Var2 = ds0Var.f34499w;
                    ds0Var.F(0, gt0Var2.f35606m1, gt0Var2.G, str2);
                }
                int i14 = ds0Var.f34497r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(ds0Var.f34499w.f35636w1[ds0Var.f34497r].f41412a);
                    ds0Var.f34498s++;
                    Utilities.f22781g.c(new k7(ds0Var, str2, arrayList3, 29));
                    return;
                }
                return;
            case 8:
                ds0 ds0Var2 = (ds0) this.f35935b;
                ArrayList arrayList4 = (ArrayList) this.f35936c;
                gt0 gt0Var3 = ds0Var2.f34499w;
                boolean z10 = gt0Var3.Y0;
                bs0[] bs0VarArr = gt0Var3.f35609n0;
                if (z10) {
                    ds0Var2.f34498s--;
                    int b10 = ds0Var2.b();
                    ds0Var2.d = arrayList4;
                    int b11 = ds0Var2.b();
                    if (ds0Var2.f34498s == 0 || b11 != 0) {
                        gt0Var3.B1(false);
                    }
                    for (int i15 = 0; i15 < bs0VarArr.length; i15++) {
                        bs0 bs0Var2 = bs0VarArr[i15];
                        if (bs0Var2.F == ds0Var2.f34497r) {
                            if (ds0Var2.f34498s == 0 && b11 == 0) {
                                bs0Var2.f33774w.d.setText(org.telegram.messenger.gd.M0(2131747975, "NoResult"));
                                bs0VarArr[i15].f33774w.f36897f.setVisibility(8);
                                bs0VarArr[i15].f33774w.e(false, true);
                            } else if (b10 == 0) {
                                gt0Var3.D(bs0Var2.h, 0, null);
                            }
                        }
                    }
                    ds0Var2.f();
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(org.telegram.messenger.j10.f24770t0);
                Boolean bool = Boolean.FALSE;
                f10.m(217, bool, (TLObject) this.f35935b, (TLRPC.Document) this.f35936c, null, bool);
                return;
            case 10:
                org.telegram.messenger.mp.u1(((uw0) this.f35935b).f40428a.f42643a).t5((TLRPC.EmojiStatus) this.f35936c, null);
                return;
            case 11:
                z11 z11Var = (z11) this.f35935b;
                org.telegram.messenger.mp.u1(z11Var.f42735e).f25769t7.d((ArrayList) this.f35936c, -z11Var.f42737f);
                int i16 = z11.m0;
                return;
            case 12:
                z11 z11Var2 = (z11) this.f35935b;
                z11Var2.getClass();
                org.telegram.messenger.mp.u1(z11Var2.f42735e).b3(0, ((TLRPC.Updates) this.f35936c).chats.get(0).f28403id, true);
                return;
            case 13:
                org.telegram.messenger.ks ksVar = (org.telegram.messenger.ks) this.f35935b;
                e21 e21Var = (e21) this.f35936c;
                ksVar.n(e21Var, 142);
                ksVar.n(e21Var, 143);
                return;
            case 14:
                org.telegram.ui.Cells.m1 m1Var = (org.telegram.ui.Cells.m1) this.f35935b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f35936c;
                if (m1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    m1Var.h0(i11);
                    return;
                }
                return;
            case 15:
                y21 y21Var = (y21) this.f35935b;
                TLObject tLObject2 = (TLObject) this.f35936c;
                org.telegram.messenger.ut utVar = y21Var.f42280t1;
                y21Var.f42274m1 = null;
                if (tLObject2 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject2;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        y21Var.P1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (utVar != null) {
                            utVar.set(richMessage);
                            y21Var.I1.D(utVar);
                            return;
                        }
                        return;
                    }
                }
                if (y21Var.P1) {
                    y21Var.dismiss();
                    org.telegram.messenger.ks.e().k(295, 1, org.telegram.messenger.gd.M0(2131743709, null));
                    return;
                }
                org.telegram.messenger.f3.o(null, 2131743709, new lc((FrameLayout) y21Var.f30190b, y21Var.J0), null);
                u21 u21Var = y21Var.f42284x1.f41546e;
                String str3 = y21Var.f42283w1;
                y21Var.f42282v1 = str3;
                u21Var.setText(y21.P0(str3, null, null));
                return;
            case 16:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.f35935b;
                ((org.telegram.ui.ActionBar.h1) this.f35936c).d(true);
                p31.a(ckVar.getContext(), ckVar.d);
                return;
            case 17:
                ((org.telegram.messenger.z00) this.f35936c).J(((org.telegram.ui.ck) this.f35935b).f38256b, false, false);
                return;
            case 18:
                UndoView undoView = (UndoView) this.f35935b;
                TLObject tLObject3 = (TLObject) this.f35936c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.f33188s.presentFragment(new org.telegram.ui.ml0((TLRPC.PaymentReceipt) tLObject3));
                    return;
                }
                int i17 = UndoView.f33171j0;
                undoView.getClass();
                return;
            case 19:
                ((l41) this.f35935b).E.onClick((org.telegram.ui.Cells.r8) this.f35936c);
                return;
            case 20:
                f61 f61Var = (f61) this.f35935b;
                e2.v0 v0Var = (e2.v0) this.f35936c;
                Throwable cause = v0Var.getCause();
                if ((cause instanceof u2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.mp.g1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = f61.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = f61Var.O;
                    if (arrayList5 != null) {
                        int i18 = 0;
                        while (i18 < arrayList5.size()) {
                            c61 c61Var = (c61) arrayList5.get(i18);
                            int i19 = 0;
                            while (true) {
                                ArrayList arrayList6 = c61Var.d;
                                if (i19 < arrayList6.size()) {
                                    e61 e61Var = (e61) arrayList6.get(i19);
                                    if (!TextUtils.isEmpty(e61Var.f34632m) && !f61.D0(e61Var.f34632m)) {
                                        arrayList6.remove(i19);
                                        i19--;
                                    }
                                    i19++;
                                } else {
                                    if (arrayList6.isEmpty()) {
                                        arrayList5.remove(i18);
                                        i18--;
                                    }
                                    i18++;
                                }
                            }
                        }
                        arrayList2 = arrayList5;
                    }
                    f61Var.O = arrayList2;
                    if (arrayList2 != null) {
                        f61Var.k0(arrayList2, f61Var.P);
                        return;
                    }
                    return;
                }
                TextureView textureView = f61Var.f34976n;
                if (textureView != null && ((!f61Var.F && (cause instanceof u2.p)) || (cause instanceof d3.u))) {
                    f61Var.F = true;
                    if (f61Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(f61Var.f34976n);
                            viewGroup.removeView(f61Var.f34976n);
                            viewGroup.addView(f61Var.f34976n, indexOfChild);
                        }
                        org.telegram.messenger.r5 r5Var = f61Var.f34963b;
                        if (r5Var != null) {
                            r5Var.postRunnable(new t51(f61Var, 1));
                            return;
                        }
                        l2.f0 f0Var = f61Var.d;
                        TextureView textureView2 = f61Var.f34976n;
                        f0Var.F1();
                        if (textureView2 != null && textureView2 == f0Var.X) {
                            f0Var.F1();
                            f0Var.s1();
                            f0Var.x1(null);
                            f0Var.q1(0, 0);
                        }
                        f61Var.d.z1(f61Var.f34976n);
                        ArrayList arrayList7 = f61Var.O;
                        if (arrayList7 != null) {
                            f61Var.k0(arrayList7, f61Var.P);
                        } else if (f61Var.V) {
                            f61Var.l0(f61Var.R, f61Var.T, f61Var.S, f61Var.U);
                        } else {
                            f61Var.j0(f61Var.R, f61Var.T);
                        }
                        f61Var.h0();
                        return;
                    }
                    return;
                }
                f61Var.K.onError(f61Var, v0Var);
                return;
            case 21:
                ((f61) ((oi.a6) this.f35935b).f21940f).L.x(true, (float[]) this.f35936c);
                return;
            case 22:
                l61 l61Var = (l61) this.f35935b;
                Bitmap bitmap = (Bitmap) this.f35936c;
                if (bitmap != null) {
                    if (l61Var.f37057x != null) {
                        Bitmap bitmap2 = l61Var.f37056w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        l61Var.f37056w = l61Var.f37057x;
                    }
                    l61Var.f37057x = bitmap;
                    Bitmap bitmap3 = l61Var.f37057x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    l61Var.H = bitmapShader;
                    bitmapShader.setLocalMatrix(l61Var.M);
                    l61Var.K.setShader(l61Var.H);
                    l61Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i10 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = l61Var.getLayoutParams();
                    if (l61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i10) {
                        layoutParams.width = L;
                        layoutParams.height = i10;
                        l61Var.setVisibility(0);
                        l61Var.requestLayout();
                    }
                }
                l61Var.f37049f = null;
                return;
            case 23:
                final v71 v71Var = (v71) this.f35935b;
                v71Var.f40523e.f41594b.evaluateJavascript((String) this.f35936c, new ValueCallback() {
                    @Override
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        v71 v71Var2 = v71.this;
                        String[] strArr = v71Var2.f40522c;
                        String str5 = strArr[0];
                        String str6 = v71Var2.d;
                        strArr[0] = str5.replace(str6, "/signature/" + str4.substring(1, str4.length() - 1));
                        v71Var2.f40521b.countDown();
                    }
                });
                return;
            case 24:
                ((org.telegram.ui.Components.voip.q) this.f35935b).f41130a.setOnClickListener((View.OnClickListener) this.f35936c);
                return;
            case 25:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.f35935b;
                Bitmap bitmap4 = (Bitmap) this.f35936c;
                HashMap hashMap2 = yVar.G.h;
                org.telegram.messenger.u3 u3Var = yVar.f41356x;
                boolean z11 = u3Var.f27118b;
                TLRPC.GroupCallParticipant groupCallParticipant = u3Var.f27117a;
                if (z11) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap2.put(str, bitmap4);
                return;
            case 26:
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.f35936c;
                ((org.telegram.ui.Components.voip.k0) this.f35935b).getClass();
                yVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.w(yVar2, 4)).setDuration(150L).start();
                return;
            case 27:
                ck0 ck0Var2 = (ck0) this.f35935b;
                Object obj = this.f35936c;
                if (ck0Var2 != null) {
                    ck0Var2.setOnItemClickListener((oj0) obj);
                    return;
                }
                return;
            case 28:
                ck ckVar2 = (ck) this.f35935b;
                String lowerCase = ((String) this.f35936c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new hn0(29, ckVar2, new ArrayList()));
                    return;
                }
                String M3 = org.telegram.messenger.g0.M3(lowerCase);
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = ckVar2.f34041f;
                int size = arrayList9.size();
                while (i12 < size) {
                    Object obj2 = arrayList9.get(i12);
                    i12++;
                    org.telegram.ui.ps psVar = (org.telegram.ui.ps) obj2;
                    String str4 = psVar.f50920a;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = org.telegram.messenger.g0.M3(psVar.f50920a).toLowerCase();
                    String str6 = psVar.f50921b;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = org.telegram.messenger.g0.M3(psVar.f50921b).toLowerCase();
                    String str7 = psVar.f50922c;
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        str5 = "+".concat(str7);
                    }
                    if (!lowerCase2.startsWith(lowerCase)) {
                        arrayList = arrayList9;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(M3) && !lowerCase3.contains(" ".concat(M3)) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(M3) && !lowerCase5.contains(" ".concat(M3)) && !str7.startsWith(lowerCase) && !str5.startsWith(lowerCase)) {
                            arrayList9 = arrayList;
                        }
                    } else {
                        arrayList = arrayList9;
                    }
                    arrayList8.add(psVar);
                    arrayList9 = arrayList;
                }
                org.telegram.messenger.g0.g3(new hn0(29, ckVar2, arrayList8));
                return;
            default:
                ck ckVar3 = (ck) this.f35935b;
                ArrayList arrayList10 = (ArrayList) this.f35936c;
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) ckVar3.f34042n;
                if (tsVar.f52344f) {
                    ckVar3.f34040e = arrayList10;
                    if (tsVar.f52343e && (ck0Var = tsVar.f52340a) != null) {
                        v4.i0 adapter = ck0Var.getAdapter();
                        ck ckVar4 = tsVar.d;
                        if (adapter != ckVar4) {
                            tsVar.f52340a.setAdapter(ckVar4);
                            tsVar.f52340a.setFastScrollVisible(false);
                        }
                    }
                    ckVar3.f();
                    return;
                }
                return;
        }
    }

    public hn0(Object obj, Object obj2, Object obj3, int i7) {
        this.f35934a = i7;
        this.f35935b = obj;
        this.f35936c = obj2;
    }
}
