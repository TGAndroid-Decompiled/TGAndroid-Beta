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
public abstract class tn0 extends z71 implements org.telegram.ui.g10, NotificationCenter.NotificationCenterDelegate, mg.a {
    public static final int T0 = 0;
    public org.telegram.ui.ActionBar.w0 A0;
    public org.telegram.ui.ActionBar.a0 B0;
    public tm0 C0;
    public final int D0;
    public boolean E0;
    public final org.telegram.ui.fy F0;
    public String G0;
    public org.telegram.ui.y00 H0;
    public final org.telegram.ui.h10 I0;
    public int J0;
    public boolean K0;
    public final org.telegram.ui.kx L0;
    public final hv0 M0;
    public final int N0;
    public int O0;
    public final sn0 P;
    public final long P0;
    public final FrameLayout Q;
    public int Q0;
    public final jh.e1 R;
    public int R0;
    public final gn0 S;
    public lg.a S0;
    public final f2.l T;
    public final mn0 U;
    public final f2.j0 V;
    public final pk0 W;
    public boolean f32988a0;
    public final FrameLayout f32989b0;
    public final gn0 f32990c0;
    public final f2.j0 f32991d0;
    public final jl0 f32992e0;
    public final on0 f32993f0;
    public final FrameLayout f32994g0;
    public final gn0 f32995h0;
    public final f2.j0 f32996i0;
    public final jl0 f32997j0;
    public final hn0 f32998k0;
    public final ug0 f32999l0;
    public boolean m0;
    public final FrameLayout f33000n0;
    public final gn0 f33001o0;
    public final f2.j0 f33002p0;
    public final jl0 f33003q0;
    public final kn0 f33004r0;
    public ImageView f33005s0;
    public NumberTextView f33006t0;
    public boolean f33007u0;
    public final HashMap f33008v0;
    public final ArrayList f33009w0;
    public org.telegram.ui.ActionBar.w0 f33010x0;
    public org.telegram.ui.ActionBar.w0 f33011y0;
    public org.telegram.ui.ActionBar.w0 f33012z0;

    public tn0(Context context, org.telegram.ui.fy fyVar, int i10, int i11, int i12, long j10, org.telegram.ui.kx kxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.m0 = false;
        this.f33008v0 = new HashMap();
        this.f33009w0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.D0 = i17;
        this.O0 = 0;
        this.N0 = i12;
        this.P0 = j10;
        this.F0 = fyVar;
        this.L0 = kxVar;
        f2.l lVar = new f2.l();
        this.T = lVar;
        lVar.f6486c = 150L;
        lVar.f6487e = 350L;
        lVar.f6488f = 0L;
        lVar.f6489g = 0L;
        lVar.d = 0L;
        lVar.f6490i = new OvershootInterpolator(1.1f);
        lVar.f6404o = jr.h;
        org.telegram.ui.ox oxVar = (org.telegram.ui.ox) this;
        this.U = new mn0(oxVar, context, fyVar, i10, i11, lVar, fyVar.B, fyVar, context);
        if (i11 == 15) {
            ArrayList R3 = fyVar.R3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < R3.size(); i18 = a4.w.g(((TLRPC.Dialog) R3.get(i18)).f22396id, arrayList, i18, 1)) {
            }
            this.U.m0 = arrayList;
        }
        this.M0 = (hv0) fyVar.getFragmentView();
        jh.e1 e1Var = new jh.e1(oxVar, context, 20);
        this.R = e1Var;
        e1Var.setItemAnimator(this.T);
        e1Var.setPivotY(0.0f);
        e1Var.setClipToPadding(false);
        e1Var.setAdapter(this.U);
        e1Var.setVerticalScrollBarEnabled(true);
        e1Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        e1Var.setVerticalScrollbarPosition(i13);
        f2.j0 j0Var = new f2.j0(1, false);
        this.V = j0Var;
        e1Var.setLayoutManager(j0Var);
        e1Var.U1 = true;
        e1Var.V1 = 0;
        e1Var.setOnScrollListener(new in0(oxVar, fyVar, 2));
        e1Var.C0(new xb0(oxVar, 23));
        org.telegram.ui.h10 h10Var = new org.telegram.ui.h10(this.F0);
        this.I0 = h10Var;
        jh.e1 e1Var2 = h10Var.f38720b;
        e1Var2.setClipToPadding(false);
        e1Var2.j(new ln0(oxVar, 1));
        e1Var2.C0(new xb0(oxVar, 23));
        h10Var.setUiCallback(this);
        h10Var.setVisibility(8);
        h10Var.setChatPreviewDelegate(kxVar);
        p00 p00Var = new p00(context, null);
        p00Var.setViewType(1);
        gn0 gn0Var = new gn0(oxVar, context, p00Var, 2);
        this.S = gn0Var;
        gn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var.f32122e.setVisibility(8);
        gn0Var.setVisibility(8);
        gn0Var.addView(p00Var, 0);
        gn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        frameLayout.addView(gn0Var);
        frameLayout.addView(e1Var);
        frameLayout.addView(h10Var);
        e1Var.setEmptyView(gn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f32989b0 = frameLayout2;
        nn0 nn0Var = new nn0(oxVar);
        nn0Var.f6463m = false;
        nn0Var.C = false;
        jr jrVar = jr.h;
        nn0Var.o(jrVar);
        nn0Var.n(350L);
        jl0 jl0Var = new jl0(context, null);
        this.f32992e0 = jl0Var;
        jl0Var.setItemAnimator(nn0Var);
        jl0Var.setPivotY(0.0f);
        jl0Var.setVerticalScrollBarEnabled(true);
        jl0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        jl0Var.setVerticalScrollbarPosition(i14);
        f2.j0 j0Var2 = new f2.j0(1, false);
        this.f32991d0 = j0Var2;
        jl0Var.setLayoutManager(j0Var2);
        jl0Var.U1 = true;
        jl0Var.V1 = 0;
        jl0Var.setClipToPadding(false);
        p00 p00Var2 = new p00(context, null);
        p00Var2.setViewType(1);
        gn0 gn0Var2 = new gn0(oxVar, context, p00Var2, 3);
        this.f32990c0 = gn0Var2;
        gn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var2.f32122e.setVisibility(8);
        gn0Var2.setVisibility(8);
        gn0Var2.addView(p00Var2, 0);
        gn0Var2.e(true, false);
        frameLayout2.addView(gn0Var2);
        frameLayout2.addView(jl0Var);
        jl0Var.setEmptyView(gn0Var2);
        on0 on0Var = new on0(oxVar, jl0Var, context, this.D0, i12, fyVar);
        this.f32993f0 = on0Var;
        jl0Var.setAdapter(on0Var);
        jl0Var.setOnScrollListener(new in0(oxVar, fyVar, 3));
        jl0Var.C0(new xb0(oxVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f32994g0 = frameLayout3;
        fn0 fn0Var = new fn0(oxVar);
        fn0Var.f6463m = false;
        fn0Var.C = false;
        fn0Var.o(jrVar);
        fn0Var.n(350L);
        jl0 jl0Var2 = new jl0(context, null);
        this.f32997j0 = jl0Var2;
        jl0Var2.setItemAnimator(fn0Var);
        jl0Var2.setPivotY(0.0f);
        jl0Var2.setClipToPadding(false);
        jl0Var2.setVerticalScrollBarEnabled(true);
        jl0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        jl0Var2.setVerticalScrollbarPosition(i15);
        f2.j0 j0Var3 = new f2.j0(1, false);
        this.f32996i0 = j0Var3;
        jl0Var2.setLayoutManager(j0Var3);
        jl0Var2.U1 = true;
        jl0Var2.V1 = 0;
        p00 p00Var3 = new p00(context, null);
        p00Var3.setViewType(1);
        gn0 gn0Var3 = new gn0(oxVar, context, p00Var3, 0);
        this.f32995h0 = gn0Var3;
        gn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var3.f32122e.setVisibility(8);
        gn0Var3.setVisibility(8);
        gn0Var3.addView(p00Var3, 0);
        gn0Var3.e(true, false);
        frameLayout3.addView(gn0Var3);
        frameLayout3.addView(jl0Var2);
        jl0Var2.setEmptyView(gn0Var3);
        hn0 hn0Var = new hn0(oxVar, jl0Var2, context, this.D0, i12);
        this.f32998k0 = hn0Var;
        jl0Var2.setAdapter(hn0Var);
        jl0Var2.setOnScrollListener(new in0(oxVar, fyVar, 0));
        jl0Var2.C0(new xb0(oxVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f33000n0 = frameLayout4;
        jn0 jn0Var = new jn0(oxVar);
        jn0Var.f6463m = false;
        jn0Var.C = false;
        jn0Var.o(jrVar);
        jn0Var.n(350L);
        jl0 jl0Var3 = new jl0(context, null);
        this.f33003q0 = jl0Var3;
        jl0Var3.setItemAnimator(jn0Var);
        jl0Var3.setPivotY(0.0f);
        jl0Var3.setVerticalScrollBarEnabled(true);
        jl0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        jl0Var3.setVerticalScrollbarPosition(i16);
        f2.j0 j0Var4 = new f2.j0(1, false);
        this.f33002p0 = j0Var4;
        jl0Var3.setLayoutManager(j0Var4);
        jl0Var3.U1 = true;
        jl0Var3.V1 = 0;
        jl0Var3.setClipToPadding(false);
        p00 p00Var4 = new p00(context, null);
        p00Var4.setViewType(1);
        gn0 gn0Var4 = new gn0(oxVar, context, p00Var4, 1);
        this.f33001o0 = gn0Var4;
        gn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        gn0Var4.f32122e.setVisibility(8);
        gn0Var4.setVisibility(8);
        gn0Var4.addView(p00Var4, 0);
        gn0Var4.e(true, false);
        frameLayout4.addView(gn0Var4);
        frameLayout4.addView(jl0Var3);
        jl0Var3.setEmptyView(gn0Var4);
        kn0 kn0Var = new kn0(oxVar, jl0Var3, context, this.D0);
        this.f33004r0 = kn0Var;
        jl0Var3.setAdapter(kn0Var);
        jl0Var3.setOnScrollListener(new in0(oxVar, fyVar, 1));
        jl0Var3.C0(new xb0(oxVar, 23));
        this.W = new pk0(e1Var, true);
        ug0 ug0Var = new ug0(context, fyVar);
        this.f32999l0 = ug0Var;
        u51 u51Var = ug0Var.f33224c;
        u51Var.setClipToPadding(false);
        u51Var.j(new ln0(oxVar, 0));
        u51Var.C0(new xb0(oxVar, 23));
        sn0 sn0Var = new sn0(oxVar);
        this.P = sn0Var;
        setAdapter(sn0Var);
    }

    public static org.telegram.ui.tn K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.tn(bundle);
    }

    public static void P(FrameLayout frameLayout, jl0 jl0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            jl0Var.o1(0, i10, 0, i11);
        } else {
            jl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.m0) {
            int i10 = 0;
            this.m0 = false;
            R();
            o71 o71Var = this.I;
            if (o71Var != null && o71Var.getCurrentTabId() != 0) {
                this.I.d(0, 0);
            }
            mn0 mn0Var = this.U;
            if (mn0Var != null) {
                String str = this.G0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f33009w0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((rf.f0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                mn0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            sn0 sn0Var = this.P;
            ArrayList arrayList = sn0Var.f32693a;
            ArrayList arrayList2 = sn0Var.f32693a;
            if (i11 < arrayList.size()) {
                if (((rn0) arrayList2.get(i11)).f32345a == 3 && ((rn0) arrayList2.get(i11)).f32346b == i10) {
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
            jh.e1 e1Var = this.R;
            if (i10 >= e1Var.getChildCount()) {
                break;
            }
            View childAt = e1Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.f6) || (childAt instanceof org.telegram.ui.Cells.p2) || (childAt instanceof org.telegram.ui.Cells.j4)) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.h10) {
                arrayList.addAll(((org.telegram.ui.h10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.h10) {
                arrayList.addAll(((org.telegram.ui.h10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.h10 h10Var = this.I0;
        if (h10Var != null) {
            arrayList.addAll(h10Var.getThemeDescriptions());
        }
        gn0 gn0Var = this.S;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(gn0Var.f32122e, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.addAll(i7.i6.a(new x6(this, 7), org.telegram.ui.ActionBar.g6.y8));
    }

    public final boolean N() {
        int i10 = this.D0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f33008v0.values()) {
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
        org.telegram.ui.h10 h10Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        gn0 gn0Var = this.S;
        if (isEmpty) {
            gn0Var.f32122e.setVisibility(8);
        } else {
            gn0Var.f32122e.setVisibility(0);
            gn0Var.f32122e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        mn0 mn0Var = this.U;
        org.telegram.ui.qx qxVar = mn0Var.Q;
        if (qxVar != null) {
            j10 = qxVar.a();
        } else {
            j10 = 0;
        }
        if (i10 == 0) {
            j11 = 0;
        } else {
            j11 = j10;
        }
        long j13 = 0;
        long j14 = 0;
        int i11 = 0;
        boolean z19 = false;
        while (true) {
            ArrayList arrayList = this.f33009w0;
            if (i11 >= arrayList.size()) {
                break;
            }
            rf.f0 f0Var = (rf.f0) arrayList.get(i11);
            int i12 = f0Var.d;
            if (i12 == 4) {
                TLObject tLObject = f0Var.f47224f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f22539id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j12 = -((TLRPC.Chat) f0Var.f47224f).f22392id;
                }
                j11 = j12;
            } else if (i12 == 6) {
                rf.d0 d0Var = f0Var.f47225g;
                long j15 = d0Var.f47191b;
                j14 = d0Var.f47192c;
                j13 = j15;
            } else if (i12 == 7) {
                z19 = true;
            }
            i11++;
        }
        kn0 kn0Var = this.f33004r0;
        kn0Var.getClass();
        if (c40.X(str, null) == null) {
            J();
        }
        if (view == this.f32989b0) {
            MessagesController.getInstance(this.D0).getChannelRecommendations(0L);
            on0 on0Var = this.f32993f0;
            jl0 jl0Var = on0Var.d;
            ArrayList arrayList2 = on0Var.M;
            ArrayList arrayList3 = on0Var.N;
            ArrayList arrayList4 = on0Var.O;
            ArrayList arrayList5 = on0Var.L;
            rp rpVar = on0Var.Y;
            on0Var.W();
            if (!TextUtils.equals(str, on0Var.X)) {
                on0Var.X = str;
                AndroidUtilities.cancelRunOnUIThread(rpVar);
                if (TextUtils.isEmpty(on0Var.X)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    on0Var.N(true);
                    on0Var.W++;
                    z18 = false;
                    on0Var.S = false;
                    on0Var.T = false;
                    on0Var.U = false;
                    on0Var.V = 0;
                    if (jl0Var != null) {
                        jl0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(rpVar, 1000L);
                    on0Var.S = true;
                    on0Var.T = true;
                    on0Var.N(true);
                    if (jl0Var != null) {
                        z18 = false;
                        jl0Var.u0(0);
                    }
                }
                this.f32990c0.b(this.J0, z18);
            }
            z18 = false;
            this.f32990c0.b(this.J0, z18);
        } else if (view == this.f32994g0) {
            hn0 hn0Var = this.f32998k0;
            jl0 jl0Var2 = hn0Var.d;
            ArrayList arrayList6 = hn0Var.P;
            hs hsVar = hn0Var.f30421b0;
            if (TextUtils.equals(str, hn0Var.f30420a0)) {
                z17 = false;
            } else {
                hn0Var.f30420a0 = str;
                AndroidUtilities.cancelRunOnUIThread(hsVar);
                if (TextUtils.isEmpty(hn0Var.f30420a0)) {
                    arrayList6.clear();
                    hn0Var.N(true);
                    hn0Var.Z++;
                    z17 = false;
                    hn0Var.V = false;
                    hn0Var.W = false;
                    hn0Var.X = false;
                    hn0Var.Y = 0;
                    if (jl0Var2 != null) {
                        jl0Var2.u0(0);
                    }
                } else {
                    z17 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(hsVar, 1000L);
                    hn0Var.V = true;
                    hn0Var.W = true;
                    hn0Var.N(true);
                    if (jl0Var2 != null) {
                        jl0Var2.u0(0);
                    }
                }
            }
            this.f32995h0.b(this.J0, z17);
            if (TextUtils.isEmpty(str)) {
                hn0Var.V();
            }
        } else {
            ug0 ug0Var = this.f32999l0;
            if (view == ug0Var) {
                u51 u51Var = ug0Var.f33224c;
                ArrayList arrayList7 = ug0Var.f33227n;
                if (!TextUtils.equals(ug0Var.f33230w, str)) {
                    if (ug0Var.G >= 0) {
                        ConnectionsManager.getInstance(ug0Var.f33223b).cancelRequest(ug0Var.G, true);
                        ug0Var.G = -1;
                    }
                    ug0Var.v = false;
                    ug0Var.D.setLoading(false);
                    ug0Var.f33230w = str;
                    if (TextUtils.isEmpty(str)) {
                        ug0Var.f33228r = 0;
                        z16 = true;
                        ug0Var.H++;
                        ug0Var.f33229s = false;
                        arrayList7.clear();
                        ug0Var.a(false);
                    } else {
                        z16 = true;
                        ug0Var.b(str);
                        ug0Var.f33228r = 0;
                        ug0Var.H++;
                        ug0Var.f33229s = false;
                        arrayList7.clear();
                    }
                    ug0Var.d();
                    u51Var.u0(0);
                    u51Var.U2.N(z16);
                }
            } else if (view == this.f33000n0) {
                if (c40.X(str, null) != null) {
                    if (z10) {
                        this.f33002p0.h1(0, 0);
                    }
                    kn0Var.Y(str);
                    this.f33001o0.b(this.J0, false);
                }
            } else if (view == this.Q) {
                org.telegram.ui.h10 h10Var2 = this.I0;
                if ((j11 == 0 && this.P0 == 0 && j13 == 0 && j14 == 0) || j10 != 0) {
                    this.E0 = false;
                    mn0Var.U(z19 ? 1 : 0, str);
                    mn0Var.f47166w0 = this.H0;
                    h10Var2.animate().setListener(null).cancel();
                    h10Var2.i(null, false);
                    if (z10) {
                        if (mn0Var.f47171z0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        gn0Var.e(!z14, false);
                        if (mn0Var.f47171z0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        gn0Var.e(z15, false);
                    } else if (!mn0Var.N()) {
                        if (mn0Var.f47171z0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        gn0Var.e(z13, true);
                    }
                    if (z10) {
                        h10Var2.setVisibility(8);
                    } else if (h10Var2.getVisibility() != 8) {
                        h10Var2.animate().alpha(0.0f).setListener(new zz(this, 18)).setDuration(150L).start();
                    }
                    h10Var2.setTag(null);
                    h10Var = h10Var2;
                    z12 = false;
                } else {
                    boolean z20 = true;
                    h10Var2.setTag(1);
                    h10Var2.i(this.H0, false);
                    h10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        h10Var2.setVisibility(0);
                        h10Var2.setAlpha(1.0f);
                        z20 = z10;
                    } else {
                        if (h10Var2.getVisibility() != 0) {
                            h10Var2.setVisibility(0);
                            h10Var2.setAlpha(0.0f);
                        } else {
                            z20 = z10;
                        }
                        h10Var2.animate().alpha(1.0f).setDuration(150L).start();
                    }
                    h10Var = h10Var2;
                    z12 = false;
                    this.I0.h(j11, this.P0, j13, j14, null, z19, str, z20);
                    gn0Var.setVisibility(8);
                }
                gn0Var.b(this.J0, z12);
                h10Var.f38722c.b(this.J0, z12);
            } else {
                long j16 = j10;
                long j17 = j13;
                long j18 = j14;
                if (view instanceof org.telegram.ui.h10) {
                    org.telegram.ui.h10 h10Var3 = (org.telegram.ui.h10) view;
                    if (j16 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h10Var3.setUseFromUserAsAvatar(z11);
                    h10Var3.f38722c.b(this.J0, false);
                    h10Var3.h(j11, this.P0, j17, j18, rf.h0.Y2[((rn0) this.P.f32693a.get(i10)).f32346b], z19, str, z10);
                } else if (view instanceof tm0) {
                    tm0 tm0Var = (tm0) view;
                    tm0Var.f32977a.b(this.J0, false);
                    tm0Var.G = str;
                    tm0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        il0 il0Var;
        il0 il0Var2;
        il0 il0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.qx qxVar;
        int i12;
        if (this.f33007u0 != z10) {
            org.telegram.ui.fy fyVar = this.F0;
            if (!z10 || !fyVar.getActionBar().s()) {
                int i13 = 72;
                if (z10 && !fyVar.getActionBar().a("search_view_pager")) {
                    this.B0 = fyVar.getActionBar().j("search_view_pager");
                    if (fyVar.S) {
                        ImageView imageView = new ImageView(getContext());
                        this.f33005s0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f33005s0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                        this.f33005s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f33005s0.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23452z8, false), 1, -1));
                        this.f33005s0.setOnClickListener(new u70(this, 14));
                        this.B0.addView(this.f33005s0, i7.f6.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.B0.getContext());
                    this.f33006t0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f33006t0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f33006t0;
                    int i14 = org.telegram.ui.ActionBar.g6.y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                    org.telegram.ui.ActionBar.a0 a0Var = this.B0;
                    NumberTextView numberTextView3 = this.f33006t0;
                    if (fyVar.S) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    a0Var.addView(numberTextView3, i7.f6.m(1.0f, 0, -1, i12, 0, 0));
                    this.f33006t0.setOnTouchListener(new mh.d(21));
                    org.telegram.ui.ActionBar.w0 h = this.B0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.f33010x0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.f33011y0 = this.B0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.f33012z0 = this.B0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.A0 = this.B0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f33006t0 != null) {
                    mn0 mn0Var = this.U;
                    if (mn0Var != null && (qxVar = mn0Var.Q) != null && qxVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33006t0.getLayoutParams();
                    if (fyVar.S) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f33006t0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (fyVar.getActionBar().getBackButton() != null && (fyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
                    fyVar.getActionBar().setBackButtonDrawable(h2Var);
                    h2Var.setColorFilter(null);
                }
                this.f33007u0 = z10;
                HashMap hashMap = this.f33008v0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(fyVar.getParentActivity().getCurrentFocus());
                    fyVar.getActionBar().O(null, null);
                    this.f33006t0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f33010x0;
                    if (N()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    this.f33011y0.setVisibility(0);
                    this.f33012z0.setVisibility(0);
                    this.A0.setVisibility(0);
                    return;
                }
                fyVar.getActionBar().r();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.h10) && (il0Var3 = ((org.telegram.ui.h10) getChildAt(i15)).d) != null) {
                        il0Var3.l();
                    }
                    if (getChildAt(i15) instanceof tm0) {
                        ((tm0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.h10 h10Var = this.I0;
                if (h10Var != null && (il0Var2 = h10Var.d) != null) {
                    il0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.h10) && (il0Var = ((org.telegram.ui.h10) view).d) != null) {
                        il0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.P.i();
        o(false);
        o71 o71Var = this.I;
        if (o71Var != null) {
            o71Var.f34962x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final boolean b(org.telegram.ui.z00 z00Var) {
        return this.f33008v0.containsKey(z00Var);
    }

    @Override
    public final void c(MessageObject messageObject) {
        this.F0.presentFragment(K(messageObject, this.D0));
        Q(false);
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.z00 z00Var = new org.telegram.ui.z00(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f33008v0;
        if (hashMap.containsKey(z00Var)) {
            hashMap.remove(z00Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(z00Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.f33006t0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f33011y0;
            if (w0Var != null) {
                if (hashMap.size() == 1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                w0Var.setVisibility(i12);
            }
            if (this.f33010x0 != null) {
                boolean N = N();
                if (N) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (this.f33010x0.getVisibility() != i11) {
                    this.f33010x0.setVisibility(i11);
                    int i14 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f33010x0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false), PorterDuff.Mode.SRC_IN));
                    if (N) {
                        animatedVectorDrawable.start();
                    } else if (i14 >= 23) {
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
                        if (!((MessageObject) hashMap.get((org.telegram.ui.z00) it.next())).isDownloadingFile) {
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
                    i13 = 8;
                }
                w0Var2.setVisibility(i13);
            }
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).b(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.q7) {
            ((org.telegram.ui.Cells.q7) view).b(i10, hashMap.containsKey(z00Var));
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).f(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f7) {
            ((org.telegram.ui.Cells.f7) view).e(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view).c(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).V(hashMap.containsKey(z00Var), true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z10 = false;
        on0 on0Var = this.f32993f0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.D0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f32990c0.e(z10, true);
            on0Var.W();
            on0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f32998k0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                kn0 kn0Var = this.f33004r0;
                if (obj == kn0Var.M) {
                    kn0Var.N(true);
                }
            }
        } else {
            on0Var.W();
            on0Var.N(true);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.Q;
                jl0 jl0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        jl0Var = this.R;
                    } else if (view == this.f32989b0) {
                        jl0Var = this.f32992e0;
                    } else if (view == this.f32994g0) {
                        jl0Var = this.f32997j0;
                    } else if (view == this.f33000n0) {
                        jl0Var = this.f33003q0;
                    } else {
                        tm0 tm0Var = this.C0;
                        if (view == tm0Var) {
                            jl0Var = tm0Var.f32978b;
                        } else {
                            ug0 ug0Var = this.f32999l0;
                            if (view == ug0Var) {
                                jl0Var = ug0Var.f33224c;
                            } else if (view instanceof org.telegram.ui.h10) {
                                jl0Var = ((org.telegram.ui.h10) view).f38720b;
                            }
                        }
                    }
                }
                if (jl0Var != null) {
                    rg.c.b(jl0Var, canvas, rectF, jl0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.h10 h10Var = this.I0;
                    if (h10Var.getVisibility() == 0) {
                        jh.e1 e1Var = h10Var.f38720b;
                        rg.c.b(e1Var, canvas, rectF, e1Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean f() {
        return this.f33007u0;
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f6956b = true;
    }

    public org.telegram.ui.ActionBar.a0 getActionMode() {
        return this.B0;
    }

    public ArrayList<rf.f0> getCurrentSearchFilters() {
        return this.f33009w0;
    }

    public tm0 getDownloadsContainer() {
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
        return this.f33010x0;
    }

    public y71 getTabsView() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.D0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        this.f32988a0 = true;
        on0 on0Var = this.f32993f0;
        if (on0Var != null) {
            on0Var.N(false);
        }
        hn0 hn0Var = this.f32998k0;
        if (hn0Var != null) {
            hn0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32988a0 = false;
        int i10 = this.D0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void s() {
        this.M0.M();
    }

    public void setBlurredBackgroundDrawableFactory(lg.a aVar) {
        this.S0 = aVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.y00 y00Var) {
        this.H0 = y00Var;
    }

    public void setKeyboardHeight(int i10) {
        boolean z10;
        this.J0 = i10;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.h10) {
                ((org.telegram.ui.h10) getChildAt(i11)).f38722c.b(i10, z10);
            } else if (getChildAt(i11) == this.Q) {
                this.S.b(i10, z10);
                this.I0.f38722c.b(i10, z10);
            } else if (getChildAt(i11) instanceof tm0) {
                ((tm0) getChildAt(i11)).f32977a.b(i10, z10);
            } else if (getChildAt(i11) == this.f32989b0) {
                this.f32990c0.b(i10, z10);
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
        o71 o71Var = this.I;
        if (o71Var != null) {
            o71Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        mn0 mn0Var = this.U;
        org.telegram.ui.h10 h10Var = this.I0;
        if (i10 == 0) {
            if (h10Var.getVisibility() == 0) {
                h10Var.i(this.H0, false);
                mn0Var.f47166w0 = null;
            } else {
                h10Var.i(null, false);
                org.telegram.ui.y00 y00Var = this.H0;
                mn0Var.f47166w0 = y00Var;
                if (y00Var != null) {
                    ((org.telegram.ui.kv) y00Var).i(false, null, mn0Var.f47163u0, mn0Var.f47164v0);
                }
            }
        } else if (view instanceof org.telegram.ui.h10) {
            if (i11 == 0 && h10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.h10) view).i(this.H0, z10);
        }
        if (view2 instanceof org.telegram.ui.h10) {
            ((org.telegram.ui.h10) view2).i(null, false);
            return;
        }
        mn0Var.f47166w0 = null;
        h10Var.i(null, false);
    }
}
