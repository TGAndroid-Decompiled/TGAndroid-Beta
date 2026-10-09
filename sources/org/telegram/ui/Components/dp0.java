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
public abstract class dp0 extends o91 implements org.telegram.ui.v10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.v0 B0;
    public org.telegram.ui.ActionBar.v0 C0;
    public org.telegram.ui.ActionBar.v0 D0;
    public org.telegram.ui.ActionBar.v0 E0;
    public org.telegram.ui.ActionBar.z F0;
    public bo0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.ty J0;
    public String K0;
    public org.telegram.ui.n10 L0;
    public final org.telegram.ui.w10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.yx P0;
    public final sw0 Q0;
    public final int R0;
    public int S0;
    public final cp0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.w0 V;
    public int V0;
    public final qo0 W;
    public NotificationCenter.ObserversGroup W0;
    public ah.c X0;
    public final s4.j f25765a0;
    public final wo0 f25766b0;
    public final s4.d0 f25767c0;
    public final vl0 f25768d0;
    public boolean f25769e0;
    public final FrameLayout f25770f0;
    public final qo0 f25771g0;
    public final s4.d0 f25772h0;
    public final qm0 f25773i0;
    public final yo0 f25774j0;
    public final FrameLayout f25775k0;
    public final qo0 f25776l0;
    public final s4.d0 m0;
    public final qm0 f25777n0;
    public final ro0 f25778o0;
    public final di0 f25779p0;
    public boolean f25780q0;
    public final FrameLayout f25781r0;
    public final qo0 f25782s0;
    public final s4.d0 f25783t0;
    public final qm0 f25784u0;
    public final uo0 f25785v0;
    public ImageView f25786w0;
    public NumberTextView f25787x0;
    public boolean f25788y0;
    public final HashMap f25789z0;

    public dp0(Context context, org.telegram.ui.ty tyVar, int i10, int i11, int i12, long j3, org.telegram.ui.yx yxVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f25780q0 = false;
        this.f25789z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = tyVar;
        this.P0 = yxVar;
        s4.j jVar = new s4.j();
        this.f25765a0 = jVar;
        jVar.f47748c = 150L;
        jVar.f47749e = 350L;
        jVar.f47750f = 0L;
        jVar.f47751g = 0L;
        jVar.d = 0L;
        jVar.f47752i = new OvershootInterpolator(1.1f);
        jVar.f47716o = hs.h;
        org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this;
        this.f25766b0 = new wo0(dyVar, context, tyVar, i10, i11, jVar, tyVar.F, tyVar, context);
        if (i11 == 15) {
            ArrayList O3 = tyVar.O3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < O3.size(); i18 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) O3.get(i18)).f20042id, arrayList, i18, 1)) {
            }
            this.f25766b0.f10634q0 = arrayList;
        }
        this.Q0 = (sw0) tyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(dyVar, context, 21);
        this.V = w0Var;
        w0Var.setItemAnimator(this.f25765a0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.f25766b0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        w0Var.setVerticalScrollbarPosition(i13);
        s4.d0 d0Var = new s4.d0(1, false);
        this.f25767c0 = d0Var;
        w0Var.setLayoutManager(d0Var);
        w0Var.W1 = true;
        w0Var.X1 = 0;
        w0Var.setOnScrollListener(new so0(dyVar, tyVar, 2));
        w0Var.C0(new bd0(dyVar, 23));
        org.telegram.ui.w10 w10Var = new org.telegram.ui.w10(this.J0);
        this.M0 = w10Var;
        ai.w0 w0Var2 = w10Var.f43042b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new vo0(dyVar, 1));
        w0Var2.C0(new bd0(dyVar, 23));
        w10Var.setUiCallback(this);
        w10Var.setVisibility(8);
        w10Var.setChatPreviewDelegate(yxVar);
        j10 j10Var = new j10(context, null);
        j10Var.setViewType(1);
        qo0 qo0Var = new qo0(dyVar, context, j10Var, 2);
        this.W = qo0Var;
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.f24802e.setVisibility(8);
        qo0Var.setVisibility(8);
        qo0Var.addView(j10Var, 0);
        qo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(qo0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(w10Var);
        w0Var.setEmptyView(qo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f25770f0 = frameLayout2;
        xo0 xo0Var = new xo0(dyVar);
        xo0Var.f47696m = false;
        xo0Var.C = false;
        hs hsVar = hs.h;
        xo0Var.o(hsVar);
        xo0Var.n(350L);
        qm0 qm0Var = new qm0(context, null);
        this.f25773i0 = qm0Var;
        qm0Var.setItemAnimator(xo0Var);
        qm0Var.setPivotY(0.0f);
        qm0Var.setVerticalScrollBarEnabled(true);
        qm0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        qm0Var.setVerticalScrollbarPosition(i14);
        s4.d0 d0Var2 = new s4.d0(1, false);
        this.f25772h0 = d0Var2;
        qm0Var.setLayoutManager(d0Var2);
        qm0Var.W1 = true;
        qm0Var.X1 = 0;
        qm0Var.setClipToPadding(false);
        j10 j10Var2 = new j10(context, null);
        j10Var2.setViewType(1);
        qo0 qo0Var2 = new qo0(dyVar, context, j10Var2, 3);
        this.f25771g0 = qo0Var2;
        qo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var2.f24802e.setVisibility(8);
        qo0Var2.setVisibility(8);
        qo0Var2.addView(j10Var2, 0);
        qo0Var2.e(true, false);
        frameLayout2.addView(qo0Var2);
        frameLayout2.addView(qm0Var);
        qm0Var.setEmptyView(qo0Var2);
        yo0 yo0Var = new yo0(dyVar, qm0Var, context, this.H0, i12, tyVar);
        this.f25774j0 = yo0Var;
        qm0Var.setAdapter(yo0Var);
        qm0Var.setOnScrollListener(new so0(dyVar, tyVar, 3));
        qm0Var.C0(new bd0(dyVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f25775k0 = frameLayout3;
        po0 po0Var = new po0(dyVar);
        po0Var.f47696m = false;
        po0Var.C = false;
        po0Var.o(hsVar);
        po0Var.n(350L);
        qm0 qm0Var2 = new qm0(context, null);
        this.f25777n0 = qm0Var2;
        qm0Var2.setItemAnimator(po0Var);
        qm0Var2.setPivotY(0.0f);
        qm0Var2.setClipToPadding(false);
        qm0Var2.setVerticalScrollBarEnabled(true);
        qm0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        qm0Var2.setVerticalScrollbarPosition(i15);
        s4.d0 d0Var3 = new s4.d0(1, false);
        this.m0 = d0Var3;
        qm0Var2.setLayoutManager(d0Var3);
        qm0Var2.W1 = true;
        qm0Var2.X1 = 0;
        j10 j10Var3 = new j10(context, null);
        j10Var3.setViewType(1);
        qo0 qo0Var3 = new qo0(dyVar, context, j10Var3, 0);
        this.f25776l0 = qo0Var3;
        qo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var3.f24802e.setVisibility(8);
        qo0Var3.setVisibility(8);
        qo0Var3.addView(j10Var3, 0);
        qo0Var3.e(true, false);
        frameLayout3.addView(qo0Var3);
        frameLayout3.addView(qm0Var2);
        qm0Var2.setEmptyView(qo0Var3);
        ro0 ro0Var = new ro0(dyVar, qm0Var2, context, this.H0, i12);
        this.f25778o0 = ro0Var;
        qm0Var2.setAdapter(ro0Var);
        qm0Var2.setOnScrollListener(new so0(dyVar, tyVar, 0));
        qm0Var2.C0(new bd0(dyVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f25781r0 = frameLayout4;
        to0 to0Var = new to0(dyVar);
        to0Var.f47696m = false;
        to0Var.C = false;
        to0Var.o(hsVar);
        to0Var.n(350L);
        qm0 qm0Var3 = new qm0(context, null);
        this.f25784u0 = qm0Var3;
        qm0Var3.setItemAnimator(to0Var);
        qm0Var3.setPivotY(0.0f);
        qm0Var3.setVerticalScrollBarEnabled(true);
        qm0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        qm0Var3.setVerticalScrollbarPosition(i16);
        s4.d0 d0Var4 = new s4.d0(1, false);
        this.f25783t0 = d0Var4;
        qm0Var3.setLayoutManager(d0Var4);
        qm0Var3.W1 = true;
        qm0Var3.X1 = 0;
        qm0Var3.setClipToPadding(false);
        j10 j10Var4 = new j10(context, null);
        j10Var4.setViewType(1);
        qo0 qo0Var4 = new qo0(dyVar, context, j10Var4, 1);
        this.f25782s0 = qo0Var4;
        qo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var4.f24802e.setVisibility(8);
        qo0Var4.setVisibility(8);
        qo0Var4.addView(j10Var4, 0);
        qo0Var4.e(true, false);
        frameLayout4.addView(qo0Var4);
        frameLayout4.addView(qm0Var3);
        qm0Var3.setEmptyView(qo0Var4);
        uo0 uo0Var = new uo0(dyVar, qm0Var3, context, this.H0);
        this.f25785v0 = uo0Var;
        qm0Var3.setAdapter(uo0Var);
        qm0Var3.setOnScrollListener(new so0(dyVar, tyVar, 1));
        qm0Var3.C0(new bd0(dyVar, 23));
        this.f25768d0 = new vl0(w0Var, true);
        di0 di0Var = new di0(context, tyVar);
        this.f25779p0 = di0Var;
        k71 k71Var = di0Var.f25714c;
        k71Var.setClipToPadding(false);
        k71Var.j(new vo0(dyVar, 0));
        k71Var.C0(new bd0(dyVar, 23));
        cp0 cp0Var = new cp0(dyVar);
        this.T = cp0Var;
        setAdapter(cp0Var);
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

    public static void P(FrameLayout frameLayout, qm0 qm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            qm0Var.o1(0, i10, 0, i11);
        } else {
            qm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f25780q0) {
            int i10 = 0;
            this.f25780q0 = false;
            R();
            d91 d91Var = this.M;
            if (d91Var != null && d91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            wo0 wo0Var = this.f25766b0;
            if (wo0Var != null) {
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
                wo0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            cp0 cp0Var = this.T;
            ArrayList arrayList = cp0Var.f25458a;
            ArrayList arrayList2 = cp0Var.f25458a;
            if (i11 < arrayList.size()) {
                if (((bp0) arrayList2.get(i11)).f25080a == 3 && ((bp0) arrayList2.get(i11)).f25081b == i10) {
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
                arrayList.add(new org.telegram.ui.ActionBar.k6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
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
        qo0 qo0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(qo0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(qo0Var.f24802e, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f21181y6));
        arrayList.addAll(w7.a6.a(new a7(this, 7), org.telegram.ui.ActionBar.i6.f21183y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f25789z0.values()) {
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
        qo0 qo0Var = this.W;
        if (isEmpty) {
            qo0Var.f24802e.setVisibility(8);
        } else {
            qo0Var.f24802e.setVisibility(0);
            qo0Var.f24802e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        wo0 wo0Var = this.f25766b0;
        org.telegram.ui.fy fyVar = wo0Var.U;
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
                    j11 = ((TLRPC.User) tLObject).f20185id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j11 = -((TLRPC.Chat) p0Var.f10764f).f20038id;
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
        uo0 uo0Var = this.f25785v0;
        uo0Var.getClass();
        if (v40.X(str, null) == null) {
            J();
        }
        if (view == this.f25770f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            yo0 yo0Var = this.f25774j0;
            qm0 qm0Var = yo0Var.d;
            ArrayList arrayList2 = yo0Var.Q;
            ArrayList arrayList3 = yo0Var.R;
            ArrayList arrayList4 = yo0Var.S;
            ArrayList arrayList5 = yo0Var.P;
            nq nqVar = yo0Var.f28164c0;
            yo0Var.W();
            if (!TextUtils.equals(str, yo0Var.f28163b0)) {
                yo0Var.f28163b0 = str;
                AndroidUtilities.cancelRunOnUIThread(nqVar);
                if (TextUtils.isEmpty(yo0Var.f28163b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    yo0Var.N(true);
                    yo0Var.f28162a0++;
                    z19 = false;
                    yo0Var.W = false;
                    yo0Var.X = false;
                    yo0Var.Y = false;
                    yo0Var.Z = 0;
                    if (qm0Var != null) {
                        qm0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(nqVar, 1000L);
                    yo0Var.W = true;
                    yo0Var.X = true;
                    yo0Var.N(true);
                    if (qm0Var != null) {
                        z19 = false;
                        qm0Var.u0(0);
                    }
                }
                this.f25771g0.b(this.N0, z19);
            }
            z19 = false;
            this.f25771g0.b(this.N0, z19);
        } else if (view == this.f25775k0) {
            ro0 ro0Var = this.f25778o0;
            qm0 qm0Var2 = ro0Var.d;
            ArrayList arrayList6 = ro0Var.T;
            ct ctVar = ro0Var.f27136f0;
            if (TextUtils.equals(str, ro0Var.f27135e0)) {
                z18 = false;
            } else {
                ro0Var.f27135e0 = str;
                AndroidUtilities.cancelRunOnUIThread(ctVar);
                if (TextUtils.isEmpty(ro0Var.f27135e0)) {
                    arrayList6.clear();
                    ro0Var.N(true);
                    ro0Var.f27134d0++;
                    z18 = false;
                    ro0Var.Z = false;
                    ro0Var.f27131a0 = false;
                    ro0Var.f27132b0 = false;
                    ro0Var.f27133c0 = 0;
                    if (qm0Var2 != null) {
                        qm0Var2.u0(0);
                    }
                } else {
                    z18 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(ctVar, 1000L);
                    ro0Var.Z = true;
                    ro0Var.f27131a0 = true;
                    ro0Var.N(true);
                    if (qm0Var2 != null) {
                        qm0Var2.u0(0);
                    }
                }
            }
            this.f25776l0.b(this.N0, z18);
            if (TextUtils.isEmpty(str)) {
                ro0Var.V();
            }
        } else {
            di0 di0Var = this.f25779p0;
            if (view == di0Var) {
                k71 k71Var = di0Var.f25714c;
                ArrayList arrayList7 = di0Var.f25717n;
                if (!TextUtils.equals(di0Var.f25720w, str)) {
                    if (di0Var.K >= 0) {
                        ConnectionsManager.getInstance(di0Var.f25713b).cancelRequest(di0Var.K, true);
                        di0Var.K = -1;
                    }
                    di0Var.v = false;
                    di0Var.H.setLoading(false);
                    di0Var.f25720w = str;
                    if (TextUtils.isEmpty(str)) {
                        di0Var.f25718r = 0;
                        z17 = true;
                        di0Var.L++;
                        di0Var.f25719s = false;
                        arrayList7.clear();
                        di0Var.a(false);
                    } else {
                        z17 = true;
                        di0Var.b(str);
                        di0Var.f25718r = 0;
                        di0Var.L++;
                        di0Var.f25719s = false;
                        arrayList7.clear();
                    }
                    di0Var.d();
                    k71Var.u0(0);
                    k71Var.W2.N(z17);
                }
            } else if (view == this.f25781r0) {
                if (v40.X(str, null) != null) {
                    if (z10) {
                        this.f25783t0.h1(0, 0);
                    }
                    uo0Var.Y(str);
                    this.f25782s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.w10 w10Var2 = this.M0;
                if ((i13 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) || j3 != 0) {
                    this.I0 = false;
                    wo0Var.U(z20 ? 1 : 0, str);
                    wo0Var.A0 = this.L0;
                    w10Var2.animate().setListener(null).cancel();
                    w10Var2.i(null, false);
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
                    } else if (!wo0Var.N()) {
                        if (wo0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        qo0Var.e(z14, true);
                    }
                    if (z10) {
                        w10Var2.setVisibility(8);
                    } else if (w10Var2.getVisibility() != 8) {
                        w10Var2.animate().alpha(0.0f).setListener(new vd0(this, 11)).setDuration(150L).start();
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
                    qo0Var.setVisibility(8);
                }
                qo0Var.b(this.N0, z13);
                w10Var.f43044c.b(this.N0, z13);
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
                    w10Var3.f43044c.b(this.N0, false);
                    w10Var3.h(j10, this.T0, j17, j18, gg.r0.f10779a3[((bp0) this.T.f25458a.get(i10)).f25081b], z20, str, z10);
                } else if (view instanceof bo0) {
                    bo0 bo0Var = (bo0) view;
                    bo0Var.f25066a.b(this.N0, false);
                    bo0Var.K = str;
                    bo0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        pm0 pm0Var;
        pm0 pm0Var2;
        pm0 pm0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.fy fyVar;
        int i12;
        if (this.f25788y0 != z10) {
            org.telegram.ui.ty tyVar = this.J0;
            if (!z10 || !tyVar.getActionBar().t()) {
                int i13 = 72;
                if (z10 && !tyVar.getActionBar().a("search_view_pager")) {
                    this.F0 = tyVar.getActionBar().j("search_view_pager");
                    if (tyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f25786w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f25786w0.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                        this.f25786w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21183y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f25786w0.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21201z8, false), 1, -1));
                        this.f25786w0.setOnClickListener(new b90(this, 13));
                        this.F0.addView(this.f25786w0, w7.x5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
                    this.f25787x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f25787x0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f25787x0;
                    int i14 = org.telegram.ui.ActionBar.i6.f21183y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.z zVar = this.F0;
                    NumberTextView numberTextView3 = this.f25787x0;
                    if (tyVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    zVar.addView(numberTextView3, w7.x5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f25787x0.setOnTouchListener(new bi.d(21));
                    org.telegram.ui.ActionBar.v0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f25787x0 != null) {
                    wo0 wo0Var = this.f25766b0;
                    if (wo0Var != null && (fyVar = wo0Var.U) != null && fyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f25787x0.getLayoutParams();
                    if (tyVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f25787x0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (tyVar.getActionBar().getBackButton() != null && (tyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.e5)) {
                    org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
                    tyVar.getActionBar().setBackButtonDrawable(g2Var);
                    g2Var.setColorFilter(null);
                }
                this.f25788y0 = z10;
                HashMap hashMap = this.f25789z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(tyVar.getParentActivity().getCurrentFocus());
                    tyVar.getActionBar().O(null, null);
                    this.f25787x0.a(hashMap.size(), false);
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
                    if ((getChildAt(i15) instanceof org.telegram.ui.w10) && (pm0Var3 = ((org.telegram.ui.w10) getChildAt(i15)).d) != null) {
                        pm0Var3.l();
                    }
                    if (getChildAt(i15) instanceof bo0) {
                        ((bo0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.w10 w10Var = this.M0;
                if (w10Var != null && (pm0Var2 = w10Var.d) != null) {
                    pm0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.w10) && (pm0Var = ((org.telegram.ui.w10) view).d) != null) {
                        pm0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        d91 d91Var = this.M;
        if (d91Var != null) {
            d91Var.f29121x.l();
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
        return this.f25789z0.containsKey(o10Var);
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
        yo0 yo0Var = this.f25774j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f25771g0.e(z10, true);
            yo0Var.W();
            yo0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f25778o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                uo0 uo0Var = this.f25785v0;
                if (obj == uo0Var.Q) {
                    uo0Var.N(true);
                }
            }
        } else {
            yo0Var.W();
            yo0Var.N(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.o10 o10Var = new org.telegram.ui.o10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f25789z0;
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
            this.f25787x0.a(hashMap.size(), true);
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
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21183y8, false), PorterDuff.Mode.SRC_IN));
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
                qm0 qm0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        qm0Var = this.V;
                    } else if (view == this.f25770f0) {
                        qm0Var = this.f25773i0;
                    } else if (view == this.f25775k0) {
                        qm0Var = this.f25777n0;
                    } else if (view == this.f25781r0) {
                        qm0Var = this.f25784u0;
                    } else {
                        bo0 bo0Var = this.G0;
                        if (view == bo0Var) {
                            qm0Var = bo0Var.f25067b;
                        } else {
                            di0 di0Var = this.f25779p0;
                            if (view == di0Var) {
                                qm0Var = di0Var.f25714c;
                            } else if (view instanceof org.telegram.ui.w10) {
                                qm0Var = ((org.telegram.ui.w10) view).f43042b;
                            }
                        }
                    }
                }
                if (qm0Var != null) {
                    gh.d.a(qm0Var, canvas, rectF, qm0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.w10 w10Var = this.M0;
                    if (w10Var.getVisibility() == 0) {
                        ai.w0 w0Var = w10Var.f43042b;
                        gh.d.a(w0Var, canvas, rectF, w0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f25788y0;
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.F0;
    }

    public ArrayList<gg.p0> getCurrentSearchFilters() {
        return this.A0;
    }

    public bo0 getDownloadsContainer() {
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

    public n91 getTabsView() {
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
        this.f25769e0 = true;
        yo0 yo0Var = this.f25774j0;
        if (yo0Var != null) {
            yo0Var.N(false);
        }
        ro0 ro0Var = this.f25778o0;
        if (ro0Var != null) {
            ro0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25769e0 = false;
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
                ((org.telegram.ui.w10) getChildAt(i11)).f43044c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f43044c.b(i10, z10);
            } else if (getChildAt(i11) instanceof bo0) {
                ((bo0) getChildAt(i11)).f25066a.b(i10, z10);
            } else if (getChildAt(i11) == this.f25770f0) {
                this.f25771g0.b(i10, z10);
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
        d91 d91Var = this.M;
        if (d91Var != null) {
            d91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        wo0 wo0Var = this.f25766b0;
        org.telegram.ui.w10 w10Var = this.M0;
        if (i10 == 0) {
            if (w10Var.getVisibility() == 0) {
                w10Var.i(this.L0, false);
                wo0Var.A0 = null;
            } else {
                w10Var.i(null, false);
                org.telegram.ui.n10 n10Var = this.L0;
                wo0Var.A0 = n10Var;
                if (n10Var != null) {
                    ((org.telegram.ui.vv) n10Var).i(false, null, wo0Var.f10647y0, wo0Var.f10648z0);
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
        wo0Var.A0 = null;
        w10Var.i(null, false);
    }
}
