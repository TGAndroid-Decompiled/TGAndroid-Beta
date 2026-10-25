package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
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
public abstract class ep0 extends u91 implements org.telegram.ui.g10, NotificationCenter.NotificationCenterDelegate, dh.a {
    public static final int f27930a1 = 0;
    public boolean A0;
    public final HashMap B0;
    public final ArrayList C0;
    public org.telegram.ui.ActionBar.w0 D0;
    public org.telegram.ui.ActionBar.w0 E0;
    public org.telegram.ui.ActionBar.w0 F0;
    public org.telegram.ui.ActionBar.w0 G0;
    public org.telegram.ui.ActionBar.z H0;
    public co0 I0;
    public final int J0;
    public boolean K0;
    public final org.telegram.ui.cy L0;
    public String M0;
    public org.telegram.ui.x00 N0;
    public final org.telegram.ui.h10 O0;
    public int P0;
    public boolean Q0;
    public final org.telegram.ui.ix R0;
    public final vw0 S0;
    public final int T0;
    public int U0;
    public final dp0 V;
    public final long V0;
    public final FrameLayout W;
    public int W0;
    public int X0;
    public NotificationCenter.ObserversGroup Y0;
    public ch.b Z0;
    public final bi.r1 f27931a0;
    public final qo0 f27932b0;
    public final s4.l f27933c0;
    public final wo0 f27934d0;
    public final s4.c0 f27935e0;
    public final ql0 f27936f0;
    public boolean f27937g0;
    public final FrameLayout f27938h0;
    public final qo0 f27939i0;
    public final s4.c0 f27940j0;
    public final mm0 f27941k0;
    public final yo0 f27942l0;
    public final FrameLayout m0;
    public final qo0 f27943n0;
    public final s4.c0 f27944o0;
    public final mm0 f27945p0;
    public final ro0 f27946q0;
    public final wh0 f27947r0;
    public boolean f27948s0;
    public final FrameLayout f27949t0;
    public final qo0 f27950u0;
    public final s4.c0 f27951v0;
    public final mm0 f27952w0;
    public final uo0 f27953x0;
    public ImageView f27954y0;
    public ap0 f27955z0;

    public ep0(Context context, org.telegram.ui.cy cyVar, int i10, int i11, int i12, long j10, org.telegram.ui.ix ixVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f27948s0 = false;
        this.B0 = new HashMap();
        this.C0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.J0 = i17;
        this.U0 = 0;
        this.T0 = i12;
        this.V0 = j10;
        this.L0 = cyVar;
        this.R0 = ixVar;
        s4.l lVar = new s4.l();
        this.f27933c0 = lVar;
        lVar.f47800c = 150L;
        lVar.e = 350L;
        lVar.f47801f = 0L;
        lVar.f47802g = 0L;
        lVar.d = 0L;
        lVar.f47803i = new OvershootInterpolator(1.1f);
        lVar.f47784o = ds.h;
        org.telegram.ui.jx jxVar = (org.telegram.ui.jx) this;
        this.f27934d0 = new wo0(jxVar, context, cyVar, i10, i11, lVar, cyVar.F, cyVar, context);
        if (i11 == 15) {
            ArrayList Z3 = cyVar.Z3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < Z3.size(); i18 = c3.h0.j(((TLRPC.Dialog) Z3.get(i18)).f22031id, arrayList, i18, 1)) {
            }
            this.f27934d0.f14090q0 = arrayList;
        }
        this.S0 = (vw0) cyVar.getFragmentView();
        bi.r1 r1Var = new bi.r1(jxVar, context, 22);
        this.f27931a0 = r1Var;
        r1Var.setItemAnimator(this.f27933c0);
        r1Var.setPivotY(0.0f);
        r1Var.setClipToPadding(false);
        r1Var.setAdapter(this.f27934d0);
        r1Var.setVerticalScrollBarEnabled(true);
        r1Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        r1Var.setVerticalScrollbarPosition(i13);
        s4.c0 c0Var = new s4.c0(1, false);
        this.f27935e0 = c0Var;
        r1Var.setLayoutManager(c0Var);
        r1Var.W1 = true;
        r1Var.X1 = 0;
        r1Var.setOnScrollListener(new so0(jxVar, cyVar, 2));
        r1Var.D0(new wa0(jxVar, 26));
        org.telegram.ui.h10 h10Var = new org.telegram.ui.h10(this.L0);
        this.O0 = h10Var;
        bi.r1 r1Var2 = h10Var.f39825b;
        r1Var2.setClipToPadding(false);
        r1Var2.j(new vo0(jxVar, 1));
        r1Var2.D0(new wa0(jxVar, 26));
        h10Var.setUiCallback(this);
        h10Var.setVisibility(8);
        h10Var.setChatPreviewDelegate(ixVar);
        c10 c10Var = new c10(context, null);
        c10Var.setViewType(1);
        qo0 qo0Var = new qo0(jxVar, context, c10Var, 2);
        this.f27932b0 = qo0Var;
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.e.setVisibility(8);
        qo0Var.setVisibility(8);
        qo0Var.addView(c10Var, 0);
        qo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(qo0Var);
        frameLayout.addView(r1Var);
        frameLayout.addView(h10Var);
        r1Var.setEmptyView(qo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f27938h0 = frameLayout2;
        xo0 xo0Var = new xo0(jxVar);
        xo0Var.f47760m = false;
        xo0Var.C = false;
        ds dsVar = ds.h;
        xo0Var.o(dsVar);
        xo0Var.n(350L);
        mm0 mm0Var = new mm0(context, null);
        this.f27941k0 = mm0Var;
        mm0Var.setItemAnimator(xo0Var);
        mm0Var.setPivotY(0.0f);
        mm0Var.setVerticalScrollBarEnabled(true);
        mm0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        mm0Var.setVerticalScrollbarPosition(i14);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.f27940j0 = c0Var2;
        mm0Var.setLayoutManager(c0Var2);
        mm0Var.W1 = true;
        mm0Var.X1 = 0;
        mm0Var.setClipToPadding(false);
        c10 c10Var2 = new c10(context, null);
        c10Var2.setViewType(1);
        qo0 qo0Var2 = new qo0(jxVar, context, c10Var2, 3);
        this.f27939i0 = qo0Var2;
        qo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var2.e.setVisibility(8);
        qo0Var2.setVisibility(8);
        qo0Var2.addView(c10Var2, 0);
        qo0Var2.e(true, false);
        frameLayout2.addView(qo0Var2);
        frameLayout2.addView(mm0Var);
        mm0Var.setEmptyView(qo0Var2);
        yo0 yo0Var = new yo0(jxVar, mm0Var, context, this.J0, i12, cyVar);
        this.f27942l0 = yo0Var;
        mm0Var.setAdapter(yo0Var);
        mm0Var.setOnScrollListener(new so0(jxVar, cyVar, 3));
        mm0Var.D0(new wa0(jxVar, 26));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.m0 = frameLayout3;
        po0 po0Var = new po0(jxVar);
        po0Var.f47760m = false;
        po0Var.C = false;
        po0Var.o(dsVar);
        po0Var.n(350L);
        mm0 mm0Var2 = new mm0(context, null);
        this.f27945p0 = mm0Var2;
        mm0Var2.setItemAnimator(po0Var);
        mm0Var2.setPivotY(0.0f);
        mm0Var2.setClipToPadding(false);
        mm0Var2.setVerticalScrollBarEnabled(true);
        mm0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        mm0Var2.setVerticalScrollbarPosition(i15);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.f27944o0 = c0Var3;
        mm0Var2.setLayoutManager(c0Var3);
        mm0Var2.W1 = true;
        mm0Var2.X1 = 0;
        c10 c10Var3 = new c10(context, null);
        c10Var3.setViewType(1);
        qo0 qo0Var3 = new qo0(jxVar, context, c10Var3, 0);
        this.f27943n0 = qo0Var3;
        qo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var3.e.setVisibility(8);
        qo0Var3.setVisibility(8);
        qo0Var3.addView(c10Var3, 0);
        qo0Var3.e(true, false);
        frameLayout3.addView(qo0Var3);
        frameLayout3.addView(mm0Var2);
        mm0Var2.setEmptyView(qo0Var3);
        ro0 ro0Var = new ro0(jxVar, mm0Var2, context, this.J0, i12);
        this.f27946q0 = ro0Var;
        mm0Var2.setAdapter(ro0Var);
        mm0Var2.setOnScrollListener(new so0(jxVar, cyVar, 0));
        mm0Var2.D0(new wa0(jxVar, 26));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f27949t0 = frameLayout4;
        to0 to0Var = new to0(jxVar);
        to0Var.f47760m = false;
        to0Var.C = false;
        to0Var.o(dsVar);
        to0Var.n(350L);
        mm0 mm0Var3 = new mm0(context, null);
        this.f27952w0 = mm0Var3;
        mm0Var3.setItemAnimator(to0Var);
        mm0Var3.setPivotY(0.0f);
        mm0Var3.setVerticalScrollBarEnabled(true);
        mm0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        mm0Var3.setVerticalScrollbarPosition(i16);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.f27951v0 = c0Var4;
        mm0Var3.setLayoutManager(c0Var4);
        mm0Var3.W1 = true;
        mm0Var3.X1 = 0;
        mm0Var3.setClipToPadding(false);
        c10 c10Var4 = new c10(context, null);
        c10Var4.setViewType(1);
        qo0 qo0Var4 = new qo0(jxVar, context, c10Var4, 1);
        this.f27950u0 = qo0Var4;
        qo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var4.e.setVisibility(8);
        qo0Var4.setVisibility(8);
        qo0Var4.addView(c10Var4, 0);
        qo0Var4.e(true, false);
        frameLayout4.addView(qo0Var4);
        frameLayout4.addView(mm0Var3);
        mm0Var3.setEmptyView(qo0Var4);
        uo0 uo0Var = new uo0(jxVar, mm0Var3, context, this.J0);
        this.f27953x0 = uo0Var;
        mm0Var3.setAdapter(uo0Var);
        mm0Var3.setOnScrollListener(new so0(jxVar, cyVar, 1));
        mm0Var3.D0(new wa0(jxVar, 26));
        this.f27936f0 = new ql0(r1Var, true);
        wh0 wh0Var = new wh0(context, cyVar);
        this.f27947r0 = wh0Var;
        r71 r71Var = wh0Var.f34441c;
        r71Var.setClipToPadding(false);
        r71Var.j(new vo0(jxVar, 0));
        r71Var.D0(new wa0(jxVar, 26));
        dp0 dp0Var = new dp0(jxVar);
        this.V = dp0Var;
        setAdapter(dp0Var);
    }

    public static org.telegram.ui.un M(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.un(bundle);
    }

    public static void Q(FrameLayout frameLayout, mm0 mm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            mm0Var.t1(0, i10, 0, i11);
        } else {
            mm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void L() {
        if (this.f27948s0) {
            int i10 = 0;
            this.f27948s0 = false;
            S();
            k91 k91Var = this.M;
            if (k91Var != null && k91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            wo0 wo0Var = this.f27934d0;
            if (wo0Var != null) {
                String str = this.M0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.C0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((ig.p0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                wo0Var.T(i10, str);
            }
        }
    }

    public final int N(int i10) {
        int i11 = 0;
        while (true) {
            dp0 dp0Var = this.V;
            ArrayList arrayList = dp0Var.f27574a;
            ArrayList arrayList2 = dp0Var.f27574a;
            if (i11 < arrayList.size()) {
                if (((cp0) arrayList2.get(i11)).f27230a == 3 && ((cp0) arrayList2.get(i11)).f27231b == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final boolean O() {
        int i10 = this.J0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.B0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i10, String str, boolean z10) {
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.h10 h10Var;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        qo0 qo0Var = this.f27932b0;
        if (isEmpty) {
            qo0Var.e.setVisibility(8);
        } else {
            qo0Var.e.setVisibility(0);
            qo0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        wo0 wo0Var = this.f27934d0;
        org.telegram.ui.lx lxVar = wo0Var.U;
        if (lxVar != null) {
            j10 = lxVar.a();
        } else {
            j10 = 0;
        }
        if (i10 == 0) {
            j11 = 0;
        } else {
            j11 = j10;
        }
        int i11 = 0;
        boolean z20 = false;
        long j13 = 0;
        long j14 = 0;
        while (true) {
            ArrayList arrayList = this.C0;
            if (i11 >= arrayList.size()) {
                break;
            }
            ig.p0 p0Var = (ig.p0) arrayList.get(i11);
            int i12 = p0Var.d;
            if (i12 == 4) {
                TLObject tLObject = p0Var.f14201f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f22174id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j12 = -((TLRPC.Chat) p0Var.f14201f).f22027id;
                }
                j11 = j12;
            } else if (i12 == 6) {
                ig.n0 n0Var = p0Var.f14202g;
                long j15 = n0Var.f14179b;
                j14 = n0Var.f14180c;
                j13 = j15;
            } else if (i12 == 7) {
                z20 = true;
            }
            i11++;
        }
        uo0 uo0Var = this.f27953x0;
        uo0Var.getClass();
        if (p40.Y(str, null) == null) {
            L();
        }
        if (view == this.f27938h0) {
            MessagesController.getInstance(this.J0).getChannelRecommendations(0L);
            yo0 yo0Var = this.f27942l0;
            mm0 mm0Var = yo0Var.d;
            ArrayList arrayList2 = yo0Var.S;
            ArrayList arrayList3 = yo0Var.T;
            ArrayList arrayList4 = yo0Var.U;
            ArrayList arrayList5 = yo0Var.R;
            bq bqVar = yo0Var.f27981e0;
            yo0Var.X();
            if (!TextUtils.equals(str, yo0Var.f27980d0)) {
                yo0Var.f27980d0 = str;
                AndroidUtilities.cancelRunOnUIThread(bqVar);
                if (TextUtils.isEmpty(yo0Var.f27980d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    yo0Var.O(true);
                    yo0Var.f27979c0++;
                    z19 = false;
                    yo0Var.Y = false;
                    yo0Var.Z = false;
                    yo0Var.f27977a0 = false;
                    yo0Var.f27978b0 = 0;
                    if (mm0Var != null) {
                        mm0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(bqVar, 1000L);
                    yo0Var.Y = true;
                    yo0Var.Z = true;
                    yo0Var.O(true);
                    if (mm0Var != null) {
                        z19 = false;
                        mm0Var.v0(0);
                    }
                }
                this.f27939i0.b(this.P0, z19);
            }
            z19 = false;
            this.f27939i0.b(this.P0, z19);
        } else if (view == this.m0) {
            ro0 ro0Var = this.f27946q0;
            mm0 mm0Var2 = ro0Var.d;
            ArrayList arrayList6 = ro0Var.V;
            ys ysVar = ro0Var.f27259h0;
            if (TextUtils.equals(str, ro0Var.f27258g0)) {
                z18 = false;
            } else {
                ro0Var.f27258g0 = str;
                AndroidUtilities.cancelRunOnUIThread(ysVar);
                if (TextUtils.isEmpty(ro0Var.f27258g0)) {
                    arrayList6.clear();
                    ro0Var.O(true);
                    ro0Var.f27257f0++;
                    z18 = false;
                    ro0Var.f27253b0 = false;
                    ro0Var.f27254c0 = false;
                    ro0Var.f27255d0 = false;
                    ro0Var.f27256e0 = 0;
                    if (mm0Var2 != null) {
                        mm0Var2.v0(0);
                    }
                } else {
                    z18 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(ysVar, 1000L);
                    ro0Var.f27253b0 = true;
                    ro0Var.f27254c0 = true;
                    ro0Var.O(true);
                    if (mm0Var2 != null) {
                        mm0Var2.v0(0);
                    }
                }
            }
            this.f27943n0.b(this.P0, z18);
            if (TextUtils.isEmpty(str)) {
                ro0Var.W();
            }
        } else {
            wh0 wh0Var = this.f27947r0;
            if (view == wh0Var) {
                r71 r71Var = wh0Var.f34441c;
                ArrayList arrayList7 = wh0Var.f34443n;
                if (!TextUtils.equals(wh0Var.f34446w, str)) {
                    if (wh0Var.K >= 0) {
                        ConnectionsManager.getInstance(wh0Var.f34440b).cancelRequest(wh0Var.K, true);
                        wh0Var.K = -1;
                    }
                    wh0Var.v = false;
                    wh0Var.H.setLoading(false);
                    wh0Var.f34446w = str;
                    if (TextUtils.isEmpty(str)) {
                        wh0Var.f34444r = 0;
                        z17 = true;
                        wh0Var.L++;
                        wh0Var.f34445s = false;
                        arrayList7.clear();
                        wh0Var.a(false);
                    } else {
                        z17 = true;
                        wh0Var.b(str);
                        wh0Var.f34444r = 0;
                        wh0Var.L++;
                        wh0Var.f34445s = false;
                        arrayList7.clear();
                    }
                    wh0Var.d();
                    r71Var.v0(0);
                    r71Var.f32150g3.O(z17);
                }
            } else if (view == this.f27949t0) {
                if (p40.Y(str, null) != null) {
                    if (z10) {
                        this.f27951v0.h1(0, 0);
                    }
                    uo0Var.Z(str);
                    this.f27950u0.b(this.P0, false);
                }
            } else if (view == this.W) {
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                org.telegram.ui.h10 h10Var2 = this.O0;
                if ((i13 == 0 && this.V0 == 0 && j13 == 0 && j14 == 0) || j10 != 0) {
                    this.K0 = false;
                    wo0Var.T(z20 ? 1 : 0, str);
                    wo0Var.A0 = this.N0;
                    h10Var2.animate().setListener(null).cancel();
                    h10Var2.i(null, false);
                    if (z10) {
                        if (wo0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        qo0Var.e(!z15, false);
                        if (wo0Var.D0 > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        qo0Var.e(z16, false);
                    } else if (!wo0Var.M()) {
                        if (wo0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        qo0Var.e(z14, true);
                    }
                    if (z10) {
                        h10Var2.setVisibility(8);
                    } else if (h10Var2.getVisibility() != 8) {
                        h10Var2.animate().alpha(0.0f).setListener(new i10(this, 18)).setDuration(150L).start();
                    }
                    h10Var2.setTag(null);
                    h10Var = h10Var2;
                    z13 = false;
                } else {
                    boolean z21 = true;
                    h10Var2.setTag(1);
                    h10Var2.i(this.N0, false);
                    h10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        h10Var2.setVisibility(0);
                        h10Var2.setAlpha(1.0f);
                        z12 = z10;
                    } else {
                        if (h10Var2.getVisibility() != 0) {
                            h10Var2.setVisibility(0);
                            h10Var2.setAlpha(0.0f);
                        } else {
                            z21 = z10;
                        }
                        h10Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z12 = z21;
                    }
                    z13 = false;
                    long j16 = j11;
                    h10Var = h10Var2;
                    this.O0.h(j16, this.V0, j13, j14, null, z20, str, z12);
                    qo0Var.setVisibility(8);
                }
                qo0Var.b(this.P0, z13);
                h10Var.f39827c.b(this.P0, z13);
            } else {
                long j17 = j10;
                long j18 = j13;
                long j19 = j14;
                if (view instanceof org.telegram.ui.h10) {
                    org.telegram.ui.h10 h10Var3 = (org.telegram.ui.h10) view;
                    if (j17 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h10Var3.setUseFromUserAsAvatar(z11);
                    h10Var3.f39827c.b(this.P0, false);
                    h10Var3.h(j11, this.V0, j18, j19, ig.r0.f14213k3[((cp0) this.V.f27574a.get(i10)).f27231b], z20, str, z10);
                } else if (view instanceof co0) {
                    co0 co0Var = (co0) view;
                    co0Var.f27215a.b(this.P0, false);
                    co0Var.K = str;
                    co0Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z10) {
        lm0 lm0Var;
        lm0 lm0Var2;
        lm0 lm0Var3;
        int i10;
        boolean z11;
        int i11;
        int i12;
        org.telegram.ui.lx lxVar;
        int i13;
        if (this.A0 != z10) {
            org.telegram.ui.cy cyVar = this.L0;
            if (!z10 || !cyVar.getActionBar().q()) {
                if (z10 && !cyVar.getActionBar().a("search_view_pager")) {
                    this.H0 = cyVar.getActionBar().i("search_view_pager");
                    if (cyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f27954y0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f27954y0.setImageDrawable(new org.telegram.ui.ActionBar.j2(true));
                        org.telegram.ui.ActionBar.f7.t(this.f27954y0, org.telegram.ui.ActionBar.y6.f23748y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f27954y0;
                        int i14 = org.telegram.ui.ActionBar.y6.f23767z8;
                        org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i14), null);
                        this.f27954y0.setOnClickListener(new w80(this, 12));
                        this.H0.addView(this.f27954y0, gb1.s(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.H0.getContext());
                    this.f27955z0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f27955z0.setTypeface(AndroidUtilities.bold());
                    ap0 ap0Var = this.f27955z0;
                    int i15 = org.telegram.ui.ActionBar.y6.f23748y8;
                    qd0 qd0Var = new qd0(14);
                    qd0 qd0Var2 = new qd0(15);
                    int Q = org.telegram.ui.ActionBar.f7.Q(i15, -1, 0, 0.0f, null);
                    qd0Var2.d(Q, ap0Var);
                    org.telegram.ui.ActionBar.z6 x9 = org.telegram.ui.ActionBar.f7.x(101, ap0Var);
                    x9.c(i15, -1, 0, 0.0f, null);
                    x9.f23807n = qd0Var;
                    x9.f23808o = qd0Var2;
                    x9.f23806m = false;
                    x9.f23801g = Q;
                    org.telegram.ui.ActionBar.z zVar = this.H0;
                    ap0 ap0Var2 = this.f27955z0;
                    if (cyVar.W) {
                        i13 = 18;
                    } else {
                        i13 = 72;
                    }
                    zVar.addView(ap0Var2, gb1.q(1.0f, 0, -1, i13, 0, 0));
                    this.f27955z0.setOnTouchListener(new ei.d(21));
                    org.telegram.ui.ActionBar.w0 h = this.H0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.D0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.f7.t(this.D0.getIconView(), i15, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.E0 = this.H0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.F0 = this.H0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.G0 = this.H0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f27955z0 != null) {
                    wo0 wo0Var = this.f27934d0;
                    if (wo0Var != null && (lxVar = wo0Var.U) != null && lxVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f27955z0.getLayoutParams();
                    if (cyVar.W) {
                        i11 = 18;
                    } else {
                        i11 = 72;
                    }
                    if (z11) {
                        i12 = 56;
                    } else {
                        i12 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i11 + i12);
                    ap0 ap0Var3 = this.f27955z0;
                    ap0Var3.setLayoutParams(ap0Var3.getLayoutParams());
                }
                if (cyVar.getActionBar().getBackButton() != null && (cyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.k5)) {
                    org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
                    cyVar.getActionBar().setBackButtonDrawable(j2Var);
                    j2Var.setColorFilter(null);
                }
                this.A0 = z10;
                HashMap hashMap = this.B0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(cyVar.getParentActivity().getCurrentFocus());
                    cyVar.getActionBar().K(null, null);
                    this.f27955z0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.w0 w0Var = this.D0;
                    if (O()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    this.E0.setVisibility(0);
                    this.F0.setVisibility(0);
                    this.G0.setVisibility(0);
                    return;
                }
                cyVar.getActionBar().p();
                hashMap.clear();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    if ((getChildAt(i16) instanceof org.telegram.ui.h10) && (lm0Var3 = ((org.telegram.ui.h10) getChildAt(i16)).d) != null) {
                        lm0Var3.l();
                    }
                    if (getChildAt(i16) instanceof co0) {
                        ((co0) getChildAt(i16)).d(true);
                    }
                }
                org.telegram.ui.h10 h10Var = this.O0;
                if (h10Var != null && (lm0Var2 = h10Var.d) != null) {
                    lm0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i17 = 0; i17 < size; i17++) {
                    View view = (View) sparseArray.valueAt(i17);
                    if ((view instanceof org.telegram.ui.h10) && (lm0Var = ((org.telegram.ui.h10) view).d) != null) {
                        lm0Var.l();
                    }
                }
            }
        }
    }

    public final void S() {
        this.V.i();
        o(false);
        k91 k91Var = this.M;
        if (k91Var != null) {
            k91Var.f32944x.l();
        }
    }

    @Override
    public final void a() {
        R(true);
    }

    @Override
    public final void b(ch.a aVar, RectF rectF) {
        aVar.f6296a = true;
    }

    @Override
    public final boolean c(org.telegram.ui.z00 z00Var) {
        return this.B0.containsKey(z00Var);
    }

    @Override
    public final void d(MessageObject messageObject) {
        this.L0.presentFragment(M(messageObject, this.J0));
        R(false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z10 = false;
        yo0 yo0Var = this.f27942l0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.J0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f27939i0.e(z10, true);
            yo0Var.X();
            yo0Var.O(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f27946q0.O(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                uo0 uo0Var = this.f27953x0;
                if (obj == uo0Var.S) {
                    uo0Var.O(true);
                }
            }
        } else {
            yo0Var.X();
            yo0Var.O(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.z00 z00Var = new org.telegram.ui.z00(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.B0;
        if (hashMap.containsKey(z00Var)) {
            hashMap.remove(z00Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(z00Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.f27955z0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.E0;
            if (w0Var != null) {
                if (hashMap.size() == 1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                w0Var.setVisibility(i12);
            }
            if (this.D0 != null) {
                boolean O = O();
                if (O) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (this.D0.getVisibility() != i11) {
                    this.D0.setVisibility(i11);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.D0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.f7.y(this, animatedVectorDrawable, org.telegram.ui.ActionBar.y6.f23748y8, null, PorterDuff.Mode.SRC_IN);
                    if (O) {
                        animatedVectorDrawable.start();
                    } else {
                        animatedVectorDrawable.reset();
                    }
                }
            }
            if (this.G0 != null) {
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
                org.telegram.ui.ActionBar.w0 w0Var2 = this.G0;
                if (!z10) {
                    i13 = 8;
                }
                w0Var2.setVisibility(i13);
            }
        }
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).b(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.x7) {
            ((org.telegram.ui.Cells.x7) view).b(i10, hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r7) {
            ((org.telegram.ui.Cells.r7) view).f(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).e(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view).c(hashMap.containsKey(z00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).U(hashMap.containsKey(z00Var), true);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.W;
                mm0 mm0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        mm0Var = this.f27931a0;
                    } else if (view == this.f27938h0) {
                        mm0Var = this.f27941k0;
                    } else if (view == this.m0) {
                        mm0Var = this.f27945p0;
                    } else if (view == this.f27949t0) {
                        mm0Var = this.f27952w0;
                    } else {
                        co0 co0Var = this.I0;
                        if (view == co0Var) {
                            mm0Var = co0Var.f27216b;
                        } else {
                            wh0 wh0Var = this.f27947r0;
                            if (view == wh0Var) {
                                mm0Var = wh0Var.f34441c;
                            } else if (view instanceof org.telegram.ui.h10) {
                                mm0Var = ((org.telegram.ui.h10) view).f39825b;
                            }
                        }
                    }
                }
                if (mm0Var != null) {
                    ih.d.a(mm0Var, canvas, rectF, mm0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.h10 h10Var = this.O0;
                    if (h10Var.getVisibility() == 0) {
                        bi.r1 r1Var = h10Var.f39825b;
                        ih.d.a(r1Var, canvas, rectF, r1Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.A0;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.H0;
    }

    public ArrayList<ig.p0> getCurrentSearchFilters() {
        return this.C0;
    }

    public co0 getDownloadsContainer() {
        return this.I0;
    }

    public int getFolderId() {
        return this.T0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.w0 getSpeedItem() {
        return this.D0;
    }

    public t91 getTabsView() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.Y0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Y0 = null;
        }
        this.Y0 = NotificationCenter.getInstance(this.J0).createObserversGroup(this).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.dialogDeleted).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.reloadWebappsHints).add(NotificationCenter.storiesListUpdated);
        this.f27937g0 = true;
        yo0 yo0Var = this.f27942l0;
        if (yo0Var != null) {
            yo0Var.O(false);
        }
        ro0 ro0Var = this.f27946q0;
        if (ro0Var != null) {
            ro0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27937g0 = false;
        NotificationCenter.ObserversGroup observersGroup = this.Y0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Y0 = null;
        }
    }

    @Override
    public final void s() {
        this.S0.L();
    }

    public void setBlurredBackgroundDrawableFactory(ch.b bVar) {
        this.Z0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.x00 x00Var) {
        this.N0 = x00Var;
    }

    public void setKeyboardHeight(int i10) {
        boolean z10;
        this.P0 = i10;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.h10) {
                ((org.telegram.ui.h10) getChildAt(i11)).f39827c.b(i10, z10);
            } else if (getChildAt(i11) == this.W) {
                this.f27932b0.b(i10, z10);
                this.O0.f39827c.b(i10, z10);
            } else if (getChildAt(i11) instanceof co0) {
                ((co0) getChildAt(i11)).f27215a.b(i10, z10);
            } else if (getChildAt(i11) == this.f27938h0) {
                this.f27939i0.b(i10, z10);
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
        k91 k91Var = this.M;
        if (k91Var != null) {
            k91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        wo0 wo0Var = this.f27934d0;
        org.telegram.ui.h10 h10Var = this.O0;
        if (i10 == 0) {
            if (h10Var.getVisibility() == 0) {
                h10Var.i(this.N0, false);
                wo0Var.A0 = null;
            } else {
                h10Var.i(null, false);
                org.telegram.ui.x00 x00Var = this.N0;
                wo0Var.A0 = x00Var;
                if (x00Var != null) {
                    ((org.telegram.ui.iv) x00Var).j(false, null, wo0Var.f14103y0, wo0Var.f14104z0);
                }
            }
        } else if (view instanceof org.telegram.ui.h10) {
            if (i11 == 0 && h10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.h10) view).i(this.N0, z10);
        }
        if (view2 instanceof org.telegram.ui.h10) {
            ((org.telegram.ui.h10) view2).i(null, false);
            return;
        }
        wo0Var.A0 = null;
        h10Var.i(null, false);
    }
}
