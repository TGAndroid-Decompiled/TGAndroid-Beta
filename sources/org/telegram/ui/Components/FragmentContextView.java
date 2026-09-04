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
    public static final float[] M0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public org.telegram.ui.ij A0;
    public long B0;
    public float C0;
    public float D0;
    public ImageView E;
    public boolean E0;
    public org.telegram.ui.ActionBar.v0 F;
    public boolean F0;
    public fd G;
    public final Paint G0;
    public org.telegram.ui.ActionBar.b1 H;
    public boolean H0;
    public final org.telegram.ui.ActionBar.t0[] I;
    public int I0;
    public FrameLayout J;
    public float J0;
    public ImageView K;
    public final le.l K0;
    public org.telegram.ui.sk L;
    public int L0;
    public int M;
    public org.telegram.ui.Components.voip.h N;
    public boolean O;
    public int P;
    public MessageObject Q;
    public float R;
    public boolean S;
    public int T;
    public String U;
    public boolean V;
    public boolean W;
    public final jd f23972a;
    public l9 f23973a0;
    public ImageView f23974b;
    public Paint f23975b0;
    public fg0 f23976c;
    public LinearGradient f23977c0;
    public r10 d;
    public Matrix f23978d0;
    public r10 f23979e;
    public int f23980e0;
    public AnimatorSet f23981f;
    public TextPaint f23982f0;
    public boolean f23983g0;
    public final org.telegram.ui.ActionBar.n2 h;
    public boolean f23984h0;
    public final p6 f23985i0;
    public zc f23986j0;
    public boolean f23987k0;
    public final p10 f23988l0;
    public final int m0;
    public final ch f23989n;
    public final boolean f23990n0;
    public v10 f23991o0;
    public final org.telegram.ui.ActionBar.f6 f23992p0;
    public boolean f23993q0;
    public q10 f23994r;
    public int f23995r0;
    public bi.g5 f23996s;
    public final org.telegram.ui.Cells.l7 f23997s0;
    public final AnimationNotificationsLocker f23998t0;
    public final AnimationNotificationsLocker f23999u0;
    public View v;
    public boolean f24000v0;
    public aj0 f24001w;
    public boolean f24002w0;
    public t10 f24003x;
    public boolean f24004x0;
    public xi0 f24005y;
    public boolean f24006y0;
    public boolean f24007z0;

    public FragmentContextView(Context context, org.telegram.ui.uy uyVar, boolean z10) {
        this(context, uyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.T;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23992p0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20955t7, f6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20973u7, f6Var);
        }
        return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var);
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
        if (this.f23994r != null) {
            return;
        }
        Context context = getContext();
        q10 q10Var = new q10(this, context);
        this.f23994r = q10Var;
        this.f23986j0 = new zc(q10Var);
        int i10 = AndroidUtilities.displaySize.x;
        p6 p6Var = this.f23985i0;
        p6Var.G = i10;
        p6Var.v = 0.4f;
        p6Var.setCallback(q10Var);
        p6Var.r(-1);
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.u(AndroidUtilities.bold());
        addView(this.f23994r, w7.x5.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.f23994r.addView(view, w7.x5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f23974b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f23974b;
        int i11 = org.telegram.ui.ActionBar.j6.f21009w7;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23992p0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.f23974b;
        fg0 fg0Var = new fg0(16);
        this.f23976c = fg0Var;
        imageView3.setImageDrawable(fg0Var);
        this.f23974b.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i11, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f23974b, w7.x5.e(36, 36, 51));
        this.f23974b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f27643b;

            {
                this.f27643b = this;
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
                FragmentContextView fragmentContextView = this.f27643b;
                switch (i14) {
                    case 0:
                        ch chVar = fragmentContextView.f23989n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f23992p0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.uy) {
                                b2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = chVar.g();
                                TLRPC.User i15 = chVar.i();
                                if (g10 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new j10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20898q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ch chVar2 = fragmentContextView.f23989n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f23992p0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            bi.t1 t1Var = bi.t1.W;
                            if (t1Var != null) {
                                long j10 = t1Var.f3716b;
                                int i17 = t1Var.f3718e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(t1Var.f3717c, j10)) != null) {
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
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new k8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (chVar2 != null) {
                                    j11 = chVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f23989n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                n2Var2.presentFragment(new org.telegram.ui.co(bundle), n2Var2 instanceof org.telegram.ui.co);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (chVar2 != null) {
                                j3 = chVar2.a();
                                i12 = n2Var2.getCurrentAccount();
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
                                n2Var2.showDialog(new bv0(fragmentContextView.getContext(), new j10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.j60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = chVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.co coVar = (org.telegram.ui.co) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(coVar.a()) != null) {
                                w40 w40Var = new w40(fragmentContextView.getContext(), null, coVar, f6Var3);
                                w40Var.setOnHideListener(new c1(fragmentContextView, 6));
                                n2Var2.showDialog(w40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.T == 0) {
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
                        float[] fArr = FragmentContextView.M0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.M0;
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
                            fragmentContextView.O = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            xi0 xi0Var = fragmentContextView.f24005y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (xi0Var.N(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f24005y.K(0);
                                } else {
                                    fragmentContextView.f24005y.K(14);
                                }
                            }
                            fragmentContextView.f24003x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f23972a.f(true);
                            try {
                                fragmentContextView.f24003x.performHapticFeedback(3, 2);
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
        this.f24001w = imageView4;
        imageView4.setScaleType(scaleType);
        this.f24001w.setAutoRepeat(true);
        this.f24001w.f(R.raw.import_progress, 30, 30, null);
        this.f24001w.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        addView(this.f24001w, w7.x5.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        r10 r10Var = new r10(this, context, context, 0);
        this.d = r10Var;
        addView(r10Var, w7.x5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        r10 r10Var2 = new r10(this, context, context, 1);
        this.f23979e = r10Var2;
        addView(r10Var2, w7.x5.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.N = hVar;
        hVar.f31504g = 1.0f;
        hVar.f31506j = false;
        org.telegram.ui.sk skVar = new org.telegram.ui.sk(this, context, 1);
        this.L = skVar;
        skVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.L.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        org.telegram.ui.sk skVar2 = this.L;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
        skVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.L.setTextSize(1, 14.0f);
        this.L.setTypeface(AndroidUtilities.bold());
        this.L.setGravity(17);
        this.L.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.L, w7.x5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f27643b;

            {
                this.f27643b = this;
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
                FragmentContextView fragmentContextView = this.f27643b;
                switch (i14) {
                    case 0:
                        ch chVar = fragmentContextView.f23989n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f23992p0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.uy) {
                                b2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = chVar.g();
                                TLRPC.User i15 = chVar.i();
                                if (g10 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new j10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20898q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ch chVar2 = fragmentContextView.f23989n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f23992p0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            bi.t1 t1Var = bi.t1.W;
                            if (t1Var != null) {
                                long j10 = t1Var.f3716b;
                                int i17 = t1Var.f3718e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(t1Var.f3717c, j10)) != null) {
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
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new k8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (chVar2 != null) {
                                    j11 = chVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f23989n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                n2Var2.presentFragment(new org.telegram.ui.co(bundle), n2Var2 instanceof org.telegram.ui.co);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (chVar2 != null) {
                                j3 = chVar2.a();
                                i12 = n2Var2.getCurrentAccount();
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
                                n2Var2.showDialog(new bv0(fragmentContextView.getContext(), new j10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.j60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = chVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.co coVar = (org.telegram.ui.co) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(coVar.a()) != null) {
                                w40 w40Var = new w40(fragmentContextView.getContext(), null, coVar, f6Var3);
                                w40Var.setOnHideListener(new c1(fragmentContextView, 6));
                                n2Var2.showDialog(w40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.T == 0) {
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
                        float[] fArr = FragmentContextView.M0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.M0;
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
                            fragmentContextView.O = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            xi0 xi0Var = fragmentContextView.f24005y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (xi0Var.N(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f24005y.K(0);
                                } else {
                                    fragmentContextView.f24005y.K(14);
                                }
                            }
                            fragmentContextView.f24003x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f23972a.f(true);
                            try {
                                fragmentContextView.f24003x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        if (this.E0) {
            m();
        }
        this.J = new FrameLayout(context);
        ImageView imageView5 = new ImageView(context);
        this.K = imageView5;
        imageView5.setImageResource(R.drawable.msg_mute);
        ImageView imageView6 = this.K;
        int i12 = org.telegram.ui.ActionBar.j6.f21026x7;
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
        this.J.addView(this.K, w7.x5.e(20, 20, 17));
        this.J.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.J.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.J.setOnClickListener(new ah.f(12));
        this.J.setVisibility(8);
        addView(this.J, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f23990n0) {
            h();
        }
        l9 l9Var = new l9(context, false);
        this.f23973a0 = l9Var;
        l9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.f23973a0.setDelegate(new n10(this, 1));
        this.f23973a0.setVisibility(8);
        addView(this.f23973a0, w7.x5.e(108, 36, 51));
        this.f24005y = new xi0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        t10 t10Var = new t10(this, context);
        this.f24003x = t10Var;
        t10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var), PorterDuff.Mode.SRC_IN));
        this.f24003x.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f24003x.setAnimation(this.f24005y);
        this.f24003x.setScaleType(scaleType);
        this.f24003x.setVisibility(8);
        addView(this.f24003x, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.f24003x.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f27643b;

            {
                this.f27643b = this;
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
                FragmentContextView fragmentContextView = this.f27643b;
                switch (i14) {
                    case 0:
                        ch chVar = fragmentContextView.f23989n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f23992p0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.uy) {
                                b2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = chVar.g();
                                TLRPC.User i15 = chVar.i();
                                if (g10 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new j10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20898q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ch chVar2 = fragmentContextView.f23989n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f23992p0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            bi.t1 t1Var = bi.t1.W;
                            if (t1Var != null) {
                                long j10 = t1Var.f3716b;
                                int i17 = t1Var.f3718e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(t1Var.f3717c, j10)) != null) {
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
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new k8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (chVar2 != null) {
                                    j11 = chVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f23989n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                n2Var2.presentFragment(new org.telegram.ui.co(bundle), n2Var2 instanceof org.telegram.ui.co);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (chVar2 != null) {
                                j3 = chVar2.a();
                                i122 = n2Var2.getCurrentAccount();
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
                                n2Var2.showDialog(new bv0(fragmentContextView.getContext(), new j10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.j60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = chVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.co coVar = (org.telegram.ui.co) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(coVar.a()) != null) {
                                w40 w40Var = new w40(fragmentContextView.getContext(), null, coVar, f6Var3);
                                w40Var.setOnHideListener(new c1(fragmentContextView, 6));
                                n2Var2.showDialog(w40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.T == 0) {
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
                        float[] fArr = FragmentContextView.M0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.M0;
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
                            fragmentContextView.O = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            xi0 xi0Var = fragmentContextView.f24005y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (xi0Var.N(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f24005y.K(0);
                                } else {
                                    fragmentContextView.f24005y.K(14);
                                }
                            }
                            fragmentContextView.f24003x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f23972a.f(true);
                            try {
                                fragmentContextView.f24003x.performHapticFeedback(3, 2);
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
        this.E = imageView7;
        imageView7.setImageResource(R.drawable.miniplayer_close);
        this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
        this.E.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.E.setScaleType(scaleType);
        addView(this.E, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f27643b;

            {
                this.f27643b = this;
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
                FragmentContextView fragmentContextView = this.f27643b;
                switch (i14) {
                    case 0:
                        ch chVar = fragmentContextView.f23989n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f23992p0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.uy) {
                                b2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = chVar.g();
                                TLRPC.User i15 = chVar.i();
                                if (g10 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new j10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20898q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ch chVar2 = fragmentContextView.f23989n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f23992p0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            bi.t1 t1Var = bi.t1.W;
                            if (t1Var != null) {
                                long j10 = t1Var.f3716b;
                                int i17 = t1Var.f3718e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(t1Var.f3717c, j10)) != null) {
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
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new k8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (chVar2 != null) {
                                    j11 = chVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f23989n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                n2Var2.presentFragment(new org.telegram.ui.co(bundle), n2Var2 instanceof org.telegram.ui.co);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (chVar2 != null) {
                                j3 = chVar2.a();
                                i122 = n2Var2.getCurrentAccount();
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
                                n2Var2.showDialog(new bv0(fragmentContextView.getContext(), new j10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.j60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = chVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.co coVar = (org.telegram.ui.co) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(coVar.a()) != null) {
                                w40 w40Var = new w40(fragmentContextView.getContext(), null, coVar, f6Var3);
                                w40Var.setOnHideListener(new c1(fragmentContextView, 6));
                                n2Var2.showDialog(w40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.T == 0) {
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
                        float[] fArr = FragmentContextView.M0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.M0;
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
                            fragmentContextView.O = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            xi0 xi0Var = fragmentContextView.f24005y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (xi0Var.N(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f24005y.K(0);
                                } else {
                                    fragmentContextView.f24005y.K(14);
                                }
                            }
                            fragmentContextView.f24003x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f23972a.f(true);
                            try {
                                fragmentContextView.f24003x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        bi.g5 g5Var = new bi.g5(getContext(), 15);
        this.f23996s = g5Var;
        addView(g5Var, w7.x5.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f27643b;

            {
                this.f27643b = this;
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
                FragmentContextView fragmentContextView = this.f27643b;
                switch (i14) {
                    case 0:
                        ch chVar = fragmentContextView.f23989n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f23992p0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.uy) {
                                b2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = chVar.g();
                                TLRPC.User i15 = chVar.i();
                                if (g10 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    b2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new j10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20898q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ch chVar2 = fragmentContextView.f23989n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f23992p0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            bi.t1 t1Var = bi.t1.W;
                            if (t1Var != null) {
                                long j10 = t1Var.f3716b;
                                int i17 = t1Var.f3718e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(t1Var.f3717c, j10)) != null) {
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
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new k8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new k8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (chVar2 != null) {
                                    j11 = chVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f23989n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                n2Var2.presentFragment(new org.telegram.ui.co(bundle), n2Var2 instanceof org.telegram.ui.co);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (chVar2 != null) {
                                j3 = chVar2.a();
                                i122 = n2Var2.getCurrentAccount();
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
                                n2Var2.showDialog(new bv0(fragmentContextView.getContext(), new j10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.j60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = chVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.d2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.co coVar = (org.telegram.ui.co) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(coVar.a()) != null) {
                                w40 w40Var = new w40(fragmentContextView.getContext(), null, coVar, f6Var3);
                                w40Var.setOnHideListener(new c1(fragmentContextView, 6));
                                n2Var2.showDialog(w40Var);
                                fragmentContextView.c(false);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        if (fragmentContextView.T == 0) {
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
                        float[] fArr = FragmentContextView.M0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.M0;
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
                            fragmentContextView.O = z11;
                            sharedInstance.setMicMute(z11, false, true);
                            xi0 xi0Var = fragmentContextView.f24005y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (xi0Var.N(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f24005y.K(0);
                                } else {
                                    fragmentContextView.f24005y.K(14);
                                }
                            }
                            fragmentContextView.f24003x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f23972a.f(true);
                            try {
                                fragmentContextView.f24003x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        setLeftMargin(this.J0);
    }

    public final void c(boolean z10) {
        int i10;
        ch chVar = this.f23989n;
        if (chVar != null) {
            if (!this.S || ((i10 = this.T) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.n2 n2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = n2Var.getSendMessagesHelper().getImportingHistory(chVar.a());
                View fragmentView = n2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = n2Var.getVisibleDialog();
                if ((j() || chVar.m() || ((visibleDialog instanceof w40) && !((w40) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f23998t0;
                if (importingHistory == null) {
                    if (this.S && ((z10 && this.T == -1) || this.T == 5)) {
                        this.S = false;
                        if (z10) {
                            if (getVisibility() != 8) {
                                setVisibility(8);
                            }
                            setTopPadding(0.0f);
                            return;
                        }
                        AnimatorSet animatorSet = this.f23981f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f23981f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f23981f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f23981f.setDuration(220L);
                        this.f23981f.setInterpolator(pr.f29466f);
                        this.f23981f.addListener(new o10(this, 4));
                        this.f23981f.start();
                        return;
                    }
                    int i11 = this.T;
                    if (i11 == -1 || i11 == 5) {
                        this.S = false;
                        setVisibility(8);
                    }
                } else if (this.T != 5 && this.f23981f != null && !z10) {
                    this.f24006y0 = true;
                } else {
                    r(5);
                    if (z10 && this.R == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        v10 v10Var = this.f23991o0;
                        if (v10Var != null) {
                            ((rq0) v10Var).a(true);
                            ((rq0) this.f23991o0).a(false);
                        }
                    }
                    if (!this.S) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f23981f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f23981f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f23981f = new AnimatorSet();
                            v10 v10Var2 = this.f23991o0;
                            if (v10Var2 != null) {
                                ((rq0) v10Var2).a(true);
                            }
                            this.f23981f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f23981f.setDuration(200L);
                            this.f23981f.addListener(new o10(this, 5));
                            this.f23981f.start();
                        }
                        this.S = true;
                        setVisibility(0);
                    }
                    int i12 = this.P;
                    int i13 = importingHistory.uploadProgress;
                    if (i12 != i13) {
                        this.P = i13;
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
        boolean z11 = n2Var instanceof org.telegram.ui.uy;
        if (z11) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(n2Var.getCurrentAccount()).isSharingLocation(this.f23989n.a());
        }
        org.telegram.ui.Cells.l7 l7Var = this.f23997s0;
        if (!isSharingLocation) {
            this.f23995r0 = -1;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            if (this.S) {
                this.S = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f23981f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f23981f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23981f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f23981f.setDuration(200L);
                this.f23981f.addListener(new o10(this, 0));
                this.f23981f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f23974b.setImageDrawable(new iq0(getContext(), 1));
        if (z10 && this.R == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.S) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f23981f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f23981f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f23981f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f23981f.setDuration(200L);
                this.f23981f.addListener(new o10(this, 1));
                this.f23981f.start();
            }
            this.S = true;
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
                r10 r10Var = this.d;
                if (i11 == 0) {
                    nextTextView = r10Var.getTextView();
                } else {
                    nextTextView = r10Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20955t7, this.f23992p0)), indexOf, string2.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        l7Var.run();
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
            ch chVar = this.f23989n;
            if (i10 == i13) {
                if (chVar != null) {
                    if (chVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.didEndCall) {
                int i14 = NotificationCenter.didStartedCall;
                if (i10 != i14 && i10 != NotificationCenter.groupCallUpdated && i10 != NotificationCenter.groupCallVisibilityChanged) {
                    if (i10 == NotificationCenter.groupCallTypingsUpdated) {
                        b();
                        if (this.S && this.T == 4) {
                            ChatObject.Call groupCall = chVar.getGroupCall();
                            if (groupCall != null && this.f23979e != null) {
                                if (groupCall.isScheduled()) {
                                    this.f23979e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    int i15 = groupCall2.participants_count;
                                    if (i15 == 0) {
                                        r10 r10Var = this.f23979e;
                                        if (groupCall2.rtmp_stream) {
                                            i12 = R.string.ViewersWatchingNobody;
                                        } else {
                                            i12 = R.string.MembersTalkingNobody;
                                        }
                                        r10Var.b(LocaleController.getString(i12), false);
                                    } else {
                                        r10 r10Var2 = this.f23979e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        r10Var2.b(LocaleController.formatPluralString(str, i15, new Object[0]), false);
                                    }
                                }
                            }
                            n(true);
                            return;
                        }
                        return;
                    } else if (i10 == NotificationCenter.historyImportProgressChanged) {
                        int i16 = this.T;
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
                        jd jdVar = this.f23972a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.D0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.D0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.j6.D0().a(Math.max(this.C0, this.D0));
                                jdVar.d(Math.max(this.C0, this.D0));
                                return;
                            }
                            return;
                        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
                            b();
                            this.C0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.D0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.j6.D0().a(Math.max(this.C0, this.D0));
                                jdVar.d(Math.max(this.C0, this.D0));
                            }
                            this.f23973a0.invalidate();
                            return;
                        } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged && this.T == 0) {
                            invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a(false);
                if (this.T == 3 && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null) {
                    if (i10 == i14) {
                        sharedInstance.registerStateListener(this);
                    }
                    int callState = sharedInstance.getCallState();
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f24003x != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f24003x.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                    }
                }
            } else {
                int i18 = this.T;
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

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        bi.t1 t1Var = bi.t1.W;
        AnimationNotificationsLocker animationNotificationsLocker = this.f23998t0;
        int i10 = 0;
        if (t1Var != null) {
            b();
            int i11 = this.T;
            if (6 != i11 && this.f23981f != null && !z10) {
                this.f24002w0 = true;
                return;
            } else if (6 != i11 && this.S && !z10) {
                AnimatorSet animatorSet = this.f23981f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f23981f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f23981f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f23981f.setDuration(220L);
                this.f23981f.setInterpolator(pr.f29466f);
                this.f23981f.addListener(new o10(this, 7));
                this.f23981f.start();
                return;
            } else {
                r(6);
                if (!this.S) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f23981f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f23981f = null;
                        }
                        this.f23981f = new AnimatorSet();
                        this.f23999u0.lock();
                        this.f23981f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f23981f.setDuration(220L);
                        this.f23981f.setInterpolator(pr.f29466f);
                        this.f23981f.addListener(new o10(this, 8));
                        this.f23981f.start();
                    } else {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        m();
                    }
                    this.S = true;
                    setVisibility(0);
                } else {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    setVisibility(0);
                }
            }
        } else {
            boolean z11 = this.S;
            if (z11 && ((z10 && this.T == -1) || this.T == 6)) {
                this.S = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                } else {
                    AnimatorSet animatorSet4 = this.f23981f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f23981f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f23981f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f23981f.setDuration(220L);
                    this.f23981f.setInterpolator(pr.f29466f);
                    this.f23981f.addListener(new o10(this, 6));
                    this.f23981f.start();
                }
            } else if (z11 && this.T == -1) {
                this.S = false;
                setVisibility(8);
            }
        }
        bi.t1 t1Var2 = bi.t1.W;
        if (t1Var2 != null && this.T == 6) {
            r10 r10Var = this.d;
            TLRPC.GroupCall groupCall = t1Var2.v;
            if (groupCall != null) {
                i10 = groupCall.participants_count;
            }
            r10Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, i10)));
        }
    }

    public final void f() {
        int i10;
        String format;
        TextView nextTextView;
        ch chVar = this.f23989n;
        if (chVar != null && this.d != null) {
            b();
            long a2 = chVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
            if (!this.f23993q0) {
                LocationController.getInstance(currentAccount).loadLiveLocations(a2);
                this.f23993q0 = true;
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
            if (this.f23995r0 != i10) {
                this.f23995r0 = i10;
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
                if (!format.equals(this.U)) {
                    this.U = format;
                    int indexOf = format.indexOf(string);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i13 = 0; i13 < 2; i13++) {
                        r10 r10Var = this.d;
                        if (i13 == 0) {
                            nextTextView = r10Var.getTextView();
                        } else {
                            nextTextView = r10Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20955t7, this.f23992p0)), indexOf, string.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        ch chVar;
        SpannableStringBuilder spannableStringBuilder;
        TextView nextTextView;
        TextView nextTextView2;
        boolean z12 = true;
        if (this.S) {
            int i10 = this.T;
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
        boolean z13 = this.S;
        AnimationNotificationsLocker animationNotificationsLocker = this.f23998t0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i11 = this.T;
            if (i11 != 0 && this.f23981f != null && !z10) {
                this.f24004x0 = true;
                return;
            }
            r(0);
            if (z10 && this.R == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                v10 v10Var = this.f23991o0;
                if (v10Var != null) {
                    ((rq0) v10Var).a(true);
                    ((rq0) this.f23991o0).a(false);
                }
            }
            if (!this.S) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f23981f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f23981f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f23981f = new AnimatorSet();
                    v10 v10Var2 = this.f23991o0;
                    if (v10Var2 != null) {
                        ((rq0) v10Var2).a(true);
                    }
                    this.f23981f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f23981f.setDuration(200L);
                    this.f23981f.addListener(new o10(this, 3));
                    this.f23981f.start();
                }
                this.S = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f23976c.a(false, !z10);
                this.f23974b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f23976c.a(true, !z10);
                this.f23974b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
            }
            if (this.Q == playingMessageObject && i11 == 0) {
                return;
            }
            this.Q = playingMessageObject;
            if (!playingMessageObject.isVoice() && !this.Q.isRoundVideo()) {
                this.V = true;
                if (this.F != null) {
                    if (playingMessageObject.getDuration() >= 600.0d) {
                        this.F.setAlpha(1.0f);
                        this.F.setEnabled(true);
                        this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.M, 0);
                        q(false);
                    } else {
                        this.F.setAlpha(0.0f);
                        this.F.setEnabled(false);
                        this.d.setPadding(0, 0, this.M, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.M, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(a4.a.C(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
                for (int i12 = 0; i12 < 2; i12++) {
                    r10 r10Var = this.d;
                    if (i12 == 0) {
                        nextTextView2 = r10Var.getTextView();
                    } else {
                        nextTextView2 = r10Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.V = false;
                org.telegram.ui.ActionBar.v0 v0Var = this.F;
                if (v0Var != null) {
                    v0Var.setAlpha(1.0f);
                    this.F.setEnabled(true);
                }
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.M, 0);
                spannableStringBuilder = new SpannableStringBuilder(a4.a.C(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
                for (int i13 = 0; i13 < 2; i13++) {
                    r10 r10Var2 = this.d;
                    if (i13 == 0) {
                        nextTextView = r10Var2.getTextView();
                    } else {
                        nextTextView = r10Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20955t7, this.f23992p0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.V) ? false : false);
            return;
        }
        this.Q = null;
        if (this.W && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !z20.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (chVar = this.f23989n) != null && !z20.c()) {
            ChatObject.Call groupCall = chVar.getGroupCall();
            if (groupCall != null && groupCall.shouldShowPanel()) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            a(false);
        } else if (this.S) {
            org.telegram.ui.ActionBar.v0 v0Var2 = this.F;
            if (v0Var2 != null && v0Var2.t()) {
                this.F.M(null, null);
            }
            this.S = false;
            if (z10) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = this.f23981f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f23981f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f23981f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f23981f.setDuration(200L);
            v10 v10Var3 = this.f23991o0;
            if (v10Var3 != null) {
                ((rq0) v10Var3).a(true);
            }
            this.f23981f.addListener(new o10(this, 2));
            this.f23981f.start();
        } else {
            setVisibility(8);
        }
    }

    public jd getCapsuleBlobDrawable() {
        return this.f23972a;
    }

    public int getCurrentStyle() {
        return this.T;
    }

    public int getStyleHeight() {
        if (this.T == 4) {
            return 48;
        }
        return 36;
    }

    public float getTopPadding() {
        return this.R;
    }

    public final void h() {
        if (this.F != null) {
            return;
        }
        Context context = getContext();
        int i10 = org.telegram.ui.ActionBar.j6.f20770j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23992p0;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false, this.f23992p0);
        this.F = v0Var;
        v0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.F.setLongClickEnabled(false);
        this.F.setVisibility(8);
        this.F.setTag(null);
        this.F.setShowSubmenuByMove(false);
        this.F.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.F.setDelegate(new j10(this));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.F;
        fd fdVar = new fd();
        this.G = fdVar;
        v0Var2.setIcon(fdVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getContext(), f6Var);
        this.H = b1Var;
        b1Var.setRoundRadiusDp(6.0f);
        this.H.setDrawShadow(true);
        this.H.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.t0 u10 = this.F.u(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.t0[] t0VarArr = this.I;
        t0VarArr[0] = u10;
        t0VarArr[1] = this.F.u(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        t0VarArr[2] = this.F.u(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        t0VarArr[3] = this.F.u(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        t0VarArr[4] = this.F.u(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        t0VarArr[5] = this.F.u(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.F.setPadding(0, 1, 0, 0);
        }
        this.F.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.F, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.F.setOnClickListener(new ct(3, this, fArr));
        this.F.setOnLongClickListener(new m10(this, 0));
        q(false);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = this.T;
        if ((i10 == 3 || i10 == 1) && getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void k(LocationController.SharingLocationInfo sharingLocationInfo) {
        if (sharingLocationInfo != null) {
            org.telegram.ui.ActionBar.n2 n2Var = this.h;
            if (n2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) n2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.id0 id0Var = new org.telegram.ui.id0(2);
                id0Var.u0(sharingLocationInfo.messageObject);
                id0Var.F0 = new bi.p1(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.p0(id0Var);
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
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, fd.a(f10));
                i10 = R.raw.speed_1to15;
            } else if (z10 && i(f10, 2.0f) && i(f7, 1.5f)) {
                formatString = LocaleController.getString(R.string.AudioSpeedFast);
                i10 = R.raw.speed_15to2;
            } else {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, fd.a(f10));
                if (f10 < 1.0f) {
                    i10 = R.raw.speed_slow;
                } else {
                    i10 = R.raw.speed_fast;
                }
            }
            yc.a0(this.h).Q(i10, 36, formatString).j();
        }
    }

    public final void m() {
        org.telegram.ui.Components.voip.h hVar = this.N;
        if (hVar != null && hVar.f31504g >= 1.0f) {
            this.E0 = false;
            AndroidUtilities.runOnUIThread(new n10(this, 0), 150L);
            return;
        }
        this.E0 = true;
    }

    public final void n(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        int w10;
        int i11;
        float f7;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.f23973a0.f28120a.f27760f) != null) {
            valueAnimator.cancel();
            this.f23973a0.f28120a.f27760f = null;
        }
        k9 k9Var = this.f23973a0.f28120a;
        if (k9Var.f27760f == null) {
            int i12 = this.T;
            int i13 = this.m0;
            ch chVar = this.f23989n;
            if (i12 == 4) {
                if (chVar != null) {
                    call = chVar.getGroupCall();
                    i13 = this.h.getCurrentAccount();
                } else {
                    call = null;
                }
                i10 = i13;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                call = VoIPService.getSharedInstance().groupCall;
                if (chVar != null) {
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
                        this.f23973a0.b(i15, call.sortedParticipants.get(i15), i10);
                    } else {
                        this.f23973a0.b(i15, null, i10);
                    }
                }
            } else if (user != null) {
                this.f23973a0.b(0, user, i10);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.f23973a0.b(i16, null, i10);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.f23973a0.b(i17, null, i10);
                }
            }
            this.f23973a0.a(z10);
            if (this.T == 4 && call != null) {
                if (!call.call.rtmp_stream) {
                    i14 = Math.min(3, call.sortedParticipants.size());
                }
                if (i14 == 0) {
                    w10 = 10;
                } else {
                    w10 = com.google.android.gms.internal.vision.e2.w(i14, 1, 24, 52);
                }
                int i18 = w10 + 3;
                if (z10) {
                    int i19 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (AndroidUtilities.dp(i18) != i19) {
                        float translationX = (this.d.getTranslationX() + i19) - AndroidUtilities.dp(f7);
                        this.d.setTranslationX(translationX);
                        this.f23979e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        pr prVar = pr.f29466f;
                        duration.setInterpolator(prVar);
                        this.f23979e.animate().translationX(0.0f).setDuration(220L).setInterpolator(prVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.f23979e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.f23979e.setTranslationX(0.0f);
                }
                r10 r10Var = this.d;
                float f10 = i18;
                int i20 = 36;
                if (call.isScheduled()) {
                    i11 = 90;
                } else {
                    i11 = 36;
                }
                r10Var.setLayoutParams(w7.x5.d(-1, 20.0f, 51, f10, 5.0f, i11, 0.0f));
                r10 r10Var2 = this.f23979e;
                if (call.isScheduled()) {
                    i20 = 90;
                }
                r10Var2.setLayoutParams(w7.x5.d(-1, 20.0f, 51, f10, 25.0f, i20, 0.0f));
                return;
            }
            return;
        }
        k9Var.f27761g = true;
    }

    public final void o() {
        ChatObject.Call call;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.T;
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
                    ch chVar = this.f23989n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (chVar != null && chVar.g() != null && chVar.g().f19869id == sharedInstance.getChat().f19869id) {
                            TLRPC.Chat g10 = chVar.g();
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
                        if (chVar != null && chVar.i() != null && chVar.i().f20016id == user.f20016id) {
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
        int i10 = 15;
        if (this.f23990n0) {
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
            if (bi.t1.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !z20.c()) {
                a(true);
            } else {
                ch chVar = this.f23989n;
                if (chVar != null && this.h.getSendMessagesHelper().getImportingHistory(chVar.a()) != null && !j()) {
                    c(true);
                } else if (chVar != null && chVar.getGroupCall() != null && chVar.getGroupCall().shouldShowPanel() && !z20.c() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    q(false);
                }
            }
        }
        int i12 = this.T;
        if (i12 != 3 && i12 != 1) {
            if (i12 == 4 && !this.f23987k0) {
                this.f23987k0 = true;
                this.f23988l0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.j6.D0().f32401l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            jd jdVar = this.f23972a;
            if (!jdVar.f27454u) {
                jdVar.f27454u = true;
                jdVar.f27453t = SystemClock.elapsedRealtime();
                yf.h.d().a(60, jdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.O != z10 && this.f24003x != null) {
                this.O = z10;
                xi0 xi0Var = this.f24005y;
                if (!z10) {
                    i10 = 29;
                }
                xi0Var.N(i10);
                xi0 xi0Var2 = this.f24005y;
                xi0Var2.L(xi0Var2.f32559f - 1, false, true);
                this.f24003x.invalidate();
            }
        }
        if (this.S && this.R == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.C0 = 0.0f;
        this.D0 = 0.0f;
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
        boolean z11 = this.O;
        jd jdVar = this.f23972a;
        if (z11 != z10) {
            this.O = z10;
            xi0 xi0Var = this.f24005y;
            if (z10) {
                i10 = 15;
            } else {
                i10 = 29;
            }
            xi0Var.N(i10);
            xi0 xi0Var2 = this.f24005y;
            xi0Var2.L(xi0Var2.f32559f - 1, false, true);
            this.f24003x.invalidate();
            org.telegram.ui.ActionBar.j6.D0().c(this.S);
            jdVar.f(this.S);
        }
        if (this.O) {
            this.D0 = 0.0f;
            org.telegram.ui.ActionBar.j6.D0().a(0.0f);
            jdVar.d(0.0f);
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
        AnimatorSet animatorSet = this.f23981f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f23981f = null;
        }
        if (this.f23987k0) {
            AndroidUtilities.cancelRunOnUIThread(this.f23988l0);
            this.f23987k0 = false;
        }
        this.S = false;
        this.f23998t0.unlock();
        this.R = 0.0f;
        if (this.f23990n0) {
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
        int i11 = this.T;
        if (i11 == 3 || i11 == 1) {
            x10 D0 = org.telegram.ui.ActionBar.j6.D0();
            ArrayList arrayList = D0.f32401l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.f32393b;
                D0.f32393b = null;
                D0.f32394c = null;
            }
            jd jdVar = this.f23972a;
            if (jdVar.f27454u) {
                jdVar.f27454u = false;
                yf.h.d().f(jdVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.F0 = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, AndroidUtilities.dp2(getStyleHeight()));
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f23996s != null) {
            int i10 = this.T;
            if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
                this.L0++;
                if (!groupCallMessage.isOut()) {
                    this.K0.i(new u10(this.f23996s, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i10 = this.L0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.L0 = i11;
            if (i11 == 0) {
                this.K0.i(null, true);
            }
        }
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        o();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final void p() {
        int i10;
        TextView nextTextView;
        e51[] e51VarArr;
        TextView nextTextView2;
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.V), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.j6.Qh;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f21026x7;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f23992p0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        fd fdVar = this.G;
        if (fdVar != null) {
            ((p6) fdVar.f26016c).r(v02);
            Paint paint = (Paint) fdVar.f26015b;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.F;
        if (v0Var != null) {
            v0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.f23974b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21009w7, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21026x7, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.f23979e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                r10 r10Var = this.f23979e;
                if (i11 == 0) {
                    nextTextView2 = r10Var.getTextView();
                } else {
                    nextTextView2 = r10Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21026x7, f6Var));
                }
            }
        }
        r10 r10Var2 = this.d;
        if (r10Var2 != null) {
            Object tag = r10Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i12 = 0; i12 < 2; i12++) {
                    r10 r10Var3 = this.d;
                    if (i12 == 0) {
                        nextTextView = r10Var3.getTextView();
                    } else {
                        nextTextView = r10Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.j6.v0(intValue, f6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (e51VarArr = (e51[]) ((Spanned) text).getSpans(0, text.length(), e51.class)) != null) {
                            for (e51 e51Var : e51VarArr) {
                                e51Var.f25561b = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20955t7, f6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void q(boolean z10) {
        if (this.G == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.V);
        this.G.l(playbackSpeed, z10);
        p();
        boolean z11 = this.f24007z0;
        int i10 = 0;
        this.f24007z0 = false;
        while (true) {
            org.telegram.ui.ActionBar.t0[] t0VarArr = this.I;
            if (i10 < t0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f23992p0;
                if (!z11 && Math.abs(playbackSpeed - M0[i10]) < 0.05f) {
                    org.telegram.ui.ActionBar.t0 t0Var = t0VarArr[i10];
                    int i11 = org.telegram.ui.ActionBar.j6.Qh;
                    t0Var.a(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                } else {
                    org.telegram.ui.ActionBar.t0 t0Var2 = t0VarArr[i10];
                    int i12 = org.telegram.ui.ActionBar.j6.E8;
                    t0Var2.a(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                }
                i10++;
            } else {
                this.H.d(playbackSpeed, z10);
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
        if (this.T != i10) {
            b();
            int i15 = this.T;
            jd jdVar = this.f23972a;
            boolean z12 = true;
            if (i15 == 3 || i15 == 1) {
                x10 D0 = org.telegram.ui.ActionBar.j6.D0();
                ArrayList arrayList = D0.f32401l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    D0.d = D0.f32393b;
                    D0.f32393b = null;
                    D0.f32394c = null;
                }
                if (jdVar.f27454u) {
                    jdVar.f27454u = false;
                    yf.h.d().f(jdVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                le.l lVar = this.K0;
                if (lVar != null) {
                    lVar.i(null, true);
                }
            }
            this.T = i10;
            q10 q10Var = this.f23994r;
            if (i10 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            q10Var.setWillNotDraw(z10);
            if (i10 != 4) {
                this.f23983g0 = false;
            }
            l9 l9Var = this.f23973a0;
            if (l9Var != null) {
                l9Var.setStyle(this.T);
                this.f23973a0.setLayoutParams(w7.x5.e(108, getStyleHeight(), 51));
            }
            this.f23994r.setLayoutParams(w7.x5.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f7 = this.R;
            if (f7 > 0.0f && f7 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f23992p0;
            if (i10 == 6) {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f23994r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nk, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ok, f6Var)}));
                this.f23994r.setTag(null);
                this.f23979e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(8);
                this.f23974b.setVisibility(8);
                this.f24003x.setVisibility(8);
                this.f24001w.setVisibility(8);
                this.f24001w.i();
                this.f23973a0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.A7));
                for (int i16 = 0; i16 < 2; i16++) {
                    r10 r10Var = this.d;
                    if (i16 == 0) {
                        nextTextView5 = r10Var.getTextView();
                    } else {
                        nextTextView5 = r10Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        nextTextView5.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var));
                        nextTextView5.setTypeface(AndroidUtilities.bold());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(w7.x5.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i10 == 5) {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f23994r.setBackgroundColor(0);
                this.f23994r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20991v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    r10 r10Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = r10Var2.getTextView();
                    } else {
                        nextTextView4 = r10Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        nextTextView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20973u7, f6Var));
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20973u7));
                this.f23979e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(8);
                this.f23974b.setVisibility(8);
                this.f24003x.setVisibility(8);
                this.f23973a0.setVisibility(8);
                this.f24001w.setVisibility(0);
                this.f24001w.d();
                this.E.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.v0 v0Var = this.F;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    this.F.setTag(null);
                }
                this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    this.f23994r.setBackgroundColor(0);
                    this.f23994r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20991v7));
                    this.f24003x.setVisibility(8);
                    this.f23979e.setVisibility(0);
                    for (int i18 = 0; i18 < 2; i18++) {
                        r10 r10Var3 = this.d;
                        if (i18 == 0) {
                            nextTextView3 = r10Var3.getTextView();
                        } else {
                            nextTextView3 = r10Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            nextTextView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20955t7, f6Var));
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20955t7));
                    this.d.setPadding(0, 0, this.M, 0);
                    this.f24001w.setVisibility(8);
                    this.f24001w.i();
                    ch chVar = this.f23989n;
                    z12 = (chVar == null || chVar.getGroupCall() == null || chVar.getGroupCall().call == null || !chVar.getGroupCall().call.rtmp_stream) ? false : false;
                    l9 l9Var2 = this.f23973a0;
                    if (!z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    l9Var2.setVisibility(i14);
                    if (this.f23973a0.getVisibility() != 8) {
                        n(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.f23979e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.E.setVisibility(8);
                    this.f23974b.setVisibility(8);
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.F;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                        this.F.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.v.setBackground(null);
                    o();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    l9 l9Var3 = this.f23973a0;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    l9Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f23973a0.getVisibility() != 8) {
                        n(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.f23979e.setTranslationX(0.0f);
                    }
                    t10 t10Var = this.f24003x;
                    if (!hasRtmpStream) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    t10Var.setVisibility(i12);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.O = z11;
                    xi0 xi0Var = this.f24005y;
                    if (z11) {
                        i13 = 15;
                    } else {
                        i13 = 29;
                    }
                    xi0Var.N(i13);
                    xi0 xi0Var2 = this.f24005y;
                    xi0Var2.L(xi0Var2.f32559f - 1, false, true);
                    this.f24003x.invalidate();
                    this.f23994r.setBackground(null);
                    this.f23994r.setBackgroundColor(0);
                    this.f24001w.setVisibility(8);
                    this.f24001w.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.j6.D0().f32401l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!jdVar.f27454u) {
                        jdVar.f27454u = true;
                        jdVar.f27453t = SystemClock.elapsedRealtime();
                        yf.h.d().a(60, jdVar.F);
                    }
                    invalidate();
                    for (int i19 = 0; i19 < 2; i19++) {
                        r10 r10Var4 = this.d;
                        if (i19 == 0) {
                            nextTextView2 = r10Var4.getTextView();
                        } else {
                            nextTextView2 = r10Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            nextTextView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var));
                            nextTextView2.setTypeface(AndroidUtilities.bold());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.A7));
                    this.E.setVisibility(8);
                    this.f23974b.setVisibility(8);
                    this.f23979e.setVisibility(8);
                    this.L.setVisibility(8);
                    this.d.setLayoutParams(w7.x5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.M, 0);
                    org.telegram.ui.ActionBar.v0 v0Var3 = this.F;
                    if (v0Var3 != null) {
                        v0Var3.setVisibility(8);
                        this.F.setTag(null);
                    }
                }
            } else {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f23994r.setBackgroundColor(0);
                this.f23994r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20991v7));
                this.f23979e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(0);
                this.f23974b.setVisibility(0);
                this.f24003x.setVisibility(8);
                this.f24001w.setVisibility(8);
                this.f24001w.i();
                this.f23973a0.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    r10 r10Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = r10Var5.getTextView();
                    } else {
                        nextTextView = r10Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20973u7, f6Var));
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f20973u7));
                if (i10 == 6) {
                    this.f23974b.setLayoutParams(w7.x5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.E.setVisibility(8);
                } else if (i10 == 0) {
                    this.f23974b.setLayoutParams(w7.x5.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.v0 v0Var4 = this.F;
                    if (v0Var4 != null) {
                        v0Var4.setVisibility(0);
                        this.F.setTag(1);
                    }
                    this.E.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f23974b.setLayoutParams(w7.x5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.E.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(v10 v10Var) {
        this.f23991o0 = v10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.H0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.f23994r == null) {
            this.J0 = f7;
            return;
        }
        ImageView imageView = this.f23974b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        aj0 aj0Var = this.f24001w;
        if (aj0Var != null) {
            aj0Var.setTranslationX(f7);
        }
        r10 r10Var = this.d;
        if (r10Var != null) {
            r10Var.setTranslationX(f7);
        }
        r10 r10Var2 = this.f23979e;
        if (r10Var2 != null) {
            r10Var2.setTranslationX(f7);
        }
        l9 l9Var = this.f23973a0;
        if (l9Var != null) {
            l9Var.setTranslationX(f7);
        }
    }

    public void setSupportsCalls(boolean z10) {
        this.W = z10;
    }

    public void setTopPadding(float f7) {
        this.R = f7;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.R);
        if (i10 == 8) {
            this.F0 = false;
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f23972a = new jd();
        this.I = new org.telegram.ui.ActionBar.t0[6];
        this.P = -1;
        this.T = -1;
        this.W = true;
        this.f23985i0 = new p6(false, true, true, false);
        this.f23988l0 = new p10(this);
        this.m0 = UserConfig.selectedAccount;
        this.f23995r0 = -1;
        this.f23997s0 = new org.telegram.ui.Cells.l7(this, 13);
        this.f23998t0 = new AnimationNotificationsLocker();
        this.f23999u0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.G0 = new Paint(1);
        this.I0 = 0;
        this.K0 = new le.l(new j10(this), pr.h, 450L);
        this.L0 = 0;
        this.f23992p0 = f6Var;
        this.h = n2Var;
        if (n2Var instanceof ch) {
            this.f23989n = (ch) n2Var;
        }
        this.S = true;
        this.f23990n0 = z10;
        if (view == null) {
            ((ViewGroup) n2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
