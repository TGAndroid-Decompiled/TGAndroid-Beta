package org.telegram.ui.Components;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.TreeSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.PremiumPreviewFragment;
public final class mf implements Runnable {
    public final int f37504a;
    public final Object f37505b;
    public final Object f37506c;

    public mf(int i7, Object obj, Object obj2) {
        this.f37504a = i7;
        this.f37505b = obj;
        this.f37506c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        float f10;
        boolean z10;
        String str;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f37504a) {
            case 0:
                rf rfVar = (rf) this.f37505b;
                rfVar.getClass();
                org.telegram.messenger.g0.E2((ji.p) this.f37506c);
                ChatActivityEnterView chatActivityEnterView = rfVar.f39168a;
                chatActivityEnterView.f32718t1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 1:
                ((tf) this.f37505b).onAnimationEnd((Animator) this.f37506c);
                return;
            case 2:
                og ogVar = (og) this.f37506c;
                ChatActivityEnterView chatActivityEnterView2 = ((rg) this.f37505b).Q0;
                chatActivityEnterView2.Y1 = chatActivityEnterView2.f32635i1.getAudioRightMs() - chatActivityEnterView2.f32635i1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView2.f32635i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView2.f32635i1.getAudioRightMs();
                if (B.I1) {
                    e0.g gVar = B.G1;
                    if (gVar != null) {
                        yi.j jVar = (yi.j) gVar.f10234e;
                        jVar.getClass();
                        yi.j.q();
                        if (jVar.G == 5) {
                            long j10 = jVar.j();
                            long max = Math.max(0L, Math.min(j10, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j10, audioRightMs));
                            j3 = audioRightMs;
                            if (max2 - max >= Math.min(jVar.f61360c, j10)) {
                                jVar.f61373r = max;
                                jVar.f61374s = max2;
                                l2.f0 f0Var = jVar.A;
                                if (f0Var != null) {
                                    f0Var.Z0(5, max);
                                }
                                jVar.f61362f.getClass();
                                jVar.m();
                                org.telegram.messenger.g0.g3(ogVar);
                                return;
                            }
                            i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.g3(ogVar);
                            return;
                        }
                    }
                    j3 = audioRightMs;
                    i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.g3(ogVar);
                    return;
                } else if (B.f22747k1 == null) {
                    org.telegram.messenger.g0.g3(ogVar);
                    return;
                } else {
                    B.N1.c(new org.telegram.messenger.j9(B, new org.telegram.messenger.ne(0, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.f22739g1)), audioLeftMs, audioRightMs, ogVar, 3));
                    return;
                }
            case 3:
                ((ui) this.f37505b).f30173b.removeView((hi.l3) this.f37506c);
                return;
            case 4:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f37506c;
                ((ui) this.f37505b).a(true);
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f37506c;
                if (!((ui) this.f37505b).J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            case 6:
                ui uiVar = (ui) this.f37505b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ni) this.f37506c).f37878c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                uiVar.D1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(uiVar.H3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.f26627b;
                if (tL_attachMenuBots != null) {
                    d02.getMessagesStorage().f27080a.c(new org.telegram.messenger.ek(d02.f26635e, 2, d02.f26624a, d02, tL_attachMenuBots));
                    return;
                }
                return;
            case 7:
                ui uiVar2 = (ui) this.f37505b;
                org.telegram.messenger.ri.d0(uiVar2.H3).H0(false, true, null);
                if (uiVar2.f40448w2 == uiVar2.f40444v2.get(((TLRPC.TL_attachMenuBot) this.f37506c).bot_id)) {
                    uiVar2.G1(uiVar2.f40386e2);
                    return;
                }
                return;
            case 8:
                ej ejVar = (ej) this.f37505b;
                ejVar.H = false;
                ejVar.I = (ArrayList) this.f37506c;
                ejVar.U();
                return;
            case 9:
                org.telegram.messenger.g0.g3(new mf(10, (uj) this.f37505b, ((tj) this.f37506c).run()));
                return;
            case 10:
                ((uj) this.f37505b).setStatus((CharSequence) this.f37506c);
                return;
            case 11:
                lk lkVar = (lk) this.f37505b;
                String str3 = (String) this.f37506c;
                lkVar.getClass();
                ArrayList arrayList = new ArrayList(lkVar.Y.f37538w.f34841e);
                if (lkVar.Y.f37538w.f34842f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) lkVar.Y.f37538w.h);
                }
                Utilities.f22809g.c(new org.telegram.ui.yn(lkVar, str3, !lkVar.S.isEmpty(), arrayList, 4));
                return;
            case 12:
                lk lkVar2 = (lk) this.f37505b;
                ArrayList arrayList2 = (ArrayList) this.f37506c;
                mk mkVar = lkVar2.Y;
                boolean z11 = mkVar.f37530c0;
                ak akVar = mkVar.f37536r;
                if (z11) {
                    v4.i0 adapter = akVar.getAdapter();
                    lk lkVar3 = mkVar.E;
                    if (adapter != lkVar3) {
                        akVar.setAdapter(lkVar3);
                    }
                }
                lkVar2.f37198s = arrayList2;
                lkVar2.f();
                return;
            case 13:
                ui uiVar3 = ((zk) this.f37505b).f37521b;
                uiVar3.dismiss();
                uiVar3.f40375a2.presentFragment(org.telegram.ui.bn.ua(((TLRPC.User) this.f37506c).f28580id));
                return;
            case 14:
                org.telegram.messenger.f3.n(null, 2131742957, new lc((zk) this.f37505b, (org.telegram.ui.ActionBar.h6) this.f37506c), 2131623994, 36);
                return;
            case 15:
                ml mlVar = (ml) this.f37505b;
                float[] fArr = (float[]) this.f37506c;
                mlVar.getClass();
                mlVar.h0(fArr[0], fArr[1]);
                return;
            case 16:
                mi miVar = (mi) this.f37506c;
                boolean z12 = ChatAttachAlertPhotoLayout.f32795r1;
                int currentItemTop = miVar.getCurrentItemTop();
                int listTopPadding = miVar.getListTopPadding();
                zl zlVar = ((ChatAttachAlertPhotoLayout) this.f37505b).F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                zlVar.scrollBy(0, listTopPadding);
                return;
            case 17:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37506c;
                gm gmVar = ((ChatAttachAlertPhotoLayout) this.f37505b).Q;
                if (gmVar != null) {
                    gmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 18:
                mi miVar2 = (mi) this.f37506c;
                int currentItemTop2 = miVar2.getCurrentItemTop();
                int listTopPadding2 = miVar2.getListTopPadding();
                di.b1 b1Var = ((rm) this.f37505b).f39271r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                b1Var.scrollBy(0, listTopPadding2);
                return;
            case 19:
                io.a(((go) this.f37505b).f35625c);
                ((kg.g) this.f37506c).run();
                return;
            case 20:
                ((jp) this.f37505b).f36586b.S0((ArrayList) this.f37506c);
                return;
            case 21:
                ((kp) this.f37505b).f36943b.S0((ArrayList) this.f37506c);
                return;
            case 22:
                ((org.telegram.ui.ActionBar.w2) this.f37505b).dismiss();
                vf.c.t((Context) this.f37506c, "https://t.me/BotFather?start=deletebot");
                return;
            case 23:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.f37505b;
                TreeSet treeSet = (TreeSet) this.f37506c;
                String charSequence = l3Var.getText().toString();
                if (!br.a(charSequence, "bot") && br.c(charSequence, treeSet) == null) {
                    str2 = "bot";
                }
                org.telegram.ui.Cells.j3 j3Var = l3Var.d;
                j3Var.setRightText(str2);
                int L = org.telegram.messenger.g0.L(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f10 = 21.0f;
                } else {
                    f10 = 63.0f;
                }
                j3Var.setPadding(0, L, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(15.0f));
                return;
            case 24:
                jr jrVar = (jr) this.f37505b;
                jrVar.getClass();
                ((hi.e) this.f37506c).setLoading(false);
                jrVar.dismiss();
                return;
            case 25:
                jr jrVar2 = (jr) this.f37505b;
                TLObject tLObject = (TLObject) this.f37506c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    jrVar2.X1 = groupcallstreamrtmpurl.url;
                    jrVar2.Y1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jrVar2.Y1);
                    jrVar2.Z1 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f35335a |= 256;
                    obj.f35336b = 0;
                    obj.f35337c = spannableStringBuilder.length();
                    jrVar2.Z1.setSpan(new gz0(obj, 0), 0, jrVar2.Z1.length(), 0);
                    jrVar2.f36592a2.O(false);
                    return;
                }
                return;
            case 26:
                js jsVar = (js) this.f37505b;
                TLObject tLObject2 = (TLObject) this.f37506c;
                gs gsVar = jsVar.f36598b;
                ArrayList arrayList3 = jsVar.h;
                int i7 = jsVar.f36597a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.mp.u1(i7).f4(popularappbots.users, false);
                    org.telegram.messenger.tr.a0(i7).m1(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    jsVar.f36602g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jsVar.f36600e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    jsVar.f36601f = currentTimeMillis;
                    if (!jsVar.f36603i) {
                        jsVar.f36603i = true;
                        String str5 = jsVar.f36602g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i10 = 0; i10 < arrayList3.size(); i10 = com.google.android.gms.internal.vision.e2.g(i10, 1, ((TLRPC.User) arrayList3.get(i10)).f28580id, arrayList4)) {
                        }
                        org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
                        a02.f27080a.c(new bi.o2(jsVar, a02, arrayList4, currentTimeMillis, str, 11));
                    }
                    jsVar.f36599c = false;
                    gsVar.run();
                    return;
                }
                jsVar.f36602g = null;
                jsVar.f36600e = true;
                jsVar.f36599c = false;
                gsVar.run();
                return;
            case 27:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f37506c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max3 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.g3(new mf(28, (et) this.f37505b, decodeFile));
                return;
            case 28:
                ((et) this.f37505b).setImage((Bitmap) this.f37506c);
                return;
            default:
                ((EditTextBoldCursor) this.f37505b).f32963p0.draw((Canvas) this.f37506c);
                return;
        }
    }
}
