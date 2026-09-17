package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.fg1;
public final class lv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.b2, gg.b2, GenericProvider, u80, ve0, cl0, org.telegram.ui.qy, ai.t9, MessagesStorage.StringCallback, l81, LanguageDetector.StringCallback, tv0, ImageReceiver.ImageReceiverDelegate {
    public final int f25975a;
    public final Object f25976b;

    public lv(Object obj, int i10) {
        this.f25975a = i10;
        this.f25976b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public a0.i F() {
        return null;
    }

    @Override
    public boolean K(org.telegram.ui.wy wyVar) {
        return false;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f25976b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((ae0) this.f25976b).p(true);
    }

    @Override
    public boolean d(int i10, View view) {
        pj0 pj0Var;
        switch (this.f25975a) {
            case 14:
                qj0 qj0Var = (qj0) this.f25976b;
                ArrayList arrayList = qj0Var.f27328n;
                if (qj0Var.f27327f.j(i10) == 0 && (pj0Var = qj0Var.F) != null) {
                    pj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                wm0 wm0Var = (wm0) this.f25976b;
                vm0 vm0Var = wm0Var.f29696c;
                MessageObject E = vm0Var.E(i10);
                wm0 wm0Var2 = vm0Var.f28828c;
                if (E == null) {
                    return false;
                }
                if (!wm0Var.I.g()) {
                    wm0Var.I.a();
                    vm0Var.q(0, wm0Var2.f29699r);
                }
                if (wm0Var.I.g()) {
                    wm0Var.I.e(E, view, 0);
                    if (!wm0Var.I.g()) {
                        vm0Var.q(0, wm0Var2.f29699r);
                    }
                    org.telegram.ui.r10 r10Var = wm0Var.J;
                    int id2 = E.getId();
                    r10Var.f37062a = E.getDialogId();
                    r10Var.f37063b = id2;
                }
                return true;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        n71 n71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        o71 o71Var = (o71) this.f25976b;
        ImageReceiver imageReceiver2 = o71Var.Q;
        if (z10) {
            if (o71Var.N != null || o71Var.f26660d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.ku0 ku0Var = o71Var.N;
                if (ku0Var != null) {
                    ArrayList arrayList = ku0Var.v;
                    int indexOf = arrayList.indexOf(ku0Var.c((int) o71Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = ku0Var.getVideoDuration() / 1000;
                            if (videoDuration <= 100) {
                                ceil2 = Math.ceil(videoDuration);
                            } else if (videoDuration <= 250) {
                                ceil2 = Math.ceil(videoDuration / 2.0f);
                            } else if (videoDuration <= 500) {
                                ceil2 = Math.ceil(videoDuration / 4.0f);
                            } else if (videoDuration <= 1000) {
                                ceil2 = Math.ceil(videoDuration / 5.0f);
                            } else {
                                ceil2 = Math.ceil(videoDuration / 10.0f);
                            }
                            i11 = Math.min(25, (((int) ceil2) - ((arrayList.size() - 1) * 25)) + 1);
                        } else {
                            i11 = 25;
                        }
                    } else {
                        i11 = 0;
                    }
                    float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i11, 5);
                    float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i11 / 5.0f));
                    org.telegram.ui.ku0 ku0Var2 = o71Var.N;
                    int i12 = (int) o71Var.O;
                    int videoDuration2 = ku0Var2.getVideoDuration() / 1000;
                    if (videoDuration2 <= 100) {
                        ceil = ((int) Math.ceil(i12)) % 25;
                    } else if (videoDuration2 <= 250) {
                        ceil = ((int) Math.ceil(i12 / 2.0f)) % 25;
                    } else if (videoDuration2 <= 500) {
                        ceil = ((int) Math.ceil(i12 / 4.0f)) % 25;
                    } else if (videoDuration2 <= 1000) {
                        ceil = ((int) Math.ceil(i12 / 5.0f)) % 25;
                    } else {
                        ceil = ((int) Math.ceil(i12 / 10.0f)) % 25;
                    }
                    int min = Math.min(ceil, i11 - 1);
                    o71Var.R = (int) ((min % 5) * bitmapWidth);
                    o71Var.S = (int) ((min / 5) * bitmapHeight);
                    o71Var.T = (int) bitmapWidth;
                    o71Var.U = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < o71Var.f26660d0.size()) {
                            n71Var = (n71) o71Var.f26660d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = n71Var.f26391a;
                            }
                            if (i13 == o71Var.f26660d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((n71) o71Var.f26660d0.get(i13 + 1)).f26391a;
                            }
                            double d11 = o71Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            n71Var = null;
                            break;
                        }
                    }
                    if (n71Var != null) {
                        o71Var.R = n71Var.f26392b;
                        o71Var.S = n71Var.f26393c;
                        o71Var.T = o71Var.f26657b0;
                        o71Var.U = o71Var.f26659c0;
                    } else {
                        return;
                    }
                }
                o71Var.P = true;
                float f7 = o71Var.T / o71Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = o71Var.getLayoutParams();
                if (o71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    o71Var.setVisibility(0);
                    o71Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        qv0 qv0Var = (qv0) this.f25976b;
        qv0Var.f27437w = i10;
        qv0Var.f27438x = i11;
        ci.eb ebVar = qv0Var.L;
        if (ebVar != null) {
            ebVar.invalidate();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f25975a) {
            case 2:
                MediaDataController.getInstance(((bz) this.f25976b).v.f25713c1).clearRecentStickers();
                return;
            case 4:
                ((wm) this.f25976b).run();
                return;
            case 5:
                ((n20) this.f25976b).n();
                return;
            case 6:
                b70.Q((b70) this.f25976b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f25976b);
                return;
            case 23:
                yx0 yx0Var = (yx0) this.f25976b;
                yx0Var.e.presentFragment(new StickersActivity(yx0Var.d, null));
                c2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((ay0) this.f25976b);
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10) {
        Utilities.Callback callback = ((j51) this.f25976b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void h(int i10) {
        x60 x60Var = (x60) this.f25976b;
        b70 b70Var = x60Var.f29860n;
        b70Var.J(x60Var.f29859f - 1);
        if (x60Var.h == null && !x60Var.e.e() && x60Var.h() <= 2) {
            b70Var.f26943s.e(false, true);
        }
        x60Var.l();
    }

    @Override
    public void k(int i10, int i11) {
        jf0 jf0Var = ((if0) this.f25976b).d;
        if (i10 == jf0Var.f25234b) {
            jf0Var.G = i11;
        } else if (i10 == jf0Var.f25253r) {
            jf0Var.P = i11;
        } else if (i10 == jf0Var.d) {
            jf0Var.I = i11;
        } else if (i10 == jf0Var.f25236c) {
            jf0Var.H = i11;
        } else if (i10 == jf0Var.f25240f) {
            jf0Var.J = i11;
        } else if (i10 == jf0Var.e) {
            jf0Var.K = i11;
        } else if (i10 == jf0Var.v) {
            jf0Var.R = i11;
        } else if (i10 == jf0Var.f25255s) {
            jf0Var.Q = i11;
        } else if (i10 == jf0Var.f25260w) {
            jf0Var.S = i11;
        } else if (i10 == jf0Var.f25262x) {
            jf0Var.U = i11;
        } else if (i10 == jf0Var.h) {
            jf0Var.L = i11;
        } else if (i10 == jf0Var.f25248n) {
            jf0Var.M = i11;
        }
        vz vzVar = jf0Var.f25247l0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
        jf0Var.g();
    }

    @Override
    public void m(int i10) {
        sv.P((sv) this.f25976b, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        cc0 cc0Var = (cc0) obj;
        return Float.valueOf(((o1.j) this.f25976b).f15360a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f25975a) {
            case 19:
                final zu0 zu0Var = ((sr0) this.f25976b).d;
                zu0.r(zu0Var).r(zu0Var.f30631j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        zu0 zu0Var2 = zu0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = zu0.f30604d2;
                                AndroidUtilities.runOnUIThread(new br0(1, zu0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = zu0.f30604d2;
                                AndroidUtilities.runOnUIThread(new br0(1, zu0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final zu0 zu0Var2 = ((dt0) this.f25976b).d;
                zu0.r(zu0Var2).r(zu0Var2.f30631j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        zu0 zu0Var22 = zu0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = zu0.f30604d2;
                                AndroidUtilities.runOnUIThread(new br0(1, zu0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = zu0.f30604d2;
                                AndroidUtilities.runOnUIThread(new br0(1, zu0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                h41 h41Var = (h41) this.f25976b;
                h41Var.f24478e0 = str;
                h41Var.f24483j0.N(true);
                return;
        }
    }

    @Override
    public boolean u(org.telegram.ui.wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        long j3;
        zn0 zn0Var = (zn0) this.f25976b;
        int i12 = zn0Var.I0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = zn0Var.A0;
        for (org.telegram.ui.r10 r10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(r10Var));
        }
        hashMap.clear();
        zn0Var.R(false);
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != AccountInstance.getInstance(i12).getUserConfig().getClientUserId() && charSequence == null) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i13 = a4.a.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j10)) {
                i13.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
            } else {
                if (DialogObject.isUserDialog(j10)) {
                    i13.putLong("user_id", j10);
                } else {
                    i13.putLong("chat_id", -j10);
                }
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, wyVar)) {
                    return true;
                }
            }
            org.telegram.ui.bo boVar = new org.telegram.ui.bo(i13);
            wyVar.presentFragment(boVar, true);
            boVar.Ab(arrayList2);
            return true;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i14)).dialogId;
            if (charSequence != null) {
                j3 = j11;
                AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j3 = j11;
            }
            AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(arrayList2, j3, false, false, true, 0, 0L);
        }
        wyVar.finishFragment();
        return true;
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void mo17run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lv.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void Q(ArrayList arrayList) {
    }

    @Override
    public void a() {
    }

    @Override
    public void i() {
    }

    @Override
    public void j() {
    }

    @Override
    public void l() {
    }
}
