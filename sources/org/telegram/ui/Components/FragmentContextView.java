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
    public static final float[] Q0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public c20 B0;
    public ViewGroup C0;
    public long D0;
    public vj0 E;
    public final NotificationCenter.ObserversGroup[] E0;
    public ImageView F;
    public NotificationCenter.ObserversGroup F0;
    public org.telegram.ui.ActionBar.u0 G;
    public float G0;
    public ed H;
    public float H0;
    public org.telegram.ui.ActionBar.a1 I;
    public boolean I0;
    public final org.telegram.ui.ActionBar.s0[] J;
    public boolean J0;
    public FrameLayout K;
    public final Paint K0;
    public ImageView L;
    public boolean L0;
    public org.telegram.ui.kk M;
    public int M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.voip.h O;
    public final ne.l O0;
    public boolean P;
    public int P0;
    public int Q;
    public MessageObject R;
    public float S;
    public boolean T;
    public int U;
    public String V;
    public boolean W;
    public final id f24216a;
    public boolean f24217a0;
    public ImageView f24218b;
    public k9 f24219b0;
    public bh0 f24220c;
    public Paint f24221c0;
    public z10 d;
    public LinearGradient f24222d0;
    public z10 e;
    public Matrix f24223e0;
    public AnimatorSet f24224f;
    public int f24225f0;
    public TextPaint f24226g0;
    public final org.telegram.ui.ActionBar.n2 h;
    public boolean f24227h0;
    public boolean f24228i0;
    public final p6 f24229j0;
    public yc f24230k0;
    public boolean f24231l0;
    public final x10 m0;
    public final bh f24232n;
    public final int f24233n0;
    public final boolean f24234o0;
    public e20 f24235p0;
    public final org.telegram.ui.ActionBar.d6 f24236q0;
    public final View f24237r;
    public boolean f24238r0;
    public y10 f24239s;
    public int f24240s0;
    public final org.telegram.ui.Cells.k7 f24241t0;
    public final AnimationNotificationsLocker f24242u0;
    public ci.i4 v;
    public final AnimationNotificationsLocker f24243v0;
    public View f24244w;
    public boolean f24245w0;
    public yj0 f24246x;
    public boolean f24247x0;
    public b20 f24248y;
    public boolean f24249y0;
    public boolean f24250z0;

    public FragmentContextView(Context context, org.telegram.ui.cy cyVar, boolean z10) {
        this(context, cyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.U;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24236q0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21291t7, d6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21311u7, d6Var);
        }
        return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A7, d6Var);
    }

    public static boolean i(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.05f) {
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
        if (this.f24239s != null) {
            return;
        }
        Context context = getContext();
        y10 y10Var = new y10(this, context);
        this.f24239s = y10Var;
        this.f24230k0 = new yc(y10Var);
        int i10 = AndroidUtilities.displaySize.x;
        p6 p6Var = this.f24229j0;
        p6Var.M = i10;
        p6Var.A = 0.4f;
        p6Var.setCallback(y10Var);
        p6Var.u(-1);
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.x(AndroidUtilities.bold());
        addView(this.f24239s, w7.z5.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f24244w = view;
        this.f24239s.addView(view, w7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f24218b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f24218b;
        int i11 = org.telegram.ui.ActionBar.h6.f21347w7;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24236q0;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView imageView3 = this.f24218b;
        bh0 bh0Var = new bh0(16);
        this.f24220c = bh0Var;
        imageView3.setImageDrawable(bh0Var);
        this.f24218b.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i11, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f24218b, w7.z5.e(36, 36, 51));
        this.f24218b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f30118b;

            {
                this.f30118b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i12;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f30118b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f24232n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f24236q0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.cy) {
                                b2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g10 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21232q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f24232n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f24236q0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ci.h1 h1Var = ci.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f5441b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f5442c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.H1)) {
                                        new k8(LaunchActivity.H1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f24232n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                n2Var2.presentFragment(new org.telegram.ui.qn(bundle), n2Var2 instanceof org.telegram.ui.qn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j10 = bhVar2.a();
                                i12 = n2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j13 = sharingLocationInfo.did;
                                            i12 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j13;
                                        }
                                    }
                                }
                                i12 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i12).getSharingLocationInfo(j10));
                                return;
                            } else {
                                n2Var2.showDialog(new yv0(fragmentContextView.getContext(), new r10(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.q50.d1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(qnVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, qnVar, d6Var3);
                                g50Var.setOnHideListener(new b1(fragmentContextView, 7));
                                n2Var2.showDialog(g50Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.U == 0) {
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
                        float[] fArr = FragmentContextView.Q0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.Q0;
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
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            vj0 vj0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (vj0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24248y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView.f24216a.f(true);
                            try {
                                fragmentContextView.f24248y.performHapticFeedback(3, 2);
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
        this.f24246x = imageView4;
        imageView4.setScaleType(scaleType);
        this.f24246x.setAutoRepeat(true);
        this.f24246x.f(R.raw.import_progress, 30, 30, null);
        this.f24246x.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
        addView(this.f24246x, w7.z5.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        z10 z10Var = new z10(this, context, context, 0);
        this.d = z10Var;
        addView(z10Var, w7.z5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        z10 z10Var2 = new z10(this, context, context, 1);
        this.e = z10Var2;
        addView(z10Var2, w7.z5.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.O = hVar;
        hVar.f31433g = 1.0f;
        hVar.f31435j = false;
        org.telegram.ui.kk kkVar = new org.telegram.ui.kk(this, context, 1);
        this.M = kkVar;
        kkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.M.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
        org.telegram.ui.kk kkVar2 = this.M;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Qh, d6Var);
        kkVar2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w03, w04, w04));
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setGravity(17);
        this.M.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.M, w7.z5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f30118b;

            {
                this.f30118b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i12;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f30118b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f24232n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f24236q0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.cy) {
                                b2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g10 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21232q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f24232n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f24236q0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ci.h1 h1Var = ci.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f5441b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f5442c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.H1)) {
                                        new k8(LaunchActivity.H1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f24232n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                n2Var2.presentFragment(new org.telegram.ui.qn(bundle), n2Var2 instanceof org.telegram.ui.qn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j10 = bhVar2.a();
                                i12 = n2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j13 = sharingLocationInfo.did;
                                            i12 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j13;
                                        }
                                    }
                                }
                                i12 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i12).getSharingLocationInfo(j10));
                                return;
                            } else {
                                n2Var2.showDialog(new yv0(fragmentContextView.getContext(), new r10(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.q50.d1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(qnVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, qnVar, d6Var3);
                                g50Var.setOnHideListener(new b1(fragmentContextView, 7));
                                n2Var2.showDialog(g50Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.U == 0) {
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
                        float[] fArr = FragmentContextView.Q0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.Q0;
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
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            vj0 vj0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (vj0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24248y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView.f24216a.f(true);
                            try {
                                fragmentContextView.f24248y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        if (this.I0) {
            n();
        }
        this.K = new FrameLayout(context);
        ImageView imageView5 = new ImageView(context);
        this.L = imageView5;
        imageView5.setImageResource(R.drawable.msg_mute);
        ImageView imageView6 = this.L;
        int i12 = org.telegram.ui.ActionBar.h6.f21365x7;
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), mode));
        this.K.addView(this.L, w7.z5.e(20, 20, 17));
        this.K.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.K.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.K.setOnClickListener(new ah.f(13));
        this.K.setVisibility(8);
        addView(this.K, w7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f24234o0) {
            h();
        }
        k9 k9Var = new k9(context, false);
        this.f24219b0 = k9Var;
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.f24219b0.setDelegate(new v10(this, 1));
        this.f24219b0.setVisibility(8);
        addView(this.f24219b0, w7.z5.e(108, 36, 51));
        this.E = new vj0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        b20 b20Var = new b20(this, context);
        this.f24248y = b20Var;
        b20Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A7, d6Var), PorterDuff.Mode.SRC_IN));
        this.f24248y.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f24248y.setAnimation(this.E);
        this.f24248y.setScaleType(scaleType);
        this.f24248y.setVisibility(8);
        addView(this.f24248y, w7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.f24248y.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f30118b;

            {
                this.f30118b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f30118b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f24232n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f24236q0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.cy) {
                                b2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g10 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21232q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f24232n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f24236q0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ci.h1 h1Var = ci.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f5441b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f5442c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.H1)) {
                                        new k8(LaunchActivity.H1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f24232n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                n2Var2.presentFragment(new org.telegram.ui.qn(bundle), n2Var2 instanceof org.telegram.ui.qn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j10 = bhVar2.a();
                                i122 = n2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j13 = sharingLocationInfo.did;
                                            i122 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j13;
                                        }
                                    }
                                }
                                i122 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i122).getSharingLocationInfo(j10));
                                return;
                            } else {
                                n2Var2.showDialog(new yv0(fragmentContextView.getContext(), new r10(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.q50.d1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(qnVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, qnVar, d6Var3);
                                g50Var.setOnHideListener(new b1(fragmentContextView, 7));
                                n2Var2.showDialog(g50Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.U == 0) {
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
                        float[] fArr = FragmentContextView.Q0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.Q0;
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
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            vj0 vj0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (vj0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24248y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView.f24216a.f(true);
                            try {
                                fragmentContextView.f24248y.performHapticFeedback(3, 2);
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
        this.F = imageView7;
        imageView7.setImageResource(R.drawable.miniplayer_close);
        this.F.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), mode));
        this.F.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, w7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f30118b;

            {
                this.f30118b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f30118b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f24232n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f24236q0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.cy) {
                                b2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g10 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21232q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f24232n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f24236q0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ci.h1 h1Var = ci.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f5441b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f5442c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.H1)) {
                                        new k8(LaunchActivity.H1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f24232n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                n2Var2.presentFragment(new org.telegram.ui.qn(bundle), n2Var2 instanceof org.telegram.ui.qn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j10 = bhVar2.a();
                                i122 = n2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j13 = sharingLocationInfo.did;
                                            i122 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j13;
                                        }
                                    }
                                }
                                i122 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i122).getSharingLocationInfo(j10));
                                return;
                            } else {
                                n2Var2.showDialog(new yv0(fragmentContextView.getContext(), new r10(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.q50.d1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(qnVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, qnVar, d6Var3);
                                g50Var.setOnHideListener(new b1(fragmentContextView, 7));
                                n2Var2.showDialog(g50Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.U == 0) {
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
                        float[] fArr = FragmentContextView.Q0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.Q0;
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
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            vj0 vj0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (vj0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24248y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView.f24216a.f(true);
                            try {
                                fragmentContextView.f24248y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        ci.i4 i4Var = new ci.i4(getContext(), 15);
        this.v = i4Var;
        addView(i4Var, w7.z5.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f30118b;

            {
                this.f30118b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f30118b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f24232n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f24236q0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.cy) {
                                b2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g10 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21232q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f24232n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f24236q0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ci.h1 h1Var = ci.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f5441b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                    if (launchActivity != null) {
                                        launchActivity.O0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f5442c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.H1)) {
                                        new k8(LaunchActivity.H1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f24232n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                n2Var2.presentFragment(new org.telegram.ui.qn(bundle), n2Var2 instanceof org.telegram.ui.qn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j10 = bhVar2.a();
                                i122 = n2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j13 = sharingLocationInfo.did;
                                            i122 = sharingLocationInfo.messageObject.currentAccount;
                                            j10 = j13;
                                        }
                                    }
                                }
                                i122 = i18;
                                j10 = 0;
                            }
                            if (j10 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i122).getSharingLocationInfo(j10));
                                return;
                            } else {
                                n2Var2.showDialog(new yv0(fragmentContextView.getContext(), new r10(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.q50.d1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(qnVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, qnVar, d6Var3);
                                g50Var.setOnHideListener(new b1(fragmentContextView, 7));
                                n2Var2.showDialog(g50Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.U == 0) {
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
                        float[] fArr = FragmentContextView.Q0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.Q0;
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
                            fragmentContextView.P = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            vj0 vj0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (vj0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24248y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView.f24216a.f(true);
                            try {
                                fragmentContextView.f24248y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        setLeftMargin(this.N0);
    }

    public final void c(boolean z10) {
        int i10;
        bh bhVar = this.f24232n;
        if (bhVar != null) {
            if (!this.T || ((i10 = this.U) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.n2 n2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = n2Var.getSendMessagesHelper().getImportingHistory(bhVar.a());
                View fragmentView = n2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = n2Var.getVisibleDialog();
                if ((j() || bhVar.n() || ((visibleDialog instanceof g50) && !((g50) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f24242u0;
                if (importingHistory == null) {
                    if (this.T && ((z10 && this.U == -1) || this.U == 5)) {
                        this.T = false;
                        if (z10) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                            return;
                        }
                        AnimatorSet animatorSet = this.f24224f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f24224f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f24224f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f24224f.setDuration(220L);
                        this.f24224f.setInterpolator(bs.f25025f);
                        this.f24224f.addListener(new w10(this, 4));
                        this.f24224f.start();
                        return;
                    }
                    int i11 = this.U;
                    if (i11 == -1 || i11 == 5) {
                        this.T = false;
                        setVisibility(8);
                    }
                } else if (this.U != 5 && this.f24224f != null && !z10) {
                    this.f24250z0 = true;
                } else {
                    s(5);
                    if (z10 && this.S == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        e20 e20Var = this.f24235p0;
                        if (e20Var != null) {
                            ((pr0) e20Var).a(true);
                            ((pr0) this.f24235p0).a(false);
                        }
                    }
                    if (!this.T) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f24224f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f24224f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f24224f = new AnimatorSet();
                            e20 e20Var2 = this.f24235p0;
                            if (e20Var2 != null) {
                                ((pr0) e20Var2).a(true);
                            }
                            this.f24224f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f24224f.setDuration(200L);
                            this.f24224f.addListener(new w10(this, 5));
                            this.f24224f.start();
                        }
                        this.T = true;
                        setVisibility(0);
                    }
                    int i12 = this.Q;
                    int i13 = importingHistory.uploadProgress;
                    if (i12 != i13) {
                        this.Q = i13;
                        this.d.b(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", R.string.ImportUploading, Integer.valueOf(i13))), false);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        View fragmentView = n2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = n2Var instanceof org.telegram.ui.cy;
        if (z11) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(n2Var.getCurrentAccount()).isSharingLocation(this.f24232n.a());
        }
        org.telegram.ui.Cells.k7 k7Var = this.f24241t0;
        if (!isSharingLocation) {
            this.f24240s0 = -1;
            AndroidUtilities.cancelRunOnUIThread(k7Var);
            if (this.T) {
                this.T = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f24224f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f24224f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24224f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f24224f.setDuration(200L);
                this.f24224f.addListener(new w10(this, 0));
                this.f24224f.start();
                return;
            }
            return;
        }
        b();
        s(2);
        this.f24218b.setImageDrawable(new gr0(getContext(), 1));
        if (z10 && this.S == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.T) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f24224f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f24224f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f24224f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f24224f.setDuration(200L);
                this.f24224f.addListener(new w10(this, 1));
                this.f24224f.start();
            }
            this.T = true;
            setVisibility(0);
        }
        if (z11) {
            String string2 = LocaleController.getString(R.string.LiveLocationContext);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 4; i10++) {
                arrayList.addAll(LocationController.getInstance(i10).sharingLocationsUI);
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
            for (int i11 = 0; i11 < 2; i11++) {
                z10 z10Var = this.d;
                if (i11 == 0) {
                    nextTextView = z10Var.getTextView();
                } else {
                    nextTextView = z10Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new e61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21291t7, this.f24236q0)), indexOf, string2.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        k7Var.run();
        f();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        String str;
        int i12;
        if (i10 == NotificationCenter.liveLocationsChanged) {
            d(false);
        } else if (i10 == NotificationCenter.liveStoryUpdated) {
            e(false);
        } else {
            int i13 = NotificationCenter.liveLocationsCacheChanged;
            bh bhVar = this.f24232n;
            if (i10 == i13) {
                if (bhVar != null) {
                    if (bhVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.didEndCall) {
                int i14 = NotificationCenter.didStartedCall;
                if (i10 != i14 && i10 != NotificationCenter.groupCallUpdated && i10 != NotificationCenter.groupCallVisibilityChanged) {
                    if (i10 == NotificationCenter.groupCallTypingsUpdated) {
                        b();
                        if (this.T && this.U == 4) {
                            ChatObject.Call groupCall = bhVar.getGroupCall();
                            if (groupCall != null && this.e != null) {
                                if (groupCall.isScheduled()) {
                                    this.e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    int i15 = groupCall2.participants_count;
                                    if (i15 == 0) {
                                        z10 z10Var = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            i12 = R.string.ViewersWatchingNobody;
                                        } else {
                                            i12 = R.string.MembersTalkingNobody;
                                        }
                                        z10Var.b(LocaleController.getString(i12), false);
                                    } else {
                                        z10 z10Var2 = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        z10Var2.b(LocaleController.formatPluralString(str, i15, new Object[0]), false);
                                    }
                                }
                            }
                            o(true);
                            return;
                        }
                        return;
                    } else if (i10 == NotificationCenter.historyImportProgressChanged) {
                        int i16 = this.U;
                        if (i16 == 1 || i16 == 3 || i16 == 4) {
                            a(false);
                        }
                        c(false);
                        return;
                    } else if (i10 == NotificationCenter.messagePlayingSpeedChanged) {
                        r(true);
                        return;
                    } else {
                        int i17 = NotificationCenter.webRtcMicAmplitudeEvent;
                        id idVar = this.f24216a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.H0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.H0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.h6.E0().a(Math.max(this.G0, this.H0));
                                idVar.d(Math.max(this.G0, this.H0));
                                return;
                            }
                            return;
                        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
                            b();
                            this.G0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.H0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.h6.E0().a(Math.max(this.G0, this.H0));
                                idVar.d(Math.max(this.G0, this.H0));
                            }
                            this.f24219b0.invalidate();
                            return;
                        } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged && this.U == 0) {
                            invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a(false);
                if (this.U == 3 && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null) {
                    if (i10 == i14) {
                        sharedInstance.registerStateListener(this);
                    }
                    int callState = sharedInstance.getCallState();
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f24248y != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f24248y.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                    }
                }
            } else {
                int i18 = this.U;
                if (i18 == 1 || i18 == 3 || i18 == 4) {
                    a(false);
                }
                g(false);
            }
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.FragmentContextView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        ci.h1 h1Var = ci.h1.W;
        AnimationNotificationsLocker animationNotificationsLocker = this.f24242u0;
        int i10 = 0;
        if (h1Var != null) {
            b();
            int i11 = this.U;
            if (6 != i11 && this.f24224f != null && !z10) {
                this.f24247x0 = true;
                return;
            } else if (6 != i11 && this.T && !z10) {
                AnimatorSet animatorSet = this.f24224f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f24224f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24224f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f24224f.setDuration(220L);
                this.f24224f.setInterpolator(bs.f25025f);
                this.f24224f.addListener(new w10(this, 7));
                this.f24224f.start();
                return;
            } else {
                s(6);
                if (!this.T) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f24224f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f24224f = null;
                        }
                        this.f24224f = new AnimatorSet();
                        this.f24243v0.lock();
                        this.f24224f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f24224f.setDuration(220L);
                        this.f24224f.setInterpolator(bs.f25025f);
                        this.f24224f.addListener(new w10(this, 8));
                        this.f24224f.start();
                    } else {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        n();
                    }
                    this.T = true;
                    setVisibility(0);
                } else {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    setVisibility(0);
                }
            }
        } else {
            boolean z11 = this.T;
            if (z11 && ((z10 && this.U == -1) || this.U == 6)) {
                this.T = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f24224f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f24224f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f24224f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f24224f.setDuration(220L);
                    this.f24224f.setInterpolator(bs.f25025f);
                    this.f24224f.addListener(new w10(this, 6));
                    this.f24224f.start();
                }
            } else if (z11 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        ci.h1 h1Var2 = ci.h1.W;
        if (h1Var2 != null && this.U == 6) {
            z10 z10Var = this.d;
            TLRPC.GroupCall groupCall = h1Var2.v;
            if (groupCall != null) {
                i10 = groupCall.participants_count;
            }
            z10Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, i10)));
        }
    }

    public final void f() {
        int i10;
        String format;
        TextView nextTextView;
        bh bhVar = this.f24232n;
        if (bhVar != null && this.d != null) {
            b();
            long a2 = bhVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
            if (!this.f24238r0) {
                LocationController.getInstance(currentAccount).loadLiveLocations(a2);
                this.f24238r0 = true;
            }
            TLRPC.User user = null;
            if (arrayList != null) {
                long clientUserId = UserConfig.getInstance(currentAccount).getClientUserId();
                int currentTime = ConnectionsManager.getInstance(currentAccount).getCurrentTime();
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i11);
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia != null && message.date + messageMedia.period > currentTime) {
                        long fromChatId = MessageObject.getFromChatId(message);
                        if (user == null && fromChatId != clientUserId) {
                            user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(fromChatId));
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.f24240s0 != i10) {
                this.f24240s0 = i10;
                String string = LocaleController.getString(R.string.LiveLocationContext);
                if (i10 == 0) {
                    format = string;
                } else {
                    int i12 = i10 - 1;
                    if (LocationController.getInstance(currentAccount).isSharingLocation(a2)) {
                        if (i12 != 0) {
                            if (i12 == 1 && user != null) {
                                format = String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", R.string.SharingYouAndOtherName, UserObject.getFirstName(user)));
                            } else {
                                format = String.format("%1$s - %2$s %3$s", string, LocaleController.getString(R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i12, new Object[0]));
                            }
                        } else {
                            format = String.format("%1$s - %2$s", string, LocaleController.getString(R.string.ChatYourSelfName));
                        }
                    } else if (i12 != 0) {
                        format = String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(user), LocaleController.formatPluralString("AndOther", i12, new Object[0]));
                    } else {
                        format = String.format("%1$s - %2$s", string, UserObject.getFirstName(user));
                    }
                }
                if (!format.equals(this.V)) {
                    this.V = format;
                    int indexOf = format.indexOf(string);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i13 = 0; i13 < 2; i13++) {
                        z10 z10Var = this.d;
                        if (i13 == 0) {
                            nextTextView = z10Var.getTextView();
                        } else {
                            nextTextView = z10Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new e61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21291t7, this.f24236q0)), indexOf, string.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        bh bhVar;
        SpannableStringBuilder spannableStringBuilder;
        TextView nextTextView;
        TextView nextTextView2;
        boolean z12 = true;
        if (this.T) {
            int i10 = this.U;
            if (i10 != 1 && i10 != 3) {
                if ((i10 == 4 || i10 == 5) && !j()) {
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
        boolean z13 = this.T;
        AnimationNotificationsLocker animationNotificationsLocker = this.f24242u0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i11 = this.U;
            if (i11 != 0 && this.f24224f != null && !z10) {
                this.f24249y0 = true;
                return;
            }
            s(0);
            if (z10 && this.S == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                e20 e20Var = this.f24235p0;
                if (e20Var != null) {
                    ((pr0) e20Var).a(true);
                    ((pr0) this.f24235p0).a(false);
                }
            }
            if (!this.T) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f24224f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f24224f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f24224f = new AnimatorSet();
                    e20 e20Var2 = this.f24235p0;
                    if (e20Var2 != null) {
                        ((pr0) e20Var2).a(true);
                    }
                    this.f24224f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f24224f.setDuration(200L);
                    this.f24224f.addListener(new w10(this, 3));
                    this.f24224f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f24220c.a(false, !z10);
                this.f24218b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f24220c.a(true, !z10);
                this.f24218b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
            }
            if (this.R == playingMessageObject && i11 == 0) {
                return;
            }
            this.R = playingMessageObject;
            if (!playingMessageObject.isVoice() && !this.R.isRoundVideo()) {
                this.W = true;
                if (this.G != null) {
                    if (playingMessageObject.getDuration() >= 600.0d) {
                        this.G.setAlpha(1.0f);
                        this.G.setEnabled(true);
                        this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.N, 0);
                        r(false);
                    } else {
                        this.G.setAlpha(0.0f);
                        this.G.setEnabled(false);
                        this.d.setPadding(0, 0, this.N, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.N, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
                for (int i12 = 0; i12 < 2; i12++) {
                    z10 z10Var = this.d;
                    if (i12 == 0) {
                        nextTextView2 = z10Var.getTextView();
                    } else {
                        nextTextView2 = z10Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.W = false;
                org.telegram.ui.ActionBar.u0 u0Var = this.G;
                if (u0Var != null) {
                    u0Var.setAlpha(1.0f);
                    this.G.setEnabled(true);
                }
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.N, 0);
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
                for (int i13 = 0; i13 < 2; i13++) {
                    z10 z10Var2 = this.d;
                    if (i13 == 0) {
                        nextTextView = z10Var2.getTextView();
                    } else {
                        nextTextView = z10Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                r(false);
            }
            spannableStringBuilder.setSpan(new e61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21291t7, this.f24236q0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.W) ? false : false);
            return;
        }
        this.R = null;
        if (this.f24217a0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !i30.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (bhVar = this.f24232n) != null && !i30.c()) {
            ChatObject.Call groupCall = bhVar.getGroupCall();
            if (groupCall != null && groupCall.shouldShowPanel()) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            a(false);
        } else if (this.T) {
            org.telegram.ui.ActionBar.u0 u0Var2 = this.G;
            if (u0Var2 != null && u0Var2.t()) {
                this.G.M(null, null);
            }
            this.T = false;
            if (z10) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = this.f24224f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f24224f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f24224f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f24224f.setDuration(200L);
            e20 e20Var3 = this.f24235p0;
            if (e20Var3 != null) {
                ((pr0) e20Var3).a(true);
            }
            this.f24224f.addListener(new w10(this, 2));
            this.f24224f.start();
        } else {
            setVisibility(8);
        }
    }

    public id getCapsuleBlobDrawable() {
        return this.f24216a;
    }

    public int getCurrentStyle() {
        return this.U;
    }

    public int getStyleHeight() {
        if (this.U == 4) {
            return 48;
        }
        return 36;
    }

    public float getTopPadding() {
        return this.S;
    }

    public final void h() {
        if (this.G != null) {
            return;
        }
        Context context = getContext();
        int i10 = org.telegram.ui.ActionBar.h6.f21100j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24236q0;
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), false, this.f24236q0);
        this.G = u0Var;
        u0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.G.setDelegate(new r10(this));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.G;
        ed edVar = new ed();
        this.H = edVar;
        u0Var2.setIcon(edVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(getContext(), d6Var);
        this.I = a1Var;
        a1Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.s0 u10 = this.G.u(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.s0[] s0VarArr = this.J;
        s0VarArr[0] = u10;
        s0VarArr[1] = this.G.u(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        s0VarArr[2] = this.G.u(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        s0VarArr[3] = this.G.u(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        s0VarArr[4] = this.G.u(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        s0VarArr[5] = this.G.u(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.G, w7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new ca(13, this, fArr));
        this.G.setOnLongClickListener(new u10(this, 0));
        r(false);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = this.U;
        if ((i10 == 3 || i10 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo != null) {
            org.telegram.ui.ActionBar.n2 n2Var = this.h;
            if (n2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) n2Var.getParentActivity();
                launchActivity.O0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.nc0 nc0Var = new org.telegram.ui.nc0(2);
                nc0Var.t0(sharingLocationInfo.messageObject);
                nc0Var.F0 = new ci.d1(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.t0(nc0Var);
            }
        }
    }

    public final void l(float f7, float f10, boolean z10) {
        String formatString;
        int i10;
        if (!i(f7, f10)) {
            if (Math.abs(f10 - 1.0f) < 0.05f) {
                if (f7 < f10) {
                    return;
                }
                formatString = LocaleController.getString(R.string.AudioSpeedNormal);
                if (Math.abs(f7 - 2.0f) < 0.05f) {
                    i10 = R.raw.speed_2to1;
                } else if (f10 < f7) {
                    i10 = R.raw.speed_slow;
                } else {
                    i10 = R.raw.speed_fast;
                }
            } else if (z10 && i(f10, 1.5f) && i(f7, 1.0f)) {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, ed.a(f10));
                i10 = R.raw.speed_1to15;
            } else if (z10 && i(f10, 2.0f) && i(f7, 1.5f)) {
                formatString = LocaleController.getString(R.string.AudioSpeedFast);
                i10 = R.raw.speed_15to2;
            } else {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, ed.a(f10));
                if (f10 < 1.0f) {
                    i10 = R.raw.speed_slow;
                } else {
                    i10 = R.raw.speed_fast;
                }
            }
            xc.a0(this.h).Q(i10, 36, formatString).j();
        }
    }

    public final void m() {
        NotificationCenter.ObserversGroup observersGroup = this.F0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.F0 = null;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.ObserversGroup[] observersGroupArr = this.E0;
            NotificationCenter.ObserversGroup observersGroup2 = observersGroupArr[i10];
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                observersGroupArr[i10] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.h hVar = this.O;
        if (hVar != null && hVar.f31433g >= 1.0f) {
            this.I0 = false;
            AndroidUtilities.runOnUIThread(new v10(this, 0), 150L);
            return;
        }
        this.I0 = true;
    }

    public final void o(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        int v;
        int i11;
        float f7;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.f24219b0.f27819a.f27455f) != null) {
            valueAnimator.cancel();
            this.f24219b0.f27819a.f27455f = null;
        }
        j9 j9Var = this.f24219b0.f27819a;
        if (j9Var.f27455f == null) {
            int i12 = this.U;
            int i13 = this.f24233n0;
            bh bhVar = this.f24232n;
            if (i12 == 4) {
                if (bhVar != null) {
                    call = bhVar.getGroupCall();
                    i13 = this.h.getCurrentAccount();
                } else {
                    call = null;
                }
                i10 = i13;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                call = VoIPService.getSharedInstance().groupCall;
                if (bhVar != null) {
                    user = null;
                } else {
                    user = VoIPService.getSharedInstance().getUser();
                }
                i10 = VoIPService.getSharedInstance().getAccount();
            } else {
                call = null;
                i10 = i13;
                user = null;
            }
            int i14 = 0;
            if (call != null) {
                int size = call.sortedParticipants.size();
                for (int i15 = 0; i15 < 3; i15++) {
                    if (i15 < size) {
                        this.f24219b0.b(i15, call.sortedParticipants.get(i15), i10);
                    } else {
                        this.f24219b0.b(i15, null, i10);
                    }
                }
            } else if (user != null) {
                this.f24219b0.b(0, user, i10);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.f24219b0.b(i16, null, i10);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.f24219b0.b(i17, null, i10);
                }
            }
            this.f24219b0.a(z10);
            if (this.U == 4 && call != null) {
                if (!call.call.rtmp_stream) {
                    i14 = Math.min(3, call.sortedParticipants.size());
                }
                if (i14 == 0) {
                    v = 10;
                } else {
                    v = com.google.android.gms.internal.play_billing.k3.v(i14, 1, 24, 52);
                }
                int i18 = v + 3;
                if (z10) {
                    int i19 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (AndroidUtilities.dp(i18) != i19) {
                        float translationX = (this.d.getTranslationX() + i19) - AndroidUtilities.dp(f7);
                        this.d.setTranslationX(translationX);
                        this.e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        bs bsVar = bs.f25025f;
                        duration.setInterpolator(bsVar);
                        this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(bsVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
                }
                z10 z10Var = this.d;
                float f10 = i18;
                int i20 = 36;
                if (call.isScheduled()) {
                    i11 = 90;
                } else {
                    i11 = 36;
                }
                z10Var.setLayoutParams(w7.z5.d(-1, 20.0f, 51, f10, 5.0f, i11, 0.0f));
                z10 z10Var2 = this.e;
                if (call.isScheduled()) {
                    i20 = 90;
                }
                z10Var2.setLayoutParams(w7.z5.d(-1, 20.0f, 51, f10, 25.0f, i20, 0.0f));
                return;
            }
            return;
        }
        j9Var.f27456g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m();
        int i10 = 15;
        if (this.f24234o0) {
            this.F0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.liveLocationsChanged).add(NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                this.E0[i11] = NotificationCenter.getInstance(i11).createObserversGroup(this).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.groupCallTypingsUpdated).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.liveStoryUpdated).add(NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i11).subscribeToCallMessages(0L, this);
            }
            this.F0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.messagePlayingSpeedChanged).add(NotificationCenter.didStartedCall).add(NotificationCenter.didEndCall).add(NotificationCenter.webRtcSpeakerAmplitudeEvent).add(NotificationCenter.webRtcMicAmplitudeEvent).add(NotificationCenter.groupCallVisibilityChanged);
            if (ci.h1.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !i30.c()) {
                a(true);
            } else {
                bh bhVar = this.f24232n;
                if (bhVar != null && this.h.getSendMessagesHelper().getImportingHistory(bhVar.a()) != null && !j()) {
                    c(true);
                } else if (bhVar != null && bhVar.getGroupCall() != null && bhVar.getGroupCall().shouldShowPanel() && !i30.c() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    r(false);
                }
            }
        }
        int i12 = this.U;
        if (i12 != 3 && i12 != 1) {
            if (i12 == 4 && !this.f24231l0) {
                this.f24231l0 = true;
                this.m0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.h6.E0().f26491l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            id idVar = this.f24216a;
            if (!idVar.f27266u) {
                idVar.f27266u = true;
                idVar.f27265t = SystemClock.elapsedRealtime();
                zf.h.d().a(60, idVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.P != z10 && this.f24248y != null) {
                this.P = z10;
                vj0 vj0Var = this.E;
                if (!z10) {
                    i10 = 29;
                }
                vj0Var.P(i10);
                vj0 vj0Var2 = this.E;
                vj0Var2.N(vj0Var2.f31276f - 1, false, true);
                this.f24248y.invalidate();
            }
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.G0 = 0.0f;
        this.H0 = 0.0f;
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z10;
        int i10;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.P;
        id idVar = this.f24216a;
        if (z11 != z10) {
            this.P = z10;
            vj0 vj0Var = this.E;
            if (z10) {
                i10 = 15;
            } else {
                i10 = 29;
            }
            vj0Var.P(i10);
            vj0 vj0Var2 = this.E;
            vj0Var2.N(vj0Var2.f31276f - 1, false, true);
            this.f24248y.invalidate();
            org.telegram.ui.ActionBar.h6.E0().c(this.T);
            idVar.f(this.T);
        }
        if (this.P) {
            this.H0 = 0.0f;
            org.telegram.ui.ActionBar.h6.E0().a(0.0f);
            idVar.d(0.0f);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.t0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f24224f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24224f = null;
        }
        if (this.f24231l0) {
            AndroidUtilities.cancelRunOnUIThread(this.m0);
            this.f24231l0 = false;
        }
        this.T = false;
        this.f24242u0.unlock();
        this.S = 0.0f;
        m();
        if (!this.f24234o0) {
            for (int i10 = 0; i10 < 4; i10++) {
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i11 = this.U;
        if (i11 == 3 || i11 == 1) {
            g20 E0 = org.telegram.ui.ActionBar.h6.E0();
            ArrayList arrayList = E0.f26491l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.f26484b;
                E0.f26484b = null;
                E0.f26485c = null;
            }
            id idVar = this.f24216a;
            if (idVar.f27266u) {
                idVar.f27266u = false;
                zf.h.d().f(idVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.J0 = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, AndroidUtilities.dp2(getStyleHeight()));
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.t0.d(this, i10, i11);
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.v != null) {
            int i10 = this.U;
            if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
                this.P0++;
                if (!groupCallMessage.isOut()) {
                    this.O0.h(new d20(this.v, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i10 = this.P0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.P0 = i11;
            if (i11 == 0) {
                this.O0.h(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.t0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        p();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final void p() {
        ChatObject.Call call;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.U;
            if (i10 == 1 || i10 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(LocaleController.getString(R.string.VoipGroupConnecting), false);
                } else if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                    if (call.sortedParticipants.size() <= 1) {
                        this.d.b(LocaleController.getString(R.string.ConferenceChat), false);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i11++) {
                        if (i11 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(DialogObject.getShortName(sharedInstance.getAccount(), DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i11).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb2.append(" ");
                        sb2.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    this.d.b(sb2.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    bh bhVar = this.f24232n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (bhVar != null && bhVar.g() != null && bhVar.g().f20280id == sharedInstance.getChat().f20280id) {
                            TLRPC.Chat g10 = bhVar.g();
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
                        if (bhVar != null && bhVar.i() != null && bhVar.i().f20427id == user.f20427id) {
                            this.d.setText(LocaleController.getString(R.string.ReturnToCall));
                        } else {
                            this.d.setText(ContactsController.formatName(user.first_name, user.last_name));
                        }
                    }
                }
            }
        }
    }

    public final void q() {
        int i10;
        TextView nextTextView;
        e61[] e61VarArr;
        TextView nextTextView2;
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.W), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.h6.Qh;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21365x7;
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f24236q0;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        ed edVar = this.H;
        if (edVar != null) {
            ((p6) edVar.f25887c).u(w02);
            Paint paint = (Paint) edVar.f25886b;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.G;
        if (u0Var != null) {
            u0Var.setBackground(org.telegram.ui.ActionBar.h6.g0(w02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.f24218b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21347w7, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.F;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21365x7, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                z10 z10Var = this.e;
                if (i11 == 0) {
                    nextTextView2 = z10Var.getTextView();
                } else {
                    nextTextView2 = z10Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21365x7, d6Var));
                }
            }
        }
        z10 z10Var2 = this.d;
        if (z10Var2 != null) {
            Object tag = z10Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i12 = 0; i12 < 2; i12++) {
                    z10 z10Var3 = this.d;
                    if (i12 == 0) {
                        nextTextView = z10Var3.getTextView();
                    } else {
                        nextTextView = z10Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.h6.w0(intValue, d6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (e61VarArr = (e61[]) ((Spanned) text).getSpans(0, text.length(), e61.class)) != null) {
                            for (e61 e61Var : e61VarArr) {
                                e61Var.f25784b = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21291t7, d6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void r(boolean z10) {
        if (this.H == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.W);
        this.H.l(playbackSpeed, z10);
        q();
        boolean z11 = this.A0;
        int i10 = 0;
        this.A0 = false;
        while (true) {
            org.telegram.ui.ActionBar.s0[] s0VarArr = this.J;
            if (i10 < s0VarArr.length) {
                org.telegram.ui.ActionBar.d6 d6Var = this.f24236q0;
                if (!z11 && Math.abs(playbackSpeed - Q0[i10]) < 0.05f) {
                    org.telegram.ui.ActionBar.s0 s0Var = s0VarArr[i10];
                    int i11 = org.telegram.ui.ActionBar.h6.Qh;
                    s0Var.a(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
                } else {
                    org.telegram.ui.ActionBar.s0 s0Var2 = s0VarArr[i10];
                    int i12 = org.telegram.ui.ActionBar.h6.E8;
                    s0Var2.a(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
                }
                i10++;
            } else {
                this.I.d(playbackSpeed, z10);
                return;
            }
        }
    }

    public final void s(int i10) {
        boolean z10;
        TextView nextTextView;
        int i11;
        int i12;
        boolean z11;
        int i13;
        TextView nextTextView2;
        int i14;
        TextView nextTextView3;
        TextView nextTextView4;
        TextView nextTextView5;
        if (this.U != i10) {
            b();
            int i15 = this.U;
            id idVar = this.f24216a;
            boolean z12 = true;
            if (i15 == 3 || i15 == 1) {
                g20 E0 = org.telegram.ui.ActionBar.h6.E0();
                ArrayList arrayList = E0.f26491l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    E0.d = E0.f26484b;
                    E0.f26484b = null;
                    E0.f26485c = null;
                }
                if (idVar.f27266u) {
                    idVar.f27266u = false;
                    zf.h.d().f(idVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                ne.l lVar = this.O0;
                if (lVar != null) {
                    lVar.h(null, true);
                }
            }
            this.U = i10;
            y10 y10Var = this.f24239s;
            if (i10 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            y10Var.setWillNotDraw(z10);
            if (i10 != 4) {
                this.f24227h0 = false;
            }
            k9 k9Var = this.f24219b0;
            if (k9Var != null) {
                k9Var.setStyle(this.U);
                this.f24219b0.setLayoutParams(w7.z5.e(108, getStyleHeight(), 51));
            }
            this.f24239s.setLayoutParams(w7.z5.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f7 = this.S;
            if (f7 > 0.0f && f7 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.d6 d6Var = this.f24236q0;
            if (i10 == 6) {
                this.f24244w.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                this.f24239s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.nk, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.ok, d6Var)}));
                this.f24239s.setTag(null);
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f24218b.setVisibility(8);
                this.f24248y.setVisibility(8);
                this.f24246x.setVisibility(8);
                this.f24246x.i();
                this.f24219b0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.A7));
                for (int i16 = 0; i16 < 2; i16++) {
                    z10 z10Var = this.d;
                    if (i16 == 0) {
                        nextTextView5 = z10Var.getTextView();
                    } else {
                        nextTextView5 = z10Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        nextTextView5.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A7, d6Var));
                        nextTextView5.setTypeface(AndroidUtilities.bold());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(w7.z5.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i10 == 5) {
                this.f24244w.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                this.f24239s.setBackgroundColor(0);
                this.f24239s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21328v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    z10 z10Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = z10Var2.getTextView();
                    } else {
                        nextTextView4 = z10Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        nextTextView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21311u7, d6Var));
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21311u7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f24218b.setVisibility(8);
                this.f24248y.setVisibility(8);
                this.f24219b0.setVisibility(8);
                this.f24246x.setVisibility(0);
                this.f24246x.d();
                this.F.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.u0 u0Var = this.G;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(w7.z5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.f24244w.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    this.f24239s.setBackgroundColor(0);
                    this.f24239s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21328v7));
                    this.f24248y.setVisibility(8);
                    this.e.setVisibility(0);
                    for (int i18 = 0; i18 < 2; i18++) {
                        z10 z10Var3 = this.d;
                        if (i18 == 0) {
                            nextTextView3 = z10Var3.getTextView();
                        } else {
                            nextTextView3 = z10Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            nextTextView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21291t7, d6Var));
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21291t7));
                    this.d.setPadding(0, 0, this.N, 0);
                    this.f24246x.setVisibility(8);
                    this.f24246x.i();
                    bh bhVar = this.f24232n;
                    z12 = (bhVar == null || bhVar.getGroupCall() == null || bhVar.getGroupCall().call == null || !bhVar.getGroupCall().call.rtmp_stream) ? false : false;
                    k9 k9Var2 = this.f24219b0;
                    if (!z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    k9Var2.setVisibility(i14);
                    if (this.f24219b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.F.setVisibility(8);
                    this.f24218b.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.G;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                        this.G.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.f24244w.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    k9 k9Var3 = this.f24219b0;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    k9Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f24219b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    b20 b20Var = this.f24248y;
                    if (!hasRtmpStream) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    b20Var.setVisibility(i12);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.P = z11;
                    vj0 vj0Var = this.E;
                    if (z11) {
                        i13 = 15;
                    } else {
                        i13 = 29;
                    }
                    vj0Var.P(i13);
                    vj0 vj0Var2 = this.E;
                    vj0Var2.N(vj0Var2.f31276f - 1, false, true);
                    this.f24248y.invalidate();
                    this.f24239s.setBackground(null);
                    this.f24239s.setBackgroundColor(0);
                    this.f24246x.setVisibility(8);
                    this.f24246x.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.h6.E0().f26491l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!idVar.f27266u) {
                        idVar.f27266u = true;
                        idVar.f27265t = SystemClock.elapsedRealtime();
                        zf.h.d().a(60, idVar.F);
                    }
                    invalidate();
                    for (int i19 = 0; i19 < 2; i19++) {
                        z10 z10Var4 = this.d;
                        if (i19 == 0) {
                            nextTextView2 = z10Var4.getTextView();
                        } else {
                            nextTextView2 = z10Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            nextTextView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A7, d6Var));
                            nextTextView2.setTypeface(AndroidUtilities.bold());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.A7));
                    this.F.setVisibility(8);
                    this.f24218b.setVisibility(8);
                    this.e.setVisibility(8);
                    this.M.setVisibility(8);
                    this.d.setLayoutParams(w7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.N, 0);
                    org.telegram.ui.ActionBar.u0 u0Var3 = this.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        this.G.setTag(null);
                    }
                }
            } else {
                this.f24244w.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                this.f24239s.setBackgroundColor(0);
                this.f24239s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21328v7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(0);
                this.f24218b.setVisibility(0);
                this.f24248y.setVisibility(8);
                this.f24246x.setVisibility(8);
                this.f24246x.i();
                this.f24219b0.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    z10 z10Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = z10Var5.getTextView();
                    } else {
                        nextTextView = z10Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21311u7, d6Var));
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21311u7));
                if (i10 == 6) {
                    this.f24218b.setLayoutParams(w7.z5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.z5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setVisibility(8);
                } else if (i10 == 0) {
                    this.f24218b.setLayoutParams(w7.z5.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.z5.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.u0 u0Var4 = this.G;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f24218b.setLayoutParams(w7.z5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.z5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(e20 e20Var) {
        this.f24235p0 = e20Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.L0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.f24239s == null) {
            this.N0 = f7;
            return;
        }
        ImageView imageView = this.f24218b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        yj0 yj0Var = this.f24246x;
        if (yj0Var != null) {
            yj0Var.setTranslationX(f7);
        }
        z10 z10Var = this.d;
        if (z10Var != null) {
            z10Var.setTranslationX(f7);
        }
        z10 z10Var2 = this.e;
        if (z10Var2 != null) {
            z10Var2.setTranslationX(f7);
        }
        k9 k9Var = this.f24219b0;
        if (k9Var != null) {
            k9Var.setTranslationX(f7);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.f24217a0 = z10;
    }

    public void setTopPadding(float f7) {
        this.S = f7;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.S);
        if (i10 == 8) {
            this.J0 = false;
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24216a = new id();
        this.J = new org.telegram.ui.ActionBar.s0[6];
        this.Q = -1;
        this.U = -1;
        this.f24217a0 = true;
        this.f24229j0 = new p6(false, true, true);
        this.m0 = new x10(this);
        this.f24233n0 = UserConfig.selectedAccount;
        this.f24240s0 = -1;
        this.f24241t0 = new org.telegram.ui.Cells.k7(this, 12);
        this.f24242u0 = new AnimationNotificationsLocker();
        this.f24243v0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.E0 = new NotificationCenter.ObserversGroup[4];
        this.K0 = new Paint(1);
        this.M0 = 0;
        this.O0 = new ne.l(new r10(this), bs.h, 450L);
        this.P0 = 0;
        this.f24236q0 = d6Var;
        this.h = n2Var;
        if (n2Var instanceof bh) {
            this.f24232n = (bh) n2Var;
        }
        this.f24237r = view;
        this.T = true;
        this.f24234o0 = z10;
        if (view == null) {
            ((ViewGroup) n2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
