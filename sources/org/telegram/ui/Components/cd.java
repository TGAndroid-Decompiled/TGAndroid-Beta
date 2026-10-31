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
public final class cd implements Runnable {
    public final int f25054a;
    public final Object f25055b;
    public final Object f25056c;

    public cd(int i10, Object obj, Object obj2) {
        this.f25054a = i10;
        this.f25055b = obj;
        this.f25056c = obj2;
    }

    @Override
    public final void run() {
        long j10;
        float f7;
        boolean z10;
        String str;
        boolean z11;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f25054a) {
            case 0:
                int i10 = ChatActivityEnterView.f23672s5;
                ((ChatActivityEnterView) this.f25055b).removeView((vh.p2) this.f25056c);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25055b;
                if (chatActivityEnterView.Y4 == ((z60) this.f25056c)) {
                    chatActivityEnterView.Y4 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f25055b;
                int i11 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView2.setFieldText((CharSequence) this.f25056c);
                chatActivityEnterView2.W = null;
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.f25055b;
                int i12 = ChatActivityEnterView.f23672s5;
                ((tc) this.f25056c).run();
                org.telegram.messenger.js.o(chatActivityEnterView3.Q, chatActivityEnterView3.Q2);
                return;
            case 4:
                tf tfVar = (tf) this.f25056c;
                ChatActivityEnterView chatActivityEnterView4 = ((wf) this.f25055b).f32162b0;
                chatActivityEnterView4.f23725i1 = chatActivityEnterView4.f23719h1.getAudioRightMs() - chatActivityEnterView4.f23719h1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView4.f23719h1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView4.f23719h1.getAudioRightMs();
                if (B.G1) {
                    e0.h hVar = B.E1;
                    if (hVar != null) {
                        ki.k kVar = (ki.k) hVar.e;
                        kVar.getClass();
                        ki.k.q();
                        if (kVar.G == 5) {
                            long j11 = kVar.j();
                            long max = Math.max(0L, Math.min(j11, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j11, audioRightMs));
                            j10 = audioRightMs;
                            if (max2 - max >= Math.min(kVar.f11414c, j11)) {
                                kVar.f11426r = max;
                                kVar.f11427s = max2;
                                i2.i0 i0Var = kVar.A;
                                if (i0Var != null) {
                                    i0Var.Z0(5, max);
                                }
                                kVar.f11415f.getClass();
                                kVar.m();
                                org.telegram.messenger.i0.g3(tfVar);
                                return;
                            }
                            i0.a.q(j10, a1.g.s(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.i0.g3(tfVar);
                            return;
                        }
                    }
                    j10 = audioRightMs;
                    i0.a.q(j10, a1.g.s(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.i0.g3(tfVar);
                    return;
                } else if (B.f14458i1 == null) {
                    org.telegram.messenger.i0.g3(tfVar);
                    return;
                } else {
                    B.L1.c(new org.telegram.messenger.m9(B, new org.telegram.messenger.pe(0, org.telegram.messenger.b8.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.b8.r(null, B.f14449e1)), audioLeftMs, audioRightMs, tfVar, 3));
                    return;
                }
            case 5:
                ((bi) this.f25055b).f21586b.removeView((vh.p2) this.f25056c);
                return;
            case 6:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f25056c;
                ((bi) this.f25055b).a(true);
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f25056c;
                if (!((bi) this.f25055b).I && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    return;
                }
                return;
            case 8:
                bi biVar = (bi) this.f25055b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((vh) this.f25056c).f31257c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                biVar.B1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(biVar.D3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f18307b;
                if (tL_attachMenuBots != null) {
                    b02.getMessagesStorage().f15938a.c(new org.telegram.messenger.rk(b02.e, 2, b02.f18304a, b02, tL_attachMenuBots));
                    return;
                }
                return;
            case 9:
                bi biVar2 = (bi) this.f25055b;
                org.telegram.messenger.ui.b0(biVar2.D3).E0(false, true, null);
                if (biVar2.f24721s2 == biVar2.f24717r2.get(((TLRPC.TL_attachMenuBot) this.f25056c).bot_id)) {
                    biVar2.E1(biVar2.a2);
                    return;
                }
                return;
            case 10:
                mi miVar = (mi) this.f25055b;
                miVar.G = false;
                miVar.H = (ArrayList) this.f25056c;
                miVar.S();
                return;
            case 11:
                org.telegram.messenger.i0.g3(new cd(12, (dj) this.f25055b, ((cj) this.f25056c).run()));
                return;
            case 12:
                ((dj) this.f25055b).setStatus((CharSequence) this.f25056c);
                return;
            case 13:
                wj wjVar = (wj) this.f25055b;
                String str3 = (String) this.f25056c;
                wjVar.getClass();
                ArrayList arrayList = new ArrayList(wjVar.X.f32489w.e);
                if (wjVar.X.f32489w.f29370f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) wjVar.X.f32489w.h);
                }
                Utilities.f14522g.c(new org.telegram.ui.kp(wjVar, str3, !wjVar.R.isEmpty(), arrayList, 2));
                return;
            case 14:
                wj wjVar2 = (wj) this.f25055b;
                ArrayList arrayList2 = (ArrayList) this.f25056c;
                xj xjVar = wjVar2.X;
                boolean z12 = xjVar.f32481b0;
                lj ljVar = xjVar.f32487r;
                if (z12) {
                    s4.g0 adapter = ljVar.getAdapter();
                    wj wjVar3 = xjVar.D;
                    if (adapter != wjVar3) {
                        ljVar.setAdapter(wjVar3);
                    }
                }
                wjVar2.f32205s = arrayList2;
                wjVar2.f();
                return;
            case 15:
                bi biVar3 = ((kk) this.f25055b).f30947b;
                biVar3.dismiss();
                biVar3.W1.presentFragment(org.telegram.ui.un.ha(((TLRPC.User) this.f25056c).f19942id));
                return;
            case 16:
                org.telegram.messenger.m5.n(null, 2131743227, new cc((kk) this.f25055b, (org.telegram.ui.ActionBar.p6) this.f25056c), 2131623993, 36);
                return;
            case 17:
                bl blVar = (bl) this.f25055b;
                float[] fArr = (float[]) this.f25056c;
                blVar.getClass();
                blVar.e0(fArr[0], fArr[1]);
                return;
            case 18:
                uh uhVar = (uh) this.f25056c;
                boolean z13 = ChatAttachAlertPhotoLayout.f23845q1;
                int currentItemTop = uhVar.getCurrentItemTop();
                int listTopPadding = uhVar.getListTopPadding();
                pl plVar = ((ChatAttachAlertPhotoLayout) this.f25055b).E;
                if (currentItemTop > org.telegram.messenger.i0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                plVar.scrollBy(0, listTopPadding);
                return;
            case 19:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25056c;
                yl ylVar = ((ChatAttachAlertPhotoLayout) this.f25055b).P;
                if (ylVar != null) {
                    ylVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 20:
                uh uhVar2 = (uh) this.f25056c;
                int currentItemTop2 = uhVar2.getCurrentItemTop();
                int listTopPadding2 = uhVar2.getListTopPadding();
                ag.b1 b1Var = ((jm) this.f25055b).f27402r;
                if (currentItemTop2 > org.telegram.messenger.i0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                b1Var.scrollBy(0, listTopPadding2);
                return;
            case 21:
                xn.a(((vn) this.f25055b).f31293c);
                ((ag.n) this.f25056c).run();
                return;
            case 22:
                ((zo) this.f25055b).f33136b.R0((ArrayList) this.f25056c);
                return;
            case 23:
                ((ap) this.f25055b).f24443b.R0((ArrayList) this.f25056c);
                return;
            case 24:
                ((org.telegram.ui.ActionBar.z2) this.f25055b).dismiss();
                gf.f.r((Context) this.f25056c, "https://t.me/BotFather?start=deletebot");
                return;
            case 25:
                org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) this.f25055b;
                TreeSet treeSet = (TreeSet) this.f25056c;
                String charSequence = m3Var.getText().toString();
                if (!vq.a(charSequence, "bot") && vq.c(charSequence, treeSet) == null) {
                    str2 = "bot";
                }
                org.telegram.ui.Cells.k3 k3Var = m3Var.d;
                k3Var.setRightText(str2);
                int L = org.telegram.messenger.i0.L(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f7 = 21.0f;
                } else {
                    f7 = 63.0f;
                }
                k3Var.setPadding(0, L, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(15.0f));
                return;
            case 26:
                cr crVar = (cr) this.f25055b;
                crVar.getClass();
                ((vh.d) this.f25056c).setLoading(false);
                crVar.dismiss();
                return;
            case 27:
                cr crVar2 = (cr) this.f25055b;
                TLObject tLObject = (TLObject) this.f25056c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    crVar2.T1 = groupcallstreamrtmpurl.url;
                    crVar2.U1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(crVar2.U1);
                    crVar2.V1 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f32850a |= 256;
                    obj.f32851b = 0;
                    obj.f32852c = spannableStringBuilder.length();
                    crVar2.V1.setSpan(new zz0(obj, 0), 0, crVar2.V1.length(), 0);
                    crVar2.W1.O(false);
                    return;
                }
                return;
            case 28:
                fs fsVar = (fs) this.f25055b;
                TLObject tLObject2 = (TLObject) this.f25056c;
                bs bsVar = fsVar.f26125b;
                ArrayList arrayList3 = fsVar.h;
                int i13 = fsVar.f26124a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.vp.r1(i13).V3(popularappbots.users, false);
                    org.telegram.messenger.hs.a0(i13).m1(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    fsVar.f26128g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    fsVar.f26127f = currentTimeMillis;
                    if (fsVar.f26129i) {
                        z11 = false;
                    } else {
                        fsVar.f26129i = true;
                        String str5 = fsVar.f26128g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int i14 = 0;
                        while (i14 < arrayList3.size()) {
                            i14 = c3.i0.k(i14, 1, ((TLRPC.User) arrayList3.get(i14)).f19942id, arrayList4);
                            arrayList3 = arrayList3;
                        }
                        org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(i13);
                        a02.f15938a.c(new org.telegram.messenger.voip.g(fsVar, a02, arrayList4, currentTimeMillis, str, 3));
                        z11 = false;
                    }
                    fsVar.f26126c = z11;
                    bsVar.run();
                    return;
                }
                fsVar.f26128g = null;
                fsVar.e = true;
                fsVar.f26126c = false;
                bsVar.run();
                return;
            default:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f25056c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max3 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.i0.g3(new at(0, (bt) this.f25055b, decodeFile));
                return;
        }
    }
}
