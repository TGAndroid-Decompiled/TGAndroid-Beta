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
import org.telegram.ui.sf1;
public final class ev implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.c2, tf.i1, GenericProvider, w80, af0, jl0, org.telegram.ui.ky, nh.b7, MessagesStorage.StringCallback, n81, LanguageDetector.StringCallback, tv0, ImageReceiver.ImageReceiverDelegate {
    public final int f24699a;
    public final Object f24700b;

    public ev(Object obj, int i10) {
        this.f24699a = i10;
        this.f24700b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public a0.h H0() {
        return null;
    }

    @Override
    public boolean I(org.telegram.ui.qy qyVar) {
        return false;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public void b(boolean z4) {
        nh.l6 l6Var = (nh.l6) this.f24700b;
        if (z4) {
            l6Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((ee0) this.f24700b).p(true);
    }

    @Override
    public boolean d(int i10, View view) {
        xj0 xj0Var;
        switch (this.f24699a) {
            case 14:
                yj0 yj0Var = (yj0) this.f24700b;
                ArrayList arrayList = yj0Var.f31036n;
                if (yj0Var.f31035f.j(i10) == 0 && (xj0Var = yj0Var.C) != null) {
                    xj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                cn0 cn0Var = (cn0) this.f24700b;
                bn0 bn0Var = cn0Var.f23975c;
                MessageObject E = bn0Var.E(i10);
                cn0 cn0Var2 = bn0Var.f23724c;
                if (E == null) {
                    return false;
                }
                if (!cn0Var.F.f()) {
                    cn0Var.F.a();
                    bn0Var.q(0, cn0Var2.f23978r);
                }
                if (cn0Var.F.f()) {
                    cn0Var.F.d(E, view, 0);
                    if (!cn0Var.F.f()) {
                        bn0Var.q(0, cn0Var2.f23978r);
                    }
                    org.telegram.ui.m10 m10Var = cn0Var.G;
                    int id2 = E.getId();
                    m10Var.f35953a = E.getDialogId();
                    m10Var.f35954b = id2;
                }
                return true;
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
        p71 p71Var = (p71) this.f24700b;
        ImageReceiver imageReceiver2 = p71Var.N;
        if (z4) {
            if (p71Var.K != null || p71Var.f27785a0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.ut0 ut0Var = p71Var.K;
                if (ut0Var != null) {
                    ArrayList arrayList = ut0Var.v;
                    int indexOf = arrayList.indexOf(ut0Var.c((int) p71Var.L));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = ut0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.ut0 ut0Var2 = p71Var.K;
                    int i12 = (int) p71Var.L;
                    int videoDuration2 = ut0Var2.getVideoDuration() / 1000;
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
                        if (i13 < p71Var.f27785a0.size()) {
                            o71Var = (o71) p71Var.f27785a0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = o71Var.f27473a;
                            }
                            if (i13 == p71Var.f27785a0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((o71) p71Var.f27785a0.get(i13 + 1)).f27473a;
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
                        p71Var.O = o71Var.f27474b;
                        p71Var.P = o71Var.f27475c;
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
    public void e(int i10, int i11) {
        qv0 qv0Var = (qv0) this.f24700b;
        qv0Var.f28306w = i10;
        qv0Var.f28307x = i11;
        eg.h0 h0Var = qv0Var.I;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }

    @Override
    public void g(int i10) {
        Utilities.Callback callback = ((i51) this.f24700b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void i(int i10, int i11) {
        of0 of0Var = ((nf0) this.f24700b).d;
        if (i10 == of0Var.f27525b) {
            of0Var.D = i11;
        } else if (i10 == of0Var.f27544r) {
            of0Var.M = i11;
        } else if (i10 == of0Var.d) {
            of0Var.F = i11;
        } else if (i10 == of0Var.f27527c) {
            of0Var.E = i11;
        } else if (i10 == of0Var.f27531f) {
            of0Var.G = i11;
        } else if (i10 == of0Var.e) {
            of0Var.H = i11;
        } else if (i10 == of0Var.v) {
            of0Var.O = i11;
        } else if (i10 == of0Var.f27546s) {
            of0Var.N = i11;
        } else if (i10 == of0Var.f27551w) {
            of0Var.P = i11;
        } else if (i10 == of0Var.f27553x) {
            of0Var.R = i11;
        } else if (i10 == of0Var.h) {
            of0Var.I = i11;
        } else if (i10 == of0Var.f27539n) {
            of0Var.J = i11;
        }
        vz vzVar = of0Var.f27535i0;
        if (vzVar != null) {
            vzVar.e(true, false, false);
        }
        of0Var.g();
    }

    @Override
    public void k(int i10) {
        z60 z60Var = (z60) this.f24700b;
        d70 d70Var = z60Var.f31264n;
        d70Var.I(z60Var.f31263f - 1);
        if (z60Var.h == null && !z60Var.e.e() && z60Var.h() <= 2) {
            d70Var.f28095s.e(false, true);
        }
        z60Var.l();
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f24699a) {
            case 2:
                MediaDataController.getInstance(((bz) this.f24700b).v.Z0).clearRecentStickers();
                return;
            case 4:
                ((ey) this.f24700b).run();
                return;
            case 5:
                ((p20) this.f24700b).n();
                return;
            case 6:
                d70.Q((d70) this.f24700b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f24700b);
                return;
            case 23:
                zx0 zx0Var = (zx0) this.f24700b;
                zx0Var.e.presentFragment(new StickersActivity(zx0Var.d, null));
                d2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((by0) this.f24700b);
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void m(int i10) {
        lv.P((lv) this.f24700b, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        ec0 ec0Var = (ec0) obj;
        return Float.valueOf(((kb.a) this.f24700b).f10259a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f24699a) {
            case 19:
                final yu0 yu0Var = ((rr0) this.f24700b).d;
                yu0.r(yu0Var).r(yu0Var.f31130g1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        yu0 yu0Var2 = yu0Var;
                        nh.m6 m6Var = (nh.m6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = yu0.a2;
                                AndroidUtilities.runOnUIThread(new z80(18, yu0Var2, m6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = yu0.a2;
                                AndroidUtilities.runOnUIThread(new z80(18, yu0Var2, m6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final yu0 yu0Var2 = ((bt0) this.f24700b).d;
                yu0.r(yu0Var2).r(yu0Var2.f31130g1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        yu0 yu0Var22 = yu0Var2;
                        nh.m6 m6Var = (nh.m6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = yu0.a2;
                                AndroidUtilities.runOnUIThread(new z80(18, yu0Var22, m6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = yu0.a2;
                                AndroidUtilities.runOnUIThread(new z80(18, yu0Var22, m6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                g41 g41Var = (g41) this.f24700b;
                g41Var.f25043b0 = str;
                g41Var.f25048g0.N(true);
                return;
        }
    }

    @Override
    public boolean t1(int i10) {
        return true;
    }

    @Override
    public boolean w(org.telegram.ui.qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        long j10;
        co0 co0Var = (co0) this.f24700b;
        int i12 = co0Var.E0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = co0Var.f24004w0;
        for (org.telegram.ui.m10 m10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(m10Var));
        }
        hashMap.clear();
        co0Var.Q(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, qyVar)) {
                    return true;
                }
            }
            org.telegram.ui.zn znVar = new org.telegram.ui.zn(i13);
            qyVar.presentFragment(znVar, true);
            znVar.Ab(arrayList2);
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
        qyVar.finishFragment();
        return true;
    }

    @Override
    public void mo27run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ev.mo27run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void J1(ArrayList arrayList) {
    }

    @Override
    public void a() {
    }

    @Override
    public void f() {
    }

    @Override
    public void h() {
    }

    @Override
    public void j() {
    }
}
