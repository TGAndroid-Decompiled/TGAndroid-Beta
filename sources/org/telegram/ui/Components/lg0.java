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

public final class lg0 implements Runnable {

    public final int f30375a;

    public final Object f30376b;

    public final Object f30377c;

    public lg0(int i10, Object obj, Object obj2) {
        this.f30375a = i10;
        this.f30376b = obj;
        this.f30377c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int iIndexOf;
        int iL;
        int i10;
        int i11 = 4;
        ArrayList arrayList = null;
        boolean z11 = false;
        Object[] objArr = 0;
        boolean z12 = true;
        switch (this.f30375a) {
            case 0:
                mg0 mg0Var = (mg0) this.f30376b;
                TLObject tLObject = (TLObject) this.f30377c;
                mg0Var.I = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    mg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        mg0Var.a(false);
                    } else {
                        mg0Var.d();
                        mg0Var.f30677c.U2.N(true);
                    }
                }
                break;
            case 1:
                rg0 rg0Var = (rg0) this.f30376b;
                ArrayList arrayList2 = (ArrayList) this.f30377c;
                ArrayList arrayList3 = rg0Var.f32157a;
                int i12 = rg0Var.f32166x;
                int size = arrayList2.size();
                rg0Var.f32166x = size;
                if (i12 != size && rg0Var.O != null) {
                    rg0Var.g();
                }
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    og0 og0Var = (og0) arrayList3.get(i13);
                    if (!og0Var.f31292o || og0Var.f31293p) {
                        if (rg0.j(og0Var.f31280a, arrayList2) == null) {
                            rg0 rg0Var2 = og0Var.f31301y;
                            float f10 = rg0Var2.J;
                            RectF rectF = og0Var.f31282c;
                            RectF rectF2 = og0Var.f31284f;
                            t80 t80Var = og0Var.f31295r;
                            if (t80Var != null) {
                                t80Var.a();
                                og0Var.f31297t = z11;
                                og0Var.f31296s = z11;
                            }
                            og0Var.f31292o = z12;
                            boolean z13 = rectF.left - 1.0f <= f10;
                            boolean z14 = rectF.right + 1.0f >= ((float) rg0Var2.getMeasuredWidth()) - f10;
                            if (z13 && z14) {
                                z13 = false;
                                z14 = false;
                            }
                            og0Var.f31285g.set(rectF);
                            rectF2.set(rectF);
                            if (z13) {
                                rectF2.right = rectF2.left;
                            } else {
                                if (z14) {
                                    rectF2.left = rectF2.right;
                                } else {
                                    int i14 = og0Var.f31280a;
                                    if (i14 == 3 || i14 == 2) {
                                        z10 = true;
                                        if (rg0Var2.D == 1) {
                                            rectF2.left = rectF2.right;
                                        }
                                    } else {
                                        z10 = true;
                                    }
                                    float fCenterX = rectF2.centerX();
                                    rectF2.right = fCenterX;
                                    rectF2.left = fCenterX;
                                }
                                og0Var.f31283e.d(0.0f, z10);
                                arrayList2.add(og0Var);
                            }
                            z10 = true;
                            og0Var.f31283e.d(0.0f, z10);
                            arrayList2.add(og0Var);
                        }
                        i13++;
                        z11 = false;
                        z12 = true;
                    } else {
                        arrayList2.add(og0Var);
                    }
                    i13++;
                    z11 = false;
                    z12 = true;
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                rg0Var.invalidate();
                break;
            case 2:
                rg0 rg0Var3 = (rg0) this.f30376b;
                og0 og0Var2 = (og0) this.f30377c;
                qg0 qg0Var = rg0Var3.B;
                int i15 = og0Var2.f31280a;
                RectF rectF3 = og0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.gx0) qg0Var).f38493b, i15, rectF3.left, rectF3.top);
                break;
            case 3:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f30376b;
                ViewParent viewParent = (ViewParent) this.f30377c;
                s1Var.invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                }
                break;
            case 4:
                RLottieNative rLottieNative = (RLottieNative) this.f30376b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f30377c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                }
                break;
            case 5:
                wi0 wi0Var = (wi0) this.f30376b;
                ArrayList arrayList4 = (ArrayList) this.f30377c;
                ArrayList arrayList5 = wi0Var.f34222r;
                wi0Var.f34221n.addAll(arrayList4);
                int size3 = arrayList4.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList4.get(i16);
                    i16++;
                    vi0 vi0Var = (vi0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList5.size()) {
                            arrayList5.add(vi0Var);
                        } else {
                            if (MessageObject.getObjectPeerId(((vi0) arrayList5.get(i17)).f33424a) == MessageObject.getObjectPeerId(vi0Var.f33424a)) {
                                if (vi0Var.f33426c <= 0) {
                                }
                                ((vi0) arrayList5.get(i17)).f33426c = vi0Var.f33426c;
                            }
                            i17++;
                        }
                        break;
                    }
                }
                q0.a aVar = wi0Var.f34224w;
                if (aVar != null) {
                    aVar.accept(arrayList4);
                }
                wi0Var.a();
                break;
            case 6:
                cn0 cn0Var = (cn0) this.f30376b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f30377c;
                ArrayList arrayList6 = cn0Var.G;
                if (!arrayList6.isEmpty() && (iIndexOf = arrayList6.indexOf(tL_sponsoredPeer)) >= 0 && (iL = cn0Var.L()) < cn0Var.h()) {
                    arrayList6.remove(iIndexOf);
                    cn0Var.u(iL + 1 + iIndexOf);
                    int size4 = cn0Var.f45987f0.f45839e.size();
                    int size5 = arrayList6.size();
                    if (cn0Var.C0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        cn0Var.u(iL);
                    }
                }
                break;
            case 7:
                cn0 cn0Var2 = (cn0) this.f30376b;
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) this.f30377c;
                cn0Var2.T();
                mc.a0(gyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 8:
                ((nn0) this.f30376b).sendAccessibilityEvent((View) this.f30377c, 4);
                break;
            case 9:
                re reVar = (re) this.f30376b;
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) this.f30377c;
                if (rnVar != null) {
                    rnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    reVar.dismiss();
                }
                break;
            case 10:
                ((WindowManager) this.f30377c).removeView(((re) this.f30376b).B);
                break;
            case 11:
                sp0 sp0Var = (sp0) this.f30376b;
                TLObject tLObject2 = (TLObject) this.f30377c;
                if (tLObject2 != null) {
                    sp0Var.f32529g0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    sp0Var.Z0();
                    if (sp0Var.f32531i0) {
                        sp0Var.M0();
                    }
                }
                sp0Var.f32530h0 = false;
                break;
            case 12:
                zs0 zs0Var = (zs0) this.f30376b;
                zp0 zp0Var = (zp0) this.f30377c;
                zs0Var.C = null;
                zs0Var.D = null;
                zp0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new sz(zp0Var, 21)).start();
                break;
            case 13:
                hu0 hu0Var = (hu0) this.f30376b;
                jh.k6 k6Var = (jh.k6) this.f30377c;
                ar0 ar0Var = hu0Var.S;
                if (ar0Var != null) {
                    int i18 = k6Var.f13588a;
                    ar0Var.f44655n.d(i18, ar0Var.f44657s.i(i18));
                }
                break;
            case 14:
                mc.a0(((ps0) this.f30376b).f31661f.f29145r1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.f30377c).title)).k(true);
                break;
            case 15:
                ct0 ct0Var = (ct0) this.f30376b;
                String str = (String) this.f30377c;
                if (!ct0Var.v.f29140p1[ct0Var.f27544r].f34325a.isEmpty() && ((i10 = ct0Var.f27544r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i0.a.i(1, ct0Var.v.f29140p1[i10].f34325a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    hu0 hu0Var2 = ct0Var.v;
                    ct0Var.F(id2, str, dialogId, hu0Var2.f29121f1 == hu0Var2.f29145r1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (ct0Var.f27544r == 3) {
                    hu0 hu0Var3 = ct0Var.v;
                    ct0Var.F(0, str, hu0Var3.f29121f1, hu0Var3.B);
                }
                int i19 = ct0Var.f27544r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList7 = new ArrayList(ct0Var.v.f29140p1[ct0Var.f27544r].f34325a);
                    ct0Var.f27545s++;
                    Utilities.searchQueue.postRunnable(new gs0(ct0Var, str, arrayList7, i11));
                }
                break;
            case 16:
                ct0 ct0Var2 = (ct0) this.f30376b;
                ArrayList arrayList8 = (ArrayList) this.f30377c;
                hu0 hu0Var4 = ct0Var2.v;
                boolean z15 = hu0Var4.R0;
                zs0[] zs0VarArr = hu0Var4.f29122g0;
                if (z15) {
                    ct0Var2.f27545s--;
                    int iH = ct0Var2.h();
                    ct0Var2.d = arrayList8;
                    int iH2 = ct0Var2.h();
                    if (ct0Var2.f27545s == 0 || iH2 != 0) {
                        hu0Var4.m1(false);
                    }
                    for (int i20 = 0; i20 < zs0VarArr.length; i20++) {
                        zs0 zs0Var2 = zs0VarArr[i20];
                        if (zs0Var2.B == ct0Var2.f27544r) {
                            if (ct0Var2.f27545s == 0 && iH2 == 0) {
                                zs0Var2.f35342w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                zs0VarArr[i20].f35342w.f29507f.setVisibility(8);
                                zs0VarArr[i20].f35342w.e(false, true);
                            } else if (iH == 0) {
                                hu0Var4.z(zs0Var2.h, 0, null);
                            }
                        }
                    }
                    ct0Var2.l();
                    break;
                }
                break;
            case 17:
                TLObject tLObject3 = (TLObject) this.f30377c;
                TLRPC.Document document = (TLRPC.Document) this.f30376b;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, tLObject3, document, null, bool);
                break;
            case 18:
                MessagesController.getInstance(((rx0) this.f30376b).f32268a.f34363a).updateEmojiStatus((TLRPC.EmojiStatus) this.f30377c);
                break;
            case 19:
                d21 d21Var = (d21) this.f30376b;
                MessagesController.getInstance(d21Var.f27625b).getTopicsController().deleteTopics(-d21Var.f27626c, (ArrayList) this.f30377c);
                int i22 = d21.f27622b0;
                break;
            case 20:
                d21 d21Var2 = (d21) this.f30376b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f30377c;
                d21Var2.getClass();
                MessagesController.getInstance(d21Var2.f27625b).loadFullChat(updates.chats.get(0).f22380id, 0, true);
                break;
            case 21:
                org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.f30376b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f30377c;
                if (j1Var != null) {
                    j1Var.i0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                }
                break;
            case 22:
                b31.p((b31) this.f30376b, (TLObject) this.f30377c);
                break;
            case 23:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f30376b;
                String str2 = (String) this.f30377c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                }
                break;
            case 24:
                org.telegram.ui.pk pkVar = (org.telegram.ui.pk) this.f30376b;
                ((org.telegram.ui.ActionBar.n1) this.f30377c).d(true);
                r31.a(pkVar.getContext(), pkVar.d);
                break;
            case 25:
                ((TranslateController) this.f30377c).setHideTranslateDialog(((org.telegram.ui.pk) this.f30376b).f32072b, false);
                break;
            case 26:
                UndoView undoView = (UndoView) this.f30376b;
                TLObject tLObject4 = (TLObject) this.f30377c;
                if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    undoView.f26579s.presentFragment(new org.telegram.ui.do0((TLRPC.PaymentReceipt) tLObject4));
                } else {
                    int i23 = UndoView.f26571a0;
                    undoView.getClass();
                }
                break;
            case 27:
                ((n41) this.f30376b).D.onClick((org.telegram.ui.Cells.o8) this.f30377c);
                break;
            case 28:
                m61 m61Var = (m61) this.f30376b;
                h3.v1 v1Var = (h3.v1) this.f30377c;
                Throwable cause = v1Var.getCause();
                if ((cause instanceof y3.l) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(v1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap map = m61.f30589h0;
                    if (map != null) {
                        map.clear();
                    }
                    ArrayList arrayList9 = m61Var.J;
                    if (arrayList9 != null) {
                        int i24 = 0;
                        while (i24 < arrayList9.size()) {
                            i61 i61Var = (i61) arrayList9.get(i24);
                            int i25 = 0;
                            while (true) {
                                ArrayList arrayList10 = i61Var.d;
                                if (i25 < arrayList10.size()) {
                                    k61 k61Var = (k61) arrayList10.get(i25);
                                    if (!TextUtils.isEmpty(k61Var.f30017m) && !m61.Y(k61Var.f30017m)) {
                                        arrayList10.remove(i25);
                                        i25--;
                                    }
                                    i25++;
                                } else {
                                    if (arrayList10.isEmpty()) {
                                        arrayList9.remove(i24);
                                        i24--;
                                    }
                                    i24++;
                                }
                            }
                        }
                        arrayList = arrayList9;
                    }
                    m61Var.J = arrayList;
                    if (arrayList != null) {
                        m61Var.G(arrayList, m61Var.K);
                    }
                } else {
                    TextureView textureView = m61Var.f30600n;
                    if (textureView == null || ((m61Var.A || !(cause instanceof y3.p)) && !(cause instanceof e5.l))) {
                        m61Var.F.onError(m61Var, v1Var);
                    } else {
                        m61Var.A = true;
                        if (m61Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int iIndexOfChild = viewGroup.indexOfChild(m61Var.f30600n);
                                viewGroup.removeView(m61Var.f30600n);
                                viewGroup.addView(m61Var.f30600n, iIndexOfChild);
                            }
                            DispatchQueue dispatchQueue = m61Var.f30592b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new d61(m61Var, objArr == true ? 1 : 0));
                            } else {
                                h3.k0 k0Var = m61Var.d;
                                TextureView textureView2 = m61Var.f30600n;
                                k0Var.q0();
                                if (textureView2 != null && textureView2 == k0Var.V) {
                                    k0Var.q0();
                                    k0Var.b0();
                                    k0Var.g0(null);
                                    k0Var.a0(0, 0);
                                }
                                m61Var.d.j0(m61Var.f30600n);
                                ArrayList arrayList11 = m61Var.J;
                                if (arrayList11 != null) {
                                    m61Var.G(arrayList11, m61Var.K);
                                } else if (m61Var.Q) {
                                    m61Var.H(m61Var.M, m61Var.O, m61Var.N, m61Var.P);
                                } else {
                                    m61Var.E(m61Var.M, m61Var.O);
                                }
                                m61Var.D();
                            }
                        }
                    }
                }
                break;
            default:
                ((l61) this.f30376b).f30310f.G.onVisualizerUpdate(true, true, (float[]) this.f30377c);
                break;
        }
    }

    public lg0(Object obj, Object obj2, Object obj3, int i10) {
        this.f30375a = i10;
        this.f30376b = obj;
        this.f30377c = obj2;
    }

    public lg0(TLObject tLObject, TLRPC.Document document) {
        this.f30375a = 17;
        this.f30377c = tLObject;
        this.f30376b = document;
    }
}
