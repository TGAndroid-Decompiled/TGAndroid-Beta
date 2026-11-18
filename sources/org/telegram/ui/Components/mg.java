package org.telegram.ui.Components;

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
import org.telegram.ui.PremiumPreviewFragment;
public final class mg implements Runnable {
    public final int f37462a;
    public final Object f37463b;
    public final Object f37464c;

    public mg(int i7, Object obj, Object obj2) {
        this.f37462a = i7;
        this.f37463b = obj;
        this.f37464c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        float f10;
        boolean z10;
        String str;
        boolean z11;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f37462a) {
            case 0:
                lg lgVar = (lg) this.f37464c;
                ChatActivityEnterView chatActivityEnterView = ((pg) this.f37463b).Q0;
                chatActivityEnterView.W1 = chatActivityEnterView.f32607i1.getAudioRightMs() - chatActivityEnterView.f32607i1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView.f32607i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView.f32607i1.getAudioRightMs();
                if (B.I1) {
                    e0.g gVar = B.G1;
                    if (gVar != null) {
                        yi.j jVar = (yi.j) gVar.f10208e;
                        jVar.getClass();
                        yi.j.q();
                        if (jVar.G == 5) {
                            long j10 = jVar.j();
                            long max = Math.max(0L, Math.min(j10, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j10, audioRightMs));
                            j3 = audioRightMs;
                            if (max2 - max >= Math.min(jVar.f61318c, j10)) {
                                jVar.f61331r = max;
                                jVar.f61332s = max2;
                                l2.f0 f0Var = jVar.A;
                                if (f0Var != null) {
                                    f0Var.Z0(5, max);
                                }
                                jVar.f61320f.getClass();
                                jVar.m();
                                org.telegram.messenger.g0.g3(lgVar);
                                return;
                            }
                            i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.g3(lgVar);
                            return;
                        }
                    }
                    j3 = audioRightMs;
                    i5.c.v(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.g3(lgVar);
                    return;
                } else if (B.f22722k1 == null) {
                    org.telegram.messenger.g0.g3(lgVar);
                    return;
                } else {
                    B.N1.c(new org.telegram.messenger.j9(B, new org.telegram.messenger.ne(0, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.f22714g1)), audioLeftMs, audioRightMs, lgVar, 3));
                    return;
                }
            case 1:
                ((si) this.f37463b).f30192b.removeView((hi.m3) this.f37464c);
                return;
            case 2:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f37464c;
                ((si) this.f37463b).a(true);
                if (h2Var != null) {
                    h2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f37464c;
                if (!((si) this.f37463b).J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            case 4:
                si siVar = (si) this.f37463b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((li) this.f37464c).f37130c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                siVar.D1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(siVar.H3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.f26601b;
                if (tL_attachMenuBots != null) {
                    d02.getMessagesStorage().f27054a.c(new org.telegram.messenger.ek(d02.f26609e, 2, d02.f26598a, d02, tL_attachMenuBots));
                    return;
                }
                return;
            case 5:
                si siVar2 = (si) this.f37463b;
                org.telegram.messenger.ri.d0(siVar2.H3).H0(false, true, null);
                if (siVar2.f39732w2 == siVar2.f39728v2.get(((TLRPC.TL_attachMenuBot) this.f37464c).bot_id)) {
                    siVar2.G1(siVar2.f39670e2);
                    return;
                }
                return;
            case 6:
                cj cjVar = (cj) this.f37463b;
                cjVar.H = false;
                cjVar.I = (ArrayList) this.f37464c;
                cjVar.U();
                return;
            case 7:
                org.telegram.messenger.g0.g3(new mg(8, (sj) this.f37463b, ((rj) this.f37464c).run()));
                return;
            case 8:
                ((sj) this.f37463b).setStatus((CharSequence) this.f37464c);
                return;
            case 9:
                jk jkVar = (jk) this.f37463b;
                String str3 = (String) this.f37464c;
                jkVar.getClass();
                ArrayList arrayList = new ArrayList(jkVar.Y.f36783w.f34040e);
                if (jkVar.Y.f36783w.f34041f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) jkVar.Y.f36783w.h);
                }
                Utilities.f22784g.c(new org.telegram.ui.yn(jkVar, str3, !jkVar.S.isEmpty(), arrayList, 4));
                return;
            case 10:
                jk jkVar2 = (jk) this.f37463b;
                ArrayList arrayList2 = (ArrayList) this.f37464c;
                kk kkVar = jkVar2.Y;
                boolean z12 = kkVar.f36775c0;
                yj yjVar = kkVar.f36781r;
                if (z12) {
                    v4.i0 adapter = yjVar.getAdapter();
                    jk jkVar3 = kkVar.E;
                    if (adapter != jkVar3) {
                        yjVar.setAdapter(jkVar3);
                    }
                }
                jkVar2.f36452s = arrayList2;
                jkVar2.f();
                return;
            case 11:
                si siVar3 = ((xk) this.f37463b).f36766b;
                siVar3.dismiss();
                siVar3.f39659a2.presentFragment(org.telegram.ui.bn.ua(((TLRPC.User) this.f37464c).f28554id));
                return;
            case 12:
                org.telegram.messenger.f3.n(null, 2131742963, new lc((xk) this.f37463b, (org.telegram.ui.ActionBar.i6) this.f37464c), 2131623994, 36);
                return;
            case 13:
                kl klVar = (kl) this.f37463b;
                float[] fArr = (float[]) this.f37464c;
                klVar.getClass();
                klVar.h0(fArr[0], fArr[1]);
                return;
            case 14:
                ki kiVar = (ki) this.f37464c;
                boolean z13 = ChatAttachAlertPhotoLayout.f32762r1;
                int currentItemTop = kiVar.getCurrentItemTop();
                int listTopPadding = kiVar.getListTopPadding();
                xl xlVar = ((ChatAttachAlertPhotoLayout) this.f37463b).F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                xlVar.scrollBy(0, listTopPadding);
                return;
            case 15:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37464c;
                em emVar = ((ChatAttachAlertPhotoLayout) this.f37463b).Q;
                if (emVar != null) {
                    emVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 16:
                ki kiVar2 = (ki) this.f37464c;
                int currentItemTop2 = kiVar2.getCurrentItemTop();
                int listTopPadding2 = kiVar2.getListTopPadding();
                di.b1 b1Var = ((pm) this.f37463b).f38487r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                b1Var.scrollBy(0, listTopPadding2);
                return;
            case 17:
                go.a(((eo) this.f37463b).f34775c);
                ((kg.g) this.f37464c).run();
                return;
            case 18:
                ((hp) this.f37463b).f35946b.S0((ArrayList) this.f37464c);
                return;
            case 19:
                ((ip) this.f37463b).f36162b.S0((ArrayList) this.f37464c);
                return;
            case 20:
                ((org.telegram.ui.ActionBar.x2) this.f37463b).dismiss();
                vf.c.t((Context) this.f37464c, "https://t.me/BotFather?start=deletebot");
                return;
            case 21:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.f37463b;
                TreeSet treeSet = (TreeSet) this.f37464c;
                String charSequence = k3Var.getText().toString();
                if (!zq.a(charSequence, "bot") && zq.c(charSequence, treeSet) == null) {
                    str2 = "bot";
                }
                org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                i3Var.setRightText(str2);
                int L = org.telegram.messenger.g0.L(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f10 = 21.0f;
                } else {
                    f10 = 63.0f;
                }
                i3Var.setPadding(0, L, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(15.0f));
                return;
            case 22:
                hr hrVar = (hr) this.f37463b;
                hrVar.getClass();
                ((hi.d) this.f37464c).setLoading(false);
                hrVar.dismiss();
                return;
            case 23:
                hr hrVar2 = (hr) this.f37463b;
                TLObject tLObject = (TLObject) this.f37464c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    hrVar2.X1 = groupcallstreamrtmpurl.url;
                    hrVar2.Y1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hrVar2.Y1);
                    hrVar2.Z1 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f34537a |= 256;
                    obj.f34538b = 0;
                    obj.f34539c = spannableStringBuilder.length();
                    hrVar2.Z1.setSpan(new ez0(obj, 0), 0, hrVar2.Z1.length(), 0);
                    hrVar2.f35952a2.O(false);
                    return;
                }
                return;
            case 24:
                hs hsVar = (hs) this.f37463b;
                TLObject tLObject2 = (TLObject) this.f37464c;
                es esVar = hsVar.f35958b;
                ArrayList arrayList3 = hsVar.h;
                int i7 = hsVar.f35957a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.mp.u1(i7).f4(popularappbots.users, false);
                    org.telegram.messenger.tr.a0(i7).m1(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    hsVar.f35962g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hsVar.f35960e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    hsVar.f35961f = currentTimeMillis;
                    if (hsVar.f35963i) {
                        z11 = false;
                    } else {
                        hsVar.f35963i = true;
                        String str5 = hsVar.f35962g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int i10 = 0;
                        while (i10 < arrayList3.size()) {
                            i10 = com.google.android.gms.internal.vision.e2.g(i10, 1, ((TLRPC.User) arrayList3.get(i10)).f28554id, arrayList4);
                            arrayList3 = arrayList3;
                        }
                        org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i7);
                        a02.f27054a.c(new bi.k2(hsVar, a02, arrayList4, currentTimeMillis, str, 11));
                        z11 = false;
                    }
                    hsVar.f35959c = z11;
                    esVar.run();
                    return;
                }
                hsVar.f35962g = null;
                hsVar.f35960e = true;
                hsVar.f35959c = false;
                esVar.run();
                return;
            case 25:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f37464c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max3 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.g3(new mg(26, (ct) this.f37463b, decodeFile));
                return;
            case 26:
                ((ct) this.f37463b).setImage((Bitmap) this.f37464c);
                return;
            case 27:
                ((EditTextBoldCursor) this.f37463b).f32930p0.draw((Canvas) this.f37464c);
                return;
            case 28:
                org.telegram.messenger.mp.u1(((mu) this.f37463b).f37627a.f30189a).t5((TLRPC.EmojiStatus) this.f37464c, null);
                return;
            default:
                org.telegram.messenger.mp.u1(((nw) this.f37463b).f37866a.f39345d1).t5((TLRPC.EmojiStatus) this.f37464c, null);
                return;
        }
    }
}
