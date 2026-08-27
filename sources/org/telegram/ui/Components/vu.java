package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.we1;

public final class vu implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, pf.i1, GenericProvider, h80, he0, rk0, org.telegram.ui.zx, jh.a7, MessagesStorage.StringCallback, r71, LanguageDetector.StringCallback, cv0, ImageReceiver.ImageReceiverDelegate {

    public final int f34055a;

    public final Object f34056b;

    public vu(Object obj, int i10) {
        this.f34055a = i10;
        this.f34056b = obj;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean D0(int i10) {
        return true;
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public boolean K(org.telegram.ui.gy gyVar) {
        return false;
    }

    @Override
    public boolean a(int i10, View view) {
        fj0 fj0Var;
        switch (this.f34055a) {
            case 14:
                gj0 gj0Var = (gj0) this.f34056b;
                ArrayList arrayList = gj0Var.f28728n;
                if (gj0Var.f28727f.j(i10) != 0 || (fj0Var = gj0Var.B) == null) {
                    return true;
                }
                fj0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                jm0 jm0Var = (jm0) this.f34056b;
                im0 im0Var = jm0Var.f29729c;
                MessageObject messageObjectE = im0Var.E(i10);
                jm0 jm0Var2 = im0Var.f29408c;
                if (messageObjectE == null) {
                    return false;
                }
                if (!jm0Var.E.f()) {
                    jm0Var.E.a();
                    im0Var.q(0, jm0Var2.f29733r);
                }
                if (jm0Var.E.f()) {
                    jm0Var.E.d(messageObjectE, view, 0);
                    if (!jm0Var.E.f()) {
                        im0Var.q(0, jm0Var2.f29733r);
                    }
                    org.telegram.ui.a10 a10Var = jm0Var.F;
                    int id2 = messageObjectE.getId();
                    a10Var.f36332a = messageObjectE.getDialogId();
                    a10Var.f36333b = id2;
                }
                return true;
        }
    }

    @Override
    public void c() {
        ((md0) this.f34056b).q(true);
    }

    @Override
    public void d(int i10, int i11) {
        zu0 zu0Var = (zu0) this.f34056b;
        zu0Var.f35389w = i10;
        zu0Var.f35390x = i11;
        ag.s0 s0Var = zu0Var.H;
        if (s0Var != null) {
            s0Var.invalidate();
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        s61 s61Var;
        int i10;
        int iMin;
        int iCeil;
        double dCeil;
        t61 t61Var = (t61) this.f34056b;
        ImageReceiver imageReceiver2 = t61Var.M;
        if (z10) {
            if (t61Var.J == null && t61Var.W == null) {
                return;
            }
            int iDp = AndroidUtilities.dp(150.0f);
            org.telegram.ui.ht0 ht0Var = t61Var.J;
            if (ht0Var != null) {
                int i11 = (int) t61Var.K;
                ArrayList arrayList = ht0Var.v;
                int iIndexOf = arrayList.indexOf(ht0Var.c(i11));
                if (iIndexOf == -1) {
                    iMin = 0;
                } else if (iIndexOf == arrayList.size() - 1) {
                    int videoDuration = ht0Var.getVideoDuration() / 1000;
                    if (videoDuration <= 100) {
                        dCeil = Math.ceil(videoDuration);
                    } else if (videoDuration <= 250) {
                        dCeil = Math.ceil(videoDuration / 2.0f);
                    } else if (videoDuration <= 500) {
                        dCeil = Math.ceil(videoDuration / 4.0f);
                    } else {
                        dCeil = videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f);
                    }
                    iMin = Math.min(25, (((int) dCeil) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    iMin = 25;
                }
                int iCeil2 = (int) Math.ceil(iMin / 5.0f);
                float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(iMin, 5);
                float bitmapHeight = imageReceiver2.getBitmapHeight() / iCeil2;
                org.telegram.ui.ht0 ht0Var2 = t61Var.J;
                int i12 = (int) t61Var.K;
                int videoDuration2 = ht0Var2.getVideoDuration() / 1000;
                if (videoDuration2 <= 100) {
                    iCeil = ((int) Math.ceil(i12)) % 25;
                } else if (videoDuration2 <= 250) {
                    iCeil = ((int) Math.ceil(i12 / 2.0f)) % 25;
                } else if (videoDuration2 <= 500) {
                    iCeil = ((int) Math.ceil(i12 / 4.0f)) % 25;
                } else {
                    iCeil = videoDuration2 <= 1000 ? ((int) Math.ceil(i12 / 5.0f)) % 25 : ((int) Math.ceil(i12 / 10.0f)) % 25;
                }
                int iMin2 = Math.min(iCeil, iMin - 1);
                t61Var.N = (int) ((iMin2 % 5) * bitmapWidth);
                t61Var.O = (int) ((iMin2 / 5) * bitmapHeight);
                t61Var.P = (int) bitmapWidth;
                t61Var.Q = (int) bitmapHeight;
            } else {
                int i13 = 0;
                while (true) {
                    if (i13 >= t61Var.W.size()) {
                        s61Var = null;
                        break;
                    }
                    s61Var = (s61) t61Var.W.get(i13);
                    double d = i13 == 0 ? 0.0d : s61Var.f32346a;
                    double d10 = i13 == t61Var.W.size() + (-1) ? 9.9999999E7d : ((s61) t61Var.W.get(i13 + 1)).f32346a;
                    double d11 = t61Var.K;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (s61Var == null) {
                    return;
                }
                t61Var.N = s61Var.f32347b;
                t61Var.O = s61Var.f32348c;
                t61Var.P = t61Var.U;
                t61Var.Q = t61Var.V;
            }
            t61Var.L = true;
            float f10 = t61Var.P / t61Var.Q;
            if (f10 > 1.0f) {
                i10 = (int) (iDp / f10);
            } else {
                iDp = (int) (iDp * f10);
                i10 = iDp;
            }
            ViewGroup.LayoutParams layoutParams = t61Var.getLayoutParams();
            if (t61Var.getVisibility() == 0 && layoutParams.width == iDp && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = iDp;
            layoutParams.height = i10;
            t61Var.setVisibility(0);
            t61Var.requestLayout();
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void e(boolean z10) {
        jh.j6 j6Var = (jh.j6) this.f34056b;
        if (z10) {
            j6Var.p(30, false);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34055a) {
            case 2:
                MediaDataController.getInstance(((py) this.f34056b).v.Y0).clearRecentStickers();
                break;
            case 4:
                ((km) this.f34056b).run();
                break;
            case 5:
                ((b20) this.f34056b).n();
                break;
            case 6:
                p60.Q((p60) this.f34056b);
                break;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f34056b);
                break;
            case 23:
                gx0 gx0Var = (gx0) this.f34056b;
                gx0Var.f28865e.presentFragment(new StickersActivity(gx0Var.d, null));
                b2Var.dismiss();
                break;
            default:
                AndroidUtilities.hideKeyboard((ix0) this.f34056b);
                b2Var.dismiss();
                break;
        }
    }

    @Override
    public void h(int i10) {
        cv.P((cv) this.f34056b, i10);
    }

    @Override
    public a0.h h0() {
        return null;
    }

    @Override
    public void i(int i10) {
        l60 l60Var = (l60) this.f34056b;
        p60 p60Var = l60Var.f30305n;
        p60Var.J(l60Var.f30304f - 1);
        if (l60Var.h == null && !l60Var.f30303e.e() && l60Var.h() <= 2) {
            p60Var.f32983s.e(false, true);
        }
        l60Var.l();
    }

    @Override
    public void j(int i10) {
        Utilities.Callback callback = ((n41) this.f34056b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void l(int i10, int i11) {
        ve0 ve0Var = ((ue0) this.f34056b).d;
        if (i10 == ve0Var.f33380b) {
            ve0Var.C = i11;
        } else if (i10 == ve0Var.f33400r) {
            ve0Var.L = i11;
        } else if (i10 == ve0Var.d) {
            ve0Var.E = i11;
        } else if (i10 == ve0Var.f33382c) {
            ve0Var.D = i11;
        } else if (i10 == ve0Var.f33387f) {
            ve0Var.F = i11;
        } else if (i10 == ve0Var.f33385e) {
            ve0Var.G = i11;
        } else if (i10 == ve0Var.v) {
            ve0Var.N = i11;
        } else if (i10 == ve0Var.f33402s) {
            ve0Var.M = i11;
        } else if (i10 == ve0Var.f33407w) {
            ve0Var.O = i11;
        } else if (i10 == ve0Var.f33409x) {
            ve0Var.Q = i11;
        } else if (i10 == ve0Var.h) {
            ve0Var.H = i11;
        } else if (i10 == ve0Var.f33395n) {
            ve0Var.I = i11;
        }
        jz jzVar = ve0Var.f33390h0;
        if (jzVar != null) {
            jzVar.e(true, false, false);
        }
        ve0Var.g();
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        return Float.valueOf(((hb.a) this.f34056b).f8860a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f34055a) {
            case 19:
                final hu0 hu0Var = ((zq0) this.f34056b).d;
                final int i10 = 0;
                hu0Var.getStoriesController().r(hu0Var.f29121f1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i11 = i10;
                        int i12 = 13;
                        hu0 hu0Var2 = hu0Var;
                        jh.k6 k6Var = (jh.k6) obj;
                        switch (i11) {
                            case 0:
                                int[] iArr = hu0.Z1;
                                AndroidUtilities.runOnUIThread(new lg0(i12, hu0Var2, k6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = hu0.Z1;
                                AndroidUtilities.runOnUIThread(new lg0(i12, hu0Var2, k6Var), 100L);
                                break;
                        }
                    }
                });
                break;
            case 20:
                final hu0 hu0Var2 = ((ks0) this.f34056b).d;
                final int i11 = 1;
                hu0Var2.getStoriesController().r(hu0Var2.f29121f1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i12 = i11;
                        int i13 = 13;
                        hu0 hu0Var3 = hu0Var2;
                        jh.k6 k6Var = (jh.k6) obj;
                        switch (i12) {
                            case 0:
                                int[] iArr = hu0.Z1;
                                AndroidUtilities.runOnUIThread(new lg0(i13, hu0Var3, k6Var), 100L);
                                break;
                            default:
                                int[] iArr2 = hu0.Z1;
                                AndroidUtilities.runOnUIThread(new lg0(i13, hu0Var3, k6Var), 100L);
                                break;
                        }
                    }
                });
                break;
            default:
                m31 m31Var = (m31) this.f34056b;
                m31Var.f30545a0 = str;
                m31Var.f30550f0.N(true);
                break;
        }
    }

    @Override
    public boolean w(org.telegram.ui.gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        long j10;
        jn0 jn0Var = (jn0) this.f34056b;
        int i12 = jn0Var.D0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap map = jn0Var.f29762v0;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((MessageObject) map.get((org.telegram.ui.a10) it.next()));
        }
        map.clear();
        jn0Var.Q(false);
        if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == AccountInstance.getInstance(i12).getUserConfig().getClientUserId() || charSequence != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                if (charSequence != null) {
                    j10 = j11;
                    AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                } else {
                    j10 = j11;
                }
                AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
            }
            gyVar.finishFragment();
            return true;
        }
        long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j12)) {
            bundleH.putInt("enc_id", DialogObject.getEncryptedChatId(j12));
        } else {
            if (DialogObject.isUserDialog(j12)) {
                bundleH.putLong("user_id", j12);
            } else {
                bundleH.putLong("chat_id", -j12);
            }
            if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(bundleH, gyVar)) {
                return true;
            }
        }
        org.telegram.ui.rn rnVar = new org.telegram.ui.rn(bundleH);
        gyVar.presentFragment(rnVar, true);
        rnVar.Ab(arrayList2);
        return true;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet stickerSet2;
        TLRPC.StickerSet stickerSet3;
        TLRPC.TL_messages_stickerSet stickerSet4;
        switch (this.f34055a) {
            case 1:
                wx wxVar = (wx) this.f34056b;
                n41 n41Var = (n41) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                rx rxVar = wxVar.f34354c;
                yy yyVar = wxVar.B;
                Object obj6 = n41Var.G;
                if (obj6 instanceof TLRPC.StickerSetCovered) {
                    px pxVar = (px) n41Var.H;
                    long j10 = wxVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj6).set;
                    long j11 = stickerSet.f22407id;
                    if (j10 == j11) {
                        wxVar.d = 0L;
                        stickerSet = null;
                    } else {
                        wxVar.d = j11;
                        wxVar.f34356f = pxVar.d;
                        wxVar.f34355e = stickerSet;
                    }
                } else if (obj6 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj6;
                    long j12 = wxVar.d;
                    TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet.set;
                    long j13 = stickerSet5.f22407id;
                    if (j12 == j13) {
                        wxVar.d = 0L;
                        stickerSet = null;
                    } else {
                        wxVar.d = j13;
                        wxVar.f34356f = tL_messages_stickerSet.documents;
                        wxVar.f34355e = stickerSet5;
                        stickerSet = stickerSet5;
                    }
                } else {
                    stickerSet = null;
                }
                int childCount = rxVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    wg.c cVar = (wg.c) rxVar.getChildAt(i10);
                    if (cVar != view) {
                        cVar.a(false, true);
                    }
                }
                if (wxVar.d != 0 && wxVar.f34356f.size() < wxVar.f34355e.count && (stickerSet2 = MediaDataController.getInstance(yyVar.Y0).getStickerSet(wxVar.f34355e, false)) != null) {
                    wxVar.f34356f = stickerSet2.documents;
                }
                TLObject tLObject = (TLObject) n41Var.G;
                TLRPC.Document document = null;
                TLRPC.StickerSet stickerSet6 = stickerSet;
                wg.b bVar = yyVar.H;
                ud.a aVar = yyVar.f34979b;
                ArrayList arrayList = wxVar.f34356f;
                if (arrayList != null && !arrayList.isEmpty()) {
                    document = (TLRPC.Document) wxVar.f34356f.get(0);
                }
                yyVar.L(bVar, tLObject, stickerSet6, document, true, aVar.f48497e > 0.0f);
                ((wg.c) view).a(wxVar.d != 0, true);
                aVar.a(wxVar.d != 0, true);
                wxVar.l();
                yyVar.R.b();
                if (wxVar.d != 0) {
                    rxVar.I1(view);
                }
                break;
            case 3:
                ty tyVar = (ty) this.f34056b;
                n41 n41Var2 = (n41) obj;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                sy syVar = tyVar.f32906c;
                yy yyVar2 = tyVar.M;
                Object obj7 = n41Var2.G;
                if (obj7 instanceof TLRPC.StickerSetCovered) {
                    px pxVar2 = (px) n41Var2.H;
                    long j14 = tyVar.d;
                    stickerSet3 = ((TLRPC.StickerSetCovered) obj7).set;
                    long j15 = stickerSet3.f22407id;
                    if (j14 == j15) {
                        tyVar.d = 0L;
                        stickerSet3 = null;
                    } else {
                        tyVar.d = j15;
                        tyVar.f32908f = pxVar2.d;
                        tyVar.f32907e = stickerSet3;
                    }
                } else if (obj7 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj7;
                    long j16 = tyVar.d;
                    TLRPC.StickerSet stickerSet7 = tL_messages_stickerSet2.set;
                    long j17 = stickerSet7.f22407id;
                    if (j16 == j17) {
                        tyVar.d = 0L;
                        stickerSet3 = null;
                    } else {
                        tyVar.d = j17;
                        tyVar.f32908f = tL_messages_stickerSet2.documents;
                        tyVar.f32907e = stickerSet7;
                        stickerSet3 = stickerSet7;
                    }
                } else {
                    stickerSet3 = null;
                }
                int childCount2 = syVar.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    wg.c cVar2 = (wg.c) syVar.getChildAt(i11);
                    if (cVar2 != view2) {
                        cVar2.a(false, true);
                    }
                }
                if (tyVar.d != 0 && tyVar.f32908f.size() < tyVar.f32907e.count && (stickerSet4 = MediaDataController.getInstance(yyVar2.Y0).getStickerSet(tyVar.f32907e, false)) != null) {
                    tyVar.f32908f = stickerSet4.documents;
                }
                TLObject tLObject2 = (TLObject) n41Var2.G;
                TLRPC.Document document2 = null;
                TLRPC.StickerSet stickerSet8 = stickerSet3;
                wg.b bVar2 = yyVar2.J;
                ud.a aVar2 = yyVar2.f34976a;
                ArrayList arrayList2 = tyVar.f32908f;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    document2 = (TLRPC.Document) tyVar.f32908f.get(0);
                }
                yyVar2.L(bVar2, tLObject2, stickerSet8, document2, false, aVar2.f48497e > 0.0f);
                ((wg.c) view2).a(tyVar.d != 0, true);
                aVar2.a(tyVar.d != 0, true);
                tyVar.l();
                yyVar2.C0.b();
                if (tyVar.d != 0) {
                    syVar.I1(view2);
                }
                break;
            case 11:
                mg0 mg0Var = (mg0) this.f34056b;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                Object obj8 = ((n41) obj).G;
                if (obj8 instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj8;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    org.telegram.ui.rn rnVar = new org.telegram.ui.rn(bundle);
                    org.telegram.ui.gy gyVar = mg0Var.f30675a;
                    org.telegram.ui.gy.d4(rnVar, messageObject);
                    gyVar.presentFragment(rnVar);
                }
                break;
            case 15:
                zk0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((zk0) this.f34056b).f35277l2);
                break;
            default:
                zk0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((k51) this.f34056b).f35277l2);
                break;
        }
    }

    @Override
    public void V0(ArrayList arrayList) {
    }

    @Override
    public void b() {
    }

    @Override
    public void g() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m() {
    }
}
