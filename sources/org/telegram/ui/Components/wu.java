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
import org.telegram.ui.we1;
public final class wu implements org.telegram.ui.ActionBar.s0, Utilities.Callback5, org.telegram.ui.ActionBar.b2, of.u1, GenericProvider, d80, ce0, ok0, org.telegram.ui.wx, ih.d7, MessagesStorage.StringCallback, p71, LanguageDetector.StringCallback, av0, ImageReceiver.ImageReceiverDelegate {
    public final int f34372a;
    public final Object f34373b;

    public wu(Object obj, int i9) {
        this.f34372a = i9;
        this.f34373b = obj;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(org.telegram.ui.dy dyVar) {
        return false;
    }

    @Override
    public a0.h O() {
        return null;
    }

    @Override
    public boolean a(int i9, View view) {
        dj0 dj0Var;
        switch (this.f34372a) {
            case 14:
                ej0 ej0Var = (ej0) this.f34373b;
                ArrayList arrayList = ej0Var.f28042n;
                if (ej0Var.f28041f.j(i9) == 0 && (dj0Var = ej0Var.B) != null) {
                    dj0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList.get(i9)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i9));
                    return true;
                }
                return true;
            default:
                gm0 gm0Var = (gm0) this.f34373b;
                fm0 fm0Var = gm0Var.f28810c;
                MessageObject E = fm0Var.E(i9);
                gm0 gm0Var2 = fm0Var.f28513c;
                if (E == null) {
                    return false;
                }
                if (!gm0Var.E.f()) {
                    gm0Var.E.a();
                    fm0Var.q(0, gm0Var2.f28814r);
                }
                if (gm0Var.E.f()) {
                    gm0Var.E.d(E, view, 0);
                    if (!gm0Var.E.f()) {
                        fm0Var.q(0, gm0Var2.f28814r);
                    }
                    org.telegram.ui.x00 x00Var = gm0Var.F;
                    int id2 = E.getId();
                    x00Var.f44299a = E.getDialogId();
                    x00Var.f44300b = id2;
                }
                return true;
        }
    }

    @Override
    public void c() {
        ((hd0) this.f34373b).p(true);
    }

    @Override
    public void d(boolean z10) {
        ih.n6 n6Var = (ih.n6) this.f34373b;
        if (z10) {
            n6Var.p(30, false);
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        q61 q61Var;
        double d;
        double d9;
        int i9;
        int i10;
        int ceil;
        double ceil2;
        r61 r61Var = (r61) this.f34373b;
        ImageReceiver imageReceiver2 = r61Var.M;
        if (z10) {
            if (r61Var.J != null || r61Var.W != null) {
                int dp = AndroidUtilities.dp(150.0f);
                org.telegram.ui.gt0 gt0Var = r61Var.J;
                if (gt0Var != null) {
                    ArrayList arrayList = gt0Var.v;
                    int indexOf = arrayList.indexOf(gt0Var.c((int) r61Var.K));
                    if (indexOf != -1) {
                        if (indexOf == arrayList.size() - 1) {
                            int videoDuration = gt0Var.getVideoDuration() / 1000;
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
                            i10 = Math.min(25, (((int) ceil2) - ((arrayList.size() - 1) * 25)) + 1);
                        } else {
                            i10 = 25;
                        }
                    } else {
                        i10 = 0;
                    }
                    float bitmapWidth = imageReceiver2.getBitmapWidth() / Math.min(i10, 5);
                    float bitmapHeight = imageReceiver2.getBitmapHeight() / ((int) Math.ceil(i10 / 5.0f));
                    org.telegram.ui.gt0 gt0Var2 = r61Var.J;
                    int i11 = (int) r61Var.K;
                    int videoDuration2 = gt0Var2.getVideoDuration() / 1000;
                    if (videoDuration2 <= 100) {
                        ceil = ((int) Math.ceil(i11)) % 25;
                    } else if (videoDuration2 <= 250) {
                        ceil = ((int) Math.ceil(i11 / 2.0f)) % 25;
                    } else if (videoDuration2 <= 500) {
                        ceil = ((int) Math.ceil(i11 / 4.0f)) % 25;
                    } else if (videoDuration2 <= 1000) {
                        ceil = ((int) Math.ceil(i11 / 5.0f)) % 25;
                    } else {
                        ceil = ((int) Math.ceil(i11 / 10.0f)) % 25;
                    }
                    int min = Math.min(ceil, i10 - 1);
                    r61Var.N = (int) ((min % 5) * bitmapWidth);
                    r61Var.O = (int) ((min / 5) * bitmapHeight);
                    r61Var.P = (int) bitmapWidth;
                    r61Var.Q = (int) bitmapHeight;
                } else {
                    int i12 = 0;
                    while (true) {
                        if (i12 < r61Var.W.size()) {
                            q61Var = (q61) r61Var.W.get(i12);
                            if (i12 == 0) {
                                d = 0.0d;
                            } else {
                                d = q61Var.f31844a;
                            }
                            if (i12 == r61Var.W.size() - 1) {
                                d9 = 9.9999999E7d;
                            } else {
                                d9 = ((q61) r61Var.W.get(i12 + 1)).f31844a;
                            }
                            double d10 = r61Var.K;
                            if (d10 >= d && d10 <= d9) {
                                break;
                            }
                            i12++;
                        } else {
                            q61Var = null;
                            break;
                        }
                    }
                    if (q61Var != null) {
                        r61Var.N = q61Var.f31845b;
                        r61Var.O = q61Var.f31846c;
                        r61Var.P = r61Var.U;
                        r61Var.Q = r61Var.V;
                    } else {
                        return;
                    }
                }
                r61Var.L = true;
                float f10 = r61Var.P / r61Var.Q;
                if (f10 > 1.0f) {
                    i9 = (int) (dp / f10);
                } else {
                    dp = (int) (dp * f10);
                    i9 = dp;
                }
                ViewGroup.LayoutParams layoutParams = r61Var.getLayoutParams();
                if (r61Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i9) {
                    layoutParams.width = dp;
                    layoutParams.height = i9;
                    r61Var.setVisibility(0);
                    r61Var.requestLayout();
                }
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public void e(int i9) {
        g60 g60Var = (g60) this.f34373b;
        k60 k60Var = g60Var.f28659n;
        k60Var.I(g60Var.f28658f - 1);
        if (g60Var.h == null && !g60Var.f28657e.e() && g60Var.h() <= 2) {
            k60Var.f32375s.e(false, true);
        }
        g60Var.l();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f34372a) {
            case 2:
                MediaDataController.getInstance(((ny) this.f34373b).v.Y0).clearRecentStickers();
                return;
            case 4:
                ((org.telegram.ui.rl) this.f34373b).run();
                return;
            case 5:
                ((y10) this.f34373b).n();
                return;
            case 6:
                k60.P((k60) this.f34373b);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f34373b);
                return;
            case 23:
                ex0 ex0Var = (ex0) this.f34373b;
                ex0Var.f28215e.presentFragment(new StickersActivity(ex0Var.d, null));
                c2Var.dismiss();
                return;
            default:
                AndroidUtilities.hideKeyboard((gx0) this.f34373b);
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void g(int i9, int i10) {
        xu0 xu0Var = (xu0) this.f34373b;
        xu0Var.f34794w = i9;
        xu0Var.f34795x = i10;
        fh.l2 l2Var = xu0Var.H;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }

    @Override
    public void h(int i9) {
        Utilities.Callback callback = ((l41) this.f34373b).C;
        if (callback != null) {
            callback.run(Integer.valueOf(i9));
        }
    }

    @Override
    public void i(int i9) {
        dv.O((dv) this.f34373b, i9);
    }

    @Override
    public void l(int i9, int i10) {
        qe0 qe0Var = ((pe0) this.f34373b).d;
        if (i9 == qe0Var.f31892b) {
            qe0Var.C = i10;
        } else if (i9 == qe0Var.f31912r) {
            qe0Var.L = i10;
        } else if (i9 == qe0Var.d) {
            qe0Var.E = i10;
        } else if (i9 == qe0Var.f31894c) {
            qe0Var.D = i10;
        } else if (i9 == qe0Var.f31899f) {
            qe0Var.F = i10;
        } else if (i9 == qe0Var.f31897e) {
            qe0Var.G = i10;
        } else if (i9 == qe0Var.v) {
            qe0Var.N = i10;
        } else if (i9 == qe0Var.f31914s) {
            qe0Var.M = i10;
        } else if (i9 == qe0Var.f31919w) {
            qe0Var.O = i10;
        } else if (i9 == qe0Var.f31921x) {
            qe0Var.Q = i10;
        } else if (i9 == qe0Var.h) {
            qe0Var.H = i10;
        } else if (i9 == qe0Var.f31907n) {
            qe0Var.I = i10;
        }
        hz hzVar = qe0Var.f31902h0;
        if (hzVar != null) {
            hzVar.e(true, false, false);
        }
        qe0Var.g();
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override
    public boolean p0(int i9) {
        return true;
    }

    @Override
    public Object provide(Object obj) {
        jb0 jb0Var = (jb0) obj;
        return Float.valueOf(((gb.a) this.f34373b).f7689a / 100.0f);
    }

    @Override
    public void run(String str) {
        switch (this.f34372a) {
            case 19:
                final eu0 eu0Var = ((yq0) this.f34373b).d;
                eu0.r(eu0Var).r(eu0Var.f28136f1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i9 = r2;
                        eu0 eu0Var2 = eu0Var;
                        ih.o6 o6Var = (ih.o6) obj;
                        switch (i9) {
                            case 0:
                                int[] iArr = eu0.Z1;
                                AndroidUtilities.runOnUIThread(new jg0(13, eu0Var2, o6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = eu0.Z1;
                                AndroidUtilities.runOnUIThread(new jg0(13, eu0Var2, o6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            case 20:
                final eu0 eu0Var2 = ((is0) this.f34373b).d;
                eu0.r(eu0Var2).r(eu0Var2.f28136f1, str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        int i9 = r2;
                        eu0 eu0Var22 = eu0Var2;
                        ih.o6 o6Var = (ih.o6) obj;
                        switch (i9) {
                            case 0:
                                int[] iArr = eu0.Z1;
                                AndroidUtilities.runOnUIThread(new jg0(13, eu0Var22, o6Var), 100L);
                                return;
                            default:
                                int[] iArr2 = eu0.Z1;
                                AndroidUtilities.runOnUIThread(new jg0(13, eu0Var22, o6Var), 100L);
                                return;
                        }
                    }
                });
                return;
            default:
                k31 k31Var = (k31) this.f34373b;
                k31Var.f29924a0 = str;
                k31Var.f29929f0.N(true);
                return;
        }
    }

    @Override
    public boolean v(org.telegram.ui.dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        long j10;
        hn0 hn0Var = (hn0) this.f34373b;
        int i11 = hn0Var.D0;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        HashMap hashMap = hn0Var.f29155v0;
        for (org.telegram.ui.x00 x00Var : hashMap.keySet()) {
            arrayList2.add((MessageObject) hashMap.get(x00Var));
        }
        hashMap.clear();
        hn0Var.Q(false);
        if (arrayList.size() <= 1 && ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId != AccountInstance.getInstance(i11).getUserConfig().getClientUserId() && charSequence == null) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle i12 = aa.d.i("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j11)) {
                i12.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
            } else {
                if (DialogObject.isUserDialog(j11)) {
                    i12.putLong("user_id", j11);
                } else {
                    i12.putLong("chat_id", -j11);
                }
                if (!AccountInstance.getInstance(i11).getMessagesController().checkCanOpenChat(i12, dyVar)) {
                    return true;
                }
            }
            org.telegram.ui.qn qnVar = new org.telegram.ui.qn(i12);
            dyVar.presentFragment(qnVar, true);
            qnVar.Ab(arrayList2);
            return true;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            long j12 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
            if (charSequence != null) {
                j10 = j12;
                AccountInstance.getInstance(i11).getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
            } else {
                j10 = j12;
            }
            AccountInstance.getInstance(i11).getSendMessagesHelper().sendMessage(arrayList2, j10, false, false, true, 0, 0L);
        }
        dyVar.finishFragment();
        return true;
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void mo18run(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wu.mo18run(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void H0(ArrayList arrayList) {
    }

    @Override
    public void b() {
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
