package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
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
public final class jg0 implements Runnable {
    public final int f29731a;
    public final Object f29732b;
    public final Object f29733c;

    public jg0(int i9, Object obj, Object obj2) {
        this.f29731a = i9;
        this.f29732b = obj;
        this.f29733c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        int indexOf;
        int L;
        int i9;
        long j10;
        int i10 = 2;
        ArrayList arrayList = null;
        boolean z13 = false;
        boolean z14 = true;
        switch (this.f29731a) {
            case 0:
                kg0 kg0Var = (kg0) this.f29732b;
                TLObject tLObject = (TLObject) this.f29733c;
                kg0Var.I = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    kg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        kg0Var.a(false);
                        return;
                    }
                    kg0Var.d();
                    kg0Var.f30078c.U2.N(true);
                    return;
                }
                return;
            case 1:
                pg0 pg0Var = (pg0) this.f29732b;
                ArrayList arrayList2 = (ArrayList) this.f29733c;
                ArrayList arrayList3 = pg0Var.f31648a;
                int i11 = pg0Var.f31657x;
                int size = arrayList2.size();
                pg0Var.f31657x = size;
                if (i11 != size && pg0Var.O != null) {
                    pg0Var.g();
                }
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    mg0 mg0Var = (mg0) arrayList3.get(i12);
                    if (mg0Var.f30826o && !mg0Var.f30827p) {
                        arrayList2.add(mg0Var);
                    } else if (pg0.j(mg0Var.f30814a, arrayList2) == null) {
                        pg0 pg0Var2 = mg0Var.f30835y;
                        float f10 = pg0Var2.J;
                        RectF rectF = mg0Var.f30816c;
                        RectF rectF2 = mg0Var.f30818f;
                        p80 p80Var = mg0Var.f30829r;
                        if (p80Var != null) {
                            p80Var.a();
                            mg0Var.f30831t = z13;
                            mg0Var.f30830s = z13;
                        }
                        mg0Var.f30826o = z14;
                        if (rectF.left - 1.0f <= f10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (rectF.right + 1.0f >= pg0Var2.getMeasuredWidth() - f10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && z11) {
                            z10 = false;
                            z11 = false;
                        }
                        mg0Var.f30819g.set(rectF);
                        rectF2.set(rectF);
                        if (z10) {
                            rectF2.right = rectF2.left;
                        } else if (z11) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i13 = mg0Var.f30814a;
                            if (i13 != 3 && i13 != 2) {
                                z12 = true;
                            } else {
                                z12 = true;
                                if (pg0Var2.D == 1) {
                                    rectF2.left = rectF2.right;
                                    mg0Var.f30817e.d(0.0f, z12);
                                    arrayList2.add(mg0Var);
                                    i12++;
                                    z13 = false;
                                    z14 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            mg0Var.f30817e.d(0.0f, z12);
                            arrayList2.add(mg0Var);
                            i12++;
                            z13 = false;
                            z14 = true;
                        }
                        z12 = true;
                        mg0Var.f30817e.d(0.0f, z12);
                        arrayList2.add(mg0Var);
                        i12++;
                        z13 = false;
                        z14 = true;
                    }
                    i12++;
                    z13 = false;
                    z14 = true;
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                pg0Var.invalidate();
                return;
            case 2:
                mg0 mg0Var2 = (mg0) this.f29733c;
                og0 og0Var = ((pg0) this.f29732b).B;
                int i14 = mg0Var2.f30814a;
                RectF rectF3 = mg0Var2.d;
                ProfileActivity.X(((org.telegram.ui.fx0) og0Var).f38363b, i14, rectF3.left, rectF3.top);
                return;
            case 3:
                ViewParent viewParent = (ViewParent) this.f29733c;
                ((org.telegram.ui.Cells.t1) this.f29732b).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 4:
                RLottieNative rLottieNative = (RLottieNative) this.f29732b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f29733c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 5:
                ui0 ui0Var = (ui0) this.f29732b;
                ArrayList arrayList4 = (ArrayList) this.f29733c;
                ArrayList arrayList5 = ui0Var.f33038r;
                ui0Var.f33037n.addAll(arrayList4);
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList4.get(i15);
                    i15++;
                    ti0 ti0Var = (ti0) obj;
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList5.size()) {
                            if (MessageObject.getObjectPeerId(((ti0) arrayList5.get(i16)).f32702a) == MessageObject.getObjectPeerId(ti0Var.f32702a)) {
                                if (ti0Var.f32704c > 0) {
                                    ((ti0) arrayList5.get(i16)).f32704c = ti0Var.f32704c;
                                }
                            } else {
                                i16++;
                            }
                        } else {
                            arrayList5.add(ti0Var);
                        }
                    }
                }
                q0.a aVar = ui0Var.f33040w;
                if (aVar != null) {
                    aVar.accept(arrayList4);
                }
                ui0Var.a();
                return;
            case 6:
                an0 an0Var = (an0) this.f29732b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f29733c;
                ArrayList arrayList6 = an0Var.G;
                if (!arrayList6.isEmpty() && (indexOf = arrayList6.indexOf(tL_sponsoredPeer)) >= 0 && (L = an0Var.L()) < an0Var.h()) {
                    arrayList6.remove(indexOf);
                    an0Var.u(L + 1 + indexOf);
                    int size4 = an0Var.f19294f0.f19527e.size();
                    int size5 = arrayList6.size();
                    if (an0Var.C0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        an0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((an0) this.f29732b).T();
                oc.a0((org.telegram.ui.dy) this.f29733c).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 8:
                ((mn0) this.f29732b).sendAccessibilityEvent((View) this.f29733c, 4);
                return;
            case 9:
                ve veVar = (ve) this.f29732b;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.f29733c;
                if (qnVar != null) {
                    qnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    veVar.dismiss();
                    return;
                }
                return;
            case 10:
                ((WindowManager) this.f29733c).removeView(((ve) this.f29732b).B);
                return;
            case 11:
                rp0 rp0Var = (rp0) this.f29732b;
                TLObject tLObject2 = (TLObject) this.f29733c;
                if (tLObject2 != null) {
                    rp0Var.f32251g0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    rp0Var.Z0();
                    if (rp0Var.f32253i0) {
                        rp0Var.M0();
                    }
                }
                rp0Var.f32252h0 = false;
                return;
            case 12:
                xs0 xs0Var = (xs0) this.f29732b;
                yp0 yp0Var = (yp0) this.f29733c;
                xs0Var.C = null;
                xs0Var.D = null;
                yp0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new r60(yp0Var, 19)).start();
                return;
            case 13:
                ih.o6 o6Var = (ih.o6) this.f29733c;
                zq0 zq0Var = ((eu0) this.f29732b).S;
                if (zq0Var != null) {
                    int i17 = o6Var.f11901a;
                    zq0Var.f44301n.d(i17, zq0Var.f44303s.i(i17));
                    return;
                }
                return;
            case 14:
                oc.a0(((ns0) this.f29732b).f31179f.f28160r1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f29733c).title)).k(true);
                return;
            case 15:
                at0 at0Var = (at0) this.f29732b;
                String str = (String) this.f29733c;
                if (!at0Var.v.f28155p1[at0Var.f26903r].f32788a.isEmpty() && ((i9 = at0Var.f26903r) == 1 || i9 == 4)) {
                    MessageObject messageObject = (MessageObject) j3.r0.j(1, at0Var.v.f28155p1[i9].f32788a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    eu0 eu0Var = at0Var.v;
                    if (eu0Var.f28136f1 == eu0Var.f28160r1.getUserConfig().getClientUserId()) {
                        j10 = messageObject.getSavedDialogId();
                    } else {
                        j10 = 0;
                    }
                    at0Var.F(id2, str, dialogId, j10);
                } else if (at0Var.f26903r == 3) {
                    eu0 eu0Var2 = at0Var.v;
                    at0Var.F(0, str, eu0Var2.f28136f1, eu0Var2.B);
                }
                int i18 = at0Var.f26903r;
                if (i18 == 1 || i18 == 4) {
                    ArrayList arrayList7 = new ArrayList(at0Var.v.f28155p1[at0Var.f26903r].f32788a);
                    at0Var.f26904s++;
                    Utilities.searchQueue.postRunnable(new ue0(at0Var, str, arrayList7, 10));
                    return;
                }
                return;
            case 16:
                at0 at0Var2 = (at0) this.f29732b;
                ArrayList arrayList8 = (ArrayList) this.f29733c;
                eu0 eu0Var3 = at0Var2.v;
                boolean z15 = eu0Var3.R0;
                xs0[] xs0VarArr = eu0Var3.f28137g0;
                if (z15) {
                    at0Var2.f26904s--;
                    int h = at0Var2.h();
                    at0Var2.d = arrayList8;
                    int h10 = at0Var2.h();
                    if (at0Var2.f26904s == 0 || h10 != 0) {
                        eu0Var3.m1(false);
                    }
                    for (int i19 = 0; i19 < xs0VarArr.length; i19++) {
                        xs0 xs0Var2 = xs0VarArr[i19];
                        if (xs0Var2.B == at0Var2.f26903r) {
                            if (at0Var2.f26904s == 0 && h10 == 0) {
                                xs0Var2.f34763w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                xs0VarArr[i19].f34763w.f28886f.setVisibility(8);
                                xs0VarArr[i19].f34763w.e(false, true);
                            } else if (h == 0) {
                                eu0Var3.z(xs0Var2.h, 0, null);
                            }
                        }
                    }
                    at0Var2.l();
                    return;
                }
                return;
            case 17:
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i20 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i20, bool, (TLObject) this.f29733c, (TLRPC.Document) this.f29732b, null, bool);
                return;
            case 18:
                MessagesController.getInstance(((px0) this.f29732b).f31769a.f33158a).updateEmojiStatus((TLRPC.EmojiStatus) this.f29733c);
                return;
            case 19:
                b21 b21Var = (b21) this.f29732b;
                MessagesController.getInstance(b21Var.f27001b).getTopicsController().deleteTopics(-b21Var.f27002c, (ArrayList) this.f29733c);
                int i21 = b21.f26998b0;
                return;
            case 20:
                b21 b21Var2 = (b21) this.f29732b;
                b21Var2.getClass();
                MessagesController.getInstance(b21Var2.f27001b).loadFullChat(((TLRPC.Updates) this.f29733c).chats.get(0).f22380id, 0, true);
                return;
            case 21:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.f29732b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f29733c;
                if (k1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i10 = 1;
                    }
                    k1Var.i0(i10);
                    return;
                }
                return;
            case 22:
                z21.o((z21) this.f29732b, (TLObject) this.f29733c);
                return;
            case 23:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f29732b;
                String str2 = (String) this.f29733c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) this.f29732b;
                ((org.telegram.ui.ActionBar.o1) this.f29733c).d(true);
                p31.a(nkVar.getContext(), nkVar.d);
                return;
            case 25:
                ((TranslateController) this.f29733c).setHideTranslateDialog(((org.telegram.ui.nk) this.f29732b).f31533b, false);
                return;
            case 26:
                UndoView undoView = (UndoView) this.f29732b;
                TLObject tLObject3 = (TLObject) this.f29733c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.f26583s.presentFragment(new org.telegram.ui.co0((TLRPC.PaymentReceipt) tLObject3));
                    return;
                }
                int i22 = UndoView.f26575a0;
                undoView.getClass();
                return;
            case 27:
                ((l41) this.f29732b).D.onClick((org.telegram.ui.Cells.s8) this.f29733c);
                return;
            case 28:
                k61 k61Var = (k61) this.f29732b;
                h3.v1 v1Var = (h3.v1) this.f29733c;
                Throwable cause = v1Var.getCause();
                if ((cause instanceof y3.l) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(v1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = k61.f29997h0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList9 = k61Var.J;
                    if (arrayList9 != null) {
                        int i23 = 0;
                        while (i23 < arrayList9.size()) {
                            g61 g61Var = (g61) arrayList9.get(i23);
                            int i24 = 0;
                            while (true) {
                                ArrayList arrayList10 = g61Var.d;
                                if (i24 < arrayList10.size()) {
                                    i61 i61Var = (i61) arrayList10.get(i24);
                                    if (!TextUtils.isEmpty(i61Var.f29367m) && !k61.Y(i61Var.f29367m)) {
                                        arrayList10.remove(i24);
                                        i24--;
                                    }
                                    i24++;
                                } else {
                                    if (arrayList10.isEmpty()) {
                                        arrayList9.remove(i23);
                                        i23--;
                                    }
                                    i23++;
                                }
                            }
                        }
                        arrayList = arrayList9;
                    }
                    k61Var.J = arrayList;
                    if (arrayList != null) {
                        k61Var.G(arrayList, k61Var.K);
                        return;
                    }
                    return;
                }
                TextureView textureView = k61Var.f30008n;
                if (textureView != null && ((!k61Var.A && (cause instanceof y3.p)) || (cause instanceof e5.m))) {
                    k61Var.A = true;
                    if (k61Var.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(k61Var.f30008n);
                            viewGroup.removeView(k61Var.f30008n);
                            viewGroup.addView(k61Var.f30008n, indexOfChild);
                        }
                        DispatchQueue dispatchQueue = k61Var.f30000b;
                        if (dispatchQueue != null) {
                            dispatchQueue.postRunnable(new b61(k61Var, 0));
                            return;
                        }
                        h3.k0 k0Var = k61Var.d;
                        TextureView textureView2 = k61Var.f30008n;
                        k0Var.q0();
                        if (textureView2 != null && textureView2 == k0Var.V) {
                            k0Var.q0();
                            k0Var.b0();
                            k0Var.g0(null);
                            k0Var.a0(0, 0);
                        }
                        k61Var.d.j0(k61Var.f30008n);
                        ArrayList arrayList11 = k61Var.J;
                        if (arrayList11 != null) {
                            k61Var.G(arrayList11, k61Var.K);
                        } else if (k61Var.Q) {
                            k61Var.H(k61Var.M, k61Var.O, k61Var.N, k61Var.P);
                        } else {
                            k61Var.E(k61Var.M, k61Var.O);
                        }
                        k61Var.D();
                        return;
                    }
                    return;
                }
                k61Var.F.onError(k61Var, v1Var);
                return;
            default:
                ((j61) this.f29732b).f29660f.G.onVisualizerUpdate(true, true, (float[]) this.f29733c);
                return;
        }
    }

    public jg0(Object obj, Object obj2, Object obj3, int i9) {
        this.f29731a = i9;
        this.f29732b = obj;
        this.f29733c = obj2;
    }

    public jg0(TLObject tLObject, TLRPC.Document document) {
        this.f29731a = 17;
        this.f29733c = tLObject;
        this.f29732b = document;
    }
}
