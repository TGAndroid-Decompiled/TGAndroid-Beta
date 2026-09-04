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
public abstract class yn0 extends i81 implements org.telegram.ui.w10, NotificationCenter.NotificationCenterDelegate, ch.a {
    public static final int X0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.v0 B0;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.ActionBar.v0 D0;
    public org.telegram.ui.ActionBar.v0 E0;
    public org.telegram.ui.ActionBar.z F0;
    public vm0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.uy J0;
    public String K0;
    public org.telegram.ui.o10 L0;
    public final org.telegram.ui.x10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.zx P0;
    public final ov0 Q0;
    public final int R0;
    public int S0;
    public final xn0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final bi.o0 V;
    public int V0;
    public final ln0 W;
    public bh.b W0;
    public final s4.j f32949a0;
    public final rn0 f32950b0;
    public final s4.c0 f32951c0;
    public final qk0 f32952d0;
    public boolean f32953e0;
    public final FrameLayout f32954f0;
    public final ln0 f32955g0;
    public final s4.c0 f32956h0;
    public final ll0 f32957i0;
    public final tn0 f32958j0;
    public final FrameLayout f32959k0;
    public final ln0 f32960l0;
    public final s4.c0 m0;
    public final ll0 f32961n0;
    public final mn0 f32962o0;
    public final yg0 f32963p0;
    public boolean f32964q0;
    public final FrameLayout f32965r0;
    public final ln0 f32966s0;
    public final s4.c0 f32967t0;
    public final ll0 f32968u0;
    public final pn0 f32969v0;
    public ImageView f32970w0;
    public NumberTextView f32971x0;
    public boolean f32972y0;
    public final HashMap f32973z0;

    public yn0(Context context, org.telegram.ui.uy uyVar, int i10, int i11, int i12, long j3, org.telegram.ui.zx zxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f32964q0 = false;
        this.f32973z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = uyVar;
        this.P0 = zxVar;
        s4.j jVar = new s4.j();
        this.f32949a0 = jVar;
        jVar.f45828c = 150L;
        jVar.f45829e = 350L;
        jVar.f45830f = 0L;
        jVar.f45831g = 0L;
        jVar.d = 0L;
        jVar.f45832i = new OvershootInterpolator(1.1f);
        jVar.f45803o = pr.h;
        org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this;
        this.f32950b0 = new rn0(eyVar, context, uyVar, i10, i11, jVar, uyVar.F, uyVar, context);
        if (i11 == 15) {
            ArrayList R3 = uyVar.R3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < R3.size(); i18 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) R3.get(i18)).f19873id, arrayList, i18, 1)) {
            }
            this.f32950b0.f11089q0 = arrayList;
        }
        this.Q0 = (ov0) uyVar.getFragmentView();
        bi.o0 o0Var = new bi.o0(eyVar, context, 21);
        this.V = o0Var;
        o0Var.setItemAnimator(this.f32949a0);
        o0Var.setPivotY(0.0f);
        o0Var.setClipToPadding(false);
        o0Var.setAdapter(this.f32950b0);
        o0Var.setVerticalScrollBarEnabled(true);
        o0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        o0Var.setVerticalScrollbarPosition(i13);
        s4.c0 c0Var = new s4.c0(1, false);
        this.f32951c0 = c0Var;
        o0Var.setLayoutManager(c0Var);
        o0Var.Y1 = true;
        o0Var.Z1 = 0;
        o0Var.setOnScrollListener(new nn0(eyVar, uyVar, 2));
        o0Var.C0(new cc0(eyVar, 23));
        org.telegram.ui.x10 x10Var = new org.telegram.ui.x10(this.J0);
        this.M0 = x10Var;
        bi.o0 o0Var2 = x10Var.f42537b;
        o0Var2.setClipToPadding(false);
        o0Var2.j(new qn0(eyVar, 1));
        o0Var2.C0(new cc0(eyVar, 23));
        x10Var.setUiCallback(this);
        x10Var.setVisibility(8);
        x10Var.setChatPreviewDelegate(zxVar);
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(1);
        ln0 ln0Var = new ln0(eyVar, context, t00Var, 2);
        this.W = ln0Var;
        ln0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var.f32755e.setVisibility(8);
        ln0Var.setVisibility(8);
        ln0Var.addView(t00Var, 0);
        ln0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(ln0Var);
        frameLayout.addView(o0Var);
        frameLayout.addView(x10Var);
        o0Var.setEmptyView(ln0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f32954f0 = frameLayout2;
        sn0 sn0Var = new sn0(eyVar);
        sn0Var.f45777m = false;
        sn0Var.C = false;
        pr prVar = pr.h;
        sn0Var.o(prVar);
        sn0Var.n(350L);
        ll0 ll0Var = new ll0(context, null);
        this.f32957i0 = ll0Var;
        ll0Var.setItemAnimator(sn0Var);
        ll0Var.setPivotY(0.0f);
        ll0Var.setVerticalScrollBarEnabled(true);
        ll0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        ll0Var.setVerticalScrollbarPosition(i14);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.f32956h0 = c0Var2;
        ll0Var.setLayoutManager(c0Var2);
        ll0Var.Y1 = true;
        ll0Var.Z1 = 0;
        ll0Var.setClipToPadding(false);
        t00 t00Var2 = new t00(context, null);
        t00Var2.setViewType(1);
        ln0 ln0Var2 = new ln0(eyVar, context, t00Var2, 3);
        this.f32955g0 = ln0Var2;
        ln0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var2.f32755e.setVisibility(8);
        ln0Var2.setVisibility(8);
        ln0Var2.addView(t00Var2, 0);
        ln0Var2.e(true, false);
        frameLayout2.addView(ln0Var2);
        frameLayout2.addView(ll0Var);
        ll0Var.setEmptyView(ln0Var2);
        tn0 tn0Var = new tn0(eyVar, ll0Var, context, this.H0, i12, uyVar);
        this.f32958j0 = tn0Var;
        ll0Var.setAdapter(tn0Var);
        ll0Var.setOnScrollListener(new nn0(eyVar, uyVar, 3));
        ll0Var.C0(new cc0(eyVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f32959k0 = frameLayout3;
        kn0 kn0Var = new kn0(eyVar);
        kn0Var.f45777m = false;
        kn0Var.C = false;
        kn0Var.o(prVar);
        kn0Var.n(350L);
        ll0 ll0Var2 = new ll0(context, null);
        this.f32961n0 = ll0Var2;
        ll0Var2.setItemAnimator(kn0Var);
        ll0Var2.setPivotY(0.0f);
        ll0Var2.setClipToPadding(false);
        ll0Var2.setVerticalScrollBarEnabled(true);
        ll0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        ll0Var2.setVerticalScrollbarPosition(i15);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.m0 = c0Var3;
        ll0Var2.setLayoutManager(c0Var3);
        ll0Var2.Y1 = true;
        ll0Var2.Z1 = 0;
        t00 t00Var3 = new t00(context, null);
        t00Var3.setViewType(1);
        ln0 ln0Var3 = new ln0(eyVar, context, t00Var3, 0);
        this.f32960l0 = ln0Var3;
        ln0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var3.f32755e.setVisibility(8);
        ln0Var3.setVisibility(8);
        ln0Var3.addView(t00Var3, 0);
        ln0Var3.e(true, false);
        frameLayout3.addView(ln0Var3);
        frameLayout3.addView(ll0Var2);
        ll0Var2.setEmptyView(ln0Var3);
        mn0 mn0Var = new mn0(eyVar, ll0Var2, context, this.H0, i12);
        this.f32962o0 = mn0Var;
        ll0Var2.setAdapter(mn0Var);
        ll0Var2.setOnScrollListener(new nn0(eyVar, uyVar, 0));
        ll0Var2.C0(new cc0(eyVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f32965r0 = frameLayout4;
        on0 on0Var = new on0(eyVar);
        on0Var.f45777m = false;
        on0Var.C = false;
        on0Var.o(prVar);
        on0Var.n(350L);
        ll0 ll0Var3 = new ll0(context, null);
        this.f32968u0 = ll0Var3;
        ll0Var3.setItemAnimator(on0Var);
        ll0Var3.setPivotY(0.0f);
        ll0Var3.setVerticalScrollBarEnabled(true);
        ll0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        ll0Var3.setVerticalScrollbarPosition(i16);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.f32967t0 = c0Var4;
        ll0Var3.setLayoutManager(c0Var4);
        ll0Var3.Y1 = true;
        ll0Var3.Z1 = 0;
        ll0Var3.setClipToPadding(false);
        t00 t00Var4 = new t00(context, null);
        t00Var4.setViewType(1);
        ln0 ln0Var4 = new ln0(eyVar, context, t00Var4, 1);
        this.f32966s0 = ln0Var4;
        ln0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        ln0Var4.f32755e.setVisibility(8);
        ln0Var4.setVisibility(8);
        ln0Var4.addView(t00Var4, 0);
        ln0Var4.e(true, false);
        frameLayout4.addView(ln0Var4);
        frameLayout4.addView(ll0Var3);
        ll0Var3.setEmptyView(ln0Var4);
        pn0 pn0Var = new pn0(eyVar, ll0Var3, context, this.H0);
        this.f32969v0 = pn0Var;
        ll0Var3.setAdapter(pn0Var);
        ll0Var3.setOnScrollListener(new nn0(eyVar, uyVar, 1));
        ll0Var3.C0(new cc0(eyVar, 23));
        this.f32952d0 = new qk0(o0Var, true);
        yg0 yg0Var = new yg0(context, uyVar);
        this.f32963p0 = yg0Var;
        d61 d61Var = yg0Var.f32909c;
        d61Var.setClipToPadding(false);
        d61Var.j(new qn0(eyVar, 0));
        d61Var.C0(new cc0(eyVar, 23));
        xn0 xn0Var = new xn0(eyVar);
        this.T = xn0Var;
        setAdapter(xn0Var);
    }

    public static org.telegram.ui.co K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.co(bundle);
    }

    public static void P(FrameLayout frameLayout, ll0 ll0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            ll0Var.n1(0, i10, 0, i11);
        } else {
            ll0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ll0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f32964q0) {
            int i10 = 0;
            this.f32964q0 = false;
            R();
            y71 y71Var = this.M;
            if (y71Var != null && y71Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            rn0 rn0Var = this.f32950b0;
            if (rn0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((hg.q0) arrayList.get(i11)).d == 7) {
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
            ArrayList arrayList = xn0Var.f32631a;
            ArrayList arrayList2 = xn0Var.f32631a;
            if (i11 < arrayList.size()) {
                if (((wn0) arrayList2.get(i11)).f32300a == 3 && ((wn0) arrayList2.get(i11)).f32301b == i10) {
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
            bi.o0 o0Var = this.V;
            if (i10 >= o0Var.getChildCount()) {
                break;
            }
            View childAt = o0Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.h6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.k4)) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20663d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.x10) {
                arrayList.addAll(((org.telegram.ui.x10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.x10) {
                arrayList.addAll(((org.telegram.ui.x10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.x10 x10Var = this.M0;
        if (x10Var != null) {
            arrayList.addAll(x10Var.getThemeDescriptions());
        }
        ln0 ln0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ln0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ln0Var.f32755e, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f21042y6));
        arrayList.addAll(w7.a6.a(new z6(this, 7), org.telegram.ui.ActionBar.j6.f21044y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f32973z0.values()) {
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
        org.telegram.ui.x10 x10Var;
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
            ln0Var.f32755e.setVisibility(8);
        } else {
            ln0Var.f32755e.setVisibility(0);
            ln0Var.f32755e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        rn0 rn0Var = this.f32950b0;
        org.telegram.ui.gy gyVar = rn0Var.U;
        if (gyVar != null) {
            j3 = gyVar.a();
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
            hg.q0 q0Var = (hg.q0) arrayList.get(i11);
            int i12 = q0Var.d;
            if (i12 == 4) {
                TLObject tLObject = q0Var.f11219f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f20016id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j11 = -((TLRPC.Chat) q0Var.f11219f).f19869id;
                }
                j10 = j11;
            } else if (i12 == 6) {
                hg.o0 o0Var = q0Var.f11220g;
                long j14 = o0Var.f11191b;
                j13 = o0Var.f11192c;
                j12 = j14;
            } else if (i12 == 7) {
                z19 = true;
            }
            i11++;
        }
        pn0 pn0Var = this.f32969v0;
        pn0Var.getClass();
        if (e40.X(str, null) == null) {
            J();
        }
        if (view == this.f32954f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            tn0 tn0Var = this.f32958j0;
            ll0 ll0Var = tn0Var.d;
            ArrayList arrayList2 = tn0Var.Q;
            ArrayList arrayList3 = tn0Var.R;
            ArrayList arrayList4 = tn0Var.S;
            ArrayList arrayList5 = tn0Var.P;
            wp wpVar = tn0Var.f30407c0;
            tn0Var.W();
            if (!TextUtils.equals(str, tn0Var.f30406b0)) {
                tn0Var.f30406b0 = str;
                AndroidUtilities.cancelRunOnUIThread(wpVar);
                if (TextUtils.isEmpty(tn0Var.f30406b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    tn0Var.N(true);
                    tn0Var.f30405a0++;
                    z18 = false;
                    tn0Var.W = false;
                    tn0Var.X = false;
                    tn0Var.Y = false;
                    tn0Var.Z = 0;
                    if (ll0Var != null) {
                        ll0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(wpVar, 1000L);
                    tn0Var.W = true;
                    tn0Var.X = true;
                    tn0Var.N(true);
                    if (ll0Var != null) {
                        z18 = false;
                        ll0Var.u0(0);
                    }
                }
                this.f32955g0.b(this.N0, z18);
            }
            z18 = false;
            this.f32955g0.b(this.N0, z18);
        } else if (view == this.f32959k0) {
            mn0 mn0Var = this.f32962o0;
            ll0 ll0Var2 = mn0Var.d;
            ArrayList arrayList6 = mn0Var.T;
            ls lsVar = mn0Var.f29810f0;
            if (TextUtils.equals(str, mn0Var.f29809e0)) {
                z17 = false;
            } else {
                mn0Var.f29809e0 = str;
                AndroidUtilities.cancelRunOnUIThread(lsVar);
                if (TextUtils.isEmpty(mn0Var.f29809e0)) {
                    arrayList6.clear();
                    mn0Var.N(true);
                    mn0Var.f29808d0++;
                    z17 = false;
                    mn0Var.Z = false;
                    mn0Var.f29805a0 = false;
                    mn0Var.f29806b0 = false;
                    mn0Var.f29807c0 = 0;
                    if (ll0Var2 != null) {
                        ll0Var2.u0(0);
                    }
                } else {
                    z17 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(lsVar, 1000L);
                    mn0Var.Z = true;
                    mn0Var.f29805a0 = true;
                    mn0Var.N(true);
                    if (ll0Var2 != null) {
                        ll0Var2.u0(0);
                    }
                }
            }
            this.f32960l0.b(this.N0, z17);
            if (TextUtils.isEmpty(str)) {
                mn0Var.V();
            }
        } else {
            yg0 yg0Var = this.f32963p0;
            if (view == yg0Var) {
                d61 d61Var = yg0Var.f32909c;
                ArrayList arrayList7 = yg0Var.f32912n;
                if (!TextUtils.equals(yg0Var.f32915w, str)) {
                    if (yg0Var.K >= 0) {
                        ConnectionsManager.getInstance(yg0Var.f32908b).cancelRequest(yg0Var.K, true);
                        yg0Var.K = -1;
                    }
                    yg0Var.v = false;
                    yg0Var.H.setLoading(false);
                    yg0Var.f32915w = str;
                    if (TextUtils.isEmpty(str)) {
                        yg0Var.f32913r = 0;
                        z16 = true;
                        yg0Var.L++;
                        yg0Var.f32914s = false;
                        arrayList7.clear();
                        yg0Var.a(false);
                    } else {
                        z16 = true;
                        yg0Var.b(str);
                        yg0Var.f32913r = 0;
                        yg0Var.L++;
                        yg0Var.f32914s = false;
                        arrayList7.clear();
                    }
                    yg0Var.d();
                    d61Var.u0(0);
                    d61Var.Y2.N(z16);
                }
            } else if (view == this.f32965r0) {
                if (e40.X(str, null) != null) {
                    if (z10) {
                        this.f32967t0.h1(0, 0);
                    }
                    pn0Var.Y(str);
                    this.f32966s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                org.telegram.ui.x10 x10Var2 = this.M0;
                if ((j10 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) || j3 != 0) {
                    this.I0 = false;
                    rn0Var.U(z19 ? 1 : 0, str);
                    rn0Var.A0 = this.L0;
                    x10Var2.animate().setListener(null).cancel();
                    x10Var2.i(null, false);
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
                        x10Var2.setVisibility(8);
                    } else if (x10Var2.getVisibility() != 8) {
                        x10Var2.animate().alpha(0.0f).setListener(new r80(this, 13)).setDuration(150L).start();
                    }
                    x10Var2.setTag(null);
                    x10Var = x10Var2;
                    z12 = false;
                } else {
                    boolean z20 = true;
                    x10Var2.setTag(1);
                    x10Var2.i(this.L0, false);
                    x10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        x10Var2.setVisibility(0);
                        x10Var2.setAlpha(1.0f);
                        z20 = z10;
                    } else {
                        if (x10Var2.getVisibility() != 0) {
                            x10Var2.setVisibility(0);
                            x10Var2.setAlpha(0.0f);
                        } else {
                            z20 = z10;
                        }
                        x10Var2.animate().alpha(1.0f).setDuration(150L).start();
                    }
                    x10Var = x10Var2;
                    z12 = false;
                    this.M0.h(j10, this.T0, j12, j13, null, z19, str, z20);
                    ln0Var.setVisibility(8);
                }
                ln0Var.b(this.N0, z12);
                x10Var.f42539c.b(this.N0, z12);
            } else {
                long j15 = j3;
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.x10) {
                    org.telegram.ui.x10 x10Var3 = (org.telegram.ui.x10) view;
                    if (j15 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    x10Var3.setUseFromUserAsAvatar(z11);
                    x10Var3.f42539c.b(this.N0, false);
                    x10Var3.h(j10, this.T0, j16, j17, hg.s0.f11237c3[((wn0) this.T.f32631a.get(i10)).f32301b], z19, str, z10);
                } else if (view instanceof vm0) {
                    vm0 vm0Var = (vm0) view;
                    vm0Var.f31363a.b(this.N0, false);
                    vm0Var.K = str;
                    vm0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        kl0 kl0Var;
        kl0 kl0Var2;
        kl0 kl0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.gy gyVar;
        int i12;
        if (this.f32972y0 != z10) {
            org.telegram.ui.uy uyVar = this.J0;
            if (!z10 || !uyVar.getActionBar().s()) {
                int i13 = 72;
                if (z10 && !uyVar.getActionBar().a("search_view_pager")) {
                    this.F0 = uyVar.getActionBar().j("search_view_pager");
                    if (uyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f32970w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f32970w0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                        this.f32970w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21044y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f32970w0.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21063z8, false), 1, -1));
                        this.f32970w0.setOnClickListener(new x70(this, 14));
                        this.F0.addView(this.f32970w0, w7.x5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
                    this.f32971x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f32971x0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f32971x0;
                    int i14 = org.telegram.ui.ActionBar.j6.f21044y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                    org.telegram.ui.ActionBar.z zVar = this.F0;
                    NumberTextView numberTextView3 = this.f32971x0;
                    if (uyVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    zVar.addView(numberTextView3, w7.x5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f32971x0.setOnTouchListener(new ci.d(21));
                    org.telegram.ui.ActionBar.v0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f32971x0 != null) {
                    rn0 rn0Var = this.f32950b0;
                    if (rn0Var != null && (gyVar = rn0Var.U) != null && gyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f32971x0.getLayoutParams();
                    if (uyVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f32971x0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (uyVar.getActionBar().getBackButton() != null && (uyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
                    org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
                    uyVar.getActionBar().setBackButtonDrawable(g2Var);
                    g2Var.setColorFilter(null);
                }
                this.f32972y0 = z10;
                HashMap hashMap = this.f32973z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                    uyVar.getActionBar().O(null, null);
                    this.f32971x0.a(hashMap.size(), false);
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
                uyVar.getActionBar().r();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.x10) && (kl0Var3 = ((org.telegram.ui.x10) getChildAt(i15)).d) != null) {
                        kl0Var3.l();
                    }
                    if (getChildAt(i15) instanceof vm0) {
                        ((vm0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.x10 x10Var = this.M0;
                if (x10Var != null && (kl0Var2 = x10Var.d) != null) {
                    kl0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.x10) && (kl0Var = ((org.telegram.ui.x10) view).d) != null) {
                        kl0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        y71 y71Var = this.M;
        if (y71Var != null) {
            y71Var.f26658x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final boolean b(org.telegram.ui.p10 p10Var) {
        return this.f32973z0.containsKey(p10Var);
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
        org.telegram.ui.p10 p10Var = new org.telegram.ui.p10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f32973z0;
        if (hashMap.containsKey(p10Var)) {
            hashMap.remove(p10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(p10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.f32971x0.a(hashMap.size(), true);
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
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21044y8, false), PorterDuff.Mode.SRC_IN));
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
                        if (!((MessageObject) hashMap.get((org.telegram.ui.p10) it.next())).isDownloadingFile) {
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
            ((org.telegram.ui.Cells.j7) view).b(hashMap.containsKey(p10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(p10Var));
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(p10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).e(hashMap.containsKey(p10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(p10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(hashMap.containsKey(p10Var), true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z10 = false;
        tn0 tn0Var = this.f32958j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f32955g0.e(z10, true);
            tn0Var.W();
            tn0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f32962o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                pn0 pn0Var = this.f32969v0;
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
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f2648a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.U;
                ll0 ll0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        ll0Var = this.V;
                    } else if (view == this.f32954f0) {
                        ll0Var = this.f32957i0;
                    } else if (view == this.f32959k0) {
                        ll0Var = this.f32961n0;
                    } else if (view == this.f32965r0) {
                        ll0Var = this.f32968u0;
                    } else {
                        vm0 vm0Var = this.G0;
                        if (view == vm0Var) {
                            ll0Var = vm0Var.f31364b;
                        } else {
                            yg0 yg0Var = this.f32963p0;
                            if (view == yg0Var) {
                                ll0Var = yg0Var.f32909c;
                            } else if (view instanceof org.telegram.ui.x10) {
                                ll0Var = ((org.telegram.ui.x10) view).f42537b;
                            }
                        }
                    }
                }
                if (ll0Var != null) {
                    hh.d.b(ll0Var, canvas, rectF, ll0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.x10 x10Var = this.M0;
                    if (x10Var.getVisibility() == 0) {
                        bi.o0 o0Var = x10Var.f42537b;
                        hh.d.b(o0Var, canvas, rectF, o0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f32972y0;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.F0;
    }

    public ArrayList<hg.q0> getCurrentSearchFilters() {
        return this.A0;
    }

    public vm0 getDownloadsContainer() {
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

    public h81 getTabsView() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.H0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        this.f32953e0 = true;
        tn0 tn0Var = this.f32958j0;
        if (tn0Var != null) {
            tn0Var.N(false);
        }
        mn0 mn0Var = this.f32962o0;
        if (mn0Var != null) {
            mn0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32953e0 = false;
        int i10 = this.H0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void s() {
        this.Q0.M();
    }

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        this.W0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.o10 o10Var) {
        this.L0 = o10Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.x10) {
                ((org.telegram.ui.x10) getChildAt(i11)).f42539c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f42539c.b(i10, z10);
            } else if (getChildAt(i11) instanceof vm0) {
                ((vm0) getChildAt(i11)).f31363a.b(i10, z10);
            } else if (getChildAt(i11) == this.f32954f0) {
                this.f32955g0.b(i10, z10);
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
        y71 y71Var = this.M;
        if (y71Var != null) {
            y71Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        rn0 rn0Var = this.f32950b0;
        org.telegram.ui.x10 x10Var = this.M0;
        if (i10 == 0) {
            if (x10Var.getVisibility() == 0) {
                x10Var.i(this.L0, false);
                rn0Var.A0 = null;
            } else {
                x10Var.i(null, false);
                org.telegram.ui.o10 o10Var = this.L0;
                rn0Var.A0 = o10Var;
                if (o10Var != null) {
                    ((org.telegram.ui.xv) o10Var).i(false, null, rn0Var.f11102y0, rn0Var.f11103z0);
                }
            }
        } else if (view instanceof org.telegram.ui.x10) {
            if (i11 == 0 && x10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.x10) view).i(this.L0, z10);
        }
        if (view2 instanceof org.telegram.ui.x10) {
            ((org.telegram.ui.x10) view2).i(null, false);
            return;
        }
        rn0Var.A0 = null;
        x10Var.i(null, false);
    }
}
