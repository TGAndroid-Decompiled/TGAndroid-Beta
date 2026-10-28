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
public class FragmentContextView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, GroupCallMessagesController.CallMessageListener, org.telegram.ui.ActionBar.p6 {
    public static final float[] W0 = {0.5f, 1.0f, 1.2f, 1.5f, 1.7f, 2.0f};
    public boolean A0;
    public e20 B0;
    public ViewGroup C0;
    public long D0;
    public yj0 E;
    public org.telegram.ui.Cells.y E0;
    public ImageView F;
    public PorterDuffColorFilter F0;
    public org.telegram.ui.ActionBar.w0 G;
    public PorterDuffColorFilter G0;
    public dd H;
    public int H0;
    public org.telegram.ui.ActionBar.c1 I;
    public int I0;
    public final org.telegram.ui.ActionBar.u0[] J;
    public int J0;
    public FrameLayout K;
    public final NotificationCenter.ObserversGroup[] K0;
    public ImageView L;
    public NotificationCenter.ObserversGroup L0;
    public org.telegram.ui.ok M;
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
    public final oe.l U0;
    public String V;
    public int V0;
    public boolean W;
    public final hd f26152a;
    public boolean f26153a0;
    public ImageView f26154b;
    public m9 f26155b0;
    public eh0 f26156c;
    public Paint f26157c0;
    public b20 d;
    public LinearGradient f26158d0;
    public b20 e;
    public Matrix f26159e0;
    public AnimatorSet f26160f;
    public int f26161f0;
    public TextPaint f26162g0;
    public final org.telegram.ui.ActionBar.r2 h;
    public boolean f26163h0;
    public boolean f26164i0;
    public final r6 f26165j0;
    public xc f26166k0;
    public boolean f26167l0;
    public final z10 m0;
    public final bh f26168n;
    public final int f26169n0;
    public final boolean f26170o0;
    public g20 f26171p0;
    public final org.telegram.ui.ActionBar.u6 f26172q0;
    public final View f26173r;
    public boolean f26174r0;
    public a20 f26175s;
    public int f26176s0;
    public final m.g3 f26177t0;
    public final AnimationNotificationsLocker f26178u0;
    public di.i4 v;
    public final AnimationNotificationsLocker f26179v0;
    public View f26180w;
    public boolean f26181w0;
    public bk0 f26182x;
    public boolean f26183x0;
    public d20 f26184y;
    public boolean f26185y0;
    public boolean f26186z0;

    public FragmentContextView(Context context, org.telegram.ui.ey eyVar, boolean z10) {
        this(context, eyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.U;
        org.telegram.ui.ActionBar.u6 u6Var = this.f26172q0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23656t7, u6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23675u7, u6Var);
        }
        return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.A7, u6Var);
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
        if (this.f26175s != null) {
            return;
        }
        Context context = getContext();
        a20 a20Var = new a20(this, context);
        this.f26175s = a20Var;
        this.f26166k0 = new xc(a20Var);
        int i10 = AndroidUtilities.displaySize.x;
        r6 r6Var = this.f26165j0;
        r6Var.M = i10;
        r6Var.A = 0.4f;
        r6Var.setCallback(a20Var);
        r6Var.u(-1);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.x(AndroidUtilities.bold());
        addView(this.f26175s, kb1.h(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.f26180w = view;
        this.f26175s.addView(view, kb1.g(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f26154b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f26154b;
        int i11 = org.telegram.ui.ActionBar.y6.f23713w7;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6 u6Var = this.f26172q0;
        org.telegram.ui.ActionBar.f7.t(imageView2, i11, u6Var, mode);
        ImageView imageView3 = this.f26154b;
        eh0 eh0Var = new eh0(16);
        this.f26156c = eh0Var;
        imageView3.setImageDrawable(eh0Var);
        this.f26154b.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i11, u6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f26154b, kb1.i(36, 36, 51));
        this.f26154b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f33191b;

            {
                this.f33191b = this;
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
                FragmentContextView fragmentContextView = this.f33191b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f26168n;
                        org.telegram.ui.ActionBar.u6 u6Var2 = fragmentContextView.f26172q0;
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                            e2Var.R = string;
                            if (r2Var instanceof org.telegram.ui.ey) {
                                e2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g7 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g7 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g7.title));
                                } else if (i15 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new t10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, u6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f26168n;
                        org.telegram.ui.ActionBar.u6 u6Var3 = fragmentContextView.f26172q0;
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            di.h1 h1Var = di.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f8604b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f8605c, j11)) != null) {
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
                            if (r2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new m8(findActivity, u6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.I1)) {
                                        new m8(LaunchActivity.I1, u6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26168n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                r2Var2.presentFragment(new org.telegram.ui.wn(bundle), r2Var2 instanceof org.telegram.ui.wn);
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
                                i12 = r2Var2.getCurrentAccount();
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
                                r2Var2.showDialog(new fw0(fragmentContextView.getContext(), new t10(fragmentContextView), u6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.x50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (r2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), r2Var2.getParentActivity(), r2Var2, r2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) r2Var2;
                            if (r2Var2.getSendMessagesHelper().getImportingHistory(wnVar.a()) != null) {
                                i50 i50Var = new i50(fragmentContextView.getContext(), null, wnVar, u6Var3);
                                i50Var.setOnHideListener(new z0(fragmentContextView, 7));
                                r2Var2.showDialog(i50Var);
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
                            fragmentContextView.f26184y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView.f26152a.h(true);
                            try {
                                fragmentContextView.f26184y.performHapticFeedback(3, 2);
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
        this.f26182x = imageView4;
        imageView4.setScaleType(scaleType);
        this.f26182x.setAutoRepeat(true);
        this.f26182x.f(R.raw.import_progress, 30, 30, null);
        org.telegram.ui.ActionBar.f7.C(this.f26182x, org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.y6.w0(i11, u6Var)), org.telegram.ui.ActionBar.f7.N(i11), u6Var);
        addView(this.f26182x, kb1.h(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        b20 b20Var = new b20(this, context, context, 0);
        this.d = b20Var;
        addView(b20Var, kb1.h(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        b20 b20Var2 = new b20(this, context, context, 1);
        this.e = b20Var2;
        addView(b20Var2, kb1.h(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.O = hVar;
        hVar.f33926g = 1.0f;
        hVar.f33928j = false;
        org.telegram.ui.ok okVar = new org.telegram.ui.ok(this, context, 1);
        this.M = okVar;
        okVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        org.telegram.ui.ActionBar.f7.V(this.M, org.telegram.ui.ActionBar.y6.Sh, u6Var);
        org.telegram.ui.ok okVar2 = this.M;
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i12, u6Var);
        int i13 = org.telegram.ui.ActionBar.y6.Qh;
        int w03 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
        org.telegram.ui.ActionBar.f7.R(okVar2, org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, w03, w03), org.telegram.ui.ActionBar.f7.N(i12), org.telegram.ui.ActionBar.f7.N(i13), u6Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setGravity(17);
        this.M.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.M, kb1.h(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f33191b;

            {
                this.f33191b = this;
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
                FragmentContextView fragmentContextView = this.f33191b;
                switch (i14) {
                    case 0:
                        bh bhVar = fragmentContextView.f26168n;
                        org.telegram.ui.ActionBar.u6 u6Var2 = fragmentContextView.f26172q0;
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                            e2Var.R = string;
                            if (r2Var instanceof org.telegram.ui.ey) {
                                e2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g7 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g7 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g7.title));
                                } else if (i15 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new t10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, u6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f26168n;
                        org.telegram.ui.ActionBar.u6 u6Var3 = fragmentContextView.f26172q0;
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            di.h1 h1Var = di.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f8604b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f8605c, j11)) != null) {
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
                            if (r2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new m8(findActivity, u6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.I1)) {
                                        new m8(LaunchActivity.I1, u6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26168n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                r2Var2.presentFragment(new org.telegram.ui.wn(bundle), r2Var2 instanceof org.telegram.ui.wn);
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
                                i122 = r2Var2.getCurrentAccount();
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
                                r2Var2.showDialog(new fw0(fragmentContextView.getContext(), new t10(fragmentContextView), u6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.x50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (r2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), r2Var2.getParentActivity(), r2Var2, r2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) r2Var2;
                            if (r2Var2.getSendMessagesHelper().getImportingHistory(wnVar.a()) != null) {
                                i50 i50Var = new i50(fragmentContextView.getContext(), null, wnVar, u6Var3);
                                i50Var.setOnHideListener(new z0(fragmentContextView, 7));
                                r2Var2.showDialog(i50Var);
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
                            fragmentContextView.f26184y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView.f26152a.h(true);
                            try {
                                fragmentContextView.f26184y.performHapticFeedback(3, 2);
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
        int i14 = org.telegram.ui.ActionBar.y6.f23733x7;
        org.telegram.ui.ActionBar.f7.t(imageView6, i14, u6Var, mode);
        this.K.addView(this.L, kb1.i(20, 20, 17));
        this.K.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i14, u6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.K.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.K.setOnClickListener(new bh.f(13));
        this.K.setVisibility(8);
        addView(this.K, kb1.h(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f26170o0) {
            h();
        }
        m9 m9Var = new m9(context, false);
        this.f26155b0 = m9Var;
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.f26155b0.setDelegate(new x10(this, 1));
        this.f26155b0.setVisibility(8);
        addView(this.f26155b0, kb1.i(108, 36, 51));
        this.E = new yj0(R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        d20 d20Var = new d20(this, context);
        this.f26184y = d20Var;
        org.telegram.ui.ActionBar.f7.t(d20Var, org.telegram.ui.ActionBar.y6.A7, u6Var, PorterDuff.Mode.SRC_IN);
        this.f26184y.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i14, u6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f26184y.setAnimation(this.E);
        this.f26184y.setScaleType(scaleType);
        this.f26184y.setVisibility(8);
        addView(this.f26184y, kb1.h(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.f26184y.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f33191b;

            {
                this.f33191b = this;
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
                FragmentContextView fragmentContextView = this.f33191b;
                switch (i142) {
                    case 0:
                        bh bhVar = fragmentContextView.f26168n;
                        org.telegram.ui.ActionBar.u6 u6Var2 = fragmentContextView.f26172q0;
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                            e2Var.R = string;
                            if (r2Var instanceof org.telegram.ui.ey) {
                                e2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g7 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g7 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g7.title));
                                } else if (i15 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new t10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, u6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f26168n;
                        org.telegram.ui.ActionBar.u6 u6Var3 = fragmentContextView.f26172q0;
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            di.h1 h1Var = di.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f8604b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f8605c, j11)) != null) {
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
                            if (r2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new m8(findActivity, u6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.I1)) {
                                        new m8(LaunchActivity.I1, u6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26168n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                r2Var2.presentFragment(new org.telegram.ui.wn(bundle), r2Var2 instanceof org.telegram.ui.wn);
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
                                i122 = r2Var2.getCurrentAccount();
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
                                r2Var2.showDialog(new fw0(fragmentContextView.getContext(), new t10(fragmentContextView), u6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.x50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (r2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), r2Var2.getParentActivity(), r2Var2, r2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) r2Var2;
                            if (r2Var2.getSendMessagesHelper().getImportingHistory(wnVar.a()) != null) {
                                i50 i50Var = new i50(fragmentContextView.getContext(), null, wnVar, u6Var3);
                                i50Var.setOnHideListener(new z0(fragmentContextView, 7));
                                r2Var2.showDialog(i50Var);
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
                            fragmentContextView.f26184y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView.f26152a.h(true);
                            try {
                                fragmentContextView.f26184y.performHapticFeedback(3, 2);
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
        org.telegram.ui.ActionBar.f7.t(this.F, i14, u6Var, mode);
        this.F.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i14, u6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.F.setScaleType(scaleType);
        addView(this.F, kb1.h(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f33191b;

            {
                this.f33191b = this;
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
                FragmentContextView fragmentContextView = this.f33191b;
                switch (i142) {
                    case 0:
                        bh bhVar = fragmentContextView.f26168n;
                        org.telegram.ui.ActionBar.u6 u6Var2 = fragmentContextView.f26172q0;
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                            e2Var.R = string;
                            if (r2Var instanceof org.telegram.ui.ey) {
                                e2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g7 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g7 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g7.title));
                                } else if (i15 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new t10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, u6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f26168n;
                        org.telegram.ui.ActionBar.u6 u6Var3 = fragmentContextView.f26172q0;
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            di.h1 h1Var = di.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f8604b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f8605c, j11)) != null) {
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
                            if (r2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new m8(findActivity, u6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.I1)) {
                                        new m8(LaunchActivity.I1, u6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26168n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                r2Var2.presentFragment(new org.telegram.ui.wn(bundle), r2Var2 instanceof org.telegram.ui.wn);
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
                                i122 = r2Var2.getCurrentAccount();
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
                                r2Var2.showDialog(new fw0(fragmentContextView.getContext(), new t10(fragmentContextView), u6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.x50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (r2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), r2Var2.getParentActivity(), r2Var2, r2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) r2Var2;
                            if (r2Var2.getSendMessagesHelper().getImportingHistory(wnVar.a()) != null) {
                                i50 i50Var = new i50(fragmentContextView.getContext(), null, wnVar, u6Var3);
                                i50Var.setOnHideListener(new z0(fragmentContextView, 7));
                                r2Var2.showDialog(i50Var);
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
                            fragmentContextView.f26184y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView.f26152a.h(true);
                            try {
                                fragmentContextView.f26184y.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        di.i4 i4Var = new di.i4(getContext(), 14);
        this.v = i4Var;
        addView(i4Var, kb1.h(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f33191b;

            {
                this.f33191b = this;
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
                FragmentContextView fragmentContextView = this.f33191b;
                switch (i142) {
                    case 0:
                        bh bhVar = fragmentContextView.f26168n;
                        org.telegram.ui.ActionBar.u6 u6Var2 = fragmentContextView.f26172q0;
                        org.telegram.ui.ActionBar.r2 r2Var = fragmentContextView.h;
                        if (fragmentContextView.U == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var.getParentActivity(), 0, u6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                            e2Var.R = string;
                            if (r2Var instanceof org.telegram.ui.ey) {
                                e2Var.T = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g7 = bhVar.g();
                                TLRPC.User i15 = bhVar.i();
                                if (g7 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g7.title));
                                } else if (i15 != null) {
                                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    e2Var.T = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new t10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, u6Var2);
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        bh bhVar2 = fragmentContextView.f26168n;
                        org.telegram.ui.ActionBar.u6 u6Var3 = fragmentContextView.f26172q0;
                        org.telegram.ui.ActionBar.r2 r2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.U;
                        if (i16 == 6) {
                            di.h1 h1Var = di.h1.W;
                            if (h1Var != null) {
                                long j11 = h1Var.f8604b;
                                int i17 = h1Var.e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity != null) {
                                        launchActivity.P0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(h1Var.f8605c, j11)) != null) {
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
                            if (r2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new m8(findActivity, u6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.I1)) {
                                        new m8(LaunchActivity.I1, u6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (bhVar2 != null) {
                                    j12 = bhVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26168n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                r2Var2.presentFragment(new org.telegram.ui.wn(bundle), r2Var2 instanceof org.telegram.ui.wn);
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
                                i122 = r2Var2.getCurrentAccount();
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
                                r2Var2.showDialog(new fw0(fragmentContextView.getContext(), new t10(fragmentContextView), u6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.x50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (r2Var2.getParentActivity() != null && (groupCall = bhVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = r2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.g2.l(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), r2Var2.getParentActivity(), r2Var2, r2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.wn wnVar = (org.telegram.ui.wn) r2Var2;
                            if (r2Var2.getSendMessagesHelper().getImportingHistory(wnVar.a()) != null) {
                                i50 i50Var = new i50(fragmentContextView.getContext(), null, wnVar, u6Var3);
                                i50Var.setOnHideListener(new z0(fragmentContextView, 7));
                                r2Var2.showDialog(i50Var);
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
                            fragmentContextView.f26184y.d();
                            org.telegram.ui.ActionBar.y6.F0().c(true);
                            fragmentContextView.f26152a.h(true);
                            try {
                                fragmentContextView.f26184y.performHapticFeedback(3, 2);
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
        bh bhVar = this.f26168n;
        if (bhVar != null) {
            if (!this.T || ((i10 = this.U) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.r2 r2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = r2Var.getSendMessagesHelper().getImportingHistory(bhVar.a());
                View fragmentView = r2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = r2Var.getVisibleDialog();
                if ((j() || bhVar.n() || ((visibleDialog instanceof i50) && !((i50) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f26178u0;
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
                        AnimatorSet animatorSet = this.f26160f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f26160f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f26160f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f26160f.setDuration(220L);
                        this.f26160f.setInterpolator(ds.f27530f);
                        this.f26160f.addListener(new y10(this, 4));
                        this.f26160f.start();
                        return;
                    }
                    int i11 = this.U;
                    if (i11 == -1 || i11 == 5) {
                        this.T = false;
                        setVisibility(8);
                    }
                } else if (this.U != 5 && this.f26160f != null && !z10) {
                    this.f26186z0 = true;
                } else {
                    r(5);
                    if (z10 && this.S == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        g20 g20Var = this.f26171p0;
                        if (g20Var != null) {
                            ((xr0) g20Var).a(true);
                            ((xr0) this.f26171p0).a(false);
                        }
                    }
                    if (!this.T) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f26160f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f26160f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f26160f = new AnimatorSet();
                            g20 g20Var2 = this.f26171p0;
                            if (g20Var2 != null) {
                                ((xr0) g20Var2).a(true);
                            }
                            this.f26160f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f26160f.setDuration(200L);
                            this.f26160f.addListener(new y10(this, 5));
                            this.f26160f.start();
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
        org.telegram.ui.ActionBar.r2 r2Var = this.h;
        View fragmentView = r2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = r2Var instanceof org.telegram.ui.ey;
        if (z11) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(r2Var.getCurrentAccount()).isSharingLocation(this.f26168n.a());
        }
        m.g3 g3Var = this.f26177t0;
        if (!isSharingLocation) {
            this.f26176s0 = -1;
            AndroidUtilities.cancelRunOnUIThread(g3Var);
            if (this.T) {
                this.T = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f26160f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26160f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26160f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f26160f.setDuration(200L);
                this.f26160f.addListener(new y10(this, 0));
                this.f26160f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f26154b.setImageDrawable(new or0(getContext(), 1));
        if (z10 && this.S == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.T) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f26160f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f26160f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f26160f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f26160f.setDuration(200L);
                this.f26160f.addListener(new y10(this, 1));
                this.f26160f.start();
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
                b20 b20Var = this.d;
                if (i11 == 0) {
                    nextTextView = b20Var.getTextView();
                } else {
                    nextTextView = b20Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23656t7, this.f26172q0)), indexOf, string2.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        g3Var.run();
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
            bh bhVar = this.f26168n;
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
                                        b20 b20Var = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            i12 = R.string.ViewersWatchingNobody;
                                        } else {
                                            i12 = R.string.MembersTalkingNobody;
                                        }
                                        b20Var.b(LocaleController.getString(i12), false);
                                    } else {
                                        b20 b20Var2 = this.e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        b20Var2.b(LocaleController.formatPluralString(str, i15, new Object[0]), false);
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
                        hd hdVar = this.f26152a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.N0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.N0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.y6.F0().a(Math.max(this.M0, this.N0));
                                hdVar.f(Math.max(this.M0, this.N0));
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
                                org.telegram.ui.ActionBar.y6.F0().a(Math.max(this.M0, this.N0));
                                hdVar.f(Math.max(this.M0, this.N0));
                            }
                            this.f26155b0.invalidate();
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
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f26184y != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f26184y.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
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
        di.h1 h1Var = di.h1.W;
        AnimationNotificationsLocker animationNotificationsLocker = this.f26178u0;
        int i10 = 0;
        if (h1Var != null) {
            b();
            int i11 = this.U;
            if (6 != i11 && this.f26160f != null && !z10) {
                this.f26183x0 = true;
                return;
            } else if (6 != i11 && this.T && !z10) {
                AnimatorSet animatorSet = this.f26160f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26160f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26160f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f26160f.setDuration(220L);
                this.f26160f.setInterpolator(ds.f27530f);
                this.f26160f.addListener(new y10(this, 7));
                this.f26160f.start();
                return;
            } else {
                r(6);
                if (!this.T) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f26160f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f26160f = null;
                        }
                        this.f26160f = new AnimatorSet();
                        this.f26179v0.lock();
                        this.f26160f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f26160f.setDuration(220L);
                        this.f26160f.setInterpolator(ds.f27530f);
                        this.f26160f.addListener(new y10(this, 8));
                        this.f26160f.start();
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
                    AnimatorSet animatorSet4 = this.f26160f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f26160f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f26160f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f26160f.setDuration(220L);
                    this.f26160f.setInterpolator(ds.f27530f);
                    this.f26160f.addListener(new y10(this, 6));
                    this.f26160f.start();
                }
            } else if (z11 && this.U == -1) {
                this.T = false;
                setVisibility(8);
            }
        }
        di.h1 h1Var2 = di.h1.W;
        if (h1Var2 != null && this.U == 6) {
            b20 b20Var = this.d;
            TLRPC.GroupCall groupCall = h1Var2.v;
            if (groupCall != null) {
                i10 = groupCall.participants_count;
            }
            b20Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, i10)));
        }
    }

    public final void f() {
        int i10;
        String format;
        TextView nextTextView;
        bh bhVar = this.f26168n;
        if (bhVar != null && this.d != null) {
            b();
            long a2 = bhVar.a();
            int currentAccount = this.h.getCurrentAccount();
            ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(a2);
            if (!this.f26174r0) {
                LocationController.getInstance(currentAccount).loadLiveLocations(a2);
                this.f26174r0 = true;
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
            if (this.f26176s0 != i10) {
                this.f26176s0 = i10;
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
                        b20 b20Var = this.d;
                        if (i13 == 0) {
                            nextTextView = b20Var.getTextView();
                        } else {
                            nextTextView = b20Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23656t7, this.f26172q0)), indexOf, string.length() + indexOf, 18);
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
        AnimationNotificationsLocker animationNotificationsLocker = this.f26178u0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i11 = this.U;
            if (i11 != 0 && this.f26160f != null && !z10) {
                this.f26185y0 = true;
                return;
            }
            r(0);
            if (z10 && this.S == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                g20 g20Var = this.f26171p0;
                if (g20Var != null) {
                    ((xr0) g20Var).a(true);
                    ((xr0) this.f26171p0).a(false);
                }
            }
            if (!this.T) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f26160f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f26160f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f26160f = new AnimatorSet();
                    g20 g20Var2 = this.f26171p0;
                    if (g20Var2 != null) {
                        ((xr0) g20Var2).a(true);
                    }
                    this.f26160f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f26160f.setDuration(200L);
                    this.f26160f.addListener(new y10(this, 3));
                    this.f26160f.start();
                }
                this.T = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f26156c.a(false, !z10);
                this.f26154b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f26156c.a(true, !z10);
                this.f26154b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
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
                    b20 b20Var = this.d;
                    if (i12 == 0) {
                        nextTextView2 = b20Var.getTextView();
                    } else {
                        nextTextView2 = b20Var.getNextTextView();
                    }
                    if (nextTextView2 != null) {
                        nextTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    }
                }
            } else {
                this.W = false;
                org.telegram.ui.ActionBar.w0 w0Var = this.G;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                    this.G.setEnabled(true);
                }
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.N, 0);
                spannableStringBuilder = new SpannableStringBuilder(a1.g.D(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
                for (int i13 = 0; i13 < 2; i13++) {
                    b20 b20Var2 = this.d;
                    if (i13 == 0) {
                        nextTextView = b20Var2.getTextView();
                    } else {
                        nextTextView = b20Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new r61(AndroidUtilities.bold(), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23656t7, this.f26172q0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.W) ? false : false);
            return;
        }
        this.R = null;
        if (this.f26153a0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !k30.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (bhVar = this.f26168n) != null && !k30.c()) {
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
            org.telegram.ui.ActionBar.w0 w0Var2 = this.G;
            if (w0Var2 != null && w0Var2.x()) {
                this.G.U(null, null);
            }
            this.T = false;
            if (z10) {
                if (getVisibility() != 8) {
                    setVisibility(8);
                }
                setTopPadding(0.0f);
                return;
            }
            AnimatorSet animatorSet2 = this.f26160f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f26160f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f26160f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f26160f.setDuration(200L);
            g20 g20Var3 = this.f26171p0;
            if (g20Var3 != null) {
                ((xr0) g20Var3).a(true);
            }
            this.f26160f.addListener(new y10(this, 2));
            this.f26160f.start();
        } else {
            setVisibility(8);
        }
    }

    public hd getCapsuleBlobDrawable() {
        return this.f26152a;
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
        int i10 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.u6 u6Var = this.f26172q0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), false, this.f26172q0);
        this.G = w0Var;
        if (w0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.f7.t(this.G.getIconView(), i10, u6Var, PorterDuff.Mode.SRC_IN);
        }
        this.G.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.G.setLongClickEnabled(false);
        this.G.setVisibility(8);
        this.G.setTag(null);
        this.G.setShowSubmenuByMove(false);
        this.G.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.G.setDelegate(new t10(this));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.G;
        dd ddVar = new dd();
        this.H = ddVar;
        w0Var2.setIcon(ddVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), u6Var);
        this.I = c1Var;
        c1Var.setRoundRadiusDp(6.0f);
        this.I.setDrawShadow(true);
        this.I.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.u0 z10 = this.G.z(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.u0[] u0VarArr = this.J;
        u0VarArr[0] = z10;
        u0VarArr[1] = this.G.z(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        u0VarArr[2] = this.G.z(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        u0VarArr[3] = this.G.z(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        u0VarArr[4] = this.G.z(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        u0VarArr[5] = this.G.z(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.G.setPadding(0, 1, 0, 0);
        }
        this.G.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.G, kb1.h(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.G.setOnClickListener(new ga(15, this, fArr));
        this.G.setOnLongClickListener(new w10(this, 0));
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
            org.telegram.ui.ActionBar.r2 r2Var = this.h;
            if (r2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) r2Var.getParentActivity();
                launchActivity.P0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.rc0 rc0Var = new org.telegram.ui.rc0(2);
                rc0Var.v0(sharingLocationInfo.messageObject);
                rc0Var.E0 = new di.d1(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.u0(rc0Var);
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
            wc.b0(this.h).R(i10, 36, formatString).j();
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
        if (hVar != null && hVar.f33926g >= 1.0f) {
            this.O0 = false;
            AndroidUtilities.runOnUIThread(new x10(this, 0), 150L);
            return;
        }
        this.O0 = true;
    }

    public final void o(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        int w10;
        int i11;
        float f7;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.f26155b0.f30469a.f30179f) != null) {
            valueAnimator.cancel();
            this.f26155b0.f30469a.f30179f = null;
        }
        l9 l9Var = this.f26155b0.f30469a;
        if (l9Var.f30179f == null) {
            int i12 = this.U;
            int i13 = this.f26169n0;
            bh bhVar = this.f26168n;
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
                        this.f26155b0.b(i15, call.sortedParticipants.get(i15), i10);
                    } else {
                        this.f26155b0.b(i15, null, i10);
                    }
                }
            } else if (user != null) {
                this.f26155b0.b(0, user, i10);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.f26155b0.b(i16, null, i10);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.f26155b0.b(i17, null, i10);
                }
            }
            this.f26155b0.a(z10);
            if (this.U == 4 && call != null) {
                if (!call.call.rtmp_stream) {
                    i14 = Math.min(3, call.sortedParticipants.size());
                }
                if (i14 == 0) {
                    w10 = 10;
                } else {
                    w10 = c3.h0.w(i14, 1, 24, 52);
                }
                int i18 = w10 + 3;
                if (z10) {
                    int i19 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (AndroidUtilities.dp(i18) != i19) {
                        float translationX = (this.d.getTranslationX() + i19) - AndroidUtilities.dp(f7);
                        this.d.setTranslationX(translationX);
                        this.e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        ds dsVar = ds.f27530f;
                        duration.setInterpolator(dsVar);
                        this.e.animate().translationX(0.0f).setDuration(220L).setInterpolator(dsVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.e.setTranslationX(0.0f);
                }
                b20 b20Var = this.d;
                float f10 = i18;
                int i20 = 36;
                if (call.isScheduled()) {
                    i11 = 90;
                } else {
                    i11 = 36;
                }
                b20Var.setLayoutParams(kb1.h(-1, 20.0f, 51, f10, 5.0f, i11, 0.0f));
                b20 b20Var2 = this.e;
                if (call.isScheduled()) {
                    i20 = 90;
                }
                b20Var2.setLayoutParams(kb1.h(-1, 20.0f, 51, f10, 25.0f, i20, 0.0f));
                return;
            }
            return;
        }
        l9Var.f30180g = true;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        m();
        int i10 = 15;
        if (this.f26170o0) {
            this.L0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.liveLocationsChanged).add(NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                this.K0[i11] = NotificationCenter.getInstance(i11).createObserversGroup(this).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.groupCallTypingsUpdated).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.liveStoryUpdated).add(NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i11).subscribeToCallMessages(0L, this);
            }
            this.L0 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.messagePlayingSpeedChanged).add(NotificationCenter.didStartedCall).add(NotificationCenter.didEndCall).add(NotificationCenter.webRtcSpeakerAmplitudeEvent).add(NotificationCenter.webRtcMicAmplitudeEvent).add(NotificationCenter.groupCallVisibilityChanged);
            if (di.h1.W != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !k30.c()) {
                a(true);
            } else {
                bh bhVar = this.f26168n;
                if (bhVar != null && this.h.getSendMessagesHelper().getImportingHistory(bhVar.a()) != null && !j()) {
                    c(true);
                } else if (bhVar != null && bhVar.getGroupCall() != null && bhVar.getGroupCall().shouldShowPanel() && !k30.c() && !j()) {
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
            if (i12 == 4 && !this.f26167l0) {
                this.f26167l0 = true;
                this.m0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.y6.F0().f29192l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            hd hdVar = this.f26152a;
            if (!hdVar.f28973u) {
                hdVar.f28973u = true;
                hdVar.f28972t = SystemClock.elapsedRealtime();
                ag.n.d().a(60, hdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.P != z10 && this.f26184y != null) {
                this.P = z10;
                yj0 yj0Var = this.E;
                if (!z10) {
                    i10 = 29;
                }
                yj0Var.P(i10);
                yj0 yj0Var2 = this.E;
                yj0Var2.N(yj0Var2.f35074f - 1, false, true);
                this.f26184y.invalidate();
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
        hd hdVar = this.f26152a;
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
            yj0Var2.N(yj0Var2.f35074f - 1, false, true);
            this.f26184y.invalidate();
            org.telegram.ui.ActionBar.y6.F0().c(this.T);
            hdVar.h(this.T);
        }
        if (this.P) {
            this.N0 = 0.0f;
            org.telegram.ui.ActionBar.y6.F0().a(0.0f);
            hdVar.f(0.0f);
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
        AnimatorSet animatorSet = this.f26160f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26160f = null;
        }
        if (this.f26167l0) {
            AndroidUtilities.cancelRunOnUIThread(this.m0);
            this.f26167l0 = false;
        }
        this.T = false;
        this.f26178u0.unlock();
        this.S = 0.0f;
        m();
        if (!this.f26170o0) {
            for (int i10 = 0; i10 < 4; i10++) {
                GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(0L, this);
            }
        }
        int i11 = this.U;
        if (i11 == 3 || i11 == 1) {
            i20 F0 = org.telegram.ui.ActionBar.y6.F0();
            ArrayList arrayList = F0.f29192l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                F0.d = F0.f29185b;
                F0.f29185b = null;
                F0.f29186c = null;
            }
            hd hdVar = this.f26152a;
            if (hdVar.f28973u) {
                hdVar.f28973u = false;
                ag.n.d().g(hdVar.F);
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
                    this.U0.h(new f20(this.v, groupCallMessage), true);
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
                    bh bhVar = this.f26168n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (bhVar != null && bhVar.g() != null && bhVar.g().f22028id == sharedInstance.getChat().f22028id) {
                            TLRPC.Chat g7 = bhVar.g();
                            if (VoIPService.hasRtmpStream()) {
                                this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                            } else if (ChatObject.isChannelOrGiga(g7)) {
                                this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                            } else {
                                this.d.b(LocaleController.getString(R.string.VoipGroupViewVoiceChat), false);
                            }
                        } else {
                            this.d.b(sharedInstance.getChat().title, false);
                        }
                    } else if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (bhVar != null && bhVar.i() != null && bhVar.i().f22177id == user.f22177id) {
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
            org.telegram.ui.ActionBar.u0[] u0VarArr = this.J;
            if (i10 < u0VarArr.length) {
                org.telegram.ui.ActionBar.u6 u6Var = this.f26172q0;
                if (!z11 && Math.abs(playbackSpeed - W0[i10]) < 0.05f) {
                    org.telegram.ui.ActionBar.u0 u0Var = u0VarArr[i10];
                    int i11 = org.telegram.ui.ActionBar.y6.Qh;
                    u0Var.a(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
                } else {
                    org.telegram.ui.ActionBar.u0 u0Var2 = u0VarArr[i10];
                    int i12 = org.telegram.ui.ActionBar.y6.E8;
                    u0Var2.a(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
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
            hd hdVar = this.f26152a;
            boolean z12 = true;
            if (i15 == 3 || i15 == 1) {
                i20 F0 = org.telegram.ui.ActionBar.y6.F0();
                ArrayList arrayList = F0.f29192l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    F0.d = F0.f29185b;
                    F0.f29185b = null;
                    F0.f29186c = null;
                }
                if (hdVar.f28973u) {
                    hdVar.f28973u = false;
                    ag.n.d().g(hdVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                oe.l lVar = this.U0;
                if (lVar != null) {
                    lVar.h(null, true);
                }
            }
            this.U = i10;
            a20 a20Var = this.f26175s;
            if (i10 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            a20Var.setWillNotDraw(z10);
            if (i10 != 4) {
                this.f26163h0 = false;
            }
            m9 m9Var = this.f26155b0;
            if (m9Var != null) {
                m9Var.setStyle(this.U);
                this.f26155b0.setLayoutParams(kb1.i(108, getStyleHeight(), 51));
            }
            this.f26175s.setLayoutParams(kb1.h(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f7 = this.S;
            if (f7 > 0.0f && f7 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.u6 u6Var = this.f26172q0;
            if (i10 == 6) {
                this.f26180w.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
                this.f26175s.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.nk, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ok, u6Var)}));
                this.f26175s.setTag(null);
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f26154b.setVisibility(8);
                this.f26184y.setVisibility(8);
                this.f26182x.setVisibility(8);
                this.f26182x.i();
                this.f26155b0.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.A7));
                for (int i16 = 0; i16 < 2; i16++) {
                    b20 b20Var = this.d;
                    if (i16 == 0) {
                        nextTextView5 = b20Var.getTextView();
                    } else {
                        nextTextView5 = b20Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        org.telegram.ui.ActionBar.f7.V(nextTextView5, org.telegram.ui.ActionBar.y6.A7, u6Var);
                        nextTextView5.setTypeface(AndroidUtilities.bold());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(kb1.h(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i10 == 5) {
                this.f26180w.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
                this.f26175s.setBackgroundColor(0);
                this.f26175s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    b20 b20Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = b20Var2.getTextView();
                    } else {
                        nextTextView4 = b20Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        org.telegram.ui.ActionBar.f7.V(nextTextView4, org.telegram.ui.ActionBar.y6.f23675u7, u6Var);
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23675u7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.f26154b.setVisibility(8);
                this.f26184y.setVisibility(8);
                this.f26155b0.setVisibility(8);
                this.f26182x.setVisibility(0);
                this.f26182x.d();
                this.F.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.w0 w0Var = this.G;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    this.G.setTag(null);
                }
                this.d.setLayoutParams(kb1.h(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.f26180w.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
                    this.f26175s.setBackgroundColor(0);
                    this.f26175s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v7));
                    this.f26184y.setVisibility(8);
                    this.e.setVisibility(0);
                    for (int i18 = 0; i18 < 2; i18++) {
                        b20 b20Var3 = this.d;
                        if (i18 == 0) {
                            nextTextView3 = b20Var3.getTextView();
                        } else {
                            nextTextView3 = b20Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            org.telegram.ui.ActionBar.f7.V(nextTextView3, org.telegram.ui.ActionBar.y6.f23656t7, u6Var);
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t7));
                    this.d.setPadding(0, 0, this.N, 0);
                    this.f26182x.setVisibility(8);
                    this.f26182x.i();
                    bh bhVar = this.f26168n;
                    z12 = (bhVar == null || bhVar.getGroupCall() == null || bhVar.getGroupCall().call == null || !bhVar.getGroupCall().call.rtmp_stream) ? false : false;
                    m9 m9Var2 = this.f26155b0;
                    if (!z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    m9Var2.setVisibility(i14);
                    if (this.f26155b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.F.setVisibility(8);
                    this.f26154b.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.G;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                        this.G.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.f26180w.setBackground(null);
                    p();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    m9 m9Var3 = this.f26155b0;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    m9Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.f26155b0.getVisibility() != 8) {
                        o(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.e.setTranslationX(0.0f);
                    }
                    d20 d20Var = this.f26184y;
                    if (!hasRtmpStream) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    d20Var.setVisibility(i12);
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
                    yj0Var2.N(yj0Var2.f35074f - 1, false, true);
                    this.f26184y.invalidate();
                    this.f26175s.setBackground(null);
                    this.f26175s.setBackgroundColor(0);
                    this.f26182x.setVisibility(8);
                    this.f26182x.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.y6.F0().f29192l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!hdVar.f28973u) {
                        hdVar.f28973u = true;
                        hdVar.f28972t = SystemClock.elapsedRealtime();
                        ag.n.d().a(60, hdVar.F);
                    }
                    invalidate();
                    for (int i19 = 0; i19 < 2; i19++) {
                        b20 b20Var4 = this.d;
                        if (i19 == 0) {
                            nextTextView2 = b20Var4.getTextView();
                        } else {
                            nextTextView2 = b20Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            org.telegram.ui.ActionBar.f7.V(nextTextView2, org.telegram.ui.ActionBar.y6.A7, u6Var);
                            nextTextView2.setTypeface(AndroidUtilities.bold());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.A7));
                    this.F.setVisibility(8);
                    this.f26154b.setVisibility(8);
                    this.e.setVisibility(8);
                    this.M.setVisibility(8);
                    this.d.setLayoutParams(kb1.h(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.N, 0);
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.G;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        this.G.setTag(null);
                    }
                }
            } else {
                this.f26180w.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
                this.f26175s.setBackgroundColor(0);
                this.f26175s.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v7));
                this.e.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(0);
                this.f26154b.setVisibility(0);
                this.f26184y.setVisibility(8);
                this.f26182x.setVisibility(8);
                this.f26182x.i();
                this.f26155b0.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    b20 b20Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = b20Var5.getTextView();
                    } else {
                        nextTextView = b20Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        org.telegram.ui.ActionBar.f7.V(nextTextView, org.telegram.ui.ActionBar.y6.f23675u7, u6Var);
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23675u7));
                if (i10 == 6) {
                    this.f26154b.setLayoutParams(kb1.h(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(kb1.h(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setVisibility(8);
                } else if (i10 == 0) {
                    this.f26154b.setLayoutParams(kb1.h(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(kb1.h(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.G;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(0);
                        this.G.setTag(1);
                    }
                    this.F.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f26154b.setLayoutParams(kb1.h(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(kb1.h(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.F.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(g20 g20Var) {
        this.f26171p0 = g20Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.R0 = z10;
    }

    public void setLeftMargin(float f7) {
        if (this.f26175s == null) {
            this.T0 = f7;
            return;
        }
        ImageView imageView = this.f26154b;
        if (imageView != null) {
            imageView.setTranslationX(f7);
        }
        bk0 bk0Var = this.f26182x;
        if (bk0Var != null) {
            bk0Var.setTranslationX(f7);
        }
        b20 b20Var = this.d;
        if (b20Var != null) {
            b20Var.setTranslationX(f7);
        }
        b20 b20Var2 = this.e;
        if (b20Var2 != null) {
            b20Var2.setTranslationX(f7);
        }
        m9 m9Var = this.f26155b0;
        if (m9Var != null) {
            m9Var.setTranslationX(f7);
        }
    }

    public void setSpeedHintViewParent(ViewGroup viewGroup) {
        this.C0 = viewGroup;
    }

    public void setSupportsCalls(boolean z10) {
        this.f26153a0 = z10;
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
        r61[] r61VarArr;
        TextView nextTextView2;
        hd hdVar = this.f26152a;
        int i11 = hdVar.A;
        if (i11 >= 0) {
            hdVar.E = 1.0f;
            hdVar.a(hd.e(i11));
        }
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.W), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.y6.Qh;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23733x7;
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.f26172q0;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        dd ddVar = this.H;
        if (ddVar != null) {
            ((r6) ddVar.f27420c).u(w02);
            Paint paint = (Paint) ddVar.f27419b;
            if (paint != null) {
                paint.setColor(w02);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.G;
        if (w0Var != null) {
            Drawable background = w0Var.getBackground();
            if (background != null && background == this.E0) {
                if (w02 != this.J0) {
                    this.J0 = w02;
                    org.telegram.ui.ActionBar.y6.E1(background, w02 & 436207615, true);
                }
            } else {
                org.telegram.ui.ActionBar.w0 w0Var2 = this.G;
                org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(436207615 & w02, 1, AndroidUtilities.dp(14.0f));
                this.E0 = g02;
                w0Var2.setBackground(g02);
                this.J0 = w02;
            }
        }
        if (this.f26154b != null) {
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23713w7, u6Var);
            if (this.F0 == null || w03 != this.H0) {
                ImageView imageView = this.f26154b;
                this.H0 = w03;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                this.F0 = porterDuffColorFilter;
                imageView.setColorFilter(porterDuffColorFilter);
            }
        }
        if (this.F != null) {
            int w04 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23733x7, u6Var);
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
                b20 b20Var = this.e;
                if (i12 == 0) {
                    nextTextView2 = b20Var.getTextView();
                } else {
                    nextTextView2 = b20Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23733x7, u6Var));
                }
            }
        }
        b20 b20Var2 = this.d;
        if (b20Var2 != null) {
            Object tag = b20Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i13 = 0; i13 < 2; i13++) {
                    b20 b20Var3 = this.d;
                    if (i13 == 0) {
                        nextTextView = b20Var3.getTextView();
                    } else {
                        nextTextView = b20Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.y6.w0(intValue, u6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (r61VarArr = (r61[]) ((Spanned) text).getSpans(0, text.length(), r61.class)) != null) {
                            for (r61 r61Var : r61VarArr) {
                                r61Var.f32165b = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23656t7, u6Var);
                            }
                        }
                    }
                }
            }
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.r2 r2Var, View view, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f26152a = new hd();
        this.J = new org.telegram.ui.ActionBar.u0[6];
        this.Q = -1;
        this.U = -1;
        this.f26153a0 = true;
        this.f26165j0 = new r6(false, true, true);
        this.m0 = new z10(this);
        this.f26169n0 = UserConfig.selectedAccount;
        this.f26176s0 = -1;
        this.f26177t0 = new m.g3(this, 18);
        this.f26178u0 = new AnimationNotificationsLocker();
        this.f26179v0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.K0 = new NotificationCenter.ObserversGroup[4];
        this.Q0 = new Paint(1);
        this.S0 = 0;
        this.U0 = new oe.l(new t10(this), ds.h, 450L);
        this.V0 = 0;
        this.f26172q0 = u6Var;
        this.h = r2Var;
        if (r2Var instanceof bh) {
            this.f26168n = (bh) r2Var;
        }
        this.f26173r = view;
        this.T = true;
        this.f26170o0 = z10;
        if (view == null) {
            ((ViewGroup) r2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
