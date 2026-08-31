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
import org.telegram.ui.mf1;
public final class hv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.c2, uf.j1, GenericProvider, x80, bf0, ll0, org.telegram.ui.jy, oh.b7, MessagesStorage.StringCallback, o81, LanguageDetector.StringCallback, uv0, ImageReceiver.ImageReceiverDelegate {
    public final int f27590a;
    public final Object f27591b;

    public hv(Object obj, int i10) {
        this.f27590a = i10;
        this.f27591b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(org.telegram.ui.py pyVar) {
        return false;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public boolean R(int i10) {
        return true;
    }

    @Override
    public void b(boolean z4) {
        oh.l6 l6Var = (oh.l6) this.f27591b;
        if (z4) {
            l6Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((fe0) this.f27591b).p(true);
    }

    @Override
    public void d(int i10, int i11) {
        qv0 qv0Var = (qv0) this.f27591b;
        qv0Var.f30511w = i10;
        qv0Var.f30512x = i11;
        fg.h0 h0Var = qv0Var.I;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        q71 q71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        r71 r71Var = (r71) this.f27591b;
        ImageReceiver imageReceiver2 = r71Var.N;
        if (z4) {
            if (r71Var.K != null || r71Var.f30626a0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.pt0 pt0Var = r71Var.K;
                if (pt0Var != null) {
                    ArrayList arrayList = pt0Var.v;
                    int indexOf = arrayList.indexOf(pt0Var.c((int) r71Var.L));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = pt0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.pt0 pt0Var2 = r71Var.K;
                    int i12 = (int) r71Var.L;
                    int videoDuration2 = pt0Var2.getVideoDuration() / 1000;
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
                    r71Var.O = (int) ((min % 5) * bitmapWidth);
                    r71Var.P = (int) ((min / 5) * bitmapHeight);
                    r71Var.Q = (int) bitmapWidth;
                    r71Var.R = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < r71Var.f30626a0.size()) {
                            q71Var = (q71) r71Var.f30626a0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = q71Var.f30336a;
                            }
                            if (i13 == r71Var.f30626a0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((q71) r71Var.f30626a0.get(i13 + 1)).f30336a;
                            }
                            double d11 = r71Var.L;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            q71Var = null;
                            break;
                        }
                    }
                    if (q71Var != null) {
                        r71Var.O = q71Var.f30337b;
                        r71Var.P = q71Var.f30338c;
                        r71Var.Q = r71Var.V;
                        r71Var.R = r71Var.W;
                    } else {
                        return;
                    }
                }
                r71Var.M = true;
                float f10 = r71Var.Q / r71Var.R;
                if (f10 > 1.0f) {
                    i10 = (int) (dp / f10);
                } else {
                    dp = (int) (dp * f10);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = r71Var.getLayoutParams();
                if (r71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    r71Var.setVisibility(0);
                    r71Var.requestLayout();
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
        zj0 zj0Var;
        switch (this.f27590a) {
            case 14:
                ak0 ak0Var = (ak0) this.f27591b;
                ArrayList arrayList = ak0Var.f25276n;
                if (ak0Var.f25275f.j(i10) == 0 && (zj0Var = ak0Var.C) != null) {
                    zj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                en0 en0Var = (en0) this.f27591b;
                dn0 dn0Var = en0Var.f26585c;
                MessageObject E = dn0Var.E(i10);
                en0 en0Var2 = dn0Var.f26301c;
                if (E == null) {
                    return false;
                }
                if (!en0Var.F.f()) {
                    en0Var.F.a();
                    dn0Var.q(0, en0Var2.f26589r);
                }
                if (en0Var.F.f()) {
                    en0Var.F.d(E, view, 0);
                    if (!en0Var.F.f()) {
                        dn0Var.q(0, en0Var2.f26589r);
                    }
                    org.telegram.ui.l10 l10Var = en0Var.G;
                    int id2 = E.getId();
                    l10Var.f38557a = E.getDialogId();
                    l10Var.f38558b = id2;
                }
                return true;
        }
    }

    @Override
    public void g(int i10) {
        a70 a70Var = (a70) this.f27591b;
        e70 e70Var = a70Var.f25175n;
        e70Var.I(a70Var.f25174f - 1);
        if (a70Var.h == null && !a70Var.f25173e.e() && a70Var.h() <= 2) {
            e70Var.f30993s.e(false, true);
        }
        a70Var.l();
    }

    @Override
    public void h(int i10) {
        ov.P((ov) this.f27591b, i10);
    }

    @Override
    public void i(int i10) {
        Utilities.Callback callback = ((j51) this.f27591b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f27590a) {
            case 2:
                MediaDataController.getInstance(((dz) this.f27591b).v.Z0).clearRecentStickers();
                return;
            case 4:
                ((gy) this.f27591b).run();
                return;
            case 5:
                ((p20) this.f27591b).n();
                return;
            case 6:
                e70.Q((e70) this.f27591b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f27591b);
                return;
            case 23:
                ay0 ay0Var = (ay0) this.f27591b;
                ay0Var.f25375e.presentFragment(new StickersActivity(ay0Var.d, null));
                d2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((cy0) this.f27591b);
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void l(int i10, int i11) {
        pf0 pf0Var = ((of0) this.f27591b).d;
        if (i10 == pf0Var.f30036b) {
            pf0Var.D = i11;
        } else if (i10 == pf0Var.f30056r) {
            pf0Var.M = i11;
        } else if (i10 == pf0Var.d) {
            pf0Var.F = i11;
        } else if (i10 == pf0Var.f30038c) {
            pf0Var.E = i11;
        } else if (i10 == pf0Var.f30043f) {
            pf0Var.G = i11;
        } else if (i10 == pf0Var.f30041e) {
            pf0Var.H = i11;
        } else if (i10 == pf0Var.v) {
            pf0Var.O = i11;
        } else if (i10 == pf0Var.f30058s) {
            pf0Var.N = i11;
        } else if (i10 == pf0Var.f30063w) {
            pf0Var.P = i11;
        } else if (i10 == pf0Var.f30065x) {
            pf0Var.R = i11;
        } else if (i10 == pf0Var.h) {
            pf0Var.I = i11;
        } else if (i10 == pf0Var.f30051n) {
            pf0Var.J = i11;
        }
        xz xzVar = pf0Var.f30047i0;
        if (xzVar != null) {
            xzVar.e(true, false, false);
        }
        pf0Var.g();
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        fc0 fc0Var = (fc0) obj;
        return Float.valueOf(((kb.a) this.f27591b).f11044a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f27590a) {
            case 19:
                final zu0 zu0Var = ((sr0) this.f27591b).d;
                zu0.r(zu0Var).r(zu0Var.f33979g1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        zu0 zu0Var2 = zu0Var;
                        oh.m6 m6Var = (oh.m6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = zu0.a2;
                                AndroidUtilities.runOnUIThread(new a90(18, zu0Var2, m6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = zu0.a2;
                                AndroidUtilities.runOnUIThread(new a90(18, zu0Var2, m6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final zu0 zu0Var2 = ((ct0) this.f27591b).d;
                zu0.r(zu0Var2).r(zu0Var2.f33979g1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        zu0 zu0Var22 = zu0Var2;
                        oh.m6 m6Var = (oh.m6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = zu0.a2;
                                AndroidUtilities.runOnUIThread(new a90(18, zu0Var22, m6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = zu0.a2;
                                AndroidUtilities.runOnUIThread(new a90(18, zu0Var22, m6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                h41 h41Var = (h41) this.f27591b;
                h41Var.f27377b0 = str;
                h41Var.f27382g0.N(true);
                return;
        }
    }

    @Override
    public boolean v(org.telegram.ui.py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, mf1 mf1Var) {
        long j10;
        eo0 eo0Var = (eo0) this.f27591b;
        int i12 = eo0Var.E0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = eo0Var.f26618w0;
        for (org.telegram.ui.l10 l10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(l10Var));
        }
        hashMap.clear();
        eo0Var.Q(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, pyVar)) {
                    return true;
                }
            }
            org.telegram.ui.xn xnVar = new org.telegram.ui.xn(i13);
            pyVar.presentFragment(xnVar, true);
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
        pyVar.finishFragment();
        return true;
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void mo27run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hv.mo27run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void V(ArrayList arrayList) {
    }

    @Override
    public void a() {
    }

    @Override
    public void e() {
    }

    @Override
    public void k() {
    }

    @Override
    public void m() {
    }
}
