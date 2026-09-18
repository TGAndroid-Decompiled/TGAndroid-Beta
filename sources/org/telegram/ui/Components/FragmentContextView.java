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
    public org.telegram.ui.jj A0;
    public long B0;
    public final NotificationCenter.ObserversGroup[] C0;
    public NotificationCenter.ObserversGroup D0;
    public ImageView E;
    public float E0;
    public org.telegram.ui.ActionBar.w0 F;
    public float F0;
    public cd G;
    public boolean G0;
    public org.telegram.ui.ActionBar.c1 H;
    public boolean H0;
    public final org.telegram.ui.ActionBar.u0[] I;
    public final Paint I0;
    public FrameLayout J;
    public boolean J0;
    public ImageView K;
    public int K0;
    public org.telegram.ui.tk L;
    public float L0;
    public int M;
    public final le.l M0;
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
    public final gd f22046a;
    public i9 f22047a0;
    public ImageView f22048b;
    public Paint f22049b0;
    public gg0 f22050c;
    public LinearGradient f22051c0;
    public r10 d;
    public Matrix f22052d0;
    public r10 e;
    public int f22053e0;
    public AnimatorSet f22054f;
    public TextPaint f22055f0;
    public boolean f22056g0;
    public final org.telegram.ui.ActionBar.o2 h;
    public boolean f22057h0;
    public final m6 f22058i0;
    public wc f22059j0;
    public boolean f22060k0;
    public final p10 f22061l0;
    public final int m0;
    public final ah f22062n;
    public final boolean f22063n0;
    public v10 f22064o0;
    public final org.telegram.ui.ActionBar.f6 f22065p0;
    public boolean f22066q0;
    public q10 f22067r;
    public int f22068r0;
    public ai.x5 f22069s;
    public final org.telegram.ui.Cells.l7 f22070s0;
    public final AnimationNotificationsLocker f22071t0;
    public final AnimationNotificationsLocker f22072u0;
    public View v;
    public boolean f22073v0;
    public bj0 f22074w;
    public boolean f22075w0;
    public t10 f22076x;
    public boolean f22077x0;
    public yi0 f22078y;
    public boolean f22079y0;
    public boolean f22080z0;

    public FragmentContextView(Context context, org.telegram.ui.wy wyVar, boolean z10) {
        this(context, wyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.T;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22065p0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19158t7, f6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19176u7, f6Var);
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
        if (this.f22067r != null) {
            return;
        }
        Context context = getContext();
        q10 q10Var = new q10(this, context);
        this.f22067r = q10Var;
        this.f22059j0 = new wc(q10Var);
        int i10 = AndroidUtilities.displaySize.x;
        m6 m6Var = this.f22058i0;
        m6Var.G = i10;
        m6Var.v = 0.4f;
        m6Var.setCallback(q10Var);
        m6Var.r(-1);
        m6Var.t(AndroidUtilities.dp(14.0f));
        m6Var.u(AndroidUtilities.bold());
        addView(this.f22067r, w7.x5.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.f22067r.addView(view, w7.x5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f22048b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f22048b;
        int i11 = org.telegram.ui.ActionBar.j6.f19212w7;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22065p0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.f22048b;
        gg0 gg0Var = new gg0(16);
        this.f22050c = gg0Var;
        imageView3.setImageDrawable(gg0Var);
        this.f22048b.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i11, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f22048b, w7.x5.e(36, 36, 51));
        this.f22048b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f25519b;

            {
                this.f25519b = this;
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
                FragmentContextView fragmentContextView = this.f25519b;
                switch (i14) {
                    case 0:
                        ah ahVar = fragmentContextView.f22062n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f22065p0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                            c2Var.R = string;
                            if (o2Var instanceof org.telegram.ui.wy) {
                                c2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ahVar.g();
                                TLRPC.User i15 = ahVar.i();
                                if (g10 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new j10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19101q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ah ahVar2 = fragmentContextView.f22062n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f22065p0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f689b;
                                int i17 = d2Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f690c, j10)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new h8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new h8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ahVar2 != null) {
                                    j11 = ahVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f22062n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                o2Var2.presentFragment(new org.telegram.ui.bo(bundle), o2Var2 instanceof org.telegram.ui.bo);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ahVar2 != null) {
                                j3 = ahVar2.a();
                                i12 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new dv0(fragmentContextView.getContext(), new j10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.k60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = ahVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.bo boVar = (org.telegram.ui.bo) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(boVar.a()) != null) {
                                w40 w40Var = new w40(fragmentContextView.getContext(), null, boVar, f6Var3);
                                w40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                o2Var2.showDialog(w40Var);
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
                            yi0 yi0Var = fragmentContextView.f22078y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yi0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f22078y.M(0);
                                } else {
                                    fragmentContextView.f22078y.M(14);
                                }
                            }
                            fragmentContextView.f22076x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f22046a.f(true);
                            try {
                                fragmentContextView.f22076x.performHapticFeedback(3, 2);
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
        this.f22074w = imageView4;
        imageView4.setScaleType(scaleType);
        this.f22074w.setAutoRepeat(true);
        this.f22074w.f(R.raw.import_progress, 30, 30, null);
        this.f22074w.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        addView(this.f22074w, w7.x5.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        r10 r10Var = new r10(this, context, context, 0);
        this.d = r10Var;
        addView(r10Var, w7.x5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        r10 r10Var2 = new r10(this, context, context, 1);
        this.e = r10Var2;
        addView(r10Var2, w7.x5.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.N = hVar;
        hVar.f28946g = 1.0f;
        hVar.f28948j = false;
        org.telegram.ui.tk tkVar = new org.telegram.ui.tk(this, context, 1);
        this.L = tkVar;
        tkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.L.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        org.telegram.ui.tk tkVar2 = this.L;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
        tkVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.L.setTextSize(1, 14.0f);
        this.L.setTypeface(AndroidUtilities.bold());
        this.L.setGravity(17);
        this.L.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.L, w7.x5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f25519b;

            {
                this.f25519b = this;
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
                FragmentContextView fragmentContextView = this.f25519b;
                switch (i14) {
                    case 0:
                        ah ahVar = fragmentContextView.f22062n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f22065p0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                            c2Var.R = string;
                            if (o2Var instanceof org.telegram.ui.wy) {
                                c2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ahVar.g();
                                TLRPC.User i15 = ahVar.i();
                                if (g10 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new j10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19101q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ah ahVar2 = fragmentContextView.f22062n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f22065p0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f689b;
                                int i17 = d2Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f690c, j10)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new h8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new h8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ahVar2 != null) {
                                    j11 = ahVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f22062n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                o2Var2.presentFragment(new org.telegram.ui.bo(bundle), o2Var2 instanceof org.telegram.ui.bo);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ahVar2 != null) {
                                j3 = ahVar2.a();
                                i12 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new dv0(fragmentContextView.getContext(), new j10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.k60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = ahVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.bo boVar = (org.telegram.ui.bo) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(boVar.a()) != null) {
                                w40 w40Var = new w40(fragmentContextView.getContext(), null, boVar, f6Var3);
                                w40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                o2Var2.showDialog(w40Var);
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
                            yi0 yi0Var = fragmentContextView.f22078y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yi0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f22078y.M(0);
                                } else {
                                    fragmentContextView.f22078y.M(14);
                                }
                            }
                            fragmentContextView.f22076x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f22046a.f(true);
                            try {
                                fragmentContextView.f22076x.performHapticFeedback(3, 2);
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
        int i12 = org.telegram.ui.ActionBar.j6.f19229x7;
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
        this.J.addView(this.K, w7.x5.e(20, 20, 17));
        this.J.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.J.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.J.setOnClickListener(new ai.e2(11));
        this.J.setVisibility(8);
        addView(this.J, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f22063n0) {
            h();
        }
        i9 i9Var = new i9(context, false);
        this.f22047a0 = i9Var;
        i9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.f22047a0.setDelegate(new n10(this, 1));
        this.f22047a0.setVisibility(8);
        addView(this.f22047a0, w7.x5.e(108, 36, 51));
        this.f22078y = new yi0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        t10 t10Var = new t10(this, context);
        this.f22076x = t10Var;
        t10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var), PorterDuff.Mode.SRC_IN));
        this.f22076x.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f22076x.setAnimation(this.f22078y);
        this.f22076x.setScaleType(scaleType);
        this.f22076x.setVisibility(8);
        addView(this.f22076x, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.f22076x.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f25519b;

            {
                this.f25519b = this;
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
                FragmentContextView fragmentContextView = this.f25519b;
                switch (i14) {
                    case 0:
                        ah ahVar = fragmentContextView.f22062n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f22065p0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                            c2Var.R = string;
                            if (o2Var instanceof org.telegram.ui.wy) {
                                c2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ahVar.g();
                                TLRPC.User i15 = ahVar.i();
                                if (g10 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new j10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19101q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ah ahVar2 = fragmentContextView.f22062n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f22065p0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f689b;
                                int i17 = d2Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f690c, j10)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new h8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new h8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ahVar2 != null) {
                                    j11 = ahVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f22062n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                o2Var2.presentFragment(new org.telegram.ui.bo(bundle), o2Var2 instanceof org.telegram.ui.bo);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ahVar2 != null) {
                                j3 = ahVar2.a();
                                i122 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new dv0(fragmentContextView.getContext(), new j10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.k60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = ahVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.bo boVar = (org.telegram.ui.bo) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(boVar.a()) != null) {
                                w40 w40Var = new w40(fragmentContextView.getContext(), null, boVar, f6Var3);
                                w40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                o2Var2.showDialog(w40Var);
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
                            yi0 yi0Var = fragmentContextView.f22078y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yi0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f22078y.M(0);
                                } else {
                                    fragmentContextView.f22078y.M(14);
                                }
                            }
                            fragmentContextView.f22076x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f22046a.f(true);
                            try {
                                fragmentContextView.f22076x.performHapticFeedback(3, 2);
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
            public final FragmentContextView f25519b;

            {
                this.f25519b = this;
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
                FragmentContextView fragmentContextView = this.f25519b;
                switch (i14) {
                    case 0:
                        ah ahVar = fragmentContextView.f22062n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f22065p0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                            c2Var.R = string;
                            if (o2Var instanceof org.telegram.ui.wy) {
                                c2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ahVar.g();
                                TLRPC.User i15 = ahVar.i();
                                if (g10 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new j10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19101q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ah ahVar2 = fragmentContextView.f22062n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f22065p0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f689b;
                                int i17 = d2Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f690c, j10)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new h8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new h8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ahVar2 != null) {
                                    j11 = ahVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f22062n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                o2Var2.presentFragment(new org.telegram.ui.bo(bundle), o2Var2 instanceof org.telegram.ui.bo);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ahVar2 != null) {
                                j3 = ahVar2.a();
                                i122 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new dv0(fragmentContextView.getContext(), new j10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.k60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = ahVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.bo boVar = (org.telegram.ui.bo) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(boVar.a()) != null) {
                                w40 w40Var = new w40(fragmentContextView.getContext(), null, boVar, f6Var3);
                                w40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                o2Var2.showDialog(w40Var);
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
                            yi0 yi0Var = fragmentContextView.f22078y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yi0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f22078y.M(0);
                                } else {
                                    fragmentContextView.f22078y.M(14);
                                }
                            }
                            fragmentContextView.f22076x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f22046a.f(true);
                            try {
                                fragmentContextView.f22076x.performHapticFeedback(3, 2);
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
        this.f22069s = x5Var;
        addView(x5Var, w7.x5.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f25519b;

            {
                this.f25519b = this;
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
                FragmentContextView fragmentContextView = this.f25519b;
                switch (i14) {
                    case 0:
                        ah ahVar = fragmentContextView.f22062n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f22065p0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                            c2Var.R = string;
                            if (o2Var instanceof org.telegram.ui.wy) {
                                c2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ahVar.g();
                                TLRPC.User i15 = ahVar.i();
                                if (g10 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new j10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19101q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ah ahVar2 = fragmentContextView.f22062n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f22065p0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            ai.d2 d2Var = ai.d2.W;
                            if (d2Var != null) {
                                long j10 = d2Var.f689b;
                                int i17 = d2Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d2Var.f690c, j10)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new h8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new h8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ahVar2 != null) {
                                    j11 = ahVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f22062n.F(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                o2Var2.presentFragment(new org.telegram.ui.bo(bundle), o2Var2 instanceof org.telegram.ui.bo);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ahVar2 != null) {
                                j3 = ahVar2.a();
                                i122 = o2Var2.getCurrentAccount();
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
                                o2Var2.showDialog(new dv0(fragmentContextView.getContext(), new j10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.k60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = ahVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.f2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.bo boVar = (org.telegram.ui.bo) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(boVar.a()) != null) {
                                w40 w40Var = new w40(fragmentContextView.getContext(), null, boVar, f6Var3);
                                w40Var.setOnHideListener(new b1(fragmentContextView, 6));
                                o2Var2.showDialog(w40Var);
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
                            yi0 yi0Var = fragmentContextView.f22078y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (yi0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f22078y.M(0);
                                } else {
                                    fragmentContextView.f22078y.M(14);
                                }
                            }
                            fragmentContextView.f22076x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f22046a.f(true);
                            try {
                                fragmentContextView.f22076x.performHapticFeedback(3, 2);
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
        ah ahVar = this.f22062n;
        if (ahVar != null) {
            if (!this.S || ((i10 = this.T) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.o2 o2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = o2Var.getSendMessagesHelper().getImportingHistory(ahVar.a());
                View fragmentView = o2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = o2Var.getVisibleDialog();
                if ((j() || ahVar.m() || ((visibleDialog instanceof w40) && !((w40) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f22071t0;
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
                        AnimatorSet animatorSet = this.f22054f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f22054f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f22054f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f22054f.setDuration(220L);
                        this.f22054f.setInterpolator(qr.f27383f);
                        this.f22054f.addListener(new o10(this, 4));
                        this.f22054f.start();
                        return;
                    }
                    int i11 = this.T;
                    if (i11 == -1 || i11 == 5) {
                        this.S = false;
                        setVisibility(8);
                    }
                } else if (this.T != 5 && this.f22054f != null && !z10) {
                    this.f22079y0 = true;
                } else {
                    s(5);
                    if (z10 && this.R == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        v10 v10Var = this.f22064o0;
                        if (v10Var != null) {
                            ((sq0) v10Var).a(true);
                            ((sq0) this.f22064o0).a(false);
                        }
                    }
                    if (!this.S) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f22054f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f22054f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f22054f = new AnimatorSet();
                            v10 v10Var2 = this.f22064o0;
                            if (v10Var2 != null) {
                                ((sq0) v10Var2).a(true);
                            }
                            this.f22054f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f22054f.setDuration(200L);
                            this.f22054f.addListener(new o10(this, 5));
                            this.f22054f.start();
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
        org.telegram.ui.ActionBar.o2 o2Var = this.h;
        View fragmentView = o2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = o2Var instanceof org.telegram.ui.wy;
        if (z11) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(o2Var.getCurrentAccount()).isSharingLocation(this.f22062n.a());
        }
        org.telegram.ui.Cells.l7 l7Var = this.f22070s0;
        if (!isSharingLocation) {
            this.f22068r0 = -1;
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
                AnimatorSet animatorSet = this.f22054f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f22054f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f22054f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f22054f.setDuration(200L);
                this.f22054f.addListener(new o10(this, 0));
                this.f22054f.start();
                return;
            }
            return;
        }
        b();
        s(2);
        this.f22048b.setImageDrawable(new jq0(getContext(), 1));
        if (z10 && this.R == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.S) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f22054f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f22054f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f22054f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f22054f.setDuration(200L);
                this.f22054f.addListener(new o10(this, 1));
                this.f22054f.start();
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
            spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19158t7, this.f22065p0)), indexOf, string2.length() + indexOf, 18);
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
            ah ahVar = this.f22062n;
            if (i10 == i13) {
                if (ahVar != null) {
                    if (ahVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.didEndCall) {
                int i14 = NotificationCenter.didStartedCall;
                if (i10 != i14 && i10 != NotificationCenter.groupCallUpdated && i10 != NotificationCenter.groupCallVisibilityChanged) {
                    if (i10 == NotificationCenter.groupCallTypingsUpdated) {
                        b();
                        if (this.S && this.T == 4) {
                            ChatObject.Call groupCall = ahVar.getGroupCall();
                            if (groupCall != null && this.e != null) {
                                if (groupCall.isScheduled()) {
                                    this.e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    int i15 = groupCall2.participants_count;
                                    if (i15 == 0) {
                                        r10 r10Var = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            i12 = R.string.ViewersWatchingNobody;
                                        } else {
                                            i12 = R.string.MembersTalkingNobody;
                                        }
                                        r10Var.b(LocaleController.getString(i12), false);
                                    } else {
                                        r10 r10Var2 = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        r10Var2.b(LocaleController.formatPluralString(str, i15, new Object[0]), false);
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
                        gd gdVar = this.f22046a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.F0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.F0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.j6.D0().a(Math.max(this.E0, this.F0));
                                gdVar.d(Math.max(this.E0, this.F0));
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
                                org.telegram.ui.ActionBar.j6.D0().a(Math.max(this.E0, this.F0));
                                gdVar.d(Math.max(this.E0, this.F0));
                            }
                            this.f22047a0.invalidate();
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
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f22076x != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f22076x.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
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
        AnimationNotificationsLocker animationNotificationsLocker = this.f22071t0;
        int i10 = 0;
        if (d2Var != null) {
            b();
            int i11 = this.T;
            if (6 != i11 && this.f22054f != null && !z10) {
                this.f22075w0 = true;
                return;
            } else if (6 != i11 && this.S && !z10) {
                AnimatorSet animatorSet = this.f22054f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f22054f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f22054f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f22054f.setDuration(220L);
                this.f22054f.setInterpolator(qr.f27383f);
                this.f22054f.addListener(new o10(this, 7));
                this.f22054f.start();
                return;
            } else {
                s(6);
                if (!this.S) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f22054f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f22054f = null;
                        }
                        this.f22054f = new AnimatorSet();
                        this.f22072u0.lock();
                        this.f22054f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f22054f.setDuration(220L);
                        this.f22054f.setInterpolator(qr.f27383f);
                        this.f22054f.addListener(new o10(this, 8));
                        this.f22054f.start();
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
                    AnimatorSet animatorSet4 = this.f22054f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f22054f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f22054f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f22054f.setDuration(220L);
                    this.f22054f.setInterpolator(qr.f27383f);
                    this.f22054f.addListener(new o10(this, 6));
                    this.f22054f.start();
                }
            } else if (z11 && this.T == -1) {
                this.S = false;
                setVisibility(8);
            }
        }
        ai.d2 d2Var2 = ai.d2.W;
        if (d2Var2 != null && this.T == 6) {
            r10 r10Var = this.d;
            TLRPC.GroupCall groupCall = d2Var2.v;
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
        ah ahVar = this.f22062n;
        if (ahVar != null && this.d != null) {
            b();
            long a2 = ahVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
            if (!this.f22066q0) {
                LocationController.getInstance(currentAccount).loadLiveLocations(a2);
                this.f22066q0 = true;
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
            if (this.f22068r0 != i10) {
                this.f22068r0 = i10;
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
                        spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19158t7, this.f22065p0)), indexOf, string.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        ah ahVar;
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
        AnimationNotificationsLocker animationNotificationsLocker = this.f22071t0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i11 = this.T;
            if (i11 != 0 && this.f22054f != null && !z10) {
                this.f22077x0 = true;
                return;
            }
            s(0);
            if (z10 && this.R == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                v10 v10Var = this.f22064o0;
                if (v10Var != null) {
                    ((sq0) v10Var).a(true);
                    ((sq0) this.f22064o0).a(false);
                }
            }
            if (!this.S) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f22054f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f22054f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f22054f = new AnimatorSet();
                    v10 v10Var2 = this.f22064o0;
                    if (v10Var2 != null) {
                        ((sq0) v10Var2).a(true);
                    }
                    this.f22054f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f22054f.setDuration(200L);
                    this.f22054f.addListener(new o10(this, 3));
                    this.f22054f.start();
                }
                this.S = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f22050c.a(false, !z10);
                this.f22048b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f22050c.a(true, !z10);
                this.f22048b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
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
                org.telegram.ui.ActionBar.w0 w0Var = this.F;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
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
                r(false);
            }
            spannableStringBuilder.setSpan(new g51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19158t7, this.f22065p0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.V) ? false : false);
            return;
        }
        this.Q = null;
        if (this.W && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !z20.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (ahVar = this.f22062n) != null && !z20.c()) {
            ChatObject.Call groupCall = ahVar.getGroupCall();
            if (groupCall != null && groupCall.shouldShowPanel()) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            a(false);
        } else if (this.S) {
            org.telegram.ui.ActionBar.w0 w0Var2 = this.F;
            if (w0Var2 != null && w0Var2.t()) {
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
            AnimatorSet animatorSet2 = this.f22054f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f22054f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f22054f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f22054f.setDuration(200L);
            v10 v10Var3 = this.f22064o0;
            if (v10Var3 != null) {
                ((sq0) v10Var3).a(true);
            }
            this.f22054f.addListener(new o10(this, 2));
            this.f22054f.start();
        } else {
            setVisibility(8);
        }
    }

    public gd getCapsuleBlobDrawable() {
        return this.f22046a;
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
        int i10 = org.telegram.ui.ActionBar.j6.f18970j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22065p0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false, this.f22065p0);
        this.F = w0Var;
        w0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.F.setLongClickEnabled(false);
        this.F.setVisibility(8);
        this.F.setTag(null);
        this.F.setShowSubmenuByMove(false);
        this.F.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.F.setDelegate(new j10(this));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.F;
        cd cdVar = new cd();
        this.G = cdVar;
        w0Var2.setIcon(cdVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), f6Var);
        this.H = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        this.H.setDrawShadow(true);
        this.H.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.u0 u10 = this.F.u(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.u0[] u0VarArr = this.I;
        u0VarArr[0] = u10;
        u0VarArr[1] = this.F.u(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        u0VarArr[2] = this.F.u(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        u0VarArr[3] = this.F.u(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        u0VarArr[4] = this.F.u(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        u0VarArr[5] = this.F.u(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.F.setPadding(0, 1, 0, 0);
        }
        this.F.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.F, w7.x5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.F.setOnClickListener(new dt(3, this, fArr));
        this.F.setOnLongClickListener(new m10(this, 0));
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
            org.telegram.ui.ActionBar.o2 o2Var = this.h;
            if (o2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) o2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.kd0 kd0Var = new org.telegram.ui.kd0(2);
                kd0Var.u0(sharingLocationInfo.messageObject);
                kd0Var.F0 = new ai.z1(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.p0(kd0Var);
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
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, cd.a(f10));
                i10 = R.raw.speed_1to15;
            } else if (z10 && i(f10, 2.0f) && i(f7, 1.5f)) {
                formatString = LocaleController.getString(R.string.AudioSpeedFast);
                i10 = R.raw.speed_15to2;
            } else {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, cd.a(f10));
                if (f10 < 1.0f) {
                    i10 = R.raw.speed_slow;
                } else {
                    i10 = R.raw.speed_fast;
                }
            }
            vc.a0(this.h).Q(i10, 36, formatString).j();
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
        if (hVar != null && hVar.f28946g >= 1.0f) {
            this.G0 = false;
            AndroidUtilities.runOnUIThread(new n10(this, 0), 150L);
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
        if (!z10 && (valueAnimator = this.f22047a0.f24900a.f24585f) != null) {
            valueAnimator.cancel();
            this.f22047a0.f24900a.f24585f = null;
        }
        h9 h9Var = this.f22047a0.f24900a;
        if (h9Var.f24585f == null) {
            int i12 = this.T;
            int i13 = this.m0;
            ah ahVar = this.f22062n;
            if (i12 == 4) {
                if (ahVar != null) {
                    call = ahVar.getGroupCall();
                    i13 = this.h.getCurrentAccount();
                } else {
                    call = null;
                }
                i10 = i13;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                call = VoIPService.getSharedInstance().groupCall;
                if (ahVar != null) {
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
                        this.f22047a0.b(i15, call.sortedParticipants.get(i15), i10);
                    } else {
                        this.f22047a0.b(i15, null, i10);
                    }
                }
            } else if (user != null) {
                this.f22047a0.b(0, user, i10);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.f22047a0.b(i16, null, i10);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.f22047a0.b(i17, null, i10);
                }
            }
            this.f22047a0.a(z10);
            if (this.T == 4 && call != null) {
                if (!call.call.rtmp_stream) {
                    i14 = Math.min(3, call.sortedParticipants.size());
                }
                if (i14 == 0) {
                    g10 = 10;
                } else {
                    g10 = hg.k0.g(i14, 1, 24, 52);
                }
                int i18 = g10 + 3;
                if (z10) {
                    int i19 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (AndroidUtilities.dp(i18) != i19) {
                        float translationX = (this.d.getTranslationX() + i19) - AndroidUtilities.dp(f7);
                        this.d.setTranslationX(translationX);
                        this.e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        qr qrVar = qr.f27383f;
                        duration.setInterpolator(qrVar);
                        this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(qrVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
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
                r10 r10Var2 = this.e;
                if (call.isScheduled()) {
                    i20 = 90;
                }
                r10Var2.setLayoutParams(w7.x5.d(-1, 20.0f, 51, f10, 25.0f, i20, 0.0f));
                return;
            }
            return;
        }
        h9Var.f24586g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m();
        int i10 = 15;
        if (this.f22063n0) {
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
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !z20.c()) {
                a(true);
            } else {
                ah ahVar = this.f22062n;
                if (ahVar != null && this.h.getSendMessagesHelper().getImportingHistory(ahVar.a()) != null && !j()) {
                    c(true);
                } else if (ahVar != null && ahVar.getGroupCall() != null && ahVar.getGroupCall().shouldShowPanel() && !z20.c() && !j()) {
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
            if (i12 == 4 && !this.f22060k0) {
                this.f22060k0 = true;
                this.f22061l0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.j6.D0().f29817l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            gd gdVar = this.f22046a;
            if (!gdVar.f24190u) {
                gdVar.f24190u = true;
                gdVar.f24189t = SystemClock.elapsedRealtime();
                yf.h.d().a(60, gdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.O != z10 && this.f22076x != null) {
                this.O = z10;
                yi0 yi0Var = this.f22078y;
                if (!z10) {
                    i10 = 29;
                }
                yi0Var.P(i10);
                yi0 yi0Var2 = this.f22078y;
                yi0Var2.N(yi0Var2.f30229f - 1, false, true);
                this.f22076x.invalidate();
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
        gd gdVar = this.f22046a;
        if (z11 != z10) {
            this.O = z10;
            yi0 yi0Var = this.f22078y;
            if (z10) {
                i10 = 15;
            } else {
                i10 = 29;
            }
            yi0Var.P(i10);
            yi0 yi0Var2 = this.f22078y;
            yi0Var2.N(yi0Var2.f30229f - 1, false, true);
            this.f22076x.invalidate();
            org.telegram.ui.ActionBar.j6.D0().c(this.S);
            gdVar.f(this.S);
        }
        if (this.O) {
            this.F0 = 0.0f;
            org.telegram.ui.ActionBar.j6.D0().a(0.0f);
            gdVar.d(0.0f);
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
        AnimatorSet animatorSet = this.f22054f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f22054f = null;
        }
        if (this.f22060k0) {
            AndroidUtilities.cancelRunOnUIThread(this.f22061l0);
            this.f22060k0 = false;
        }
        this.S = false;
        this.f22071t0.unlock();
        this.R = 0.0f;
        m();
        if (!this.f22063n0) {
            for (int i10 = 0; i10 < 4; i10++) {
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i11 = this.T;
        if (i11 == 3 || i11 == 1) {
            x10 D0 = org.telegram.ui.ActionBar.j6.D0();
            ArrayList arrayList = D0.f29817l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.f29810b;
                D0.f29810b = null;
                D0.f29811c = null;
            }
            gd gdVar = this.f22046a;
            if (gdVar.f24190u) {
                gdVar.f24190u = false;
                yf.h.d().f(gdVar.F);
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
        if (this.f22069s != null) {
            int i10 = this.T;
            if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
                this.N0++;
                if (!groupCallMessage.isOut()) {
                    this.M0.i(new u10(this.f22069s, groupCallMessage), true);
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
                    ah ahVar = this.f22062n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (ahVar != null && ahVar.g() != null && ahVar.g().f18121id == sharedInstance.getChat().f18121id) {
                            TLRPC.Chat g10 = ahVar.g();
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
                        if (ahVar != null && ahVar.i() != null && ahVar.i().f18268id == user.f18268id) {
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
        g51[] g51VarArr;
        TextView nextTextView2;
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.V), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.j6.Qh;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f19229x7;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f22065p0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        cd cdVar = this.G;
        if (cdVar != null) {
            ((m6) cdVar.f23026c).r(v02);
            Paint paint = (Paint) cdVar.f23025b;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.F;
        if (w0Var != null) {
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.f22048b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19212w7, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19229x7, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                r10 r10Var = this.e;
                if (i11 == 0) {
                    nextTextView2 = r10Var.getTextView();
                } else {
                    nextTextView2 = r10Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19229x7, f6Var));
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
                        if ((text instanceof Spanned) && (g51VarArr = (g51[]) ((Spanned) text).getSpans(0, text.length(), g51.class)) != null) {
                            for (g51 g51Var : g51VarArr) {
                                g51Var.f24094b = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19158t7, f6Var);
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
        boolean z11 = this.f22080z0;
        int i10 = 0;
        this.f22080z0 = false;
        while (true) {
            org.telegram.ui.ActionBar.u0[] u0VarArr = this.I;
            if (i10 < u0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f22065p0;
                if (!z11 && Math.abs(playbackSpeed - O0[i10]) < 0.05f) {
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
            gd gdVar = this.f22046a;
            boolean z12 = true;
            if (i15 == 3 || i15 == 1) {
                x10 D0 = org.telegram.ui.ActionBar.j6.D0();
                ArrayList arrayList = D0.f29817l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    D0.d = D0.f29810b;
                    D0.f29810b = null;
                    D0.f29811c = null;
                }
                if (gdVar.f24190u) {
                    gdVar.f24190u = false;
                    yf.h.d().f(gdVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                le.l lVar = this.M0;
                if (lVar != null) {
                    lVar.i(null, true);
                }
            }
            this.T = i10;
            q10 q10Var = this.f22067r;
            if (i10 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            q10Var.setWillNotDraw(z10);
            if (i10 != 4) {
                this.f22056g0 = false;
            }
            i9 i9Var = this.f22047a0;
            if (i9Var != null) {
                i9Var.setStyle(this.T);
                this.f22047a0.setLayoutParams(w7.x5.e(108, getStyleHeight(), 51));
            }
            this.f22067r.setLayoutParams(w7.x5.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f7 = this.R;
            if (f7 > 0.0f && f7 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f22065p0;
            if (i10 == 6) {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f22067r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nk, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ok, f6Var)}));
                this.f22067r.setTag(null);
                this.e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(8);
                this.f22048b.setVisibility(8);
                this.f22076x.setVisibility(8);
                this.f22074w.setVisibility(8);
                this.f22074w.i();
                this.f22047a0.setVisibility(8);
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
                this.f22067r.setBackgroundColor(0);
                this.f22067r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f19194v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    r10 r10Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = r10Var2.getTextView();
                    } else {
                        nextTextView4 = r10Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        nextTextView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19176u7, f6Var));
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f19176u7));
                this.e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(8);
                this.f22048b.setVisibility(8);
                this.f22076x.setVisibility(8);
                this.f22047a0.setVisibility(8);
                this.f22074w.setVisibility(0);
                this.f22074w.d();
                this.E.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.w0 w0Var = this.F;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    this.F.setTag(null);
                }
                this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    this.f22067r.setBackgroundColor(0);
                    this.f22067r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f19194v7));
                    this.f22076x.setVisibility(8);
                    this.e.setVisibility(0);
                    for (int i18 = 0; i18 < 2; i18++) {
                        r10 r10Var3 = this.d;
                        if (i18 == 0) {
                            nextTextView3 = r10Var3.getTextView();
                        } else {
                            nextTextView3 = r10Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            nextTextView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19158t7, f6Var));
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f19158t7));
                    this.d.setPadding(0, 0, this.M, 0);
                    this.f22074w.setVisibility(8);
                    this.f22074w.i();
                    ah ahVar = this.f22062n;
                    z12 = (ahVar == null || ahVar.getGroupCall() == null || ahVar.getGroupCall().call == null || !ahVar.getGroupCall().call.rtmp_stream) ? false : false;
                    i9 i9Var2 = this.f22047a0;
                    if (!z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    i9Var2.setVisibility(i14);
                    if (this.f22047a0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.E.setVisibility(8);
                    this.f22048b.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.F;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                        this.F.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.v.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    i9 i9Var3 = this.f22047a0;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    i9Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f22047a0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    t10 t10Var = this.f22076x;
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
                    yi0 yi0Var = this.f22078y;
                    if (z11) {
                        i13 = 15;
                    } else {
                        i13 = 29;
                    }
                    yi0Var.P(i13);
                    yi0 yi0Var2 = this.f22078y;
                    yi0Var2.N(yi0Var2.f30229f - 1, false, true);
                    this.f22076x.invalidate();
                    this.f22067r.setBackground(null);
                    this.f22067r.setBackgroundColor(0);
                    this.f22074w.setVisibility(8);
                    this.f22074w.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.j6.D0().f29817l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!gdVar.f24190u) {
                        gdVar.f24190u = true;
                        gdVar.f24189t = SystemClock.elapsedRealtime();
                        yf.h.d().a(60, gdVar.F);
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
                    this.f22048b.setVisibility(8);
                    this.e.setVisibility(8);
                    this.L.setVisibility(8);
                    this.d.setLayoutParams(w7.x5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.M, 0);
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.F;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        this.F.setTag(null);
                    }
                }
            } else {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f22067r.setBackgroundColor(0);
                this.f22067r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f19194v7));
                this.e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(0);
                this.f22048b.setVisibility(0);
                this.f22076x.setVisibility(8);
                this.f22074w.setVisibility(8);
                this.f22074w.i();
                this.f22047a0.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    r10 r10Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = r10Var5.getTextView();
                    } else {
                        nextTextView = r10Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19176u7, f6Var));
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f19176u7));
                if (i10 == 6) {
                    this.f22048b.setLayoutParams(w7.x5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.E.setVisibility(8);
                } else if (i10 == 0) {
                    this.f22048b.setLayoutParams(w7.x5.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.F;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(0);
                        this.F.setTag(1);
                    }
                    this.E.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f22048b.setLayoutParams(w7.x5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.x5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.E.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(v10 v10Var) {
        this.f22064o0 = v10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.J0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.f22067r == null) {
            this.L0 = f7;
            return;
        }
        ImageView imageView = this.f22048b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        bj0 bj0Var = this.f22074w;
        if (bj0Var != null) {
            bj0Var.setTranslationX(f7);
        }
        r10 r10Var = this.d;
        if (r10Var != null) {
            r10Var.setTranslationX(f7);
        }
        r10 r10Var2 = this.e;
        if (r10Var2 != null) {
            r10Var2.setTranslationX(f7);
        }
        i9 i9Var = this.f22047a0;
        if (i9Var != null) {
            i9Var.setTranslationX(f7);
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

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.o2 o2Var, View view, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22046a = new gd();
        this.I = new org.telegram.ui.ActionBar.u0[6];
        this.P = -1;
        this.T = -1;
        this.W = true;
        this.f22058i0 = new m6(false, true, true, false);
        this.f22061l0 = new p10(this);
        this.m0 = UserConfig.selectedAccount;
        this.f22068r0 = -1;
        this.f22070s0 = new org.telegram.ui.Cells.l7(this, 13);
        this.f22071t0 = new AnimationNotificationsLocker();
        this.f22072u0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.C0 = new NotificationCenter.ObserversGroup[4];
        this.I0 = new Paint(1);
        this.K0 = 0;
        this.M0 = new le.l(new j10(this), qr.h, 450L);
        this.N0 = 0;
        this.f22065p0 = f6Var;
        this.h = o2Var;
        if (o2Var instanceof ah) {
            this.f22062n = (ah) o2Var;
        }
        this.S = true;
        this.f22063n0 = z10;
        if (view == null) {
            ((ViewGroup) o2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
