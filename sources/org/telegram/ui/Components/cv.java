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
import org.telegram.ui.ze1;
public final class cv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.b2, rf.j1, GenericProvider, q80, qe0, bl0, org.telegram.ui.yx, lh.a7, MessagesStorage.StringCallback, b81, LanguageDetector.StringCallback, kv0, ImageReceiver.ImageReceiverDelegate {
    public final int f27576a;
    public final Object f27577b;

    public cv(Object obj, int i10) {
        this.f27576a = i10;
        this.f27577b = obj;
    }

    @Override
    public boolean A(int i10) {
        return true;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(org.telegram.ui.fy fyVar) {
        return false;
    }

    @Override
    public void b() {
        ((vd0) this.f27577b).p(true);
    }

    @Override
    public boolean c(int i10, View view) {
        oj0 oj0Var;
        switch (this.f27576a) {
            case 14:
                pj0 pj0Var = (pj0) this.f27577b;
                ArrayList arrayList = pj0Var.f31691n;
                if (pj0Var.f31690f.j(i10) == 0 && (oj0Var = pj0Var.B) != null) {
                    oj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                tm0 tm0Var = (tm0) this.f27577b;
                sm0 sm0Var = tm0Var.f32979c;
                MessageObject E = sm0Var.E(i10);
                tm0 tm0Var2 = sm0Var.f32690c;
                if (E == null) {
                    return false;
                }
                if (!tm0Var.E.f()) {
                    tm0Var.E.a();
                    sm0Var.q(0, tm0Var2.f32983r);
                }
                if (tm0Var.E.f()) {
                    tm0Var.E.d(E, view, 0);
                    if (!tm0Var.E.f()) {
                        sm0Var.q(0, tm0Var2.f32983r);
                    }
                    org.telegram.ui.z00 z00Var = tm0Var.F;
                    int id2 = E.getId();
                    z00Var.f45005a = E.getDialogId();
                    z00Var.f45006b = id2;
                }
                return true;
        }
    }

    @Override
    public void d(boolean z10) {
        lh.k6 k6Var = (lh.k6) this.f27577b;
        if (z10) {
            k6Var.p(30, false);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        c71 c71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        d71 d71Var = (d71) this.f27577b;
        ImageReceiver imageReceiver2 = d71Var.M;
        if (z10) {
            if (d71Var.J != null || d71Var.W != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.et0 et0Var = d71Var.J;
                if (et0Var != null) {
                    ArrayList arrayList = et0Var.v;
                    int indexOf = arrayList.indexOf(et0Var.c((int) d71Var.K));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = et0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.et0 et0Var2 = d71Var.J;
                    int i12 = (int) d71Var.K;
                    int videoDuration2 = et0Var2.getVideoDuration() / 1000;
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
                    d71Var.N = (int) ((min % 5) * bitmapWidth);
                    d71Var.O = (int) ((min / 5) * bitmapHeight);
                    d71Var.P = (int) bitmapWidth;
                    d71Var.Q = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < d71Var.W.size()) {
                            c71Var = (c71) d71Var.W.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = c71Var.f27362a;
                            }
                            if (i13 == d71Var.W.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((c71) d71Var.W.get(i13 + 1)).f27362a;
                            }
                            double d11 = d71Var.K;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            c71Var = null;
                            break;
                        }
                    }
                    if (c71Var != null) {
                        d71Var.N = c71Var.f27363b;
                        d71Var.O = c71Var.f27364c;
                        d71Var.P = d71Var.U;
                        d71Var.Q = d71Var.V;
                    } else {
                        return;
                    }
                }
                d71Var.L = true;
                float f9 = d71Var.P / d71Var.Q;
                if (f9 > 1.0f) {
                    i10 = (int) (dp / f9);
                } else {
                    dp = (int) (dp * f9);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = d71Var.getLayoutParams();
                if (d71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    d71Var.setVisibility(0);
                    d71Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void e(int i10, int i11) {
        hv0 hv0Var = (hv0) this.f27577b;
        hv0Var.f29259w = i10;
        hv0Var.f29260x = i11;
        cg.h0 h0Var = hv0Var.H;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }

    @Override
    public void f(int i10) {
        t60 t60Var = (t60) this.f27577b;
        x60 x60Var = t60Var.f32882n;
        x60Var.I(t60Var.f32881f - 1);
        if (t60Var.h == null && !t60Var.f32880e.e() && t60Var.h() <= 2) {
            x60Var.f28334s.e(false, true);
        }
        t60Var.l();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f27576a) {
            case 2:
                MediaDataController.getInstance(((wy) this.f27577b).v.Y0).clearRecentStickers();
                return;
            case 4:
                ((rm) this.f27577b).run();
                return;
            case 5:
                ((j20) this.f27577b).n();
                return;
            case 6:
                x60.Q((x60) this.f27577b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f27577b);
                return;
            case 23:
                px0 px0Var = (px0) this.f27577b;
                px0Var.f31802e.presentFragment(new StickersActivity(px0Var.d, null));
                c2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((rx0) this.f27577b);
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(int i10) {
        Utilities.Callback callback = ((w41) this.f27577b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void i(int i10) {
        jv.P((jv) this.f27577b, i10);
    }

    @Override
    public void l(int i10, int i11) {
        ef0 ef0Var = ((df0) this.f27577b).d;
        if (i10 == ef0Var.f28024b) {
            ef0Var.C = i11;
        } else if (i10 == ef0Var.f28044r) {
            ef0Var.L = i11;
        } else if (i10 == ef0Var.d) {
            ef0Var.E = i11;
        } else if (i10 == ef0Var.f28026c) {
            ef0Var.D = i11;
        } else if (i10 == ef0Var.f28031f) {
            ef0Var.F = i11;
        } else if (i10 == ef0Var.f28029e) {
            ef0Var.G = i11;
        } else if (i10 == ef0Var.v) {
            ef0Var.N = i11;
        } else if (i10 == ef0Var.f28046s) {
            ef0Var.M = i11;
        } else if (i10 == ef0Var.f28051w) {
            ef0Var.O = i11;
        } else if (i10 == ef0Var.f28053x) {
            ef0Var.Q = i11;
        } else if (i10 == ef0Var.h) {
            ef0Var.H = i11;
        } else if (i10 == ef0Var.f28039n) {
            ef0Var.I = i11;
        }
        qz qzVar = ef0Var.f28034h0;
        if (qzVar != null) {
            qzVar.e(true, false, false);
        }
        ef0Var.g();
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        yb0 yb0Var = (yb0) obj;
        return Float.valueOf(((ib.a) this.f27577b).f8824a / 100.0f);
    }

    @Override
    public a0.h q() {
        return null;
    }

    @Override
    public void run(String str) {
        switch (this.f27576a) {
            case 19:
                final qu0 qu0Var = ((jr0) this.f27577b).d;
                qu0.r(qu0Var).r(qu0Var.f32069f1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        qu0 qu0Var2 = qu0Var;
                        lh.l6 l6Var = (lh.l6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = qu0.Z1;
                                AndroidUtilities.runOnUIThread(new ii0(10, qu0Var2, l6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = qu0.Z1;
                                AndroidUtilities.runOnUIThread(new ii0(10, qu0Var2, l6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final qu0 qu0Var2 = ((ts0) this.f27577b).d;
                qu0.r(qu0Var2).r(qu0Var2.f32069f1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        qu0 qu0Var22 = qu0Var2;
                        lh.l6 l6Var = (lh.l6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = qu0.Z1;
                                AndroidUtilities.runOnUIThread(new ii0(10, qu0Var22, l6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = qu0.Z1;
                                AndroidUtilities.runOnUIThread(new ii0(10, qu0Var22, l6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                v31 v31Var = (v31) this.f27577b;
                v31Var.f33444a0 = str;
                v31Var.f33449f0.N(true);
                return;
        }
    }

    @Override
    public a0.h t() {
        return null;
    }

    @Override
    public boolean v(org.telegram.ui.fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        long j10;
        tn0 tn0Var = (tn0) this.f27577b;
        int i12 = tn0Var.D0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = tn0Var.f33008v0;
        for (org.telegram.ui.z00 z00Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(z00Var));
        }
        hashMap.clear();
        tn0Var.Q(false);
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != AccountInstance.getInstance(i12).getUserConfig().getClientUserId() && charSequence == null) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i13 = a4.w.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i13.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else {
                if (DialogObject.isUserDialog(j11)) {
                    i13.putLong("user_id", j11);
                } else {
                    i13.putLong("chat_id", -j11);
                }
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, fyVar)) {
                    return true;
                }
            }
            org.telegram.ui.tn tnVar = new org.telegram.ui.tn(i13);
            fyVar.presentFragment(tnVar, true);
            tnVar.Ab(arrayList2);
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
        fyVar.finishFragment();
        return true;
    }

    @Override
    public void mo19run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cv.mo19run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void E(ArrayList arrayList) {
    }

    @Override
    public void a() {
    }

    @Override
    public void j() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m() {
    }
}
