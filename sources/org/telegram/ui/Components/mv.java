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
import org.telegram.ui.wf1;
public final class mv implements org.telegram.ui.ActionBar.r0, Utilities.Callback5, org.telegram.ui.ActionBar.a2, gg.b2, GenericProvider, v80, ve0, cl0, org.telegram.ui.ly, ai.t9, MessagesStorage.StringCallback, j81, LanguageDetector.StringCallback, sv0, ImageReceiver.ImageReceiverDelegate {
    public final int f26279a;
    public final Object f26280b;

    public mv(Object obj, int i10) {
        this.f26279a = i10;
        this.f26280b = obj;
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
    public boolean K(org.telegram.ui.ry ryVar) {
        return false;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public void b(boolean z10) {
        ai.d9 d9Var = (ai.d9) this.f26280b;
        if (z10) {
            d9Var.p(30, false);
        }
    }

    @Override
    public void c() {
        ((ae0) this.f26280b).p(true);
    }

    @Override
    public boolean d(int i10, View view) {
        pj0 pj0Var;
        switch (this.f26279a) {
            case 14:
                qj0 qj0Var = (qj0) this.f26280b;
                ArrayList arrayList = qj0Var.f27368n;
                if (qj0Var.f27367f.j(i10) == 0 && (pj0Var = qj0Var.F) != null) {
                    pj0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                    return true;
                }
                return true;
            default:
                wm0 wm0Var = (wm0) this.f26280b;
                vm0 vm0Var = wm0Var.f29749c;
                MessageObject E = vm0Var.E(i10);
                wm0 wm0Var2 = vm0Var.f28773c;
                if (E == null) {
                    return false;
                }
                if (!wm0Var.I.g()) {
                    wm0Var.I.a();
                    vm0Var.q(0, wm0Var2.f29752r);
                }
                if (wm0Var.I.g()) {
                    wm0Var.I.e(E, view, 0);
                    if (!wm0Var.I.g()) {
                        vm0Var.q(0, wm0Var2.f29752r);
                    }
                    org.telegram.ui.m10 m10Var = wm0Var.J;
                    int id2 = E.getId();
                    m10Var.f35122a = E.getDialogId();
                    m10Var.f35123b = id2;
                }
                return true;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        l71 l71Var;
        double d;
        double d10;
        int i10;
        int i11;
        int ceil;
        double ceil2;
        m71 m71Var = (m71) this.f26280b;
        ImageReceiver imageReceiver2 = m71Var.Q;
        if (z10) {
            if (m71Var.N != null || m71Var.f26117d0 != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.bu0 bu0Var = m71Var.N;
                if (bu0Var != null) {
                    ArrayList arrayList = bu0Var.v;
                    int indexOf = arrayList.indexOf(bu0Var.c((int) m71Var.O));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = bu0Var.getVideoDuration() / 1000;
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
                    org.telegram.ui.bu0 bu0Var2 = m71Var.N;
                    int i12 = (int) m71Var.O;
                    int videoDuration2 = bu0Var2.getVideoDuration() / 1000;
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
                    m71Var.R = (int) ((min % 5) * bitmapWidth);
                    m71Var.S = (int) ((min / 5) * bitmapHeight);
                    m71Var.T = (int) bitmapWidth;
                    m71Var.U = (int) bitmapHeight;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 < m71Var.f26117d0.size()) {
                            l71Var = (l71) m71Var.f26117d0.get(i13);
                            if (i13 == 0) {
                                d = 0.0d;
                            } else {
                                d = l71Var.f25833a;
                            }
                            if (i13 == m71Var.f26117d0.size() - 1) {
                                d10 = 9.9999999E7d;
                            } else {
                                d10 = ((l71) m71Var.f26117d0.get(i13 + 1)).f25833a;
                            }
                            double d11 = m71Var.O;
                            if (d11 >= d && d11 <= d10) {
                                break;
                            }
                            i13++;
                        } else {
                            l71Var = null;
                            break;
                        }
                    }
                    if (l71Var != null) {
                        m71Var.R = l71Var.f25834b;
                        m71Var.S = l71Var.f25835c;
                        m71Var.T = m71Var.f26114b0;
                        m71Var.U = m71Var.f26116c0;
                    } else {
                        return;
                    }
                }
                m71Var.P = true;
                float f7 = m71Var.T / m71Var.U;
                if (f7 > 1.0f) {
                    i10 = (int) (dp / f7);
                } else {
                    dp = (int) (dp * f7);
                    i10 = dp;
                }
                ViewGroup.LayoutParams layoutParams = m71Var.getLayoutParams();
                if (m71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                    layoutParams.width = dp;
                    layoutParams.height = i10;
                    m71Var.setVisibility(0);
                    m71Var.requestLayout();
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
        pv0 pv0Var = (pv0) this.f26280b;
        pv0Var.f27168w = i10;
        pv0Var.f27169x = i11;
        ci.bb bbVar = pv0Var.L;
        if (bbVar != null) {
            bbVar.invalidate();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f26279a) {
            case 2:
                MediaDataController.getInstance(((cz) this.f26280b).v.f25968c1).clearRecentStickers();
                return;
            case 4:
                ((xm) this.f26280b).run();
                return;
            case 5:
                ((o20) this.f26280b).n();
                return;
            case 6:
                c70.Q((c70) this.f26280b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f26280b);
                return;
            case 23:
                wx0 wx0Var = (wx0) this.f26280b;
                wx0Var.e.presentFragment(new StickersActivity(wx0Var.d, null));
                b2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((yx0) this.f26280b);
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i10) {
        Utilities.Callback callback = ((h51) this.f26280b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override
    public void h(int i10) {
        y60 y60Var = (y60) this.f26280b;
        c70 c70Var = y60Var.f30170n;
        c70Var.J(y60Var.f30169f - 1);
        if (y60Var.h == null && !y60Var.e.e() && y60Var.h() <= 2) {
            c70Var.f26359s.e(false, true);
        }
        y60Var.l();
    }

    @Override
    public void k(int i10, int i11) {
        jf0 jf0Var = ((if0) this.f26280b).d;
        if (i10 == jf0Var.f25269b) {
            jf0Var.G = i11;
        } else if (i10 == jf0Var.f25288r) {
            jf0Var.P = i11;
        } else if (i10 == jf0Var.d) {
            jf0Var.I = i11;
        } else if (i10 == jf0Var.f25271c) {
            jf0Var.H = i11;
        } else if (i10 == jf0Var.f25275f) {
            jf0Var.J = i11;
        } else if (i10 == jf0Var.e) {
            jf0Var.K = i11;
        } else if (i10 == jf0Var.v) {
            jf0Var.R = i11;
        } else if (i10 == jf0Var.f25290s) {
            jf0Var.Q = i11;
        } else if (i10 == jf0Var.f25295w) {
            jf0Var.S = i11;
        } else if (i10 == jf0Var.f25297x) {
            jf0Var.U = i11;
        } else if (i10 == jf0Var.h) {
            jf0Var.L = i11;
        } else if (i10 == jf0Var.f25283n) {
            jf0Var.M = i11;
        }
        wz wzVar = jf0Var.f25282l0;
        if (wzVar != null) {
            wzVar.e(true, false, false);
        }
        jf0Var.g();
    }

    @Override
    public void m(int i10) {
        tv.P((tv) this.f26280b, i10);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public Object provide(Object obj) {
        bc0 bc0Var = (bc0) obj;
        return Float.valueOf(((o1.j) this.f26280b).f15325a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f26279a) {
            case 19:
                final yu0 yu0Var = ((rr0) this.f26280b).d;
                yu0.r(yu0Var).r(yu0Var.f30425j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        yu0 yu0Var2 = yu0Var;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = yu0.f30398d2;
                                AndroidUtilities.runOnUIThread(new ar0(1, yu0Var2, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = yu0.f30398d2;
                                AndroidUtilities.runOnUIThread(new ar0(1, yu0Var2, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final yu0 yu0Var2 = ((ct0) this.f26280b).d;
                yu0.r(yu0Var2).r(yu0Var2.f30425j1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i10 = r2;
                        yu0 yu0Var22 = yu0Var2;
                        ai.e9 e9Var = (ai.e9) obj;
                        switch (i10) {
                            case 0:
                                int[] iArr = yu0.f30398d2;
                                AndroidUtilities.runOnUIThread(new ar0(1, yu0Var22, e9Var), 100L);
                                return;
                            default:
                                int[] iArr2 = yu0.f30398d2;
                                AndroidUtilities.runOnUIThread(new ar0(1, yu0Var22, e9Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                f41 f41Var = (f41) this.f26280b;
                f41Var.f23842e0 = str;
                f41Var.f23847j0.N(true);
                return;
        }
    }

    @Override
    public boolean u(org.telegram.ui.ry ryVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        long j3;
        yn0 yn0Var = (yn0) this.f26280b;
        int i12 = yn0Var.H0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = yn0Var.f30358z0;
        for (org.telegram.ui.m10 m10Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(m10Var));
        }
        hashMap.clear();
        yn0Var.Q(false);
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
                if (!AccountInstance.getInstance(i12).getMessagesController().checkCanOpenChat(i13, ryVar)) {
                    return true;
                }
            }
            org.telegram.ui.xn xnVar = new org.telegram.ui.xn(i13);
            ryVar.presentFragment(xnVar, true);
            xnVar.Ab(arrayList2);
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
        ryVar.finishFragment();
        return true;
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void mo17run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mv.mo17run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
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
