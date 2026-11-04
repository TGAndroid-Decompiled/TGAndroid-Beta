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
public class ln extends org.telegram.ui.ActionBar.d2 implements org.telegram.ui.Components.e30, org.telegram.messenger.cs {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public LinearLayout E;
    public TLRPC.UserFull E0;
    public EditTextBoldCursor F;
    public boolean F0;
    public LinearLayout G;
    public boolean G0;
    public org.telegram.ui.Cells.x6 H;
    public boolean H0;
    public org.telegram.ui.Cells.l8 I;
    public boolean I0;
    public org.telegram.ui.Cells.l8 J;
    public boolean J0;
    public org.telegram.ui.Cells.l8 K;
    public boolean K0;
    public org.telegram.ui.Cells.l8 L;
    public TLRPC.ChatReactions L0;
    public il0 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public org.telegram.ui.Cells.l8 N;
    public boolean N0;
    public org.telegram.ui.Cells.l8 O;
    public boolean O0;
    public org.telegram.ui.Cells.l8 P;
    public boolean P0;
    public org.telegram.ui.Cells.y8 Q;
    public final ArrayList Q0;
    public org.telegram.ui.Cells.l8 R;
    public final jn R0;
    public LinearLayout S;
    public org.telegram.ui.Components.ch0 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public org.telegram.ui.Cells.l8 U;
    public org.telegram.ui.Cells.l8 V;
    public org.telegram.ui.Cells.l8 W;
    public org.telegram.ui.Cells.l8 X;
    public org.telegram.ui.Cells.l8 Y;
    public org.telegram.ui.Cells.l8 Z;
    public org.telegram.ui.ActionBar.b5 f47364a;
    public org.telegram.ui.Cells.l8 f47365a0;
    public org.telegram.ui.ActionBar.s1 f47366b;
    public org.telegram.ui.Cells.l8 f47367b0;
    public UndoView f47368c;
    public kn f47369c0;
    public LinearLayout d;
    public FrameLayout f47370d0;
    public ei.d4 f47371e;
    public org.telegram.ui.Cells.v9 f47372e0;
    public gi.n5 f47373f;
    public org.telegram.ui.Cells.l8 f47374f0;
    public org.telegram.ui.Cells.l8 f47375g0;
    public AnimatorSet h;
    public ki.b f47376h0;
    public org.telegram.ui.Cells.y8 f47377i0;
    public org.telegram.ui.Cells.l8 f47378j0;
    public org.telegram.ui.Cells.y8 f47379k0;
    public org.telegram.ui.Cells.l8 f47380l0;
    public org.telegram.ui.Cells.l8 m0;
    public RadialProgressView f47381n;
    public org.telegram.ui.Cells.l8 f47382n0;
    public org.telegram.ui.Cells.l8 f47383o0;
    public org.telegram.ui.Cells.l8 f47384p0;
    public org.telegram.ui.Cells.l8 f47385q0;
    public final org.telegram.ui.Components.u8 f47386r;
    public org.telegram.ui.Cells.l8 f47387r0;
    public final org.telegram.ui.Components.f30 f47388s;
    public org.telegram.ui.Cells.y8 f47389s0;
    public org.telegram.ui.Cells.y8 f47390t0;
    public org.telegram.ui.Cells.l8 f47391u0;
    public TLRPC.FileLocation f47392v0;
    public org.telegram.ui.Components.jt f47393w;
    public long f47394w0;
    public org.telegram.ui.Components.jm0 f47395x;
    public TLRPC.Chat f47396x0;
    public org.telegram.ui.Components.km0 f47397y;
    public TLRPC.ChatFull f47398y0;
    public TLRPC.TL_chatAdminRights f47399z0;

    public ln(Bundle bundle) {
        super(bundle);
        int i3;
        this.Q0 = new ArrayList();
        this.R0 = new jn(this);
        this.f47386r = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f47394w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.f47394w0 != 0) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f47394w0));
            if (M0 != null && org.telegram.messenger.t3.V(M0)) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            this.f47388s = new org.telegram.ui.Components.f30(i3, true, true);
            return;
        }
        this.f47388s = new org.telegram.ui.Components.f30(0, false, false);
    }

    public static void Z(ln lnVar, FrameLayout frameLayout, View view) {
        SpannableStringBuilder X2;
        if (!lnVar.G0) {
            TLRPC.ChatFull chatFull = lnVar.f47398y0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131752280, "ChannelTopicsDiscussionForbidden"));
            } else {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(lnVar.getMessagesController().f22978c5, "ChannelTopicsForbidden", new Object[0]));
            }
            org.telegram.ui.Components.fc.a0(lnVar).Q(2131624294, 36, X2).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ?? d2Var = new org.telegram.ui.ActionBar.d2(null);
        d2Var.f47043a = -lnVar.f47394w0;
        d2Var.setResourceProvider(lnVar.resourceProvider);
        boolean z10 = lnVar.F0;
        boolean z11 = lnVar.H0;
        boolean z12 = lnVar.I0;
        ei.d0 d0Var = new ei.d0(3, lnVar, view);
        d2Var.f47045c = z10;
        d2Var.d = z11;
        d2Var.f47046e = z12;
        d2Var.h = d0Var;
        lnVar.presentFragment((org.telegram.ui.ActionBar.d2) d2Var);
    }

    public static void a0(ln lnVar) {
        lnVar.f47392v0 = null;
        long j10 = lnVar.C0;
        if (j10 == 0) {
            org.telegram.messenger.hp.s1(lnVar.currentAccount).B(lnVar.f47394w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = lnVar.getMessagesController().o1(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.f27135id = new TLRPC.TL_inputPhotoEmpty();
            lnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new fn(lnVar, 2));
        }
        lnVar.s0(false, true);
        ei.d4 d4Var = lnVar.f47371e;
        org.telegram.ui.Components.u8 u8Var = lnVar.f47386r;
        Object obj = lnVar.D0;
        if (obj == null) {
            obj = lnVar.f47396x0;
        }
        d4Var.j(null, null, u8Var, obj);
        lnVar.S0.M(0);
        lnVar.f47369c0.f29595e.d();
    }

    public static void b0(ln lnVar, long j10, long j11) {
        org.telegram.messenger.hp.s1(lnVar.currentAccount).Q2(j10, j11, true, false, new c5(lnVar, 4));
    }

    public static void c0(ln lnVar) {
        int i3 = lnVar.currentAccount;
        long j10 = lnVar.C0;
        TL_bots.BotVerifierSettings botVerifierSettings = lnVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        Bundle l10 = org.telegram.ui.Cells.f1.l(16, "onlySelect", "dialogsType", true);
        l10.putBoolean("resetDelegate", false);
        uw uwVar = new uw(l10);
        uwVar.setCurrentAccount(i3);
        uwVar.D2 = new ii.o1(uwVar, i3, j10, botVerifierSettings);
        T.presentFragment(uwVar);
    }

    public static void d0(ln lnVar, org.telegram.ui.ActionBar.s1 s1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, org.telegram.messenger.e3 e3Var) {
        s1Var.dismiss();
        if (lnVar.getParentActivity() == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(35, lnVar.currentAccount, lnVar.getParentActivity(), lnVar, lnVar.getResourceProvider());
        i0Var.A1(e3Var);
        i0Var.z1(tL_premium_boostsStatus, true);
        i0Var.B1(j10);
        TLRPC.Chat M0 = lnVar.getMessagesController().M0(Long.valueOf(-j10));
        if (M0 != null) {
            i0Var.J2 = new sc(24, lnVar, M0);
        }
        lnVar.showDialog(i0Var);
    }

    public static void e0(ln lnVar) {
        pc pcVar = new pc(-lnVar.f47396x0.f27001id);
        pcVar.m0 = lnVar;
        lnVar.presentFragment(pcVar);
        org.telegram.messenger.hp.s1(lnVar.currentAccount).f22999e7.edit().putInt("boostingappearance", org.telegram.messenger.hp.s1(lnVar.currentAccount).f22999e7.getInt("boostingappearance", 0) + 1).apply();
    }

    public static void f0(ln lnVar) {
        lnVar.P0 = true;
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(lnVar.currentAccount);
        int i3 = org.telegram.messenger.hp.C8;
        f10.k(org.telegram.messenger.hs.f23292r, 2);
    }

    public static SpannableStringBuilder i0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        cz czVar = new cz(10);
        czVar.f44488a.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        czVar.f44492f = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false);
        czVar.f44493n = false;
        spannableStringBuilder.setSpan(czVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String l0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i3);
            i3++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.f47381n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f47381n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
    }

    @Override
    public final android.view.View createView(android.content.Context r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int r13, int r14, java.lang.Object... r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.f47388s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.f47388s.f33683c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final mq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f47393w.getText().toString();
    }

    @Override
    public final org.telegram.ui.Components.km0 getScrollViewForSimpleGlass() {
        return this.f47397y;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        kn knVar = this.f47369c0;
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(knVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47369c0, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28196u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47369c0, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28214v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.X, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        org.telegram.ui.Cells.l8 l8Var = this.V;
        if (l8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(l8Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.O, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47393w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28007k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47393w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28026l6));
        LinearLayout linearLayout = this.E;
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47370d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47372e0, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f47372e0, 4, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28102p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.P, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        org.telegram.ui.Cells.l8 l8Var2 = this.L;
        if (l8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(l8Var2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        }
        org.telegram.ui.Cells.l8 l8Var3 = this.f47367b0;
        if (l8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(l8Var3, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z10) {
        org.telegram.ui.Components.jt jtVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.C0 != 0) {
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.jt jtVar2 = this.f47393w;
            if ((jtVar2 != null && !this.D0.first_name.equals(jtVar2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131743736, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131752983, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new gn(this, 0));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747588, null), new gn(this, 1));
                    showDialog(s1Var);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.f47398y0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && org.telegram.messenger.t3.T(this.f47396x0) && this.f47398y0.hidden_prehistory != this.K0) || (((jtVar = this.f47393w) != null && !this.f47396x0.title.equals(jtVar.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.f47396x0.forum))) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = org.telegram.messenger.bd.M0(2131743736, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                s1Var2.S = M02;
                if (this.J0) {
                    s1Var2.U = org.telegram.messenger.bd.M0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    s1Var2.U = org.telegram.messenger.bd.M0(2131749409, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131754216, "ApplyTheme"), new gn(this, 2));
                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747588, "PassportDiscard"), new gn(this, 3));
                showDialog(s1Var2);
            }
            return false;
        }
        return true;
    }

    public final void k0() {
        String str;
        if (this.f47374f0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().P2.f(-this.f47394w0);
        if (arrayList != null && !arrayList.isEmpty()) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, arrayList);
            if (!TextUtils.isEmpty(ziVar.f26924z)) {
                str = ziVar.f26924z.toString();
            } else if (!TextUtils.isEmpty(ziVar.v)) {
                str = ziVar.v.toString();
            } else {
                str = "";
            }
        } else {
            str = null;
        }
        TLRPC.ChatFull chatFull = this.f47398y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = org.telegram.messenger.bd.M0(2131742902, null);
        }
        this.f47374f0.u(org.telegram.messenger.bd.M0(2131742908, null), str, false, 2131231926, true);
    }

    public final void m0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-this.f47394w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new fn(this, 0));
    }

    public final void n0() {
        boolean z10;
        if (this.f47392v0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47388s.n(z10, new hn(this, 0), new s5(this, 5), 0);
        this.S0.M(0);
        this.S0.P(43);
        this.f47369c0.f29595e.d();
    }

    public final void o0() {
        org.telegram.ui.Components.jt jtVar;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        if (!this.O0 && (jtVar = this.f47393w) != null) {
            if (jtVar.f35188a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(this.f47393w);
                return;
            }
            boolean z12 = true;
            this.O0 = true;
            String str3 = "";
            if (this.D0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().q1(this.D0);
                setbotinfo.flags |= 4;
                setbotinfo.lang_code = "";
                if (!this.D0.first_name.equals(this.f47393w.getText().toString())) {
                    setbotinfo.name = this.f47393w.getText().toString();
                    setbotinfo.flags |= 8;
                }
                TLRPC.UserFull userFull = this.E0;
                if (userFull != null && (str2 = userFull.about) != null) {
                    str3 = str2;
                }
                EditTextBoldCursor editTextBoldCursor = this.F;
                if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                    setbotinfo.about = this.F.getText().toString();
                    setbotinfo.flags = 1 | setbotinfo.flags;
                }
                this.f47366b = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
                this.f47366b.setOnCancelListener(new ci.b0(this, getConnectionsManager().sendRequest(setbotinfo, new org.telegram.ui.ActionBar.h6(9, this, setbotinfo)), 3));
                this.f47366b.show();
            } else if (!org.telegram.messenger.t3.T(this.f47396x0) && (!this.K0 || this.F0)) {
                getMessagesController().T(getParentActivity(), this.f47394w0, this, new gn(this, 5), null);
            } else {
                if (this.f47398y0 != null && org.telegram.messenger.t3.T(this.f47396x0)) {
                    TLRPC.ChatFull chatFull = this.f47398y0;
                    boolean z13 = chatFull.hidden_prehistory;
                    boolean z14 = this.K0;
                    if (z13 != z14) {
                        chatFull.hidden_prehistory = z14;
                        getMessagesController().b5(this.f47394w0, this.K0);
                    }
                }
                if (this.f47388s.g()) {
                    this.N0 = true;
                    org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
                    this.f47366b = s1Var;
                    s1Var.setOnCancelListener(new rf(this, 1));
                    this.f47366b.show();
                    return;
                }
                if (!this.f47396x0.title.equals(this.f47393w.getText().toString())) {
                    getMessagesController().C(this.f47394w0, this.f47393w.getText().toString(), null);
                }
                TLRPC.ChatFull chatFull2 = this.f47398y0;
                if (chatFull2 != null && (str = chatFull2.about) != null) {
                    str3 = str;
                }
                EditTextBoldCursor editTextBoldCursor2 = this.F;
                if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                    org.telegram.messenger.hp messagesController = getMessagesController();
                    long j10 = this.f47394w0;
                    String obj = this.F.getText().toString();
                    TLRPC.ChatFull chatFull3 = this.f47398y0;
                    messagesController.getClass();
                    TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
                    tL_messages_editChatAbout.peer = messagesController.j1(-j10);
                    tL_messages_editChatAbout.about = obj;
                    messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new org.telegram.messenger.uh(messagesController, chatFull3, obj, 7), 64);
                }
                boolean z15 = this.F0;
                TLRPC.Chat chat = this.f47396x0;
                boolean z16 = chat.forum;
                if (z15 != z16 || this.H0 != chat.forum_tabs || this.I0 != chat.forum_sidebar) {
                    if (this.H0 != chat.forum_tabs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.I0 != chat.forum_sidebar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z15 == z16) {
                        z12 = false;
                    }
                    getMessagesController().a5(this.f47394w0, this.F0, this.H0, this.I0);
                    if (this.F0 && !this.H0 && (z12 || z10)) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i3 = 0; i3 < fragmentStack.size(); i3++) {
                            if ((fragmentStack.get(i3) instanceof wm) && ((wm) fragmentStack.get(i3)).getArguments().getLong("chat_id") == this.f47394w0) {
                                ((ActionBarLayout) getParentLayout()).b0(i3);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.f47394w0);
                                org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
                                HashSet hashSet = m91.f47574r1;
                                ((ActionBarLayout) parentLayout).c(i3, m91.I0(getMessagesController(), getMessagesStorage(), bundle));
                            }
                        }
                    }
                    if (z10 || z11) {
                        v0(z10);
                    }
                }
                finishFragment();
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        this.f47388s.h(i3, i10, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jt jtVar = this.f47393w;
        if (jtVar != null && jtVar.f35191e) {
            if (z10) {
                jtVar.k(true);
                return false;
            }
            return false;
        }
        return j0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f47368c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.f30 f30Var = this.f47388s;
        if (f30Var != null) {
            f30Var.d();
        }
        if (this.f47396x0 != null) {
            getNotificationCenter().n(this, org.telegram.messenger.hs.T);
            getNotificationCenter().n(this, org.telegram.messenger.hs.r5);
            getNotificationCenter().n(this, org.telegram.messenger.hs.X4);
            getNotificationCenter().n(this, org.telegram.messenger.hs.L3);
        } else {
            getNotificationCenter().n(this, org.telegram.messenger.hs.E0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, org.telegram.messenger.hs.C3);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23292r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23341y1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23203b1);
        org.telegram.ui.Components.jt jtVar = this.f47393w;
        if (jtVar != null) {
            jtVar.o();
        }
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        UndoView undoView = this.f47368c;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((org.telegram.ui.Components.g5) obj).o(null);
        }
        org.telegram.ui.Components.jt jtVar = this.f47393w;
        if (jtVar != null) {
            jtVar.r();
        }
        UndoView undoView = this.f47368c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f47388s.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        this.f47388s.j(i3, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.jt jtVar = this.f47393w;
        if (jtVar != null) {
            jtVar.s();
            this.f47393w.getEditText().requestFocus();
        }
        t0();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        u0(true, true);
        this.f47388s.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            ei.d4 d4Var = this.f47371e;
            if (d4Var != null) {
                d4Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ln.p0():void");
    }

    public final void q0(TLRPC.ChatFull chatFull) {
        boolean z10;
        org.telegram.ui.Components.g5 g5Var;
        this.f47398y0 = chatFull;
        if (chatFull != null) {
            if (this.f47396x0 == null) {
                this.f47396x0 = getMessagesController().M0(Long.valueOf(this.f47394w0));
            }
            if (org.telegram.messenger.t3.T(this.f47396x0) && !this.f47398y0.hidden_prehistory) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.K0 = z10;
            this.L0 = this.f47398y0.available_reactions;
            ArrayList arrayList = this.Q0;
            arrayList.clear();
            TLRPC.Chat chat = this.f47396x0;
            TLRPC.ChatFull chatFull2 = this.f47398y0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && org.telegram.messenger.t3.V(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i3);
                        i3++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).f24045r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                g5Var = org.telegram.ui.Components.g5.l(org.telegram.messenger.h10.f22829t0, org.telegram.ui.Components.g5.f(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            g5Var = org.telegram.ui.Components.g5.m(org.telegram.messenger.h10.f22829t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.g5.f());
                        } else {
                            g5Var = null;
                        }
                        if (g5Var != null) {
                            arrayList2.add(g5Var);
                            g5Var.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).f24036n;
                    int size2 = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = arrayList4.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(org.telegram.messenger.h10.f22829t0, org.telegram.ui.Components.g5.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l10);
                            l10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.f47365a0 != null && getMessagesController().f23017g6 && org.telegram.messenger.t3.V(this.f47396x0)) {
                this.f47365a0.setVisibility(0);
            }
        }
        k0();
    }

    public final void r0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        int i3;
        TL_bots.BotInfo botInfo2;
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        String format;
        TLRPC.User a22;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j10 = this.C0;
                if (j10 == 0) {
                    a22 = null;
                } else {
                    a22 = getMessagesController().a2(Long.valueOf(j10));
                }
                this.D0 = a22;
            }
            org.telegram.ui.Cells.l8 l8Var = this.f47383o0;
            int i10 = 0;
            if (l8Var != null) {
                if (this.E0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l8Var.h(45, z10, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    org.telegram.ui.Cells.l8 l8Var2 = this.f47383o0;
                    if (userFull2.starref_program == null) {
                        format = org.telegram.messenger.bd.M0(2131754345, null);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    l8Var2.w(format, false);
                }
            }
            org.telegram.ui.Cells.l8 l8Var3 = this.f47391u0;
            if (l8Var3 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                l8Var3.setVisibility(i3);
            }
            org.telegram.ui.Cells.y8 y8Var = this.f47390t0;
            if (y8Var != null) {
                TLRPC.UserFull userFull4 = this.E0;
                if (userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) {
                    i10 = 8;
                }
                y8Var.setVisibility(i10);
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.f30 f30Var = this.f47388s;
        if (f30Var != null) {
            f30Var.f33685f = bundle.getString("path");
        }
    }

    public final void s0(boolean z10, boolean z11) {
        if (this.f47381n == null) {
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
                this.f47381n.setVisibility(0);
                this.f47373f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                RadialProgressView radialProgressView = this.f47381n;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f47373f, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f47381n;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f47373f, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new dh.x(29, this, z10));
            this.h.start();
        } else if (z10) {
            this.f47381n.setAlpha(1.0f);
            this.f47381n.setVisibility(0);
            this.f47373f.setAlpha(1.0f);
            this.f47373f.setVisibility(0);
        } else {
            this.f47381n.setAlpha(0.0f);
            this.f47381n.setVisibility(4);
            this.f47373f.setAlpha(0.0f);
            this.f47373f.setVisibility(4);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.f30 f30Var = this.f47388s;
        if (f30Var != null && (str = f30Var.f33685f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.jt jtVar = this.f47393w;
        if (jtVar != null) {
            String obj = jtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0() {
        org.telegram.ui.Cells.l8 l8Var;
        org.telegram.ui.Cells.l8 l8Var2;
        boolean z10;
        int i3;
        xl0 xl0Var;
        org.telegram.messenger.wo d;
        int w02;
        boolean q10;
        int i10;
        ArrayList<Integer> arrayList;
        int i11;
        int i12;
        il0 il0Var = this.M;
        if (il0Var != null) {
            TLRPC.Chat chat = this.f47396x0;
            org.telegram.ui.Cells.l8 l8Var3 = this.O;
            if ((l8Var3 != null && l8Var3.getVisibility() == 0) || (((l8Var = this.R) != null && l8Var.getVisibility() == 0) || ((org.telegram.messenger.t3.n0(this.f47396x0) && org.telegram.messenger.t3.N(this.f47396x0)) || ((l8Var2 = this.N) != null && l8Var2.getVisibility() == 0)))) {
                z10 = true;
            } else {
                z10 = false;
            }
            Paint paint = il0Var.f46291n;
            int i13 = il0Var.f46286a;
            org.telegram.ui.ActionBar.e6 e6Var = il0Var.d;
            if (chat != null) {
                il0Var.f46294w = z10;
                il0Var.f46292r = new org.telegram.ui.Components.ly0(org.telegram.messenger.i6.m(chat.title, org.telegram.ui.ActionBar.k6.f28077o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
                xl0 xl0Var2 = il0Var.f46295x;
                if (xl0Var2 != null) {
                    xl0Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i14 = xl0.f52042j;
                    int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
                    i3 = -16777216;
                    il0Var.f46295x = new xl0(i15, i15, i15, tL_emojiStatusCollectible.document_id);
                } else {
                    i3 = -16777216;
                    if (org.telegram.messenger.t3.I(chat) >= 0) {
                        xl0Var = xl0.c(i13, org.telegram.messenger.t3.I(chat));
                        xl0Var.f52043a = org.telegram.messenger.g0.L(11.0f);
                        xl0Var.d();
                    } else {
                        xl0Var = null;
                    }
                    il0Var.f46295x = xl0Var;
                }
                xl0 xl0Var3 = il0Var.f46295x;
                if (xl0Var3 != null) {
                    xl0Var3.e(il0Var);
                }
                TLRPC.PeerColor peerColor = chat.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    if (e6Var != null) {
                        q10 = e6Var.a();
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
                    int intValue = arrayList.get(0).intValue() | i3;
                    if (arrayList.size() >= 2) {
                        i11 = arrayList.get(1).intValue() | i3;
                    } else {
                        i11 = intValue;
                    }
                    if (arrayList.size() >= 3) {
                        i12 = arrayList.get(2).intValue() | i3;
                    } else {
                        i12 = intValue;
                    }
                    il0Var.f46292r.n(i10);
                    paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i10));
                    xl0 xl0Var4 = new xl0(intValue, i11, i12, tL_peerColorCollectible.gift_emoji_id);
                    xl0Var4.f52043a = org.telegram.messenger.g0.L(11.0f);
                    xl0Var4.d();
                    il0Var.f46296y = xl0Var4;
                    xl0Var4.e(il0Var);
                    return;
                }
                int F = org.telegram.messenger.t3.F(chat);
                if (F < 7) {
                    int i16 = org.telegram.ui.ActionBar.k6.f28142r8[F];
                    il0Var.f46293s = i16;
                    w02 = org.telegram.ui.ActionBar.k6.w0(i16, e6Var);
                } else {
                    org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23099q4;
                    if (xoVar == null) {
                        d = null;
                    } else {
                        d = xoVar.d(F);
                    }
                    if (d != null) {
                        il0Var.f46293s = -1;
                        w02 = d.f();
                    } else {
                        int i17 = org.telegram.ui.ActionBar.k6.f28142r8[0];
                        il0Var.f46293s = i17;
                        w02 = org.telegram.ui.ActionBar.k6.w0(i17, e6Var);
                    }
                }
                il0Var.f46292r.n(w02);
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
                xl0 a10 = xl0.a(i13, F);
                a10.f52043a = org.telegram.messenger.g0.L(11.0f);
                a10.d();
                il0Var.f46296y = a10;
                a10.e(il0Var);
            }
        }
    }

    public final void u0(boolean z10, boolean z11) {
        boolean z12;
        int i3;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        boolean z16;
        int i11;
        int i12;
        int i13;
        boolean z17;
        boolean z18;
        int i14;
        boolean z19;
        int i15;
        int i16;
        String str;
        boolean z20;
        boolean z21;
        float f10;
        float f11;
        int i17;
        org.telegram.ui.Cells.l8 l8Var;
        TLRPC.ChatFull chatFull;
        int i18;
        String str2;
        String M0;
        org.telegram.ui.Cells.l8 l8Var2;
        org.telegram.ui.Cells.l8 l8Var3;
        boolean z22;
        org.telegram.ui.Cells.l8 l8Var4;
        org.telegram.ui.Cells.l8 l8Var5;
        boolean z23;
        int i19;
        String str3;
        String format;
        org.telegram.ui.Cells.l8 l8Var6;
        org.telegram.ui.Cells.l8 l8Var7;
        boolean z24;
        boolean z25;
        boolean z26;
        int i20;
        int i21;
        org.telegram.ui.Cells.l8 l8Var8;
        org.telegram.ui.Cells.l8 l8Var9;
        org.telegram.ui.Cells.l8 l8Var10;
        TLRPC.Chat M02;
        if (z10 && (M02 = getMessagesController().M0(Long.valueOf(this.f47394w0))) != null) {
            this.f47396x0 = M02;
        }
        boolean t02 = org.telegram.messenger.t3.t0(this.f47396x0);
        org.telegram.ui.Cells.y8 y8Var = this.Q;
        if (y8Var != null) {
            if (this.J == null && (((l8Var8 = this.K) == null || l8Var8.getVisibility() != 0) && (((l8Var9 = this.O) == null || l8Var9.getVisibility() != 0) && ((l8Var10 = this.I) == null || l8Var10.getVisibility() != 0)))) {
                i21 = 8;
            } else {
                i21 = 0;
            }
            y8Var.setVisibility(i21);
        }
        org.telegram.ui.Cells.l8 l8Var11 = this.Z;
        if (l8Var11 != null) {
            if (org.telegram.messenger.t3.T(this.f47396x0)) {
                i20 = 0;
            } else {
                i20 = 8;
            }
            l8Var11.setVisibility(i20);
        }
        org.telegram.ui.Cells.l8 l8Var12 = this.K;
        if (l8Var12 != null) {
            TLRPC.ChatFull chatFull2 = this.f47398y0;
            if (chatFull2 != null && (this.J0 || chatFull2.linked_chat_id != 0)) {
                l8Var12.setVisibility(0);
                if (this.f47398y0.linked_chat_id == 0) {
                    this.K.u(org.telegram.messenger.bd.M0(2131751390, "Discussion"), org.telegram.messenger.bd.M0(2131751382, "DiscussionInfoShort"), false, 2131232112, true);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.f47398y0.linked_chat_id));
                    if (M03 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = org.telegram.messenger.t3.K(M03, false);
                        if (TextUtils.isEmpty(K)) {
                            this.K.u(org.telegram.messenger.bd.M0(2131751390, "Discussion"), M03.title, false, 2131232112, true);
                        } else {
                            this.K.u(org.telegram.messenger.bd.M0(2131751390, "Discussion"), t4.c.f("@", K), false, 2131232112, true);
                        }
                    } else {
                        String K2 = org.telegram.messenger.t3.K(M03, false);
                        if (TextUtils.isEmpty(K2)) {
                            org.telegram.ui.Cells.l8 l8Var13 = this.K;
                            String M04 = org.telegram.messenger.bd.M0(2131748891, "LinkedChannel");
                            String str4 = M03.title;
                            org.telegram.ui.Cells.l8 l8Var14 = this.R;
                            if (l8Var14 != null && l8Var14.getVisibility() == 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            l8Var13.u(M04, str4, false, 2131232088, z26);
                        } else {
                            org.telegram.ui.Cells.l8 l8Var15 = this.K;
                            String M05 = org.telegram.messenger.bd.M0(2131748891, "LinkedChannel");
                            String f12 = t4.c.f("@", K2);
                            org.telegram.ui.Cells.l8 l8Var16 = this.R;
                            if (l8Var16 != null && l8Var16.getVisibility() == 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            l8Var15.u(M05, f12, false, 2131232088, z25);
                        }
                    }
                }
            } else {
                l8Var12.setVisibility(8);
            }
        }
        org.telegram.ui.Cells.l8 l8Var17 = this.I;
        if (l8Var17 != null) {
            TLRPC.ChatFull chatFull3 = this.f47398y0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                l8Var17.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.f47398y0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.I.q(org.telegram.messenger.bd.M0(2131753961, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.I.q(org.telegram.messenger.bd.M0(2131753961, "AttachLocation"), "Unknown address", z11, true);
                }
            } else {
                l8Var17.setVisibility(8);
            }
        }
        if (this.J != null) {
            TLRPC.ChatFull chatFull4 = this.f47398y0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!t02) {
                    format = org.telegram.messenger.bd.M0(2131743939, "TypeLocationGroupEdit");
                } else {
                    format = String.format(a1.g.s(new StringBuilder("https://"), getMessagesController().V2, "/%s"), org.telegram.messenger.t3.K(this.f47396x0, false));
                }
                String str5 = format;
                org.telegram.ui.Cells.l8 l8Var18 = this.J;
                String M06 = org.telegram.messenger.bd.M0(2131743940, "TypeLocationGroup");
                org.telegram.ui.Cells.l8 l8Var19 = this.O;
                if ((l8Var19 != null && l8Var19.getVisibility() == 0) || (((l8Var6 = this.K) != null && l8Var6.getVisibility() == 0) || ((l8Var7 = this.R) != null && l8Var7.getVisibility() == 0))) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                l8Var18.u(M06, str5, false, 2131232088, z24);
            } else {
                boolean z27 = this.f47396x0.noforwards;
                if (this.J0) {
                    if (!t02) {
                        if (z27) {
                            i19 = 2131743931;
                            str3 = "TypePrivateRestrictedForwards";
                        } else {
                            i19 = 2131743934;
                            str3 = "TypePrivate";
                        }
                    } else {
                        i19 = 2131743930;
                        str3 = "TypePublic";
                    }
                    M0 = org.telegram.messenger.bd.M0(i19, str3);
                } else {
                    if (!t02) {
                        if (z27) {
                            i18 = 2131743932;
                            str2 = "TypePrivateGroupRestrictedForwards";
                        } else {
                            i18 = 2131743933;
                            str2 = "TypePrivateGroup";
                        }
                    } else {
                        i18 = 2131743929;
                        str2 = "TypePublicGroup";
                    }
                    M0 = org.telegram.messenger.bd.M0(i18, str2);
                }
                String str6 = M0;
                if (this.J0) {
                    org.telegram.ui.Cells.l8 l8Var20 = this.J;
                    String M07 = org.telegram.messenger.bd.M0(2131752276, "ChannelType");
                    org.telegram.ui.Cells.l8 l8Var21 = this.O;
                    if ((l8Var21 != null && l8Var21.getVisibility() == 0) || (((l8Var4 = this.K) != null && l8Var4.getVisibility() == 0) || ((l8Var5 = this.R) != null && l8Var5.getVisibility() == 0))) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    l8Var20.u(M07, str6, false, 2131232088, z23);
                } else {
                    org.telegram.ui.Cells.l8 l8Var22 = this.J;
                    String M08 = org.telegram.messenger.bd.M0(2131749400, "GroupType");
                    org.telegram.ui.Cells.l8 l8Var23 = this.O;
                    if ((l8Var23 != null && l8Var23.getVisibility() == 0) || (((l8Var2 = this.K) != null && l8Var2.getVisibility() == 0) || ((l8Var3 = this.R) != null && l8Var3.getVisibility() == 0))) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    l8Var22.u(M08, str6, false, 2131232175, z22);
                }
            }
        }
        if (this.O != null) {
            if (this.K0 && !this.F0) {
                i16 = 2131752232;
                str = "ChatHistoryHidden";
            } else {
                i16 = 2131752228;
                str = "ChatHistoryVisible";
            }
            String M09 = org.telegram.messenger.bd.M0(i16, str);
            org.telegram.ui.Cells.l8 l8Var24 = this.O;
            String M010 = org.telegram.messenger.bd.M0(2131752229, "ChatHistoryShort");
            if (this.R != null) {
                z20 = true;
            } else {
                z20 = false;
            }
            l8Var24.u(M010, M09, z11, 2131232112, z20);
            this.O.setEnabled(!this.F0);
            if (!this.F0 && !t02 && (((chatFull = this.f47398y0) == null || chatFull.linked_chat_id == 0) && (chatFull == null || !(chatFull.location instanceof TLRPC.TL_channelLocation)))) {
                z21 = true;
            } else {
                z21 = false;
            }
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f13 = 0.0f;
            if (this.O.getAlpha() <= 0.0f && !z21) {
                this.O.setVisibility(8);
                t0();
            } else {
                float f14 = 1.0f;
                if (this.O.getVisibility() != 0 || this.O.getAlpha() < 1.0f || !z21) {
                    ArrayList arrayList = new ArrayList();
                    int i22 = 0;
                    boolean z28 = false;
                    while (i22 < this.G.getChildCount()) {
                        if (!z28 && this.G.getChildAt(i22) == this.O) {
                            z28 = true;
                        } else if (z28) {
                            arrayList.add(this.G.getChildAt(i22));
                        }
                        i22++;
                        z28 = z28;
                    }
                    int i23 = 0;
                    boolean z29 = false;
                    while (i23 < this.f47395x.getChildCount()) {
                        if (!z29 && this.f47395x.getChildAt(i23) == this.G) {
                            z29 = true;
                        } else if (z29) {
                            arrayList.add(this.f47395x.getChildAt(i23));
                        }
                        i23++;
                        z29 = z29;
                    }
                    if (this.O.getVisibility() != 0) {
                        this.O.setAlpha(0.0f);
                        this.O.setTranslationY((-l8Var.getHeight()) / 2.0f);
                    }
                    this.O.setVisibility(0);
                    for (int i24 = 0; i24 < arrayList.size(); i24++) {
                        ((View) arrayList.get(i24)).setTranslationY((1.0f - this.O.getAlpha()) * (-this.O.getHeight()));
                    }
                    if (z11) {
                        float alpha = this.O.getAlpha();
                        if (z21) {
                            f13 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f13);
                        this.T0 = ofFloat;
                        ofFloat.addUpdateListener(new ci.uc(11, this, arrayList));
                        this.T0.addListener(new androidx.fragment.app.g(this, z21, arrayList, 7));
                        this.T0.setDuration(320L);
                        this.T0.setInterpolator(org.telegram.ui.Components.xq.h);
                        this.T0.start();
                    } else {
                        org.telegram.ui.Cells.l8 l8Var25 = this.O;
                        if (z21) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        l8Var25.setAlpha(f10);
                        org.telegram.ui.Cells.l8 l8Var26 = this.O;
                        float f15 = (-l8Var26.getHeight()) / 2.0f;
                        if (z21) {
                            f11 = 0.0f;
                        } else {
                            f11 = 1.0f;
                        }
                        l8Var26.setTranslationY(f15 * f11);
                        org.telegram.ui.Cells.l8 l8Var27 = this.O;
                        if (!z21) {
                            f14 = 0.0f;
                        }
                        l8Var27.setScaleY((f14 * 0.8f) + 0.2f);
                        org.telegram.ui.Cells.l8 l8Var28 = this.O;
                        if (z21) {
                            i17 = 0;
                        } else {
                            i17 = 8;
                        }
                        l8Var28.setVisibility(i17);
                        for (int i25 = 0; i25 < arrayList.size(); i25++) {
                            ((View) arrayList.get(i25)).setTranslationY(0.0f);
                        }
                        this.T0 = null;
                    }
                }
            }
        }
        if (this.U != null) {
            if (this.f47398y0 != null) {
                org.telegram.ui.Cells.l8 l8Var29 = this.V;
                if (l8Var29 != null) {
                    if (l8Var29.getParent() == null) {
                        i3 = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, b8.mf.o(-1, -2));
                    } else {
                        i3 = 0;
                    }
                    org.telegram.ui.Cells.l8 l8Var30 = this.V;
                    if (this.f47398y0.requests_pending > 0) {
                        i15 = i3;
                    } else {
                        i15 = 8;
                    }
                    l8Var30.setVisibility(i15);
                } else {
                    i3 = 0;
                }
                if (this.J0 && !org.telegram.messenger.t3.Y(this.f47396x0)) {
                    org.telegram.ui.Cells.l8 l8Var31 = this.U;
                    String M011 = org.telegram.messenger.bd.M0(2131752289, "ChannelSubscribers");
                    Object[] objArr = new Object[1];
                    objArr[i3] = Integer.valueOf(this.f47398y0.participants_count);
                    l8Var31.u(M011, String.format("%d", objArr), false, 2131232175, true);
                    org.telegram.ui.Cells.l8 l8Var32 = this.Y;
                    CharSequence M012 = org.telegram.messenger.bd.M0(2131752453, null);
                    TLRPC.ChatFull chatFull5 = this.f47398y0;
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                    CharSequence format2 = String.format("%d", objArr2);
                    org.telegram.ui.Cells.l8 l8Var33 = this.Z;
                    if (l8Var33 != null && l8Var33.getVisibility() == 0) {
                        z19 = 1;
                    } else {
                        z19 = i3;
                    }
                    l8Var32.u(M012, format2, false, 2131232415, z19);
                    z12 = z11;
                } else {
                    if (org.telegram.messenger.t3.T(this.f47396x0)) {
                        org.telegram.ui.Cells.l8 l8Var34 = this.U;
                        String M013 = org.telegram.messenger.bd.M0(2131752377, "ChannelMembers");
                        Object[] objArr3 = new Object[1];
                        objArr3[i3] = Integer.valueOf(this.f47398y0.participants_count);
                        l8Var34.u(M013, String.format("%d", objArr3), false, 2131232175, true);
                    } else {
                        org.telegram.ui.Cells.l8 l8Var35 = this.U;
                        CharSequence M014 = org.telegram.messenger.bd.M0(2131752377, "ChannelMembers");
                        Object[] objArr4 = new Object[1];
                        objArr4[i3] = Integer.valueOf(this.f47398y0.participants.participants.size());
                        CharSequence format3 = String.format("%d", objArr4);
                        if (this.V.getVisibility() == 0) {
                            z16 = 1;
                        } else {
                            z16 = i3;
                        }
                        l8Var35.u(M014, format3, false, 2131232175, z16);
                    }
                    TLRPC.Chat chat = this.f47396x0;
                    if (chat.gigagroup && !org.telegram.messenger.t3.Y(chat)) {
                        org.telegram.ui.Cells.l8 l8Var36 = this.Y;
                        CharSequence M015 = org.telegram.messenger.bd.M0(2131752453, null);
                        TLRPC.ChatFull chatFull6 = this.f47398y0;
                        Object[] objArr5 = new Object[1];
                        objArr5[i3] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                        CharSequence format4 = String.format("%d", objArr5);
                        org.telegram.ui.Cells.l8 l8Var37 = this.Z;
                        if (l8Var37 != null && l8Var37.getVisibility() == 0) {
                            z18 = 1;
                        } else {
                            z18 = i3;
                        }
                        l8Var36.u(M015, format4, false, 2131232415, z18);
                        z12 = z11;
                    } else {
                        if (this.F0) {
                            i11 = 16;
                        } else {
                            i11 = 15;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f47396x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i26 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i26++;
                            }
                            i12 = nq.s0(tL_chatBannedRights) + i26;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f47396x0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i12++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i12++;
                            }
                            if (this.F0 && !tL_chatBannedRights2.manage_topics) {
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
                        org.telegram.ui.Cells.l8 l8Var38 = this.Y;
                        String M016 = org.telegram.messenger.bd.M0(2131752333, null);
                        Integer valueOf = Integer.valueOf(i12);
                        Integer valueOf2 = Integer.valueOf(i13);
                        Object[] objArr6 = new Object[2];
                        objArr6[i3] = valueOf;
                        objArr6[1] = valueOf2;
                        l8Var38.u(M016, String.format("%d/%d", objArr6), z11, 2131232276, true);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.l8 l8Var39 = this.V;
                    if (l8Var39 != null) {
                        CharSequence M017 = org.telegram.messenger.bd.M0(2131748643, "MemberRequests");
                        Object[] objArr7 = new Object[1];
                        objArr7[i3] = Integer.valueOf(this.f47398y0.requests_pending);
                        CharSequence format5 = String.format("%d", objArr7);
                        org.telegram.ui.Cells.l8 l8Var40 = this.Z;
                        if (l8Var40 != null && l8Var40.getVisibility() == 0) {
                            z17 = 1;
                        } else {
                            z17 = i3;
                        }
                        l8Var39.u(M017, format5, false, 2131232340, z17);
                    }
                }
                org.telegram.ui.Cells.l8 l8Var41 = this.X;
                String M018 = org.telegram.messenger.bd.M0(2131752517, "ChannelAdministrators");
                if (org.telegram.messenger.t3.T(this.f47396x0)) {
                    i14 = this.f47398y0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.f47398y0;
                    if (chatFull7 == null) {
                        i14 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i27 = i3;
                        int i28 = i27;
                        while (i27 < size) {
                            TLRPC.ChatParticipant chatParticipant = this.f47398y0.participants.participants.get(i27);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i28++;
                            }
                            i27++;
                        }
                        i14 = i28;
                    }
                }
                Object[] objArr8 = new Object[1];
                objArr8[i3] = Integer.valueOf(i14);
                l8Var41.u(M018, String.format("%d", objArr8), false, 2131232049, true);
            } else {
                z12 = z11;
                i3 = 0;
                if (this.J0 && !org.telegram.messenger.t3.Y(this.f47396x0)) {
                    this.U.o(2131232175, org.telegram.messenger.bd.M0(2131752289, "ChannelSubscribers"), true);
                    org.telegram.ui.Cells.l8 l8Var42 = this.Y;
                    String M019 = org.telegram.messenger.bd.M0(2131752453, null);
                    org.telegram.ui.Cells.l8 l8Var43 = this.Z;
                    if (l8Var43 != null && l8Var43.getVisibility() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    l8Var42.o(2131232090, M019, z15);
                } else {
                    org.telegram.ui.Cells.l8 l8Var44 = this.U;
                    String M020 = org.telegram.messenger.bd.M0(2131752377, "ChannelMembers");
                    org.telegram.ui.Cells.l8 l8Var45 = this.Z;
                    if (l8Var45 != null && l8Var45.getVisibility() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    l8Var44.o(2131232175, M020, z13);
                    if (this.f47396x0.gigagroup) {
                        org.telegram.ui.Cells.l8 l8Var46 = this.Y;
                        String M021 = org.telegram.messenger.bd.M0(2131752453, null);
                        org.telegram.ui.Cells.l8 l8Var47 = this.Z;
                        if (l8Var47 != null && l8Var47.getVisibility() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        l8Var46.o(2131232090, M021, z14);
                    } else {
                        this.Y.o(2131232276, org.telegram.messenger.bd.M0(2131752333, null), true);
                    }
                }
                this.X.o(2131232049, org.telegram.messenger.bd.M0(2131752517, "ChannelAdministrators"), true);
            }
            org.telegram.ui.Cells.l8 l8Var48 = this.P;
            if (org.telegram.messenger.t3.w(1, this.f47396x0)) {
                i10 = i3;
            } else {
                i10 = 8;
            }
            l8Var48.setVisibility(i10);
            x0(z12);
            if (this.f47398y0 != null && org.telegram.messenger.t3.y(3, this.f47396x0) && (!t02 || !this.f47396x0.creator)) {
                if (this.f47398y0.invitesCount > 0) {
                    this.W.u(org.telegram.messenger.bd.M0(2131749148, "InviteLinks"), Integer.toString(this.f47398y0.invitesCount), false, 2131232204, true);
                } else {
                    this.W.u(org.telegram.messenger.bd.M0(2131749148, "InviteLinks"), "1", false, 2131232204, true);
                }
            } else {
                this.W.setVisibility(8);
            }
        }
        if (this.L != null) {
            y0(null);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z10) {
        uw uwVar;
        pv pvVar;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i3 = 0;
            while (i3 < fragmentStack.size()) {
                if (fragmentStack.get(i3) instanceof wm) {
                    wm wmVar = (wm) fragmentStack.get(i3);
                    if (wmVar.getArguments().getLong("chat_id") == this.f47394w0) {
                        ((ActionBarLayout) getParentLayout()).d0(wmVar, false);
                        wmVar.clearViews();
                        if (((ActionBarLayout) getParentLayout()).c(i3, wmVar)) {
                            org.telegram.messenger.hs.e().j(wmVar.f51247aa);
                        }
                        if (z10 && !this.H0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.f47394w0);
                            ((ActionBarLayout) getParentLayout()).c(i3, new m91(bundle));
                            i3++;
                        }
                    }
                } else if (z10 && this.H0 && (fragmentStack.get(i3) instanceof m91)) {
                    m91 m91Var = (m91) fragmentStack.get(i3);
                    if (m91Var.g() != null && m91Var.g().f27001id == this.f47394w0) {
                        ((ActionBarLayout) getParentLayout()).d0(m91Var, false);
                        i3--;
                    }
                } else if (z10 && this.H0 && (fragmentStack.get(i3) instanceof uw) && (uwVar = (uw) fragmentStack.get(i3)) != null && (pvVar = uwVar.G3) != null && pvVar.c()) {
                    uwVar.G3.a();
                }
                i3++;
            }
        }
    }

    public final void w0() {
        if (this.f47380l0 == null) {
            return;
        }
        if (this.D0.usernames.size() > 1) {
            ArrayList<TLRPC.TL_username> arrayList = this.D0.usernames;
            int size = arrayList.size();
            int i3 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_username tL_username = arrayList.get(i10);
                i10++;
                if (tL_username.active) {
                    i3++;
                }
            }
            this.f47380l0.u(org.telegram.messenger.bd.M0(2131753004, null), org.telegram.messenger.bd.a0(null, null, 2131753003, Integer.valueOf(i3), Integer.valueOf(this.D0.usernames.size())), false, 2131232204, true);
            return;
        }
        this.f47380l0.u(org.telegram.messenger.bd.M0(2131753005, null), "t.me/" + this.D0.username, false, 2131232204, true);
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final void x0(boolean z10) {
        String str;
        String str2;
        TLRPC.ChatFull N0 = getMessagesController().N0(this.f47394w0);
        boolean V = org.telegram.messenger.t3.V(this.f47396x0);
        TLRPC.ChatReactions chatReactions = this.L0;
        if (chatReactions != null && !(chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                int i3 = 0;
                for (int i10 = 0; i10 < tL_chatReactionsSome.reactions.size(); i10++) {
                    TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i10);
                    if (reaction instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().f24045r.get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                        if (tL_availableReaction != null) {
                            if (tL_availableReaction.inactive) {
                            }
                            i3++;
                        }
                    } else {
                        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                        }
                        i3++;
                    }
                }
                if (V) {
                    if (N0 != null && N0.paid_reactions_available) {
                        i3++;
                    }
                    if (i3 == 0) {
                        str2 = org.telegram.messenger.bd.M0(2131746387, null);
                    } else {
                        str2 = String.valueOf(i3);
                    }
                } else {
                    int min = Math.min(getMediaDataController().f24036n.size(), i3);
                    if (min == 0) {
                        str2 = org.telegram.messenger.bd.M0(2131746387, null);
                    } else {
                        str2 = org.telegram.messenger.bd.a0(null, null, 2131746392, Integer.valueOf(min), Integer.valueOf(getMediaDataController().f24036n.size()));
                    }
                }
            } else {
                str2 = org.telegram.messenger.bd.M0(2131746394, null);
            }
        } else {
            String M0 = org.telegram.messenger.bd.M0(2131746387, null);
            if (N0 != null && N0.paid_reactions_available) {
                str2 = "1";
            } else {
                str = M0;
                this.P.u(org.telegram.messenger.bd.M0(2131746395, null), str, z10, 2131232324, true);
            }
        }
        str = str2;
        this.P.u(org.telegram.messenger.bd.M0(2131746395, null), str, z10, 2131232324, true);
    }

    public final void y0(Long l10) {
        boolean z10;
        TLRPC.Chat chat = this.f47396x0;
        if (chat != null && this.L != null) {
            long j10 = 0;
            if (l10 != null) {
                if (l10.longValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = chat.broadcast_messages_allowed;
            }
            if (z10) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f47396x0.linked_monoforum_id));
                if (l10 != null) {
                    j10 = l10.longValue();
                } else if (M0 != null) {
                    j10 = M0.send_paid_messages_stars;
                }
                this.L.u(org.telegram.messenger.bd.M0(2131747104, null), ci.wb.a1(false, org.telegram.messenger.bd.a0(null, null, 2131747076, Long.valueOf(j10)), 0.66f, null), false, 2131232216, true);
                return;
            }
            this.L.u(org.telegram.messenger.bd.M0(2131747104, null), org.telegram.messenger.bd.M0(2131747094, null), false, 2131232216, true);
        }
    }

    @Override
    public final void T() {
    }
}
