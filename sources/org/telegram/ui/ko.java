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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public class ko extends org.telegram.ui.ActionBar.o2 implements org.telegram.ui.Components.b50, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_chatBannedRights A0;
    public final long B0;
    public TLRPC.User C0;
    public TLRPC.UserFull D0;
    public EditTextBoldCursor E;
    public boolean E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.b7 G;
    public boolean G0;
    public org.telegram.ui.Cells.r8 H;
    public boolean H0;
    public org.telegram.ui.Cells.r8 I;
    public boolean I0;
    public org.telegram.ui.Cells.r8 J;
    public TLRPC.ChatReactions J0;
    public org.telegram.ui.Cells.r8 K;
    public TL_stories.TL_premium_boostsStatus K0;
    public po0 L;
    public boolean L0;
    public org.telegram.ui.Cells.r8 M;
    public boolean M0;
    public org.telegram.ui.Cells.r8 N;
    public boolean N0;
    public org.telegram.ui.Cells.r8 O;
    public final ArrayList O0;
    public org.telegram.ui.Cells.e9 P;
    public final io P0;
    public org.telegram.ui.Cells.r8 Q;
    public org.telegram.ui.Components.xj0 Q0;
    public LinearLayout R;
    public ValueAnimator R0;
    public LinearLayout S;
    public org.telegram.ui.Cells.r8 T;
    public org.telegram.ui.Cells.r8 U;
    public org.telegram.ui.Cells.r8 V;
    public org.telegram.ui.Cells.r8 W;
    public org.telegram.ui.Cells.r8 X;
    public org.telegram.ui.Cells.r8 Y;
    public org.telegram.ui.Cells.r8 Z;
    public org.telegram.ui.ActionBar.u0 f38951a;
    public org.telegram.ui.Cells.r8 f38952a0;
    public org.telegram.ui.ActionBar.c2 f38953b;
    public jo f38954b0;
    public UndoView f38955c;
    public FrameLayout f38956c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.ca f38957d0;
    public ci.j4 e;
    public org.telegram.ui.Cells.r8 f38958e0;
    public ei.g6 f38959f;
    public org.telegram.ui.Cells.r8 f38960f0;
    public ii.b f38961g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.e9 f38962h0;
    public org.telegram.ui.Cells.r8 f38963i0;
    public org.telegram.ui.Cells.e9 f38964j0;
    public org.telegram.ui.Cells.r8 f38965k0;
    public org.telegram.ui.Cells.r8 f38966l0;
    public org.telegram.ui.Cells.r8 m0;
    public RadialProgressView f38967n;
    public org.telegram.ui.Cells.r8 f38968n0;
    public org.telegram.ui.Cells.r8 f38969o0;
    public org.telegram.ui.Cells.r8 f38970p0;
    public org.telegram.ui.Cells.r8 f38971q0;
    public final org.telegram.ui.Components.f9 f38972r;
    public org.telegram.ui.Cells.e9 f38973r0;
    public final org.telegram.ui.Components.c50 f38974s;
    public org.telegram.ui.Cells.e9 f38975s0;
    public org.telegram.ui.Cells.r8 f38976t0;
    public TLRPC.FileLocation f38977u0;
    public org.telegram.ui.Components.ou v;
    public long f38978v0;
    public ai.r f38979w;
    public TLRPC.Chat f38980w0;
    public org.telegram.ui.Components.ap0 f38981x;
    public TLRPC.ChatFull f38982x0;
    public LinearLayout f38983y;
    public TLRPC.TL_chatAdminRights f38984y0;
    public TLRPC.TL_chatBannedRights f38985z0;

    public ko(Bundle bundle) {
        super(bundle);
        int i10;
        this.O0 = new ArrayList();
        this.P0 = new io(this);
        this.f38972r = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        this.f38978v0 = bundle.getLong("chat_id", 0L);
        this.B0 = bundle.getLong("user_id", 0L);
        if (this.f38978v0 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f38978v0));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f38974s = new org.telegram.ui.Components.c50(i10, true, true);
            return;
        }
        this.f38974s = new org.telegram.ui.Components.c50(0, false, false);
    }

    public static void U(ko koVar, FrameLayout frameLayout, View view) {
        SpannableStringBuilder replaceTags;
        if (!koVar.F0) {
            TLRPC.ChatFull chatFull = koVar.f38982x0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", koVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0]));
            }
            org.telegram.ui.Components.vc.a0(koVar).Q(R.raw.topics, 36, replaceTags).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
        o2Var.f43428a = -koVar.f38978v0;
        o2Var.setResourceProvider(koVar.resourceProvider);
        boolean z10 = koVar.E0;
        boolean z11 = koVar.G0;
        ai.r5 r5Var = new ai.r5(12, koVar, view);
        o2Var.f43430c = z10;
        o2Var.d = z11;
        o2Var.f43431f = r5Var;
        koVar.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
    }

    public static void V(ko koVar) {
        koVar.f38977u0 = null;
        long j10 = koVar.B0;
        if (j10 == 0) {
            MessagesController.getInstance(koVar.currentAccount).changeChatAvatar(koVar.f38978v0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = koVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.f20476id = new TLRPC.TL_inputPhotoEmpty();
            koVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new bo(koVar, 2));
        }
        koVar.n0(false, true);
        ci.j4 j4Var = koVar.e;
        org.telegram.ui.Components.f9 f9Var = koVar.f38972r;
        Object obj = koVar.C0;
        if (obj == null) {
            obj = koVar.f38980w0;
        }
        j4Var.h(null, null, f9Var, obj);
        koVar.Q0.M(0);
        koVar.f38954b0.e.d();
    }

    public static void W(ko koVar, long j10, long j11) {
        MessagesController.getInstance(koVar.currentAccount).unlinkCommunity(j10, j11, new f5(koVar, 4));
    }

    public static void X(ko koVar) {
        int i10 = koVar.currentAccount;
        long j10 = koVar.B0;
        TL_bots.BotVerifierSettings botVerifierSettings = koVar.D0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e = org.telegram.messenger.v0.e(16, "onlySelect", "dialogsType", true);
        e.putBoolean("resetDelegate", false);
        ey eyVar = new ey(e);
        eyVar.setCurrentAccount(i10);
        eyVar.C2 = new gi.q1(eyVar, i10, j10, botVerifierSettings);
        U.presentFragment(eyVar);
    }

    public static void Y(ko koVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        c2Var.dismiss();
        if (koVar.getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(35, koVar.currentAccount, koVar.getParentActivity(), koVar, koVar.getResourceProvider());
        j0Var.K1(canApplyBoost);
        j0Var.J1(tL_premium_boostsStatus, true);
        j0Var.L1(j10);
        TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.Q0 = new eh(11, koVar, chat);
        }
        koVar.showDialog(j0Var);
    }

    public static void Z(ko koVar) {
        bd bdVar = new bd(-koVar.f38980w0.f20344id);
        bdVar.f36030l0 = koVar;
        koVar.presentFragment(bdVar);
        MessagesController.getInstance(koVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(koVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static void a0(ko koVar) {
        koVar.N0 = true;
        NotificationCenter.getInstance(koVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static org.telegram.ui.ActionBar.k b0(ko koVar) {
        return koVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k c0(ko koVar) {
        return koVar.actionBar;
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        o00 o00Var = new o00(10);
        o00Var.f40043a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        o00Var.f40046f = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lj, false);
        o00Var.f40047n = false;
        spannableStringBuilder.setSpan(o00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String g0(TLRPC.User user) {
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
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.f38967n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f38967n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21347m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
    }

    @Override
    public final android.view.View createView(android.content.Context r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ko.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int r12, int r13, java.lang.Object... r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ko.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.f38974s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.f38974s.f25187c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final boolean e0(boolean z10) {
        org.telegram.ui.Components.ou ouVar;
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
            org.telegram.ui.Components.ou ouVar2 = this.v;
            if ((ouVar2 != null && !this.C0.first_name.equals(ouVar2.getText().toString())) || ((editTextBoldCursor2 = this.E) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.BotSettingsChangedAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new co(this, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new co(this, 1));
                    showDialog(alertDialog$Builder.f20679a);
                    return false;
                }
            } else {
                return true;
            }
        } else {
            TLRPC.ChatFull chatFull = this.f38982x0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull != null && ChatObject.isChannel(this.f38980w0) && this.f38982x0.hidden_prehistory != this.I0) || (((ouVar = this.v) != null && !this.f38980w0.title.equals(ouVar.getText().toString())) || (((editTextBoldCursor = this.E) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.E0 != this.f38980w0.forum))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f20679a.R = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                    if (this.H0) {
                        alertDialog$Builder2.f20679a.T = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                    } else {
                        alertDialog$Builder2.f20679a.T = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                    }
                    alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new co(this, 2));
                    alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new co(this, 3));
                    showDialog(alertDialog$Builder2.f20679a);
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void f0() {
        if (this.f38958e0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.f38978v0);
        TLRPC.ChatFull chatFull = this.f38982x0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.f38958e0.u(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    @Override
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        jo joVar = this.f38954b0;
        int i10 = org.telegram.ui.ActionBar.k6.f21273i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(joVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f38954b0, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21500u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f38954b0, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21517v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.V, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.Cells.r8 r8Var = this.U;
        if (r8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(r8Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.X, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.N, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21311k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21328l6));
        LinearLayout linearLayout = this.f38983y;
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f38956c0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f38957d0, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f38957d0, 4, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21405p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.O, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.Cells.r8 r8Var2 = this.K;
        if (r8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(r8Var2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        }
        org.telegram.ui.Cells.r8 r8Var3 = this.f38952a0;
        if (r8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(r8Var3, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.f38978v0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new bo(this, 0));
    }

    public final void i0() {
        boolean z10;
        if (this.f38977u0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38974s.n(z10, new eo(this, 0), new v5(this, 5), 0);
        this.Q0.M(0);
        this.Q0.P(43);
        this.f38954b0.e.d();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.ou ouVar;
        String str;
        String str2;
        if (!this.M0 && (ouVar = this.v) != null) {
            if (ouVar.f29381a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(this.v);
                return;
            }
            boolean z10 = true;
            this.M0 = true;
            String str3 = "";
            if (this.C0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().getInputUser(this.C0);
                setbotinfo.flags |= 4;
                setbotinfo.lang_code = "";
                if (!this.C0.first_name.equals(this.v.getText().toString())) {
                    setbotinfo.name = this.v.getText().toString();
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
                this.f38953b = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                this.f38953b.setOnCancelListener(new ai.e0(this, getConnectionsManager().sendRequest(setbotinfo, new vc(7, this, setbotinfo)), 3));
                this.f38953b.show();
            } else if (!ChatObject.isChannel(this.f38980w0) && (!this.I0 || this.E0)) {
                getMessagesController().convertToMegaGroup(getParentActivity(), this.f38978v0, this, new co(this, 5));
            } else {
                if (this.f38982x0 != null && ChatObject.isChannel(this.f38980w0)) {
                    TLRPC.ChatFull chatFull = this.f38982x0;
                    boolean z11 = chatFull.hidden_prehistory;
                    boolean z12 = this.I0;
                    if (z11 != z12) {
                        chatFull.hidden_prehistory = z12;
                        getMessagesController().toggleChannelInvitesHistory(this.f38978v0, this.I0);
                    }
                }
                if (this.f38974s.g()) {
                    this.L0 = true;
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                    this.f38953b = c2Var;
                    c2Var.setOnCancelListener(new gg(this, 1));
                    this.f38953b.show();
                    return;
                }
                if (!this.f38980w0.title.equals(this.v.getText().toString())) {
                    getMessagesController().changeChatTitle(this.f38978v0, this.v.getText().toString());
                }
                TLRPC.ChatFull chatFull2 = this.f38982x0;
                if (chatFull2 != null && (str = chatFull2.about) != null) {
                    str3 = str;
                }
                EditTextBoldCursor editTextBoldCursor2 = this.E;
                if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                    getMessagesController().updateChatAbout(this.f38978v0, this.E.getText().toString(), this.f38982x0);
                }
                boolean z13 = this.E0;
                TLRPC.Chat chat = this.f38980w0;
                if (z13 != chat.forum || this.G0 != chat.forum_tabs) {
                    if (this.G0 == chat.forum_tabs) {
                        z10 = false;
                    }
                    getMessagesController().toggleChannelForum(this.f38978v0, this.E0, this.G0);
                    if (this.E0 && !this.G0) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i10 = 0; i10 < fragmentStack.size(); i10++) {
                            if ((fragmentStack.get(i10) instanceof sn) && ((sn) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.f38978v0) {
                                ((ActionBarLayout) getParentLayout()).Z(i10);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.f38978v0);
                                org.telegram.ui.ActionBar.h5 parentLayout = getParentLayout();
                                HashSet hashSet = xe1.f43544q1;
                                ((ActionBarLayout) parentLayout).c(i10, xe1.D0(getMessagesController(), getMessagesStorage(), bundle));
                            }
                        }
                    }
                    if (z10) {
                        q0();
                    }
                }
                finishFragment();
            }
        }
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ko.k0():void");
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        boolean z10;
        org.telegram.ui.Components.p5 p5Var;
        this.f38982x0 = chatFull;
        if (chatFull != null) {
            if (this.f38980w0 == null) {
                this.f38980w0 = getMessagesController().getChat(Long.valueOf(this.f38978v0));
            }
            if (ChatObject.isChannel(this.f38980w0) && !this.f38982x0.hidden_prehistory) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.I0 = z10;
            this.J0 = this.f38982x0.available_reactions;
            ArrayList arrayList = this.O0;
            arrayList.clear();
            TLRPC.Chat chat = this.f38980w0;
            TLRPC.ChatFull chatFull2 = this.f38982x0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                p5Var = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, org.telegram.ui.Components.p5.g(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            p5Var = org.telegram.ui.Components.p5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.p5.g());
                        } else {
                            p5Var = null;
                        }
                        if (p5Var != null) {
                            arrayList2.add(p5Var);
                            p5Var.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, org.telegram.ui.Components.p5.g(), tL_availableReaction2.activate_animation);
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.Z != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.f38980w0)) {
                this.Z.setVisibility(0);
            }
        }
        f0();
    }

    public final void m0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        int i10;
        TL_bots.BotInfo botInfo2;
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        String format;
        TLRPC.User user;
        this.D0 = userFull;
        if (userFull != null) {
            if (this.C0 == null) {
                long j10 = this.B0;
                if (j10 == 0) {
                    user = null;
                } else {
                    user = getMessagesController().getUser(Long.valueOf(j10));
                }
                this.C0 = user;
            }
            org.telegram.ui.Cells.r8 r8Var = this.f38968n0;
            int i11 = 0;
            if (r8Var != null) {
                if (this.D0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r8Var.h(45, z10, true);
                TLRPC.UserFull userFull2 = this.D0;
                if (userFull2 != null) {
                    org.telegram.ui.Cells.r8 r8Var2 = this.f38968n0;
                    if (userFull2.starref_program == null) {
                        format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    r8Var2.w(format, false);
                }
            }
            org.telegram.ui.Cells.r8 r8Var3 = this.f38976t0;
            if (r8Var3 != null) {
                TLRPC.UserFull userFull3 = this.D0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                r8Var3.setVisibility(i10);
            }
            org.telegram.ui.Cells.e9 e9Var = this.f38975s0;
            if (e9Var != null) {
                TLRPC.UserFull userFull4 = this.D0;
                if (userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) {
                    i11 = 8;
                }
                e9Var.setVisibility(i11);
            }
        }
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.f38967n == null) {
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
                this.f38967n.setVisibility(0);
                this.f38959f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                RadialProgressView radialProgressView = this.f38967n;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f38959f, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f38967n;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f38959f, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new ho(0, this, z10));
            this.h.start();
        } else if (z10) {
            this.f38967n.setAlpha(1.0f);
            this.f38967n.setVisibility(0);
            this.f38959f.setAlpha(1.0f);
            this.f38959f.setVisibility(0);
        } else {
            this.f38967n.setAlpha(0.0f);
            this.f38967n.setVisibility(4);
            this.f38959f.setAlpha(0.0f);
            this.f38959f.setVisibility(4);
        }
    }

    public final void o0() {
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        boolean z10;
        fp0 fp0Var;
        int w02;
        boolean q6;
        int i10;
        ArrayList<Integer> arrayList;
        int i11;
        int i12;
        po0 po0Var = this.L;
        if (po0Var != null) {
            TLRPC.Chat chat = this.f38980w0;
            org.telegram.ui.Cells.r8 r8Var3 = this.N;
            if ((r8Var3 != null && r8Var3.getVisibility() == 0) || (((r8Var = this.Q) != null && r8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.f38980w0) && ChatObject.hasAdminRights(this.f38980w0)) || ((r8Var2 = this.M) != null && r8Var2.getVisibility() == 0)))) {
                z10 = true;
            } else {
                z10 = false;
            }
            Paint paint = po0Var.f40608n;
            int i13 = po0Var.f40604a;
            org.telegram.ui.ActionBar.g6 g6Var = po0Var.d;
            if (chat != null) {
                po0Var.v = z10;
                po0Var.f40609r = new org.telegram.ui.Components.h11(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.k6.f21383o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
                fp0 fp0Var2 = po0Var.f40611w;
                MessagesController.PeerColor peerColor = null;
                if (fp0Var2 != null) {
                    fp0Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i14 = fp0.f37364j;
                    int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
                    po0Var.f40611w = new fp0(tL_emojiStatusCollectible.document_id, i15, i15, i15);
                } else {
                    if (ChatObject.getProfileColorId(chat) >= 0) {
                        fp0Var = fp0.c(i13, ChatObject.getProfileColorId(chat));
                        fp0Var.f37365a = AndroidUtilities.dp(11.0f);
                        fp0Var.d();
                    } else {
                        fp0Var = null;
                    }
                    po0Var.f40611w = fp0Var;
                }
                fp0 fp0Var3 = po0Var.f40611w;
                if (fp0Var3 != null) {
                    fp0Var3.e(po0Var);
                }
                TLRPC.PeerColor peerColor2 = chat.color;
                if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
                    if (g6Var != null) {
                        q6 = g6Var.a();
                    } else {
                        q6 = org.telegram.ui.ActionBar.k6.I.q();
                    }
                    if (q6 && (tL_peerColorCollectible.flags & 1) != 0) {
                        i10 = tL_peerColorCollectible.dark_accent_color;
                    } else {
                        i10 = tL_peerColorCollectible.accent_color;
                    }
                    if (!q6 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    int intValue = arrayList.get(0).intValue() | (-16777216);
                    if (arrayList.size() >= 2) {
                        i11 = arrayList.get(1).intValue() | (-16777216);
                    } else {
                        i11 = intValue;
                    }
                    if (arrayList.size() >= 3) {
                        i12 = arrayList.get(2).intValue() | (-16777216);
                    } else {
                        i12 = intValue;
                    }
                    po0Var.f40609r.o(i10);
                    paint.setColor(org.telegram.ui.ActionBar.k6.o1(0.1f, i10));
                    fp0 fp0Var4 = new fp0(tL_peerColorCollectible.gift_emoji_id, intValue, i11, i12);
                    fp0Var4.f37365a = AndroidUtilities.dp(11.0f);
                    fp0Var4.d();
                    po0Var.f40612x = fp0Var4;
                    fp0Var4.e(po0Var);
                    return;
                }
                int colorId = ChatObject.getColorId(chat);
                if (colorId < 7) {
                    int i16 = org.telegram.ui.ActionBar.k6.f21443r8[colorId];
                    po0Var.f40610s = i16;
                    w02 = org.telegram.ui.ActionBar.k6.w0(i16, g6Var);
                } else {
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                    if (peerColors != null) {
                        peerColor = peerColors.getColor(colorId);
                    }
                    if (peerColor != null) {
                        po0Var.f40610s = -1;
                        w02 = peerColor.getColor1();
                    } else {
                        int i17 = org.telegram.ui.ActionBar.k6.f21443r8[0];
                        po0Var.f40610s = i17;
                        w02 = org.telegram.ui.ActionBar.k6.w0(i17, g6Var);
                    }
                }
                po0Var.f40609r.o(w02);
                paint.setColor(org.telegram.ui.ActionBar.k6.o1(0.1f, w02));
                fp0 a2 = fp0.a(i13, colorId);
                a2.f37365a = AndroidUtilities.dp(11.0f);
                a2.d();
                po0Var.f40612x = a2;
                a2.e(po0Var);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.f38974s.h(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ou ouVar = this.v;
        if (ouVar != null && ouVar.e) {
            if (z10) {
                ouVar.k(true);
                return false;
            }
            return false;
        }
        return e0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f38955c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ko.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.c50 c50Var = this.f38974s;
        if (c50Var != null) {
            c50Var.d();
        }
        if (this.f38980w0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.C0.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        org.telegram.ui.Components.ou ouVar = this.v;
        if (ouVar != null) {
            ouVar.o();
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ai.r rVar = this.f38979w;
        if (rVar != null) {
            rVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.f38955c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.O0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.p5) obj).p(null);
        }
        org.telegram.ui.Components.ou ouVar = this.v;
        if (ouVar != null) {
            ouVar.r();
        }
        UndoView undoView = this.f38955c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.f38974s.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.f38974s.j(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ou ouVar = this.v;
        if (ouVar != null) {
            ouVar.s();
            this.v.getEditText().requestFocus();
        }
        o0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        p0(true, true);
        this.f38974s.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            ci.j4 j4Var = this.e;
            if (j4Var != null) {
                j4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        int i11;
        int i12;
        boolean z17;
        boolean z18;
        int i13;
        boolean z19;
        int i14;
        int i15;
        String str;
        boolean z20;
        boolean z21;
        float f7;
        float f10;
        int i16;
        org.telegram.ui.Cells.r8 r8Var;
        TLRPC.ChatFull chatFull;
        int i17;
        String str2;
        String string;
        org.telegram.ui.Cells.r8 r8Var2;
        org.telegram.ui.Cells.r8 r8Var3;
        boolean z22;
        org.telegram.ui.Cells.r8 r8Var4;
        org.telegram.ui.Cells.r8 r8Var5;
        boolean z23;
        int i18;
        String str3;
        String format;
        org.telegram.ui.Cells.r8 r8Var6;
        org.telegram.ui.Cells.r8 r8Var7;
        boolean z24;
        boolean z25;
        boolean z26;
        int i19;
        int i20;
        org.telegram.ui.Cells.r8 r8Var8;
        org.telegram.ui.Cells.r8 r8Var9;
        org.telegram.ui.Cells.r8 r8Var10;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.f38978v0))) != null) {
            this.f38980w0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.f38980w0);
        org.telegram.ui.Cells.e9 e9Var = this.P;
        int i21 = 0;
        if (e9Var != null) {
            if (this.I == null && (((r8Var8 = this.J) == null || r8Var8.getVisibility() != 0) && (((r8Var9 = this.N) == null || r8Var9.getVisibility() != 0) && ((r8Var10 = this.H) == null || r8Var10.getVisibility() != 0)))) {
                i20 = 8;
            } else {
                i20 = 0;
            }
            e9Var.setVisibility(i20);
        }
        org.telegram.ui.Cells.r8 r8Var11 = this.Y;
        if (r8Var11 != null) {
            if (ChatObject.isChannel(this.f38980w0)) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            r8Var11.setVisibility(i19);
        }
        org.telegram.ui.Cells.r8 r8Var12 = this.J;
        if (r8Var12 != null) {
            TLRPC.ChatFull chatFull2 = this.f38982x0;
            if (chatFull2 != null && (this.H0 || chatFull2.linked_chat_id != 0)) {
                r8Var12.setVisibility(0);
                if (this.f38982x0.linked_chat_id == 0) {
                    this.J.u(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f38982x0.linked_chat_id));
                    if (chat2 == null) {
                        this.J.setVisibility(8);
                    } else if (this.H0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.J.u(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.J.u(LocaleController.getString("Discussion", R.string.Discussion), si.o0.h("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.r8 r8Var13 = this.J;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i22 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.r8 r8Var14 = this.Q;
                            if (r8Var14 != null && r8Var14.getVisibility() == 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            r8Var13.u(string2, str4, false, i22, z26);
                        } else {
                            org.telegram.ui.Cells.r8 r8Var15 = this.J;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String h = si.o0.h("@", publicUsername2);
                            int i23 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.r8 r8Var16 = this.Q;
                            if (r8Var16 != null && r8Var16.getVisibility() == 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            r8Var15.u(string3, h, false, i23, z25);
                        }
                    }
                }
            } else {
                r8Var12.setVisibility(8);
            }
        }
        org.telegram.ui.Cells.r8 r8Var17 = this.H;
        if (r8Var17 != null) {
            TLRPC.ChatFull chatFull3 = this.f38982x0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                r8Var17.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.f38982x0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.H.q(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.H.q(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z11, true);
                }
            } else {
                r8Var17.setVisibility(8);
            }
        }
        if (this.I != null) {
            TLRPC.ChatFull chatFull4 = this.f38982x0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!isPublic) {
                    format = LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit);
                } else {
                    format = String.format(a1.g.s(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.f38980w0));
                }
                String str5 = format;
                org.telegram.ui.Cells.r8 r8Var18 = this.I;
                String string4 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i24 = R.drawable.msg_channel;
                org.telegram.ui.Cells.r8 r8Var19 = this.N;
                if ((r8Var19 != null && r8Var19.getVisibility() == 0) || (((r8Var6 = this.J) != null && r8Var6.getVisibility() == 0) || ((r8Var7 = this.Q) != null && r8Var7.getVisibility() == 0))) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                r8Var18.u(string4, str5, false, i24, z24);
            } else {
                boolean z27 = this.f38980w0.noforwards;
                if (this.H0) {
                    if (!isPublic) {
                        if (z27) {
                            i18 = R.string.TypePrivateRestrictedForwards;
                            str3 = "TypePrivateRestrictedForwards";
                        } else {
                            i18 = R.string.TypePrivate;
                            str3 = "TypePrivate";
                        }
                    } else {
                        i18 = R.string.TypePublic;
                        str3 = "TypePublic";
                    }
                    string = LocaleController.getString(str3, i18);
                } else {
                    if (!isPublic) {
                        if (z27) {
                            i17 = R.string.TypePrivateGroupRestrictedForwards;
                            str2 = "TypePrivateGroupRestrictedForwards";
                        } else {
                            i17 = R.string.TypePrivateGroup;
                            str2 = "TypePrivateGroup";
                        }
                    } else {
                        i17 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    }
                    string = LocaleController.getString(str2, i17);
                }
                String str6 = string;
                if (this.H0) {
                    org.telegram.ui.Cells.r8 r8Var20 = this.I;
                    String string5 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i25 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.r8 r8Var21 = this.N;
                    if ((r8Var21 != null && r8Var21.getVisibility() == 0) || (((r8Var4 = this.J) != null && r8Var4.getVisibility() == 0) || ((r8Var5 = this.Q) != null && r8Var5.getVisibility() == 0))) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    r8Var20.u(string5, str6, false, i25, z23);
                } else {
                    org.telegram.ui.Cells.r8 r8Var22 = this.I;
                    String string6 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i26 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.r8 r8Var23 = this.N;
                    if ((r8Var23 != null && r8Var23.getVisibility() == 0) || (((r8Var2 = this.J) != null && r8Var2.getVisibility() == 0) || ((r8Var3 = this.Q) != null && r8Var3.getVisibility() == 0))) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    r8Var22.u(string6, str6, false, i26, z22);
                }
            }
        }
        if (this.N != null) {
            if (this.I0 && !this.E0) {
                i15 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            } else {
                i15 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            }
            String string7 = LocaleController.getString(str, i15);
            org.telegram.ui.Cells.r8 r8Var24 = this.N;
            String string8 = LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort);
            int i27 = R.drawable.msg_discuss;
            if (this.Q != null) {
                z20 = true;
            } else {
                z20 = false;
            }
            r8Var24.u(string8, string7, z11, i27, z20);
            this.N.setEnabled(!this.E0);
            if (!this.E0 && !isPublic && (((chatFull = this.f38982x0) == null || chatFull.linked_chat_id == 0) && (chatFull == null || !(chatFull.location instanceof TLRPC.TL_channelLocation)))) {
                z21 = true;
            } else {
                z21 = false;
            }
            ValueAnimator valueAnimator = this.R0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = 0.0f;
            if (this.N.getAlpha() <= 0.0f && !z21) {
                this.N.setVisibility(8);
                o0();
            } else {
                float f12 = 1.0f;
                if (this.N.getVisibility() != 0 || this.N.getAlpha() < 1.0f || !z21) {
                    ArrayList arrayList = new ArrayList();
                    int i28 = 0;
                    boolean z28 = false;
                    while (i28 < this.F.getChildCount()) {
                        if (!z28 && this.F.getChildAt(i28) == this.N) {
                            z28 = true;
                        } else if (z28) {
                            arrayList.add(this.F.getChildAt(i28));
                        }
                        i28++;
                        z28 = z28;
                    }
                    int i29 = 0;
                    boolean z29 = false;
                    while (i29 < this.f38979w.getChildCount()) {
                        if (!z29 && this.f38979w.getChildAt(i29) == this.F) {
                            z29 = true;
                        } else if (z29) {
                            arrayList.add(this.f38979w.getChildAt(i29));
                        }
                        i29++;
                        z29 = z29;
                    }
                    if (this.N.getVisibility() != 0) {
                        this.N.setAlpha(0.0f);
                        this.N.setTranslationY((-r8Var.getHeight()) / 2.0f);
                    }
                    this.N.setVisibility(0);
                    for (int i30 = 0; i30 < arrayList.size(); i30++) {
                        ((View) arrayList.get(i30)).setTranslationY((1.0f - this.N.getAlpha()) * (-this.N.getHeight()));
                    }
                    if (z11) {
                        float alpha = this.N.getAlpha();
                        if (z21) {
                            f11 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f11);
                        this.R0 = ofFloat;
                        ofFloat.addUpdateListener(new ah.l0(12, this, arrayList));
                        this.R0.addListener(new ah.q0(this, z21, arrayList, 5));
                        this.R0.setDuration(320L);
                        this.R0.setInterpolator(org.telegram.ui.Components.zr.h);
                        this.R0.start();
                    } else {
                        org.telegram.ui.Cells.r8 r8Var25 = this.N;
                        if (z21) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.0f;
                        }
                        r8Var25.setAlpha(f7);
                        org.telegram.ui.Cells.r8 r8Var26 = this.N;
                        float f13 = (-r8Var26.getHeight()) / 2.0f;
                        if (z21) {
                            f10 = 0.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        r8Var26.setTranslationY(f13 * f10);
                        org.telegram.ui.Cells.r8 r8Var27 = this.N;
                        if (!z21) {
                            f12 = 0.0f;
                        }
                        r8Var27.setScaleY((f12 * 0.8f) + 0.2f);
                        org.telegram.ui.Cells.r8 r8Var28 = this.N;
                        if (z21) {
                            i16 = 0;
                        } else {
                            i16 = 8;
                        }
                        r8Var28.setVisibility(i16);
                        for (int i31 = 0; i31 < arrayList.size(); i31++) {
                            ((View) arrayList.get(i31)).setTranslationY(0.0f);
                        }
                        this.R0 = null;
                    }
                }
            }
        }
        if (this.T != null) {
            if (this.f38982x0 != null) {
                org.telegram.ui.Cells.r8 r8Var29 = this.U;
                if (r8Var29 != null) {
                    if (r8Var29.getParent() == null) {
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, w7.z5.n(-1, -2));
                    }
                    org.telegram.ui.Cells.r8 r8Var30 = this.U;
                    if (this.f38982x0.requests_pending > 0) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    r8Var30.setVisibility(i14);
                }
                if (this.H0 && !ChatObject.isCommunity(this.f38980w0)) {
                    this.T.u(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.f38982x0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.r8 r8Var31 = this.X;
                    String string9 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull5 = this.f38982x0;
                    String format2 = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                    int i32 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.r8 r8Var32 = this.Y;
                    if (r8Var32 != null && r8Var32.getVisibility() == 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    r8Var31.u(string9, format2, false, i32, z19);
                    z12 = z11;
                } else {
                    if (ChatObject.isChannel(this.f38980w0)) {
                        this.T.u(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.f38982x0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        org.telegram.ui.Cells.r8 r8Var33 = this.T;
                        String string10 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                        String format3 = String.format("%d", Integer.valueOf(this.f38982x0.participants.participants.size()));
                        int i33 = R.drawable.msg_groups;
                        if (this.U.getVisibility() == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        r8Var33.u(string10, format3, false, i33, z16);
                    }
                    TLRPC.Chat chat3 = this.f38980w0;
                    if (chat3.gigagroup && !ChatObject.isCommunity(chat3)) {
                        org.telegram.ui.Cells.r8 r8Var34 = this.X;
                        String string11 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull6 = this.f38982x0;
                        String format4 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                        int i34 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.r8 r8Var35 = this.Y;
                        if (r8Var35 != null && r8Var35.getVisibility() == 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        r8Var34.u(string11, format4, false, i34, z18);
                        z12 = z11;
                    } else {
                        if (this.E0) {
                            i10 = 16;
                        } else {
                            i10 = 15;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f38980w0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i35 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i35++;
                            }
                            i11 = jr.n0(tL_chatBannedRights) + i35;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f38980w0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i11++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i11++;
                            }
                            if (this.E0 && !tL_chatBannedRights2.manage_topics) {
                                i11++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i11++;
                            }
                            i12 = i10;
                        } else {
                            i11 = i10;
                            i12 = i11;
                        }
                        z12 = z11;
                        this.X.u(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i11), Integer.valueOf(i12)), z12, R.drawable.msg_permissions, true);
                    }
                    org.telegram.ui.Cells.r8 r8Var36 = this.U;
                    if (r8Var36 != null) {
                        String string12 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format5 = String.format("%d", Integer.valueOf(this.f38982x0.requests_pending));
                        int i36 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.r8 r8Var37 = this.Y;
                        if (r8Var37 != null && r8Var37.getVisibility() == 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        r8Var36.u(string12, format5, false, i36, z17);
                    }
                }
                org.telegram.ui.Cells.r8 r8Var38 = this.W;
                String string13 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.f38980w0)) {
                    i13 = this.f38982x0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.f38982x0;
                    if (chatFull7 == null) {
                        i13 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i37 = 0;
                        for (int i38 = 0; i38 < size; i38++) {
                            TLRPC.ChatParticipant chatParticipant = this.f38982x0.participants.participants.get(i38);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i37++;
                            }
                        }
                        i13 = i37;
                    }
                }
                r8Var38.u(string13, String.format("%d", Integer.valueOf(i13)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (this.H0 && !ChatObject.isCommunity(this.f38980w0)) {
                    this.T.o(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.r8 r8Var39 = this.X;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i39 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.r8 r8Var40 = this.Y;
                    if (r8Var40 != null && r8Var40.getVisibility() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    r8Var39.o(i39, string14, z15);
                } else {
                    org.telegram.ui.Cells.r8 r8Var41 = this.T;
                    String string15 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i40 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.r8 r8Var42 = this.Y;
                    if (r8Var42 != null && r8Var42.getVisibility() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    r8Var41.o(i40, string15, z13);
                    if (this.f38980w0.gigagroup) {
                        org.telegram.ui.Cells.r8 r8Var43 = this.X;
                        String string16 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i41 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.r8 r8Var44 = this.Y;
                        if (r8Var44 != null && r8Var44.getVisibility() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        r8Var43.o(i41, string16, z14);
                    } else {
                        this.X.o(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                }
                this.W.o(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            org.telegram.ui.Cells.r8 r8Var45 = this.O;
            if (!ChatObject.canChangeChatInfo(this.f38980w0)) {
                i21 = 8;
            }
            r8Var45.setVisibility(i21);
            s0(z12);
            if (this.f38982x0 != null && ChatObject.canUserDoAdminAction(this.f38980w0, 3) && (!isPublic || !this.f38980w0.creator)) {
                if (this.f38982x0.invitesCount > 0) {
                    this.V.u(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.f38982x0.invitesCount), false, R.drawable.msg_link2, true);
                } else {
                    this.V.u(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
                }
            } else {
                this.V.setVisibility(8);
            }
        }
        if (this.K != null) {
            t0(null);
        }
    }

    public final void q0() {
        ey eyVar;
        yw ywVar;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i10 = 0;
            while (i10 < fragmentStack.size()) {
                if (fragmentStack.get(i10) instanceof sn) {
                    sn snVar = (sn) fragmentStack.get(i10);
                    if (snVar.getArguments().getLong("chat_id") == this.f38978v0) {
                        ((ActionBarLayout) getParentLayout()).b0(snVar, false);
                        snVar.clearViews();
                        ((ActionBarLayout) getParentLayout()).c(i10, snVar);
                        if (!this.G0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.f38978v0);
                            ((ActionBarLayout) getParentLayout()).c(i10, new xe1(bundle));
                            i10++;
                        }
                    }
                } else if (this.G0 && (fragmentStack.get(i10) instanceof xe1)) {
                    xe1 xe1Var = (xe1) fragmentStack.get(i10);
                    if (xe1Var.g() != null && xe1Var.g().f20344id == this.f38978v0) {
                        ((ActionBarLayout) getParentLayout()).b0(xe1Var, false);
                        i10--;
                    }
                } else if (this.G0 && (fragmentStack.get(i10) instanceof ey) && (eyVar = (ey) fragmentStack.get(i10)) != null && (ywVar = eyVar.G3) != null && ywVar.c()) {
                    eyVar.G3.a();
                }
                i10++;
            }
        }
    }

    public final void r0() {
        if (this.f38965k0 == null) {
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
            this.f38965k0.u(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i10), Integer.valueOf(this.C0.usernames.size())), false, R.drawable.msg_link2, true);
            return;
        }
        this.f38965k0.u(LocaleController.getString(R.string.BotPublicLink), "t.me/" + this.C0.username, false, R.drawable.msg_link2, true);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.c50 c50Var = this.f38974s;
        if (c50Var != null) {
            c50Var.f25188f = bundle.getString("path");
        }
    }

    public final void s0(boolean z10) {
        String str;
        String str2;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.f38978v0);
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.f38980w0);
        TLRPC.ChatReactions chatReactions = this.J0;
        if (chatReactions != null && !(chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                int i10 = 0;
                for (int i11 = 0; i11 < tL_chatReactionsSome.reactions.size(); i11++) {
                    TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i11);
                    if (reaction instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
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
                if (isChannelAndNotMegaGroup) {
                    if (chatFull != null && chatFull.paid_reactions_available) {
                        i10++;
                    }
                    if (i10 == 0) {
                        str2 = LocaleController.getString(R.string.ReactionsOff);
                    } else {
                        str2 = String.valueOf(i10);
                    }
                } else {
                    int min = Math.min(getMediaDataController().getEnabledReactionsList().size(), i10);
                    if (min == 0) {
                        str2 = LocaleController.getString(R.string.ReactionsOff);
                    } else {
                        str2 = LocaleController.formatString(R.string.ReactionsCount, Integer.valueOf(min), Integer.valueOf(getMediaDataController().getEnabledReactionsList().size()));
                    }
                }
            } else {
                str2 = LocaleController.getString(R.string.ReactionsAll);
            }
        } else {
            String string = LocaleController.getString(R.string.ReactionsOff);
            if (chatFull != null && chatFull.paid_reactions_available) {
                str2 = "1";
            } else {
                str = string;
                this.O.u(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
            }
        }
        str = str2;
        this.O.u(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.c50 c50Var = this.f38974s;
        if (c50Var != null && (str = c50Var.f25188f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.ou ouVar = this.v;
        if (ouVar != null) {
            String obj = ouVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0(Long l4) {
        boolean z10;
        TLRPC.Chat chat = this.f38980w0;
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
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f38980w0.linked_monoforum_id));
                if (l4 != null) {
                    j10 = l4.longValue();
                } else if (chat2 != null) {
                    j10 = chat2.send_paid_messages_stars;
                }
                this.K.u(LocaleController.getString(R.string.PostSuggestions), ai.nd.Y0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
                return;
            }
            this.K.u(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void P() {
    }
}
