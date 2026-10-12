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
public abstract class jp0 extends u91 implements org.telegram.ui.x10, NotificationCenter.NotificationCenterDelegate, bh.a {
    public static final int Y0 = 0;
    public final ArrayList A0;
    public org.telegram.ui.ActionBar.u0 B0;
    public org.telegram.ui.ActionBar.u0 C0;
    public org.telegram.ui.ActionBar.u0 D0;
    public org.telegram.ui.ActionBar.u0 E0;
    public org.telegram.ui.ActionBar.y F0;
    public ho0 G0;
    public final int H0;
    public boolean I0;
    public final org.telegram.ui.vy J0;
    public String K0;
    public org.telegram.ui.p10 L0;
    public final org.telegram.ui.y10 M0;
    public int N0;
    public boolean O0;
    public final org.telegram.ui.ay P0;
    public final yw0 Q0;
    public final int R0;
    public int S0;
    public final ip0 T;
    public final long T0;
    public final FrameLayout U;
    public int U0;
    public final ai.w0 V;
    public int V0;
    public final wo0 W;
    public NotificationCenter.ObserversGroup W0;
    public ah.c X0;
    public final s4.j f27597a0;
    public final cp0 f27598b0;
    public final s4.d0 f27599c0;
    public final bm0 f27600d0;
    public boolean f27601e0;
    public final FrameLayout f27602f0;
    public final wo0 f27603g0;
    public final s4.d0 f27604h0;
    public final wm0 f27605i0;
    public final ep0 f27606j0;
    public final FrameLayout f27607k0;
    public final wo0 f27608l0;
    public final s4.d0 m0;
    public final wm0 f27609n0;
    public final xo0 f27610o0;
    public final fi0 f27611p0;
    public boolean f27612q0;
    public final FrameLayout f27613r0;
    public final wo0 f27614s0;
    public final s4.d0 f27615t0;
    public final wm0 f27616u0;
    public final ap0 f27617v0;
    public ImageView f27618w0;
    public NumberTextView f27619x0;
    public boolean f27620y0;
    public final HashMap f27621z0;

    public jp0(Context context, org.telegram.ui.vy vyVar, int i10, int i11, int i12, long j3, org.telegram.ui.ay ayVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f27612q0 = false;
        this.f27621z0 = new HashMap();
        this.A0 = new ArrayList();
        int i17 = UserConfig.selectedAccount;
        this.H0 = i17;
        this.S0 = 0;
        this.R0 = i12;
        this.T0 = j3;
        this.J0 = vyVar;
        this.P0 = ayVar;
        s4.j jVar = new s4.j();
        this.f27597a0 = jVar;
        jVar.f47989c = 150L;
        jVar.f47990e = 350L;
        jVar.f47991f = 0L;
        jVar.f47992g = 0L;
        jVar.d = 0L;
        jVar.f47993i = new OvershootInterpolator(1.1f);
        jVar.f47957o = js.h;
        org.telegram.ui.fy fyVar = (org.telegram.ui.fy) this;
        this.f27598b0 = new cp0(fyVar, context, vyVar, i10, i11, jVar, vyVar.F, vyVar, context);
        if (i11 == 15) {
            ArrayList O3 = vyVar.O3(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < O3.size(); i18 = com.google.android.gms.internal.vision.e2.g(((TLRPC.Dialog) O3.get(i18)).f19807id, arrayList, i18, 1)) {
            }
            this.f27598b0.f10632q0 = arrayList;
        }
        this.Q0 = (yw0) vyVar.getFragmentView();
        ai.w0 w0Var = new ai.w0(fyVar, context, 21);
        this.V = w0Var;
        w0Var.setItemAnimator(this.f27597a0);
        w0Var.setPivotY(0.0f);
        w0Var.setClipToPadding(false);
        w0Var.setAdapter(this.f27598b0);
        w0Var.setVerticalScrollBarEnabled(true);
        w0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        w0Var.setVerticalScrollbarPosition(i13);
        s4.d0 d0Var = new s4.d0(1, false);
        this.f27599c0 = d0Var;
        w0Var.setLayoutManager(d0Var);
        w0Var.W1 = true;
        w0Var.X1 = 0;
        w0Var.setOnScrollListener(new yo0(fyVar, vyVar, 2));
        w0Var.C0(new cd0(fyVar, 24));
        org.telegram.ui.y10 y10Var = new org.telegram.ui.y10(this.J0);
        this.M0 = y10Var;
        ai.w0 w0Var2 = y10Var.f44248b;
        w0Var2.setClipToPadding(false);
        w0Var2.j(new bp0(fyVar, 1));
        w0Var2.C0(new cd0(fyVar, 24));
        y10Var.setUiCallback(this);
        y10Var.setVisibility(8);
        y10Var.setChatPreviewDelegate(ayVar);
        m10 m10Var = new m10(context, null);
        m10Var.setViewType(1);
        wo0 wo0Var = new wo0(fyVar, context, m10Var, 2);
        this.W = wo0Var;
        wo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wo0Var.f26561e.setVisibility(8);
        wo0Var.setVisibility(8);
        wo0Var.addView(m10Var, 0);
        wo0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        frameLayout.addView(wo0Var);
        frameLayout.addView(w0Var);
        frameLayout.addView(y10Var);
        w0Var.setEmptyView(wo0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f27602f0 = frameLayout2;
        dp0 dp0Var = new dp0(fyVar);
        dp0Var.f47937m = false;
        dp0Var.C = false;
        js jsVar = js.h;
        dp0Var.o(jsVar);
        dp0Var.n(350L);
        wm0 wm0Var = new wm0(context, null);
        this.f27605i0 = wm0Var;
        wm0Var.setItemAnimator(dp0Var);
        wm0Var.setPivotY(0.0f);
        wm0Var.setVerticalScrollBarEnabled(true);
        wm0Var.setInstantClick(true);
        if (LocaleController.isRTL) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        wm0Var.setVerticalScrollbarPosition(i14);
        s4.d0 d0Var2 = new s4.d0(1, false);
        this.f27604h0 = d0Var2;
        wm0Var.setLayoutManager(d0Var2);
        wm0Var.W1 = true;
        wm0Var.X1 = 0;
        wm0Var.setClipToPadding(false);
        m10 m10Var2 = new m10(context, null);
        m10Var2.setViewType(1);
        wo0 wo0Var2 = new wo0(fyVar, context, m10Var2, 3);
        this.f27603g0 = wo0Var2;
        wo0Var2.d.setText(LocaleController.getString(R.string.NoResult));
        wo0Var2.f26561e.setVisibility(8);
        wo0Var2.setVisibility(8);
        wo0Var2.addView(m10Var2, 0);
        wo0Var2.e(true, false);
        frameLayout2.addView(wo0Var2);
        frameLayout2.addView(wm0Var);
        wm0Var.setEmptyView(wo0Var2);
        ep0 ep0Var = new ep0(fyVar, wm0Var, context, this.H0, i12, vyVar);
        this.f27606j0 = ep0Var;
        wm0Var.setAdapter(ep0Var);
        wm0Var.setOnScrollListener(new yo0(fyVar, vyVar, 3));
        wm0Var.C0(new cd0(fyVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f27607k0 = frameLayout3;
        vo0 vo0Var = new vo0(fyVar);
        vo0Var.f47937m = false;
        vo0Var.C = false;
        vo0Var.o(jsVar);
        vo0Var.n(350L);
        wm0 wm0Var2 = new wm0(context, null);
        this.f27609n0 = wm0Var2;
        wm0Var2.setItemAnimator(vo0Var);
        wm0Var2.setPivotY(0.0f);
        wm0Var2.setClipToPadding(false);
        wm0Var2.setVerticalScrollBarEnabled(true);
        wm0Var2.setInstantClick(true);
        if (LocaleController.isRTL) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        wm0Var2.setVerticalScrollbarPosition(i15);
        s4.d0 d0Var3 = new s4.d0(1, false);
        this.m0 = d0Var3;
        wm0Var2.setLayoutManager(d0Var3);
        wm0Var2.W1 = true;
        wm0Var2.X1 = 0;
        m10 m10Var3 = new m10(context, null);
        m10Var3.setViewType(1);
        wo0 wo0Var3 = new wo0(fyVar, context, m10Var3, 0);
        this.f27608l0 = wo0Var3;
        wo0Var3.d.setText(LocaleController.getString(R.string.NoResult));
        wo0Var3.f26561e.setVisibility(8);
        wo0Var3.setVisibility(8);
        wo0Var3.addView(m10Var3, 0);
        wo0Var3.e(true, false);
        frameLayout3.addView(wo0Var3);
        frameLayout3.addView(wm0Var2);
        wm0Var2.setEmptyView(wo0Var3);
        xo0 xo0Var = new xo0(fyVar, wm0Var2, context, this.H0, i12);
        this.f27610o0 = xo0Var;
        wm0Var2.setAdapter(xo0Var);
        wm0Var2.setOnScrollListener(new yo0(fyVar, vyVar, 0));
        wm0Var2.C0(new cd0(fyVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f27613r0 = frameLayout4;
        zo0 zo0Var = new zo0(fyVar);
        zo0Var.f47937m = false;
        zo0Var.C = false;
        zo0Var.o(jsVar);
        zo0Var.n(350L);
        wm0 wm0Var3 = new wm0(context, null);
        this.f27616u0 = wm0Var3;
        wm0Var3.setItemAnimator(zo0Var);
        wm0Var3.setPivotY(0.0f);
        wm0Var3.setVerticalScrollBarEnabled(true);
        wm0Var3.setInstantClick(true);
        if (LocaleController.isRTL) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        wm0Var3.setVerticalScrollbarPosition(i16);
        s4.d0 d0Var4 = new s4.d0(1, false);
        this.f27615t0 = d0Var4;
        wm0Var3.setLayoutManager(d0Var4);
        wm0Var3.W1 = true;
        wm0Var3.X1 = 0;
        wm0Var3.setClipToPadding(false);
        m10 m10Var4 = new m10(context, null);
        m10Var4.setViewType(1);
        wo0 wo0Var4 = new wo0(fyVar, context, m10Var4, 1);
        this.f27614s0 = wo0Var4;
        wo0Var4.d.setText(LocaleController.getString(R.string.NoResult));
        wo0Var4.f26561e.setVisibility(8);
        wo0Var4.setVisibility(8);
        wo0Var4.addView(m10Var4, 0);
        wo0Var4.e(true, false);
        frameLayout4.addView(wo0Var4);
        frameLayout4.addView(wm0Var3);
        wm0Var3.setEmptyView(wo0Var4);
        ap0 ap0Var = new ap0(fyVar, wm0Var3, context, this.H0);
        this.f27617v0 = ap0Var;
        wm0Var3.setAdapter(ap0Var);
        wm0Var3.setOnScrollListener(new yo0(fyVar, vyVar, 1));
        wm0Var3.C0(new cd0(fyVar, 24));
        this.f27600d0 = new bm0(w0Var, true);
        fi0 fi0Var = new fi0(context, vyVar);
        this.f27611p0 = fi0Var;
        p71 p71Var = fi0Var.f26080c;
        p71Var.setClipToPadding(false);
        p71Var.j(new bp0(fyVar, 0));
        p71Var.C0(new cd0(fyVar, 24));
        ip0 ip0Var = new ip0(fyVar);
        this.T = ip0Var;
        setAdapter(ip0Var);
    }

    public static org.telegram.ui.eo K(MessageObject messageObject, int i10) {
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
        return new org.telegram.ui.eo(bundle);
    }

    public static void P(FrameLayout frameLayout, wm0 wm0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            wm0Var.o1(0, i10, 0, i11);
        } else {
            wm0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wm0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void J() {
        if (this.f27612q0) {
            int i10 = 0;
            this.f27612q0 = false;
            R();
            j91 j91Var = this.M;
            if (j91Var != null && j91Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            cp0 cp0Var = this.f27598b0;
            if (cp0Var != null) {
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
                cp0Var.U(i10, str);
            }
        }
    }

    public final int L(int i10) {
        int i11 = 0;
        while (true) {
            ip0 ip0Var = this.T;
            ArrayList arrayList = ip0Var.f27252a;
            ArrayList arrayList2 = ip0Var.f27252a;
            if (i11 < arrayList.size()) {
                if (((hp0) arrayList2.get(i11)).f26863a == 3 && ((hp0) arrayList2.get(i11)).f26864b == i10) {
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
                arrayList.add(new org.telegram.ui.ActionBar.j6(childAt, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
            }
            i10++;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.y10) {
                arrayList.addAll(((org.telegram.ui.y10) getChildAt(i11)).getThemeDescriptions());
            }
        }
        SparseArray sparseArray = this.h;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) sparseArray.valueAt(i12);
            if (view instanceof org.telegram.ui.y10) {
                arrayList.addAll(((org.telegram.ui.y10) view).getThemeDescriptions());
            }
        }
        org.telegram.ui.y10 y10Var = this.M0;
        if (y10Var != null) {
            arrayList.addAll(y10Var.getThemeDescriptions());
        }
        wo0 wo0Var = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wo0Var.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wo0Var.f26561e, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20946y6));
        arrayList.addAll(w7.z5.a(new a7(this, 7), org.telegram.ui.ActionBar.h6.f20948y8));
    }

    public final boolean N() {
        int i10 = this.H0;
        if (!UserConfig.getInstance(i10).isPremium() && !MessagesController.getInstance(i10).premiumFeaturesBlocked()) {
            for (MessageObject messageObject : this.f27621z0.values()) {
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
        org.telegram.ui.y10 y10Var;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        wo0 wo0Var = this.W;
        if (isEmpty) {
            wo0Var.f26561e.setVisibility(8);
        } else {
            wo0Var.f26561e.setVisibility(0);
            wo0Var.f26561e.setText(LocaleController.formatString(R.string.NoResultFoundFor2, str));
        }
        cp0 cp0Var = this.f27598b0;
        org.telegram.ui.hy hyVar = cp0Var.U;
        if (hyVar != null) {
            j3 = hyVar.a();
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
                TLObject tLObject = p0Var.f10762f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f19950id;
                } else if ((tLObject instanceof TLRPC.Chat) && !ChatObject.isCommunity((TLRPC.Chat) tLObject)) {
                    j11 = -((TLRPC.Chat) p0Var.f10762f).f19803id;
                }
                j10 = j11;
            } else if (i12 == 6) {
                gg.n0 n0Var = p0Var.f10763g;
                long j14 = n0Var.f10735b;
                j13 = n0Var.f10736c;
                j12 = j14;
            } else if (i12 == 7) {
                z20 = true;
            }
            i11++;
        }
        ap0 ap0Var = this.f27617v0;
        ap0Var.getClass();
        if (y40.X(str, null) == null) {
            J();
        }
        if (view == this.f27602f0) {
            MessagesController.getInstance(this.H0).getChannelRecommendations(0L);
            ep0 ep0Var = this.f27606j0;
            wm0 wm0Var = ep0Var.d;
            ArrayList arrayList2 = ep0Var.Q;
            ArrayList arrayList3 = ep0Var.R;
            ArrayList arrayList4 = ep0Var.S;
            ArrayList arrayList5 = ep0Var.P;
            pq pqVar = ep0Var.f28966c0;
            ep0Var.W();
            if (!TextUtils.equals(str, ep0Var.f28965b0)) {
                ep0Var.f28965b0 = str;
                AndroidUtilities.cancelRunOnUIThread(pqVar);
                if (TextUtils.isEmpty(ep0Var.f28965b0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    ep0Var.N(true);
                    ep0Var.f28964a0++;
                    z19 = false;
                    ep0Var.W = false;
                    ep0Var.X = false;
                    ep0Var.Y = false;
                    ep0Var.Z = 0;
                    if (wm0Var != null) {
                        wm0Var.u0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    AndroidUtilities.runOnUIThread(pqVar, 1000L);
                    ep0Var.W = true;
                    ep0Var.X = true;
                    ep0Var.N(true);
                    if (wm0Var != null) {
                        z19 = false;
                        wm0Var.u0(0);
                    }
                }
                this.f27603g0.b(this.N0, z19);
            }
            z19 = false;
            this.f27603g0.b(this.N0, z19);
        } else if (view == this.f27607k0) {
            xo0 xo0Var = this.f27610o0;
            wm0 wm0Var2 = xo0Var.d;
            ArrayList arrayList6 = xo0Var.T;
            et etVar = xo0Var.f28277f0;
            if (TextUtils.equals(str, xo0Var.f28276e0)) {
                z18 = false;
            } else {
                xo0Var.f28276e0 = str;
                AndroidUtilities.cancelRunOnUIThread(etVar);
                if (TextUtils.isEmpty(xo0Var.f28276e0)) {
                    arrayList6.clear();
                    xo0Var.N(true);
                    xo0Var.f28275d0++;
                    z18 = false;
                    xo0Var.Z = false;
                    xo0Var.f28272a0 = false;
                    xo0Var.f28273b0 = false;
                    xo0Var.f28274c0 = 0;
                    if (wm0Var2 != null) {
                        wm0Var2.u0(0);
                    }
                } else {
                    z18 = false;
                    arrayList6.clear();
                    AndroidUtilities.runOnUIThread(etVar, 1000L);
                    xo0Var.Z = true;
                    xo0Var.f28272a0 = true;
                    xo0Var.N(true);
                    if (wm0Var2 != null) {
                        wm0Var2.u0(0);
                    }
                }
            }
            this.f27608l0.b(this.N0, z18);
            if (TextUtils.isEmpty(str)) {
                xo0Var.V();
            }
        } else {
            fi0 fi0Var = this.f27611p0;
            if (view == fi0Var) {
                p71 p71Var = fi0Var.f26080c;
                ArrayList arrayList7 = fi0Var.f26083n;
                if (!TextUtils.equals(fi0Var.f26086w, str)) {
                    if (fi0Var.K >= 0) {
                        ConnectionsManager.getInstance(fi0Var.f26079b).cancelRequest(fi0Var.K, true);
                        fi0Var.K = -1;
                    }
                    fi0Var.v = false;
                    fi0Var.H.setLoading(false);
                    fi0Var.f26086w = str;
                    if (TextUtils.isEmpty(str)) {
                        fi0Var.f26084r = 0;
                        z17 = true;
                        fi0Var.L++;
                        fi0Var.f26085s = false;
                        arrayList7.clear();
                        fi0Var.a(false);
                    } else {
                        z17 = true;
                        fi0Var.b(str);
                        fi0Var.f26084r = 0;
                        fi0Var.L++;
                        fi0Var.f26085s = false;
                        arrayList7.clear();
                    }
                    fi0Var.d();
                    p71Var.u0(0);
                    p71Var.W2.N(z17);
                }
            } else if (view == this.f27613r0) {
                if (y40.X(str, null) != null) {
                    if (z10) {
                        this.f27615t0.h1(0, 0);
                    }
                    ap0Var.Y(str);
                    this.f27614s0.b(this.N0, false);
                }
            } else if (view == this.U) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.y10 y10Var2 = this.M0;
                if ((i13 == 0 && this.T0 == 0 && j12 == 0 && j13 == 0) || j3 != 0) {
                    this.I0 = false;
                    cp0Var.U(z20 ? 1 : 0, str);
                    cp0Var.A0 = this.L0;
                    y10Var2.animate().setListener(null).cancel();
                    y10Var2.i(null, false);
                    if (z10) {
                        if (cp0Var.D0 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        wo0Var.e(!z15, false);
                        if (cp0Var.D0 > 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        wo0Var.e(z16, false);
                    } else if (!cp0Var.N()) {
                        if (cp0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        wo0Var.e(z14, true);
                    }
                    if (z10) {
                        y10Var2.setVisibility(8);
                    } else if (y10Var2.getVisibility() != 8) {
                        y10Var2.animate().alpha(0.0f).setListener(new zd0(this, 11)).setDuration(150L).start();
                    }
                    y10Var2.setTag(null);
                    y10Var = y10Var2;
                    z13 = false;
                } else {
                    boolean z21 = true;
                    y10Var2.setTag(1);
                    y10Var2.i(this.L0, false);
                    y10Var2.animate().setListener(null).cancel();
                    if (z10) {
                        y10Var2.setVisibility(0);
                        y10Var2.setAlpha(1.0f);
                        z12 = z10;
                    } else {
                        if (y10Var2.getVisibility() != 0) {
                            y10Var2.setVisibility(0);
                            y10Var2.setAlpha(0.0f);
                        } else {
                            z21 = z10;
                        }
                        y10Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z12 = z21;
                    }
                    z13 = false;
                    long j15 = j10;
                    y10Var = y10Var2;
                    this.M0.h(j15, this.T0, j12, j13, null, z20, str, z12);
                    wo0Var.setVisibility(8);
                }
                wo0Var.b(this.N0, z13);
                y10Var.f44250c.b(this.N0, z13);
            } else {
                long j16 = j3;
                long j17 = j12;
                long j18 = j13;
                if (view instanceof org.telegram.ui.y10) {
                    org.telegram.ui.y10 y10Var3 = (org.telegram.ui.y10) view;
                    if (j16 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y10Var3.setUseFromUserAsAvatar(z11);
                    y10Var3.f44250c.b(this.N0, false);
                    y10Var3.h(j10, this.T0, j17, j18, gg.r0.f10777a3[((hp0) this.T.f27252a.get(i10)).f26864b], z20, str, z10);
                } else if (view instanceof ho0) {
                    ho0 ho0Var = (ho0) view;
                    ho0Var.f26839a.b(this.N0, false);
                    ho0Var.K = str;
                    ho0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        vm0 vm0Var;
        vm0 vm0Var2;
        vm0 vm0Var3;
        int i10;
        boolean z11;
        int i11;
        org.telegram.ui.hy hyVar;
        int i12;
        if (this.f27620y0 != z10) {
            org.telegram.ui.vy vyVar = this.J0;
            if (!z10 || !vyVar.getActionBar().u()) {
                int i13 = 72;
                if (z10 && !vyVar.getActionBar().a("search_view_pager")) {
                    this.F0 = vyVar.getActionBar().k("search_view_pager");
                    if (vyVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f27618w0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f27618w0.setImageDrawable(new org.telegram.ui.ActionBar.f2(true));
                        this.f27618w0.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20948y8, false), PorterDuff.Mode.MULTIPLY));
                        this.f27618w0.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20966z8, false), 1, -1));
                        this.f27618w0.setOnClickListener(new f90(this, 14));
                        this.F0.addView(this.f27618w0, w7.w5.o(54, 54, 0.0f, 16));
                    }
                    NumberTextView numberTextView = new NumberTextView(this.F0.getContext());
                    this.f27619x0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f27619x0.setTypeface(AndroidUtilities.bold());
                    NumberTextView numberTextView2 = this.f27619x0;
                    int i14 = org.telegram.ui.ActionBar.h6.f20948y8;
                    numberTextView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.y yVar = this.F0;
                    NumberTextView numberTextView3 = this.f27619x0;
                    if (vyVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(numberTextView3, w7.w5.m(1.0f, 0, -1, i12, 0, 0));
                    this.f27619x0.setOnTouchListener(new bi.d(21));
                    org.telegram.ui.ActionBar.u0 h = this.F0.h(203, R.drawable.avd_speed, LocaleController.getString(R.string.AccDescrPremiumSpeed), AndroidUtilities.dp(54.0f));
                    this.B0 = h;
                    h.getIconView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i14, false), PorterDuff.Mode.SRC_IN));
                    this.C0 = this.F0.h(200, R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), AndroidUtilities.dp(54.0f));
                    this.D0 = this.F0.h(201, R.drawable.msg_forward, LocaleController.getString(R.string.Forward), AndroidUtilities.dp(54.0f));
                    this.E0 = this.F0.h(202, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
                }
                if (this.f27619x0 != null) {
                    cp0 cp0Var = this.f27598b0;
                    if (cp0Var != null && (hyVar = cp0Var.U) != null && hyVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f27619x0.getLayoutParams();
                    if (vyVar.W) {
                        i13 = 18;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = AndroidUtilities.dp(i13 + i11);
                    NumberTextView numberTextView4 = this.f27619x0;
                    numberTextView4.setLayoutParams(numberTextView4.getLayoutParams());
                }
                if (vyVar.getActionBar().getBackButton() != null && (vyVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.c5)) {
                    org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
                    vyVar.getActionBar().setBackButtonDrawable(f2Var);
                    f2Var.setColorFilter(null);
                }
                this.f27620y0 = z10;
                HashMap hashMap = this.f27621z0;
                if (z10) {
                    AndroidUtilities.hideKeyboard(vyVar.getParentActivity().getCurrentFocus());
                    vyVar.getActionBar().P(null, null);
                    this.f27619x0.a(hashMap.size(), false);
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
                vyVar.getActionBar().t();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.y10) && (vm0Var3 = ((org.telegram.ui.y10) getChildAt(i15)).d) != null) {
                        vm0Var3.l();
                    }
                    if (getChildAt(i15) instanceof ho0) {
                        ((ho0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.y10 y10Var = this.M0;
                if (y10Var != null && (vm0Var2 = y10Var.d) != null) {
                    vm0Var2.l();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.y10) && (vm0Var = ((org.telegram.ui.y10) view).d) != null) {
                        vm0Var.l();
                    }
                }
            }
        }
    }

    public final void R() {
        this.T.i();
        o(false);
        j91 j91Var = this.M;
        if (j91Var != null) {
            j91Var.f30829x.l();
        }
    }

    @Override
    public final void a() {
        Q(true);
    }

    @Override
    public final void b(ah.a aVar, RectF rectF) {
        aVar.f538a = true;
    }

    @Override
    public final boolean c(org.telegram.ui.q10 q10Var) {
        return this.f27621z0.containsKey(q10Var);
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
        ep0 ep0Var = this.f27606j0;
        if (i10 == i12) {
            if (MessagesController.getInstance(this.H0).getChannelRecommendations(0L) != null) {
                z10 = true;
            }
            this.f27603g0.e(z10, true);
            ep0Var.W();
            ep0Var.N(true);
        } else if (i10 != NotificationCenter.dialogDeleted && i10 != NotificationCenter.dialogsNeedReload) {
            if (i10 == NotificationCenter.reloadWebappsHints) {
                this.f27610o0.N(true);
            } else if (i10 == NotificationCenter.storiesListUpdated) {
                Object obj = objArr[0];
                ap0 ap0Var = this.f27617v0;
                if (obj == ap0Var.Q) {
                    ap0Var.N(true);
                }
            }
        } else {
            ep0Var.W();
            ep0Var.N(true);
        }
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.q10 q10Var = new org.telegram.ui.q10(messageObject.getId(), messageObject.getDialogId());
        HashMap hashMap = this.f27621z0;
        if (hashMap.containsKey(q10Var)) {
            hashMap.remove(q10Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(q10Var, messageObject);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            Q(false);
        } else {
            this.f27619x0.a(hashMap.size(), true);
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
                    animatedVectorDrawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20948y8, false), PorterDuff.Mode.SRC_IN));
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
                        if (!((MessageObject) hashMap.get((org.telegram.ui.q10) it.next())).isDownloadingFile) {
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
        if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).b(hashMap.containsKey(q10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.u7) {
            ((org.telegram.ui.Cells.u7) view).b(i10, hashMap.containsKey(q10Var));
        } else if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f(hashMap.containsKey(q10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).e(hashMap.containsKey(q10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view).c(hashMap.containsKey(q10Var), true);
        } else if (view instanceof org.telegram.ui.Cells.s2) {
            ((org.telegram.ui.Cells.s2) view).V(hashMap.containsKey(q10Var), true);
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.U;
                wm0 wm0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        wm0Var = this.V;
                    } else if (view == this.f27602f0) {
                        wm0Var = this.f27605i0;
                    } else if (view == this.f27607k0) {
                        wm0Var = this.f27609n0;
                    } else if (view == this.f27613r0) {
                        wm0Var = this.f27616u0;
                    } else {
                        ho0 ho0Var = this.G0;
                        if (view == ho0Var) {
                            wm0Var = ho0Var.f26840b;
                        } else {
                            fi0 fi0Var = this.f27611p0;
                            if (view == fi0Var) {
                                wm0Var = fi0Var.f26080c;
                            } else if (view instanceof org.telegram.ui.y10) {
                                wm0Var = ((org.telegram.ui.y10) view).f44248b;
                            }
                        }
                    }
                }
                if (wm0Var != null) {
                    gh.d.a(wm0Var, canvas, rectF, wm0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.y10 y10Var = this.M0;
                    if (y10Var.getVisibility() == 0) {
                        ai.w0 w0Var = y10Var.f44248b;
                        gh.d.a(w0Var, canvas, rectF, w0Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final boolean g() {
        return this.f27620y0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.F0;
    }

    public ArrayList<gg.p0> getCurrentSearchFilters() {
        return this.A0;
    }

    public ho0 getDownloadsContainer() {
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

    public t91 getTabsView() {
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
        this.f27601e0 = true;
        ep0 ep0Var = this.f27606j0;
        if (ep0Var != null) {
            ep0Var.N(false);
        }
        xo0 xo0Var = this.f27610o0;
        if (xo0Var != null) {
            xo0Var.N(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27601e0 = false;
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

    public void setFilteredSearchViewDelegate(org.telegram.ui.p10 p10Var) {
        this.L0 = p10Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.y10) {
                ((org.telegram.ui.y10) getChildAt(i11)).f44250c.b(i10, z10);
            } else if (getChildAt(i11) == this.U) {
                this.W.b(i10, z10);
                this.M0.f44250c.b(i10, z10);
            } else if (getChildAt(i11) instanceof ho0) {
                ((ho0) getChildAt(i11)).f26839a.b(i10, z10);
            } else if (getChildAt(i11) == this.f27602f0) {
                this.f27603g0.b(i10, z10);
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
        j91 j91Var = this.M;
        if (j91Var != null) {
            j91Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        cp0 cp0Var = this.f27598b0;
        org.telegram.ui.y10 y10Var = this.M0;
        if (i10 == 0) {
            if (y10Var.getVisibility() == 0) {
                y10Var.i(this.L0, false);
                cp0Var.A0 = null;
            } else {
                y10Var.i(null, false);
                org.telegram.ui.p10 p10Var = this.L0;
                cp0Var.A0 = p10Var;
                if (p10Var != null) {
                    ((org.telegram.ui.xv) p10Var).i(false, null, cp0Var.f10645y0, cp0Var.f10646z0);
                }
            }
        } else if (view instanceof org.telegram.ui.y10) {
            if (i11 == 0 && y10Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.y10) view).i(this.L0, z10);
        }
        if (view2 instanceof org.telegram.ui.y10) {
            ((org.telegram.ui.y10) view2).i(null, false);
            return;
        }
        cp0Var.A0 = null;
        y10Var.i(null, false);
    }
}
