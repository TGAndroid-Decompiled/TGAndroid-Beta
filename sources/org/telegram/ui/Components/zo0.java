package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public abstract class zo0 extends l91 implements org.telegram.ui.h10, NotificationCenter.NotificationCenterDelegate, ch.a {
    public static final int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public wn0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.ey J0;
    public String K0;
    public org.telegram.ui.y00 L0;
    public final org.telegram.ui.i10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.jx P0;
    public final nw0 Q0;
    public final int R0;
    public int S0;
    public final yo0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.u1 V;
    public int V0;
    public final lo0 W;
    public NotificationCenter.ObserversGroup W0;
    public bh.b X0;
    public final s4.k f33302a0;
    public final ro0 f33303b0;
    public final s4.b0 f33304c0;
    public final ql0 f33305d0;
    public boolean f33306e0;
    public final FrameLayout f33307f0;
    public final lo0 f33308g0;
    public final s4.b0 f33309h0;
    public final lm0 f33310i0;
    public final to0 f33311j0;
    public final FrameLayout f33312k0;
    public final lo0 f33313l0;
    public final s4.b0 m0;
    public final lm0 f33314n0;
    public final mo0 f33315o0;
    public final wh0 f33316p0;
    public boolean f33317q0;
    public final FrameLayout f33318r0;
    public final lo0 f33319s0;
    public final s4.b0 f33320t0;
    public final lm0 f33321u0;
    public final po0 f33322v0;
    public ImageView f33323w0;
    public vo0 f33324x0;
    public boolean f33325y0;
    public final HashMap f33326z0;

    public zo0(Context context, org.telegram.ui.ey eyVar, int i10, int i11, int i12, long j10, org.telegram.ui.jx jxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f33317q0 = false;
        this.f33326z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j10;
        this.J0 = eyVar;
        this.P0 = jxVar;
        s4.k kVar = new s4.k();
        this.f33302a0 = kVar;
        kVar.f46421c = 150L;
        kVar.e = 350L;
        kVar.f46422f = 0L;
        kVar.f46423g = 0L;
        kVar.d = 0L;
        kVar.f46424i = new OvershootInterpolator(1.1f);
        kVar.f46405o = zr.h;
        org.telegram.ui.nx nxVar = (org.telegram.ui.nx) this;
        this.f33303b0 = new ro0(nxVar, context, eyVar, i10, i11, kVar, eyVar.F, eyVar, context);
        if (i11 == 15) {
            ArrayList P3 = eyVar.P3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < P3.size(); i18 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.Dialog) P3.get(i18)).f20348id, arrayList, i18, 1)) {
            }
            this.f33303b0.f11917q0 = arrayList;
        }
        this.Q0 = (nw0) eyVar.getFragmentView();
        ai.u1 u1Var = new ai.u1(nxVar, context, 22);
        this.V = u1Var;
        u1Var.setItemAnimator(this.f33302a0);
        u1Var.setPivotY(0.0f);
        u1Var.setClipToPadding(false);
        u1Var.setAdapter(this.f33303b0);
        u1Var.setVerticalScrollBarEnabled(true);
        u1Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        u1Var.setVerticalScrollbarPosition(i13);
        s4.b0 b0Var = new s4.b0(1, false);
        this.f33304c0 = b0Var;
        u1Var.setLayoutManager(b0Var);
        u1Var.W1 = true;
        u1Var.X1 = 0;
        u1Var.setOnScrollListener(new no0(nxVar, eyVar, 2));
        u1Var.C0(new wb0(nxVar, 24));
        org.telegram.ui.i10 i10Var = new org.telegram.ui.i10(this.J0);
        this.M0 = i10Var;
        ai.u1 u1Var2 = i10Var.f38095b;
        u1Var2.setClipToPadding(false);
        u1Var2.j(new qo0(nxVar, 1));
        u1Var2.C0(new wb0(nxVar, 24));
        i10Var.setUiCallback(this);
        i10Var.setVisibility(8);
        i10Var.setChatPreviewDelegate(jxVar);
        z00 z00Var = new z00(context, null);
        z00Var.setViewType(1);
        lo0 lo0Var = new lo0(nxVar, context, z00Var, 2);
        this.W = lo0Var;
        lo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        lo0Var.e.setVisibility(8);
        lo0Var.setVisibility(8);
        lo0Var.addView(z00Var, 0);
        lo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(lo0Var);
        frameLayout.addView(u1Var);
        frameLayout.addView(i10Var);
        u1Var.setEmptyView(lo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33307f0 = frameLayout2;
        so0 so0Var = new so0(nxVar);
        so0Var.f46376m = false;
        so0Var.C = false;
        zr zrVar = zr.h;
        so0Var.o(zrVar);
        so0Var.n(350L);
        lm0 lm0Var = new lm0(context, null);
        this.f33310i0 = lm0Var;
        lm0Var.setItemAnimator(so0Var);
        lm0Var.setPivotY(0.0f);
        lm0Var.setVerticalScrollBarEnabled(true);
        lm0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        lm0Var.setVerticalScrollbarPosition(i14);
        s4.b0 b0Var2 = new s4.b0(1, false);
        this.f33309h0 = b0Var2;
        lm0Var.setLayoutManager(b0Var2);
        lm0Var.W1 = true;
        lm0Var.X1 = 0;
        lm0Var.setClipToPadding(false);
        z00 z00Var2 = new z00(context, null);
        z00Var2.setViewType(1);
        lo0 lo0Var2 = new lo0(nxVar, context, z00Var2, 3);
        this.f33308g0 = lo0Var2;
        lo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        lo0Var2.e.setVisibility(8);
        lo0Var2.setVisibility(8);
        lo0Var2.addView(z00Var2, 0);
        lo0Var2.e(true, false);
        frameLayout2.addView(lo0Var2);
        frameLayout2.addView(lm0Var);
        lm0Var.setEmptyView(lo0Var2);
        to0 to0Var = new to0(nxVar, lm0Var, context, this.H0, i12, eyVar);
        this.f33311j0 = to0Var;
        lm0Var.setAdapter(to0Var);
        lm0Var.setOnScrollListener(new no0(nxVar, eyVar, 3));
        lm0Var.C0(new wb0(nxVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f33312k0 = frameLayout3;
        ko0 ko0Var = new ko0(nxVar);
        ko0Var.f46376m = false;
        ko0Var.C = false;
        ko0Var.o(zrVar);
        ko0Var.n(350L);
        lm0 lm0Var2 = new lm0(context, null);
        this.f33314n0 = lm0Var2;
        lm0Var2.setItemAnimator(ko0Var);
        lm0Var2.setPivotY(0.0f);
        lm0Var2.setClipToPadding(false);
        lm0Var2.setVerticalScrollBarEnabled(true);
        lm0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        lm0Var2.setVerticalScrollbarPosition(i15);
        s4.b0 b0Var3 = new s4.b0(1, false);
        this.m0 = b0Var3;
        lm0Var2.setLayoutManager(b0Var3);
        lm0Var2.W1 = true;
        lm0Var2.X1 = 0;
        z00 z00Var3 = new z00(context, null);
        z00Var3.setViewType(1);
        lo0 lo0Var3 = new lo0(nxVar, context, z00Var3, 0);
        this.f33313l0 = lo0Var3;
        lo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        lo0Var3.e.setVisibility(8);
        lo0Var3.setVisibility(8);
        lo0Var3.addView(z00Var3, 0);
        lo0Var3.e(true, false);
        frameLayout3.addView(lo0Var3);
        frameLayout3.addView(lm0Var2);
        lm0Var2.setEmptyView(lo0Var3);
        mo0 mo0Var = new mo0(nxVar, lm0Var2, context, this.H0, i12);
        this.f33315o0 = mo0Var;
        lm0Var2.setAdapter(mo0Var);
        lm0Var2.setOnScrollListener(new no0(nxVar, eyVar, 0));
        lm0Var2.C0(new wb0(nxVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f33318r0 = frameLayout4;
        oo0 oo0Var = new oo0(nxVar);
        oo0Var.f46376m = false;
        oo0Var.C = false;
        oo0Var.o(zrVar);
        oo0Var.n(350L);
        lm0 lm0Var3 = new lm0(context, null);
        this.f33321u0 = lm0Var3;
        lm0Var3.setItemAnimator(oo0Var);
        lm0Var3.setPivotY(0.0f);
        lm0Var3.setVerticalScrollBarEnabled(true);
        lm0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        lm0Var3.setVerticalScrollbarPosition(i16);
        s4.b0 b0Var4 = new s4.b0(1, false);
        this.f33320t0 = b0Var4;
        lm0Var3.setLayoutManager(b0Var4);
        lm0Var3.W1 = true;
        lm0Var3.X1 = 0;
        lm0Var3.setClipToPadding(false);
        z00 z00Var4 = new z00(context, null);
        z00Var4.setViewType(1);
        lo0 lo0Var4 = new lo0(nxVar, context, z00Var4, 1);
        this.f33319s0 = lo0Var4;
        lo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        lo0Var4.e.setVisibility(8);
        lo0Var4.setVisibility(8);
        lo0Var4.addView(z00Var4, 0);
        lo0Var4.e(true, false);
        frameLayout4.addView(lo0Var4);
        frameLayout4.addView(lm0Var3);
        lm0Var3.setEmptyView(lo0Var4);
        po0 po0Var = new po0(nxVar, lm0Var3, context, this.H0);
        this.f33322v0 = po0Var;
        lm0Var3.setAdapter(po0Var);
        lm0Var3.setOnScrollListener(new no0(nxVar, eyVar, 1));
        lm0Var3.C0(new wb0(nxVar, 24));
        this.f33305d0 = new ql0(u1Var, true);
        wh0 wh0Var = new wh0(context, eyVar);
        this.f33316p0 = wh0Var;
        i71 i71Var = wh0Var.f32240c;
        i71Var.setClipToPadding(false);
        i71Var.j(new qo0(nxVar, 0));
        i71Var.C0(new wb0(nxVar, 24));
        yo0 yo0Var = new yo0(nxVar);
        this.T = yo0Var;
        setAdapter(yo0Var);
    }

    public static org.telegram.ui.sn K(MessageObject messageObject, int i10) {
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        return new org.telegram.ui.sn(bundle);
    }

    public static void O(FrameLayout frameLayout, lm0 lm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            lm0Var.s1(0, i10, 0, i11);
        } else {
            lm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f33317q0) {
            int i10 = 0;
            this.f33317q0 = false;
            Q();
            b91 b91Var = this.M;
            if (b91Var != null && b91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            ro0 ro0Var = this.f33303b0;
            if (ro0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((hg.o0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                ro0Var.T(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            yo0 yo0Var = this.T;
            ArrayList arrayList = yo0Var.f33016a;
            ArrayList arrayList2 = yo0Var.f33016a;
            if (i11 < arrayList.size()) {
                if (((xo0) arrayList2.get(i11)).f32677a == 3 && ((xo0) arrayList2.get(i11)).f32678b == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final boolean M() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f33326z0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void N(View view, int i10, String str, boolean z10) {
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.i10 i10Var;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        lo0 lo0Var = this.W;
        if (isEmpty) {
            lo0Var.e.setVisibility(8);
        } else {
            lo0Var.e.setVisibility(0);
            lo0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        ro0 ro0Var = this.f33303b0;
        org.telegram.ui.px pxVar = ro0Var.U;
        if (pxVar != null) {
            j10 = pxVar.a();
        } else {
            j10 = 0;
        }
        if (i10 == 0) {
            j11 = 0;
        } else {
            j11 = j10;
        }
        int i11 = 0;
        boolean z20 = false;
        long j13 = 0;
        long j14 = 0;
        while (true) {
            ArrayList arrayList = this.A0;
            if (i11 >= arrayList.size()) {
                break;
            }
            hg.o0 o0Var = (hg.o0) arrayList.get(i11);
            int i12 = o0Var.d;
            if (i12 == 4) {
                TLObject tLObject = o0Var.f12031f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f20491id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j12 = -((TLRPC.Chat) o0Var.f12031f).f20344id;
                }
                j11 = j12;
            } else if (i12 == 6) {
                hg.m0 m0Var = o0Var.f12032g;
                long j15 = m0Var.f12006b;
                j14 = m0Var.f12007c;
                j13 = j15;
            } else if (i12 == 7) {
                z20 = true;
            }
            i11++;
        }
        po0 po0Var = this.f33322v0;
        po0Var.getClass();
        if (l40.X(str, null) == null) {
            J();
        }
        if (view == this.f33307f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            to0 to0Var = this.f33311j0;
            lm0 lm0Var = to0Var.d;
            ArrayList arrayList2 = to0Var.S;
            ArrayList arrayList3 = to0Var.T;
            ArrayList arrayList4 = to0Var.U;
            ArrayList arrayList5 = to0Var.R;
            xp xpVar = to0Var.f24801e0;
            to0Var.W();
            if (!TextUtils.equals(str, to0Var.f24800d0)) {
                to0Var.f24800d0 = str;
                AndroidUtilities.cancelRunOnUIThread(xpVar);
                if (TextUtils.isEmpty(to0Var.f24800d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    to0Var.N(true);
                    to0Var.f24799c0++;
                    z19 = false;
                    to0Var.Y = false;
                    to0Var.Z = false;
                    to0Var.f24797a0 = false;
                    to0Var.f24798b0 = 0;
                    if (lm0Var != null) {
                        lm0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(xpVar, 1000L);
                    to0Var.Y = true;
                    to0Var.Z = true;
                    to0Var.N(true);
                    if (lm0Var != null) {
                        z19 = false;
                        lm0Var.u0(0);
                    }
                }
                this.f33308g0.b(this.N0, z19);
            }
            z19 = false;
            this.f33308g0.b(this.N0, z19);
        } else if (view == this.f33312k0) {
            mo0 mo0Var = this.f33315o0;
            lm0 lm0Var2 = mo0Var.d;
            ArrayList arrayList6 = mo0Var.V;
            us usVar = mo0Var.f33038h0;
            if (TextUtils.equals(str, mo0Var.f33037g0)) {
                z18 = false;
            } else {
                mo0Var.f33037g0 = str;
                AndroidUtilities.cancelRunOnUIThread(usVar);
                if (TextUtils.isEmpty(mo0Var.f33037g0)) {
                    arrayList6.clear();
                    mo0Var.N(true);
                    mo0Var.f33036f0++;
                    z18 = false;
                    mo0Var.f33032b0 = false;
                    mo0Var.f33033c0 = false;
                    mo0Var.f33034d0 = false;
                    mo0Var.f33035e0 = 0;
                    if (lm0Var2 != null) {
                        lm0Var2.u0(0);
                    }
                } else {
                    z18 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(usVar, 1000L);
                    mo0Var.f33032b0 = true;
                    mo0Var.f33033c0 = true;
                    mo0Var.N(true);
                    if (lm0Var2 != null) {
                        lm0Var2.u0(0);
                    }
                }
            }
            this.f33313l0.b(this.N0, z18);
            if (TextUtils.isEmpty(str)) {
                mo0Var.V();
            }
        } else {
            wh0 wh0Var = this.f33316p0;
            if (view == wh0Var) {
                i71 i71Var = wh0Var.f32240c;
                ArrayList arrayList7 = wh0Var.f32242n;
                if (!TextUtils.equals(wh0Var.f32245w, str)) {
                    if (wh0Var.K >= 0) {
                        ConnectionsManager.getInstance(wh0Var.f32239b).cancelRequest(wh0Var.K, true);
                        wh0Var.K = -1;
                    }
                    wh0Var.v = false;
                    wh0Var.H.setLoading(false);
                    wh0Var.f32245w = str;
                    if (TextUtils.isEmpty(str)) {
                        wh0Var.f32243r = 0;
                        z17 = true;
                        wh0Var.L++;
                        wh0Var.f32244s = false;
                        arrayList7.clear();
                        wh0Var.a(false);
                    } else {
                        z17 = true;
                        wh0Var.b(str);
                        wh0Var.f32243r = 0;
                        wh0Var.L++;
                        wh0Var.f32244s = false;
                        arrayList7.clear();
                    }
                    wh0Var.d();
                    i71Var.u0(0);
                    i71Var.Z2.N(z17);
                }
            } else if (view == this.f33318r0) {
                if (l40.X(str, null) != null) {
                    if (z10) {
                        this.f33320t0.h1(0, 0);
                    }
                    po0Var.Y(str);
                    this.f33319s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                org.telegram.ui.i10 i10Var2 = this.M0;
                if ((i13 == 0 && this.T0 == 0 && j13 == 0 && j14 == 0) || j10 != 0) {
                    this.I0 = false;
                    ro0Var.T(z20 ? 1 : 0, str);
                    ro0Var.A0 = this.L0;
                    i10Var2.animate().setListener(null).cancel();
                    i10Var2.i(null, false);
                    if (z10) {
                        if (ro0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        lo0Var.e(!z15, false);
                        if (ro0Var.D0 > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        lo0Var.e(z16, false);
                    } else if (!ro0Var.M()) {
                        if (ro0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        lo0Var.e(z14, true);
                    }
                    if (z10) {
                        i10Var2.setVisibility(8);
                    } else if (i10Var2.getVisibility() != 8) {
                        i10Var2.animate().alpha(0.0f).setListener(new g60(this, 17)).setDuration(150L).start();
                    }
                    i10Var2.setTag(null);
                    i10Var = i10Var2;
                    z13 = false;
                } else {
                    boolean z21 = true;
                    i10Var2.setTag(1);
                    i10Var2.i(this.L0, false);
                    i10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        i10Var2.setVisibility(0);
                        i10Var2.setAlpha(1.0f);
                        z12 = z10;
                    } else {
                        if (i10Var2.getVisibility() != 0) {
                            i10Var2.setVisibility(0);
                            i10Var2.setAlpha(0.0f);
                        } else {
                            z21 = z10;
                        }
                        i10Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z12 = z21;
                    }
                    z13 = false;
                    long j16 = j11;
                    i10Var = i10Var2;
                    this.M0.h(j16, this.T0, j13, j14, null, z20, str, z12);
                    lo0Var.setVisibility(8);
                }
                lo0Var.b(this.N0, z13);
                i10Var.f38097c.b(this.N0, z13);
            } else {
                long j17 = j10;
                long j18 = j13;
                long j19 = j14;
                if (view instanceof org.telegram.ui.i10) {
                    org.telegram.ui.i10 i10Var3 = (org.telegram.ui.i10) view;
                    if (j17 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i10Var3.setUseFromUserAsAvatar(z11);
                    i10Var3.f38097c.b(this.N0, false);
                    i10Var3.h(j11, this.T0, j18, j19, hg.q0.f12042d3[((xo0) this.T.f33016a.get(i10)).f32678b], z20, str, z10);
                } else if (view instanceof wn0) {
                    wn0 wn0Var = (wn0) view;
                    wn0Var.f32302a.b(this.N0, false);
                    wn0Var.K = str;
                    wn0Var.d(false);
                }
            }
        }
    }

    public final void P(boolean z10) {
        km0 km0Var;
        km0 km0Var2;
        km0 km0Var3;
        int i10;
        boolean z11;
        int i11;
        int i12;
        org.telegram.ui.px pxVar;
        int i13;
        if (this.f33325y0 != z10) {
            org.telegram.ui.ey eyVar = this.J0;
            if (!z10 || !eyVar.getActionBar().s()) {
                if (z10 && !eyVar.getActionBar().a("search_view_pager")) {
                    this.F0 = eyVar.getActionBar().i("search_view_pager");
                    if (eyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f33323w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f33323w0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                        org.telegram.ui.ActionBar.r6.t(this.f33323w0, org.telegram.ui.ActionBar.k6.f21574y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f33323w0;
                        int i14 = org.telegram.ui.ActionBar.k6.f21591z8;
                        org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i14), null);
                        this.f33323w0.setOnClickListener(new t80(this, 13));
                        this.F0.addView(this.f33323w0, w7.z5.o(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.F0.getContext());
                    this.f33324x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f33324x0.setTypeface(AndroidUtilities.bold());
                    vo0 vo0Var = this.f33324x0;
                    int i15 = org.telegram.ui.ActionBar.k6.f21574y8;
                    sd0 sd0Var = new sd0(11);
                    sd0 sd0Var2 = new sd0(12);
                    int R = org.telegram.ui.ActionBar.r6.R(i15, -1, 0, 0.0f, null);
                    sd0Var2.d(R, vo0Var);
                    org.telegram.ui.ActionBar.l6 y3 = org.telegram.ui.ActionBar.r6.y(101, vo0Var);
                    y3.c(i15, -1, 0, 0.0f, null);
                    y3.f21620n = sd0Var;
                    y3.f21621o = sd0Var2;
                    y3.f21619m = false;
                    y3.f21614g = R;
                    org.telegram.ui.ActionBar.y yVar = this.F0;
                    vo0 vo0Var2 = this.f33324x0;
                    if (eyVar.W) {
                        i13 = 18;
                    } else {
                        i13 = 72;
                    }
                    yVar.addView(vo0Var2, w7.z5.m(1.0f, 0, -1, i13, 0, 0));
                    this.f33324x0.setOnTouchListener(new di.d(21));
                    org.telegram.ui.ActionBar.u0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.r6.t(this.B0.getIconView(), i15, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f33324x0 != null) {
                    ro0 ro0Var = this.f33303b0;
                    if (ro0Var != null && (pxVar = ro0Var.U) != null && pxVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33324x0.getLayoutParams();
                    if (eyVar.W) {
                        i11 = 18;
                    } else {
                        i11 = 72;
                    }
                    if (z11) {
                        i12 = 56;
                    } else {
                        i12 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i11 + i12);
                    vo0 vo0Var3 = this.f33324x0;
                    vo0Var3.setLayoutParams(vo0Var3.getLayoutParams());
                }
                if (eyVar.getActionBar().getBackButton() != null && (eyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.i5)) {
                    org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
                    eyVar.getActionBar().setBackButtonDrawable(h2Var);
                    h2Var.setColorFilter(null);
                }
                this.f33325y0 = z10;
                HashMap hashMap = this.f33326z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(eyVar.getParentActivity().getCurrentFocus());
                    eyVar.getActionBar().N(null, null);
                    this.f33324x0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.u0 u0Var = this.B0;
                    if (M()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    u0Var.setVisibility(i10);
                    this.C0.setVisibility(0);
                    this.D0.setVisibility(0);
                    this.E0.setVisibility(0);
                    return;
                }
                eyVar.getActionBar().r();
                hashMap.clear();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    if ((getChildAt(i16) instanceof org.telegram.ui.i10) && (km0Var3 = ((org.telegram.ui.i10) getChildAt(i16)).d) != null) {
                        km0Var3.l();
                    }
                    if (getChildAt(i16) instanceof wn0) {
                        ((wn0) getChildAt(i16)).d(true);
                    }
                }
                org.telegram.ui.i10 i10Var = this.M0;
                if (i10Var != null && (km0Var2 = i10Var.d) != null) {
                    km0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i17 = 0; i17 < size; i17++) {
                    View view = (View) sparseArray.valueAt(i17);
                    if ((view instanceof org.telegram.ui.i10) && (km0Var = ((org.telegram.ui.i10) view).d) != null) {
                        km0Var.l();
                    }
                }
            }
        }
    }

    public final void Q() {
        this.T.i();
        o(false);
        b91 b91Var = this.M;
        if (b91Var != null) {
            b91Var.f27988x.l();
        }
    }

    @Override
    public final void a() {
        P(true);
    }

    @Override
    public final boolean b(org.telegram.ui.a10 a10Var) {
        return this.f33326z0.containsKey(a10Var);
    }

    @Override
    public final void c(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        P(false);
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.a10 a10Var = new org.telegram.ui.a10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f33326z0;
        if (hashMap.containsKey(a10Var)) {
            hashMap.remove(a10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(a10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            P(false);
        } else {
            this.f33324x0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.u0 u0Var = this.C0;
            if (u0Var != null) {
                if (hashMap.size() == 1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                u0Var.setVisibility(i12);
            }
            if (this.B0 != null) {
                boolean M = M();
                if (M) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (this.B0.getVisibility() != i11) {
                    this.B0.setVisibility(i11);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.B0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.r6.z(this, animatedVectorDrawable, org.telegram.ui.ActionBar.k6.f21574y8, null, PorterDuff.Mode.SRC_IN);
                    if (M) {
                        animatedVectorDrawable.start();
                    } else {
                        animatedVectorDrawable.reset();
                    }
                }
            }
            if (this.E0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((MessageObject) hashMap.get((org.telegram.ui.a10) it.next())).isDownloadingFile) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                org.telegram.ui.ActionBar.u0 u0Var2 = this.E0;
                if (!z10) {
                    i13 = 8;
                }
                u0Var2.setVisibility(i13);
            }
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(a10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).b(i10, hashMap.containsKey(a10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(a10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(a10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(a10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.q2) {
            ((org.telegram.ui.Cells.q2) view).U(hashMap.containsKey(a10Var), true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z10 = false;
        to0 to0Var = this.f33311j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f33308g0.e(z10, true);
            to0Var.W();
            to0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f33315o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                po0 po0Var = this.f33322v0;
                if (obj == po0Var.S) {
                    po0Var.N(true);
                }
            }
        } else {
            to0Var.W();
            to0Var.N(true);
        }
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f4360a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.U;
                lm0 lm0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        lm0Var = this.V;
                    } else if (view == this.f33307f0) {
                        lm0Var = this.f33310i0;
                    } else if (view == this.f33312k0) {
                        lm0Var = this.f33314n0;
                    } else if (view == this.f33318r0) {
                        lm0Var = this.f33321u0;
                    } else {
                        wn0 wn0Var = this.G0;
                        if (view == wn0Var) {
                            lm0Var = wn0Var.f32303b;
                        } else {
                            wh0 wh0Var = this.f33316p0;
                            if (view == wh0Var) {
                                lm0Var = wh0Var.f32240c;
                            } else if (view instanceof org.telegram.ui.i10) {
                                lm0Var = ((org.telegram.ui.i10) view).f38095b;
                            }
                        }
                    }
                }
                if (lm0Var != null) {
                    hh.d.a(lm0Var, canvas, rectF, lm0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.i10 i10Var = this.M0;
                    if (i10Var.getVisibility() == 0) {
                        ai.u1 u1Var = i10Var.f38095b;
                        hh.d.a(u1Var, canvas, rectF, u1Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f33325y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<hg.o0> getCurrentSearchFilters() {
        return this.A0;
    }

    public wn0 getDownloadsContainer() {
        return this.G0;
    }

    public int getFolderId() {
        return this.R0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.u0 getSpeedItem() {
        return this.B0;
    }

    public k91 getTabsView() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.W0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.W0 = null;
        }
        this.W0 = NotificationCenter.getInstance(this.H0).createObserversGroup(this).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.dialogDeleted).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.reloadWebappsHints).add(NotificationCenter.storiesListUpdated);
        this.f33306e0 = true;
        to0 to0Var = this.f33311j0;
        if (to0Var != null) {
            to0Var.N(false);
        }
        mo0 mo0Var = this.f33315o0;
        if (mo0Var != null) {
            mo0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33306e0 = false;
        NotificationCenter.ObserversGroup observersGroup = this.W0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.W0 = null;
        }
    }

    @Override
    public final void s() {
        this.Q0.L();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        this.X0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.y00 y00Var) {
        this.L0 = y00Var;
    }

    public void setKeyboardHeight(int i10) {
        boolean z10;
        this.N0 = i10;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.i10) {
                ((org.telegram.ui.i10) getChildAt(i11)).f38097c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f38097c.b(i10, z10);
            } else if (getChildAt(i11) instanceof wn0) {
                ((wn0) getChildAt(i11)).f32302a.b(i10, z10);
            } else if (getChildAt(i11) == this.f33307f0) {
                this.f33308g0.b(i10, z10);
            }
        }
    }

    @Override
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        b91 b91Var = this.M;
        if (b91Var != null) {
            b91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        ro0 ro0Var = this.f33303b0;
        org.telegram.ui.i10 i10Var = this.M0;
        if (i10 == 0) {
            if (i10Var.getVisibility() == 0) {
                i10Var.i(this.L0, false);
                ro0Var.A0 = null;
            } else {
                i10Var.i(null, false);
                org.telegram.ui.y00 y00Var = this.L0;
                ro0Var.A0 = y00Var;
                if (y00Var != null) {
                    ((org.telegram.ui.jv) y00Var).i(false, null, ro0Var.f11930y0, ro0Var.f11931z0);
                }
            }
        } else if (view instanceof org.telegram.ui.i10) {
            if (i11 == 0 && i10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.i10) view).i(this.L0, z10);
        }
        if (view2 instanceof org.telegram.ui.i10) {
            ((org.telegram.ui.i10) view2).i(null, false);
            return;
        }
        ro0Var.A0 = null;
        i10Var.i(null, false);
    }
}
