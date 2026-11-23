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
public final class og implements Runnable {
    public final int f38155a;
    public final Object f38156b;
    public final Object f38157c;

    public og(int i7, Object obj, Object obj2) {
        this.f38155a = i7;
        this.f38156b = obj;
        this.f38157c = obj2;
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
        switch (this.f38155a) {
            case 0:
                ng ngVar = (ng) this.f38157c;
                ChatActivityEnterView chatActivityEnterView = ((rg) this.f38156b).Q0;
                chatActivityEnterView.Y1 = chatActivityEnterView.f32604i1.getAudioRightMs() - chatActivityEnterView.f32604i1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView.f32604i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView.f32604i1.getAudioRightMs();
                if (B.I1) {
                    e0.g gVar = B.G1;
                    if (gVar != null) {
                        yi.j jVar = (yi.j) gVar.f10200e;
                        jVar.getClass();
                        yi.j.q();
                        if (jVar.G == 5) {
                            long j10 = jVar.j();
                            long max = Math.max(0L, Math.min(j10, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j10, audioRightMs));
                            j3 = audioRightMs;
                            if (max2 - max >= Math.min(jVar.f61329c, j10)) {
                                jVar.f61342r = max;
                                jVar.f61343s = max2;
                                l2.f0 f0Var = jVar.A;
                                if (f0Var != null) {
                                    f0Var.Z0(5, max);
                                }
                                jVar.f61331f.getClass();
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
                } else if (B.f22714k1 == null) {
                    org.telegram.messenger.g0.g3(ngVar);
                    return;
                } else {
                    B.N1.c(new org.telegram.messenger.k9(B, new org.telegram.messenger.oe(0, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.f22706g1)), audioLeftMs, audioRightMs, ngVar, 3));
                    return;
                }
            case 1:
                ((ui) this.f38156b).f30142b.removeView((hi.l3) this.f38157c);
                return;
            case 2:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f38157c;
                ((ui) this.f38156b).a(true);
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f38157c;
                if (!((ui) this.f38156b).J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            case 4:
                ui uiVar = (ui) this.f38156b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ni) this.f38157c).f37839c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                uiVar.D1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(uiVar.H3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = d02.f26777b;
                if (tL_attachMenuBots != null) {
                    d02.getMessagesStorage().f27214a.c(new org.telegram.messenger.fk(d02.f26785e, 2, d02.f26774a, d02, tL_attachMenuBots));
                    return;
                }
                return;
            case 5:
                ui uiVar2 = (ui) this.f38156b;
                org.telegram.messenger.si.d0(uiVar2.H3).H0(false, true, null);
                if (uiVar2.f40425w2 == uiVar2.f40421v2.get(((TLRPC.TL_attachMenuBot) this.f38157c).bot_id)) {
                    uiVar2.G1(uiVar2.f40363e2);
                    return;
                }
                return;
            case 6:
                ej ejVar = (ej) this.f38156b;
                ejVar.H = false;
                ejVar.I = (ArrayList) this.f38157c;
                ejVar.U();
                return;
            case 7:
                org.telegram.messenger.g0.g3(new og(8, (uj) this.f38156b, ((tj) this.f38157c).run()));
                return;
            case 8:
                ((uj) this.f38156b).setStatus((CharSequence) this.f38157c);
                return;
            case 9:
                lk lkVar = (lk) this.f38156b;
                String str3 = (String) this.f38157c;
                lkVar.getClass();
                ArrayList arrayList = new ArrayList(lkVar.Y.f37494w.f34825e);
                if (lkVar.Y.f37494w.f34826f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) lkVar.Y.f37494w.h);
                }
                Utilities.f22776g.c(new org.telegram.ui.xn(lkVar, str3, !lkVar.S.isEmpty(), arrayList, 4));
                return;
            case 10:
                lk lkVar2 = (lk) this.f38156b;
                ArrayList arrayList2 = (ArrayList) this.f38157c;
                mk mkVar = lkVar2.Y;
                boolean z12 = mkVar.f37486c0;
                ak akVar = mkVar.f37492r;
                if (z12) {
                    v4.h0 adapter = akVar.getAdapter();
                    lk lkVar3 = mkVar.E;
                    if (adapter != lkVar3) {
                        akVar.setAdapter(lkVar3);
                    }
                }
                lkVar2.f37159s = arrayList2;
                lkVar2.f();
                return;
            case 11:
                ui uiVar3 = ((zk) this.f38156b).f37477b;
                uiVar3.dismiss();
                uiVar3.f40352a2.presentFragment(org.telegram.ui.bn.ua(((TLRPC.User) this.f38157c).f28547id));
                return;
            case 12:
                org.telegram.messenger.f3.n(null, 2131742957, new lc((zk) this.f38156b, (org.telegram.ui.ActionBar.h6) this.f38157c), 2131623994, 36);
                return;
            case 13:
                ml mlVar = (ml) this.f38156b;
                float[] fArr = (float[]) this.f38157c;
                mlVar.getClass();
                mlVar.h0(fArr[0], fArr[1]);
                return;
            case 14:
                mi miVar = (mi) this.f38157c;
                boolean z13 = ChatAttachAlertPhotoLayout.f32764r1;
                int currentItemTop = miVar.getCurrentItemTop();
                int listTopPadding = miVar.getListTopPadding();
                zl zlVar = ((ChatAttachAlertPhotoLayout) this.f38156b).F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                zlVar.scrollBy(0, listTopPadding);
                return;
            case 15:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f38157c;
                gm gmVar = ((ChatAttachAlertPhotoLayout) this.f38156b).Q;
                if (gmVar != null) {
                    gmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 16:
                mi miVar2 = (mi) this.f38157c;
                int currentItemTop2 = miVar2.getCurrentItemTop();
                int listTopPadding2 = miVar2.getListTopPadding();
                di.b1 b1Var = ((rm) this.f38156b).f39235r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                b1Var.scrollBy(0, listTopPadding2);
                return;
            case 17:
                io.a(((go) this.f38156b).f35604c);
                ((kg.g) this.f38157c).run();
                return;
            case 18:
                ((jp) this.f38156b).f36535b.S0((ArrayList) this.f38157c);
                return;
            case 19:
                ((kp) this.f38156b).f36913b.S0((ArrayList) this.f38157c);
                return;
            case 20:
                ((org.telegram.ui.ActionBar.w2) this.f38156b).dismiss();
                vf.c.t((Context) this.f38157c, "https://t.me/BotFather?start=deletebot");
                return;
            case 21:
                org.telegram.ui.Cells.l3 l3Var = (org.telegram.ui.Cells.l3) this.f38156b;
                TreeSet treeSet = (TreeSet) this.f38157c;
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
            case 22:
                jr jrVar = (jr) this.f38156b;
                jrVar.getClass();
                ((hi.d) this.f38157c).setLoading(false);
                jrVar.dismiss();
                return;
            case 23:
                jr jrVar2 = (jr) this.f38156b;
                TLObject tLObject = (TLObject) this.f38157c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    jrVar2.X1 = groupcallstreamrtmpurl.url;
                    jrVar2.Y1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jrVar2.Y1);
                    jrVar2.Z1 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f35299a |= 256;
                    obj.f35300b = 0;
                    obj.f35301c = spannableStringBuilder.length();
                    jrVar2.Z1.setSpan(new gz0(obj, 0), 0, jrVar2.Z1.length(), 0);
                    jrVar2.f36541a2.O(false);
                    return;
                }
                return;
            case 24:
                js jsVar = (js) this.f38156b;
                TLObject tLObject2 = (TLObject) this.f38157c;
                gs gsVar = jsVar.f36547b;
                ArrayList arrayList3 = jsVar.h;
                int i7 = jsVar.f36546a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.np.u1(i7).f4(popularappbots.users, false);
                    org.telegram.messenger.ur.a0(i7).m1(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    jsVar.f36551g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    jsVar.f36549e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    jsVar.f36550f = currentTimeMillis;
                    if (jsVar.f36552i) {
                        z11 = false;
                    } else {
                        jsVar.f36552i = true;
                        String str5 = jsVar.f36551g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int i10 = 0;
                        while (i10 < arrayList3.size()) {
                            i10 = com.google.android.gms.internal.vision.e2.g(i10, 1, ((TLRPC.User) arrayList3.get(i10)).f28547id, arrayList4);
                            arrayList3 = arrayList3;
                        }
                        org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(i7);
                        a02.f27214a.c(new bi.q2(jsVar, a02, arrayList4, currentTimeMillis, str, 11));
                        z11 = false;
                    }
                    jsVar.f36548c = z11;
                    gsVar.run();
                    return;
                }
                jsVar.f36551g = null;
                jsVar.f36549e = true;
                jsVar.f36548c = false;
                gsVar.run();
                return;
            case 25:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f38157c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max3 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.g3(new og(26, (et) this.f38156b, decodeFile));
                return;
            case 26:
                ((et) this.f38156b).setImage((Bitmap) this.f38157c);
                return;
            case 27:
                ((EditTextBoldCursor) this.f38156b).f32932p0.draw((Canvas) this.f38157c);
                return;
            case 28:
                org.telegram.messenger.np.u1(((ou) this.f38156b).f38322a.f30139a).t5((TLRPC.EmojiStatus) this.f38157c, null);
                return;
            default:
                org.telegram.messenger.np.u1(((pw) this.f38156b).f38623a.f40074d1).t5((TLRPC.EmojiStatus) this.f38157c, null);
                return;
        }
    }
}
