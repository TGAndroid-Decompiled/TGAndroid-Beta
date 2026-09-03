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
public final class hv implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.c2, uf.j1, GenericProvider, x80, bf0, kl0, org.telegram.ui.jy, oh.b7, MessagesStorage.StringCallback, n81, LanguageDetector.StringCallback, tv0, ImageReceiver.ImageReceiverDelegate {
    public final int f27637a;
    public final Object f27638b;

    public hv(Object obj, int i10) {
        this.f27637a = i10;
        this.f27638b = obj;
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
        oh.l6 l6Var = (oh.l6) this.f27638b;
        if (z4) {
            l6Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((fe0) this.f27638b).p(true);
    }

    @Override
    public void d(int i10, int i11) {
        pv0 pv0Var = (pv0) this.f27638b;
        pv0Var.f30220w = i10;
        pv0Var.f30221x = i11;
        fg.h0 h0Var = pv0Var.I;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        p71 p71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        q71 q71Var = (q71) this.f27638b;
        ImageReceiver imageReceiver2 = q71Var.N;
        if (z4) {
            if (q71Var.K != null || q71Var.f30341a0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.ut0 ut0Var = q71Var.K;
                if (ut0Var != null) {
                    ArrayList arrayList = ut0Var.v;
                    int indexOf = arrayList.indexOf(ut0Var.c((int) q71Var.L));
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
                    org.telegram.ui.ut0 ut0Var2 = q71Var.K;
                    int i12 = (int) q71Var.L;
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
                    q71Var.O = (int) ((min % 5) * bitmapWidth);
                    q71Var.P = (int) ((min / 5) * bitmapHeight);
                    q71Var.Q = (int) bitmapWidth;
                    q71Var.R = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < q71Var.f30341a0.size()) {
                            p71Var = (p71) q71Var.f30341a0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = p71Var.f29998a;
                            }
                            if (i13 == q71Var.f30341a0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((p71) q71Var.f30341a0.get(i13 + 1)).f29998a;
                            }
                            double d11 = q71Var.L;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            p71Var = null;
                            break;
                        }
                    }
                    if (p71Var != null) {
                        q71Var.O = p71Var.f29999b;
                        q71Var.P = p71Var.f30000c;
                        q71Var.Q = q71Var.V;
                        q71Var.R = q71Var.W;
                    } else {
                        return;
                    }
                }
                q71Var.M = true;
                float f10 = q71Var.Q / q71Var.R;
                if (f10 > 1.0f) {
                    i10 = (int) (dp / f10);
                } else {
                    dp = (int) (dp * f10);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = q71Var.getLayoutParams();
                if (q71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    q71Var.setVisibility(0);
                    q71Var.requestLayout();
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
        yj0 yj0Var;
        switch (this.f27637a) {
            case 14:
                zj0 zj0Var = (zj0) this.f27638b;
                ArrayList arrayList = zj0Var.f33954n;
                if (zj0Var.f33953f.j(i10) == 0 && (yj0Var = zj0Var.C) != null) {
                    yj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                dn0 dn0Var = (dn0) this.f27638b;
                cn0 cn0Var = dn0Var.f26311c;
                MessageObject E = cn0Var.E(i10);
                dn0 dn0Var2 = cn0Var.f26013c;
                if (E == null) {
                    return false;
                }
                if (!dn0Var.F.f()) {
                    dn0Var.F.a();
                    cn0Var.q(0, dn0Var2.f26315r);
                }
                if (dn0Var.F.f()) {
                    dn0Var.F.d(E, view, 0);
                    if (!dn0Var.F.f()) {
                        cn0Var.q(0, dn0Var2.f26315r);
                    }
                    org.telegram.ui.l10 l10Var = dn0Var.G;
                    int id2 = E.getId();
                    l10Var.f38464a = E.getDialogId();
                    l10Var.f38465b = id2;
                }
                return true;
        }
    }

    @Override
    public void g(int i10) {
        a70 a70Var = (a70) this.f27638b;
        e70 e70Var = a70Var.f25175n;
        e70Var.I(a70Var.f25174f - 1);
        if (a70Var.h == null && !a70Var.f25173e.e() && a70Var.h() <= 2) {
            e70Var.f30670s.e(false, true);
        }
        a70Var.l();
    }

    @Override
    public void h(int i10) {
        ov.P((ov) this.f27638b, i10);
    }

    @Override
    public void i(int i10) {
        Utilities.Callback callback = ((h51) this.f27638b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f27637a) {
            case 2:
                MediaDataController.getInstance(((dz) this.f27638b).v.Z0).clearRecentStickers();
                return;
            case 4:
                ((gy) this.f27638b).run();
                return;
            case 5:
                ((p20) this.f27638b).n();
                return;
            case 6:
                e70.Q((e70) this.f27638b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f27638b);
                return;
            case 23:
                zx0 zx0Var = (zx0) this.f27638b;
                zx0Var.f34043e.presentFragment(new StickersActivity(zx0Var.d, null));
                d2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((by0) this.f27638b);
                d2Var.dismiss();
                return;
        }
    }

    @Override
    public void l(int i10, int i11) {
        pf0 pf0Var = ((of0) this.f27638b).d;
        if (i10 == pf0Var.f30049b) {
            pf0Var.D = i11;
        } else if (i10 == pf0Var.f30069r) {
            pf0Var.M = i11;
        } else if (i10 == pf0Var.d) {
            pf0Var.F = i11;
        } else if (i10 == pf0Var.f30051c) {
            pf0Var.E = i11;
        } else if (i10 == pf0Var.f30056f) {
            pf0Var.G = i11;
        } else if (i10 == pf0Var.f30054e) {
            pf0Var.H = i11;
        } else if (i10 == pf0Var.v) {
            pf0Var.O = i11;
        } else if (i10 == pf0Var.f30071s) {
            pf0Var.N = i11;
        } else if (i10 == pf0Var.f30076w) {
            pf0Var.P = i11;
        } else if (i10 == pf0Var.f30078x) {
            pf0Var.R = i11;
        } else if (i10 == pf0Var.h) {
            pf0Var.I = i11;
        } else if (i10 == pf0Var.f30064n) {
            pf0Var.J = i11;
        }
        xz xzVar = pf0Var.f30060i0;
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
        return Float.valueOf(((kb.a) this.f27638b).f11044a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f27637a) {
            case 19:
                final yu0 yu0Var = ((rr0) this.f27638b).d;
                yu0.r(yu0Var).r(yu0Var.f33624g1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        yu0 yu0Var2 = yu0Var;
                        oh.m6 m6Var = (oh.m6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = yu0.a2;
                                AndroidUtilities.runOnUIThread(new b90(17, yu0Var2, m6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = yu0.a2;
                                AndroidUtilities.runOnUIThread(new b90(17, yu0Var2, m6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final yu0 yu0Var2 = ((bt0) this.f27638b).d;
                yu0.r(yu0Var2).r(yu0Var2.f33624g1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        yu0 yu0Var22 = yu0Var2;
                        oh.m6 m6Var = (oh.m6) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = yu0.a2;
                                AndroidUtilities.runOnUIThread(new b90(17, yu0Var22, m6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = yu0.a2;
                                AndroidUtilities.runOnUIThread(new b90(17, yu0Var22, m6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                g41 g41Var = (g41) this.f27638b;
                g41Var.f27088b0 = str;
                g41Var.f27093g0.N(true);
                return;
        }
    }

    @Override
    public boolean v(org.telegram.ui.py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        long j10;
        do0 do0Var = (do0) this.f27638b;
        int i12 = do0Var.E0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = do0Var.f26341w0;
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
