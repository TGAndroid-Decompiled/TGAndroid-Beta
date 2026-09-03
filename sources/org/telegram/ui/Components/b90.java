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
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class b90 implements Runnable {
    public final int f25548a;
    public final Object f25549b;
    public final Object f25550c;

    public b90(int i10, Object obj, Object obj2) {
        this.f25548a = i10;
        this.f25549b = obj;
        this.f25550c = obj2;
    }

    @Override
    public final void run() {
        mh.r5 r5Var;
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
        switch (this.f25548a) {
            case 0:
                ((d90) this.f25549b).l((k90) this.f25550c, false);
                return;
            case 1:
                fa0 fa0Var = (fa0) this.f25549b;
                if (!((boolean[]) this.f25550c)[0] && (r5Var = fa0Var.R) != null) {
                    r5Var.run();
                }
                fa0Var.R = null;
                return;
            case 2:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f25550c;
                ((ha0) this.f25549b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor));
                return;
            case 3:
                oh.h4 h4Var = (oh.h4) this.f25549b;
                Runnable runnable = (Runnable) this.f25550c;
                h4Var.getClass();
                runnable.run();
                ((HashMap) h4Var.f17182b).remove(runnable);
                return;
            case 4:
                gh0 gh0Var = (gh0) this.f25549b;
                TLObject tLObject = (TLObject) this.f25550c;
                gh0Var.J = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    gh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        gh0Var.a(false);
                        return;
                    }
                    gh0Var.d();
                    gh0Var.f27172c.V2.N(true);
                    return;
                }
                return;
            case 5:
                lh0 lh0Var = (lh0) this.f25549b;
                ArrayList arrayList = (ArrayList) this.f25550c;
                ArrayList arrayList2 = lh0Var.f28758a;
                int i12 = lh0Var.f28768x;
                int size = arrayList.size();
                lh0Var.f28768x = size;
                if (i12 != size && lh0Var.P != null) {
                    lh0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    ih0 ih0Var = (ih0) arrayList2.get(i13);
                    if (ih0Var.f27831o && !ih0Var.f27832p) {
                        arrayList.add(ih0Var);
                    } else if (lh0.j(ih0Var.f27819a, arrayList) == null) {
                        lh0 lh0Var2 = ih0Var.f27840y;
                        float f10 = lh0Var2.K;
                        RectF rectF = ih0Var.f27821c;
                        RectF rectF2 = ih0Var.f27823f;
                        k90 k90Var = ih0Var.f27834r;
                        if (k90Var != null) {
                            k90Var.a();
                            ih0Var.f27836t = z12;
                            ih0Var.f27835s = z12;
                        }
                        ih0Var.f27831o = z13;
                        if (rectF.left - 1.0f <= f10) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (rectF.right + 1.0f >= lh0Var2.getMeasuredWidth() - f10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z4 && z10) {
                            z4 = false;
                            z10 = false;
                        }
                        ih0Var.f27824g.set(rectF);
                        rectF2.set(rectF);
                        if (z4) {
                            rectF2.right = rectF2.left;
                        } else if (z10) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = ih0Var.f27819a;
                            if (i14 != 3 && i14 != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                                if (lh0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    ih0Var.f27822e.d(0.0f, z11);
                                    arrayList.add(ih0Var);
                                    i13++;
                                    z12 = false;
                                    z13 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            ih0Var.f27822e.d(0.0f, z11);
                            arrayList.add(ih0Var);
                            i13++;
                            z12 = false;
                            z13 = true;
                        }
                        z11 = true;
                        ih0Var.f27822e.d(0.0f, z11);
                        arrayList.add(ih0Var);
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
                lh0Var.invalidate();
                return;
            case 6:
                ih0 ih0Var2 = (ih0) this.f25550c;
                kh0 kh0Var = ((lh0) this.f25549b).C;
                int i15 = ih0Var2.f27819a;
                RectF rectF3 = ih0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.wx0) kh0Var).f42873b, i15, rectF3.left, rectF3.top);
                return;
            case 7:
                ViewParent viewParent = (ViewParent) this.f25550c;
                ((org.telegram.ui.Cells.t1) this.f25549b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 8:
                RLottieNative rLottieNative = (RLottieNative) this.f25549b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f25550c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 9:
                pj0 pj0Var = (pj0) this.f25549b;
                ArrayList arrayList3 = (ArrayList) this.f25550c;
                ArrayList arrayList4 = pj0Var.f30113r;
                pj0Var.f30112n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    oj0 oj0Var = (oj0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 < arrayList4.size()) {
                            if (MessageObject.getObjectPeerId(((oj0) arrayList4.get(i17)).f29785a) == MessageObject.getObjectPeerId(oj0Var.f29785a)) {
                                if (oj0Var.f29787c > 0) {
                                    ((oj0) arrayList4.get(i17)).f29787c = oj0Var.f29787c;
                                }
                            } else {
                                i17++;
                            }
                        } else {
                            arrayList4.add(oj0Var);
                        }
                    }
                }
                q0.a aVar = pj0Var.f30115w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                pj0Var.a();
                return;
            case 10:
                wn0 wn0Var = (wn0) this.f25549b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f25550c;
                ArrayList arrayList5 = wn0Var.H;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (L = wn0Var.L()) < wn0Var.h()) {
                    arrayList5.remove(indexOf);
                    wn0Var.u(L + 1 + indexOf);
                    int size4 = wn0Var.f48796g0.f48657e.size();
                    int size5 = arrayList5.size();
                    if (wn0Var.D0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        wn0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((wn0) this.f25549b).T();
                qc.a0((org.telegram.ui.py) this.f25550c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 12:
                ((ho0) this.f25549b).sendAccessibilityEvent((View) this.f25550c, 4);
                return;
            case 13:
                ve veVar = (ve) this.f25549b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.f25550c;
                if (xnVar != null) {
                    xnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    veVar.dismiss();
                    return;
                }
                return;
            case 14:
                ((WindowManager) this.f25550c).removeView(((ve) this.f25549b).B);
                return;
            case 15:
                lq0 lq0Var = (lq0) this.f25549b;
                TLObject tLObject2 = (TLObject) this.f25550c;
                if (tLObject2 != null) {
                    lq0Var.f28836h0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    lq0Var.Z0();
                    if (lq0Var.f28838j0) {
                        lq0Var.M0();
                    }
                }
                lq0Var.f28837i0 = false;
                return;
            case 16:
                qt0 qt0Var = (qt0) this.f25549b;
                sq0 sq0Var = (sq0) this.f25550c;
                qt0Var.D = null;
                qt0Var.E = null;
                sq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new pd0(sq0Var, 12)).start();
                return;
            case 17:
                oh.m6 m6Var = (oh.m6) this.f25550c;
                sr0 sr0Var = ((yu0) this.f25549b).T;
                if (sr0Var != null) {
                    int i18 = m6Var.f17441a;
                    sr0Var.f40297n.d(i18, sr0Var.f40299s.i(i18));
                    return;
                }
                return;
            case 18:
                qc.a0(((gt0) this.f25549b).f27280f.f33649s1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f25550c).title)).k(true);
                return;
            case 19:
                tt0 tt0Var = (tt0) this.f25549b;
                String str = (String) this.f25550c;
                if (!tt0Var.v.f33643q1[tt0Var.f31413r].f29580a.isEmpty() && ((i10 = tt0Var.f31413r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) l.d.i(1, tt0Var.v.f33643q1[i10].f29580a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    yu0 yu0Var = tt0Var.v;
                    if (yu0Var.f33624g1 == yu0Var.f33649s1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    tt0Var.F(id2, str, dialogId, j10);
                } else if (tt0Var.f31413r == 3) {
                    yu0 yu0Var2 = tt0Var.v;
                    tt0Var.F(0, str, yu0Var2.f33624g1, yu0Var2.C);
                }
                int i19 = tt0Var.f31413r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(tt0Var.v.f33643q1[tt0Var.f31413r].f29580a);
                    tt0Var.f31414s++;
                    Utilities.searchQueue.postRunnable(new jp(tt0Var, str, arrayList6, 22));
                    return;
                }
                return;
            case 20:
                tt0 tt0Var2 = (tt0) this.f25549b;
                ArrayList arrayList7 = (ArrayList) this.f25550c;
                yu0 yu0Var3 = tt0Var2.v;
                boolean z14 = yu0Var3.S0;
                qt0[] qt0VarArr = yu0Var3.f33625h0;
                if (z14) {
                    tt0Var2.f31414s--;
                    int h = tt0Var2.h();
                    tt0Var2.d = arrayList7;
                    int h9 = tt0Var2.h();
                    if (tt0Var2.f31414s == 0 || h9 != 0) {
                        yu0Var3.m1(false);
                    }
                    for (int i20 = 0; i20 < qt0VarArr.length; i20++) {
                        qt0 qt0Var2 = qt0VarArr[i20];
                        if (qt0Var2.C == tt0Var2.f31413r) {
                            if (tt0Var2.f31414s == 0 && h9 == 0) {
                                qt0Var2.f30524w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qt0VarArr[i20].f30524w.f34034f.setVisibility(8);
                                qt0VarArr[i20].f30524w.e(false, true);
                            } else if (h == 0) {
                                yu0Var3.z(qt0Var2.h, 0, null);
                            }
                        }
                    }
                    tt0Var2.l();
                    return;
                }
                return;
            case 21:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, (TLObject) this.f25549b, (TLRPC.Document) this.f25550c, null, bool);
                return;
            case 22:
                MessagesController.getInstance(((ly0) this.f25549b).f28903a.f30558a).updateEmojiStatus((TLRPC.EmojiStatus) this.f25550c);
                return;
            case 23:
                w21 w21Var = (w21) this.f25549b;
                MessagesController.getInstance(w21Var.f32620b).getTopicsController().deleteTopics(-w21Var.f32622c, (ArrayList) this.f25550c);
                int i22 = w21.f32617c0;
                return;
            case 24:
                w21 w21Var2 = (w21) this.f25549b;
                w21Var2.getClass();
                MessagesController.getInstance(w21Var2.f32620b).loadFullChat(((TLRPC.Updates) this.f25550c).chats.get(0).f20845id, 0, true);
                return;
            case 25:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f25549b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f25550c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    k1Var.f0(i11);
                    return;
                }
                return;
            case 26:
                v31.o((v31) this.f25549b, (TLObject) this.f25550c);
                return;
            case 27:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f25549b;
                String str2 = (String) this.f25550c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    return;
                }
                return;
            case 28:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f25549b;
                ((org.telegram.ui.ActionBar.p1) this.f25550c).d(true);
                l41.a(wkVar.getContext(), wkVar.d);
                return;
            default:
                ((TranslateController) this.f25550c).setHideTranslateDialog(((org.telegram.ui.wk) this.f25549b).f28617b, false);
                return;
        }
    }

    public b90(Object obj, Object obj2, Object obj3, int i10) {
        this.f25548a = i10;
        this.f25549b = obj;
        this.f25550c = obj2;
    }
}
