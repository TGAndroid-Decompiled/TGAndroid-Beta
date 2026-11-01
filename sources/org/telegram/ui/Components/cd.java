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
    public final int f25089a;
    public final Object f25090b;
    public final Object f25091c;

    public cd(int i10, Object obj, Object obj2) {
        this.f25089a = i10;
        this.f25090b = obj;
        this.f25091c = obj2;
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
        switch (this.f25089a) {
            case 0:
                int i10 = ChatActivityEnterView.f23673s5;
                ((ChatActivityEnterView) this.f25090b).removeView((vh.p2) this.f25091c);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25090b;
                if (chatActivityEnterView.Y4 == ((z60) this.f25091c)) {
                    chatActivityEnterView.Y4 = null;
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f25090b;
                int i11 = ChatActivityEnterView.f23673s5;
                chatActivityEnterView2.setFieldText((CharSequence) this.f25091c);
                chatActivityEnterView2.W = null;
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.f25090b;
                int i12 = ChatActivityEnterView.f23673s5;
                ((tc) this.f25091c).run();
                org.telegram.messenger.ks.o(chatActivityEnterView3.Q, chatActivityEnterView3.Q2);
                return;
            case 4:
                tf tfVar = (tf) this.f25091c;
                ChatActivityEnterView chatActivityEnterView4 = ((wf) this.f25090b).f32228b0;
                chatActivityEnterView4.f23726i1 = chatActivityEnterView4.f23720h1.getAudioRightMs() - chatActivityEnterView4.f23720h1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView4.f23720h1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView4.f23720h1.getAudioRightMs();
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
                            if (max2 - max >= Math.min(kVar.f11415c, j11)) {
                                kVar.f11427r = max;
                                kVar.f11428s = max2;
                                i2.i0 i0Var = kVar.A;
                                if (i0Var != null) {
                                    i0Var.Z0(5, max);
                                }
                                kVar.f11416f.getClass();
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
                } else if (B.f14459i1 == null) {
                    org.telegram.messenger.i0.g3(tfVar);
                    return;
                } else {
                    B.L1.c(new org.telegram.messenger.n9(B, new org.telegram.messenger.qe(0, org.telegram.messenger.b8.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.b8.r(null, B.f14450e1)), audioLeftMs, audioRightMs, tfVar, 3));
                    return;
                }
            case 5:
                ((bi) this.f25090b).f21587b.removeView((vh.p2) this.f25091c);
                return;
            case 6:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f25091c;
                ((bi) this.f25090b).a(true);
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f25091c;
                if (!((bi) this.f25090b).I && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.i0.J3(editTextBoldCursor);
                    return;
                }
                return;
            case 8:
                bi biVar = (bi) this.f25090b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((vh) this.f25091c).f31306c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                biVar.B1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(biVar.D3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f18636b;
                if (tL_attachMenuBots != null) {
                    b02.getMessagesStorage().f16331a.c(new org.telegram.messenger.sk(b02.e, 2, b02.f18633a, b02, tL_attachMenuBots));
                    return;
                }
                return;
            case 9:
                bi biVar2 = (bi) this.f25090b;
                org.telegram.messenger.vi.b0(biVar2.D3).E0(false, true, null);
                if (biVar2.f24812s2 == biVar2.f24808r2.get(((TLRPC.TL_attachMenuBot) this.f25091c).bot_id)) {
                    biVar2.E1(biVar2.a2);
                    return;
                }
                return;
            case 10:
                mi miVar = (mi) this.f25090b;
                miVar.G = false;
                miVar.H = (ArrayList) this.f25091c;
                miVar.S();
                return;
            case 11:
                org.telegram.messenger.i0.g3(new cd(12, (dj) this.f25090b, ((cj) this.f25091c).run()));
                return;
            case 12:
                ((dj) this.f25090b).setStatus((CharSequence) this.f25091c);
                return;
            case 13:
                wj wjVar = (wj) this.f25090b;
                String str3 = (String) this.f25091c;
                wjVar.getClass();
                ArrayList arrayList = new ArrayList(wjVar.X.f32589w.e);
                if (wjVar.X.f32589w.f29437f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) wjVar.X.f32589w.h);
                }
                Utilities.f14523g.c(new org.telegram.ui.kp(wjVar, str3, !wjVar.R.isEmpty(), arrayList, 2));
                return;
            case 14:
                wj wjVar2 = (wj) this.f25090b;
                ArrayList arrayList2 = (ArrayList) this.f25091c;
                xj xjVar = wjVar2.X;
                boolean z12 = xjVar.f32581b0;
                lj ljVar = xjVar.f32587r;
                if (z12) {
                    s4.g0 adapter = ljVar.getAdapter();
                    wj wjVar3 = xjVar.D;
                    if (adapter != wjVar3) {
                        ljVar.setAdapter(wjVar3);
                    }
                }
                wjVar2.f32262s = arrayList2;
                wjVar2.f();
                return;
            case 15:
                bi biVar3 = ((kk) this.f25090b).f30964b;
                biVar3.dismiss();
                biVar3.W1.presentFragment(org.telegram.ui.un.ma(((TLRPC.User) this.f25091c).f19943id));
                return;
            case 16:
                org.telegram.messenger.m5.n(null, 2131743227, new cc((kk) this.f25090b, (org.telegram.ui.ActionBar.p6) this.f25091c), 2131623993, 36);
                return;
            case 17:
                bl blVar = (bl) this.f25090b;
                float[] fArr = (float[]) this.f25091c;
                blVar.getClass();
                blVar.e0(fArr[0], fArr[1]);
                return;
            case 18:
                uh uhVar = (uh) this.f25091c;
                boolean z13 = ChatAttachAlertPhotoLayout.f23846q1;
                int currentItemTop = uhVar.getCurrentItemTop();
                int listTopPadding = uhVar.getListTopPadding();
                pl plVar = ((ChatAttachAlertPhotoLayout) this.f25090b).E;
                if (currentItemTop > org.telegram.messenger.i0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                plVar.scrollBy(0, listTopPadding);
                return;
            case 19:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25091c;
                yl ylVar = ((ChatAttachAlertPhotoLayout) this.f25090b).P;
                if (ylVar != null) {
                    ylVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 20:
                uh uhVar2 = (uh) this.f25091c;
                int currentItemTop2 = uhVar2.getCurrentItemTop();
                int listTopPadding2 = uhVar2.getListTopPadding();
                ag.b1 b1Var = ((jm) this.f25090b).f27455r;
                if (currentItemTop2 > org.telegram.messenger.i0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                b1Var.scrollBy(0, listTopPadding2);
                return;
            case 21:
                xn.a(((vn) this.f25090b).f31350c);
                ((ag.n) this.f25091c).run();
                return;
            case 22:
                ((zo) this.f25090b).f33196b.R0((ArrayList) this.f25091c);
                return;
            case 23:
                ((ap) this.f25090b).f24467b.R0((ArrayList) this.f25091c);
                return;
            case 24:
                ((org.telegram.ui.ActionBar.z2) this.f25090b).dismiss();
                gf.f.r((Context) this.f25091c, "https://t.me/BotFather?start=deletebot");
                return;
            case 25:
                org.telegram.ui.Cells.m3 m3Var = (org.telegram.ui.Cells.m3) this.f25090b;
                TreeSet treeSet = (TreeSet) this.f25091c;
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
                cr crVar = (cr) this.f25090b;
                crVar.getClass();
                ((vh.d) this.f25091c).setLoading(false);
                crVar.dismiss();
                return;
            case 27:
                cr crVar2 = (cr) this.f25090b;
                TLObject tLObject = (TLObject) this.f25091c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    crVar2.T1 = groupcallstreamrtmpurl.url;
                    crVar2.U1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(crVar2.U1);
                    crVar2.V1 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f33282a |= 256;
                    obj.f33283b = 0;
                    obj.f33284c = spannableStringBuilder.length();
                    crVar2.V1.setSpan(new a01(obj, 0), 0, crVar2.V1.length(), 0);
                    crVar2.W1.O(false);
                    return;
                }
                return;
            case 28:
                fs fsVar = (fs) this.f25090b;
                TLObject tLObject2 = (TLObject) this.f25091c;
                bs bsVar = fsVar.f26210b;
                ArrayList arrayList3 = fsVar.h;
                int i13 = fsVar.f26209a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.wp.r1(i13).V3(popularappbots.users, false);
                    org.telegram.messenger.is.a0(i13).m1(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    fsVar.f26213g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    fsVar.f26212f = currentTimeMillis;
                    if (fsVar.f26214i) {
                        z11 = false;
                    } else {
                        fsVar.f26214i = true;
                        String str5 = fsVar.f26213g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int i14 = 0;
                        while (i14 < arrayList3.size()) {
                            i14 = c3.i0.k(i14, 1, ((TLRPC.User) arrayList3.get(i14)).f19943id, arrayList4);
                            arrayList3 = arrayList3;
                        }
                        org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(i13);
                        a02.f16331a.c(new org.telegram.messenger.voip.g(fsVar, a02, arrayList4, currentTimeMillis, str, 3));
                        z11 = false;
                    }
                    fsVar.f26211c = z11;
                    bsVar.run();
                    return;
                }
                fsVar.f26213g = null;
                fsVar.e = true;
                fsVar.f26211c = false;
                bsVar.run();
                return;
            default:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f25091c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max3 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.i0.g3(new at(0, (bt) this.f25090b, decodeFile));
                return;
        }
    }
}
