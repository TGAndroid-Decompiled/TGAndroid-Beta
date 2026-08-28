package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener {
    public static final float[] I0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public ImageView A;
    public boolean A0;
    public org.telegram.ui.ActionBar.w0 B;
    public boolean B0;
    public vc C;
    public final Paint C0;
    public org.telegram.ui.ActionBar.c1 D;
    public boolean D0;
    public final org.telegram.ui.ActionBar.u0[] E;
    public int E0;
    public FrameLayout F;
    public float F0;
    public ImageView G;
    public final td.j G0;
    public org.telegram.ui.gk H;
    public int H0;
    public int I;
    public org.telegram.ui.Components.voip.h J;
    public boolean K;
    public int L;
    public MessageObject M;
    public float N;
    public boolean O;
    public int P;
    public String Q;
    public boolean R;
    public boolean S;
    public c9 T;
    public Paint U;
    public LinearGradient V;
    public Matrix W;
    public final yc f26374a;
    public int f26375a0;
    public ImageView f26376b;
    public TextPaint f26377b0;
    public qf0 f26378c;
    public boolean f26379c0;
    public c10 d;
    public boolean f26380d0;
    public c10 f26381e;
    public final i6 f26382e0;
    public AnimatorSet f26383f;
    public pc f26384f0;
    public boolean f26385g0;
    public final org.telegram.ui.ActionBar.o2 h;
    public final a10 f26386h0;
    public final int f26387i0;
    public final boolean f26388j0;
    public g10 f26389k0;
    public final org.telegram.ui.ActionBar.b6 f26390l0;
    public boolean m0;
    public final rg f26391n;
    public int f26392n0;
    public final m.i3 f26393o0;
    public final AnimationNotificationsLocker f26394p0;
    public final AnimationNotificationsLocker f26395q0;
    public b10 f26396r;
    public boolean f26397r0;
    public dh.g f26398s;
    public boolean f26399s0;
    public boolean f26400t0;
    public boolean f26401u0;
    public View v;
    public boolean f26402v0;
    public pi0 f26403w;
    public org.telegram.ui.wi f26404w0;
    public e10 f26405x;
    public long f26406x0;
    public mi0 f26407y;
    public float f26408y0;
    public float f26409z0;

    public FragmentContextView(Context context, org.telegram.ui.dy dyVar, boolean z10) {
        this(context, dyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i9 = this.P;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26390l0;
        if (i9 == 4) {
            return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23286t7, b6Var);
        }
        if (i9 != 1 && i9 != 3) {
            return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23304u7, b6Var);
        }
        return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A7, b6Var);
    }

    public static boolean i(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.05f) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVoice()) {
            return true;
        }
        return false;
    }

    public final void a(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.a(boolean):void");
    }

    public final void b() {
        if (this.f26396r != null) {
            return;
        }
        Context context = getContext();
        b10 b10Var = new b10(this, context);
        this.f26396r = b10Var;
        this.f26384f0 = new pc(b10Var);
        int i9 = AndroidUtilities.displaySize.x;
        i6 i6Var = this.f26382e0;
        i6Var.G = i9;
        i6Var.v = 0.4f;
        i6Var.setCallback(b10Var);
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        addView(this.f26396r, g7.e6.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.f26396r.addView(view, g7.e6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f26376b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f26376b;
        int i10 = org.telegram.ui.ActionBar.f6.f23335w7;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26390l0;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.f26376b;
        qf0 qf0Var = new qf0(16);
        this.f26378c = qf0Var;
        imageView3.setImageDrawable(qf0Var);
        this.f26376b.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i10, b6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f26376b, g7.e6.e(36, 36, 51));
        this.f26376b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f33194b;

            {
                this.f33194b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i11;
                long j10;
                TL_stories.StoryItem u10;
                int i12;
                int i13 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f33194b;
                switch (i13) {
                    case 0:
                        rg rgVar = fragmentContextView.f26391n;
                        org.telegram.ui.ActionBar.b6 b6Var2 = fragmentContextView.f26390l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, b6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.dy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i14 = rgVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i14 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i14)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new u00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        rg rgVar2 = fragmentContextView.f26391n;
                        org.telegram.ui.ActionBar.b6 b6Var3 = fragmentContextView.f26390l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.P;
                        if (i15 == 6) {
                            ih.f1 f1Var = ih.f1.S;
                            if (f1Var != null) {
                                long j11 = f1Var.f11399b;
                                int i16 = f1Var.f11401e;
                                if (i16 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i16);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i16).getStoriesController().u(f1Var.f11400c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i16).A(i16, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i15 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, b6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new c8(LaunchActivity.C1, b6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (rgVar2 != null) {
                                    j12 = rgVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26391n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    return;
                                }
                                long dialogId = playingMessageObject.getDialogId();
                                Bundle bundle = new Bundle();
                                if (DialogObject.isEncryptedDialog(dialogId)) {
                                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                } else if (DialogObject.isUserDialog(dialogId)) {
                                    bundle.putLong("user_id", dialogId);
                                } else {
                                    bundle.putLong("chat_id", -dialogId);
                                }
                                bundle.putInt("message_id", playingMessageObject.getId());
                                o2Var2.presentFragment(new org.telegram.ui.qn(bundle), o2Var2 instanceof org.telegram.ui.qn);
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i15 == 2) {
                            int i17 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i11 = o2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!LocationController.getInstance(i18).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i18).sharingLocationsUI.get(0);
                                            long j13 = sharingLocationInfo.did;
                                            i11 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j13;
                                        }
                                    }
                                }
                                i11 = i17;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i11).getSharingLocationInfo(j10));
                                return;
                            } else {
                                o2Var2.showDialog(new iu0(fragmentContextView.getContext(), new u00(fragmentContextView), b6Var3));
                                return;
                            }
                        } else if (i15 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.o50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i15 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i15 == 5) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(qnVar.a()) != null) {
                                g40 g40Var = new g40(fragmentContextView.getContext(), null, qnVar, b6Var3);
                                g40Var.setOnHideListener(new a1(fragmentContextView, 6));
                                o2Var2.showDialog(g40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.P == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                return;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            mi0 mi0Var = fragmentContextView.f26407y;
                            if (fragmentContextView.K) {
                                i12 = 15;
                            } else {
                                i12 = 29;
                            }
                            if (mi0Var.N(i12)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26407y.K(0);
                                } else {
                                    fragmentContextView.f26407y.K(14);
                                }
                            }
                            fragmentContextView.f26405x.d();
                            org.telegram.ui.ActionBar.f6.D0().c(true);
                            fragmentContextView.f26374a.f(true);
                            try {
                                fragmentContextView.f26405x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        ?? imageView4 = new ImageView(context);
        this.f26403w = imageView4;
        imageView4.setScaleType(scaleType);
        this.f26403w.setAutoRepeat(true);
        this.f26403w.f(R.raw.import_progress, 30, 30, null);
        this.f26403w.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.f6.v0(i10, b6Var)));
        addView(this.f26403w, g7.e6.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        c10 c10Var = new c10(this, context, context, 0);
        this.d = c10Var;
        addView(c10Var, g7.e6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        c10 c10Var2 = new c10(this, context, context, 1);
        this.f26381e = c10Var2;
        addView(c10Var2, g7.e6.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.J = hVar;
        hVar.f33542g = 1.0f;
        hVar.f33544j = false;
        org.telegram.ui.gk gkVar = new org.telegram.ui.gk(this, context, 1);
        this.H = gkVar;
        gkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.H.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, b6Var));
        org.telegram.ui.gk gkVar2 = this.H;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var);
        int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Qh, b6Var);
        gkVar2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.H.setTextSize(1, 14.0f);
        this.H.setTypeface(AndroidUtilities.bold());
        this.H.setGravity(17);
        this.H.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.H, g7.e6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f33194b;

            {
                this.f33194b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i11;
                long j10;
                TL_stories.StoryItem u10;
                int i12;
                int i13 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f33194b;
                switch (i13) {
                    case 0:
                        rg rgVar = fragmentContextView.f26391n;
                        org.telegram.ui.ActionBar.b6 b6Var2 = fragmentContextView.f26390l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, b6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.dy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i14 = rgVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i14 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i14)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new u00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        rg rgVar2 = fragmentContextView.f26391n;
                        org.telegram.ui.ActionBar.b6 b6Var3 = fragmentContextView.f26390l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.P;
                        if (i15 == 6) {
                            ih.f1 f1Var = ih.f1.S;
                            if (f1Var != null) {
                                long j11 = f1Var.f11399b;
                                int i16 = f1Var.f11401e;
                                if (i16 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i16);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i16).getStoriesController().u(f1Var.f11400c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i16).A(i16, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i15 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, b6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new c8(LaunchActivity.C1, b6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (rgVar2 != null) {
                                    j12 = rgVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26391n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    return;
                                }
                                long dialogId = playingMessageObject.getDialogId();
                                Bundle bundle = new Bundle();
                                if (DialogObject.isEncryptedDialog(dialogId)) {
                                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                } else if (DialogObject.isUserDialog(dialogId)) {
                                    bundle.putLong("user_id", dialogId);
                                } else {
                                    bundle.putLong("chat_id", -dialogId);
                                }
                                bundle.putInt("message_id", playingMessageObject.getId());
                                o2Var2.presentFragment(new org.telegram.ui.qn(bundle), o2Var2 instanceof org.telegram.ui.qn);
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i15 == 2) {
                            int i17 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i11 = o2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!LocationController.getInstance(i18).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i18).sharingLocationsUI.get(0);
                                            long j13 = sharingLocationInfo.did;
                                            i11 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j13;
                                        }
                                    }
                                }
                                i11 = i17;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i11).getSharingLocationInfo(j10));
                                return;
                            } else {
                                o2Var2.showDialog(new iu0(fragmentContextView.getContext(), new u00(fragmentContextView), b6Var3));
                                return;
                            }
                        } else if (i15 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.o50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i15 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i15 == 5) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(qnVar.a()) != null) {
                                g40 g40Var = new g40(fragmentContextView.getContext(), null, qnVar, b6Var3);
                                g40Var.setOnHideListener(new a1(fragmentContextView, 6));
                                o2Var2.showDialog(g40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.P == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                return;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            mi0 mi0Var = fragmentContextView.f26407y;
                            if (fragmentContextView.K) {
                                i12 = 15;
                            } else {
                                i12 = 29;
                            }
                            if (mi0Var.N(i12)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26407y.K(0);
                                } else {
                                    fragmentContextView.f26407y.K(14);
                                }
                            }
                            fragmentContextView.f26405x.d();
                            org.telegram.ui.ActionBar.f6.D0().c(true);
                            fragmentContextView.f26374a.f(true);
                            try {
                                fragmentContextView.f26405x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        if (this.A0) {
            m();
        }
        this.F = new FrameLayout(context);
        ImageView imageView5 = new ImageView(context);
        this.G = imageView5;
        imageView5.setImageResource(R.drawable.msg_mute);
        ImageView imageView6 = this.G;
        int i11 = org.telegram.ui.ActionBar.f6.f23352x7;
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), mode));
        this.F.addView(this.G, g7.e6.e(20, 20, 17));
        this.F.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i11, b6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.F.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.F.setOnClickListener(new fh.n(14));
        this.F.setVisibility(8);
        addView(this.F, g7.e6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f26388j0) {
            h();
        }
        c9 c9Var = new c9(context, false);
        this.T = c9Var;
        c9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.T.setDelegate(new y00(this, 1));
        this.T.setVisibility(8);
        addView(this.T, g7.e6.e(108, 36, 51));
        int i12 = R.raw.voice_muted;
        this.f26407y = new mi0(i12, "" + R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        e10 e10Var = new e10(this, context);
        this.f26405x = e10Var;
        e10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A7, b6Var), PorterDuff.Mode.SRC_IN));
        this.f26405x.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i11, b6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f26405x.setAnimation(this.f26407y);
        this.f26405x.setScaleType(scaleType);
        this.f26405x.setVisibility(8);
        addView(this.f26405x, g7.e6.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.f26405x.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f33194b;

            {
                this.f33194b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i112;
                long j10;
                TL_stories.StoryItem u10;
                int i122;
                int i13 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f33194b;
                switch (i13) {
                    case 0:
                        rg rgVar = fragmentContextView.f26391n;
                        org.telegram.ui.ActionBar.b6 b6Var2 = fragmentContextView.f26390l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, b6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.dy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i14 = rgVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i14 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i14)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new u00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        rg rgVar2 = fragmentContextView.f26391n;
                        org.telegram.ui.ActionBar.b6 b6Var3 = fragmentContextView.f26390l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.P;
                        if (i15 == 6) {
                            ih.f1 f1Var = ih.f1.S;
                            if (f1Var != null) {
                                long j11 = f1Var.f11399b;
                                int i16 = f1Var.f11401e;
                                if (i16 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i16);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i16).getStoriesController().u(f1Var.f11400c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i16).A(i16, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i15 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, b6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new c8(LaunchActivity.C1, b6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (rgVar2 != null) {
                                    j12 = rgVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26391n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    return;
                                }
                                long dialogId = playingMessageObject.getDialogId();
                                Bundle bundle = new Bundle();
                                if (DialogObject.isEncryptedDialog(dialogId)) {
                                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                } else if (DialogObject.isUserDialog(dialogId)) {
                                    bundle.putLong("user_id", dialogId);
                                } else {
                                    bundle.putLong("chat_id", -dialogId);
                                }
                                bundle.putInt("message_id", playingMessageObject.getId());
                                o2Var2.presentFragment(new org.telegram.ui.qn(bundle), o2Var2 instanceof org.telegram.ui.qn);
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i15 == 2) {
                            int i17 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i112 = o2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!LocationController.getInstance(i18).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i18).sharingLocationsUI.get(0);
                                            long j13 = sharingLocationInfo.did;
                                            i112 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j13;
                                        }
                                    }
                                }
                                i112 = i17;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i112).getSharingLocationInfo(j10));
                                return;
                            } else {
                                o2Var2.showDialog(new iu0(fragmentContextView.getContext(), new u00(fragmentContextView), b6Var3));
                                return;
                            }
                        } else if (i15 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.o50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i15 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i15 == 5) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(qnVar.a()) != null) {
                                g40 g40Var = new g40(fragmentContextView.getContext(), null, qnVar, b6Var3);
                                g40Var.setOnHideListener(new a1(fragmentContextView, 6));
                                o2Var2.showDialog(g40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.P == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                return;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            mi0 mi0Var = fragmentContextView.f26407y;
                            if (fragmentContextView.K) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (mi0Var.N(i122)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26407y.K(0);
                                } else {
                                    fragmentContextView.f26407y.K(14);
                                }
                            }
                            fragmentContextView.f26405x.d();
                            org.telegram.ui.ActionBar.f6.D0().c(true);
                            fragmentContextView.f26374a.f(true);
                            try {
                                fragmentContextView.f26405x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        ImageView imageView7 = new ImageView(context);
        this.A = imageView7;
        imageView7.setImageResource(R.drawable.miniplayer_close);
        this.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), mode));
        this.A.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i11, b6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.A.setScaleType(scaleType);
        addView(this.A, g7.e6.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.A.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f33194b;

            {
                this.f33194b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i112;
                long j10;
                TL_stories.StoryItem u10;
                int i122;
                int i13 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f33194b;
                switch (i13) {
                    case 0:
                        rg rgVar = fragmentContextView.f26391n;
                        org.telegram.ui.ActionBar.b6 b6Var2 = fragmentContextView.f26390l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, b6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.dy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i14 = rgVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i14 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i14)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new u00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        rg rgVar2 = fragmentContextView.f26391n;
                        org.telegram.ui.ActionBar.b6 b6Var3 = fragmentContextView.f26390l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.P;
                        if (i15 == 6) {
                            ih.f1 f1Var = ih.f1.S;
                            if (f1Var != null) {
                                long j11 = f1Var.f11399b;
                                int i16 = f1Var.f11401e;
                                if (i16 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i16);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i16).getStoriesController().u(f1Var.f11400c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i16).A(i16, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i15 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, b6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new c8(LaunchActivity.C1, b6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (rgVar2 != null) {
                                    j12 = rgVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26391n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    return;
                                }
                                long dialogId = playingMessageObject.getDialogId();
                                Bundle bundle = new Bundle();
                                if (DialogObject.isEncryptedDialog(dialogId)) {
                                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                } else if (DialogObject.isUserDialog(dialogId)) {
                                    bundle.putLong("user_id", dialogId);
                                } else {
                                    bundle.putLong("chat_id", -dialogId);
                                }
                                bundle.putInt("message_id", playingMessageObject.getId());
                                o2Var2.presentFragment(new org.telegram.ui.qn(bundle), o2Var2 instanceof org.telegram.ui.qn);
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i15 == 2) {
                            int i17 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i112 = o2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!LocationController.getInstance(i18).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i18).sharingLocationsUI.get(0);
                                            long j13 = sharingLocationInfo.did;
                                            i112 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j13;
                                        }
                                    }
                                }
                                i112 = i17;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i112).getSharingLocationInfo(j10));
                                return;
                            } else {
                                o2Var2.showDialog(new iu0(fragmentContextView.getContext(), new u00(fragmentContextView), b6Var3));
                                return;
                            }
                        } else if (i15 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.o50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i15 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i15 == 5) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(qnVar.a()) != null) {
                                g40 g40Var = new g40(fragmentContextView.getContext(), null, qnVar, b6Var3);
                                g40Var.setOnHideListener(new a1(fragmentContextView, 6));
                                o2Var2.showDialog(g40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.P == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                return;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            mi0 mi0Var = fragmentContextView.f26407y;
                            if (fragmentContextView.K) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (mi0Var.N(i122)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26407y.K(0);
                                } else {
                                    fragmentContextView.f26407y.K(14);
                                }
                            }
                            fragmentContextView.f26405x.d();
                            org.telegram.ui.ActionBar.f6.D0().c(true);
                            fragmentContextView.f26374a.f(true);
                            try {
                                fragmentContextView.f26405x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        dh.g gVar = new dh.g(getContext(), 14);
        this.f26398s = gVar;
        addView(gVar, g7.e6.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f33194b;

            {
                this.f33194b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i112;
                long j10;
                TL_stories.StoryItem u10;
                int i122;
                int i13 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f33194b;
                switch (i13) {
                    case 0:
                        rg rgVar = fragmentContextView.f26391n;
                        org.telegram.ui.ActionBar.b6 b6Var2 = fragmentContextView.f26390l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, b6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.dy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i14 = rgVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i14 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i14)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new u00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        rg rgVar2 = fragmentContextView.f26391n;
                        org.telegram.ui.ActionBar.b6 b6Var3 = fragmentContextView.f26390l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.P;
                        if (i15 == 6) {
                            ih.f1 f1Var = ih.f1.S;
                            if (f1Var != null) {
                                long j11 = f1Var.f11399b;
                                int i16 = f1Var.f11401e;
                                if (i16 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i16);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i16).getStoriesController().u(f1Var.f11400c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i16).A(i16, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i15 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, b6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new c8(LaunchActivity.C1, b6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (rgVar2 != null) {
                                    j12 = rgVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26391n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                    return;
                                }
                                long dialogId = playingMessageObject.getDialogId();
                                Bundle bundle = new Bundle();
                                if (DialogObject.isEncryptedDialog(dialogId)) {
                                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                                } else if (DialogObject.isUserDialog(dialogId)) {
                                    bundle.putLong("user_id", dialogId);
                                } else {
                                    bundle.putLong("chat_id", -dialogId);
                                }
                                bundle.putInt("message_id", playingMessageObject.getId());
                                o2Var2.presentFragment(new org.telegram.ui.qn(bundle), o2Var2 instanceof org.telegram.ui.qn);
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i15 == 2) {
                            int i17 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i112 = o2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i18 = 0; i18 < 4; i18++) {
                                        if (!LocationController.getInstance(i18).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i18).sharingLocationsUI.get(0);
                                            long j13 = sharingLocationInfo.did;
                                            i112 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j13;
                                        }
                                    }
                                }
                                i112 = i17;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i112).getSharingLocationInfo(j10));
                                return;
                            } else {
                                o2Var2.showDialog(new iu0(fragmentContextView.getContext(), new u00(fragmentContextView), b6Var3));
                                return;
                            }
                        } else if (i15 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.o50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i15 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i15 == 5) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(qnVar.a()) != null) {
                                g40 g40Var = new g40(fragmentContextView.getContext(), null, qnVar, b6Var3);
                                g40Var.setOnHideListener(new a1(fragmentContextView, 6));
                                o2Var2.showDialog(g40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.P == 0) {
                            if (MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                                return;
                            } else {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                                return;
                            }
                        }
                        return;
                    case 3:
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.I0;
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        if (sharedInstance != null) {
                            if (sharedInstance.groupCall != null) {
                                AccountInstance.getInstance(sharedInstance.getAccount());
                                ChatObject.Call call = sharedInstance.groupCall;
                                TLRPC.Chat chat2 = sharedInstance.getChat();
                                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
                                if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(chat2)) {
                                    return;
                                }
                            }
                            boolean z11 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            mi0 mi0Var = fragmentContextView.f26407y;
                            if (fragmentContextView.K) {
                                i122 = 15;
                            } else {
                                i122 = 29;
                            }
                            if (mi0Var.N(i122)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26407y.K(0);
                                } else {
                                    fragmentContextView.f26407y.K(14);
                                }
                            }
                            fragmentContextView.f26405x.d();
                            org.telegram.ui.ActionBar.f6.D0().c(true);
                            fragmentContextView.f26374a.f(true);
                            try {
                                fragmentContextView.f26405x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        setLeftMargin(this.F0);
    }

    public final void c(boolean z10) {
        int i9;
        rg rgVar = this.f26391n;
        if (rgVar != null) {
            if (!this.O || ((i9 = this.P) != 1 && i9 != 3)) {
                b();
                org.telegram.ui.ActionBar.o2 o2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = o2Var.getSendMessagesHelper().getImportingHistory(rgVar.a());
                View fragmentView = o2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = o2Var.getVisibleDialog();
                if ((j() || rgVar.n() || ((visibleDialog instanceof g40) && !((g40) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f26394p0;
                if (importingHistory == null) {
                    if (this.O && ((z10 && this.P == -1) || this.P == 5)) {
                        this.O = false;
                        if (z10) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                            return;
                        }
                        AnimatorSet animatorSet = this.f26383f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f26383f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f26383f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f26383f.setDuration(220L);
                        this.f26383f.setInterpolator(gr.f28844f);
                        this.f26383f.addListener(new z00(this, 4));
                        this.f26383f.start();
                        return;
                    }
                    int i10 = this.P;
                    if (i10 == -1 || i10 == 5) {
                        this.O = false;
                        setVisibility(8);
                    }
                } else if (this.P != 5 && this.f26383f != null && !z10) {
                    this.f26401u0 = true;
                } else {
                    r(5);
                    if (z10 && this.N == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        g10 g10Var = this.f26389k0;
                        if (g10Var != null) {
                            ((bq0) g10Var).a(true);
                            ((bq0) this.f26389k0).a(false);
                        }
                    }
                    if (!this.O) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f26383f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f26383f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f26383f = new AnimatorSet();
                            g10 g10Var2 = this.f26389k0;
                            if (g10Var2 != null) {
                                ((bq0) g10Var2).a(true);
                            }
                            this.f26383f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f26383f.setDuration(200L);
                            this.f26383f.addListener(new z00(this, 5));
                            this.f26383f.start();
                        }
                        this.O = true;
                        setVisibility(0);
                    }
                    int i11 = this.L;
                    int i12 = importingHistory.uploadProgress;
                    if (i11 != i12) {
                        this.L = i12;
                        this.d.b(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", R.string.ImportUploading, Integer.valueOf(i12))), false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        boolean isSharingLocation;
        String formatPluralString;
        String string;
        TextView nextTextView;
        org.telegram.ui.ActionBar.o2 o2Var = this.h;
        View fragmentView = o2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = o2Var instanceof org.telegram.ui.dy;
        if (z11) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(o2Var.getCurrentAccount()).isSharingLocation(this.f26391n.a());
        }
        m.i3 i3Var = this.f26393o0;
        if (!isSharingLocation) {
            this.f26392n0 = -1;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            if (this.O) {
                this.O = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f26383f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26383f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26383f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f26383f.setDuration(200L);
                this.f26383f.addListener(new z00(this, 0));
                this.f26383f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f26376b.setImageDrawable(new sp0(getContext(), 1));
        if (z10 && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.O) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f26383f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f26383f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f26383f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f26383f.setDuration(200L);
                this.f26383f.addListener(new z00(this, 1));
                this.f26383f.start();
            }
            this.O = true;
            setVisibility(0);
        }
        if (z11) {
            String string2 = LocaleController.getString(R.string.LiveLocationContext);
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < 4; i9++) {
                arrayList.addAll(LocationController.getInstance(i9).sharingLocationsUI);
            }
            if (arrayList.size() == 1) {
                LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) arrayList.get(0);
                long dialogId = sharingLocationInfo.messageObject.getDialogId();
                if (DialogObject.isUserDialog(dialogId)) {
                    formatPluralString = UserObject.getFirstName(MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getUser(Long.valueOf(dialogId)));
                    string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
                    if (chat != null) {
                        formatPluralString = chat.title;
                    } else {
                        formatPluralString = "";
                    }
                    string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChat);
                }
            } else {
                formatPluralString = LocaleController.formatPluralString("Chats", arrayList.size(), new Object[0]);
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChats);
            }
            String format = String.format(string, string2, formatPluralString);
            int indexOf = format.indexOf(string2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            for (int i10 = 0; i10 < 2; i10++) {
                c10 c10Var = this.d;
                if (i10 == 0) {
                    nextTextView = c10Var.getTextView();
                } else {
                    nextTextView = c10Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23286t7, this.f26390l0)), indexOf, string2.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        i3Var.run();
        f();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        int i11;
        if (i9 == NotificationCenter.liveLocationsChanged) {
            d(false);
        } else if (i9 == NotificationCenter.liveStoryUpdated) {
            e(false);
        } else {
            int i12 = NotificationCenter.liveLocationsCacheChanged;
            rg rgVar = this.f26391n;
            if (i9 == i12) {
                if (rgVar != null) {
                    if (rgVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i9 != NotificationCenter.messagePlayingDidStart && i9 != NotificationCenter.messagePlayingPlayStateChanged && i9 != NotificationCenter.messagePlayingDidReset && i9 != NotificationCenter.didEndCall) {
                int i13 = NotificationCenter.didStartedCall;
                if (i9 != i13 && i9 != NotificationCenter.groupCallUpdated && i9 != NotificationCenter.groupCallVisibilityChanged) {
                    if (i9 == NotificationCenter.groupCallTypingsUpdated) {
                        b();
                        if (this.O && this.P == 4) {
                            ChatObject.Call groupCall = rgVar.getGroupCall();
                            if (groupCall != null && this.f26381e != null) {
                                if (groupCall.isScheduled()) {
                                    this.f26381e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    int i14 = groupCall2.participants_count;
                                    if (i14 == 0) {
                                        c10 c10Var = this.f26381e;
                                        if (groupCall2.rtmp_stream) {
                                            i11 = R.string.ViewersWatchingNobody;
                                        } else {
                                            i11 = R.string.MembersTalkingNobody;
                                        }
                                        c10Var.b(LocaleController.getString(i11), false);
                                    } else {
                                        c10 c10Var2 = this.f26381e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        c10Var2.b(LocaleController.formatPluralString(str, i14, new Object[0]), false);
                                    }
                                }
                            }
                            n(true);
                            return;
                        }
                        return;
                    } else if (i9 == NotificationCenter.historyImportProgressChanged) {
                        int i15 = this.P;
                        if (i15 == 1 || i15 == 3 || i15 == 4) {
                            a(false);
                        }
                        c(false);
                        return;
                    } else if (i9 == NotificationCenter.messagePlayingSpeedChanged) {
                        q(true);
                        return;
                    } else {
                        int i16 = NotificationCenter.webRtcMicAmplitudeEvent;
                        yc ycVar = this.f26374a;
                        if (i9 == i16) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.f26409z0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.f26409z0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.f6.D0().a(Math.max(this.f26408y0, this.f26409z0));
                                ycVar.d(Math.max(this.f26408y0, this.f26409z0));
                                return;
                            }
                            return;
                        } else if (i9 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
                            b();
                            this.f26408y0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.f26409z0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.f6.D0().a(Math.max(this.f26408y0, this.f26409z0));
                                ycVar.d(Math.max(this.f26408y0, this.f26409z0));
                            }
                            this.T.invalidate();
                            return;
                        } else if (i9 == NotificationCenter.messagePlayingProgressDidChanged && this.P == 0) {
                            invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a(false);
                if (this.P == 3 && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null) {
                    if (i9 == i13) {
                        sharedInstance.registerStateListener(this);
                    }
                    int callState = sharedInstance.getCallState();
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f26405x != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f26405x.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                    }
                }
            } else {
                int i17 = this.P;
                if (i17 == 1 || i17 == 3 || i17 == 4) {
                    a(false);
                }
                g(false);
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        ih.f1 f1Var = ih.f1.S;
        AnimationNotificationsLocker animationNotificationsLocker = this.f26394p0;
        int i9 = 0;
        if (f1Var != null) {
            b();
            int i10 = this.P;
            if (6 != i10 && this.f26383f != null && !z10) {
                this.f26399s0 = true;
                return;
            } else if (6 != i10 && this.O && !z10) {
                AnimatorSet animatorSet = this.f26383f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26383f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26383f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f26383f.setDuration(220L);
                this.f26383f.setInterpolator(gr.f28844f);
                this.f26383f.addListener(new z00(this, 7));
                this.f26383f.start();
                return;
            } else {
                r(6);
                if (!this.O) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f26383f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f26383f = null;
                        }
                        this.f26383f = new AnimatorSet();
                        this.f26395q0.lock();
                        this.f26383f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f26383f.setDuration(220L);
                        this.f26383f.setInterpolator(gr.f28844f);
                        this.f26383f.addListener(new z00(this, 8));
                        this.f26383f.start();
                    } else {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        m();
                    }
                    this.O = true;
                    setVisibility(0);
                } else {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    setVisibility(0);
                }
            }
        } else {
            boolean z11 = this.O;
            if (z11 && ((z10 && this.P == -1) || this.P == 6)) {
                this.O = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f26383f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f26383f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f26383f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f26383f.setDuration(220L);
                    this.f26383f.setInterpolator(gr.f28844f);
                    this.f26383f.addListener(new z00(this, 6));
                    this.f26383f.start();
                }
            } else if (z11 && this.P == -1) {
                this.O = false;
                setVisibility(8);
            }
        }
        ih.f1 f1Var2 = ih.f1.S;
        if (f1Var2 != null && this.P == 6) {
            c10 c10Var = this.d;
            TLRPC.GroupCall groupCall = f1Var2.v;
            if (groupCall != null) {
                i9 = groupCall.participants_count;
            }
            c10Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, i9)));
        }
    }

    public final void f() {
        int i9;
        String format;
        TextView nextTextView;
        rg rgVar = this.f26391n;
        if (rgVar != null && this.d != null) {
            b();
            long a2 = rgVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
            if (!this.m0) {
                LocationController.getInstance(currentAccount).loadLiveLocations(a2);
                this.m0 = true;
            }
            TLRPC.User user = null;
            if (arrayList != null) {
                long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
                i9 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i10);
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                        long fromChatId = MessageObject.getFromChatId(message);
                        if (user == null && fromChatId != clientUserId) {
                            user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(fromChatId));
                        }
                        i9++;
                    }
                }
            } else {
                i9 = 0;
            }
            if (this.f26392n0 != i9) {
                this.f26392n0 = i9;
                String string = LocaleController.getString(R.string.LiveLocationContext);
                if (i9 == 0) {
                    format = string;
                } else {
                    int i11 = i9 - 1;
                    if (LocationController.getInstance(currentAccount).isSharingLocation(a2)) {
                        if (i11 != 0) {
                            if (i11 == 1 && user != null) {
                                format = String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", R.string.SharingYouAndOtherName, UserObject.getFirstName(user)));
                            } else {
                                format = String.format("%1$s - %2$s %3$s", string, LocaleController.getString(R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i11, new Object[0]));
                            }
                        } else {
                            format = String.format("%1$s - %2$s", string, LocaleController.getString(R.string.ChatYourSelfName));
                        }
                    } else if (i11 != 0) {
                        format = String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(user), LocaleController.formatPluralString("AndOther", i11, new Object[0]));
                    } else {
                        format = String.format("%1$s - %2$s", string, UserObject.getFirstName(user));
                    }
                }
                if (!format.equals(this.Q)) {
                    this.Q = format;
                    int indexOf = format.indexOf(string);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i12 = 0; i12 < 2; i12++) {
                        c10 c10Var = this.d;
                        if (i12 == 0) {
                            nextTextView = c10Var.getTextView();
                        } else {
                            nextTextView = c10Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23286t7, this.f26390l0)), indexOf, string.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        rg rgVar;
        SpannableStringBuilder spannableStringBuilder;
        TextView nextTextView;
        TextView nextTextView2;
        boolean z12 = true;
        if (this.O) {
            int i9 = this.P;
            if (i9 != 1 && i9 != 3) {
                if ((i9 == 4 || i9 == 5) && !j()) {
                    return;
                }
            } else {
                return;
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z13 = this.O;
        AnimationNotificationsLocker animationNotificationsLocker = this.f26394p0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i10 = this.P;
            if (i10 != 0 && this.f26383f != null && !z10) {
                this.f26400t0 = true;
                return;
            }
            r(0);
            if (z10 && this.N == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                g10 g10Var = this.f26389k0;
                if (g10Var != null) {
                    ((bq0) g10Var).a(true);
                    ((bq0) this.f26389k0).a(false);
                }
            }
            if (!this.O) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f26383f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f26383f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f26383f = new AnimatorSet();
                    g10 g10Var2 = this.f26389k0;
                    if (g10Var2 != null) {
                        ((bq0) g10Var2).a(true);
                    }
                    this.f26383f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f26383f.setDuration(200L);
                    this.f26383f.addListener(new z00(this, 3));
                    this.f26383f.start();
                }
                this.O = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f26378c.a(false, !z10);
                this.f26376b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f26378c.a(true, !z10);
                this.f26376b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
            }
            if (this.M == playingMessageObject && i10 == 0) {
                return;
            }
            this.M = playingMessageObject;
            if (!playingMessageObject.isVoice() && !this.M.isRoundVideo()) {
                this.R = true;
                if (this.B != null) {
                    if (playingMessageObject.getDuration() >= 600.0d) {
                        this.B.setAlpha(1.0f);
                        this.B.setEnabled(true);
                        this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.I, 0);
                        q(false);
                    } else {
                        this.B.setAlpha(0.0f);
                        this.B.setEnabled(false);
                        this.d.setPadding(0, 0, this.I, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.I, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(aa.d.z(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
                for (int i11 = 0; i11 < 2; i11++) {
                    c10 c10Var = this.d;
                    if (i11 == 0) {
                        nextTextView2 = c10Var.getTextView();
                    } else {
                        nextTextView2 = c10Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.R = false;
                org.telegram.ui.ActionBar.w0 w0Var = this.B;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                    this.B.setEnabled(true);
                }
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.I, 0);
                spannableStringBuilder = new SpannableStringBuilder(aa.d.z(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
                for (int i12 = 0; i12 < 2; i12++) {
                    c10 c10Var2 = this.d;
                    if (i12 == 0) {
                        nextTextView = c10Var2.getTextView();
                    } else {
                        nextTextView = c10Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23286t7, this.f26390l0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.R) ? false : false);
            return;
        }
        this.M = null;
        if (this.S && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !j20.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (rgVar = this.f26391n) != null && !j20.c()) {
            ChatObject.Call groupCall = rgVar.getGroupCall();
            if (groupCall != null && groupCall.shouldShowPanel()) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            a(false);
        } else if (this.O) {
            org.telegram.ui.ActionBar.w0 w0Var2 = this.B;
            if (w0Var2 != null && w0Var2.t()) {
                this.B.M(null, null);
            }
            this.O = false;
            if (z10) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = this.f26383f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f26383f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f26383f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f26383f.setDuration(200L);
            g10 g10Var3 = this.f26389k0;
            if (g10Var3 != null) {
                ((bq0) g10Var3).a(true);
            }
            this.f26383f.addListener(new z00(this, 2));
            this.f26383f.start();
        } else {
            setVisibility(8);
        }
    }

    public yc getCapsuleBlobDrawable() {
        return this.f26374a;
    }

    public int getCurrentStyle() {
        return this.P;
    }

    public int getStyleHeight() {
        if (this.P == 4) {
            return 48;
        }
        return 36;
    }

    public float getTopPadding() {
        return this.N;
    }

    public final void h() {
        if (this.B != null) {
            return;
        }
        Context context = getContext();
        int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        org.telegram.ui.ActionBar.b6 b6Var = this.f26390l0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.f6.v0(i9, b6Var), false, this.f26390l0);
        this.B = w0Var;
        w0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.B.setLongClickEnabled(false);
        this.B.setVisibility(8);
        this.B.setTag(null);
        this.B.setShowSubmenuByMove(false);
        this.B.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.B.setDelegate(new u00(this));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.B;
        vc vcVar = new vc();
        this.C = vcVar;
        w0Var2.setIcon(vcVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), b6Var);
        this.D = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        this.D.setDrawShadow(true);
        this.D.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.u0 u10 = this.B.u(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.u0[] u0VarArr = this.E;
        u0VarArr[0] = u10;
        u0VarArr[1] = this.B.u(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        u0VarArr[2] = this.B.u(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        u0VarArr[3] = this.B.u(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        u0VarArr[4] = this.B.u(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        u0VarArr[5] = this.B.u(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.B.setPadding(0, 1, 0, 0);
        }
        this.B.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.B, g7.e6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.B.setOnClickListener(new s2(20, this, fArr));
        this.B.setOnLongClickListener(new x00(this, 0));
        q(false);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i9 = this.P;
        if ((i9 == 3 || i9 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo != null) {
            org.telegram.ui.ActionBar.o2 o2Var = this.h;
            if (o2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) o2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.pc0 pc0Var = new org.telegram.ui.pc0(2);
                pc0Var.t0(sharingLocationInfo.messageObject);
                pc0Var.B0 = new d3.e(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.p0(pc0Var);
            }
        }
    }

    public final void l(float f10, float f11, boolean z10) {
        String formatString;
        int i9;
        if (!i(f10, f11)) {
            if (Math.abs(f11 - 1.0f) < 0.05f) {
                if (f10 < f11) {
                    return;
                }
                formatString = LocaleController.getString(R.string.AudioSpeedNormal);
                if (Math.abs(f10 - 2.0f) < 0.05f) {
                    i9 = R.raw.speed_2to1;
                } else if (f11 < f10) {
                    i9 = R.raw.speed_slow;
                } else {
                    i9 = R.raw.speed_fast;
                }
            } else if (z10 && i(f11, 1.5f) && i(f10, 1.0f)) {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, vc.a(f11));
                i9 = R.raw.speed_1to15;
            } else if (z10 && i(f11, 2.0f) && i(f10, 1.5f)) {
                formatString = LocaleController.getString(R.string.AudioSpeedFast);
                i9 = R.raw.speed_15to2;
            } else {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, vc.a(f11));
                if (f11 < 1.0f) {
                    i9 = R.raw.speed_slow;
                } else {
                    i9 = R.raw.speed_fast;
                }
            }
            oc.a0(this.h).Q(i9, 36, formatString).j();
        }
    }

    public final void m() {
        org.telegram.ui.Components.voip.h hVar = this.J;
        if (hVar != null && hVar.f33542g >= 1.0f) {
            this.A0 = false;
            AndroidUtilities.runOnUIThread(new y00(this, 0), 150L);
            return;
        }
        this.A0 = true;
    }

    public final void n(boolean z10) {
        ChatObject.Call call;
        int i9;
        TLRPC.User user;
        int e10;
        int i10;
        float f10;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.T.f27425a.f27078f) != null) {
            valueAnimator.cancel();
            this.T.f27425a.f27078f = null;
        }
        b9 b9Var = this.T.f27425a;
        if (b9Var.f27078f == null) {
            int i11 = this.P;
            int i12 = this.f26387i0;
            rg rgVar = this.f26391n;
            if (i11 == 4) {
                if (rgVar != null) {
                    call = rgVar.getGroupCall();
                    i12 = this.h.getCurrentAccount();
                } else {
                    call = null;
                }
                i9 = i12;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                call = VoIPService.getSharedInstance().groupCall;
                if (rgVar != null) {
                    user = null;
                } else {
                    user = VoIPService.getSharedInstance().getUser();
                }
                i9 = VoIPService.getSharedInstance().getAccount();
            } else {
                call = null;
                i9 = i12;
                user = null;
            }
            int i13 = 0;
            if (call != null) {
                int size = call.sortedParticipants.size();
                for (int i14 = 0; i14 < 3; i14++) {
                    if (i14 < size) {
                        this.T.b(i14, call.sortedParticipants.get(i14), i9);
                    } else {
                        this.T.b(i14, null, i9);
                    }
                }
            } else if (user != null) {
                this.T.b(0, user, i9);
                for (int i15 = 1; i15 < 3; i15++) {
                    this.T.b(i15, null, i9);
                }
            } else {
                for (int i16 = 0; i16 < 3; i16++) {
                    this.T.b(i16, null, i9);
                }
            }
            this.T.a(z10);
            if (this.P == 4 && call != null) {
                if (!call.call.rtmp_stream) {
                    i13 = Math.min(3, call.sortedParticipants.size());
                }
                if (i13 == 0) {
                    e10 = 10;
                } else {
                    e10 = e2.c.e(i13, 1, 24, 52);
                }
                int i17 = e10 + 3;
                if (z10) {
                    int i18 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (AndroidUtilities.dp(i17) != i18) {
                        float translationX = (this.d.getTranslationX() + i18) - AndroidUtilities.dp(f10);
                        this.d.setTranslationX(translationX);
                        this.f26381e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        gr grVar = gr.f28844f;
                        duration.setInterpolator(grVar);
                        this.f26381e.animate().translationX(0.0f).setDuration(220L).setInterpolator(grVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.f26381e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.f26381e.setTranslationX(0.0f);
                }
                c10 c10Var = this.d;
                float f11 = i17;
                int i19 = 36;
                if (call.isScheduled()) {
                    i10 = 90;
                } else {
                    i10 = 36;
                }
                c10Var.setLayoutParams(g7.e6.d(-1, 20.0f, 51, f11, 5.0f, i10, 0.0f));
                c10 c10Var2 = this.f26381e;
                if (call.isScheduled()) {
                    i19 = 90;
                }
                c10Var2.setLayoutParams(g7.e6.d(-1, 20.0f, 51, f11, 25.0f, i19, 0.0f));
                return;
            }
            return;
        }
        b9Var.f27079g = true;
    }

    public final void o() {
        ChatObject.Call call;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i9 = this.P;
            if (i9 == 1 || i9 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(LocaleController.getString(R.string.VoipGroupConnecting), false);
                } else if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                    if (call.sortedParticipants.size() <= 1) {
                        this.d.b(LocaleController.getString(R.string.ConferenceChat), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i10 = 0; i10 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i10++) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(DialogObject.getShortName(sharedInstance.getAccount(), DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i10).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb2.append(" ");
                        sb2.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    rg rgVar = this.f26391n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (rgVar != null && rgVar.g() != null && rgVar.g().f22380id == sharedInstance.getChat().f22380id) {
                            TLRPC.Chat g10 = rgVar.g();
                            if (VoIPService.hasRtmpStream()) {
                                this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                            } else if (ChatObject.isChannelOrGiga(g10)) {
                                this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                            } else {
                                this.d.b(LocaleController.getString(R.string.VoipGroupViewVoiceChat), false);
                            }
                        } else {
                            this.d.b(sharedInstance.getChat().title, false);
                        }
                    } else if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (rgVar != null && rgVar.i() != null && rgVar.i().f22527id == user.f22527id) {
                            this.d.setText(LocaleController.getString(R.string.ReturnToCall));
                        } else {
                            this.d.setText(ContactsController.formatName(user.first_name, user.last_name));
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        int i9 = 15;
        if (this.f26388j0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.groupCallVisibilityChanged);
            if (ih.f1.S != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !j20.c()) {
                a(true);
            } else {
                rg rgVar = this.f26391n;
                if (rgVar != null && this.h.getSendMessagesHelper().getImportingHistory(rgVar.a()) != null && !j()) {
                    c(true);
                } else if (rgVar != null && rgVar.getGroupCall() != null && rgVar.getGroupCall().shouldShowPanel() && !j20.c() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    q(false);
                }
            }
        }
        int i11 = this.P;
        if (i11 != 3 && i11 != 1) {
            if (i11 == 4 && !this.f26385g0) {
                this.f26385g0 = true;
                this.f26386h0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.f6.D0().f29270l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            yc ycVar = this.f26374a;
            if (!ycVar.f34935u) {
                ycVar.f34935u = true;
                ycVar.f34934t = SystemClock.elapsedRealtime();
                ff.k.d().a(60, ycVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.K != z10 && this.f26405x != null) {
                this.K = z10;
                mi0 mi0Var = this.f26407y;
                if (!z10) {
                    i9 = 29;
                }
                mi0Var.N(i9);
                mi0 mi0Var2 = this.f26407y;
                mi0Var2.L(mi0Var2.f30849f - 1, false, true);
                this.f26405x.invalidate();
            }
        }
        if (this.O && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.f26408y0 = 0.0f;
        this.f26409z0 = 0.0f;
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z10;
        int i9;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.K;
        yc ycVar = this.f26374a;
        if (z11 != z10) {
            this.K = z10;
            mi0 mi0Var = this.f26407y;
            if (z10) {
                i9 = 15;
            } else {
                i9 = 29;
            }
            mi0Var.N(i9);
            mi0 mi0Var2 = this.f26407y;
            mi0Var2.L(mi0Var2.f30849f - 1, false, true);
            this.f26405x.invalidate();
            org.telegram.ui.ActionBar.f6.D0().c(this.O);
            ycVar.f(this.O);
        }
        if (this.K) {
            this.f26409z0 = 0.0f;
            org.telegram.ui.ActionBar.f6.D0().a(0.0f);
            ycVar.d(0.0f);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.u0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f26383f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26383f = null;
        }
        if (this.f26385g0) {
            AndroidUtilities.cancelRunOnUIThread(this.f26386h0);
            this.f26385g0 = false;
        }
        this.O = false;
        this.f26394p0.unlock();
        this.N = 0.0f;
        if (this.f26388j0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsCacheChanged);
        } else {
            for (int i9 = 0; i9 < 4; i9++) {
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i9).unsubscribeFromCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        }
        int i10 = this.P;
        if (i10 == 3 || i10 == 1) {
            i10 D0 = org.telegram.ui.ActionBar.f6.D0();
            ArrayList arrayList = D0.f29270l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.f29262b;
                D0.f29262b = null;
                D0.f29263c = null;
            }
            yc ycVar = this.f26374a;
            if (ycVar.f34935u) {
                ycVar.f34935u = false;
                ff.k.d().g(ycVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.B0 = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, AndroidUtilities.dp2(getStyleHeight()));
    }

    @Override
    public final void onMediaStateUpdated(int i9, int i10) {
        org.telegram.messenger.voip.u0.d(this, i9, i10);
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f26398s != null) {
            int i9 = this.P;
            if ((i9 == 1 || i9 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
                this.H0++;
                if (!groupCallMessage.isOut()) {
                    this.G0.i(new f10(this.f26398s, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i9 = this.H0;
        if (i9 > 0) {
            int i10 = i9 - 1;
            this.H0 = i10;
            if (i10 == 0) {
                this.G0.i(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i9) {
        org.telegram.messenger.voip.u0.f(this, i9);
    }

    @Override
    public final void onStateChanged(int i9) {
        o();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final void p() {
        int i9;
        TextView nextTextView;
        i41[] i41VarArr;
        TextView nextTextView2;
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.R), 1.0f)) {
            i9 = org.telegram.ui.ActionBar.f6.Qh;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23352x7;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.f26390l0;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        vc vcVar = this.C;
        if (vcVar != null) {
            ((i6) vcVar.f33344c).r(v02);
            Paint paint = (Paint) vcVar.f33343b;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.B;
        if (w0Var != null) {
            w0Var.setBackground(org.telegram.ui.ActionBar.f6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.f26376b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23335w7, b6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23352x7, b6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.f26381e != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                c10 c10Var = this.f26381e;
                if (i10 == 0) {
                    nextTextView2 = c10Var.getTextView();
                } else {
                    nextTextView2 = c10Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23352x7, b6Var));
                }
            }
        }
        c10 c10Var2 = this.d;
        if (c10Var2 != null) {
            Object tag = c10Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i11 = 0; i11 < 2; i11++) {
                    c10 c10Var3 = this.d;
                    if (i11 == 0) {
                        nextTextView = c10Var3.getTextView();
                    } else {
                        nextTextView = c10Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.f6.v0(intValue, b6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (i41VarArr = (i41[]) ((Spanned) text).getSpans(0, text.length(), i41.class)) != null) {
                            for (i41 i41Var : i41VarArr) {
                                i41Var.f29313b = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23286t7, b6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void q(boolean z10) {
        if (this.C == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.R);
        this.C.l(playbackSpeed, z10);
        p();
        boolean z11 = this.f26402v0;
        int i9 = 0;
        this.f26402v0 = false;
        while (true) {
            org.telegram.ui.ActionBar.u0[] u0VarArr = this.E;
            if (i9 < u0VarArr.length) {
                org.telegram.ui.ActionBar.b6 b6Var = this.f26390l0;
                if (!z11 && Math.abs(playbackSpeed - I0[i9]) < 0.05f) {
                    org.telegram.ui.ActionBar.u0 u0Var = u0VarArr[i9];
                    int i10 = org.telegram.ui.ActionBar.f6.Qh;
                    u0Var.a(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                } else {
                    org.telegram.ui.ActionBar.u0 u0Var2 = u0VarArr[i9];
                    int i11 = org.telegram.ui.ActionBar.f6.E8;
                    u0Var2.a(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
                }
                i9++;
            } else {
                this.D.d(playbackSpeed, z10);
                return;
            }
        }
    }

    public final void r(int i9) {
        boolean z10;
        TextView nextTextView;
        int i10;
        int i11;
        boolean z11;
        int i12;
        TextView nextTextView2;
        int i13;
        TextView nextTextView3;
        TextView nextTextView4;
        TextView nextTextView5;
        if (this.P != i9) {
            b();
            int i14 = this.P;
            yc ycVar = this.f26374a;
            boolean z12 = true;
            if (i14 == 3 || i14 == 1) {
                i10 D0 = org.telegram.ui.ActionBar.f6.D0();
                ArrayList arrayList = D0.f29270l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    D0.d = D0.f29262b;
                    D0.f29262b = null;
                    D0.f29263c = null;
                }
                if (ycVar.f34935u) {
                    ycVar.f34935u = false;
                    ff.k.d().g(ycVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                td.j jVar = this.G0;
                if (jVar != null) {
                    jVar.i(null, true);
                }
            }
            this.P = i9;
            b10 b10Var = this.f26396r;
            if (i9 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            b10Var.setWillNotDraw(z10);
            if (i9 != 4) {
                this.f26379c0 = false;
            }
            c9 c9Var = this.T;
            if (c9Var != null) {
                c9Var.setStyle(this.P);
                this.T.setLayoutParams(g7.e6.e(108, getStyleHeight(), 51));
            }
            this.f26396r.setLayoutParams(g7.e6.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f10 = this.N;
            if (f10 > 0.0f && f10 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.f26390l0;
            if (i9 == 6) {
                this.v.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                this.f26396r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.nk, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ok, b6Var)}));
                this.f26396r.setTag(null);
                this.f26381e.setVisibility(8);
                this.H.setVisibility(8);
                this.A.setVisibility(8);
                this.f26376b.setVisibility(8);
                this.f26405x.setVisibility(8);
                this.f26403w.setVisibility(8);
                this.f26403w.i();
                this.T.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.A7));
                for (int i15 = 0; i15 < 2; i15++) {
                    c10 c10Var = this.d;
                    if (i15 == 0) {
                        nextTextView5 = c10Var.getTextView();
                    } else {
                        nextTextView5 = c10Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        nextTextView5.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A7, b6Var));
                        nextTextView5.setTypeface(AndroidUtilities.bold());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(g7.e6.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i9 == 5) {
                this.v.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                this.f26396r.setBackgroundColor(0);
                this.f26396r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.f23320v7));
                for (int i16 = 0; i16 < 2; i16++) {
                    c10 c10Var2 = this.d;
                    if (i16 == 0) {
                        nextTextView4 = c10Var2.getTextView();
                    } else {
                        nextTextView4 = c10Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        nextTextView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23304u7, b6Var));
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.f23304u7));
                this.f26381e.setVisibility(8);
                this.H.setVisibility(8);
                this.A.setVisibility(8);
                this.f26376b.setVisibility(8);
                this.f26405x.setVisibility(8);
                this.T.setVisibility(8);
                this.f26403w.setVisibility(0);
                this.f26403w.d();
                this.A.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.w0 w0Var = this.B;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    this.B.setTag(null);
                }
                this.d.setLayoutParams(g7.e6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i9 != 0 && i9 != 2) {
                if (i9 == 4) {
                    this.v.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                    this.f26396r.setBackgroundColor(0);
                    this.f26396r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.f23320v7));
                    this.f26405x.setVisibility(8);
                    this.f26381e.setVisibility(0);
                    for (int i17 = 0; i17 < 2; i17++) {
                        c10 c10Var3 = this.d;
                        if (i17 == 0) {
                            nextTextView3 = c10Var3.getTextView();
                        } else {
                            nextTextView3 = c10Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            nextTextView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23286t7, b6Var));
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.f23286t7));
                    this.d.setPadding(0, 0, this.I, 0);
                    this.f26403w.setVisibility(8);
                    this.f26403w.i();
                    rg rgVar = this.f26391n;
                    z12 = (rgVar == null || rgVar.getGroupCall() == null || rgVar.getGroupCall().call == null || !rgVar.getGroupCall().call.rtmp_stream) ? false : false;
                    c9 c9Var2 = this.T;
                    if (!z12) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    c9Var2.setVisibility(i13);
                    if (this.T.getVisibility() != 8) {
                        n(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.f26381e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.A.setVisibility(8);
                    this.f26376b.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.B;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                        this.B.setTag(null);
                    }
                } else if (i9 == 1 || i9 == 3) {
                    this.v.setBackground(null);
                    o();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    c9 c9Var3 = this.T;
                    if (!hasRtmpStream) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    c9Var3.setVisibility(i10);
                    if (i9 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.T.getVisibility() != 8) {
                        n(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.f26381e.setTranslationX(0.0f);
                    }
                    e10 e10Var = this.f26405x;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    e10Var.setVisibility(i11);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.K = z11;
                    mi0 mi0Var = this.f26407y;
                    if (z11) {
                        i12 = 15;
                    } else {
                        i12 = 29;
                    }
                    mi0Var.N(i12);
                    mi0 mi0Var2 = this.f26407y;
                    mi0Var2.L(mi0Var2.f30849f - 1, false, true);
                    this.f26405x.invalidate();
                    this.f26396r.setBackground(null);
                    this.f26396r.setBackgroundColor(0);
                    this.f26403w.setVisibility(8);
                    this.f26403w.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.f6.D0().f29270l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!ycVar.f34935u) {
                        ycVar.f34935u = true;
                        ycVar.f34934t = SystemClock.elapsedRealtime();
                        ff.k.d().a(60, ycVar.F);
                    }
                    invalidate();
                    for (int i18 = 0; i18 < 2; i18++) {
                        c10 c10Var4 = this.d;
                        if (i18 == 0) {
                            nextTextView2 = c10Var4.getTextView();
                        } else {
                            nextTextView2 = c10Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            nextTextView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A7, b6Var));
                            nextTextView2.setTypeface(AndroidUtilities.bold());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.A7));
                    this.A.setVisibility(8);
                    this.f26376b.setVisibility(8);
                    this.f26381e.setVisibility(8);
                    this.H.setVisibility(8);
                    this.d.setLayoutParams(g7.e6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.I, 0);
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.B;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        this.B.setTag(null);
                    }
                }
            } else {
                this.v.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                this.f26396r.setBackgroundColor(0);
                this.f26396r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.f23320v7));
                this.f26381e.setVisibility(8);
                this.H.setVisibility(8);
                this.A.setVisibility(0);
                this.f26376b.setVisibility(0);
                this.f26405x.setVisibility(8);
                this.f26403w.setVisibility(8);
                this.f26403w.i();
                this.T.setVisibility(8);
                for (int i19 = 0; i19 < 2; i19++) {
                    c10 c10Var5 = this.d;
                    if (i19 == 0) {
                        nextTextView = c10Var5.getTextView();
                    } else {
                        nextTextView = c10Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23304u7, b6Var));
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.f6.f23304u7));
                if (i9 == 6) {
                    this.f26376b.setLayoutParams(g7.e6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(g7.e6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.A.setVisibility(8);
                } else if (i9 == 0) {
                    this.f26376b.setLayoutParams(g7.e6.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(g7.e6.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.B;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(0);
                        this.B.setTag(1);
                    }
                    this.A.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f26376b.setLayoutParams(g7.e6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(g7.e6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.A.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(g10 g10Var) {
        this.f26389k0 = g10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.D0 = z10;
    }

    public void setLeftMargin(float f10) {
        if (this.f26396r == null) {
            this.F0 = f10;
            return;
        }
        ImageView imageView = this.f26376b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        pi0 pi0Var = this.f26403w;
        if (pi0Var != null) {
            pi0Var.setTranslationX(f10);
        }
        c10 c10Var = this.d;
        if (c10Var != null) {
            c10Var.setTranslationX(f10);
        }
        c10 c10Var2 = this.f26381e;
        if (c10Var2 != null) {
            c10Var2.setTranslationX(f10);
        }
        c9 c9Var = this.T;
        if (c9Var != null) {
            c9Var.setTranslationX(f10);
        }
    }

    public void setSupportsCalls(boolean z10) {
        this.S = z10;
    }

    public void setTopPadding(float f10) {
        this.N = f10;
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        setTopPadding(this.N);
        if (i9 == 8) {
            this.B0 = false;
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.o2 o2Var, View view, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f26374a = new yc();
        this.E = new org.telegram.ui.ActionBar.u0[6];
        this.L = -1;
        this.P = -1;
        this.S = true;
        this.f26382e0 = new i6(false, true, true, false);
        this.f26386h0 = new a10(this);
        this.f26387i0 = UserConfig.selectedAccount;
        this.f26392n0 = -1;
        this.f26393o0 = new m.i3(this, 20);
        this.f26394p0 = new AnimationNotificationsLocker();
        this.f26395q0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.C0 = new Paint(1);
        this.E0 = 0;
        this.G0 = new td.j(new u00(this), gr.h, 450L);
        this.H0 = 0;
        this.f26390l0 = b6Var;
        this.h = o2Var;
        if (o2Var instanceof rg) {
            this.f26391n = (rg) o2Var;
        }
        this.O = true;
        this.f26388j0 = z10;
        if (view == null) {
            ((ViewGroup) o2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
