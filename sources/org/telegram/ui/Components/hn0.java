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
public abstract class hn0 extends n71 implements org.telegram.ui.e10, NotificationCenter.NotificationCenterDelegate, jg.a {
    public static final int T0 = 0;
    public org.telegram.ui.ActionBar.w0 A0;
    public org.telegram.ui.ActionBar.z B0;
    public gm0 C0;
    public final int D0;
    public boolean E0;
    public final org.telegram.ui.dy F0;
    public String G0;
    public org.telegram.ui.w00 H0;
    public final org.telegram.ui.f10 I0;
    public int J0;
    public boolean K0;
    public final org.telegram.ui.ix L0;
    public final xu0 M0;
    public final int N0;
    public int O0;
    public final gn0 P;
    public final long P0;
    public final FrameLayout Q;
    public int Q0;
    public final gh.f1 R;
    public int R0;
    public final um0 S;
    public ig.a S0;
    public final f2.n T;
    public final an0 U;
    public final f2.m0 V;
    public final dk0 W;
    public boolean f29135a0;
    public final FrameLayout f29136b0;
    public final um0 f29137c0;
    public final f2.m0 f29138d0;
    public final wk0 f29139e0;
    public final cn0 f29140f0;
    public final FrameLayout f29141g0;
    public final um0 f29142h0;
    public final f2.m0 f29143i0;
    public final wk0 f29144j0;
    public final vm0 f29145k0;
    public final kg0 f29146l0;
    public boolean m0;
    public final FrameLayout f29147n0;
    public final um0 f29148o0;
    public final f2.m0 f29149p0;
    public final wk0 f29150q0;
    public final ym0 f29151r0;
    public ImageView f29152s0;
    public NumberTextView f29153t0;
    public boolean f29154u0;
    public final HashMap f29155v0;
    public final ArrayList f29156w0;
    public org.telegram.ui.ActionBar.w0 f29157x0;
    public org.telegram.ui.ActionBar.w0 f29158y0;
    public org.telegram.ui.ActionBar.w0 f29159z0;

    public hn0(Context context, org.telegram.ui.dy dyVar, int i9, int i10, int i11, long j10, org.telegram.ui.ix ixVar) {
        super(context, null);
        int i12;
        int i13;
        int i14;
        int i15;
        this.m0 = false;
        this.f29155v0 = new HashMap();
        this.f29156w0 = new ArrayList();
        int i16 = UserConfig.selectedAccount;
        this.D0 = i16;
        this.O0 = 0;
        this.N0 = i11;
        this.P0 = j10;
        this.F0 = dyVar;
        this.L0 = ixVar;
        f2.n nVar = new f2.n();
        this.T = nVar;
        nVar.f5548c = 150L;
        nVar.f5549e = 350L;
        nVar.f5550f = 0L;
        nVar.f5551g = 0L;
        nVar.d = 0L;
        nVar.f5552i = new OvershootInterpolator(1.1f);
        nVar.f5449o = gr.h;
        org.telegram.ui.mx mxVar = (org.telegram.ui.mx) this;
        this.U = new an0(mxVar, context, dyVar, i9, i10, nVar, dyVar.B, dyVar, context);
        if (i10 == 15) {
            ArrayList R3 = dyVar.R3(i16, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < R3.size(); i17 = aa.d.g(((TLRPC.Dialog) R3.get(i17)).f22384id, arrayList, i17, 1)) {
            }
            this.U.m0 = arrayList;
        }
        this.M0 = (xu0) dyVar.getFragmentView();
        gh.f1 f1Var = new gh.f1(mxVar, context, 21);
        this.R = f1Var;
        f1Var.setItemAnimator(this.T);
        f1Var.setPivotY(0.0f);
        f1Var.setClipToPadding(false);
        f1Var.setAdapter(this.U);
        f1Var.setVerticalScrollBarEnabled(true);
        f1Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        f1Var.setVerticalScrollbarPosition(i12);
        f2.m0 m0Var = new f2.m0(1, false);
        this.V = m0Var;
        f1Var.setLayoutManager(m0Var);
        f1Var.U1 = true;
        f1Var.V1 = 0;
        f1Var.setOnScrollListener(new wm0(mxVar, dyVar, 2));
        f1Var.C0(new ib0(mxVar, 23));
        org.telegram.ui.f10 f10Var = new org.telegram.ui.f10(this.F0);
        this.I0 = f10Var;
        gh.f1 f1Var2 = f10Var.f38087b;
        f1Var2.setClipToPadding(false);
        f1Var2.j(new zm0(mxVar, 1));
        f1Var2.C0(new ib0(mxVar, 23));
        f10Var.setUiCallback(this);
        f10Var.setVisibility(8);
        f10Var.setChatPreviewDelegate(ixVar);
        e00 e00Var = new e00(context, null);
        e00Var.setViewType(1);
        um0 um0Var = new um0(mxVar, context, e00Var, 2);
        this.S = um0Var;
        um0Var.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var.f28885e.setVisibility(8);
        um0Var.setVisibility(8);
        um0Var.addView(e00Var, 0);
        um0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        frameLayout.addView(um0Var);
        frameLayout.addView(f1Var);
        frameLayout.addView(f10Var);
        f1Var.setEmptyView(um0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f29136b0 = frameLayout2;
        bn0 bn0Var = new bn0(mxVar);
        bn0Var.f5532m = false;
        bn0Var.C = false;
        gr grVar = gr.h;
        bn0Var.o(grVar);
        bn0Var.n(350L);
        wk0 wk0Var = new wk0(context, null);
        this.f29139e0 = wk0Var;
        wk0Var.setItemAnimator(bn0Var);
        wk0Var.setPivotY(0.0f);
        wk0Var.setVerticalScrollBarEnabled(true);
        wk0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        wk0Var.setVerticalScrollbarPosition(i13);
        f2.m0 m0Var2 = new f2.m0(1, false);
        this.f29138d0 = m0Var2;
        wk0Var.setLayoutManager(m0Var2);
        wk0Var.U1 = true;
        wk0Var.V1 = 0;
        wk0Var.setClipToPadding(false);
        e00 e00Var2 = new e00(context, null);
        e00Var2.setViewType(1);
        um0 um0Var2 = new um0(mxVar, context, e00Var2, 3);
        this.f29137c0 = um0Var2;
        um0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var2.f28885e.setVisibility(8);
        um0Var2.setVisibility(8);
        um0Var2.addView(e00Var2, 0);
        um0Var2.e(true, false);
        frameLayout2.addView(um0Var2);
        frameLayout2.addView(wk0Var);
        wk0Var.setEmptyView(um0Var2);
        cn0 cn0Var = new cn0(mxVar, wk0Var, context, this.D0, i11, dyVar);
        this.f29140f0 = cn0Var;
        wk0Var.setAdapter(cn0Var);
        wk0Var.setOnScrollListener(new wm0(mxVar, dyVar, 3));
        wk0Var.C0(new ib0(mxVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f29141g0 = frameLayout3;
        tm0 tm0Var = new tm0(mxVar);
        tm0Var.f5532m = false;
        tm0Var.C = false;
        tm0Var.o(grVar);
        tm0Var.n(350L);
        wk0 wk0Var2 = new wk0(context, null);
        this.f29144j0 = wk0Var2;
        wk0Var2.setItemAnimator(tm0Var);
        wk0Var2.setPivotY(0.0f);
        wk0Var2.setClipToPadding(false);
        wk0Var2.setVerticalScrollBarEnabled(true);
        wk0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        wk0Var2.setVerticalScrollbarPosition(i14);
        f2.m0 m0Var3 = new f2.m0(1, false);
        this.f29143i0 = m0Var3;
        wk0Var2.setLayoutManager(m0Var3);
        wk0Var2.U1 = true;
        wk0Var2.V1 = 0;
        e00 e00Var3 = new e00(context, null);
        e00Var3.setViewType(1);
        um0 um0Var3 = new um0(mxVar, context, e00Var3, 0);
        this.f29142h0 = um0Var3;
        um0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var3.f28885e.setVisibility(8);
        um0Var3.setVisibility(8);
        um0Var3.addView(e00Var3, 0);
        um0Var3.e(true, false);
        frameLayout3.addView(um0Var3);
        frameLayout3.addView(wk0Var2);
        wk0Var2.setEmptyView(um0Var3);
        vm0 vm0Var = new vm0(mxVar, wk0Var2, context, this.D0, i11);
        this.f29145k0 = vm0Var;
        wk0Var2.setAdapter(vm0Var);
        wk0Var2.setOnScrollListener(new wm0(mxVar, dyVar, 0));
        wk0Var2.C0(new ib0(mxVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f29147n0 = frameLayout4;
        xm0 xm0Var = new xm0(mxVar);
        xm0Var.f5532m = false;
        xm0Var.C = false;
        xm0Var.o(grVar);
        xm0Var.n(350L);
        wk0 wk0Var3 = new wk0(context, null);
        this.f29150q0 = wk0Var3;
        wk0Var3.setItemAnimator(xm0Var);
        wk0Var3.setPivotY(0.0f);
        wk0Var3.setVerticalScrollBarEnabled(true);
        wk0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        wk0Var3.setVerticalScrollbarPosition(i15);
        f2.m0 m0Var4 = new f2.m0(1, false);
        this.f29149p0 = m0Var4;
        wk0Var3.setLayoutManager(m0Var4);
        wk0Var3.U1 = true;
        wk0Var3.V1 = 0;
        wk0Var3.setClipToPadding(false);
        e00 e00Var4 = new e00(context, null);
        e00Var4.setViewType(1);
        um0 um0Var4 = new um0(mxVar, context, e00Var4, 1);
        this.f29148o0 = um0Var4;
        um0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        um0Var4.f28885e.setVisibility(8);
        um0Var4.setVisibility(8);
        um0Var4.addView(e00Var4, 0);
        um0Var4.e(true, false);
        frameLayout4.addView(um0Var4);
        frameLayout4.addView(wk0Var3);
        wk0Var3.setEmptyView(um0Var4);
        ym0 ym0Var = new ym0(mxVar, wk0Var3, context, this.D0);
        this.f29151r0 = ym0Var;
        wk0Var3.setAdapter(ym0Var);
        wk0Var3.setOnScrollListener(new wm0(mxVar, dyVar, 1));
        wk0Var3.C0(new ib0(mxVar, 23));
        this.W = new dk0(f1Var, true);
        kg0 kg0Var = new kg0(context, dyVar);
        this.f29146l0 = kg0Var;
        i51 i51Var = kg0Var.f30078c;
        i51Var.setClipToPadding(false);
        i51Var.j(new zm0(mxVar, 0));
        i51Var.C0(new ib0(mxVar, 23));
        gn0 gn0Var = new gn0(mxVar);
        this.P = gn0Var;
        setAdapter(gn0Var);
    }

    public static org.telegram.ui.qn K(MessageObject messageObject, int i9) {
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i9).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        return new org.telegram.ui.qn(bundle);
    }

    public static void P(FrameLayout frameLayout, wk0 wk0Var, int i9, int i10, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i9, 0, i10);
        if (z10) {
            wk0Var.o1(0, i9, 0, i10);
        } else {
            wk0Var.setPadding(0, i9, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wk0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i9;
        marginLayoutParams.bottomMargin = -i10;
    }

    public final void J() {
        if (this.m0) {
            int i9 = 0;
            this.m0 = false;
            R();
            c71 c71Var = this.I;
            if (c71Var != null && c71Var.getCurrentTabId() != 0) {
                this.I.d(0, 0);
            }
            an0 an0Var = this.U;
            if (an0Var != null) {
                String str = this.G0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f29156w0;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (((of.m0) arrayList.get(i10)).d == 7) {
                        i9 = 1;
                        break;
                    } else {
                        i10++;
                    }
                }
                an0Var.U(i9, str);
            }
        }
    }

    public final int L(int i9) {
        int i10 = 0;
        while (true) {
            gn0 gn0Var = this.P;
            ArrayList arrayList = gn0Var.f28819a;
            ArrayList arrayList2 = gn0Var.f28819a;
            if (i10 < arrayList.size()) {
                if (((fn0) arrayList2.get(i10)).f28514a == 3 && ((fn0) arrayList2.get(i10)).f28515b == i9) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final void M(ArrayList arrayList) {
        int i9 = 0;
        while (true) {
            gh.f1 f1Var = this.R;
            if (i9 >= f1Var.getChildCount()) {
                break;
            }
            View childAt = f1Var.getChildAt(i9);
            if ((childAt instanceof org.telegram.ui.Cells.h6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.h6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
            }
            i9++;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.f10) {
                arrayList.addAll(((org.telegram.ui.f10) getChildAt(i10)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) sparseArray.valueAt(i11);
            if (view instanceof org.telegram.ui.f10) {
                arrayList.addAll(((org.telegram.ui.f10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.f10 f10Var = this.I0;
        if (f10Var != null) {
            arrayList.addAll(f10Var.getThemeDescriptions());
        }
        um0 um0Var = this.S;
        arrayList.add(new org.telegram.ui.ActionBar.h6(um0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(um0Var.f28885e, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.addAll(g7.h6.a(new s6(this, 7), org.telegram.ui.ActionBar.f6.f23371y8));
    }

    public final boolean N() {
        int i9 = this.D0;
        if (!UserConfig.getInstance(i9).isPremium() && !MessagesController.getInstance(i9).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f29155v0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i9, String str, boolean z10) {
        long j10;
        long j11;
        boolean z11;
        org.telegram.ui.f10 f10Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        um0 um0Var = this.S;
        if (isEmpty) {
            um0Var.f28885e.setVisibility(8);
        } else {
            um0Var.f28885e.setVisibility(0);
            um0Var.f28885e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        an0 an0Var = this.U;
        org.telegram.ui.ox oxVar = an0Var.Q;
        if (oxVar != null) {
            j10 = oxVar.a();
        } else {
            j10 = 0;
        }
        if (i9 == 0) {
            j11 = 0;
        } else {
            j11 = j10;
        }
        long j13 = 0;
        long j14 = 0;
        int i10 = 0;
        boolean z19 = false;
        while (true) {
            ArrayList arrayList = this.f29156w0;
            if (i10 >= arrayList.size()) {
                break;
            }
            of.m0 m0Var = (of.m0) arrayList.get(i10);
            int i11 = m0Var.d;
            if (i11 == 4) {
                TLObject tLObject = m0Var.f19422f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f22527id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j12 = -((TLRPC.Chat) m0Var.f19422f).f22380id;
                }
                j11 = j12;
            } else if (i11 == 6) {
                of.k0 k0Var = m0Var.f19423g;
                long j15 = k0Var.f19396b;
                j14 = k0Var.f19397c;
                j13 = j15;
            } else if (i11 == 7) {
                z19 = true;
            }
            i10++;
        }
        ym0 ym0Var = this.f29151r0;
        ym0Var.getClass();
        if (o30.X(str, null) == null) {
            J();
        }
        if (view == this.f29136b0) {
            MessagesController.getInstance(this.D0).getChannelRecommendations(0L);
            cn0 cn0Var = this.f29140f0;
            wk0 wk0Var = cn0Var.d;
            ArrayList arrayList2 = cn0Var.M;
            ArrayList arrayList3 = cn0Var.N;
            ArrayList arrayList4 = cn0Var.O;
            ArrayList arrayList5 = cn0Var.L;
            np npVar = cn0Var.Y;
            cn0Var.W();
            if (!TextUtils.equals(str, cn0Var.X)) {
                cn0Var.X = str;
                AndroidUtilities.cancelRunOnUIThread(npVar);
                if (TextUtils.isEmpty(cn0Var.X)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    cn0Var.N(true);
                    cn0Var.W++;
                    z18 = false;
                    cn0Var.S = false;
                    cn0Var.T = false;
                    cn0Var.U = false;
                    cn0Var.V = 0;
                    if (wk0Var != null) {
                        wk0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(npVar, 1000L);
                    cn0Var.S = true;
                    cn0Var.T = true;
                    cn0Var.N(true);
                    if (wk0Var != null) {
                        z18 = false;
                        wk0Var.u0(0);
                    }
                }
                this.f29137c0.b(this.J0, z18);
            }
            z18 = false;
            this.f29137c0.b(this.J0, z18);
        } else if (view == this.f29141g0) {
            vm0 vm0Var = this.f29145k0;
            wk0 wk0Var2 = vm0Var.d;
            ArrayList arrayList6 = vm0Var.P;
            ds dsVar = vm0Var.f29180b0;
            if (TextUtils.equals(str, vm0Var.f29179a0)) {
                z17 = false;
            } else {
                vm0Var.f29179a0 = str;
                AndroidUtilities.cancelRunOnUIThread(dsVar);
                if (TextUtils.isEmpty(vm0Var.f29179a0)) {
                    arrayList6.clear();
                    vm0Var.N(true);
                    vm0Var.Z++;
                    z17 = false;
                    vm0Var.V = false;
                    vm0Var.W = false;
                    vm0Var.X = false;
                    vm0Var.Y = 0;
                    if (wk0Var2 != null) {
                        wk0Var2.u0(0);
                    }
                } else {
                    z17 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(dsVar, 1000L);
                    vm0Var.V = true;
                    vm0Var.W = true;
                    vm0Var.N(true);
                    if (wk0Var2 != null) {
                        wk0Var2.u0(0);
                    }
                }
            }
            this.f29142h0.b(this.J0, z17);
            if (TextUtils.isEmpty(str)) {
                vm0Var.V();
            }
        } else {
            kg0 kg0Var = this.f29146l0;
            if (view == kg0Var) {
                i51 i51Var = kg0Var.f30078c;
                ArrayList arrayList7 = kg0Var.f30081n;
                if (!TextUtils.equals(kg0Var.f30084w, str)) {
                    if (kg0Var.G >= 0) {
                        ConnectionsManager.getInstance(kg0Var.f30077b).cancelRequest(kg0Var.G, true);
                        kg0Var.G = -1;
                    }
                    kg0Var.v = false;
                    kg0Var.D.setLoading(false);
                    kg0Var.f30084w = str;
                    if (TextUtils.isEmpty(str)) {
                        kg0Var.f30082r = 0;
                        z16 = true;
                        kg0Var.H++;
                        kg0Var.f30083s = false;
                        arrayList7.clear();
                        kg0Var.a(false);
                    } else {
                        z16 = true;
                        kg0Var.b(str);
                        kg0Var.f30082r = 0;
                        kg0Var.H++;
                        kg0Var.f30083s = false;
                        arrayList7.clear();
                    }
                    kg0Var.d();
                    i51Var.u0(0);
                    i51Var.U2.N(z16);
                }
            } else if (view == this.f29147n0) {
                if (o30.X(str, null) != null) {
                    if (z10) {
                        this.f29149p0.h1(0, 0);
                    }
                    ym0Var.Y(str);
                    this.f29148o0.b(this.J0, false);
                }
            } else if (view == this.Q) {
                org.telegram.ui.f10 f10Var2 = this.I0;
                if ((j11 == 0 && this.P0 == 0 && j13 == 0 && j14 == 0) || j10 != 0) {
                    this.E0 = false;
                    an0Var.U(z19 ? 1 : 0, str);
                    an0Var.f19314w0 = this.H0;
                    f10Var2.animate().setListener(null).cancel();
                    f10Var2.i(null, false);
                    if (z10) {
                        if (an0Var.f19319z0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        um0Var.e(!z14, false);
                        if (an0Var.f19319z0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        um0Var.e(z15, false);
                    } else if (!an0Var.N()) {
                        if (an0Var.f19319z0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        um0Var.e(z13, true);
                    }
                    if (z10) {
                        f10Var2.setVisibility(8);
                    } else if (f10Var2.getVisibility() != 8) {
                        f10Var2.animate().alpha(0.0f).setListener(new r60(this, 16)).setDuration(150L).start();
                    }
                    f10Var2.setTag(null);
                    f10Var = f10Var2;
                    z12 = false;
                } else {
                    boolean z20 = true;
                    f10Var2.setTag(1);
                    f10Var2.i(this.H0, false);
                    f10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        f10Var2.setVisibility(0);
                        f10Var2.setAlpha(1.0f);
                        z20 = z10;
                    } else {
                        if (f10Var2.getVisibility() != 0) {
                            f10Var2.setVisibility(0);
                            f10Var2.setAlpha(0.0f);
                        } else {
                            z20 = z10;
                        }
                        f10Var2.animate().alpha(1.0f).setDuration(150L).start();
                    }
                    f10Var = f10Var2;
                    z12 = false;
                    this.I0.h(j11, this.P0, j13, j14, null, z19, str, z20);
                    um0Var.setVisibility(8);
                }
                um0Var.b(this.J0, z12);
                f10Var.f38089c.b(this.J0, z12);
            } else {
                long j16 = j10;
                long j17 = j13;
                long j18 = j14;
                if (view instanceof org.telegram.ui.f10) {
                    org.telegram.ui.f10 f10Var3 = (org.telegram.ui.f10) view;
                    if (j16 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f10Var3.setUseFromUserAsAvatar(z11);
                    f10Var3.f38089c.b(this.J0, false);
                    f10Var3.h(j11, this.P0, j17, j18, of.o0.Y2[((fn0) this.P.f28819a.get(i9)).f28515b], z19, str, z10);
                } else if (view instanceof gm0) {
                    gm0 gm0Var = (gm0) view;
                    gm0Var.f28808a.b(this.J0, false);
                    gm0Var.G = str;
                    gm0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        vk0 vk0Var;
        vk0 vk0Var2;
        vk0 vk0Var3;
        int i9;
        boolean z11;
        int i10;
        org.telegram.ui.ox oxVar;
        int i11;
        if (this.f29154u0 != z10) {
            org.telegram.ui.dy dyVar = this.F0;
            if (!z10 || !dyVar.getActionBar().s()) {
                int i12 = 72;
                if (z10 && !dyVar.getActionBar().a("search_view_pager")) {
                    this.B0 = dyVar.getActionBar().j("search_view_pager");
                    if (dyVar.S) {
                        ImageView imageView = new ImageView(getContext());
                        this.f29152s0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f29152s0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                        this.f29152s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23371y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f29152s0.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23388z8, false), 1, -1));
                        this.f29152s0.setOnClickListener(new h70(this, 14));
                        this.B0.addView(this.f29152s0, g7.e6.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.B0.getContext());
                    this.f29153t0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f29153t0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f29153t0;
                    int i13 = org.telegram.ui.ActionBar.f6.f23371y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
                    org.telegram.ui.ActionBar.z zVar = this.B0;
                    NumberTextView numberTextView3 = this.f29153t0;
                    if (dyVar.S) {
                        i11 = 18;
                    } else {
                        i11 = 72;
                    }
                    zVar.addView(numberTextView3, g7.e6.m(1.0f, 0, -1, i11, 0, 0));
                    this.f29153t0.setOnTouchListener(new jh.d(21));
                    org.telegram.ui.ActionBar.w0 h = this.B0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.f29157x0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i13, false), PorterDuff.Mode.SRC_IN));
                    this.f29158y0 = this.B0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.f29159z0 = this.B0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.A0 = this.B0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f29153t0 != null) {
                    an0 an0Var = this.U;
                    if (an0Var != null && (oxVar = an0Var.Q) != null && oxVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f29153t0.getLayoutParams();
                    if (dyVar.S) {
                        i12 = 18;
                    }
                    if (z11) {
                        i10 = 56;
                    } else {
                        i10 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i12 + i10);
                    NumberTextView numberTextView4 = this.f29153t0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (dyVar.getActionBar().getBackButton() != null && (dyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
                    dyVar.getActionBar().setBackButtonDrawable(h2Var);
                    h2Var.setColorFilter(null);
                }
                this.f29154u0 = z10;
                HashMap hashMap = this.f29155v0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(dyVar.getParentActivity().getCurrentFocus());
                    dyVar.getActionBar().N(null, null);
                    this.f29153t0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f29157x0;
                    if (N()) {
                        i9 = 0;
                    } else {
                        i9 = 8;
                    }
                    w0Var.setVisibility(i9);
                    this.f29158y0.setVisibility(0);
                    this.f29159z0.setVisibility(0);
                    this.A0.setVisibility(0);
                    return;
                }
                dyVar.getActionBar().r();
                hashMap.clear();
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    if ((getChildAt(i14) instanceof org.telegram.ui.f10) && (vk0Var3 = ((org.telegram.ui.f10) getChildAt(i14)).d) != null) {
                        vk0Var3.l();
                    }
                    if (getChildAt(i14) instanceof gm0) {
                        ((gm0) getChildAt(i14)).d(true);
                    }
                }
                org.telegram.ui.f10 f10Var = this.I0;
                if (f10Var != null && (vk0Var2 = f10Var.d) != null) {
                    vk0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    View view = (View) sparseArray.valueAt(i15);
                    if ((view instanceof org.telegram.ui.f10) && (vk0Var = ((org.telegram.ui.f10) view).d) != null) {
                        vk0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.P.i();
        o(false);
        c71 c71Var = this.I;
        if (c71Var != null) {
            c71Var.f30758x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final boolean b(org.telegram.ui.x00 x00Var) {
        return this.f29155v0.containsKey(x00Var);
    }

    @Override
    public final void c(MessageObject messageObject) {
        this.F0.presentFragment(K(messageObject, this.D0));
        Q(false);
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i9) {
        boolean z10;
        int i10;
        int i11;
        org.telegram.ui.x00 x00Var = new org.telegram.ui.x00(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f29155v0;
        if (hashMap.containsKey(x00Var)) {
            hashMap.remove(x00Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(x00Var, messageObject);
        } else {
            return;
        }
        int i12 = 0;
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.f29153t0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f29158y0;
            if (w0Var != null) {
                if (hashMap.size() == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                w0Var.setVisibility(i11);
            }
            if (this.f29157x0 != null) {
                boolean N = N();
                if (N) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (this.f29157x0.getVisibility() != i10) {
                    this.f29157x0.setVisibility(i10);
                    int i13 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f29157x0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23371y8, false), PorterDuff.Mode.SRC_IN));
                    if (N) {
                        animatedVectorDrawable.start();
                    } else if (i13 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.A0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((MessageObject) hashMap.get((org.telegram.ui.x00) it.next())).isDownloadingFile) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = this.A0;
                if (!z10) {
                    i12 = 8;
                }
                w0Var2.setVisibility(i12);
            }
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(hashMap.containsKey(x00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).b(i9, hashMap.containsKey(x00Var));
        } else if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).f(hashMap.containsKey(x00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).e(hashMap.containsKey(x00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(x00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).U(hashMap.containsKey(x00Var), true);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.channelRecommendationsLoaded;
        boolean z10 = false;
        cn0 cn0Var = this.f29140f0;
        if (i9 == i11) {
            if (MessagesController.getInstance(this.D0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f29137c0.e(z10, true);
            cn0Var.W();
            cn0Var.N(true);
        } else if (i9 != NotificationCenter.dialogDeleted && i9 != NotificationCenter.dialogsNeedReload) {
            if (i9 == NotificationCenter.reloadWebappsHints) {
                this.f29145k0.N(true);
            } else if (i9 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                ym0 ym0Var = this.f29151r0;
                if (obj == ym0Var.M) {
                    ym0Var.N(true);
                }
            }
        } else {
            cn0Var.W();
            cn0Var.N(true);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.Q;
                wk0 wk0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        wk0Var = this.R;
                    } else if (view == this.f29136b0) {
                        wk0Var = this.f29139e0;
                    } else if (view == this.f29141g0) {
                        wk0Var = this.f29144j0;
                    } else if (view == this.f29147n0) {
                        wk0Var = this.f29150q0;
                    } else {
                        gm0 gm0Var = this.C0;
                        if (view == gm0Var) {
                            wk0Var = gm0Var.f28809b;
                        } else {
                            kg0 kg0Var = this.f29146l0;
                            if (view == kg0Var) {
                                wk0Var = kg0Var.f30078c;
                            } else if (view instanceof org.telegram.ui.f10) {
                                wk0Var = ((org.telegram.ui.f10) view).f38087b;
                            }
                        }
                    }
                }
                if (wk0Var != null) {
                    og.d.b(wk0Var, canvas, rectF, wk0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.f10 f10Var = this.I0;
                    if (f10Var.getVisibility() == 0) {
                        gh.f1 f1Var = f10Var.f38087b;
                        og.d.b(f1Var, canvas, rectF, f1Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean f() {
        return this.f29154u0;
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f7046b = true;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.B0;
    }

    public ArrayList<of.m0> getCurrentSearchFilters() {
        return this.f29156w0;
    }

    public gm0 getDownloadsContainer() {
        return this.C0;
    }

    public int getFolderId() {
        return this.N0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.w0 getSpeedItem() {
        return this.f29157x0;
    }

    public m71 getTabsView() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = this.D0;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storiesListUpdated);
        this.f29135a0 = true;
        cn0 cn0Var = this.f29140f0;
        if (cn0Var != null) {
            cn0Var.N(false);
        }
        vm0 vm0Var = this.f29145k0;
        if (vm0Var != null) {
            vm0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29135a0 = false;
        int i9 = this.D0;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void s() {
        this.M0.M();
    }

    public void setBlurredBackgroundDrawableFactory(ig.a aVar) {
        this.S0 = aVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.w00 w00Var) {
        this.H0 = w00Var;
    }

    public void setKeyboardHeight(int i9) {
        boolean z10;
        this.J0 = i9;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.f10) {
                ((org.telegram.ui.f10) getChildAt(i10)).f38089c.b(i9, z10);
            } else if (getChildAt(i10) == this.Q) {
                this.S.b(i9, z10);
                this.I0.f38089c.b(i9, z10);
            } else if (getChildAt(i10) instanceof gm0) {
                ((gm0) getChildAt(i10)).f28808a.b(i9, z10);
            } else if (getChildAt(i10) == this.f29136b0) {
                this.f29137c0.b(i9, z10);
            }
        }
    }

    @Override
    public void setPosition(int i9) {
        if (i9 < 0) {
            return;
        }
        super.setPosition(i9);
        this.h.clear();
        c71 c71Var = this.I;
        if (c71Var != null) {
            c71Var.f(1.0f, i9);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i9, int i10) {
        boolean z10;
        an0 an0Var = this.U;
        org.telegram.ui.f10 f10Var = this.I0;
        if (i9 == 0) {
            if (f10Var.getVisibility() == 0) {
                f10Var.i(this.H0, false);
                an0Var.f19314w0 = null;
            } else {
                f10Var.i(null, false);
                org.telegram.ui.w00 w00Var = this.H0;
                an0Var.f19314w0 = w00Var;
                if (w00Var != null) {
                    ((org.telegram.ui.jv) w00Var).i(false, null, an0Var.f19311u0, an0Var.f19312v0);
                }
            }
        } else if (view instanceof org.telegram.ui.f10) {
            if (i10 == 0 && f10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.f10) view).i(this.H0, z10);
        }
        if (view2 instanceof org.telegram.ui.f10) {
            ((org.telegram.ui.f10) view2).i(null, false);
            return;
        }
        an0Var.f19314w0 = null;
        f10Var.i(null, false);
    }
}
