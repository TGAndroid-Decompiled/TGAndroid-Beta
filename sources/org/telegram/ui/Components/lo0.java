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
public abstract class lo0 extends w81 implements org.telegram.ui.s10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public in0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.qy J0;
    public String K0;
    public org.telegram.ui.k10 L0;
    public final org.telegram.ui.t10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.vx P0;
    public final aw0 Q0;
    public final int R0;
    public int S0;
    public final ko0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.w0 V;
    public int V0;
    public final yn0 W;
    public NotificationCenter.ObserversGroup W0;
    public ah.c X0;
    public final s4.j f26143a0;
    public final eo0 f26144b0;
    public final s4.c0 f26145c0;
    public final bl0 f26146d0;
    public boolean f26147e0;
    public final FrameLayout f26148f0;
    public final yn0 f26149g0;
    public final s4.c0 f26150h0;
    public final wl0 f26151i0;
    public final go0 f26152j0;
    public final FrameLayout f26153k0;
    public final yn0 f26154l0;
    public final s4.c0 m0;
    public final wl0 f26155n0;
    public final zn0 f26156o0;
    public final jh0 f26157p0;
    public boolean f26158q0;
    public final FrameLayout f26159r0;
    public final yn0 f26160s0;
    public final s4.c0 f26161t0;
    public final wl0 f26162u0;
    public final co0 f26163v0;
    public ImageView f26164w0;
    public NumberTextView f26165x0;
    public boolean f26166y0;
    public final HashMap f26167z0;

    public lo0(Context context, org.telegram.ui.qy qyVar, int i10, int i11, int i12, long j3, org.telegram.ui.vx vxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f26158q0 = false;
        this.f26167z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = qyVar;
        this.P0 = vxVar;
        s4.j jVar = new s4.j();
        this.f26143a0 = jVar;
        jVar.f43027c = 150L;
        jVar.e = 350L;
        jVar.f43028f = 0L;
        jVar.f43029g = 0L;
        jVar.d = 0L;
        jVar.f43030i = new OvershootInterpolator(1.1f);
        jVar.f43003o = rr.h;
        org.telegram.ui.zx zxVar = (org.telegram.ui.zx) this;
        this.f26144b0 = new eo0(zxVar, context, qyVar, i10, i11, jVar, qyVar.F, qyVar, context);
        if (i11 == 15) {
            ArrayList R3 = qyVar.R3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < R3.size(); i18 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) R3.get(i18)).f18325id, arrayList, i18, 1)) {
            }
            this.f26144b0.f9761q0 = arrayList;
        }
        this.Q0 = (aw0) qyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(zxVar, context, 21);
        this.V = w0Var;
        w0Var.setItemAnimator(this.f26143a0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.f26144b0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        w0Var.setVerticalScrollbarPosition(i13);
        s4.c0 c0Var = new s4.c0(1, false);
        this.f26145c0 = c0Var;
        w0Var.setLayoutManager(c0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
        w0Var.setOnScrollListener(new ao0(zxVar, qyVar, 2));
        w0Var.C0(new ic0(zxVar, 24));
        org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(this.J0);
        this.M0 = t10Var;
        ai.w0 w0Var2 = t10Var.f37904b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new do0(zxVar, 1));
        w0Var2.C0(new ic0(zxVar, 24));
        t10Var.setUiCallback(this);
        t10Var.setVisibility(8);
        t10Var.setChatPreviewDelegate(vxVar);
        u00 u00Var = new u00(context, null);
        u00Var.setViewType(1);
        yn0 yn0Var = new yn0(zxVar, context, u00Var, 2);
        this.W = yn0Var;
        yn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var.e.setVisibility(8);
        yn0Var.setVisibility(8);
        yn0Var.addView(u00Var, 0);
        yn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(yn0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(t10Var);
        w0Var.setEmptyView(yn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f26148f0 = frameLayout2;
        fo0 fo0Var = new fo0(zxVar);
        fo0Var.f42981m = false;
        fo0Var.C = false;
        rr rrVar = rr.h;
        fo0Var.o(rrVar);
        fo0Var.n(350L);
        wl0 wl0Var = new wl0(context, null);
        this.f26151i0 = wl0Var;
        wl0Var.setItemAnimator(fo0Var);
        wl0Var.setPivotY(0.0f);
        wl0Var.setVerticalScrollBarEnabled(true);
        wl0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        wl0Var.setVerticalScrollbarPosition(i14);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.f26150h0 = c0Var2;
        wl0Var.setLayoutManager(c0Var2);
        wl0Var.Y1 = true;
        wl0Var.Z1 = 0;
        wl0Var.setClipToPadding(false);
        u00 u00Var2 = new u00(context, null);
        u00Var2.setViewType(1);
        yn0 yn0Var2 = new yn0(zxVar, context, u00Var2, 3);
        this.f26149g0 = yn0Var2;
        yn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var2.e.setVisibility(8);
        yn0Var2.setVisibility(8);
        yn0Var2.addView(u00Var2, 0);
        yn0Var2.e(true, false);
        frameLayout2.addView(yn0Var2);
        frameLayout2.addView(wl0Var);
        wl0Var.setEmptyView(yn0Var2);
        go0 go0Var = new go0(zxVar, wl0Var, context, this.H0, i12, qyVar);
        this.f26152j0 = go0Var;
        wl0Var.setAdapter(go0Var);
        wl0Var.setOnScrollListener(new ao0(zxVar, qyVar, 3));
        wl0Var.C0(new ic0(zxVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f26153k0 = frameLayout3;
        xn0 xn0Var = new xn0(zxVar);
        xn0Var.f42981m = false;
        xn0Var.C = false;
        xn0Var.o(rrVar);
        xn0Var.n(350L);
        wl0 wl0Var2 = new wl0(context, null);
        this.f26155n0 = wl0Var2;
        wl0Var2.setItemAnimator(xn0Var);
        wl0Var2.setPivotY(0.0f);
        wl0Var2.setClipToPadding(false);
        wl0Var2.setVerticalScrollBarEnabled(true);
        wl0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        wl0Var2.setVerticalScrollbarPosition(i15);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.m0 = c0Var3;
        wl0Var2.setLayoutManager(c0Var3);
        wl0Var2.Y1 = true;
        wl0Var2.Z1 = 0;
        u00 u00Var3 = new u00(context, null);
        u00Var3.setViewType(1);
        yn0 yn0Var3 = new yn0(zxVar, context, u00Var3, 0);
        this.f26154l0 = yn0Var3;
        yn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var3.e.setVisibility(8);
        yn0Var3.setVisibility(8);
        yn0Var3.addView(u00Var3, 0);
        yn0Var3.e(true, false);
        frameLayout3.addView(yn0Var3);
        frameLayout3.addView(wl0Var2);
        wl0Var2.setEmptyView(yn0Var3);
        zn0 zn0Var = new zn0(zxVar, wl0Var2, context, this.H0, i12);
        this.f26156o0 = zn0Var;
        wl0Var2.setAdapter(zn0Var);
        wl0Var2.setOnScrollListener(new ao0(zxVar, qyVar, 0));
        wl0Var2.C0(new ic0(zxVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f26159r0 = frameLayout4;
        bo0 bo0Var = new bo0(zxVar);
        bo0Var.f42981m = false;
        bo0Var.C = false;
        bo0Var.o(rrVar);
        bo0Var.n(350L);
        wl0 wl0Var3 = new wl0(context, null);
        this.f26162u0 = wl0Var3;
        wl0Var3.setItemAnimator(bo0Var);
        wl0Var3.setPivotY(0.0f);
        wl0Var3.setVerticalScrollBarEnabled(true);
        wl0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        wl0Var3.setVerticalScrollbarPosition(i16);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.f26161t0 = c0Var4;
        wl0Var3.setLayoutManager(c0Var4);
        wl0Var3.Y1 = true;
        wl0Var3.Z1 = 0;
        wl0Var3.setClipToPadding(false);
        u00 u00Var4 = new u00(context, null);
        u00Var4.setViewType(1);
        yn0 yn0Var4 = new yn0(zxVar, context, u00Var4, 1);
        this.f26160s0 = yn0Var4;
        yn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        yn0Var4.e.setVisibility(8);
        yn0Var4.setVisibility(8);
        yn0Var4.addView(u00Var4, 0);
        yn0Var4.e(true, false);
        frameLayout4.addView(yn0Var4);
        frameLayout4.addView(wl0Var3);
        wl0Var3.setEmptyView(yn0Var4);
        co0 co0Var = new co0(zxVar, wl0Var3, context, this.H0);
        this.f26163v0 = co0Var;
        wl0Var3.setAdapter(co0Var);
        wl0Var3.setOnScrollListener(new ao0(zxVar, qyVar, 1));
        wl0Var3.C0(new ic0(zxVar, 24));
        this.f26146d0 = new bl0(w0Var, true);
        jh0 jh0Var = new jh0(context, qyVar);
        this.f26157p0 = jh0Var;
        r61 r61Var = jh0Var.f25416c;
        r61Var.setClipToPadding(false);
        r61Var.j(new do0(zxVar, 0));
        r61Var.C0(new ic0(zxVar, 24));
        ko0 ko0Var = new ko0(zxVar);
        this.T = ko0Var;
        setAdapter(ko0Var);
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

    public static void P(FrameLayout frameLayout, wl0 wl0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            wl0Var.o1(0, i10, 0, i11);
        } else {
            wl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f26158q0) {
            int i10 = 0;
            this.f26158q0 = false;
            R();
            l81 l81Var = this.M;
            if (l81Var != null && l81Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            eo0 eo0Var = this.f26144b0;
            if (eo0Var != null) {
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
                eo0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            ko0 ko0Var = this.T;
            ArrayList arrayList = ko0Var.f25828a;
            ArrayList arrayList2 = ko0Var.f25828a;
            if (i11 < arrayList.size()) {
                if (((jo0) arrayList2.get(i11)).f25452a == 3 && ((jo0) arrayList2.get(i11)).f25453b == i10) {
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
                arrayList.add(new org.telegram.ui.ActionBar.j6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19045d6));
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
        yn0 yn0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.j6(yn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(yn0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19428y6));
        arrayList.addAll(w7.b6.a(new y6(this, 7), org.telegram.ui.ActionBar.h6.f19430y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f26167z0.values()) {
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
        yn0 yn0Var = this.W;
        if (isEmpty) {
            yn0Var.e.setVisibility(8);
        } else {
            yn0Var.e.setVisibility(0);
            yn0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        eo0 eo0Var = this.f26144b0;
        org.telegram.ui.cy cyVar = eo0Var.U;
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
                TLObject tLObject = q0Var.f9881f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f18468id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j11 = -((TLRPC.Chat) q0Var.f9881f).f18321id;
                }
                j10 = j11;
            } else if (i12 == 6) {
                gg.o0 o0Var = q0Var.f9882g;
                long j14 = o0Var.f9856b;
                j13 = o0Var.f9857c;
                j12 = j14;
            } else if (i12 == 7) {
                z19 = true;
            }
            i11++;
        }
        co0 co0Var = this.f26163v0;
        co0Var.getClass();
        if (f40.X(str, null) == null) {
            J();
        }
        if (view == this.f26148f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            go0 go0Var = this.f26152j0;
            wl0 wl0Var = go0Var.d;
            ArrayList arrayList2 = go0Var.Q;
            ArrayList arrayList3 = go0Var.R;
            ArrayList arrayList4 = go0Var.S;
            ArrayList arrayList5 = go0Var.P;
            yp ypVar = go0Var.f28901c0;
            go0Var.W();
            if (!TextUtils.equals(str, go0Var.f28900b0)) {
                go0Var.f28900b0 = str;
                AndroidUtilities.cancelRunOnUIThread(ypVar);
                if (TextUtils.isEmpty(go0Var.f28900b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    go0Var.N(true);
                    go0Var.f28899a0++;
                    z18 = false;
                    go0Var.W = false;
                    go0Var.X = false;
                    go0Var.Y = false;
                    go0Var.Z = 0;
                    if (wl0Var != null) {
                        wl0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(ypVar, 1000L);
                    go0Var.W = true;
                    go0Var.X = true;
                    go0Var.N(true);
                    if (wl0Var != null) {
                        z18 = false;
                        wl0Var.u0(0);
                    }
                }
                this.f26149g0.b(this.N0, z18);
            }
            z18 = false;
            this.f26149g0.b(this.N0, z18);
        } else if (view == this.f26153k0) {
            zn0 zn0Var = this.f26156o0;
            wl0 wl0Var2 = zn0Var.d;
            ArrayList arrayList6 = zn0Var.T;
            ns nsVar = zn0Var.f28313f0;
            if (TextUtils.equals(str, zn0Var.f28312e0)) {
                z17 = false;
            } else {
                zn0Var.f28312e0 = str;
                AndroidUtilities.cancelRunOnUIThread(nsVar);
                if (TextUtils.isEmpty(zn0Var.f28312e0)) {
                    arrayList6.clear();
                    zn0Var.N(true);
                    zn0Var.f28311d0++;
                    z17 = false;
                    zn0Var.Z = false;
                    zn0Var.f28308a0 = false;
                    zn0Var.f28309b0 = false;
                    zn0Var.f28310c0 = 0;
                    if (wl0Var2 != null) {
                        wl0Var2.u0(0);
                    }
                } else {
                    z17 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(nsVar, 1000L);
                    zn0Var.Z = true;
                    zn0Var.f28308a0 = true;
                    zn0Var.N(true);
                    if (wl0Var2 != null) {
                        wl0Var2.u0(0);
                    }
                }
            }
            this.f26154l0.b(this.N0, z17);
            if (TextUtils.isEmpty(str)) {
                zn0Var.V();
            }
        } else {
            jh0 jh0Var = this.f26157p0;
            if (view == jh0Var) {
                r61 r61Var = jh0Var.f25416c;
                ArrayList arrayList7 = jh0Var.f25418n;
                if (!TextUtils.equals(jh0Var.f25421w, str)) {
                    if (jh0Var.K >= 0) {
                        ConnectionsManager.getInstance(jh0Var.f25415b).cancelRequest(jh0Var.K, true);
                        jh0Var.K = -1;
                    }
                    jh0Var.v = false;
                    jh0Var.H.setLoading(false);
                    jh0Var.f25421w = str;
                    if (TextUtils.isEmpty(str)) {
                        jh0Var.f25419r = 0;
                        z16 = true;
                        jh0Var.L++;
                        jh0Var.f25420s = false;
                        arrayList7.clear();
                        jh0Var.a(false);
                    } else {
                        z16 = true;
                        jh0Var.b(str);
                        jh0Var.f25419r = 0;
                        jh0Var.L++;
                        jh0Var.f25420s = false;
                        arrayList7.clear();
                    }
                    jh0Var.d();
                    r61Var.u0(0);
                    r61Var.Y2.N(z16);
                }
            } else if (view == this.f26159r0) {
                if (f40.X(str, null) != null) {
                    if (z10) {
                        this.f26161t0.h1(0, 0);
                    }
                    co0Var.Y(str);
                    this.f26160s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                org.telegram.ui.t10 t10Var2 = this.M0;
                if ((j10 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) || j3 != 0) {
                    this.I0 = false;
                    eo0Var.U(z19 ? 1 : 0, str);
                    eo0Var.A0 = this.L0;
                    t10Var2.animate().setListener(null).cancel();
                    t10Var2.i(null, false);
                    if (z10) {
                        if (eo0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        yn0Var.e(!z14, false);
                        if (eo0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        yn0Var.e(z15, false);
                    } else if (!eo0Var.N()) {
                        if (eo0Var.D0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yn0Var.e(z13, true);
                    }
                    if (z10) {
                        t10Var2.setVisibility(8);
                    } else if (t10Var2.getVisibility() != 8) {
                        t10Var2.animate().alpha(0.0f).setListener(new fd0(this, 11)).setDuration(150L).start();
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
                    yn0Var.setVisibility(8);
                }
                yn0Var.b(this.N0, z12);
                t10Var.f37906c.b(this.N0, z12);
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
                    t10Var3.f37906c.b(this.N0, false);
                    t10Var3.h(j10, this.T0, j16, j17, gg.s0.f9896c3[((jo0) this.T.f25828a.get(i10)).f25453b], z19, str, z10);
                } else if (view instanceof in0) {
                    in0 in0Var = (in0) view;
                    in0Var.f25093a.b(this.N0, false);
                    in0Var.K = str;
                    in0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        vl0 vl0Var;
        vl0 vl0Var2;
        vl0 vl0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.cy cyVar;
        int i12;
        if (this.f26166y0 != z10) {
            org.telegram.ui.qy qyVar = this.J0;
            if (!z10 || !qyVar.getActionBar().s()) {
                int i13 = 72;
                if (z10 && !qyVar.getActionBar().a("search_view_pager")) {
                    this.F0 = qyVar.getActionBar().j("search_view_pager");
                    if (qyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f26164w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f26164w0.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
                        this.f26164w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19430y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f26164w0.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19449z8, false), 1, -1));
                        this.f26164w0.setOnClickListener(new i80(this, 14));
                        this.F0.addView(this.f26164w0, w7.y5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
                    this.f26165x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f26165x0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f26165x0;
                    int i14 = org.telegram.ui.ActionBar.h6.f19430y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                    org.telegram.ui.ActionBar.y yVar = this.F0;
                    NumberTextView numberTextView3 = this.f26165x0;
                    if (qyVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(numberTextView3, w7.y5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f26165x0.setOnTouchListener(new bi.d(21));
                    org.telegram.ui.ActionBar.u0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f26165x0 != null) {
                    eo0 eo0Var = this.f26144b0;
                    if (eo0Var != null && (cyVar = eo0Var.U) != null && cyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26165x0.getLayoutParams();
                    if (qyVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f26165x0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (qyVar.getActionBar().getBackButton() != null && (qyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
                    qyVar.getActionBar().setBackButtonDrawable(f2Var);
                    f2Var.setColorFilter(null);
                }
                this.f26166y0 = z10;
                HashMap hashMap = this.f26167z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
                    qyVar.getActionBar().O(null, null);
                    this.f26165x0.a(hashMap.size(), false);
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
                    if ((getChildAt(i15) instanceof org.telegram.ui.t10) && (vl0Var3 = ((org.telegram.ui.t10) getChildAt(i15)).d) != null) {
                        vl0Var3.l();
                    }
                    if (getChildAt(i15) instanceof in0) {
                        ((in0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.t10 t10Var = this.M0;
                if (t10Var != null && (vl0Var2 = t10Var.d) != null) {
                    vl0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.t10) && (vl0Var = ((org.telegram.ui.t10) view).d) != null) {
                        vl0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        l81 l81Var = this.M;
        if (l81Var != null) {
            l81Var.f29099x.l();
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
        return this.f26167z0.containsKey(l10Var);
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
        go0 go0Var = this.f26152j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f26149g0.e(z10, true);
            go0Var.W();
            go0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f26156o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                co0 co0Var = this.f26163v0;
                if (obj == co0Var.Q) {
                    co0Var.N(true);
                }
            }
        } else {
            go0Var.W();
            go0Var.N(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.l10 l10Var = new org.telegram.ui.l10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f26167z0;
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
            this.f26165x0.a(hashMap.size(), true);
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
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19430y8, false), PorterDuff.Mode.SRC_IN));
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
                wl0 wl0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        wl0Var = this.V;
                    } else if (view == this.f26148f0) {
                        wl0Var = this.f26151i0;
                    } else if (view == this.f26153k0) {
                        wl0Var = this.f26155n0;
                    } else if (view == this.f26159r0) {
                        wl0Var = this.f26162u0;
                    } else {
                        in0 in0Var = this.G0;
                        if (view == in0Var) {
                            wl0Var = in0Var.f25094b;
                        } else {
                            jh0 jh0Var = this.f26157p0;
                            if (view == jh0Var) {
                                wl0Var = jh0Var.f25416c;
                            } else if (view instanceof org.telegram.ui.t10) {
                                wl0Var = ((org.telegram.ui.t10) view).f37904b;
                            }
                        }
                    }
                }
                if (wl0Var != null) {
                    gh.d.a(wl0Var, canvas, rectF, wl0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.t10 t10Var = this.M0;
                    if (t10Var.getVisibility() == 0) {
                        ai.w0 w0Var = t10Var.f37904b;
                        gh.d.a(w0Var, canvas, rectF, w0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f26166y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<gg.q0> getCurrentSearchFilters() {
        return this.A0;
    }

    public in0 getDownloadsContainer() {
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

    public v81 getTabsView() {
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
        this.f26147e0 = true;
        go0 go0Var = this.f26152j0;
        if (go0Var != null) {
            go0Var.N(false);
        }
        zn0 zn0Var = this.f26156o0;
        if (zn0Var != null) {
            zn0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26147e0 = false;
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
                ((org.telegram.ui.t10) getChildAt(i11)).f37906c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f37906c.b(i10, z10);
            } else if (getChildAt(i11) instanceof in0) {
                ((in0) getChildAt(i11)).f25093a.b(i10, z10);
            } else if (getChildAt(i11) == this.f26148f0) {
                this.f26149g0.b(i10, z10);
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
        l81 l81Var = this.M;
        if (l81Var != null) {
            l81Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        eo0 eo0Var = this.f26144b0;
        org.telegram.ui.t10 t10Var = this.M0;
        if (i10 == 0) {
            if (t10Var.getVisibility() == 0) {
                t10Var.i(this.L0, false);
                eo0Var.A0 = null;
            } else {
                t10Var.i(null, false);
                org.telegram.ui.k10 k10Var = this.L0;
                eo0Var.A0 = k10Var;
                if (k10Var != null) {
                    ((org.telegram.ui.sv) k10Var).i(false, null, eo0Var.f9774y0, eo0Var.f9775z0);
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
        eo0Var.A0 = null;
        t10Var.i(null, false);
    }
}
