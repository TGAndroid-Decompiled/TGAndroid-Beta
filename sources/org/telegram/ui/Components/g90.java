package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
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
public final class g90 implements Runnable {
    public final int f24930a;
    public final Object f24931b;
    public final Object f24932c;

    public g90(int i10, Object obj, Object obj2) {
        this.f24930a = i10;
        this.f24931b = obj;
        this.f24932c = obj2;
    }

    @Override
    public final void run() {
        di.x0 x0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int indexOf;
        int L;
        int i10;
        long j10;
        boolean z14 = false;
        int i11 = 2;
        boolean z15 = false;
        boolean z16 = true;
        switch (this.f24930a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.ChatFull) this.f24931b).guard_bot_id);
                ((org.telegram.ui.np) this.f24932c).presentFragment(new ProfileActivity(bundle, null));
                return;
            case 1:
                y90 y90Var = (y90) this.f24931b;
                if (y90Var.O0 == ((ea0) this.f24932c)) {
                    y90Var.performLongClick();
                    y90Var.O0 = null;
                    y90Var.M0.d(true);
                    return;
                }
                return;
            case 2:
                ((aa0) this.f24931b).l((ha0) this.f24932c, false);
                return;
            case 3:
                cb0 cb0Var = (cb0) this.f24931b;
                if (!((boolean[]) this.f24932c)[0] && (x0Var = cb0Var.U) != null) {
                    x0Var.run();
                }
                cb0Var.U = null;
                return;
            case 4:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f24932c;
                ((eb0) this.f24931b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(4, editTextBoldCursor));
                return;
            case 5:
                qb.c cVar = (qb.c) this.f24931b;
                Runnable runnable = (Runnable) this.f24932c;
                cVar.getClass();
                runnable.run();
                cVar.f43085a.remove(runnable);
                return;
            case 6:
                zh0 zh0Var = (zh0) this.f24931b;
                TLObject tLObject = (TLObject) this.f24932c;
                zh0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    zh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        zh0Var.a(false);
                        return;
                    }
                    zh0Var.d();
                    zh0Var.f31564c.W2.N(true);
                    return;
                }
                return;
            case 7:
                ei0 ei0Var = (ei0) this.f24931b;
                ArrayList arrayList = (ArrayList) this.f24932c;
                ArrayList arrayList2 = ei0Var.f24394a;
                int i12 = ei0Var.f24406x;
                int size = arrayList.size();
                ei0Var.f24406x = size;
                if (i12 != size && ei0Var.S != null) {
                    ei0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    bi0 bi0Var = (bi0) arrayList2.get(i13);
                    if (bi0Var.f23471o && !bi0Var.f23472p) {
                        arrayList.add(bi0Var);
                    } else if (ei0.j(bi0Var.f23460a, arrayList) == null) {
                        ei0 ei0Var2 = bi0Var.f23480y;
                        float f7 = ei0Var2.N;
                        RectF rectF = bi0Var.f23462c;
                        RectF rectF2 = bi0Var.f23463f;
                        ha0 ha0Var = bi0Var.f23474r;
                        if (ha0Var != null) {
                            ha0Var.a();
                            bi0Var.f23476t = z15;
                            bi0Var.f23475s = z15;
                        }
                        bi0Var.f23471o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z10 = z16;
                        } else {
                            z10 = z15;
                        }
                        if (rectF.right + 1.0f >= ei0Var2.getMeasuredWidth() - f7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && z11) {
                            z10 = false;
                            z11 = false;
                        }
                        bi0Var.f23464g.set(rectF);
                        rectF2.set(rectF);
                        if (z10) {
                            rectF2.right = rectF2.left;
                        } else if (z11) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = bi0Var.f23460a;
                            if (i14 != 3 && i14 != 2) {
                                z12 = true;
                            } else {
                                z12 = true;
                                if (ei0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z13 = false;
                                    bi0Var.e.d(0.0f, z12);
                                    arrayList.add(bi0Var);
                                    i13++;
                                    z14 = z13;
                                    z15 = false;
                                    z16 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            z13 = false;
                            bi0Var.e.d(0.0f, z12);
                            arrayList.add(bi0Var);
                            i13++;
                            z14 = z13;
                            z15 = false;
                            z16 = true;
                        }
                        z12 = true;
                        z13 = false;
                        bi0Var.e.d(0.0f, z12);
                        arrayList.add(bi0Var);
                        i13++;
                        z14 = z13;
                        z15 = false;
                        z16 = true;
                    }
                    z13 = z14;
                    i13++;
                    z14 = z13;
                    z15 = false;
                    z16 = true;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ei0Var.invalidate();
                return;
            case 8:
                bi0 bi0Var2 = (bi0) this.f24932c;
                di0 di0Var = ((ei0) this.f24931b).F;
                int i15 = bi0Var2.f23460a;
                RectF rectF3 = bi0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.py0) di0Var).f39029b, i15, rectF3.left, rectF3.top);
                return;
            case 9:
                ViewParent viewParent = (ViewParent) this.f24932c;
                ((org.telegram.ui.Cells.u1) this.f24931b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 10:
                RLottieNative rLottieNative = (RLottieNative) this.f24931b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f24932c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 11:
                gk0 gk0Var = (gk0) this.f24931b;
                ArrayList arrayList3 = (ArrayList) this.f24932c;
                ArrayList arrayList4 = gk0Var.f24999r;
                gk0Var.f24998n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    fk0 fk0Var = (fk0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 < arrayList4.size()) {
                            if (MessageObject.getObjectPeerId(((fk0) arrayList4.get(i17)).f24771a) == MessageObject.getObjectPeerId(fk0Var.f24771a)) {
                                if (fk0Var.f24773c > 0) {
                                    ((fk0) arrayList4.get(i17)).f24773c = fk0Var.f24773c;
                                }
                            } else {
                                i17++;
                            }
                        } else {
                            arrayList4.add(fk0Var);
                        }
                    }
                }
                q0.a aVar = gk0Var.f25001w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                gk0Var.a();
                return;
            case 12:
                so0 so0Var = (so0) this.f24931b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f24932c;
                ArrayList arrayList5 = so0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (L = so0Var.L()) < so0Var.h()) {
                    arrayList5.remove(indexOf);
                    so0Var.u(L + 1 + indexOf);
                    int size4 = so0Var.f10579j0.e.size();
                    int size5 = arrayList5.size();
                    if (so0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        so0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((so0) this.f24931b).T();
                zc.a0((org.telegram.ui.yy) this.f24932c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 14:
                ((dp0) this.f24931b).sendAccessibilityEvent((View) this.f24932c, 4);
                return;
            case 15:
                gf gfVar = (gf) this.f24931b;
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) this.f24932c;
                if (foVar != null) {
                    foVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    gfVar.dismiss();
                    return;
                }
                return;
            case 16:
                ((WindowManager) this.f24932c).removeView(((gf) this.f24931b).B);
                return;
            case 17:
                ir0 ir0Var = (ir0) this.f24931b;
                TLObject tLObject2 = (TLObject) this.f24932c;
                if (tLObject2 != null) {
                    ir0Var.f25753k0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    ir0Var.a1();
                    if (ir0Var.m0) {
                        ir0Var.N0();
                    }
                }
                ir0Var.f25754l0 = false;
                return;
            case 18:
                qu0 qu0Var = (qu0) this.f24931b;
                pr0 pr0Var = (pr0) this.f24932c;
                qu0Var.G = null;
                qu0Var.H = null;
                pr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new k90(pr0Var, 17)).start();
                return;
            case 19:
                bi.p8 p8Var = (bi.p8) this.f24932c;
                ss0 ss0Var = ((xv0) this.f24931b).W;
                if (ss0Var != null) {
                    int i18 = p8Var.f3477a;
                    ss0Var.f36375n.d(i18, ss0Var.f36377s.i(i18));
                    return;
                }
                return;
            case 20:
                zc.a0(((gu0) this.f24931b).f25112f.f31069v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f24932c).title)).k(true);
                return;
            case 21:
                tu0 tu0Var = (tu0) this.f24931b;
                String str = (String) this.f24932c;
                if (!tu0Var.v.f31065t1[tu0Var.f29196r].f27211a.isEmpty() && ((i10 = tu0Var.f29196r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.d.h(1, tu0Var.v.f31065t1[i10].f27211a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    xv0 xv0Var = tu0Var.v;
                    if (xv0Var.f31044j1 == xv0Var.f31069v1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    tu0Var.F(id2, str, dialogId, j10);
                } else if (tu0Var.f29196r == 3) {
                    xv0 xv0Var2 = tu0Var.v;
                    tu0Var.F(0, str, xv0Var2.f31044j1, xv0Var2.F);
                }
                int i19 = tu0Var.f29196r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(tu0Var.v.f31065t1[tu0Var.f29196r].f27211a);
                    tu0Var.f29197s++;
                    Utilities.searchQueue.postRunnable(new ze0(tu0Var, str, arrayList6, 11));
                    return;
                }
                return;
            case 22:
                tu0 tu0Var2 = (tu0) this.f24931b;
                ArrayList arrayList7 = (ArrayList) this.f24932c;
                xv0 xv0Var3 = tu0Var2.v;
                boolean z17 = xv0Var3.V0;
                qu0[] qu0VarArr = xv0Var3.f31045k0;
                if (z17) {
                    tu0Var2.f29197s--;
                    int h = tu0Var2.h();
                    tu0Var2.d = arrayList7;
                    int h10 = tu0Var2.h();
                    if (tu0Var2.f29197s == 0 || h10 != 0) {
                        xv0Var3.n1(false);
                    }
                    for (int i20 = 0; i20 < qu0VarArr.length; i20++) {
                        qu0 qu0Var2 = qu0VarArr[i20];
                        if (qu0Var2.F == tu0Var2.f29196r) {
                            if (tu0Var2.f29197s == 0 && h10 == 0) {
                                qu0Var2.f28368w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qu0VarArr[i20].f28368w.f30690f.setVisibility(8);
                                qu0VarArr[i20].f28368w.e(false, true);
                            } else if (h == 0) {
                                xv0Var3.z(qu0Var2.h, 0, null);
                            }
                        }
                    }
                    tu0Var2.l();
                    return;
                }
                return;
            case 23:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, (TLObject) this.f24931b, (TLRPC.Document) this.f24932c, null, bool);
                return;
            case 24:
                MessagesController.getInstance(((gz0) this.f24931b).f25127a.f26847a).updateEmojiStatus((TLRPC.EmojiStatus) this.f24932c);
                return;
            case 25:
                y31 y31Var = (y31) this.f24931b;
                MessagesController.getInstance(y31Var.f31134b).getTopicsController().deleteTopics(-y31Var.f31136c, (ArrayList) this.f24932c);
                int i22 = y31.f31131f0;
                return;
            case 26:
                y31 y31Var2 = (y31) this.f24931b;
                y31Var2.getClass();
                MessagesController.getInstance(y31Var2.f31134b).loadFullChat(((TLRPC.Updates) this.f24932c).chats.get(0).f18916id, 0, true);
                return;
            case 27:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f24931b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f24932c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    l1Var.d0(i11);
                    return;
                }
                return;
            case 28:
                x41.q((x41) this.f24931b, (TLObject) this.f24932c);
                return;
            default:
                org.telegram.ui.el elVar = (org.telegram.ui.el) this.f24931b;
                ((org.telegram.ui.ActionBar.m1) this.f24932c).d(true);
                p51.a(elVar.getContext(), elVar.d);
                return;
        }
    }

    public g90(Object obj, Object obj2, Object obj3, int i10) {
        this.f24930a = i10;
        this.f24931b = obj;
        this.f24932c = obj2;
    }
}
