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
public abstract class zo0 extends k91 implements org.telegram.ui.b20, NotificationCenter.NotificationCenterDelegate, ch.a {
    public static final int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public yn0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.yy J0;
    public String K0;
    public org.telegram.ui.t10 L0;
    public final org.telegram.ui.c20 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.ey P0;
    public final ow0 Q0;
    public final int R0;
    public int S0;
    public final yo0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final bi.o0 V;
    public int V0;
    public final mo0 W;
    public NotificationCenter.ObserversGroup W0;
    public bh.b X0;
    public final s4.k f31914a0;
    public final so0 f31915b0;
    public final s4.b0 f31916c0;
    public final rl0 f31917d0;
    public boolean f31918e0;
    public final FrameLayout f31919f0;
    public final mo0 f31920g0;
    public final s4.b0 f31921h0;
    public final mm0 f31922i0;
    public final uo0 f31923j0;
    public final FrameLayout f31924k0;
    public final mo0 f31925l0;
    public final s4.b0 m0;
    public final mm0 f31926n0;
    public final no0 f31927o0;
    public final zh0 f31928p0;
    public boolean f31929q0;
    public final FrameLayout f31930r0;
    public final mo0 f31931s0;
    public final s4.b0 f31932t0;
    public final mm0 f31933u0;
    public final qo0 f31934v0;
    public ImageView f31935w0;
    public NumberTextView f31936x0;
    public boolean f31937y0;
    public final HashMap f31938z0;

    public zo0(Context context, org.telegram.ui.yy yyVar, int i10, int i11, int i12, long j10, org.telegram.ui.ey eyVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f31929q0 = false;
        this.f31938z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j10;
        this.J0 = yyVar;
        this.P0 = eyVar;
        s4.k kVar = new s4.k();
        this.f31914a0 = kVar;
        kVar.f44917c = 150L;
        kVar.e = 350L;
        kVar.f44918f = 0L;
        kVar.f44919g = 0L;
        kVar.d = 0L;
        kVar.f44920i = new OvershootInterpolator(1.1f);
        kVar.f44901o = es.h;
        org.telegram.ui.iy iyVar = (org.telegram.ui.iy) this;
        this.f31915b0 = new so0(iyVar, context, yyVar, i10, i11, kVar, yyVar.F, yyVar, context);
        if (i11 == 15) {
            ArrayList O3 = yyVar.O3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < O3.size(); i18 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.Dialog) O3.get(i18)).f19220id, arrayList, i18, 1)) {
            }
            this.f31915b0.f10582q0 = arrayList;
        }
        this.Q0 = (ow0) yyVar.getFragmentView();
        bi.o0 o0Var = new bi.o0(iyVar, context, 21);
        this.V = o0Var;
        o0Var.setItemAnimator(this.f31914a0);
        o0Var.setPivotY(0.0f);
        o0Var.setClipToPadding(false);
        o0Var.setAdapter(this.f31915b0);
        o0Var.setVerticalScrollBarEnabled(true);
        o0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        o0Var.setVerticalScrollbarPosition(i13);
        s4.b0 b0Var = new s4.b0(1, false);
        this.f31916c0 = b0Var;
        o0Var.setLayoutManager(b0Var);
        o0Var.W1 = true;
        o0Var.X1 = 0;
        o0Var.setOnScrollListener(new oo0(iyVar, yyVar, 2));
        o0Var.C0(new yc0(iyVar, 24));
        org.telegram.ui.c20 c20Var = new org.telegram.ui.c20(this.J0);
        this.M0 = c20Var;
        bi.o0 o0Var2 = c20Var.f34681b;
        o0Var2.setClipToPadding(false);
        o0Var2.j(new ro0(iyVar, 1));
        o0Var2.C0(new yc0(iyVar, 24));
        c20Var.setUiCallback(this);
        c20Var.setVisibility(8);
        c20Var.setChatPreviewDelegate(eyVar);
        f10 f10Var = new f10(context, null);
        f10Var.setViewType(1);
        mo0 mo0Var = new mo0(iyVar, context, f10Var, 2);
        this.W = mo0Var;
        mo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var.e.setVisibility(8);
        mo0Var.setVisibility(8);
        mo0Var.addView(f10Var, 0);
        mo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(mo0Var);
        frameLayout.addView(o0Var);
        frameLayout.addView(c20Var);
        o0Var.setEmptyView(mo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f31919f0 = frameLayout2;
        to0 to0Var = new to0(iyVar);
        to0Var.f44872m = false;
        to0Var.C = false;
        es esVar = es.h;
        to0Var.o(esVar);
        to0Var.n(350L);
        mm0 mm0Var = new mm0(context, null);
        this.f31922i0 = mm0Var;
        mm0Var.setItemAnimator(to0Var);
        mm0Var.setPivotY(0.0f);
        mm0Var.setVerticalScrollBarEnabled(true);
        mm0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        mm0Var.setVerticalScrollbarPosition(i14);
        s4.b0 b0Var2 = new s4.b0(1, false);
        this.f31921h0 = b0Var2;
        mm0Var.setLayoutManager(b0Var2);
        mm0Var.W1 = true;
        mm0Var.X1 = 0;
        mm0Var.setClipToPadding(false);
        f10 f10Var2 = new f10(context, null);
        f10Var2.setViewType(1);
        mo0 mo0Var2 = new mo0(iyVar, context, f10Var2, 3);
        this.f31920g0 = mo0Var2;
        mo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var2.e.setVisibility(8);
        mo0Var2.setVisibility(8);
        mo0Var2.addView(f10Var2, 0);
        mo0Var2.e(true, false);
        frameLayout2.addView(mo0Var2);
        frameLayout2.addView(mm0Var);
        mm0Var.setEmptyView(mo0Var2);
        uo0 uo0Var = new uo0(iyVar, mm0Var, context, this.H0, i12, yyVar);
        this.f31923j0 = uo0Var;
        mm0Var.setAdapter(uo0Var);
        mm0Var.setOnScrollListener(new oo0(iyVar, yyVar, 3));
        mm0Var.C0(new yc0(iyVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f31924k0 = frameLayout3;
        lo0 lo0Var = new lo0(iyVar);
        lo0Var.f44872m = false;
        lo0Var.C = false;
        lo0Var.o(esVar);
        lo0Var.n(350L);
        mm0 mm0Var2 = new mm0(context, null);
        this.f31926n0 = mm0Var2;
        mm0Var2.setItemAnimator(lo0Var);
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
        s4.b0 b0Var3 = new s4.b0(1, false);
        this.m0 = b0Var3;
        mm0Var2.setLayoutManager(b0Var3);
        mm0Var2.W1 = true;
        mm0Var2.X1 = 0;
        f10 f10Var3 = new f10(context, null);
        f10Var3.setViewType(1);
        mo0 mo0Var3 = new mo0(iyVar, context, f10Var3, 0);
        this.f31925l0 = mo0Var3;
        mo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var3.e.setVisibility(8);
        mo0Var3.setVisibility(8);
        mo0Var3.addView(f10Var3, 0);
        mo0Var3.e(true, false);
        frameLayout3.addView(mo0Var3);
        frameLayout3.addView(mm0Var2);
        mm0Var2.setEmptyView(mo0Var3);
        no0 no0Var = new no0(iyVar, mm0Var2, context, this.H0, i12);
        this.f31927o0 = no0Var;
        mm0Var2.setAdapter(no0Var);
        mm0Var2.setOnScrollListener(new oo0(iyVar, yyVar, 0));
        mm0Var2.C0(new yc0(iyVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f31930r0 = frameLayout4;
        po0 po0Var = new po0(iyVar);
        po0Var.f44872m = false;
        po0Var.C = false;
        po0Var.o(esVar);
        po0Var.n(350L);
        mm0 mm0Var3 = new mm0(context, null);
        this.f31933u0 = mm0Var3;
        mm0Var3.setItemAnimator(po0Var);
        mm0Var3.setPivotY(0.0f);
        mm0Var3.setVerticalScrollBarEnabled(true);
        mm0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        mm0Var3.setVerticalScrollbarPosition(i16);
        s4.b0 b0Var4 = new s4.b0(1, false);
        this.f31932t0 = b0Var4;
        mm0Var3.setLayoutManager(b0Var4);
        mm0Var3.W1 = true;
        mm0Var3.X1 = 0;
        mm0Var3.setClipToPadding(false);
        f10 f10Var4 = new f10(context, null);
        f10Var4.setViewType(1);
        mo0 mo0Var4 = new mo0(iyVar, context, f10Var4, 1);
        this.f31931s0 = mo0Var4;
        mo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        mo0Var4.e.setVisibility(8);
        mo0Var4.setVisibility(8);
        mo0Var4.addView(f10Var4, 0);
        mo0Var4.e(true, false);
        frameLayout4.addView(mo0Var4);
        frameLayout4.addView(mm0Var3);
        mm0Var3.setEmptyView(mo0Var4);
        qo0 qo0Var = new qo0(iyVar, mm0Var3, context, this.H0);
        this.f31934v0 = qo0Var;
        mm0Var3.setAdapter(qo0Var);
        mm0Var3.setOnScrollListener(new oo0(iyVar, yyVar, 1));
        mm0Var3.C0(new yc0(iyVar, 24));
        this.f31917d0 = new rl0(o0Var, true);
        zh0 zh0Var = new zh0(context, yyVar);
        this.f31928p0 = zh0Var;
        h71 h71Var = zh0Var.f31870c;
        h71Var.setClipToPadding(false);
        h71Var.j(new ro0(iyVar, 0));
        h71Var.C0(new yc0(iyVar, 24));
        yo0 yo0Var = new yo0(iyVar);
        this.T = yo0Var;
        setAdapter(yo0Var);
    }

    public static org.telegram.ui.fo K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.fo(bundle);
    }

    public static void P(FrameLayout frameLayout, mm0 mm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            mm0Var.o1(0, i10, 0, i11);
        } else {
            mm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f31929q0) {
            int i10 = 0;
            this.f31929q0 = false;
            R();
            a91 a91Var = this.M;
            if (a91Var != null && a91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            so0 so0Var = this.f31915b0;
            if (so0Var != null) {
                String str = this.K0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.A0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((hg.p0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                so0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            yo0 yo0Var = this.T;
            ArrayList arrayList = yo0Var.f31666a;
            ArrayList arrayList2 = yo0Var.f31666a;
            if (i11 < arrayList.size()) {
                if (((xo0) arrayList2.get(i11)).f31293a == 3 && ((xo0) arrayList2.get(i11)).f31294b == i10) {
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
            if ((childAt instanceof org.telegram.ui.Cells.i6) || (childAt instanceof org.telegram.ui.Cells.s2) || (childAt instanceof org.telegram.ui.Cells.l4)) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.c20) {
                arrayList.addAll(((org.telegram.ui.c20) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.c20) {
                arrayList.addAll(((org.telegram.ui.c20) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.c20 c20Var = this.M0;
        if (c20Var != null) {
            arrayList.addAll(c20Var.getThemeDescriptions());
        }
        mo0 mo0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.i6(mo0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(mo0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f20288y6));
        arrayList.addAll(w7.d6.a(new b7(this, 7), org.telegram.ui.ActionBar.g6.f20290y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f31938z0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i10, String str, boolean z10) {
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.ui.c20 c20Var;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        mo0 mo0Var = this.W;
        if (isEmpty) {
            mo0Var.e.setVisibility(8);
        } else {
            mo0Var.e.setVisibility(0);
            mo0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        so0 so0Var = this.f31915b0;
        org.telegram.ui.ky kyVar = so0Var.U;
        if (kyVar != null) {
            j10 = kyVar.a();
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
            ArrayList arrayList = this.A0;
            if (i11 >= arrayList.size()) {
                break;
            }
            hg.p0 p0Var = (hg.p0) arrayList.get(i11);
            int i12 = p0Var.d;
            if (i12 == 4) {
                TLObject tLObject = p0Var.f10702f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f19363id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j12 = -((TLRPC.Chat) p0Var.f10702f).f19216id;
                }
                j11 = j12;
            } else if (i12 == 6) {
                hg.n0 n0Var = p0Var.f10703g;
                long j15 = n0Var.f10678b;
                j14 = n0Var.f10679c;
                j13 = j15;
            } else if (i12 == 7) {
                z20 = true;
            }
            i11++;
        }
        qo0 qo0Var = this.f31934v0;
        qo0Var.getClass();
        if (r40.X(str, null) == null) {
            J();
        }
        if (view == this.f31919f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            uo0 uo0Var = this.f31923j0;
            mm0 mm0Var = uo0Var.d;
            ArrayList arrayList2 = uo0Var.Q;
            ArrayList arrayList3 = uo0Var.R;
            ArrayList arrayList4 = uo0Var.S;
            ArrayList arrayList5 = uo0Var.P;
            kq kqVar = uo0Var.f25420c0;
            uo0Var.W();
            if (!TextUtils.equals(str, uo0Var.f25419b0)) {
                uo0Var.f25419b0 = str;
                AndroidUtilities.cancelRunOnUIThread(kqVar);
                if (TextUtils.isEmpty(uo0Var.f25419b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    uo0Var.N(true);
                    uo0Var.f25418a0++;
                    z19 = false;
                    uo0Var.W = false;
                    uo0Var.X = false;
                    uo0Var.Y = false;
                    uo0Var.Z = 0;
                    if (mm0Var != null) {
                        mm0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(kqVar, 1000L);
                    uo0Var.W = true;
                    uo0Var.X = true;
                    uo0Var.N(true);
                    if (mm0Var != null) {
                        z19 = false;
                        mm0Var.u0(0);
                    }
                }
                this.f31920g0.b(this.N0, z19);
            }
            z19 = false;
            this.f31920g0.b(this.N0, z19);
        } else if (view == this.f31924k0) {
            no0 no0Var = this.f31927o0;
            mm0 mm0Var2 = no0Var.d;
            ArrayList arrayList6 = no0Var.T;
            zs zsVar = no0Var.f24791f0;
            if (TextUtils.equals(str, no0Var.f24790e0)) {
                z18 = false;
            } else {
                no0Var.f24790e0 = str;
                AndroidUtilities.cancelRunOnUIThread(zsVar);
                if (TextUtils.isEmpty(no0Var.f24790e0)) {
                    arrayList6.clear();
                    no0Var.N(true);
                    no0Var.f24789d0++;
                    z18 = false;
                    no0Var.Z = false;
                    no0Var.f24786a0 = false;
                    no0Var.f24787b0 = false;
                    no0Var.f24788c0 = 0;
                    if (mm0Var2 != null) {
                        mm0Var2.u0(0);
                    }
                } else {
                    z18 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(zsVar, 1000L);
                    no0Var.Z = true;
                    no0Var.f24786a0 = true;
                    no0Var.N(true);
                    if (mm0Var2 != null) {
                        mm0Var2.u0(0);
                    }
                }
            }
            this.f31925l0.b(this.N0, z18);
            if (TextUtils.isEmpty(str)) {
                no0Var.V();
            }
        } else {
            zh0 zh0Var = this.f31928p0;
            if (view == zh0Var) {
                h71 h71Var = zh0Var.f31870c;
                ArrayList arrayList7 = zh0Var.f31872n;
                if (!TextUtils.equals(zh0Var.f31875w, str)) {
                    if (zh0Var.K >= 0) {
                        ConnectionsManager.getInstance(zh0Var.f31869b).cancelRequest(zh0Var.K, true);
                        zh0Var.K = -1;
                    }
                    zh0Var.v = false;
                    zh0Var.H.setLoading(false);
                    zh0Var.f31875w = str;
                    if (TextUtils.isEmpty(str)) {
                        zh0Var.f31873r = 0;
                        z17 = true;
                        zh0Var.L++;
                        zh0Var.f31874s = false;
                        arrayList7.clear();
                        zh0Var.a(false);
                    } else {
                        z17 = true;
                        zh0Var.b(str);
                        zh0Var.f31873r = 0;
                        zh0Var.L++;
                        zh0Var.f31874s = false;
                        arrayList7.clear();
                    }
                    zh0Var.d();
                    h71Var.u0(0);
                    h71Var.W2.N(z17);
                }
            } else if (view == this.f31930r0) {
                if (r40.X(str, null) != null) {
                    if (z10) {
                        this.f31932t0.h1(0, 0);
                    }
                    qo0Var.Y(str);
                    this.f31931s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                org.telegram.ui.c20 c20Var2 = this.M0;
                if ((i13 == 0 && this.T0 == 0 && j13 == 0 && j14 == 0) || j10 != 0) {
                    this.I0 = false;
                    so0Var.U(z20 ? 1 : 0, str);
                    so0Var.A0 = this.L0;
                    c20Var2.animate().setListener(null).cancel();
                    c20Var2.i(null, false);
                    if (z10) {
                        if (so0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        mo0Var.e(!z15, false);
                        if (so0Var.D0 > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        mo0Var.e(z16, false);
                    } else if (!so0Var.N()) {
                        if (so0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        mo0Var.e(z14, true);
                    }
                    if (z10) {
                        c20Var2.setVisibility(8);
                    } else if (c20Var2.getVisibility() != 8) {
                        c20Var2.animate().alpha(0.0f).setListener(new k90(this, 14)).setDuration(150L).start();
                    }
                    c20Var2.setTag(null);
                    c20Var = c20Var2;
                    z13 = false;
                } else {
                    boolean z21 = true;
                    c20Var2.setTag(1);
                    c20Var2.i(this.L0, false);
                    c20Var2.animate().setListener(null).cancel();
                    if (z10) {
                        c20Var2.setVisibility(0);
                        c20Var2.setAlpha(1.0f);
                        z12 = z10;
                    } else {
                        if (c20Var2.getVisibility() != 0) {
                            c20Var2.setVisibility(0);
                            c20Var2.setAlpha(0.0f);
                        } else {
                            z21 = z10;
                        }
                        c20Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z12 = z21;
                    }
                    z13 = false;
                    long j16 = j11;
                    c20Var = c20Var2;
                    this.M0.h(j16, this.T0, j13, j14, null, z20, str, z12);
                    mo0Var.setVisibility(8);
                }
                mo0Var.b(this.N0, z13);
                c20Var.f34683c.b(this.N0, z13);
            } else {
                long j17 = j10;
                long j18 = j13;
                long j19 = j14;
                if (view instanceof org.telegram.ui.c20) {
                    org.telegram.ui.c20 c20Var3 = (org.telegram.ui.c20) view;
                    if (j17 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c20Var3.setUseFromUserAsAvatar(z11);
                    c20Var3.f34683c.b(this.N0, false);
                    c20Var3.h(j11, this.T0, j18, j19, hg.r0.f10714a3[((xo0) this.T.f31666a.get(i10)).f31294b], z20, str, z10);
                } else if (view instanceof yn0) {
                    yn0 yn0Var = (yn0) view;
                    yn0Var.f31653a.b(this.N0, false);
                    yn0Var.K = str;
                    yn0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        lm0 lm0Var;
        lm0 lm0Var2;
        lm0 lm0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.ky kyVar;
        int i12;
        if (this.f31937y0 != z10) {
            org.telegram.ui.yy yyVar = this.J0;
            if (!z10 || !yyVar.getActionBar().t()) {
                int i13 = 72;
                if (z10 && !yyVar.getActionBar().a("search_view_pager")) {
                    this.F0 = yyVar.getActionBar().j("search_view_pager");
                    if (yyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f31935w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f31935w0.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
                        this.f31935w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20290y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f31935w0.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20307z8, false), 1, -1));
                        this.f31935w0.setOnClickListener(new z80(this, 13));
                        this.F0.addView(this.f31935w0, w7.a6.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
                    this.f31936x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f31936x0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f31936x0;
                    int i14 = org.telegram.ui.ActionBar.g6.f20290y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.y yVar = this.F0;
                    NumberTextView numberTextView3 = this.f31936x0;
                    if (yyVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(numberTextView3, w7.a6.m(1.0f, 0, -1, i12, 0, 0));
                    this.f31936x0.setOnTouchListener(new ci.d(21));
                    org.telegram.ui.ActionBar.u0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f31936x0 != null) {
                    so0 so0Var = this.f31915b0;
                    if (so0Var != null && (kyVar = so0Var.U) != null && kyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31936x0.getLayoutParams();
                    if (yyVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f31936x0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (yyVar.getActionBar().getBackButton() != null && (yyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
                    yyVar.getActionBar().setBackButtonDrawable(f2Var);
                    f2Var.setColorFilter(null);
                }
                this.f31937y0 = z10;
                HashMap hashMap = this.f31938z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(yyVar.getParentActivity().getCurrentFocus());
                    yyVar.getActionBar().O(null, null);
                    this.f31936x0.a(hashMap.size(), false);
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
                yyVar.getActionBar().s();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.c20) && (lm0Var3 = ((org.telegram.ui.c20) getChildAt(i15)).d) != null) {
                        lm0Var3.l();
                    }
                    if (getChildAt(i15) instanceof yn0) {
                        ((yn0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.c20 c20Var = this.M0;
                if (c20Var != null && (lm0Var2 = c20Var.d) != null) {
                    lm0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.c20) && (lm0Var = ((org.telegram.ui.c20) view).d) != null) {
                        lm0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        a91 a91Var = this.M;
        if (a91Var != null) {
            a91Var.f26298x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final boolean b(org.telegram.ui.u10 u10Var) {
        return this.f31938z0.containsKey(u10Var);
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
        org.telegram.ui.u10 u10Var = new org.telegram.ui.u10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f31938z0;
        if (hashMap.containsKey(u10Var)) {
            hashMap.remove(u10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(u10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.f31936x0.a(hashMap.size(), true);
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
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20290y8, false), PorterDuff.Mode.SRC_IN));
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
                        if (!((MessageObject) hashMap.get((org.telegram.ui.u10) it.next())).isDownloadingFile) {
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
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(u10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(u10Var));
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(u10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(u10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(u10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(hashMap.containsKey(u10Var), true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z10 = false;
        uo0 uo0Var = this.f31923j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f31920g0.e(z10, true);
            uo0Var.W();
            uo0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f31927o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                qo0 qo0Var = this.f31934v0;
                if (obj == qo0Var.Q) {
                    qo0Var.N(true);
                }
            }
        } else {
            uo0Var.W();
            uo0Var.N(true);
        }
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        aVar.f2740a = true;
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.U;
                mm0 mm0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        mm0Var = this.V;
                    } else if (view == this.f31919f0) {
                        mm0Var = this.f31922i0;
                    } else if (view == this.f31924k0) {
                        mm0Var = this.f31926n0;
                    } else if (view == this.f31930r0) {
                        mm0Var = this.f31933u0;
                    } else {
                        yn0 yn0Var = this.G0;
                        if (view == yn0Var) {
                            mm0Var = yn0Var.f31654b;
                        } else {
                            zh0 zh0Var = this.f31928p0;
                            if (view == zh0Var) {
                                mm0Var = zh0Var.f31870c;
                            } else if (view instanceof org.telegram.ui.c20) {
                                mm0Var = ((org.telegram.ui.c20) view).f34681b;
                            }
                        }
                    }
                }
                if (mm0Var != null) {
                    hh.d.a(mm0Var, canvas, rectF, mm0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.c20 c20Var = this.M0;
                    if (c20Var.getVisibility() == 0) {
                        bi.o0 o0Var = c20Var.f34681b;
                        hh.d.a(o0Var, canvas, rectF, o0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f31937y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<hg.p0> getCurrentSearchFilters() {
        return this.A0;
    }

    public yn0 getDownloadsContainer() {
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

    public j91 getTabsView() {
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
        this.f31918e0 = true;
        uo0 uo0Var = this.f31923j0;
        if (uo0Var != null) {
            uo0Var.N(false);
        }
        no0 no0Var = this.f31927o0;
        if (no0Var != null) {
            no0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31918e0 = false;
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

    public void setBlurredBackgroundDrawableFactory(bh.b bVar) {
        this.X0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.t10 t10Var) {
        this.L0 = t10Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.c20) {
                ((org.telegram.ui.c20) getChildAt(i11)).f34683c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f34683c.b(i10, z10);
            } else if (getChildAt(i11) instanceof yn0) {
                ((yn0) getChildAt(i11)).f31653a.b(i10, z10);
            } else if (getChildAt(i11) == this.f31919f0) {
                this.f31920g0.b(i10, z10);
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
        a91 a91Var = this.M;
        if (a91Var != null) {
            a91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        so0 so0Var = this.f31915b0;
        org.telegram.ui.c20 c20Var = this.M0;
        if (i10 == 0) {
            if (c20Var.getVisibility() == 0) {
                c20Var.i(this.L0, false);
                so0Var.A0 = null;
            } else {
                c20Var.i(null, false);
                org.telegram.ui.t10 t10Var = this.L0;
                so0Var.A0 = t10Var;
                if (t10Var != null) {
                    ((org.telegram.ui.aw) t10Var).i(false, null, so0Var.f10595y0, so0Var.f10596z0);
                }
            }
        } else if (view instanceof org.telegram.ui.c20) {
            if (i11 == 0 && c20Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.c20) view).i(this.L0, z10);
        }
        if (view2 instanceof org.telegram.ui.c20) {
            ((org.telegram.ui.c20) view2).i(null, false);
            return;
        }
        so0Var.A0 = null;
        c20Var.i(null, false);
    }
}
