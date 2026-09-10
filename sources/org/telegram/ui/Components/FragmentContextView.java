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
    public org.telegram.ui.kj A0;
    public long B0;
    public float C0;
    public float D0;
    public ImageView E;
    public boolean E0;
    public org.telegram.ui.ActionBar.w0 F;
    public boolean F0;
    public dd G;
    public final Paint G0;
    public org.telegram.ui.ActionBar.c1 H;
    public boolean H0;
    public final org.telegram.ui.ActionBar.u0[] I;
    public int I0;
    public FrameLayout J;
    public float J0;
    public ImageView K;
    public final le.l K0;
    public org.telegram.ui.uk L;
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
    public final hd f21118a;
    public j9 f21119a0;
    public ImageView f21120b;
    public Paint f21121b0;
    public pg0 f21122c;
    public LinearGradient f21123c0;
    public a20 d;
    public Matrix f21124d0;
    public a20 e;
    public int f21125e0;
    public AnimatorSet f21126f;
    public TextPaint f21127f0;
    public boolean f21128g0;
    public final org.telegram.ui.ActionBar.p2 h;
    public boolean f21129h0;
    public final n6 f21130i0;
    public xc f21131j0;
    public boolean f21132k0;
    public final y10 f21133l0;
    public final int m0;
    public final eh f21134n;
    public final boolean f21135n0;
    public e20 f21136o0;
    public final org.telegram.ui.ActionBar.f6 f21137p0;
    public boolean f21138q0;
    public z10 f21139r;
    public int f21140r0;
    public bi.l4 f21141s;
    public final org.telegram.ui.Cells.l9 f21142s0;
    public final AnimationNotificationsLocker f21143t0;
    public final AnimationNotificationsLocker f21144u0;
    public View v;
    public boolean f21145v0;
    public kj0 f21146w;
    public boolean f21147w0;
    public c20 f21148x;
    public boolean f21149x0;
    public hj0 f21150y;
    public boolean f21151y0;
    public boolean f21152z0;

    public FragmentContextView(Context context, org.telegram.ui.wy wyVar, boolean z10) {
        this(context, wyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.T;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21137p0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18219t7, f6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18237u7, f6Var);
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
        if (this.f21139r != null) {
            return;
        }
        Context context = getContext();
        z10 z10Var = new z10(this, context);
        this.f21139r = z10Var;
        this.f21131j0 = new xc(z10Var);
        int i10 = AndroidUtilities.displaySize.x;
        n6 n6Var = this.f21130i0;
        n6Var.G = i10;
        n6Var.v = 0.4f;
        n6Var.setCallback(z10Var);
        n6Var.r(-1);
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.u(AndroidUtilities.bold());
        addView(this.f21139r, w7.a6.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.f21139r.addView(view, w7.a6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f21120b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f21120b;
        int i11 = org.telegram.ui.ActionBar.j6.f18272w7;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21137p0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.f21120b;
        pg0 pg0Var = new pg0(16);
        this.f21122c = pg0Var;
        imageView3.setImageDrawable(pg0Var);
        this.f21120b.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i11, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f21120b, w7.a6.e(36, 36, 51));
        this.f21120b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f26897b;

            {
                this.f26897b = this;
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
                FragmentContextView fragmentContextView = this.f26897b;
                switch (i14) {
                    case 0:
                        eh ehVar = fragmentContextView.f21134n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f21137p0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                            d2Var.R = string;
                            if (p2Var instanceof org.telegram.ui.wy) {
                                d2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ehVar.g();
                                TLRPC.User i15 = ehVar.i();
                                if (g10 != null) {
                                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        eh ehVar2 = fragmentContextView.f21134n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f21137p0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            zh.t0 t0Var = zh.t0.W;
                            if (t0Var != null) {
                                long j10 = t0Var.f48879b;
                                int i17 = t0Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(t0Var.f48880c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j11 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new j8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ehVar2 != null) {
                                    j11 = ehVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f21134n.E(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                p2Var2.presentFragment(new org.telegram.ui.eo(bundle), p2Var2 instanceof org.telegram.ui.eo);
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
                                i12 = p2Var2.getCurrentAccount();
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
                                p2Var2.showDialog(new mv0(fragmentContextView.getContext(), new r10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.j60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (p2Var2.getParentActivity() != null && (groupCall = ehVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.e2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var2;
                            if (p2Var2.getSendMessagesHelper().getImportingHistory(eoVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, eoVar, f6Var3);
                                g50Var.setOnHideListener(new d1(fragmentContextView, 6));
                                p2Var2.showDialog(g50Var);
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
                            hj0 hj0Var = fragmentContextView.f21150y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (hj0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f21150y.M(0);
                                } else {
                                    fragmentContextView.f21150y.M(14);
                                }
                            }
                            fragmentContextView.f21148x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f21118a.f(true);
                            try {
                                fragmentContextView.f21148x.performHapticFeedback(3, 2);
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
        this.f21146w = imageView4;
        imageView4.setScaleType(scaleType);
        this.f21146w.setAutoRepeat(true);
        this.f21146w.f(R.raw.import_progress, 30, 30, null);
        this.f21146w.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        addView(this.f21146w, w7.a6.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        a20 a20Var = new a20(this, context, context, 0);
        this.d = a20Var;
        addView(a20Var, w7.a6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        a20 a20Var2 = new a20(this, context, context, 1);
        this.e = a20Var2;
        addView(a20Var2, w7.a6.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.N = hVar;
        hVar.f28148g = 1.0f;
        hVar.f28150j = false;
        org.telegram.ui.uk ukVar = new org.telegram.ui.uk(this, context, 1);
        this.L = ukVar;
        ukVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.L.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, f6Var));
        org.telegram.ui.uk ukVar2 = this.L;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Qh, f6Var);
        ukVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.L.setTextSize(1, 14.0f);
        this.L.setTypeface(AndroidUtilities.bold());
        this.L.setGravity(17);
        this.L.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.L, w7.a6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f26897b;

            {
                this.f26897b = this;
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
                FragmentContextView fragmentContextView = this.f26897b;
                switch (i14) {
                    case 0:
                        eh ehVar = fragmentContextView.f21134n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f21137p0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                            d2Var.R = string;
                            if (p2Var instanceof org.telegram.ui.wy) {
                                d2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ehVar.g();
                                TLRPC.User i15 = ehVar.i();
                                if (g10 != null) {
                                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        eh ehVar2 = fragmentContextView.f21134n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f21137p0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            zh.t0 t0Var = zh.t0.W;
                            if (t0Var != null) {
                                long j10 = t0Var.f48879b;
                                int i17 = t0Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(t0Var.f48880c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j11 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new j8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ehVar2 != null) {
                                    j11 = ehVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f21134n.E(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                p2Var2.presentFragment(new org.telegram.ui.eo(bundle), p2Var2 instanceof org.telegram.ui.eo);
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
                                i12 = p2Var2.getCurrentAccount();
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
                                p2Var2.showDialog(new mv0(fragmentContextView.getContext(), new r10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.j60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (p2Var2.getParentActivity() != null && (groupCall = ehVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.e2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var2;
                            if (p2Var2.getSendMessagesHelper().getImportingHistory(eoVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, eoVar, f6Var3);
                                g50Var.setOnHideListener(new d1(fragmentContextView, 6));
                                p2Var2.showDialog(g50Var);
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
                            hj0 hj0Var = fragmentContextView.f21150y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (hj0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f21150y.M(0);
                                } else {
                                    fragmentContextView.f21150y.M(14);
                                }
                            }
                            fragmentContextView.f21148x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f21118a.f(true);
                            try {
                                fragmentContextView.f21148x.performHapticFeedback(3, 2);
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
        int i12 = org.telegram.ui.ActionBar.j6.f18290x7;
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), mode));
        this.J.addView(this.K, w7.a6.e(20, 20, 17));
        this.J.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.J.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.J.setOnClickListener(new bi.d5(10));
        this.J.setVisibility(8);
        addView(this.J, w7.a6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f21135n0) {
            h();
        }
        j9 j9Var = new j9(context, false);
        this.f21119a0 = j9Var;
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.f21119a0.setDelegate(new w10(this, 1));
        this.f21119a0.setVisibility(8);
        addView(this.f21119a0, w7.a6.e(108, 36, 51));
        this.f21150y = new hj0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        c20 c20Var = new c20(this, context);
        this.f21148x = c20Var;
        c20Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var), PorterDuff.Mode.SRC_IN));
        this.f21148x.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f21148x.setAnimation(this.f21150y);
        this.f21148x.setScaleType(scaleType);
        this.f21148x.setVisibility(8);
        addView(this.f21148x, w7.a6.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.f21148x.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f26897b;

            {
                this.f26897b = this;
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
                FragmentContextView fragmentContextView = this.f26897b;
                switch (i14) {
                    case 0:
                        eh ehVar = fragmentContextView.f21134n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f21137p0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                            d2Var.R = string;
                            if (p2Var instanceof org.telegram.ui.wy) {
                                d2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ehVar.g();
                                TLRPC.User i15 = ehVar.i();
                                if (g10 != null) {
                                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        eh ehVar2 = fragmentContextView.f21134n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f21137p0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            zh.t0 t0Var = zh.t0.W;
                            if (t0Var != null) {
                                long j10 = t0Var.f48879b;
                                int i17 = t0Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(t0Var.f48880c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j11 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new j8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ehVar2 != null) {
                                    j11 = ehVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f21134n.E(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                p2Var2.presentFragment(new org.telegram.ui.eo(bundle), p2Var2 instanceof org.telegram.ui.eo);
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
                                i122 = p2Var2.getCurrentAccount();
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
                                p2Var2.showDialog(new mv0(fragmentContextView.getContext(), new r10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.j60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (p2Var2.getParentActivity() != null && (groupCall = ehVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.e2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var2;
                            if (p2Var2.getSendMessagesHelper().getImportingHistory(eoVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, eoVar, f6Var3);
                                g50Var.setOnHideListener(new d1(fragmentContextView, 6));
                                p2Var2.showDialog(g50Var);
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
                            hj0 hj0Var = fragmentContextView.f21150y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (hj0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f21150y.M(0);
                                } else {
                                    fragmentContextView.f21150y.M(14);
                                }
                            }
                            fragmentContextView.f21148x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f21118a.f(true);
                            try {
                                fragmentContextView.f21148x.performHapticFeedback(3, 2);
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
        addView(this.E, w7.a6.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f26897b;

            {
                this.f26897b = this;
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
                FragmentContextView fragmentContextView = this.f26897b;
                switch (i14) {
                    case 0:
                        eh ehVar = fragmentContextView.f21134n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f21137p0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                            d2Var.R = string;
                            if (p2Var instanceof org.telegram.ui.wy) {
                                d2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ehVar.g();
                                TLRPC.User i15 = ehVar.i();
                                if (g10 != null) {
                                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        eh ehVar2 = fragmentContextView.f21134n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f21137p0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            zh.t0 t0Var = zh.t0.W;
                            if (t0Var != null) {
                                long j10 = t0Var.f48879b;
                                int i17 = t0Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(t0Var.f48880c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j11 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new j8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ehVar2 != null) {
                                    j11 = ehVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f21134n.E(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                p2Var2.presentFragment(new org.telegram.ui.eo(bundle), p2Var2 instanceof org.telegram.ui.eo);
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
                                i122 = p2Var2.getCurrentAccount();
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
                                p2Var2.showDialog(new mv0(fragmentContextView.getContext(), new r10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.j60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (p2Var2.getParentActivity() != null && (groupCall = ehVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.e2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var2;
                            if (p2Var2.getSendMessagesHelper().getImportingHistory(eoVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, eoVar, f6Var3);
                                g50Var.setOnHideListener(new d1(fragmentContextView, 6));
                                p2Var2.showDialog(g50Var);
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
                            hj0 hj0Var = fragmentContextView.f21150y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (hj0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f21150y.M(0);
                                } else {
                                    fragmentContextView.f21150y.M(14);
                                }
                            }
                            fragmentContextView.f21148x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f21118a.f(true);
                            try {
                                fragmentContextView.f21148x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        bi.l4 l4Var = new bi.l4(getContext(), 14);
        this.f21141s = l4Var;
        addView(l4Var, w7.a6.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f26897b;

            {
                this.f26897b = this;
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
                FragmentContextView fragmentContextView = this.f26897b;
                switch (i14) {
                    case 0:
                        eh ehVar = fragmentContextView.f21134n;
                        org.telegram.ui.ActionBar.f6 f6Var2 = fragmentContextView.f21137p0;
                        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
                        if (fragmentContextView.T == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, f6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                            d2Var.R = string;
                            if (p2Var instanceof org.telegram.ui.wy) {
                                d2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ehVar.g();
                                TLRPC.User i15 = ehVar.i();
                                if (g10 != null) {
                                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    d2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new r10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, f6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        eh ehVar2 = fragmentContextView.f21134n;
                        org.telegram.ui.ActionBar.f6 f6Var3 = fragmentContextView.f21137p0;
                        org.telegram.ui.ActionBar.p2 p2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.T;
                        if (i16 == 6) {
                            zh.t0 t0Var = zh.t0.W;
                            if (t0Var != null) {
                                long j10 = t0Var.f48879b;
                                int i17 = t0Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(t0Var.f48880c, j10)) != null) {
                                    u10.dialogId = j10;
                                    U.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), u10, null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        long j11 = 0;
                        if (i16 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (p2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new j8(findActivity, f6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.G1)) {
                                        new j8(LaunchActivity.G1, f6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ehVar2 != null) {
                                    j11 = ehVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j11) {
                                    fragmentContextView.f21134n.E(playingMessageObject.getId(), 0, 0, 0, false, true);
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
                                p2Var2.presentFragment(new org.telegram.ui.eo(bundle), p2Var2 instanceof org.telegram.ui.eo);
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
                                i122 = p2Var2.getCurrentAccount();
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
                                p2Var2.showDialog(new mv0(fragmentContextView.getContext(), new r10(fragmentContextView), f6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.j60.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (p2Var2.getParentActivity() != null && (groupCall = ehVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = p2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.e2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), p2Var2.getParentActivity(), p2Var2, p2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var2;
                            if (p2Var2.getSendMessagesHelper().getImportingHistory(eoVar.a()) != null) {
                                g50 g50Var = new g50(fragmentContextView.getContext(), null, eoVar, f6Var3);
                                g50Var.setOnHideListener(new d1(fragmentContextView, 6));
                                p2Var2.showDialog(g50Var);
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
                            hj0 hj0Var = fragmentContextView.f21150y;
                            if (fragmentContextView.O) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (hj0Var.P(i13)) {
                                if (fragmentContextView.O) {
                                    fragmentContextView.f21150y.M(0);
                                } else {
                                    fragmentContextView.f21150y.M(14);
                                }
                            }
                            fragmentContextView.f21148x.d();
                            org.telegram.ui.ActionBar.j6.D0().c(true);
                            fragmentContextView.f21118a.f(true);
                            try {
                                fragmentContextView.f21148x.performHapticFeedback(3, 2);
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
        eh ehVar = this.f21134n;
        if (ehVar != null) {
            if (!this.S || ((i10 = this.T) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.p2 p2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = p2Var.getSendMessagesHelper().getImportingHistory(ehVar.a());
                View fragmentView = p2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = p2Var.getVisibleDialog();
                if ((j() || ehVar.m() || ((visibleDialog instanceof g50) && !((g50) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f21143t0;
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
                        AnimatorSet animatorSet = this.f21126f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f21126f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f21126f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f21126f.setDuration(220L);
                        this.f21126f.setInterpolator(wr.f28819f);
                        this.f21126f.addListener(new x10(this, 4));
                        this.f21126f.start();
                        return;
                    }
                    int i11 = this.T;
                    if (i11 == -1 || i11 == 5) {
                        this.S = false;
                        setVisibility(8);
                    }
                } else if (this.T != 5 && this.f21126f != null && !z10) {
                    this.f21151y0 = true;
                } else {
                    r(5);
                    if (z10 && this.R == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        e20 e20Var = this.f21136o0;
                        if (e20Var != null) {
                            ((cr0) e20Var).a(true);
                            ((cr0) this.f21136o0).a(false);
                        }
                    }
                    if (!this.S) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f21126f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f21126f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f21126f = new AnimatorSet();
                            e20 e20Var2 = this.f21136o0;
                            if (e20Var2 != null) {
                                ((cr0) e20Var2).a(true);
                            }
                            this.f21126f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f21126f.setDuration(200L);
                            this.f21126f.addListener(new x10(this, 5));
                            this.f21126f.start();
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
        org.telegram.ui.ActionBar.p2 p2Var = this.h;
        View fragmentView = p2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = p2Var instanceof org.telegram.ui.wy;
        if (z11) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(p2Var.getCurrentAccount()).isSharingLocation(this.f21134n.a());
        }
        org.telegram.ui.Cells.l9 l9Var = this.f21142s0;
        if (!isSharingLocation) {
            this.f21140r0 = -1;
            AndroidUtilities.cancelRunOnUIThread(l9Var);
            if (this.S) {
                this.S = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f21126f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f21126f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f21126f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f21126f.setDuration(200L);
                this.f21126f.addListener(new x10(this, 0));
                this.f21126f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f21120b.setImageDrawable(new tq0(getContext(), 1));
        if (z10 && this.R == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.S) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f21126f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f21126f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f21126f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f21126f.setDuration(200L);
                this.f21126f.addListener(new x10(this, 1));
                this.f21126f.start();
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
                a20 a20Var = this.d;
                if (i11 == 0) {
                    nextTextView = a20Var.getTextView();
                } else {
                    nextTextView = a20Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18219t7, this.f21137p0)), indexOf, string2.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        l9Var.run();
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
            eh ehVar = this.f21134n;
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
                        if (this.S && this.T == 4) {
                            ChatObject.Call groupCall = ehVar.getGroupCall();
                            if (groupCall != null && this.e != null) {
                                if (groupCall.isScheduled()) {
                                    this.e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    int i15 = groupCall2.participants_count;
                                    if (i15 == 0) {
                                        a20 a20Var = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            i12 = R.string.ViewersWatchingNobody;
                                        } else {
                                            i12 = R.string.MembersTalkingNobody;
                                        }
                                        a20Var.b(LocaleController.getString(i12), false);
                                    } else {
                                        a20 a20Var2 = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        a20Var2.b(LocaleController.formatPluralString(str, i15, new Object[0]), false);
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
                        hd hdVar = this.f21118a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.D0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.D0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.j6.D0().a(Math.max(this.C0, this.D0));
                                hdVar.d(Math.max(this.C0, this.D0));
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
                                hdVar.d(Math.max(this.C0, this.D0));
                            }
                            this.f21119a0.invalidate();
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
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f21148x != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f21148x.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
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
        zh.t0 t0Var = zh.t0.W;
        AnimationNotificationsLocker animationNotificationsLocker = this.f21143t0;
        int i10 = 0;
        if (t0Var != null) {
            b();
            int i11 = this.T;
            if (6 != i11 && this.f21126f != null && !z10) {
                this.f21147w0 = true;
                return;
            } else if (6 != i11 && this.S && !z10) {
                AnimatorSet animatorSet = this.f21126f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f21126f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f21126f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f21126f.setDuration(220L);
                this.f21126f.setInterpolator(wr.f28819f);
                this.f21126f.addListener(new x10(this, 7));
                this.f21126f.start();
                return;
            } else {
                r(6);
                if (!this.S) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f21126f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f21126f = null;
                        }
                        this.f21126f = new AnimatorSet();
                        this.f21144u0.lock();
                        this.f21126f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f21126f.setDuration(220L);
                        this.f21126f.setInterpolator(wr.f28819f);
                        this.f21126f.addListener(new x10(this, 8));
                        this.f21126f.start();
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
                    AnimatorSet animatorSet4 = this.f21126f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f21126f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f21126f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f21126f.setDuration(220L);
                    this.f21126f.setInterpolator(wr.f28819f);
                    this.f21126f.addListener(new x10(this, 6));
                    this.f21126f.start();
                }
            } else if (z11 && this.T == -1) {
                this.S = false;
                setVisibility(8);
            }
        }
        zh.t0 t0Var2 = zh.t0.W;
        if (t0Var2 != null && this.T == 6) {
            a20 a20Var = this.d;
            TLRPC.GroupCall groupCall = t0Var2.v;
            if (groupCall != null) {
                i10 = groupCall.participants_count;
            }
            a20Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, i10)));
        }
    }

    public final void f() {
        int i10;
        String format;
        TextView nextTextView;
        eh ehVar = this.f21134n;
        if (ehVar != null && this.d != null) {
            b();
            long a2 = ehVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
            if (!this.f21138q0) {
                LocationController.getInstance(currentAccount).loadLiveLocations(a2);
                this.f21138q0 = true;
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
            if (this.f21140r0 != i10) {
                this.f21140r0 = i10;
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
                        a20 a20Var = this.d;
                        if (i13 == 0) {
                            nextTextView = a20Var.getTextView();
                        } else {
                            nextTextView = a20Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18219t7, this.f21137p0)), indexOf, string.length() + indexOf, 18);
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
        AnimationNotificationsLocker animationNotificationsLocker = this.f21143t0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i11 = this.T;
            if (i11 != 0 && this.f21126f != null && !z10) {
                this.f21149x0 = true;
                return;
            }
            r(0);
            if (z10 && this.R == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                e20 e20Var = this.f21136o0;
                if (e20Var != null) {
                    ((cr0) e20Var).a(true);
                    ((cr0) this.f21136o0).a(false);
                }
            }
            if (!this.S) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f21126f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f21126f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f21126f = new AnimatorSet();
                    e20 e20Var2 = this.f21136o0;
                    if (e20Var2 != null) {
                        ((cr0) e20Var2).a(true);
                    }
                    this.f21126f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f21126f.setDuration(200L);
                    this.f21126f.addListener(new x10(this, 3));
                    this.f21126f.start();
                }
                this.S = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f21122c.a(false, !z10);
                this.f21120b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f21122c.a(true, !z10);
                this.f21120b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
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
                    a20 a20Var = this.d;
                    if (i12 == 0) {
                        nextTextView2 = a20Var.getTextView();
                    } else {
                        nextTextView2 = a20Var.getNextTextView();
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
                    a20 a20Var2 = this.d;
                    if (i13 == 0) {
                        nextTextView = a20Var2.getTextView();
                    } else {
                        nextTextView = a20Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold(), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18219t7, this.f21137p0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.V) ? false : false);
            return;
        }
        this.Q = null;
        if (this.W && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !j30.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (ehVar = this.f21134n) != null && !j30.c()) {
            ChatObject.Call groupCall = ehVar.getGroupCall();
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
            AnimatorSet animatorSet2 = this.f21126f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f21126f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f21126f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f21126f.setDuration(200L);
            e20 e20Var3 = this.f21136o0;
            if (e20Var3 != null) {
                ((cr0) e20Var3).a(true);
            }
            this.f21126f.addListener(new x10(this, 2));
            this.f21126f.start();
        } else {
            setVisibility(8);
        }
    }

    public hd getCapsuleBlobDrawable() {
        return this.f21118a;
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
        int i10 = org.telegram.ui.ActionBar.j6.f18034j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21137p0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false, this.f21137p0);
        this.F = w0Var;
        w0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.F.setLongClickEnabled(false);
        this.F.setVisibility(8);
        this.F.setTag(null);
        this.F.setShowSubmenuByMove(false);
        this.F.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.F.setDelegate(new r10(this));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.F;
        dd ddVar = new dd();
        this.G = ddVar;
        w0Var2.setIcon(ddVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), f6Var);
        this.H = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        this.H.setDrawShadow(true);
        this.H.setOnValueChange(new e(this, 13));
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
        addView(this.F, w7.a6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.F.setOnClickListener(new u10(0, this, fArr));
        this.F.setOnLongClickListener(new v10(this, 0));
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
            org.telegram.ui.ActionBar.p2 p2Var = this.h;
            if (p2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) p2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.id0 id0Var = new org.telegram.ui.id0(2);
                id0Var.u0(sharingLocationInfo.messageObject);
                id0Var.F0 = new bi.za(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 4);
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
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, dd.a(f10));
                i10 = R.raw.speed_1to15;
            } else if (z10 && i(f10, 2.0f) && i(f7, 1.5f)) {
                formatString = LocaleController.getString(R.string.AudioSpeedFast);
                i10 = R.raw.speed_15to2;
            } else {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, dd.a(f10));
                if (f10 < 1.0f) {
                    i10 = R.raw.speed_slow;
                } else {
                    i10 = R.raw.speed_fast;
                }
            }
            wc.a0(this.h).Q(i10, 36, formatString).j();
        }
    }

    public final void m() {
        org.telegram.ui.Components.voip.h hVar = this.N;
        if (hVar != null && hVar.f28148g >= 1.0f) {
            this.E0 = false;
            AndroidUtilities.runOnUIThread(new w10(this, 0), 150L);
            return;
        }
        this.E0 = true;
    }

    public final void n(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        int B;
        int i11;
        float f7;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.f21119a0.f24315a.f23938f) != null) {
            valueAnimator.cancel();
            this.f21119a0.f24315a.f23938f = null;
        }
        i9 i9Var = this.f21119a0.f24315a;
        if (i9Var.f23938f == null) {
            int i12 = this.T;
            int i13 = this.m0;
            eh ehVar = this.f21134n;
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
                        this.f21119a0.b(i15, call.sortedParticipants.get(i15), i10);
                    } else {
                        this.f21119a0.b(i15, null, i10);
                    }
                }
            } else if (user != null) {
                this.f21119a0.b(0, user, i10);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.f21119a0.b(i16, null, i10);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.f21119a0.b(i17, null, i10);
                }
            }
            this.f21119a0.a(z10);
            if (this.T == 4 && call != null) {
                if (!call.call.rtmp_stream) {
                    i14 = Math.min(3, call.sortedParticipants.size());
                }
                if (i14 == 0) {
                    B = 10;
                } else {
                    B = hc.b.B(i14, 1, 24, 52);
                }
                int i18 = B + 3;
                if (z10) {
                    int i19 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (AndroidUtilities.dp(i18) != i19) {
                        float translationX = (this.d.getTranslationX() + i19) - AndroidUtilities.dp(f7);
                        this.d.setTranslationX(translationX);
                        this.e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        wr wrVar = wr.f28819f;
                        duration.setInterpolator(wrVar);
                        this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(wrVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
                }
                a20 a20Var = this.d;
                float f10 = i18;
                int i20 = 36;
                if (call.isScheduled()) {
                    i11 = 90;
                } else {
                    i11 = 36;
                }
                a20Var.setLayoutParams(w7.a6.d(-1, 20.0f, 51, f10, 5.0f, i11, 0.0f));
                a20 a20Var2 = this.e;
                if (call.isScheduled()) {
                    i20 = 90;
                }
                a20Var2.setLayoutParams(w7.a6.d(-1, 20.0f, 51, f10, 25.0f, i20, 0.0f));
                return;
            }
            return;
        }
        i9Var.f23939g = true;
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
                    eh ehVar = this.f21134n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (ehVar != null && ehVar.g() != null && ehVar.g().f17195id == sharedInstance.getChat().f17195id) {
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
                        if (ehVar != null && ehVar.i() != null && ehVar.i().f17342id == user.f17342id) {
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
        if (this.f21135n0) {
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
            if (zh.t0.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !j30.c()) {
                a(true);
            } else {
                eh ehVar = this.f21134n;
                if (ehVar != null && this.h.getSendMessagesHelper().getImportingHistory(ehVar.a()) != null && !j()) {
                    c(true);
                } else if (ehVar != null && ehVar.getGroupCall() != null && ehVar.getGroupCall().shouldShowPanel() && !j30.c() && !j()) {
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
            if (i12 == 4 && !this.f21132k0) {
                this.f21132k0 = true;
                this.f21133l0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.j6.D0().f23222l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            hd hdVar = this.f21118a;
            if (!hdVar.f23592u) {
                hdVar.f23592u = true;
                hdVar.f23591t = SystemClock.elapsedRealtime();
                xf.h.d().a(60, hdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.O != z10 && this.f21148x != null) {
                this.O = z10;
                hj0 hj0Var = this.f21150y;
                if (!z10) {
                    i10 = 29;
                }
                hj0Var.P(i10);
                hj0 hj0Var2 = this.f21150y;
                hj0Var2.N(hj0Var2.f23653f - 1, false, true);
                this.f21148x.invalidate();
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
        hd hdVar = this.f21118a;
        if (z11 != z10) {
            this.O = z10;
            hj0 hj0Var = this.f21150y;
            if (z10) {
                i10 = 15;
            } else {
                i10 = 29;
            }
            hj0Var.P(i10);
            hj0 hj0Var2 = this.f21150y;
            hj0Var2.N(hj0Var2.f23653f - 1, false, true);
            this.f21148x.invalidate();
            org.telegram.ui.ActionBar.j6.D0().c(this.S);
            hdVar.f(this.S);
        }
        if (this.O) {
            this.D0 = 0.0f;
            org.telegram.ui.ActionBar.j6.D0().a(0.0f);
            hdVar.d(0.0f);
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.x0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        org.telegram.messenger.voip.x0.c(this, z10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.f21126f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f21126f = null;
        }
        if (this.f21132k0) {
            AndroidUtilities.cancelRunOnUIThread(this.f21133l0);
            this.f21132k0 = false;
        }
        this.S = false;
        this.f21143t0.unlock();
        this.R = 0.0f;
        if (this.f21135n0) {
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
            g20 D0 = org.telegram.ui.ActionBar.j6.D0();
            ArrayList arrayList = D0.f23222l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.f23215b;
                D0.f23215b = null;
                D0.f23216c = null;
            }
            hd hdVar = this.f21118a;
            if (hdVar.f23592u) {
                hdVar.f23592u = false;
                xf.h.d().f(hdVar.F);
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
        org.telegram.messenger.voip.x0.d(this, i10, i11);
    }

    @Override
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.f21141s != null) {
            int i10 = this.T;
            if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j3) {
                this.L0++;
                if (!groupCallMessage.isOut()) {
                    this.K0.i(new d20(this.f21141s, groupCallMessage), true);
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
        org.telegram.messenger.voip.x0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.x0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        o();
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.x0.h(this, z10);
    }

    public final void p() {
        int i10;
        TextView nextTextView;
        s51[] s51VarArr;
        TextView nextTextView2;
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.V), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.j6.Qh;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18290x7;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f21137p0;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        dd ddVar = this.G;
        if (ddVar != null) {
            ((n6) ddVar.f22364c).r(v02);
            Paint paint = (Paint) ddVar.f22363b;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.F;
        if (w0Var != null) {
            w0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.f21120b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18272w7, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.E;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18290x7, f6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                a20 a20Var = this.e;
                if (i11 == 0) {
                    nextTextView2 = a20Var.getTextView();
                } else {
                    nextTextView2 = a20Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18290x7, f6Var));
                }
            }
        }
        a20 a20Var2 = this.d;
        if (a20Var2 != null) {
            Object tag = a20Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i12 = 0; i12 < 2; i12++) {
                    a20 a20Var3 = this.d;
                    if (i12 == 0) {
                        nextTextView = a20Var3.getTextView();
                    } else {
                        nextTextView = a20Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.j6.v0(intValue, f6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (s51VarArr = (s51[]) ((Spanned) text).getSpans(0, text.length(), s51.class)) != null) {
                            for (s51 s51Var : s51VarArr) {
                                s51Var.f26955b = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18219t7, f6Var);
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
        boolean z11 = this.f21152z0;
        int i10 = 0;
        this.f21152z0 = false;
        while (true) {
            org.telegram.ui.ActionBar.u0[] u0VarArr = this.I;
            if (i10 < u0VarArr.length) {
                org.telegram.ui.ActionBar.f6 f6Var = this.f21137p0;
                if (!z11 && Math.abs(playbackSpeed - M0[i10]) < 0.05f) {
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
            hd hdVar = this.f21118a;
            boolean z12 = true;
            if (i15 == 3 || i15 == 1) {
                g20 D0 = org.telegram.ui.ActionBar.j6.D0();
                ArrayList arrayList = D0.f23222l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    D0.d = D0.f23215b;
                    D0.f23215b = null;
                    D0.f23216c = null;
                }
                if (hdVar.f23592u) {
                    hdVar.f23592u = false;
                    xf.h.d().f(hdVar.F);
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
            z10 z10Var = this.f21139r;
            if (i10 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            z10Var.setWillNotDraw(z10);
            if (i10 != 4) {
                this.f21128g0 = false;
            }
            j9 j9Var = this.f21119a0;
            if (j9Var != null) {
                j9Var.setStyle(this.T);
                this.f21119a0.setLayoutParams(w7.a6.e(108, getStyleHeight(), 51));
            }
            this.f21139r.setLayoutParams(w7.a6.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f7 = this.R;
            if (f7 > 0.0f && f7 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.f21137p0;
            if (i10 == 6) {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f21139r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nk, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ok, f6Var)}));
                this.f21139r.setTag(null);
                this.e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(8);
                this.f21120b.setVisibility(8);
                this.f21148x.setVisibility(8);
                this.f21146w.setVisibility(8);
                this.f21146w.i();
                this.f21119a0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.A7));
                for (int i16 = 0; i16 < 2; i16++) {
                    a20 a20Var = this.d;
                    if (i16 == 0) {
                        nextTextView5 = a20Var.getTextView();
                    } else {
                        nextTextView5 = a20Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        nextTextView5.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, f6Var));
                        nextTextView5.setTypeface(AndroidUtilities.bold());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(w7.a6.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i10 == 5) {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f21139r.setBackgroundColor(0);
                this.f21139r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f18255v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    a20 a20Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = a20Var2.getTextView();
                    } else {
                        nextTextView4 = a20Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        nextTextView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18237u7, f6Var));
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f18237u7));
                this.e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(8);
                this.f21120b.setVisibility(8);
                this.f21148x.setVisibility(8);
                this.f21119a0.setVisibility(8);
                this.f21146w.setVisibility(0);
                this.f21146w.d();
                this.E.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.w0 w0Var = this.F;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    this.F.setTag(null);
                }
                this.d.setLayoutParams(w7.a6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    this.f21139r.setBackgroundColor(0);
                    this.f21139r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f18255v7));
                    this.f21148x.setVisibility(8);
                    this.e.setVisibility(0);
                    for (int i18 = 0; i18 < 2; i18++) {
                        a20 a20Var3 = this.d;
                        if (i18 == 0) {
                            nextTextView3 = a20Var3.getTextView();
                        } else {
                            nextTextView3 = a20Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            nextTextView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18219t7, f6Var));
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f18219t7));
                    this.d.setPadding(0, 0, this.M, 0);
                    this.f21146w.setVisibility(8);
                    this.f21146w.i();
                    eh ehVar = this.f21134n;
                    z12 = (ehVar == null || ehVar.getGroupCall() == null || ehVar.getGroupCall().call == null || !ehVar.getGroupCall().call.rtmp_stream) ? false : false;
                    j9 j9Var2 = this.f21119a0;
                    if (!z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    j9Var2.setVisibility(i14);
                    if (this.f21119a0.getVisibility() != 8) {
                        n(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.E.setVisibility(8);
                    this.f21120b.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.F;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                        this.F.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.v.setBackground(null);
                    o();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    j9 j9Var3 = this.f21119a0;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    j9Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f21119a0.getVisibility() != 8) {
                        n(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    c20 c20Var = this.f21148x;
                    if (!hasRtmpStream) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    c20Var.setVisibility(i12);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.O = z11;
                    hj0 hj0Var = this.f21150y;
                    if (z11) {
                        i13 = 15;
                    } else {
                        i13 = 29;
                    }
                    hj0Var.P(i13);
                    hj0 hj0Var2 = this.f21150y;
                    hj0Var2.N(hj0Var2.f23653f - 1, false, true);
                    this.f21148x.invalidate();
                    this.f21139r.setBackground(null);
                    this.f21139r.setBackgroundColor(0);
                    this.f21146w.setVisibility(8);
                    this.f21146w.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.j6.D0().f23222l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!hdVar.f23592u) {
                        hdVar.f23592u = true;
                        hdVar.f23591t = SystemClock.elapsedRealtime();
                        xf.h.d().a(60, hdVar.F);
                    }
                    invalidate();
                    for (int i19 = 0; i19 < 2; i19++) {
                        a20 a20Var4 = this.d;
                        if (i19 == 0) {
                            nextTextView2 = a20Var4.getTextView();
                        } else {
                            nextTextView2 = a20Var4.getNextTextView();
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
                    this.f21120b.setVisibility(8);
                    this.e.setVisibility(8);
                    this.L.setVisibility(8);
                    this.d.setLayoutParams(w7.a6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.M, 0);
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.F;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        this.F.setTag(null);
                    }
                }
            } else {
                this.v.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                this.f21139r.setBackgroundColor(0);
                this.f21139r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f18255v7));
                this.e.setVisibility(8);
                this.L.setVisibility(8);
                this.E.setVisibility(0);
                this.f21120b.setVisibility(0);
                this.f21148x.setVisibility(8);
                this.f21146w.setVisibility(8);
                this.f21146w.i();
                this.f21119a0.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    a20 a20Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = a20Var5.getTextView();
                    } else {
                        nextTextView = a20Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18237u7, f6Var));
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.j6.f18237u7));
                if (i10 == 6) {
                    this.f21120b.setLayoutParams(w7.a6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.a6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.E.setVisibility(8);
                } else if (i10 == 0) {
                    this.f21120b.setLayoutParams(w7.a6.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.a6.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.F;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(0);
                        this.F.setTag(1);
                    }
                    this.E.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f21120b.setLayoutParams(w7.a6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(w7.a6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.E.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(e20 e20Var) {
        this.f21136o0 = e20Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.H0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.f21139r == null) {
            this.J0 = f7;
            return;
        }
        ImageView imageView = this.f21120b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        kj0 kj0Var = this.f21146w;
        if (kj0Var != null) {
            kj0Var.setTranslationX(f7);
        }
        a20 a20Var = this.d;
        if (a20Var != null) {
            a20Var.setTranslationX(f7);
        }
        a20 a20Var2 = this.e;
        if (a20Var2 != null) {
            a20Var2.setTranslationX(f7);
        }
        j9 j9Var = this.f21119a0;
        if (j9Var != null) {
            j9Var.setTranslationX(f7);
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

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.p2 p2Var, View view, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21118a = new hd();
        this.I = new org.telegram.ui.ActionBar.u0[6];
        this.P = -1;
        this.T = -1;
        this.W = true;
        this.f21130i0 = new n6(false, true, true, false);
        this.f21133l0 = new y10(this);
        this.m0 = UserConfig.selectedAccount;
        this.f21140r0 = -1;
        this.f21142s0 = new org.telegram.ui.Cells.l9(this, 11);
        this.f21143t0 = new AnimationNotificationsLocker();
        this.f21144u0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.G0 = new Paint(1);
        this.I0 = 0;
        this.K0 = new le.l(new r10(this), wr.h, 450L);
        this.L0 = 0;
        this.f21137p0 = f6Var;
        this.h = p2Var;
        if (p2Var instanceof eh) {
            this.f21134n = (eh) p2Var;
        }
        this.S = true;
        this.f21135n0 = z10;
        if (view == null) {
            ((ViewGroup) p2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
