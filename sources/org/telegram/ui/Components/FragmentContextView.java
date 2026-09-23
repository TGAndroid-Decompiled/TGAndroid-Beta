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
    public static final float[] O0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public org.telegram.ui.fj A0;
    public long B0;
    public final NotificationCenter.ObserversGroup[] C0;
    public NotificationCenter.ObserversGroup D0;
    public ImageView E;
    public float E0;
    public org.telegram.ui.ActionBar.v0 F;
    public float F0;
    public ed G;
    public boolean G0;
    public org.telegram.ui.ActionBar.b1 H;
    public boolean H0;
    public final org.telegram.ui.ActionBar.t0[] I;
    public final Paint I0;
    public FrameLayout J;
    public boolean J0;
    public ImageView K;
    public int K0;
    public org.telegram.ui.pk L;
    public float L0;
    public int M;
    public final le.m M0;
    public org.telegram.ui.Components.voip.h N;
    public int N0;
    public boolean O;
    public int P;
    public MessageObject Q;
    public float R;
    public boolean S;
    public int T;
    public String U;
    public boolean V;
    public boolean W;
    public final id f22004a;
    public k9 f22005a0;
    public ImageView f22006b;
    public Paint f22007b0;
    public fg0 f22008c;
    public LinearGradient f22009c0;
    public s10 d;
    public Matrix f22010d0;
    public s10 e;
    public int f22011e0;
    public AnimatorSet f22012f;
    public TextPaint f22013f0;
    public boolean f22014g0;
    public final org.telegram.ui.ActionBar.n2 h;
    public boolean f22015h0;
    public final o6 f22016i0;
    public yc f22017j0;
    public boolean f22018k0;
    public final q10 f22019l0;
    public final int m0;
    public final bh f22020n;
    public final boolean f22021n0;
    public w10 f22022o0;
    public final org.telegram.ui.ActionBar.d6 f22023p0;
    public boolean f22024q0;
    public r10 f22025r;
    public int f22026r0;
    public ai.w5 f22027s;
    public final org.telegram.ui.Cells.l7 f22028s0;
    public final AnimationNotificationsLocker f22029t0;
    public final AnimationNotificationsLocker f22030u0;
    public View v;
    public boolean f22031v0;
    public bj0 f22032w;
    public boolean f22033w0;
    public u10 f22034x;
    public boolean f22035x0;
    public yi0 f22036y;
    public boolean f22037y0;
    public boolean f22038z0;

    public FragmentContextView(Context context, org.telegram.ui.ry ryVar, boolean z10) {
        this(context, ryVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.T;
        org.telegram.ui.ActionBar.d6 d6Var = this.f22023p0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19083t7, d6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19101u7, d6Var);
        }
        return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A7, d6Var);
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
        if (this.f22025r != null) {
            return;
        }
        Context context = getContext();
        r10 r10Var = new r10(this, context);
        this.f22025r = r10Var;
        this.f22017j0 = new yc(r10Var);
        int i10 = AndroidUtilities.displaySize.x;
        o6 o6Var = this.f22016i0;
        o6Var.G = i10;
        o6Var.v = 0.4f;
        o6Var.setCallback(r10Var);
        o6Var.r(-1);
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.u(AndroidUtilities.bold());
        addView(this.f22025r, w7.x5.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.f22025r.addView(view, w7.x5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f22006b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f22006b;
        int i11 = org.telegram.ui.ActionBar.h6.f19137w7;
        org.telegram.ui.ActionBar.d6 d6Var = this.f22023p0;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.f22006b;
        fg0 fg0Var = new fg0(16);
        this.f22008c = fg0Var;
        imageView3.setImageDrawable(fg0Var);
        this.f22006b.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i11, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f22006b, w7.x5.e(36, 36, 51));
        this.f22006b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f25775b;

            {
                this.f25775b = this;
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
                FragmentContextView fragmentContextView = this.f25775b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f22020n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f22023p0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.ry) {
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
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19026q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f22020n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f22023p0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f695b;
                                int i17 = d2Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f696c, j10)) != null) {
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
                                        new j8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j11 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f22020n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                n2Var2.presentFragment(new org.telegram.ui.xn(bundle), n2Var2 instanceof org.telegram.ui.xn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j3 = bhVar2.a();
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
                                n2Var2.showDialog(new cv0(fragmentContextView.getContext(), new k10(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.f60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(xnVar.a()) != null) {
                                x40 x40Var = new x40(fragmentContextView.getContext(), null, xnVar, d6Var3);
                                x40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                n2Var2.showDialog(x40Var);
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
                        float[] fArr = FragmentContextView.O0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.O0;
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
                            yi0 yi0Var = fragmentContextView.f22036y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yi0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f22036y.M(0);
                                } else {
                                    fragmentContextView.f22036y.M(14);
                                }
                            }
                            fragmentContextView.f22034x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView.f22004a.f(true);
                            try {
                                fragmentContextView.f22034x.performHapticFeedback(3, 2);
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
        this.f22032w = imageView4;
        imageView4.setScaleType(scaleType);
        this.f22032w.setAutoRepeat(true);
        this.f22032w.f(R.raw.import_progress, 30, 30, null);
        this.f22032w.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(i11, d6Var)));
        addView(this.f22032w, w7.x5.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        s10 s10Var = new s10(this, context, context, 0);
        this.d = s10Var;
        addView(s10Var, w7.x5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        s10 s10Var2 = new s10(this, context, context, 1);
        this.e = s10Var2;
        addView(s10Var2, w7.x5.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.N = hVar;
        hVar.f28937g = 1.0f;
        hVar.f28939j = false;
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, 1);
        this.L = pkVar;
        pkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.L.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Sh, d6Var));
        org.telegram.ui.pk pkVar2 = this.L;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
        int v04 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Qh, d6Var);
        pkVar2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.L.setTextSize(1, 14.0f);
        this.L.setTypeface(AndroidUtilities.bold());
        this.L.setGravity(17);
        this.L.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.L, w7.x5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f25775b;

            {
                this.f25775b = this;
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
                FragmentContextView fragmentContextView = this.f25775b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f22020n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f22023p0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.ry) {
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
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19026q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f22020n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f22023p0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f695b;
                                int i17 = d2Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f696c, j10)) != null) {
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
                                        new j8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j11 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f22020n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                n2Var2.presentFragment(new org.telegram.ui.xn(bundle), n2Var2 instanceof org.telegram.ui.xn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j3 = bhVar2.a();
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
                                n2Var2.showDialog(new cv0(fragmentContextView.getContext(), new k10(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.f60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(xnVar.a()) != null) {
                                x40 x40Var = new x40(fragmentContextView.getContext(), null, xnVar, d6Var3);
                                x40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                n2Var2.showDialog(x40Var);
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
                        float[] fArr = FragmentContextView.O0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.O0;
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
                            yi0 yi0Var = fragmentContextView.f22036y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yi0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f22036y.M(0);
                                } else {
                                    fragmentContextView.f22036y.M(14);
                                }
                            }
                            fragmentContextView.f22034x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView.f22004a.f(true);
                            try {
                                fragmentContextView.f22034x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        if (this.G0) {
            n();
        }
        this.J = new FrameLayout(context);
        ImageView imageView5 = new ImageView(context);
        this.K = imageView5;
        imageView5.setImageResource(R.drawable.msg_mute);
        ImageView imageView6 = this.K;
        int i12 = org.telegram.ui.ActionBar.h6.f19154x7;
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), mode));
        this.J.addView(this.K, w7.x5.e(20, 20, 17));
        this.J.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i12, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.J.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.J.setOnClickListener(new ai.e2(11));
        this.J.setVisibility(8);
        addView(this.J, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f22021n0) {
            h();
        }
        k9 k9Var = new k9(context, false);
        this.f22005a0 = k9Var;
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.f22005a0.setDelegate(new o10(this, 1));
        this.f22005a0.setVisibility(8);
        addView(this.f22005a0, w7.x5.e(108, 36, 51));
        this.f22036y = new yi0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        u10 u10Var = new u10(this, context);
        this.f22034x = u10Var;
        u10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A7, d6Var), PorterDuff.Mode.SRC_IN));
        this.f22034x.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i12, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f22034x.setAnimation(this.f22036y);
        this.f22034x.setScaleType(scaleType);
        this.f22034x.setVisibility(8);
        addView(this.f22034x, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.f22034x.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f25775b;

            {
                this.f25775b = this;
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
                FragmentContextView fragmentContextView = this.f25775b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f22020n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f22023p0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.ry) {
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
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19026q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f22020n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f22023p0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f695b;
                                int i17 = d2Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f696c, j10)) != null) {
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
                                        new j8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j11 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f22020n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                n2Var2.presentFragment(new org.telegram.ui.xn(bundle), n2Var2 instanceof org.telegram.ui.xn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j3 = bhVar2.a();
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
                                n2Var2.showDialog(new cv0(fragmentContextView.getContext(), new k10(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.f60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(xnVar.a()) != null) {
                                x40 x40Var = new x40(fragmentContextView.getContext(), null, xnVar, d6Var3);
                                x40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                n2Var2.showDialog(x40Var);
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
                        float[] fArr = FragmentContextView.O0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.O0;
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
                            yi0 yi0Var = fragmentContextView.f22036y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yi0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f22036y.M(0);
                                } else {
                                    fragmentContextView.f22036y.M(14);
                                }
                            }
                            fragmentContextView.f22034x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView.f22004a.f(true);
                            try {
                                fragmentContextView.f22034x.performHapticFeedback(3, 2);
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
        this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), mode));
        this.E.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i12, d6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.E.setScaleType(scaleType);
        addView(this.E, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f25775b;

            {
                this.f25775b = this;
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
                FragmentContextView fragmentContextView = this.f25775b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f22020n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f22023p0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.ry) {
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
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19026q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f22020n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f22023p0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f695b;
                                int i17 = d2Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f696c, j10)) != null) {
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
                                        new j8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j11 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f22020n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                n2Var2.presentFragment(new org.telegram.ui.xn(bundle), n2Var2 instanceof org.telegram.ui.xn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j3 = bhVar2.a();
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
                                n2Var2.showDialog(new cv0(fragmentContextView.getContext(), new k10(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.f60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(xnVar.a()) != null) {
                                x40 x40Var = new x40(fragmentContextView.getContext(), null, xnVar, d6Var3);
                                x40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                n2Var2.showDialog(x40Var);
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
                        float[] fArr = FragmentContextView.O0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.O0;
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
                            yi0 yi0Var = fragmentContextView.f22036y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yi0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f22036y.M(0);
                                } else {
                                    fragmentContextView.f22036y.M(14);
                                }
                            }
                            fragmentContextView.f22034x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView.f22004a.f(true);
                            try {
                                fragmentContextView.f22034x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        ai.w5 w5Var = new ai.w5(getContext(), 15);
        this.f22027s = w5Var;
        addView(w5Var, w7.x5.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f25775b;

            {
                this.f25775b = this;
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
                FragmentContextView fragmentContextView = this.f25775b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f22020n;
                        org.telegram.ui.ActionBar.d6 d6Var2 = fragmentContextView.f22023p0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, d6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                            b2Var.R = string;
                            if (n2Var instanceof org.telegram.ui.ry) {
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
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new k10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19026q7, d6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f22020n;
                        org.telegram.ui.ActionBar.d6 d6Var3 = fragmentContextView.f22023p0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f695b;
                                int i17 = d2Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f696c, j10)) != null) {
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
                                        new j8(findActivity, d6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, d6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j11 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f22020n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                n2Var2.presentFragment(new org.telegram.ui.xn(bundle), n2Var2 instanceof org.telegram.ui.xn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (bhVar2 != null) {
                                j3 = bhVar2.a();
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
                                n2Var2.showDialog(new cv0(fragmentContextView.getContext(), new k10(fragmentContextView), d6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.f60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (n2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.xn xnVar = (org.telegram.ui.xn) n2Var2;
                            if (n2Var2.getSendMessagesHelper().getImportingHistory(xnVar.a()) != null) {
                                x40 x40Var = new x40(fragmentContextView.getContext(), null, xnVar, d6Var3);
                                x40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                n2Var2.showDialog(x40Var);
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
                        float[] fArr = FragmentContextView.O0;
                        fragmentContextView.callOnClick();
                        return;
                    default:
                        float[] fArr2 = FragmentContextView.O0;
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
                            yi0 yi0Var = fragmentContextView.f22036y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yi0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f22036y.M(0);
                                } else {
                                    fragmentContextView.f22036y.M(14);
                                }
                            }
                            fragmentContextView.f22034x.d();
                            org.telegram.ui.ActionBar.h6.D0().c(true);
                            fragmentContextView.f22004a.f(true);
                            try {
                                fragmentContextView.f22034x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        setLeftMargin(this.L0);
    }

    public final void c(boolean z10) {
        int i10;
        bh bhVar = this.f22020n;
        if (bhVar != null) {
            if (!this.S || ((i10 = this.T) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.n2 n2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = n2Var.getSendMessagesHelper().getImportingHistory(bhVar.a());
                View fragmentView = n2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = n2Var.getVisibleDialog();
                if ((j() || bhVar.m() || ((visibleDialog instanceof x40) && !((x40) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f22029t0;
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
                        AnimatorSet animatorSet = this.f22012f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f22012f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f22012f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f22012f.setDuration(220L);
                        this.f22012f.setInterpolator(rr.f27701f);
                        this.f22012f.addListener(new p10(this, 4));
                        this.f22012f.start();
                        return;
                    }
                    int i11 = this.T;
                    if (i11 == -1 || i11 == 5) {
                        this.S = false;
                        setVisibility(8);
                    }
                } else if (this.T != 5 && this.f22012f != null && !z10) {
                    this.f22037y0 = true;
                } else {
                    s(5);
                    if (z10 && this.R == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        w10 w10Var = this.f22022o0;
                        if (w10Var != null) {
                            ((rq0) w10Var).a(true);
                            ((rq0) this.f22022o0).a(false);
                        }
                    }
                    if (!this.S) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f22012f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f22012f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f22012f = new AnimatorSet();
                            w10 w10Var2 = this.f22022o0;
                            if (w10Var2 != null) {
                                ((rq0) w10Var2).a(true);
                            }
                            this.f22012f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f22012f.setDuration(200L);
                            this.f22012f.addListener(new p10(this, 5));
                            this.f22012f.start();
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
        boolean z11 = n2Var instanceof org.telegram.ui.ry;
        if (z11) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(n2Var.getCurrentAccount()).isSharingLocation(this.f22020n.a());
        }
        org.telegram.ui.Cells.l7 l7Var = this.f22028s0;
        if (!isSharingLocation) {
            this.f22026r0 = -1;
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
                AnimatorSet animatorSet = this.f22012f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f22012f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f22012f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f22012f.setDuration(200L);
                this.f22012f.addListener(new p10(this, 0));
                this.f22012f.start();
                return;
            }
            return;
        }
        b();
        s(2);
        this.f22006b.setImageDrawable(new iq0(getContext(), 1));
        if (z10 && this.R == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.S) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f22012f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f22012f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f22012f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f22012f.setDuration(200L);
                this.f22012f.addListener(new p10(this, 1));
                this.f22012f.start();
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
            spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19083t7, this.f22023p0)), indexOf, string2.length() + indexOf, 18);
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
            bh bhVar = this.f22020n;
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
                        if (this.S && this.T == 4) {
                            ChatObject.Call groupCall = bhVar.getGroupCall();
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
                            o(true);
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
                        r(true);
                        return;
                    } else {
                        int i17 = NotificationCenter.webRtcMicAmplitudeEvent;
                        id idVar = this.f22004a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.F0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.F0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.h6.D0().a(Math.max(this.E0, this.F0));
                                idVar.d(Math.max(this.E0, this.F0));
                                return;
                            }
                            return;
                        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
                            b();
                            this.E0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.F0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.h6.D0().a(Math.max(this.E0, this.F0));
                                idVar.d(Math.max(this.E0, this.F0));
                            }
                            this.f22005a0.invalidate();
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
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f22034x != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f22034x.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
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
        ai.d2 d2Var = ai.d2.W;
        AnimationNotificationsLocker animationNotificationsLocker = this.f22029t0;
        int i10 = 0;
        if (d2Var != null) {
            b();
            int i11 = this.T;
            if (6 != i11 && this.f22012f != null && !z10) {
                this.f22033w0 = true;
                return;
            } else if (6 != i11 && this.S && !z10) {
                AnimatorSet animatorSet = this.f22012f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f22012f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f22012f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f22012f.setDuration(220L);
                this.f22012f.setInterpolator(rr.f27701f);
                this.f22012f.addListener(new p10(this, 7));
                this.f22012f.start();
                return;
            } else {
                s(6);
                if (!this.S) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f22012f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f22012f = null;
                        }
                        this.f22012f = new AnimatorSet();
                        this.f22030u0.lock();
                        this.f22012f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f22012f.setDuration(220L);
                        this.f22012f.setInterpolator(rr.f27701f);
                        this.f22012f.addListener(new p10(this, 8));
                        this.f22012f.start();
                    } else {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        n();
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
                    AnimatorSet animatorSet4 = this.f22012f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f22012f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f22012f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f22012f.setDuration(220L);
                    this.f22012f.setInterpolator(rr.f27701f);
                    this.f22012f.addListener(new p10(this, 6));
                    this.f22012f.start();
                }
            } else if (z11 && this.T == -1) {
                this.S = false;
                setVisibility(8);
            }
        }
        ai.d2 d2Var2 = ai.d2.W;
        if (d2Var2 != null && this.T == 6) {
            s10 s10Var = this.d;
            TLRPC.GroupCall groupCall = d2Var2.v;
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
        bh bhVar = this.f22020n;
        if (bhVar != null && this.d != null) {
            b();
            long a2 = bhVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
            if (!this.f22024q0) {
                LocationController.getInstance(currentAccount).loadLiveLocations(a2);
                this.f22024q0 = true;
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
            if (this.f22026r0 != i10) {
                this.f22026r0 = i10;
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
                        spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19083t7, this.f22023p0)), indexOf, string.length() + indexOf, 18);
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
        AnimationNotificationsLocker animationNotificationsLocker = this.f22029t0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i11 = this.T;
            if (i11 != 0 && this.f22012f != null && !z10) {
                this.f22035x0 = true;
                return;
            }
            s(0);
            if (z10 && this.R == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                w10 w10Var = this.f22022o0;
                if (w10Var != null) {
                    ((rq0) w10Var).a(true);
                    ((rq0) this.f22022o0).a(false);
                }
            }
            if (!this.S) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f22012f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f22012f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f22012f = new AnimatorSet();
                    w10 w10Var2 = this.f22022o0;
                    if (w10Var2 != null) {
                        ((rq0) w10Var2).a(true);
                    }
                    this.f22012f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f22012f.setDuration(200L);
                    this.f22012f.addListener(new p10(this, 3));
                    this.f22012f.start();
                }
                this.S = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f22008c.a(false, !z10);
                this.f22006b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f22008c.a(true, !z10);
                this.f22006b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
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
                        r(false);
                    } else {
                        this.F.setAlpha(0.0f);
                        this.F.setEnabled(false);
                        this.d.setPadding(0, 0, this.M, 0);
                    }
                } else {
                    this.d.setPadding(0, 0, this.M, 0);
                }
                spannableStringBuilder = new SpannableStringBuilder(a4.a.D(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
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
                this.V = false;
                org.telegram.ui.ActionBar.v0 v0Var = this.F;
                if (v0Var != null) {
                    v0Var.setAlpha(1.0f);
                    this.F.setEnabled(true);
                }
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.M, 0);
                spannableStringBuilder = new SpannableStringBuilder(a4.a.D(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
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
                r(false);
            }
            spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19083t7, this.f22023p0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.V) ? false : false);
            return;
        }
        this.Q = null;
        if (this.W && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !a30.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (bhVar = this.f22020n) != null && !a30.c()) {
            ChatObject.Call groupCall = bhVar.getGroupCall();
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
            AnimatorSet animatorSet2 = this.f22012f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f22012f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f22012f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f22012f.setDuration(200L);
            w10 w10Var3 = this.f22022o0;
            if (w10Var3 != null) {
                ((rq0) w10Var3).a(true);
            }
            this.f22012f.addListener(new p10(this, 2));
            this.f22012f.start();
        } else {
            setVisibility(8);
        }
    }

    public id getCapsuleBlobDrawable() {
        return this.f22004a;
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
        int i10 = org.telegram.ui.ActionBar.h6.f18895j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f22023p0;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), false, this.f22023p0);
        this.F = v0Var;
        v0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.F.setLongClickEnabled(false);
        this.F.setVisibility(8);
        this.F.setTag(null);
        this.F.setShowSubmenuByMove(false);
        this.F.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.F.setDelegate(new k10(this));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.F;
        ed edVar = new ed();
        this.G = edVar;
        v0Var2.setIcon(edVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getContext(), d6Var);
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
        this.F.setOnClickListener(new et(3, this, fArr));
        this.F.setOnLongClickListener(new n10(this, 0));
        r(false);
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
                org.telegram.ui.dd0 dd0Var = new org.telegram.ui.dd0(2);
                dd0Var.u0(sharingLocationInfo.messageObject);
                dd0Var.F0 = new ai.z1(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.p0(dd0Var);
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
        NotificationCenter.ObserversGroup observersGroup = this.D0;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.D0 = null;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.ObserversGroup[] observersGroupArr = this.C0;
            NotificationCenter.ObserversGroup observersGroup2 = observersGroupArr[i10];
            if (observersGroup2 != null) {
                observersGroup2.removeAllObservers();
                observersGroupArr[i10] = null;
            }
        }
    }

    public final void n() {
        org.telegram.ui.Components.voip.h hVar = this.N;
        if (hVar != null && hVar.f28937g >= 1.0f) {
            this.G0 = false;
            AndroidUtilities.runOnUIThread(new o10(this, 0), 150L);
            return;
        }
        this.G0 = true;
    }

    public final void o(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        int g10;
        int i11;
        float f7;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.f22005a0.f25558a.f25202f) != null) {
            valueAnimator.cancel();
            this.f22005a0.f25558a.f25202f = null;
        }
        j9 j9Var = this.f22005a0.f25558a;
        if (j9Var.f25202f == null) {
            int i12 = this.T;
            int i13 = this.m0;
            bh bhVar = this.f22020n;
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
                        this.f22005a0.b(i15, call.sortedParticipants.get(i15), i10);
                    } else {
                        this.f22005a0.b(i15, null, i10);
                    }
                }
            } else if (user != null) {
                this.f22005a0.b(0, user, i10);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.f22005a0.b(i16, null, i10);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.f22005a0.b(i17, null, i10);
                }
            }
            this.f22005a0.a(z10);
            if (this.T == 4 && call != null) {
                if (!call.call.rtmp_stream) {
                    i14 = Math.min(3, call.sortedParticipants.size());
                }
                if (i14 == 0) {
                    g10 = 10;
                } else {
                    g10 = hg.c.g(i14, 1, 24, 52);
                }
                int i18 = g10 + 3;
                if (z10) {
                    int i19 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (AndroidUtilities.dp(i18) != i19) {
                        float translationX = (this.d.getTranslationX() + i19) - AndroidUtilities.dp(f7);
                        this.d.setTranslationX(translationX);
                        this.e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        rr rrVar = rr.f27701f;
                        duration.setInterpolator(rrVar);
                        this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(rrVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
                }
                s10 s10Var = this.d;
                float f10 = i18;
                int i20 = 36;
                if (call.isScheduled()) {
                    i11 = 90;
                } else {
                    i11 = 36;
                }
                s10Var.setLayoutParams(w7.x5.d(-1, 20.0f, 51, f10, 5.0f, i11, 0.0f));
                s10 s10Var2 = this.e;
                if (call.isScheduled()) {
                    i20 = 90;
                }
                s10Var2.setLayoutParams(w7.x5.d(-1, 20.0f, 51, f10, 25.0f, i20, 0.0f));
                return;
            }
            return;
        }
        j9Var.f25203g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m();
        int i10 = 15;
        if (this.f22021n0) {
            this.D0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.liveLocationsChanged).add(NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                this.C0[i11] = NotificationCenter.getInstance(i11).createObserversGroup(this).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.groupCallTypingsUpdated).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.liveStoryUpdated).add(NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i11).subscribeToCallMessages(0L, this);
            }
            this.D0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.messagePlayingSpeedChanged).add(NotificationCenter.didStartedCall).add(NotificationCenter.didEndCall).add(NotificationCenter.webRtcSpeakerAmplitudeEvent).add(NotificationCenter.webRtcMicAmplitudeEvent).add(NotificationCenter.groupCallVisibilityChanged);
            if (ai.d2.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !a30.c()) {
                a(true);
            } else {
                bh bhVar = this.f22020n;
                if (bhVar != null && this.h.getSendMessagesHelper().getImportingHistory(bhVar.a()) != null && !j()) {
                    c(true);
                } else if (bhVar != null && bhVar.getGroupCall() != null && bhVar.getGroupCall().shouldShowPanel() && !a30.c() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    r(false);
                }
            }
        }
        int i12 = this.T;
        if (i12 != 3 && i12 != 1) {
            if (i12 == 4 && !this.f22018k0) {
                this.f22018k0 = true;
                this.f22019l0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.h6.D0().f30128l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            id idVar = this.f22004a;
            if (!idVar.f24962u) {
                idVar.f24962u = true;
                idVar.f24961t = SystemClock.elapsedRealtime();
                yf.h.d().a(60, idVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.O != z10 && this.f22034x != null) {
                this.O = z10;
                yi0 yi0Var = this.f22036y;
                if (!z10) {
                    i10 = 29;
                }
                yi0Var.P(i10);
                yi0 yi0Var2 = this.f22036y;
                yi0Var2.N(yi0Var2.f30265f - 1, false, true);
                this.f22034x.invalidate();
            }
        }
        if (this.S && this.R == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.E0 = 0.0f;
        this.F0 = 0.0f;
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
        id idVar = this.f22004a;
        if (z11 != z10) {
            this.O = z10;
            yi0 yi0Var = this.f22036y;
            if (z10) {
                i10 = 15;
            } else {
                i10 = 29;
            }
            yi0Var.P(i10);
            yi0 yi0Var2 = this.f22036y;
            yi0Var2.N(yi0Var2.f30265f - 1, false, true);
            this.f22034x.invalidate();
            org.telegram.ui.ActionBar.h6.D0().c(this.S);
            idVar.f(this.S);
        }
        if (this.O) {
            this.F0 = 0.0f;
            org.telegram.ui.ActionBar.h6.D0().a(0.0f);
            idVar.d(0.0f);
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
        AnimatorSet animatorSet = this.f22012f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f22012f = null;
        }
        if (this.f22018k0) {
            AndroidUtilities.cancelRunOnUIThread(this.f22019l0);
            this.f22018k0 = false;
        }
        this.S = false;
        this.f22029t0.unlock();
        this.R = 0.0f;
        m();
        if (!this.f22021n0) {
            for (int i10 = 0; i10 < 4; i10++) {
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i11 = this.T;
        if (i11 == 3 || i11 == 1) {
            y10 D0 = org.telegram.ui.ActionBar.h6.D0();
            ArrayList arrayList = D0.f30128l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.f30121b;
                D0.f30121b = null;
                D0.f30122c = null;
            }
            id idVar = this.f22004a;
            if (idVar.f24962u) {
                idVar.f24962u = false;
                yf.h.d().f(idVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.H0 = false;
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
        if (this.f22027s != null) {
            int i10 = this.T;
            if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
                this.N0++;
                if (!groupCallMessage.isOut()) {
                    this.M0.i(new v10(this.f22027s, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i10 = this.N0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.N0 = i11;
            if (i11 == 0) {
                this.M0.i(null, true);
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
        p();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final void p() {
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
                    bh bhVar = this.f22020n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (bhVar != null && bhVar.g() != null && bhVar.g().f18083id == sharedInstance.getChat().f18083id) {
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
                        if (bhVar != null && bhVar.i() != null && bhVar.i().f18230id == user.f18230id) {
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
        e51[] e51VarArr;
        TextView nextTextView2;
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.V), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.h6.Qh;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.f19154x7;
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f22023p0;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        ed edVar = this.G;
        if (edVar != null) {
            ((o6) edVar.f23648c).r(v02);
            Paint paint = (Paint) edVar.f23647b;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.F;
        if (v0Var != null) {
            v0Var.setBackground(org.telegram.ui.ActionBar.h6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.f22006b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19137w7, d6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19154x7, d6Var), PorterDuff.Mode.MULTIPLY));
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
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19154x7, d6Var));
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
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.h6.v0(intValue, d6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (e51VarArr = (e51[]) ((Spanned) text).getSpans(0, text.length(), e51.class)) != null) {
                            for (e51 e51Var : e51VarArr) {
                                e51Var.f23571b = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19083t7, d6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void r(boolean z10) {
        if (this.G == null) {
            return;
        }
        float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(this.V);
        this.G.l(playbackSpeed, z10);
        q();
        boolean z11 = this.f22038z0;
        int i10 = 0;
        this.f22038z0 = false;
        while (true) {
            org.telegram.ui.ActionBar.t0[] t0VarArr = this.I;
            if (i10 < t0VarArr.length) {
                org.telegram.ui.ActionBar.d6 d6Var = this.f22023p0;
                if (!z11 && Math.abs(playbackSpeed - O0[i10]) < 0.05f) {
                    org.telegram.ui.ActionBar.t0 t0Var = t0VarArr[i10];
                    int i11 = org.telegram.ui.ActionBar.h6.Qh;
                    t0Var.a(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
                } else {
                    org.telegram.ui.ActionBar.t0 t0Var2 = t0VarArr[i10];
                    int i12 = org.telegram.ui.ActionBar.h6.E8;
                    t0Var2.a(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
                }
                i10++;
            } else {
                this.H.d(playbackSpeed, z10);
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
        if (this.T != i10) {
            b();
            int i15 = this.T;
            id idVar = this.f22004a;
            boolean z12 = true;
            if (i15 == 3 || i15 == 1) {
                y10 D0 = org.telegram.ui.ActionBar.h6.D0();
                ArrayList arrayList = D0.f30128l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    D0.d = D0.f30121b;
                    D0.f30121b = null;
                    D0.f30122c = null;
                }
                if (idVar.f24962u) {
                    idVar.f24962u = false;
                    yf.h.d().f(idVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                le.m mVar = this.M0;
                if (mVar != null) {
                    mVar.i(null, true);
                }
            }
            this.T = i10;
            r10 r10Var = this.f22025r;
            if (i10 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            r10Var.setWillNotDraw(z10);
            if (i10 != 4) {
                this.f22014g0 = false;
            }
            k9 k9Var = this.f22005a0;
            if (k9Var != null) {
                k9Var.setStyle(this.T);
                this.f22005a0.setLayoutParams(w7.x5.e(108, getStyleHeight(), 51));
            }
            this.f22025r.setLayoutParams(w7.x5.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f7 = this.R;
            if (f7 > 0.0f && f7 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.d6 d6Var = this.f22023p0;
            if (i10 == 6) {
                this.v.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                this.f22025r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.nk, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ok, d6Var)}));
                this.f22025r.setTag(null);
                this.e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(8);
                this.f22006b.setVisibility(8);
                this.f22034x.setVisibility(8);
                this.f22032w.setVisibility(8);
                this.f22032w.i();
                this.f22005a0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.A7));
                for (int i16 = 0; i16 < 2; i16++) {
                    s10 s10Var = this.d;
                    if (i16 == 0) {
                        nextTextView5 = s10Var.getTextView();
                    } else {
                        nextTextView5 = s10Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        nextTextView5.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A7, d6Var));
                        nextTextView5.setTypeface(AndroidUtilities.bold());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(w7.x5.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i10 == 5) {
                this.v.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                this.f22025r.setBackgroundColor(0);
                this.f22025r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f19119v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    s10 s10Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = s10Var2.getTextView();
                    } else {
                        nextTextView4 = s10Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        nextTextView4.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19101u7, d6Var));
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f19101u7));
                this.e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(8);
                this.f22006b.setVisibility(8);
                this.f22034x.setVisibility(8);
                this.f22005a0.setVisibility(8);
                this.f22032w.setVisibility(0);
                this.f22032w.d();
                this.E.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.v0 v0Var = this.F;
                if (v0Var != null) {
                    v0Var.setVisibility(8);
                    this.F.setTag(null);
                }
                this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.v.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                    this.f22025r.setBackgroundColor(0);
                    this.f22025r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f19119v7));
                    this.f22034x.setVisibility(8);
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
                            nextTextView3.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19083t7, d6Var));
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f19083t7));
                    this.d.setPadding(0, 0, this.M, 0);
                    this.f22032w.setVisibility(8);
                    this.f22032w.i();
                    bh bhVar = this.f22020n;
                    z12 = (bhVar == null || bhVar.getGroupCall() == null || bhVar.getGroupCall().call == null || !bhVar.getGroupCall().call.rtmp_stream) ? false : false;
                    k9 k9Var2 = this.f22005a0;
                    if (!z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    k9Var2.setVisibility(i14);
                    if (this.f22005a0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.E.setVisibility(8);
                    this.f22006b.setVisibility(8);
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.F;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                        this.F.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.v.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    k9 k9Var3 = this.f22005a0;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    k9Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f22005a0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    u10 u10Var = this.f22034x;
                    if (!hasRtmpStream) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    u10Var.setVisibility(i12);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.O = z11;
                    yi0 yi0Var = this.f22036y;
                    if (z11) {
                        i13 = 15;
                    } else {
                        i13 = 29;
                    }
                    yi0Var.P(i13);
                    yi0 yi0Var2 = this.f22036y;
                    yi0Var2.N(yi0Var2.f30265f - 1, false, true);
                    this.f22034x.invalidate();
                    this.f22025r.setBackground(null);
                    this.f22025r.setBackgroundColor(0);
                    this.f22032w.setVisibility(8);
                    this.f22032w.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.h6.D0().f30128l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!idVar.f24962u) {
                        idVar.f24962u = true;
                        idVar.f24961t = SystemClock.elapsedRealtime();
                        yf.h.d().a(60, idVar.F);
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
                            nextTextView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A7, d6Var));
                            nextTextView2.setTypeface(AndroidUtilities.bold());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.A7));
                    this.E.setVisibility(8);
                    this.f22006b.setVisibility(8);
                    this.e.setVisibility(8);
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
                this.v.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                this.f22025r.setBackgroundColor(0);
                this.f22025r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f19119v7));
                this.e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(0);
                this.f22006b.setVisibility(0);
                this.f22034x.setVisibility(8);
                this.f22032w.setVisibility(8);
                this.f22032w.i();
                this.f22005a0.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    s10 s10Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = s10Var5.getTextView();
                    } else {
                        nextTextView = s10Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19101u7, d6Var));
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.h6.f19101u7));
                if (i10 == 6) {
                    this.f22006b.setLayoutParams(w7.x5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.E.setVisibility(8);
                } else if (i10 == 0) {
                    this.f22006b.setLayoutParams(w7.x5.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.v0 v0Var4 = this.F;
                    if (v0Var4 != null) {
                        v0Var4.setVisibility(0);
                        this.F.setTag(1);
                    }
                    this.E.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f22006b.setLayoutParams(w7.x5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.E.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(w10 w10Var) {
        this.f22022o0 = w10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.J0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.f22025r == null) {
            this.L0 = f7;
            return;
        }
        ImageView imageView = this.f22006b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        bj0 bj0Var = this.f22032w;
        if (bj0Var != null) {
            bj0Var.setTranslationX(f7);
        }
        s10 s10Var = this.d;
        if (s10Var != null) {
            s10Var.setTranslationX(f7);
        }
        s10 s10Var2 = this.e;
        if (s10Var2 != null) {
            s10Var2.setTranslationX(f7);
        }
        k9 k9Var = this.f22005a0;
        if (k9Var != null) {
            k9Var.setTranslationX(f7);
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
            this.H0 = false;
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f22004a = new id();
        this.I = new org.telegram.ui.ActionBar.t0[6];
        this.P = -1;
        this.T = -1;
        this.W = true;
        this.f22016i0 = new o6(false, true, true, false);
        this.f22019l0 = new q10(this);
        this.m0 = UserConfig.selectedAccount;
        this.f22026r0 = -1;
        this.f22028s0 = new org.telegram.ui.Cells.l7(this, 13);
        this.f22029t0 = new AnimationNotificationsLocker();
        this.f22030u0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.C0 = new NotificationCenter.ObserversGroup[4];
        this.I0 = new Paint(1);
        this.K0 = 0;
        this.M0 = new le.m(new k10(this), rr.h, 450L);
        this.N0 = 0;
        this.f22023p0 = d6Var;
        this.h = n2Var;
        if (n2Var instanceof bh) {
            this.f22020n = (bh) n2Var;
        }
        this.S = true;
        this.f22021n0 = z10;
        if (view == null) {
            ((ViewGroup) n2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
