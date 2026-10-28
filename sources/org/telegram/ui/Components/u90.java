package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
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
public final class u90 implements Runnable {
    public final int f33292a;
    public final Object f33293b;
    public final Object f33294c;

    public u90(int i10, Object obj, Object obj2) {
        this.f33292a = i10;
        this.f33293b = obj;
        this.f33294c = obj2;
    }

    @Override
    public final void run() {
        bi.u7 u7Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int indexOf;
        int K;
        int i10;
        long j10;
        boolean z14 = false;
        int i11 = 2;
        boolean z15 = false;
        boolean z16 = true;
        switch (this.f33292a) {
            case 0:
                v90 v90Var = (v90) this.f33293b;
                if (v90Var.O0 == ((ba0) this.f33294c)) {
                    v90Var.performLongClick();
                    v90Var.O0 = null;
                    v90Var.M0.d(true);
                    return;
                }
                return;
            case 1:
                ((x90) this.f33293b).l((ea0) this.f33294c, false);
                return;
            case 2:
                ua0 ua0Var = (ua0) this.f33293b;
                if (!((boolean[]) this.f33294c)[0] && (u7Var = ua0Var.Q) != null) {
                    u7Var.run();
                }
                ua0Var.Q = null;
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f33294c;
                ((wa0) this.f33293b).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new p70(editTextBoldCursor, 3));
                return;
            case 4:
                i2.c cVar = (i2.c) this.f33293b;
                Runnable runnable = (Runnable) this.f33294c;
                cVar.getClass();
                runnable.run();
                cVar.f13502a.remove(runnable);
                return;
            case 5:
                xh0 xh0Var = (xh0) this.f33293b;
                TLObject tLObject = (TLObject) this.f33294c;
                xh0Var.M = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    xh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        xh0Var.a(false);
                        return;
                    }
                    xh0Var.d();
                    xh0Var.f34769c.f32504g3.O(true);
                    return;
                }
                return;
            case 6:
                ci0 ci0Var = (ci0) this.f33293b;
                ArrayList arrayList = (ArrayList) this.f33294c;
                ArrayList arrayList2 = ci0Var.f27165a;
                int i12 = ci0Var.f27177x;
                int size = arrayList.size();
                ci0Var.f27177x = size;
                if (i12 != size && ci0Var.S != null) {
                    ci0Var.g();
                }
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    zh0 zh0Var = (zh0) arrayList2.get(i13);
                    if (zh0Var.f35353o && !zh0Var.f35354p) {
                        arrayList.add(zh0Var);
                    } else if (ci0.j(zh0Var.f35342a, arrayList) == null) {
                        ci0 ci0Var2 = zh0Var.f35362y;
                        float f7 = ci0Var2.N;
                        RectF rectF = zh0Var.f35344c;
                        RectF rectF2 = zh0Var.f35345f;
                        ea0 ea0Var = zh0Var.f35356r;
                        if (ea0Var != null) {
                            ea0Var.a();
                            zh0Var.f35358t = z15;
                            zh0Var.f35357s = z15;
                        }
                        zh0Var.f35353o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z10 = z16;
                        } else {
                            z10 = z15;
                        }
                        if (rectF.right + 1.0f >= ci0Var2.getMeasuredWidth() - f7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && z11) {
                            z10 = false;
                            z11 = false;
                        }
                        zh0Var.f35346g.set(rectF);
                        rectF2.set(rectF);
                        if (z10) {
                            rectF2.right = rectF2.left;
                        } else if (z11) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = zh0Var.f35342a;
                            if (i14 != 3 && i14 != 2) {
                                z12 = true;
                            } else {
                                z12 = true;
                                if (ci0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    z13 = false;
                                    zh0Var.e.d(0.0f, z12);
                                    arrayList.add(zh0Var);
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
                            zh0Var.e.d(0.0f, z12);
                            arrayList.add(zh0Var);
                            i13++;
                            z14 = z13;
                            z15 = false;
                            z16 = true;
                        }
                        z12 = true;
                        z13 = false;
                        zh0Var.e.d(0.0f, z12);
                        arrayList.add(zh0Var);
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
                ci0Var.invalidate();
                return;
            case 7:
                zh0 zh0Var2 = (zh0) this.f33294c;
                bi0 bi0Var = ((ci0) this.f33293b).F;
                int i15 = zh0Var2.f35342a;
                RectF rectF3 = zh0Var2.d;
                ProfileActivity.e0(((org.telegram.ui.yx0) bi0Var).f46099b, i15, rectF3.left, rectF3.top);
                return;
            case 8:
                RLottieNative rLottieNative = (RLottieNative) this.f33293b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f33294c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 9:
                gk0 gk0Var = (gk0) this.f33293b;
                ArrayList arrayList3 = (ArrayList) this.f33294c;
                ArrayList arrayList4 = gk0Var.f28602r;
                gk0Var.f28601n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    fk0 fk0Var = (fk0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 < arrayList4.size()) {
                            if (MessageObject.getObjectPeerId(((fk0) arrayList4.get(i17)).f28202a) == MessageObject.getObjectPeerId(fk0Var.f28202a)) {
                                if (fk0Var.f28204c > 0) {
                                    ((fk0) arrayList4.get(i17)).f28204c = fk0Var.f28204c;
                                }
                            } else {
                                i17++;
                            }
                        } else {
                            arrayList4.add(fk0Var);
                        }
                    }
                }
                q0.a aVar = gk0Var.f28604w;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                gk0Var.a();
                return;
            case 10:
                xo0 xo0Var = (xo0) this.f33293b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f33294c;
                ArrayList arrayList5 = xo0Var.K;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = xo0Var.K()) < xo0Var.h()) {
                    arrayList5.remove(indexOf);
                    xo0Var.u(K + 1 + indexOf);
                    int size4 = xo0Var.f14082j0.e.size();
                    int size5 = arrayList5.size();
                    if (xo0Var.G0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        xo0Var.u(K);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((xo0) this.f33293b).S();
                wc.b0((org.telegram.ui.ey) this.f33294c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 12:
                ((kp0) this.f33293b).sendAccessibilityEvent((View) this.f33294c, 4);
                return;
            case 13:
                ef efVar = (ef) this.f33293b;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.f33294c;
                if (wnVar != null) {
                    wnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    return;
                }
                return;
            case 14:
                ((WindowManager) this.f33294c).removeView(((ef) this.f33293b).B);
                return;
            case 15:
                nr0 nr0Var = (nr0) this.f33293b;
                TLObject tLObject2 = (TLObject) this.f33294c;
                if (tLObject2 != null) {
                    nr0Var.f31044l0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    nr0Var.c1();
                    if (nr0Var.f31046n0) {
                        nr0Var.O0();
                    }
                }
                nr0Var.m0 = false;
                return;
            case 16:
                uu0 uu0Var = (uu0) this.f33293b;
                tr0 tr0Var = (tr0) this.f33294c;
                uu0Var.F = null;
                uu0Var.G = null;
                tr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new i10(tr0Var, 21)).start();
                return;
            case 17:
                bi.t9 t9Var = (bi.t9) this.f33293b;
                t9Var.e = !t9Var.e;
                ((Runnable[]) this.f33294c)[0].run();
                t9Var.j(true);
                return;
            case 18:
                di.a7 a7Var = (di.a7) this.f33294c;
                at0 at0Var = ((bw0) this.f33293b).f26928b0;
                if (at0Var != null) {
                    int i18 = a7Var.f8375a;
                    at0Var.f41609b.d(i18, at0Var.d.i(i18));
                    return;
                }
                return;
            case 19:
                wc.b0(((ku0) this.f33293b).f30033f.f26992x1).R(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f33294c).title)).k(true);
                return;
            case 20:
                xu0 xu0Var = (xu0) this.f33293b;
                String str = (String) this.f33294c;
                if (!xu0Var.v.f26986v1[xu0Var.f34853r].f32033a.isEmpty() && ((i10 = xu0Var.f34853r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) ic.a.g(1, xu0Var.v.f26986v1[i10].f32033a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    bw0 bw0Var = xu0Var.v;
                    if (bw0Var.l1 == bw0Var.f26992x1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    xu0Var.F(id2, str, dialogId, j10);
                } else if (xu0Var.f34853r == 3) {
                    bw0 bw0Var2 = xu0Var.v;
                    xu0Var.F(0, str, bw0Var2.l1, bw0Var2.F);
                }
                int i19 = xu0Var.f34853r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList6 = new ArrayList(xu0Var.v.f26986v1[xu0Var.f34853r].f32033a);
                    xu0Var.f34854s++;
                    Utilities.searchQueue.postRunnable(new kg(xu0Var, str, arrayList6, 26));
                    return;
                }
                return;
            case 21:
                xu0 xu0Var2 = (xu0) this.f33293b;
                ArrayList arrayList7 = (ArrayList) this.f33294c;
                bw0 bw0Var3 = xu0Var2.v;
                boolean z17 = bw0Var3.X0;
                uu0[] uu0VarArr = bw0Var3.m0;
                if (z17) {
                    xu0Var2.f34854s--;
                    int h = xu0Var2.h();
                    xu0Var2.d = arrayList7;
                    int h10 = xu0Var2.h();
                    if (xu0Var2.f34854s == 0 || h10 != 0) {
                        bw0Var3.v1(false);
                    }
                    for (int i20 = 0; i20 < uu0VarArr.length; i20++) {
                        uu0 uu0Var2 = uu0VarArr[i20];
                        if (uu0Var2.E == xu0Var2.f34853r) {
                            if (xu0Var2.f34854s == 0 && h10 == 0) {
                                uu0Var2.v.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                uu0VarArr[i20].v.f28315f.setVisibility(8);
                                uu0VarArr[i20].v.e(false, true);
                            } else if (h == 0) {
                                bw0Var3.C(uu0Var2.h, 0, null);
                            }
                        }
                    }
                    xu0Var2.l();
                    return;
                }
                return;
            case 22:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, (TLObject) this.f33293b, (TLRPC.Document) this.f33294c, null, bool);
                return;
            case 23:
                MessagesController.getInstance(((pz0) this.f33293b).f31730a.f33485a).updateEmojiStatus((TLRPC.EmojiStatus) this.f33294c);
                return;
            case 24:
                f41 f41Var = (f41) this.f33293b;
                MessagesController.getInstance(f41Var.f28013b).getTopicsController().deleteTopics(-f41Var.f28015c, (ArrayList) this.f33294c);
                int i22 = f41.f28010i0;
                return;
            case 25:
                f41 f41Var2 = (f41) this.f33293b;
                f41Var2.getClass();
                MessagesController.getInstance(f41Var2.f28013b).loadFullChat(((TLRPC.Updates) this.f33294c).chats.get(0).f22028id, 0, true);
                return;
            case 26:
                org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.f33293b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f33294c;
                if (j1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i11 = 1;
                    }
                    j1Var.Z(i11);
                    return;
                }
                return;
            case 27:
                g51.o((g51) this.f33293b, (TLObject) this.f33294c);
                return;
            case 28:
                org.telegram.ui.vk vkVar = (org.telegram.ui.vk) this.f33293b;
                ((org.telegram.ui.ActionBar.o1) this.f33294c).d(true);
                y51.a(vkVar.getContext(), vkVar.d);
                return;
            default:
                ((TranslateController) this.f33294c).setHideTranslateDialog(((org.telegram.ui.vk) this.f33293b).f34967b, false);
                return;
        }
    }

    public u90(Object obj, Object obj2, Object obj3, int i10) {
        this.f33292a = i10;
        this.f33293b = obj;
        this.f33294c = obj2;
    }
}
