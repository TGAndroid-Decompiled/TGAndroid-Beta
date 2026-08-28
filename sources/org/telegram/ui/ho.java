package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Paint;
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
public class ho extends org.telegram.ui.ActionBar.o2 implements org.telegram.ui.Components.d40, NotificationCenter.NotificationCenterDelegate {
    public EditTextBoldCursor A;
    public TLRPC.UserFull A0;
    public LinearLayout B;
    public boolean B0;
    public org.telegram.ui.Cells.z6 C;
    public boolean C0;
    public org.telegram.ui.Cells.p8 D;
    public boolean D0;
    public org.telegram.ui.Cells.p8 E;
    public boolean E0;
    public org.telegram.ui.Cells.p8 F;
    public boolean F0;
    public org.telegram.ui.Cells.p8 G;
    public TLRPC.ChatReactions G0;
    public ho0 H;
    public TL_stories.TL_premium_boostsStatus H0;
    public org.telegram.ui.Cells.p8 I;
    public boolean I0;
    public org.telegram.ui.Cells.p8 J;
    public boolean J0;
    public org.telegram.ui.Cells.p8 K;
    public boolean K0;
    public org.telegram.ui.Cells.b9 L;
    public final ArrayList L0;
    public org.telegram.ui.Cells.p8 M;
    public final fo M0;
    public LinearLayout N;
    public org.telegram.ui.Components.mi0 N0;
    public LinearLayout O;
    public ValueAnimator O0;
    public org.telegram.ui.Cells.p8 P;
    public org.telegram.ui.Cells.p8 Q;
    public org.telegram.ui.Cells.p8 R;
    public org.telegram.ui.Cells.p8 S;
    public org.telegram.ui.Cells.p8 T;
    public org.telegram.ui.Cells.p8 U;
    public org.telegram.ui.Cells.p8 V;
    public org.telegram.ui.Cells.p8 W;
    public go X;
    public FrameLayout Y;
    public org.telegram.ui.Cells.ba Z;
    public org.telegram.ui.ActionBar.w0 f38835a;
    public org.telegram.ui.Cells.z6 f38836a0;
    public org.telegram.ui.ActionBar.c2 f38837b;
    public org.telegram.ui.Cells.p8 f38838b0;
    public UndoView f38839c;
    public org.telegram.ui.Cells.p8 f38840c0;
    public LinearLayout d;
    public oh.a f38841d0;
    public ih.d4 f38842e;
    public org.telegram.ui.Cells.b9 f38843e0;
    public kh.h6 f38844f;
    public org.telegram.ui.Cells.p8 f38845f0;
    public org.telegram.ui.Cells.b9 f38846g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.p8 f38847h0;
    public org.telegram.ui.Cells.p8 f38848i0;
    public org.telegram.ui.Cells.p8 f38849j0;
    public org.telegram.ui.Cells.p8 f38850k0;
    public org.telegram.ui.Cells.p8 f38851l0;
    public org.telegram.ui.Cells.p8 m0;
    public RadialProgressView f38852n;
    public org.telegram.ui.Cells.p8 f38853n0;
    public org.telegram.ui.Cells.b9 f38854o0;
    public org.telegram.ui.Cells.b9 f38855p0;
    public org.telegram.ui.Cells.p8 f38856q0;
    public final org.telegram.ui.Components.z8 f38857r;
    public TLRPC.FileLocation f38858r0;
    public final org.telegram.ui.Components.e40 f38859s;
    public long f38860s0;
    public TLRPC.Chat f38861t0;
    public TLRPC.ChatFull f38862u0;
    public org.telegram.ui.Components.ut v;
    public TLRPC.TL_chatAdminRights f38863v0;
    public gh.m f38864w;
    public TLRPC.TL_chatBannedRights f38865w0;
    public org.telegram.ui.Components.in0 f38866x;
    public TLRPC.TL_chatBannedRights f38867x0;
    public LinearLayout f38868y;
    public final long f38869y0;
    public TLRPC.User f38870z0;

    public ho(Bundle bundle) {
        super(bundle);
        int i9;
        this.L0 = new ArrayList();
        this.M0 = new fo(this);
        this.f38857r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.f38860s0 = bundle.getLong("chat_id", 0L);
        this.f38869y0 = bundle.getLong("user_id", 0L);
        if (this.f38860s0 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f38860s0));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i9 = 1;
            } else {
                i9 = 2;
            }
            this.f38859s = new org.telegram.ui.Components.e40(i9, true, true);
            return;
        }
        this.f38859s = new org.telegram.ui.Components.e40(0, false, false);
    }

    public static void T(ho hoVar, FrameLayout frameLayout, View view) {
        SpannableStringBuilder replaceTags;
        if (!hoVar.C0) {
            TLRPC.ChatFull chatFull = hoVar.f38862u0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", hoVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0]));
            }
            org.telegram.ui.Components.oc.a0(hoVar).Q(R.raw.topics, 36, replaceTags).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
        o2Var.f43607a = -hoVar.f38860s0;
        o2Var.setResourceProvider(hoVar.resourceProvider);
        boolean z10 = hoVar.B0;
        boolean z11 = hoVar.D0;
        bg.y0 y0Var = new bg.y0(14, hoVar, view);
        o2Var.f43609c = z10;
        o2Var.d = z11;
        o2Var.f43611f = y0Var;
        hoVar.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
    }

    public static void U(ho hoVar) {
        hoVar.f38858r0 = null;
        long j10 = hoVar.f38869y0;
        if (j10 == 0) {
            MessagesController.getInstance(hoVar.currentAccount).changeChatAvatar(hoVar.f38860s0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = hoVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.f22512id = new TLRPC.TL_inputPhotoEmpty();
            hoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new zn(hoVar, 2));
        }
        hoVar.m0(false, true);
        ih.d4 d4Var = hoVar.f38842e;
        org.telegram.ui.Components.z8 z8Var = hoVar.f38857r;
        Object obj = hoVar.f38870z0;
        if (obj == null) {
            obj = hoVar.f38861t0;
        }
        d4Var.h(null, null, z8Var, obj);
        hoVar.N0.K(0);
        hoVar.X.f24875e.d();
    }

    public static void W(ho hoVar) {
        int i9 = hoVar.currentAccount;
        long j10 = hoVar.f38869y0;
        TL_bots.botVerifierSettings botverifiersettings = hoVar.A0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e10 = org.telegram.messenger.l0.e(16, "onlySelect", "dialogsType", true);
        e10.putBoolean("resetDelegate", false);
        dy dyVar = new dy(e10);
        dyVar.setCurrentAccount(i9);
        dyVar.f37752y2 = new mh.q1(dyVar, i9, j10, botverifiersettings);
        U.presentFragment(dyVar);
    }

    public static void X(ho hoVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        c2Var.dismiss();
        if (hoVar.getParentActivity() == null) {
            return;
        }
        zf.j0 j0Var = new zf.j0(35, hoVar.currentAccount, hoVar.getParentActivity(), hoVar, hoVar.getResourceProvider());
        j0Var.G1(canApplyBoost);
        j0Var.F1(tL_premium_boostsStatus, true);
        j0Var.H1(j10);
        TLRPC.Chat chat = hoVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.M0 = new rd(20, hoVar, chat);
        }
        hoVar.showDialog(j0Var);
    }

    public static void Y(ho hoVar) {
        xc xcVar = new xc(-hoVar.f38861t0.f22380id);
        xcVar.f44472h0 = hoVar;
        hoVar.presentFragment(xcVar);
        MessagesController.getInstance(hoVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(hoVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static void Z(ho hoVar) {
        hoVar.K0 = true;
        NotificationCenter.getInstance(hoVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder c0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        l00 l00Var = new l00(10);
        l00Var.f39959a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        l00Var.f39963f = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lj, false);
        spannableStringBuilder.setSpan(l00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String f0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i9);
            i9++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.f38852n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f38852n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new nh.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final android.view.View createView(android.content.Context r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ho.createView(android.content.Context):android.view.View");
    }

    public final boolean d0(boolean z10) {
        org.telegram.ui.Components.ut utVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.f38869y0 != 0) {
            TLRPC.UserFull userFull = this.A0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.ut utVar2 = this.v;
            if ((utVar2 != null && !this.f38870z0.first_name.equals(utVar2.getText().toString())) || ((editTextBoldCursor2 = this.A) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BotSettingsChangedAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ao(this, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new ao(this, 1));
                    showDialog(alertDialog$Builder.f22702a);
                    return false;
                }
            } else {
                return true;
            }
        } else {
            TLRPC.ChatFull chatFull = this.f38862u0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull != null && ChatObject.isChannel(this.f38861t0) && this.f38862u0.hidden_prehistory != this.F0) || (((utVar = this.v) != null && !this.f38861t0.title.equals(utVar.getText().toString())) || (((editTextBoldCursor = this.A) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.B0 != this.f38861t0.forum))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f22702a.N = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                    if (this.E0) {
                        alertDialog$Builder2.f22702a.P = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                    } else {
                        alertDialog$Builder2.f22702a.P = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                    }
                    alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new ao(this, 2));
                    alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new ao(this, 3));
                    showDialog(alertDialog$Builder2.f22702a);
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int r12, int r13, java.lang.Object... r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ho.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.f38859s.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.f38859s.f27911c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0() {
        if (this.f38838b0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.f38860s0);
        TLRPC.ChatFull chatFull = this.f38862u0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.f38838b0.s(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    public final void g0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.f38860s0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new zn(this, 0));
    }

    @Override
    public final bu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        go goVar = this.X;
        int i9 = org.telegram.ui.ActionBar.f6.f23092i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(goVar, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.X, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23303u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.X, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23319v6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 4096, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.f23162m6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.S, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.S, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.S, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.R, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.R, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.R, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        org.telegram.ui.Cells.p8 p8Var = this.Q;
        if (p8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(p8Var, 4096, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i12 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 4, null, null, null, null, i10));
        org.telegram.ui.Components.ut utVar = this.v;
        int i13 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(utVar, 8388608, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.f23144l6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 8388608, null, null, null, null, i13));
        LinearLayout linearLayout = this.d;
        int i14 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(linearLayout, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38868y, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 1, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.f6.f22966b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.C, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.L, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38836a0, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Z, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Z, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23212p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, org.telegram.ui.ActionBar.f6.f23242r0, eVar, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38839c, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.Fi));
        int i16 = org.telegram.ui.ActionBar.f6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38839c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38839c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.f6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38839c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38839c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38839c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38839c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        org.telegram.ui.Cells.p8 p8Var2 = this.G;
        if (p8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(p8Var2, 4096, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        }
        org.telegram.ui.Cells.p8 p8Var3 = this.W;
        if (p8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(p8Var3, 4096, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.W, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.W, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        }
        return arrayList;
    }

    public final void h0() {
        boolean z10;
        if (this.f38858r0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38859s.o(z10, new bo(this, 0), new r5(this, 5), 0);
        this.N0.K(0);
        this.N0.N(43);
        this.X.f24875e.d();
    }

    public final void i0() {
        org.telegram.ui.Components.ut utVar;
        String str;
        String str2;
        if (!this.J0 && (utVar = this.v) != null) {
            if (utVar.f33121a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(this.v);
                return;
            }
            boolean z10 = true;
            this.J0 = true;
            String str3 = "";
            if (this.f38870z0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().getInputUser(this.f38870z0);
                setbotinfo.flags |= 4;
                setbotinfo.lang_code = "";
                if (!this.f38870z0.first_name.equals(this.v.getText().toString())) {
                    setbotinfo.name = this.v.getText().toString();
                    setbotinfo.flags |= 8;
                }
                TLRPC.UserFull userFull = this.A0;
                if (userFull != null && (str2 = userFull.about) != null) {
                    str3 = str2;
                }
                EditTextBoldCursor editTextBoldCursor = this.A;
                if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                    setbotinfo.about = this.A.getText().toString();
                    setbotinfo.flags = 1 | setbotinfo.flags;
                }
                this.f38837b = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                this.f38837b.setOnCancelListener(new gh.x(this, getConnectionsManager().sendRequest(setbotinfo, new rc(7, this, setbotinfo)), 3));
                this.f38837b.show();
            } else if (!ChatObject.isChannel(this.f38861t0) && (!this.F0 || this.B0)) {
                getMessagesController().convertToMegaGroup(getParentActivity(), this.f38860s0, this, new ao(this, 5));
            } else {
                if (this.f38862u0 != null && ChatObject.isChannel(this.f38861t0)) {
                    TLRPC.ChatFull chatFull = this.f38862u0;
                    boolean z11 = chatFull.hidden_prehistory;
                    boolean z12 = this.F0;
                    if (z11 != z12) {
                        chatFull.hidden_prehistory = z12;
                        getMessagesController().toggleChannelInvitesHistory(this.f38860s0, this.F0);
                    }
                }
                if (this.f38859s.h()) {
                    this.I0 = true;
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
                    this.f38837b = c2Var;
                    c2Var.setOnCancelListener(new eg(this, 1));
                    this.f38837b.show();
                    return;
                }
                if (!this.f38861t0.title.equals(this.v.getText().toString())) {
                    getMessagesController().changeChatTitle(this.f38860s0, this.v.getText().toString());
                }
                TLRPC.ChatFull chatFull2 = this.f38862u0;
                if (chatFull2 != null && (str = chatFull2.about) != null) {
                    str3 = str;
                }
                EditTextBoldCursor editTextBoldCursor2 = this.A;
                if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                    getMessagesController().updateChatAbout(this.f38860s0, this.A.getText().toString(), this.f38862u0);
                }
                boolean z13 = this.B0;
                TLRPC.Chat chat = this.f38861t0;
                if (z13 != chat.forum || this.D0 != chat.forum_tabs) {
                    if (this.D0 == chat.forum_tabs) {
                        z10 = false;
                    }
                    getMessagesController().toggleChannelForum(this.f38860s0, this.B0, this.D0);
                    if (this.B0 && !this.D0) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i9 = 0; i9 < fragmentStack.size(); i9++) {
                            if ((fragmentStack.get(i9) instanceof qn) && ((qn) fragmentStack.get(i9)).getArguments().getLong("chat_id") == this.f38860s0) {
                                ((ActionBarLayout) getParentLayout()).Y(i9);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.f38860s0);
                                org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
                                HashSet hashSet = we1.f43740j1;
                                ((ActionBarLayout) parentLayout).c(i9, we1.D0(getMessagesController(), getMessagesStorage(), bundle));
                            }
                        }
                    }
                    if (z10) {
                        p0();
                    }
                }
                finishFragment();
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ho.j0():void");
    }

    public final void k0(TLRPC.ChatFull chatFull) {
        boolean z10;
        org.telegram.ui.Components.k5 k5Var;
        this.f38862u0 = chatFull;
        if (chatFull != null) {
            if (this.f38861t0 == null) {
                this.f38861t0 = getMessagesController().getChat(Long.valueOf(this.f38860s0));
            }
            if (ChatObject.isChannel(this.f38861t0) && !this.f38862u0.hidden_prehistory) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.F0 = z10;
            this.G0 = this.f38862u0.available_reactions;
            ArrayList arrayList = this.L0;
            arrayList.clear();
            TLRPC.Chat chat = this.f38861t0;
            TLRPC.ChatFull chatFull2 = this.f38862u0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i9 = 0;
                    while (i9 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i9);
                        i9++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                k5Var = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, org.telegram.ui.Components.k5.g(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            k5Var = org.telegram.ui.Components.k5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.k5.g());
                        } else {
                            k5Var = null;
                        }
                        if (k5Var != null) {
                            arrayList2.add(k5Var);
                            k5Var.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.k5 m10 = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, org.telegram.ui.Components.k5.g(), tL_availableReaction2.activate_animation);
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.V != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.f38861t0)) {
                this.V.setVisibility(0);
            }
        }
        e0();
    }

    public final void l0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        int i9;
        TL_bots.BotInfo botInfo2;
        boolean z10;
        String format;
        TLRPC.User user;
        this.A0 = userFull;
        if (userFull != null) {
            if (this.f38870z0 == null) {
                long j10 = this.f38869y0;
                if (j10 == 0) {
                    user = null;
                } else {
                    user = getMessagesController().getUser(Long.valueOf(j10));
                }
                this.f38870z0 = user;
            }
            org.telegram.ui.Cells.p8 p8Var = this.f38850k0;
            int i10 = 0;
            if (p8Var != null) {
                if (this.A0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p8Var.f(45, z10, true);
                TLRPC.UserFull userFull2 = this.A0;
                if (userFull2 != null) {
                    org.telegram.ui.Cells.p8 p8Var2 = this.f38850k0;
                    TL_payments.starRefProgram starrefprogram = userFull2.starref_program;
                    if (starrefprogram == null) {
                        format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    p8Var2.u(format, false);
                }
            }
            org.telegram.ui.Cells.p8 p8Var3 = this.f38856q0;
            if (p8Var3 != null) {
                TLRPC.UserFull userFull3 = this.A0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                p8Var3.setVisibility(i9);
            }
            org.telegram.ui.Cells.b9 b9Var = this.f38855p0;
            if (b9Var != null) {
                TLRPC.UserFull userFull4 = this.A0;
                b9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 8);
            }
        }
    }

    public final void m0(boolean z10, boolean z11) {
        if (this.f38852n == null) {
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
                this.f38852n.setVisibility(0);
                this.f38844f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                RadialProgressView radialProgressView = this.f38852n;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f38844f, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f38852n;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f38844f, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new hg.b0(29, this, z10));
            this.h.start();
        } else if (z10) {
            this.f38852n.setAlpha(1.0f);
            this.f38852n.setVisibility(0);
            this.f38844f.setAlpha(1.0f);
            this.f38844f.setVisibility(0);
        } else {
            this.f38852n.setAlpha(0.0f);
            this.f38852n.setVisibility(4);
            this.f38844f.setAlpha(0.0f);
            this.f38844f.setVisibility(4);
        }
    }

    public final void n0() {
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        boolean z10;
        vo0 vo0Var;
        int v02;
        boolean q10;
        int i9;
        ArrayList<Integer> arrayList;
        int i10;
        int i11;
        ho0 ho0Var = this.H;
        if (ho0Var != null) {
            TLRPC.Chat chat = this.f38861t0;
            org.telegram.ui.Cells.p8 p8Var3 = this.J;
            if ((p8Var3 != null && p8Var3.getVisibility() == 0) || (((p8Var = this.M) != null && p8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.f38861t0) && ChatObject.hasAdminRights(this.f38861t0)) || ((p8Var2 = this.I) != null && p8Var2.getVisibility() == 0)))) {
                z10 = true;
            } else {
                z10 = false;
            }
            Paint paint = ho0Var.f38876n;
            int i12 = ho0Var.f38871a;
            org.telegram.ui.ActionBar.b6 b6Var = ho0Var.d;
            if (chat != null) {
                ho0Var.v = z10;
                ho0Var.f38877r = new org.telegram.ui.Components.nz0(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.f6.f23193o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
                vo0 vo0Var2 = ho0Var.f38879w;
                MessagesController.PeerColor peerColor = null;
                if (vo0Var2 != null) {
                    vo0Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i13 = vo0.f43550j;
                    int i14 = tL_emojiStatusCollectible.center_color | (-16777216);
                    ho0Var.f38879w = new vo0(tL_emojiStatusCollectible.document_id, i14, i14, i14);
                } else {
                    if (ChatObject.getProfileColorId(chat) >= 0) {
                        vo0Var = vo0.c(i12, ChatObject.getProfileColorId(chat));
                        vo0Var.f43551a = AndroidUtilities.dp(11.0f);
                        vo0Var.d();
                    } else {
                        vo0Var = null;
                    }
                    ho0Var.f38879w = vo0Var;
                }
                vo0 vo0Var3 = ho0Var.f38879w;
                if (vo0Var3 != null) {
                    vo0Var3.e(ho0Var);
                }
                TLRPC.PeerColor peerColor2 = chat.color;
                if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
                    if (b6Var != null) {
                        q10 = b6Var.a();
                    } else {
                        q10 = org.telegram.ui.ActionBar.f6.I.q();
                    }
                    if (q10 && (tL_peerColorCollectible.flags & 1) != 0) {
                        i9 = tL_peerColorCollectible.dark_accent_color;
                    } else {
                        i9 = tL_peerColorCollectible.accent_color;
                    }
                    if (!q10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    int intValue = arrayList.get(0).intValue() | (-16777216);
                    if (arrayList.size() >= 2) {
                        i10 = arrayList.get(1).intValue() | (-16777216);
                    } else {
                        i10 = intValue;
                    }
                    if (arrayList.size() >= 3) {
                        i11 = arrayList.get(2).intValue() | (-16777216);
                    } else {
                        i11 = intValue;
                    }
                    ho0Var.f38877r.o(i9);
                    paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i9));
                    vo0 vo0Var4 = new vo0(tL_peerColorCollectible.gift_emoji_id, intValue, i10, i11);
                    vo0Var4.f43551a = AndroidUtilities.dp(11.0f);
                    vo0Var4.d();
                    ho0Var.f38880x = vo0Var4;
                    vo0Var4.e(ho0Var);
                    return;
                }
                int colorId = ChatObject.getColorId(chat);
                if (colorId < 7) {
                    int i15 = org.telegram.ui.ActionBar.f6.f23250r8[colorId];
                    ho0Var.f38878s = i15;
                    v02 = org.telegram.ui.ActionBar.f6.v0(i15, b6Var);
                } else {
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                    if (peerColors != null) {
                        peerColor = peerColors.getColor(colorId);
                    }
                    if (peerColor != null) {
                        ho0Var.f38878s = -1;
                        v02 = peerColor.getColor1();
                    } else {
                        int i16 = org.telegram.ui.ActionBar.f6.f23250r8[0];
                        ho0Var.f38878s = i16;
                        v02 = org.telegram.ui.ActionBar.f6.v0(i16, b6Var);
                    }
                }
                ho0Var.f38877r.o(v02);
                paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, v02));
                vo0 a2 = vo0.a(i12, colorId);
                a2.f43551a = AndroidUtilities.dp(11.0f);
                a2.d();
                ho0Var.f38880x = a2;
                a2.e(ho0Var);
            }
        }
    }

    public final void o0(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i9;
        int i10;
        int i11;
        boolean z17;
        boolean z18;
        int i12;
        boolean z19;
        int i13;
        int i14;
        String str;
        boolean z20;
        boolean z21;
        float f10;
        float f11;
        int i15;
        TLRPC.ChatFull chatFull;
        int i16;
        String str2;
        String string;
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        boolean z22;
        org.telegram.ui.Cells.p8 p8Var3;
        org.telegram.ui.Cells.p8 p8Var4;
        boolean z23;
        int i17;
        String str3;
        String format;
        org.telegram.ui.Cells.p8 p8Var5;
        org.telegram.ui.Cells.p8 p8Var6;
        boolean z24;
        boolean z25;
        boolean z26;
        int i18;
        int i19;
        org.telegram.ui.Cells.p8 p8Var7;
        org.telegram.ui.Cells.p8 p8Var8;
        org.telegram.ui.Cells.p8 p8Var9;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.f38860s0))) != null) {
            this.f38861t0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.f38861t0);
        org.telegram.ui.Cells.b9 b9Var = this.L;
        int i20 = 0;
        if (b9Var != null) {
            if (this.E == null && (((p8Var7 = this.F) == null || p8Var7.getVisibility() != 0) && (((p8Var8 = this.J) == null || p8Var8.getVisibility() != 0) && ((p8Var9 = this.D) == null || p8Var9.getVisibility() != 0)))) {
                i19 = 8;
            } else {
                i19 = 0;
            }
            b9Var.setVisibility(i19);
        }
        org.telegram.ui.Cells.p8 p8Var10 = this.U;
        if (p8Var10 != null) {
            if (ChatObject.isChannel(this.f38861t0)) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            p8Var10.setVisibility(i18);
        }
        org.telegram.ui.Cells.p8 p8Var11 = this.F;
        if (p8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.f38862u0;
            if (chatFull2 != null && (this.E0 || chatFull2.linked_chat_id != 0)) {
                p8Var11.setVisibility(0);
                if (this.f38862u0.linked_chat_id == 0) {
                    this.F.s(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f38862u0.linked_chat_id));
                    if (chat2 == null) {
                        this.F.setVisibility(8);
                    } else if (this.E0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.F.s(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.F.s(LocaleController.getString("Discussion", R.string.Discussion), ta.b.d("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.p8 p8Var12 = this.F;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i21 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.p8 p8Var13 = this.M;
                            if (p8Var13 != null && p8Var13.getVisibility() == 0) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            p8Var12.s(string2, str4, false, i21, z26);
                        } else {
                            org.telegram.ui.Cells.p8 p8Var14 = this.F;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String d = ta.b.d("@", publicUsername2);
                            int i22 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.p8 p8Var15 = this.M;
                            if (p8Var15 != null && p8Var15.getVisibility() == 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            p8Var14.s(string3, d, false, i22, z25);
                        }
                    }
                }
            } else {
                p8Var11.setVisibility(8);
            }
        }
        org.telegram.ui.Cells.p8 p8Var16 = this.D;
        if (p8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.f38862u0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                p8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.f38862u0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.D.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.D.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z11, true);
                }
            } else {
                p8Var16.setVisibility(8);
            }
        }
        if (this.E != null) {
            TLRPC.ChatFull chatFull4 = this.f38862u0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!isPublic) {
                    format = LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit);
                } else {
                    format = String.format(aa.d.r(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.f38861t0));
                }
                String str5 = format;
                org.telegram.ui.Cells.p8 p8Var17 = this.E;
                String string4 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i23 = R.drawable.msg_channel;
                org.telegram.ui.Cells.p8 p8Var18 = this.J;
                if ((p8Var18 != null && p8Var18.getVisibility() == 0) || (((p8Var5 = this.F) != null && p8Var5.getVisibility() == 0) || ((p8Var6 = this.M) != null && p8Var6.getVisibility() == 0))) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                p8Var17.s(string4, str5, false, i23, z24);
            } else {
                boolean z27 = this.f38861t0.noforwards;
                if (this.E0) {
                    if (!isPublic) {
                        if (z27) {
                            i17 = R.string.TypePrivateRestrictedForwards;
                            str3 = "TypePrivateRestrictedForwards";
                        } else {
                            i17 = R.string.TypePrivate;
                            str3 = "TypePrivate";
                        }
                    } else {
                        i17 = R.string.TypePublic;
                        str3 = "TypePublic";
                    }
                    string = LocaleController.getString(str3, i17);
                } else {
                    if (!isPublic) {
                        if (z27) {
                            i16 = R.string.TypePrivateGroupRestrictedForwards;
                            str2 = "TypePrivateGroupRestrictedForwards";
                        } else {
                            i16 = R.string.TypePrivateGroup;
                            str2 = "TypePrivateGroup";
                        }
                    } else {
                        i16 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    }
                    string = LocaleController.getString(str2, i16);
                }
                String str6 = string;
                if (this.E0) {
                    org.telegram.ui.Cells.p8 p8Var19 = this.E;
                    String string5 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i24 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.p8 p8Var20 = this.J;
                    if ((p8Var20 != null && p8Var20.getVisibility() == 0) || (((p8Var3 = this.F) != null && p8Var3.getVisibility() == 0) || ((p8Var4 = this.M) != null && p8Var4.getVisibility() == 0))) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    p8Var19.s(string5, str6, false, i24, z23);
                } else {
                    org.telegram.ui.Cells.p8 p8Var21 = this.E;
                    String string6 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i25 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.p8 p8Var22 = this.J;
                    if ((p8Var22 != null && p8Var22.getVisibility() == 0) || (((p8Var = this.F) != null && p8Var.getVisibility() == 0) || ((p8Var2 = this.M) != null && p8Var2.getVisibility() == 0))) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    p8Var21.s(string6, str6, false, i25, z22);
                }
            }
        }
        if (this.J != null) {
            if (this.F0 && !this.B0) {
                i14 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            } else {
                i14 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            }
            String string7 = LocaleController.getString(str, i14);
            org.telegram.ui.Cells.p8 p8Var23 = this.J;
            String string8 = LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort);
            int i26 = R.drawable.msg_discuss;
            if (this.M != null) {
                z20 = true;
            } else {
                z20 = false;
            }
            p8Var23.s(string8, string7, z11, i26, z20);
            this.J.setEnabled(!this.B0);
            if (!this.B0 && !isPublic && (((chatFull = this.f38862u0) == null || chatFull.linked_chat_id == 0) && (chatFull == null || !(chatFull.location instanceof TLRPC.TL_channelLocation)))) {
                z21 = true;
            } else {
                z21 = false;
            }
            ValueAnimator valueAnimator = this.O0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = 0.0f;
            if (this.J.getAlpha() <= 0.0f && !z21) {
                this.J.setVisibility(8);
                n0();
            } else {
                float f13 = 1.0f;
                if (this.J.getVisibility() != 0 || this.J.getAlpha() < 1.0f || !z21) {
                    ArrayList arrayList = new ArrayList();
                    boolean z28 = false;
                    for (int i27 = 0; i27 < this.B.getChildCount(); i27++) {
                        if (!z28 && this.B.getChildAt(i27) == this.J) {
                            z28 = true;
                        } else if (z28) {
                            arrayList.add(this.B.getChildAt(i27));
                        }
                    }
                    boolean z29 = false;
                    for (int i28 = 0; i28 < this.f38864w.getChildCount(); i28++) {
                        if (!z29 && this.f38864w.getChildAt(i28) == this.B) {
                            z29 = true;
                        } else if (z29) {
                            arrayList.add(this.f38864w.getChildAt(i28));
                        }
                    }
                    if (this.J.getVisibility() != 0) {
                        this.J.setAlpha(0.0f);
                        org.telegram.ui.Cells.p8 p8Var24 = this.J;
                        p8Var24.setTranslationY((-p8Var24.getHeight()) / 2.0f);
                    }
                    this.J.setVisibility(0);
                    for (int i29 = 0; i29 < arrayList.size(); i29++) {
                        ((View) arrayList.get(i29)).setTranslationY((1.0f - this.J.getAlpha()) * (-this.J.getHeight()));
                    }
                    if (z11) {
                        float alpha = this.J.getAlpha();
                        if (z21) {
                            f12 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f12);
                        this.O0 = ofFloat;
                        ofFloat.addUpdateListener(new f2.g(6, this, arrayList));
                        this.O0.addListener(new androidx.fragment.app.g(this, z21, arrayList, 5));
                        this.O0.setDuration(320L);
                        this.O0.setInterpolator(org.telegram.ui.Components.gr.h);
                        this.O0.start();
                    } else {
                        org.telegram.ui.Cells.p8 p8Var25 = this.J;
                        if (z21) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        p8Var25.setAlpha(f10);
                        org.telegram.ui.Cells.p8 p8Var26 = this.J;
                        float f14 = (-p8Var26.getHeight()) / 2.0f;
                        if (z21) {
                            f11 = 0.0f;
                        } else {
                            f11 = 1.0f;
                        }
                        p8Var26.setTranslationY(f14 * f11);
                        org.telegram.ui.Cells.p8 p8Var27 = this.J;
                        if (!z21) {
                            f13 = 0.0f;
                        }
                        p8Var27.setScaleY((f13 * 0.8f) + 0.2f);
                        org.telegram.ui.Cells.p8 p8Var28 = this.J;
                        if (z21) {
                            i15 = 0;
                        } else {
                            i15 = 8;
                        }
                        p8Var28.setVisibility(i15);
                        for (int i30 = 0; i30 < arrayList.size(); i30++) {
                            ((View) arrayList.get(i30)).setTranslationY(0.0f);
                        }
                        this.O0 = null;
                    }
                }
            }
        }
        if (this.P != null) {
            if (this.f38862u0 != null) {
                org.telegram.ui.Cells.p8 p8Var29 = this.Q;
                if (p8Var29 != null) {
                    if (p8Var29.getParent() == null) {
                        this.N.addView(this.Q, this.N.indexOfChild(this.P) + 1, g7.e6.n(-1, -2));
                    }
                    org.telegram.ui.Cells.p8 p8Var30 = this.Q;
                    if (this.f38862u0.requests_pending > 0) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    p8Var30.setVisibility(i13);
                }
                if (this.E0 && !ChatObject.isCommunity(this.f38861t0)) {
                    this.P.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.f38862u0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.p8 p8Var31 = this.T;
                    String string9 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull5 = this.f38862u0;
                    String format2 = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                    int i31 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.p8 p8Var32 = this.U;
                    if (p8Var32 != null && p8Var32.getVisibility() == 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    p8Var31.s(string9, format2, false, i31, z19);
                    z12 = z11;
                } else {
                    if (ChatObject.isChannel(this.f38861t0)) {
                        this.P.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.f38862u0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        org.telegram.ui.Cells.p8 p8Var33 = this.P;
                        String string10 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                        String format3 = String.format("%d", Integer.valueOf(this.f38862u0.participants.participants.size()));
                        int i32 = R.drawable.msg_groups;
                        if (this.Q.getVisibility() == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        p8Var33.s(string10, format3, false, i32, z16);
                    }
                    TLRPC.Chat chat3 = this.f38861t0;
                    if (chat3.gigagroup && !ChatObject.isCommunity(chat3)) {
                        org.telegram.ui.Cells.p8 p8Var34 = this.T;
                        String string11 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull6 = this.f38862u0;
                        String format4 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                        int i33 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.p8 p8Var35 = this.U;
                        if (p8Var35 != null && p8Var35.getVisibility() == 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        p8Var34.s(string11, format4, false, i33, z18);
                        z12 = z11;
                    } else {
                        if (this.B0) {
                            i9 = 16;
                        } else {
                            i9 = 15;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f38861t0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i34 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i34++;
                            }
                            i10 = jr.m0(tL_chatBannedRights) + i34;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f38861t0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i10++;
                            }
                            if (this.B0 && !tL_chatBannedRights2.manage_topics) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i10++;
                            }
                            i11 = i9;
                        } else {
                            i10 = i9;
                            i11 = i10;
                        }
                        z12 = z11;
                        this.T.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i10), Integer.valueOf(i11)), z12, R.drawable.msg_permissions, true);
                    }
                    org.telegram.ui.Cells.p8 p8Var36 = this.Q;
                    if (p8Var36 != null) {
                        String string12 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format5 = String.format("%d", Integer.valueOf(this.f38862u0.requests_pending));
                        int i35 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.p8 p8Var37 = this.U;
                        if (p8Var37 != null && p8Var37.getVisibility() == 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        p8Var36.s(string12, format5, false, i35, z17);
                    }
                }
                org.telegram.ui.Cells.p8 p8Var38 = this.S;
                String string13 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.f38861t0)) {
                    i12 = this.f38862u0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.f38862u0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i36 = 0;
                        for (int i37 = 0; i37 < size; i37++) {
                            TLRPC.ChatParticipant chatParticipant = this.f38862u0.participants.participants.get(i37);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i36++;
                            }
                        }
                        i12 = i36;
                    }
                }
                p8Var38.s(string13, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (this.E0 && !ChatObject.isCommunity(this.f38861t0)) {
                    this.P.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.p8 p8Var39 = this.T;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i38 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.p8 p8Var40 = this.U;
                    if (p8Var40 != null && p8Var40.getVisibility() == 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    p8Var39.m(i38, string14, z15);
                } else {
                    org.telegram.ui.Cells.p8 p8Var41 = this.P;
                    String string15 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i39 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.p8 p8Var42 = this.U;
                    if (p8Var42 != null && p8Var42.getVisibility() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    p8Var41.m(i39, string15, z13);
                    if (this.f38861t0.gigagroup) {
                        org.telegram.ui.Cells.p8 p8Var43 = this.T;
                        String string16 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i40 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.p8 p8Var44 = this.U;
                        if (p8Var44 != null && p8Var44.getVisibility() == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        p8Var43.m(i40, string16, z14);
                    } else {
                        this.T.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                }
                this.S.m(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            org.telegram.ui.Cells.p8 p8Var45 = this.K;
            if (!ChatObject.canChangeChatInfo(this.f38861t0)) {
                i20 = 8;
            }
            p8Var45.setVisibility(i20);
            r0(z12);
            if (this.f38862u0 != null && ChatObject.canUserDoAdminAction(this.f38861t0, 3) && (!isPublic || !this.f38861t0.creator)) {
                if (this.f38862u0.invitesCount > 0) {
                    this.R.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.f38862u0.invitesCount), false, R.drawable.msg_link2, true);
                } else {
                    this.R.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
                }
            } else {
                this.R.setVisibility(8);
            }
        }
        if (this.G != null) {
            s0(null);
        }
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        this.f38859s.i(i9, i10, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar != null && utVar.f33124e) {
            if (z10) {
                utVar.k(true);
                return false;
            }
            return false;
        }
        return d0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f38839c;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ho.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.e40 e40Var = this.f38859s;
        if (e40Var != null) {
            e40Var.e();
        }
        if (this.f38861t0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.f38870z0.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar != null) {
            utVar.o();
        }
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        gh.m mVar = this.f38864w;
        if (mVar != null) {
            mVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i12);
        }
        UndoView undoView = this.f38839c;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.L0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((org.telegram.ui.Components.k5) obj).p(null);
        }
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar != null) {
            utVar.r();
        }
        UndoView undoView = this.f38839c;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f38859s.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        this.f38859s.k(i9, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar != null) {
            utVar.s();
            this.v.getEditText().requestFocus();
        }
        n0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        o0(true, true);
        this.f38859s.l();
    }

    public final void p0() {
        dy dyVar;
        yw ywVar;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i9 = 0;
            while (i9 < fragmentStack.size()) {
                if (fragmentStack.get(i9) instanceof qn) {
                    qn qnVar = (qn) fragmentStack.get(i9);
                    if (qnVar.getArguments().getLong("chat_id") == this.f38860s0) {
                        ((ActionBarLayout) getParentLayout()).a0(qnVar, false);
                        qnVar.clearViews();
                        ((ActionBarLayout) getParentLayout()).c(i9, qnVar);
                        if (!this.D0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.f38860s0);
                            ((ActionBarLayout) getParentLayout()).c(i9, new we1(bundle));
                            i9++;
                        }
                    }
                } else if (this.D0 && (fragmentStack.get(i9) instanceof we1)) {
                    we1 we1Var = (we1) fragmentStack.get(i9);
                    if (we1Var.g() != null && we1Var.g().f22380id == this.f38860s0) {
                        ((ActionBarLayout) getParentLayout()).a0(we1Var, false);
                        i9--;
                    }
                } else if (this.D0 && (fragmentStack.get(i9) instanceof dy) && (dyVar = (dy) fragmentStack.get(i9)) != null && (ywVar = dyVar.B3) != null && ywVar.c()) {
                    dyVar.B3.a();
                }
                i9++;
            }
        }
    }

    public final void q0() {
        if (this.f38847h0 == null) {
            return;
        }
        if (this.f38870z0.usernames.size() > 1) {
            ArrayList<TLRPC.TL_username> arrayList = this.f38870z0.usernames;
            int size = arrayList.size();
            int i9 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_username tL_username = arrayList.get(i10);
                i10++;
                if (tL_username.active) {
                    i9++;
                }
            }
            this.f38847h0.s(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i9), Integer.valueOf(this.f38870z0.usernames.size())), false, R.drawable.msg_link2, true);
            return;
        }
        org.telegram.ui.Cells.p8 p8Var = this.f38847h0;
        String string = LocaleController.getString(R.string.BotPublicLink);
        p8Var.s(string, "t.me/" + this.f38870z0.username, false, R.drawable.msg_link2, true);
    }

    public final void r0(boolean z10) {
        String str;
        String str2;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.f38860s0);
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.f38861t0);
        TLRPC.ChatReactions chatReactions = this.G0;
        if (chatReactions != null && !(chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                int i9 = 0;
                for (int i10 = 0; i10 < tL_chatReactionsSome.reactions.size(); i10++) {
                    TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i10);
                    if (reaction instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                        if (tL_availableReaction != null) {
                            if (tL_availableReaction.inactive) {
                            }
                            i9++;
                        }
                    } else {
                        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                        }
                        i9++;
                    }
                }
                if (isChannelAndNotMegaGroup) {
                    if (chatFull != null && chatFull.paid_reactions_available) {
                        i9++;
                    }
                    if (i9 == 0) {
                        str2 = LocaleController.getString(R.string.ReactionsOff);
                    } else {
                        str2 = String.valueOf(i9);
                    }
                } else {
                    int min = Math.min(getMediaDataController().getEnabledReactionsList().size(), i9);
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
                this.K.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
            }
        }
        str = str2;
        this.K.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e40 e40Var = this.f38859s;
        if (e40Var != null) {
            e40Var.f27913f = bundle.getString("path");
        }
    }

    public final void s0(Long l10) {
        boolean z10;
        TLRPC.Chat chat = this.f38861t0;
        if (chat != null && this.G != null) {
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
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f38861t0.linked_monoforum_id));
                if (l10 != null) {
                    j10 = l10.longValue();
                } else if (chat2 != null) {
                    j10 = chat2.send_paid_messages_stars;
                }
                this.G.s(LocaleController.getString(R.string.PostSuggestions), gh.oa.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
                return;
            }
            this.G.s(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.e40 e40Var = this.f38859s;
        if (e40Var != null && (str = e40Var.f27913f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar != null) {
            String obj = utVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void O() {
    }
}
