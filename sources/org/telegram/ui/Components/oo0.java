package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
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
public abstract class oo0 extends y81 implements org.telegram.ui.s10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public ln0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.qy J0;
    public String K0;
    public org.telegram.ui.k10 L0;
    public final org.telegram.ui.t10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.vx P0;
    public final dw0 Q0;
    public final int R0;
    public int S0;
    public final no0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.w0 V;
    public int V0;
    public final bo0 W;
    public NotificationCenter.ObserversGroup W0;
    public ah.c X0;
    public final s4.j f27135a0;
    public final ho0 f27136b0;
    public final s4.c0 f27137c0;
    public final el0 f27138d0;
    public boolean f27139e0;
    public final FrameLayout f27140f0;
    public final bo0 f27141g0;
    public final s4.c0 f27142h0;
    public final zl0 f27143i0;
    public final jo0 f27144j0;
    public final FrameLayout f27145k0;
    public final bo0 f27146l0;
    public final s4.c0 m0;
    public final zl0 f27147n0;
    public final co0 f27148o0;
    public final mh0 f27149p0;
    public boolean f27150q0;
    public final FrameLayout f27151r0;
    public final bo0 f27152s0;
    public final s4.c0 f27153t0;
    public final zl0 f27154u0;
    public final fo0 f27155v0;
    public ImageView f27156w0;
    public NumberTextView f27157x0;
    public boolean f27158y0;
    public final HashMap f27159z0;

    public oo0(Context context, org.telegram.ui.qy qyVar, int i10, int i11, int i12, long j3, org.telegram.ui.vx vxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f27150q0 = false;
        this.f27159z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = qyVar;
        this.P0 = vxVar;
        s4.j jVar = new s4.j();
        this.f27135a0 = jVar;
        jVar.f43149c = 150L;
        jVar.e = 350L;
        jVar.f43150f = 0L;
        jVar.f43151g = 0L;
        jVar.d = 0L;
        jVar.f43152i = new OvershootInterpolator(1.1f);
        jVar.f43125o = tr.h;
        org.telegram.ui.zx zxVar = (org.telegram.ui.zx) this;
        this.f27136b0 = new ho0(zxVar, context, qyVar, i10, i11, jVar, qyVar.F, qyVar, context);
        if (i11 == 15) {
            ArrayList R3 = qyVar.R3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < R3.size(); i18 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) R3.get(i18)).f18356id, arrayList, i18, 1)) {
            }
            this.f27136b0.f9773q0 = arrayList;
        }
        this.Q0 = (dw0) qyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(zxVar, context, 21);
        this.V = w0Var;
        w0Var.setItemAnimator(this.f27135a0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.f27136b0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        w0Var.setVerticalScrollbarPosition(i13);
        s4.c0 c0Var = new s4.c0(1, false);
        this.f27137c0 = c0Var;
        w0Var.setLayoutManager(c0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
        w0Var.setOnScrollListener(new do0(zxVar, qyVar, 2));
        w0Var.D0(new lc0(zxVar, 24));
        org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(this.J0);
        this.M0 = t10Var;
        ai.w0 w0Var2 = t10Var.f38029b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new go0(zxVar, 1));
        w0Var2.D0(new lc0(zxVar, 24));
        t10Var.setUiCallback(this);
        t10Var.setVisibility(8);
        t10Var.setChatPreviewDelegate(vxVar);
        w00 w00Var = new w00(context, null);
        w00Var.setViewType(1);
        bo0 bo0Var = new bo0(zxVar, context, w00Var, 2);
        this.W = bo0Var;
        bo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        bo0Var.e.setVisibility(8);
        bo0Var.setVisibility(8);
        bo0Var.addView(w00Var, 0);
        bo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(bo0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(t10Var);
        w0Var.setEmptyView(bo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f27140f0 = frameLayout2;
        io0 io0Var = new io0(zxVar);
        io0Var.f43103m = false;
        io0Var.C = false;
        tr trVar = tr.h;
        io0Var.o(trVar);
        io0Var.n(350L);
        zl0 zl0Var = new zl0(context, null);
        this.f27143i0 = zl0Var;
        zl0Var.setItemAnimator(io0Var);
        zl0Var.setPivotY(0.0f);
        zl0Var.setVerticalScrollBarEnabled(true);
        zl0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        zl0Var.setVerticalScrollbarPosition(i14);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.f27142h0 = c0Var2;
        zl0Var.setLayoutManager(c0Var2);
        zl0Var.Y1 = true;
        zl0Var.Z1 = 0;
        zl0Var.setClipToPadding(false);
        w00 w00Var2 = new w00(context, null);
        w00Var2.setViewType(1);
        bo0 bo0Var2 = new bo0(zxVar, context, w00Var2, 3);
        this.f27141g0 = bo0Var2;
        bo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        bo0Var2.e.setVisibility(8);
        bo0Var2.setVisibility(8);
        bo0Var2.addView(w00Var2, 0);
        bo0Var2.e(true, false);
        frameLayout2.addView(bo0Var2);
        frameLayout2.addView(zl0Var);
        zl0Var.setEmptyView(bo0Var2);
        jo0 jo0Var = new jo0(zxVar, zl0Var, context, this.H0, i12, qyVar);
        this.f27144j0 = jo0Var;
        zl0Var.setAdapter(jo0Var);
        zl0Var.setOnScrollListener(new do0(zxVar, qyVar, 3));
        zl0Var.D0(new lc0(zxVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f27145k0 = frameLayout3;
        ao0 ao0Var = new ao0(zxVar);
        ao0Var.f43103m = false;
        ao0Var.C = false;
        ao0Var.o(trVar);
        ao0Var.n(350L);
        zl0 zl0Var2 = new zl0(context, null);
        this.f27147n0 = zl0Var2;
        zl0Var2.setItemAnimator(ao0Var);
        zl0Var2.setPivotY(0.0f);
        zl0Var2.setClipToPadding(false);
        zl0Var2.setVerticalScrollBarEnabled(true);
        zl0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        zl0Var2.setVerticalScrollbarPosition(i15);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.m0 = c0Var3;
        zl0Var2.setLayoutManager(c0Var3);
        zl0Var2.Y1 = true;
        zl0Var2.Z1 = 0;
        w00 w00Var3 = new w00(context, null);
        w00Var3.setViewType(1);
        bo0 bo0Var3 = new bo0(zxVar, context, w00Var3, 0);
        this.f27146l0 = bo0Var3;
        bo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        bo0Var3.e.setVisibility(8);
        bo0Var3.setVisibility(8);
        bo0Var3.addView(w00Var3, 0);
        bo0Var3.e(true, false);
        frameLayout3.addView(bo0Var3);
        frameLayout3.addView(zl0Var2);
        zl0Var2.setEmptyView(bo0Var3);
        co0 co0Var = new co0(zxVar, zl0Var2, context, this.H0, i12);
        this.f27148o0 = co0Var;
        zl0Var2.setAdapter(co0Var);
        zl0Var2.setOnScrollListener(new do0(zxVar, qyVar, 0));
        zl0Var2.D0(new lc0(zxVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f27151r0 = frameLayout4;
        eo0 eo0Var = new eo0(zxVar);
        eo0Var.f43103m = false;
        eo0Var.C = false;
        eo0Var.o(trVar);
        eo0Var.n(350L);
        zl0 zl0Var3 = new zl0(context, null);
        this.f27154u0 = zl0Var3;
        zl0Var3.setItemAnimator(eo0Var);
        zl0Var3.setPivotY(0.0f);
        zl0Var3.setVerticalScrollBarEnabled(true);
        zl0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        zl0Var3.setVerticalScrollbarPosition(i16);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.f27153t0 = c0Var4;
        zl0Var3.setLayoutManager(c0Var4);
        zl0Var3.Y1 = true;
        zl0Var3.Z1 = 0;
        zl0Var3.setClipToPadding(false);
        w00 w00Var4 = new w00(context, null);
        w00Var4.setViewType(1);
        bo0 bo0Var4 = new bo0(zxVar, context, w00Var4, 1);
        this.f27152s0 = bo0Var4;
        bo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        bo0Var4.e.setVisibility(8);
        bo0Var4.setVisibility(8);
        bo0Var4.addView(w00Var4, 0);
        bo0Var4.e(true, false);
        frameLayout4.addView(bo0Var4);
        frameLayout4.addView(zl0Var3);
        zl0Var3.setEmptyView(bo0Var4);
        fo0 fo0Var = new fo0(zxVar, zl0Var3, context, this.H0);
        this.f27155v0 = fo0Var;
        zl0Var3.setAdapter(fo0Var);
        zl0Var3.setOnScrollListener(new do0(zxVar, qyVar, 1));
        zl0Var3.D0(new lc0(zxVar, 24));
        this.f27138d0 = new el0(w0Var, true);
        mh0 mh0Var = new mh0(context, qyVar);
        this.f27149p0 = mh0Var;
        u61 u61Var = mh0Var.f26291c;
        u61Var.setClipToPadding(false);
        u61Var.j(new go0(zxVar, 0));
        u61Var.D0(new lc0(zxVar, 24));
        no0 no0Var = new no0(zxVar);
        this.T = no0Var;
        setAdapter(no0Var);
    }

    public static org.telegram.ui.wn K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.wn(bundle);
    }

    public static void P(FrameLayout frameLayout, zl0 zl0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            zl0Var.r1(0, i10, 0, i11);
        } else {
            zl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f27150q0) {
            int i10 = 0;
            this.f27150q0 = false;
            R();
            n81 n81Var = this.M;
            if (n81Var != null && n81Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            ho0 ho0Var = this.f27136b0;
            if (ho0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((gg.q0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                ho0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            no0 no0Var = this.T;
            ArrayList arrayList = no0Var.f26760a;
            ArrayList arrayList2 = no0Var.f26760a;
            if (i11 < arrayList.size()) {
                if (((mo0) arrayList2.get(i11)).f26344a == 3 && ((mo0) arrayList2.get(i11)).f26345b == i10) {
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
            ai.w0 w0Var = this.V;
            if (i10 >= w0Var.getChildCount()) {
                break;
            }
            View childAt = w0Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.i6) || (childAt instanceof org.telegram.ui.Cells.s2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19076d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.t10) {
                arrayList.addAll(((org.telegram.ui.t10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.t10) {
                arrayList.addAll(((org.telegram.ui.t10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.t10 t10Var = this.M0;
        if (t10Var != null) {
            arrayList.addAll(t10Var.getThemeDescriptions());
        }
        bo0 bo0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.j6(bo0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(bo0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19459y6));
        arrayList.addAll(w7.b6.a(new y6(this, 7), org.telegram.ui.ActionBar.h6.f19461y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f27159z0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i10, String str, boolean z10) {
        long j3;
        long j10;
        boolean z11;
        org.telegram.ui.t10 t10Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        bo0 bo0Var = this.W;
        if (isEmpty) {
            bo0Var.e.setVisibility(8);
        } else {
            bo0Var.e.setVisibility(0);
            bo0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        ho0 ho0Var = this.f27136b0;
        org.telegram.ui.cy cyVar = ho0Var.U;
        if (cyVar != null) {
            j3 = cyVar.a();
        } else {
            j3 = 0;
        }
        if (i10 == 0) {
            j10 = 0;
        } else {
            j10 = j3;
        }
        long j12 = 0;
        long j13 = 0;
        int i11 = 0;
        boolean z19 = false;
        while (true) {
            ArrayList arrayList = this.A0;
            if (i11 >= arrayList.size()) {
                break;
            }
            gg.q0 q0Var = (gg.q0) arrayList.get(i11);
            int i12 = q0Var.d;
            if (i12 == 4) {
                TLObject tLObject = q0Var.f9893f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f18499id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j11 = -((TLRPC.Chat) q0Var.f9893f).f18352id;
                }
                j10 = j11;
            } else if (i12 == 6) {
                gg.o0 o0Var = q0Var.f9894g;
                long j14 = o0Var.f9868b;
                j13 = o0Var.f9869c;
                j12 = j14;
            } else if (i12 == 7) {
                z19 = true;
            }
            i11++;
        }
        fo0 fo0Var = this.f27155v0;
        fo0Var.getClass();
        if (i40.X(str, null) == null) {
            J();
        }
        if (view == this.f27140f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            jo0 jo0Var = this.f27144j0;
            zl0 zl0Var = jo0Var.d;
            ArrayList arrayList2 = jo0Var.Q;
            ArrayList arrayList3 = jo0Var.R;
            ArrayList arrayList4 = jo0Var.S;
            ArrayList arrayList5 = jo0Var.P;
            aq aqVar = jo0Var.f30052c0;
            jo0Var.W();
            if (!TextUtils.equals(str, jo0Var.f30051b0)) {
                jo0Var.f30051b0 = str;
                AndroidUtilities.cancelRunOnUIThread(aqVar);
                if (TextUtils.isEmpty(jo0Var.f30051b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    jo0Var.N(true);
                    jo0Var.f30050a0++;
                    z18 = false;
                    jo0Var.W = false;
                    jo0Var.X = false;
                    jo0Var.Y = false;
                    jo0Var.Z = 0;
                    if (zl0Var != null) {
                        zl0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(aqVar, 1000L);
                    jo0Var.W = true;
                    jo0Var.X = true;
                    jo0Var.N(true);
                    if (zl0Var != null) {
                        z18 = false;
                        zl0Var.v0(0);
                    }
                }
                this.f27141g0.b(this.N0, z18);
            }
            z18 = false;
            this.f27141g0.b(this.N0, z18);
        } else if (view == this.f27145k0) {
            co0 co0Var = this.f27148o0;
            zl0 zl0Var2 = co0Var.d;
            ArrayList arrayList6 = co0Var.T;
            ps psVar = co0Var.f28922f0;
            if (TextUtils.equals(str, co0Var.f28921e0)) {
                z17 = false;
            } else {
                co0Var.f28921e0 = str;
                AndroidUtilities.cancelRunOnUIThread(psVar);
                if (TextUtils.isEmpty(co0Var.f28921e0)) {
                    arrayList6.clear();
                    co0Var.N(true);
                    co0Var.f28920d0++;
                    z17 = false;
                    co0Var.Z = false;
                    co0Var.f28917a0 = false;
                    co0Var.f28918b0 = false;
                    co0Var.f28919c0 = 0;
                    if (zl0Var2 != null) {
                        zl0Var2.v0(0);
                    }
                } else {
                    z17 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(psVar, 1000L);
                    co0Var.Z = true;
                    co0Var.f28917a0 = true;
                    co0Var.N(true);
                    if (zl0Var2 != null) {
                        zl0Var2.v0(0);
                    }
                }
            }
            this.f27146l0.b(this.N0, z17);
            if (TextUtils.isEmpty(str)) {
                co0Var.V();
            }
        } else {
            mh0 mh0Var = this.f27149p0;
            if (view == mh0Var) {
                u61 u61Var = mh0Var.f26291c;
                ArrayList arrayList7 = mh0Var.f26293n;
                if (!TextUtils.equals(mh0Var.f26296w, str)) {
                    if (mh0Var.K >= 0) {
                        ConnectionsManager.getInstance(mh0Var.f26290b).cancelRequest(mh0Var.K, true);
                        mh0Var.K = -1;
                    }
                    mh0Var.v = false;
                    mh0Var.H.setLoading(false);
                    mh0Var.f26296w = str;
                    if (TextUtils.isEmpty(str)) {
                        mh0Var.f26294r = 0;
                        z16 = true;
                        mh0Var.L++;
                        mh0Var.f26295s = false;
                        arrayList7.clear();
                        mh0Var.a(false);
                    } else {
                        z16 = true;
                        mh0Var.b(str);
                        mh0Var.f26294r = 0;
                        mh0Var.L++;
                        mh0Var.f26295s = false;
                        arrayList7.clear();
                    }
                    mh0Var.d();
                    u61Var.v0(0);
                    u61Var.f28778f3.N(z16);
                }
            } else if (view == this.f27151r0) {
                if (i40.X(str, null) != null) {
                    if (z10) {
                        this.f27153t0.h1(0, 0);
                    }
                    fo0Var.Y(str);
                    this.f27152s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                org.telegram.ui.t10 t10Var2 = this.M0;
                if ((j10 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) || j3 != 0) {
                    this.I0 = false;
                    ho0Var.U(z19 ? 1 : 0, str);
                    ho0Var.A0 = this.L0;
                    t10Var2.animate().setListener(null).cancel();
                    t10Var2.i(null, false);
                    if (z10) {
                        if (ho0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        bo0Var.e(!z14, false);
                        if (ho0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        bo0Var.e(z15, false);
                    } else if (!ho0Var.N()) {
                        if (ho0Var.D0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        bo0Var.e(z13, true);
                    }
                    if (z10) {
                        t10Var2.setVisibility(8);
                    } else if (t10Var2.getVisibility() != 8) {
                        t10Var2.animate().alpha(0.0f).setListener(new id0(this, 11)).setDuration(150L).start();
                    }
                    t10Var2.setTag(null);
                    t10Var = t10Var2;
                    z12 = false;
                } else {
                    boolean z20 = true;
                    t10Var2.setTag(1);
                    t10Var2.i(this.L0, false);
                    t10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        t10Var2.setVisibility(0);
                        t10Var2.setAlpha(1.0f);
                        z20 = z10;
                    } else {
                        if (t10Var2.getVisibility() != 0) {
                            t10Var2.setVisibility(0);
                            t10Var2.setAlpha(0.0f);
                        } else {
                            z20 = z10;
                        }
                        t10Var2.animate().alpha(1.0f).setDuration(150L).start();
                    }
                    t10Var = t10Var2;
                    z12 = false;
                    this.M0.h(j10, this.T0, j12, j13, null, z19, str, z20);
                    bo0Var.setVisibility(8);
                }
                bo0Var.b(this.N0, z12);
                t10Var.f38031c.b(this.N0, z12);
            } else {
                long j15 = j3;
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.t10) {
                    org.telegram.ui.t10 t10Var3 = (org.telegram.ui.t10) view;
                    if (j15 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t10Var3.setUseFromUserAsAvatar(z11);
                    t10Var3.f38031c.b(this.N0, false);
                    t10Var3.h(j10, this.T0, j16, j17, gg.s0.j3[((mo0) this.T.f26760a.get(i10)).f26345b], z19, str, z10);
                } else if (view instanceof ln0) {
                    ln0 ln0Var = (ln0) view;
                    ln0Var.f26059a.b(this.N0, false);
                    ln0Var.K = str;
                    ln0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        yl0 yl0Var;
        yl0 yl0Var2;
        yl0 yl0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.cy cyVar;
        int i12;
        if (this.f27158y0 != z10) {
            org.telegram.ui.qy qyVar = this.J0;
            if (!z10 || !qyVar.getActionBar().s()) {
                int i13 = 72;
                if (z10 && !qyVar.getActionBar().a("search_view_pager")) {
                    this.F0 = qyVar.getActionBar().j("search_view_pager");
                    if (qyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f27156w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f27156w0.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
                        this.f27156w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19461y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f27156w0.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19480z8, false), 1, -1));
                        this.f27156w0.setOnClickListener(new l80(this, 14));
                        this.F0.addView(this.f27156w0, w7.y5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
                    this.f27157x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f27157x0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f27157x0;
                    int i14 = org.telegram.ui.ActionBar.h6.f19461y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                    org.telegram.ui.ActionBar.y yVar = this.F0;
                    NumberTextView numberTextView3 = this.f27157x0;
                    if (qyVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(numberTextView3, w7.y5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f27157x0.setOnTouchListener(new bi.d(21));
                    org.telegram.ui.ActionBar.u0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f27157x0 != null) {
                    ho0 ho0Var = this.f27136b0;
                    if (ho0Var != null && (cyVar = ho0Var.U) != null && cyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f27157x0.getLayoutParams();
                    if (qyVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f27157x0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (qyVar.getActionBar().getBackButton() != null && (qyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
                    qyVar.getActionBar().setBackButtonDrawable(f2Var);
                    f2Var.setColorFilter(null);
                }
                this.f27158y0 = z10;
                HashMap hashMap = this.f27159z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
                    qyVar.getActionBar().O(null, null);
                    this.f27157x0.a(hashMap.size(), false);
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
                qyVar.getActionBar().r();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.t10) && (yl0Var3 = ((org.telegram.ui.t10) getChildAt(i15)).d) != null) {
                        yl0Var3.l();
                    }
                    if (getChildAt(i15) instanceof ln0) {
                        ((ln0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.t10 t10Var = this.M0;
                if (t10Var != null && (yl0Var2 = t10Var.d) != null) {
                    yl0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.t10) && (yl0Var = ((org.telegram.ui.t10) view).d) != null) {
                        yl0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        n81 n81Var = this.M;
        if (n81Var != null) {
            n81Var.f30204x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f417a = true;
    }

    @Override
    public final boolean c(org.telegram.ui.l10 l10Var) {
        return this.f27159z0.containsKey(l10Var);
    }

    @Override
    public final void d(MessageObject messageObject) {
        this.J0.presentFragment(K(messageObject, this.H0));
        Q(false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z10 = false;
        jo0 jo0Var = this.f27144j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f27141g0.e(z10, true);
            jo0Var.W();
            jo0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f27148o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                fo0 fo0Var = this.f27155v0;
                if (obj == fo0Var.Q) {
                    fo0Var.N(true);
                }
            }
        } else {
            jo0Var.W();
            jo0Var.N(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.l10 l10Var = new org.telegram.ui.l10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f27159z0;
        if (hashMap.containsKey(l10Var)) {
            hashMap.remove(l10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(l10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.f27157x0.a(hashMap.size(), true);
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
                    int i14 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.B0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19461y8, false), PorterDuff.Mode.SRC_IN));
                    if (N) {
                        animatedVectorDrawable.start();
                    } else if (i14 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.E0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((MessageObject) hashMap.get((org.telegram.ui.l10) it.next())).isDownloadingFile) {
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
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(l10Var));
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(hashMap.containsKey(l10Var), true);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.U;
                zl0 zl0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        zl0Var = this.V;
                    } else if (view == this.f27140f0) {
                        zl0Var = this.f27143i0;
                    } else if (view == this.f27145k0) {
                        zl0Var = this.f27147n0;
                    } else if (view == this.f27151r0) {
                        zl0Var = this.f27154u0;
                    } else {
                        ln0 ln0Var = this.G0;
                        if (view == ln0Var) {
                            zl0Var = ln0Var.f26060b;
                        } else {
                            mh0 mh0Var = this.f27149p0;
                            if (view == mh0Var) {
                                zl0Var = mh0Var.f26291c;
                            } else if (view instanceof org.telegram.ui.t10) {
                                zl0Var = ((org.telegram.ui.t10) view).f38029b;
                            }
                        }
                    }
                }
                if (zl0Var != null) {
                    gh.d.a(zl0Var, canvas, rectF, zl0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.t10 t10Var = this.M0;
                    if (t10Var.getVisibility() == 0) {
                        ai.w0 w0Var = t10Var.f38029b;
                        gh.d.a(w0Var, canvas, rectF, w0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f27158y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<gg.q0> getCurrentSearchFilters() {
        return this.A0;
    }

    public ln0 getDownloadsContainer() {
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

    public x81 getTabsView() {
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
        this.f27139e0 = true;
        jo0 jo0Var = this.f27144j0;
        if (jo0Var != null) {
            jo0Var.N(false);
        }
        co0 co0Var = this.f27148o0;
        if (co0Var != null) {
            co0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27139e0 = false;
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

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        this.X0 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.k10 k10Var) {
        this.L0 = k10Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.t10) {
                ((org.telegram.ui.t10) getChildAt(i11)).f38031c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f38031c.b(i10, z10);
            } else if (getChildAt(i11) instanceof ln0) {
                ((ln0) getChildAt(i11)).f26059a.b(i10, z10);
            } else if (getChildAt(i11) == this.f27140f0) {
                this.f27141g0.b(i10, z10);
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
        n81 n81Var = this.M;
        if (n81Var != null) {
            n81Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        ho0 ho0Var = this.f27136b0;
        org.telegram.ui.t10 t10Var = this.M0;
        if (i10 == 0) {
            if (t10Var.getVisibility() == 0) {
                t10Var.i(this.L0, false);
                ho0Var.A0 = null;
            } else {
                t10Var.i(null, false);
                org.telegram.ui.k10 k10Var = this.L0;
                ho0Var.A0 = k10Var;
                if (k10Var != null) {
                    ((org.telegram.ui.sv) k10Var).i(false, null, ho0Var.f9786y0, ho0Var.f9787z0);
                }
            }
        } else if (view instanceof org.telegram.ui.t10) {
            if (i11 == 0 && t10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.t10) view).i(this.L0, z10);
        }
        if (view2 instanceof org.telegram.ui.t10) {
            ((org.telegram.ui.t10) view2).i(null, false);
            return;
        }
        ho0Var.A0 = null;
        t10Var.i(null, false);
    }
}
