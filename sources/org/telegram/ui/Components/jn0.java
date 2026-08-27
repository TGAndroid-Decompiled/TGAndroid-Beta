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

public abstract class jn0 extends p71 implements org.telegram.ui.h10, NotificationCenter.NotificationCenterDelegate, kg.a {
    public static final int T0 = 0;
    public org.telegram.ui.ActionBar.v0 A0;
    public org.telegram.ui.ActionBar.z B0;
    public jm0 C0;
    public final int D0;
    public boolean E0;
    public final org.telegram.ui.gy F0;
    public String G0;
    public org.telegram.ui.z00 H0;
    public final org.telegram.ui.i10 I0;
    public int J0;
    public boolean K0;
    public final org.telegram.ui.lx L0;
    public final zu0 M0;
    public final int N0;
    public int O0;
    public final in0 P;
    public final long P0;
    public final FrameLayout Q;
    public int Q0;
    public final hh.f1 R;
    public int R0;
    public final wm0 S;
    public jg.a S0;
    public final f2.l T;
    public final cn0 U;
    public final f2.k0 V;
    public final gk0 W;

    public boolean f29742a0;

    public final FrameLayout f29743b0;

    public final wm0 f29744c0;

    public final f2.k0 f29745d0;

    public final zk0 f29746e0;

    public final en0 f29747f0;

    public final FrameLayout f29748g0;

    public final wm0 f29749h0;

    public final f2.k0 f29750i0;

    public final zk0 f29751j0;

    public final xm0 f29752k0;

    public final mg0 f29753l0;
    public boolean m0;

    public final FrameLayout f29754n0;

    public final wm0 f29755o0;

    public final f2.k0 f29756p0;

    public final zk0 f29757q0;

    public final an0 f29758r0;

    public ImageView f29759s0;

    public NumberTextView f29760t0;

    public boolean f29761u0;

    public final HashMap f29762v0;

    public final ArrayList f29763w0;

    public org.telegram.ui.ActionBar.v0 f29764x0;

    public org.telegram.ui.ActionBar.v0 f29765y0;

    public org.telegram.ui.ActionBar.v0 f29766z0;

    public jn0(Context context, org.telegram.ui.gy gyVar, int i10, int i11, int i12, long j10, org.telegram.ui.lx lxVar) {
        super(context, null);
        this.m0 = false;
        this.f29762v0 = new HashMap();
        this.f29763w0 = new ArrayList();
        int i13 = UserConfig.selectedAccount;
        this.D0 = i13;
        this.O0 = 0;
        this.N0 = i12;
        this.P0 = j10;
        this.F0 = gyVar;
        this.L0 = lxVar;
        f2.l lVar = new f2.l();
        this.T = lVar;
        lVar.f5842c = 150L;
        lVar.f5843e = 350L;
        lVar.f5844f = 0L;
        lVar.f5845g = 0L;
        lVar.d = 0L;
        lVar.f5846i = new OvershootInterpolator(1.1f);
        lVar.f5737o = er.h;
        org.telegram.ui.px pxVar = (org.telegram.ui.px) this;
        this.U = new cn0(pxVar, context, gyVar, i10, i11, lVar, gyVar.B, gyVar, context);
        if (i11 == 15) {
            ArrayList arrayListR3 = gyVar.R3(i13, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int iF = 0; iF < arrayListR3.size(); iF = com.google.android.recaptcha.internal.a.f(((TLRPC.Dialog) arrayListR3.get(iF)).f22384id, arrayList, iF, 1)) {
            }
            this.U.m0 = arrayList;
        }
        this.M0 = (zu0) gyVar.getFragmentView();
        hh.f1 f1Var = new hh.f1(pxVar, context, 21);
        this.R = f1Var;
        f1Var.setItemAnimator(this.T);
        f1Var.setPivotY(0.0f);
        f1Var.setClipToPadding(false);
        f1Var.setAdapter(this.U);
        f1Var.setVerticalScrollBarEnabled(true);
        f1Var.setInstantClick(true);
        f1Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.k0 k0Var = new f2.k0(1, false);
        this.V = k0Var;
        f1Var.setLayoutManager(k0Var);
        f1Var.U1 = true;
        f1Var.V1 = 0;
        f1Var.setOnScrollListener(new ym0(pxVar, gyVar, 2));
        f1Var.C0(new mb0(pxVar, 23));
        org.telegram.ui.i10 i10Var = new org.telegram.ui.i10(this.F0);
        this.I0 = i10Var;
        hh.f1 f1Var2 = i10Var.f38936b;
        f1Var2.setClipToPadding(false);
        f1Var2.j(new bn0(pxVar, 1));
        f1Var2.C0(new mb0(pxVar, 23));
        i10Var.setUiCallback(this);
        i10Var.setVisibility(8);
        i10Var.setChatPreviewDelegate(lxVar);
        h00 h00Var = new h00(context, null);
        h00Var.setViewType(1);
        wm0 wm0Var = new wm0(pxVar, context, h00Var, 2);
        this.S = wm0Var;
        wm0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wm0Var.f29506e.setVisibility(8);
        wm0Var.setVisibility(8);
        wm0Var.addView(h00Var, 0);
        wm0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        frameLayout.addView(wm0Var);
        frameLayout.addView(f1Var);
        frameLayout.addView(i10Var);
        f1Var.setEmptyView(wm0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f29743b0 = frameLayout2;
        dn0 dn0Var = new dn0(pxVar);
        dn0Var.f5819m = false;
        dn0Var.C = false;
        er erVar = er.h;
        dn0Var.o(erVar);
        dn0Var.n(350L);
        zk0 zk0Var = new zk0(context, null);
        this.f29746e0 = zk0Var;
        zk0Var.setItemAnimator(dn0Var);
        zk0Var.setPivotY(0.0f);
        zk0Var.setVerticalScrollBarEnabled(true);
        zk0Var.setInstantClick(true);
        zk0Var.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.k0 k0Var2 = new f2.k0(1, false);
        this.f29745d0 = k0Var2;
        zk0Var.setLayoutManager(k0Var2);
        zk0Var.U1 = true;
        zk0Var.V1 = 0;
        zk0Var.setClipToPadding(false);
        h00 h00Var2 = new h00(context, null);
        h00Var2.setViewType(1);
        wm0 wm0Var2 = new wm0(pxVar, context, h00Var2, 3);
        this.f29744c0 = wm0Var2;
        wm0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        wm0Var2.f29506e.setVisibility(8);
        wm0Var2.setVisibility(8);
        wm0Var2.addView(h00Var2, 0);
        wm0Var2.e(true, false);
        frameLayout2.addView(wm0Var2);
        frameLayout2.addView(zk0Var);
        zk0Var.setEmptyView(wm0Var2);
        en0 en0Var = new en0(pxVar, zk0Var, context, this.D0, i12, gyVar);
        this.f29747f0 = en0Var;
        zk0Var.setAdapter(en0Var);
        zk0Var.setOnScrollListener(new ym0(pxVar, gyVar, 3));
        zk0Var.C0(new mb0(pxVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f29748g0 = frameLayout3;
        vm0 vm0Var = new vm0(pxVar);
        vm0Var.f5819m = false;
        vm0Var.C = false;
        vm0Var.o(erVar);
        vm0Var.n(350L);
        zk0 zk0Var2 = new zk0(context, null);
        this.f29751j0 = zk0Var2;
        zk0Var2.setItemAnimator(vm0Var);
        zk0Var2.setPivotY(0.0f);
        zk0Var2.setClipToPadding(false);
        zk0Var2.setVerticalScrollBarEnabled(true);
        zk0Var2.setInstantClick(true);
        zk0Var2.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.k0 k0Var3 = new f2.k0(1, false);
        this.f29750i0 = k0Var3;
        zk0Var2.setLayoutManager(k0Var3);
        zk0Var2.U1 = true;
        zk0Var2.V1 = 0;
        h00 h00Var3 = new h00(context, null);
        h00Var3.setViewType(1);
        wm0 wm0Var3 = new wm0(pxVar, context, h00Var3, 0);
        this.f29749h0 = wm0Var3;
        wm0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        wm0Var3.f29506e.setVisibility(8);
        wm0Var3.setVisibility(8);
        wm0Var3.addView(h00Var3, 0);
        wm0Var3.e(true, false);
        frameLayout3.addView(wm0Var3);
        frameLayout3.addView(zk0Var2);
        zk0Var2.setEmptyView(wm0Var3);
        xm0 xm0Var = new xm0(pxVar, zk0Var2, context, this.D0, i12);
        this.f29752k0 = xm0Var;
        zk0Var2.setAdapter(xm0Var);
        zk0Var2.setOnScrollListener(new ym0(pxVar, gyVar, 0));
        zk0Var2.C0(new mb0(pxVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f29754n0 = frameLayout4;
        zm0 zm0Var = new zm0(pxVar);
        zm0Var.f5819m = false;
        zm0Var.C = false;
        zm0Var.o(erVar);
        zm0Var.n(350L);
        zk0 zk0Var3 = new zk0(context, null);
        this.f29757q0 = zk0Var3;
        zk0Var3.setItemAnimator(zm0Var);
        zk0Var3.setPivotY(0.0f);
        zk0Var3.setVerticalScrollBarEnabled(true);
        zk0Var3.setInstantClick(true);
        zk0Var3.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        f2.k0 k0Var4 = new f2.k0(1, false);
        this.f29756p0 = k0Var4;
        zk0Var3.setLayoutManager(k0Var4);
        zk0Var3.U1 = true;
        zk0Var3.V1 = 0;
        zk0Var3.setClipToPadding(false);
        h00 h00Var4 = new h00(context, null);
        h00Var4.setViewType(1);
        wm0 wm0Var4 = new wm0(pxVar, context, h00Var4, 1);
        this.f29755o0 = wm0Var4;
        wm0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        wm0Var4.f29506e.setVisibility(8);
        wm0Var4.setVisibility(8);
        wm0Var4.addView(h00Var4, 0);
        wm0Var4.e(true, false);
        frameLayout4.addView(wm0Var4);
        frameLayout4.addView(zk0Var3);
        zk0Var3.setEmptyView(wm0Var4);
        an0 an0Var = new an0(pxVar, zk0Var3, context, this.D0);
        this.f29758r0 = an0Var;
        zk0Var3.setAdapter(an0Var);
        zk0Var3.setOnScrollListener(new ym0(pxVar, gyVar, 1));
        zk0Var3.C0(new mb0(pxVar, 23));
        this.W = new gk0(f1Var, true);
        mg0 mg0Var = new mg0(context, gyVar);
        this.f29753l0 = mg0Var;
        k51 k51Var = mg0Var.f30677c;
        k51Var.setClipToPadding(false);
        k51Var.j(new bn0(pxVar, 0));
        k51Var.C0(new mb0(pxVar, 23));
        in0 in0Var = new in0(pxVar);
        this.P = in0Var;
        setAdapter(in0Var);
    }

    public static org.telegram.ui.rn K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.rn(bundle);
    }

    public static void P(FrameLayout frameLayout, zk0 zk0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            zk0Var.o1(0, i10, 0, i11);
        } else {
            zk0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zk0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.m0) {
            int i10 = 0;
            this.m0 = false;
            R();
            e71 e71Var = this.I;
            if (e71Var != null && e71Var.getCurrentTabId() != 0) {
                this.I.d(0, 0);
            }
            cn0 cn0Var = this.U;
            if (cn0Var != null) {
                String str = this.G0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f29763w0;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    if (((pf.e0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    }
                    i11++;
                }
                cn0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            in0 in0Var = this.P;
            ArrayList arrayList = in0Var.f29449a;
            ArrayList arrayList2 = in0Var.f29449a;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (((hn0) arrayList2.get(i11)).f29060a == 3 && ((hn0) arrayList2.get(i11)).f29061b == i10) {
                return i11;
            }
            i11++;
        }
    }

    public final void M(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            hh.f1 f1Var = this.R;
            if (i10 >= f1Var.getChildCount()) {
                break;
            }
            View childAt = f1Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.e6) || (childAt instanceof org.telegram.ui.Cells.p2) || (childAt instanceof org.telegram.ui.Cells.i4)) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.i10) {
                arrayList.addAll(((org.telegram.ui.i10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.i10) {
                arrayList.addAll(((org.telegram.ui.i10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.i10 i10Var = this.I0;
        if (i10Var != null) {
            arrayList.addAll(i10Var.getThemeDescriptions());
        }
        wm0 wm0Var = this.S;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wm0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wm0Var.f29506e, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.addAll(h7.c6.a(new s6(this, 7), org.telegram.ui.ActionBar.g6.f23425y8));
    }

    public final boolean N() {
        int i10 = this.D0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f29762v0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i10, String str, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        wm0 wm0Var = this.S;
        if (zIsEmpty) {
            wm0Var.f29506e.setVisibility(8);
        } else {
            wm0Var.f29506e.setVisibility(0);
            wm0Var.f29506e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        cn0 cn0Var = this.U;
        org.telegram.ui.rx rxVar = cn0Var.Q;
        long jA = rxVar != null ? rxVar.a() : 0L;
        long j11 = i10 == 0 ? 0L : jA;
        long j12 = 0;
        long j13 = 0;
        int i11 = 0;
        boolean z15 = false;
        while (true) {
            ArrayList arrayList = this.f29763w0;
            if (i11 >= arrayList.size()) {
                break;
            }
            pf.e0 e0Var = (pf.e0) arrayList.get(i11);
            int i12 = e0Var.d;
            if (i12 == 4) {
                TLObject tLObject = e0Var.f45783f;
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f22527id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j10 = -((TLRPC.Chat) e0Var.f45783f).f22380id;
                }
                j11 = j10;
            } else if (i12 == 6) {
                pf.c0 c0Var = e0Var.f45784g;
                long j14 = c0Var.f45750b;
                j13 = c0Var.f45751c;
                j12 = j14;
            } else if (i12 == 7) {
                z15 = true;
            }
            i11++;
        }
        an0 an0Var = this.f29758r0;
        an0Var.getClass();
        if (t30.X(str, null) == null) {
            J();
        }
        if (view == this.f29743b0) {
            MessagesController.getInstance(this.D0).getChannelRecommendations(0L);
            en0 en0Var = this.f29747f0;
            zk0 zk0Var = en0Var.d;
            ArrayList arrayList2 = en0Var.M;
            ArrayList arrayList3 = en0Var.N;
            ArrayList arrayList4 = en0Var.O;
            ArrayList arrayList5 = en0Var.L;
            lp lpVar = en0Var.Y;
            en0Var.W();
            if (TextUtils.equals(str, en0Var.X)) {
                z14 = false;
            } else {
                en0Var.X = str;
                AndroidUtilities.cancelRunOnUIThread(lpVar);
                if (TextUtils.isEmpty(en0Var.X)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    en0Var.N(true);
                    en0Var.W++;
                    z14 = false;
                    en0Var.S = false;
                    en0Var.T = false;
                    en0Var.U = false;
                    en0Var.V = 0;
                    if (zk0Var != null) {
                        zk0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(lpVar, 1000L);
                    en0Var.S = true;
                    en0Var.T = true;
                    en0Var.N(true);
                    if (zk0Var != null) {
                        z14 = false;
                        zk0Var.u0(0);
                    } else {
                        z14 = false;
                    }
                }
            }
            this.f29744c0.b(this.J0, z14);
            return;
        }
        if (view == this.f29748g0) {
            xm0 xm0Var = this.f29752k0;
            zk0 zk0Var2 = xm0Var.d;
            ArrayList arrayList6 = xm0Var.P;
            bs bsVar = xm0Var.f28442b0;
            if (TextUtils.equals(str, xm0Var.f28441a0)) {
                z13 = false;
            } else {
                xm0Var.f28441a0 = str;
                AndroidUtilities.cancelRunOnUIThread(bsVar);
                if (TextUtils.isEmpty(xm0Var.f28441a0)) {
                    arrayList6.clear();
                    xm0Var.N(true);
                    xm0Var.Z++;
                    z13 = false;
                    xm0Var.V = false;
                    xm0Var.W = false;
                    xm0Var.X = false;
                    xm0Var.Y = 0;
                    if (zk0Var2 != null) {
                        zk0Var2.u0(0);
                    }
                } else {
                    z13 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(bsVar, 1000L);
                    xm0Var.V = true;
                    xm0Var.W = true;
                    xm0Var.N(true);
                    if (zk0Var2 != null) {
                        zk0Var2.u0(0);
                    }
                }
            }
            this.f29749h0.b(this.J0, z13);
            if (TextUtils.isEmpty(str)) {
                xm0Var.V();
                return;
            }
            return;
        }
        mg0 mg0Var = this.f29753l0;
        if (view == mg0Var) {
            k51 k51Var = mg0Var.f30677c;
            ArrayList arrayList7 = mg0Var.f30680n;
            if (TextUtils.equals(mg0Var.f30683w, str)) {
                return;
            }
            if (mg0Var.G >= 0) {
                ConnectionsManager.getInstance(mg0Var.f30676b).cancelRequest(mg0Var.G, true);
                mg0Var.G = -1;
            }
            mg0Var.v = false;
            mg0Var.D.setLoading(false);
            mg0Var.f30683w = str;
            if (TextUtils.isEmpty(str)) {
                mg0Var.f30681r = 0;
                z12 = true;
                mg0Var.H++;
                mg0Var.f30682s = false;
                arrayList7.clear();
                mg0Var.a(false);
            } else {
                z12 = true;
                mg0Var.b(str);
                mg0Var.f30681r = 0;
                mg0Var.H++;
                mg0Var.f30682s = false;
                arrayList7.clear();
            }
            mg0Var.d();
            k51Var.u0(0);
            k51Var.U2.N(z12);
            return;
        }
        if (view == this.f29754n0) {
            if (t30.X(str, null) == null) {
                return;
            }
            if (z10) {
                this.f29756p0.h1(0, 0);
            }
            an0Var.Y(str);
            this.f29755o0.b(this.J0, false);
            return;
        }
        if (view != this.Q) {
            long j15 = jA;
            long j16 = j12;
            long j17 = j13;
            if (view instanceof org.telegram.ui.i10) {
                org.telegram.ui.i10 i10Var = (org.telegram.ui.i10) view;
                i10Var.setUseFromUserAsAvatar(j15 != 0);
                i10Var.f38938c.b(this.J0, false);
                i10Var.h(j11, this.P0, j16, j17, pf.g0.Y2[((hn0) this.P.f29449a.get(i10)).f29061b], z15, str, z10);
                return;
            }
            if (view instanceof jm0) {
                jm0 jm0Var = (jm0) view;
                jm0Var.f29727a.b(this.J0, false);
                jm0Var.G = str;
                jm0Var.d(false);
                return;
            }
            return;
        }
        org.telegram.ui.i10 i10Var2 = this.I0;
        if (!(j11 == 0 && this.P0 == 0 && j12 == 0 && j13 == 0) && jA == 0) {
            boolean z16 = true;
            i10Var2.setTag(1);
            i10Var2.i(this.H0, false);
            i10Var2.animate().setListener(null).cancel();
            if (z10) {
                i10Var2.setVisibility(0);
                i10Var2.setAlpha(1.0f);
                z16 = z10;
            } else {
                if (i10Var2.getVisibility() != 0) {
                    i10Var2.setVisibility(0);
                    i10Var2.setAlpha(0.0f);
                } else {
                    z16 = z10;
                }
                i10Var2.animate().alpha(1.0f).setDuration(150L).start();
            }
            z11 = false;
            this.I0.h(j11, this.P0, j12, j13, null, z15, str, z16);
            wm0Var.setVisibility(8);
        } else {
            this.E0 = false;
            cn0Var.U(z15 ? 1 : 0, str);
            cn0Var.f46007w0 = this.H0;
            i10Var2.animate().setListener(null).cancel();
            i10Var2.i(null, false);
            if (z10) {
                wm0Var.e(!(cn0Var.f46012z0 > 0), false);
                wm0Var.e(cn0Var.f46012z0 > 0, false);
            } else if (!cn0Var.N()) {
                wm0Var.e(cn0Var.f46012z0 > 0, true);
            }
            if (z10) {
                i10Var2.setVisibility(8);
            } else if (i10Var2.getVisibility() != 8) {
                i10Var2.animate().alpha(0.0f).setListener(new sz(this, 18)).setDuration(150L).start();
            }
            i10Var2.setTag(null);
            z11 = false;
        }
        wm0Var.b(this.J0, z11);
        i10Var2.f38938c.b(this.J0, z11);
    }

    public final void Q(boolean z10) {
        yk0 yk0Var;
        yk0 yk0Var2;
        yk0 yk0Var3;
        org.telegram.ui.rx rxVar;
        if (this.f29761u0 == z10) {
            return;
        }
        org.telegram.ui.gy gyVar = this.F0;
        if (z10 && gyVar.getActionBar().t()) {
            return;
        }
        if (z10 && !gyVar.getActionBar().a("search_view_pager")) {
            this.B0 = gyVar.getActionBar().j("search_view_pager");
            if (gyVar.S) {
                ImageView imageView = new ImageView(getContext());
                this.f29759s0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f29759s0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                this.f29759s0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23425y8, false), PorterDuff.Mode.MULTIPLY));
                this.f29759s0.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23443z8, false), 1, -1));
                this.f29759s0.setOnClickListener(new l70(this, 14));
                this.B0.addView(this.f29759s0, h7.z5.o(54, 54, 0.0f, 16));
            }
            NumberTextView numberTextView = new NumberTextView(this.B0.getContext());
            this.f29760t0 = numberTextView;
            numberTextView.setTextSize(18);
            this.f29760t0.setTypeface(AndroidUtilities.bold());
            NumberTextView numberTextView2 = this.f29760t0;
            int i10 = org.telegram.ui.ActionBar.g6.f23425y8;
            numberTextView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            this.B0.addView(this.f29760t0, h7.z5.m(1.0f, 0, -1, gyVar.S ? 18 : 72, 0, 0));
            this.f29760t0.setOnTouchListener(new kh.e(21));
            org.telegram.ui.ActionBar.v0 v0VarH = this.B0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
            this.f29764x0 = v0VarH;
            v0VarH.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
            this.f29765y0 = this.B0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
            this.f29766z0 = this.B0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
            this.A0 = this.B0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        }
        if (this.f29760t0 != null) {
            cn0 cn0Var = this.U;
            ((ViewGroup.MarginLayoutParams) this.f29760t0.getLayoutParams()).leftMargin = AndroidUtilities.dp((gyVar.S ? 18 : 72) + (cn0Var != null && (rxVar = cn0Var.Q) != null && (rxVar.a() > 0L ? 1 : (rxVar.a() == 0L ? 0 : -1)) != 0 ? 56 : 0));
            NumberTextView numberTextView3 = this.f29760t0;
            numberTextView3.setLayoutParams(numberTextView3.getLayoutParams());
        }
        if (gyVar.getActionBar().getBackButton() != null && (gyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            gyVar.getActionBar().setBackButtonDrawable(g2Var);
            g2Var.setColorFilter(null);
        }
        this.f29761u0 = z10;
        HashMap map = this.f29762v0;
        if (z10) {
            AndroidUtilities.hideKeyboard(gyVar.getParentActivity().getCurrentFocus());
            gyVar.getActionBar().O(null, null);
            this.f29760t0.a(map.size(), false);
            this.f29764x0.setVisibility(N() ? 0 : 8);
            this.f29765y0.setVisibility(0);
            this.f29766z0.setVisibility(0);
            this.A0.setVisibility(0);
            return;
        }
        gyVar.getActionBar().s();
        map.clear();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof org.telegram.ui.i10) && (yk0Var3 = ((org.telegram.ui.i10) getChildAt(i11)).d) != null) {
                yk0Var3.l();
            }
            if (getChildAt(i11) instanceof jm0) {
                ((jm0) getChildAt(i11)).d(true);
            }
        }
        org.telegram.ui.i10 i10Var = this.I0;
        if (i10Var != null && (yk0Var2 = i10Var.d) != null) {
            yk0Var2.l();
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if ((view instanceof org.telegram.ui.i10) && (yk0Var = ((org.telegram.ui.i10) view).d) != null) {
                yk0Var.l();
            }
        }
    }

    public final void R() {
        this.P.i();
        o(false);
        e71 e71Var = this.I;
        if (e71Var != null) {
            e71Var.f31226x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final boolean b(org.telegram.ui.a10 a10Var) {
        return this.f29762v0.containsKey(a10Var);
    }

    @Override
    public final void c(MessageObject messageObject) {
        this.F0.presentFragment(K(messageObject, this.D0));
        Q(false);
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        boolean z10;
        org.telegram.ui.a10 a10Var = new org.telegram.ui.a10(messageObject.getId(), messageObject.getDialogId());
        HashMap map = this.f29762v0;
        if (map.containsKey(a10Var)) {
            map.remove(a10Var);
        } else if (map.size() >= 100) {
            return;
        } else {
            map.put(a10Var, messageObject);
        }
        if (map.size() == 0) {
            Q(false);
        } else {
            this.f29760t0.a(map.size(), true);
            org.telegram.ui.ActionBar.v0 v0Var = this.f29765y0;
            if (v0Var != null) {
                v0Var.setVisibility(map.size() == 1 ? 0 : 8);
            }
            if (this.f29764x0 != null) {
                boolean zN = N();
                int i11 = zN ? 0 : 8;
                if (this.f29764x0.getVisibility() != i11) {
                    this.f29764x0.setVisibility(i11);
                    int i12 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f29764x0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23425y8, false), PorterDuff.Mode.SRC_IN));
                    if (zN) {
                        animatedVectorDrawable.start();
                    } else if (i12 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.A0 != null) {
                Iterator it = map.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    } else if (!((MessageObject) map.get((org.telegram.ui.a10) it.next())).isDownloadingFile) {
                        z10 = false;
                        break;
                    }
                }
                this.A0.setVisibility(z10 ? 0 : 8);
            }
        }
        if (view instanceof org.telegram.ui.Cells.f7) {
            ((org.telegram.ui.Cells.f7) view).b(map.containsKey(a10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).b(i10, map.containsKey(a10Var));
            return;
        }
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).f(map.containsKey(a10Var), true);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.e7) {
            ((org.telegram.ui.Cells.e7) view).e(map.containsKey(a10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view).c(map.containsKey(a10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.p2) {
            ((org.telegram.ui.Cells.p2) view).V(map.containsKey(a10Var), true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        en0 en0Var = this.f29747f0;
        if (i10 == i12) {
            this.f29744c0.e(MessagesController.getInstance(this.D0).getChannelRecommendations(0L) != null, true);
            en0Var.W();
            en0Var.N(true);
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted || i10 == NotificationCenter.dialogsNeedReload) {
            en0Var.W();
            en0Var.N(true);
        } else {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f29752k0.N(true);
                return;
            }
            if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                an0 an0Var = this.f29758r0;
                if (obj == an0Var.M) {
                    an0Var.N(true);
                }
            }
        }
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages == null) {
            return;
        }
        for (View view : viewPages) {
            FrameLayout frameLayout = this.Q;
            zk0 zk0Var = null;
            if (view != null) {
                if (view == frameLayout) {
                    zk0Var = this.R;
                } else if (view == this.f29743b0) {
                    zk0Var = this.f29746e0;
                } else if (view == this.f29748g0) {
                    zk0Var = this.f29751j0;
                } else if (view == this.f29754n0) {
                    zk0Var = this.f29757q0;
                } else {
                    jm0 jm0Var = this.C0;
                    if (view == jm0Var) {
                        zk0Var = jm0Var.f29728b;
                    } else {
                        mg0 mg0Var = this.f29753l0;
                        if (view == mg0Var) {
                            zk0Var = mg0Var.f30677c;
                        } else if (view instanceof org.telegram.ui.i10) {
                            zk0Var = ((org.telegram.ui.i10) view).f38936b;
                        }
                    }
                }
            }
            if (zk0Var != null) {
                pg.c.b(zk0Var, canvas, rectF, zk0Var, this);
            }
            if (view == frameLayout) {
                org.telegram.ui.i10 i10Var = this.I0;
                if (i10Var.getVisibility() == 0) {
                    hh.f1 f1Var = i10Var.f38936b;
                    pg.c.b(f1Var, canvas, rectF, f1Var, this);
                }
            }
        }
    }

    @Override
    public final boolean f() {
        return this.f29761u0;
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        yVar.f6327b = true;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.B0;
    }

    public ArrayList<pf.e0> getCurrentSearchFilters() {
        return this.f29763w0;
    }

    public jm0 getDownloadsContainer() {
        return this.C0;
    }

    public int getFolderId() {
        return this.N0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.v0 getSpeedItem() {
        return this.f29764x0;
    }

    public o71 getTabsView() {
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
        this.f29742a0 = true;
        en0 en0Var = this.f29747f0;
        if (en0Var != null) {
            en0Var.N(false);
        }
        xm0 xm0Var = this.f29752k0;
        if (xm0Var != null) {
            xm0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29742a0 = false;
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

    public void setBlurredBackgroundDrawableFactory(jg.a aVar) {
        this.S0 = aVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.z00 z00Var) {
        this.H0 = z00Var;
    }

    public void setKeyboardHeight(int i10) {
        this.J0 = i10;
        boolean z10 = getVisibility() == 0 && getAlpha() > 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.i10) {
                ((org.telegram.ui.i10) getChildAt(i11)).f38938c.b(i10, z10);
            } else if (getChildAt(i11) == this.Q) {
                this.S.b(i10, z10);
                this.I0.f38938c.b(i10, z10);
            } else if (getChildAt(i11) instanceof jm0) {
                ((jm0) getChildAt(i11)).f29727a.b(i10, z10);
            } else if (getChildAt(i11) == this.f29743b0) {
                this.f29744c0.b(i10, z10);
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
        e71 e71Var = this.I;
        if (e71Var != null) {
            e71Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        cn0 cn0Var = this.U;
        org.telegram.ui.i10 i10Var = this.I0;
        if (i10 == 0) {
            if (i10Var.getVisibility() == 0) {
                i10Var.i(this.H0, false);
                cn0Var.f46007w0 = null;
            } else {
                i10Var.i(null, false);
                org.telegram.ui.z00 z00Var = this.H0;
                cn0Var.f46007w0 = z00Var;
                if (z00Var != null) {
                    ((org.telegram.ui.mv) z00Var).i(false, null, cn0Var.f46004u0, cn0Var.f46005v0);
                }
            }
        } else if (view instanceof org.telegram.ui.i10) {
            ((org.telegram.ui.i10) view).i(this.H0, i11 == 0 && i10Var.getVisibility() != 0);
        }
        if (view2 instanceof org.telegram.ui.i10) {
            ((org.telegram.ui.i10) view2).i(null, false);
        } else {
            cn0Var.f46007w0 = null;
            i10Var.i(null, false);
        }
    }
}
