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
public final class a90 implements Runnable {
    public final int f25209a;
    public final Object f25210b;
    public final Object f25211c;

    public a90(int i10, Object obj, Object obj2) {
        this.f25209a = i10;
        this.f25210b = obj;
        this.f25211c = obj2;
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
        switch (this.f25209a) {
            case 0:
                b90 b90Var = (b90) this.f25210b;
                if (b90Var.L0 == ((h90) this.f25211c)) {
                    b90Var.performLongClick();
                    b90Var.L0 = null;
                    b90Var.J0.d(true);
                    return;
                }
                return;
            case 1:
                ((d90) this.f25210b).l((k90) this.f25211c, false);
                return;
            case 2:
                fa0 fa0Var = (fa0) this.f25210b;
                if (!((boolean[]) this.f25211c)[0] && (r5Var = fa0Var.R) != null) {
                    r5Var.run();
                }
                fa0Var.R = null;
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f25211c;
                ((ha0) this.f25210b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor));
                return;
            case 4:
                oh.h4 h4Var = (oh.h4) this.f25210b;
                Runnable runnable = (Runnable) this.f25211c;
                h4Var.getClass();
                runnable.run();
                ((HashMap) h4Var.f17180b).remove(runnable);
                return;
            case 5:
                gh0 gh0Var = (gh0) this.f25210b;
                TLObject tLObject = (TLObject) this.f25211c;
                gh0Var.J = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    gh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        gh0Var.a(false);
                        return;
                    }
                    gh0Var.d();
                    gh0Var.f27194c.V2.N(true);
                    return;
                }
                return;
            case 6:
                lh0 lh0Var = (lh0) this.f25210b;
                ArrayList arrayList = (ArrayList) this.f25211c;
                ArrayList arrayList2 = lh0Var.f28735a;
                int i12 = lh0Var.f28745x;
                int size = arrayList.size();
                lh0Var.f28745x = size;
                if (i12 != size && lh0Var.P != null) {
                    lh0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    ih0 ih0Var = (ih0) arrayList2.get(i13);
                    if (ih0Var.f27798o && !ih0Var.f27799p) {
                        arrayList.add(ih0Var);
                    } else if (lh0.j(ih0Var.f27786a, arrayList) == null) {
                        lh0 lh0Var2 = ih0Var.f27807y;
                        float f10 = lh0Var2.K;
                        RectF rectF = ih0Var.f27788c;
                        RectF rectF2 = ih0Var.f27790f;
                        k90 k90Var = ih0Var.f27801r;
                        if (k90Var != null) {
                            k90Var.a();
                            ih0Var.f27803t = z12;
                            ih0Var.f27802s = z12;
                        }
                        ih0Var.f27798o = z13;
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
                        ih0Var.f27791g.set(rectF);
                        rectF2.set(rectF);
                        if (z4) {
                            rectF2.right = rectF2.left;
                        } else if (z10) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = ih0Var.f27786a;
                            if (i14 != 3 && i14 != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                                if (lh0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    ih0Var.f27789e.d(0.0f, z11);
                                    arrayList.add(ih0Var);
                                    i13++;
                                    z12 = false;
                                    z13 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            ih0Var.f27789e.d(0.0f, z11);
                            arrayList.add(ih0Var);
                            i13++;
                            z12 = false;
                            z13 = true;
                        }
                        z11 = true;
                        ih0Var.f27789e.d(0.0f, z11);
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
            case 7:
                ih0 ih0Var2 = (ih0) this.f25211c;
                kh0 kh0Var = ((lh0) this.f25210b).C;
                int i15 = ih0Var2.f27786a;
                RectF rectF3 = ih0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.rx0) kh0Var).f41061b, i15, rectF3.left, rectF3.top);
                return;
            case 8:
                ViewParent viewParent = (ViewParent) this.f25211c;
                ((org.telegram.ui.Cells.t1) this.f25210b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 9:
                RLottieNative rLottieNative = (RLottieNative) this.f25210b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f25211c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 10:
                qj0 qj0Var = (qj0) this.f25210b;
                ArrayList arrayList3 = (ArrayList) this.f25211c;
                ArrayList arrayList4 = qj0Var.f30406r;
                qj0Var.f30405n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    pj0 pj0Var = (pj0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 < arrayList4.size()) {
                            if (MessageObject.getObjectPeerId(((pj0) arrayList4.get(i17)).f30094a) == MessageObject.getObjectPeerId(pj0Var.f30094a)) {
                                if (pj0Var.f30096c > 0) {
                                    ((pj0) arrayList4.get(i17)).f30096c = pj0Var.f30096c;
                                }
                            } else {
                                i17++;
                            }
                        } else {
                            arrayList4.add(pj0Var);
                        }
                    }
                }
                q0.a aVar = qj0Var.f30408w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                qj0Var.a();
                return;
            case 11:
                xn0 xn0Var = (xn0) this.f25210b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f25211c;
                ArrayList arrayList5 = xn0Var.H;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (L = xn0Var.L()) < xn0Var.h()) {
                    arrayList5.remove(indexOf);
                    xn0Var.u(L + 1 + indexOf);
                    int size4 = xn0Var.f48760g0.f48621e.size();
                    int size5 = arrayList5.size();
                    if (xn0Var.D0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        xn0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                ((xn0) this.f25210b).T();
                qc.a0((org.telegram.ui.py) this.f25211c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 13:
                ((io0) this.f25210b).sendAccessibilityEvent((View) this.f25211c, 4);
                return;
            case 14:
                ve veVar = (ve) this.f25210b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.f25211c;
                if (xnVar != null) {
                    xnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    veVar.dismiss();
                    return;
                }
                return;
            case 15:
                ((WindowManager) this.f25211c).removeView(((ve) this.f25210b).B);
                return;
            case 16:
                mq0 mq0Var = (mq0) this.f25210b;
                TLObject tLObject2 = (TLObject) this.f25211c;
                if (tLObject2 != null) {
                    mq0Var.f29207h0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    mq0Var.Z0();
                    if (mq0Var.f29209j0) {
                        mq0Var.M0();
                    }
                }
                mq0Var.f29208i0 = false;
                return;
            case 17:
                rt0 rt0Var = (rt0) this.f25210b;
                tq0 tq0Var = (tq0) this.f25211c;
                rt0Var.D = null;
                rt0Var.E = null;
                tq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new pd0(tq0Var, 12)).start();
                return;
            case 18:
                oh.m6 m6Var = (oh.m6) this.f25211c;
                tr0 tr0Var = ((zu0) this.f25210b).T;
                if (tr0Var != null) {
                    int i18 = m6Var.f17439a;
                    tr0Var.f38931n.d(i18, tr0Var.f38933s.i(i18));
                    return;
                }
                return;
            case 19:
                qc.a0(((ht0) this.f25210b).f27587f.f34004s1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f25211c).title)).k(true);
                return;
            case 20:
                ut0 ut0Var = (ut0) this.f25210b;
                String str = (String) this.f25211c;
                if (!ut0Var.v.f33998q1[ut0Var.f31733r].f29851a.isEmpty() && ((i10 = ut0Var.f31733r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) l.d.i(1, ut0Var.v.f33998q1[i10].f29851a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    zu0 zu0Var = ut0Var.v;
                    if (zu0Var.f33979g1 == zu0Var.f34004s1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    ut0Var.F(id2, str, dialogId, j10);
                } else if (ut0Var.f31733r == 3) {
                    zu0 zu0Var2 = ut0Var.v;
                    ut0Var.F(0, str, zu0Var2.f33979g1, zu0Var2.C);
                }
                int i19 = ut0Var.f31733r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(ut0Var.v.f33998q1[ut0Var.f31733r].f29851a);
                    ut0Var.f31734s++;
                    Utilities.searchQueue.postRunnable(new jp(ut0Var, str, arrayList6, 22));
                    return;
                }
                return;
            case 21:
                ut0 ut0Var2 = (ut0) this.f25210b;
                ArrayList arrayList7 = (ArrayList) this.f25211c;
                zu0 zu0Var3 = ut0Var2.v;
                boolean z14 = zu0Var3.S0;
                rt0[] rt0VarArr = zu0Var3.f33980h0;
                if (z14) {
                    ut0Var2.f31734s--;
                    int h = ut0Var2.h();
                    ut0Var2.d = arrayList7;
                    int h9 = ut0Var2.h();
                    if (ut0Var2.f31734s == 0 || h9 != 0) {
                        zu0Var3.m1(false);
                    }
                    for (int i20 = 0; i20 < rt0VarArr.length; i20++) {
                        rt0 rt0Var2 = rt0VarArr[i20];
                        if (rt0Var2.C == ut0Var2.f31733r) {
                            if (ut0Var2.f31734s == 0 && h9 == 0) {
                                rt0Var2.f30852w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                rt0VarArr[i20].f30852w.f25365f.setVisibility(8);
                                rt0VarArr[i20].f30852w.e(false, true);
                            } else if (h == 0) {
                                zu0Var3.z(rt0Var2.h, 0, null);
                            }
                        }
                    }
                    ut0Var2.l();
                    return;
                }
                return;
            case 22:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, (TLObject) this.f25210b, (TLRPC.Document) this.f25211c, null, bool);
                return;
            case 23:
                MessagesController.getInstance(((my0) this.f25210b).f29262a.f30897a).updateEmojiStatus((TLRPC.EmojiStatus) this.f25211c);
                return;
            case 24:
                x21 x21Var = (x21) this.f25210b;
                MessagesController.getInstance(x21Var.f32928b).getTopicsController().deleteTopics(-x21Var.f32930c, (ArrayList) this.f25211c);
                int i22 = x21.f32925c0;
                return;
            case 25:
                x21 x21Var2 = (x21) this.f25210b;
                x21Var2.getClass();
                MessagesController.getInstance(x21Var2.f32928b).loadFullChat(((TLRPC.Updates) this.f25211c).chats.get(0).f20843id, 0, true);
                return;
            case 26:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f25210b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f25211c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    k1Var.f0(i11);
                    return;
                }
                return;
            case 27:
                w31.o((w31) this.f25210b, (TLObject) this.f25211c);
                return;
            case 28:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f25210b;
                String str2 = (String) this.f25211c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    return;
                }
                return;
            default:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.f25210b;
                ((org.telegram.ui.ActionBar.p1) this.f25211c).d(true);
                n41.a(wkVar.getContext(), wkVar.d);
                return;
        }
    }

    public a90(Object obj, Object obj2, Object obj3, int i10) {
        this.f25209a = i10;
        this.f25210b = obj;
        this.f25211c = obj2;
    }
}
