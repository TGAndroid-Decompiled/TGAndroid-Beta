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
public abstract class zn0 extends j81 implements org.telegram.ui.y10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final int Z0 = 0;
    public final HashMap A0;
    public final ArrayList B0;
    public org.telegram.ui.ActionBar.w0 C0;
    public org.telegram.ui.ActionBar.w0 D0;
    public org.telegram.ui.ActionBar.w0 E0;
    public org.telegram.ui.ActionBar.w0 F0;
    public org.telegram.ui.ActionBar.a0 G0;
    public wm0 H0;
    public final int I0;
    public boolean J0;
    public final org.telegram.ui.wy K0;
    public String L0;
    public org.telegram.ui.q10 M0;
    public final org.telegram.ui.z10 N0;
    public int O0;
    public boolean P0;
    public final org.telegram.ui.cy Q0;
    public final qv0 R0;
    public final int S0;
    public int T0;
    public final yn0 U;
    public final long U0;
    public final FrameLayout V;
    public int V0;
    public final ai.w0 W;
    public int W0;
    public NotificationCenter.ObserversGroup X0;
    public ah.c Y0;
    public final mn0 f30549a0;
    public final s4.j f30550b0;
    public final sn0 f30551c0;
    public final s4.c0 f30552d0;
    public final rk0 f30553e0;
    public boolean f30554f0;
    public final FrameLayout f30555g0;
    public final mn0 f30556h0;
    public final s4.c0 f30557i0;
    public final ml0 f30558j0;
    public final un0 f30559k0;
    public final FrameLayout f30560l0;
    public final mn0 m0;
    public final s4.c0 f30561n0;
    public final ml0 f30562o0;
    public final nn0 f30563p0;
    public final zg0 f30564q0;
    public boolean f30565r0;
    public final FrameLayout f30566s0;
    public final mn0 f30567t0;
    public final s4.c0 f30568u0;
    public final ml0 f30569v0;
    public final qn0 f30570w0;
    public ImageView f30571x0;
    public NumberTextView f30572y0;
    public boolean f30573z0;

    public zn0(Context context, org.telegram.ui.wy wyVar, int i10, int i11, int i12, long j3, org.telegram.ui.cy cyVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f30565r0 = false;
        this.A0 = new HashMap();
        this.B0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.I0 = i17;
        this.T0 = 0;
        this.S0 = i12;
        this.U0 = j3;
        this.K0 = wyVar;
        this.Q0 = cyVar;
        s4.j jVar = new s4.j();
        this.f30550b0 = jVar;
        jVar.f42783c = 150L;
        jVar.e = 350L;
        jVar.f42784f = 0L;
        jVar.f42785g = 0L;
        jVar.d = 0L;
        jVar.f42786i = new OvershootInterpolator(1.1f);
        jVar.f42759o = qr.h;
        org.telegram.ui.gy gyVar = (org.telegram.ui.gy) this;
        this.f30551c0 = new sn0(gyVar, context, wyVar, i10, i11, jVar, wyVar.F, wyVar, context);
        if (i11 == 15) {
            ArrayList R3 = wyVar.R3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < R3.size(); i18 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) R3.get(i18)).f18125id, arrayList, i18, 1)) {
            }
            this.f30551c0.f9780q0 = arrayList;
        }
        this.R0 = (qv0) wyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(gyVar, context, 21);
        this.W = w0Var;
        w0Var.setItemAnimator(this.f30550b0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.f30551c0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        w0Var.setVerticalScrollbarPosition(i13);
        s4.c0 c0Var = new s4.c0(1, false);
        this.f30552d0 = c0Var;
        w0Var.setLayoutManager(c0Var);
        w0Var.Y1 = true;
        w0Var.Z1 = 0;
        w0Var.setOnScrollListener(new on0(gyVar, wyVar, 2));
        w0Var.D0(new bc0(gyVar, 23));
        org.telegram.ui.z10 z10Var = new org.telegram.ui.z10(this.K0);
        this.N0 = z10Var;
        ai.w0 w0Var2 = z10Var.f40076b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new rn0(gyVar, 1));
        w0Var2.D0(new bc0(gyVar, 23));
        z10Var.setUiCallback(this);
        z10Var.setVisibility(8);
        z10Var.setChatPreviewDelegate(cyVar);
        t00 t00Var = new t00(context, null);
        t00Var.setViewType(1);
        mn0 mn0Var = new mn0(gyVar, context, t00Var, 2);
        this.f30549a0 = mn0Var;
        mn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        mn0Var.e.setVisibility(8);
        mn0Var.setVisibility(8);
        mn0Var.addView(t00Var, 0);
        mn0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.addView(mn0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(z10Var);
        w0Var.setEmptyView(mn0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f30555g0 = frameLayout2;
        tn0 tn0Var = new tn0(gyVar);
        tn0Var.f42737m = false;
        tn0Var.C = false;
        qr qrVar = qr.h;
        tn0Var.o(qrVar);
        tn0Var.n(350L);
        ml0 ml0Var = new ml0(context, null);
        this.f30558j0 = ml0Var;
        ml0Var.setItemAnimator(tn0Var);
        ml0Var.setPivotY(0.0f);
        ml0Var.setVerticalScrollBarEnabled(true);
        ml0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        ml0Var.setVerticalScrollbarPosition(i14);
        s4.c0 c0Var2 = new s4.c0(1, false);
        this.f30557i0 = c0Var2;
        ml0Var.setLayoutManager(c0Var2);
        ml0Var.Y1 = true;
        ml0Var.Z1 = 0;
        ml0Var.setClipToPadding(false);
        t00 t00Var2 = new t00(context, null);
        t00Var2.setViewType(1);
        mn0 mn0Var2 = new mn0(gyVar, context, t00Var2, 3);
        this.f30556h0 = mn0Var2;
        mn0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        mn0Var2.e.setVisibility(8);
        mn0Var2.setVisibility(8);
        mn0Var2.addView(t00Var2, 0);
        mn0Var2.e(true, false);
        frameLayout2.addView(mn0Var2);
        frameLayout2.addView(ml0Var);
        ml0Var.setEmptyView(mn0Var2);
        un0 un0Var = new un0(gyVar, ml0Var, context, this.I0, i12, wyVar);
        this.f30559k0 = un0Var;
        ml0Var.setAdapter(un0Var);
        ml0Var.setOnScrollListener(new on0(gyVar, wyVar, 3));
        ml0Var.D0(new bc0(gyVar, 23));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f30560l0 = frameLayout3;
        ln0 ln0Var = new ln0(gyVar);
        ln0Var.f42737m = false;
        ln0Var.C = false;
        ln0Var.o(qrVar);
        ln0Var.n(350L);
        ml0 ml0Var2 = new ml0(context, null);
        this.f30562o0 = ml0Var2;
        ml0Var2.setItemAnimator(ln0Var);
        ml0Var2.setPivotY(0.0f);
        ml0Var2.setClipToPadding(false);
        ml0Var2.setVerticalScrollBarEnabled(true);
        ml0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        ml0Var2.setVerticalScrollbarPosition(i15);
        s4.c0 c0Var3 = new s4.c0(1, false);
        this.f30561n0 = c0Var3;
        ml0Var2.setLayoutManager(c0Var3);
        ml0Var2.Y1 = true;
        ml0Var2.Z1 = 0;
        t00 t00Var3 = new t00(context, null);
        t00Var3.setViewType(1);
        mn0 mn0Var3 = new mn0(gyVar, context, t00Var3, 0);
        this.m0 = mn0Var3;
        mn0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        mn0Var3.e.setVisibility(8);
        mn0Var3.setVisibility(8);
        mn0Var3.addView(t00Var3, 0);
        mn0Var3.e(true, false);
        frameLayout3.addView(mn0Var3);
        frameLayout3.addView(ml0Var2);
        ml0Var2.setEmptyView(mn0Var3);
        nn0 nn0Var = new nn0(gyVar, ml0Var2, context, this.I0, i12);
        this.f30563p0 = nn0Var;
        ml0Var2.setAdapter(nn0Var);
        ml0Var2.setOnScrollListener(new on0(gyVar, wyVar, 0));
        ml0Var2.D0(new bc0(gyVar, 23));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f30566s0 = frameLayout4;
        pn0 pn0Var = new pn0(gyVar);
        pn0Var.f42737m = false;
        pn0Var.C = false;
        pn0Var.o(qrVar);
        pn0Var.n(350L);
        ml0 ml0Var3 = new ml0(context, null);
        this.f30569v0 = ml0Var3;
        ml0Var3.setItemAnimator(pn0Var);
        ml0Var3.setPivotY(0.0f);
        ml0Var3.setVerticalScrollBarEnabled(true);
        ml0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        ml0Var3.setVerticalScrollbarPosition(i16);
        s4.c0 c0Var4 = new s4.c0(1, false);
        this.f30568u0 = c0Var4;
        ml0Var3.setLayoutManager(c0Var4);
        ml0Var3.Y1 = true;
        ml0Var3.Z1 = 0;
        ml0Var3.setClipToPadding(false);
        t00 t00Var4 = new t00(context, null);
        t00Var4.setViewType(1);
        mn0 mn0Var4 = new mn0(gyVar, context, t00Var4, 1);
        this.f30567t0 = mn0Var4;
        mn0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        mn0Var4.e.setVisibility(8);
        mn0Var4.setVisibility(8);
        mn0Var4.addView(t00Var4, 0);
        mn0Var4.e(true, false);
        frameLayout4.addView(mn0Var4);
        frameLayout4.addView(ml0Var3);
        ml0Var3.setEmptyView(mn0Var4);
        qn0 qn0Var = new qn0(gyVar, ml0Var3, context, this.I0);
        this.f30570w0 = qn0Var;
        ml0Var3.setAdapter(qn0Var);
        ml0Var3.setOnScrollListener(new on0(gyVar, wyVar, 1));
        ml0Var3.D0(new bc0(gyVar, 23));
        this.f30553e0 = new rk0(w0Var, true);
        zg0 zg0Var = new zg0(context, wyVar);
        this.f30564q0 = zg0Var;
        f61 f61Var = zg0Var.f30520c;
        f61Var.setClipToPadding(false);
        f61Var.j(new rn0(gyVar, 0));
        f61Var.D0(new bc0(gyVar, 23));
        yn0 yn0Var = new yn0(gyVar);
        this.U = yn0Var;
        setAdapter(yn0Var);
    }

    public static org.telegram.ui.bo L(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.bo(bundle);
    }

    public static void Q(FrameLayout frameLayout, ml0 ml0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            ml0Var.p1(0, i10, 0, i11);
        } else {
            ml0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ml0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void K() {
        if (this.f30565r0) {
            int i10 = 0;
            this.f30565r0 = false;
            S();
            z71 z71Var = this.M;
            if (z71Var != null && z71Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            sn0 sn0Var = this.f30551c0;
            if (sn0Var != null) {
                String str = this.L0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.B0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((gg.q0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                sn0Var.U(i10, str);
            }
        }
    }

    public final int M(int i10) {
        int i11 = 0;
        while (true) {
            yn0 yn0Var = this.U;
            ArrayList arrayList = yn0Var.f30294a;
            ArrayList arrayList2 = yn0Var.f30294a;
            if (i11 < arrayList.size()) {
                if (((xn0) arrayList2.get(i11)).f29953a == 3 && ((xn0) arrayList2.get(i11)).f29954b == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void N(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ai.w0 w0Var = this.W;
            if (i10 >= w0Var.getChildCount()) {
                break;
            }
            View childAt = w0Var.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.h6) || (childAt instanceof org.telegram.ui.Cells.r2) || (childAt instanceof org.telegram.ui.Cells.k4)) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18863d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.z10) {
                arrayList.addAll(((org.telegram.ui.z10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.z10) {
                arrayList.addAll(((org.telegram.ui.z10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.z10 z10Var = this.N0;
        if (z10Var != null) {
            arrayList.addAll(z10Var.getThemeDescriptions());
        }
        mn0 mn0Var = this.f30549a0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(mn0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(mn0Var.e, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19245y6));
        arrayList.addAll(w7.a6.a(new w6(this, 7), org.telegram.ui.ActionBar.j6.f19247y8));
    }

    public final boolean O() {
        int i10 = this.I0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.A0.values()) {
                if (messageObject.getDocument() != null && messageObject.getDocument().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i10, String str, boolean z10) {
        long j3;
        long j10;
        boolean z11;
        org.telegram.ui.z10 z10Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        mn0 mn0Var = this.f30549a0;
        if (isEmpty) {
            mn0Var.e.setVisibility(8);
        } else {
            mn0Var.e.setVisibility(0);
            mn0Var.e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        sn0 sn0Var = this.f30551c0;
        org.telegram.ui.iy iyVar = sn0Var.U;
        if (iyVar != null) {
            j3 = iyVar.a();
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
            ArrayList arrayList = this.B0;
            if (i11 >= arrayList.size()) {
                break;
            }
            gg.q0 q0Var = (gg.q0) arrayList.get(i11);
            int i12 = q0Var.d;
            if (i12 == 4) {
                TLObject tLObject = q0Var.f9900f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f18268id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j11 = -((TLRPC.Chat) q0Var.f9900f).f18121id;
                }
                j10 = j11;
            } else if (i12 == 6) {
                gg.o0 o0Var = q0Var.f9901g;
                long j14 = o0Var.f9875b;
                j13 = o0Var.f9876c;
                j12 = j14;
            } else if (i12 == 7) {
                z19 = true;
            }
            i11++;
        }
        qn0 qn0Var = this.f30570w0;
        qn0Var.getClass();
        if (e40.X(str, null) == null) {
            K();
        }
        if (view == this.f30555g0) {
            MessagesController.getInstance(this.I0).getChannelRecommendations(0L);
            un0 un0Var = this.f30559k0;
            ml0 ml0Var = un0Var.d;
            ArrayList arrayList2 = un0Var.Q;
            ArrayList arrayList3 = un0Var.R;
            ArrayList arrayList4 = un0Var.S;
            ArrayList arrayList5 = un0Var.P;
            xp xpVar = un0Var.f28201c0;
            un0Var.W();
            if (!TextUtils.equals(str, un0Var.f28200b0)) {
                un0Var.f28200b0 = str;
                AndroidUtilities.cancelRunOnUIThread(xpVar);
                if (TextUtils.isEmpty(un0Var.f28200b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    un0Var.N(true);
                    un0Var.f28199a0++;
                    z18 = false;
                    un0Var.W = false;
                    un0Var.X = false;
                    un0Var.Y = false;
                    un0Var.Z = 0;
                    if (ml0Var != null) {
                        ml0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(xpVar, 1000L);
                    un0Var.W = true;
                    un0Var.X = true;
                    un0Var.N(true);
                    if (ml0Var != null) {
                        z18 = false;
                        ml0Var.v0(0);
                    }
                }
                this.f30556h0.b(this.O0, z18);
            }
            z18 = false;
            this.f30556h0.b(this.O0, z18);
        } else if (view == this.f30560l0) {
            nn0 nn0Var = this.f30563p0;
            ml0 ml0Var2 = nn0Var.d;
            ArrayList arrayList6 = nn0Var.T;
            ms msVar = nn0Var.f27686f0;
            if (TextUtils.equals(str, nn0Var.f27685e0)) {
                z17 = false;
            } else {
                nn0Var.f27685e0 = str;
                AndroidUtilities.cancelRunOnUIThread(msVar);
                if (TextUtils.isEmpty(nn0Var.f27685e0)) {
                    arrayList6.clear();
                    nn0Var.N(true);
                    nn0Var.f27684d0++;
                    z17 = false;
                    nn0Var.Z = false;
                    nn0Var.f27681a0 = false;
                    nn0Var.f27682b0 = false;
                    nn0Var.f27683c0 = 0;
                    if (ml0Var2 != null) {
                        ml0Var2.v0(0);
                    }
                } else {
                    z17 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(msVar, 1000L);
                    nn0Var.Z = true;
                    nn0Var.f27681a0 = true;
                    nn0Var.N(true);
                    if (ml0Var2 != null) {
                        ml0Var2.v0(0);
                    }
                }
            }
            this.m0.b(this.O0, z17);
            if (TextUtils.isEmpty(str)) {
                nn0Var.V();
            }
        } else {
            zg0 zg0Var = this.f30564q0;
            if (view == zg0Var) {
                f61 f61Var = zg0Var.f30520c;
                ArrayList arrayList7 = zg0Var.f30522n;
                if (!TextUtils.equals(zg0Var.f30525w, str)) {
                    if (zg0Var.K >= 0) {
                        ConnectionsManager.getInstance(zg0Var.f30519b).cancelRequest(zg0Var.K, true);
                        zg0Var.K = -1;
                    }
                    zg0Var.v = false;
                    zg0Var.H.setLoading(false);
                    zg0Var.f30525w = str;
                    if (TextUtils.isEmpty(str)) {
                        zg0Var.f30523r = 0;
                        z16 = true;
                        zg0Var.L++;
                        zg0Var.f30524s = false;
                        arrayList7.clear();
                        zg0Var.a(false);
                    } else {
                        z16 = true;
                        zg0Var.b(str);
                        zg0Var.f30523r = 0;
                        zg0Var.L++;
                        zg0Var.f30524s = false;
                        arrayList7.clear();
                    }
                    zg0Var.d();
                    f61Var.v0(0);
                    f61Var.Y2.N(z16);
                }
            } else if (view == this.f30566s0) {
                if (e40.X(str, null) != null) {
                    if (z10) {
                        this.f30568u0.h1(0, 0);
                    }
                    qn0Var.Y(str);
                    this.f30567t0.b(this.O0, false);
                }
            } else if (view == this.V) {
                org.telegram.ui.z10 z10Var2 = this.N0;
                if ((j10 == 0 && this.U0 == 0 && j12 == 0 && j13 == 0) || j3 != 0) {
                    this.J0 = false;
                    sn0Var.U(z19 ? 1 : 0, str);
                    sn0Var.A0 = this.M0;
                    z10Var2.animate().setListener(null).cancel();
                    z10Var2.i(null, false);
                    if (z10) {
                        if (sn0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        mn0Var.e(!z14, false);
                        if (sn0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        mn0Var.e(z15, false);
                    } else if (!sn0Var.N()) {
                        if (sn0Var.D0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        mn0Var.e(z13, true);
                    }
                    if (z10) {
                        z10Var2.setVisibility(8);
                    } else if (z10Var2.getVisibility() != 8) {
                        z10Var2.animate().alpha(0.0f).setListener(new jd0(this, 10)).setDuration(150L).start();
                    }
                    z10Var2.setTag(null);
                    z10Var = z10Var2;
                    z12 = false;
                } else {
                    boolean z20 = true;
                    z10Var2.setTag(1);
                    z10Var2.i(this.M0, false);
                    z10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        z10Var2.setVisibility(0);
                        z10Var2.setAlpha(1.0f);
                        z20 = z10;
                    } else {
                        if (z10Var2.getVisibility() != 0) {
                            z10Var2.setVisibility(0);
                            z10Var2.setAlpha(0.0f);
                        } else {
                            z20 = z10;
                        }
                        z10Var2.animate().alpha(1.0f).setDuration(150L).start();
                    }
                    z10Var = z10Var2;
                    z12 = false;
                    this.N0.h(j10, this.U0, j12, j13, null, z19, str, z20);
                    mn0Var.setVisibility(8);
                }
                mn0Var.b(this.O0, z12);
                z10Var.f40078c.b(this.O0, z12);
            } else {
                long j15 = j3;
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.z10) {
                    org.telegram.ui.z10 z10Var3 = (org.telegram.ui.z10) view;
                    if (j15 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10Var3.setUseFromUserAsAvatar(z11);
                    z10Var3.f40078c.b(this.O0, false);
                    z10Var3.h(j10, this.U0, j16, j17, gg.s0.f9915c3[((xn0) this.U.f30294a.get(i10)).f29954b], z19, str, z10);
                } else if (view instanceof wm0) {
                    wm0 wm0Var = (wm0) view;
                    wm0Var.f29697a.b(this.O0, false);
                    wm0Var.K = str;
                    wm0Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z10) {
        ll0 ll0Var;
        ll0 ll0Var2;
        ll0 ll0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.iy iyVar;
        int i12;
        if (this.f30573z0 != z10) {
            org.telegram.ui.wy wyVar = this.K0;
            if (!z10 || !wyVar.getActionBar().s()) {
                int i13 = 72;
                if (z10 && !wyVar.getActionBar().a("search_view_pager")) {
                    this.G0 = wyVar.getActionBar().j("search_view_pager");
                    if (wyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f30571x0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f30571x0.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                        this.f30571x0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19247y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f30571x0.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19266z8, false), 1, -1));
                        this.f30571x0.setOnClickListener(new x70(this, 14));
                        this.G0.addView(this.f30571x0, w7.x5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.G0.getContext());
                    this.f30572y0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f30572y0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f30572y0;
                    int i14 = org.telegram.ui.ActionBar.j6.f19247y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                    org.telegram.ui.ActionBar.a0 a0Var = this.G0;
                    NumberTextView numberTextView3 = this.f30572y0;
                    if (wyVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    a0Var.addView(numberTextView3, w7.x5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f30572y0.setOnTouchListener(new bi.d(21));
                    org.telegram.ui.ActionBar.w0 h = this.G0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.C0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.D0 = this.G0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.E0 = this.G0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.F0 = this.G0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f30572y0 != null) {
                    sn0 sn0Var = this.f30551c0;
                    if (sn0Var != null && (iyVar = sn0Var.U) != null && iyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30572y0.getLayoutParams();
                    if (wyVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f30572y0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (wyVar.getActionBar().getBackButton() != null && (wyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.f5)) {
                    org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
                    wyVar.getActionBar().setBackButtonDrawable(h2Var);
                    h2Var.setColorFilter(null);
                }
                this.f30573z0 = z10;
                HashMap hashMap = this.A0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(wyVar.getParentActivity().getCurrentFocus());
                    wyVar.getActionBar().O(null, null);
                    this.f30572y0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.w0 w0Var = this.C0;
                    if (O()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    w0Var.setVisibility(i10);
                    this.D0.setVisibility(0);
                    this.E0.setVisibility(0);
                    this.F0.setVisibility(0);
                    return;
                }
                wyVar.getActionBar().r();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.z10) && (ll0Var3 = ((org.telegram.ui.z10) getChildAt(i15)).d) != null) {
                        ll0Var3.l();
                    }
                    if (getChildAt(i15) instanceof wm0) {
                        ((wm0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.z10 z10Var = this.N0;
                if (z10Var != null && (ll0Var2 = z10Var.d) != null) {
                    ll0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.z10) && (ll0Var = ((org.telegram.ui.z10) view).d) != null) {
                        ll0Var.l();
                    }
                }
            }
        }
    }

    public final void S() {
        this.U.i();
        o(false);
        z71 z71Var = this.M;
        if (z71Var != null) {
            z71Var.f24898x.l();
        }
    }

    @Override
    public final void a() {
        R(true);
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f417a = true;
    }

    @Override
    public final boolean c(org.telegram.ui.r10 r10Var) {
        return this.A0.containsKey(r10Var);
    }

    @Override
    public final void d(MessageObject messageObject) {
        this.K0.presentFragment(L(messageObject, this.I0));
        R(false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.channelRecommendationsLoaded;
        boolean z10 = false;
        un0 un0Var = this.f30559k0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.I0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f30556h0.e(z10, true);
            un0Var.W();
            un0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f30563p0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                qn0 qn0Var = this.f30570w0;
                if (obj == qn0Var.Q) {
                    qn0Var.N(true);
                }
            }
        } else {
            un0Var.W();
            un0Var.N(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.r10 r10Var = new org.telegram.ui.r10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.A0;
        if (hashMap.containsKey(r10Var)) {
            hashMap.remove(r10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(r10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.f30572y0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.w0 w0Var = this.D0;
            if (w0Var != null) {
                if (hashMap.size() == 1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                w0Var.setVisibility(i12);
            }
            if (this.C0 != null) {
                boolean O = O();
                if (O) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (this.C0.getVisibility() != i11) {
                    this.C0.setVisibility(i11);
                    int i14 = Build.VERSION.SDK_INT;
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.C0.getIconView().getDrawable();
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19247y8, false), PorterDuff.Mode.SRC_IN));
                    if (O) {
                        animatedVectorDrawable.start();
                    } else if (i14 >= 23) {
                        animatedVectorDrawable.reset();
                    } else {
                        animatedVectorDrawable.setVisible(false, true);
                    }
                }
            }
            if (this.F0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((MessageObject) hashMap.get((org.telegram.ui.r10) it.next())).isDownloadingFile) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = this.F0;
                if (!z10) {
                    i13 = 8;
                }
                w0Var2.setVisibility(i13);
            }
        }
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).b(hashMap.containsKey(r10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(r10Var));
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(r10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).e(hashMap.containsKey(r10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view).c(hashMap.containsKey(r10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.r2) {
            ((org.telegram.ui.Cells.r2) view).V(hashMap.containsKey(r10Var), true);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.V;
                ml0 ml0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        ml0Var = this.W;
                    } else if (view == this.f30555g0) {
                        ml0Var = this.f30558j0;
                    } else if (view == this.f30560l0) {
                        ml0Var = this.f30562o0;
                    } else if (view == this.f30566s0) {
                        ml0Var = this.f30569v0;
                    } else {
                        wm0 wm0Var = this.H0;
                        if (view == wm0Var) {
                            ml0Var = wm0Var.f29698b;
                        } else {
                            zg0 zg0Var = this.f30564q0;
                            if (view == zg0Var) {
                                ml0Var = zg0Var.f30520c;
                            } else if (view instanceof org.telegram.ui.z10) {
                                ml0Var = ((org.telegram.ui.z10) view).f40076b;
                            }
                        }
                    }
                }
                if (ml0Var != null) {
                    gh.d.a(ml0Var, canvas, rectF, ml0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.z10 z10Var = this.N0;
                    if (z10Var.getVisibility() == 0) {
                        ai.w0 w0Var = z10Var.f40076b;
                        gh.d.a(w0Var, canvas, rectF, w0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f30573z0;
    }

    public org.telegram.ui.ActionBar.a0 getActionMode() {
        return this.G0;
    }

    public ArrayList<gg.q0> getCurrentSearchFilters() {
        return this.B0;
    }

    public wm0 getDownloadsContainer() {
        return this.H0;
    }

    public int getFolderId() {
        return this.S0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.w0 getSpeedItem() {
        return this.C0;
    }

    public i81 getTabsView() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.ObserversGroup observersGroup = this.X0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.X0 = null;
        }
        this.X0 = NotificationCenter.getInstance(this.I0).createObserversGroup(this).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.dialogDeleted).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.reloadWebappsHints).add(NotificationCenter.storiesListUpdated);
        this.f30554f0 = true;
        un0 un0Var = this.f30559k0;
        if (un0Var != null) {
            un0Var.N(false);
        }
        nn0 nn0Var = this.f30563p0;
        if (nn0Var != null) {
            nn0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30554f0 = false;
        NotificationCenter.ObserversGroup observersGroup = this.X0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.X0 = null;
        }
    }

    @Override
    public final void s() {
        this.R0.M();
    }

    public void setBlurredBackgroundDrawableFactory(ah.c cVar) {
        this.Y0 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.q10 q10Var) {
        this.M0 = q10Var;
    }

    public void setKeyboardHeight(int i10) {
        boolean z10;
        this.O0 = i10;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.z10) {
                ((org.telegram.ui.z10) getChildAt(i11)).f40078c.b(i10, z10);
            } else if (getChildAt(i11) == this.V) {
                this.f30549a0.b(i10, z10);
                this.N0.f40078c.b(i10, z10);
            } else if (getChildAt(i11) instanceof wm0) {
                ((wm0) getChildAt(i11)).f29697a.b(i10, z10);
            } else if (getChildAt(i11) == this.f30555g0) {
                this.f30556h0.b(i10, z10);
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
        z71 z71Var = this.M;
        if (z71Var != null) {
            z71Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        sn0 sn0Var = this.f30551c0;
        org.telegram.ui.z10 z10Var = this.N0;
        if (i10 == 0) {
            if (z10Var.getVisibility() == 0) {
                z10Var.i(this.M0, false);
                sn0Var.A0 = null;
            } else {
                z10Var.i(null, false);
                org.telegram.ui.q10 q10Var = this.M0;
                sn0Var.A0 = q10Var;
                if (q10Var != null) {
                    ((org.telegram.ui.yv) q10Var).i(false, null, sn0Var.f9793y0, sn0Var.f9794z0);
                }
            }
        } else if (view instanceof org.telegram.ui.z10) {
            if (i11 == 0 && z10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.z10) view).i(this.M0, z10);
        }
        if (view2 instanceof org.telegram.ui.z10) {
            ((org.telegram.ui.z10) view2).i(null, false);
            return;
        }
        sn0Var.A0 = null;
        z10Var.i(null, false);
    }
}
