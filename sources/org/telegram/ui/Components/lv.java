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
import org.telegram.ui.dg1;
public final class lv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.b2, GenericProvider, d90, ef0, ml0, org.telegram.ui.oy, ai.t9, MessagesStorage.StringCallback, z81, LanguageDetector.StringCallback, ew0, ImageReceiver.ImageReceiverDelegate {
    public final int f26249a;
    public final Object f26250b;

    public lv(Object obj, int i10) {
        this.f26249a = i10;
        this.f26250b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.uy uyVar) {
        return false;
    }

    @Override
    public void a(int i10) {
        g70 g70Var = (g70) this.f26250b;
        k70 k70Var = g70Var.f24325n;
        k70Var.J(g70Var.f24324f - 1);
        if (g70Var.h == null && !g70Var.e.e() && g70Var.h() <= 2) {
            k70Var.f23474s.e(false, true);
        }
        g70Var.l();
    }

    @Override
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f26250b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public boolean d(int i10, View view) {
        zj0 zj0Var;
        switch (this.f26249a) {
            case 14:
                ak0 ak0Var = (ak0) this.f26250b;
                ArrayList arrayList = ak0Var.f22642n;
                if (ak0Var.f22641f.j(i10) == 0 && (zj0Var = ak0Var.F) != null) {
                    zj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                jn0 jn0Var = (jn0) this.f26250b;
                in0 in0Var = jn0Var.f25381c;
                MessageObject E = in0Var.E(i10);
                jn0 jn0Var2 = in0Var.f25020c;
                if (E == null) {
                    return false;
                }
                if (!jn0Var.I.g()) {
                    jn0Var.I.a();
                    in0Var.q(0, jn0Var2.f25384r);
                }
                if (jn0Var.I.g()) {
                    jn0Var.I.e(E, view, 0);
                    if (!jn0Var.I.g()) {
                        in0Var.q(0, jn0Var2.f25384r);
                    }
                    org.telegram.ui.p10 p10Var = jn0Var.J;
                    int id2 = E.getId();
                    p10Var.f36295a = E.getDialogId();
                    p10Var.f36296b = id2;
                }
                return true;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        a81 a81Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        b81 b81Var = (b81) this.f26250b;
        ImageReceiver imageReceiver2 = b81Var.Q;
        if (z10) {
            if (b81Var.N != null || b81Var.f22884d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.iu0 iu0Var = b81Var.N;
                if (iu0Var != null) {
                    ArrayList arrayList = iu0Var.v;
                    int indexOf = arrayList.indexOf(iu0Var.c((int) b81Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = iu0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.iu0 iu0Var2 = b81Var.N;
                    int i12 = (int) b81Var.O;
                    int videoDuration2 = iu0Var2.getVideoDuration() / 1000;
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
                    b81Var.R = (int) ((min % 5) * bitmapWidth);
                    b81Var.S = (int) ((min / 5) * bitmapHeight);
                    b81Var.T = (int) bitmapWidth;
                    b81Var.U = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < b81Var.f22884d0.size()) {
                            a81Var = (a81) b81Var.f22884d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = a81Var.f22561a;
                            }
                            if (i13 == b81Var.f22884d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((a81) b81Var.f22884d0.get(i13 + 1)).f22561a;
                            }
                            double d11 = b81Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            a81Var = null;
                            break;
                        }
                    }
                    if (a81Var != null) {
                        b81Var.R = a81Var.f22562b;
                        b81Var.S = a81Var.f22563c;
                        b81Var.T = b81Var.f22881b0;
                        b81Var.U = b81Var.f22883c0;
                    } else {
                        return;
                    }
                }
                b81Var.P = true;
                float f7 = b81Var.T / b81Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = b81Var.getLayoutParams();
                if (b81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    b81Var.setVisibility(0);
                    b81Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e() {
        ((je0) this.f26250b).p(true);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26249a) {
            case 2:
                MediaDataController.getInstance(((bz) this.f26250b).v.f25892c1).clearRecentStickers();
                return;
            case 4:
                ((wm) this.f26250b).run();
                return;
            case 5:
                ((n20) this.f26250b).n();
                return;
            case 6:
                k70.Q((k70) this.f26250b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f26250b);
                return;
            case 23:
                jy0 jy0Var = (jy0) this.f26250b;
                jy0Var.e.presentFragment(new StickersActivity(jy0Var.d, null));
                b2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((ly0) this.f26250b);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10, int i11) {
        bw0 bw0Var = (bw0) this.f26250b;
        bw0Var.f23116w = i10;
        bw0Var.f23117x = i11;
        ci.eb ebVar = bw0Var.L;
        if (ebVar != null) {
            ebVar.invalidate();
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((x51) this.f26250b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public a0.i i() {
        return null;
    }

    @Override
    public void l(int i10, int i11) {
        sf0 sf0Var = ((rf0) this.f26250b).d;
        if (i10 == sf0Var.f28133b) {
            sf0Var.G = i11;
        } else if (i10 == sf0Var.f28152r) {
            sf0Var.P = i11;
        } else if (i10 == sf0Var.d) {
            sf0Var.I = i11;
        } else if (i10 == sf0Var.f28135c) {
            sf0Var.H = i11;
        } else if (i10 == sf0Var.f28139f) {
            sf0Var.J = i11;
        } else if (i10 == sf0Var.e) {
            sf0Var.K = i11;
        } else if (i10 == sf0Var.v) {
            sf0Var.R = i11;
        } else if (i10 == sf0Var.f28154s) {
            sf0Var.Q = i11;
        } else if (i10 == sf0Var.f28159w) {
            sf0Var.S = i11;
        } else if (i10 == sf0Var.f28161x) {
            sf0Var.U = i11;
        } else if (i10 == sf0Var.h) {
            sf0Var.L = i11;
        } else if (i10 == sf0Var.f28147n) {
            sf0Var.M = i11;
        }
        vz vzVar = sf0Var.f28146l0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
        sf0Var.g();
    }

    @Override
    public void m(int i10) {
        sv.P((sv) this.f26250b, i10);
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        lc0 lc0Var = (lc0) obj;
        return Float.valueOf(((o1.j) this.f26250b).f15489a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f26249a) {
            case 19:
                final kv0 kv0Var = ((ds0) this.f26250b).d;
                kv0.r(kv0Var).r(kv0Var.f25823j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        kv0 kv0Var2 = kv0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = kv0.f25796d2;
                                AndroidUtilities.runOnUIThread(new po0(5, kv0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = kv0.f25796d2;
                                AndroidUtilities.runOnUIThread(new po0(5, kv0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final kv0 kv0Var2 = ((ot0) this.f26250b).d;
                kv0.r(kv0Var2).r(kv0Var2.f25823j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        kv0 kv0Var22 = kv0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = kv0.f25796d2;
                                AndroidUtilities.runOnUIThread(new po0(5, kv0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = kv0.f25796d2;
                                AndroidUtilities.runOnUIThread(new po0(5, kv0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                v41 v41Var = (v41) this.f26250b;
                v41Var.f28919e0 = str;
                v41Var.f28924j0.N(true);
                return;
        }
    }

    @Override
    public boolean s(int i10) {
        return true;
    }

    @Override
    public boolean u(org.telegram.ui.uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, dg1 dg1Var) {
        long j3;
        lo0 lo0Var = (lo0) this.f26250b;
        int i12 = lo0Var.I0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = lo0Var.A0;
        for (org.telegram.ui.p10 p10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(p10Var));
        }
        hashMap.clear();
        lo0Var.R(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, uyVar)) {
                    return true;
                }
            }
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i13);
            uyVar.presentFragment(znVar, true);
            znVar.Ab(arrayList2);
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
        uyVar.finishFragment();
        return true;
    }

    @Override
    public void mo17run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lv.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void F(ArrayList arrayList) {
    }

    @Override
    public void c() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k() {
    }

    @Override
    public void n() {
    }
}
