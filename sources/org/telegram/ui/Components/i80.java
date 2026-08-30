package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Bundle;
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
public final class i80 implements Runnable {
    public final int f25619a;
    public final Object f25620b;
    public final Object f25621c;

    public i80(int i10, Object obj, Object obj2) {
        this.f25619a = i10;
        this.f25620b = obj;
        this.f25621c = obj2;
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
        switch (this.f25619a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.ChatFull) this.f25620b).guard_bot_id);
                ((org.telegram.ui.dp) this.f25621c).presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                z80 z80Var = (z80) this.f25620b;
                if (z80Var.L0 == ((f90) this.f25621c)) {
                    z80Var.performLongClick();
                    z80Var.L0 = null;
                    z80Var.J0.d(true);
                    return;
                }
                return;
            case 2:
                ((b90) this.f25620b).l((i90) this.f25621c, false);
                return;
            case 3:
                da0 da0Var = (da0) this.f25620b;
                if (!((boolean[]) this.f25621c)[0] && (r5Var = da0Var.R) != null) {
                    r5Var.run();
                }
                da0Var.R = null;
                return;
            case 4:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f25621c;
                ((fa0) this.f25620b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor));
                return;
            case 5:
                o2.o oVar = (o2.o) this.f25620b;
                Runnable runnable = (Runnable) this.f25621c;
                oVar.getClass();
                runnable.run();
                ((HashMap) oVar.f16220b).remove(runnable);
                return;
            case 6:
                eh0 eh0Var = (eh0) this.f25620b;
                TLObject tLObject = (TLObject) this.f25621c;
                eh0Var.J = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    eh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        eh0Var.a(false);
                        return;
                    }
                    eh0Var.d();
                    eh0Var.f24578c.V2.N(true);
                    return;
                }
                return;
            case 7:
                jh0 jh0Var = (jh0) this.f25620b;
                ArrayList arrayList = (ArrayList) this.f25621c;
                ArrayList arrayList2 = jh0Var.f25981a;
                int i12 = jh0Var.f25990x;
                int size = arrayList.size();
                jh0Var.f25990x = size;
                if (i12 != size && jh0Var.P != null) {
                    jh0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    gh0 gh0Var = (gh0) arrayList2.get(i13);
                    if (gh0Var.f25133o && !gh0Var.f25134p) {
                        arrayList.add(gh0Var);
                    } else if (jh0.j(gh0Var.f25122a, arrayList) == null) {
                        jh0 jh0Var2 = gh0Var.f25142y;
                        float f10 = jh0Var2.K;
                        RectF rectF = gh0Var.f25124c;
                        RectF rectF2 = gh0Var.f25125f;
                        i90 i90Var = gh0Var.f25136r;
                        if (i90Var != null) {
                            i90Var.a();
                            gh0Var.f25138t = z12;
                            gh0Var.f25137s = z12;
                        }
                        gh0Var.f25133o = z13;
                        if (rectF.left - 1.0f <= f10) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (rectF.right + 1.0f >= jh0Var2.getMeasuredWidth() - f10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z4 && z10) {
                            z4 = false;
                            z10 = false;
                        }
                        gh0Var.f25126g.set(rectF);
                        rectF2.set(rectF);
                        if (z4) {
                            rectF2.right = rectF2.left;
                        } else if (z10) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = gh0Var.f25122a;
                            if (i14 != 3 && i14 != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                                if (jh0Var2.E == 1) {
                                    rectF2.left = rectF2.right;
                                    gh0Var.e.d(0.0f, z11);
                                    arrayList.add(gh0Var);
                                    i13++;
                                    z12 = false;
                                    z13 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            gh0Var.e.d(0.0f, z11);
                            arrayList.add(gh0Var);
                            i13++;
                            z12 = false;
                            z13 = true;
                        }
                        z11 = true;
                        gh0Var.e.d(0.0f, z11);
                        arrayList.add(gh0Var);
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
                jh0Var.invalidate();
                return;
            case 8:
                gh0 gh0Var2 = (gh0) this.f25621c;
                ih0 ih0Var = ((jh0) this.f25620b).C;
                int i15 = gh0Var2.f25122a;
                RectF rectF3 = gh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.px0) ih0Var).f37552b, i15, rectF3.left, rectF3.top);
                return;
            case 9:
                ViewParent viewParent = (ViewParent) this.f25621c;
                ((org.telegram.ui.Cells.t1) this.f25620b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 10:
                RLottieNative rLottieNative = (RLottieNative) this.f25620b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f25621c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 11:
                oj0 oj0Var = (oj0) this.f25620b;
                ArrayList arrayList3 = (ArrayList) this.f25621c;
                ArrayList arrayList4 = oj0Var.f27580r;
                oj0Var.f27579n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    nj0 nj0Var = (nj0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 < arrayList4.size()) {
                            if (MessageObject.getObjectPeerId(((nj0) arrayList4.get(i17)).f27295a) == MessageObject.getObjectPeerId(nj0Var.f27295a)) {
                                if (nj0Var.f27297c > 0) {
                                    ((nj0) arrayList4.get(i17)).f27297c = nj0Var.f27297c;
                                }
                            } else {
                                i17++;
                            }
                        } else {
                            arrayList4.add(nj0Var);
                        }
                    }
                }
                q0.a aVar = oj0Var.f27582w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                oj0Var.a();
                return;
            case 12:
                wn0 wn0Var = (wn0) this.f25620b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f25621c;
                ArrayList arrayList5 = wn0Var.H;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (L = wn0Var.L()) < wn0Var.h()) {
                    arrayList5.remove(indexOf);
                    wn0Var.u(L + 1 + indexOf);
                    int size4 = wn0Var.f44899g0.e.size();
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
            case 13:
                ((wn0) this.f25620b).T();
                qc.a0((org.telegram.ui.oy) this.f25621c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 14:
                ((ho0) this.f25620b).sendAccessibilityEvent((View) this.f25621c, 4);
                return;
            case 15:
                ve veVar = (ve) this.f25620b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.f25621c;
                if (xnVar != null) {
                    xnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    veVar.dismiss();
                    return;
                }
                return;
            case 16:
                ((WindowManager) this.f25621c).removeView(((ve) this.f25620b).B);
                return;
            case 17:
                lq0 lq0Var = (lq0) this.f25620b;
                TLObject tLObject2 = (TLObject) this.f25621c;
                if (tLObject2 != null) {
                    lq0Var.f26852h0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    lq0Var.Z0();
                    if (lq0Var.f26854j0) {
                        lq0Var.M0();
                    }
                }
                lq0Var.f26853i0 = false;
                return;
            case 18:
                qt0 qt0Var = (qt0) this.f25620b;
                sq0 sq0Var = (sq0) this.f25621c;
                qt0Var.D = null;
                qt0Var.E = null;
                sq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new nd0(sq0Var, 12)).start();
                return;
            case 19:
                nh.m6 m6Var = (nh.m6) this.f25621c;
                sr0 sr0Var = ((yu0) this.f25620b).T;
                if (sr0Var != null) {
                    int i18 = m6Var.f15618a;
                    sr0Var.f35201n.d(i18, sr0Var.f35203s.i(i18));
                    return;
                }
                return;
            case 20:
                qc.a0(((gt0) this.f25620b).f25249f.f31144s1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f25621c).title)).k(true);
                return;
            case 21:
                tt0 tt0Var = (tt0) this.f25620b;
                String str = (String) this.f25621c;
                if (!tt0Var.v.f31138q1[tt0Var.f29039r].f27364a.isEmpty() && ((i10 = tt0Var.f29039r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) kh.a2.i(1, tt0Var.v.f31138q1[i10].f27364a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    yu0 yu0Var = tt0Var.v;
                    if (yu0Var.f31119g1 == yu0Var.f31144s1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    tt0Var.F(id2, str, dialogId, j10);
                } else if (tt0Var.f29039r == 3) {
                    yu0 yu0Var2 = tt0Var.v;
                    tt0Var.F(0, str, yu0Var2.f31119g1, yu0Var2.C);
                }
                int i19 = tt0Var.f29039r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(tt0Var.v.f31138q1[tt0Var.f29039r].f27364a);
                    tt0Var.f29040s++;
                    Utilities.searchQueue.postRunnable(new hp(tt0Var, str, arrayList6, 22));
                    return;
                }
                return;
            case 22:
                tt0 tt0Var2 = (tt0) this.f25620b;
                ArrayList arrayList7 = (ArrayList) this.f25621c;
                yu0 yu0Var3 = tt0Var2.v;
                boolean z14 = yu0Var3.S0;
                qt0[] qt0VarArr = yu0Var3.f31120h0;
                if (z14) {
                    tt0Var2.f29040s--;
                    int h = tt0Var2.h();
                    tt0Var2.d = arrayList7;
                    int h9 = tt0Var2.h();
                    if (tt0Var2.f29040s == 0 || h9 != 0) {
                        yu0Var3.m1(false);
                    }
                    for (int i20 = 0; i20 < qt0VarArr.length; i20++) {
                        qt0 qt0Var2 = qt0VarArr[i20];
                        if (qt0Var2.C == tt0Var2.f29039r) {
                            if (tt0Var2.f29040s == 0 && h9 == 0) {
                                qt0Var2.f28244w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qt0VarArr[i20].f28244w.f31457f.setVisibility(8);
                                qt0VarArr[i20].f28244w.e(false, true);
                            } else if (h == 0) {
                                yu0Var3.z(qt0Var2.h, 0, null);
                            }
                        }
                    }
                    tt0Var2.l();
                    return;
                }
                return;
            case 23:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, (TLObject) this.f25620b, (TLRPC.Document) this.f25621c, null, bool);
                return;
            case 24:
                MessagesController.getInstance(((ly0) this.f25620b).f26896a.f28303a).updateEmojiStatus((TLRPC.EmojiStatus) this.f25621c);
                return;
            case 25:
                w21 w21Var = (w21) this.f25620b;
                MessagesController.getInstance(w21Var.f30174b).getTopicsController().deleteTopics(-w21Var.f30176c, (ArrayList) this.f25621c);
                int i22 = w21.f30171c0;
                return;
            case 26:
                w21 w21Var2 = (w21) this.f25620b;
                w21Var2.getClass();
                MessagesController.getInstance(w21Var2.f30174b).loadFullChat(((TLRPC.Updates) this.f25621c).chats.get(0).f19184id, 0, true);
                return;
            case 27:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f25620b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f25621c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    k1Var.g0(i11);
                    return;
                }
                return;
            case 28:
                v31.o((v31) this.f25620b, (TLObject) this.f25621c);
                return;
            default:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f25620b;
                String str2 = (String) this.f25621c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public i80(Object obj, Object obj2, Object obj3, int i10) {
        this.f25619a = i10;
        this.f25620b = obj;
        this.f25621c = obj2;
    }
}
