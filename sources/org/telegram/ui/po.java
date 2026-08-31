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
public class po extends org.telegram.ui.ActionBar.p2 implements org.telegram.ui.Components.x40, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.User A0;
    public EditTextBoldCursor B;
    public TLRPC.UserFull B0;
    public LinearLayout C;
    public boolean C0;
    public org.telegram.ui.Cells.z6 D;
    public boolean D0;
    public org.telegram.ui.Cells.o8 E;
    public boolean E0;
    public org.telegram.ui.Cells.o8 F;
    public boolean F0;
    public org.telegram.ui.Cells.o8 G;
    public boolean G0;
    public org.telegram.ui.Cells.o8 H;
    public TLRPC.ChatReactions H0;
    public qo0 I;
    public TL_stories.TL_premium_boostsStatus I0;
    public org.telegram.ui.Cells.o8 J;
    public boolean J0;
    public org.telegram.ui.Cells.o8 K;
    public boolean K0;
    public org.telegram.ui.Cells.o8 L;
    public boolean L0;
    public org.telegram.ui.Cells.a9 M;
    public final ArrayList M0;
    public org.telegram.ui.Cells.o8 N;
    public final no N0;
    public LinearLayout O;
    public org.telegram.ui.Components.ij0 O0;
    public LinearLayout P;
    public ValueAnimator P0;
    public org.telegram.ui.Cells.o8 Q;
    public org.telegram.ui.Cells.o8 R;
    public org.telegram.ui.Cells.o8 S;
    public org.telegram.ui.Cells.o8 T;
    public org.telegram.ui.Cells.o8 U;
    public org.telegram.ui.Cells.o8 V;
    public org.telegram.ui.Cells.o8 W;
    public org.telegram.ui.Cells.o8 X;
    public oo Y;
    public FrameLayout Z;
    public org.telegram.ui.ActionBar.w0 f40094a;
    public org.telegram.ui.Cells.aa f40095a0;
    public org.telegram.ui.ActionBar.d2 f40096b;
    public org.telegram.ui.Cells.z6 f40097b0;
    public UndoView f40098c;
    public org.telegram.ui.Cells.o8 f40099c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.o8 f40100d0;
    public oh.a4 f40101e;
    public uh.a f40102e0;
    public fg.i0 f40103f;
    public org.telegram.ui.Cells.a9 f40104f0;
    public org.telegram.ui.Cells.o8 f40105g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.a9 f40106h0;
    public org.telegram.ui.Cells.o8 f40107i0;
    public org.telegram.ui.Cells.o8 f40108j0;
    public org.telegram.ui.Cells.o8 f40109k0;
    public org.telegram.ui.Cells.o8 f40110l0;
    public org.telegram.ui.Cells.o8 m0;
    public RadialProgressView f40111n;
    public org.telegram.ui.Cells.o8 f40112n0;
    public org.telegram.ui.Cells.o8 f40113o0;
    public org.telegram.ui.Cells.a9 f40114p0;
    public org.telegram.ui.Cells.a9 f40115q0;
    public final org.telegram.ui.Components.z8 f40116r;
    public org.telegram.ui.Cells.o8 f40117r0;
    public final org.telegram.ui.Components.y40 f40118s;
    public TLRPC.FileLocation f40119s0;
    public long f40120t0;
    public TLRPC.Chat f40121u0;
    public org.telegram.ui.Components.fu v;
    public TLRPC.ChatFull f40122v0;
    public eg.s3 f40123w;
    public TLRPC.TL_chatAdminRights f40124w0;
    public org.telegram.ui.Components.fo0 f40125x;
    public TLRPC.TL_chatBannedRights f40126x0;
    public LinearLayout f40127y;
    public TLRPC.TL_chatBannedRights f40128y0;
    public final long f40129z0;

    public po(Bundle bundle) {
        super(bundle);
        int i10;
        this.M0 = new ArrayList();
        this.N0 = new no(this);
        this.f40116r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.f40120t0 = bundle.getLong("chat_id", 0L);
        this.f40129z0 = bundle.getLong("user_id", 0L);
        if (this.f40120t0 != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f40120t0));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f40118s = new org.telegram.ui.Components.y40(i10, true, true);
            return;
        }
        this.f40118s = new org.telegram.ui.Components.y40(0, false, false);
    }

    public static void U(po poVar, FrameLayout frameLayout, View view) {
        SpannableStringBuilder replaceTags;
        if (!poVar.D0) {
            TLRPC.ChatFull chatFull = poVar.f40122v0;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", poVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0]));
            }
            org.telegram.ui.Components.qc.a0(poVar).Q(R.raw.topics, 36, replaceTags).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
        p2Var.f37958a = -poVar.f40120t0;
        p2Var.setResourceProvider(poVar.resourceProvider);
        boolean z4 = poVar.C0;
        boolean z10 = poVar.E0;
        eh.w wVar = new eh.w(13, poVar, view);
        p2Var.f37960c = z4;
        p2Var.d = z10;
        p2Var.f37962f = wVar;
        poVar.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
    }

    public static void V(po poVar) {
        poVar.f40119s0 = null;
        long j10 = poVar.f40129z0;
        if (j10 == 0) {
            MessagesController.getInstance(poVar.currentAccount).changeChatAvatar(poVar.f40120t0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = poVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.f20975id = new TLRPC.TL_inputPhotoEmpty();
            poVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ho(poVar, 2));
        }
        poVar.n0(false, true);
        oh.a4 a4Var = poVar.f40101e;
        org.telegram.ui.Components.z8 z8Var = poVar.f40116r;
        Object obj = poVar.A0;
        if (obj == null) {
            obj = poVar.f40121u0;
        }
        a4Var.h(null, null, z8Var, obj);
        poVar.O0.K(0);
        poVar.Y.f23313e.d();
    }

    public static void X(po poVar) {
        int i10 = poVar.currentAccount;
        long j10 = poVar.f40129z0;
        TL_bots.botVerifierSettings botverifiersettings = poVar.B0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e6 = org.telegram.messenger.y3.e(16, "onlySelect", "dialogsType", true);
        e6.putBoolean("resetDelegate", false);
        py pyVar = new py(e6);
        pyVar.setCurrentAccount(i10);
        pyVar.f40308z2 = new org.telegram.ui.Components.s1(pyVar, i10, j10, botverifiersettings);
        U.presentFragment(pyVar);
    }

    public static void Y(po poVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        d2Var.dismiss();
        if (poVar.getParentActivity() == null) {
            return;
        }
        fg.v0 v0Var = new fg.v0(35, poVar.currentAccount, poVar.getParentActivity(), poVar, poVar.getResourceProvider());
        v0Var.G1(canApplyBoost);
        v0Var.F1(tL_premium_boostsStatus, true);
        v0Var.H1(j10);
        TLRPC.Chat chat = poVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            v0Var.N0 = new fc(25, poVar, chat);
        }
        poVar.showDialog(v0Var);
    }

    public static void Z(po poVar) {
        bd bdVar = new bd(-poVar.f40121u0.f20843id);
        bdVar.f35433i0 = poVar;
        poVar.presentFragment(bdVar);
        MessagesController.getInstance(poVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(poVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static void a0(po poVar) {
        poVar.L0 = true;
        NotificationCenter.getInstance(poVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        z00 z00Var = new z00(10);
        z00Var.f43752a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        z00Var.f43756f = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Lj, false);
        spannableStringBuilder.setSpan(z00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.f40111n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.f40111n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override
    public final android.view.View createView(android.content.Context r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.po.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int r12, int r13, java.lang.Object... r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.po.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.f40118s.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.f40118s.f33296c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final boolean e0(boolean z4) {
        org.telegram.ui.Components.fu fuVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.f40129z0 != 0) {
            TLRPC.UserFull userFull = this.B0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.fu fuVar2 = this.v;
            if ((fuVar2 != null && !this.A0.first_name.equals(fuVar2.getText().toString())) || ((editTextBoldCursor2 = this.B) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z4) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.BotSettingsChangedAlert);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new io(this, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new io(this, 1));
                    showDialog(alertDialog$Builder.f21166a);
                    return false;
                }
            } else {
                return true;
            }
        } else {
            TLRPC.ChatFull chatFull = this.f40122v0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull != null && ChatObject.isChannel(this.f40121u0) && this.f40122v0.hidden_prehistory != this.G0) || (((fuVar = this.v) != null && !this.f40121u0.title.equals(fuVar.getText().toString())) || (((editTextBoldCursor = this.B) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.C0 != this.f40121u0.forum))) {
                if (z4) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    alertDialog$Builder2.f21166a.O = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                    if (this.F0) {
                        alertDialog$Builder2.f21166a.Q = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                    } else {
                        alertDialog$Builder2.f21166a.Q = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                    }
                    alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new io(this, 2));
                    alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new io(this, 3));
                    showDialog(alertDialog$Builder2.f21166a);
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void f0() {
        if (this.f40099c0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.f40120t0);
        TLRPC.ChatFull chatFull = this.f40122v0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.f40099c0.s(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
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
        f fVar = new f(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        oo ooVar = this.Y;
        int i10 = org.telegram.ui.ActionBar.k6.f21750i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(ooVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21961u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21979v6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f21821m6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.T, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.T, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.T, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.S, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.S, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.S, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.o8 o8Var = this.R;
        if (o8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(o8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.k6.f22053z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.K, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.K, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.K, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.fu fuVar = this.v;
        int i14 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fuVar, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21785k6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21803l6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 8388608, null, null, null, null, i14));
        LinearLayout linearLayout = this.d;
        int i15 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40127y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.f21624b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.D, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40097b0, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40095a0, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40095a0, 4, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21876p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, org.telegram.ui.ActionBar.k6.f21906r0, fVar, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40098c, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.Fi));
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40098c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40098c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.k6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40098c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40098c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40098c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40098c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.L, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.L, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.L, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.o8 o8Var2 = this.H;
        if (o8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(o8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.H, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.H, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.o8 o8Var3 = this.X;
        if (o8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(o8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.X, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.X, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.f40120t0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ho(this, 0));
    }

    public final void i0() {
        boolean z4;
        if (this.f40119s0 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f40118s.o(z4, new jo(this, 0), new v5(this, 5), 0);
        this.O0.K(0);
        this.O0.N(43);
        this.Y.f23313e.d();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.fu fuVar;
        String str;
        String str2;
        if (!this.K0 && (fuVar = this.v) != null) {
            if (fuVar.f27001a.length() == 0) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(this.v);
                return;
            }
            boolean z4 = true;
            this.K0 = true;
            String str3 = "";
            if (this.A0 != null) {
                TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
                setbotinfo.bot = getMessagesController().getInputUser(this.A0);
                setbotinfo.flags |= 4;
                setbotinfo.lang_code = "";
                if (!this.A0.first_name.equals(this.v.getText().toString())) {
                    setbotinfo.name = this.v.getText().toString();
                    setbotinfo.flags |= 8;
                }
                TLRPC.UserFull userFull = this.B0;
                if (userFull != null && (str2 = userFull.about) != null) {
                    str3 = str2;
                }
                EditTextBoldCursor editTextBoldCursor = this.B;
                if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                    setbotinfo.about = this.B.getText().toString();
                    setbotinfo.flags = 1 | setbotinfo.flags;
                }
                this.f40096b = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
                this.f40096b.setOnCancelListener(new mh.v(this, getConnectionsManager().sendRequest(setbotinfo, new lo(0, this, setbotinfo)), 3));
                this.f40096b.show();
            } else if (!ChatObject.isChannel(this.f40121u0) && (!this.G0 || this.C0)) {
                getMessagesController().convertToMegaGroup(getParentActivity(), this.f40120t0, this, new io(this, 5));
            } else {
                if (this.f40122v0 != null && ChatObject.isChannel(this.f40121u0)) {
                    TLRPC.ChatFull chatFull = this.f40122v0;
                    boolean z10 = chatFull.hidden_prehistory;
                    boolean z11 = this.G0;
                    if (z10 != z11) {
                        chatFull.hidden_prehistory = z11;
                        getMessagesController().toggleChannelInvitesHistory(this.f40120t0, this.G0);
                    }
                }
                if (this.f40118s.h()) {
                    this.J0 = true;
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
                    this.f40096b = d2Var;
                    d2Var.setOnCancelListener(new ig(this, 1));
                    this.f40096b.show();
                    return;
                }
                if (!this.f40121u0.title.equals(this.v.getText().toString())) {
                    getMessagesController().changeChatTitle(this.f40120t0, this.v.getText().toString());
                }
                TLRPC.ChatFull chatFull2 = this.f40122v0;
                if (chatFull2 != null && (str = chatFull2.about) != null) {
                    str3 = str;
                }
                EditTextBoldCursor editTextBoldCursor2 = this.B;
                if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
                    getMessagesController().updateChatAbout(this.f40120t0, this.B.getText().toString(), this.f40122v0);
                }
                boolean z12 = this.C0;
                TLRPC.Chat chat = this.f40121u0;
                if (z12 != chat.forum || this.E0 != chat.forum_tabs) {
                    if (this.E0 == chat.forum_tabs) {
                        z4 = false;
                    }
                    getMessagesController().toggleChannelForum(this.f40120t0, this.C0, this.E0);
                    if (this.C0 && !this.E0) {
                        List fragmentStack = getParentLayout().getFragmentStack();
                        for (int i10 = 0; i10 < fragmentStack.size(); i10++) {
                            if ((fragmentStack.get(i10) instanceof xn) && ((xn) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.f40120t0) {
                                ((ActionBarLayout) getParentLayout()).Y(i10);
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", this.f40120t0);
                                org.telegram.ui.ActionBar.f5 parentLayout = getParentLayout();
                                HashSet hashSet = mf1.f39101k1;
                                ((ActionBarLayout) parentLayout).c(i10, mf1.E0(getMessagesController(), getMessagesStorage(), bundle));
                            }
                        }
                    }
                    if (z4) {
                        q0();
                    }
                }
                finishFragment();
            }
        }
    }

    public final void k0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.po.k0():void");
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        boolean z4;
        org.telegram.ui.Components.l5 l5Var;
        this.f40122v0 = chatFull;
        if (chatFull != null) {
            if (this.f40121u0 == null) {
                this.f40121u0 = getMessagesController().getChat(Long.valueOf(this.f40120t0));
            }
            if (ChatObject.isChannel(this.f40121u0) && !this.f40122v0.hidden_prehistory) {
                z4 = false;
            } else {
                z4 = true;
            }
            this.G0 = z4;
            this.H0 = this.f40122v0.available_reactions;
            ArrayList arrayList = this.M0;
            arrayList.clear();
            TLRPC.Chat chat = this.f40121u0;
            TLRPC.ChatFull chatFull2 = this.f40122v0;
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
                                l5Var = org.telegram.ui.Components.l5.m(UserConfig.selectedAccount, org.telegram.ui.Components.l5.g(), tL_availableReaction.activate_animation);
                            }
                        } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            l5Var = org.telegram.ui.Components.l5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.l5.g());
                        } else {
                            l5Var = null;
                        }
                        if (l5Var != null) {
                            arrayList2.add(l5Var);
                            l5Var.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.l5 m9 = org.telegram.ui.Components.l5.m(UserConfig.selectedAccount, org.telegram.ui.Components.l5.g(), tL_availableReaction2.activate_animation);
                            arrayList2.add(m9);
                            m9.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.W != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.f40121u0)) {
                this.W.setVisibility(0);
            }
        }
        f0();
    }

    public final void m0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        int i10;
        TL_bots.BotInfo botInfo2;
        boolean z4;
        String format;
        TLRPC.User user;
        this.B0 = userFull;
        if (userFull != null) {
            if (this.A0 == null) {
                long j10 = this.f40129z0;
                if (j10 == 0) {
                    user = null;
                } else {
                    user = getMessagesController().getUser(Long.valueOf(j10));
                }
                this.A0 = user;
            }
            org.telegram.ui.Cells.o8 o8Var = this.f40110l0;
            int i11 = 0;
            if (o8Var != null) {
                if (this.B0 == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                o8Var.f(45, z4, true);
                TLRPC.UserFull userFull2 = this.B0;
                if (userFull2 != null) {
                    org.telegram.ui.Cells.o8 o8Var2 = this.f40110l0;
                    TL_payments.starRefProgram starrefprogram = userFull2.starref_program;
                    if (starrefprogram == null) {
                        format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    } else {
                        format = String.format(Locale.US, "%.1f%%", Float.valueOf(starrefprogram.commission_permille / 10.0f));
                    }
                    o8Var2.u(format, false);
                }
            }
            org.telegram.ui.Cells.o8 o8Var3 = this.f40117r0;
            if (o8Var3 != null) {
                TLRPC.UserFull userFull3 = this.B0;
                if (userFull3 != null && (botInfo2 = userFull3.bot_info) != null && botInfo2.verifier_settings != null) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                o8Var3.setVisibility(i10);
            }
            org.telegram.ui.Cells.a9 a9Var = this.f40115q0;
            if (a9Var != null) {
                TLRPC.UserFull userFull4 = this.B0;
                a9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 8);
            }
        }
    }

    public final void n0(boolean z4, boolean z10) {
        if (this.f40111n == null) {
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
            if (z4) {
                this.f40111n.setVisibility(0);
                this.f40103f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                RadialProgressView radialProgressView = this.f40111n;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f40103f, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f40111n;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f40103f, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new eg.u2(19, this, z4));
            this.h.start();
        } else if (z4) {
            this.f40111n.setAlpha(1.0f);
            this.f40111n.setVisibility(0);
            this.f40103f.setAlpha(1.0f);
            this.f40103f.setVisibility(0);
        } else {
            this.f40111n.setAlpha(0.0f);
            this.f40111n.setVisibility(4);
            this.f40103f.setAlpha(0.0f);
            this.f40103f.setVisibility(4);
        }
    }

    public final void o0() {
        org.telegram.ui.Cells.o8 o8Var;
        org.telegram.ui.Cells.o8 o8Var2;
        boolean z4;
        ep0 ep0Var;
        int v02;
        boolean q10;
        int i10;
        ArrayList<Integer> arrayList;
        int i11;
        int i12;
        qo0 qo0Var = this.I;
        if (qo0Var != null) {
            TLRPC.Chat chat = this.f40121u0;
            org.telegram.ui.Cells.o8 o8Var3 = this.K;
            if ((o8Var3 != null && o8Var3.getVisibility() == 0) || (((o8Var = this.N) != null && o8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.f40121u0) && ChatObject.hasAdminRights(this.f40121u0)) || ((o8Var2 = this.J) != null && o8Var2.getVisibility() == 0)))) {
                z4 = true;
            } else {
                z4 = false;
            }
            Paint paint = qo0Var.f40583n;
            int i13 = qo0Var.f40578a;
            org.telegram.ui.ActionBar.g6 g6Var = qo0Var.d;
            if (chat != null) {
                qo0Var.v = z4;
                qo0Var.f40584r = new org.telegram.ui.Components.l01(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.k6.f21853o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
                ep0 ep0Var2 = qo0Var.f40586w;
                MessagesController.PeerColor peerColor = null;
                if (ep0Var2 != null) {
                    ep0Var2.e(null);
                }
                TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    int i14 = ep0.f36656j;
                    int i15 = tL_emojiStatusCollectible.center_color | (-16777216);
                    qo0Var.f40586w = new ep0(tL_emojiStatusCollectible.document_id, i15, i15, i15);
                } else {
                    if (ChatObject.getProfileColorId(chat) >= 0) {
                        ep0Var = ep0.c(i13, ChatObject.getProfileColorId(chat));
                        ep0Var.f36657a = AndroidUtilities.dp(11.0f);
                        ep0Var.d();
                    } else {
                        ep0Var = null;
                    }
                    qo0Var.f40586w = ep0Var;
                }
                ep0 ep0Var3 = qo0Var.f40586w;
                if (ep0Var3 != null) {
                    ep0Var3.e(qo0Var);
                }
                TLRPC.PeerColor peerColor2 = chat.color;
                if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
                    if (g6Var != null) {
                        q10 = g6Var.a();
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
                    qo0Var.f40584r.o(i10);
                    paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.1f, i10));
                    ep0 ep0Var4 = new ep0(tL_peerColorCollectible.gift_emoji_id, intValue, i11, i12);
                    ep0Var4.f36657a = AndroidUtilities.dp(11.0f);
                    ep0Var4.d();
                    qo0Var.f40587x = ep0Var4;
                    ep0Var4.e(qo0Var);
                    return;
                }
                int colorId = ChatObject.getColorId(chat);
                if (colorId < 7) {
                    int i16 = org.telegram.ui.ActionBar.k6.f21914r8[colorId];
                    qo0Var.f40585s = i16;
                    v02 = org.telegram.ui.ActionBar.k6.v0(i16, g6Var);
                } else {
                    MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                    if (peerColors != null) {
                        peerColor = peerColors.getColor(colorId);
                    }
                    if (peerColor != null) {
                        qo0Var.f40585s = -1;
                        v02 = peerColor.getColor1();
                    } else {
                        int i17 = org.telegram.ui.ActionBar.k6.f21914r8[0];
                        qo0Var.f40585s = i17;
                        v02 = org.telegram.ui.ActionBar.k6.v0(i17, g6Var);
                    }
                }
                qo0Var.f40584r.o(v02);
                paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.1f, v02));
                ep0 a2 = ep0.a(i13, colorId);
                a2.f36657a = AndroidUtilities.dp(11.0f);
                a2.d();
                qo0Var.f40587x = a2;
                a2.e(qo0Var);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.f40118s.i(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar != null && fuVar.f27004e) {
            if (z4) {
                fuVar.k(true);
                return false;
            }
            return false;
        }
        return e0(z4);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f40098c;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.po.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.y40 y40Var = this.f40118s;
        if (y40Var != null) {
            y40Var.e();
        }
        if (this.f40121u0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.A0.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar != null) {
            fuVar.o();
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        eg.s3 s3Var = this.f40123w;
        if (s3Var != null) {
            s3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.f40098c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.M0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.l5) obj).p(null);
        }
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar != null) {
            fuVar.r();
        }
        UndoView undoView = this.f40098c;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.f40118s.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.f40118s.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar != null) {
            fuVar.s();
            this.v.getEditText().requestFocus();
        }
        o0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        p0(true, true);
        this.f40118s.l();
    }

    public final void p0(boolean z4, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        int i12;
        boolean z16;
        boolean z17;
        int i13;
        boolean z18;
        int i14;
        int i15;
        String str;
        boolean z19;
        boolean z20;
        float f10;
        float f11;
        int i16;
        TLRPC.ChatFull chatFull;
        int i17;
        String str2;
        String string;
        org.telegram.ui.Cells.o8 o8Var;
        org.telegram.ui.Cells.o8 o8Var2;
        boolean z21;
        org.telegram.ui.Cells.o8 o8Var3;
        org.telegram.ui.Cells.o8 o8Var4;
        boolean z22;
        int i18;
        String str3;
        String format;
        org.telegram.ui.Cells.o8 o8Var5;
        org.telegram.ui.Cells.o8 o8Var6;
        boolean z23;
        boolean z24;
        boolean z25;
        int i19;
        int i20;
        org.telegram.ui.Cells.o8 o8Var7;
        org.telegram.ui.Cells.o8 o8Var8;
        org.telegram.ui.Cells.o8 o8Var9;
        TLRPC.Chat chat;
        if (z4 && (chat = getMessagesController().getChat(Long.valueOf(this.f40120t0))) != null) {
            this.f40121u0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.f40121u0);
        org.telegram.ui.Cells.a9 a9Var = this.M;
        int i21 = 0;
        if (a9Var != null) {
            if (this.F == null && (((o8Var7 = this.G) == null || o8Var7.getVisibility() != 0) && (((o8Var8 = this.K) == null || o8Var8.getVisibility() != 0) && ((o8Var9 = this.E) == null || o8Var9.getVisibility() != 0)))) {
                i20 = 8;
            } else {
                i20 = 0;
            }
            a9Var.setVisibility(i20);
        }
        org.telegram.ui.Cells.o8 o8Var10 = this.V;
        if (o8Var10 != null) {
            if (ChatObject.isChannel(this.f40121u0)) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            o8Var10.setVisibility(i19);
        }
        org.telegram.ui.Cells.o8 o8Var11 = this.G;
        if (o8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.f40122v0;
            if (chatFull2 != null && (this.F0 || chatFull2.linked_chat_id != 0)) {
                o8Var11.setVisibility(0);
                if (this.f40122v0.linked_chat_id == 0) {
                    this.G.s(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f40122v0.linked_chat_id));
                    if (chat2 == null) {
                        this.G.setVisibility(8);
                    } else if (this.F0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.G.s(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.G.s(LocaleController.getString("Discussion", R.string.Discussion), yh.k("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.o8 o8Var12 = this.G;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i22 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.o8 o8Var13 = this.N;
                            if (o8Var13 != null && o8Var13.getVisibility() == 0) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            o8Var12.s(string2, str4, false, i22, z25);
                        } else {
                            org.telegram.ui.Cells.o8 o8Var14 = this.G;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String k10 = yh.k("@", publicUsername2);
                            int i23 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.o8 o8Var15 = this.N;
                            if (o8Var15 != null && o8Var15.getVisibility() == 0) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            o8Var14.s(string3, k10, false, i23, z24);
                        }
                    }
                }
            } else {
                o8Var11.setVisibility(8);
            }
        }
        org.telegram.ui.Cells.o8 o8Var16 = this.E;
        if (o8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.f40122v0;
            if (chatFull3 != null && chatFull3.can_set_location) {
                o8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.f40122v0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.E.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z10, true);
                } else {
                    this.E.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z10, true);
                }
            } else {
                o8Var16.setVisibility(8);
            }
        }
        if (this.F != null) {
            TLRPC.ChatFull chatFull4 = this.f40122v0;
            if (chatFull4 != null && (chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                if (!isPublic) {
                    format = LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit);
                } else {
                    format = String.format(android.support.v4.media.a.r(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.f40121u0));
                }
                String str5 = format;
                org.telegram.ui.Cells.o8 o8Var17 = this.F;
                String string4 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i24 = R.drawable.msg_channel;
                org.telegram.ui.Cells.o8 o8Var18 = this.K;
                if ((o8Var18 != null && o8Var18.getVisibility() == 0) || (((o8Var5 = this.G) != null && o8Var5.getVisibility() == 0) || ((o8Var6 = this.N) != null && o8Var6.getVisibility() == 0))) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                o8Var17.s(string4, str5, false, i24, z23);
            } else {
                boolean z26 = this.f40121u0.noforwards;
                if (this.F0) {
                    if (!isPublic) {
                        if (z26) {
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
                        if (z26) {
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
                if (this.F0) {
                    org.telegram.ui.Cells.o8 o8Var19 = this.F;
                    String string5 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i25 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.o8 o8Var20 = this.K;
                    if ((o8Var20 != null && o8Var20.getVisibility() == 0) || (((o8Var3 = this.G) != null && o8Var3.getVisibility() == 0) || ((o8Var4 = this.N) != null && o8Var4.getVisibility() == 0))) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    o8Var19.s(string5, str6, false, i25, z22);
                } else {
                    org.telegram.ui.Cells.o8 o8Var21 = this.F;
                    String string6 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i26 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.o8 o8Var22 = this.K;
                    if ((o8Var22 != null && o8Var22.getVisibility() == 0) || (((o8Var = this.G) != null && o8Var.getVisibility() == 0) || ((o8Var2 = this.N) != null && o8Var2.getVisibility() == 0))) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    o8Var21.s(string6, str6, false, i26, z21);
                }
            }
        }
        if (this.K != null) {
            if (this.G0 && !this.C0) {
                i15 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            } else {
                i15 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            }
            String string7 = LocaleController.getString(str, i15);
            org.telegram.ui.Cells.o8 o8Var23 = this.K;
            String string8 = LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort);
            int i27 = R.drawable.msg_discuss;
            if (this.N != null) {
                z19 = true;
            } else {
                z19 = false;
            }
            o8Var23.s(string8, string7, z10, i27, z19);
            this.K.setEnabled(!this.C0);
            if (!this.C0 && !isPublic && (((chatFull = this.f40122v0) == null || chatFull.linked_chat_id == 0) && (chatFull == null || !(chatFull.location instanceof TLRPC.TL_channelLocation)))) {
                z20 = true;
            } else {
                z20 = false;
            }
            ValueAnimator valueAnimator = this.P0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f12 = 0.0f;
            if (this.K.getAlpha() <= 0.0f && !z20) {
                this.K.setVisibility(8);
                o0();
            } else {
                float f13 = 1.0f;
                if (this.K.getVisibility() != 0 || this.K.getAlpha() < 1.0f || !z20) {
                    ArrayList arrayList = new ArrayList();
                    boolean z27 = false;
                    for (int i28 = 0; i28 < this.C.getChildCount(); i28++) {
                        if (!z27 && this.C.getChildAt(i28) == this.K) {
                            z27 = true;
                        } else if (z27) {
                            arrayList.add(this.C.getChildAt(i28));
                        }
                    }
                    boolean z28 = false;
                    for (int i29 = 0; i29 < this.f40123w.getChildCount(); i29++) {
                        if (!z28 && this.f40123w.getChildAt(i29) == this.C) {
                            z28 = true;
                        } else if (z28) {
                            arrayList.add(this.f40123w.getChildAt(i29));
                        }
                    }
                    if (this.K.getVisibility() != 0) {
                        this.K.setAlpha(0.0f);
                        org.telegram.ui.Cells.o8 o8Var24 = this.K;
                        o8Var24.setTranslationY((-o8Var24.getHeight()) / 2.0f);
                    }
                    this.K.setVisibility(0);
                    for (int i30 = 0; i30 < arrayList.size(); i30++) {
                        ((View) arrayList.get(i30)).setTranslationY((1.0f - this.K.getAlpha()) * (-this.K.getHeight()));
                    }
                    if (z10) {
                        float alpha = this.K.getAlpha();
                        if (z20) {
                            f12 = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f12);
                        this.P0 = ofFloat;
                        ofFloat.addUpdateListener(new bg.a(9, this, arrayList));
                        this.P0.addListener(new androidx.fragment.app.g(this, z20, arrayList, 5));
                        this.P0.setDuration(320L);
                        this.P0.setInterpolator(org.telegram.ui.Components.pr.h);
                        this.P0.start();
                    } else {
                        org.telegram.ui.Cells.o8 o8Var25 = this.K;
                        if (z20) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        o8Var25.setAlpha(f10);
                        org.telegram.ui.Cells.o8 o8Var26 = this.K;
                        float f14 = (-o8Var26.getHeight()) / 2.0f;
                        if (z20) {
                            f11 = 0.0f;
                        } else {
                            f11 = 1.0f;
                        }
                        o8Var26.setTranslationY(f14 * f11);
                        org.telegram.ui.Cells.o8 o8Var27 = this.K;
                        if (!z20) {
                            f13 = 0.0f;
                        }
                        o8Var27.setScaleY((f13 * 0.8f) + 0.2f);
                        org.telegram.ui.Cells.o8 o8Var28 = this.K;
                        if (z20) {
                            i16 = 0;
                        } else {
                            i16 = 8;
                        }
                        o8Var28.setVisibility(i16);
                        for (int i31 = 0; i31 < arrayList.size(); i31++) {
                            ((View) arrayList.get(i31)).setTranslationY(0.0f);
                        }
                        this.P0 = null;
                    }
                }
            }
        }
        if (this.Q != null) {
            if (this.f40122v0 != null) {
                org.telegram.ui.Cells.o8 o8Var29 = this.R;
                if (o8Var29 != null) {
                    if (o8Var29.getParent() == null) {
                        this.O.addView(this.R, this.O.indexOfChild(this.Q) + 1, k7.c6.n(-1, -2));
                    }
                    org.telegram.ui.Cells.o8 o8Var30 = this.R;
                    if (this.f40122v0.requests_pending > 0) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    o8Var30.setVisibility(i14);
                }
                if (this.F0 && !ChatObject.isCommunity(this.f40121u0)) {
                    this.Q.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.f40122v0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.o8 o8Var31 = this.U;
                    String string9 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull5 = this.f40122v0;
                    String format2 = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                    int i32 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.o8 o8Var32 = this.V;
                    if (o8Var32 != null && o8Var32.getVisibility() == 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    o8Var31.s(string9, format2, false, i32, z18);
                    z11 = z10;
                } else {
                    if (ChatObject.isChannel(this.f40121u0)) {
                        this.Q.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.f40122v0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        org.telegram.ui.Cells.o8 o8Var33 = this.Q;
                        String string10 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                        String format3 = String.format("%d", Integer.valueOf(this.f40122v0.participants.participants.size()));
                        int i33 = R.drawable.msg_groups;
                        if (this.R.getVisibility() == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        o8Var33.s(string10, format3, false, i33, z15);
                    }
                    TLRPC.Chat chat3 = this.f40121u0;
                    if (chat3.gigagroup && !ChatObject.isCommunity(chat3)) {
                        org.telegram.ui.Cells.o8 o8Var34 = this.U;
                        String string11 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull6 = this.f40122v0;
                        String format4 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                        int i34 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.o8 o8Var35 = this.V;
                        if (o8Var35 != null && o8Var35.getVisibility() == 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        o8Var34.s(string11, format4, false, i34, z17);
                        z11 = z10;
                    } else {
                        if (this.C0) {
                            i10 = 16;
                        } else {
                            i10 = 15;
                        }
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.f40121u0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i35 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i35++;
                            }
                            i11 = qr.n0(tL_chatBannedRights) + i35;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.f40121u0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i11++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i11++;
                            }
                            if (this.C0 && !tL_chatBannedRights2.manage_topics) {
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
                        z11 = z10;
                        this.U.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i11), Integer.valueOf(i12)), z11, R.drawable.msg_permissions, true);
                    }
                    org.telegram.ui.Cells.o8 o8Var36 = this.R;
                    if (o8Var36 != null) {
                        String string12 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format5 = String.format("%d", Integer.valueOf(this.f40122v0.requests_pending));
                        int i36 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.o8 o8Var37 = this.V;
                        if (o8Var37 != null && o8Var37.getVisibility() == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        o8Var36.s(string12, format5, false, i36, z16);
                    }
                }
                org.telegram.ui.Cells.o8 o8Var38 = this.T;
                String string13 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.f40121u0)) {
                    i13 = this.f40122v0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.f40122v0;
                    if (chatFull7 == null) {
                        i13 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i37 = 0;
                        for (int i38 = 0; i38 < size; i38++) {
                            TLRPC.ChatParticipant chatParticipant = this.f40122v0.participants.participants.get(i38);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i37++;
                            }
                        }
                        i13 = i37;
                    }
                }
                o8Var38.s(string13, String.format("%d", Integer.valueOf(i13)), false, R.drawable.msg_admins, true);
            } else {
                z11 = z10;
                if (this.F0 && !ChatObject.isCommunity(this.f40121u0)) {
                    this.Q.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.o8 o8Var39 = this.U;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i39 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.o8 o8Var40 = this.V;
                    if (o8Var40 != null && o8Var40.getVisibility() == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    o8Var39.m(i39, string14, z14);
                } else {
                    org.telegram.ui.Cells.o8 o8Var41 = this.Q;
                    String string15 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i40 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.o8 o8Var42 = this.V;
                    if (o8Var42 != null && o8Var42.getVisibility() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    o8Var41.m(i40, string15, z12);
                    if (this.f40121u0.gigagroup) {
                        org.telegram.ui.Cells.o8 o8Var43 = this.U;
                        String string16 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i41 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.o8 o8Var44 = this.V;
                        if (o8Var44 != null && o8Var44.getVisibility() == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        o8Var43.m(i41, string16, z13);
                    } else {
                        this.U.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                }
                this.T.m(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            org.telegram.ui.Cells.o8 o8Var45 = this.L;
            if (!ChatObject.canChangeChatInfo(this.f40121u0)) {
                i21 = 8;
            }
            o8Var45.setVisibility(i21);
            s0(z11);
            if (this.f40122v0 != null && ChatObject.canUserDoAdminAction(this.f40121u0, 3) && (!isPublic || !this.f40121u0.creator)) {
                if (this.f40122v0.invitesCount > 0) {
                    this.S.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.f40122v0.invitesCount), false, R.drawable.msg_link2, true);
                } else {
                    this.S.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
                }
            } else {
                this.S.setVisibility(8);
            }
        }
        if (this.H != null) {
            t0(null);
        }
    }

    public final void q0() {
        py pyVar;
        kx kxVar;
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            int i10 = 0;
            while (i10 < fragmentStack.size()) {
                if (fragmentStack.get(i10) instanceof xn) {
                    xn xnVar = (xn) fragmentStack.get(i10);
                    if (xnVar.getArguments().getLong("chat_id") == this.f40120t0) {
                        ((ActionBarLayout) getParentLayout()).a0(xnVar, false);
                        xnVar.clearViews();
                        ((ActionBarLayout) getParentLayout()).c(i10, xnVar);
                        if (!this.E0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", this.f40120t0);
                            ((ActionBarLayout) getParentLayout()).c(i10, new mf1(bundle));
                            i10++;
                        }
                    }
                } else if (this.E0 && (fragmentStack.get(i10) instanceof mf1)) {
                    mf1 mf1Var = (mf1) fragmentStack.get(i10);
                    if (mf1Var.g() != null && mf1Var.g().f20843id == this.f40120t0) {
                        ((ActionBarLayout) getParentLayout()).a0(mf1Var, false);
                        i10--;
                    }
                } else if (this.E0 && (fragmentStack.get(i10) instanceof py) && (pyVar = (py) fragmentStack.get(i10)) != null && (kxVar = pyVar.C3) != null && kxVar.c()) {
                    pyVar.C3.a();
                }
                i10++;
            }
        }
    }

    public final void r0() {
        if (this.f40107i0 == null) {
            return;
        }
        if (this.A0.usernames.size() > 1) {
            ArrayList<TLRPC.TL_username> arrayList = this.A0.usernames;
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
            this.f40107i0.s(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i10), Integer.valueOf(this.A0.usernames.size())), false, R.drawable.msg_link2, true);
            return;
        }
        org.telegram.ui.Cells.o8 o8Var = this.f40107i0;
        String string = LocaleController.getString(R.string.BotPublicLink);
        o8Var.s(string, "t.me/" + this.A0.username, false, R.drawable.msg_link2, true);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.y40 y40Var = this.f40118s;
        if (y40Var != null) {
            y40Var.f33298f = bundle.getString("path");
        }
    }

    public final void s0(boolean z4) {
        String str;
        String str2;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.f40120t0);
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.f40121u0);
        TLRPC.ChatReactions chatReactions = this.H0;
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
                this.L.s(LocaleController.getString(R.string.Reactions), str, z4, R.drawable.msg_reactions2, true);
            }
        }
        str = str2;
        this.L.s(LocaleController.getString(R.string.Reactions), str, z4, R.drawable.msg_reactions2, true);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.y40 y40Var = this.f40118s;
        if (y40Var != null && (str = y40Var.f33298f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar != null) {
            String obj = fuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0(Long l10) {
        boolean z4;
        TLRPC.Chat chat = this.f40121u0;
        if (chat != null && this.H != null) {
            long j10 = 0;
            if (l10 != null) {
                if (l10.longValue() >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = chat.broadcast_messages_allowed;
            }
            if (z4) {
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.f40121u0.linked_monoforum_id));
                if (l10 != null) {
                    j10 = l10.longValue();
                } else if (chat2 != null) {
                    j10 = chat2.send_paid_messages_stars;
                }
                this.H.s(LocaleController.getString(R.string.PostSuggestions), mh.ja.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
                return;
            }
            this.H.s(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void P() {
    }
}
