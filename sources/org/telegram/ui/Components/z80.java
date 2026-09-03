package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class z80 implements Runnable {
    public final int f31303a;
    public final Object f31304b;
    public final Object f31305c;

    public z80(int i10, Object obj, Object obj2) {
        this.f31303a = i10;
        this.f31304b = obj;
        this.f31305c = obj2;
    }

    @Override
    public final void run() {
        lh.r5 r5Var;
        boolean z4;
        boolean z10;
        boolean z11;
        int indexOf;
        int L;
        int i10;
        long j10;
        int i11 = 2;
        boolean z12 = false;
        boolean z13 = true;
        switch (this.f31303a) {
            case 0:
                a90 a90Var = (a90) this.f31304b;
                if (a90Var.L0 == ((g90) this.f31305c)) {
                    a90Var.performLongClick();
                    a90Var.L0 = null;
                    a90Var.J0.d(true);
                    return;
                }
                return;
            case 1:
                ((c90) this.f31304b).l((j90) this.f31305c, false);
                return;
            case 2:
                ea0 ea0Var = (ea0) this.f31304b;
                if (!((boolean[]) this.f31305c)[0] && (r5Var = ea0Var.R) != null) {
                    r5Var.run();
                }
                ea0Var.R = null;
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f31305c;
                ((ga0) this.f31304b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor));
                return;
            case 4:
                androidx.biometric.e0 e0Var = (androidx.biometric.e0) this.f31304b;
                Runnable runnable = (Runnable) this.f31305c;
                e0Var.getClass();
                runnable.run();
                ((HashMap) e0Var.f476b).remove(runnable);
                return;
            case 5:
                fh0 fh0Var = (fh0) this.f31304b;
                TLObject tLObject = (TLObject) this.f31305c;
                fh0Var.J = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    fh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        fh0Var.a(false);
                        return;
                    }
                    fh0Var.d();
                    fh0Var.f24889c.V2.N(true);
                    return;
                }
                return;
            case 6:
                kh0 kh0Var = (kh0) this.f31304b;
                ArrayList arrayList = (ArrayList) this.f31305c;
                ArrayList arrayList2 = kh0Var.f26284a;
                int i12 = kh0Var.f26293x;
                int size = arrayList.size();
                kh0Var.f26293x = size;
                if (i12 != size && kh0Var.P != null) {
                    kh0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    hh0 hh0Var = (hh0) arrayList2.get(i13);
                    if (hh0Var.f25416o && !hh0Var.f25417p) {
                        arrayList.add(hh0Var);
                    } else if (kh0.j(hh0Var.f25405a, arrayList) == null) {
                        kh0 kh0Var2 = hh0Var.f25425y;
                        float f10 = kh0Var2.K;
                        RectF rectF = hh0Var.f25407c;
                        RectF rectF2 = hh0Var.f25408f;
                        j90 j90Var = hh0Var.f25419r;
                        if (j90Var != null) {
                            j90Var.a();
                            hh0Var.f25421t = z12;
                            hh0Var.f25420s = z12;
                        }
                        hh0Var.f25416o = z13;
                        if (rectF.left - 1.0f <= f10) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (rectF.right + 1.0f >= kh0Var2.getMeasuredWidth() - f10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z4 && z10) {
                            z4 = false;
                            z10 = false;
                        }
                        hh0Var.f25409g.set(rectF);
                        rectF2.set(rectF);
                        if (z4) {
                            rectF2.right = rectF2.left;
                        } else if (z10) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = hh0Var.f25405a;
                            if (i14 != 3 && i14 != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                                if (kh0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    hh0Var.e.d(0.0f, z11);
                                    arrayList.add(hh0Var);
                                    i13++;
                                    z12 = false;
                                    z13 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            hh0Var.e.d(0.0f, z11);
                            arrayList.add(hh0Var);
                            i13++;
                            z12 = false;
                            z13 = true;
                        }
                        z11 = true;
                        hh0Var.e.d(0.0f, z11);
                        arrayList.add(hh0Var);
                        i13++;
                        z12 = false;
                        z13 = true;
                    }
                    i13++;
                    z12 = false;
                    z13 = true;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                kh0Var.invalidate();
                return;
            case 7:
                hh0 hh0Var2 = (hh0) this.f31305c;
                jh0 jh0Var = ((kh0) this.f31304b).C;
                int i15 = hh0Var2.f25405a;
                RectF rectF3 = hh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.wx0) jh0Var).f39785b, i15, rectF3.left, rectF3.top);
                return;
            case 8:
                ViewParent viewParent = (ViewParent) this.f31305c;
                ((org.telegram.ui.Cells.s1) this.f31304b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 9:
                RLottieNative rLottieNative = (RLottieNative) this.f31304b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f31305c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 10:
                oj0 oj0Var = (oj0) this.f31304b;
                ArrayList arrayList3 = (ArrayList) this.f31305c;
                ArrayList arrayList4 = oj0Var.f27581r;
                oj0Var.f27580n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    nj0 nj0Var = (nj0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 < arrayList4.size()) {
                            if (MessageObject.getObjectPeerId(((nj0) arrayList4.get(i17)).f27280a) == MessageObject.getObjectPeerId(nj0Var.f27280a)) {
                                if (nj0Var.f27282c > 0) {
                                    ((nj0) arrayList4.get(i17)).f27282c = nj0Var.f27282c;
                                }
                            } else {
                                i17++;
                            }
                        } else {
                            arrayList4.add(nj0Var);
                        }
                    }
                }
                q0.a aVar = oj0Var.f27583w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                oj0Var.a();
                return;
            case 11:
                vn0 vn0Var = (vn0) this.f31304b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f31305c;
                ArrayList arrayList5 = vn0Var.H;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (L = vn0Var.L()) < vn0Var.h()) {
                    arrayList5.remove(indexOf);
                    vn0Var.u(L + 1 + indexOf);
                    int size4 = vn0Var.f44961g0.e.size();
                    int size5 = arrayList5.size();
                    if (vn0Var.D0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        vn0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((vn0) this.f31304b).T();
                qc.a0((org.telegram.ui.qy) this.f31305c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 13:
                ((go0) this.f31304b).sendAccessibilityEvent((View) this.f31305c, 4);
                return;
            case 14:
                ve veVar = (ve) this.f31304b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f31305c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    veVar.dismiss();
                    return;
                }
                return;
            case 15:
                ((WindowManager) this.f31305c).removeView(((ve) this.f31304b).B);
                return;
            case 16:
                lq0 lq0Var = (lq0) this.f31304b;
                TLObject tLObject2 = (TLObject) this.f31305c;
                if (tLObject2 != null) {
                    lq0Var.f26842h0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    lq0Var.Z0();
                    if (lq0Var.f26844j0) {
                        lq0Var.M0();
                    }
                }
                lq0Var.f26843i0 = false;
                return;
            case 17:
                qt0 qt0Var = (qt0) this.f31304b;
                sq0 sq0Var = (sq0) this.f31305c;
                qt0Var.D = null;
                qt0Var.E = null;
                sq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new od0(sq0Var, 12)).start();
                return;
            case 18:
                nh.m6 m6Var = (nh.m6) this.f31305c;
                sr0 sr0Var = ((yu0) this.f31304b).T;
                if (sr0Var != null) {
                    int i18 = m6Var.f15598a;
                    sr0Var.f37277n.d(i18, sr0Var.f37279s.i(i18));
                    return;
                }
                return;
            case 19:
                qc.a0(((gt0) this.f31304b).f25236f.f31155s1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f31305c).title)).k(true);
                return;
            case 20:
                tt0 tt0Var = (tt0) this.f31304b;
                String str = (String) this.f31305c;
                if (!tt0Var.v.f31149q1[tt0Var.f29030r].f27368a.isEmpty() && ((i10 = tt0Var.f29030r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) kf.k0.i(1, tt0Var.v.f31149q1[i10].f27368a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    yu0 yu0Var = tt0Var.v;
                    if (yu0Var.f31130g1 == yu0Var.f31155s1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    tt0Var.F(id2, str, dialogId, j10);
                } else if (tt0Var.f29030r == 3) {
                    yu0 yu0Var2 = tt0Var.v;
                    tt0Var.F(0, str, yu0Var2.f31130g1, yu0Var2.C);
                }
                int i19 = tt0Var.f29030r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(tt0Var.v.f31149q1[tt0Var.f29030r].f27368a);
                    tt0Var.f29031s++;
                    Utilities.searchQueue.postRunnable(new gp(tt0Var, str, arrayList6, 22));
                    return;
                }
                return;
            case 21:
                tt0 tt0Var2 = (tt0) this.f31304b;
                ArrayList arrayList7 = (ArrayList) this.f31305c;
                yu0 yu0Var3 = tt0Var2.v;
                boolean z14 = yu0Var3.S0;
                qt0[] qt0VarArr = yu0Var3.f31131h0;
                if (z14) {
                    tt0Var2.f29031s--;
                    int h = tt0Var2.h();
                    tt0Var2.d = arrayList7;
                    int h9 = tt0Var2.h();
                    if (tt0Var2.f29031s == 0 || h9 != 0) {
                        yu0Var3.m1(false);
                    }
                    for (int i20 = 0; i20 < qt0VarArr.length; i20++) {
                        qt0 qt0Var2 = qt0VarArr[i20];
                        if (qt0Var2.C == tt0Var2.f29030r) {
                            if (tt0Var2.f29031s == 0 && h9 == 0) {
                                qt0Var2.f28263w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qt0VarArr[i20].f28263w.f31485f.setVisibility(8);
                                qt0VarArr[i20].f28263w.e(false, true);
                            } else if (h == 0) {
                                yu0Var3.z(qt0Var2.h, 0, null);
                            }
                        }
                    }
                    tt0Var2.l();
                    return;
                }
                return;
            case 22:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, (TLObject) this.f31304b, (TLRPC.Document) this.f31305c, null, bool);
                return;
            case 23:
                MessagesController.getInstance(((ly0) this.f31304b).f26894a.f28317a).updateEmojiStatus((TLRPC.EmojiStatus) this.f31305c);
                return;
            case 24:
                w21 w21Var = (w21) this.f31304b;
                MessagesController.getInstance(w21Var.f30124b).getTopicsController().deleteTopics(-w21Var.f30126c, (ArrayList) this.f31305c);
                int i22 = w21.f30121c0;
                return;
            case 25:
                w21 w21Var2 = (w21) this.f31304b;
                w21Var2.getClass();
                MessagesController.getInstance(w21Var2.f30124b).loadFullChat(((TLRPC.Updates) this.f31305c).chats.get(0).f19159id, 0, true);
                return;
            case 26:
                org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.f31304b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f31305c;
                if (j1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    j1Var.f0(i11);
                    return;
                }
                return;
            case 27:
                v31.o((v31) this.f31304b, (TLObject) this.f31305c);
                return;
            case 28:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f31304b;
                String str2 = (String) this.f31305c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    return;
                }
                return;
            default:
                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this.f31304b;
                ((org.telegram.ui.ActionBar.p1) this.f31305c).d(true);
                m41.a(ykVar.getContext(), ykVar.d);
                return;
        }
    }

    public z80(Object obj, Object obj2, Object obj3, int i10) {
        this.f31303a = i10;
        this.f31304b = obj;
        this.f31305c = obj2;
    }
}
