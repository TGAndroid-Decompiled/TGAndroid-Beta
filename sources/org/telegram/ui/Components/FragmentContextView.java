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
    public static final float[] J0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public float A0;
    public ImageView B;
    public boolean B0;
    public org.telegram.ui.ActionBar.w0 C;
    public boolean C0;
    public df.f D;
    public final Paint D0;
    public org.telegram.ui.ActionBar.c1 E;
    public boolean E0;
    public final org.telegram.ui.ActionBar.u0[] F;
    public int F0;
    public FrameLayout G;
    public float G0;
    public ImageView H;
    public final xd.j H0;
    public org.telegram.ui.rk I;
    public int I0;
    public int J;
    public org.telegram.ui.Components.voip.h K;
    public boolean L;
    public int M;
    public MessageObject N;
    public float O;
    public boolean P;
    public int Q;
    public String R;
    public boolean S;
    public boolean T;
    public d9 U;
    public Paint V;
    public LinearGradient W;
    public final zc f22996a;
    public Matrix f22997a0;
    public ImageView f22998b;
    public int f22999b0;
    public ng0 f23000c;
    public TextPaint f23001c0;
    public s10 d;
    public boolean f23002d0;
    public s10 e;
    public boolean f23003e0;
    public AnimatorSet f23004f;
    public final j6 f23005f0;
    public rc f23006g0;
    public final org.telegram.ui.ActionBar.p2 h;
    public boolean f23007h0;
    public final q10 f23008i0;
    public final int f23009j0;
    public final boolean f23010k0;
    public w10 f23011l0;
    public final org.telegram.ui.ActionBar.f6 m0;
    public final rg f23012n;
    public boolean f23013n0;
    public int f23014o0;
    public final m2.b f23015p0;
    public final AnimationNotificationsLocker f23016q0;
    public r10 f23017r;
    public final AnimationNotificationsLocker f23018r0;
    public dh.d f23019s;
    public boolean f23020s0;
    public boolean f23021t0;
    public boolean f23022u0;
    public View v;
    public boolean f23023v0;
    public jj0 f23024w;
    public boolean f23025w0;
    public u10 f23026x;
    public org.telegram.ui.gj f23027x0;
    public gj0 f23028y;
    public long f23029y0;
    public float f23030z0;

    public FragmentContextView(Context context, org.telegram.ui.qy qyVar, boolean z4) {
        this(context, qyVar, null, z4, null);
    }

    private int getTitleTextColor() {
        int i10 = this.Q;
        org.telegram.ui.ActionBar.f6 f6Var = this.m0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20166t7, f6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20183u7, f6Var);
        }
        return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var);
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
        if (this.f23017r != null) {
            return;
        }
        Context context = getContext();
        r10 r10Var = new r10(this, context);
        this.f23017r = r10Var;
        this.f23006g0 = new rc(r10Var);
        int i10 = AndroidUtilities.displaySize.x;
        j6 j6Var = this.f23005f0;
        j6Var.G = i10;
        j6Var.v = 0.4f;
        j6Var.setCallback(r10Var);
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.u(AndroidUtilities.bold());
        addView(this.f23017r, k7.b6.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.f23017r.addView(view, k7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f22998b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f22998b;
        int i11 = org.telegram.ui.ActionBar.j6.f20220w7;
        org.telegram.ui.ActionBar.f6 f6Var = this.m0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.f22998b;
        ng0 ng0Var = new ng0(16);
        this.f23000c = ng0Var;
        imageView3.setImageDrawable(ng0Var);
        this.f22998b.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i11, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f22998b, k7.b6.e(36, 36, 51));
        this.f22998b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f26523b;

            {
                this.f26523b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i12;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z4 = true;
                FragmentContextView fragmentContextView = this.f26523b;
                switch (i14) {
                    case 0:
                        rg rgVar = fragmentContextView.f23012n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.Q == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                            d2Var.O = string;
                            if (p2Var instanceof org.telegram.ui.qy) {
                                d2Var.Q = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i15 = rgVar.i();
                                if (g10 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.Q = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20116q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        rg rgVar2 = fragmentContextView.f23012n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.Q;
                        if (i16 == 6) {
                            nh.e1 e1Var = nh.e1.T;
                            if (e1Var != null) {
                                long j11 = e1Var.f15273b;
                                int i17 = e1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(e1Var.f15274c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.D1)) {
                                        new c8(LaunchActivity.D1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (rgVar2 != null) {
                                    j12 = rgVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f23012n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                p2Var2.presentFragment(new org.telegram.ui.zn(bundle), p2Var2 instanceof org.telegram.ui.zn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i12 = p2Var2.getCurrentAccount();
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
                                p2Var2.showDialog(new cv0(fragmentContextView.getContext(), new k10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.e60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (p2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) p2Var2;
                            if (p2Var2.getSendMessagesHelper().getImportingHistory(znVar.a()) != null) {
                                z40 z40Var = new z40(fragmentContextView.getContext(), null, znVar, f6Var3);
                                z40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                p2Var2.showDialog(z40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.Q == 0) {
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
                        float[] fArr = FragmentContextView.J0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.J0;
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
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.L = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            gj0 gj0Var = fragmentContextView.f23028y;
                            if (fragmentContextView.L) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (gj0Var.N(i13)) {
                                if (fragmentContextView.L) {
                                    fragmentContextView.f23028y.K(0);
                                } else {
                                    fragmentContextView.f23028y.K(14);
                                }
                            }
                            fragmentContextView.f23026x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f22996a.f(true);
                            try {
                                fragmentContextView.f23026x.performHapticFeedback(3, 2);
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
        this.f23024w = imageView4;
        imageView4.setScaleType(scaleType);
        this.f23024w.setAutoRepeat(true);
        this.f23024w.f(R.raw.import_progress, 30, 30, null);
        this.f23024w.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        addView(this.f23024w, k7.b6.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        s10 s10Var = new s10(this, context, context, 0);
        this.d = s10Var;
        addView(s10Var, k7.b6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        s10 s10Var2 = new s10(this, context, context, 1);
        this.e = s10Var2;
        addView(s10Var2, k7.b6.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.K = hVar;
        hVar.f29629g = 1.0f;
        hVar.f29631j = false;
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, context, 1);
        this.I = rkVar;
        rkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.I.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        org.telegram.ui.rk rkVar2 = this.I;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
        rkVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.I.setTextSize(1, 14.0f);
        this.I.setTypeface(AndroidUtilities.bold());
        this.I.setGravity(17);
        this.I.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.I, k7.b6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f26523b;

            {
                this.f26523b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i12;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z4 = true;
                FragmentContextView fragmentContextView = this.f26523b;
                switch (i14) {
                    case 0:
                        rg rgVar = fragmentContextView.f23012n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.Q == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                            d2Var.O = string;
                            if (p2Var instanceof org.telegram.ui.qy) {
                                d2Var.Q = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i15 = rgVar.i();
                                if (g10 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.Q = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20116q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        rg rgVar2 = fragmentContextView.f23012n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.Q;
                        if (i16 == 6) {
                            nh.e1 e1Var = nh.e1.T;
                            if (e1Var != null) {
                                long j11 = e1Var.f15273b;
                                int i17 = e1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(e1Var.f15274c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.D1)) {
                                        new c8(LaunchActivity.D1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (rgVar2 != null) {
                                    j12 = rgVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f23012n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                p2Var2.presentFragment(new org.telegram.ui.zn(bundle), p2Var2 instanceof org.telegram.ui.zn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i12 = p2Var2.getCurrentAccount();
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
                                p2Var2.showDialog(new cv0(fragmentContextView.getContext(), new k10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.e60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (p2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) p2Var2;
                            if (p2Var2.getSendMessagesHelper().getImportingHistory(znVar.a()) != null) {
                                z40 z40Var = new z40(fragmentContextView.getContext(), null, znVar, f6Var3);
                                z40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                p2Var2.showDialog(z40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.Q == 0) {
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
                        float[] fArr = FragmentContextView.J0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.J0;
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
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.L = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            gj0 gj0Var = fragmentContextView.f23028y;
                            if (fragmentContextView.L) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (gj0Var.N(i13)) {
                                if (fragmentContextView.L) {
                                    fragmentContextView.f23028y.K(0);
                                } else {
                                    fragmentContextView.f23028y.K(14);
                                }
                            }
                            fragmentContextView.f23026x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f22996a.f(true);
                            try {
                                fragmentContextView.f23026x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        if (this.B0) {
            m();
        }
        this.G = new FrameLayout(context);
        ImageView imageView5 = new ImageView(context);
        this.H = imageView5;
        imageView5.setImageResource(R.drawable.msg_mute);
        ImageView imageView6 = this.H;
        int i12 = org.telegram.ui.ActionBar.j6.f20239x7;
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
        this.G.addView(this.H, k7.b6.e(20, 20, 17));
        this.G.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.G.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.G.setOnClickListener(new dg.m(13));
        this.G.setVisibility(8);
        addView(this.G, k7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f23010k0) {
            h();
        }
        d9 d9Var = new d9(context, false);
        this.U = d9Var;
        d9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.U.setDelegate(new o10(this, 1));
        this.U.setVisibility(8);
        addView(this.U, k7.b6.e(108, 36, 51));
        this.f23028y = new gj0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        u10 u10Var = new u10(this, context);
        this.f23026x = u10Var;
        u10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var), PorterDuff.Mode.SRC_IN));
        this.f23026x.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f23026x.setAnimation(this.f23028y);
        this.f23026x.setScaleType(scaleType);
        this.f23026x.setVisibility(8);
        addView(this.f23026x, k7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.f23026x.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f26523b;

            {
                this.f26523b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z4 = true;
                FragmentContextView fragmentContextView = this.f26523b;
                switch (i14) {
                    case 0:
                        rg rgVar = fragmentContextView.f23012n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.Q == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                            d2Var.O = string;
                            if (p2Var instanceof org.telegram.ui.qy) {
                                d2Var.Q = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i15 = rgVar.i();
                                if (g10 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.Q = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20116q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        rg rgVar2 = fragmentContextView.f23012n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.Q;
                        if (i16 == 6) {
                            nh.e1 e1Var = nh.e1.T;
                            if (e1Var != null) {
                                long j11 = e1Var.f15273b;
                                int i17 = e1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(e1Var.f15274c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.D1)) {
                                        new c8(LaunchActivity.D1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (rgVar2 != null) {
                                    j12 = rgVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f23012n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                p2Var2.presentFragment(new org.telegram.ui.zn(bundle), p2Var2 instanceof org.telegram.ui.zn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i122 = p2Var2.getCurrentAccount();
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
                                p2Var2.showDialog(new cv0(fragmentContextView.getContext(), new k10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.e60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (p2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) p2Var2;
                            if (p2Var2.getSendMessagesHelper().getImportingHistory(znVar.a()) != null) {
                                z40 z40Var = new z40(fragmentContextView.getContext(), null, znVar, f6Var3);
                                z40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                p2Var2.showDialog(z40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.Q == 0) {
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
                        float[] fArr = FragmentContextView.J0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.J0;
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
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.L = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            gj0 gj0Var = fragmentContextView.f23028y;
                            if (fragmentContextView.L) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (gj0Var.N(i13)) {
                                if (fragmentContextView.L) {
                                    fragmentContextView.f23028y.K(0);
                                } else {
                                    fragmentContextView.f23028y.K(14);
                                }
                            }
                            fragmentContextView.f23026x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f22996a.f(true);
                            try {
                                fragmentContextView.f23026x.performHapticFeedback(3, 2);
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
        this.B = imageView7;
        imageView7.setImageResource(R.drawable.miniplayer_close);
        this.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
        this.B.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.B.setScaleType(scaleType);
        addView(this.B, k7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.B.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f26523b;

            {
                this.f26523b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z4 = true;
                FragmentContextView fragmentContextView = this.f26523b;
                switch (i14) {
                    case 0:
                        rg rgVar = fragmentContextView.f23012n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.Q == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                            d2Var.O = string;
                            if (p2Var instanceof org.telegram.ui.qy) {
                                d2Var.Q = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i15 = rgVar.i();
                                if (g10 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.Q = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20116q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        rg rgVar2 = fragmentContextView.f23012n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.Q;
                        if (i16 == 6) {
                            nh.e1 e1Var = nh.e1.T;
                            if (e1Var != null) {
                                long j11 = e1Var.f15273b;
                                int i17 = e1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(e1Var.f15274c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.D1)) {
                                        new c8(LaunchActivity.D1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (rgVar2 != null) {
                                    j12 = rgVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f23012n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                p2Var2.presentFragment(new org.telegram.ui.zn(bundle), p2Var2 instanceof org.telegram.ui.zn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i122 = p2Var2.getCurrentAccount();
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
                                p2Var2.showDialog(new cv0(fragmentContextView.getContext(), new k10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.e60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (p2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) p2Var2;
                            if (p2Var2.getSendMessagesHelper().getImportingHistory(znVar.a()) != null) {
                                z40 z40Var = new z40(fragmentContextView.getContext(), null, znVar, f6Var3);
                                z40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                p2Var2.showDialog(z40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.Q == 0) {
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
                        float[] fArr = FragmentContextView.J0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.J0;
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
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.L = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            gj0 gj0Var = fragmentContextView.f23028y;
                            if (fragmentContextView.L) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (gj0Var.N(i13)) {
                                if (fragmentContextView.L) {
                                    fragmentContextView.f23028y.K(0);
                                } else {
                                    fragmentContextView.f23028y.K(14);
                                }
                            }
                            fragmentContextView.f23026x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f22996a.f(true);
                            try {
                                fragmentContextView.f23026x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        dh.d dVar = new dh.d(getContext(), 15);
        this.f23019s = dVar;
        addView(dVar, k7.b6.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f26523b;

            {
                this.f26523b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int i122;
                long j10;
                TL_stories.StoryItem u10;
                int i13;
                int i14 = r2;
                boolean z4 = true;
                FragmentContextView fragmentContextView = this.f26523b;
                switch (i14) {
                    case 0:
                        rg rgVar = fragmentContextView.f23012n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.Q == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                            d2Var.O = string;
                            if (p2Var instanceof org.telegram.ui.qy) {
                                d2Var.Q = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = rgVar.g();
                                TLRPC.User i15 = rgVar.i();
                                if (g10 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.Q = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20116q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        rg rgVar2 = fragmentContextView.f23012n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.m0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.Q;
                        if (i16 == 6) {
                            nh.e1 e1Var = nh.e1.T;
                            if (e1Var != null) {
                                long j11 = e1Var.f15273b;
                                int i17 = e1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.D1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(e1Var.f15274c, j11)) != null) {
                                    u10.dialogId = j11;
                                    U.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j12 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new c8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.D1)) {
                                        new c8(LaunchActivity.D1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (rgVar2 != null) {
                                    j12 = rgVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f23012n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                p2Var2.presentFragment(new org.telegram.ui.zn(bundle), p2Var2 instanceof org.telegram.ui.zn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (rgVar2 != null) {
                                j10 = rgVar2.a();
                                i122 = p2Var2.getCurrentAccount();
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
                                p2Var2.showDialog(new cv0(fragmentContextView.getContext(), new k10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.e60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (p2Var2.getParentActivity() != null && (groupCall = rgVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.zn znVar = (org.telegram.ui.zn) p2Var2;
                            if (p2Var2.getSendMessagesHelper().getImportingHistory(znVar.a()) != null) {
                                z40 z40Var = new z40(fragmentContextView.getContext(), null, znVar, f6Var3);
                                z40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                p2Var2.showDialog(z40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.Q == 0) {
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
                        float[] fArr = FragmentContextView.J0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.J0;
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
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.L = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            gj0 gj0Var = fragmentContextView.f23028y;
                            if (fragmentContextView.L) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (gj0Var.N(i13)) {
                                if (fragmentContextView.L) {
                                    fragmentContextView.f23028y.K(0);
                                } else {
                                    fragmentContextView.f23028y.K(14);
                                }
                            }
                            fragmentContextView.f23026x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f22996a.f(true);
                            try {
                                fragmentContextView.f23026x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        setLeftMargin(this.G0);
    }

    public final void c(boolean z4) {
        int i10;
        rg rgVar = this.f23012n;
        if (rgVar != null) {
            if (!this.P || ((i10 = this.Q) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.p2 p2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = p2Var.getSendMessagesHelper().getImportingHistory(rgVar.a());
                View fragmentView = p2Var.getFragmentView();
                if (!z4 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z4 = true;
                }
                Dialog visibleDialog = p2Var.getVisibleDialog();
                if ((j() || rgVar.n() || ((visibleDialog instanceof z40) && !((z40) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f23016q0;
                if (importingHistory == null) {
                    if (this.P && ((z4 && this.Q == -1) || this.Q == 5)) {
                        this.P = false;
                        if (z4) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                            return;
                        }
                        AnimatorSet animatorSet = this.f23004f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f23004f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f23004f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f23004f.setDuration(220L);
                        this.f23004f.setInterpolator(mr.f27122f);
                        this.f23004f.addListener(new p10(this, 4));
                        this.f23004f.start();
                        return;
                    }
                    int i11 = this.Q;
                    if (i11 == -1 || i11 == 5) {
                        this.P = false;
                        setVisibility(8);
                    }
                } else if (this.Q != 5 && this.f23004f != null && !z4) {
                    this.f23023v0 = true;
                } else {
                    r(5);
                    if (z4 && this.O == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        w10 w10Var = this.f23011l0;
                        if (w10Var != null) {
                            ((vq0) w10Var).a(true);
                            ((vq0) this.f23011l0).a(false);
                        }
                    }
                    if (!this.P) {
                        if (!z4) {
                            AnimatorSet animatorSet3 = this.f23004f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f23004f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f23004f = new AnimatorSet();
                            w10 w10Var2 = this.f23011l0;
                            if (w10Var2 != null) {
                                ((vq0) w10Var2).a(true);
                            }
                            this.f23004f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f23004f.setDuration(200L);
                            this.f23004f.addListener(new p10(this, 5));
                            this.f23004f.start();
                        }
                        this.P = true;
                        setVisibility(0);
                    }
                    int i12 = this.M;
                    int i13 = importingHistory.uploadProgress;
                    if (i12 != i13) {
                        this.M = i13;
                        this.d.b(AndroidUtilities.replaceTags(LocaleController.formatString("ImportUploading", R.string.ImportUploading, Integer.valueOf(i13))), false);
                    }
                }
            }
        }
    }

    public final void d(boolean z4) {
        boolean isSharingLocation;
        String formatPluralString;
        String string;
        TextView nextTextView;
        org.telegram.ui.ActionBar.p2 p2Var = this.h;
        View fragmentView = p2Var.getFragmentView();
        if (!z4 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z4 = true;
        }
        boolean z10 = p2Var instanceof org.telegram.ui.qy;
        if (z10) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(p2Var.getCurrentAccount()).isSharingLocation(this.f23012n.a());
        }
        m2.b bVar = this.f23015p0;
        if (!isSharingLocation) {
            this.f23014o0 = -1;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            if (this.P) {
                this.P = false;
                if (z4) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f23004f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f23004f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23004f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f23004f.setDuration(200L);
                this.f23004f.addListener(new p10(this, 0));
                this.f23004f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f22998b.setImageDrawable(new mq0(getContext(), 1));
        if (z4 && this.O == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.P) {
            if (!z4) {
                AnimatorSet animatorSet3 = this.f23004f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f23004f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f23004f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f23004f.setDuration(200L);
                this.f23004f.addListener(new p10(this, 1));
                this.f23004f.start();
            }
            this.P = true;
            setVisibility(0);
        }
        if (z10) {
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
                s10 s10Var = this.d;
                if (i11 == 0) {
                    nextTextView = s10Var.getTextView();
                } else {
                    nextTextView = s10Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20166t7, this.m0)), indexOf, string2.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        bVar.run();
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
            rg rgVar = this.f23012n;
            if (i10 == i13) {
                if (rgVar != null) {
                    if (rgVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.didEndCall) {
                int i14 = NotificationCenter.didStartedCall;
                if (i10 != i14 && i10 != NotificationCenter.groupCallUpdated && i10 != NotificationCenter.groupCallVisibilityChanged) {
                    if (i10 == NotificationCenter.groupCallTypingsUpdated) {
                        b();
                        if (this.P && this.Q == 4) {
                            ChatObject.Call groupCall = rgVar.getGroupCall();
                            if (groupCall != null && this.e != null) {
                                if (groupCall.isScheduled()) {
                                    this.e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    int i15 = groupCall2.participants_count;
                                    if (i15 == 0) {
                                        s10 s10Var = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            i12 = R.string.ViewersWatchingNobody;
                                        } else {
                                            i12 = R.string.MembersTalkingNobody;
                                        }
                                        s10Var.b(LocaleController.getString(i12), false);
                                    } else {
                                        s10 s10Var2 = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        s10Var2.b(LocaleController.formatPluralString(str, i15, new Object[0]), false);
                                    }
                                }
                            }
                            n(true);
                            return;
                        }
                        return;
                    } else if (i10 == NotificationCenter.historyImportProgressChanged) {
                        int i16 = this.Q;
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
                        zc zcVar = this.f22996a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.A0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.A0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.j6.D0().a(Math.max(this.f23030z0, this.A0));
                                zcVar.d(Math.max(this.f23030z0, this.A0));
                                return;
                            }
                            return;
                        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
                            b();
                            this.f23030z0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.A0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.j6.D0().a(Math.max(this.f23030z0, this.A0));
                                zcVar.d(Math.max(this.f23030z0, this.A0));
                            }
                            this.U.invalidate();
                            return;
                        } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged && this.Q == 0) {
                            invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a(false);
                if (this.Q == 3 && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null) {
                    if (i10 == i14) {
                        sharedInstance.registerStateListener(this);
                    }
                    int callState = sharedInstance.getCallState();
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f23026x != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f23026x.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                    }
                }
            } else {
                int i18 = this.Q;
                if (i18 == 1 || i18 == 3 || i18 == 4) {
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

    public final void e(boolean z4) {
        View fragmentView = this.h.getFragmentView();
        if (!z4 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z4 = true;
        }
        nh.e1 e1Var = nh.e1.T;
        AnimationNotificationsLocker animationNotificationsLocker = this.f23016q0;
        int i10 = 0;
        if (e1Var != null) {
            b();
            int i11 = this.Q;
            if (6 != i11 && this.f23004f != null && !z4) {
                this.f23021t0 = true;
                return;
            } else if (6 != i11 && this.P && !z4) {
                AnimatorSet animatorSet = this.f23004f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f23004f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23004f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f23004f.setDuration(220L);
                this.f23004f.setInterpolator(mr.f27122f);
                this.f23004f.addListener(new p10(this, 7));
                this.f23004f.start();
                return;
            } else {
                r(6);
                if (!this.P) {
                    if (!z4) {
                        AnimatorSet animatorSet3 = this.f23004f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f23004f = null;
                        }
                        this.f23004f = new AnimatorSet();
                        this.f23018r0.lock();
                        this.f23004f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f23004f.setDuration(220L);
                        this.f23004f.setInterpolator(mr.f27122f);
                        this.f23004f.addListener(new p10(this, 8));
                        this.f23004f.start();
                    } else {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        m();
                    }
                    this.P = true;
                    setVisibility(0);
                } else {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    setVisibility(0);
                }
            }
        } else {
            boolean z10 = this.P;
            if (z10 && ((z4 && this.Q == -1) || this.Q == 6)) {
                this.P = false;
                if (z4) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f23004f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f23004f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f23004f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f23004f.setDuration(220L);
                    this.f23004f.setInterpolator(mr.f27122f);
                    this.f23004f.addListener(new p10(this, 6));
                    this.f23004f.start();
                }
            } else if (z10 && this.Q == -1) {
                this.P = false;
                setVisibility(8);
            }
        }
        nh.e1 e1Var2 = nh.e1.T;
        if (e1Var2 != null && this.Q == 6) {
            s10 s10Var = this.d;
            TLRPC.GroupCall groupCall = e1Var2.v;
            if (groupCall != null) {
                i10 = groupCall.participants_count;
            }
            s10Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, i10)));
        }
    }

    public final void f() {
        int i10;
        String format;
        TextView nextTextView;
        rg rgVar = this.f23012n;
        if (rgVar != null && this.d != null) {
            b();
            long a2 = rgVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
            if (!this.f23013n0) {
                LocationController.getInstance(currentAccount).loadLiveLocations(a2);
                this.f23013n0 = true;
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
            if (this.f23014o0 != i10) {
                this.f23014o0 = i10;
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
                if (!format.equals(this.R)) {
                    this.R = format;
                    int indexOf = format.indexOf(string);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i13 = 0; i13 < 2; i13++) {
                        s10 s10Var = this.d;
                        if (i13 == 0) {
                            nextTextView = s10Var.getTextView();
                        } else {
                            nextTextView = s10Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20166t7, this.m0)), indexOf, string.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z4) {
        boolean z10;
        rg rgVar;
        SpannableStringBuilder spannableStringBuilder;
        TextView nextTextView;
        TextView nextTextView2;
        boolean z11 = true;
        if (this.P) {
            int i10 = this.Q;
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
        if (!z4 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z4 = true;
        }
        boolean z12 = this.P;
        AnimationNotificationsLocker animationNotificationsLocker = this.f23016q0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i11 = this.Q;
            if (i11 != 0 && this.f23004f != null && !z4) {
                this.f23022u0 = true;
                return;
            }
            r(0);
            if (z4 && this.O == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                w10 w10Var = this.f23011l0;
                if (w10Var != null) {
                    ((vq0) w10Var).a(true);
                    ((vq0) this.f23011l0).a(false);
                }
            }
            if (!this.P) {
                if (!z4) {
                    AnimatorSet animatorSet = this.f23004f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f23004f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f23004f = new AnimatorSet();
                    w10 w10Var2 = this.f23011l0;
                    if (w10Var2 != null) {
                        ((vq0) w10Var2).a(true);
                    }
                    this.f23004f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f23004f.setDuration(200L);
                    this.f23004f.addListener(new p10(this, 3));
                    this.f23004f.start();
                }
                this.P = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f23000c.a(false, !z4);
                this.f22998b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f23000c.a(true, !z4);
                this.f22998b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
            }
            if (this.N == playingMessageObject && i11 == 0) {
                return;
            }
            this.N = playingMessageObject;
            if (!playingMessageObject.isVoice() && !this.N.isRoundVideo()) {
                this.S = true;
                if (this.C != null) {
                    if (playingMessageObject.getDuration() >= 600.0d) {
                        this.C.setAlpha(1.0f);
                        this.C.setEnabled(true);
                        this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.J, 0);
                        q(false);
                    } else {
                        this.C.setAlpha(0.0f);
                        this.C.setEnabled(false);
                        this.d.setPadding(0, 0, this.J, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.J, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(android.support.v4.media.a.z(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
                for (int i12 = 0; i12 < 2; i12++) {
                    s10 s10Var = this.d;
                    if (i12 == 0) {
                        nextTextView2 = s10Var.getTextView();
                    } else {
                        nextTextView2 = s10Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.S = false;
                org.telegram.ui.ActionBar.w0 w0Var = this.C;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                    this.C.setEnabled(true);
                }
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.J, 0);
                spannableStringBuilder = new SpannableStringBuilder(android.support.v4.media.a.z(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
                for (int i13 = 0; i13 < 2; i13++) {
                    s10 s10Var2 = this.d;
                    if (i13 == 0) {
                        nextTextView = s10Var2.getTextView();
                    } else {
                        nextTextView = s10Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20166t7, this.m0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z4 && z12 && this.S) ? false : false);
            return;
        }
        this.N = null;
        if (this.T && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !b30.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!j() && !z10 && (rgVar = this.f23012n) != null && !b30.c()) {
            ChatObject.Call groupCall = rgVar.getGroupCall();
            if (groupCall != null && groupCall.shouldShowPanel()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            a(false);
        } else if (this.P) {
            org.telegram.ui.ActionBar.w0 w0Var2 = this.C;
            if (w0Var2 != null && w0Var2.t()) {
                this.C.M(null, null);
            }
            this.P = false;
            if (z4) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = this.f23004f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f23004f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f23004f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f23004f.setDuration(200L);
            w10 w10Var3 = this.f23011l0;
            if (w10Var3 != null) {
                ((vq0) w10Var3).a(true);
            }
            this.f23004f.addListener(new p10(this, 2));
            this.f23004f.start();
        } else {
            setVisibility(8);
        }
    }

    public zc getCapsuleBlobDrawable() {
        return this.f22996a;
    }

    public int getCurrentStyle() {
        return this.Q;
    }

    public int getStyleHeight() {
        if (this.Q == 4) {
            return 48;
        }
        return 36;
    }

    public float getTopPadding() {
        return this.O;
    }

    public final void h() {
        if (this.C != null) {
            return;
        }
        Context context = getContext();
        int i10 = org.telegram.ui.ActionBar.j6.f19987j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.m0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false, this.m0);
        this.C = w0Var;
        w0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.C.setLongClickEnabled(false);
        this.C.setVisibility(8);
        this.C.setTag(null);
        this.C.setShowSubmenuByMove(false);
        this.C.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.C.setDelegate(new k10(this));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.C;
        df.f fVar = new df.f();
        this.D = fVar;
        w0Var2.setIcon(fVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), f6Var);
        this.E = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        this.E.setDrawShadow(true);
        this.E.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.u0 u10 = this.C.u(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.u0[] u0VarArr = this.F;
        u0VarArr[0] = u10;
        u0VarArr[1] = this.C.u(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        u0VarArr[2] = this.C.u(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        u0VarArr[3] = this.C.u(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        u0VarArr[4] = this.C.u(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        u0VarArr[5] = this.C.u(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.C.setPadding(0, 1, 0, 0);
        }
        this.C.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.C, k7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.C.setOnClickListener(new w2(18, this, fArr));
        this.C.setOnLongClickListener(new n10(this, 0));
        q(false);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = this.Q;
        if ((i10 == 3 || i10 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo != null) {
            org.telegram.ui.ActionBar.p2 p2Var = this.h;
            if (p2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) p2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.cd0 cd0Var = new org.telegram.ui.cd0(2);
                cd0Var.u0(sharingLocationInfo.messageObject);
                cd0Var.C0 = new f3.e(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 4);
                launchActivity.p0(cd0Var);
            }
        }
    }

    public final void l(float f10, float f11, boolean z4) {
        String formatString;
        int i10;
        if (!i(f10, f11)) {
            if (Math.abs(f11 - 1.0f) < 0.05f) {
                if (f10 < f11) {
                    return;
                }
                formatString = LocaleController.getString(R.string.AudioSpeedNormal);
                if (Math.abs(f10 - 2.0f) < 0.05f) {
                    i10 = R.raw.speed_2to1;
                } else if (f11 < f10) {
                    i10 = R.raw.speed_slow;
                } else {
                    i10 = R.raw.speed_fast;
                }
            } else if (z4 && i(f11, 1.5f) && i(f10, 1.0f)) {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, df.f.a(f11));
                i10 = R.raw.speed_1to15;
            } else if (z4 && i(f11, 2.0f) && i(f10, 1.5f)) {
                formatString = LocaleController.getString(R.string.AudioSpeedFast);
                i10 = R.raw.speed_15to2;
            } else {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, df.f.a(f11));
                if (f11 < 1.0f) {
                    i10 = R.raw.speed_slow;
                } else {
                    i10 = R.raw.speed_fast;
                }
            }
            qc.a0(this.h).Q(i10, 36, formatString).j();
        }
    }

    public final void m() {
        org.telegram.ui.Components.voip.h hVar = this.K;
        if (hVar != null && hVar.f29629g >= 1.0f) {
            this.B0 = false;
            AndroidUtilities.runOnUIThread(new o10(this, 0), 150L);
            return;
        }
        this.B0 = true;
    }

    public final void n(boolean z4) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        int e;
        int i11;
        float f10;
        ValueAnimator valueAnimator;
        b();
        if (!z4 && (valueAnimator = this.U.f24231a.f23878f) != null) {
            valueAnimator.cancel();
            this.U.f24231a.f23878f = null;
        }
        c9 c9Var = this.U.f24231a;
        if (c9Var.f23878f == null) {
            int i12 = this.Q;
            int i13 = this.f23009j0;
            rg rgVar = this.f23012n;
            if (i12 == 4) {
                if (rgVar != null) {
                    call = rgVar.getGroupCall();
                    i13 = this.h.getCurrentAccount();
                } else {
                    call = null;
                }
                i10 = i13;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                call = VoIPService.getSharedInstance().groupCall;
                if (rgVar != null) {
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
                        this.U.b(i15, call.sortedParticipants.get(i15), i10);
                    } else {
                        this.U.b(i15, null, i10);
                    }
                }
            } else if (user != null) {
                this.U.b(0, user, i10);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.U.b(i16, null, i10);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.U.b(i17, null, i10);
                }
            }
            this.U.a(z4);
            if (this.Q == 4 && call != null) {
                if (!call.call.rtmp_stream) {
                    i14 = Math.min(3, call.sortedParticipants.size());
                }
                if (i14 == 0) {
                    e = 10;
                } else {
                    e = e2.c.e(i14, 1, 24, 52);
                }
                int i18 = e + 3;
                if (z4) {
                    int i19 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (AndroidUtilities.dp(i18) != i19) {
                        float translationX = (this.d.getTranslationX() + i19) - AndroidUtilities.dp(f10);
                        this.d.setTranslationX(translationX);
                        this.e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        mr mrVar = mr.f27122f;
                        duration.setInterpolator(mrVar);
                        this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(mrVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
                }
                s10 s10Var = this.d;
                float f11 = i18;
                int i20 = 36;
                if (call.isScheduled()) {
                    i11 = 90;
                } else {
                    i11 = 36;
                }
                s10Var.setLayoutParams(k7.b6.d(-1, 20.0f, 51, f11, 5.0f, i11, 0.0f));
                s10 s10Var2 = this.e;
                if (call.isScheduled()) {
                    i20 = 90;
                }
                s10Var2.setLayoutParams(k7.b6.d(-1, 20.0f, 51, f11, 25.0f, i20, 0.0f));
                return;
            }
            return;
        }
        c9Var.f23879g = true;
    }

    public final void o() {
        ChatObject.Call call;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.Q;
            if (i10 == 1 || i10 == 3) {
                int callState = sharedInstance.getCallState();
                if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                    this.d.b(LocaleController.getString(R.string.VoipGroupConnecting), false);
                } else if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
                    if (call.sortedParticipants.size() <= 1) {
                        this.d.b(LocaleController.getString(R.string.ConferenceChat), false);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i11 = 0; i11 < Math.min(3, sharedInstance.groupCall.sortedParticipants.size()); i11++) {
                        if (i11 > 0) {
                            sb.append(", ");
                        }
                        sb.append(DialogObject.getShortName(sharedInstance.getAccount(), DialogObject.getPeerDialogId(sharedInstance.groupCall.sortedParticipants.get(i11).peer)));
                    }
                    if (sharedInstance.groupCall.sortedParticipants.size() > 3) {
                        sb.append(" ");
                        sb.append(LocaleController.formatPluralString("AndOther", sharedInstance.groupCall.sortedParticipants.size() - 3, new Object[0]));
                    }
                    this.d.b(sb.toString(), false);
                } else {
                    TLRPC.Chat chat = sharedInstance.getChat();
                    rg rgVar = this.f23012n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (rgVar != null && rgVar.g() != null && rgVar.g().f19159id == sharedInstance.getChat().f19159id) {
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
                        if (rgVar != null && rgVar.i() != null && rgVar.i().f19306id == user.f19306id) {
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
        boolean z4;
        super.onAttachedToWindow();
        int i10 = 15;
        if (this.f23010k0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i11).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i11).subscribeToCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.groupCallVisibilityChanged);
            if (nh.e1.T != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !b30.c()) {
                a(true);
            } else {
                rg rgVar = this.f23012n;
                if (rgVar != null && this.h.getSendMessagesHelper().getImportingHistory(rgVar.a()) != null && !j()) {
                    c(true);
                } else if (rgVar != null && rgVar.getGroupCall() != null && rgVar.getGroupCall().shouldShowPanel() && !b30.c() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    q(false);
                }
            }
        }
        int i12 = this.Q;
        if (i12 != 3 && i12 != 1) {
            if (i12 == 4 && !this.f23007h0) {
                this.f23007h0 = true;
                this.f23008i0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.j6.D0().f30804l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            zc zcVar = this.f22996a;
            if (!zcVar.f31347u) {
                zcVar.f31347u = true;
                zcVar.f31346t = SystemClock.elapsedRealtime();
                kf.j.d().a(60, zcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.L != z4 && this.f23026x != null) {
                this.L = z4;
                gj0 gj0Var = this.f23028y;
                if (!z4) {
                    i10 = 29;
                }
                gj0Var.N(i10);
                gj0 gj0Var2 = this.f23028y;
                gj0Var2.L(gj0Var2.f25160f - 1, false, true);
                this.f23026x.invalidate();
            }
        }
        if (this.P && this.O == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.f23030z0 = 0.0f;
        this.A0 = 0.0f;
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z4;
        int i10;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z10 = this.L;
        zc zcVar = this.f22996a;
        if (z10 != z4) {
            this.L = z4;
            gj0 gj0Var = this.f23028y;
            if (z4) {
                i10 = 15;
            } else {
                i10 = 29;
            }
            gj0Var.N(i10);
            gj0 gj0Var2 = this.f23028y;
            gj0Var2.L(gj0Var2.f25160f - 1, false, true);
            this.f23026x.invalidate();
            org.telegram.ui.ActionBar.j6.D0().c(this.P);
            zcVar.f(this.P);
        }
        if (this.L) {
            this.A0 = 0.0f;
            org.telegram.ui.ActionBar.j6.D0().a(0.0f);
            zcVar.d(0.0f);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z4) {
        org.telegram.messenger.voip.v0.c(this, z4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f23004f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f23004f = null;
        }
        if (this.f23007h0) {
            AndroidUtilities.cancelRunOnUIThread(this.f23008i0);
            this.f23007h0 = false;
        }
        this.P = false;
        this.f23016q0.unlock();
        this.O = 0.0f;
        if (this.f23010k0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsCacheChanged);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.groupCallVisibilityChanged);
        }
        int i11 = this.Q;
        if (i11 == 3 || i11 == 1) {
            y10 D0 = org.telegram.ui.ActionBar.j6.D0();
            ArrayList arrayList = D0.f30804l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.f30797b;
                D0.f30797b = null;
                D0.f30798c = null;
            }
            zc zcVar = this.f22996a;
            if (zcVar.f31347u) {
                zcVar.f31347u = false;
                kf.j.d().f(zcVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.C0 = false;
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
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f23019s != null) {
            int i10 = this.Q;
            if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
                this.I0++;
                if (!groupCallMessage.isOut()) {
                    this.H0.i(new v10(this.f23019s, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i10 = this.I0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.I0 = i11;
            if (i11 == 0) {
                this.H0.i(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z4) {
        org.telegram.messenger.voip.v0.e(this, z4);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        o();
    }

    @Override
    public final void onVideoAvailableChange(boolean z4) {
        org.telegram.messenger.voip.v0.h(this, z4);
    }

    public final void p() {
        int i10;
        TextView nextTextView;
        f51[] f51VarArr;
        TextView nextTextView2;
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.S), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.j6.Qh;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20239x7;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.m0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        df.f fVar = this.D;
        if (fVar != null) {
            ((j6) fVar.f4347b).r(v02);
            Paint paint = (Paint) fVar.f4348c;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.C;
        if (w0Var != null) {
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.f22998b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20220w7, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.B;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20239x7, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                s10 s10Var = this.e;
                if (i11 == 0) {
                    nextTextView2 = s10Var.getTextView();
                } else {
                    nextTextView2 = s10Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20239x7, f6Var));
                }
            }
        }
        s10 s10Var2 = this.d;
        if (s10Var2 != null) {
            Object tag = s10Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i12 = 0; i12 < 2; i12++) {
                    s10 s10Var3 = this.d;
                    if (i12 == 0) {
                        nextTextView = s10Var3.getTextView();
                    } else {
                        nextTextView = s10Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.j6.v0(intValue, f6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (f51VarArr = (f51[]) ((Spanned) text).getSpans(0, text.length(), f51.class)) != null) {
                            for (f51 f51Var : f51VarArr) {
                                f51Var.f24805b = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20166t7, f6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void q(boolean z4) {
        if (this.D == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.S);
        this.D.l(playbackSpeed, z4);
        p();
        boolean z10 = this.f23025w0;
        int i10 = 0;
        this.f23025w0 = false;
        while (true) {
            org.telegram.ui.ActionBar.u0[] u0VarArr = this.F;
            if (i10 < u0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.m0;
                if (!z10 && Math.abs(playbackSpeed - J0[i10]) < 0.05f) {
                    org.telegram.ui.ActionBar.u0 u0Var = u0VarArr[i10];
                    int i11 = org.telegram.ui.ActionBar.j6.Qh;
                    u0Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                } else {
                    org.telegram.ui.ActionBar.u0 u0Var2 = u0VarArr[i10];
                    int i12 = org.telegram.ui.ActionBar.j6.E8;
                    u0Var2.a(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                }
                i10++;
            } else {
                this.E.d(playbackSpeed, z4);
                return;
            }
        }
    }

    public final void r(int i10) {
        boolean z4;
        TextView nextTextView;
        int i11;
        int i12;
        boolean z10;
        int i13;
        TextView nextTextView2;
        int i14;
        TextView nextTextView3;
        TextView nextTextView4;
        TextView nextTextView5;
        if (this.Q != i10) {
            b();
            int i15 = this.Q;
            zc zcVar = this.f22996a;
            boolean z11 = true;
            if (i15 == 3 || i15 == 1) {
                y10 D0 = org.telegram.ui.ActionBar.j6.D0();
                ArrayList arrayList = D0.f30804l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    D0.d = D0.f30797b;
                    D0.f30797b = null;
                    D0.f30798c = null;
                }
                if (zcVar.f31347u) {
                    zcVar.f31347u = false;
                    kf.j.d().f(zcVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                xd.j jVar = this.H0;
                if (jVar != null) {
                    jVar.i(null, true);
                }
            }
            this.Q = i10;
            r10 r10Var = this.f23017r;
            if (i10 != 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            r10Var.setWillNotDraw(z4);
            if (i10 != 4) {
                this.f23002d0 = false;
            }
            d9 d9Var = this.U;
            if (d9Var != null) {
                d9Var.setStyle(this.Q);
                this.U.setLayoutParams(k7.b6.e(108, getStyleHeight(), 51));
            }
            this.f23017r.setLayoutParams(k7.b6.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f10 = this.O;
            if (f10 > 0.0f && f10 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.m0;
            if (i10 == 6) {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f23017r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nk, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ok, f6Var)}));
                this.f23017r.setTag(null);
                this.e.setVisibility(8);
                this.I.setVisibility(8);
                this.B.setVisibility(8);
                this.f22998b.setVisibility(8);
                this.f23026x.setVisibility(8);
                this.f23024w.setVisibility(8);
                this.f23024w.i();
                this.U.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.A7));
                for (int i16 = 0; i16 < 2; i16++) {
                    s10 s10Var = this.d;
                    if (i16 == 0) {
                        nextTextView5 = s10Var.getTextView();
                    } else {
                        nextTextView5 = s10Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        nextTextView5.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var));
                        nextTextView5.setTypeface(AndroidUtilities.bold());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(k7.b6.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i10 == 5) {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f23017r.setBackgroundColor(0);
                this.f23017r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20201v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    s10 s10Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = s10Var2.getTextView();
                    } else {
                        nextTextView4 = s10Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        nextTextView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20183u7, f6Var));
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20183u7));
                this.e.setVisibility(8);
                this.I.setVisibility(8);
                this.B.setVisibility(8);
                this.f22998b.setVisibility(8);
                this.f23026x.setVisibility(8);
                this.U.setVisibility(8);
                this.f23024w.setVisibility(0);
                this.f23024w.d();
                this.B.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.w0 w0Var = this.C;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    this.C.setTag(null);
                }
                this.d.setLayoutParams(k7.b6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    this.f23017r.setBackgroundColor(0);
                    this.f23017r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20201v7));
                    this.f23026x.setVisibility(8);
                    this.e.setVisibility(0);
                    for (int i18 = 0; i18 < 2; i18++) {
                        s10 s10Var3 = this.d;
                        if (i18 == 0) {
                            nextTextView3 = s10Var3.getTextView();
                        } else {
                            nextTextView3 = s10Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            nextTextView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20166t7, f6Var));
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20166t7));
                    this.d.setPadding(0, 0, this.J, 0);
                    this.f23024w.setVisibility(8);
                    this.f23024w.i();
                    rg rgVar = this.f23012n;
                    z11 = (rgVar == null || rgVar.getGroupCall() == null || rgVar.getGroupCall().call == null || !rgVar.getGroupCall().call.rtmp_stream) ? false : false;
                    d9 d9Var2 = this.U;
                    if (!z11) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    d9Var2.setVisibility(i14);
                    if (this.U.getVisibility() != 8) {
                        n(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.B.setVisibility(8);
                    this.f22998b.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.C;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                        this.C.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.v.setBackground(null);
                    o();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    d9 d9Var3 = this.U;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    d9Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.U.getVisibility() != 8) {
                        n(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    u10 u10Var = this.f23026x;
                    if (!hasRtmpStream) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    u10Var.setVisibility(i12);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.L = z10;
                    gj0 gj0Var = this.f23028y;
                    if (z10) {
                        i13 = 15;
                    } else {
                        i13 = 29;
                    }
                    gj0Var.N(i13);
                    gj0 gj0Var2 = this.f23028y;
                    gj0Var2.L(gj0Var2.f25160f - 1, false, true);
                    this.f23026x.invalidate();
                    this.f23017r.setBackground(null);
                    this.f23017r.setBackgroundColor(0);
                    this.f23024w.setVisibility(8);
                    this.f23024w.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.j6.D0().f30804l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!zcVar.f31347u) {
                        zcVar.f31347u = true;
                        zcVar.f31346t = SystemClock.elapsedRealtime();
                        kf.j.d().a(60, zcVar.F);
                    }
                    invalidate();
                    for (int i19 = 0; i19 < 2; i19++) {
                        s10 s10Var4 = this.d;
                        if (i19 == 0) {
                            nextTextView2 = s10Var4.getTextView();
                        } else {
                            nextTextView2 = s10Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            nextTextView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var));
                            nextTextView2.setTypeface(AndroidUtilities.bold());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.A7));
                    this.B.setVisibility(8);
                    this.f22998b.setVisibility(8);
                    this.e.setVisibility(8);
                    this.I.setVisibility(8);
                    this.d.setLayoutParams(k7.b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.J, 0);
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.C;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        this.C.setTag(null);
                    }
                }
            } else {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f23017r.setBackgroundColor(0);
                this.f23017r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20201v7));
                this.e.setVisibility(8);
                this.I.setVisibility(8);
                this.B.setVisibility(0);
                this.f22998b.setVisibility(0);
                this.f23026x.setVisibility(8);
                this.f23024w.setVisibility(8);
                this.f23024w.i();
                this.U.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    s10 s10Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = s10Var5.getTextView();
                    } else {
                        nextTextView = s10Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20183u7, f6Var));
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20183u7));
                if (i10 == 6) {
                    this.f22998b.setLayoutParams(k7.b6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(k7.b6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.B.setVisibility(8);
                } else if (i10 == 0) {
                    this.f22998b.setLayoutParams(k7.b6.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(k7.b6.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.C;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(0);
                        this.C.setTag(1);
                    }
                    this.B.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f22998b.setLayoutParams(k7.b6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(k7.b6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.B.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(w10 w10Var) {
        this.f23011l0 = w10Var;
    }

    public void setDrawOverlay(boolean z4) {
        this.E0 = z4;
    }

    public void setLeftMargin(float f10) {
        if (this.f23017r == null) {
            this.G0 = f10;
            return;
        }
        ImageView imageView = this.f22998b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        jj0 jj0Var = this.f23024w;
        if (jj0Var != null) {
            jj0Var.setTranslationX(f10);
        }
        s10 s10Var = this.d;
        if (s10Var != null) {
            s10Var.setTranslationX(f10);
        }
        s10 s10Var2 = this.e;
        if (s10Var2 != null) {
            s10Var2.setTranslationX(f10);
        }
        d9 d9Var = this.U;
        if (d9Var != null) {
            d9Var.setTranslationX(f10);
        }
    }

    public void setSupportsCalls(boolean z4) {
        this.T = z4;
    }

    public void setTopPadding(float f10) {
        this.O = f10;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.O);
        if (i10 == 8) {
            this.C0 = false;
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.p2 p2Var, View view, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22996a = new zc();
        this.F = new org.telegram.ui.ActionBar.u0[6];
        this.M = -1;
        this.Q = -1;
        this.T = true;
        this.f23005f0 = new j6(false, true, true, false);
        this.f23008i0 = new q10(this);
        this.f23009j0 = UserConfig.selectedAccount;
        this.f23014o0 = -1;
        this.f23015p0 = new m2.b(this, 22);
        this.f23016q0 = new AnimationNotificationsLocker();
        this.f23018r0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.D0 = new Paint(1);
        this.F0 = 0;
        this.H0 = new xd.j(new k10(this), mr.h, 450L);
        this.I0 = 0;
        this.m0 = f6Var;
        this.h = p2Var;
        if (p2Var instanceof rg) {
            this.f23012n = (rg) p2Var;
        }
        this.P = true;
        this.f23010k0 = z4;
        if (view == null) {
            ((ViewGroup) p2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
