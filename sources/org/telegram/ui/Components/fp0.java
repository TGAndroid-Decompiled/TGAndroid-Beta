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
public abstract class fp0 extends v91 implements org.telegram.ui.i10, NotificationCenter.NotificationCenterDelegate, dh.a {
    public static final int f28240a1 = 0;
    public boolean A0;
    public final HashMap B0;
    public final ArrayList C0;
    public org.telegram.ui.ActionBar.w0 D0;
    public org.telegram.ui.ActionBar.w0 E0;
    public org.telegram.ui.ActionBar.w0 F0;
    public org.telegram.ui.ActionBar.w0 G0;
    public org.telegram.ui.ActionBar.z H0;
    public do0 I0;
    public final int J0;
    public boolean K0;
    public final org.telegram.ui.ey L0;
    public String M0;
    public org.telegram.ui.z00 N0;
    public final org.telegram.ui.j10 O0;
    public int P0;
    public boolean Q0;
    public final org.telegram.ui.lx R0;
    public final ww0 S0;
    public final int T0;
    public int U0;
    public final ep0 V;
    public final long V0;
    public final FrameLayout W;
    public int W0;
    public int X0;
    public NotificationCenter.ObserversGroup Y0;
    public ch.b Z0;
    public final bi.r1 f28241a0;
    public final ro0 f28242b0;
    public final s4.l f28243c0;
    public final xo0 f28244d0;
    public final s4.c0 f28245e0;
    public final rl0 f28246f0;
    public boolean f28247g0;
    public final FrameLayout f28248h0;
    public final ro0 f28249i0;
    public final s4.c0 f28250j0;
    public final nm0 f28251k0;
    public final zo0 f28252l0;
    public final FrameLayout m0;
    public final ro0 f28253n0;
    public final s4.c0 f28254o0;
    public final nm0 f28255p0;
    public final so0 f28256q0;
    public final xh0 f28257r0;
    public boolean f28258s0;
    public final FrameLayout f28259t0;
    public final ro0 f28260u0;
    public final s4.c0 f28261v0;
    public final nm0 f28262w0;
    public final vo0 f28263x0;
    public ImageView f28264y0;
    public bp0 f28265z0;

    public fp0(Context context, org.telegram.ui.ey eyVar, int i10, int i11, int i12, long j10, org.telegram.ui.lx lxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f28258s0 = false;
        this.B0 = new HashMap();
        this.C0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.J0 = i17;
        this.U0 = 0;
        this.T0 = i12;
        this.V0 = j10;
        this.L0 = eyVar;
        this.R0 = lxVar;
        s4.l lVar = new s4.l();
        this.f28243c0 = lVar;
        lVar.f47838c = 150L;
        lVar.e = 350L;
        lVar.f47839f = 0L;
        lVar.f47840g = 0L;
        lVar.d = 0L;
        lVar.f47841i = new OvershootInterpolator(1.1f);
        lVar.f47822o = ds.h;
        org.telegram.ui.mx mxVar = (org.telegram.ui.mx) this;
        this.f28244d0 = new xo0(mxVar, context, eyVar, i10, i11, lVar, eyVar.F, eyVar, context);
        if (i11 == 15) {
            ArrayList Z3 = eyVar.Z3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < Z3.size(); i18 = c3.h0.j(((TLRPC.Dialog) Z3.get(i18)).f22032id, arrayList, i18, 1)) {
            }
            this.f28244d0.f14089q0 = arrayList;
        }
        this.S0 = (ww0) eyVar.getFragmentView();
        bi.r1 r1Var = new bi.r1(mxVar, context, 22);
        this.f28241a0 = r1Var;
        r1Var.setItemAnimator(this.f28243c0);
        r1Var.setPivotY(0.0f);
        r1Var.setClipToPadding(false);
        r1Var.setAdapter(this.f28244d0);
        r1Var.setVerticalScrollBarEnabled(true);
        r1Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        r1Var.setVerticalScrollbarPosition(i13);
        s4.c0 c0Var = new s4.c0(1, false);
        this.f28245e0 = c0Var;
        r1Var.setLayoutManager(c0Var);
        r1Var.W1 = true;
        r1Var.X1 = 0;
        r1Var.setOnScrollListener(new to0(mxVar, eyVar, 2));
        r1Var.D0(new xa0(mxVar, 26));
        org.telegram.ui.j10 j10Var = new org.telegram.ui.j10(this.L0);
        this.O0 = j10Var;
        bi.r1 r1Var2 = j10Var.f40322b;
        r1Var2.setClipToPadding(false);
        r1Var2.j(new wo0(mxVar, 1));
        r1Var2.D0(new xa0(mxVar, 26));
        j10Var.setUiCallback(this);
        j10Var.setVisibility(8);
        j10Var.setChatPreviewDelegate(lxVar);
        c10 c10Var = new c10(context, null);
        c10Var.setViewType(1);
        ro0 ro0Var = new ro0(mxVar, context, c10Var, 2);
        this.f28242b0 = ro0Var;
        ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var.e.setVisibility(8);
        ro0Var.setVisibility(8);
        ro0Var.addView(c10Var, 0);
        ro0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(ro0Var);
        frameLayout.addView(r1Var);
        frameLayout.addView(j10Var);
        r1Var.setEmptyView(ro0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f28248h0 = frameLayout2;
        yo0 yo0Var = new yo0(mxVar);
        yo0Var.f47798m = false;
        yo0Var.C = false;
        ds dsVar = ds.h;
        yo0Var.o(dsVar);
        yo0Var.n(350L);
        nm0 nm0Var = new nm0(context, null);
        this.f28251k0 = nm0Var;
        nm0Var.setItemAnimator(yo0Var);
        nm0Var.setPivotY(0.0f);
        nm0Var.setVerticalScrollBarEnabled(true);
        nm0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        nm0Var.setVerticalScrollbarPosition(i14);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.f28250j0 = c0Var2;
        nm0Var.setLayoutManager(c0Var2);
        nm0Var.W1 = true;
        nm0Var.X1 = 0;
        nm0Var.setClipToPadding(false);
        c10 c10Var2 = new c10(context, null);
        c10Var2.setViewType(1);
        ro0 ro0Var2 = new ro0(mxVar, context, c10Var2, 3);
        this.f28249i0 = ro0Var2;
        ro0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var2.e.setVisibility(8);
        ro0Var2.setVisibility(8);
        ro0Var2.addView(c10Var2, 0);
        ro0Var2.e(true, false);
        frameLayout2.addView(ro0Var2);
        frameLayout2.addView(nm0Var);
        nm0Var.setEmptyView(ro0Var2);
        zo0 zo0Var = new zo0(mxVar, nm0Var, context, this.J0, i12, eyVar);
        this.f28252l0 = zo0Var;
        nm0Var.setAdapter(zo0Var);
        nm0Var.setOnScrollListener(new to0(mxVar, eyVar, 3));
        nm0Var.D0(new xa0(mxVar, 26));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.m0 = frameLayout3;
        qo0 qo0Var = new qo0(mxVar);
        qo0Var.f47798m = false;
        qo0Var.C = false;
        qo0Var.o(dsVar);
        qo0Var.n(350L);
        nm0 nm0Var2 = new nm0(context, null);
        this.f28255p0 = nm0Var2;
        nm0Var2.setItemAnimator(qo0Var);
        nm0Var2.setPivotY(0.0f);
        nm0Var2.setClipToPadding(false);
        nm0Var2.setVerticalScrollBarEnabled(true);
        nm0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        nm0Var2.setVerticalScrollbarPosition(i15);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.f28254o0 = c0Var3;
        nm0Var2.setLayoutManager(c0Var3);
        nm0Var2.W1 = true;
        nm0Var2.X1 = 0;
        c10 c10Var3 = new c10(context, null);
        c10Var3.setViewType(1);
        ro0 ro0Var3 = new ro0(mxVar, context, c10Var3, 0);
        this.f28253n0 = ro0Var3;
        ro0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var3.e.setVisibility(8);
        ro0Var3.setVisibility(8);
        ro0Var3.addView(c10Var3, 0);
        ro0Var3.e(true, false);
        frameLayout3.addView(ro0Var3);
        frameLayout3.addView(nm0Var2);
        nm0Var2.setEmptyView(ro0Var3);
        so0 so0Var = new so0(mxVar, nm0Var2, context, this.J0, i12);
        this.f28256q0 = so0Var;
        nm0Var2.setAdapter(so0Var);
        nm0Var2.setOnScrollListener(new to0(mxVar, eyVar, 0));
        nm0Var2.D0(new xa0(mxVar, 26));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f28259t0 = frameLayout4;
        uo0 uo0Var = new uo0(mxVar);
        uo0Var.f47798m = false;
        uo0Var.C = false;
        uo0Var.o(dsVar);
        uo0Var.n(350L);
        nm0 nm0Var3 = new nm0(context, null);
        this.f28262w0 = nm0Var3;
        nm0Var3.setItemAnimator(uo0Var);
        nm0Var3.setPivotY(0.0f);
        nm0Var3.setVerticalScrollBarEnabled(true);
        nm0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        nm0Var3.setVerticalScrollbarPosition(i16);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.f28261v0 = c0Var4;
        nm0Var3.setLayoutManager(c0Var4);
        nm0Var3.W1 = true;
        nm0Var3.X1 = 0;
        nm0Var3.setClipToPadding(false);
        c10 c10Var4 = new c10(context, null);
        c10Var4.setViewType(1);
        ro0 ro0Var4 = new ro0(mxVar, context, c10Var4, 1);
        this.f28260u0 = ro0Var4;
        ro0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var4.e.setVisibility(8);
        ro0Var4.setVisibility(8);
        ro0Var4.addView(c10Var4, 0);
        ro0Var4.e(true, false);
        frameLayout4.addView(ro0Var4);
        frameLayout4.addView(nm0Var3);
        nm0Var3.setEmptyView(ro0Var4);
        vo0 vo0Var = new vo0(mxVar, nm0Var3, context, this.J0);
        this.f28263x0 = vo0Var;
        nm0Var3.setAdapter(vo0Var);
        nm0Var3.setOnScrollListener(new to0(mxVar, eyVar, 1));
        nm0Var3.D0(new xa0(mxVar, 26));
        this.f28246f0 = new rl0(r1Var, true);
        xh0 xh0Var = new xh0(context, eyVar);
        this.f28257r0 = xh0Var;
        s71 s71Var = xh0Var.f34769c;
        s71Var.setClipToPadding(false);
        s71Var.j(new wo0(mxVar, 0));
        s71Var.D0(new xa0(mxVar, 26));
        ep0 ep0Var = new ep0(mxVar);
        this.V = ep0Var;
        setAdapter(ep0Var);
    }

    public static org.telegram.ui.wn M(MessageObject messageObject, int i10) {
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

    public static void Q(FrameLayout frameLayout, nm0 nm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            nm0Var.t1(0, i10, 0, i11);
        } else {
            nm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void L() {
        if (this.f28258s0) {
            int i10 = 0;
            this.f28258s0 = false;
            S();
            l91 l91Var = this.M;
            if (l91Var != null && l91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            xo0 xo0Var = this.f28244d0;
            if (xo0Var != null) {
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
                xo0Var.T(i10, str);
            }
        }
    }

    public final int N(int i10) {
        int i11 = 0;
        while (true) {
            ep0 ep0Var = this.V;
            ArrayList arrayList = ep0Var.f27901a;
            ArrayList arrayList2 = ep0Var.f27901a;
            if (i11 < arrayList.size()) {
                if (((dp0) arrayList2.get(i11)).f27515a == 3 && ((dp0) arrayList2.get(i11)).f27516b == i10) {
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
        org.telegram.ui.j10 j10Var;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        ro0 ro0Var = this.f28242b0;
        if (isEmpty) {
            ro0Var.e.setVisibility(8);
        } else {
            ro0Var.e.setVisibility(0);
            ro0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        xo0 xo0Var = this.f28244d0;
        org.telegram.ui.ox oxVar = xo0Var.U;
        if (oxVar != null) {
            j10 = oxVar.a();
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
                TLObject tLObject = p0Var.f14200f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f22177id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j12 = -((TLRPC.Chat) p0Var.f14200f).f22028id;
                }
                j11 = j12;
            } else if (i12 == 6) {
                ig.n0 n0Var = p0Var.f14201g;
                long j15 = n0Var.f14178b;
                j14 = n0Var.f14179c;
                j13 = j15;
            } else if (i12 == 7) {
                z20 = true;
            }
            i11++;
        }
        vo0 vo0Var = this.f28263x0;
        vo0Var.getClass();
        if (p40.Y(str, null) == null) {
            L();
        }
        if (view == this.f28248h0) {
            MessagesController.getInstance(this.J0).getChannelRecommendations(0L);
            zo0 zo0Var = this.f28252l0;
            nm0 nm0Var = zo0Var.d;
            ArrayList arrayList2 = zo0Var.S;
            ArrayList arrayList3 = zo0Var.T;
            ArrayList arrayList4 = zo0Var.U;
            ArrayList arrayList5 = zo0Var.R;
            cp cpVar = zo0Var.f27926e0;
            zo0Var.X();
            if (!TextUtils.equals(str, zo0Var.f27925d0)) {
                zo0Var.f27925d0 = str;
                AndroidUtilities.cancelRunOnUIThread(cpVar);
                if (TextUtils.isEmpty(zo0Var.f27925d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    zo0Var.O(true);
                    zo0Var.f27924c0++;
                    z19 = false;
                    zo0Var.Y = false;
                    zo0Var.Z = false;
                    zo0Var.f27922a0 = false;
                    zo0Var.f27923b0 = 0;
                    if (nm0Var != null) {
                        nm0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(cpVar, 1000L);
                    zo0Var.Y = true;
                    zo0Var.Z = true;
                    zo0Var.O(true);
                    if (nm0Var != null) {
                        z19 = false;
                        nm0Var.v0(0);
                    }
                }
                this.f28249i0.b(this.P0, z19);
            }
            z19 = false;
            this.f28249i0.b(this.P0, z19);
        } else if (view == this.m0) {
            so0 so0Var = this.f28256q0;
            nm0 nm0Var2 = so0Var.d;
            ArrayList arrayList6 = so0Var.V;
            ys ysVar = so0Var.f27252h0;
            if (TextUtils.equals(str, so0Var.f27251g0)) {
                z18 = false;
            } else {
                so0Var.f27251g0 = str;
                AndroidUtilities.cancelRunOnUIThread(ysVar);
                if (TextUtils.isEmpty(so0Var.f27251g0)) {
                    arrayList6.clear();
                    so0Var.O(true);
                    so0Var.f27250f0++;
                    z18 = false;
                    so0Var.f27246b0 = false;
                    so0Var.f27247c0 = false;
                    so0Var.f27248d0 = false;
                    so0Var.f27249e0 = 0;
                    if (nm0Var2 != null) {
                        nm0Var2.v0(0);
                    }
                } else {
                    z18 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(ysVar, 1000L);
                    so0Var.f27246b0 = true;
                    so0Var.f27247c0 = true;
                    so0Var.O(true);
                    if (nm0Var2 != null) {
                        nm0Var2.v0(0);
                    }
                }
            }
            this.f28253n0.b(this.P0, z18);
            if (TextUtils.isEmpty(str)) {
                so0Var.W();
            }
        } else {
            xh0 xh0Var = this.f28257r0;
            if (view == xh0Var) {
                s71 s71Var = xh0Var.f34769c;
                ArrayList arrayList7 = xh0Var.f34771n;
                if (!TextUtils.equals(xh0Var.f34774w, str)) {
                    if (xh0Var.K >= 0) {
                        ConnectionsManager.getInstance(xh0Var.f34768b).cancelRequest(xh0Var.K, true);
                        xh0Var.K = -1;
                    }
                    xh0Var.v = false;
                    xh0Var.H.setLoading(false);
                    xh0Var.f34774w = str;
                    if (TextUtils.isEmpty(str)) {
                        xh0Var.f34772r = 0;
                        z17 = true;
                        xh0Var.L++;
                        xh0Var.f34773s = false;
                        arrayList7.clear();
                        xh0Var.a(false);
                    } else {
                        z17 = true;
                        xh0Var.b(str);
                        xh0Var.f34772r = 0;
                        xh0Var.L++;
                        xh0Var.f34773s = false;
                        arrayList7.clear();
                    }
                    xh0Var.d();
                    s71Var.v0(0);
                    s71Var.f32504g3.O(z17);
                }
            } else if (view == this.f28259t0) {
                if (p40.Y(str, null) != null) {
                    if (z10) {
                        this.f28261v0.h1(0, 0);
                    }
                    vo0Var.Z(str);
                    this.f28260u0.b(this.P0, false);
                }
            } else if (view == this.W) {
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                org.telegram.ui.j10 j10Var2 = this.O0;
                if ((i13 == 0 && this.V0 == 0 && j13 == 0 && j14 == 0) || j10 != 0) {
                    this.K0 = false;
                    xo0Var.T(z20 ? 1 : 0, str);
                    xo0Var.A0 = this.N0;
                    j10Var2.animate().setListener(null).cancel();
                    j10Var2.i(null, false);
                    if (z10) {
                        if (xo0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        ro0Var.e(!z15, false);
                        if (xo0Var.D0 > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        ro0Var.e(z16, false);
                    } else if (!xo0Var.M()) {
                        if (xo0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ro0Var.e(z14, true);
                    }
                    if (z10) {
                        j10Var2.setVisibility(8);
                    } else if (j10Var2.getVisibility() != 8) {
                        j10Var2.animate().alpha(0.0f).setListener(new i10(this, 18)).setDuration(150L).start();
                    }
                    j10Var2.setTag(null);
                    j10Var = j10Var2;
                    z13 = false;
                } else {
                    boolean z21 = true;
                    j10Var2.setTag(1);
                    j10Var2.i(this.N0, false);
                    j10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        j10Var2.setVisibility(0);
                        j10Var2.setAlpha(1.0f);
                        z12 = z10;
                    } else {
                        if (j10Var2.getVisibility() != 0) {
                            j10Var2.setVisibility(0);
                            j10Var2.setAlpha(0.0f);
                        } else {
                            z21 = z10;
                        }
                        j10Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z12 = z21;
                    }
                    z13 = false;
                    long j16 = j11;
                    j10Var = j10Var2;
                    this.O0.h(j16, this.V0, j13, j14, null, z20, str, z12);
                    ro0Var.setVisibility(8);
                }
                ro0Var.b(this.P0, z13);
                j10Var.f40324c.b(this.P0, z13);
            } else {
                long j17 = j10;
                long j18 = j13;
                long j19 = j14;
                if (view instanceof org.telegram.ui.j10) {
                    org.telegram.ui.j10 j10Var3 = (org.telegram.ui.j10) view;
                    if (j17 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j10Var3.setUseFromUserAsAvatar(z11);
                    j10Var3.f40324c.b(this.P0, false);
                    j10Var3.h(j11, this.V0, j18, j19, ig.r0.f14212k3[((dp0) this.V.f27901a.get(i10)).f27516b], z20, str, z10);
                } else if (view instanceof do0) {
                    do0 do0Var = (do0) view;
                    do0Var.f27500a.b(this.P0, false);
                    do0Var.K = str;
                    do0Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z10) {
        mm0 mm0Var;
        mm0 mm0Var2;
        mm0 mm0Var3;
        int i10;
        boolean z11;
        int i11;
        int i12;
        org.telegram.ui.ox oxVar;
        int i13;
        if (this.A0 != z10) {
            org.telegram.ui.ey eyVar = this.L0;
            if (!z10 || !eyVar.getActionBar().q()) {
                if (z10 && !eyVar.getActionBar().a("search_view_pager")) {
                    this.H0 = eyVar.getActionBar().i("search_view_pager");
                    if (eyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f28264y0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f28264y0.setImageDrawable(new org.telegram.ui.ActionBar.j2(true));
                        org.telegram.ui.ActionBar.f7.t(this.f28264y0, org.telegram.ui.ActionBar.y6.f23751y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f28264y0;
                        int i14 = org.telegram.ui.ActionBar.y6.f23770z8;
                        org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i14), null);
                        this.f28264y0.setOnClickListener(new x80(this, 12));
                        this.H0.addView(this.f28264y0, kb1.s(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.H0.getContext());
                    this.f28265z0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f28265z0.setTypeface(AndroidUtilities.bold());
                    bp0 bp0Var = this.f28265z0;
                    int i15 = org.telegram.ui.ActionBar.y6.f23751y8;
                    rd0 rd0Var = new rd0(14);
                    rd0 rd0Var2 = new rd0(15);
                    int Q = org.telegram.ui.ActionBar.f7.Q(i15, -1, 0, 0.0f, null);
                    rd0Var2.d(Q, bp0Var);
                    org.telegram.ui.ActionBar.z6 x9 = org.telegram.ui.ActionBar.f7.x(101, bp0Var);
                    x9.c(i15, -1, 0, 0.0f, null);
                    x9.f23810n = rd0Var;
                    x9.f23811o = rd0Var2;
                    x9.f23809m = false;
                    x9.f23804g = Q;
                    org.telegram.ui.ActionBar.z zVar = this.H0;
                    bp0 bp0Var2 = this.f28265z0;
                    if (eyVar.W) {
                        i13 = 18;
                    } else {
                        i13 = 72;
                    }
                    zVar.addView(bp0Var2, kb1.q(1.0f, 0, -1, i13, 0, 0));
                    this.f28265z0.setOnTouchListener(new ei.d(21));
                    org.telegram.ui.ActionBar.w0 h = this.H0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.D0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.f7.t(this.D0.getIconView(), i15, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.E0 = this.H0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.F0 = this.H0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.G0 = this.H0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f28265z0 != null) {
                    xo0 xo0Var = this.f28244d0;
                    if (xo0Var != null && (oxVar = xo0Var.U) != null && oxVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f28265z0.getLayoutParams();
                    if (eyVar.W) {
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
                    bp0 bp0Var3 = this.f28265z0;
                    bp0Var3.setLayoutParams(bp0Var3.getLayoutParams());
                }
                if (eyVar.getActionBar().getBackButton() != null && (eyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.k5)) {
                    org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
                    eyVar.getActionBar().setBackButtonDrawable(j2Var);
                    j2Var.setColorFilter(null);
                }
                this.A0 = z10;
                HashMap hashMap = this.B0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(eyVar.getParentActivity().getCurrentFocus());
                    eyVar.getActionBar().K(null, null);
                    this.f28265z0.a(hashMap.size(), false);
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
                eyVar.getActionBar().p();
                hashMap.clear();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    if ((getChildAt(i16) instanceof org.telegram.ui.j10) && (mm0Var3 = ((org.telegram.ui.j10) getChildAt(i16)).d) != null) {
                        mm0Var3.l();
                    }
                    if (getChildAt(i16) instanceof do0) {
                        ((do0) getChildAt(i16)).d(true);
                    }
                }
                org.telegram.ui.j10 j10Var = this.O0;
                if (j10Var != null && (mm0Var2 = j10Var.d) != null) {
                    mm0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i17 = 0; i17 < size; i17++) {
                    View view = (View) sparseArray.valueAt(i17);
                    if ((view instanceof org.telegram.ui.j10) && (mm0Var = ((org.telegram.ui.j10) view).d) != null) {
                        mm0Var.l();
                    }
                }
            }
        }
    }

    public final void S() {
        this.V.i();
        o(false);
        l91 l91Var = this.M;
        if (l91Var != null) {
            l91Var.f33321x.l();
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
    public final boolean c(org.telegram.ui.b10 b10Var) {
        return this.B0.containsKey(b10Var);
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
        zo0 zo0Var = this.f28252l0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.J0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f28249i0.e(z10, true);
            zo0Var.X();
            zo0Var.O(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f28256q0.O(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                vo0 vo0Var = this.f28263x0;
                if (obj == vo0Var.S) {
                    vo0Var.O(true);
                }
            }
        } else {
            zo0Var.X();
            zo0Var.O(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.b10 b10Var = new org.telegram.ui.b10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.B0;
        if (hashMap.containsKey(b10Var)) {
            hashMap.remove(b10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(b10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.f28265z0.a(hashMap.size(), true);
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
                    org.telegram.ui.ActionBar.f7.y(this, animatedVectorDrawable, org.telegram.ui.ActionBar.y6.f23751y8, null, PorterDuff.Mode.SRC_IN);
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
                        if (!((MessageObject) hashMap.get((org.telegram.ui.b10) it.next())).isDownloadingFile) {
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
            ((org.telegram.ui.Cells.o7) view).b(hashMap.containsKey(b10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.x7) {
            ((org.telegram.ui.Cells.x7) view).b(i10, hashMap.containsKey(b10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r7) {
            ((org.telegram.ui.Cells.r7) view).f(hashMap.containsKey(b10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).e(hashMap.containsKey(b10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view).c(hashMap.containsKey(b10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).U(hashMap.containsKey(b10Var), true);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.W;
                nm0 nm0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        nm0Var = this.f28241a0;
                    } else if (view == this.f28248h0) {
                        nm0Var = this.f28251k0;
                    } else if (view == this.m0) {
                        nm0Var = this.f28255p0;
                    } else if (view == this.f28259t0) {
                        nm0Var = this.f28262w0;
                    } else {
                        do0 do0Var = this.I0;
                        if (view == do0Var) {
                            nm0Var = do0Var.f27501b;
                        } else {
                            xh0 xh0Var = this.f28257r0;
                            if (view == xh0Var) {
                                nm0Var = xh0Var.f34769c;
                            } else if (view instanceof org.telegram.ui.j10) {
                                nm0Var = ((org.telegram.ui.j10) view).f40322b;
                            }
                        }
                    }
                }
                if (nm0Var != null) {
                    ih.d.a(nm0Var, canvas, rectF, nm0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.j10 j10Var = this.O0;
                    if (j10Var.getVisibility() == 0) {
                        bi.r1 r1Var = j10Var.f40322b;
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

    public do0 getDownloadsContainer() {
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

    public u91 getTabsView() {
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
        this.f28247g0 = true;
        zo0 zo0Var = this.f28252l0;
        if (zo0Var != null) {
            zo0Var.O(false);
        }
        so0 so0Var = this.f28256q0;
        if (so0Var != null) {
            so0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28247g0 = false;
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

    public void setFilteredSearchViewDelegate(org.telegram.ui.z00 z00Var) {
        this.N0 = z00Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.j10) {
                ((org.telegram.ui.j10) getChildAt(i11)).f40324c.b(i10, z10);
            } else if (getChildAt(i11) == this.W) {
                this.f28242b0.b(i10, z10);
                this.O0.f40324c.b(i10, z10);
            } else if (getChildAt(i11) instanceof do0) {
                ((do0) getChildAt(i11)).f27500a.b(i10, z10);
            } else if (getChildAt(i11) == this.f28248h0) {
                this.f28249i0.b(i10, z10);
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
        l91 l91Var = this.M;
        if (l91Var != null) {
            l91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        xo0 xo0Var = this.f28244d0;
        org.telegram.ui.j10 j10Var = this.O0;
        if (i10 == 0) {
            if (j10Var.getVisibility() == 0) {
                j10Var.i(this.N0, false);
                xo0Var.A0 = null;
            } else {
                j10Var.i(null, false);
                org.telegram.ui.z00 z00Var = this.N0;
                xo0Var.A0 = z00Var;
                if (z00Var != null) {
                    ((org.telegram.ui.kv) z00Var).j(false, null, xo0Var.f14102y0, xo0Var.f14103z0);
                }
            }
        } else if (view instanceof org.telegram.ui.j10) {
            if (i11 == 0 && j10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.j10) view).i(this.N0, z10);
        }
        if (view2 instanceof org.telegram.ui.j10) {
            ((org.telegram.ui.j10) view2).i(null, false);
            return;
        }
        xo0Var.A0 = null;
        j10Var.i(null, false);
    }
}
