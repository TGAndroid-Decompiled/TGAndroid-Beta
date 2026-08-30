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
public abstract class do0 extends l81 implements org.telegram.ui.s10, NotificationCenter.NotificationCenterDelegate, og.a {
    public static final int U0 = 0;
    public org.telegram.ui.ActionBar.w0 A0;
    public org.telegram.ui.ActionBar.w0 B0;
    public org.telegram.ui.ActionBar.z C0;
    public dn0 D0;
    public final int E0;
    public boolean F0;
    public final org.telegram.ui.oy G0;
    public String H0;
    public org.telegram.ui.k10 I0;
    public final org.telegram.ui.t10 J0;
    public int K0;
    public boolean L0;
    public final org.telegram.ui.tx M0;
    public final qv0 N0;
    public final int O0;
    public int P0;
    public final co0 Q;
    public final long Q0;
    public final FrameLayout R;
    public int R0;
    public final lh.e1 S;
    public int S0;
    public final qn0 T;
    public ng.a T0;
    public final f2.l U;
    public final wn0 V;
    public final f2.i0 W;
    public final zk0 f24317a0;
    public boolean f24318b0;
    public final FrameLayout f24319c0;
    public final qn0 f24320d0;
    public final f2.i0 f24321e0;
    public final sl0 f24322f0;
    public final yn0 f24323g0;
    public final FrameLayout f24324h0;
    public final qn0 f24325i0;
    public final f2.i0 f24326j0;
    public final sl0 f24327k0;
    public final rn0 f24328l0;
    public final eh0 m0;
    public boolean f24329n0;
    public final FrameLayout f24330o0;
    public final qn0 f24331p0;
    public final f2.i0 f24332q0;
    public final sl0 f24333r0;
    public final un0 f24334s0;
    public ImageView f24335t0;
    public NumberTextView f24336u0;
    public boolean f24337v0;
    public final HashMap f24338w0;
    public final ArrayList f24339x0;
    public org.telegram.ui.ActionBar.w0 f24340y0;
    public org.telegram.ui.ActionBar.w0 f24341z0;

    public do0(Context context, org.telegram.ui.oy oyVar, int i10, int i11, int i12, long j10, org.telegram.ui.tx txVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f24329n0 = false;
        this.f24338w0 = new HashMap();
        this.f24339x0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.E0 = i17;
        this.P0 = 0;
        this.O0 = i12;
        this.Q0 = j10;
        this.G0 = oyVar;
        this.M0 = txVar;
        f2.l lVar = new f2.l();
        this.U = lVar;
        lVar.f5837c = 150L;
        lVar.e = 350L;
        lVar.f5838f = 0L;
        lVar.f5839g = 0L;
        lVar.d = 0L;
        lVar.f5840i = new OvershootInterpolator(1.1f);
        lVar.f5773o = nr.h;
        org.telegram.ui.xx xxVar = (org.telegram.ui.xx) this;
        this.V = new wn0(xxVar, context, oyVar, i10, i11, lVar, oyVar.C, oyVar, context);
        if (i11 == 15) {
            ArrayList R3 = oyVar.R3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < R3.size(); i18 = android.support.v4.media.a.g(((TLRPC.Dialog) R3.get(i18)).f19188id, arrayList, i18, 1)) {
            }
            this.V.f44906n0 = arrayList;
        }
        this.N0 = (qv0) oyVar.getFragmentView();
        lh.e1 e1Var = new lh.e1(xxVar, context, 19);
        this.S = e1Var;
        e1Var.setItemAnimator(this.U);
        e1Var.setPivotY(0.0f);
        e1Var.setClipToPadding(false);
        e1Var.setAdapter(this.V);
        e1Var.setVerticalScrollBarEnabled(true);
        e1Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        e1Var.setVerticalScrollbarPosition(i13);
        f2.i0 i0Var = new f2.i0(1, false);
        this.W = i0Var;
        e1Var.setLayoutManager(i0Var);
        e1Var.V1 = true;
        e1Var.W1 = 0;
        e1Var.setOnScrollListener(new sn0(xxVar, oyVar, 2));
        e1Var.C0(new cc0(xxVar, 23));
        org.telegram.ui.t10 t10Var = new org.telegram.ui.t10(this.G0);
        this.J0 = t10Var;
        lh.e1 e1Var2 = t10Var.f38474b;
        e1Var2.setClipToPadding(false);
        e1Var2.j(new vn0(xxVar, 1));
        e1Var2.C0(new cc0(xxVar, 23));
        t10Var.setUiCallback(this);
        t10Var.setVisibility(8);
        t10Var.setChatPreviewDelegate(txVar);
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(1);
        qn0 qn0Var = new qn0(xxVar, context, t00Var, 2);
        this.T = qn0Var;
        qn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qn0Var.e.setVisibility(8);
        qn0Var.setVisibility(8);
        qn0Var.addView(t00Var, 0);
        qn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.addView(qn0Var);
        frameLayout.addView(e1Var);
        frameLayout.addView(t10Var);
        e1Var.setEmptyView(qn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f24319c0 = frameLayout2;
        xn0 xn0Var = new xn0(xxVar);
        xn0Var.f5818m = false;
        xn0Var.C = false;
        nr nrVar = nr.h;
        xn0Var.o(nrVar);
        xn0Var.n(350L);
        sl0 sl0Var = new sl0(context, null);
        this.f24322f0 = sl0Var;
        sl0Var.setItemAnimator(xn0Var);
        sl0Var.setPivotY(0.0f);
        sl0Var.setVerticalScrollBarEnabled(true);
        sl0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        sl0Var.setVerticalScrollbarPosition(i14);
        f2.i0 i0Var2 = new f2.i0(1, false);
        this.f24321e0 = i0Var2;
        sl0Var.setLayoutManager(i0Var2);
        sl0Var.V1 = true;
        sl0Var.W1 = 0;
        sl0Var.setClipToPadding(false);
        t00 t00Var2 = new t00(context, null);
        t00Var2.setViewType(1);
        qn0 qn0Var2 = new qn0(xxVar, context, t00Var2, 3);
        this.f24320d0 = qn0Var2;
        qn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        qn0Var2.e.setVisibility(8);
        qn0Var2.setVisibility(8);
        qn0Var2.addView(t00Var2, 0);
        qn0Var2.e(true, false);
        frameLayout2.addView(qn0Var2);
        frameLayout2.addView(sl0Var);
        sl0Var.setEmptyView(qn0Var2);
        yn0 yn0Var = new yn0(xxVar, sl0Var, context, this.E0, i12, oyVar);
        this.f24323g0 = yn0Var;
        sl0Var.setAdapter(yn0Var);
        sl0Var.setOnScrollListener(new sn0(xxVar, oyVar, 3));
        sl0Var.C0(new cc0(xxVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f24324h0 = frameLayout3;
        pn0 pn0Var = new pn0(xxVar);
        pn0Var.f5818m = false;
        pn0Var.C = false;
        pn0Var.o(nrVar);
        pn0Var.n(350L);
        sl0 sl0Var2 = new sl0(context, null);
        this.f24327k0 = sl0Var2;
        sl0Var2.setItemAnimator(pn0Var);
        sl0Var2.setPivotY(0.0f);
        sl0Var2.setClipToPadding(false);
        sl0Var2.setVerticalScrollBarEnabled(true);
        sl0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        sl0Var2.setVerticalScrollbarPosition(i15);
        f2.i0 i0Var3 = new f2.i0(1, false);
        this.f24326j0 = i0Var3;
        sl0Var2.setLayoutManager(i0Var3);
        sl0Var2.V1 = true;
        sl0Var2.W1 = 0;
        t00 t00Var3 = new t00(context, null);
        t00Var3.setViewType(1);
        qn0 qn0Var3 = new qn0(xxVar, context, t00Var3, 0);
        this.f24325i0 = qn0Var3;
        qn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        qn0Var3.e.setVisibility(8);
        qn0Var3.setVisibility(8);
        qn0Var3.addView(t00Var3, 0);
        qn0Var3.e(true, false);
        frameLayout3.addView(qn0Var3);
        frameLayout3.addView(sl0Var2);
        sl0Var2.setEmptyView(qn0Var3);
        rn0 rn0Var = new rn0(xxVar, sl0Var2, context, this.E0, i12);
        this.f24328l0 = rn0Var;
        sl0Var2.setAdapter(rn0Var);
        sl0Var2.setOnScrollListener(new sn0(xxVar, oyVar, 0));
        sl0Var2.C0(new cc0(xxVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f24330o0 = frameLayout4;
        tn0 tn0Var = new tn0(xxVar);
        tn0Var.f5818m = false;
        tn0Var.C = false;
        tn0Var.o(nrVar);
        tn0Var.n(350L);
        sl0 sl0Var3 = new sl0(context, null);
        this.f24333r0 = sl0Var3;
        sl0Var3.setItemAnimator(tn0Var);
        sl0Var3.setPivotY(0.0f);
        sl0Var3.setVerticalScrollBarEnabled(true);
        sl0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        sl0Var3.setVerticalScrollbarPosition(i16);
        f2.i0 i0Var4 = new f2.i0(1, false);
        this.f24332q0 = i0Var4;
        sl0Var3.setLayoutManager(i0Var4);
        sl0Var3.V1 = true;
        sl0Var3.W1 = 0;
        sl0Var3.setClipToPadding(false);
        t00 t00Var4 = new t00(context, null);
        t00Var4.setViewType(1);
        qn0 qn0Var4 = new qn0(xxVar, context, t00Var4, 1);
        this.f24331p0 = qn0Var4;
        qn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        qn0Var4.e.setVisibility(8);
        qn0Var4.setVisibility(8);
        qn0Var4.addView(t00Var4, 0);
        qn0Var4.e(true, false);
        frameLayout4.addView(qn0Var4);
        frameLayout4.addView(sl0Var3);
        sl0Var3.setEmptyView(qn0Var4);
        un0 un0Var = new un0(xxVar, sl0Var3, context, this.E0);
        this.f24334s0 = un0Var;
        sl0Var3.setAdapter(un0Var);
        sl0Var3.setOnScrollListener(new sn0(xxVar, oyVar, 1));
        sl0Var3.C0(new cc0(xxVar, 23));
        this.f24317a0 = new zk0(e1Var, true);
        eh0 eh0Var = new eh0(context, oyVar);
        this.m0 = eh0Var;
        g61 g61Var = eh0Var.f24578c;
        g61Var.setClipToPadding(false);
        g61Var.j(new vn0(xxVar, 0));
        g61Var.C0(new cc0(xxVar, 23));
        co0 co0Var = new co0(xxVar);
        this.Q = co0Var;
        setAdapter(co0Var);
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

    public static void P(FrameLayout frameLayout, sl0 sl0Var, int i10, int i11, boolean z4) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z4) {
            sl0Var.o1(0, i10, 0, i11);
        } else {
            sl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f24329n0) {
            int i10 = 0;
            this.f24329n0 = false;
            R();
            a81 a81Var = this.J;
            if (a81Var != null && a81Var.getCurrentTabId() != 0) {
                this.J.d(0, 0);
            }
            wn0 wn0Var = this.V;
            if (wn0Var != null) {
                String str = this.H0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f24339x0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((tf.e0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                wn0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            co0 co0Var = this.Q;
            ArrayList arrayList = co0Var.f24031a;
            ArrayList arrayList2 = co0Var.f24031a;
            if (i11 < arrayList.size()) {
                if (((bo0) arrayList2.get(i11)).f23731a == 3 && ((bo0) arrayList2.get(i11)).f23732b == i10) {
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
            lh.e1 e1Var = this.S;
            if (i10 >= e1Var.getChildCount()) {
                break;
            }
            View childAt = e1Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.h6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
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
        org.telegram.ui.t10 t10Var = this.J0;
        if (t10Var != null) {
            arrayList.addAll(t10Var.getThemeDescriptions());
        }
        qn0 qn0Var = this.T;
        arrayList.add(new org.telegram.ui.ActionBar.l6(qn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(qn0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20281y6));
        arrayList.addAll(k7.e6.a(new t6(this, 7), org.telegram.ui.ActionBar.j6.f20283y8));
    }

    public final boolean N() {
        int i10 = this.E0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f24338w0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i10, String str, boolean z4) {
        long j10;
        long j11;
        boolean z10;
        org.telegram.ui.t10 t10Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        qn0 qn0Var = this.T;
        if (isEmpty) {
            qn0Var.e.setVisibility(8);
        } else {
            qn0Var.e.setVisibility(0);
            qn0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        wn0 wn0Var = this.V;
        org.telegram.ui.zx zxVar = wn0Var.R;
        if (zxVar != null) {
            j10 = zxVar.a();
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
        boolean z18 = false;
        while (true) {
            ArrayList arrayList = this.f24339x0;
            if (i11 >= arrayList.size()) {
                break;
            }
            tf.e0 e0Var = (tf.e0) arrayList.get(i11);
            int i12 = e0Var.d;
            if (i12 == 4) {
                TLObject tLObject = e0Var.f44706f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f19331id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j12 = -((TLRPC.Chat) e0Var.f44706f).f19184id;
                }
                j11 = j12;
            } else if (i12 == 6) {
                tf.c0 c0Var = e0Var.f44707g;
                long j15 = c0Var.f44677b;
                j14 = c0Var.f44678c;
                j13 = j15;
            } else if (i12 == 7) {
                z18 = true;
            }
            i11++;
        }
        un0 un0Var = this.f24334s0;
        un0Var.getClass();
        if (g40.X(str, null) == null) {
            J();
        }
        if (view == this.f24319c0) {
            MessagesController.getInstance(this.E0).getChannelRecommendations(0L);
            yn0 yn0Var = this.f24323g0;
            sl0 sl0Var = yn0Var.d;
            ArrayList arrayList2 = yn0Var.N;
            ArrayList arrayList3 = yn0Var.O;
            ArrayList arrayList4 = yn0Var.P;
            ArrayList arrayList5 = yn0Var.M;
            vp vpVar = yn0Var.Z;
            yn0Var.W();
            if (!TextUtils.equals(str, yn0Var.Y)) {
                yn0Var.Y = str;
                AndroidUtilities.cancelRunOnUIThread(vpVar);
                if (TextUtils.isEmpty(yn0Var.Y)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    yn0Var.N(true);
                    yn0Var.X++;
                    z17 = false;
                    yn0Var.T = false;
                    yn0Var.U = false;
                    yn0Var.V = false;
                    yn0Var.W = 0;
                    if (sl0Var != null) {
                        sl0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(vpVar, 1000L);
                    yn0Var.T = true;
                    yn0Var.U = true;
                    yn0Var.N(true);
                    if (sl0Var != null) {
                        z17 = false;
                        sl0Var.u0(0);
                    }
                }
                this.f24320d0.b(this.K0, z17);
            }
            z17 = false;
            this.f24320d0.b(this.K0, z17);
        } else if (view == this.f24324h0) {
            rn0 rn0Var = this.f24328l0;
            sl0 sl0Var2 = rn0Var.d;
            ArrayList arrayList6 = rn0Var.Q;
            ls lsVar = rn0Var.f27976c0;
            if (TextUtils.equals(str, rn0Var.f27975b0)) {
                z16 = false;
            } else {
                rn0Var.f27975b0 = str;
                AndroidUtilities.cancelRunOnUIThread(lsVar);
                if (TextUtils.isEmpty(rn0Var.f27975b0)) {
                    arrayList6.clear();
                    rn0Var.N(true);
                    rn0Var.f27974a0++;
                    z16 = false;
                    rn0Var.W = false;
                    rn0Var.X = false;
                    rn0Var.Y = false;
                    rn0Var.Z = 0;
                    if (sl0Var2 != null) {
                        sl0Var2.u0(0);
                    }
                } else {
                    z16 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(lsVar, 1000L);
                    rn0Var.W = true;
                    rn0Var.X = true;
                    rn0Var.N(true);
                    if (sl0Var2 != null) {
                        sl0Var2.u0(0);
                    }
                }
            }
            this.f24325i0.b(this.K0, z16);
            if (TextUtils.isEmpty(str)) {
                rn0Var.V();
            }
        } else {
            eh0 eh0Var = this.m0;
            if (view == eh0Var) {
                g61 g61Var = eh0Var.f24578c;
                ArrayList arrayList7 = eh0Var.f24580n;
                if (!TextUtils.equals(eh0Var.f24583w, str)) {
                    if (eh0Var.H >= 0) {
                        ConnectionsManager.getInstance(eh0Var.f24577b).cancelRequest(eh0Var.H, true);
                        eh0Var.H = -1;
                    }
                    eh0Var.v = false;
                    eh0Var.E.setLoading(false);
                    eh0Var.f24583w = str;
                    if (TextUtils.isEmpty(str)) {
                        eh0Var.f24581r = 0;
                        z15 = true;
                        eh0Var.I++;
                        eh0Var.f24582s = false;
                        arrayList7.clear();
                        eh0Var.a(false);
                    } else {
                        z15 = true;
                        eh0Var.b(str);
                        eh0Var.f24581r = 0;
                        eh0Var.I++;
                        eh0Var.f24582s = false;
                        arrayList7.clear();
                    }
                    eh0Var.d();
                    g61Var.u0(0);
                    g61Var.V2.N(z15);
                }
            } else if (view == this.f24330o0) {
                if (g40.X(str, null) != null) {
                    if (z4) {
                        this.f24332q0.h1(0, 0);
                    }
                    un0Var.Y(str);
                    this.f24331p0.b(this.K0, false);
                }
            } else if (view == this.R) {
                org.telegram.ui.t10 t10Var2 = this.J0;
                if ((j11 == 0 && this.Q0 == 0 && j13 == 0 && j14 == 0) || j10 != 0) {
                    this.F0 = false;
                    wn0Var.U(z18 ? 1 : 0, str);
                    wn0Var.f44920x0 = this.I0;
                    t10Var2.animate().setListener(null).cancel();
                    t10Var2.i(null, false);
                    if (z4) {
                        if (wn0Var.A0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        qn0Var.e(!z13, false);
                        if (wn0Var.A0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        qn0Var.e(z14, false);
                    } else if (!wn0Var.N()) {
                        if (wn0Var.A0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        qn0Var.e(z12, true);
                    }
                    if (z4) {
                        t10Var2.setVisibility(8);
                    } else if (t10Var2.getVisibility() != 8) {
                        t10Var2.animate().alpha(0.0f).setListener(new nd0(this, 9)).setDuration(150L).start();
                    }
                    t10Var2.setTag(null);
                    t10Var = t10Var2;
                    z11 = false;
                } else {
                    boolean z19 = true;
                    t10Var2.setTag(1);
                    t10Var2.i(this.I0, false);
                    t10Var2.animate().setListener(null).cancel();
                    if (z4) {
                        t10Var2.setVisibility(0);
                        t10Var2.setAlpha(1.0f);
                        z19 = z4;
                    } else {
                        if (t10Var2.getVisibility() != 0) {
                            t10Var2.setVisibility(0);
                            t10Var2.setAlpha(0.0f);
                        } else {
                            z19 = z4;
                        }
                        t10Var2.animate().alpha(1.0f).setDuration(150L).start();
                    }
                    t10Var = t10Var2;
                    z11 = false;
                    this.J0.h(j11, this.Q0, j13, j14, null, z18, str, z19);
                    qn0Var.setVisibility(8);
                }
                qn0Var.b(this.K0, z11);
                t10Var.f38476c.b(this.K0, z11);
            } else {
                long j16 = j10;
                long j17 = j13;
                long j18 = j14;
                if (view instanceof org.telegram.ui.t10) {
                    org.telegram.ui.t10 t10Var3 = (org.telegram.ui.t10) view;
                    if (j16 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t10Var3.setUseFromUserAsAvatar(z10);
                    t10Var3.f38476c.b(this.K0, false);
                    t10Var3.h(j11, this.Q0, j17, j18, tf.g0.Z2[((bo0) this.Q.f24031a.get(i10)).f23732b], z18, str, z4);
                } else if (view instanceof dn0) {
                    dn0 dn0Var = (dn0) view;
                    dn0Var.f24307a.b(this.K0, false);
                    dn0Var.H = str;
                    dn0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z4) {
        rl0 rl0Var;
        rl0 rl0Var2;
        rl0 rl0Var3;
        int i10;
        boolean z10;
        int i11;
        org.telegram.ui.zx zxVar;
        int i12;
        if (this.f24337v0 != z4) {
            org.telegram.ui.oy oyVar = this.G0;
            if (!z4 || !oyVar.getActionBar().s()) {
                int i13 = 72;
                if (z4 && !oyVar.getActionBar().a("search_view_pager")) {
                    this.C0 = oyVar.getActionBar().j("search_view_pager");
                    if (oyVar.T) {
                        ImageView imageView = new ImageView(getContext());
                        this.f24335t0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f24335t0.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
                        this.f24335t0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20283y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f24335t0.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20300z8, false), 1, -1));
                        this.f24335t0.setOnClickListener(new z70(this, 14));
                        this.C0.addView(this.f24335t0, k7.b6.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.C0.getContext());
                    this.f24336u0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f24336u0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f24336u0;
                    int i14 = org.telegram.ui.ActionBar.j6.f20283y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                    org.telegram.ui.ActionBar.z zVar = this.C0;
                    NumberTextView numberTextView3 = this.f24336u0;
                    if (oyVar.T) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    zVar.addView(numberTextView3, k7.b6.m(1.0f, 0, -1, i12, 0, 0));
                    this.f24336u0.setOnTouchListener(new oh.d(21));
                    org.telegram.ui.ActionBar.w0 h = this.C0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.f24340y0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.f24341z0 = this.C0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.A0 = this.C0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.B0 = this.C0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f24336u0 != null) {
                    wn0 wn0Var = this.V;
                    if (wn0Var != null && (zxVar = wn0Var.R) != null && zxVar.a() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24336u0.getLayoutParams();
                    if (oyVar.T) {
                        i13 = 18;
                    }
                    if (z10) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f24336u0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (oyVar.getActionBar().getBackButton() != null && (oyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.f5)) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
                    oyVar.getActionBar().setBackButtonDrawable(i2Var);
                    i2Var.setColorFilter(null);
                }
                this.f24337v0 = z4;
                HashMap hashMap = this.f24338w0;
                if (z4) {
                    AndroidUtilities.hideKeyboard(oyVar.getParentActivity().getCurrentFocus());
                    oyVar.getActionBar().O(null, null);
                    this.f24336u0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f24340y0;
                    if (N()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    this.f24341z0.setVisibility(0);
                    this.A0.setVisibility(0);
                    this.B0.setVisibility(0);
                    return;
                }
                oyVar.getActionBar().r();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.t10) && (rl0Var3 = ((org.telegram.ui.t10) getChildAt(i15)).d) != null) {
                        rl0Var3.l();
                    }
                    if (getChildAt(i15) instanceof dn0) {
                        ((dn0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.t10 t10Var = this.J0;
                if (t10Var != null && (rl0Var2 = t10Var.d) != null) {
                    rl0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.t10) && (rl0Var = ((org.telegram.ui.t10) view).d) != null) {
                        rl0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.Q.i();
        o(false);
        a81 a81Var = this.J;
        if (a81Var != null) {
            a81Var.f26228x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final boolean b(org.telegram.ui.l10 l10Var) {
        return this.f24338w0.containsKey(l10Var);
    }

    @Override
    public final void c(MessageObject messageObject) {
        this.G0.presentFragment(K(messageObject, this.E0));
        Q(false);
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z4;
        int i11;
        int i12;
        org.telegram.ui.l10 l10Var = new org.telegram.ui.l10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f24338w0;
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
            this.f24336u0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f24341z0;
            if (w0Var != null) {
                if (hashMap.size() == 1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                w0Var.setVisibility(i12);
            }
            if (this.f24340y0 != null) {
                boolean N = N();
                if (N) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (this.f24340y0.getVisibility() != i11) {
                    this.f24340y0.setVisibility(i11);
                    int i14 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f24340y0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20283y8, false), PorterDuff.Mode.SRC_IN));
                    if (N) {
                        animatedVectorDrawable.start();
                    } else if (i14 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.B0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((MessageObject) hashMap.get((org.telegram.ui.l10) it.next())).isDownloadingFile) {
                            z4 = false;
                            break;
                        }
                    } else {
                        z4 = true;
                        break;
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = this.B0;
                if (!z4) {
                    i13 = 8;
                }
                w0Var2.setVisibility(i13);
            }
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).b(i10, hashMap.containsKey(l10Var));
        } else if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).f(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).e(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(l10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(hashMap.containsKey(l10Var), true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z4 = false;
        yn0 yn0Var = this.f24323g0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.E0).getChannelRecommendations(0L) != null) {
                z4 = true;
            }
            this.f24320d0.e(z4, true);
            yn0Var.W();
            yn0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f24328l0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                un0 un0Var = this.f24334s0;
                if (obj == un0Var.N) {
                    un0Var.N(true);
                }
            }
        } else {
            yn0Var.W();
            yn0Var.N(true);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.R;
                sl0 sl0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        sl0Var = this.S;
                    } else if (view == this.f24319c0) {
                        sl0Var = this.f24322f0;
                    } else if (view == this.f24324h0) {
                        sl0Var = this.f24327k0;
                    } else if (view == this.f24330o0) {
                        sl0Var = this.f24333r0;
                    } else {
                        dn0 dn0Var = this.D0;
                        if (view == dn0Var) {
                            sl0Var = dn0Var.f24308b;
                        } else {
                            eh0 eh0Var = this.m0;
                            if (view == eh0Var) {
                                sl0Var = eh0Var.f24578c;
                            } else if (view instanceof org.telegram.ui.t10) {
                                sl0Var = ((org.telegram.ui.t10) view).f38474b;
                            }
                        }
                    }
                }
                if (sl0Var != null) {
                    tg.c.b(sl0Var, canvas, rectF, sl0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.t10 t10Var = this.J0;
                    if (t10Var.getVisibility() == 0) {
                        lh.e1 e1Var = t10Var.f38474b;
                        tg.c.b(e1Var, canvas, rectF, e1Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean f() {
        return this.f24337v0;
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f6327b = true;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.C0;
    }

    public ArrayList<tf.e0> getCurrentSearchFilters() {
        return this.f24339x0;
    }

    public dn0 getDownloadsContainer() {
        return this.D0;
    }

    public int getFolderId() {
        return this.O0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.w0 getSpeedItem() {
        return this.f24340y0;
    }

    public k81 getTabsView() {
        return this.J;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.E0;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        this.f24318b0 = true;
        yn0 yn0Var = this.f24323g0;
        if (yn0Var != null) {
            yn0Var.N(false);
        }
        rn0 rn0Var = this.f24328l0;
        if (rn0Var != null) {
            rn0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24318b0 = false;
        int i10 = this.E0;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogDeleted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.reloadWebappsHints);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
    }

    @Override
    public final void s() {
        this.N0.M();
    }

    public void setBlurredBackgroundDrawableFactory(ng.a aVar) {
        this.T0 = aVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.k10 k10Var) {
        this.I0 = k10Var;
    }

    public void setKeyboardHeight(int i10) {
        boolean z4;
        this.K0 = i10;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.t10) {
                ((org.telegram.ui.t10) getChildAt(i11)).f38476c.b(i10, z4);
            } else if (getChildAt(i11) == this.R) {
                this.T.b(i10, z4);
                this.J0.f38476c.b(i10, z4);
            } else if (getChildAt(i11) instanceof dn0) {
                ((dn0) getChildAt(i11)).f24307a.b(i10, z4);
            } else if (getChildAt(i11) == this.f24319c0) {
                this.f24320d0.b(i10, z4);
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
        a81 a81Var = this.J;
        if (a81Var != null) {
            a81Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z4;
        wn0 wn0Var = this.V;
        org.telegram.ui.t10 t10Var = this.J0;
        if (i10 == 0) {
            if (t10Var.getVisibility() == 0) {
                t10Var.i(this.I0, false);
                wn0Var.f44920x0 = null;
            } else {
                t10Var.i(null, false);
                org.telegram.ui.k10 k10Var = this.I0;
                wn0Var.f44920x0 = k10Var;
                if (k10Var != null) {
                    ((org.telegram.ui.sv) k10Var).h(false, null, wn0Var.f44916v0, wn0Var.f44918w0);
                }
            }
        } else if (view instanceof org.telegram.ui.t10) {
            if (i11 == 0 && t10Var.getVisibility() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ((org.telegram.ui.t10) view).i(this.I0, z4);
        }
        if (view2 instanceof org.telegram.ui.t10) {
            ((org.telegram.ui.t10) view2).i(null, false);
            return;
        }
        wn0Var.f44920x0 = null;
        t10Var.i(null, false);
    }
}
