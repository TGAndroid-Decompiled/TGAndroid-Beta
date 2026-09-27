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
public abstract class mo0 extends y81 implements org.telegram.ui.v10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final int Z0 = 0;
    public final HashMap A0;
    public final ArrayList B0;
    public org.telegram.ui.ActionBar.w0 C0;
    public org.telegram.ui.ActionBar.w0 D0;
    public org.telegram.ui.ActionBar.w0 E0;
    public org.telegram.ui.ActionBar.w0 F0;
    public org.telegram.ui.ActionBar.a0 G0;
    public kn0 H0;
    public final int I0;
    public boolean J0;
    public final org.telegram.ui.ty K0;
    public String L0;
    public org.telegram.ui.n10 M0;
    public final org.telegram.ui.w10 N0;
    public int O0;
    public boolean P0;
    public final org.telegram.ui.zx Q0;
    public final cw0 R0;
    public final int S0;
    public int T0;
    public final lo0 U;
    public final long U0;
    public final FrameLayout V;
    public int V0;
    public final ai.w0 W;
    public int W0;
    public NotificationCenter.ObserversGroup X0;
    public ah.c Y0;
    public final zn0 f26494a0;
    public final s4.j f26495b0;
    public final fo0 f26496c0;
    public final s4.c0 f26497d0;
    public final dl0 f26498e0;
    public boolean f26499f0;
    public final FrameLayout f26500g0;
    public final zn0 f26501h0;
    public final s4.c0 f26502i0;
    public final yl0 f26503j0;
    public final ho0 f26504k0;
    public final FrameLayout f26505l0;
    public final zn0 m0;
    public final s4.c0 f26506n0;
    public final yl0 f26507o0;
    public final ao0 f26508p0;
    public final lh0 f26509q0;
    public boolean f26510r0;
    public final FrameLayout f26511s0;
    public final zn0 f26512t0;
    public final s4.c0 f26513u0;
    public final yl0 f26514v0;
    public final do0 f26515w0;
    public ImageView f26516x0;
    public NumberTextView f26517y0;
    public boolean f26518z0;

    public mo0(Context context, org.telegram.ui.ty tyVar, int i10, int i11, int i12, long j3, org.telegram.ui.zx zxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f26510r0 = false;
        this.A0 = new HashMap();
        this.B0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.I0 = i17;
        this.T0 = 0;
        this.S0 = i12;
        this.U0 = j3;
        this.K0 = tyVar;
        this.Q0 = zxVar;
        s4.j jVar = new s4.j();
        this.f26495b0 = jVar;
        jVar.f43086c = 150L;
        jVar.e = 350L;
        jVar.f43087f = 0L;
        jVar.f43088g = 0L;
        jVar.d = 0L;
        jVar.f43089i = new OvershootInterpolator(1.1f);
        jVar.f43062o = sr.h;
        org.telegram.ui.ay ayVar = (org.telegram.ui.ay) this;
        this.f26496c0 = new fo0(ayVar, context, tyVar, i10, i11, jVar, tyVar.F, tyVar, context);
        if (i11 == 15) {
            ArrayList a42 = tyVar.a4(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < a42.size(); i18 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) a42.get(i18)).f18333id, arrayList, i18, 1)) {
            }
            this.f26496c0.f9767q0 = arrayList;
        }
        this.R0 = (cw0) tyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(ayVar, context, 21);
        this.W = w0Var;
        w0Var.setItemAnimator(this.f26495b0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.f26496c0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        w0Var.setVerticalScrollbarPosition(i13);
        s4.c0 c0Var = new s4.c0(1, false);
        this.f26497d0 = c0Var;
        w0Var.setLayoutManager(c0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
        w0Var.setOnScrollListener(new bo0(ayVar, tyVar, 2));
        w0Var.D0(new jc0(ayVar, 24));
        org.telegram.ui.w10 w10Var = new org.telegram.ui.w10(this.K0);
        this.N0 = w10Var;
        ai.w0 w0Var2 = w10Var.f38757b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new eo0(ayVar, 1));
        w0Var2.D0(new jc0(ayVar, 24));
        w10Var.setUiCallback(this);
        w10Var.setVisibility(8);
        w10Var.setChatPreviewDelegate(zxVar);
        v00 v00Var = new v00(context, null);
        v00Var.setViewType(1);
        zn0 zn0Var = new zn0(ayVar, context, v00Var, 2);
        this.f26494a0 = zn0Var;
        zn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        zn0Var.e.setVisibility(8);
        zn0Var.setVisibility(8);
        zn0Var.addView(v00Var, 0);
        zn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.addView(zn0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(w10Var);
        w0Var.setEmptyView(zn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f26500g0 = frameLayout2;
        go0 go0Var = new go0(ayVar);
        go0Var.f43040m = false;
        go0Var.C = false;
        sr srVar = sr.h;
        go0Var.o(srVar);
        go0Var.n(350L);
        yl0 yl0Var = new yl0(context, null);
        this.f26503j0 = yl0Var;
        yl0Var.setItemAnimator(go0Var);
        yl0Var.setPivotY(0.0f);
        yl0Var.setVerticalScrollBarEnabled(true);
        yl0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        yl0Var.setVerticalScrollbarPosition(i14);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.f26502i0 = c0Var2;
        yl0Var.setLayoutManager(c0Var2);
        yl0Var.Y1 = true;
        yl0Var.Z1 = 0;
        yl0Var.setClipToPadding(false);
        v00 v00Var2 = new v00(context, null);
        v00Var2.setViewType(1);
        zn0 zn0Var2 = new zn0(ayVar, context, v00Var2, 3);
        this.f26501h0 = zn0Var2;
        zn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        zn0Var2.e.setVisibility(8);
        zn0Var2.setVisibility(8);
        zn0Var2.addView(v00Var2, 0);
        zn0Var2.e(true, false);
        frameLayout2.addView(zn0Var2);
        frameLayout2.addView(yl0Var);
        yl0Var.setEmptyView(zn0Var2);
        ho0 ho0Var = new ho0(ayVar, yl0Var, context, this.I0, i12, tyVar);
        this.f26504k0 = ho0Var;
        yl0Var.setAdapter(ho0Var);
        yl0Var.setOnScrollListener(new bo0(ayVar, tyVar, 3));
        yl0Var.D0(new jc0(ayVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f26505l0 = frameLayout3;
        yn0 yn0Var = new yn0(ayVar);
        yn0Var.f43040m = false;
        yn0Var.C = false;
        yn0Var.o(srVar);
        yn0Var.n(350L);
        yl0 yl0Var2 = new yl0(context, null);
        this.f26507o0 = yl0Var2;
        yl0Var2.setItemAnimator(yn0Var);
        yl0Var2.setPivotY(0.0f);
        yl0Var2.setClipToPadding(false);
        yl0Var2.setVerticalScrollBarEnabled(true);
        yl0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        yl0Var2.setVerticalScrollbarPosition(i15);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.f26506n0 = c0Var3;
        yl0Var2.setLayoutManager(c0Var3);
        yl0Var2.Y1 = true;
        yl0Var2.Z1 = 0;
        v00 v00Var3 = new v00(context, null);
        v00Var3.setViewType(1);
        zn0 zn0Var3 = new zn0(ayVar, context, v00Var3, 0);
        this.m0 = zn0Var3;
        zn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        zn0Var3.e.setVisibility(8);
        zn0Var3.setVisibility(8);
        zn0Var3.addView(v00Var3, 0);
        zn0Var3.e(true, false);
        frameLayout3.addView(zn0Var3);
        frameLayout3.addView(yl0Var2);
        yl0Var2.setEmptyView(zn0Var3);
        ao0 ao0Var = new ao0(ayVar, yl0Var2, context, this.I0, i12);
        this.f26508p0 = ao0Var;
        yl0Var2.setAdapter(ao0Var);
        yl0Var2.setOnScrollListener(new bo0(ayVar, tyVar, 0));
        yl0Var2.D0(new jc0(ayVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f26511s0 = frameLayout4;
        co0 co0Var = new co0(ayVar);
        co0Var.f43040m = false;
        co0Var.C = false;
        co0Var.o(srVar);
        co0Var.n(350L);
        yl0 yl0Var3 = new yl0(context, null);
        this.f26514v0 = yl0Var3;
        yl0Var3.setItemAnimator(co0Var);
        yl0Var3.setPivotY(0.0f);
        yl0Var3.setVerticalScrollBarEnabled(true);
        yl0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        yl0Var3.setVerticalScrollbarPosition(i16);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.f26513u0 = c0Var4;
        yl0Var3.setLayoutManager(c0Var4);
        yl0Var3.Y1 = true;
        yl0Var3.Z1 = 0;
        yl0Var3.setClipToPadding(false);
        v00 v00Var4 = new v00(context, null);
        v00Var4.setViewType(1);
        zn0 zn0Var4 = new zn0(ayVar, context, v00Var4, 1);
        this.f26512t0 = zn0Var4;
        zn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        zn0Var4.e.setVisibility(8);
        zn0Var4.setVisibility(8);
        zn0Var4.addView(v00Var4, 0);
        zn0Var4.e(true, false);
        frameLayout4.addView(zn0Var4);
        frameLayout4.addView(yl0Var3);
        yl0Var3.setEmptyView(zn0Var4);
        do0 do0Var = new do0(ayVar, yl0Var3, context, this.I0);
        this.f26515w0 = do0Var;
        yl0Var3.setAdapter(do0Var);
        yl0Var3.setOnScrollListener(new bo0(ayVar, tyVar, 1));
        yl0Var3.D0(new jc0(ayVar, 24));
        this.f26498e0 = new dl0(w0Var, true);
        lh0 lh0Var = new lh0(context, tyVar);
        this.f26509q0 = lh0Var;
        t61 t61Var = lh0Var.f26051c;
        t61Var.setClipToPadding(false);
        t61Var.j(new eo0(ayVar, 0));
        t61Var.D0(new jc0(ayVar, 24));
        lo0 lo0Var = new lo0(ayVar);
        this.U = lo0Var;
        setAdapter(lo0Var);
    }

    public static org.telegram.ui.xn L(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.xn(bundle);
    }

    public static void Q(FrameLayout frameLayout, yl0 yl0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            yl0Var.p1(0, i10, 0, i11);
        } else {
            yl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void K() {
        if (this.f26510r0) {
            int i10 = 0;
            this.f26510r0 = false;
            S();
            n81 n81Var = this.M;
            if (n81Var != null && n81Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            fo0 fo0Var = this.f26496c0;
            if (fo0Var != null) {
                String str = this.L0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.B0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((gg.q0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                fo0Var.U(i10, str);
            }
        }
    }

    public final int M(int i10) {
        int i11 = 0;
        while (true) {
            lo0 lo0Var = this.U;
            ArrayList arrayList = lo0Var.f26106a;
            ArrayList arrayList2 = lo0Var.f26106a;
            if (i11 < arrayList.size()) {
                if (((ko0) arrayList2.get(i11)).f25807a == 3 && ((ko0) arrayList2.get(i11)).f25808b == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void N(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ai.w0 w0Var = this.W;
            if (i10 >= w0Var.getChildCount()) {
                break;
            }
            View childAt = w0Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.i6) || (childAt instanceof org.telegram.ui.Cells.s2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.k6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.w10) {
                arrayList.addAll(((org.telegram.ui.w10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.w10) {
                arrayList.addAll(((org.telegram.ui.w10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.w10 w10Var = this.N0;
        if (w10Var != null) {
            arrayList.addAll(w10Var.getThemeDescriptions());
        }
        zn0 zn0Var = this.f26494a0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(zn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(zn0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f19442y6));
        arrayList.addAll(w7.b6.a(new y6(this, 7), org.telegram.ui.ActionBar.i6.f19444y8));
    }

    public final boolean O() {
        int i10 = this.I0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.A0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i10, String str, boolean z10) {
        long j3;
        long j10;
        boolean z11;
        org.telegram.ui.w10 w10Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        zn0 zn0Var = this.f26494a0;
        if (isEmpty) {
            zn0Var.e.setVisibility(8);
        } else {
            zn0Var.e.setVisibility(0);
            zn0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        fo0 fo0Var = this.f26496c0;
        org.telegram.ui.dy dyVar = fo0Var.U;
        if (dyVar != null) {
            j3 = dyVar.a();
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
            ArrayList arrayList = this.B0;
            if (i11 >= arrayList.size()) {
                break;
            }
            gg.q0 q0Var = (gg.q0) arrayList.get(i11);
            int i12 = q0Var.d;
            if (i12 == 4) {
                TLObject tLObject = q0Var.f9887f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f18476id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j11 = -((TLRPC.Chat) q0Var.f9887f).f18329id;
                }
                j10 = j11;
            } else if (i12 == 6) {
                gg.o0 o0Var = q0Var.f9888g;
                long j14 = o0Var.f9862b;
                j13 = o0Var.f9863c;
                j12 = j14;
            } else if (i12 == 7) {
                z19 = true;
            }
            i11++;
        }
        do0 do0Var = this.f26515w0;
        do0Var.getClass();
        if (h40.X(str, null) == null) {
            K();
        }
        if (view == this.f26500g0) {
            MessagesController.getInstance(this.I0).getChannelRecommendations(0L);
            ho0 ho0Var = this.f26504k0;
            yl0 yl0Var = ho0Var.d;
            ArrayList arrayList2 = ho0Var.Q;
            ArrayList arrayList3 = ho0Var.R;
            ArrayList arrayList4 = ho0Var.S;
            ArrayList arrayList5 = ho0Var.P;
            zp zpVar = ho0Var.f29782c0;
            ho0Var.W();
            if (!TextUtils.equals(str, ho0Var.f29781b0)) {
                ho0Var.f29781b0 = str;
                AndroidUtilities.cancelRunOnUIThread(zpVar);
                if (TextUtils.isEmpty(ho0Var.f29781b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    ho0Var.N(true);
                    ho0Var.f29780a0++;
                    z18 = false;
                    ho0Var.W = false;
                    ho0Var.X = false;
                    ho0Var.Y = false;
                    ho0Var.Z = 0;
                    if (yl0Var != null) {
                        yl0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(zpVar, 1000L);
                    ho0Var.W = true;
                    ho0Var.X = true;
                    ho0Var.N(true);
                    if (yl0Var != null) {
                        z18 = false;
                        yl0Var.v0(0);
                    }
                }
                this.f26501h0.b(this.O0, z18);
            }
            z18 = false;
            this.f26501h0.b(this.O0, z18);
        } else if (view == this.f26505l0) {
            ao0 ao0Var = this.f26508p0;
            yl0 yl0Var2 = ao0Var.d;
            ArrayList arrayList6 = ao0Var.T;
            os osVar = ao0Var.f28685f0;
            if (TextUtils.equals(str, ao0Var.f28684e0)) {
                z17 = false;
            } else {
                ao0Var.f28684e0 = str;
                AndroidUtilities.cancelRunOnUIThread(osVar);
                if (TextUtils.isEmpty(ao0Var.f28684e0)) {
                    arrayList6.clear();
                    ao0Var.N(true);
                    ao0Var.f28683d0++;
                    z17 = false;
                    ao0Var.Z = false;
                    ao0Var.f28680a0 = false;
                    ao0Var.f28681b0 = false;
                    ao0Var.f28682c0 = 0;
                    if (yl0Var2 != null) {
                        yl0Var2.v0(0);
                    }
                } else {
                    z17 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(osVar, 1000L);
                    ao0Var.Z = true;
                    ao0Var.f28680a0 = true;
                    ao0Var.N(true);
                    if (yl0Var2 != null) {
                        yl0Var2.v0(0);
                    }
                }
            }
            this.m0.b(this.O0, z17);
            if (TextUtils.isEmpty(str)) {
                ao0Var.V();
            }
        } else {
            lh0 lh0Var = this.f26509q0;
            if (view == lh0Var) {
                t61 t61Var = lh0Var.f26051c;
                ArrayList arrayList7 = lh0Var.f26053n;
                if (!TextUtils.equals(lh0Var.f26056w, str)) {
                    if (lh0Var.K >= 0) {
                        ConnectionsManager.getInstance(lh0Var.f26050b).cancelRequest(lh0Var.K, true);
                        lh0Var.K = -1;
                    }
                    lh0Var.v = false;
                    lh0Var.H.setLoading(false);
                    lh0Var.f26056w = str;
                    if (TextUtils.isEmpty(str)) {
                        lh0Var.f26054r = 0;
                        z16 = true;
                        lh0Var.L++;
                        lh0Var.f26055s = false;
                        arrayList7.clear();
                        lh0Var.a(false);
                    } else {
                        z16 = true;
                        lh0Var.b(str);
                        lh0Var.f26054r = 0;
                        lh0Var.L++;
                        lh0Var.f26055s = false;
                        arrayList7.clear();
                    }
                    lh0Var.d();
                    t61Var.v0(0);
                    t61Var.Y2.N(z16);
                }
            } else if (view == this.f26511s0) {
                if (h40.X(str, null) != null) {
                    if (z10) {
                        this.f26513u0.h1(0, 0);
                    }
                    do0Var.Y(str);
                    this.f26512t0.b(this.O0, false);
                }
            } else if (view == this.V) {
                org.telegram.ui.w10 w10Var2 = this.N0;
                if ((j10 == 0 && this.U0 == 0 && j12 == 0 && j13 == 0) || j3 != 0) {
                    this.J0 = false;
                    fo0Var.U(z19 ? 1 : 0, str);
                    fo0Var.A0 = this.M0;
                    w10Var2.animate().setListener(null).cancel();
                    w10Var2.i(null, false);
                    if (z10) {
                        if (fo0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zn0Var.e(!z14, false);
                        if (fo0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zn0Var.e(z15, false);
                    } else if (!fo0Var.N()) {
                        if (fo0Var.D0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zn0Var.e(z13, true);
                    }
                    if (z10) {
                        w10Var2.setVisibility(8);
                    } else if (w10Var2.getVisibility() != 8) {
                        w10Var2.animate().alpha(0.0f).setListener(new fd0(this, 11)).setDuration(150L).start();
                    }
                    w10Var2.setTag(null);
                    w10Var = w10Var2;
                    z12 = false;
                } else {
                    boolean z20 = true;
                    w10Var2.setTag(1);
                    w10Var2.i(this.M0, false);
                    w10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        w10Var2.setVisibility(0);
                        w10Var2.setAlpha(1.0f);
                        z20 = z10;
                    } else {
                        if (w10Var2.getVisibility() != 0) {
                            w10Var2.setVisibility(0);
                            w10Var2.setAlpha(0.0f);
                        } else {
                            z20 = z10;
                        }
                        w10Var2.animate().alpha(1.0f).setDuration(150L).start();
                    }
                    w10Var = w10Var2;
                    z12 = false;
                    this.N0.h(j10, this.U0, j12, j13, null, z19, str, z20);
                    zn0Var.setVisibility(8);
                }
                zn0Var.b(this.O0, z12);
                w10Var.f38759c.b(this.O0, z12);
            } else {
                long j15 = j3;
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.w10) {
                    org.telegram.ui.w10 w10Var3 = (org.telegram.ui.w10) view;
                    if (j15 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w10Var3.setUseFromUserAsAvatar(z11);
                    w10Var3.f38759c.b(this.O0, false);
                    w10Var3.h(j10, this.U0, j16, j17, gg.s0.f9902c3[((ko0) this.U.f26106a.get(i10)).f25808b], z19, str, z10);
                } else if (view instanceof kn0) {
                    kn0 kn0Var = (kn0) view;
                    kn0Var.f25797a.b(this.O0, false);
                    kn0Var.K = str;
                    kn0Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z10) {
        xl0 xl0Var;
        xl0 xl0Var2;
        xl0 xl0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.dy dyVar;
        int i12;
        if (this.f26518z0 != z10) {
            org.telegram.ui.ty tyVar = this.K0;
            if (!z10 || !tyVar.getActionBar().t()) {
                int i13 = 72;
                if (z10 && !tyVar.getActionBar().a("search_view_pager")) {
                    this.G0 = tyVar.getActionBar().k("search_view_pager");
                    if (tyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f26516x0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f26516x0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                        this.f26516x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19444y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f26516x0.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19463z8, false), 1, -1));
                        this.f26516x0.setOnClickListener(new k80(this, 14));
                        this.G0.addView(this.f26516x0, w7.y5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.G0.getContext());
                    this.f26517y0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f26517y0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f26517y0;
                    int i14 = org.telegram.ui.ActionBar.i6.f19444y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                    org.telegram.ui.ActionBar.a0 a0Var = this.G0;
                    NumberTextView numberTextView3 = this.f26517y0;
                    if (tyVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    a0Var.addView(numberTextView3, w7.y5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f26517y0.setOnTouchListener(new bi.d(21));
                    org.telegram.ui.ActionBar.w0 h = this.G0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.C0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.D0 = this.G0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.E0 = this.G0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.F0 = this.G0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f26517y0 != null) {
                    fo0 fo0Var = this.f26496c0;
                    if (fo0Var != null && (dyVar = fo0Var.U) != null && dyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26517y0.getLayoutParams();
                    if (tyVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f26517y0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (tyVar.getActionBar().getBackButton() != null && (tyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
                    org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
                    tyVar.getActionBar().setBackButtonDrawable(h2Var);
                    h2Var.setColorFilter(null);
                }
                this.f26518z0 = z10;
                HashMap hashMap = this.A0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(tyVar.getParentActivity().getCurrentFocus());
                    tyVar.getActionBar().P(null, null);
                    this.f26517y0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.w0 w0Var = this.C0;
                    if (O()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    this.D0.setVisibility(0);
                    this.E0.setVisibility(0);
                    this.F0.setVisibility(0);
                    return;
                }
                tyVar.getActionBar().s();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.w10) && (xl0Var3 = ((org.telegram.ui.w10) getChildAt(i15)).d) != null) {
                        xl0Var3.l();
                    }
                    if (getChildAt(i15) instanceof kn0) {
                        ((kn0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.w10 w10Var = this.N0;
                if (w10Var != null && (xl0Var2 = w10Var.d) != null) {
                    xl0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.w10) && (xl0Var = ((org.telegram.ui.w10) view).d) != null) {
                        xl0Var.l();
                    }
                }
            }
        }
    }

    public final void S() {
        this.U.i();
        o(false);
        n81 n81Var = this.M;
        if (n81Var != null) {
            n81Var.f30376x.l();
        }
    }

    @Override
    public final void a() {
        R(true);
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f417a = true;
    }

    @Override
    public final boolean c(org.telegram.ui.o10 o10Var) {
        return this.A0.containsKey(o10Var);
    }

    @Override
    public final void d(MessageObject messageObject) {
        this.K0.presentFragment(L(messageObject, this.I0));
        R(false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z10 = false;
        ho0 ho0Var = this.f26504k0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.I0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f26501h0.e(z10, true);
            ho0Var.W();
            ho0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f26508p0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                do0 do0Var = this.f26515w0;
                if (obj == do0Var.Q) {
                    do0Var.N(true);
                }
            }
        } else {
            ho0Var.W();
            ho0Var.N(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.o10 o10Var = new org.telegram.ui.o10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.A0;
        if (hashMap.containsKey(o10Var)) {
            hashMap.remove(o10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(o10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.f26517y0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.D0;
            if (w0Var != null) {
                if (hashMap.size() == 1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                w0Var.setVisibility(i12);
            }
            if (this.C0 != null) {
                boolean O = O();
                if (O) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (this.C0.getVisibility() != i11) {
                    this.C0.setVisibility(i11);
                    int i14 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.C0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19444y8, false), PorterDuff.Mode.SRC_IN));
                    if (O) {
                        animatedVectorDrawable.start();
                    } else if (i14 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.F0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((MessageObject) hashMap.get((org.telegram.ui.o10) it.next())).isDownloadingFile) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = this.F0;
                if (!z10) {
                    i13 = 8;
                }
                w0Var2.setVisibility(i13);
            }
        }
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(o10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(o10Var));
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(o10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(o10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(o10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(hashMap.containsKey(o10Var), true);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.V;
                yl0 yl0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        yl0Var = this.W;
                    } else if (view == this.f26500g0) {
                        yl0Var = this.f26503j0;
                    } else if (view == this.f26505l0) {
                        yl0Var = this.f26507o0;
                    } else if (view == this.f26511s0) {
                        yl0Var = this.f26514v0;
                    } else {
                        kn0 kn0Var = this.H0;
                        if (view == kn0Var) {
                            yl0Var = kn0Var.f25798b;
                        } else {
                            lh0 lh0Var = this.f26509q0;
                            if (view == lh0Var) {
                                yl0Var = lh0Var.f26051c;
                            } else if (view instanceof org.telegram.ui.w10) {
                                yl0Var = ((org.telegram.ui.w10) view).f38757b;
                            }
                        }
                    }
                }
                if (yl0Var != null) {
                    gh.d.a(yl0Var, canvas, rectF, yl0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.w10 w10Var = this.N0;
                    if (w10Var.getVisibility() == 0) {
                        ai.w0 w0Var = w10Var.f38757b;
                        gh.d.a(w0Var, canvas, rectF, w0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f26518z0;
    }

    public org.telegram.ui.ActionBar.a0 getActionMode() {
        return this.G0;
    }

    public ArrayList<gg.q0> getCurrentSearchFilters() {
        return this.B0;
    }

    public kn0 getDownloadsContainer() {
        return this.H0;
    }

    public int getFolderId() {
        return this.S0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.w0 getSpeedItem() {
        return this.C0;
    }

    public x81 getTabsView() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.X0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.X0 = null;
        }
        this.X0 = NotificationCenter.getInstance(this.I0).createObserversGroup(this).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.dialogDeleted).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.reloadWebappsHints).add(NotificationCenter.storiesListUpdated);
        this.f26499f0 = true;
        ho0 ho0Var = this.f26504k0;
        if (ho0Var != null) {
            ho0Var.N(false);
        }
        ao0 ao0Var = this.f26508p0;
        if (ao0Var != null) {
            ao0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26499f0 = false;
        NotificationCenter.ObserversGroup observersGroup = this.X0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.X0 = null;
        }
    }

    @Override
    public final void s() {
        this.R0.M();
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        this.Y0 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.n10 n10Var) {
        this.M0 = n10Var;
    }

    public void setKeyboardHeight(int i10) {
        boolean z10;
        this.O0 = i10;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.w10) {
                ((org.telegram.ui.w10) getChildAt(i11)).f38759c.b(i10, z10);
            } else if (getChildAt(i11) == this.V) {
                this.f26494a0.b(i10, z10);
                this.N0.f38759c.b(i10, z10);
            } else if (getChildAt(i11) instanceof kn0) {
                ((kn0) getChildAt(i11)).f25797a.b(i10, z10);
            } else if (getChildAt(i11) == this.f26500g0) {
                this.f26501h0.b(i10, z10);
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
        fo0 fo0Var = this.f26496c0;
        org.telegram.ui.w10 w10Var = this.N0;
        if (i10 == 0) {
            if (w10Var.getVisibility() == 0) {
                w10Var.i(this.M0, false);
                fo0Var.A0 = null;
            } else {
                w10Var.i(null, false);
                org.telegram.ui.n10 n10Var = this.M0;
                fo0Var.A0 = n10Var;
                if (n10Var != null) {
                    ((org.telegram.ui.wv) n10Var).k(false, null, fo0Var.f9780y0, fo0Var.f9781z0);
                }
            }
        } else if (view instanceof org.telegram.ui.w10) {
            if (i11 == 0 && w10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.w10) view).i(this.M0, z10);
        }
        if (view2 instanceof org.telegram.ui.w10) {
            ((org.telegram.ui.w10) view2).i(null, false);
            return;
        }
        fo0Var.A0 = null;
        w10Var.i(null, false);
    }
}
