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
import org.telegram.ui.ig1;
public final class pv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.c2, fg.c2, GenericProvider, e90, ef0, ll0, org.telegram.ui.qy, zh.r5, MessagesStorage.StringCallback, x81, LanguageDetector.StringCallback, dw0, ImageReceiver.ImageReceiverDelegate {
    public final int f26251a;
    public final Object f26252b;

    public pv(Object obj, int i10) {
        this.f26251a = i10;
        this.f26252b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public a0.i D() {
        return null;
    }

    @Override
    public boolean J(org.telegram.ui.wy wyVar) {
        return false;
    }

    @Override
    public a0.i P() {
        return null;
    }

    @Override
    public void a(int i10) {
        g70 g70Var = (g70) this.f26252b;
        k70 k70Var = g70Var.f23263n;
        k70Var.J(g70Var.f23262f - 1);
        if (g70Var.h == null && !g70Var.e.e() && g70Var.h() <= 2) {
            k70Var.f21749s.e(false, true);
        }
        g70Var.l();
    }

    @Override
    public void b(boolean z10) {
        zh.a5 a5Var = (zh.a5) this.f26252b;
        if (z10) {
            a5Var.p(30, false);
        }
    }

    @Override
    public boolean c0(int i10) {
        return true;
    }

    @Override
    public boolean d(int i10, View view) {
        yj0 yj0Var;
        switch (this.f26251a) {
            case 14:
                zj0 zj0Var = (zj0) this.f26252b;
                ArrayList arrayList = zj0Var.f29705n;
                if (zj0Var.f29704f.j(i10) == 0 && (yj0Var = zj0Var.F) != null) {
                    yj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                fn0 fn0Var = (fn0) this.f26252b;
                en0 en0Var = fn0Var.f23041c;
                MessageObject E = en0Var.E(i10);
                fn0 fn0Var2 = en0Var.f22732c;
                if (E == null) {
                    return false;
                }
                if (!fn0Var.I.f()) {
                    fn0Var.I.a();
                    en0Var.q(0, fn0Var2.f23044r);
                }
                if (fn0Var.I.f()) {
                    fn0Var.I.d(E, view, 0);
                    if (!fn0Var.I.f()) {
                        en0Var.q(0, fn0Var2.f23044r);
                    }
                    org.telegram.ui.r10 r10Var = fn0Var.J;
                    int id2 = E.getId();
                    r10Var.f36168a = E.getDialogId();
                    r10Var.f36169b = id2;
                }
                return true;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        z71 z71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        a81 a81Var = (a81) this.f26252b;
        ImageReceiver imageReceiver2 = a81Var.Q;
        if (z10) {
            if (a81Var.N != null || a81Var.f21426d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.hu0 hu0Var = a81Var.N;
                if (hu0Var != null) {
                    ArrayList arrayList = hu0Var.v;
                    int indexOf = arrayList.indexOf(hu0Var.c((int) a81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = hu0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.hu0 hu0Var2 = a81Var.N;
                    int i12 = (int) a81Var.O;
                    int videoDuration2 = hu0Var2.getVideoDuration() / 1000;
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
                    a81Var.R = (int) ((min % 5) * bitmapWidth);
                    a81Var.S = (int) ((min / 5) * bitmapHeight);
                    a81Var.T = (int) bitmapWidth;
                    a81Var.U = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < a81Var.f21426d0.size()) {
                            z71Var = (z71) a81Var.f21426d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = z71Var.f29610a;
                            }
                            if (i13 == a81Var.f21426d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((z71) a81Var.f21426d0.get(i13 + 1)).f29610a;
                            }
                            double d11 = a81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            z71Var = null;
                            break;
                        }
                    }
                    if (z71Var != null) {
                        a81Var.R = z71Var.f29611b;
                        a81Var.S = z71Var.f29612c;
                        a81Var.T = a81Var.f21423b0;
                        a81Var.U = a81Var.f21425c0;
                    } else {
                        return;
                    }
                }
                a81Var.P = true;
                float f7 = a81Var.T / a81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = a81Var.getLayoutParams();
                if (a81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    a81Var.setVisibility(0);
                    a81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void e() {
        ((je0) this.f26252b).p(true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f26251a) {
            case 2:
                MediaDataController.getInstance(((iz) this.f26252b).v.f26805c1).clearRecentStickers();
                return;
            case 4:
                ((my) this.f26252b).run();
                return;
            case 5:
                ((w20) this.f26252b).n();
                return;
            case 6:
                k70.Q((k70) this.f26252b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f26252b);
                return;
            case 23:
                jy0 jy0Var = (jy0) this.f26252b;
                jy0Var.e.presentFragment(new StickersActivity(jy0Var.d, null));
                d2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((ly0) this.f26252b);
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10, int i11) {
        aw0 aw0Var = (aw0) this.f26252b;
        aw0Var.f21648w = i10;
        aw0Var.f21649x = i11;
        bi.nc ncVar = aw0Var.L;
        if (ncVar != null) {
            ncVar.invalidate();
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((v51) this.f26252b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void k(int i10, int i11) {
        sf0 sf0Var = ((rf0) this.f26252b).d;
        if (i10 == sf0Var.f27013b) {
            sf0Var.G = i11;
        } else if (i10 == sf0Var.f27032r) {
            sf0Var.P = i11;
        } else if (i10 == sf0Var.d) {
            sf0Var.I = i11;
        } else if (i10 == sf0Var.f27015c) {
            sf0Var.H = i11;
        } else if (i10 == sf0Var.f27019f) {
            sf0Var.J = i11;
        } else if (i10 == sf0Var.e) {
            sf0Var.K = i11;
        } else if (i10 == sf0Var.v) {
            sf0Var.R = i11;
        } else if (i10 == sf0Var.f27034s) {
            sf0Var.Q = i11;
        } else if (i10 == sf0Var.f27039w) {
            sf0Var.S = i11;
        } else if (i10 == sf0Var.f27041x) {
            sf0Var.U = i11;
        } else if (i10 == sf0Var.h) {
            sf0Var.L = i11;
        } else if (i10 == sf0Var.f27027n) {
            sf0Var.M = i11;
        }
        c00 c00Var = sf0Var.f27026l0;
        if (c00Var != null) {
            c00Var.e(true, false, false);
        }
        sf0Var.g();
    }

    @Override
    public void m(int i10) {
        wv.P((wv) this.f26252b, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        lc0 lc0Var = (lc0) obj;
        return Float.valueOf(((o1.j) this.f26252b).f14133a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f26251a) {
            case 19:
                final iv0 iv0Var = ((as0) this.f26252b).d;
                iv0.r(iv0Var).r(iv0Var.f24106j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        iv0 iv0Var2 = iv0Var;
                        zh.b5 b5Var = (zh.b5) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = iv0.f24079d2;
                                AndroidUtilities.runOnUIThread(new yo0(4, iv0Var2, b5Var), 100L);
                                return;
                            default:
                                int[] iArr2 = iv0.f24079d2;
                                AndroidUtilities.runOnUIThread(new yo0(4, iv0Var2, b5Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final iv0 iv0Var2 = ((lt0) this.f26252b).d;
                iv0.r(iv0Var2).r(iv0Var2.f24106j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        iv0 iv0Var22 = iv0Var2;
                        zh.b5 b5Var = (zh.b5) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = iv0.f24079d2;
                                AndroidUtilities.runOnUIThread(new yo0(4, iv0Var22, b5Var), 100L);
                                return;
                            default:
                                int[] iArr2 = iv0.f24079d2;
                                AndroidUtilities.runOnUIThread(new yo0(4, iv0Var22, b5Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                t41 t41Var = (t41) this.f26252b;
                t41Var.f27319e0 = str;
                t41Var.f27324j0.N(true);
                return;
        }
    }

    @Override
    public boolean v(org.telegram.ui.wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        long j3;
        ho0 ho0Var = (ho0) this.f26252b;
        int i12 = ho0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = ho0Var.f23736z0;
        for (org.telegram.ui.r10 r10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(r10Var));
        }
        hashMap.clear();
        ho0Var.Q(false);
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
            org.telegram.ui.eo eoVar = new org.telegram.ui.eo(i13);
            wyVar.presentFragment(eoVar, true);
            eoVar.Ab(arrayList2);
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
    public void mo17run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pv.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void c() {
    }

    @Override
    public void i() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k0(ArrayList arrayList) {
    }

    @Override
    public void l() {
    }
}
