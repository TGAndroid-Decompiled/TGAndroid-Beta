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
public final class od implements Runnable {
    public final int f37926a;
    public final Object f37927b;
    public final Object f37928c;

    public od(int i7, Object obj, Object obj2) {
        this.f37926a = i7;
        this.f37927b = obj;
        this.f37928c = obj2;
    }

    @Override
    public final void run() {
        long j3;
        float f10;
        boolean z10;
        String str;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f37926a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f37927b;
                int i7 = ChatActivityEnterView.N6;
                chatActivityEnterView.setFieldText((CharSequence) this.f37928c);
                chatActivityEnterView.f32154a0 = null;
                return;
            case 1:
                ((ji.h) this.f37927b).a((ai.h) this.f37928c);
                return;
            case 2:
                gf gfVar = (gf) this.f37927b;
                gfVar.getClass();
                org.telegram.messenger.g0.E2((ji.n) this.f37928c);
                ChatActivityEnterView chatActivityEnterView2 = gfVar.f34928a;
                chatActivityEnterView2.f32239m1 = false;
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView2.f32302v2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 3:
                ((hf) this.f37927b).onAnimationEnd((Animator) this.f37928c);
                return;
            case 4:
                dg dgVar = (dg) this.f37928c;
                ChatActivityEnterView chatActivityEnterView3 = ((gg) this.f37927b).Q0;
                chatActivityEnterView3.Q1 = chatActivityEnterView3.f32214i1.getAudioRightMs() - chatActivityEnterView3.f32214i1.getAudioLeftMs();
                MediaController B = MediaController.B();
                long audioLeftMs = chatActivityEnterView3.f32214i1.getAudioLeftMs();
                long audioRightMs = chatActivityEnterView3.f32214i1.getAudioRightMs();
                if (B.I1) {
                    e0.g gVar = B.G1;
                    if (gVar != null) {
                        yi.j jVar = (yi.j) gVar.f9890e;
                        jVar.getClass();
                        yi.j.q();
                        if (jVar.G == 5) {
                            long j10 = jVar.j();
                            long max = Math.max(0L, Math.min(j10, audioLeftMs));
                            long max2 = Math.max(max, Math.min(j10, audioRightMs));
                            j3 = audioRightMs;
                            if (max2 - max >= Math.min(jVar.f60754c, j10)) {
                                jVar.f60767r = max;
                                jVar.f60768s = max2;
                                l2.f0 f0Var = jVar.A;
                                if (f0Var != null) {
                                    f0Var.Z0(5, max);
                                }
                                jVar.f60756f.getClass();
                                jVar.m();
                                org.telegram.messenger.g0.h3(dgVar);
                                return;
                            }
                            i5.c.t(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                            org.telegram.messenger.g0.h3(dgVar);
                            return;
                        }
                    }
                    j3 = audioRightMs;
                    i5.c.t(j3, a8.p0.t(audioLeftMs, "AudioRecorderV2 trim rejected: ", ".."));
                    org.telegram.messenger.g0.h3(dgVar);
                    return;
                } else if (B.f22356k1 == null) {
                    org.telegram.messenger.g0.h3(dgVar);
                    return;
                } else {
                    B.N1.c(new org.telegram.messenger.k9(B, new org.telegram.messenger.oe(0, org.telegram.messenger.w7.z(1), System.currentTimeMillis() + "_" + org.telegram.messenger.w7.r(null, B.f22348g1)), audioLeftMs, audioRightMs, dgVar, 3));
                    return;
                }
            case 5:
                ((ki) this.f37927b).f29682b.removeView((hi.l3) this.f37928c);
                return;
            case 6:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f37928c;
                ((ki) this.f37927b).a(true);
                if (e2Var != null) {
                    e2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 7:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f37928c;
                if (!((ki) this.f37927b).J && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    org.telegram.messenger.g0.J3(editTextBoldCursor);
                    return;
                }
                return;
            case 8:
                ki kiVar = (ki) this.f37927b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((di) this.f37928c).f33941c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                kiVar.C1(tL_attachMenuBot.bot_id, null, false, true);
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(kiVar.H3);
                TLRPC.TL_attachMenuBots tL_attachMenuBots = b02.f26471b;
                if (tL_attachMenuBots != null) {
                    b02.getMessagesStorage().f27219a.c(new org.telegram.messenger.fk(b02.f26479e, 2, b02.f26468a, b02, tL_attachMenuBots));
                    return;
                }
                return;
            case 9:
                ki kiVar2 = (ki) this.f37927b;
                org.telegram.messenger.si.b0(kiVar2.H3).E0(false, true, null);
                if (kiVar2.f36497w2 == kiVar2.f36493v2.get(((TLRPC.TL_attachMenuBot) this.f37928c).bot_id)) {
                    kiVar2.F1(kiVar2.f36435e2);
                    return;
                }
                return;
            case 10:
                vi viVar = (vi) this.f37927b;
                viVar.H = false;
                viVar.I = (ArrayList) this.f37928c;
                viVar.U();
                return;
            case 11:
                org.telegram.messenger.g0.h3(new od(12, (lj) this.f37927b, ((kj) this.f37928c).run()));
                return;
            case 12:
                ((lj) this.f37927b).setStatus((CharSequence) this.f37928c);
                return;
            case 13:
                ck ckVar = (ck) this.f37927b;
                String str3 = (String) this.f37928c;
                ckVar.getClass();
                ArrayList arrayList = new ArrayList(ckVar.Y.f33954w.f40447e);
                if (ckVar.Y.f33954w.f40448f.isEmpty()) {
                    arrayList.addAll(0, (ArrayList) ckVar.Y.f33954w.h);
                }
                Utilities.f22418g.c(new org.telegram.ui.wn(ckVar, str3, !ckVar.S.isEmpty(), arrayList, 4));
                return;
            case 14:
                ck ckVar2 = (ck) this.f37927b;
                ArrayList arrayList2 = (ArrayList) this.f37928c;
                dk dkVar = ckVar2.Y;
                boolean z11 = dkVar.f33946c0;
                rj rjVar = dkVar.f33952r;
                if (z11) {
                    v4.h0 adapter = rjVar.getAdapter();
                    ck ckVar3 = dkVar.E;
                    if (adapter != ckVar3) {
                        rjVar.setAdapter(ckVar3);
                    }
                }
                ckVar2.f33617s = arrayList2;
                ckVar2.f();
                return;
            case 15:
                ki kiVar3 = ((qk) this.f37927b).f33609b;
                kiVar3.dismiss();
                kiVar3.f36424a2.presentFragment(org.telegram.ui.an.ua(((TLRPC.User) this.f37928c).f28200id));
                return;
            case 16:
                org.telegram.messenger.k5.n(null, 2131743201, new cc((qk) this.f37927b, (org.telegram.ui.ActionBar.e6) this.f37928c), 2131623994, 36);
                return;
            case 17:
                dl dlVar = (dl) this.f37927b;
                float[] fArr = (float[]) this.f37928c;
                dlVar.getClass();
                dlVar.h0(fArr[0], fArr[1]);
                return;
            case 18:
                ci ciVar = (ci) this.f37928c;
                boolean z12 = ChatAttachAlertPhotoLayout.f32365r1;
                int currentItemTop = ciVar.getCurrentItemTop();
                int listTopPadding = ciVar.getListTopPadding();
                ql qlVar = ((ChatAttachAlertPhotoLayout) this.f37927b).F;
                if (currentItemTop > org.telegram.messenger.g0.L(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                qlVar.scrollBy(0, listTopPadding);
                return;
            case 19:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37928c;
                xl xlVar = ((ChatAttachAlertPhotoLayout) this.f37927b).Q;
                if (xlVar != null) {
                    xlVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 20:
                ci ciVar2 = (ci) this.f37928c;
                int currentItemTop2 = ciVar2.getCurrentItemTop();
                int listTopPadding2 = ciVar2.getListTopPadding();
                di.c1 c1Var = ((im) this.f37927b).f35650r;
                if (currentItemTop2 > org.telegram.messenger.g0.L(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                c1Var.scrollBy(0, listTopPadding2);
                return;
            case 21:
                xn.a(((vn) this.f37927b).f40470c);
                ((kg.g) this.f37928c).run();
                return;
            case 22:
                ((ap) this.f37927b).f33037b.R0((ArrayList) this.f37928c);
                return;
            case 23:
                ((bp) this.f37927b).f33338b.R0((ArrayList) this.f37928c);
                return;
            case 24:
                ((org.telegram.ui.ActionBar.u2) this.f37927b).dismiss();
                vf.c.t((Context) this.f37928c, "https://t.me/BotFather?start=deletebot");
                return;
            case 25:
                org.telegram.ui.Cells.k3 k3Var = (org.telegram.ui.Cells.k3) this.f37927b;
                TreeSet treeSet = (TreeSet) this.f37928c;
                String charSequence = k3Var.getText().toString();
                if (!sq.a(charSequence, "bot") && sq.c(charSequence, treeSet) == null) {
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
            case 26:
                ar arVar = (ar) this.f37927b;
                arVar.getClass();
                ((hi.d) this.f37928c).setLoading(false);
                arVar.dismiss();
                return;
            case 27:
                ar arVar2 = (ar) this.f37927b;
                TLObject tLObject = (TLObject) this.f37928c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    arVar2.X1 = groupcallstreamrtmpurl.url;
                    arVar2.Y1 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(arVar2.Y1);
                    arVar2.Z1 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f41487a |= 256;
                    obj.f41488b = 0;
                    obj.f41489c = spannableStringBuilder.length();
                    arVar2.Z1.setSpan(new xy0(obj, 0), 0, arVar2.Z1.length(), 0);
                    arVar2.f33044a2.O(false);
                    return;
                }
                return;
            case 28:
                as asVar = (as) this.f37927b;
                TLObject tLObject2 = (TLObject) this.f37928c;
                xr xrVar = asVar.f33052b;
                ArrayList arrayList3 = asVar.h;
                int i10 = asVar.f33051a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    org.telegram.messenger.np.s1(i10).Y3(popularappbots.users, false);
                    org.telegram.messenger.vr.a0(i10).m1(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    asVar.f33056g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    asVar.f33054e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    asVar.f33055f = currentTimeMillis;
                    if (!asVar.f33057i) {
                        asVar.f33057i = true;
                        String str5 = asVar.f33056g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i11 = 0; i11 < arrayList3.size(); i11 = com.google.android.gms.internal.vision.e2.g(i11, 1, ((TLRPC.User) arrayList3.get(i11)).f28200id, arrayList4)) {
                        }
                        org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(i10);
                        a02.f27219a.c(new bi.r1(asVar, a02, arrayList4, currentTimeMillis, str, 12));
                    }
                    asVar.f33053c = false;
                    xrVar.run();
                    return;
                }
                asVar.f33056g = null;
                asVar.f33054e = true;
                asVar.f33053c = false;
                xrVar.run();
                return;
            default:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f37928c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max3 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max3, max3);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                org.telegram.messenger.g0.h3(new vs(0, (ws) this.f37927b, decodeFile));
                return;
        }
    }
}
