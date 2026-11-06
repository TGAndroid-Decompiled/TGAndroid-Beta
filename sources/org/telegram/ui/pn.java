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
public class pn extends org.telegram.ui.ActionBar.f2 implements org.telegram.ui.Components.i30, org.telegram.messenger.ls {
    public TLRPC.TL_chatBannedRights A0;
    public final long B0;
    public TLRPC.User C0;
    public LinearLayout D;
    public TLRPC.UserFull D0;
    public EditTextBoldCursor E;
    public boolean E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.y6 G;
    public boolean G0;
    public org.telegram.ui.Cells.m8 H;
    public boolean H0;
    public org.telegram.ui.Cells.m8 I;
    public boolean I0;
    public org.telegram.ui.Cells.m8 J;
    public boolean J0;
    public org.telegram.ui.Cells.m8 K;
    public TLRPC.ChatReactions K0;
    public nl0 L;
    public TL_stories.TL_premium_boostsStatus L0;
    public org.telegram.ui.Cells.m8 M;
    public boolean M0;
    public org.telegram.ui.Cells.m8 N;
    public boolean N0;
    public org.telegram.ui.Cells.m8 O;
    public boolean O0;
    public org.telegram.ui.Cells.z8 P;
    public final ArrayList P0;
    public org.telegram.ui.Cells.m8 Q;
    public final nn Q0;
    public LinearLayout R;
    public org.telegram.ui.Components.zg0 R0;
    public LinearLayout S;
    public ValueAnimator S0;
    public org.telegram.ui.Cells.m8 T;
    public org.telegram.ui.Cells.m8 U;
    public org.telegram.ui.Cells.m8 V;
    public org.telegram.ui.Cells.m8 W;
    public org.telegram.ui.Cells.m8 X;
    public org.telegram.ui.Cells.m8 Y;
    public org.telegram.ui.Cells.m8 Z;
    public org.telegram.ui.ActionBar.b5 f48857a;
    public org.telegram.ui.Cells.m8 f48858a0;
    public org.telegram.ui.ActionBar.u1 f48859b;
    public on f48860b0;
    public UndoView f48861c;
    public FrameLayout f48862c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.w9 f48863d0;
    public di.c4 f48864e;
    public org.telegram.ui.Cells.m8 f48865e0;
    public fi.p5 f48866f;
    public org.telegram.ui.Cells.m8 f48867f0;
    public ji.b f48868g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.z8 f48869h0;
    public org.telegram.ui.Cells.m8 f48870i0;
    public org.telegram.ui.Cells.z8 f48871j0;
    public org.telegram.ui.Cells.m8 f48872k0;
    public org.telegram.ui.Cells.m8 f48873l0;
    public org.telegram.ui.Cells.m8 m0;
    public RadialProgressView f48874n;
    public org.telegram.ui.Cells.m8 f48875n0;
    public org.telegram.ui.Cells.m8 f48876o0;
    public org.telegram.ui.Cells.m8 f48877p0;
    public org.telegram.ui.Cells.m8 f48878q0;
    public final org.telegram.ui.Components.w8 f48879r;
    public org.telegram.ui.Cells.z8 f48880r0;
    public final org.telegram.ui.Components.j30 f48881s;
    public org.telegram.ui.Cells.z8 f48882s0;
    public org.telegram.ui.Cells.m8 f48883t0;
    public TLRPC.FileLocation f48884u0;
    public long f48885v0;
    public org.telegram.ui.Components.kt f48886w;
    public TLRPC.Chat f48887w0;
    public org.telegram.ui.Components.gm0 f48888x;
    public TLRPC.ChatFull f48889x0;
    public org.telegram.ui.Components.hm0 f48890y;
    public TLRPC.TL_chatAdminRights f48891y0;
    public TLRPC.TL_chatBannedRights f48892z0;

    public pn(Bundle bundle) {
        super(bundle);
        int i7;
        this.P0 = new ArrayList();
        this.Q0 = new nn(this);
        this.f48879r = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.f48885v0 = bundle.getLong("chat_id", 0L);
        this.B0 = bundle.getLong("user_id", 0L);
        if (this.f48885v0 != 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f48885v0));
            if (M0 != null && org.telegram.messenger.t3.V(M0)) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            this.f48881s = new org.telegram.ui.Components.j30(i7, true, true);
            return;
        }
        this.f48881s = new org.telegram.ui.Components.j30(0, false, false);
    }

    public static void Z(pn pnVar, FrameLayout frameLayout, View view) {
        SpannableStringBuilder X2;
        if (!pnVar.F0) {
            TLRPC.ChatFull chatFull = pnVar.f48889x0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131752280, "ChannelTopicsDiscussionForbidden"));
            } else {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(pnVar.getMessagesController().f24739c5, "ChannelTopicsForbidden", new Object[0]));
            }
            org.telegram.ui.Components.hc.a0(pnVar).Q(2131624294, 36, X2).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
        f2Var.f48154a = -pnVar.f48885v0;
        f2Var.setResourceProvider(pnVar.resourceProvider);
        boolean z9 = pnVar.E0;
        boolean z10 = pnVar.G0;
        boolean z11 = pnVar.H0;
        di.b0 b0Var = new di.b0(3, pnVar, view);
        f2Var.f48156c = z9;
        f2Var.d = z10;
        f2Var.f48157e = z11;
        f2Var.h = b0Var;
        pnVar.presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
    }

    public static void a0(pn pnVar) {
        pnVar.f48884u0 = null;
        long j3 = pnVar.B0;
        if (j3 == 0) {
            org.telegram.messenger.qp.s1(pnVar.currentAccount).B(pnVar.f48885v0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = pnVar.getMessagesController().o1(j3);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.f27086id = new TLRPC.TL_inputPhotoEmpty();
            pnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new jn(pnVar, 2));
        }
        pnVar.s0(false, true);
        di.c4 c4Var = pnVar.f48864e;
        org.telegram.ui.Components.w8 w8Var = pnVar.f48879r;
        Object obj = pnVar.C0;
        if (obj == null) {
            obj = pnVar.f48887w0;
        }
        c4Var.j(null, null, w8Var, obj);
        pnVar.R0.M(0);
        pnVar.f48860b0.f29566e.d();
    }

    public static void b0(pn pnVar, long j3, long j10) {
        org.telegram.messenger.qp.s1(pnVar.currentAccount).Q2(j3, j10, true, false, new a5(pnVar, 4));
    }

    public static void c0(pn pnVar) {
        int i7 = pnVar.currentAccount;
        long j3 = pnVar.B0;
        TL_bots.BotVerifierSettings botVerifierSettings = pnVar.D0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        Bundle h = org.telegram.ui.Cells.f1.h(16, "onlySelect", "dialogsType", true);
        h.putBoolean("resetDelegate", false);
        ww wwVar = new ww(h);
        wwVar.setCurrentAccount(i7);
        wwVar.C2 = new hi.n1(wwVar, i7, j3, botVerifierSettings);
        T.presentFragment(wwVar);
    }

    public static void d0(pn pnVar, org.telegram.ui.ActionBar.u1 u1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, org.telegram.messenger.e3 e3Var) {
        u1Var.dismiss();
        if (pnVar.getParentActivity() == null) {
            return;
        }
        ug.i0 i0Var = new ug.i0(35, pnVar.currentAccount, pnVar.getParentActivity(), pnVar, pnVar.getResourceProvider());
        i0Var.A1(e3Var);
        i0Var.z1(tL_premium_boostsStatus, true);
        i0Var.B1(j3);
        TLRPC.Chat M0 = pnVar.getMessagesController().M0(Long.valueOf(-j3));
        if (M0 != null) {
            i0Var.I2 = new qf(19, pnVar, M0);
        }
        pnVar.showDialog(i0Var);
    }

    public static void e0(pn pnVar) {
        rc rcVar = new rc(-pnVar.f48887w0.f26952id);
        rcVar.f49463l0 = pnVar;
        pnVar.presentFragment(rcVar);
        org.telegram.messenger.qp.s1(pnVar.currentAccount).f24759e7.edit().putInt("boostingappearance", org.telegram.messenger.qp.s1(pnVar.currentAccount).f24759e7.getInt("boostingappearance", 0) + 1).apply();
    }

    public static void f0(pn pnVar) {
        pnVar.O0 = true;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(pnVar.currentAccount);
        int i7 = org.telegram.messenger.qp.C8;
        f10.k(org.telegram.messenger.qs.f25046r, 2);
    }

    public static org.telegram.ui.ActionBar.y4 g0(pn pnVar) {
        return pnVar.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.y4 h0(pn pnVar) {
        return pnVar.simpleActionBar;
    }

    public static SpannableStringBuilder i0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        ez ezVar = new ez(10);
        ezVar.f45439a.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        ezVar.f45443f = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false);
        ezVar.f45444n = false;
        spannableStringBuilder.setSpan(ezVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String l0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i7);
            i7++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.f48874n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        RadialProgressView radialProgressView = this.f48874n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28013m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27812b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
    }

    @Override
    public final android.view.View createView(android.content.Context r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int r13, int r14, java.lang.Object... r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.f48881s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.f48881s.f34845c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f48886w.getText().toString();
    }

    @Override
    public final org.telegram.ui.Components.hm0 getScrollViewForSimpleGlass() {
        return this.f48890y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        on onVar = this.f48860b0;
        int i7 = org.telegram.ui.ActionBar.k6.f27940i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(onVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48860b0, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28164u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48860b0, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28183v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.V, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        org.telegram.ui.Cells.m8 m8Var = this.U;
        if (m8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(m8Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.X, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.N, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48886w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27977k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48886w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27995l6));
        LinearLayout linearLayout = this.D;
        int i10 = org.telegram.ui.ActionBar.k6.f27848d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48862c0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48863d0, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48863d0, 4, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28069p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.O, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        org.telegram.ui.Cells.m8 m8Var2 = this.K;
        if (m8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(m8Var2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        }
        org.telegram.ui.Cells.m8 m8Var3 = this.f48858a0;
        if (m8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(m8Var3, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z9) {
        org.telegram.ui.Components.kt ktVar;
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
            org.telegram.ui.Components.kt ktVar2 = this.f48886w;
            if ((ktVar2 != null && !this.C0.first_name.equals(ktVar2.getText().toString())) || ((editTextBoldCursor2 = this.E) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z9) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131743727, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.hd.M0(2131752983, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new kn(this, 0));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747579, null), new kn(this, 1));
                    showDialog(u1Var);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.f48889x0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && org.telegram.messenger.t3.T(this.f48887w0) && this.f48889x0.hidden_prehistory != this.J0) || (((ktVar = this.f48886w) != null && !this.f48887w0.title.equals(ktVar.getText().toString())) || (((editTextBoldCursor = this.E) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.E0 != this.f48887w0.forum))) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = org.telegram.messenger.hd.M0(2131743727, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                u1Var2.R = M02;
                if (this.I0) {
                    u1Var2.T = org.telegram.messenger.hd.M0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    u1Var2.T = org.telegram.messenger.hd.M0(2131749400, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131754216, "ApplyTheme"), new kn(this, 2));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131747579, "PassportDiscard"), new kn(this, 3));
                showDialog(u1Var2);
            }
            return false;
        }
        return true;
    }

    public final void k0() {
        String str;
        if (this.f48865e0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().O2.f(-this.f48885v0);
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg.g.i(1, arrayList);
            if (!TextUtils.isEmpty(ijVar.f23293z)) {
                str = ijVar.f23293z.toString();
            } else if (!TextUtils.isEmpty(ijVar.v)) {
                str = ijVar.v.toString();
            } else {
                str = "";
            }
        } else {
            str = null;
        }
        TLRPC.ChatFull chatFull = this.f48889x0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = org.telegram.messenger.hd.M0(2131742893, null);
        }
        this.f48865e0.u(org.telegram.messenger.hd.M0(2131742899, null), str, false, 2131231926, true);
    }

    public final void m0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-this.f48885v0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new jn(this, 0));
    }

    public final void n0() {
        boolean z9;
        if (this.f48884u0 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f48881s.n(z9, new ln(this, 0), new q5(this, 5), 0);
        this.R0.M(0);
        this.R0.P(43);
        this.f48860b0.f29566e.d();
    }

    public final void o0() {
        org.telegram.ui.Components.kt ktVar;
        boolean z9;
        boolean z10;
        String str;
        String str2;
        if (!this.N0 && (ktVar = this.f48886w) != null) {
            if (ktVar.f35416a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(this.f48886w);
                return;
            }
            boolean z11 = true;
            this.N0 = true;
            String str3 = "";
            if (this.C0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().q1(this.C0);
                setbotinfo.flags |= 4;
                setbotinfo.lang_code = "";
                if (!this.C0.first_name.equals(this.f48886w.getText().toString())) {
                    setbotinfo.name = this.f48886w.getText().toString();
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
                this.f48859b = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                this.f48859b.setOnCancelListener(new bi.g0(this, getConnectionsManager().sendRequest(setbotinfo, new ld(6, this, setbotinfo)), 3));
                this.f48859b.show();
            } else if (!org.telegram.messenger.t3.T(this.f48887w0) && (!this.J0 || this.E0)) {
                getMessagesController().T(getParentActivity(), this.f48885v0, this, new kn(this, 5), null);
            } else {
                if (this.f48889x0 != null && org.telegram.messenger.t3.T(this.f48887w0)) {
                    TLRPC.ChatFull chatFull = this.f48889x0;
                    boolean z12 = chatFull.hidden_prehistory;
                    boolean z13 = this.J0;
                    if (z12 != z13) {
                        chatFull.hidden_prehistory = z13;
                        getMessagesController().b5(this.f48885v0, this.J0);
                    }
                }
                if (this.f48881s.g()) {
                    this.M0 = true;
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                    this.f48859b = u1Var;
                    u1Var.setOnCancelListener(new vf(this, 1));
                    this.f48859b.show();
                    return;
                }
                if (!this.f48887w0.title.equals(this.f48886w.getText().toString())) {
                    getMessagesController().C(this.f48885v0, this.f48886w.getText().toString(), null);
                }
                TLRPC.ChatFull chatFull2 = this.f48889x0;
                if (chatFull2 != null && (str = chatFull2.about) != null) {
                    str3 = str;
                }
                EditTextBoldCursor editTextBoldCursor2 = this.E;
                if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                    org.telegram.messenger.qp messagesController = getMessagesController();
                    long j3 = this.f48885v0;
                    String obj = this.E.getText().toString();
                    TLRPC.ChatFull chatFull3 = this.f48889x0;
                    messagesController.getClass();
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = messagesController.j1(-j3);
                    tL_messages_editChatAbout.about = obj;
                    messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new org.telegram.messenger.di(messagesController, chatFull3, obj, 7), 64);
                }
                boolean z14 = this.E0;
                TLRPC.Chat chat = this.f48887w0;
                boolean z15 = chat.forum;
                if (z14 != z15 || this.G0 != chat.forum_tabs || this.H0 != chat.forum_sidebar) {
                    if (this.G0 != chat.forum_tabs) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (this.H0 != chat.forum_sidebar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z14 == z15) {
                        z11 = false;
                    }
                    getMessagesController().a5(this.f48885v0, this.E0, this.G0, this.H0);
                    if (this.E0 && !this.G0 && (z11 || z9)) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i7 = 0; i7 < fragmentStack.size(); i7++) {
                            if ((fragmentStack.get(i7) instanceof an) && ((an) fragmentStack.get(i7)).getArguments().getLong("chat_id") == this.f48885v0) {
                                ((ActionBarLayout) getParentLayout()).b0(i7);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.f48885v0);
                                org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
                                HashSet hashSet = v91.f50628q1;
                                ((ActionBarLayout) parentLayout).c(i7, v91.I0(getMessagesController(), getMessagesStorage(), bundle));
                            }
                        }
                    }
                    if (z9 || z10) {
                        v0(z9);
                    }
                }
                finishFragment();
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.f48881s.h(i7, i10, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.kt ktVar = this.f48886w;
        if (ktVar != null && ktVar.f35419e) {
            if (z9) {
                ktVar.k(true);
                return false;
            }
            return false;
        }
        return j0(z9);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f48861c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.j30 j30Var = this.f48881s;
        if (j30Var != null) {
            j30Var.d();
        }
        if (this.f48887w0 != null) {
            getNotificationCenter().n(this, org.telegram.messenger.qs.T);
            getNotificationCenter().n(this, org.telegram.messenger.qs.f25052r5);
            getNotificationCenter().n(this, org.telegram.messenger.qs.X4);
            getNotificationCenter().n(this, org.telegram.messenger.qs.L3);
        } else {
            getNotificationCenter().n(this, org.telegram.messenger.qs.E0);
            if (this.C0.bot) {
                getNotificationCenter().n(this, org.telegram.messenger.qs.C3);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25046r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25095y1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f24957b1);
        org.telegram.ui.Components.kt ktVar = this.f48886w;
        if (ktVar != null) {
            ktVar.o();
        }
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        UndoView undoView = this.f48861c;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.P0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((org.telegram.ui.Components.i5) obj).o(null);
        }
        org.telegram.ui.Components.kt ktVar = this.f48886w;
        if (ktVar != null) {
            ktVar.r();
        }
        UndoView undoView = this.f48861c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f48881s.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.f48881s.j(i7, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.kt ktVar = this.f48886w;
        if (ktVar != null) {
            ktVar.s();
            this.f48886w.getEditText().requestFocus();
        }
        t0();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        u0(true, true);
        this.f48881s.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            di.c4 c4Var = this.f48864e;
            if (c4Var != null) {
                c4Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pn.p0():void");
    }

    public final void q0(TLRPC.ChatFull chatFull) {
        boolean z9;
        org.telegram.ui.Components.i5 i5Var;
        this.f48889x0 = chatFull;
        if (chatFull != null) {
            if (this.f48887w0 == null) {
                this.f48887w0 = getMessagesController().M0(Long.valueOf(this.f48885v0));
            }
            if (org.telegram.messenger.t3.T(this.f48887w0) && !this.f48889x0.hidden_prehistory) {
                z9 = false;
            } else {
                z9 = true;
            }
            this.J0 = z9;
            this.K0 = this.f48889x0.available_reactions;
            ArrayList arrayList = this.P0;
            arrayList.clear();
            TLRPC.Chat chat = this.f48887w0;
            TLRPC.ChatFull chatFull2 = this.f48889x0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && org.telegram.messenger.t3.V(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i7);
                        i7++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24459s0).f25825r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                i5Var = org.telegram.ui.Components.i5.l(org.telegram.messenger.p10.f24459s0, org.telegram.ui.Components.i5.f(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            i5Var = org.telegram.ui.Components.i5.m(org.telegram.messenger.p10.f24459s0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.i5.f());
                        } else {
                            i5Var = null;
                        }
                        if (i5Var != null) {
                            arrayList2.add(i5Var);
                            i5Var.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24459s0).f25817n;
                    int size2 = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = arrayList4.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.i5 l10 = org.telegram.ui.Components.i5.l(org.telegram.messenger.p10.f24459s0, org.telegram.ui.Components.i5.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l10);
                            l10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.Z != null && getMessagesController().f24777g6 && org.telegram.messenger.t3.V(this.f48887w0)) {
                this.Z.setVisibility(0);
            }
        }
        k0();
    }

    public final void r0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        int i7;
        TL_bots.BotInfo botInfo2;
        boolean z9;
        TL_payments.starRefProgram starrefprogram;
        String format;
        TLRPC.User a22;
        this.D0 = userFull;
        if (userFull != null) {
            if (this.C0 == null) {
                long j3 = this.B0;
                if (j3 == 0) {
                    a22 = null;
                } else {
                    a22 = getMessagesController().a2(Long.valueOf(j3));
                }
                this.C0 = a22;
            }
            org.telegram.ui.Cells.m8 m8Var = this.f48875n0;
            int i10 = 0;
            if (m8Var != null) {
                if (this.D0 == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                m8Var.h(45, z9, true);
                TLRPC.UserFull userFull2 = this.D0;
                if (userFull2 != null) {
                    org.telegram.ui.Cells.m8 m8Var2 = this.f48875n0;
                    if (userFull2.starref_program == null) {
                        format = org.telegram.messenger.hd.M0(2131754345, null);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    m8Var2.w(format, false);
                }
            }
            org.telegram.ui.Cells.m8 m8Var3 = this.f48883t0;
            if (m8Var3 != null) {
                TLRPC.UserFull userFull3 = this.D0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                m8Var3.setVisibility(i7);
            }
            org.telegram.ui.Cells.z8 z8Var = this.f48882s0;
            if (z8Var != null) {
                TLRPC.UserFull userFull4 = this.D0;
                if (userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) {
                    i10 = 8;
                }
                z8Var.setVisibility(i10);
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.j30 j30Var = this.f48881s;
        if (j30Var != null) {
            j30Var.f34847f = bundle.getString("path");
        }
    }

    public final void s0(boolean z9, boolean z10) {
        if (this.f48874n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.h = animatorSet2;
            if (z9) {
                this.f48874n.setVisibility(0);
                this.f48866f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                RadialProgressView radialProgressView = this.f48874n;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f48866f, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f48874n;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f48866f, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new ch.y(29, this, z9));
            this.h.start();
        } else if (z9) {
            this.f48874n.setAlpha(1.0f);
            this.f48874n.setVisibility(0);
            this.f48866f.setAlpha(1.0f);
            this.f48866f.setVisibility(0);
        } else {
            this.f48874n.setAlpha(0.0f);
            this.f48874n.setVisibility(4);
            this.f48866f.setAlpha(0.0f);
            this.f48866f.setVisibility(4);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.j30 j30Var = this.f48881s;
        if (j30Var != null && (str = j30Var.f34847f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.kt ktVar = this.f48886w;
        if (ktVar != null) {
            String obj = ktVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0() {
        org.telegram.ui.Cells.m8 m8Var;
        org.telegram.ui.Cells.m8 m8Var2;
        boolean z9;
        int i7;
        cm0 cm0Var;
        org.telegram.messenger.fp d;
        int w02;
        boolean q10;
        int i10;
        ArrayList<Integer> arrayList;
        int i11;
        int i12;
        nl0 nl0Var = this.L;
        if (nl0Var != null) {
            TLRPC.Chat chat = this.f48887w0;
            org.telegram.ui.Cells.m8 m8Var3 = this.N;
            if ((m8Var3 != null && m8Var3.getVisibility() == 0) || (((m8Var = this.Q) != null && m8Var.getVisibility() == 0) || ((org.telegram.messenger.t3.n0(this.f48887w0) && org.telegram.messenger.t3.N(this.f48887w0)) || ((m8Var2 = this.M) != null && m8Var2.getVisibility() == 0)))) {
                z9 = true;
            } else {
                z9 = false;
            }
            Paint paint = nl0Var.f48072n;
            int i13 = nl0Var.f48067a;
            org.telegram.ui.ActionBar.f6 f6Var = nl0Var.d;
            if (chat != null) {
                nl0Var.f48075w = z9;
                nl0Var.f48073r = new org.telegram.ui.Components.ly0(org.telegram.messenger.i6.m(chat.title, org.telegram.ui.ActionBar.k6.f28045o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
                cm0 cm0Var2 = nl0Var.f48076x;
                if (cm0Var2 != null) {
                    cm0Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i14 = cm0.f44850j;
                    int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
                    i7 = -16777216;
                    nl0Var.f48076x = new cm0(i15, i15, i15, tL_emojiStatusCollectible.document_id);
                } else {
                    i7 = -16777216;
                    if (org.telegram.messenger.t3.I(chat) >= 0) {
                        cm0Var = cm0.c(i13, org.telegram.messenger.t3.I(chat));
                        cm0Var.f44851a = org.telegram.messenger.g0.L(11.0f);
                        cm0Var.d();
                    } else {
                        cm0Var = null;
                    }
                    nl0Var.f48076x = cm0Var;
                }
                cm0 cm0Var3 = nl0Var.f48076x;
                if (cm0Var3 != null) {
                    cm0Var3.e(nl0Var);
                }
                TLRPC.PeerColor peerColor = chat.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    if (f6Var != null) {
                        q10 = f6Var.a();
                    } else {
                        q10 = org.telegram.ui.ActionBar.k6.I.q();
                    }
                    if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
                        i10 = tL_peerColorCollectible.dark_accent_color;
                    } else {
                        i10 = tL_peerColorCollectible.accent_color;
                    }
                    if (!q10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    int intValue = arrayList.get(0).intValue() | i7;
                    if (arrayList.size() >= 2) {
                        i11 = arrayList.get(1).intValue() | i7;
                    } else {
                        i11 = intValue;
                    }
                    if (arrayList.size() >= 3) {
                        i12 = arrayList.get(2).intValue() | i7;
                    } else {
                        i12 = intValue;
                    }
                    nl0Var.f48073r.n(i10);
                    paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i10));
                    cm0 cm0Var4 = new cm0(intValue, i11, i12, tL_peerColorCollectible.gift_emoji_id);
                    cm0Var4.f44851a = org.telegram.messenger.g0.L(11.0f);
                    cm0Var4.d();
                    nl0Var.f48077y = cm0Var4;
                    cm0Var4.e(nl0Var);
                    return;
                }
                int F = org.telegram.messenger.t3.F(chat);
                if (F < 7) {
                    int i16 = org.telegram.ui.ActionBar.k6.f28109r8[F];
                    nl0Var.f48074s = i16;
                    w02 = org.telegram.ui.ActionBar.k6.w0(i16, f6Var);
                } else {
                    org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).f24859q4;
                    if (gpVar == null) {
                        d = null;
                    } else {
                        d = gpVar.d(F);
                    }
                    if (d != null) {
                        nl0Var.f48074s = -1;
                        w02 = d.f();
                    } else {
                        int i17 = org.telegram.ui.ActionBar.k6.f28109r8[0];
                        nl0Var.f48074s = i17;
                        w02 = org.telegram.ui.ActionBar.k6.w0(i17, f6Var);
                    }
                }
                nl0Var.f48073r.n(w02);
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
                cm0 a10 = cm0.a(i13, F);
                a10.f44851a = org.telegram.messenger.g0.L(11.0f);
                a10.d();
                nl0Var.f48077y = a10;
                a10.e(nl0Var);
            }
        }
    }

    public final void u0(boolean z9, boolean z10) {
        boolean z11;
        int i7;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        int i11;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        int i14;
        boolean z18;
        int i15;
        int i16;
        String str;
        boolean z19;
        boolean z20;
        float f10;
        float f11;
        int i17;
        org.telegram.ui.Cells.m8 m8Var;
        TLRPC.ChatFull chatFull;
        int i18;
        String str2;
        String M0;
        org.telegram.ui.Cells.m8 m8Var2;
        org.telegram.ui.Cells.m8 m8Var3;
        boolean z21;
        org.telegram.ui.Cells.m8 m8Var4;
        org.telegram.ui.Cells.m8 m8Var5;
        boolean z22;
        int i19;
        String str3;
        String format;
        org.telegram.ui.Cells.m8 m8Var6;
        org.telegram.ui.Cells.m8 m8Var7;
        boolean z23;
        boolean z24;
        boolean z25;
        int i20;
        int i21;
        org.telegram.ui.Cells.m8 m8Var8;
        org.telegram.ui.Cells.m8 m8Var9;
        org.telegram.ui.Cells.m8 m8Var10;
        TLRPC.Chat M02;
        if (z9 && (M02 = getMessagesController().M0(Long.valueOf(this.f48885v0))) != null) {
            this.f48887w0 = M02;
        }
        boolean t02 = org.telegram.messenger.t3.t0(this.f48887w0);
        org.telegram.ui.Cells.z8 z8Var = this.P;
        if (z8Var != null) {
            if (this.I == null && (((m8Var8 = this.J) == null || m8Var8.getVisibility() != 0) && (((m8Var9 = this.N) == null || m8Var9.getVisibility() != 0) && ((m8Var10 = this.H) == null || m8Var10.getVisibility() != 0)))) {
                i21 = 8;
            } else {
                i21 = 0;
            }
            z8Var.setVisibility(i21);
        }
        org.telegram.ui.Cells.m8 m8Var11 = this.Y;
        if (m8Var11 != null) {
            if (org.telegram.messenger.t3.T(this.f48887w0)) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            m8Var11.setVisibility(i20);
        }
        org.telegram.ui.Cells.m8 m8Var12 = this.J;
        if (m8Var12 != null) {
            TLRPC.ChatFull chatFull2 = this.f48889x0;
            if (chatFull2 != null && (this.I0 || chatFull2.linked_chat_id != 0)) {
                m8Var12.setVisibility(0);
                if (this.f48889x0.linked_chat_id == 0) {
                    this.J.u(org.telegram.messenger.hd.M0(2131751390, "Discussion"), org.telegram.messenger.hd.M0(2131751382, "DiscussionInfoShort"), false, 2131232112, true);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.f48889x0.linked_chat_id));
                    if (M03 == null) {
                        this.J.setVisibility(8);
                    } else if (this.I0) {
                        String K = org.telegram.messenger.t3.K(M03, false);
                        if (TextUtils.isEmpty(K)) {
                            this.J.u(org.telegram.messenger.hd.M0(2131751390, "Discussion"), M03.title, false, 2131232112, true);
                        } else {
                            this.J.u(org.telegram.messenger.hd.M0(2131751390, "Discussion"), rf.b.i("@", K), false, 2131232112, true);
                        }
                    } else {
                        String K2 = org.telegram.messenger.t3.K(M03, false);
                        if (TextUtils.isEmpty(K2)) {
                            org.telegram.ui.Cells.m8 m8Var13 = this.J;
                            String M04 = org.telegram.messenger.hd.M0(2131748882, "LinkedChannel");
                            String str4 = M03.title;
                            org.telegram.ui.Cells.m8 m8Var14 = this.Q;
                            if (m8Var14 != null && m8Var14.getVisibility() == 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            m8Var13.u(M04, str4, false, 2131232088, z25);
                        } else {
                            org.telegram.ui.Cells.m8 m8Var15 = this.J;
                            String M05 = org.telegram.messenger.hd.M0(2131748882, "LinkedChannel");
                            String i22 = rf.b.i("@", K2);
                            org.telegram.ui.Cells.m8 m8Var16 = this.Q;
                            if (m8Var16 != null && m8Var16.getVisibility() == 0) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            m8Var15.u(M05, i22, false, 2131232088, z24);
                        }
                    }
                }
            } else {
                m8Var12.setVisibility(8);
            }
        }
        org.telegram.ui.Cells.m8 m8Var17 = this.H;
        if (m8Var17 != null) {
            TLRPC.ChatFull chatFull3 = this.f48889x0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                m8Var17.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.f48889x0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.H.q(org.telegram.messenger.hd.M0(2131753961, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z10, true);
                } else {
                    this.H.q(org.telegram.messenger.hd.M0(2131753961, "AttachLocation"), "Unknown address", z10, true);
                }
            } else {
                m8Var17.setVisibility(8);
            }
        }
        if (this.I != null) {
            TLRPC.ChatFull chatFull4 = this.f48889x0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!t02) {
                    format = org.telegram.messenger.hd.M0(2131743930, "TypeLocationGroupEdit");
                } else {
                    format = String.format(a8.p0.s(new StringBuilder("https://"), getMessagesController().U2, "/%s"), org.telegram.messenger.t3.K(this.f48887w0, false));
                }
                String str5 = format;
                org.telegram.ui.Cells.m8 m8Var18 = this.I;
                String M06 = org.telegram.messenger.hd.M0(2131743931, "TypeLocationGroup");
                org.telegram.ui.Cells.m8 m8Var19 = this.N;
                if ((m8Var19 != null && m8Var19.getVisibility() == 0) || (((m8Var6 = this.J) != null && m8Var6.getVisibility() == 0) || ((m8Var7 = this.Q) != null && m8Var7.getVisibility() == 0))) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                m8Var18.u(M06, str5, false, 2131232088, z23);
            } else {
                boolean z26 = this.f48887w0.noforwards;
                if (this.I0) {
                    if (!t02) {
                        if (z26) {
                            i19 = 2131743922;
                            str3 = "TypePrivateRestrictedForwards";
                        } else {
                            i19 = 2131743925;
                            str3 = "TypePrivate";
                        }
                    } else {
                        i19 = 2131743921;
                        str3 = "TypePublic";
                    }
                    M0 = org.telegram.messenger.hd.M0(i19, str3);
                } else {
                    if (!t02) {
                        if (z26) {
                            i18 = 2131743923;
                            str2 = "TypePrivateGroupRestrictedForwards";
                        } else {
                            i18 = 2131743924;
                            str2 = "TypePrivateGroup";
                        }
                    } else {
                        i18 = 2131743920;
                        str2 = "TypePublicGroup";
                    }
                    M0 = org.telegram.messenger.hd.M0(i18, str2);
                }
                String str6 = M0;
                if (this.I0) {
                    org.telegram.ui.Cells.m8 m8Var20 = this.I;
                    String M07 = org.telegram.messenger.hd.M0(2131752276, "ChannelType");
                    org.telegram.ui.Cells.m8 m8Var21 = this.N;
                    if ((m8Var21 != null && m8Var21.getVisibility() == 0) || (((m8Var4 = this.J) != null && m8Var4.getVisibility() == 0) || ((m8Var5 = this.Q) != null && m8Var5.getVisibility() == 0))) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    m8Var20.u(M07, str6, false, 2131232088, z22);
                } else {
                    org.telegram.ui.Cells.m8 m8Var22 = this.I;
                    String M08 = org.telegram.messenger.hd.M0(2131749391, "GroupType");
                    org.telegram.ui.Cells.m8 m8Var23 = this.N;
                    if ((m8Var23 != null && m8Var23.getVisibility() == 0) || (((m8Var2 = this.J) != null && m8Var2.getVisibility() == 0) || ((m8Var3 = this.Q) != null && m8Var3.getVisibility() == 0))) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    m8Var22.u(M08, str6, false, 2131232175, z21);
                }
            }
        }
        if (this.N != null) {
            if (this.J0 && !this.E0) {
                i16 = 2131752232;
                str = "ChatHistoryHidden";
            } else {
                i16 = 2131752228;
                str = "ChatHistoryVisible";
            }
            String M09 = org.telegram.messenger.hd.M0(i16, str);
            org.telegram.ui.Cells.m8 m8Var24 = this.N;
            String M010 = org.telegram.messenger.hd.M0(2131752229, "ChatHistoryShort");
            if (this.Q != null) {
                z19 = true;
            } else {
                z19 = false;
            }
            m8Var24.u(M010, M09, z10, 2131232112, z19);
            this.N.setEnabled(!this.E0);
            if (!this.E0 && !t02 && (((chatFull = this.f48889x0) == null || chatFull.linked_chat_id == 0) && (chatFull == null || !(chatFull.location instanceof TLRPC.TL_channelLocation)))) {
                z20 = true;
            } else {
                z20 = false;
            }
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = 0.0f;
            if (this.N.getAlpha() <= 0.0f && !z20) {
                this.N.setVisibility(8);
                t0();
            } else {
                float f13 = 1.0f;
                if (this.N.getVisibility() != 0 || this.N.getAlpha() < 1.0f || !z20) {
                    ArrayList arrayList = new ArrayList();
                    int i23 = 0;
                    boolean z27 = false;
                    while (i23 < this.F.getChildCount()) {
                        if (!z27 && this.F.getChildAt(i23) == this.N) {
                            z27 = true;
                        } else if (z27) {
                            arrayList.add(this.F.getChildAt(i23));
                        }
                        i23++;
                        z27 = z27;
                    }
                    int i24 = 0;
                    boolean z28 = false;
                    while (i24 < this.f48888x.getChildCount()) {
                        if (!z28 && this.f48888x.getChildAt(i24) == this.F) {
                            z28 = true;
                        } else if (z28) {
                            arrayList.add(this.f48888x.getChildAt(i24));
                        }
                        i24++;
                        z28 = z28;
                    }
                    if (this.N.getVisibility() != 0) {
                        this.N.setAlpha(0.0f);
                        this.N.setTranslationY((-m8Var.getHeight()) / 2.0f);
                    }
                    this.N.setVisibility(0);
                    for (int i25 = 0; i25 < arrayList.size(); i25++) {
                        ((View) arrayList.get(i25)).setTranslationY((1.0f - this.N.getAlpha()) * (-this.N.getHeight()));
                    }
                    if (z10) {
                        float alpha = this.N.getAlpha();
                        if (z20) {
                            f12 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f12);
                        this.S0 = ofFloat;
                        ofFloat.addUpdateListener(new bi.de(11, this, arrayList));
                        this.S0.addListener(new ai.g0(this, z20, arrayList, 7));
                        this.S0.setDuration(320L);
                        this.S0.setInterpolator(org.telegram.ui.Components.xq.h);
                        this.S0.start();
                    } else {
                        org.telegram.ui.Cells.m8 m8Var25 = this.N;
                        if (z20) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        m8Var25.setAlpha(f10);
                        org.telegram.ui.Cells.m8 m8Var26 = this.N;
                        float f14 = (-m8Var26.getHeight()) / 2.0f;
                        if (z20) {
                            f11 = 0.0f;
                        } else {
                            f11 = 1.0f;
                        }
                        m8Var26.setTranslationY(f14 * f11);
                        org.telegram.ui.Cells.m8 m8Var27 = this.N;
                        if (!z20) {
                            f13 = 0.0f;
                        }
                        m8Var27.setScaleY((f13 * 0.8f) + 0.2f);
                        org.telegram.ui.Cells.m8 m8Var28 = this.N;
                        if (z20) {
                            i17 = 0;
                        } else {
                            i17 = 8;
                        }
                        m8Var28.setVisibility(i17);
                        for (int i26 = 0; i26 < arrayList.size(); i26++) {
                            ((View) arrayList.get(i26)).setTranslationY(0.0f);
                        }
                        this.S0 = null;
                    }
                }
            }
        }
        if (this.T != null) {
            if (this.f48889x0 != null) {
                org.telegram.ui.Cells.m8 m8Var29 = this.U;
                if (m8Var29 != null) {
                    if (m8Var29.getParent() == null) {
                        i7 = 0;
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, c8.ha.o(-1, -2));
                    } else {
                        i7 = 0;
                    }
                    org.telegram.ui.Cells.m8 m8Var30 = this.U;
                    if (this.f48889x0.requests_pending > 0) {
                        i15 = i7;
                    } else {
                        i15 = 8;
                    }
                    m8Var30.setVisibility(i15);
                } else {
                    i7 = 0;
                }
                if (this.I0 && !org.telegram.messenger.t3.Y(this.f48887w0)) {
                    org.telegram.ui.Cells.m8 m8Var31 = this.T;
                    String M011 = org.telegram.messenger.hd.M0(2131752289, "ChannelSubscribers");
                    Object[] objArr = new Object[1];
                    objArr[i7] = Integer.valueOf(this.f48889x0.participants_count);
                    m8Var31.u(M011, String.format("%d", objArr), false, 2131232175, true);
                    org.telegram.ui.Cells.m8 m8Var32 = this.X;
                    CharSequence M012 = org.telegram.messenger.hd.M0(2131752453, null);
                    TLRPC.ChatFull chatFull5 = this.f48889x0;
                    Object[] objArr2 = new Object[1];
                    objArr2[i7] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                    CharSequence format2 = String.format("%d", objArr2);
                    org.telegram.ui.Cells.m8 m8Var33 = this.Y;
                    if (m8Var33 != null && m8Var33.getVisibility() == 0) {
                        z18 = 1;
                    } else {
                        z18 = i7;
                    }
                    m8Var32.u(M012, format2, false, 2131232415, z18);
                    z11 = z10;
                } else {
                    if (org.telegram.messenger.t3.T(this.f48887w0)) {
                        org.telegram.ui.Cells.m8 m8Var34 = this.T;
                        String M013 = org.telegram.messenger.hd.M0(2131752377, "ChannelMembers");
                        Object[] objArr3 = new Object[1];
                        objArr3[i7] = Integer.valueOf(this.f48889x0.participants_count);
                        m8Var34.u(M013, String.format("%d", objArr3), false, 2131232175, true);
                    } else {
                        org.telegram.ui.Cells.m8 m8Var35 = this.T;
                        CharSequence M014 = org.telegram.messenger.hd.M0(2131752377, "ChannelMembers");
                        Object[] objArr4 = new Object[1];
                        objArr4[i7] = Integer.valueOf(this.f48889x0.participants.participants.size());
                        CharSequence format3 = String.format("%d", objArr4);
                        if (this.U.getVisibility() == 0) {
                            z15 = 1;
                        } else {
                            z15 = i7;
                        }
                        m8Var35.u(M014, format3, false, 2131232175, z15);
                    }
                    TLRPC.Chat chat = this.f48887w0;
                    if (chat.gigagroup && !org.telegram.messenger.t3.Y(chat)) {
                        org.telegram.ui.Cells.m8 m8Var36 = this.X;
                        CharSequence M015 = org.telegram.messenger.hd.M0(2131752453, null);
                        TLRPC.ChatFull chatFull6 = this.f48889x0;
                        Object[] objArr5 = new Object[1];
                        objArr5[i7] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                        CharSequence format4 = String.format("%d", objArr5);
                        org.telegram.ui.Cells.m8 m8Var37 = this.Y;
                        if (m8Var37 != null && m8Var37.getVisibility() == 0) {
                            z17 = 1;
                        } else {
                            z17 = i7;
                        }
                        m8Var36.u(M015, format4, false, 2131232415, z17);
                        z11 = z10;
                    } else {
                        if (this.E0) {
                            i11 = 16;
                        } else {
                            i11 = 15;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f48887w0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i27 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i27++;
                            }
                            i12 = oq.s0(tL_chatBannedRights) + i27;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f48887w0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i12++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i12++;
                            }
                            if (this.E0 && !tL_chatBannedRights2.manage_topics) {
                                i12++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i12++;
                            }
                            i13 = i11;
                        } else {
                            i12 = i11;
                            i13 = i12;
                        }
                        org.telegram.ui.Cells.m8 m8Var38 = this.X;
                        String M016 = org.telegram.messenger.hd.M0(2131752333, null);
                        Integer valueOf = Integer.valueOf(i12);
                        Integer valueOf2 = Integer.valueOf(i13);
                        Object[] objArr6 = new Object[2];
                        objArr6[i7] = valueOf;
                        objArr6[1] = valueOf2;
                        m8Var38.u(M016, String.format("%d/%d", objArr6), z10, 2131232276, true);
                        z11 = z10;
                    }
                    org.telegram.ui.Cells.m8 m8Var39 = this.U;
                    if (m8Var39 != null) {
                        CharSequence M017 = org.telegram.messenger.hd.M0(2131748634, "MemberRequests");
                        Object[] objArr7 = new Object[1];
                        objArr7[i7] = Integer.valueOf(this.f48889x0.requests_pending);
                        CharSequence format5 = String.format("%d", objArr7);
                        org.telegram.ui.Cells.m8 m8Var40 = this.Y;
                        if (m8Var40 != null && m8Var40.getVisibility() == 0) {
                            z16 = 1;
                        } else {
                            z16 = i7;
                        }
                        m8Var39.u(M017, format5, false, 2131232340, z16);
                    }
                }
                org.telegram.ui.Cells.m8 m8Var41 = this.W;
                String M018 = org.telegram.messenger.hd.M0(2131752517, "ChannelAdministrators");
                if (org.telegram.messenger.t3.T(this.f48887w0)) {
                    i14 = this.f48889x0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.f48889x0;
                    if (chatFull7 == null) {
                        i14 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i28 = i7;
                        int i29 = i28;
                        while (i28 < size) {
                            TLRPC.ChatParticipant chatParticipant = this.f48889x0.participants.participants.get(i28);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i29++;
                            }
                            i28++;
                        }
                        i14 = i29;
                    }
                }
                Object[] objArr8 = new Object[1];
                objArr8[i7] = Integer.valueOf(i14);
                m8Var41.u(M018, String.format("%d", objArr8), false, 2131232049, true);
            } else {
                z11 = z10;
                i7 = 0;
                if (this.I0 && !org.telegram.messenger.t3.Y(this.f48887w0)) {
                    this.T.o(2131232175, org.telegram.messenger.hd.M0(2131752289, "ChannelSubscribers"), true);
                    org.telegram.ui.Cells.m8 m8Var42 = this.X;
                    String M019 = org.telegram.messenger.hd.M0(2131752453, null);
                    org.telegram.ui.Cells.m8 m8Var43 = this.Y;
                    if (m8Var43 != null && m8Var43.getVisibility() == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    m8Var42.o(2131232090, M019, z14);
                } else {
                    org.telegram.ui.Cells.m8 m8Var44 = this.T;
                    String M020 = org.telegram.messenger.hd.M0(2131752377, "ChannelMembers");
                    org.telegram.ui.Cells.m8 m8Var45 = this.Y;
                    if (m8Var45 != null && m8Var45.getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    m8Var44.o(2131232175, M020, z12);
                    if (this.f48887w0.gigagroup) {
                        org.telegram.ui.Cells.m8 m8Var46 = this.X;
                        String M021 = org.telegram.messenger.hd.M0(2131752453, null);
                        org.telegram.ui.Cells.m8 m8Var47 = this.Y;
                        if (m8Var47 != null && m8Var47.getVisibility() == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        m8Var46.o(2131232090, M021, z13);
                    } else {
                        this.X.o(2131232276, org.telegram.messenger.hd.M0(2131752333, null), true);
                    }
                }
                this.W.o(2131232049, org.telegram.messenger.hd.M0(2131752517, "ChannelAdministrators"), true);
            }
            org.telegram.ui.Cells.m8 m8Var48 = this.O;
            if (org.telegram.messenger.t3.w(1, this.f48887w0)) {
                i10 = i7;
            } else {
                i10 = 8;
            }
            m8Var48.setVisibility(i10);
            x0(z11);
            if (this.f48889x0 != null && org.telegram.messenger.t3.y(3, this.f48887w0) && (!t02 || !this.f48887w0.creator)) {
                if (this.f48889x0.invitesCount > 0) {
                    this.V.u(org.telegram.messenger.hd.M0(2131749139, "InviteLinks"), Integer.toString(this.f48889x0.invitesCount), false, 2131232204, true);
                } else {
                    this.V.u(org.telegram.messenger.hd.M0(2131749139, "InviteLinks"), "1", false, 2131232204, true);
                }
            } else {
                this.V.setVisibility(8);
            }
        }
        if (this.K != null) {
            y0(null);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z9) {
        ww wwVar;
        sv svVar;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i7 = 0;
            while (i7 < fragmentStack.size()) {
                if (fragmentStack.get(i7) instanceof an) {
                    an anVar = (an) fragmentStack.get(i7);
                    if (anVar.getArguments().getLong("chat_id") == this.f48885v0) {
                        ((ActionBarLayout) getParentLayout()).d0(anVar, false);
                        anVar.clearViews();
                        if (((ActionBarLayout) getParentLayout()).c(i7, anVar)) {
                            org.telegram.messenger.qs.e().j(anVar.Z9);
                        }
                        if (z9 && !this.G0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.f48885v0);
                            ((ActionBarLayout) getParentLayout()).c(i7, new v91(bundle));
                            i7++;
                        }
                    }
                } else if (z9 && this.G0 && (fragmentStack.get(i7) instanceof v91)) {
                    v91 v91Var = (v91) fragmentStack.get(i7);
                    if (v91Var.g() != null && v91Var.g().f26952id == this.f48885v0) {
                        ((ActionBarLayout) getParentLayout()).d0(v91Var, false);
                        i7--;
                    }
                } else if (z9 && this.G0 && (fragmentStack.get(i7) instanceof ww) && (wwVar = (ww) fragmentStack.get(i7)) != null && (svVar = wwVar.F3) != null && svVar.c()) {
                    wwVar.F3.a();
                }
                i7++;
            }
        }
    }

    public final void w0() {
        if (this.f48872k0 == null) {
            return;
        }
        if (this.C0.usernames.size() > 1) {
            ArrayList<TLRPC.TL_username> arrayList = this.C0.usernames;
            int size = arrayList.size();
            int i7 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_username tL_username = arrayList.get(i10);
                i10++;
                if (tL_username.active) {
                    i7++;
                }
            }
            this.f48872k0.u(org.telegram.messenger.hd.M0(2131753004, null), org.telegram.messenger.hd.a0(null, null, 2131753003, Integer.valueOf(i7), Integer.valueOf(this.C0.usernames.size())), false, 2131232204, true);
            return;
        }
        this.f48872k0.u(org.telegram.messenger.hd.M0(2131753005, null), "t.me/" + this.C0.username, false, 2131232204, true);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final void x0(boolean z9) {
        String str;
        String str2;
        TLRPC.ChatFull N0 = getMessagesController().N0(this.f48885v0);
        boolean V = org.telegram.messenger.t3.V(this.f48887w0);
        TLRPC.ChatReactions chatReactions = this.K0;
        if (chatReactions != null && !(chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                int i7 = 0;
                for (int i10 = 0; i10 < tL_chatReactionsSome.reactions.size(); i10++) {
                    TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i10);
                    if (reaction instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().f25825r.get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                        if (tL_availableReaction != null) {
                            if (tL_availableReaction.inactive) {
                            }
                            i7++;
                        }
                    } else {
                        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                        }
                        i7++;
                    }
                }
                if (V) {
                    if (N0 != null && N0.paid_reactions_available) {
                        i7++;
                    }
                    if (i7 == 0) {
                        str2 = org.telegram.messenger.hd.M0(2131746378, null);
                    } else {
                        str2 = String.valueOf(i7);
                    }
                } else {
                    int min = Math.min(getMediaDataController().f25817n.size(), i7);
                    if (min == 0) {
                        str2 = org.telegram.messenger.hd.M0(2131746378, null);
                    } else {
                        str2 = org.telegram.messenger.hd.a0(null, null, 2131746383, Integer.valueOf(min), Integer.valueOf(getMediaDataController().f25817n.size()));
                    }
                }
            } else {
                str2 = org.telegram.messenger.hd.M0(2131746385, null);
            }
        } else {
            String M0 = org.telegram.messenger.hd.M0(2131746378, null);
            if (N0 != null && N0.paid_reactions_available) {
                str2 = "1";
            } else {
                str = M0;
                this.O.u(org.telegram.messenger.hd.M0(2131746386, null), str, z9, 2131232324, true);
            }
        }
        str = str2;
        this.O.u(org.telegram.messenger.hd.M0(2131746386, null), str, z9, 2131232324, true);
    }

    public final void y0(Long l10) {
        boolean z9;
        TLRPC.Chat chat = this.f48887w0;
        if (chat != null && this.K != null) {
            long j3 = 0;
            if (l10 != null) {
                if (l10.longValue() >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else {
                z9 = chat.broadcast_messages_allowed;
            }
            if (z9) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f48887w0.linked_monoforum_id));
                if (l10 != null) {
                    j3 = l10.longValue();
                } else if (M0 != null) {
                    j3 = M0.send_paid_messages_stars;
                }
                this.K.u(org.telegram.messenger.hd.M0(2131747095, null), bi.dd.a1(false, org.telegram.messenger.hd.a0(null, null, 2131747067, Long.valueOf(j3)), 0.66f, null), false, 2131232216, true);
                return;
            }
            this.K.u(org.telegram.messenger.hd.M0(2131747095, null), org.telegram.messenger.hd.M0(2131747085, null), false, 2131232216, true);
        }
    }

    @Override
    public final void T() {
    }
}
