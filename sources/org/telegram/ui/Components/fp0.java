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
public abstract class fp0 extends q91 implements org.telegram.ui.u10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public do0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.sy J0;
    public String K0;
    public org.telegram.ui.m10 L0;
    public final org.telegram.ui.v10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.xx P0;
    public final uw0 Q0;
    public final int R0;
    public int S0;
    public final ep0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.w0 V;
    public int V0;
    public final so0 W;
    public NotificationCenter.ObserversGroup W0;
    public ah.c X0;
    public final s4.j f26436a0;
    public final yo0 f26437b0;
    public final s4.d0 f26438c0;
    public final xl0 f26439d0;
    public boolean f26440e0;
    public final FrameLayout f26441f0;
    public final so0 f26442g0;
    public final s4.d0 f26443h0;
    public final sm0 f26444i0;
    public final ap0 f26445j0;
    public final FrameLayout f26446k0;
    public final so0 f26447l0;
    public final s4.d0 m0;
    public final sm0 f26448n0;
    public final to0 f26449o0;
    public final ei0 f26450p0;
    public boolean f26451q0;
    public final FrameLayout f26452r0;
    public final so0 f26453s0;
    public final s4.d0 f26454t0;
    public final sm0 f26455u0;
    public final wo0 f26456v0;
    public ImageView f26457w0;
    public NumberTextView f26458x0;
    public boolean f26459y0;
    public final HashMap f26460z0;

    public fp0(Context context, org.telegram.ui.sy syVar, int i10, int i11, int i12, long j3, org.telegram.ui.xx xxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f26451q0 = false;
        this.f26460z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = syVar;
        this.P0 = xxVar;
        s4.j jVar = new s4.j();
        this.f26436a0 = jVar;
        jVar.f47840c = 150L;
        jVar.f47841e = 350L;
        jVar.f47842f = 0L;
        jVar.f47843g = 0L;
        jVar.d = 0L;
        jVar.f47844i = new OvershootInterpolator(1.1f);
        jVar.f47808o = is.h;
        org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this;
        this.f26437b0 = new yo0(cyVar, context, syVar, i10, i11, jVar, syVar.F, syVar, context);
        if (i11 == 15) {
            ArrayList O3 = syVar.O3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < O3.size(); i18 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) O3.get(i18)).f20036id, arrayList, i18, 1)) {
            }
            this.f26437b0.f10633q0 = arrayList;
        }
        this.Q0 = (uw0) syVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(cyVar, context, 21);
        this.V = w0Var;
        w0Var.setItemAnimator(this.f26436a0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.f26437b0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        w0Var.setVerticalScrollbarPosition(i13);
        s4.d0 d0Var = new s4.d0(1, false);
        this.f26438c0 = d0Var;
        w0Var.setLayoutManager(d0Var);
        w0Var.W1 = true;
        w0Var.X1 = 0;
        w0Var.setOnScrollListener(new uo0(cyVar, syVar, 2));
        w0Var.C0(new cd0(cyVar, 23));
        org.telegram.ui.v10 v10Var = new org.telegram.ui.v10(this.J0);
        this.M0 = v10Var;
        ai.w0 w0Var2 = v10Var.f42830b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new xo0(cyVar, 1));
        w0Var2.C0(new cd0(cyVar, 23));
        v10Var.setUiCallback(this);
        v10Var.setVisibility(8);
        v10Var.setChatPreviewDelegate(xxVar);
        k10 k10Var = new k10(context, null);
        k10Var.setViewType(1);
        so0 so0Var = new so0(cyVar, context, k10Var, 2);
        this.W = so0Var;
        so0Var.d.setText(LocaleController.getString(R.string.NoResult));
        so0Var.f25351e.setVisibility(8);
        so0Var.setVisibility(8);
        so0Var.addView(k10Var, 0);
        so0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(so0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(v10Var);
        w0Var.setEmptyView(so0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f26441f0 = frameLayout2;
        zo0 zo0Var = new zo0(cyVar);
        zo0Var.f47788m = false;
        zo0Var.C = false;
        is isVar = is.h;
        zo0Var.o(isVar);
        zo0Var.n(350L);
        sm0 sm0Var = new sm0(context, null);
        this.f26444i0 = sm0Var;
        sm0Var.setItemAnimator(zo0Var);
        sm0Var.setPivotY(0.0f);
        sm0Var.setVerticalScrollBarEnabled(true);
        sm0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        sm0Var.setVerticalScrollbarPosition(i14);
        s4.d0 d0Var2 = new s4.d0(1, false);
        this.f26443h0 = d0Var2;
        sm0Var.setLayoutManager(d0Var2);
        sm0Var.W1 = true;
        sm0Var.X1 = 0;
        sm0Var.setClipToPadding(false);
        k10 k10Var2 = new k10(context, null);
        k10Var2.setViewType(1);
        so0 so0Var2 = new so0(cyVar, context, k10Var2, 3);
        this.f26442g0 = so0Var2;
        so0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        so0Var2.f25351e.setVisibility(8);
        so0Var2.setVisibility(8);
        so0Var2.addView(k10Var2, 0);
        so0Var2.e(true, false);
        frameLayout2.addView(so0Var2);
        frameLayout2.addView(sm0Var);
        sm0Var.setEmptyView(so0Var2);
        ap0 ap0Var = new ap0(cyVar, sm0Var, context, this.H0, i12, syVar);
        this.f26445j0 = ap0Var;
        sm0Var.setAdapter(ap0Var);
        sm0Var.setOnScrollListener(new uo0(cyVar, syVar, 3));
        sm0Var.C0(new cd0(cyVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f26446k0 = frameLayout3;
        ro0 ro0Var = new ro0(cyVar);
        ro0Var.f47788m = false;
        ro0Var.C = false;
        ro0Var.o(isVar);
        ro0Var.n(350L);
        sm0 sm0Var2 = new sm0(context, null);
        this.f26448n0 = sm0Var2;
        sm0Var2.setItemAnimator(ro0Var);
        sm0Var2.setPivotY(0.0f);
        sm0Var2.setClipToPadding(false);
        sm0Var2.setVerticalScrollBarEnabled(true);
        sm0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        sm0Var2.setVerticalScrollbarPosition(i15);
        s4.d0 d0Var3 = new s4.d0(1, false);
        this.m0 = d0Var3;
        sm0Var2.setLayoutManager(d0Var3);
        sm0Var2.W1 = true;
        sm0Var2.X1 = 0;
        k10 k10Var3 = new k10(context, null);
        k10Var3.setViewType(1);
        so0 so0Var3 = new so0(cyVar, context, k10Var3, 0);
        this.f26447l0 = so0Var3;
        so0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        so0Var3.f25351e.setVisibility(8);
        so0Var3.setVisibility(8);
        so0Var3.addView(k10Var3, 0);
        so0Var3.e(true, false);
        frameLayout3.addView(so0Var3);
        frameLayout3.addView(sm0Var2);
        sm0Var2.setEmptyView(so0Var3);
        to0 to0Var = new to0(cyVar, sm0Var2, context, this.H0, i12);
        this.f26449o0 = to0Var;
        sm0Var2.setAdapter(to0Var);
        sm0Var2.setOnScrollListener(new uo0(cyVar, syVar, 0));
        sm0Var2.C0(new cd0(cyVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f26452r0 = frameLayout4;
        vo0 vo0Var = new vo0(cyVar);
        vo0Var.f47788m = false;
        vo0Var.C = false;
        vo0Var.o(isVar);
        vo0Var.n(350L);
        sm0 sm0Var3 = new sm0(context, null);
        this.f26455u0 = sm0Var3;
        sm0Var3.setItemAnimator(vo0Var);
        sm0Var3.setPivotY(0.0f);
        sm0Var3.setVerticalScrollBarEnabled(true);
        sm0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        sm0Var3.setVerticalScrollbarPosition(i16);
        s4.d0 d0Var4 = new s4.d0(1, false);
        this.f26454t0 = d0Var4;
        sm0Var3.setLayoutManager(d0Var4);
        sm0Var3.W1 = true;
        sm0Var3.X1 = 0;
        sm0Var3.setClipToPadding(false);
        k10 k10Var4 = new k10(context, null);
        k10Var4.setViewType(1);
        so0 so0Var4 = new so0(cyVar, context, k10Var4, 1);
        this.f26453s0 = so0Var4;
        so0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        so0Var4.f25351e.setVisibility(8);
        so0Var4.setVisibility(8);
        so0Var4.addView(k10Var4, 0);
        so0Var4.e(true, false);
        frameLayout4.addView(so0Var4);
        frameLayout4.addView(sm0Var3);
        sm0Var3.setEmptyView(so0Var4);
        wo0 wo0Var = new wo0(cyVar, sm0Var3, context, this.H0);
        this.f26456v0 = wo0Var;
        sm0Var3.setAdapter(wo0Var);
        sm0Var3.setOnScrollListener(new uo0(cyVar, syVar, 1));
        sm0Var3.C0(new cd0(cyVar, 23));
        this.f26439d0 = new xl0(w0Var, true);
        ei0 ei0Var = new ei0(context, syVar);
        this.f26450p0 = ei0Var;
        m71 m71Var = ei0Var.f26018c;
        m71Var.setClipToPadding(false);
        m71Var.j(new xo0(cyVar, 0));
        m71Var.C0(new cd0(cyVar, 23));
        ep0 ep0Var = new ep0(cyVar);
        this.T = ep0Var;
        setAdapter(ep0Var);
    }

    public static org.telegram.ui.zn K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.zn(bundle);
    }

    public static void P(FrameLayout frameLayout, sm0 sm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            sm0Var.o1(0, i10, 0, i11);
        } else {
            sm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f26451q0) {
            int i10 = 0;
            this.f26451q0 = false;
            R();
            f91 f91Var = this.M;
            if (f91Var != null && f91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            yo0 yo0Var = this.f26437b0;
            if (yo0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((gg.p0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                yo0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            ep0 ep0Var = this.T;
            ArrayList arrayList = ep0Var.f26113a;
            ArrayList arrayList2 = ep0Var.f26113a;
            if (i11 < arrayList.size()) {
                if (((dp0) arrayList2.get(i11)).f25654a == 3 && ((dp0) arrayList2.get(i11)).f25655b == i10) {
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
                arrayList.add(new org.telegram.ui.ActionBar.j6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20786d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.v10) {
                arrayList.addAll(((org.telegram.ui.v10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.v10) {
                arrayList.addAll(((org.telegram.ui.v10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.v10 v10Var = this.M0;
        if (v10Var != null) {
            arrayList.addAll(v10Var.getThemeDescriptions());
        }
        so0 so0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.j6(so0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(so0Var.f25351e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21171y6));
        arrayList.addAll(w7.a6.a(new a7(this, 7), org.telegram.ui.ActionBar.h6.f21173y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f26460z0.values()) {
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
        boolean z12;
        boolean z13;
        org.telegram.ui.v10 v10Var;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        so0 so0Var = this.W;
        if (isEmpty) {
            so0Var.f25351e.setVisibility(8);
        } else {
            so0Var.f25351e.setVisibility(0);
            so0Var.f25351e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        yo0 yo0Var = this.f26437b0;
        org.telegram.ui.ey eyVar = yo0Var.U;
        if (eyVar != null) {
            j3 = eyVar.a();
        } else {
            j3 = 0;
        }
        if (i10 == 0) {
            j10 = 0;
        } else {
            j10 = j3;
        }
        int i11 = 0;
        boolean z20 = false;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            ArrayList arrayList = this.A0;
            if (i11 >= arrayList.size()) {
                break;
            }
            gg.p0 p0Var = (gg.p0) arrayList.get(i11);
            int i12 = p0Var.d;
            if (i12 == 4) {
                TLObject tLObject = p0Var.f10763f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f20179id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j11 = -((TLRPC.Chat) p0Var.f10763f).f20032id;
                }
                j10 = j11;
            } else if (i12 == 6) {
                gg.n0 n0Var = p0Var.f10764g;
                long j14 = n0Var.f10736b;
                j13 = n0Var.f10737c;
                j12 = j14;
            } else if (i12 == 7) {
                z20 = true;
            }
            i11++;
        }
        wo0 wo0Var = this.f26456v0;
        wo0Var.getClass();
        if (w40.X(str, null) == null) {
            J();
        }
        if (view == this.f26441f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            ap0 ap0Var = this.f26445j0;
            sm0 sm0Var = ap0Var.d;
            ArrayList arrayList2 = ap0Var.Q;
            ArrayList arrayList3 = ap0Var.R;
            ArrayList arrayList4 = ap0Var.S;
            ArrayList arrayList5 = ap0Var.P;
            nq nqVar = ap0Var.f28457c0;
            ap0Var.W();
            if (!TextUtils.equals(str, ap0Var.f28456b0)) {
                ap0Var.f28456b0 = str;
                AndroidUtilities.cancelRunOnUIThread(nqVar);
                if (TextUtils.isEmpty(ap0Var.f28456b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    ap0Var.N(true);
                    ap0Var.f28455a0++;
                    z19 = false;
                    ap0Var.W = false;
                    ap0Var.X = false;
                    ap0Var.Y = false;
                    ap0Var.Z = 0;
                    if (sm0Var != null) {
                        sm0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(nqVar, 1000L);
                    ap0Var.W = true;
                    ap0Var.X = true;
                    ap0Var.N(true);
                    if (sm0Var != null) {
                        z19 = false;
                        sm0Var.u0(0);
                    }
                }
                this.f26442g0.b(this.N0, z19);
            }
            z19 = false;
            this.f26442g0.b(this.N0, z19);
        } else if (view == this.f26446k0) {
            to0 to0Var = this.f26449o0;
            sm0 sm0Var2 = to0Var.d;
            ArrayList arrayList6 = to0Var.T;
            dt dtVar = to0Var.f27749f0;
            if (TextUtils.equals(str, to0Var.f27748e0)) {
                z18 = false;
            } else {
                to0Var.f27748e0 = str;
                AndroidUtilities.cancelRunOnUIThread(dtVar);
                if (TextUtils.isEmpty(to0Var.f27748e0)) {
                    arrayList6.clear();
                    to0Var.N(true);
                    to0Var.f27747d0++;
                    z18 = false;
                    to0Var.Z = false;
                    to0Var.f27744a0 = false;
                    to0Var.f27745b0 = false;
                    to0Var.f27746c0 = 0;
                    if (sm0Var2 != null) {
                        sm0Var2.u0(0);
                    }
                } else {
                    z18 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(dtVar, 1000L);
                    to0Var.Z = true;
                    to0Var.f27744a0 = true;
                    to0Var.N(true);
                    if (sm0Var2 != null) {
                        sm0Var2.u0(0);
                    }
                }
            }
            this.f26447l0.b(this.N0, z18);
            if (TextUtils.isEmpty(str)) {
                to0Var.V();
            }
        } else {
            ei0 ei0Var = this.f26450p0;
            if (view == ei0Var) {
                m71 m71Var = ei0Var.f26018c;
                ArrayList arrayList7 = ei0Var.f26021n;
                if (!TextUtils.equals(ei0Var.f26024w, str)) {
                    if (ei0Var.K >= 0) {
                        ConnectionsManager.getInstance(ei0Var.f26017b).cancelRequest(ei0Var.K, true);
                        ei0Var.K = -1;
                    }
                    ei0Var.v = false;
                    ei0Var.H.setLoading(false);
                    ei0Var.f26024w = str;
                    if (TextUtils.isEmpty(str)) {
                        ei0Var.f26022r = 0;
                        z17 = true;
                        ei0Var.L++;
                        ei0Var.f26023s = false;
                        arrayList7.clear();
                        ei0Var.a(false);
                    } else {
                        z17 = true;
                        ei0Var.b(str);
                        ei0Var.f26022r = 0;
                        ei0Var.L++;
                        ei0Var.f26023s = false;
                        arrayList7.clear();
                    }
                    ei0Var.d();
                    m71Var.u0(0);
                    m71Var.W2.N(z17);
                }
            } else if (view == this.f26452r0) {
                if (w40.X(str, null) != null) {
                    if (z10) {
                        this.f26454t0.h1(0, 0);
                    }
                    wo0Var.Y(str);
                    this.f26453s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.v10 v10Var2 = this.M0;
                if ((i13 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) || j3 != 0) {
                    this.I0 = false;
                    yo0Var.U(z20 ? 1 : 0, str);
                    yo0Var.A0 = this.L0;
                    v10Var2.animate().setListener(null).cancel();
                    v10Var2.i(null, false);
                    if (z10) {
                        if (yo0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        so0Var.e(!z15, false);
                        if (yo0Var.D0 > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        so0Var.e(z16, false);
                    } else if (!yo0Var.N()) {
                        if (yo0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        so0Var.e(z14, true);
                    }
                    if (z10) {
                        v10Var2.setVisibility(8);
                    } else if (v10Var2.getVisibility() != 8) {
                        v10Var2.animate().alpha(0.0f).setListener(new wd0(this, 11)).setDuration(150L).start();
                    }
                    v10Var2.setTag(null);
                    v10Var = v10Var2;
                    z13 = false;
                } else {
                    boolean z21 = true;
                    v10Var2.setTag(1);
                    v10Var2.i(this.L0, false);
                    v10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        v10Var2.setVisibility(0);
                        v10Var2.setAlpha(1.0f);
                        z12 = z10;
                    } else {
                        if (v10Var2.getVisibility() != 0) {
                            v10Var2.setVisibility(0);
                            v10Var2.setAlpha(0.0f);
                        } else {
                            z21 = z10;
                        }
                        v10Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z12 = z21;
                    }
                    z13 = false;
                    long j15 = j10;
                    v10Var = v10Var2;
                    this.M0.h(j15, this.T0, j12, j13, null, z20, str, z12);
                    so0Var.setVisibility(8);
                }
                so0Var.b(this.N0, z13);
                v10Var.f42832c.b(this.N0, z13);
            } else {
                long j16 = j3;
                long j17 = j12;
                long j18 = j13;
                if (view instanceof org.telegram.ui.v10) {
                    org.telegram.ui.v10 v10Var3 = (org.telegram.ui.v10) view;
                    if (j16 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v10Var3.setUseFromUserAsAvatar(z11);
                    v10Var3.f42832c.b(this.N0, false);
                    v10Var3.h(j10, this.T0, j17, j18, gg.r0.f10778a3[((dp0) this.T.f26113a.get(i10)).f25655b], z20, str, z10);
                } else if (view instanceof do0) {
                    do0 do0Var = (do0) view;
                    do0Var.f25643a.b(this.N0, false);
                    do0Var.K = str;
                    do0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        rm0 rm0Var;
        rm0 rm0Var2;
        rm0 rm0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.ey eyVar;
        int i12;
        if (this.f26459y0 != z10) {
            org.telegram.ui.sy syVar = this.J0;
            if (!z10 || !syVar.getActionBar().t()) {
                int i13 = 72;
                if (z10 && !syVar.getActionBar().a("search_view_pager")) {
                    this.F0 = syVar.getActionBar().j("search_view_pager");
                    if (syVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f26457w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f26457w0.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
                        this.f26457w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21173y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f26457w0.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21191z8, false), 1, -1));
                        this.f26457w0.setOnClickListener(new c90(this, 13));
                        this.F0.addView(this.f26457w0, w7.x5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
                    this.f26458x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f26458x0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f26458x0;
                    int i14 = org.telegram.ui.ActionBar.h6.f21173y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.y yVar = this.F0;
                    NumberTextView numberTextView3 = this.f26458x0;
                    if (syVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(numberTextView3, w7.x5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f26458x0.setOnTouchListener(new bi.d(21));
                    org.telegram.ui.ActionBar.u0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f26458x0 != null) {
                    yo0 yo0Var = this.f26437b0;
                    if (yo0Var != null && (eyVar = yo0Var.U) != null && eyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26458x0.getLayoutParams();
                    if (syVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f26458x0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (syVar.getActionBar().getBackButton() != null && (syVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
                    syVar.getActionBar().setBackButtonDrawable(f2Var);
                    f2Var.setColorFilter(null);
                }
                this.f26459y0 = z10;
                HashMap hashMap = this.f26460z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(syVar.getParentActivity().getCurrentFocus());
                    syVar.getActionBar().O(null, null);
                    this.f26458x0.a(hashMap.size(), false);
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
                syVar.getActionBar().s();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.v10) && (rm0Var3 = ((org.telegram.ui.v10) getChildAt(i15)).d) != null) {
                        rm0Var3.l();
                    }
                    if (getChildAt(i15) instanceof do0) {
                        ((do0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.v10 v10Var = this.M0;
                if (v10Var != null && (rm0Var2 = v10Var.d) != null) {
                    rm0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.v10) && (rm0Var = ((org.telegram.ui.v10) view).d) != null) {
                        rm0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        f91 f91Var = this.M;
        if (f91Var != null) {
            f91Var.f29684x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f536a = true;
    }

    @Override
    public final boolean c(org.telegram.ui.n10 n10Var) {
        return this.f26460z0.containsKey(n10Var);
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
        ap0 ap0Var = this.f26445j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f26442g0.e(z10, true);
            ap0Var.W();
            ap0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f26449o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                wo0 wo0Var = this.f26456v0;
                if (obj == wo0Var.Q) {
                    wo0Var.N(true);
                }
            }
        } else {
            ap0Var.W();
            ap0Var.N(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.n10 n10Var = new org.telegram.ui.n10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f26460z0;
        if (hashMap.containsKey(n10Var)) {
            hashMap.remove(n10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(n10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.f26458x0.a(hashMap.size(), true);
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
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21173y8, false), PorterDuff.Mode.SRC_IN));
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
                        if (!((MessageObject) hashMap.get((org.telegram.ui.n10) it.next())).isDownloadingFile) {
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
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(n10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(n10Var));
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(n10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(n10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(n10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(hashMap.containsKey(n10Var), true);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.U;
                sm0 sm0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        sm0Var = this.V;
                    } else if (view == this.f26441f0) {
                        sm0Var = this.f26444i0;
                    } else if (view == this.f26446k0) {
                        sm0Var = this.f26448n0;
                    } else if (view == this.f26452r0) {
                        sm0Var = this.f26455u0;
                    } else {
                        do0 do0Var = this.G0;
                        if (view == do0Var) {
                            sm0Var = do0Var.f25644b;
                        } else {
                            ei0 ei0Var = this.f26450p0;
                            if (view == ei0Var) {
                                sm0Var = ei0Var.f26018c;
                            } else if (view instanceof org.telegram.ui.v10) {
                                sm0Var = ((org.telegram.ui.v10) view).f42830b;
                            }
                        }
                    }
                }
                if (sm0Var != null) {
                    gh.d.a(sm0Var, canvas, rectF, sm0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.v10 v10Var = this.M0;
                    if (v10Var.getVisibility() == 0) {
                        ai.w0 w0Var = v10Var.f42830b;
                        gh.d.a(w0Var, canvas, rectF, w0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f26459y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<gg.p0> getCurrentSearchFilters() {
        return this.A0;
    }

    public do0 getDownloadsContainer() {
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

    public p91 getTabsView() {
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
        this.f26440e0 = true;
        ap0 ap0Var = this.f26445j0;
        if (ap0Var != null) {
            ap0Var.N(false);
        }
        to0 to0Var = this.f26449o0;
        if (to0Var != null) {
            to0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26440e0 = false;
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

    public void setFilteredSearchViewDelegate(org.telegram.ui.m10 m10Var) {
        this.L0 = m10Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.v10) {
                ((org.telegram.ui.v10) getChildAt(i11)).f42832c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f42832c.b(i10, z10);
            } else if (getChildAt(i11) instanceof do0) {
                ((do0) getChildAt(i11)).f25643a.b(i10, z10);
            } else if (getChildAt(i11) == this.f26441f0) {
                this.f26442g0.b(i10, z10);
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
        f91 f91Var = this.M;
        if (f91Var != null) {
            f91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        yo0 yo0Var = this.f26437b0;
        org.telegram.ui.v10 v10Var = this.M0;
        if (i10 == 0) {
            if (v10Var.getVisibility() == 0) {
                v10Var.i(this.L0, false);
                yo0Var.A0 = null;
            } else {
                v10Var.i(null, false);
                org.telegram.ui.m10 m10Var = this.L0;
                yo0Var.A0 = m10Var;
                if (m10Var != null) {
                    ((org.telegram.ui.uv) m10Var).i(false, null, yo0Var.f10646y0, yo0Var.f10647z0);
                }
            }
        } else if (view instanceof org.telegram.ui.v10) {
            if (i11 == 0 && v10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.v10) view).i(this.L0, z10);
        }
        if (view2 instanceof org.telegram.ui.v10) {
            ((org.telegram.ui.v10) view2).i(null, false);
            return;
        }
        yo0Var.A0 = null;
        v10Var.i(null, false);
    }
}
