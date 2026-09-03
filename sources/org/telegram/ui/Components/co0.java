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
public abstract class co0 extends l81 implements org.telegram.ui.t10, NotificationCenter.NotificationCenterDelegate, og.a {
    public static final int U0 = 0;
    public org.telegram.ui.ActionBar.w0 A0;
    public org.telegram.ui.ActionBar.w0 B0;
    public org.telegram.ui.ActionBar.z C0;
    public cn0 D0;
    public final int E0;
    public boolean F0;
    public final org.telegram.ui.qy G0;
    public String H0;
    public org.telegram.ui.l10 I0;
    public final org.telegram.ui.u10 J0;
    public int K0;
    public boolean L0;
    public final org.telegram.ui.vx M0;
    public final qv0 N0;
    public final int O0;
    public int P0;
    public final bo0 Q;
    public final long Q0;
    public final FrameLayout R;
    public int R0;
    public final lh.e1 S;
    public int S0;
    public final pn0 T;
    public ng.a T0;
    public final f2.l U;
    public final vn0 V;
    public final f2.i0 W;
    public final yk0 f23983a0;
    public boolean f23984b0;
    public final FrameLayout f23985c0;
    public final pn0 f23986d0;
    public final f2.i0 f23987e0;
    public final rl0 f23988f0;
    public final xn0 f23989g0;
    public final FrameLayout f23990h0;
    public final pn0 f23991i0;
    public final f2.i0 f23992j0;
    public final rl0 f23993k0;
    public final qn0 f23994l0;
    public final fh0 m0;
    public boolean f23995n0;
    public final FrameLayout f23996o0;
    public final pn0 f23997p0;
    public final f2.i0 f23998q0;
    public final rl0 f23999r0;
    public final tn0 f24000s0;
    public ImageView f24001t0;
    public NumberTextView f24002u0;
    public boolean f24003v0;
    public final HashMap f24004w0;
    public final ArrayList f24005x0;
    public org.telegram.ui.ActionBar.w0 f24006y0;
    public org.telegram.ui.ActionBar.w0 f24007z0;

    public co0(Context context, org.telegram.ui.qy qyVar, int i10, int i11, int i12, long j10, org.telegram.ui.vx vxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f23995n0 = false;
        this.f24004w0 = new HashMap();
        this.f24005x0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.E0 = i17;
        this.P0 = 0;
        this.O0 = i12;
        this.Q0 = j10;
        this.G0 = qyVar;
        this.M0 = vxVar;
        f2.l lVar = new f2.l();
        this.U = lVar;
        lVar.f5826c = 150L;
        lVar.e = 350L;
        lVar.f5827f = 0L;
        lVar.f5828g = 0L;
        lVar.d = 0L;
        lVar.f5829i = new OvershootInterpolator(1.1f);
        lVar.f5762o = mr.h;
        org.telegram.ui.zx zxVar = (org.telegram.ui.zx) this;
        this.V = new vn0(zxVar, context, qyVar, i10, i11, lVar, qyVar.C, qyVar, context);
        if (i11 == 15) {
            ArrayList R3 = qyVar.R3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < R3.size(); i18 = android.support.v4.media.a.g(((TLRPC.Dialog) R3.get(i18)).f19163id, arrayList, i18, 1)) {
            }
            this.V.f44968n0 = arrayList;
        }
        this.N0 = (qv0) qyVar.getFragmentView();
        lh.e1 e1Var = new lh.e1(zxVar, context, 19);
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
        e1Var.setOnScrollListener(new rn0(zxVar, qyVar, 2));
        e1Var.C0(new dc0(zxVar, 23));
        org.telegram.ui.u10 u10Var = new org.telegram.ui.u10(this.G0);
        this.J0 = u10Var;
        lh.e1 e1Var2 = u10Var.f38640b;
        e1Var2.setClipToPadding(false);
        e1Var2.j(new un0(zxVar, 1));
        e1Var2.C0(new dc0(zxVar, 23));
        u10Var.setUiCallback(this);
        u10Var.setVisibility(8);
        u10Var.setChatPreviewDelegate(vxVar);
        u00 u00Var = new u00(context, null);
        u00Var.setViewType(1);
        pn0 pn0Var = new pn0(zxVar, context, u00Var, 2);
        this.T = pn0Var;
        pn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        pn0Var.e.setVisibility(8);
        pn0Var.setVisibility(8);
        pn0Var.addView(u00Var, 0);
        pn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.addView(pn0Var);
        frameLayout.addView(e1Var);
        frameLayout.addView(u10Var);
        e1Var.setEmptyView(pn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f23985c0 = frameLayout2;
        wn0 wn0Var = new wn0(zxVar);
        wn0Var.f5807m = false;
        wn0Var.C = false;
        mr mrVar = mr.h;
        wn0Var.o(mrVar);
        wn0Var.n(350L);
        rl0 rl0Var = new rl0(context, null);
        this.f23988f0 = rl0Var;
        rl0Var.setItemAnimator(wn0Var);
        rl0Var.setPivotY(0.0f);
        rl0Var.setVerticalScrollBarEnabled(true);
        rl0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        rl0Var.setVerticalScrollbarPosition(i14);
        f2.i0 i0Var2 = new f2.i0(1, false);
        this.f23987e0 = i0Var2;
        rl0Var.setLayoutManager(i0Var2);
        rl0Var.V1 = true;
        rl0Var.W1 = 0;
        rl0Var.setClipToPadding(false);
        u00 u00Var2 = new u00(context, null);
        u00Var2.setViewType(1);
        pn0 pn0Var2 = new pn0(zxVar, context, u00Var2, 3);
        this.f23986d0 = pn0Var2;
        pn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        pn0Var2.e.setVisibility(8);
        pn0Var2.setVisibility(8);
        pn0Var2.addView(u00Var2, 0);
        pn0Var2.e(true, false);
        frameLayout2.addView(pn0Var2);
        frameLayout2.addView(rl0Var);
        rl0Var.setEmptyView(pn0Var2);
        xn0 xn0Var = new xn0(zxVar, rl0Var, context, this.E0, i12, qyVar);
        this.f23989g0 = xn0Var;
        rl0Var.setAdapter(xn0Var);
        rl0Var.setOnScrollListener(new rn0(zxVar, qyVar, 3));
        rl0Var.C0(new dc0(zxVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f23990h0 = frameLayout3;
        on0 on0Var = new on0(zxVar);
        on0Var.f5807m = false;
        on0Var.C = false;
        on0Var.o(mrVar);
        on0Var.n(350L);
        rl0 rl0Var2 = new rl0(context, null);
        this.f23993k0 = rl0Var2;
        rl0Var2.setItemAnimator(on0Var);
        rl0Var2.setPivotY(0.0f);
        rl0Var2.setClipToPadding(false);
        rl0Var2.setVerticalScrollBarEnabled(true);
        rl0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        rl0Var2.setVerticalScrollbarPosition(i15);
        f2.i0 i0Var3 = new f2.i0(1, false);
        this.f23992j0 = i0Var3;
        rl0Var2.setLayoutManager(i0Var3);
        rl0Var2.V1 = true;
        rl0Var2.W1 = 0;
        u00 u00Var3 = new u00(context, null);
        u00Var3.setViewType(1);
        pn0 pn0Var3 = new pn0(zxVar, context, u00Var3, 0);
        this.f23991i0 = pn0Var3;
        pn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        pn0Var3.e.setVisibility(8);
        pn0Var3.setVisibility(8);
        pn0Var3.addView(u00Var3, 0);
        pn0Var3.e(true, false);
        frameLayout3.addView(pn0Var3);
        frameLayout3.addView(rl0Var2);
        rl0Var2.setEmptyView(pn0Var3);
        qn0 qn0Var = new qn0(zxVar, rl0Var2, context, this.E0, i12);
        this.f23994l0 = qn0Var;
        rl0Var2.setAdapter(qn0Var);
        rl0Var2.setOnScrollListener(new rn0(zxVar, qyVar, 0));
        rl0Var2.C0(new dc0(zxVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f23996o0 = frameLayout4;
        sn0 sn0Var = new sn0(zxVar);
        sn0Var.f5807m = false;
        sn0Var.C = false;
        sn0Var.o(mrVar);
        sn0Var.n(350L);
        rl0 rl0Var3 = new rl0(context, null);
        this.f23999r0 = rl0Var3;
        rl0Var3.setItemAnimator(sn0Var);
        rl0Var3.setPivotY(0.0f);
        rl0Var3.setVerticalScrollBarEnabled(true);
        rl0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        rl0Var3.setVerticalScrollbarPosition(i16);
        f2.i0 i0Var4 = new f2.i0(1, false);
        this.f23998q0 = i0Var4;
        rl0Var3.setLayoutManager(i0Var4);
        rl0Var3.V1 = true;
        rl0Var3.W1 = 0;
        rl0Var3.setClipToPadding(false);
        u00 u00Var4 = new u00(context, null);
        u00Var4.setViewType(1);
        pn0 pn0Var4 = new pn0(zxVar, context, u00Var4, 1);
        this.f23997p0 = pn0Var4;
        pn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        pn0Var4.e.setVisibility(8);
        pn0Var4.setVisibility(8);
        pn0Var4.addView(u00Var4, 0);
        pn0Var4.e(true, false);
        frameLayout4.addView(pn0Var4);
        frameLayout4.addView(rl0Var3);
        rl0Var3.setEmptyView(pn0Var4);
        tn0 tn0Var = new tn0(zxVar, rl0Var3, context, this.E0);
        this.f24000s0 = tn0Var;
        rl0Var3.setAdapter(tn0Var);
        rl0Var3.setOnScrollListener(new rn0(zxVar, qyVar, 1));
        rl0Var3.C0(new dc0(zxVar, 23));
        this.f23983a0 = new yk0(e1Var, true);
        fh0 fh0Var = new fh0(context, qyVar);
        this.m0 = fh0Var;
        g61 g61Var = fh0Var.f24889c;
        g61Var.setClipToPadding(false);
        g61Var.j(new un0(zxVar, 0));
        g61Var.C0(new dc0(zxVar, 23));
        bo0 bo0Var = new bo0(zxVar);
        this.Q = bo0Var;
        setAdapter(bo0Var);
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

    public static void P(FrameLayout frameLayout, rl0 rl0Var, int i10, int i11, boolean z4) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z4) {
            rl0Var.n1(0, i10, 0, i11);
        } else {
            rl0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rl0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f23995n0) {
            int i10 = 0;
            this.f23995n0 = false;
            R();
            a81 a81Var = this.J;
            if (a81Var != null && a81Var.getCurrentTabId() != 0) {
                this.J.d(0, 0);
            }
            vn0 vn0Var = this.V;
            if (vn0Var != null) {
                String str = this.H0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f24005x0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((tf.e0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                vn0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            bo0 bo0Var = this.Q;
            ArrayList arrayList = bo0Var.f23728a;
            ArrayList arrayList2 = bo0Var.f23728a;
            if (i11 < arrayList.size()) {
                if (((ao0) arrayList2.get(i11)).f23464a == 3 && ((ao0) arrayList2.get(i11)).f23465b == i10) {
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
            if ((childAt instanceof org.telegram.ui.Cells.g6) || (childAt instanceof org.telegram.ui.Cells.q2) || (childAt instanceof org.telegram.ui.Cells.k4)) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
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
        org.telegram.ui.u10 u10Var = this.J0;
        if (u10Var != null) {
            arrayList.addAll(u10Var.getThemeDescriptions());
        }
        pn0 pn0Var = this.T;
        arrayList.add(new org.telegram.ui.ActionBar.l6(pn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(pn0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20256y6));
        arrayList.addAll(k7.e6.a(new t6(this, 7), org.telegram.ui.ActionBar.j6.f20258y8));
    }

    public final boolean N() {
        int i10 = this.E0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f24004w0.values()) {
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
        org.telegram.ui.u10 u10Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        pn0 pn0Var = this.T;
        if (isEmpty) {
            pn0Var.e.setVisibility(8);
        } else {
            pn0Var.e.setVisibility(0);
            pn0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        vn0 vn0Var = this.V;
        org.telegram.ui.cy cyVar = vn0Var.R;
        if (cyVar != null) {
            j10 = cyVar.a();
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
            ArrayList arrayList = this.f24005x0;
            if (i11 >= arrayList.size()) {
                break;
            }
            tf.e0 e0Var = (tf.e0) arrayList.get(i11);
            int i12 = e0Var.d;
            if (i12 == 4) {
                TLObject tLObject = e0Var.f44768f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f19306id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j12 = -((TLRPC.Chat) e0Var.f44768f).f19159id;
                }
                j11 = j12;
            } else if (i12 == 6) {
                tf.c0 c0Var = e0Var.f44769g;
                long j15 = c0Var.f44739b;
                j14 = c0Var.f44740c;
                j13 = j15;
            } else if (i12 == 7) {
                z18 = true;
            }
            i11++;
        }
        tn0 tn0Var = this.f24000s0;
        tn0Var.getClass();
        if (h40.X(str, null) == null) {
            J();
        }
        if (view == this.f23985c0) {
            MessagesController.getInstance(this.E0).getChannelRecommendations(0L);
            xn0 xn0Var = this.f23989g0;
            rl0 rl0Var = xn0Var.d;
            ArrayList arrayList2 = xn0Var.N;
            ArrayList arrayList3 = xn0Var.O;
            ArrayList arrayList4 = xn0Var.P;
            ArrayList arrayList5 = xn0Var.M;
            up upVar = xn0Var.Z;
            xn0Var.W();
            if (!TextUtils.equals(str, xn0Var.Y)) {
                xn0Var.Y = str;
                AndroidUtilities.cancelRunOnUIThread(upVar);
                if (TextUtils.isEmpty(xn0Var.Y)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    xn0Var.N(true);
                    xn0Var.X++;
                    z17 = false;
                    xn0Var.T = false;
                    xn0Var.U = false;
                    xn0Var.V = false;
                    xn0Var.W = 0;
                    if (rl0Var != null) {
                        rl0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(upVar, 1000L);
                    xn0Var.T = true;
                    xn0Var.U = true;
                    xn0Var.N(true);
                    if (rl0Var != null) {
                        z17 = false;
                        rl0Var.u0(0);
                    }
                }
                this.f23986d0.b(this.K0, z17);
            }
            z17 = false;
            this.f23986d0.b(this.K0, z17);
        } else if (view == this.f23990h0) {
            qn0 qn0Var = this.f23994l0;
            rl0 rl0Var2 = qn0Var.d;
            ArrayList arrayList6 = qn0Var.Q;
            ks ksVar = qn0Var.f27640c0;
            if (TextUtils.equals(str, qn0Var.f27639b0)) {
                z16 = false;
            } else {
                qn0Var.f27639b0 = str;
                AndroidUtilities.cancelRunOnUIThread(ksVar);
                if (TextUtils.isEmpty(qn0Var.f27639b0)) {
                    arrayList6.clear();
                    qn0Var.N(true);
                    qn0Var.f27638a0++;
                    z16 = false;
                    qn0Var.W = false;
                    qn0Var.X = false;
                    qn0Var.Y = false;
                    qn0Var.Z = 0;
                    if (rl0Var2 != null) {
                        rl0Var2.u0(0);
                    }
                } else {
                    z16 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(ksVar, 1000L);
                    qn0Var.W = true;
                    qn0Var.X = true;
                    qn0Var.N(true);
                    if (rl0Var2 != null) {
                        rl0Var2.u0(0);
                    }
                }
            }
            this.f23991i0.b(this.K0, z16);
            if (TextUtils.isEmpty(str)) {
                qn0Var.V();
            }
        } else {
            fh0 fh0Var = this.m0;
            if (view == fh0Var) {
                g61 g61Var = fh0Var.f24889c;
                ArrayList arrayList7 = fh0Var.f24891n;
                if (!TextUtils.equals(fh0Var.f24894w, str)) {
                    if (fh0Var.H >= 0) {
                        ConnectionsManager.getInstance(fh0Var.f24888b).cancelRequest(fh0Var.H, true);
                        fh0Var.H = -1;
                    }
                    fh0Var.v = false;
                    fh0Var.E.setLoading(false);
                    fh0Var.f24894w = str;
                    if (TextUtils.isEmpty(str)) {
                        fh0Var.f24892r = 0;
                        z15 = true;
                        fh0Var.I++;
                        fh0Var.f24893s = false;
                        arrayList7.clear();
                        fh0Var.a(false);
                    } else {
                        z15 = true;
                        fh0Var.b(str);
                        fh0Var.f24892r = 0;
                        fh0Var.I++;
                        fh0Var.f24893s = false;
                        arrayList7.clear();
                    }
                    fh0Var.d();
                    g61Var.u0(0);
                    g61Var.V2.N(z15);
                }
            } else if (view == this.f23996o0) {
                if (h40.X(str, null) != null) {
                    if (z4) {
                        this.f23998q0.h1(0, 0);
                    }
                    tn0Var.Y(str);
                    this.f23997p0.b(this.K0, false);
                }
            } else if (view == this.R) {
                org.telegram.ui.u10 u10Var2 = this.J0;
                if ((j11 == 0 && this.Q0 == 0 && j13 == 0 && j14 == 0) || j10 != 0) {
                    this.F0 = false;
                    vn0Var.U(z18 ? 1 : 0, str);
                    vn0Var.f44982x0 = this.I0;
                    u10Var2.animate().setListener(null).cancel();
                    u10Var2.i(null, false);
                    if (z4) {
                        if (vn0Var.A0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        pn0Var.e(!z13, false);
                        if (vn0Var.A0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        pn0Var.e(z14, false);
                    } else if (!vn0Var.N()) {
                        if (vn0Var.A0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        pn0Var.e(z12, true);
                    }
                    if (z4) {
                        u10Var2.setVisibility(8);
                    } else if (u10Var2.getVisibility() != 8) {
                        u10Var2.animate().alpha(0.0f).setListener(new od0(this, 9)).setDuration(150L).start();
                    }
                    u10Var2.setTag(null);
                    u10Var = u10Var2;
                    z11 = false;
                } else {
                    boolean z19 = true;
                    u10Var2.setTag(1);
                    u10Var2.i(this.I0, false);
                    u10Var2.animate().setListener(null).cancel();
                    if (z4) {
                        u10Var2.setVisibility(0);
                        u10Var2.setAlpha(1.0f);
                        z19 = z4;
                    } else {
                        if (u10Var2.getVisibility() != 0) {
                            u10Var2.setVisibility(0);
                            u10Var2.setAlpha(0.0f);
                        } else {
                            z19 = z4;
                        }
                        u10Var2.animate().alpha(1.0f).setDuration(150L).start();
                    }
                    u10Var = u10Var2;
                    z11 = false;
                    this.J0.h(j11, this.Q0, j13, j14, null, z18, str, z19);
                    pn0Var.setVisibility(8);
                }
                pn0Var.b(this.K0, z11);
                u10Var.f38642c.b(this.K0, z11);
            } else {
                long j16 = j10;
                long j17 = j13;
                long j18 = j14;
                if (view instanceof org.telegram.ui.u10) {
                    org.telegram.ui.u10 u10Var3 = (org.telegram.ui.u10) view;
                    if (j16 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u10Var3.setUseFromUserAsAvatar(z10);
                    u10Var3.f38642c.b(this.K0, false);
                    u10Var3.h(j11, this.Q0, j17, j18, tf.g0.Z2[((ao0) this.Q.f23728a.get(i10)).f23465b], z18, str, z4);
                } else if (view instanceof cn0) {
                    cn0 cn0Var = (cn0) view;
                    cn0Var.f23973a.b(this.K0, false);
                    cn0Var.H = str;
                    cn0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z4) {
        ql0 ql0Var;
        ql0 ql0Var2;
        ql0 ql0Var3;
        int i10;
        boolean z10;
        int i11;
        org.telegram.ui.cy cyVar;
        int i12;
        if (this.f24003v0 != z4) {
            org.telegram.ui.qy qyVar = this.G0;
            if (!z4 || !qyVar.getActionBar().s()) {
                int i13 = 72;
                if (z4 && !qyVar.getActionBar().a("search_view_pager")) {
                    this.C0 = qyVar.getActionBar().j("search_view_pager");
                    if (qyVar.T) {
                        ImageView imageView = new ImageView(getContext());
                        this.f24001t0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f24001t0.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
                        this.f24001t0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20258y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f24001t0.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20275z8, false), 1, -1));
                        this.f24001t0.setOnClickListener(new a80(this, 14));
                        this.C0.addView(this.f24001t0, k7.b6.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.C0.getContext());
                    this.f24002u0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f24002u0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f24002u0;
                    int i14 = org.telegram.ui.ActionBar.j6.f20258y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                    org.telegram.ui.ActionBar.z zVar = this.C0;
                    NumberTextView numberTextView3 = this.f24002u0;
                    if (qyVar.T) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    zVar.addView(numberTextView3, k7.b6.m(1.0f, 0, -1, i12, 0, 0));
                    this.f24002u0.setOnTouchListener(new oh.d(21));
                    org.telegram.ui.ActionBar.w0 h = this.C0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.f24006y0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.f24007z0 = this.C0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.A0 = this.C0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.B0 = this.C0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f24002u0 != null) {
                    vn0 vn0Var = this.V;
                    if (vn0Var != null && (cyVar = vn0Var.R) != null && cyVar.a() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24002u0.getLayoutParams();
                    if (qyVar.T) {
                        i13 = 18;
                    }
                    if (z10) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f24002u0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (qyVar.getActionBar().getBackButton() != null && (qyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.f5)) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
                    qyVar.getActionBar().setBackButtonDrawable(i2Var);
                    i2Var.setColorFilter(null);
                }
                this.f24003v0 = z4;
                HashMap hashMap = this.f24004w0;
                if (z4) {
                    AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
                    qyVar.getActionBar().O(null, null);
                    this.f24002u0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f24006y0;
                    if (N()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    this.f24007z0.setVisibility(0);
                    this.A0.setVisibility(0);
                    this.B0.setVisibility(0);
                    return;
                }
                qyVar.getActionBar().r();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.u10) && (ql0Var3 = ((org.telegram.ui.u10) getChildAt(i15)).d) != null) {
                        ql0Var3.l();
                    }
                    if (getChildAt(i15) instanceof cn0) {
                        ((cn0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.u10 u10Var = this.J0;
                if (u10Var != null && (ql0Var2 = u10Var.d) != null) {
                    ql0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.u10) && (ql0Var = ((org.telegram.ui.u10) view).d) != null) {
                        ql0Var.l();
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
            a81Var.f26230x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final boolean b(org.telegram.ui.m10 m10Var) {
        return this.f24004w0.containsKey(m10Var);
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
        org.telegram.ui.m10 m10Var = new org.telegram.ui.m10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f24004w0;
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
            this.f24002u0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f24007z0;
            if (w0Var != null) {
                if (hashMap.size() == 1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                w0Var.setVisibility(i12);
            }
            if (this.f24006y0 != null) {
                boolean N = N();
                if (N) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (this.f24006y0.getVisibility() != i11) {
                    this.f24006y0.setVisibility(i11);
                    int i14 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f24006y0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20258y8, false), PorterDuff.Mode.SRC_IN));
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
                        if (!((MessageObject) hashMap.get((org.telegram.ui.m10) it.next())).isDownloadingFile) {
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
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).b(hashMap.containsKey(m10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r7) {
            ((org.telegram.ui.Cells.r7) view).b(i10, hashMap.containsKey(m10Var));
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).f(hashMap.containsKey(m10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).e(hashMap.containsKey(m10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view).c(hashMap.containsKey(m10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.q2) {
            ((org.telegram.ui.Cells.q2) view).V(hashMap.containsKey(m10Var), true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z4 = false;
        xn0 xn0Var = this.f23989g0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.E0).getChannelRecommendations(0L) != null) {
                z4 = true;
            }
            this.f23986d0.e(z4, true);
            xn0Var.W();
            xn0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f23994l0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                tn0 tn0Var = this.f24000s0;
                if (obj == tn0Var.N) {
                    tn0Var.N(true);
                }
            }
        } else {
            xn0Var.W();
            xn0Var.N(true);
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.R;
                rl0 rl0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        rl0Var = this.S;
                    } else if (view == this.f23985c0) {
                        rl0Var = this.f23988f0;
                    } else if (view == this.f23990h0) {
                        rl0Var = this.f23993k0;
                    } else if (view == this.f23996o0) {
                        rl0Var = this.f23999r0;
                    } else {
                        cn0 cn0Var = this.D0;
                        if (view == cn0Var) {
                            rl0Var = cn0Var.f23974b;
                        } else {
                            fh0 fh0Var = this.m0;
                            if (view == fh0Var) {
                                rl0Var = fh0Var.f24889c;
                            } else if (view instanceof org.telegram.ui.u10) {
                                rl0Var = ((org.telegram.ui.u10) view).f38640b;
                            }
                        }
                    }
                }
                if (rl0Var != null) {
                    tg.c.b(rl0Var, canvas, rectF, rl0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.u10 u10Var = this.J0;
                    if (u10Var.getVisibility() == 0) {
                        lh.e1 e1Var = u10Var.f38640b;
                        tg.c.b(e1Var, canvas, rectF, e1Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean f() {
        return this.f24003v0;
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        xVar.f6327b = true;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.C0;
    }

    public ArrayList<tf.e0> getCurrentSearchFilters() {
        return this.f24005x0;
    }

    public cn0 getDownloadsContainer() {
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
        return this.f24006y0;
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
        this.f23984b0 = true;
        xn0 xn0Var = this.f23989g0;
        if (xn0Var != null) {
            xn0Var.N(false);
        }
        qn0 qn0Var = this.f23994l0;
        if (qn0Var != null) {
            qn0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23984b0 = false;
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

    public void setFilteredSearchViewDelegate(org.telegram.ui.l10 l10Var) {
        this.I0 = l10Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.u10) {
                ((org.telegram.ui.u10) getChildAt(i11)).f38642c.b(i10, z4);
            } else if (getChildAt(i11) == this.R) {
                this.T.b(i10, z4);
                this.J0.f38642c.b(i10, z4);
            } else if (getChildAt(i11) instanceof cn0) {
                ((cn0) getChildAt(i11)).f23973a.b(i10, z4);
            } else if (getChildAt(i11) == this.f23985c0) {
                this.f23986d0.b(i10, z4);
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
        vn0 vn0Var = this.V;
        org.telegram.ui.u10 u10Var = this.J0;
        if (i10 == 0) {
            if (u10Var.getVisibility() == 0) {
                u10Var.i(this.I0, false);
                vn0Var.f44982x0 = null;
            } else {
                u10Var.i(null, false);
                org.telegram.ui.l10 l10Var = this.I0;
                vn0Var.f44982x0 = l10Var;
                if (l10Var != null) {
                    ((org.telegram.ui.uv) l10Var).h(false, null, vn0Var.f44978v0, vn0Var.f44980w0);
                }
            }
        } else if (view instanceof org.telegram.ui.u10) {
            if (i11 == 0 && u10Var.getVisibility() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ((org.telegram.ui.u10) view).i(this.I0, z4);
        }
        if (view2 instanceof org.telegram.ui.u10) {
            ((org.telegram.ui.u10) view2).i(null, false);
            return;
        }
        vn0Var.f44982x0 = null;
        u10Var.i(null, false);
    }
}
