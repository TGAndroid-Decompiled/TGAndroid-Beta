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
import org.telegram.ui.kf1;
public final class fv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.c2, tf.j1, GenericProvider, w80, ze0, kl0, org.telegram.ui.iy, nh.b7, MessagesStorage.StringCallback, n81, LanguageDetector.StringCallback, tv0, ImageReceiver.ImageReceiverDelegate {
    public final int f24961a;
    public final Object f24962b;

    public fv(Object obj, int i10) {
        this.f24961a = i10;
        this.f24962b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public a0.h I() {
        return null;
    }

    @Override
    public boolean K(org.telegram.ui.oy oyVar) {
        return false;
    }

    @Override
    public boolean Q(int i10) {
        return true;
    }

    @Override
    public void b(boolean z4) {
        nh.l6 l6Var = (nh.l6) this.f24962b;
        if (z4) {
            l6Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((de0) this.f24962b).p(true);
    }

    @Override
    public void d(int i10, int i11) {
        qv0 qv0Var = (qv0) this.f24962b;
        qv0Var.f28292w = i10;
        qv0Var.f28293x = i11;
        eg.h0 h0Var = qv0Var.I;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        o71 o71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        p71 p71Var = (p71) this.f24962b;
        ImageReceiver imageReceiver2 = p71Var.N;
        if (z4) {
            if (p71Var.K != null || p71Var.f27769a0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.nt0 nt0Var = p71Var.K;
                if (nt0Var != null) {
                    ArrayList arrayList = nt0Var.v;
                    int indexOf = arrayList.indexOf(nt0Var.c((int) p71Var.L));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = nt0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.nt0 nt0Var2 = p71Var.K;
                    int i12 = (int) p71Var.L;
                    int videoDuration2 = nt0Var2.getVideoDuration() / 1000;
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
                    p71Var.O = (int) ((min % 5) * bitmapWidth);
                    p71Var.P = (int) ((min / 5) * bitmapHeight);
                    p71Var.Q = (int) bitmapWidth;
                    p71Var.R = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < p71Var.f27769a0.size()) {
                            o71Var = (o71) p71Var.f27769a0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = o71Var.f27496a;
                            }
                            if (i13 == p71Var.f27769a0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((o71) p71Var.f27769a0.get(i13 + 1)).f27496a;
                            }
                            double d11 = p71Var.L;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            o71Var = null;
                            break;
                        }
                    }
                    if (o71Var != null) {
                        p71Var.O = o71Var.f27497b;
                        p71Var.P = o71Var.f27498c;
                        p71Var.Q = p71Var.V;
                        p71Var.R = p71Var.W;
                    } else {
                        return;
                    }
                }
                p71Var.M = true;
                float f10 = p71Var.Q / p71Var.R;
                if (f10 > 1.0f) {
                    i10 = (int) (dp / f10);
                } else {
                    dp = (int) (dp * f10);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = p71Var.getLayoutParams();
                if (p71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    p71Var.setVisibility(0);
                    p71Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public boolean f(int i10, View view) {
        xj0 xj0Var;
        switch (this.f24961a) {
            case 14:
                yj0 yj0Var = (yj0) this.f24962b;
                ArrayList arrayList = yj0Var.f31032n;
                if (yj0Var.f31031f.j(i10) == 0 && (xj0Var = yj0Var.C) != null) {
                    xj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                dn0 dn0Var = (dn0) this.f24962b;
                cn0 cn0Var = dn0Var.f24309c;
                MessageObject E = cn0Var.E(i10);
                dn0 dn0Var2 = cn0Var.f24027c;
                if (E == null) {
                    return false;
                }
                if (!dn0Var.F.f()) {
                    dn0Var.F.a();
                    cn0Var.q(0, dn0Var2.f24312r);
                }
                if (dn0Var.F.f()) {
                    dn0Var.F.d(E, view, 0);
                    if (!dn0Var.F.f()) {
                        cn0Var.q(0, dn0Var2.f24312r);
                    }
                    org.telegram.ui.l10 l10Var = dn0Var.G;
                    int id2 = E.getId();
                    l10Var.f35872a = E.getDialogId();
                    l10Var.f35873b = id2;
                }
                return true;
        }
    }

    @Override
    public void g(int i10) {
        y60 y60Var = (y60) this.f24962b;
        c70 c70Var = y60Var.f30891n;
        c70Var.I(y60Var.f30890f - 1);
        if (y60Var.h == null && !y60Var.e.e() && y60Var.h() <= 2) {
            c70Var.f28071s.e(false, true);
        }
        y60Var.l();
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((i51) this.f24962b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f24961a) {
            case 2:
                MediaDataController.getInstance(((bz) this.f24962b).v.Z0).clearRecentStickers();
                return;
            case 4:
                ((ey) this.f24962b).run();
                return;
            case 5:
                ((o20) this.f24962b).n();
                return;
            case 6:
                c70.Q((c70) this.f24962b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f24962b);
                return;
            case 23:
                zx0 zx0Var = (zx0) this.f24962b;
                zx0Var.e.presentFragment(new StickersActivity(zx0Var.d, null));
                d2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((by0) this.f24962b);
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void k(int i10, int i11) {
        nf0 nf0Var = ((mf0) this.f24962b).d;
        if (i10 == nf0Var.f27238b) {
            nf0Var.D = i11;
        } else if (i10 == nf0Var.f27257r) {
            nf0Var.M = i11;
        } else if (i10 == nf0Var.d) {
            nf0Var.F = i11;
        } else if (i10 == nf0Var.f27240c) {
            nf0Var.E = i11;
        } else if (i10 == nf0Var.f27244f) {
            nf0Var.G = i11;
        } else if (i10 == nf0Var.e) {
            nf0Var.H = i11;
        } else if (i10 == nf0Var.v) {
            nf0Var.O = i11;
        } else if (i10 == nf0Var.f27259s) {
            nf0Var.N = i11;
        } else if (i10 == nf0Var.f27264w) {
            nf0Var.P = i11;
        } else if (i10 == nf0Var.f27266x) {
            nf0Var.R = i11;
        } else if (i10 == nf0Var.h) {
            nf0Var.I = i11;
        } else if (i10 == nf0Var.f27252n) {
            nf0Var.J = i11;
        }
        vz vzVar = nf0Var.f27248i0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
        nf0Var.g();
    }

    @Override
    public void l(int i10) {
        mv.P((mv) this.f24962b, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        dc0 dc0Var = (dc0) obj;
        return Float.valueOf(((kb.a) this.f24962b).f10279a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f24961a) {
            case 19:
                final yu0 yu0Var = ((rr0) this.f24962b).d;
                yu0.r(yu0Var).r(yu0Var.f31119g1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        yu0 yu0Var2 = yu0Var;
                        nh.m6 m6Var = (nh.m6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = yu0.a2;
                                AndroidUtilities.runOnUIThread(new i80(19, yu0Var2, m6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = yu0.a2;
                                AndroidUtilities.runOnUIThread(new i80(19, yu0Var2, m6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final yu0 yu0Var2 = ((bt0) this.f24962b).d;
                yu0.r(yu0Var2).r(yu0Var2.f31119g1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        yu0 yu0Var22 = yu0Var2;
                        nh.m6 m6Var = (nh.m6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = yu0.a2;
                                AndroidUtilities.runOnUIThread(new i80(19, yu0Var22, m6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = yu0.a2;
                                AndroidUtilities.runOnUIThread(new i80(19, yu0Var22, m6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                g41 g41Var = (g41) this.f24962b;
                g41Var.f25037b0 = str;
                g41Var.f25042g0.N(true);
                return;
        }
    }

    @Override
    public a0.h t() {
        return null;
    }

    @Override
    public boolean w(org.telegram.ui.oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        long j10;
        do0 do0Var = (do0) this.f24962b;
        int i12 = do0Var.E0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = do0Var.f24338w0;
        for (org.telegram.ui.l10 l10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(l10Var));
        }
        hashMap.clear();
        do0Var.Q(false);
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != AccountInstance.getInstance(i12).getUserConfig().getClientUserId() && charSequence == null) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i13 = android.support.v4.media.a.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i13.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else {
                if (DialogObject.isUserDialog(j11)) {
                    i13.putLong("user_id", j11);
                } else {
                    i13.putLong("chat_id", -j11);
                }
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, oyVar)) {
                    return true;
                }
            }
            org.telegram.ui.xn xnVar = new org.telegram.ui.xn(i13);
            oyVar.presentFragment(xnVar, true);
            xnVar.Ab(arrayList2);
            return true;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            long j12 = ((MessagesStorage.TopicKey) arrayList.get(i14)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            AccountInstance.getInstance(i12).getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
        }
        oyVar.finishFragment();
        return true;
    }

    @Override
    public void mo28run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fv.mo28run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void T(ArrayList arrayList) {
    }

    @Override
    public void a() {
    }

    @Override
    public void e() {
    }

    @Override
    public void j() {
    }

    @Override
    public void m() {
    }
}
