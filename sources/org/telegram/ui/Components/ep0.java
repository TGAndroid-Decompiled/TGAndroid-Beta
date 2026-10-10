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
public abstract class ep0 extends p91 implements org.telegram.ui.v10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.v0 B0;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.ActionBar.v0 D0;
    public org.telegram.ui.ActionBar.v0 E0;
    public org.telegram.ui.ActionBar.z F0;
    public co0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.ty J0;
    public String K0;
    public org.telegram.ui.n10 L0;
    public final org.telegram.ui.w10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.yx P0;
    public final tw0 Q0;
    public final int R0;
    public int S0;
    public final dp0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.w0 V;
    public int V0;
    public final ro0 W;
    public NotificationCenter.ObserversGroup W0;
    public ah.c X0;
    public final s4.j f26126a0;
    public final xo0 f26127b0;
    public final s4.d0 f26128c0;
    public final wl0 f26129d0;
    public boolean f26130e0;
    public final FrameLayout f26131f0;
    public final ro0 f26132g0;
    public final s4.d0 f26133h0;
    public final rm0 f26134i0;
    public final zo0 f26135j0;
    public final FrameLayout f26136k0;
    public final ro0 f26137l0;
    public final s4.d0 m0;
    public final rm0 f26138n0;
    public final so0 f26139o0;
    public final ei0 f26140p0;
    public boolean f26141q0;
    public final FrameLayout f26142r0;
    public final ro0 f26143s0;
    public final s4.d0 f26144t0;
    public final rm0 f26145u0;
    public final vo0 f26146v0;
    public ImageView f26147w0;
    public NumberTextView f26148x0;
    public boolean f26149y0;
    public final HashMap f26150z0;

    public ep0(Context context, org.telegram.ui.ty tyVar, int i10, int i11, int i12, long j3, org.telegram.ui.yx yxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f26141q0 = false;
        this.f26150z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = tyVar;
        this.P0 = yxVar;
        s4.j jVar = new s4.j();
        this.f26126a0 = jVar;
        jVar.f47794c = 150L;
        jVar.f47795e = 350L;
        jVar.f47796f = 0L;
        jVar.f47797g = 0L;
        jVar.d = 0L;
        jVar.f47798i = new OvershootInterpolator(1.1f);
        jVar.f47762o = is.h;
        org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this;
        this.f26127b0 = new xo0(dyVar, context, tyVar, i10, i11, jVar, tyVar.F, tyVar, context);
        if (i11 == 15) {
            ArrayList O3 = tyVar.O3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < O3.size(); i18 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) O3.get(i18)).f20046id, arrayList, i18, 1)) {
            }
            this.f26127b0.f10634q0 = arrayList;
        }
        this.Q0 = (tw0) tyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(dyVar, context, 21);
        this.V = w0Var;
        w0Var.setItemAnimator(this.f26126a0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.f26127b0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        w0Var.setVerticalScrollbarPosition(i13);
        s4.d0 d0Var = new s4.d0(1, false);
        this.f26128c0 = d0Var;
        w0Var.setLayoutManager(d0Var);
        w0Var.W1 = true;
        w0Var.X1 = 0;
        w0Var.setOnScrollListener(new to0(dyVar, tyVar, 2));
        w0Var.C0(new cd0(dyVar, 23));
        org.telegram.ui.w10 w10Var = new org.telegram.ui.w10(this.J0);
        this.M0 = w10Var;
        ai.w0 w0Var2 = w10Var.f43088b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new wo0(dyVar, 1));
        w0Var2.C0(new cd0(dyVar, 23));
        w10Var.setUiCallback(this);
        w10Var.setVisibility(8);
        w10Var.setChatPreviewDelegate(yxVar);
        k10 k10Var = new k10(context, null);
        k10Var.setViewType(1);
        ro0 ro0Var = new ro0(dyVar, context, k10Var, 2);
        this.W = ro0Var;
        ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var.f25085e.setVisibility(8);
        ro0Var.setVisibility(8);
        ro0Var.addView(k10Var, 0);
        ro0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(ro0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(w10Var);
        w0Var.setEmptyView(ro0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f26131f0 = frameLayout2;
        yo0 yo0Var = new yo0(dyVar);
        yo0Var.f47742m = false;
        yo0Var.C = false;
        is isVar = is.h;
        yo0Var.o(isVar);
        yo0Var.n(350L);
        rm0 rm0Var = new rm0(context, null);
        this.f26134i0 = rm0Var;
        rm0Var.setItemAnimator(yo0Var);
        rm0Var.setPivotY(0.0f);
        rm0Var.setVerticalScrollBarEnabled(true);
        rm0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        rm0Var.setVerticalScrollbarPosition(i14);
        s4.d0 d0Var2 = new s4.d0(1, false);
        this.f26133h0 = d0Var2;
        rm0Var.setLayoutManager(d0Var2);
        rm0Var.W1 = true;
        rm0Var.X1 = 0;
        rm0Var.setClipToPadding(false);
        k10 k10Var2 = new k10(context, null);
        k10Var2.setViewType(1);
        ro0 ro0Var2 = new ro0(dyVar, context, k10Var2, 3);
        this.f26132g0 = ro0Var2;
        ro0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var2.f25085e.setVisibility(8);
        ro0Var2.setVisibility(8);
        ro0Var2.addView(k10Var2, 0);
        ro0Var2.e(true, false);
        frameLayout2.addView(ro0Var2);
        frameLayout2.addView(rm0Var);
        rm0Var.setEmptyView(ro0Var2);
        zo0 zo0Var = new zo0(dyVar, rm0Var, context, this.H0, i12, tyVar);
        this.f26135j0 = zo0Var;
        rm0Var.setAdapter(zo0Var);
        rm0Var.setOnScrollListener(new to0(dyVar, tyVar, 3));
        rm0Var.C0(new cd0(dyVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f26136k0 = frameLayout3;
        qo0 qo0Var = new qo0(dyVar);
        qo0Var.f47742m = false;
        qo0Var.C = false;
        qo0Var.o(isVar);
        qo0Var.n(350L);
        rm0 rm0Var2 = new rm0(context, null);
        this.f26138n0 = rm0Var2;
        rm0Var2.setItemAnimator(qo0Var);
        rm0Var2.setPivotY(0.0f);
        rm0Var2.setClipToPadding(false);
        rm0Var2.setVerticalScrollBarEnabled(true);
        rm0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        rm0Var2.setVerticalScrollbarPosition(i15);
        s4.d0 d0Var3 = new s4.d0(1, false);
        this.m0 = d0Var3;
        rm0Var2.setLayoutManager(d0Var3);
        rm0Var2.W1 = true;
        rm0Var2.X1 = 0;
        k10 k10Var3 = new k10(context, null);
        k10Var3.setViewType(1);
        ro0 ro0Var3 = new ro0(dyVar, context, k10Var3, 0);
        this.f26137l0 = ro0Var3;
        ro0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var3.f25085e.setVisibility(8);
        ro0Var3.setVisibility(8);
        ro0Var3.addView(k10Var3, 0);
        ro0Var3.e(true, false);
        frameLayout3.addView(ro0Var3);
        frameLayout3.addView(rm0Var2);
        rm0Var2.setEmptyView(ro0Var3);
        so0 so0Var = new so0(dyVar, rm0Var2, context, this.H0, i12);
        this.f26139o0 = so0Var;
        rm0Var2.setAdapter(so0Var);
        rm0Var2.setOnScrollListener(new to0(dyVar, tyVar, 0));
        rm0Var2.C0(new cd0(dyVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f26142r0 = frameLayout4;
        uo0 uo0Var = new uo0(dyVar);
        uo0Var.f47742m = false;
        uo0Var.C = false;
        uo0Var.o(isVar);
        uo0Var.n(350L);
        rm0 rm0Var3 = new rm0(context, null);
        this.f26145u0 = rm0Var3;
        rm0Var3.setItemAnimator(uo0Var);
        rm0Var3.setPivotY(0.0f);
        rm0Var3.setVerticalScrollBarEnabled(true);
        rm0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        rm0Var3.setVerticalScrollbarPosition(i16);
        s4.d0 d0Var4 = new s4.d0(1, false);
        this.f26144t0 = d0Var4;
        rm0Var3.setLayoutManager(d0Var4);
        rm0Var3.W1 = true;
        rm0Var3.X1 = 0;
        rm0Var3.setClipToPadding(false);
        k10 k10Var4 = new k10(context, null);
        k10Var4.setViewType(1);
        ro0 ro0Var4 = new ro0(dyVar, context, k10Var4, 1);
        this.f26143s0 = ro0Var4;
        ro0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var4.f25085e.setVisibility(8);
        ro0Var4.setVisibility(8);
        ro0Var4.addView(k10Var4, 0);
        ro0Var4.e(true, false);
        frameLayout4.addView(ro0Var4);
        frameLayout4.addView(rm0Var3);
        rm0Var3.setEmptyView(ro0Var4);
        vo0 vo0Var = new vo0(dyVar, rm0Var3, context, this.H0);
        this.f26146v0 = vo0Var;
        rm0Var3.setAdapter(vo0Var);
        rm0Var3.setOnScrollListener(new to0(dyVar, tyVar, 1));
        rm0Var3.C0(new cd0(dyVar, 23));
        this.f26129d0 = new wl0(w0Var, true);
        ei0 ei0Var = new ei0(context, tyVar);
        this.f26140p0 = ei0Var;
        l71 l71Var = ei0Var.f26056c;
        l71Var.setClipToPadding(false);
        l71Var.j(new wo0(dyVar, 0));
        l71Var.C0(new cd0(dyVar, 23));
        dp0 dp0Var = new dp0(dyVar);
        this.T = dp0Var;
        setAdapter(dp0Var);
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

    public static void P(FrameLayout frameLayout, rm0 rm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            rm0Var.o1(0, i10, 0, i11);
        } else {
            rm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f26141q0) {
            int i10 = 0;
            this.f26141q0 = false;
            R();
            e91 e91Var = this.M;
            if (e91Var != null && e91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            xo0 xo0Var = this.f26127b0;
            if (xo0Var != null) {
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
                xo0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            dp0 dp0Var = this.T;
            ArrayList arrayList = dp0Var.f25779a;
            ArrayList arrayList2 = dp0Var.f25779a;
            if (i11 < arrayList.size()) {
                if (((cp0) arrayList2.get(i11)).f25357a == 3 && ((cp0) arrayList2.get(i11)).f25358b == i10) {
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
                arrayList.add(new org.telegram.ui.ActionBar.k6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20801d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.w10) {
                arrayList.addAll(((org.telegram.ui.w10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.w10) {
                arrayList.addAll(((org.telegram.ui.w10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.w10 w10Var = this.M0;
        if (w10Var != null) {
            arrayList.addAll(w10Var.getThemeDescriptions());
        }
        ro0 ro0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(ro0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(ro0Var.f25085e, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f21185y6));
        arrayList.addAll(w7.a6.a(new a7(this, 7), org.telegram.ui.ActionBar.i6.f21187y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f26150z0.values()) {
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
        org.telegram.ui.w10 w10Var;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ro0 ro0Var = this.W;
        if (isEmpty) {
            ro0Var.f25085e.setVisibility(8);
        } else {
            ro0Var.f25085e.setVisibility(0);
            ro0Var.f25085e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        xo0 xo0Var = this.f26127b0;
        org.telegram.ui.fy fyVar = xo0Var.U;
        if (fyVar != null) {
            j3 = fyVar.a();
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
                TLObject tLObject = p0Var.f10764f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f20189id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j11 = -((TLRPC.Chat) p0Var.f10764f).f20042id;
                }
                j10 = j11;
            } else if (i12 == 6) {
                gg.n0 n0Var = p0Var.f10765g;
                long j14 = n0Var.f10737b;
                j13 = n0Var.f10738c;
                j12 = j14;
            } else if (i12 == 7) {
                z20 = true;
            }
            i11++;
        }
        vo0 vo0Var = this.f26146v0;
        vo0Var.getClass();
        if (w40.X(str, null) == null) {
            J();
        }
        if (view == this.f26131f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            zo0 zo0Var = this.f26135j0;
            rm0 rm0Var = zo0Var.d;
            ArrayList arrayList2 = zo0Var.Q;
            ArrayList arrayList3 = zo0Var.R;
            ArrayList arrayList4 = zo0Var.S;
            ArrayList arrayList5 = zo0Var.P;
            nq nqVar = zo0Var.f28540c0;
            zo0Var.W();
            if (!TextUtils.equals(str, zo0Var.f28539b0)) {
                zo0Var.f28539b0 = str;
                AndroidUtilities.cancelRunOnUIThread(nqVar);
                if (TextUtils.isEmpty(zo0Var.f28539b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    zo0Var.N(true);
                    zo0Var.f28538a0++;
                    z19 = false;
                    zo0Var.W = false;
                    zo0Var.X = false;
                    zo0Var.Y = false;
                    zo0Var.Z = 0;
                    if (rm0Var != null) {
                        rm0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(nqVar, 1000L);
                    zo0Var.W = true;
                    zo0Var.X = true;
                    zo0Var.N(true);
                    if (rm0Var != null) {
                        z19 = false;
                        rm0Var.u0(0);
                    }
                }
                this.f26132g0.b(this.N0, z19);
            }
            z19 = false;
            this.f26132g0.b(this.N0, z19);
        } else if (view == this.f26136k0) {
            so0 so0Var = this.f26139o0;
            rm0 rm0Var2 = so0Var.d;
            ArrayList arrayList6 = so0Var.T;
            dt dtVar = so0Var.f27786f0;
            if (TextUtils.equals(str, so0Var.f27785e0)) {
                z18 = false;
            } else {
                so0Var.f27785e0 = str;
                AndroidUtilities.cancelRunOnUIThread(dtVar);
                if (TextUtils.isEmpty(so0Var.f27785e0)) {
                    arrayList6.clear();
                    so0Var.N(true);
                    so0Var.f27784d0++;
                    z18 = false;
                    so0Var.Z = false;
                    so0Var.f27781a0 = false;
                    so0Var.f27782b0 = false;
                    so0Var.f27783c0 = 0;
                    if (rm0Var2 != null) {
                        rm0Var2.u0(0);
                    }
                } else {
                    z18 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(dtVar, 1000L);
                    so0Var.Z = true;
                    so0Var.f27781a0 = true;
                    so0Var.N(true);
                    if (rm0Var2 != null) {
                        rm0Var2.u0(0);
                    }
                }
            }
            this.f26137l0.b(this.N0, z18);
            if (TextUtils.isEmpty(str)) {
                so0Var.V();
            }
        } else {
            ei0 ei0Var = this.f26140p0;
            if (view == ei0Var) {
                l71 l71Var = ei0Var.f26056c;
                ArrayList arrayList7 = ei0Var.f26059n;
                if (!TextUtils.equals(ei0Var.f26062w, str)) {
                    if (ei0Var.K >= 0) {
                        ConnectionsManager.getInstance(ei0Var.f26055b).cancelRequest(ei0Var.K, true);
                        ei0Var.K = -1;
                    }
                    ei0Var.v = false;
                    ei0Var.H.setLoading(false);
                    ei0Var.f26062w = str;
                    if (TextUtils.isEmpty(str)) {
                        ei0Var.f26060r = 0;
                        z17 = true;
                        ei0Var.L++;
                        ei0Var.f26061s = false;
                        arrayList7.clear();
                        ei0Var.a(false);
                    } else {
                        z17 = true;
                        ei0Var.b(str);
                        ei0Var.f26060r = 0;
                        ei0Var.L++;
                        ei0Var.f26061s = false;
                        arrayList7.clear();
                    }
                    ei0Var.d();
                    l71Var.u0(0);
                    l71Var.W2.N(z17);
                }
            } else if (view == this.f26142r0) {
                if (w40.X(str, null) != null) {
                    if (z10) {
                        this.f26144t0.h1(0, 0);
                    }
                    vo0Var.Y(str);
                    this.f26143s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.w10 w10Var2 = this.M0;
                if ((i13 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) || j3 != 0) {
                    this.I0 = false;
                    xo0Var.U(z20 ? 1 : 0, str);
                    xo0Var.A0 = this.L0;
                    w10Var2.animate().setListener(null).cancel();
                    w10Var2.i(null, false);
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
                    } else if (!xo0Var.N()) {
                        if (xo0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        ro0Var.e(z14, true);
                    }
                    if (z10) {
                        w10Var2.setVisibility(8);
                    } else if (w10Var2.getVisibility() != 8) {
                        w10Var2.animate().alpha(0.0f).setListener(new wd0(this, 11)).setDuration(150L).start();
                    }
                    w10Var2.setTag(null);
                    w10Var = w10Var2;
                    z13 = false;
                } else {
                    boolean z21 = true;
                    w10Var2.setTag(1);
                    w10Var2.i(this.L0, false);
                    w10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        w10Var2.setVisibility(0);
                        w10Var2.setAlpha(1.0f);
                        z12 = z10;
                    } else {
                        if (w10Var2.getVisibility() != 0) {
                            w10Var2.setVisibility(0);
                            w10Var2.setAlpha(0.0f);
                        } else {
                            z21 = z10;
                        }
                        w10Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z12 = z21;
                    }
                    z13 = false;
                    long j15 = j10;
                    w10Var = w10Var2;
                    this.M0.h(j15, this.T0, j12, j13, null, z20, str, z12);
                    ro0Var.setVisibility(8);
                }
                ro0Var.b(this.N0, z13);
                w10Var.f43090c.b(this.N0, z13);
            } else {
                long j16 = j3;
                long j17 = j12;
                long j18 = j13;
                if (view instanceof org.telegram.ui.w10) {
                    org.telegram.ui.w10 w10Var3 = (org.telegram.ui.w10) view;
                    if (j16 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w10Var3.setUseFromUserAsAvatar(z11);
                    w10Var3.f43090c.b(this.N0, false);
                    w10Var3.h(j10, this.T0, j17, j18, gg.r0.f10779a3[((cp0) this.T.f25779a.get(i10)).f25358b], z20, str, z10);
                } else if (view instanceof co0) {
                    co0 co0Var = (co0) view;
                    co0Var.f25341a.b(this.N0, false);
                    co0Var.K = str;
                    co0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        qm0 qm0Var;
        qm0 qm0Var2;
        qm0 qm0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.fy fyVar;
        int i12;
        if (this.f26149y0 != z10) {
            org.telegram.ui.ty tyVar = this.J0;
            if (!z10 || !tyVar.getActionBar().t()) {
                int i13 = 72;
                if (z10 && !tyVar.getActionBar().a("search_view_pager")) {
                    this.F0 = tyVar.getActionBar().j("search_view_pager");
                    if (tyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f26147w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f26147w0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                        this.f26147w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21187y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f26147w0.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21205z8, false), 1, -1));
                        this.f26147w0.setOnClickListener(new c90(this, 13));
                        this.F0.addView(this.f26147w0, w7.x5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
                    this.f26148x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f26148x0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f26148x0;
                    int i14 = org.telegram.ui.ActionBar.i6.f21187y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.z zVar = this.F0;
                    NumberTextView numberTextView3 = this.f26148x0;
                    if (tyVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    zVar.addView(numberTextView3, w7.x5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f26148x0.setOnTouchListener(new bi.d(21));
                    org.telegram.ui.ActionBar.v0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f26148x0 != null) {
                    xo0 xo0Var = this.f26127b0;
                    if (xo0Var != null && (fyVar = xo0Var.U) != null && fyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26148x0.getLayoutParams();
                    if (tyVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f26148x0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (tyVar.getActionBar().getBackButton() != null && (tyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
                    org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
                    tyVar.getActionBar().setBackButtonDrawable(g2Var);
                    g2Var.setColorFilter(null);
                }
                this.f26149y0 = z10;
                HashMap hashMap = this.f26150z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(tyVar.getParentActivity().getCurrentFocus());
                    tyVar.getActionBar().O(null, null);
                    this.f26148x0.a(hashMap.size(), false);
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
                tyVar.getActionBar().s();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.w10) && (qm0Var3 = ((org.telegram.ui.w10) getChildAt(i15)).d) != null) {
                        qm0Var3.l();
                    }
                    if (getChildAt(i15) instanceof co0) {
                        ((co0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.w10 w10Var = this.M0;
                if (w10Var != null && (qm0Var2 = w10Var.d) != null) {
                    qm0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.w10) && (qm0Var = ((org.telegram.ui.w10) view).d) != null) {
                        qm0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        e91 e91Var = this.M;
        if (e91Var != null) {
            e91Var.f29426x.l();
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
    public final boolean c(org.telegram.ui.o10 o10Var) {
        return this.f26150z0.containsKey(o10Var);
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
        zo0 zo0Var = this.f26135j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f26132g0.e(z10, true);
            zo0Var.W();
            zo0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f26139o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                vo0 vo0Var = this.f26146v0;
                if (obj == vo0Var.Q) {
                    vo0Var.N(true);
                }
            }
        } else {
            zo0Var.W();
            zo0Var.N(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.o10 o10Var = new org.telegram.ui.o10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f26150z0;
        if (hashMap.containsKey(o10Var)) {
            hashMap.remove(o10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(o10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.f26148x0.a(hashMap.size(), true);
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
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.B0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21187y8, false), PorterDuff.Mode.SRC_IN));
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
                        if (!((MessageObject) hashMap.get((org.telegram.ui.o10) it.next())).isDownloadingFile) {
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
        if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).b(hashMap.containsKey(o10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(o10Var));
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(o10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).e(hashMap.containsKey(o10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(o10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(hashMap.containsKey(o10Var), true);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.U;
                rm0 rm0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        rm0Var = this.V;
                    } else if (view == this.f26131f0) {
                        rm0Var = this.f26134i0;
                    } else if (view == this.f26136k0) {
                        rm0Var = this.f26138n0;
                    } else if (view == this.f26142r0) {
                        rm0Var = this.f26145u0;
                    } else {
                        co0 co0Var = this.G0;
                        if (view == co0Var) {
                            rm0Var = co0Var.f25342b;
                        } else {
                            ei0 ei0Var = this.f26140p0;
                            if (view == ei0Var) {
                                rm0Var = ei0Var.f26056c;
                            } else if (view instanceof org.telegram.ui.w10) {
                                rm0Var = ((org.telegram.ui.w10) view).f43088b;
                            }
                        }
                    }
                }
                if (rm0Var != null) {
                    gh.d.a(rm0Var, canvas, rectF, rm0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.w10 w10Var = this.M0;
                    if (w10Var.getVisibility() == 0) {
                        ai.w0 w0Var = w10Var.f43088b;
                        gh.d.a(w0Var, canvas, rectF, w0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f26149y0;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.F0;
    }

    public ArrayList<gg.p0> getCurrentSearchFilters() {
        return this.A0;
    }

    public co0 getDownloadsContainer() {
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

    public o91 getTabsView() {
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
        this.f26130e0 = true;
        zo0 zo0Var = this.f26135j0;
        if (zo0Var != null) {
            zo0Var.N(false);
        }
        so0 so0Var = this.f26139o0;
        if (so0Var != null) {
            so0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26130e0 = false;
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

    public void setFilteredSearchViewDelegate(org.telegram.ui.n10 n10Var) {
        this.L0 = n10Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.w10) {
                ((org.telegram.ui.w10) getChildAt(i11)).f43090c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f43090c.b(i10, z10);
            } else if (getChildAt(i11) instanceof co0) {
                ((co0) getChildAt(i11)).f25341a.b(i10, z10);
            } else if (getChildAt(i11) == this.f26131f0) {
                this.f26132g0.b(i10, z10);
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
        e91 e91Var = this.M;
        if (e91Var != null) {
            e91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        xo0 xo0Var = this.f26127b0;
        org.telegram.ui.w10 w10Var = this.M0;
        if (i10 == 0) {
            if (w10Var.getVisibility() == 0) {
                w10Var.i(this.L0, false);
                xo0Var.A0 = null;
            } else {
                w10Var.i(null, false);
                org.telegram.ui.n10 n10Var = this.L0;
                xo0Var.A0 = n10Var;
                if (n10Var != null) {
                    ((org.telegram.ui.vv) n10Var).i(false, null, xo0Var.f10647y0, xo0Var.f10648z0);
                }
            }
        } else if (view instanceof org.telegram.ui.w10) {
            if (i11 == 0 && w10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.w10) view).i(this.L0, z10);
        }
        if (view2 instanceof org.telegram.ui.w10) {
            ((org.telegram.ui.w10) view2).i(null, false);
            return;
        }
        xo0Var.A0 = null;
        w10Var.i(null, false);
    }
}
