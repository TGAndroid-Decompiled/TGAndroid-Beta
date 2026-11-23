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
public final class xd implements Runnable {
    public final int f41983a;
    public final Object f41984b;
    public final Object f41985c;

    public xd(int i7, Object obj, Object obj2) {
        this.f41983a = i7;
        this.f41984b = obj;
        this.f41985c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        float f10;
        boolean z10;
        String str;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f41983a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f41984b;
                int i7 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.setFieldText((CharSequence) this.f41985c);
                chatActivityEnterView.f32635a0 = null;
                return;
            case 1:
                ((ji.h) this.f41984b).a((ai.c) this.f41985c);
                return;
            case 2:
                qf qfVar = (qf) this.f41984b;
                qfVar.getClass();
                org.telegram.messenger.g0.E2((ji.o) this.f41985c);
                ChatActivityEnterView chatActivityEnterView2 = qfVar.f38823a;
                chatActivityEnterView2.f32785t1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView2.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 3:
                ((sf) this.f41984b).onAnimationEnd((Animator) this.f41985c);
                return;
            case 4:
                ng ngVar = (ng) this.f41985c;
                ChatActivityEnterView chatActivityEnterView3 = ((qg) this.f41984b).Q0;
                chatActivityEnterView3.Y1 = chatActivityEnterView3.f32702i1.getAudioRightMs() - chatActivityEnterView3.f32702i1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView3.f32702i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView3.f32702i1.getAudioRightMs();
                if (B.I1) {
                    e0.g gVar = B.G1;
                    if (gVar != null) {
                        yi.j jVar = (yi.j) gVar.f10198e;
                        jVar.getClass();
                        yi.j.q();
                        if (jVar.G == 5) {
                            long j10 = jVar.j();
                            long max = Math.max(0L, Math.min(j10, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j10, audioRightMs));
                            j3 = audioRightMs;
                            if (max2 - max >= Math.min(jVar.f61448c, j10)) {
                                jVar.f61461r = max;
                                jVar.f61462s = max2;
                                l2.g0 g0Var = jVar.A;
                                if (g0Var != null) {
                                    g0Var.Z0(5, max);
                                }
                                jVar.f61450f.getClass();
                                jVar.m();
                                org.telegram.messenger.g0.g3(ngVar);
                                return;
                            }
                            i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.g3(ngVar);
                            return;
                        }
                    }
                    j3 = audioRightMs;
                    i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.g3(ngVar);
                    return;
                } else if (B.f22817k1 == null) {
                    org.telegram.messenger.g0.g3(ngVar);
                    return;
                } else {
                    B.N1.c(new org.telegram.messenger.j9(B, new org.telegram.messenger.ne(0, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.f22809g1)), audioLeftMs, audioRightMs, ngVar, 3));
                    return;
                }
            case 5:
                ((ti) this.f41984b).f30226b.removeView((hi.u3) this.f41985c);
                return;
            case 6:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f41985c;
                ((ti) this.f41984b).a(true);
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f41985c;
                if (!((ti) this.f41984b).J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            case 8:
                ti tiVar = (ti) this.f41984b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((mi) this.f41985c).f37459c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                tiVar.D1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(tiVar.H3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.f26700b;
                if (tL_attachMenuBots != null) {
                    d02.getMessagesStorage().f27149a.c(new org.telegram.messenger.ek(d02.f26708e, 2, d02.f26697a, d02, tL_attachMenuBots));
                    return;
                }
                return;
            case 9:
                ti tiVar2 = (ti) this.f41984b;
                org.telegram.messenger.ri.d0(tiVar2.H3).H0(false, true, null);
                if (tiVar2.f40029w2 == tiVar2.f40025v2.get(((TLRPC.TL_attachMenuBot) this.f41985c).bot_id)) {
                    tiVar2.G1(tiVar2.f39967e2);
                    return;
                }
                return;
            case 10:
                dj djVar = (dj) this.f41984b;
                djVar.H = false;
                djVar.I = (ArrayList) this.f41985c;
                djVar.U();
                return;
            case 11:
                org.telegram.messenger.g0.g3(new xd(12, (tj) this.f41984b, ((sj) this.f41985c).run()));
                return;
            case 12:
                ((tj) this.f41984b).setStatus((CharSequence) this.f41985c);
                return;
            case 13:
                jk jkVar = (jk) this.f41984b;
                String str3 = (String) this.f41985c;
                jkVar.getClass();
                ArrayList arrayList = new ArrayList(jkVar.Y.f36768w.f34376e);
                if (jkVar.Y.f36768w.f34377f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) jkVar.Y.f36768w.h);
                }
                Utilities.f22879g.c(new org.telegram.ui.xn(jkVar, str3, !jkVar.S.isEmpty(), arrayList, 4));
                return;
            case 14:
                jk jkVar2 = (jk) this.f41984b;
                ArrayList arrayList2 = (ArrayList) this.f41985c;
                kk kkVar = jkVar2.Y;
                boolean z11 = kkVar.f36760c0;
                zj zjVar = kkVar.f36766r;
                if (z11) {
                    v4.i0 adapter = zjVar.getAdapter();
                    jk jkVar3 = kkVar.E;
                    if (adapter != jkVar3) {
                        zjVar.setAdapter(jkVar3);
                    }
                }
                jkVar2.f36451s = arrayList2;
                jkVar2.f();
                return;
            case 15:
                ti tiVar3 = ((xk) this.f41984b).f37135b;
                tiVar3.dismiss();
                tiVar3.f39956a2.presentFragment(org.telegram.ui.bn.ua(((TLRPC.User) this.f41985c).f28641id));
                return;
            case 16:
                org.telegram.messenger.f3.n(null, 2131742950, new kc((xk) this.f41984b, (org.telegram.ui.ActionBar.i6) this.f41985c), 2131623994, 36);
                return;
            case 17:
                kl klVar = (kl) this.f41984b;
                float[] fArr = (float[]) this.f41985c;
                klVar.getClass();
                klVar.h0(fArr[0], fArr[1]);
                return;
            case 18:
                li liVar = (li) this.f41985c;
                boolean z12 = ChatAttachAlertPhotoLayout.f32862r1;
                int currentItemTop = liVar.getCurrentItemTop();
                int listTopPadding = liVar.getListTopPadding();
                xl xlVar = ((ChatAttachAlertPhotoLayout) this.f41984b).F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                xlVar.scrollBy(0, listTopPadding);
                return;
            case 19:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41985c;
                em emVar = ((ChatAttachAlertPhotoLayout) this.f41984b).Q;
                if (emVar != null) {
                    emVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 20:
                li liVar2 = (li) this.f41985c;
                int currentItemTop2 = liVar2.getCurrentItemTop();
                int listTopPadding2 = liVar2.getListTopPadding();
                di.b1 b1Var = ((pm) this.f41984b).f38510r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                b1Var.scrollBy(0, listTopPadding2);
                return;
            case 21:
                fo.a(((co) this.f41984b).f34099c);
                ((kg.g) this.f41985c).run();
                return;
            case 22:
                ((gp) this.f41984b).f35510b.S0((ArrayList) this.f41985c);
                return;
            case 23:
                ((hp) this.f41984b).f35783b.S0((ArrayList) this.f41985c);
                return;
            case 24:
                ((org.telegram.ui.ActionBar.w2) this.f41984b).dismiss();
                vf.c.t((Context) this.f41985c, "https://t.me/BotFather?start=deletebot");
                return;
            case 25:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.f41984b;
                TreeSet treeSet = (TreeSet) this.f41985c;
                String charSequence = l3Var.getText().toString();
                if (!yq.a(charSequence, "bot") && yq.c(charSequence, treeSet) == null) {
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
            case 26:
                gr grVar = (gr) this.f41984b;
                grVar.getClass();
                ((hi.e) this.f41985c).setLoading(false);
                grVar.dismiss();
                return;
            case 27:
                gr grVar2 = (gr) this.f41984b;
                TLObject tLObject = (TLObject) this.f41985c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    grVar2.X1 = groupcallstreamrtmpurl.url;
                    grVar2.Y1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(grVar2.Y1);
                    grVar2.Z1 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f34924a |= 256;
                    obj.f34925b = 0;
                    obj.f34926c = spannableStringBuilder.length();
                    grVar2.Z1.setSpan(new fz0(obj, 0), 0, grVar2.Z1.length(), 0);
                    grVar2.f35519a2.O(false);
                    return;
                }
                return;
            case 28:
                gs gsVar = (gs) this.f41984b;
                TLObject tLObject2 = (TLObject) this.f41985c;
                ds dsVar = gsVar.f35524b;
                ArrayList arrayList3 = gsVar.h;
                int i10 = gsVar.f35523a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.mp.u1(i10).f4(popularappbots.users, false);
                    org.telegram.messenger.tr.a0(i10).m1(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    gsVar.f35528g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gsVar.f35526e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    gsVar.f35527f = currentTimeMillis;
                    if (!gsVar.f35529i) {
                        gsVar.f35529i = true;
                        String str5 = gsVar.f35528g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i11 = 0; i11 < arrayList3.size(); i11 = com.google.android.gms.internal.vision.e2.g(i11, 1, ((TLRPC.User) arrayList3.get(i11)).f28641id, arrayList4)) {
                        }
                        org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i10);
                        a02.f27149a.c(new bi.q2(gsVar, a02, arrayList4, currentTimeMillis, str, 11));
                    }
                    gsVar.f35525c = false;
                    dsVar.run();
                    return;
                }
                gsVar.f35528g = null;
                gsVar.f35526e = true;
                gsVar.f35525c = false;
                dsVar.run();
                return;
            default:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f41985c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max3 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.g3(new bt(0, (ct) this.f41984b, decodeFile));
                return;
        }
    }
}
