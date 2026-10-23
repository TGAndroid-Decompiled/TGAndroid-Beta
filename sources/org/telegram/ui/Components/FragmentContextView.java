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
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
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
public class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.b6 {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public c20 B0;
    public ViewGroup C0;
    public long D0;
    public yj0 E;
    public org.telegram.ui.Cells.y E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public org.telegram.ui.ActionBar.u0 G;
    public PorterDuffColorFilter G0;
    public ed H;
    public int H0;
    public org.telegram.ui.ActionBar.a1 I;
    public int I0;
    public final org.telegram.ui.ActionBar.s0[] J;
    public int J0;
    public FrameLayout K;
    public final NotificationCenter.ObserversGroup[] K0;
    public ImageView L;
    public NotificationCenter.ObserversGroup L0;
    public org.telegram.ui.lk M;
    public float M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.voip.h O;
    public boolean O0;
    public boolean P;
    public boolean P0;
    public int Q;
    public final Paint Q0;
    public MessageObject R;
    public boolean R0;
    public float S;
    public int S0;
    public boolean T;
    public float T0;
    public int U;
    public final ne.l U0;
    public String V;
    public int V0;
    public boolean W;
    public final id f24357a;
    public boolean f24358a0;
    public ImageView f24359b;
    public k9 f24360b0;
    public eh0 f24361c;
    public Paint f24362c0;
    public z10 d;
    public LinearGradient f24363d0;
    public z10 e;
    public Matrix f24364e0;
    public AnimatorSet f24365f;
    public int f24366f0;
    public TextPaint f24367g0;
    public final org.telegram.ui.ActionBar.o2 h;
    public boolean f24368h0;
    public boolean f24369i0;
    public final p6 f24370j0;
    public yc f24371k0;
    public boolean f24372l0;
    public final x10 m0;
    public final bh f24373n;
    public final int f24374n0;
    public final boolean f24375o0;
    public e20 f24376p0;
    public final org.telegram.ui.ActionBar.g6 f24377q0;
    public final View f24378r;
    public boolean f24379r0;
    public y10 f24380s;
    public int f24381s0;
    public final org.telegram.ui.Cells.u5 f24382t0;
    public final AnimationNotificationsLocker f24383u0;
    public ci.h4 v;
    public final AnimationNotificationsLocker f24384v0;
    public View f24385w;
    public boolean f24386w0;
    public bk0 f24387x;
    public boolean f24388x0;
    public b20 f24389y;
    public boolean f24390y0;
    public boolean f24391z0;

    public FragmentContextView(Context context, org.telegram.ui.ey eyVar, boolean z10) {
        this(context, eyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.U;
        org.telegram.ui.ActionBar.g6 g6Var = this.f24377q0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21480t7, g6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21500u7, g6Var);
        }
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A7, g6Var);
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
        if (this.f24380s != null) {
            return;
        }
        Context context = getContext();
        y10 y10Var = new y10(this, context);
        this.f24380s = y10Var;
        this.f24371k0 = new yc(y10Var);
        int i10 = AndroidUtilities.displaySize.x;
        p6 p6Var = this.f24370j0;
        p6Var.M = i10;
        p6Var.A = 0.4f;
        p6Var.setCallback(y10Var);
        p6Var.u(-1);
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.x(AndroidUtilities.bold());
        addView(this.f24380s, w7.z5.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f24385w = view;
        this.f24380s.addView(view, w7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f24359b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f24359b;
        int i11 = org.telegram.ui.ActionBar.k6.f21536w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.g6 g6Var = this.f24377q0;
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, g6Var, mode);
        ImageView imageView3 = this.f24359b;
        eh0 eh0Var = new eh0(16);
        this.f24361c = eh0Var;
        imageView3.setImageDrawable(eh0Var);
        this.f24359b.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i11, g6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f24359b, w7.z5.e(36, 36, 51));
        this.f24359b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f30343b;

            {
                this.f30343b = this;
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
                FragmentContextView fragmentContextView = this.f30343b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f24373n;
                        org.telegram.ui.ActionBar.g6 g6Var2 = fragmentContextView.f24377q0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, g6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                            c2Var.R = string;
                            if (o2Var instanceof org.telegram.ui.ey) {
                                c2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g10 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, g6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f24373n;
                        org.telegram.ui.ActionBar.g6 g6Var3 = fragmentContextView.f24377q0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ci.h1 h1Var = ci.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f5380b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.J1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f5381c, j11)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, g6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.J1)) {
                                        new k8(LaunchActivity.J1, g6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f24373n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                o2Var2.presentFragment(new org.telegram.ui.sn(bundle), o2Var2 instanceof org.telegram.ui.sn);
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
                                i12 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new bw0(fragmentContextView.getContext(), new r10(fragmentContextView), g6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.u50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(snVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, snVar, g6Var3);
                                g50Var.setOnHideListener(new a1(fragmentContextView, 7));
                                o2Var2.showDialog(g50Var);
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
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
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
                            yj0 yj0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yj0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24389y.d();
                            org.telegram.ui.ActionBar.k6.F0().c(true);
                            fragmentContextView.f24357a.h(true);
                            try {
                                fragmentContextView.f24389y.performHapticFeedback(3, 2);
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
        this.f24387x = imageView4;
        imageView4.setScaleType(scaleType);
        this.f24387x.setAutoRepeat(true);
        this.f24387x.f(R.raw.import_progress, 30, 30, null);
        org.telegram.ui.ActionBar.r6.D(this.f24387x, org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.w0(i11, g6Var)), org.telegram.ui.ActionBar.r6.O(i11), g6Var);
        addView(this.f24387x, w7.z5.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        z10 z10Var = new z10(this, context, context, 0);
        this.d = z10Var;
        addView(z10Var, w7.z5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        z10 z10Var2 = new z10(this, context, context, 1);
        this.e = z10Var2;
        addView(z10Var2, w7.z5.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.O = hVar;
        hVar.f31614g = 1.0f;
        hVar.f31616j = false;
        org.telegram.ui.lk lkVar = new org.telegram.ui.lk(this, context, 1);
        this.M = lkVar;
        lkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        org.telegram.ui.ActionBar.r6.W(this.M, org.telegram.ui.ActionBar.k6.Sh, g6Var);
        org.telegram.ui.lk lkVar2 = this.M;
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, g6Var);
        int i13 = org.telegram.ui.ActionBar.k6.Qh;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i13, g6Var);
        org.telegram.ui.ActionBar.r6.S(lkVar2, org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, w03, w03), org.telegram.ui.ActionBar.r6.O(i12), org.telegram.ui.ActionBar.r6.O(i13), g6Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setGravity(17);
        this.M.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.M, w7.z5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f30343b;

            {
                this.f30343b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i132;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f30343b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f24373n;
                        org.telegram.ui.ActionBar.g6 g6Var2 = fragmentContextView.f24377q0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, g6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                            c2Var.R = string;
                            if (o2Var instanceof org.telegram.ui.ey) {
                                c2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g10 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, g6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f24373n;
                        org.telegram.ui.ActionBar.g6 g6Var3 = fragmentContextView.f24377q0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ci.h1 h1Var = ci.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f5380b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.J1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f5381c, j11)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, g6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.J1)) {
                                        new k8(LaunchActivity.J1, g6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f24373n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                o2Var2.presentFragment(new org.telegram.ui.sn(bundle), o2Var2 instanceof org.telegram.ui.sn);
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
                                i122 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new bw0(fragmentContextView.getContext(), new r10(fragmentContextView), g6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.u50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(snVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, snVar, g6Var3);
                                g50Var.setOnHideListener(new a1(fragmentContextView, 7));
                                o2Var2.showDialog(g50Var);
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
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
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
                            yj0 yj0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (yj0Var.P(i132)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24389y.d();
                            org.telegram.ui.ActionBar.k6.F0().c(true);
                            fragmentContextView.f24357a.h(true);
                            try {
                                fragmentContextView.f24389y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        if (this.O0) {
            n();
        }
        this.K = new FrameLayout(context);
        ImageView imageView5 = new ImageView(context);
        this.L = imageView5;
        imageView5.setImageResource(R.drawable.msg_mute);
        ImageView imageView6 = this.L;
        int i14 = org.telegram.ui.ActionBar.k6.f21554x7;
        org.telegram.ui.ActionBar.r6.t(imageView6, i14, g6Var, mode);
        this.K.addView(this.L, w7.z5.e(20, 20, 17));
        this.K.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i14, g6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.K.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.K.setOnClickListener(new ah.f(13));
        this.K.setVisibility(8);
        addView(this.K, w7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f24375o0) {
            h();
        }
        k9 k9Var = new k9(context, false);
        this.f24360b0 = k9Var;
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.f24360b0.setDelegate(new v10(this, 1));
        this.f24360b0.setVisibility(8);
        addView(this.f24360b0, w7.z5.e(108, 36, 51));
        this.E = new yj0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        b20 b20Var = new b20(this, context);
        this.f24389y = b20Var;
        org.telegram.ui.ActionBar.r6.t(b20Var, org.telegram.ui.ActionBar.k6.A7, g6Var, PorterDuff.Mode.SRC_IN);
        this.f24389y.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i14, g6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f24389y.setAnimation(this.E);
        this.f24389y.setScaleType(scaleType);
        this.f24389y.setVisibility(8);
        addView(this.f24389y, w7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.f24389y.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f30343b;

            {
                this.f30343b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i132;
                int i142 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f30343b;
                switch (i142) {
                    case 0:
                        bh bhVar = fragmentContextView.f24373n;
                        org.telegram.ui.ActionBar.g6 g6Var2 = fragmentContextView.f24377q0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, g6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                            c2Var.R = string;
                            if (o2Var instanceof org.telegram.ui.ey) {
                                c2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g10 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, g6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f24373n;
                        org.telegram.ui.ActionBar.g6 g6Var3 = fragmentContextView.f24377q0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ci.h1 h1Var = ci.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f5380b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.J1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f5381c, j11)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, g6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.J1)) {
                                        new k8(LaunchActivity.J1, g6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f24373n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                o2Var2.presentFragment(new org.telegram.ui.sn(bundle), o2Var2 instanceof org.telegram.ui.sn);
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
                                i122 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new bw0(fragmentContextView.getContext(), new r10(fragmentContextView), g6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.u50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(snVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, snVar, g6Var3);
                                g50Var.setOnHideListener(new a1(fragmentContextView, 7));
                                o2Var2.showDialog(g50Var);
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
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
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
                            yj0 yj0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (yj0Var.P(i132)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24389y.d();
                            org.telegram.ui.ActionBar.k6.F0().c(true);
                            fragmentContextView.f24357a.h(true);
                            try {
                                fragmentContextView.f24389y.performHapticFeedback(3, 2);
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
        org.telegram.ui.ActionBar.r6.t(this.F, i14, g6Var, mode);
        this.F.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i14, g6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, w7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f30343b;

            {
                this.f30343b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i132;
                int i142 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f30343b;
                switch (i142) {
                    case 0:
                        bh bhVar = fragmentContextView.f24373n;
                        org.telegram.ui.ActionBar.g6 g6Var2 = fragmentContextView.f24377q0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, g6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                            c2Var.R = string;
                            if (o2Var instanceof org.telegram.ui.ey) {
                                c2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g10 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, g6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f24373n;
                        org.telegram.ui.ActionBar.g6 g6Var3 = fragmentContextView.f24377q0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ci.h1 h1Var = ci.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f5380b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.J1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f5381c, j11)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, g6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.J1)) {
                                        new k8(LaunchActivity.J1, g6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f24373n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                o2Var2.presentFragment(new org.telegram.ui.sn(bundle), o2Var2 instanceof org.telegram.ui.sn);
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
                                i122 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new bw0(fragmentContextView.getContext(), new r10(fragmentContextView), g6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.u50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(snVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, snVar, g6Var3);
                                g50Var.setOnHideListener(new a1(fragmentContextView, 7));
                                o2Var2.showDialog(g50Var);
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
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
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
                            yj0 yj0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (yj0Var.P(i132)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24389y.d();
                            org.telegram.ui.ActionBar.k6.F0().c(true);
                            fragmentContextView.f24357a.h(true);
                            try {
                                fragmentContextView.f24389y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        ci.h4 h4Var = new ci.h4(getContext(), 15);
        this.v = h4Var;
        addView(h4Var, w7.z5.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f30343b;

            {
                this.f30343b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i132;
                int i142 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f30343b;
                switch (i142) {
                    case 0:
                        bh bhVar = fragmentContextView.f24373n;
                        org.telegram.ui.ActionBar.g6 g6Var2 = fragmentContextView.f24377q0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, g6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                            c2Var.R = string;
                            if (o2Var instanceof org.telegram.ui.ey) {
                                c2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g10 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21421q7, g6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f24373n;
                        org.telegram.ui.ActionBar.g6 g6Var3 = fragmentContextView.f24377q0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ci.h1 h1Var = ci.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f5380b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.J1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f5381c, j11)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, g6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.J1)) {
                                        new k8(LaunchActivity.J1, g6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f24373n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                o2Var2.presentFragment(new org.telegram.ui.sn(bundle), o2Var2 instanceof org.telegram.ui.sn);
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
                                i122 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new bw0(fragmentContextView.getContext(), new r10(fragmentContextView), g6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.u50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.sn snVar = (org.telegram.ui.sn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(snVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, snVar, g6Var3);
                                g50Var.setOnHideListener(new a1(fragmentContextView, 7));
                                o2Var2.showDialog(g50Var);
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
                        float[] fArr = FragmentContextView.W0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.W0;
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
                            yj0 yj0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (yj0Var.P(i132)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24389y.d();
                            org.telegram.ui.ActionBar.k6.F0().c(true);
                            fragmentContextView.f24357a.h(true);
                            try {
                                fragmentContextView.f24389y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        setLeftMargin(this.T0);
    }

    public final void c(boolean z10) {
        int i10;
        bh bhVar = this.f24373n;
        if (bhVar != null) {
            if (!this.T || ((i10 = this.U) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.o2 o2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = o2Var.getSendMessagesHelper().getImportingHistory(bhVar.a());
                View fragmentView = o2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = o2Var.getVisibleDialog();
                if ((j() || bhVar.n() || ((visibleDialog instanceof g50) && !((g50) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f24383u0;
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
                        AnimatorSet animatorSet = this.f24365f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f24365f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f24365f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f24365f.setDuration(220L);
                        this.f24365f.setInterpolator(bs.f25133f);
                        this.f24365f.addListener(new w10(this, 4));
                        this.f24365f.start();
                        return;
                    }
                    int i11 = this.U;
                    if (i11 == -1 || i11 == 5) {
                        this.T = false;
                        setVisibility(8);
                    }
                } else if (this.U != 5 && this.f24365f != null && !z10) {
                    this.f24391z0 = true;
                } else {
                    r(5);
                    if (z10 && this.S == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        e20 e20Var = this.f24376p0;
                        if (e20Var != null) {
                            ((sr0) e20Var).a(true);
                            ((sr0) this.f24376p0).a(false);
                        }
                    }
                    if (!this.T) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f24365f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f24365f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f24365f = new AnimatorSet();
                            e20 e20Var2 = this.f24376p0;
                            if (e20Var2 != null) {
                                ((sr0) e20Var2).a(true);
                            }
                            this.f24365f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f24365f.setDuration(200L);
                            this.f24365f.addListener(new w10(this, 5));
                            this.f24365f.start();
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
        org.telegram.ui.ActionBar.o2 o2Var = this.h;
        View fragmentView = o2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = o2Var instanceof org.telegram.ui.ey;
        if (z11) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(o2Var.getCurrentAccount()).isSharingLocation(this.f24373n.a());
        }
        org.telegram.ui.Cells.u5 u5Var = this.f24382t0;
        if (!isSharingLocation) {
            this.f24381s0 = -1;
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            if (this.T) {
                this.T = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f24365f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f24365f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24365f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f24365f.setDuration(200L);
                this.f24365f.addListener(new w10(this, 0));
                this.f24365f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f24359b.setImageDrawable(new jr0(getContext(), 1));
        if (z10 && this.S == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.T) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f24365f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f24365f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f24365f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f24365f.setDuration(200L);
                this.f24365f.addListener(new w10(this, 1));
                this.f24365f.start();
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
            spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21480t7, this.f24377q0)), indexOf, string2.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        u5Var.run();
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
            bh bhVar = this.f24373n;
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
                        q(true);
                        return;
                    } else {
                        int i17 = NotificationCenter.webRtcMicAmplitudeEvent;
                        id idVar = this.f24357a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.k6.F0().a(Math.max(this.M0, this.N0));
                                idVar.f(Math.max(this.M0, this.N0));
                                return;
                            }
                            return;
                        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
                            b();
                            this.M0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.k6.F0().a(Math.max(this.M0, this.N0));
                                idVar.f(Math.max(this.M0, this.N0));
                            }
                            this.f24360b0.invalidate();
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
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f24389y != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f24389y.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
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
        AnimationNotificationsLocker animationNotificationsLocker = this.f24383u0;
        int i10 = 0;
        if (h1Var != null) {
            b();
            int i11 = this.U;
            if (6 != i11 && this.f24365f != null && !z10) {
                this.f24388x0 = true;
                return;
            } else if (6 != i11 && this.T && !z10) {
                AnimatorSet animatorSet = this.f24365f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f24365f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24365f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f24365f.setDuration(220L);
                this.f24365f.setInterpolator(bs.f25133f);
                this.f24365f.addListener(new w10(this, 7));
                this.f24365f.start();
                return;
            } else {
                r(6);
                if (!this.T) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f24365f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f24365f = null;
                        }
                        this.f24365f = new AnimatorSet();
                        this.f24384v0.lock();
                        this.f24365f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f24365f.setDuration(220L);
                        this.f24365f.setInterpolator(bs.f25133f);
                        this.f24365f.addListener(new w10(this, 8));
                        this.f24365f.start();
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
                    AnimatorSet animatorSet4 = this.f24365f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f24365f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f24365f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f24365f.setDuration(220L);
                    this.f24365f.setInterpolator(bs.f25133f);
                    this.f24365f.addListener(new w10(this, 6));
                    this.f24365f.start();
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
        bh bhVar = this.f24373n;
        if (bhVar != null && this.d != null) {
            b();
            long a2 = bhVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
            if (!this.f24379r0) {
                LocationController.getInstance(currentAccount).loadLiveLocations(a2);
                this.f24379r0 = true;
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
            if (this.f24381s0 != i10) {
                this.f24381s0 = i10;
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
                        spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21480t7, this.f24377q0)), indexOf, string.length() + indexOf, 18);
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
        AnimationNotificationsLocker animationNotificationsLocker = this.f24383u0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i11 = this.U;
            if (i11 != 0 && this.f24365f != null && !z10) {
                this.f24390y0 = true;
                return;
            }
            r(0);
            if (z10 && this.S == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                e20 e20Var = this.f24376p0;
                if (e20Var != null) {
                    ((sr0) e20Var).a(true);
                    ((sr0) this.f24376p0).a(false);
                }
            }
            if (!this.T) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f24365f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f24365f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f24365f = new AnimatorSet();
                    e20 e20Var2 = this.f24376p0;
                    if (e20Var2 != null) {
                        ((sr0) e20Var2).a(true);
                    }
                    this.f24365f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f24365f.setDuration(200L);
                    this.f24365f.addListener(new w10(this, 3));
                    this.f24365f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f24361c.a(false, !z10);
                this.f24359b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f24361c.a(true, !z10);
                this.f24359b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
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
                        q(false);
                    } else {
                        this.G.setAlpha(0.0f);
                        this.G.setEnabled(false);
                        this.d.setPadding(0, 0, this.N, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.N, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(a1.g.D(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
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
                spannableStringBuilder = new SpannableStringBuilder(a1.g.D(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
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
                q(false);
            }
            spannableStringBuilder.setSpan(new j61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21480t7, this.f24377q0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.W) ? false : false);
            return;
        }
        this.R = null;
        if (this.f24358a0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !i30.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (bhVar = this.f24373n) != null && !i30.c()) {
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
            AnimatorSet animatorSet2 = this.f24365f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f24365f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f24365f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f24365f.setDuration(200L);
            e20 e20Var3 = this.f24376p0;
            if (e20Var3 != null) {
                ((sr0) e20Var3).a(true);
            }
            this.f24365f.addListener(new w10(this, 2));
            this.f24365f.start();
        } else {
            setVisibility(8);
        }
    }

    public id getCapsuleBlobDrawable() {
        return this.f24357a;
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
        int i10 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.g6 g6Var = this.f24377q0;
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(i10, g6Var), false, this.f24377q0);
        this.G = u0Var;
        if (u0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.r6.t(this.G.getIconView(), i10, g6Var, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
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
        org.telegram.ui.ActionBar.a1 a1Var = new org.telegram.ui.ActionBar.a1(getContext(), g6Var);
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
        this.G.setOnClickListener(new ca(14, this, fArr));
        this.G.setOnLongClickListener(new u10(this, 0));
        q(false);
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
            org.telegram.ui.ActionBar.o2 o2Var = this.h;
            if (o2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) o2Var.getParentActivity();
                launchActivity.P0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.sc0 sc0Var = new org.telegram.ui.sc0(2);
                sc0Var.u0(sharingLocationInfo.messageObject);
                sc0Var.F0 = new ci.d1(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.u0(sc0Var);
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
        NotificationCenter.ObserversGroup observersGroup = this.L0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.L0 = null;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.ObserversGroup[] observersGroupArr = this.K0;
            NotificationCenter.ObserversGroup observersGroup2 = observersGroupArr[i10];
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                observersGroupArr[i10] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.h hVar = this.O;
        if (hVar != null && hVar.f31614g >= 1.0f) {
            this.O0 = false;
            AndroidUtilities.runOnUIThread(new v10(this, 0), 150L);
            return;
        }
        this.O0 = true;
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
        if (!z10 && (valueAnimator = this.f24360b0.f27954a.f27612f) != null) {
            valueAnimator.cancel();
            this.f24360b0.f27954a.f27612f = null;
        }
        j9 j9Var = this.f24360b0.f27954a;
        if (j9Var.f27612f == null) {
            int i12 = this.U;
            int i13 = this.f24374n0;
            bh bhVar = this.f24373n;
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
                        this.f24360b0.b(i15, call.sortedParticipants.get(i15), i10);
                    } else {
                        this.f24360b0.b(i15, null, i10);
                    }
                }
            } else if (user != null) {
                this.f24360b0.b(0, user, i10);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.f24360b0.b(i16, null, i10);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.f24360b0.b(i17, null, i10);
                }
            }
            this.f24360b0.a(z10);
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
                        bs bsVar = bs.f25133f;
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
        j9Var.f27613g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m();
        int i10 = 15;
        if (this.f24375o0) {
            this.L0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.liveLocationsChanged).add(NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                this.K0[i11] = NotificationCenter.getInstance(i11).createObserversGroup(this).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.groupCallTypingsUpdated).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.liveStoryUpdated).add(NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i11).subscribeToCallMessages(0L, this);
            }
            this.L0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.messagePlayingSpeedChanged).add(NotificationCenter.didStartedCall).add(NotificationCenter.didEndCall).add(NotificationCenter.webRtcSpeakerAmplitudeEvent).add(NotificationCenter.webRtcMicAmplitudeEvent).add(NotificationCenter.groupCallVisibilityChanged);
            if (ci.h1.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !i30.c()) {
                a(true);
            } else {
                bh bhVar = this.f24373n;
                if (bhVar != null && this.h.getSendMessagesHelper().getImportingHistory(bhVar.a()) != null && !j()) {
                    c(true);
                } else if (bhVar != null && bhVar.getGroupCall() != null && bhVar.getGroupCall().shouldShowPanel() && !i30.c() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    q(false);
                }
            }
        }
        int i12 = this.U;
        if (i12 != 3 && i12 != 1) {
            if (i12 == 4 && !this.f24372l0) {
                this.f24372l0 = true;
                this.m0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.k6.F0().f26521l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            id idVar = this.f24357a;
            if (!idVar.f27297u) {
                idVar.f27297u = true;
                idVar.f27296t = SystemClock.elapsedRealtime();
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
            if (this.P != z10 && this.f24389y != null) {
                this.P = z10;
                yj0 yj0Var = this.E;
                if (!z10) {
                    i10 = 29;
                }
                yj0Var.P(i10);
                yj0 yj0Var2 = this.E;
                yj0Var2.N(yj0Var2.f32940f - 1, false, true);
                this.f24389y.invalidate();
            }
        }
        if (this.T && this.S == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.M0 = 0.0f;
        this.N0 = 0.0f;
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
        id idVar = this.f24357a;
        if (z11 != z10) {
            this.P = z10;
            yj0 yj0Var = this.E;
            if (z10) {
                i10 = 15;
            } else {
                i10 = 29;
            }
            yj0Var.P(i10);
            yj0 yj0Var2 = this.E;
            yj0Var2.N(yj0Var2.f32940f - 1, false, true);
            this.f24389y.invalidate();
            org.telegram.ui.ActionBar.k6.F0().c(this.T);
            idVar.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            org.telegram.ui.ActionBar.k6.F0().a(0.0f);
            idVar.f(0.0f);
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
        AnimatorSet animatorSet = this.f24365f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24365f = null;
        }
        if (this.f24372l0) {
            AndroidUtilities.cancelRunOnUIThread(this.m0);
            this.f24372l0 = false;
        }
        this.T = false;
        this.f24383u0.unlock();
        this.S = 0.0f;
        m();
        if (!this.f24375o0) {
            for (int i10 = 0; i10 < 4; i10++) {
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i11 = this.U;
        if (i11 == 3 || i11 == 1) {
            g20 F0 = org.telegram.ui.ActionBar.k6.F0();
            ArrayList arrayList = F0.f26521l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                F0.d = F0.f26514b;
                F0.f26514b = null;
                F0.f26515c = null;
            }
            id idVar = this.f24357a;
            if (idVar.f27297u) {
                idVar.f27297u = false;
                zf.h.d().f(idVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.P0 = false;
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
                this.V0++;
                if (!groupCallMessage.isOut()) {
                    this.U0.h(new d20(this.v, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i10 = this.V0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.V0 = i11;
            if (i11 == 0) {
                this.U0.h(null, true);
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
                    bh bhVar = this.f24373n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (bhVar != null && bhVar.g() != null && bhVar.g().f20343id == sharedInstance.getChat().f20343id) {
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
                        if (bhVar != null && bhVar.i() != null && bhVar.i().f20490id == user.f20490id) {
                            this.d.setText(LocaleController.getString(R.string.ReturnToCall));
                        } else {
                            this.d.setText(ContactsController.formatName(user.first_name, user.last_name));
                        }
                    }
                }
            }
        }
    }

    public final void q(boolean z10) {
        if (this.H == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.W);
        this.H.l(playbackSpeed, z10);
        updateColors();
        boolean z11 = this.A0;
        int i10 = 0;
        this.A0 = false;
        while (true) {
            org.telegram.ui.ActionBar.s0[] s0VarArr = this.J;
            if (i10 < s0VarArr.length) {
                org.telegram.ui.ActionBar.g6 g6Var = this.f24377q0;
                if (!z11 && Math.abs(playbackSpeed - W0[i10]) < 0.05f) {
                    org.telegram.ui.ActionBar.s0 s0Var = s0VarArr[i10];
                    int i11 = org.telegram.ui.ActionBar.k6.Qh;
                    s0Var.a(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
                } else {
                    org.telegram.ui.ActionBar.s0 s0Var2 = s0VarArr[i10];
                    int i12 = org.telegram.ui.ActionBar.k6.E8;
                    s0Var2.a(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
                }
                i10++;
            } else {
                this.I.e(playbackSpeed, z10);
                return;
            }
        }
    }

    public final void r(int i10) {
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
            id idVar = this.f24357a;
            boolean z12 = true;
            if (i15 == 3 || i15 == 1) {
                g20 F0 = org.telegram.ui.ActionBar.k6.F0();
                ArrayList arrayList = F0.f26521l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    F0.d = F0.f26514b;
                    F0.f26514b = null;
                    F0.f26515c = null;
                }
                if (idVar.f27297u) {
                    idVar.f27297u = false;
                    zf.h.d().f(idVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                ne.l lVar = this.U0;
                if (lVar != null) {
                    lVar.h(null, true);
                }
            }
            this.U = i10;
            y10 y10Var = this.f24380s;
            if (i10 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            y10Var.setWillNotDraw(z10);
            if (i10 != 4) {
                this.f24368h0 = false;
            }
            k9 k9Var = this.f24360b0;
            if (k9Var != null) {
                k9Var.setStyle(this.U);
                this.f24360b0.setLayoutParams(w7.z5.e(108, getStyleHeight(), 51));
            }
            this.f24380s.setLayoutParams(w7.z5.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f7 = this.S;
            if (f7 > 0.0f && f7 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.f24377q0;
            if (i10 == 6) {
                this.f24385w.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
                this.f24380s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.nk, g6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ok, g6Var)}));
                this.f24380s.setTag(null);
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f24359b.setVisibility(8);
                this.f24389y.setVisibility(8);
                this.f24387x.setVisibility(8);
                this.f24387x.i();
                this.f24360b0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
                for (int i16 = 0; i16 < 2; i16++) {
                    z10 z10Var = this.d;
                    if (i16 == 0) {
                        nextTextView5 = z10Var.getTextView();
                    } else {
                        nextTextView5 = z10Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        org.telegram.ui.ActionBar.r6.W(nextTextView5, org.telegram.ui.ActionBar.k6.A7, g6Var);
                        nextTextView5.setTypeface(AndroidUtilities.bold());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(w7.z5.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i10 == 5) {
                this.f24385w.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
                this.f24380s.setBackgroundColor(0);
                this.f24380s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21517v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    z10 z10Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = z10Var2.getTextView();
                    } else {
                        nextTextView4 = z10Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        org.telegram.ui.ActionBar.r6.W(nextTextView4, org.telegram.ui.ActionBar.k6.f21500u7, g6Var);
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21500u7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f24359b.setVisibility(8);
                this.f24389y.setVisibility(8);
                this.f24360b0.setVisibility(8);
                this.f24387x.setVisibility(0);
                this.f24387x.d();
                this.F.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.u0 u0Var = this.G;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(w7.z5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.f24385w.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
                    this.f24380s.setBackgroundColor(0);
                    this.f24380s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21517v7));
                    this.f24389y.setVisibility(8);
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
                            org.telegram.ui.ActionBar.r6.W(nextTextView3, org.telegram.ui.ActionBar.k6.f21480t7, g6Var);
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21480t7));
                    this.d.setPadding(0, 0, this.N, 0);
                    this.f24387x.setVisibility(8);
                    this.f24387x.i();
                    bh bhVar = this.f24373n;
                    z12 = (bhVar == null || bhVar.getGroupCall() == null || bhVar.getGroupCall().call == null || !bhVar.getGroupCall().call.rtmp_stream) ? false : false;
                    k9 k9Var2 = this.f24360b0;
                    if (!z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    k9Var2.setVisibility(i14);
                    if (this.f24360b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.F.setVisibility(8);
                    this.f24359b.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.G;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                        this.G.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.f24385w.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    k9 k9Var3 = this.f24360b0;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    k9Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f24360b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    b20 b20Var = this.f24389y;
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
                    yj0 yj0Var = this.E;
                    if (z11) {
                        i13 = 15;
                    } else {
                        i13 = 29;
                    }
                    yj0Var.P(i13);
                    yj0 yj0Var2 = this.E;
                    yj0Var2.N(yj0Var2.f32940f - 1, false, true);
                    this.f24389y.invalidate();
                    this.f24380s.setBackground(null);
                    this.f24380s.setBackgroundColor(0);
                    this.f24387x.setVisibility(8);
                    this.f24387x.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.k6.F0().f26521l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!idVar.f27297u) {
                        idVar.f27297u = true;
                        idVar.f27296t = SystemClock.elapsedRealtime();
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
                            org.telegram.ui.ActionBar.r6.W(nextTextView2, org.telegram.ui.ActionBar.k6.A7, g6Var);
                            nextTextView2.setTypeface(AndroidUtilities.bold());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.A7));
                    this.F.setVisibility(8);
                    this.f24359b.setVisibility(8);
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
                this.f24385w.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
                this.f24380s.setBackgroundColor(0);
                this.f24380s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21517v7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(0);
                this.f24359b.setVisibility(0);
                this.f24389y.setVisibility(8);
                this.f24387x.setVisibility(8);
                this.f24387x.i();
                this.f24360b0.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    z10 z10Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = z10Var5.getTextView();
                    } else {
                        nextTextView = z10Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        org.telegram.ui.ActionBar.r6.W(nextTextView, org.telegram.ui.ActionBar.k6.f21500u7, g6Var);
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21500u7));
                if (i10 == 6) {
                    this.f24359b.setLayoutParams(w7.z5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.z5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setVisibility(8);
                } else if (i10 == 0) {
                    this.f24359b.setLayoutParams(w7.z5.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.z5.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.u0 u0Var4 = this.G;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f24359b.setLayoutParams(w7.z5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.z5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(e20 e20Var) {
        this.f24376p0 = e20Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.R0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.f24380s == null) {
            this.T0 = f7;
            return;
        }
        ImageView imageView = this.f24359b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        bk0 bk0Var = this.f24387x;
        if (bk0Var != null) {
            bk0Var.setTranslationX(f7);
        }
        z10 z10Var = this.d;
        if (z10Var != null) {
            z10Var.setTranslationX(f7);
        }
        z10 z10Var2 = this.e;
        if (z10Var2 != null) {
            z10Var2.setTranslationX(f7);
        }
        k9 k9Var = this.f24360b0;
        if (k9Var != null) {
            k9Var.setTranslationX(f7);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.f24358a0 = z10;
    }

    public void setTopPadding(float f7) {
        this.S = f7;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.S);
        if (i10 == 8) {
            this.P0 = false;
        }
    }

    @Override
    public final void updateColors() {
        int i10;
        TextView nextTextView;
        j61[] j61VarArr;
        TextView nextTextView2;
        id idVar = this.f24357a;
        int i11 = idVar.A;
        if (i11 >= 0) {
            idVar.E = 1.0f;
            idVar.a(id.e(i11));
        }
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.W), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.k6.Qh;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21554x7;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f24377q0;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        ed edVar = this.H;
        if (edVar != null) {
            ((p6) edVar.f25957c).u(w02);
            Paint paint = (Paint) edVar.f25956b;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.G;
        if (u0Var != null) {
            Drawable background = u0Var.getBackground();
            if (background != null && background == this.E0) {
                if (w02 != this.J0) {
                    this.J0 = w02;
                    org.telegram.ui.ActionBar.k6.E1(background, w02 & 436207615, true);
                }
            } else {
                org.telegram.ui.ActionBar.u0 u0Var2 = this.G;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(436207615 & w02, 1, AndroidUtilities.dp(14.0f));
                this.E0 = g02;
                u0Var2.setBackground(g02);
                this.J0 = w02;
            }
        }
        if (this.f24359b != null) {
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21536w7, g6Var);
            if (this.F0 == null || w03 != this.H0) {
                ImageView imageView = this.f24359b;
                this.H0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21554x7, g6Var);
            if (this.G0 == null || w04 != this.I0) {
                ImageView imageView2 = this.F;
                this.I0 = w04;
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(w04, PorterDuff.Mode.MULTIPLY);
                this.G0 = porterDuffColorFilter2;
                imageView2.setColorFilter(porterDuffColorFilter2);
            }
        }
        if (this.e != null) {
            for (int i12 = 0; i12 < 2; i12++) {
                z10 z10Var = this.e;
                if (i12 == 0) {
                    nextTextView2 = z10Var.getTextView();
                } else {
                    nextTextView2 = z10Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21554x7, g6Var));
                }
            }
        }
        z10 z10Var2 = this.d;
        if (z10Var2 != null) {
            Object tag = z10Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i13 = 0; i13 < 2; i13++) {
                    z10 z10Var3 = this.d;
                    if (i13 == 0) {
                        nextTextView = z10Var3.getTextView();
                    } else {
                        nextTextView = z10Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.k6.w0(intValue, g6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (j61VarArr = (j61[]) ((Spanned) text).getSpans(0, text.length(), j61.class)) != null) {
                            for (j61 j61Var : j61VarArr) {
                                j61Var.f27531b = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21480t7, g6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.o2 o2Var, View view, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24357a = new id();
        this.J = new org.telegram.ui.ActionBar.s0[6];
        this.Q = -1;
        this.U = -1;
        this.f24358a0 = true;
        this.f24370j0 = new p6(false, true, true);
        this.m0 = new x10(this);
        this.f24374n0 = UserConfig.selectedAccount;
        this.f24381s0 = -1;
        this.f24382t0 = new org.telegram.ui.Cells.u5(this, 14);
        this.f24383u0 = new AnimationNotificationsLocker();
        this.f24384v0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.K0 = new NotificationCenter.ObserversGroup[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new ne.l(new r10(this), bs.h, 450L);
        this.V0 = 0;
        this.f24377q0 = g6Var;
        this.h = o2Var;
        if (o2Var instanceof bh) {
            this.f24373n = (bh) o2Var;
        }
        this.f24378r = view;
        this.T = true;
        this.f24375o0 = z10;
        if (view == null) {
            ((ViewGroup) o2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
