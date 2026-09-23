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
public abstract class yn0 extends h81 implements org.telegram.ui.t10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.v0 B0;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.ActionBar.v0 D0;
    public org.telegram.ui.ActionBar.v0 E0;
    public org.telegram.ui.ActionBar.z F0;
    public wm0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.ry J0;
    public String K0;
    public org.telegram.ui.l10 L0;
    public final org.telegram.ui.u10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.wx P0;
    public final pv0 Q0;
    public final int R0;
    public int S0;
    public final xn0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.w0 V;
    public int V0;
    public final ln0 W;
    public NotificationCenter.ObserversGroup W0;
    public ah.c X0;
    public final s4.j f30334a0;
    public final rn0 f30335b0;
    public final s4.c0 f30336c0;
    public final rk0 f30337d0;
    public boolean f30338e0;
    public final FrameLayout f30339f0;
    public final ln0 f30340g0;
    public final s4.c0 f30341h0;
    public final ml0 f30342i0;
    public final tn0 f30343j0;
    public final FrameLayout f30344k0;
    public final ln0 f30345l0;
    public final s4.c0 m0;
    public final ml0 f30346n0;
    public final mn0 f30347o0;
    public final zg0 f30348p0;
    public boolean f30349q0;
    public final FrameLayout f30350r0;
    public final ln0 f30351s0;
    public final s4.c0 f30352t0;
    public final ml0 f30353u0;
    public final pn0 f30354v0;
    public ImageView f30355w0;
    public NumberTextView f30356x0;
    public boolean f30357y0;
    public final HashMap f30358z0;

    public yn0(Context context, org.telegram.ui.ry ryVar, int i10, int i11, int i12, long j3, org.telegram.ui.wx wxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f30349q0 = false;
        this.f30358z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = ryVar;
        this.P0 = wxVar;
        s4.j jVar = new s4.j();
        this.f30334a0 = jVar;
        jVar.f42708c = 150L;
        jVar.e = 350L;
        jVar.f42709f = 0L;
        jVar.f42710g = 0L;
        jVar.d = 0L;
        jVar.f42711i = new OvershootInterpolator(1.1f);
        jVar.f42684o = rr.h;
        org.telegram.ui.ay ayVar = (org.telegram.ui.ay) this;
        this.f30335b0 = new rn0(ayVar, context, ryVar, i10, i11, jVar, ryVar.F, ryVar, context);
        if (i11 == 15) {
            ArrayList R3 = ryVar.R3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < R3.size(); i18 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) R3.get(i18)).f18087id, arrayList, i18, 1)) {
            }
            this.f30335b0.f9762q0 = arrayList;
        }
        this.Q0 = (pv0) ryVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(ayVar, context, 21);
        this.V = w0Var;
        w0Var.setItemAnimator(this.f30334a0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.f30335b0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        w0Var.setVerticalScrollbarPosition(i13);
        s4.c0 c0Var = new s4.c0(1, false);
        this.f30336c0 = c0Var;
        w0Var.setLayoutManager(c0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
        w0Var.setOnScrollListener(new nn0(ayVar, ryVar, 2));
        w0Var.C0(new ac0(ayVar, 23));
        org.telegram.ui.u10 u10Var = new org.telegram.ui.u10(this.J0);
        this.M0 = u10Var;
        ai.w0 w0Var2 = u10Var.f37846b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new qn0(ayVar, 1));
        w0Var2.C0(new ac0(ayVar, 23));
        u10Var.setUiCallback(this);
        u10Var.setVisibility(8);
        u10Var.setChatPreviewDelegate(wxVar);
        u00 u00Var = new u00(context, null);
        u00Var.setViewType(1);
        ln0 ln0Var = new ln0(ayVar, context, u00Var, 2);
        this.W = ln0Var;
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.e.setVisibility(8);
        ln0Var.setVisibility(8);
        ln0Var.addView(u00Var, 0);
        ln0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(ln0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(u10Var);
        w0Var.setEmptyView(ln0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f30339f0 = frameLayout2;
        sn0 sn0Var = new sn0(ayVar);
        sn0Var.f42662m = false;
        sn0Var.C = false;
        rr rrVar = rr.h;
        sn0Var.o(rrVar);
        sn0Var.n(350L);
        ml0 ml0Var = new ml0(context, null);
        this.f30342i0 = ml0Var;
        ml0Var.setItemAnimator(sn0Var);
        ml0Var.setPivotY(0.0f);
        ml0Var.setVerticalScrollBarEnabled(true);
        ml0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        ml0Var.setVerticalScrollbarPosition(i14);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.f30341h0 = c0Var2;
        ml0Var.setLayoutManager(c0Var2);
        ml0Var.Y1 = true;
        ml0Var.Z1 = 0;
        ml0Var.setClipToPadding(false);
        u00 u00Var2 = new u00(context, null);
        u00Var2.setViewType(1);
        ln0 ln0Var2 = new ln0(ayVar, context, u00Var2, 3);
        this.f30340g0 = ln0Var2;
        ln0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var2.e.setVisibility(8);
        ln0Var2.setVisibility(8);
        ln0Var2.addView(u00Var2, 0);
        ln0Var2.e(true, false);
        frameLayout2.addView(ln0Var2);
        frameLayout2.addView(ml0Var);
        ml0Var.setEmptyView(ln0Var2);
        tn0 tn0Var = new tn0(ayVar, ml0Var, context, this.H0, i12, ryVar);
        this.f30343j0 = tn0Var;
        ml0Var.setAdapter(tn0Var);
        ml0Var.setOnScrollListener(new nn0(ayVar, ryVar, 3));
        ml0Var.C0(new ac0(ayVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30344k0 = frameLayout3;
        kn0 kn0Var = new kn0(ayVar);
        kn0Var.f42662m = false;
        kn0Var.C = false;
        kn0Var.o(rrVar);
        kn0Var.n(350L);
        ml0 ml0Var2 = new ml0(context, null);
        this.f30346n0 = ml0Var2;
        ml0Var2.setItemAnimator(kn0Var);
        ml0Var2.setPivotY(0.0f);
        ml0Var2.setClipToPadding(false);
        ml0Var2.setVerticalScrollBarEnabled(true);
        ml0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        ml0Var2.setVerticalScrollbarPosition(i15);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.m0 = c0Var3;
        ml0Var2.setLayoutManager(c0Var3);
        ml0Var2.Y1 = true;
        ml0Var2.Z1 = 0;
        u00 u00Var3 = new u00(context, null);
        u00Var3.setViewType(1);
        ln0 ln0Var3 = new ln0(ayVar, context, u00Var3, 0);
        this.f30345l0 = ln0Var3;
        ln0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var3.e.setVisibility(8);
        ln0Var3.setVisibility(8);
        ln0Var3.addView(u00Var3, 0);
        ln0Var3.e(true, false);
        frameLayout3.addView(ln0Var3);
        frameLayout3.addView(ml0Var2);
        ml0Var2.setEmptyView(ln0Var3);
        mn0 mn0Var = new mn0(ayVar, ml0Var2, context, this.H0, i12);
        this.f30347o0 = mn0Var;
        ml0Var2.setAdapter(mn0Var);
        ml0Var2.setOnScrollListener(new nn0(ayVar, ryVar, 0));
        ml0Var2.C0(new ac0(ayVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f30350r0 = frameLayout4;
        on0 on0Var = new on0(ayVar);
        on0Var.f42662m = false;
        on0Var.C = false;
        on0Var.o(rrVar);
        on0Var.n(350L);
        ml0 ml0Var3 = new ml0(context, null);
        this.f30353u0 = ml0Var3;
        ml0Var3.setItemAnimator(on0Var);
        ml0Var3.setPivotY(0.0f);
        ml0Var3.setVerticalScrollBarEnabled(true);
        ml0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        ml0Var3.setVerticalScrollbarPosition(i16);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.f30352t0 = c0Var4;
        ml0Var3.setLayoutManager(c0Var4);
        ml0Var3.Y1 = true;
        ml0Var3.Z1 = 0;
        ml0Var3.setClipToPadding(false);
        u00 u00Var4 = new u00(context, null);
        u00Var4.setViewType(1);
        ln0 ln0Var4 = new ln0(ayVar, context, u00Var4, 1);
        this.f30351s0 = ln0Var4;
        ln0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var4.e.setVisibility(8);
        ln0Var4.setVisibility(8);
        ln0Var4.addView(u00Var4, 0);
        ln0Var4.e(true, false);
        frameLayout4.addView(ln0Var4);
        frameLayout4.addView(ml0Var3);
        ml0Var3.setEmptyView(ln0Var4);
        pn0 pn0Var = new pn0(ayVar, ml0Var3, context, this.H0);
        this.f30354v0 = pn0Var;
        ml0Var3.setAdapter(pn0Var);
        ml0Var3.setOnScrollListener(new nn0(ayVar, ryVar, 1));
        ml0Var3.C0(new ac0(ayVar, 23));
        this.f30337d0 = new rk0(w0Var, true);
        zg0 zg0Var = new zg0(context, ryVar);
        this.f30348p0 = zg0Var;
        d61 d61Var = zg0Var.f30587c;
        d61Var.setClipToPadding(false);
        d61Var.j(new qn0(ayVar, 0));
        d61Var.C0(new ac0(ayVar, 23));
        xn0 xn0Var = new xn0(ayVar);
        this.T = xn0Var;
        setAdapter(xn0Var);
    }

    public static org.telegram.ui.xn K(MessageObject messageObject, int i10) {
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

    public static void P(FrameLayout frameLayout, ml0 ml0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            ml0Var.o1(0, i10, 0, i11);
        } else {
            ml0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ml0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f30349q0) {
            int i10 = 0;
            this.f30349q0 = false;
            R();
            x71 x71Var = this.M;
            if (x71Var != null && x71Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            rn0 rn0Var = this.f30335b0;
            if (rn0Var != null) {
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
                rn0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            xn0 xn0Var = this.T;
            ArrayList arrayList = xn0Var.f30026a;
            ArrayList arrayList2 = xn0Var.f30026a;
            if (i11 < arrayList.size()) {
                if (((wn0) arrayList2.get(i11)).f29761a == 3 && ((wn0) arrayList2.get(i11)).f29762b == i10) {
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
            if ((childAt instanceof org.telegram.ui.Cells.i6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18789d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.u10) {
                arrayList.addAll(((org.telegram.ui.u10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.u10) {
                arrayList.addAll(((org.telegram.ui.u10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.u10 u10Var = this.M0;
        if (u10Var != null) {
            arrayList.addAll(u10Var.getThemeDescriptions());
        }
        ln0 ln0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.j6(ln0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(ln0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19170y6));
        arrayList.addAll(w7.a6.a(new y6(this, 7), org.telegram.ui.ActionBar.h6.f19172y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f30358z0.values()) {
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
        org.telegram.ui.u10 u10Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ln0 ln0Var = this.W;
        if (isEmpty) {
            ln0Var.e.setVisibility(8);
        } else {
            ln0Var.e.setVisibility(0);
            ln0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        rn0 rn0Var = this.f30335b0;
        org.telegram.ui.dy dyVar = rn0Var.U;
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
            ArrayList arrayList = this.A0;
            if (i11 >= arrayList.size()) {
                break;
            }
            gg.q0 q0Var = (gg.q0) arrayList.get(i11);
            int i12 = q0Var.d;
            if (i12 == 4) {
                TLObject tLObject = q0Var.f9882f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f18230id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j11 = -((TLRPC.Chat) q0Var.f9882f).f18083id;
                }
                j10 = j11;
            } else if (i12 == 6) {
                gg.o0 o0Var = q0Var.f9883g;
                long j14 = o0Var.f9857b;
                j13 = o0Var.f9858c;
                j12 = j14;
            } else if (i12 == 7) {
                z19 = true;
            }
            i11++;
        }
        pn0 pn0Var = this.f30354v0;
        pn0Var.getClass();
        if (f40.X(str, null) == null) {
            J();
        }
        if (view == this.f30339f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            tn0 tn0Var = this.f30343j0;
            ml0 ml0Var = tn0Var.d;
            ArrayList arrayList2 = tn0Var.Q;
            ArrayList arrayList3 = tn0Var.R;
            ArrayList arrayList4 = tn0Var.S;
            ArrayList arrayList5 = tn0Var.P;
            yp ypVar = tn0Var.f28550c0;
            tn0Var.W();
            if (!TextUtils.equals(str, tn0Var.f28549b0)) {
                tn0Var.f28549b0 = str;
                AndroidUtilities.cancelRunOnUIThread(ypVar);
                if (TextUtils.isEmpty(tn0Var.f28549b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    tn0Var.N(true);
                    tn0Var.f28548a0++;
                    z18 = false;
                    tn0Var.W = false;
                    tn0Var.X = false;
                    tn0Var.Y = false;
                    tn0Var.Z = 0;
                    if (ml0Var != null) {
                        ml0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(ypVar, 1000L);
                    tn0Var.W = true;
                    tn0Var.X = true;
                    tn0Var.N(true);
                    if (ml0Var != null) {
                        z18 = false;
                        ml0Var.u0(0);
                    }
                }
                this.f30340g0.b(this.N0, z18);
            }
            z18 = false;
            this.f30340g0.b(this.N0, z18);
        } else if (view == this.f30344k0) {
            mn0 mn0Var = this.f30347o0;
            ml0 ml0Var2 = mn0Var.d;
            ArrayList arrayList6 = mn0Var.T;
            ns nsVar = mn0Var.f27982f0;
            if (TextUtils.equals(str, mn0Var.f27981e0)) {
                z17 = false;
            } else {
                mn0Var.f27981e0 = str;
                AndroidUtilities.cancelRunOnUIThread(nsVar);
                if (TextUtils.isEmpty(mn0Var.f27981e0)) {
                    arrayList6.clear();
                    mn0Var.N(true);
                    mn0Var.f27980d0++;
                    z17 = false;
                    mn0Var.Z = false;
                    mn0Var.f27977a0 = false;
                    mn0Var.f27978b0 = false;
                    mn0Var.f27979c0 = 0;
                    if (ml0Var2 != null) {
                        ml0Var2.u0(0);
                    }
                } else {
                    z17 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(nsVar, 1000L);
                    mn0Var.Z = true;
                    mn0Var.f27977a0 = true;
                    mn0Var.N(true);
                    if (ml0Var2 != null) {
                        ml0Var2.u0(0);
                    }
                }
            }
            this.f30345l0.b(this.N0, z17);
            if (TextUtils.isEmpty(str)) {
                mn0Var.V();
            }
        } else {
            zg0 zg0Var = this.f30348p0;
            if (view == zg0Var) {
                d61 d61Var = zg0Var.f30587c;
                ArrayList arrayList7 = zg0Var.f30589n;
                if (!TextUtils.equals(zg0Var.f30592w, str)) {
                    if (zg0Var.K >= 0) {
                        ConnectionsManager.getInstance(zg0Var.f30586b).cancelRequest(zg0Var.K, true);
                        zg0Var.K = -1;
                    }
                    zg0Var.v = false;
                    zg0Var.H.setLoading(false);
                    zg0Var.f30592w = str;
                    if (TextUtils.isEmpty(str)) {
                        zg0Var.f30590r = 0;
                        z16 = true;
                        zg0Var.L++;
                        zg0Var.f30591s = false;
                        arrayList7.clear();
                        zg0Var.a(false);
                    } else {
                        z16 = true;
                        zg0Var.b(str);
                        zg0Var.f30590r = 0;
                        zg0Var.L++;
                        zg0Var.f30591s = false;
                        arrayList7.clear();
                    }
                    zg0Var.d();
                    d61Var.u0(0);
                    d61Var.Y2.N(z16);
                }
            } else if (view == this.f30350r0) {
                if (f40.X(str, null) != null) {
                    if (z10) {
                        this.f30352t0.h1(0, 0);
                    }
                    pn0Var.Y(str);
                    this.f30351s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                org.telegram.ui.u10 u10Var2 = this.M0;
                if ((j10 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) || j3 != 0) {
                    this.I0 = false;
                    rn0Var.U(z19 ? 1 : 0, str);
                    rn0Var.A0 = this.L0;
                    u10Var2.animate().setListener(null).cancel();
                    u10Var2.i(null, false);
                    if (z10) {
                        if (rn0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ln0Var.e(!z14, false);
                        if (rn0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        ln0Var.e(z15, false);
                    } else if (!rn0Var.N()) {
                        if (rn0Var.D0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ln0Var.e(z13, true);
                    }
                    if (z10) {
                        u10Var2.setVisibility(8);
                    } else if (u10Var2.getVisibility() != 8) {
                        u10Var2.animate().alpha(0.0f).setListener(new jd0(this, 10)).setDuration(150L).start();
                    }
                    u10Var2.setTag(null);
                    u10Var = u10Var2;
                    z12 = false;
                } else {
                    boolean z20 = true;
                    u10Var2.setTag(1);
                    u10Var2.i(this.L0, false);
                    u10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        u10Var2.setVisibility(0);
                        u10Var2.setAlpha(1.0f);
                        z20 = z10;
                    } else {
                        if (u10Var2.getVisibility() != 0) {
                            u10Var2.setVisibility(0);
                            u10Var2.setAlpha(0.0f);
                        } else {
                            z20 = z10;
                        }
                        u10Var2.animate().alpha(1.0f).setDuration(150L).start();
                    }
                    u10Var = u10Var2;
                    z12 = false;
                    this.M0.h(j10, this.T0, j12, j13, null, z19, str, z20);
                    ln0Var.setVisibility(8);
                }
                ln0Var.b(this.N0, z12);
                u10Var.f37848c.b(this.N0, z12);
            } else {
                long j15 = j3;
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.u10) {
                    org.telegram.ui.u10 u10Var3 = (org.telegram.ui.u10) view;
                    if (j15 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    u10Var3.setUseFromUserAsAvatar(z11);
                    u10Var3.f37848c.b(this.N0, false);
                    u10Var3.h(j10, this.T0, j16, j17, gg.s0.f9897c3[((wn0) this.T.f30026a.get(i10)).f29762b], z19, str, z10);
                } else if (view instanceof wm0) {
                    wm0 wm0Var = (wm0) view;
                    wm0Var.f29747a.b(this.N0, false);
                    wm0Var.K = str;
                    wm0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        ll0 ll0Var;
        ll0 ll0Var2;
        ll0 ll0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.dy dyVar;
        int i12;
        if (this.f30357y0 != z10) {
            org.telegram.ui.ry ryVar = this.J0;
            if (!z10 || !ryVar.getActionBar().s()) {
                int i13 = 72;
                if (z10 && !ryVar.getActionBar().a("search_view_pager")) {
                    this.F0 = ryVar.getActionBar().j("search_view_pager");
                    if (ryVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f30355w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f30355w0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                        this.f30355w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19172y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f30355w0.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19191z8, false), 1, -1));
                        this.f30355w0.setOnClickListener(new y70(this, 14));
                        this.F0.addView(this.f30355w0, w7.x5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
                    this.f30356x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f30356x0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f30356x0;
                    int i14 = org.telegram.ui.ActionBar.h6.f19172y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                    org.telegram.ui.ActionBar.z zVar = this.F0;
                    NumberTextView numberTextView3 = this.f30356x0;
                    if (ryVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    zVar.addView(numberTextView3, w7.x5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f30356x0.setOnTouchListener(new bi.d(21));
                    org.telegram.ui.ActionBar.v0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f30356x0 != null) {
                    rn0 rn0Var = this.f30335b0;
                    if (rn0Var != null && (dyVar = rn0Var.U) != null && dyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30356x0.getLayoutParams();
                    if (ryVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f30356x0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (ryVar.getActionBar().getBackButton() != null && (ryVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.d5)) {
                    org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
                    ryVar.getActionBar().setBackButtonDrawable(g2Var);
                    g2Var.setColorFilter(null);
                }
                this.f30357y0 = z10;
                HashMap hashMap = this.f30358z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(ryVar.getParentActivity().getCurrentFocus());
                    ryVar.getActionBar().O(null, null);
                    this.f30356x0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.v0 v0Var = this.B0;
                    if (N()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    v0Var.setVisibility(i10);
                    this.C0.setVisibility(0);
                    this.D0.setVisibility(0);
                    this.E0.setVisibility(0);
                    return;
                }
                ryVar.getActionBar().r();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.u10) && (ll0Var3 = ((org.telegram.ui.u10) getChildAt(i15)).d) != null) {
                        ll0Var3.l();
                    }
                    if (getChildAt(i15) instanceof wm0) {
                        ((wm0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.u10 u10Var = this.M0;
                if (u10Var != null && (ll0Var2 = u10Var.d) != null) {
                    ll0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.u10) && (ll0Var = ((org.telegram.ui.u10) view).d) != null) {
                        ll0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        x71 x71Var = this.M;
        if (x71Var != null) {
            x71Var.f24233x.l();
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
    public final boolean c(org.telegram.ui.m10 m10Var) {
        return this.f30358z0.containsKey(m10Var);
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
        tn0 tn0Var = this.f30343j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f30340g0.e(z10, true);
            tn0Var.W();
            tn0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f30347o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                pn0 pn0Var = this.f30354v0;
                if (obj == pn0Var.Q) {
                    pn0Var.N(true);
                }
            }
        } else {
            tn0Var.W();
            tn0Var.N(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.m10 m10Var = new org.telegram.ui.m10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f30358z0;
        if (hashMap.containsKey(m10Var)) {
            hashMap.remove(m10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(m10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.f30356x0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.v0 v0Var = this.C0;
            if (v0Var != null) {
                if (hashMap.size() == 1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                v0Var.setVisibility(i12);
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
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19172y8, false), PorterDuff.Mode.SRC_IN));
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
                        if (!((MessageObject) hashMap.get((org.telegram.ui.m10) it.next())).isDownloadingFile) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var2 = this.E0;
                if (!z10) {
                    i13 = 8;
                }
                v0Var2.setVisibility(i13);
            }
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).b(hashMap.containsKey(m10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(m10Var));
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(m10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).e(hashMap.containsKey(m10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(m10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(hashMap.containsKey(m10Var), true);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.U;
                ml0 ml0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        ml0Var = this.V;
                    } else if (view == this.f30339f0) {
                        ml0Var = this.f30342i0;
                    } else if (view == this.f30344k0) {
                        ml0Var = this.f30346n0;
                    } else if (view == this.f30350r0) {
                        ml0Var = this.f30353u0;
                    } else {
                        wm0 wm0Var = this.G0;
                        if (view == wm0Var) {
                            ml0Var = wm0Var.f29748b;
                        } else {
                            zg0 zg0Var = this.f30348p0;
                            if (view == zg0Var) {
                                ml0Var = zg0Var.f30587c;
                            } else if (view instanceof org.telegram.ui.u10) {
                                ml0Var = ((org.telegram.ui.u10) view).f37846b;
                            }
                        }
                    }
                }
                if (ml0Var != null) {
                    gh.d.a(ml0Var, canvas, rectF, ml0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.u10 u10Var = this.M0;
                    if (u10Var.getVisibility() == 0) {
                        ai.w0 w0Var = u10Var.f37846b;
                        gh.d.a(w0Var, canvas, rectF, w0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f30357y0;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.F0;
    }

    public ArrayList<gg.q0> getCurrentSearchFilters() {
        return this.A0;
    }

    public wm0 getDownloadsContainer() {
        return this.G0;
    }

    public int getFolderId() {
        return this.R0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.v0 getSpeedItem() {
        return this.B0;
    }

    public g81 getTabsView() {
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
        this.f30338e0 = true;
        tn0 tn0Var = this.f30343j0;
        if (tn0Var != null) {
            tn0Var.N(false);
        }
        mn0 mn0Var = this.f30347o0;
        if (mn0Var != null) {
            mn0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30338e0 = false;
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

    public void setFilteredSearchViewDelegate(org.telegram.ui.l10 l10Var) {
        this.L0 = l10Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.u10) {
                ((org.telegram.ui.u10) getChildAt(i11)).f37848c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f37848c.b(i10, z10);
            } else if (getChildAt(i11) instanceof wm0) {
                ((wm0) getChildAt(i11)).f29747a.b(i10, z10);
            } else if (getChildAt(i11) == this.f30339f0) {
                this.f30340g0.b(i10, z10);
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
        x71 x71Var = this.M;
        if (x71Var != null) {
            x71Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        rn0 rn0Var = this.f30335b0;
        org.telegram.ui.u10 u10Var = this.M0;
        if (i10 == 0) {
            if (u10Var.getVisibility() == 0) {
                u10Var.i(this.L0, false);
                rn0Var.A0 = null;
            } else {
                u10Var.i(null, false);
                org.telegram.ui.l10 l10Var = this.L0;
                rn0Var.A0 = l10Var;
                if (l10Var != null) {
                    ((org.telegram.ui.tv) l10Var).i(false, null, rn0Var.f9775y0, rn0Var.f9776z0);
                }
            }
        } else if (view instanceof org.telegram.ui.u10) {
            if (i11 == 0 && u10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.u10) view).i(this.L0, z10);
        }
        if (view2 instanceof org.telegram.ui.u10) {
            ((org.telegram.ui.u10) view2).i(null, false);
            return;
        }
        rn0Var.A0 = null;
        u10Var.i(null, false);
    }
}
