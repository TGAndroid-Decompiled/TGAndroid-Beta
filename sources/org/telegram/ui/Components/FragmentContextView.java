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
    public l20 B0;
    public ViewGroup C0;
    public long D0;
    public dk0 E;
    public final NotificationCenter.ObserversGroup[] E0;
    public ImageView F;
    public NotificationCenter.ObserversGroup F0;
    public org.telegram.ui.ActionBar.u0 G;
    public float G0;
    public hd H;
    public float H0;
    public org.telegram.ui.ActionBar.a1 I;
    public boolean I0;
    public final org.telegram.ui.ActionBar.s0[] J;
    public boolean J0;
    public FrameLayout K;
    public final Paint K0;
    public ImageView L;
    public boolean L0;
    public org.telegram.ui.tk M;
    public int M0;
    public int N;
    public float N0;
    public org.telegram.ui.Components.voip.h O;
    public final me.l O0;
    public boolean P;
    public int P0;
    public int Q;
    public MessageObject R;
    public float S;
    public boolean T;
    public int U;
    public String V;
    public boolean W;
    public final ld f24190a;
    public boolean f24191a0;
    public ImageView f24192b;
    public m9 f24193b0;
    public ih0 f24194c;
    public Paint f24195c0;
    public i20 d;
    public LinearGradient f24196d0;
    public i20 f24197e;
    public Matrix f24198e0;
    public AnimatorSet f24199f;
    public int f24200f0;
    public TextPaint f24201g0;
    public final org.telegram.ui.ActionBar.m2 h;
    public boolean f24202h0;
    public boolean f24203i0;
    public final q6 f24204j0;
    public bd f24205k0;
    public boolean f24206l0;
    public final g20 m0;
    public final eh f24207n;
    public final int f24208n0;
    public final boolean f24209o0;
    public n20 f24210p0;
    public final org.telegram.ui.ActionBar.d6 f24211q0;
    public final View f24212r;
    public boolean f24213r0;
    public h20 f24214s;
    public int f24215s0;
    public final org.telegram.ui.Cells.t6 f24216t0;
    public final AnimationNotificationsLocker f24217u0;
    public ai.x5 v;
    public final AnimationNotificationsLocker f24218v0;
    public View f24219w;
    public boolean f24220w0;
    public gk0 f24221x;
    public boolean f24222x0;
    public k20 f24223y;
    public boolean f24224y0;
    public boolean f24225z0;

    public FragmentContextView(Context context, org.telegram.ui.sy syVar, boolean z10) {
        this(context, syVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.U;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24211q0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21119t7, d6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21137u7, d6Var);
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
        if (this.f24214s != null) {
            return;
        }
        Context context = getContext();
        h20 h20Var = new h20(this, context);
        this.f24214s = h20Var;
        this.f24205k0 = new bd(h20Var);
        int i10 = AndroidUtilities.displaySize.x;
        q6 q6Var = this.f24204j0;
        q6Var.M = i10;
        q6Var.A = 0.4f;
        q6Var.setCallback(h20Var);
        q6Var.u(-1);
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.x(AndroidUtilities.bold());
        addView(this.f24214s, w7.x5.a(36.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        View view = new View(context);
        this.f24219w = view;
        this.f24214s.addView(view, w7.x5.d(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f24192b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f24192b;
        int i11 = org.telegram.ui.ActionBar.h6.f21173w7;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24211q0;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView imageView3 = this.f24192b;
        ih0 ih0Var = new ih0(16);
        this.f24194c = ih0Var;
        imageView3.setImageDrawable(ih0Var);
        this.f24192b.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i11, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f24192b, w7.x5.e(36, 36, 51));
        this.f24192b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f24854b;

            {
                this.f24854b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i12;
                long j3;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f24854b;
                switch (i14) {
                    case 0:
                        eh ehVar = fragmentContextView.f24207n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f24211q0;
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                            a2Var.R = string;
                            if (m2Var instanceof org.telegram.ui.sy) {
                                a2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ehVar.g();
                                TLRPC.User i15 = ehVar.i();
                                if (g10 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    a2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new a20(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21062q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        eh ehVar2 = fragmentContextView.f24207n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f24211q0;
                        org.telegram.ui.ActionBar.m2 m2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f807b;
                                int i17 = d2Var.f809e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f808c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j11 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (m2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new l8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new l8(LaunchActivity.G1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ehVar2 != null) {
                                    j11 = ehVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f24207n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                m2Var2.presentFragment(new org.telegram.ui.zn(bundle), m2Var2 instanceof org.telegram.ui.zn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ehVar2 != null) {
                                j3 = ehVar2.a();
                                i12 = m2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i12 = sharingLocationInfo.messageObject.currentAccount;
                                            j3 = j12;
                                        }
                                    }
                                }
                                i12 = i18;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i12).getSharingLocationInfo(j3));
                                return;
                            } else {
                                m2Var2.showDialog(new gw0(fragmentContextView.getContext(), new a20(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.g60.d1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (m2Var2.getParentActivity() != null && (groupCall = ehVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), m2Var2.getParentActivity(), m2Var2, m2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) m2Var2;
                            if (m2Var2.getSendMessagesHelper().getImportingHistory(znVar.a()) != null) {
                                p50 p50Var = new p50(fragmentContextView.getContext(), null, znVar, d6Var3);
                                p50Var.setOnHideListener(new b1(fragmentContextView, 7));
                                m2Var2.showDialog(p50Var);
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
                            dk0 dk0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (dk0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24223y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView.f24190a.f(true);
                            try {
                                fragmentContextView.f24223y.performHapticFeedback(3, 2);
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
        this.f24221x = imageView4;
        imageView4.setScaleType(scaleType);
        this.f24221x.setAutoRepeat(true);
        this.f24221x.f(R.raw.import_progress, 30, 30, null);
        this.f24221x.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.w0(i11, d6Var)));
        addView(this.f24221x, w7.x5.a(22.0f, 7.0f, 7.0f, 0.0f, 0.0f, 22, 51));
        i20 i20Var = new i20(this, context, context, 0);
        this.d = i20Var;
        addView(i20Var, w7.x5.a(36.0f, 35.0f, 0.0f, 36, 0.0f, -1, 51));
        i20 i20Var2 = new i20(this, context, context, 1);
        this.f24197e = i20Var2;
        addView(i20Var2, w7.x5.a(36.0f, 35.0f, 10.0f, 36, 0.0f, -1, 51));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.O = hVar;
        hVar.f32066g = 1.0f;
        hVar.f32068j = false;
        org.telegram.ui.tk tkVar = new org.telegram.ui.tk(this, context, 1);
        this.M = tkVar;
        tkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.M.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
        org.telegram.ui.tk tkVar2 = this.M;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Qh, d6Var);
        tkVar2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w03, w04, w04));
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setGravity(17);
        this.M.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.M, w7.x5.a(28.0f, 0.0f, 10.0f, 14.0f, 0.0f, -2, 53));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f24854b;

            {
                this.f24854b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i12;
                long j3;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f24854b;
                switch (i14) {
                    case 0:
                        eh ehVar = fragmentContextView.f24207n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f24211q0;
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                            a2Var.R = string;
                            if (m2Var instanceof org.telegram.ui.sy) {
                                a2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ehVar.g();
                                TLRPC.User i15 = ehVar.i();
                                if (g10 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    a2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new a20(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21062q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        eh ehVar2 = fragmentContextView.f24207n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f24211q0;
                        org.telegram.ui.ActionBar.m2 m2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f807b;
                                int i17 = d2Var.f809e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f808c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j11 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (m2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new l8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new l8(LaunchActivity.G1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ehVar2 != null) {
                                    j11 = ehVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f24207n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                m2Var2.presentFragment(new org.telegram.ui.zn(bundle), m2Var2 instanceof org.telegram.ui.zn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ehVar2 != null) {
                                j3 = ehVar2.a();
                                i12 = m2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i12 = sharingLocationInfo.messageObject.currentAccount;
                                            j3 = j12;
                                        }
                                    }
                                }
                                i12 = i18;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i12).getSharingLocationInfo(j3));
                                return;
                            } else {
                                m2Var2.showDialog(new gw0(fragmentContextView.getContext(), new a20(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.g60.d1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (m2Var2.getParentActivity() != null && (groupCall = ehVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), m2Var2.getParentActivity(), m2Var2, m2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) m2Var2;
                            if (m2Var2.getSendMessagesHelper().getImportingHistory(znVar.a()) != null) {
                                p50 p50Var = new p50(fragmentContextView.getContext(), null, znVar, d6Var3);
                                p50Var.setOnHideListener(new b1(fragmentContextView, 7));
                                m2Var2.showDialog(p50Var);
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
                            dk0 dk0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (dk0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24223y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView.f24190a.f(true);
                            try {
                                fragmentContextView.f24223y.performHapticFeedback(3, 2);
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
        int i12 = org.telegram.ui.ActionBar.h6.f21192x7;
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), mode));
        this.K.addView(this.L, w7.x5.e(20, 20, 17));
        this.K.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.K.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.K.setOnClickListener(new ai.e2(11));
        this.K.setVisibility(8);
        addView(this.K, w7.x5.a(36.0f, 0.0f, 0.0f, 36.0f, 0.0f, 36, 53));
        if (!this.f24209o0) {
            h();
        }
        m9 m9Var = new m9(context, false);
        this.f24193b0 = m9Var;
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.f24193b0.setDelegate(new e20(this, 1));
        this.f24193b0.setVisibility(8);
        addView(this.f24193b0, w7.x5.e(108, 36, 51));
        this.E = new dk0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        k20 k20Var = new k20(this, context);
        this.f24223y = k20Var;
        k20Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A7, d6Var), PorterDuff.Mode.SRC_IN));
        this.f24223y.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f24223y.setAnimation(this.E);
        this.f24223y.setScaleType(scaleType);
        this.f24223y.setVisibility(8);
        addView(this.f24223y, w7.x5.a(36.0f, 0.0f, 0.0f, 2.0f, 0.0f, 36, 53));
        this.f24223y.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f24854b;

            {
                this.f24854b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j3;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f24854b;
                switch (i14) {
                    case 0:
                        eh ehVar = fragmentContextView.f24207n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f24211q0;
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                            a2Var.R = string;
                            if (m2Var instanceof org.telegram.ui.sy) {
                                a2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ehVar.g();
                                TLRPC.User i15 = ehVar.i();
                                if (g10 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    a2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new a20(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21062q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        eh ehVar2 = fragmentContextView.f24207n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f24211q0;
                        org.telegram.ui.ActionBar.m2 m2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f807b;
                                int i17 = d2Var.f809e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f808c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j11 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (m2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new l8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new l8(LaunchActivity.G1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ehVar2 != null) {
                                    j11 = ehVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f24207n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                m2Var2.presentFragment(new org.telegram.ui.zn(bundle), m2Var2 instanceof org.telegram.ui.zn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ehVar2 != null) {
                                j3 = ehVar2.a();
                                i122 = m2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i122 = sharingLocationInfo.messageObject.currentAccount;
                                            j3 = j12;
                                        }
                                    }
                                }
                                i122 = i18;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i122).getSharingLocationInfo(j3));
                                return;
                            } else {
                                m2Var2.showDialog(new gw0(fragmentContextView.getContext(), new a20(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.g60.d1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (m2Var2.getParentActivity() != null && (groupCall = ehVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), m2Var2.getParentActivity(), m2Var2, m2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) m2Var2;
                            if (m2Var2.getSendMessagesHelper().getImportingHistory(znVar.a()) != null) {
                                p50 p50Var = new p50(fragmentContextView.getContext(), null, znVar, d6Var3);
                                p50Var.setOnHideListener(new b1(fragmentContextView, 7));
                                m2Var2.showDialog(p50Var);
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
                            dk0 dk0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (dk0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24223y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView.f24190a.f(true);
                            try {
                                fragmentContextView.f24223y.performHapticFeedback(3, 2);
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
        addView(this.F, w7.x5.a(36.0f, 0.0f, 0.0f, 4.0f, 0.0f, 36, 53));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f24854b;

            {
                this.f24854b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j3;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f24854b;
                switch (i14) {
                    case 0:
                        eh ehVar = fragmentContextView.f24207n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f24211q0;
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                            a2Var.R = string;
                            if (m2Var instanceof org.telegram.ui.sy) {
                                a2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ehVar.g();
                                TLRPC.User i15 = ehVar.i();
                                if (g10 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    a2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new a20(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21062q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        eh ehVar2 = fragmentContextView.f24207n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f24211q0;
                        org.telegram.ui.ActionBar.m2 m2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f807b;
                                int i17 = d2Var.f809e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f808c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j11 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (m2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new l8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new l8(LaunchActivity.G1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ehVar2 != null) {
                                    j11 = ehVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f24207n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                m2Var2.presentFragment(new org.telegram.ui.zn(bundle), m2Var2 instanceof org.telegram.ui.zn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ehVar2 != null) {
                                j3 = ehVar2.a();
                                i122 = m2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i122 = sharingLocationInfo.messageObject.currentAccount;
                                            j3 = j12;
                                        }
                                    }
                                }
                                i122 = i18;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i122).getSharingLocationInfo(j3));
                                return;
                            } else {
                                m2Var2.showDialog(new gw0(fragmentContextView.getContext(), new a20(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.g60.d1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (m2Var2.getParentActivity() != null && (groupCall = ehVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), m2Var2.getParentActivity(), m2Var2, m2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) m2Var2;
                            if (m2Var2.getSendMessagesHelper().getImportingHistory(znVar.a()) != null) {
                                p50 p50Var = new p50(fragmentContextView.getContext(), null, znVar, d6Var3);
                                p50Var.setOnHideListener(new b1(fragmentContextView, 7));
                                m2Var2.showDialog(p50Var);
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
                            dk0 dk0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (dk0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24223y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView.f24190a.f(true);
                            try {
                                fragmentContextView.f24223y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        ai.x5 x5Var = new ai.x5(getContext(), 15);
        this.v = x5Var;
        addView(x5Var, w7.x5.a(-2.0f, 96.0f, 3.0f, 96.0f, 0.0f, -1, 48));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f24854b;

            {
                this.f24854b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j3;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z10 = true;
                FragmentContextView fragmentContextView = this.f24854b;
                switch (i14) {
                    case 0:
                        eh ehVar = fragmentContextView.f24207n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f24211q0;
                        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                            a2Var.R = string;
                            if (m2Var instanceof org.telegram.ui.sy) {
                                a2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ehVar.g();
                                TLRPC.User i15 = ehVar.i();
                                if (g10 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    a2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new a20(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21062q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        eh ehVar2 = fragmentContextView.f24207n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f24211q0;
                        org.telegram.ui.ActionBar.m2 m2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f807b;
                                int i17 = d2Var.f809e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f808c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i17).A(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j11 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (m2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new l8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new l8(LaunchActivity.G1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ehVar2 != null) {
                                    j11 = ehVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f24207n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                m2Var2.presentFragment(new org.telegram.ui.zn(bundle), m2Var2 instanceof org.telegram.ui.zn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ehVar2 != null) {
                                j3 = ehVar2.a();
                                i122 = m2Var2.getCurrentAccount();
                            } else {
                                if (LocationController.getLocationsCount() == 1) {
                                    for (int i19 = 0; i19 < 4; i19++) {
                                        if (!LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                            long j12 = sharingLocationInfo.did;
                                            i122 = sharingLocationInfo.messageObject.currentAccount;
                                            j3 = j12;
                                        }
                                    }
                                }
                                i122 = i18;
                                j3 = 0;
                            }
                            if (j3 != 0) {
                                fragmentContextView.k(LocationController.getInstance(i122).getSharingLocationInfo(j3));
                                return;
                            } else {
                                m2Var2.showDialog(new gw0(fragmentContextView.getContext(), new a20(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.g60.d1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (m2Var2.getParentActivity() != null && (groupCall = ehVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = m2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), m2Var2.getParentActivity(), m2Var2, m2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) m2Var2;
                            if (m2Var2.getSendMessagesHelper().getImportingHistory(znVar.a()) != null) {
                                p50 p50Var = new p50(fragmentContextView.getContext(), null, znVar, d6Var3);
                                p50Var.setOnHideListener(new b1(fragmentContextView, 7));
                                m2Var2.showDialog(p50Var);
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
                            dk0 dk0Var = fragmentContextView.E;
                            if (fragmentContextView.P) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (dk0Var.P(i13)) {
                                if (fragmentContextView.P) {
                                    fragmentContextView.E.M(0);
                                } else {
                                    fragmentContextView.E.M(14);
                                }
                            }
                            fragmentContextView.f24223y.d();
                            org.telegram.ui.ActionBar.h6.E0().c(true);
                            fragmentContextView.f24190a.f(true);
                            try {
                                fragmentContextView.f24223y.performHapticFeedback(3, 2);
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
        eh ehVar = this.f24207n;
        if (ehVar != null) {
            if (!this.T || ((i10 = this.U) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.m2 m2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = m2Var.getSendMessagesHelper().getImportingHistory(ehVar.a());
                View fragmentView = m2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = m2Var.getVisibleDialog();
                if ((j() || ehVar.m() || ((visibleDialog instanceof p50) && !((p50) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f24217u0;
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
                        AnimatorSet animatorSet = this.f24199f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f24199f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f24199f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f24199f.setDuration(220L);
                        this.f24199f.setInterpolator(is.f27500f);
                        this.f24199f.addListener(new f20(this, 4));
                        this.f24199f.start();
                        return;
                    }
                    int i11 = this.U;
                    if (i11 == -1 || i11 == 5) {
                        this.T = false;
                        setVisibility(8);
                    }
                } else if (this.U != 5 && this.f24199f != null && !z10) {
                    this.f24225z0 = true;
                } else {
                    s(5);
                    if (z10 && this.S == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        n20 n20Var = this.f24210p0;
                        if (n20Var != null) {
                            ((xr0) n20Var).a(true);
                            ((xr0) this.f24210p0).a(false);
                        }
                    }
                    if (!this.T) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f24199f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f24199f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f24199f = new AnimatorSet();
                            n20 n20Var2 = this.f24210p0;
                            if (n20Var2 != null) {
                                ((xr0) n20Var2).a(true);
                            }
                            this.f24199f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f24199f.setDuration(200L);
                            this.f24199f.addListener(new f20(this, 5));
                            this.f24199f.start();
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
        org.telegram.ui.ActionBar.m2 m2Var = this.h;
        View fragmentView = m2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = m2Var instanceof org.telegram.ui.sy;
        if (z11) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(m2Var.getCurrentAccount()).isSharingLocation(this.f24207n.a());
        }
        org.telegram.ui.Cells.t6 t6Var = this.f24216t0;
        if (!isSharingLocation) {
            this.f24215s0 = -1;
            AndroidUtilities.cancelRunOnUIThread(t6Var);
            if (this.T) {
                this.T = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f24199f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f24199f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24199f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f24199f.setDuration(200L);
                this.f24199f.addListener(new f20(this, 0));
                this.f24199f.start();
                return;
            }
            return;
        }
        b();
        s(2);
        this.f24192b.setImageDrawable(new or0(getContext(), 1));
        if (z10 && this.S == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.T) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f24199f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f24199f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f24199f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f24199f.setDuration(200L);
                this.f24199f.addListener(new f20(this, 1));
                this.f24199f.start();
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
                i20 i20Var = this.d;
                if (i11 == 0) {
                    nextTextView = i20Var.getTextView();
                } else {
                    nextTextView = i20Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new n61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21119t7, this.f24211q0)), indexOf, string2.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        t6Var.run();
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
            eh ehVar = this.f24207n;
            if (i10 == i13) {
                if (ehVar != null) {
                    if (ehVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.didEndCall) {
                int i14 = NotificationCenter.didStartedCall;
                if (i10 != i14 && i10 != NotificationCenter.groupCallUpdated && i10 != NotificationCenter.groupCallVisibilityChanged) {
                    if (i10 == NotificationCenter.groupCallTypingsUpdated) {
                        b();
                        if (this.T && this.U == 4) {
                            ChatObject.Call groupCall = ehVar.getGroupCall();
                            if (groupCall != null && this.f24197e != null) {
                                if (groupCall.isScheduled()) {
                                    this.f24197e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    int i15 = groupCall2.participants_count;
                                    if (i15 == 0) {
                                        i20 i20Var = this.f24197e;
                                        if (groupCall2.rtmp_stream) {
                                            i12 = R.string.ViewersWatchingNobody;
                                        } else {
                                            i12 = R.string.MembersTalkingNobody;
                                        }
                                        i20Var.b(LocaleController.getString(i12), false);
                                    } else {
                                        i20 i20Var2 = this.f24197e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        i20Var2.b(LocaleController.formatPluralString(str, i15, new Object[0]), false);
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
                        ld ldVar = this.f24190a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.H0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.H0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.h6.E0().a(Math.max(this.G0, this.H0));
                                ldVar.d(Math.max(this.G0, this.H0));
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
                                ldVar.d(Math.max(this.G0, this.H0));
                            }
                            this.f24193b0.invalidate();
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
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f24223y != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f24223y.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
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
        ai.d2 d2Var = ai.d2.W;
        AnimationNotificationsLocker animationNotificationsLocker = this.f24217u0;
        int i10 = 0;
        if (d2Var != null) {
            b();
            int i11 = this.U;
            if (6 != i11 && this.f24199f != null && !z10) {
                this.f24222x0 = true;
                return;
            } else if (6 != i11 && this.T && !z10) {
                AnimatorSet animatorSet = this.f24199f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f24199f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f24199f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f24199f.setDuration(220L);
                this.f24199f.setInterpolator(is.f27500f);
                this.f24199f.addListener(new f20(this, 7));
                this.f24199f.start();
                return;
            } else {
                s(6);
                if (!this.T) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f24199f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f24199f = null;
                        }
                        this.f24199f = new AnimatorSet();
                        this.f24218v0.lock();
                        this.f24199f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f24199f.setDuration(220L);
                        this.f24199f.setInterpolator(is.f27500f);
                        this.f24199f.addListener(new f20(this, 8));
                        this.f24199f.start();
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
                    AnimatorSet animatorSet4 = this.f24199f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f24199f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f24199f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f24199f.setDuration(220L);
                    this.f24199f.setInterpolator(is.f27500f);
                    this.f24199f.addListener(new f20(this, 6));
                    this.f24199f.start();
                }
            } else if (z11 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        ai.d2 d2Var2 = ai.d2.W;
        if (d2Var2 != null && this.U == 6) {
            i20 i20Var = this.d;
            TLRPC.GroupCall groupCall = d2Var2.v;
            if (groupCall != null) {
                i10 = groupCall.participants_count;
            }
            i20Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, i10)));
        }
    }

    public final void f() {
        int i10;
        String format;
        TextView nextTextView;
        eh ehVar = this.f24207n;
        if (ehVar != null && this.d != null) {
            b();
            long a2 = ehVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
            if (!this.f24213r0) {
                LocationController.getInstance(currentAccount).loadLiveLocations(a2);
                this.f24213r0 = true;
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
            if (this.f24215s0 != i10) {
                this.f24215s0 = i10;
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
                        i20 i20Var = this.d;
                        if (i13 == 0) {
                            nextTextView = i20Var.getTextView();
                        } else {
                            nextTextView = i20Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new n61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21119t7, this.f24211q0)), indexOf, string.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        eh ehVar;
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
        AnimationNotificationsLocker animationNotificationsLocker = this.f24217u0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i11 = this.U;
            if (i11 != 0 && this.f24199f != null && !z10) {
                this.f24224y0 = true;
                return;
            }
            s(0);
            if (z10 && this.S == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                n20 n20Var = this.f24210p0;
                if (n20Var != null) {
                    ((xr0) n20Var).a(true);
                    ((xr0) this.f24210p0).a(false);
                }
            }
            if (!this.T) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f24199f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f24199f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f24199f = new AnimatorSet();
                    n20 n20Var2 = this.f24210p0;
                    if (n20Var2 != null) {
                        ((xr0) n20Var2).a(true);
                    }
                    this.f24199f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f24199f.setDuration(200L);
                    this.f24199f.addListener(new f20(this, 3));
                    this.f24199f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f24194c.a(false, !z10);
                this.f24192b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f24194c.a(true, !z10);
                this.f24192b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
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
                spannableStringBuilder = new SpannableStringBuilder(a1.g.D(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
                for (int i12 = 0; i12 < 2; i12++) {
                    i20 i20Var = this.d;
                    if (i12 == 0) {
                        nextTextView2 = i20Var.getTextView();
                    } else {
                        nextTextView2 = i20Var.getNextTextView();
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
                    i20 i20Var2 = this.d;
                    if (i13 == 0) {
                        nextTextView = i20Var2.getTextView();
                    } else {
                        nextTextView = i20Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                r(false);
            }
            spannableStringBuilder.setSpan(new n61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21119t7, this.f24211q0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.W) ? false : false);
            return;
        }
        this.R = null;
        if (this.f24191a0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !r30.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (ehVar = this.f24207n) != null && !r30.c()) {
            ChatObject.Call groupCall = ehVar.getGroupCall();
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
            AnimatorSet animatorSet2 = this.f24199f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f24199f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f24199f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f24199f.setDuration(200L);
            n20 n20Var3 = this.f24210p0;
            if (n20Var3 != null) {
                ((xr0) n20Var3).a(true);
            }
            this.f24199f.addListener(new f20(this, 2));
            this.f24199f.start();
        } else {
            setVisibility(8);
        }
    }

    public ld getCapsuleBlobDrawable() {
        return this.f24190a;
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
        int i10 = org.telegram.ui.ActionBar.h6.f20930j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24211q0;
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.h6.w0(i10, d6Var), false, this.f24211q0);
        this.G = u0Var;
        u0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.G.setDelegate(new a20(this));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.G;
        hd hdVar = new hd();
        this.H = hdVar;
        u0Var2.setIcon(hdVar);
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
        addView(this.G, w7.x5.a(36.0f, 0.0f, 0.0f, 36.0f, 0.0f, 36, 53));
        this.G.setOnClickListener(new vt(3, this, fArr));
        this.G.setOnLongClickListener(new d20(this, 0));
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
            org.telegram.ui.ActionBar.m2 m2Var = this.h;
            if (m2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) m2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.gd0 gd0Var = new org.telegram.ui.gd0(2);
                gd0Var.t0(sharingLocationInfo.messageObject);
                gd0Var.F0 = new ai.z1(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.p0(gd0Var);
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
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, hd.a(f10));
                i10 = R.raw.speed_1to15;
            } else if (z10 && i(f10, 2.0f) && i(f7, 1.5f)) {
                formatString = LocaleController.getString(R.string.AudioSpeedFast);
                i10 = R.raw.speed_15to2;
            } else {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, hd.a(f10));
                if (f10 < 1.0f) {
                    i10 = R.raw.speed_slow;
                } else {
                    i10 = R.raw.speed_fast;
                }
            }
            ad.a0(this.h).Q(i10, 36, formatString).j();
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
        if (hVar != null && hVar.f32066g >= 1.0f) {
            this.I0 = false;
            AndroidUtilities.runOnUIThread(new e20(this, 0), 150L);
            return;
        }
        this.I0 = true;
    }

    public final void o(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        int f7;
        int i11;
        float f10;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.f24193b0.f28797a.f28292f) != null) {
            valueAnimator.cancel();
            this.f24193b0.f28797a.f28292f = null;
        }
        l9 l9Var = this.f24193b0.f28797a;
        if (l9Var.f28292f == null) {
            int i12 = this.U;
            int i13 = this.f24208n0;
            eh ehVar = this.f24207n;
            if (i12 == 4) {
                if (ehVar != null) {
                    call = ehVar.getGroupCall();
                    i13 = this.h.getCurrentAccount();
                } else {
                    call = null;
                }
                i10 = i13;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                call = VoIPService.getSharedInstance().groupCall;
                if (ehVar != null) {
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
                        this.f24193b0.b(i15, call.sortedParticipants.get(i15), i10);
                    } else {
                        this.f24193b0.b(i15, null, i10);
                    }
                }
            } else if (user != null) {
                this.f24193b0.b(0, user, i10);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.f24193b0.b(i16, null, i10);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.f24193b0.b(i17, null, i10);
                }
            }
            this.f24193b0.a(z10);
            if (this.U == 4 && call != null) {
                if (!call.call.rtmp_stream) {
                    i14 = Math.min(3, call.sortedParticipants.size());
                }
                if (i14 == 0) {
                    f7 = 10;
                } else {
                    f7 = hg.c.f(i14, 1, 24, 52);
                }
                int i18 = f7 + 3;
                if (z10) {
                    int i19 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (AndroidUtilities.dp(i18) != i19) {
                        float translationX = (this.d.getTranslationX() + i19) - AndroidUtilities.dp(f10);
                        this.d.setTranslationX(translationX);
                        this.f24197e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        is isVar = is.f27500f;
                        duration.setInterpolator(isVar);
                        this.f24197e.animate().translationX(0.0f).setDuration(220L).setInterpolator(isVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.f24197e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.f24197e.setTranslationX(0.0f);
                }
                i20 i20Var = this.d;
                float f11 = i18;
                int i20 = 36;
                if (call.isScheduled()) {
                    i11 = 90;
                } else {
                    i11 = 36;
                }
                i20Var.setLayoutParams(w7.x5.a(20.0f, f11, 5.0f, i11, 0.0f, -1, 51));
                i20 i20Var2 = this.f24197e;
                if (call.isScheduled()) {
                    i20 = 90;
                }
                i20Var2.setLayoutParams(w7.x5.a(20.0f, f11, 25.0f, i20, 0.0f, -1, 51));
                return;
            }
            return;
        }
        l9Var.f28293g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m();
        int i10 = 15;
        if (this.f24209o0) {
            this.F0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.liveLocationsChanged).add(NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                this.E0[i11] = NotificationCenter.getInstance(i11).createObserversGroup(this).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.groupCallTypingsUpdated).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.liveStoryUpdated).add(NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i11).subscribeToCallMessages(0L, this);
            }
            this.F0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.messagePlayingSpeedChanged).add(NotificationCenter.didStartedCall).add(NotificationCenter.didEndCall).add(NotificationCenter.webRtcSpeakerAmplitudeEvent).add(NotificationCenter.webRtcMicAmplitudeEvent).add(NotificationCenter.groupCallVisibilityChanged);
            if (ai.d2.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !r30.c()) {
                a(true);
            } else {
                eh ehVar = this.f24207n;
                if (ehVar != null && this.h.getSendMessagesHelper().getImportingHistory(ehVar.a()) != null && !j()) {
                    c(true);
                } else if (ehVar != null && ehVar.getGroupCall() != null && ehVar.getGroupCall().shouldShowPanel() && !r30.c() && !j()) {
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
            if (i12 == 4 && !this.f24206l0) {
                this.f24206l0 = true;
                this.m0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.h6.E0().f29701l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            ld ldVar = this.f24190a;
            if (!ldVar.f28366u) {
                ldVar.f28366u = true;
                ldVar.f28365t = SystemClock.elapsedRealtime();
                yf.h.d().a(60, ldVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.P != z10 && this.f24223y != null) {
                this.P = z10;
                dk0 dk0Var = this.E;
                if (!z10) {
                    i10 = 29;
                }
                dk0Var.P(i10);
                dk0 dk0Var2 = this.E;
                dk0Var2.N(dk0Var2.f25812f - 1, false, true);
                this.f24223y.invalidate();
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
        ld ldVar = this.f24190a;
        if (z11 != z10) {
            this.P = z10;
            dk0 dk0Var = this.E;
            if (z10) {
                i10 = 15;
            } else {
                i10 = 29;
            }
            dk0Var.P(i10);
            dk0 dk0Var2 = this.E;
            dk0Var2.N(dk0Var2.f25812f - 1, false, true);
            this.f24223y.invalidate();
            org.telegram.ui.ActionBar.h6.E0().c(this.T);
            ldVar.f(this.T);
        }
        if (this.P) {
            this.H0 = 0.0f;
            org.telegram.ui.ActionBar.h6.E0().a(0.0f);
            ldVar.d(0.0f);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.v0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f24199f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f24199f = null;
        }
        if (this.f24206l0) {
            AndroidUtilities.cancelRunOnUIThread(this.m0);
            this.f24206l0 = false;
        }
        this.T = false;
        this.f24217u0.unlock();
        this.S = 0.0f;
        m();
        if (!this.f24209o0) {
            for (int i10 = 0; i10 < 4; i10++) {
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i11 = this.U;
        if (i11 == 3 || i11 == 1) {
            p20 E0 = org.telegram.ui.ActionBar.h6.E0();
            ArrayList arrayList = E0.f29701l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                E0.d = E0.f29693b;
                E0.f29693b = null;
                E0.f29694c = null;
            }
            ld ldVar = this.f24190a;
            if (ldVar.f28366u) {
                ldVar.f28366u = false;
                yf.h.d().f(ldVar.F);
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
        org.telegram.messenger.voip.v0.d(this, i10, i11);
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.v != null) {
            int i10 = this.U;
            if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
                this.P0++;
                if (!groupCallMessage.isOut()) {
                    this.O0.i(new m20(this.v, groupCallMessage), true);
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
                this.O0.i(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.v0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        p();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.v0.h(this, z10);
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
                    eh ehVar = this.f24207n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (ehVar != null && ehVar.g() != null && ehVar.g().f20068id == sharedInstance.getChat().f20068id) {
                            TLRPC.Chat g10 = ehVar.g();
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
                        if (ehVar != null && ehVar.i() != null && ehVar.i().f20215id == user.f20215id) {
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
        n61[] n61VarArr;
        TextView nextTextView2;
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.W), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.h6.Qh;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f21192x7;
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f24211q0;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        hd hdVar = this.H;
        if (hdVar != null) {
            ((q6) hdVar.f27067c).u(w02);
            Paint paint = (Paint) hdVar.f27066b;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.G;
        if (u0Var != null) {
            u0Var.setBackground(org.telegram.ui.ActionBar.h6.g0(w02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.f24192b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21173w7, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.F;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21192x7, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.f24197e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                i20 i20Var = this.f24197e;
                if (i11 == 0) {
                    nextTextView2 = i20Var.getTextView();
                } else {
                    nextTextView2 = i20Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21192x7, d6Var));
                }
            }
        }
        i20 i20Var2 = this.d;
        if (i20Var2 != null) {
            Object tag = i20Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i12 = 0; i12 < 2; i12++) {
                    i20 i20Var3 = this.d;
                    if (i12 == 0) {
                        nextTextView = i20Var3.getTextView();
                    } else {
                        nextTextView = i20Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.h6.w0(intValue, d6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (n61VarArr = (n61[]) ((Spanned) text).getSpans(0, text.length(), n61.class)) != null) {
                            for (n61 n61Var : n61VarArr) {
                                n61Var.f29057b = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21119t7, d6Var);
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
                org.telegram.ui.ActionBar.d6 d6Var = this.f24211q0;
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
            ld ldVar = this.f24190a;
            boolean z12 = true;
            if (i15 == 3 || i15 == 1) {
                p20 E0 = org.telegram.ui.ActionBar.h6.E0();
                ArrayList arrayList = E0.f29701l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    E0.d = E0.f29693b;
                    E0.f29693b = null;
                    E0.f29694c = null;
                }
                if (ldVar.f28366u) {
                    ldVar.f28366u = false;
                    yf.h.d().f(ldVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                me.l lVar = this.O0;
                if (lVar != null) {
                    lVar.i(null, true);
                }
            }
            this.U = i10;
            h20 h20Var = this.f24214s;
            if (i10 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            h20Var.setWillNotDraw(z10);
            if (i10 != 4) {
                this.f24202h0 = false;
            }
            m9 m9Var = this.f24193b0;
            if (m9Var != null) {
                m9Var.setStyle(this.U);
                this.f24193b0.setLayoutParams(w7.x5.e(108, getStyleHeight(), 51));
            }
            this.f24214s.setLayoutParams(w7.x5.a(getStyleHeight(), 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
            float f7 = this.S;
            if (f7 > 0.0f && f7 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.d6 d6Var = this.f24211q0;
            if (i10 == 6) {
                this.f24219w.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                this.f24214s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.nk, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.ok, d6Var)}));
                this.f24214s.setTag(null);
                this.f24197e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f24192b.setVisibility(8);
                this.f24223y.setVisibility(8);
                this.f24221x.setVisibility(8);
                this.f24221x.i();
                this.f24193b0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.A7));
                for (int i16 = 0; i16 < 2; i16++) {
                    i20 i20Var = this.d;
                    if (i16 == 0) {
                        nextTextView5 = i20Var.getTextView();
                    } else {
                        nextTextView5 = i20Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        nextTextView5.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A7, d6Var));
                        nextTextView5.setTypeface(AndroidUtilities.bold());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(w7.x5.a(-2.0f, 0.0f, -1.0f, 0, 0.0f, -2, 17));
            } else if (i10 == 5) {
                this.f24219w.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                this.f24214s.setBackgroundColor(0);
                this.f24214s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21155v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    i20 i20Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = i20Var2.getTextView();
                    } else {
                        nextTextView4 = i20Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        nextTextView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21137u7, d6Var));
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21137u7));
                this.f24197e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f24192b.setVisibility(8);
                this.f24223y.setVisibility(8);
                this.f24193b0.setVisibility(8);
                this.f24221x.setVisibility(0);
                this.f24221x.d();
                this.F.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.u0 u0Var = this.G;
                if (u0Var != null) {
                    u0Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(w7.x5.a(36.0f, 35.0f, 0.0f, 36, 0.0f, -1, 51));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.f24219w.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    this.f24214s.setBackgroundColor(0);
                    this.f24214s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21155v7));
                    this.f24223y.setVisibility(8);
                    this.f24197e.setVisibility(0);
                    for (int i18 = 0; i18 < 2; i18++) {
                        i20 i20Var3 = this.d;
                        if (i18 == 0) {
                            nextTextView3 = i20Var3.getTextView();
                        } else {
                            nextTextView3 = i20Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            nextTextView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21119t7, d6Var));
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21119t7));
                    this.d.setPadding(0, 0, this.N, 0);
                    this.f24221x.setVisibility(8);
                    this.f24221x.i();
                    eh ehVar = this.f24207n;
                    z12 = (ehVar == null || ehVar.getGroupCall() == null || ehVar.getGroupCall().call == null || !ehVar.getGroupCall().call.rtmp_stream) ? false : false;
                    m9 m9Var2 = this.f24193b0;
                    if (!z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    m9Var2.setVisibility(i14);
                    if (this.f24193b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.f24197e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.F.setVisibility(8);
                    this.f24192b.setVisibility(8);
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.G;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                        this.G.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.f24219w.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    m9 m9Var3 = this.f24193b0;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    m9Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f24193b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.f24197e.setTranslationX(0.0f);
                    }
                    k20 k20Var = this.f24223y;
                    if (!hasRtmpStream) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    k20Var.setVisibility(i12);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.P = z11;
                    dk0 dk0Var = this.E;
                    if (z11) {
                        i13 = 15;
                    } else {
                        i13 = 29;
                    }
                    dk0Var.P(i13);
                    dk0 dk0Var2 = this.E;
                    dk0Var2.N(dk0Var2.f25812f - 1, false, true);
                    this.f24223y.invalidate();
                    this.f24214s.setBackground(null);
                    this.f24214s.setBackgroundColor(0);
                    this.f24221x.setVisibility(8);
                    this.f24221x.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.h6.E0().f29701l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!ldVar.f28366u) {
                        ldVar.f28366u = true;
                        ldVar.f28365t = SystemClock.elapsedRealtime();
                        yf.h.d().a(60, ldVar.F);
                    }
                    invalidate();
                    for (int i19 = 0; i19 < 2; i19++) {
                        i20 i20Var4 = this.d;
                        if (i19 == 0) {
                            nextTextView2 = i20Var4.getTextView();
                        } else {
                            nextTextView2 = i20Var4.getNextTextView();
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
                    this.f24192b.setVisibility(8);
                    this.f24197e.setVisibility(8);
                    this.M.setVisibility(8);
                    this.d.setLayoutParams(w7.x5.a(-2.0f, 0.0f, 0.0f, 0, 0.0f, -2, 17));
                    this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.N, 0);
                    org.telegram.ui.ActionBar.u0 u0Var3 = this.G;
                    if (u0Var3 != null) {
                        u0Var3.setVisibility(8);
                        this.G.setTag(null);
                    }
                }
            } else {
                this.f24219w.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                this.f24214s.setBackgroundColor(0);
                this.f24214s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21155v7));
                this.f24197e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(0);
                this.f24192b.setVisibility(0);
                this.f24223y.setVisibility(8);
                this.f24221x.setVisibility(8);
                this.f24221x.i();
                this.f24193b0.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    i20 i20Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = i20Var5.getTextView();
                    } else {
                        nextTextView = i20Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21137u7, d6Var));
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f21137u7));
                if (i10 == 6) {
                    this.f24192b.setLayoutParams(w7.x5.a(36.0f, 8.0f, 0.0f, 0.0f, 0.0f, 36, 51));
                    this.d.setLayoutParams(w7.x5.a(36.0f, 51.0f, 0.0f, 36, 0.0f, -1, 51));
                    this.F.setVisibility(8);
                } else if (i10 == 0) {
                    this.f24192b.setLayoutParams(w7.x5.a(36.0f, 3.0f, 0.0f, 0.0f, 0.0f, 36, 51));
                    this.d.setLayoutParams(w7.x5.a(36.0f, 37.0f, 0.0f, 36, 0.0f, -1, 51));
                    h();
                    org.telegram.ui.ActionBar.u0 u0Var4 = this.G;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f24192b.setLayoutParams(w7.x5.a(36.0f, 8.0f, 0.0f, 0.0f, 0.0f, 36, 51));
                    this.d.setLayoutParams(w7.x5.a(36.0f, 51.0f, 0.0f, 36, 0.0f, -1, 51));
                    this.F.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(n20 n20Var) {
        this.f24210p0 = n20Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.L0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.f24214s == null) {
            this.N0 = f7;
            return;
        }
        ImageView imageView = this.f24192b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        gk0 gk0Var = this.f24221x;
        if (gk0Var != null) {
            gk0Var.setTranslationX(f7);
        }
        i20 i20Var = this.d;
        if (i20Var != null) {
            i20Var.setTranslationX(f7);
        }
        i20 i20Var2 = this.f24197e;
        if (i20Var2 != null) {
            i20Var2.setTranslationX(f7);
        }
        m9 m9Var = this.f24193b0;
        if (m9Var != null) {
            m9Var.setTranslationX(f7);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.f24191a0 = z10;
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

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.m2 m2Var, View view, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24190a = new ld();
        this.J = new org.telegram.ui.ActionBar.s0[6];
        this.Q = -1;
        this.U = -1;
        this.f24191a0 = true;
        this.f24204j0 = new q6(false, true, true);
        this.m0 = new g20(this);
        this.f24208n0 = UserConfig.selectedAccount;
        this.f24215s0 = -1;
        this.f24216t0 = new org.telegram.ui.Cells.t6(this, 13);
        this.f24217u0 = new AnimationNotificationsLocker();
        this.f24218v0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.E0 = new NotificationCenter.ObserversGroup[4];
        this.K0 = new Paint(1);
        this.M0 = 0;
        this.O0 = new me.l(new a20(this), is.h, 450L);
        this.P0 = 0;
        this.f24211q0 = d6Var;
        this.h = m2Var;
        if (m2Var instanceof eh) {
            this.f24207n = (eh) m2Var;
        }
        this.f24212r = view;
        this.T = true;
        this.f24209o0 = z10;
        if (view == null) {
            ((ViewGroup) m2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
