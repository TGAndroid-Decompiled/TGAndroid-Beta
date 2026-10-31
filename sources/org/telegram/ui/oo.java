package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public class oo extends org.telegram.ui.ActionBar.k2 implements org.telegram.ui.Components.a40, org.telegram.messenger.us {
    public TLRPC.TL_chatBannedRights A0;
    public final long B0;
    public TLRPC.User C0;
    public LinearLayout D;
    public TLRPC.UserFull D0;
    public EditTextBoldCursor E;
    public boolean E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.c7 G;
    public boolean G0;
    public org.telegram.ui.Cells.p8 H;
    public boolean H0;
    public org.telegram.ui.Cells.p8 I;
    public boolean I0;
    public org.telegram.ui.Cells.p8 J;
    public boolean J0;
    public org.telegram.ui.Cells.p8 K;
    public TLRPC.ChatReactions K0;
    public zm0 L;
    public TL_stories.TL_premium_boostsStatus L0;
    public org.telegram.ui.Cells.p8 M;
    public boolean M0;
    public org.telegram.ui.Cells.p8 N;
    public boolean N0;
    public org.telegram.ui.Cells.p8 O;
    public boolean O0;
    public org.telegram.ui.Cells.b9 P;
    public final ArrayList P0;
    public org.telegram.ui.Cells.p8 Q;
    public final lo Q0;
    public LinearLayout R;
    public org.telegram.ui.Components.bi0 R0;
    public LinearLayout S;
    public ValueAnimator S0;
    public org.telegram.ui.Cells.p8 T;
    public org.telegram.ui.Cells.p8 U;
    public org.telegram.ui.Cells.p8 V;
    public org.telegram.ui.Cells.p8 W;
    public org.telegram.ui.Cells.p8 X;
    public org.telegram.ui.Cells.p8 Y;
    public org.telegram.ui.Cells.p8 Z;
    public org.telegram.ui.ActionBar.l5 f40314a;
    public org.telegram.ui.Cells.p8 f40315a0;
    public org.telegram.ui.ActionBar.x1 f40316b;
    public mo f40317b0;
    public UndoView f40318c;
    public FrameLayout f40319c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.x9 f40320d0;
    public ag.d2 e;
    public org.telegram.ui.Cells.p8 f40321e0;
    public kg.f0 f40322f;
    public org.telegram.ui.Cells.p8 f40323f0;
    public zh.b f40324g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.b9 f40325h0;
    public org.telegram.ui.Cells.p8 f40326i0;
    public org.telegram.ui.Cells.b9 f40327j0;
    public org.telegram.ui.Cells.p8 f40328k0;
    public org.telegram.ui.Cells.p8 f40329l0;
    public org.telegram.ui.Cells.p8 m0;
    public RadialProgressView f40330n;
    public org.telegram.ui.Cells.p8 f40331n0;
    public org.telegram.ui.Cells.p8 f40332o0;
    public org.telegram.ui.Cells.p8 f40333p0;
    public org.telegram.ui.Cells.p8 f40334q0;
    public final org.telegram.ui.Components.r8 f40335r;
    public org.telegram.ui.Cells.b9 f40336r0;
    public final org.telegram.ui.Components.b40 f40337s;
    public org.telegram.ui.Cells.b9 f40338s0;
    public org.telegram.ui.Cells.p8 f40339t0;
    public TLRPC.FileLocation f40340u0;
    public long f40341v0;
    public org.telegram.ui.Components.wt f40342w;
    public TLRPC.Chat f40343w0;
    public org.telegram.ui.Components.hn0 f40344x;
    public TLRPC.ChatFull f40345x0;
    public org.telegram.ui.Components.in0 f40346y;
    public TLRPC.TL_chatAdminRights f40347y0;
    public TLRPC.TL_chatBannedRights f40348z0;

    public oo(Bundle bundle) {
        super(bundle);
        int i10;
        this.P0 = new ArrayList();
        this.Q0 = new lo(this);
        this.f40335r = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f40341v0 = bundle.getLong("chat_id", 0L);
        this.B0 = bundle.getLong("user_id", 0L);
        if (this.f40341v0 != 0) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f40341v0));
            if (L0 != null && org.telegram.messenger.w3.V(L0)) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f40337s = new org.telegram.ui.Components.b40(i10, true, true);
            return;
        }
        this.f40337s = new org.telegram.ui.Components.b40(0, false, false);
    }

    public static void Y(oo ooVar, FrameLayout frameLayout, View view) {
        SpannableStringBuilder W2;
        if (!ooVar.F0) {
            TLRPC.ChatFull chatFull = ooVar.f40345x0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131752280, "ChannelTopicsDiscussionForbidden"));
            } else {
                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(ooVar.getMessagesController().f18767d5, "ChannelTopicsForbidden", new Object[0]));
            }
            org.telegram.ui.Components.cc.a0(ooVar).Q(2131624292, 36, W2).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ?? k2Var = new org.telegram.ui.ActionBar.k2(null);
        k2Var.f41086a = -ooVar.f40341v0;
        k2Var.setResourceProvider(ooVar.resourceProvider);
        boolean z10 = ooVar.E0;
        boolean z11 = ooVar.G0;
        boolean z12 = ooVar.H0;
        jo joVar = new jo(0, ooVar, view);
        k2Var.f41088c = z10;
        k2Var.d = z11;
        k2Var.e = z12;
        k2Var.h = joVar;
        ooVar.presentFragment((org.telegram.ui.ActionBar.k2) k2Var);
    }

    public static void Z(oo ooVar) {
        ooVar.f40340u0 = null;
        long j10 = ooVar.B0;
        if (j10 == 0) {
            org.telegram.messenger.vp.r1(ooVar.currentAccount).B(ooVar.f40341v0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = ooVar.getMessagesController().n1(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.f19927id = new TLRPC.TL_inputPhotoEmpty();
            ooVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new fo(ooVar, 2));
        }
        ooVar.r0(false, true);
        ag.d2 d2Var = ooVar.e;
        org.telegram.ui.Components.r8 r8Var = ooVar.f40335r;
        Object obj = ooVar.C0;
        if (obj == null) {
            obj = ooVar.f40343w0;
        }
        d2Var.j(null, null, r8Var, obj);
        ooVar.R0.M(0);
        ooVar.f40317b0.e.d();
    }

    public static void a0(oo ooVar, long j10, long j11) {
        org.telegram.messenger.vp.r1(ooVar.currentAccount).O2(j10, j11, true, false, new z4(ooVar, 4));
    }

    public static void b0(oo ooVar) {
        int i10 = ooVar.currentAccount;
        long j10 = ooVar.B0;
        TL_bots.BotVerifierSettings botVerifierSettings = ooVar.D0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        Bundle j11 = org.telegram.ui.Cells.f1.j(16, "onlySelect", "dialogsType", true);
        j11.putBoolean("resetDelegate", false);
        ay ayVar = new ay(j11);
        ayVar.setCurrentAccount(i10);
        ayVar.C2 = new di.a(ayVar, i10, j10, botVerifierSettings);
        T.presentFragment(ayVar);
    }

    public static void c0(oo ooVar, org.telegram.ui.ActionBar.x1 x1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, org.telegram.messenger.h3 h3Var) {
        x1Var.dismiss();
        if (ooVar.getParentActivity() == null) {
            return;
        }
        kg.q0 q0Var = new kg.q0(35, ooVar.currentAccount, ooVar.getParentActivity(), ooVar, ooVar.getResourceProvider());
        q0Var.A1(h3Var);
        q0Var.z1(tL_premium_boostsStatus, true);
        q0Var.B1(j10);
        TLRPC.Chat L0 = ooVar.getMessagesController().L0(Long.valueOf(-j10));
        if (L0 != null) {
            q0Var.I2 = new zg(13, ooVar, L0);
        }
        ooVar.showDialog(q0Var);
    }

    public static void d0(oo ooVar) {
        zc zcVar = new zc(-ooVar.f40343w0.f19793id);
        zcVar.f44101l0 = ooVar;
        ooVar.presentFragment(zcVar);
        org.telegram.messenger.vp.r1(ooVar.currentAccount).f7.edit().putInt("boostingappearance", org.telegram.messenger.vp.r1(ooVar.currentAccount).f7.getInt("boostingappearance", 0) + 1).apply();
    }

    public static void e0(oo ooVar) {
        ooVar.O0 = true;
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(ooVar.currentAccount);
        int i10 = org.telegram.messenger.vp.D8;
        f7.k(org.telegram.messenger.zs.f19676r, 2);
    }

    public static SpannableStringBuilder h0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        g00 g00Var = new g00(10);
        g00Var.f37374a.setTypeface(org.telegram.messenger.i0.o1("fonts/num.otf"));
        g00Var.f37377f = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zk, false);
        g00Var.f37378n = false;
        spannableStringBuilder.setSpan(g00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String k0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i10);
            i10++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override
    public final void H(float f7) {
        RadialProgressView radialProgressView = this.f40330n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f40330n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21095m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
    }

    @Override
    public final android.view.View createView(android.content.Context r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oo.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int r13, int r14, java.lang.Object... r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oo.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.f40337s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.f40337s.f24525c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final gs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f40342w.getText().toString();
    }

    @Override
    public final org.telegram.ui.Components.in0 getScrollViewForSimpleGlass() {
        return this.f40346y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        mo moVar = this.f40317b0;
        int i10 = org.telegram.ui.ActionBar.t6.f21020i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(moVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40317b0, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21242u6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40317b0, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21259v6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.W, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.V, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.Cells.p8 p8Var = this.U;
        if (p8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(p8Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.X, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Y, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.N, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40342w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40342w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21076l6));
        LinearLayout linearLayout = this.D;
        int i11 = org.telegram.ui.ActionBar.t6.f20929d6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.F, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40319c0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.R, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40320d0, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40320d0, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21153p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.O, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.Cells.p8 p8Var2 = this.K;
        if (p8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(p8Var2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        org.telegram.ui.Cells.p8 p8Var3 = this.f40315a0;
        if (p8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(p8Var3, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        return arrayList;
    }

    public final boolean i0(boolean z10) {
        org.telegram.ui.Components.wt wtVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.B0 != 0) {
            TLRPC.UserFull userFull = this.D0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.wt wtVar2 = this.f40342w;
            if ((wtVar2 != null && !this.C0.first_name.equals(wtVar2.getText().toString())) || ((editTextBoldCursor2 = this.E) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131743752, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131752983, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new go(this, 0));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747596, null), new go(this, 1));
                    showDialog(x1Var);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.f40345x0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && org.telegram.messenger.w3.T(this.f40343w0) && this.f40345x0.hidden_prehistory != this.J0) || (((wtVar = this.f40342w) != null && !this.f40343w0.title.equals(wtVar.getText().toString())) || (((editTextBoldCursor = this.E) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.E0 != this.f40343w0.forum))) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String L02 = org.telegram.messenger.cd.L0(2131743752, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                x1Var2.R = L02;
                if (this.I0) {
                    x1Var2.T = org.telegram.messenger.cd.L0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    x1Var2.T = org.telegram.messenger.cd.L0(2131749410, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131754216, "ApplyTheme"), new go(this, 2));
                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131747596, "PassportDiscard"), new go(this, 3));
                showDialog(x1Var2);
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        String str;
        if (this.f40321e0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().O2.f(-this.f40341v0);
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, arrayList);
            if (!TextUtils.isEmpty(jjVar.f16394z)) {
                str = jjVar.f16394z.toString();
            } else if (!TextUtils.isEmpty(jjVar.v)) {
                str = jjVar.v.toString();
            } else {
                str = "";
            }
        } else {
            str = null;
        }
        TLRPC.ChatFull chatFull = this.f40345x0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = org.telegram.messenger.cd.L0(2131742918, null);
        }
        this.f40321e0.u(org.telegram.messenger.cd.L0(2131742924, null), str, false, 2131231925, true);
    }

    public final void l0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-this.f40341v0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new fo(this, 0));
    }

    public final void m0() {
        boolean z10;
        if (this.f40340u0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40337s.n(z10, new ho(this, 0), new q5(this, 5), 0);
        this.R0.M(0);
        this.R0.P(43);
        this.f40317b0.e.d();
    }

    public final void n0() {
        org.telegram.ui.Components.wt wtVar;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        if (!this.N0 && (wtVar = this.f40342w) != null) {
            if (wtVar.f32239a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.i0.E3(this.f40342w);
                return;
            }
            boolean z12 = true;
            this.N0 = true;
            String str3 = "";
            if (this.C0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().p1(this.C0);
                setbotinfo.flags |= 4;
                setbotinfo.lang_code = "";
                if (!this.C0.first_name.equals(this.f40342w.getText().toString())) {
                    setbotinfo.name = this.f40342w.getText().toString();
                    setbotinfo.flags |= 8;
                }
                TLRPC.UserFull userFull = this.D0;
                if (userFull != null && (str2 = userFull.about) != null) {
                    str3 = str2;
                }
                EditTextBoldCursor editTextBoldCursor = this.E;
                if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                    setbotinfo.about = this.E.getText().toString();
                    setbotinfo.flags = 1 | setbotinfo.flags;
                }
                this.f40316b = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
                this.f40316b.setOnCancelListener(new ba(this, getConnectionsManager().sendRequest(setbotinfo, new ag.k0(20, this, setbotinfo)), 2));
                this.f40316b.show();
            } else if (!org.telegram.messenger.w3.T(this.f40343w0) && (!this.J0 || this.E0)) {
                getMessagesController().T(getParentActivity(), this.f40341v0, this, new go(this, 5), null);
            } else {
                if (this.f40345x0 != null && org.telegram.messenger.w3.T(this.f40343w0)) {
                    TLRPC.ChatFull chatFull = this.f40345x0;
                    boolean z13 = chatFull.hidden_prehistory;
                    boolean z14 = this.J0;
                    if (z13 != z14) {
                        chatFull.hidden_prehistory = z14;
                        getMessagesController().Y4(this.f40341v0, this.J0);
                    }
                }
                if (this.f40337s.g()) {
                    this.M0 = true;
                    org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
                    this.f40316b = x1Var;
                    x1Var.setOnCancelListener(new kg(this, 1));
                    this.f40316b.show();
                    return;
                }
                if (!this.f40343w0.title.equals(this.f40342w.getText().toString())) {
                    getMessagesController().C(this.f40341v0, this.f40342w.getText().toString(), null);
                }
                TLRPC.ChatFull chatFull2 = this.f40345x0;
                if (chatFull2 != null && (str = chatFull2.about) != null) {
                    str3 = str;
                }
                EditTextBoldCursor editTextBoldCursor2 = this.E;
                if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                    org.telegram.messenger.vp messagesController = getMessagesController();
                    long j10 = this.f40341v0;
                    String obj = this.E.getText().toString();
                    TLRPC.ChatFull chatFull3 = this.f40345x0;
                    messagesController.getClass();
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = messagesController.i1(-j10);
                    tL_messages_editChatAbout.about = obj;
                    messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new org.telegram.messenger.ci(messagesController, chatFull3, obj, 7), 64);
                }
                boolean z15 = this.E0;
                TLRPC.Chat chat = this.f40343w0;
                boolean z16 = chat.forum;
                if (z15 != z16 || this.G0 != chat.forum_tabs || this.H0 != chat.forum_sidebar) {
                    if (this.G0 != chat.forum_tabs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.H0 != chat.forum_sidebar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z15 == z16) {
                        z12 = false;
                    }
                    getMessagesController().X4(this.f40341v0, this.E0, this.G0, this.H0);
                    if (this.E0 && !this.G0 && (z12 || z10)) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i10 = 0; i10 < fragmentStack.size(); i10++) {
                            if ((fragmentStack.get(i10) instanceof un) && ((un) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.f40341v0) {
                                ((ActionBarLayout) getParentLayout()).a0(i10);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.f40341v0);
                                org.telegram.ui.ActionBar.z4 parentLayout = getParentLayout();
                                HashSet hashSet = pb1.f40565q1;
                                ((ActionBarLayout) parentLayout).c(i10, pb1.H0(getMessagesController(), getMessagesStorage(), bundle));
                            }
                        }
                    }
                    if (z10 || z11) {
                        u0(z10);
                    }
                }
                finishFragment();
            }
        }
    }

    public final void o0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oo.o0():void");
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.f40337s.h(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.f40342w;
        if (wtVar != null && wtVar.e) {
            if (z10) {
                wtVar.k(true);
                return false;
            }
            return false;
        }
        return i0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f40318c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oo.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.b40 b40Var = this.f40337s;
        if (b40Var != null) {
            b40Var.d();
        }
        if (this.f40343w0 != null) {
            getNotificationCenter().n(this, org.telegram.messenger.zs.T);
            getNotificationCenter().n(this, org.telegram.messenger.zs.f19682r5);
            getNotificationCenter().n(this, org.telegram.messenger.zs.X4);
            getNotificationCenter().n(this, org.telegram.messenger.zs.L3);
        } else {
            getNotificationCenter().n(this, org.telegram.messenger.zs.E0);
            if (this.C0.bot) {
                getNotificationCenter().n(this, org.telegram.messenger.zs.C3);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19676r);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19726y1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19585b1);
        org.telegram.ui.Components.wt wtVar = this.f40342w;
        if (wtVar != null) {
            wtVar.o();
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        UndoView undoView = this.f40318c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.P0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.f5) obj).o(null);
        }
        org.telegram.ui.Components.wt wtVar = this.f40342w;
        if (wtVar != null) {
            wtVar.r();
        }
        UndoView undoView = this.f40318c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f40337s.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.f40337s.j(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.wt wtVar = this.f40342w;
        if (wtVar != null) {
            wtVar.s();
            this.f40342w.getEditText().requestFocus();
        }
        s0();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        t0(true, true);
        this.f40337s.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, null);
            }
            ag.d2 d2Var = this.e;
            if (d2Var != null) {
                d2Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0(TLRPC.ChatFull chatFull) {
        boolean z10;
        org.telegram.ui.Components.f5 f5Var;
        this.f40345x0 = chatFull;
        if (chatFull != null) {
            if (this.f40343w0 == null) {
                this.f40343w0 = getMessagesController().L0(Long.valueOf(this.f40341v0));
            }
            if (org.telegram.messenger.w3.T(this.f40343w0) && !this.f40345x0.hidden_prehistory) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.J0 = z10;
            this.K0 = this.f40345x0.available_reactions;
            ArrayList arrayList = this.P0;
            arrayList.clear();
            TLRPC.Chat chat = this.f40343w0;
            TLRPC.ChatFull chatFull2 = this.f40345x0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && org.telegram.messenger.w3.V(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i10);
                        i10++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).f18341r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                f5Var = org.telegram.ui.Components.f5.l(org.telegram.messenger.d20.f15147s0, org.telegram.ui.Components.f5.f(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            f5Var = org.telegram.ui.Components.f5.m(org.telegram.messenger.d20.f15147s0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.f5.f());
                        } else {
                            f5Var = null;
                        }
                        if (f5Var != null) {
                            arrayList2.add(f5Var);
                            f5Var.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).f18332n;
                    int size2 = arrayList4.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList4.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.f5 l4 = org.telegram.ui.Components.f5.l(org.telegram.messenger.d20.f15147s0, org.telegram.ui.Components.f5.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l4);
                            l4.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.Z != null && getMessagesController().f18803h6 && org.telegram.messenger.w3.V(this.f40343w0)) {
                this.Z.setVisibility(0);
            }
        }
        j0();
    }

    public final void q0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        int i10;
        TL_bots.BotInfo botInfo2;
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        String format;
        TLRPC.User Z1;
        this.D0 = userFull;
        if (userFull != null) {
            if (this.C0 == null) {
                long j10 = this.B0;
                if (j10 == 0) {
                    Z1 = null;
                } else {
                    Z1 = getMessagesController().Z1(Long.valueOf(j10));
                }
                this.C0 = Z1;
            }
            org.telegram.ui.Cells.p8 p8Var = this.f40331n0;
            int i11 = 0;
            if (p8Var != null) {
                if (this.D0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p8Var.h(45, z10, true);
                TLRPC.UserFull userFull2 = this.D0;
                if (userFull2 != null) {
                    org.telegram.ui.Cells.p8 p8Var2 = this.f40331n0;
                    if (userFull2.starref_program == null) {
                        format = org.telegram.messenger.cd.L0(2131754345, null);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    p8Var2.w(format, false);
                }
            }
            org.telegram.ui.Cells.p8 p8Var3 = this.f40339t0;
            if (p8Var3 != null) {
                TLRPC.UserFull userFull3 = this.D0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p8Var3.setVisibility(i10);
            }
            org.telegram.ui.Cells.b9 b9Var = this.f40338s0;
            if (b9Var != null) {
                TLRPC.UserFull userFull4 = this.D0;
                if (userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) {
                    i11 = 8;
                }
                b9Var.setVisibility(i11);
            }
        }
    }

    public final void r0(boolean z10, boolean z11) {
        if (this.f40330n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.h = animatorSet2;
            if (z10) {
                this.f40330n.setVisibility(0);
                this.f40322f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                RadialProgressView radialProgressView = this.f40330n;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f40322f, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f40330n;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f40322f, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new eg.m(15, this, z10));
            this.h.start();
        } else if (z10) {
            this.f40330n.setAlpha(1.0f);
            this.f40330n.setVisibility(0);
            this.f40322f.setAlpha(1.0f);
            this.f40322f.setVisibility(0);
        } else {
            this.f40330n.setAlpha(0.0f);
            this.f40330n.setVisibility(4);
            this.f40322f.setAlpha(0.0f);
            this.f40322f.setVisibility(4);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.b40 b40Var = this.f40337s;
        if (b40Var != null) {
            b40Var.f24526f = bundle.getString("path");
        }
    }

    public final void s0() {
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        boolean z10;
        int i10;
        on0 on0Var;
        org.telegram.messenger.kp d;
        int w02;
        boolean q6;
        int i11;
        ArrayList<Integer> arrayList;
        int i12;
        int i13;
        zm0 zm0Var = this.L;
        if (zm0Var != null) {
            TLRPC.Chat chat = this.f40343w0;
            org.telegram.ui.Cells.p8 p8Var3 = this.N;
            if ((p8Var3 != null && p8Var3.getVisibility() == 0) || (((p8Var = this.Q) != null && p8Var.getVisibility() == 0) || ((org.telegram.messenger.w3.n0(this.f40343w0) && org.telegram.messenger.w3.N(this.f40343w0)) || ((p8Var2 = this.M) != null && p8Var2.getVisibility() == 0)))) {
                z10 = true;
            } else {
                z10 = false;
            }
            Paint paint = zm0Var.f44185n;
            int i14 = zm0Var.f44181a;
            org.telegram.ui.ActionBar.p6 p6Var = zm0Var.d;
            if (chat != null) {
                zm0Var.f44188w = z10;
                zm0Var.f44186r = new org.telegram.ui.Components.qz0(org.telegram.messenger.k6.m(chat.title, org.telegram.ui.ActionBar.t6.f21130o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.i0.o());
                on0 on0Var2 = zm0Var.f44189x;
                if (on0Var2 != null) {
                    on0Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i15 = on0.f40307j;
                    int i16 = tL_emojiStatusCollectible.center_color | (-16777216);
                    i10 = -16777216;
                    zm0Var.f44189x = new on0(i16, i16, i16, tL_emojiStatusCollectible.document_id);
                } else {
                    i10 = -16777216;
                    if (org.telegram.messenger.w3.I(chat) >= 0) {
                        on0Var = on0.c(i14, org.telegram.messenger.w3.I(chat));
                        on0Var.f40308a = org.telegram.messenger.i0.L(11.0f);
                        on0Var.d();
                    } else {
                        on0Var = null;
                    }
                    zm0Var.f44189x = on0Var;
                }
                on0 on0Var3 = zm0Var.f44189x;
                if (on0Var3 != null) {
                    on0Var3.e(zm0Var);
                }
                TLRPC.PeerColor peerColor = chat.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    if (p6Var != null) {
                        q6 = p6Var.a();
                    } else {
                        q6 = org.telegram.ui.ActionBar.t6.I.q();
                    }
                    if (q6 && (tL_peerColorCollectible.flags & 1) != 0) {
                        i11 = tL_peerColorCollectible.dark_accent_color;
                    } else {
                        i11 = tL_peerColorCollectible.accent_color;
                    }
                    if (!q6 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    int intValue = arrayList.get(0).intValue() | i10;
                    if (arrayList.size() >= 2) {
                        i12 = arrayList.get(1).intValue() | i10;
                    } else {
                        i12 = intValue;
                    }
                    if (arrayList.size() >= 3) {
                        i13 = arrayList.get(2).intValue() | i10;
                    } else {
                        i13 = intValue;
                    }
                    zm0Var.f44186r.n(i11);
                    paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, i11));
                    on0 on0Var4 = new on0(intValue, i12, i13, tL_peerColorCollectible.gift_emoji_id);
                    on0Var4.f40308a = org.telegram.messenger.i0.L(11.0f);
                    on0Var4.d();
                    zm0Var.f44190y = on0Var4;
                    on0Var4.e(zm0Var);
                    return;
                }
                int F = org.telegram.messenger.w3.F(chat);
                if (F < 7) {
                    int i17 = org.telegram.ui.ActionBar.t6.f21188r8[F];
                    zm0Var.f44187s = i17;
                    w02 = org.telegram.ui.ActionBar.t6.w0(i17, p6Var);
                } else {
                    org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18888r4;
                    if (lpVar == null) {
                        d = null;
                    } else {
                        d = lpVar.d(F);
                    }
                    if (d != null) {
                        zm0Var.f44187s = -1;
                        w02 = d.f();
                    } else {
                        int i18 = org.telegram.ui.ActionBar.t6.f21188r8[0];
                        zm0Var.f44187s = i18;
                        w02 = org.telegram.ui.ActionBar.t6.w0(i18, p6Var);
                    }
                }
                zm0Var.f44186r.n(w02);
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
                on0 a2 = on0.a(i14, F);
                a2.f40308a = org.telegram.messenger.i0.L(11.0f);
                a2.d();
                zm0Var.f44190y = a2;
                a2.e(zm0Var);
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.b40 b40Var = this.f40337s;
        if (b40Var != null && (str = b40Var.f24526f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.wt wtVar = this.f40342w;
        if (wtVar != null) {
            String obj = wtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11;
        boolean z16;
        int i12;
        int i13;
        int i14;
        boolean z17;
        boolean z18;
        int i15;
        boolean z19;
        int i16;
        int i17;
        String str;
        boolean z20;
        boolean z21;
        float f7;
        float f10;
        int i18;
        org.telegram.ui.Cells.p8 p8Var;
        TLRPC.ChatFull chatFull;
        int i19;
        String str2;
        String L0;
        org.telegram.ui.Cells.p8 p8Var2;
        org.telegram.ui.Cells.p8 p8Var3;
        boolean z22;
        org.telegram.ui.Cells.p8 p8Var4;
        org.telegram.ui.Cells.p8 p8Var5;
        boolean z23;
        int i20;
        String str3;
        String format;
        org.telegram.ui.Cells.p8 p8Var6;
        org.telegram.ui.Cells.p8 p8Var7;
        boolean z24;
        boolean z25;
        boolean z26;
        int i21;
        int i22;
        org.telegram.ui.Cells.p8 p8Var8;
        org.telegram.ui.Cells.p8 p8Var9;
        org.telegram.ui.Cells.p8 p8Var10;
        TLRPC.Chat L02;
        if (z10 && (L02 = getMessagesController().L0(Long.valueOf(this.f40341v0))) != null) {
            this.f40343w0 = L02;
        }
        boolean t02 = org.telegram.messenger.w3.t0(this.f40343w0);
        org.telegram.ui.Cells.b9 b9Var = this.P;
        if (b9Var != null) {
            if (this.I == null && (((p8Var8 = this.J) == null || p8Var8.getVisibility() != 0) && (((p8Var9 = this.N) == null || p8Var9.getVisibility() != 0) && ((p8Var10 = this.H) == null || p8Var10.getVisibility() != 0)))) {
                i22 = 8;
            } else {
                i22 = 0;
            }
            b9Var.setVisibility(i22);
        }
        org.telegram.ui.Cells.p8 p8Var11 = this.Y;
        if (p8Var11 != null) {
            if (org.telegram.messenger.w3.T(this.f40343w0)) {
                i21 = 0;
            } else {
                i21 = 8;
            }
            p8Var11.setVisibility(i21);
        }
        org.telegram.ui.Cells.p8 p8Var12 = this.J;
        if (p8Var12 != null) {
            TLRPC.ChatFull chatFull2 = this.f40345x0;
            if (chatFull2 != null && (this.I0 || chatFull2.linked_chat_id != 0)) {
                p8Var12.setVisibility(0);
                if (this.f40345x0.linked_chat_id == 0) {
                    this.J.u(org.telegram.messenger.cd.L0(2131751390, "Discussion"), org.telegram.messenger.cd.L0(2131751382, "DiscussionInfoShort"), false, 2131232111, true);
                } else {
                    TLRPC.Chat L03 = getMessagesController().L0(Long.valueOf(this.f40345x0.linked_chat_id));
                    if (L03 == null) {
                        this.J.setVisibility(8);
                    } else if (this.I0) {
                        String K = org.telegram.messenger.w3.K(L03, false);
                        if (TextUtils.isEmpty(K)) {
                            this.J.u(org.telegram.messenger.cd.L0(2131751390, "Discussion"), L03.title, false, 2131232111, true);
                        } else {
                            this.J.u(org.telegram.messenger.cd.L0(2131751390, "Discussion"), sc.e.h("@", K), false, 2131232111, true);
                        }
                    } else {
                        String K2 = org.telegram.messenger.w3.K(L03, false);
                        if (TextUtils.isEmpty(K2)) {
                            org.telegram.ui.Cells.p8 p8Var13 = this.J;
                            String L04 = org.telegram.messenger.cd.L0(2131748893, "LinkedChannel");
                            String str4 = L03.title;
                            org.telegram.ui.Cells.p8 p8Var14 = this.Q;
                            if (p8Var14 != null && p8Var14.getVisibility() == 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            p8Var13.u(L04, str4, false, 2131232087, z26);
                        } else {
                            org.telegram.ui.Cells.p8 p8Var15 = this.J;
                            String L05 = org.telegram.messenger.cd.L0(2131748893, "LinkedChannel");
                            String h = sc.e.h("@", K2);
                            org.telegram.ui.Cells.p8 p8Var16 = this.Q;
                            if (p8Var16 != null && p8Var16.getVisibility() == 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            p8Var15.u(L05, h, false, 2131232087, z25);
                        }
                    }
                }
            } else {
                p8Var12.setVisibility(8);
            }
        }
        org.telegram.ui.Cells.p8 p8Var17 = this.H;
        if (p8Var17 != null) {
            TLRPC.ChatFull chatFull3 = this.f40345x0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                p8Var17.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.f40345x0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.H.q(org.telegram.messenger.cd.L0(2131753961, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.H.q(org.telegram.messenger.cd.L0(2131753961, "AttachLocation"), "Unknown address", z11, true);
                }
            } else {
                p8Var17.setVisibility(8);
            }
        }
        if (this.I != null) {
            TLRPC.ChatFull chatFull4 = this.f40345x0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!t02) {
                    format = org.telegram.messenger.cd.L0(2131743954, "TypeLocationGroupEdit");
                } else {
                    format = String.format(a1.g.r(new StringBuilder("https://"), getMessagesController().U2, "/%s"), org.telegram.messenger.w3.K(this.f40343w0, false));
                }
                String str5 = format;
                org.telegram.ui.Cells.p8 p8Var18 = this.I;
                String L06 = org.telegram.messenger.cd.L0(2131743955, "TypeLocationGroup");
                org.telegram.ui.Cells.p8 p8Var19 = this.N;
                if ((p8Var19 != null && p8Var19.getVisibility() == 0) || (((p8Var6 = this.J) != null && p8Var6.getVisibility() == 0) || ((p8Var7 = this.Q) != null && p8Var7.getVisibility() == 0))) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                p8Var18.u(L06, str5, false, 2131232087, z24);
            } else {
                boolean z27 = this.f40343w0.noforwards;
                if (this.I0) {
                    if (!t02) {
                        if (z27) {
                            i20 = 2131743946;
                            str3 = "TypePrivateRestrictedForwards";
                        } else {
                            i20 = 2131743949;
                            str3 = "TypePrivate";
                        }
                    } else {
                        i20 = 2131743945;
                        str3 = "TypePublic";
                    }
                    L0 = org.telegram.messenger.cd.L0(i20, str3);
                } else {
                    if (!t02) {
                        if (z27) {
                            i19 = 2131743947;
                            str2 = "TypePrivateGroupRestrictedForwards";
                        } else {
                            i19 = 2131743948;
                            str2 = "TypePrivateGroup";
                        }
                    } else {
                        i19 = 2131743944;
                        str2 = "TypePublicGroup";
                    }
                    L0 = org.telegram.messenger.cd.L0(i19, str2);
                }
                String str6 = L0;
                if (this.I0) {
                    org.telegram.ui.Cells.p8 p8Var20 = this.I;
                    String L07 = org.telegram.messenger.cd.L0(2131752276, "ChannelType");
                    org.telegram.ui.Cells.p8 p8Var21 = this.N;
                    if ((p8Var21 != null && p8Var21.getVisibility() == 0) || (((p8Var4 = this.J) != null && p8Var4.getVisibility() == 0) || ((p8Var5 = this.Q) != null && p8Var5.getVisibility() == 0))) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    p8Var20.u(L07, str6, false, 2131232087, z23);
                } else {
                    org.telegram.ui.Cells.p8 p8Var22 = this.I;
                    String L08 = org.telegram.messenger.cd.L0(2131749401, "GroupType");
                    org.telegram.ui.Cells.p8 p8Var23 = this.N;
                    if ((p8Var23 != null && p8Var23.getVisibility() == 0) || (((p8Var2 = this.J) != null && p8Var2.getVisibility() == 0) || ((p8Var3 = this.Q) != null && p8Var3.getVisibility() == 0))) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    p8Var22.u(L08, str6, false, 2131232174, z22);
                }
            }
        }
        if (this.N != null) {
            if (this.J0 && !this.E0) {
                i17 = 2131752232;
                str = "ChatHistoryHidden";
            } else {
                i17 = 2131752228;
                str = "ChatHistoryVisible";
            }
            String L09 = org.telegram.messenger.cd.L0(i17, str);
            org.telegram.ui.Cells.p8 p8Var24 = this.N;
            String L010 = org.telegram.messenger.cd.L0(2131752229, "ChatHistoryShort");
            if (this.Q != null) {
                z20 = true;
            } else {
                z20 = false;
            }
            p8Var24.u(L010, L09, z11, 2131232111, z20);
            this.N.setEnabled(!this.E0);
            if (!this.E0 && !t02 && (((chatFull = this.f40345x0) == null || chatFull.linked_chat_id == 0) && (chatFull == null || !(chatFull.location instanceof TLRPC.TL_channelLocation)))) {
                z21 = true;
            } else {
                z21 = false;
            }
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = 0.0f;
            if (this.N.getAlpha() <= 0.0f && !z21) {
                this.N.setVisibility(8);
                s0();
            } else {
                float f12 = 1.0f;
                if (this.N.getVisibility() != 0 || this.N.getAlpha() < 1.0f || !z21) {
                    ArrayList arrayList = new ArrayList();
                    int i23 = 0;
                    boolean z28 = false;
                    while (i23 < this.F.getChildCount()) {
                        if (!z28 && this.F.getChildAt(i23) == this.N) {
                            z28 = true;
                        } else if (z28) {
                            arrayList.add(this.F.getChildAt(i23));
                        }
                        i23++;
                        z28 = z28;
                    }
                    int i24 = 0;
                    boolean z29 = false;
                    while (i24 < this.f40344x.getChildCount()) {
                        if (!z29 && this.f40344x.getChildAt(i24) == this.F) {
                            z29 = true;
                        } else if (z29) {
                            arrayList.add(this.f40344x.getChildAt(i24));
                        }
                        i24++;
                        z29 = z29;
                    }
                    if (this.N.getVisibility() != 0) {
                        this.N.setAlpha(0.0f);
                        this.N.setTranslationY((-p8Var.getHeight()) / 2.0f);
                    }
                    this.N.setVisibility(0);
                    for (int i25 = 0; i25 < arrayList.size(); i25++) {
                        ((View) arrayList.get(i25)).setTranslationY((1.0f - this.N.getAlpha()) * (-this.N.getHeight()));
                    }
                    if (z11) {
                        float alpha = this.N.getAlpha();
                        if (z21) {
                            f11 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f11);
                        this.S0 = ofFloat;
                        ofFloat.addUpdateListener(new ag.p2(10, this, arrayList));
                        this.S0.addListener(new androidx.fragment.app.g(this, z21, arrayList, 4));
                        this.S0.setDuration(320L);
                        this.S0.setInterpolator(org.telegram.ui.Components.gr.h);
                        this.S0.start();
                    } else {
                        org.telegram.ui.Cells.p8 p8Var25 = this.N;
                        if (z21) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        p8Var25.setAlpha(f7);
                        org.telegram.ui.Cells.p8 p8Var26 = this.N;
                        float f13 = (-p8Var26.getHeight()) / 2.0f;
                        if (z21) {
                            f10 = 0.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        p8Var26.setTranslationY(f13 * f10);
                        org.telegram.ui.Cells.p8 p8Var27 = this.N;
                        if (!z21) {
                            f12 = 0.0f;
                        }
                        p8Var27.setScaleY((f12 * 0.8f) + 0.2f);
                        org.telegram.ui.Cells.p8 p8Var28 = this.N;
                        if (z21) {
                            i18 = 0;
                        } else {
                            i18 = 8;
                        }
                        p8Var28.setVisibility(i18);
                        for (int i26 = 0; i26 < arrayList.size(); i26++) {
                            ((View) arrayList.get(i26)).setTranslationY(0.0f);
                        }
                        this.S0 = null;
                    }
                }
            }
        }
        if (this.T != null) {
            if (this.f40345x0 != null) {
                org.telegram.ui.Cells.p8 p8Var29 = this.U;
                if (p8Var29 != null) {
                    if (p8Var29.getParent() == null) {
                        i10 = 0;
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, w7.b6.o(-1, -2));
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Cells.p8 p8Var30 = this.U;
                    if (this.f40345x0.requests_pending > 0) {
                        i16 = i10;
                    } else {
                        i16 = 8;
                    }
                    p8Var30.setVisibility(i16);
                } else {
                    i10 = 0;
                }
                if (this.I0 && !org.telegram.messenger.w3.Y(this.f40343w0)) {
                    org.telegram.ui.Cells.p8 p8Var31 = this.T;
                    String L011 = org.telegram.messenger.cd.L0(2131752289, "ChannelSubscribers");
                    Object[] objArr = new Object[1];
                    objArr[i10] = Integer.valueOf(this.f40345x0.participants_count);
                    p8Var31.u(L011, String.format("%d", objArr), false, 2131232174, true);
                    org.telegram.ui.Cells.p8 p8Var32 = this.X;
                    CharSequence L012 = org.telegram.messenger.cd.L0(2131752453, null);
                    TLRPC.ChatFull chatFull5 = this.f40345x0;
                    Object[] objArr2 = new Object[1];
                    objArr2[i10] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                    CharSequence format2 = String.format("%d", objArr2);
                    org.telegram.ui.Cells.p8 p8Var33 = this.Y;
                    if (p8Var33 != null && p8Var33.getVisibility() == 0) {
                        z19 = 1;
                    } else {
                        z19 = i10;
                    }
                    p8Var32.u(L012, format2, false, 2131232414, z19);
                    z12 = z11;
                } else {
                    if (org.telegram.messenger.w3.T(this.f40343w0)) {
                        org.telegram.ui.Cells.p8 p8Var34 = this.T;
                        String L013 = org.telegram.messenger.cd.L0(2131752377, "ChannelMembers");
                        Object[] objArr3 = new Object[1];
                        objArr3[i10] = Integer.valueOf(this.f40345x0.participants_count);
                        p8Var34.u(L013, String.format("%d", objArr3), false, 2131232174, true);
                    } else {
                        org.telegram.ui.Cells.p8 p8Var35 = this.T;
                        CharSequence L014 = org.telegram.messenger.cd.L0(2131752377, "ChannelMembers");
                        Object[] objArr4 = new Object[1];
                        objArr4[i10] = Integer.valueOf(this.f40345x0.participants.participants.size());
                        CharSequence format3 = String.format("%d", objArr4);
                        if (this.U.getVisibility() == 0) {
                            z16 = 1;
                        } else {
                            z16 = i10;
                        }
                        p8Var35.u(L014, format3, false, 2131232174, z16);
                    }
                    TLRPC.Chat chat = this.f40343w0;
                    if (chat.gigagroup && !org.telegram.messenger.w3.Y(chat)) {
                        org.telegram.ui.Cells.p8 p8Var36 = this.X;
                        CharSequence L015 = org.telegram.messenger.cd.L0(2131752453, null);
                        TLRPC.ChatFull chatFull6 = this.f40345x0;
                        Object[] objArr5 = new Object[1];
                        objArr5[i10] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                        CharSequence format4 = String.format("%d", objArr5);
                        org.telegram.ui.Cells.p8 p8Var37 = this.Y;
                        if (p8Var37 != null && p8Var37.getVisibility() == 0) {
                            z18 = 1;
                        } else {
                            z18 = i10;
                        }
                        p8Var36.u(L015, format4, false, 2131232414, z18);
                        z12 = z11;
                    } else {
                        if (this.E0) {
                            i12 = 16;
                        } else {
                            i12 = 15;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f40343w0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i27 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i27++;
                            }
                            i13 = pr.r0(tL_chatBannedRights) + i27;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f40343w0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i13++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i13++;
                            }
                            if (this.E0 && !tL_chatBannedRights2.manage_topics) {
                                i13++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i13++;
                            }
                            i14 = i12;
                        } else {
                            i13 = i12;
                            i14 = i13;
                        }
                        org.telegram.ui.Cells.p8 p8Var38 = this.X;
                        String L016 = org.telegram.messenger.cd.L0(2131752333, null);
                        Integer valueOf = Integer.valueOf(i13);
                        Integer valueOf2 = Integer.valueOf(i14);
                        Object[] objArr6 = new Object[2];
                        objArr6[i10] = valueOf;
                        objArr6[1] = valueOf2;
                        p8Var38.u(L016, String.format("%d/%d", objArr6), z11, 2131232275, true);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.p8 p8Var39 = this.U;
                    if (p8Var39 != null) {
                        CharSequence L017 = org.telegram.messenger.cd.L0(2131748650, "MemberRequests");
                        Object[] objArr7 = new Object[1];
                        objArr7[i10] = Integer.valueOf(this.f40345x0.requests_pending);
                        CharSequence format5 = String.format("%d", objArr7);
                        org.telegram.ui.Cells.p8 p8Var40 = this.Y;
                        if (p8Var40 != null && p8Var40.getVisibility() == 0) {
                            z17 = 1;
                        } else {
                            z17 = i10;
                        }
                        p8Var39.u(L017, format5, false, 2131232339, z17);
                    }
                }
                org.telegram.ui.Cells.p8 p8Var41 = this.W;
                String L018 = org.telegram.messenger.cd.L0(2131752517, "ChannelAdministrators");
                if (org.telegram.messenger.w3.T(this.f40343w0)) {
                    i15 = this.f40345x0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.f40345x0;
                    if (chatFull7 == null) {
                        i15 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i28 = i10;
                        int i29 = i28;
                        while (i28 < size) {
                            TLRPC.ChatParticipant chatParticipant = this.f40345x0.participants.participants.get(i28);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i29++;
                            }
                            i28++;
                        }
                        i15 = i29;
                    }
                }
                Object[] objArr8 = new Object[1];
                objArr8[i10] = Integer.valueOf(i15);
                p8Var41.u(L018, String.format("%d", objArr8), false, 2131232048, true);
            } else {
                z12 = z11;
                i10 = 0;
                if (this.I0 && !org.telegram.messenger.w3.Y(this.f40343w0)) {
                    this.T.o(2131232174, org.telegram.messenger.cd.L0(2131752289, "ChannelSubscribers"), true);
                    org.telegram.ui.Cells.p8 p8Var42 = this.X;
                    String L019 = org.telegram.messenger.cd.L0(2131752453, null);
                    org.telegram.ui.Cells.p8 p8Var43 = this.Y;
                    if (p8Var43 != null && p8Var43.getVisibility() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    p8Var42.o(2131232089, L019, z15);
                } else {
                    org.telegram.ui.Cells.p8 p8Var44 = this.T;
                    String L020 = org.telegram.messenger.cd.L0(2131752377, "ChannelMembers");
                    org.telegram.ui.Cells.p8 p8Var45 = this.Y;
                    if (p8Var45 != null && p8Var45.getVisibility() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    p8Var44.o(2131232174, L020, z13);
                    if (this.f40343w0.gigagroup) {
                        org.telegram.ui.Cells.p8 p8Var46 = this.X;
                        String L021 = org.telegram.messenger.cd.L0(2131752453, null);
                        org.telegram.ui.Cells.p8 p8Var47 = this.Y;
                        if (p8Var47 != null && p8Var47.getVisibility() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        p8Var46.o(2131232089, L021, z14);
                    } else {
                        this.X.o(2131232275, org.telegram.messenger.cd.L0(2131752333, null), true);
                    }
                }
                this.W.o(2131232048, org.telegram.messenger.cd.L0(2131752517, "ChannelAdministrators"), true);
            }
            org.telegram.ui.Cells.p8 p8Var48 = this.O;
            if (org.telegram.messenger.w3.w(1, this.f40343w0)) {
                i11 = i10;
            } else {
                i11 = 8;
            }
            p8Var48.setVisibility(i11);
            w0(z12);
            if (this.f40345x0 != null && org.telegram.messenger.w3.y(3, this.f40343w0) && (!t02 || !this.f40343w0.creator)) {
                if (this.f40345x0.invitesCount > 0) {
                    this.V.u(org.telegram.messenger.cd.L0(2131749150, "InviteLinks"), Integer.toString(this.f40345x0.invitesCount), false, 2131232203, true);
                } else {
                    this.V.u(org.telegram.messenger.cd.L0(2131749150, "InviteLinks"), "1", false, 2131232203, true);
                }
            } else {
                this.V.setVisibility(8);
            }
        }
        if (this.K != null) {
            x0(null);
        }
    }

    public final void u0(boolean z10) {
        ay ayVar;
        xw xwVar;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i10 = 0;
            while (i10 < fragmentStack.size()) {
                if (fragmentStack.get(i10) instanceof un) {
                    un unVar = (un) fragmentStack.get(i10);
                    if (unVar.getArguments().getLong("chat_id") == this.f40341v0) {
                        ((ActionBarLayout) getParentLayout()).c0(unVar, false);
                        unVar.clearViews();
                        if (((ActionBarLayout) getParentLayout()).c(i10, unVar)) {
                            org.telegram.messenger.zs.e().j(unVar.Z9);
                        }
                        if (z10 && !this.G0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.f40341v0);
                            ((ActionBarLayout) getParentLayout()).c(i10, new pb1(bundle));
                            i10++;
                        }
                    }
                } else if (z10 && this.G0 && (fragmentStack.get(i10) instanceof pb1)) {
                    pb1 pb1Var = (pb1) fragmentStack.get(i10);
                    if (pb1Var.g() != null && pb1Var.g().f19793id == this.f40341v0) {
                        ((ActionBarLayout) getParentLayout()).c0(pb1Var, false);
                        i10--;
                    }
                } else if (z10 && this.G0 && (fragmentStack.get(i10) instanceof ay) && (ayVar = (ay) fragmentStack.get(i10)) != null && (xwVar = ayVar.F3) != null && xwVar.c()) {
                    ayVar.F3.a();
                }
                i10++;
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (this.f40328k0 == null) {
            return;
        }
        if (this.C0.usernames.size() > 1) {
            ArrayList<TLRPC.TL_username> arrayList = this.C0.usernames;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TLRPC.TL_username tL_username = arrayList.get(i11);
                i11++;
                if (tL_username.active) {
                    i10++;
                }
            }
            this.f40328k0.u(org.telegram.messenger.cd.L0(2131753004, null), org.telegram.messenger.cd.a0(null, null, 2131753003, Integer.valueOf(i10), Integer.valueOf(this.C0.usernames.size())), false, 2131232203, true);
            return;
        }
        this.f40328k0.u(org.telegram.messenger.cd.L0(2131753005, null), "t.me/" + this.C0.username, false, 2131232203, true);
    }

    public final void w0(boolean z10) {
        String str;
        String str2;
        TLRPC.ChatFull M0 = getMessagesController().M0(this.f40341v0);
        boolean V = org.telegram.messenger.w3.V(this.f40343w0);
        TLRPC.ChatReactions chatReactions = this.K0;
        if (chatReactions != null && !(chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                int i10 = 0;
                for (int i11 = 0; i11 < tL_chatReactionsSome.reactions.size(); i11++) {
                    TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i11);
                    if (reaction instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().f18341r.get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                        if (tL_availableReaction != null) {
                            if (tL_availableReaction.inactive) {
                            }
                            i10++;
                        }
                    } else {
                        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                        }
                        i10++;
                    }
                }
                if (V) {
                    if (M0 != null && M0.paid_reactions_available) {
                        i10++;
                    }
                    if (i10 == 0) {
                        str2 = org.telegram.messenger.cd.L0(2131746394, null);
                    } else {
                        str2 = String.valueOf(i10);
                    }
                } else {
                    int min = Math.min(getMediaDataController().f18332n.size(), i10);
                    if (min == 0) {
                        str2 = org.telegram.messenger.cd.L0(2131746394, null);
                    } else {
                        str2 = org.telegram.messenger.cd.a0(null, null, 2131746399, Integer.valueOf(min), Integer.valueOf(getMediaDataController().f18332n.size()));
                    }
                }
            } else {
                str2 = org.telegram.messenger.cd.L0(2131746401, null);
            }
        } else {
            String L0 = org.telegram.messenger.cd.L0(2131746394, null);
            if (M0 != null && M0.paid_reactions_available) {
                str2 = "1";
            } else {
                str = L0;
                this.O.u(org.telegram.messenger.cd.L0(2131746402, null), str, z10, 2131232323, true);
            }
        }
        str = str2;
        this.O.u(org.telegram.messenger.cd.L0(2131746402, null), str, z10, 2131232323, true);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final void x0(Long l4) {
        boolean z10;
        TLRPC.Chat chat = this.f40343w0;
        if (chat != null && this.K != null) {
            long j10 = 0;
            if (l4 != null) {
                if (l4.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = chat.broadcast_messages_allowed;
            }
            if (z10) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f40343w0.linked_monoforum_id));
                if (l4 != null) {
                    j10 = l4.longValue();
                } else if (L0 != null) {
                    j10 = L0.send_paid_messages_stars;
                }
                this.K.u(org.telegram.messenger.cd.L0(2131747111, null), rh.h8.Z0(false, org.telegram.messenger.cd.a0(null, null, 2131747083, Long.valueOf(j10)), 0.66f, null), false, 2131232215, true);
                return;
            }
            this.K.u(org.telegram.messenger.cd.L0(2131747111, null), org.telegram.messenger.cd.L0(2131747101, null), false, 2131232215, true);
        }
    }

    @Override
    public final void T() {
    }
}
