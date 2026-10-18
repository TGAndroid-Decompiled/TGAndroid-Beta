package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
public abstract class vo0 extends c91 implements org.telegram.ui.f10, NotificationCenter.NotificationCenterDelegate, ch.a {
    public static final int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public tn0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.ey J0;
    public String K0;
    public org.telegram.ui.x00 L0;
    public final org.telegram.ui.g10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.jx P0;
    public final jw0 Q0;
    public final int R0;
    public int S0;
    public final uo0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.u1 V;
    public int V0;
    public final io0 W;
    public NotificationCenter.ObserversGroup W0;
    public bh.b X0;
    public final s4.k f31346a0;
    public final oo0 f31347b0;
    public final s4.b0 f31348c0;
    public final nl0 f31349d0;
    public boolean f31350e0;
    public final FrameLayout f31351f0;
    public final io0 f31352g0;
    public final s4.b0 f31353h0;
    public final im0 f31354i0;
    public final qo0 f31355j0;
    public final FrameLayout f31356k0;
    public final io0 f31357l0;
    public final s4.b0 m0;
    public final im0 f31358n0;
    public final jo0 f31359o0;
    public final th0 f31360p0;
    public boolean f31361q0;
    public final FrameLayout f31362r0;
    public final io0 f31363s0;
    public final s4.b0 f31364t0;
    public final im0 f31365u0;
    public final mo0 f31366v0;
    public ImageView f31367w0;
    public NumberTextView f31368x0;
    public boolean f31369y0;
    public final HashMap f31370z0;

    public vo0(Context context, org.telegram.ui.ey eyVar, int i10, int i11, int i12, long j10, org.telegram.ui.jx jxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f31361q0 = false;
        this.f31370z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j10;
        this.J0 = eyVar;
        this.P0 = jxVar;
        s4.k kVar = new s4.k();
        this.f31346a0 = kVar;
        kVar.f46037c = 150L;
        kVar.e = 350L;
        kVar.f46038f = 0L;
        kVar.f46039g = 0L;
        kVar.d = 0L;
        kVar.f46040i = new OvershootInterpolator(1.1f);
        kVar.f46021o = bs.h;
        org.telegram.ui.nx nxVar = (org.telegram.ui.nx) this;
        this.f31347b0 = new oo0(nxVar, context, eyVar, i10, i11, kVar, eyVar.F, eyVar, context);
        if (i11 == 15) {
            ArrayList P3 = eyVar.P3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < P3.size(); i18 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.Dialog) P3.get(i18)).f20283id, arrayList, i18, 1)) {
            }
            this.f31347b0.f11893q0 = arrayList;
        }
        this.Q0 = (jw0) eyVar.getFragmentView();
        ai.u1 u1Var = new ai.u1(nxVar, context, 22);
        this.V = u1Var;
        u1Var.setItemAnimator(this.f31346a0);
        u1Var.setPivotY(0.0f);
        u1Var.setClipToPadding(false);
        u1Var.setAdapter(this.f31347b0);
        u1Var.setVerticalScrollBarEnabled(true);
        u1Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        u1Var.setVerticalScrollbarPosition(i13);
        s4.b0 b0Var = new s4.b0(1, false);
        this.f31348c0 = b0Var;
        u1Var.setLayoutManager(b0Var);
        u1Var.W1 = true;
        u1Var.X1 = 0;
        u1Var.setOnScrollListener(new ko0(nxVar, eyVar, 2));
        u1Var.C0(new rc0(nxVar, 23));
        org.telegram.ui.g10 g10Var = new org.telegram.ui.g10(this.J0);
        this.M0 = g10Var;
        ai.u1 u1Var2 = g10Var.f37053b;
        u1Var2.setClipToPadding(false);
        u1Var2.j(new no0(nxVar, 1));
        u1Var2.C0(new rc0(nxVar, 23));
        g10Var.setUiCallback(this);
        g10Var.setVisibility(8);
        g10Var.setChatPreviewDelegate(jxVar);
        b10 b10Var = new b10(context, null);
        b10Var.setViewType(1);
        io0 io0Var = new io0(nxVar, context, b10Var, 2);
        this.W = io0Var;
        io0Var.d.setText(LocaleController.getString(R.string.NoResult));
        io0Var.e.setVisibility(8);
        io0Var.setVisibility(8);
        io0Var.addView(b10Var, 0);
        io0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(io0Var);
        frameLayout.addView(u1Var);
        frameLayout.addView(g10Var);
        u1Var.setEmptyView(io0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f31351f0 = frameLayout2;
        po0 po0Var = new po0(nxVar);
        po0Var.f45992m = false;
        po0Var.C = false;
        bs bsVar = bs.h;
        po0Var.o(bsVar);
        po0Var.n(350L);
        im0 im0Var = new im0(context, null);
        this.f31354i0 = im0Var;
        im0Var.setItemAnimator(po0Var);
        im0Var.setPivotY(0.0f);
        im0Var.setVerticalScrollBarEnabled(true);
        im0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        im0Var.setVerticalScrollbarPosition(i14);
        s4.b0 b0Var2 = new s4.b0(1, false);
        this.f31353h0 = b0Var2;
        im0Var.setLayoutManager(b0Var2);
        im0Var.W1 = true;
        im0Var.X1 = 0;
        im0Var.setClipToPadding(false);
        b10 b10Var2 = new b10(context, null);
        b10Var2.setViewType(1);
        io0 io0Var2 = new io0(nxVar, context, b10Var2, 3);
        this.f31352g0 = io0Var2;
        io0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        io0Var2.e.setVisibility(8);
        io0Var2.setVisibility(8);
        io0Var2.addView(b10Var2, 0);
        io0Var2.e(true, false);
        frameLayout2.addView(io0Var2);
        frameLayout2.addView(im0Var);
        im0Var.setEmptyView(io0Var2);
        qo0 qo0Var = new qo0(nxVar, im0Var, context, this.H0, i12, eyVar);
        this.f31355j0 = qo0Var;
        im0Var.setAdapter(qo0Var);
        im0Var.setOnScrollListener(new ko0(nxVar, eyVar, 3));
        im0Var.C0(new rc0(nxVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f31356k0 = frameLayout3;
        ho0 ho0Var = new ho0(nxVar);
        ho0Var.f45992m = false;
        ho0Var.C = false;
        ho0Var.o(bsVar);
        ho0Var.n(350L);
        im0 im0Var2 = new im0(context, null);
        this.f31358n0 = im0Var2;
        im0Var2.setItemAnimator(ho0Var);
        im0Var2.setPivotY(0.0f);
        im0Var2.setClipToPadding(false);
        im0Var2.setVerticalScrollBarEnabled(true);
        im0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        im0Var2.setVerticalScrollbarPosition(i15);
        s4.b0 b0Var3 = new s4.b0(1, false);
        this.m0 = b0Var3;
        im0Var2.setLayoutManager(b0Var3);
        im0Var2.W1 = true;
        im0Var2.X1 = 0;
        b10 b10Var3 = new b10(context, null);
        b10Var3.setViewType(1);
        io0 io0Var3 = new io0(nxVar, context, b10Var3, 0);
        this.f31357l0 = io0Var3;
        io0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        io0Var3.e.setVisibility(8);
        io0Var3.setVisibility(8);
        io0Var3.addView(b10Var3, 0);
        io0Var3.e(true, false);
        frameLayout3.addView(io0Var3);
        frameLayout3.addView(im0Var2);
        im0Var2.setEmptyView(io0Var3);
        jo0 jo0Var = new jo0(nxVar, im0Var2, context, this.H0, i12);
        this.f31359o0 = jo0Var;
        im0Var2.setAdapter(jo0Var);
        im0Var2.setOnScrollListener(new ko0(nxVar, eyVar, 0));
        im0Var2.C0(new rc0(nxVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f31362r0 = frameLayout4;
        lo0 lo0Var = new lo0(nxVar);
        lo0Var.f45992m = false;
        lo0Var.C = false;
        lo0Var.o(bsVar);
        lo0Var.n(350L);
        im0 im0Var3 = new im0(context, null);
        this.f31365u0 = im0Var3;
        im0Var3.setItemAnimator(lo0Var);
        im0Var3.setPivotY(0.0f);
        im0Var3.setVerticalScrollBarEnabled(true);
        im0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        im0Var3.setVerticalScrollbarPosition(i16);
        s4.b0 b0Var4 = new s4.b0(1, false);
        this.f31364t0 = b0Var4;
        im0Var3.setLayoutManager(b0Var4);
        im0Var3.W1 = true;
        im0Var3.X1 = 0;
        im0Var3.setClipToPadding(false);
        b10 b10Var4 = new b10(context, null);
        b10Var4.setViewType(1);
        io0 io0Var4 = new io0(nxVar, context, b10Var4, 1);
        this.f31363s0 = io0Var4;
        io0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        io0Var4.e.setVisibility(8);
        io0Var4.setVisibility(8);
        io0Var4.addView(b10Var4, 0);
        io0Var4.e(true, false);
        frameLayout4.addView(io0Var4);
        frameLayout4.addView(im0Var3);
        im0Var3.setEmptyView(io0Var4);
        mo0 mo0Var = new mo0(nxVar, im0Var3, context, this.H0);
        this.f31366v0 = mo0Var;
        im0Var3.setAdapter(mo0Var);
        im0Var3.setOnScrollListener(new ko0(nxVar, eyVar, 1));
        im0Var3.C0(new rc0(nxVar, 23));
        this.f31349d0 = new nl0(u1Var, true);
        th0 th0Var = new th0(context, eyVar);
        this.f31360p0 = th0Var;
        a71 a71Var = th0Var.f30556c;
        a71Var.setClipToPadding(false);
        a71Var.j(new no0(nxVar, 0));
        a71Var.C0(new rc0(nxVar, 23));
        uo0 uo0Var = new uo0(nxVar);
        this.T = uo0Var;
        setAdapter(uo0Var);
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

    public static void P(FrameLayout frameLayout, im0 im0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            im0Var.o1(0, i10, 0, i11);
        } else {
            im0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) im0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f31361q0) {
            int i10 = 0;
            this.f31361q0 = false;
            R();
            s81 s81Var = this.M;
            if (s81Var != null && s81Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            oo0 oo0Var = this.f31347b0;
            if (oo0Var != null) {
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
                oo0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            uo0 uo0Var = this.T;
            ArrayList arrayList = uo0Var.f31068a;
            ArrayList arrayList2 = uo0Var.f31068a;
            if (i11 < arrayList.size()) {
                if (((to0) arrayList2.get(i11)).f30695a == 3 && ((to0) arrayList2.get(i11)).f30696b == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void M(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ai.u1 u1Var = this.V;
            if (i10 >= u1Var.getChildCount()) {
                break;
            }
            View childAt = u1Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.h6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.k4)) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20993d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.g10) {
                arrayList.addAll(((org.telegram.ui.g10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.g10) {
                arrayList.addAll(((org.telegram.ui.g10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.g10 g10Var = this.M0;
        if (g10Var != null) {
            arrayList.addAll(g10Var.getThemeDescriptions());
        }
        io0 io0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.j6(io0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(io0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21381y6));
        arrayList.addAll(w7.c6.a(new z6(this, 7), org.telegram.ui.ActionBar.h6.f21383y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f31370z0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i10, String str, boolean z10) {
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.g10 g10Var;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        io0 io0Var = this.W;
        if (isEmpty) {
            io0Var.e.setVisibility(8);
        } else {
            io0Var.e.setVisibility(0);
            io0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        oo0 oo0Var = this.f31347b0;
        org.telegram.ui.px pxVar = oo0Var.U;
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
                TLObject tLObject = o0Var.f12007f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f20426id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j12 = -((TLRPC.Chat) o0Var.f12007f).f20279id;
                }
                j11 = j12;
            } else if (i12 == 6) {
                hg.m0 m0Var = o0Var.f12008g;
                long j15 = m0Var.f11981b;
                j14 = m0Var.f11982c;
                j13 = j15;
            } else if (i12 == 7) {
                z20 = true;
            }
            i11++;
        }
        mo0 mo0Var = this.f31366v0;
        mo0Var.getClass();
        if (n40.X(str, null) == null) {
            J();
        }
        if (view == this.f31351f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            qo0 qo0Var = this.f31355j0;
            im0 im0Var = qo0Var.d;
            ArrayList arrayList2 = qo0Var.Q;
            ArrayList arrayList3 = qo0Var.R;
            ArrayList arrayList4 = qo0Var.S;
            ArrayList arrayList5 = qo0Var.P;
            hq hqVar = qo0Var.f25373c0;
            qo0Var.W();
            if (!TextUtils.equals(str, qo0Var.f25372b0)) {
                qo0Var.f25372b0 = str;
                AndroidUtilities.cancelRunOnUIThread(hqVar);
                if (TextUtils.isEmpty(qo0Var.f25372b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    qo0Var.N(true);
                    qo0Var.f25371a0++;
                    z19 = false;
                    qo0Var.W = false;
                    qo0Var.X = false;
                    qo0Var.Y = false;
                    qo0Var.Z = 0;
                    if (im0Var != null) {
                        im0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(hqVar, 1000L);
                    qo0Var.W = true;
                    qo0Var.X = true;
                    qo0Var.N(true);
                    if (im0Var != null) {
                        z19 = false;
                        im0Var.u0(0);
                    }
                }
                this.f31352g0.b(this.N0, z19);
            }
            z19 = false;
            this.f31352g0.b(this.N0, z19);
        } else if (view == this.f31356k0) {
            jo0 jo0Var = this.f31359o0;
            im0 im0Var2 = jo0Var.d;
            ArrayList arrayList6 = jo0Var.T;
            ws wsVar = jo0Var.f24720f0;
            if (TextUtils.equals(str, jo0Var.f24719e0)) {
                z18 = false;
            } else {
                jo0Var.f24719e0 = str;
                AndroidUtilities.cancelRunOnUIThread(wsVar);
                if (TextUtils.isEmpty(jo0Var.f24719e0)) {
                    arrayList6.clear();
                    jo0Var.N(true);
                    jo0Var.f24718d0++;
                    z18 = false;
                    jo0Var.Z = false;
                    jo0Var.f24715a0 = false;
                    jo0Var.f24716b0 = false;
                    jo0Var.f24717c0 = 0;
                    if (im0Var2 != null) {
                        im0Var2.u0(0);
                    }
                } else {
                    z18 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(wsVar, 1000L);
                    jo0Var.Z = true;
                    jo0Var.f24715a0 = true;
                    jo0Var.N(true);
                    if (im0Var2 != null) {
                        im0Var2.u0(0);
                    }
                }
            }
            this.f31357l0.b(this.N0, z18);
            if (TextUtils.isEmpty(str)) {
                jo0Var.V();
            }
        } else {
            th0 th0Var = this.f31360p0;
            if (view == th0Var) {
                a71 a71Var = th0Var.f30556c;
                ArrayList arrayList7 = th0Var.f30558n;
                if (!TextUtils.equals(th0Var.f30561w, str)) {
                    if (th0Var.K >= 0) {
                        ConnectionsManager.getInstance(th0Var.f30555b).cancelRequest(th0Var.K, true);
                        th0Var.K = -1;
                    }
                    th0Var.v = false;
                    th0Var.H.setLoading(false);
                    th0Var.f30561w = str;
                    if (TextUtils.isEmpty(str)) {
                        th0Var.f30559r = 0;
                        z17 = true;
                        th0Var.L++;
                        th0Var.f30560s = false;
                        arrayList7.clear();
                        th0Var.a(false);
                    } else {
                        z17 = true;
                        th0Var.b(str);
                        th0Var.f30559r = 0;
                        th0Var.L++;
                        th0Var.f30560s = false;
                        arrayList7.clear();
                    }
                    th0Var.d();
                    a71Var.u0(0);
                    a71Var.W2.N(z17);
                }
            } else if (view == this.f31362r0) {
                if (n40.X(str, null) != null) {
                    if (z10) {
                        this.f31364t0.h1(0, 0);
                    }
                    mo0Var.Y(str);
                    this.f31363s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                org.telegram.ui.g10 g10Var2 = this.M0;
                if ((i13 == 0 && this.T0 == 0 && j13 == 0 && j14 == 0) || j10 != 0) {
                    this.I0 = false;
                    oo0Var.U(z20 ? 1 : 0, str);
                    oo0Var.A0 = this.L0;
                    g10Var2.animate().setListener(null).cancel();
                    g10Var2.i(null, false);
                    if (z10) {
                        if (oo0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        io0Var.e(!z15, false);
                        if (oo0Var.D0 > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        io0Var.e(z16, false);
                    } else if (!oo0Var.N()) {
                        if (oo0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        io0Var.e(z14, true);
                    }
                    if (z10) {
                        g10Var2.setVisibility(8);
                    } else if (g10Var2.getVisibility() != 8) {
                        g10Var2.animate().alpha(0.0f).setListener(new c80(this, 16)).setDuration(150L).start();
                    }
                    g10Var2.setTag(null);
                    g10Var = g10Var2;
                    z13 = false;
                } else {
                    boolean z21 = true;
                    g10Var2.setTag(1);
                    g10Var2.i(this.L0, false);
                    g10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        g10Var2.setVisibility(0);
                        g10Var2.setAlpha(1.0f);
                        z12 = z10;
                    } else {
                        if (g10Var2.getVisibility() != 0) {
                            g10Var2.setVisibility(0);
                            g10Var2.setAlpha(0.0f);
                        } else {
                            z21 = z10;
                        }
                        g10Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z12 = z21;
                    }
                    z13 = false;
                    long j16 = j11;
                    g10Var = g10Var2;
                    this.M0.h(j16, this.T0, j13, j14, null, z20, str, z12);
                    io0Var.setVisibility(8);
                }
                io0Var.b(this.N0, z13);
                g10Var.f37055c.b(this.N0, z13);
            } else {
                long j17 = j10;
                long j18 = j13;
                long j19 = j14;
                if (view instanceof org.telegram.ui.g10) {
                    org.telegram.ui.g10 g10Var3 = (org.telegram.ui.g10) view;
                    if (j17 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g10Var3.setUseFromUserAsAvatar(z11);
                    g10Var3.f37055c.b(this.N0, false);
                    g10Var3.h(j11, this.T0, j18, j19, hg.q0.f12018a3[((to0) this.T.f31068a.get(i10)).f30696b], z20, str, z10);
                } else if (view instanceof tn0) {
                    tn0 tn0Var = (tn0) view;
                    tn0Var.f30675a.b(this.N0, false);
                    tn0Var.K = str;
                    tn0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        hm0 hm0Var;
        hm0 hm0Var2;
        hm0 hm0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.px pxVar;
        int i12;
        if (this.f31369y0 != z10) {
            org.telegram.ui.ey eyVar = this.J0;
            if (!z10 || !eyVar.getActionBar().s()) {
                int i13 = 72;
                if (z10 && !eyVar.getActionBar().a("search_view_pager")) {
                    this.F0 = eyVar.getActionBar().j("search_view_pager");
                    if (eyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f31367w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f31367w0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                        this.f31367w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21383y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f31367w0.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21400z8, false), 1, -1));
                        this.f31367w0.setOnClickListener(new u80(this, 13));
                        this.F0.addView(this.f31367w0, w7.z5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
                    this.f31368x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f31368x0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f31368x0;
                    int i14 = org.telegram.ui.ActionBar.h6.f21383y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.y yVar = this.F0;
                    NumberTextView numberTextView3 = this.f31368x0;
                    if (eyVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(numberTextView3, w7.z5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f31368x0.setOnTouchListener(new di.d(21));
                    org.telegram.ui.ActionBar.u0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f31368x0 != null) {
                    oo0 oo0Var = this.f31347b0;
                    if (oo0Var != null && (pxVar = oo0Var.U) != null && pxVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31368x0.getLayoutParams();
                    if (eyVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f31368x0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (eyVar.getActionBar().getBackButton() != null && (eyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
                    org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
                    eyVar.getActionBar().setBackButtonDrawable(g2Var);
                    g2Var.setColorFilter(null);
                }
                this.f31369y0 = z10;
                HashMap hashMap = this.f31370z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(eyVar.getParentActivity().getCurrentFocus());
                    eyVar.getActionBar().O(null, null);
                    this.f31368x0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.u0 u0Var = this.B0;
                    if (N()) {
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
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.g10) && (hm0Var3 = ((org.telegram.ui.g10) getChildAt(i15)).d) != null) {
                        hm0Var3.l();
                    }
                    if (getChildAt(i15) instanceof tn0) {
                        ((tn0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.g10 g10Var = this.M0;
                if (g10Var != null && (hm0Var2 = g10Var.d) != null) {
                    hm0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.g10) && (hm0Var = ((org.telegram.ui.g10) view).d) != null) {
                        hm0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        s81 s81Var = this.M;
        if (s81Var != null) {
            s81Var.f24877x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final boolean b(org.telegram.ui.y00 y00Var) {
        return this.f31370z0.containsKey(y00Var);
    }

    @Override
    public final void c(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        Q(false);
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.y00 y00Var = new org.telegram.ui.y00(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f31370z0;
        if (hashMap.containsKey(y00Var)) {
            hashMap.remove(y00Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(y00Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.f31368x0.a(hashMap.size(), true);
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
                boolean N = N();
                if (N) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (this.B0.getVisibility() != i11) {
                    this.B0.setVisibility(i11);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.B0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21383y8, false), PorterDuff.Mode.SRC_IN));
                    if (N) {
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
                        if (!((MessageObject) hashMap.get((org.telegram.ui.y00) it.next())).isDownloadingFile) {
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
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(hashMap.containsKey(y00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).b(i10, hashMap.containsKey(y00Var));
        } else if (view instanceof org.telegram.ui.Cells.m7) {
            ((org.telegram.ui.Cells.m7) view).f(hashMap.containsKey(y00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).e(hashMap.containsKey(y00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(y00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(hashMap.containsKey(y00Var), true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z10 = false;
        qo0 qo0Var = this.f31355j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f31352g0.e(z10, true);
            qo0Var.W();
            qo0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f31359o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                mo0 mo0Var = this.f31366v0;
                if (obj == mo0Var.Q) {
                    mo0Var.N(true);
                }
            }
        } else {
            qo0Var.W();
            qo0Var.N(true);
        }
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f4357a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.U;
                im0 im0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        im0Var = this.V;
                    } else if (view == this.f31351f0) {
                        im0Var = this.f31354i0;
                    } else if (view == this.f31356k0) {
                        im0Var = this.f31358n0;
                    } else if (view == this.f31362r0) {
                        im0Var = this.f31365u0;
                    } else {
                        tn0 tn0Var = this.G0;
                        if (view == tn0Var) {
                            im0Var = tn0Var.f30676b;
                        } else {
                            th0 th0Var = this.f31360p0;
                            if (view == th0Var) {
                                im0Var = th0Var.f30556c;
                            } else if (view instanceof org.telegram.ui.g10) {
                                im0Var = ((org.telegram.ui.g10) view).f37053b;
                            }
                        }
                    }
                }
                if (im0Var != null) {
                    hh.d.a(im0Var, canvas, rectF, im0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.g10 g10Var = this.M0;
                    if (g10Var.getVisibility() == 0) {
                        ai.u1 u1Var = g10Var.f37053b;
                        hh.d.a(u1Var, canvas, rectF, u1Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f31369y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<hg.o0> getCurrentSearchFilters() {
        return this.A0;
    }

    public tn0 getDownloadsContainer() {
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

    public b91 getTabsView() {
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
        this.f31350e0 = true;
        qo0 qo0Var = this.f31355j0;
        if (qo0Var != null) {
            qo0Var.N(false);
        }
        jo0 jo0Var = this.f31359o0;
        if (jo0Var != null) {
            jo0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31350e0 = false;
        NotificationCenter.ObserversGroup observersGroup = this.W0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.W0 = null;
        }
    }

    @Override
    public final void s() {
        this.Q0.M();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        this.X0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.x00 x00Var) {
        this.L0 = x00Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.g10) {
                ((org.telegram.ui.g10) getChildAt(i11)).f37055c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f37055c.b(i10, z10);
            } else if (getChildAt(i11) instanceof tn0) {
                ((tn0) getChildAt(i11)).f30675a.b(i10, z10);
            } else if (getChildAt(i11) == this.f31351f0) {
                this.f31352g0.b(i10, z10);
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
        s81 s81Var = this.M;
        if (s81Var != null) {
            s81Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        oo0 oo0Var = this.f31347b0;
        org.telegram.ui.g10 g10Var = this.M0;
        if (i10 == 0) {
            if (g10Var.getVisibility() == 0) {
                g10Var.i(this.L0, false);
                oo0Var.A0 = null;
            } else {
                g10Var.i(null, false);
                org.telegram.ui.x00 x00Var = this.L0;
                oo0Var.A0 = x00Var;
                if (x00Var != null) {
                    ((org.telegram.ui.jv) x00Var).i(false, null, oo0Var.f11906y0, oo0Var.f11907z0);
                }
            }
        } else if (view instanceof org.telegram.ui.g10) {
            if (i11 == 0 && g10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.g10) view).i(this.L0, z10);
        }
        if (view2 instanceof org.telegram.ui.g10) {
            ((org.telegram.ui.g10) view2).i(null, false);
            return;
        }
        oo0Var.A0 = null;
        g10Var.i(null, false);
    }
}
