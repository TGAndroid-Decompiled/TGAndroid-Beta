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
    public cf.f C;
    public final Paint C0;
    public org.telegram.ui.ActionBar.c1 D;
    public boolean D0;
    public final org.telegram.ui.ActionBar.u0[] E;
    public int E0;
    public FrameLayout F;
    public float F0;
    public ImageView G;
    public final vd.k G0;
    public org.telegram.ui.jk H;
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
    public h9 T;
    public Paint U;
    public LinearGradient V;
    public Matrix W;
    public final cd f26385a;
    public int f26386a0;
    public ImageView f26387b;
    public TextPaint f26388b0;
    public cg0 f26389c;
    public boolean f26390c0;
    public n10 d;
    public boolean f26391d0;
    public n10 f26392e;
    public final n6 f26393e0;
    public AnimatorSet f26394f;
    public uc f26395f0;
    public boolean f26396g0;
    public final org.telegram.ui.ActionBar.o2 h;
    public final l10 f26397h0;
    public final int f26398i0;
    public final boolean f26399j0;
    public r10 f26400k0;
    public final org.telegram.ui.ActionBar.c6 f26401l0;
    public boolean m0;
    public final ug f26402n;
    public int f26403n0;
    public final lh.m7 f26404o0;
    public final AnimationNotificationsLocker f26405p0;
    public final AnimationNotificationsLocker f26406q0;
    public m10 f26407r;
    public boolean f26408r0;
    public bh.d f26409s;
    public boolean f26410s0;
    public boolean f26411t0;
    public boolean f26412u0;
    public View v;
    public boolean f26413v0;
    public aj0 f26414w;
    public org.telegram.ui.zi f26415w0;
    public p10 f26416x;
    public long f26417x0;
    public xi0 f26418y;
    public float f26419y0;
    public float f26420z0;

    public FragmentContextView(Context context, org.telegram.ui.fy fyVar, boolean z10) {
        this(context, fyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.P;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26401l0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23347t7, c6Var);
        }
        if (i10 != 1 && i10 != 3) {
            return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23366u7, c6Var);
        }
        return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var);
    }

    public static boolean i(float f9, float f10) {
        if (Math.abs(f9 - f10) < 0.05f) {
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
        if (this.f26407r != null) {
            return;
        }
        Context context = getContext();
        m10 m10Var = new m10(this, context);
        this.f26407r = m10Var;
        this.f26395f0 = new uc(m10Var);
        int i10 = AndroidUtilities.displaySize.x;
        n6 n6Var = this.f26393e0;
        n6Var.G = i10;
        n6Var.v = 0.4f;
        n6Var.setCallback(m10Var);
        n6Var.r(-1);
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.u(AndroidUtilities.bold());
        addView(this.f26407r, i7.f6.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.f26407r.addView(view, i7.f6.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f26387b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f26387b;
        int i11 = org.telegram.ui.ActionBar.g6.f23402w7;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26401l0;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView imageView3 = this.f26387b;
        cg0 cg0Var = new cg0(16);
        this.f26389c = cg0Var;
        imageView3.setImageDrawable(cg0Var);
        this.f26387b.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i11, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f26387b, i7.f6.e(36, 36, 51));
        this.f26387b.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f28709b;

            {
                this.f28709b = this;
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
                FragmentContextView fragmentContextView = this.f28709b;
                switch (i14) {
                    case 0:
                        ug ugVar = fragmentContextView.f26402n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.f26401l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.fy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ugVar.g();
                                TLRPC.User i15 = ugVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new f10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, c6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ug ugVar2 = fragmentContextView.f26402n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.f26401l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        if (i16 == 6) {
                            lh.d1 d1Var = lh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.f15454b;
                                int i17 = d1Var.f15456e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d1Var.f15455c, j11)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new g8(findActivity, c6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new g8(LaunchActivity.C1, c6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ugVar2 != null) {
                                    j12 = ugVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26402n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                o2Var2.presentFragment(new org.telegram.ui.tn(bundle), o2Var2 instanceof org.telegram.ui.tn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ugVar2 != null) {
                                j10 = ugVar2.a();
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
                                o2Var2.showDialog(new uu0(fragmentContextView.getContext(), new f10(fragmentContextView), c6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.r50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = ugVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(tnVar.a()) != null) {
                                u40 u40Var = new u40(fragmentContextView.getContext(), null, tnVar, c6Var3);
                                u40Var.setOnHideListener(new d1(fragmentContextView, 6));
                                o2Var2.showDialog(u40Var);
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
                            xi0 xi0Var = fragmentContextView.f26418y;
                            if (fragmentContextView.K) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (xi0Var.N(i13)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26418y.K(0);
                                } else {
                                    fragmentContextView.f26418y.K(14);
                                }
                            }
                            fragmentContextView.f26416x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView.f26385a.f(true);
                            try {
                                fragmentContextView.f26416x.performHapticFeedback(3, 2);
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
        this.f26414w = imageView4;
        imageView4.setScaleType(scaleType);
        this.f26414w.setAutoRepeat(true);
        this.f26414w.f(R.raw.import_progress, 30, 30, null);
        this.f26414w.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        addView(this.f26414w, i7.f6.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        n10 n10Var = new n10(this, context, context, 0);
        this.d = n10Var;
        addView(n10Var, i7.f6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        n10 n10Var2 = new n10(this, context, context, 1);
        this.f26392e = n10Var2;
        addView(n10Var2, i7.f6.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.J = hVar;
        hVar.f33721g = 1.0f;
        hVar.f33723j = false;
        org.telegram.ui.jk jkVar = new org.telegram.ui.jk(this, context, 1);
        this.H = jkVar;
        jkVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.H.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        org.telegram.ui.jk jkVar2 = this.H;
        int dp = AndroidUtilities.dp(16.0f);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        jkVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v03, v04, v04));
        this.H.setTextSize(1, 14.0f);
        this.H.setTypeface(AndroidUtilities.bold());
        this.H.setGravity(17);
        this.H.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.H, i7.f6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f28709b;

            {
                this.f28709b = this;
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
                FragmentContextView fragmentContextView = this.f28709b;
                switch (i14) {
                    case 0:
                        ug ugVar = fragmentContextView.f26402n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.f26401l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.fy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ugVar.g();
                                TLRPC.User i15 = ugVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new f10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, c6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ug ugVar2 = fragmentContextView.f26402n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.f26401l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        if (i16 == 6) {
                            lh.d1 d1Var = lh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.f15454b;
                                int i17 = d1Var.f15456e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d1Var.f15455c, j11)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new g8(findActivity, c6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new g8(LaunchActivity.C1, c6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ugVar2 != null) {
                                    j12 = ugVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26402n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                o2Var2.presentFragment(new org.telegram.ui.tn(bundle), o2Var2 instanceof org.telegram.ui.tn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ugVar2 != null) {
                                j10 = ugVar2.a();
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
                                o2Var2.showDialog(new uu0(fragmentContextView.getContext(), new f10(fragmentContextView), c6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.r50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = ugVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(tnVar.a()) != null) {
                                u40 u40Var = new u40(fragmentContextView.getContext(), null, tnVar, c6Var3);
                                u40Var.setOnHideListener(new d1(fragmentContextView, 6));
                                o2Var2.showDialog(u40Var);
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
                            xi0 xi0Var = fragmentContextView.f26418y;
                            if (fragmentContextView.K) {
                                i13 = 15;
                            } else {
                                i13 = 29;
                            }
                            if (xi0Var.N(i13)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26418y.K(0);
                                } else {
                                    fragmentContextView.f26418y.K(14);
                                }
                            }
                            fragmentContextView.f26416x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView.f26385a.f(true);
                            try {
                                fragmentContextView.f26416x.performHapticFeedback(3, 2);
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
        int i12 = org.telegram.ui.ActionBar.g6.f23419x7;
        imageView6.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), mode));
        this.F.addView(this.G, i7.f6.e(20, 20, 17));
        this.F.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i12, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.F.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.F.setOnClickListener(new bg.n(15));
        this.F.setVisibility(8);
        addView(this.F, i7.f6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f26399j0) {
            h();
        }
        h9 h9Var = new h9(context, false);
        this.T = h9Var;
        h9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.T.setDelegate(new j10(this, 1));
        this.T.setVisibility(8);
        addView(this.T, i7.f6.e(108, 36, 51));
        int i13 = R.raw.voice_muted;
        this.f26418y = new xi0(i13, "" + R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        p10 p10Var = new p10(this, context);
        this.f26416x = p10Var;
        p10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var), PorterDuff.Mode.SRC_IN));
        this.f26416x.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i12, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f26416x.setAnimation(this.f26418y);
        this.f26416x.setScaleType(scaleType);
        this.f26416x.setVisibility(8);
        addView(this.f26416x, i7.f6.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        this.f26416x.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f28709b;

            {
                this.f28709b = this;
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
                FragmentContextView fragmentContextView = this.f28709b;
                switch (i14) {
                    case 0:
                        ug ugVar = fragmentContextView.f26402n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.f26401l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.fy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ugVar.g();
                                TLRPC.User i15 = ugVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new f10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, c6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ug ugVar2 = fragmentContextView.f26402n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.f26401l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        if (i16 == 6) {
                            lh.d1 d1Var = lh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.f15454b;
                                int i17 = d1Var.f15456e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d1Var.f15455c, j11)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new g8(findActivity, c6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new g8(LaunchActivity.C1, c6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ugVar2 != null) {
                                    j12 = ugVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26402n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                o2Var2.presentFragment(new org.telegram.ui.tn(bundle), o2Var2 instanceof org.telegram.ui.tn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ugVar2 != null) {
                                j10 = ugVar2.a();
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
                                o2Var2.showDialog(new uu0(fragmentContextView.getContext(), new f10(fragmentContextView), c6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.r50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = ugVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(tnVar.a()) != null) {
                                u40 u40Var = new u40(fragmentContextView.getContext(), null, tnVar, c6Var3);
                                u40Var.setOnHideListener(new d1(fragmentContextView, 6));
                                o2Var2.showDialog(u40Var);
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
                            xi0 xi0Var = fragmentContextView.f26418y;
                            if (fragmentContextView.K) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (xi0Var.N(i132)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26418y.K(0);
                                } else {
                                    fragmentContextView.f26418y.K(14);
                                }
                            }
                            fragmentContextView.f26416x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView.f26385a.f(true);
                            try {
                                fragmentContextView.f26416x.performHapticFeedback(3, 2);
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
        this.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), mode));
        this.A.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i12, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.A.setScaleType(scaleType);
        addView(this.A, i7.f6.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        this.A.setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f28709b;

            {
                this.f28709b = this;
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
                FragmentContextView fragmentContextView = this.f28709b;
                switch (i14) {
                    case 0:
                        ug ugVar = fragmentContextView.f26402n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.f26401l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.fy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ugVar.g();
                                TLRPC.User i15 = ugVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new f10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, c6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ug ugVar2 = fragmentContextView.f26402n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.f26401l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        if (i16 == 6) {
                            lh.d1 d1Var = lh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.f15454b;
                                int i17 = d1Var.f15456e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d1Var.f15455c, j11)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new g8(findActivity, c6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new g8(LaunchActivity.C1, c6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ugVar2 != null) {
                                    j12 = ugVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26402n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                o2Var2.presentFragment(new org.telegram.ui.tn(bundle), o2Var2 instanceof org.telegram.ui.tn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ugVar2 != null) {
                                j10 = ugVar2.a();
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
                                o2Var2.showDialog(new uu0(fragmentContextView.getContext(), new f10(fragmentContextView), c6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.r50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = ugVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(tnVar.a()) != null) {
                                u40 u40Var = new u40(fragmentContextView.getContext(), null, tnVar, c6Var3);
                                u40Var.setOnHideListener(new d1(fragmentContextView, 6));
                                o2Var2.showDialog(u40Var);
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
                            xi0 xi0Var = fragmentContextView.f26418y;
                            if (fragmentContextView.K) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (xi0Var.N(i132)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26418y.K(0);
                                } else {
                                    fragmentContextView.f26418y.K(14);
                                }
                            }
                            fragmentContextView.f26416x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView.f26385a.f(true);
                            try {
                                fragmentContextView.f26416x.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        return;
                }
            }
        });
        bh.d dVar = new bh.d(getContext(), 16);
        this.f26409s = dVar;
        addView(dVar, i7.f6.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        setOnClickListener(new View.OnClickListener(this) {
            public final FragmentContextView f28709b;

            {
                this.f28709b = this;
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
                FragmentContextView fragmentContextView = this.f28709b;
                switch (i14) {
                    case 0:
                        ug ugVar = fragmentContextView.f26402n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.f26401l0;
                        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                        if (fragmentContextView.P == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            c2Var.N = string;
                            if (o2Var instanceof org.telegram.ui.fy) {
                                c2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat g10 = ugVar.g();
                                TLRPC.User i15 = ugVar.i();
                                if (g10 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, g10.title));
                                } else if (i15 != null) {
                                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(i15)));
                                } else {
                                    c2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new f10(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, c6Var2));
                                return;
                            }
                            return;
                        }
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    case 1:
                        ug ugVar2 = fragmentContextView.f26402n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.f26401l0;
                        org.telegram.ui.ActionBar.o2 o2Var2 = fragmentContextView.h;
                        int i16 = fragmentContextView.P;
                        if (i16 == 6) {
                            lh.d1 d1Var = lh.d1.S;
                            if (d1Var != null) {
                                long j11 = d1Var.f15454b;
                                int i17 = d1Var.f15456e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    } else {
                                        return;
                                    }
                                }
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null && (u10 = MessagesController.getInstance(i17).getStoriesController().u(d1Var.f15455c, j11)) != null) {
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
                            if (o2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity findActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (findActivity instanceof LaunchActivity) {
                                        new g8(findActivity, c6Var3).show();
                                        return;
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new g8(LaunchActivity.C1, c6Var3).show();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                if (ugVar2 != null) {
                                    j12 = ugVar2.a();
                                }
                                if (playingMessageObject.getDialogId() == j12) {
                                    fragmentContextView.f26402n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
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
                                o2Var2.presentFragment(new org.telegram.ui.tn(bundle), o2Var2 instanceof org.telegram.ui.tn);
                                return;
                            }
                            return;
                        } else if (i16 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), LaunchActivity.class).setAction("voip"));
                            return;
                        } else if (i16 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ugVar2 != null) {
                                j10 = ugVar2.a();
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
                                o2Var2.showDialog(new uu0(fragmentContextView.getContext(), new f10(fragmentContextView), c6Var3));
                                return;
                            }
                        } else if (i16 == 3) {
                            if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                                org.telegram.ui.r50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                                return;
                            }
                            return;
                        } else if (i16 == 4) {
                            if (o2Var2.getParentActivity() != null && (groupCall = ugVar2.getGroupCall()) != null) {
                                TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                TLRPC.GroupCall groupCall2 = groupCall.call;
                                org.telegram.ui.Components.voip.h2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : false), o2Var2.getParentActivity(), o2Var2, o2Var2.getAccountInstance());
                                return;
                            }
                            return;
                        } else if (i16 == 5) {
                            org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var2;
                            if (o2Var2.getSendMessagesHelper().getImportingHistory(tnVar.a()) != null) {
                                u40 u40Var = new u40(fragmentContextView.getContext(), null, tnVar, c6Var3);
                                u40Var.setOnHideListener(new d1(fragmentContextView, 6));
                                o2Var2.showDialog(u40Var);
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
                            xi0 xi0Var = fragmentContextView.f26418y;
                            if (fragmentContextView.K) {
                                i132 = 15;
                            } else {
                                i132 = 29;
                            }
                            if (xi0Var.N(i132)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26418y.K(0);
                                } else {
                                    fragmentContextView.f26418y.K(14);
                                }
                            }
                            fragmentContextView.f26416x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView.f26385a.f(true);
                            try {
                                fragmentContextView.f26416x.performHapticFeedback(3, 2);
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
        int i10;
        ug ugVar = this.f26402n;
        if (ugVar != null) {
            if (!this.O || ((i10 = this.P) != 1 && i10 != 3)) {
                b();
                org.telegram.ui.ActionBar.o2 o2Var = this.h;
                SendMessagesHelper.ImportingHistory importingHistory = o2Var.getSendMessagesHelper().getImportingHistory(ugVar.a());
                View fragmentView = o2Var.getFragmentView();
                if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                    z10 = true;
                }
                Dialog visibleDialog = o2Var.getVisibleDialog();
                if ((j() || ugVar.n() || ((visibleDialog instanceof u40) && !((u40) visibleDialog).isDismissed())) && importingHistory != null) {
                    importingHistory = null;
                }
                AnimationNotificationsLocker animationNotificationsLocker = this.f26405p0;
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
                        AnimatorSet animatorSet = this.f26394f;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            this.f26394f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.f26394f = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f26394f.setDuration(220L);
                        this.f26394f.setInterpolator(jr.f29800f);
                        this.f26394f.addListener(new k10(this, 4));
                        this.f26394f.start();
                        return;
                    }
                    int i11 = this.P;
                    if (i11 == -1 || i11 == 5) {
                        this.O = false;
                        setVisibility(8);
                    }
                } else if (this.P != 5 && this.f26394f != null && !z10) {
                    this.f26412u0 = true;
                } else {
                    r(5);
                    if (z10 && this.N == 0.0f) {
                        setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                        r10 r10Var = this.f26400k0;
                        if (r10Var != null) {
                            ((nq0) r10Var).a(true);
                            ((nq0) this.f26400k0).a(false);
                        }
                    }
                    if (!this.O) {
                        if (!z10) {
                            AnimatorSet animatorSet3 = this.f26394f;
                            if (animatorSet3 != null) {
                                animatorSet3.cancel();
                                this.f26394f = null;
                            }
                            animationNotificationsLocker.lock();
                            this.f26394f = new AnimatorSet();
                            r10 r10Var2 = this.f26400k0;
                            if (r10Var2 != null) {
                                ((nq0) r10Var2).a(true);
                            }
                            this.f26394f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                            this.f26394f.setDuration(200L);
                            this.f26394f.addListener(new k10(this, 5));
                            this.f26394f.start();
                        }
                        this.O = true;
                        setVisibility(0);
                    }
                    int i12 = this.L;
                    int i13 = importingHistory.uploadProgress;
                    if (i12 != i13) {
                        this.L = i13;
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
        boolean z11 = o2Var instanceof org.telegram.ui.fy;
        if (z11) {
            if (LocationController.getLocationsCount() != 0) {
                isSharingLocation = true;
            } else {
                isSharingLocation = false;
            }
        } else {
            isSharingLocation = LocationController.getInstance(o2Var.getCurrentAccount()).isSharingLocation(this.f26402n.a());
        }
        lh.m7 m7Var = this.f26404o0;
        if (!isSharingLocation) {
            this.f26403n0 = -1;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
            if (this.O) {
                this.O = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f26394f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26394f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26394f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f26394f.setDuration(200L);
                this.f26394f.addListener(new k10(this, 0));
                this.f26394f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f26387b.setImageDrawable(new eq0(getContext(), 1));
        if (z10 && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.O) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f26394f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f26394f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f26394f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f26394f.setDuration(200L);
                this.f26394f.addListener(new k10(this, 1));
                this.f26394f.start();
            }
            this.O = true;
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
                n10 n10Var = this.d;
                if (i11 == 0) {
                    nextTextView = n10Var.getTextView();
                } else {
                    nextTextView = n10Var.getNextTextView();
                }
                if (nextTextView != null) {
                    nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23347t7, this.f26401l0)), indexOf, string2.length() + indexOf, 18);
            this.d.b(spannableStringBuilder, false);
            return;
        }
        m7Var.run();
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
            ug ugVar = this.f26402n;
            if (i10 == i13) {
                if (ugVar != null) {
                    if (ugVar.a() == ((Long) objArr[0]).longValue()) {
                        f();
                    }
                }
            } else if (i10 != NotificationCenter.messagePlayingDidStart && i10 != NotificationCenter.messagePlayingPlayStateChanged && i10 != NotificationCenter.messagePlayingDidReset && i10 != NotificationCenter.didEndCall) {
                int i14 = NotificationCenter.didStartedCall;
                if (i10 != i14 && i10 != NotificationCenter.groupCallUpdated && i10 != NotificationCenter.groupCallVisibilityChanged) {
                    if (i10 == NotificationCenter.groupCallTypingsUpdated) {
                        b();
                        if (this.O && this.P == 4) {
                            ChatObject.Call groupCall = ugVar.getGroupCall();
                            if (groupCall != null && this.f26392e != null) {
                                if (groupCall.isScheduled()) {
                                    this.f26392e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                                } else {
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    int i15 = groupCall2.participants_count;
                                    if (i15 == 0) {
                                        n10 n10Var = this.f26392e;
                                        if (groupCall2.rtmp_stream) {
                                            i12 = R.string.ViewersWatchingNobody;
                                        } else {
                                            i12 = R.string.MembersTalkingNobody;
                                        }
                                        n10Var.b(LocaleController.getString(i12), false);
                                    } else {
                                        n10 n10Var2 = this.f26392e;
                                        if (groupCall2.rtmp_stream) {
                                            str = "ViewersWatching";
                                        } else {
                                            str = "Participants";
                                        }
                                        n10Var2.b(LocaleController.formatPluralString(str, i15, new Object[0]), false);
                                    }
                                }
                            }
                            n(true);
                            return;
                        }
                        return;
                    } else if (i10 == NotificationCenter.historyImportProgressChanged) {
                        int i16 = this.P;
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
                        cd cdVar = this.f26385a;
                        if (i10 == i17) {
                            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isMicMute()) {
                                this.f26420z0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
                            } else {
                                this.f26420z0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.g6.D0().a(Math.max(this.f26419y0, this.f26420z0));
                                cdVar.d(Math.max(this.f26419y0, this.f26420z0));
                                return;
                            }
                            return;
                        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
                            b();
                            this.f26419y0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
                            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                                this.f26420z0 = 0.0f;
                            }
                            if (VoIPService.getSharedInstance() != null) {
                                org.telegram.ui.ActionBar.g6.D0().a(Math.max(this.f26419y0, this.f26420z0));
                                cdVar.d(Math.max(this.f26419y0, this.f26420z0));
                            }
                            this.T.invalidate();
                            return;
                        } else if (i10 == NotificationCenter.messagePlayingProgressDidChanged && this.P == 0) {
                            invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                a(false);
                if (this.P == 3 && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null) {
                    if (i10 == i14) {
                        sharedInstance.registerStateListener(this);
                    }
                    int callState = sharedInstance.getCallState();
                    if (callState != 1 && callState != 2 && callState != 6 && callState != 5 && this.f26416x != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) {
                        sharedInstance.setMicMute(true, false, false);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f26416x.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                    }
                }
            } else {
                int i18 = this.P;
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
        lh.d1 d1Var = lh.d1.S;
        AnimationNotificationsLocker animationNotificationsLocker = this.f26405p0;
        int i10 = 0;
        if (d1Var != null) {
            b();
            int i11 = this.P;
            if (6 != i11 && this.f26394f != null && !z10) {
                this.f26410s0 = true;
                return;
            } else if (6 != i11 && this.O && !z10) {
                AnimatorSet animatorSet = this.f26394f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26394f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26394f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f26394f.setDuration(220L);
                this.f26394f.setInterpolator(jr.f29800f);
                this.f26394f.addListener(new k10(this, 7));
                this.f26394f.start();
                return;
            } else {
                r(6);
                if (!this.O) {
                    if (!z10) {
                        AnimatorSet animatorSet3 = this.f26394f;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                            this.f26394f = null;
                        }
                        this.f26394f = new AnimatorSet();
                        this.f26406q0.lock();
                        this.f26394f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                        this.f26394f.setDuration(220L);
                        this.f26394f.setInterpolator(jr.f29800f);
                        this.f26394f.addListener(new k10(this, 8));
                        this.f26394f.start();
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
                    AnimatorSet animatorSet4 = this.f26394f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f26394f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f26394f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f26394f.setDuration(220L);
                    this.f26394f.setInterpolator(jr.f29800f);
                    this.f26394f.addListener(new k10(this, 6));
                    this.f26394f.start();
                }
            } else if (z11 && this.P == -1) {
                this.O = false;
                setVisibility(8);
            }
        }
        lh.d1 d1Var2 = lh.d1.S;
        if (d1Var2 != null && this.P == 6) {
            n10 n10Var = this.d;
            TLRPC.GroupCall groupCall = d1Var2.v;
            if (groupCall != null) {
                i10 = groupCall.participants_count;
            }
            n10Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, i10)));
        }
    }

    public final void f() {
        int i10;
        String format;
        TextView nextTextView;
        ug ugVar = this.f26402n;
        if (ugVar != null && this.d != null) {
            b();
            long a2 = ugVar.a();
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
            if (this.f26403n0 != i10) {
                this.f26403n0 = i10;
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
                if (!format.equals(this.Q)) {
                    this.Q = format;
                    int indexOf = format.indexOf(string);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    for (int i13 = 0; i13 < 2; i13++) {
                        n10 n10Var = this.d;
                        if (i13 == 0) {
                            nextTextView = n10Var.getTextView();
                        } else {
                            nextTextView = n10Var.getNextTextView();
                        }
                        if (nextTextView != null) {
                            nextTextView.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    }
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23347t7, this.f26401l0)), indexOf, string.length() + indexOf, 18);
                    }
                    this.d.b(spannableStringBuilder, false);
                }
            }
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        ug ugVar;
        SpannableStringBuilder spannableStringBuilder;
        TextView nextTextView;
        TextView nextTextView2;
        boolean z12 = true;
        if (this.O) {
            int i10 = this.P;
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
        boolean z13 = this.O;
        AnimationNotificationsLocker animationNotificationsLocker = this.f26405p0;
        if (playingMessageObject != null && playingMessageObject.getId() != 0 && !playingMessageObject.isVideo()) {
            b();
            int i11 = this.P;
            if (i11 != 0 && this.f26394f != null && !z10) {
                this.f26411t0 = true;
                return;
            }
            r(0);
            if (z10 && this.N == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                r10 r10Var = this.f26400k0;
                if (r10Var != null) {
                    ((nq0) r10Var).a(true);
                    ((nq0) this.f26400k0).a(false);
                }
            }
            if (!this.O) {
                if (!z10) {
                    AnimatorSet animatorSet = this.f26394f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.f26394f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f26394f = new AnimatorSet();
                    r10 r10Var2 = this.f26400k0;
                    if (r10Var2 != null) {
                        ((nq0) r10Var2).a(true);
                    }
                    this.f26394f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f26394f.setDuration(200L);
                    this.f26394f.addListener(new k10(this, 3));
                    this.f26394f.start();
                }
                this.O = true;
                setVisibility(0);
            }
            if (MediaController.getInstance().isMessagePaused()) {
                this.f26389c.a(false, !z10);
                this.f26387b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
            } else {
                this.f26389c.a(true, !z10);
                this.f26387b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
            }
            if (this.M == playingMessageObject && i11 == 0) {
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
                spannableStringBuilder = new SpannableStringBuilder(a4.w.y(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
                for (int i12 = 0; i12 < 2; i12++) {
                    n10 n10Var = this.d;
                    if (i12 == 0) {
                        nextTextView2 = n10Var.getTextView();
                    } else {
                        nextTextView2 = n10Var.getNextTextView();
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
                spannableStringBuilder = new SpannableStringBuilder(a4.w.y(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
                for (int i13 = 0; i13 < 2; i13++) {
                    n10 n10Var2 = this.d;
                    if (i13 == 0) {
                        nextTextView = n10Var2.getTextView();
                    } else {
                        nextTextView = n10Var2.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    }
                }
                q(false);
            }
            spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23347t7, this.f26401l0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
            this.d.b(spannableStringBuilder, (!z10 && z13 && this.R) ? false : false);
            return;
        }
        this.M = null;
        if (this.S && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !w20.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!j() && !z11 && (ugVar = this.f26402n) != null && !w20.c()) {
            ChatObject.Call groupCall = ugVar.getGroupCall();
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
            AnimatorSet animatorSet2 = this.f26394f;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.f26394f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f26394f = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f26394f.setDuration(200L);
            r10 r10Var3 = this.f26400k0;
            if (r10Var3 != null) {
                ((nq0) r10Var3).a(true);
            }
            this.f26394f.addListener(new k10(this, 2));
            this.f26394f.start();
        } else {
            setVisibility(8);
        }
    }

    public cd getCapsuleBlobDrawable() {
        return this.f26385a;
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
        int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26401l0;
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), false, this.f26401l0);
        this.B = w0Var;
        w0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        this.B.setLongClickEnabled(false);
        this.B.setVisibility(8);
        this.B.setTag(null);
        this.B.setShowSubmenuByMove(false);
        this.B.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.B.setDelegate(new f10(this));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.B;
        cf.f fVar = new cf.f();
        this.C = fVar;
        w0Var2.setIcon(fVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.c1 c1Var = new org.telegram.ui.ActionBar.c1(getContext(), c6Var);
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
        addView(this.B, i7.f6.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.B.setOnClickListener(new t2(21, this, fArr));
        this.B.setOnLongClickListener(new i10(this, 0));
        q(false);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        int i10 = this.P;
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
                org.telegram.ui.rc0 rc0Var = new org.telegram.ui.rc0(2);
                rc0Var.u0(sharingLocationInfo.messageObject);
                rc0Var.B0 = new f3.e(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.p0(rc0Var);
            }
        }
    }

    public final void l(float f9, float f10, boolean z10) {
        String formatString;
        int i10;
        if (!i(f9, f10)) {
            if (Math.abs(f10 - 1.0f) < 0.05f) {
                if (f9 < f10) {
                    return;
                }
                formatString = LocaleController.getString(R.string.AudioSpeedNormal);
                if (Math.abs(f9 - 2.0f) < 0.05f) {
                    i10 = R.raw.speed_2to1;
                } else if (f10 < f9) {
                    i10 = R.raw.speed_slow;
                } else {
                    i10 = R.raw.speed_fast;
                }
            } else if (z10 && i(f10, 1.5f) && i(f9, 1.0f)) {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, cf.f.a(f10));
                i10 = R.raw.speed_1to15;
            } else if (z10 && i(f10, 2.0f) && i(f9, 1.5f)) {
                formatString = LocaleController.getString(R.string.AudioSpeedFast);
                i10 = R.raw.speed_15to2;
            } else {
                formatString = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, cf.f.a(f10));
                if (f10 < 1.0f) {
                    i10 = R.raw.speed_slow;
                } else {
                    i10 = R.raw.speed_fast;
                }
            }
            tc.a0(this.h).Q(i10, 36, formatString).j();
        }
    }

    public final void m() {
        org.telegram.ui.Components.voip.h hVar = this.J;
        if (hVar != null && hVar.f33721g >= 1.0f) {
            this.A0 = false;
            AndroidUtilities.runOnUIThread(new j10(this, 0), 150L);
            return;
        }
        this.A0 = true;
    }

    public final void n(boolean z10) {
        ChatObject.Call call;
        int i10;
        TLRPC.User user;
        int f9;
        int i11;
        float f10;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.T.f29141a.f28827f) != null) {
            valueAnimator.cancel();
            this.T.f29141a.f28827f = null;
        }
        g9 g9Var = this.T.f29141a;
        if (g9Var.f28827f == null) {
            int i12 = this.P;
            int i13 = this.f26398i0;
            ug ugVar = this.f26402n;
            if (i12 == 4) {
                if (ugVar != null) {
                    call = ugVar.getGroupCall();
                    i13 = this.h.getCurrentAccount();
                } else {
                    call = null;
                }
                i10 = i13;
                user = null;
            } else if (VoIPService.getSharedInstance() != null) {
                call = VoIPService.getSharedInstance().groupCall;
                if (ugVar != null) {
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
                        this.T.b(i15, call.sortedParticipants.get(i15), i10);
                    } else {
                        this.T.b(i15, null, i10);
                    }
                }
            } else if (user != null) {
                this.T.b(0, user, i10);
                for (int i16 = 1; i16 < 3; i16++) {
                    this.T.b(i16, null, i10);
                }
            } else {
                for (int i17 = 0; i17 < 3; i17++) {
                    this.T.b(i17, null, i10);
                }
            }
            this.T.a(z10);
            if (this.P == 4 && call != null) {
                if (!call.call.rtmp_stream) {
                    i14 = Math.min(3, call.sortedParticipants.size());
                }
                if (i14 == 0) {
                    f9 = 10;
                } else {
                    f9 = com.google.android.recaptcha.internal.a.f(i14, 1, 24, 52);
                }
                int i18 = f9 + 3;
                if (z10) {
                    int i19 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
                    if (AndroidUtilities.dp(i18) != i19) {
                        float translationX = (this.d.getTranslationX() + i19) - AndroidUtilities.dp(f10);
                        this.d.setTranslationX(translationX);
                        this.f26392e.setTranslationX(translationX);
                        ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                        jr jrVar = jr.f29800f;
                        duration.setInterpolator(jrVar);
                        this.f26392e.animate().translationX(0.0f).setDuration(220L).setInterpolator(jrVar);
                    }
                } else {
                    this.d.animate().cancel();
                    this.f26392e.animate().cancel();
                    this.d.setTranslationX(0.0f);
                    this.f26392e.setTranslationX(0.0f);
                }
                n10 n10Var = this.d;
                float f11 = i18;
                int i20 = 36;
                if (call.isScheduled()) {
                    i11 = 90;
                } else {
                    i11 = 36;
                }
                n10Var.setLayoutParams(i7.f6.d(-1, 20.0f, 51, f11, 5.0f, i11, 0.0f));
                n10 n10Var2 = this.f26392e;
                if (call.isScheduled()) {
                    i20 = 90;
                }
                n10Var2.setLayoutParams(i7.f6.d(-1, 20.0f, 51, f11, 25.0f, i20, 0.0f));
                return;
            }
            return;
        }
        g9Var.f28828g = true;
    }

    public final void o() {
        ChatObject.Call call;
        b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i10 = this.P;
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
                    ug ugVar = this.f26402n;
                    if (chat != null) {
                        if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                            this.d.b(sharedInstance.groupCall.call.title, false);
                        } else if (ugVar != null && ugVar.g() != null && ugVar.g().f22392id == sharedInstance.getChat().f22392id) {
                            TLRPC.Chat g10 = ugVar.g();
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
                        if (ugVar != null && ugVar.i() != null && ugVar.i().f22539id == user.f22539id) {
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
        if (this.f26399j0) {
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
            if (lh.d1.S != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isHangingUp() && VoIPService.getSharedInstance().getCallState() != 15 && !w20.c()) {
                a(true);
            } else {
                ug ugVar = this.f26402n;
                if (ugVar != null && this.h.getSendMessagesHelper().getImportingHistory(ugVar.a()) != null && !j()) {
                    c(true);
                } else if (ugVar != null && ugVar.getGroupCall() != null && ugVar.getGroupCall().shouldShowPanel() && !w20.c() && !j()) {
                    a(true);
                } else {
                    a(true);
                    g(true);
                    q(false);
                }
            }
        }
        int i12 = this.P;
        if (i12 != 3 && i12 != 1) {
            if (i12 == 4 && !this.f26396g0) {
                this.f26396g0 = true;
                this.f26397h0.run();
            }
        } else {
            ArrayList arrayList = org.telegram.ui.ActionBar.g6.D0().f32800l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            cd cdVar = this.f26385a;
            if (!cdVar.f27454u) {
                cdVar.f27454u = true;
                cdVar.f27453t = SystemClock.elapsedRealtime();
                jf.j.d().a(60, cdVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.K != z10 && this.f26416x != null) {
                this.K = z10;
                xi0 xi0Var = this.f26418y;
                if (!z10) {
                    i10 = 29;
                }
                xi0Var.N(i10);
                xi0 xi0Var2 = this.f26418y;
                xi0Var2.L(xi0Var2.f34739f - 1, false, true);
                this.f26416x.invalidate();
            }
        }
        if (this.O && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.f26419y0 = 0.0f;
        this.f26420z0 = 0.0f;
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
        boolean z11 = this.K;
        cd cdVar = this.f26385a;
        if (z11 != z10) {
            this.K = z10;
            xi0 xi0Var = this.f26418y;
            if (z10) {
                i10 = 15;
            } else {
                i10 = 29;
            }
            xi0Var.N(i10);
            xi0 xi0Var2 = this.f26418y;
            xi0Var2.L(xi0Var2.f34739f - 1, false, true);
            this.f26416x.invalidate();
            org.telegram.ui.ActionBar.g6.D0().c(this.O);
            cdVar.f(this.O);
        }
        if (this.K) {
            this.f26420z0 = 0.0f;
            org.telegram.ui.ActionBar.g6.D0().a(0.0f);
            cdVar.d(0.0f);
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
        AnimatorSet animatorSet = this.f26394f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26394f = null;
        }
        if (this.f26396g0) {
            AndroidUtilities.cancelRunOnUIThread(this.f26397h0);
            this.f26396g0 = false;
        }
        this.O = false;
        this.f26405p0.unlock();
        this.N = 0.0f;
        if (this.f26399j0) {
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
        int i11 = this.P;
        if (i11 == 3 || i11 == 1) {
            t10 D0 = org.telegram.ui.ActionBar.g6.D0();
            ArrayList arrayList = D0.f32800l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                D0.d = D0.f32792b;
                D0.f32792b = null;
                D0.f32793c = null;
            }
            cd cdVar = this.f26385a;
            if (cdVar.f27454u) {
                cdVar.f27454u = false;
                jf.j.d().f(cdVar.F);
            }
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        this.B0 = false;
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
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f26409s != null) {
            int i10 = this.P;
            if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
                this.H0++;
                if (!groupCallMessage.isOut()) {
                    this.G0.i(new q10(this.f26409s, groupCallMessage), true);
                }
            }
        }
    }

    @Override
    public final void onPopGroupCallMessage() {
        int i10 = this.H0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.H0 = i11;
            if (i11 == 0) {
                this.G0.i(null, true);
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
        t41[] t41VarArr;
        TextView nextTextView2;
        if (!i(MediaController.getInstance().getPlaybackSpeed(this.R), 1.0f)) {
            i10 = org.telegram.ui.ActionBar.g6.Qh;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23419x7;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f26401l0;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        cf.f fVar = this.C;
        if (fVar != null) {
            ((n6) fVar.f3058b).r(v02);
            Paint paint = (Paint) fVar.f3059c;
            if (paint != null) {
                paint.setColor(v02);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.B;
        if (w0Var != null) {
            w0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(v02 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.f26387b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23402w7, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23419x7, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.f26392e != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                n10 n10Var = this.f26392e;
                if (i11 == 0) {
                    nextTextView2 = n10Var.getTextView();
                } else {
                    nextTextView2 = n10Var.getNextTextView();
                }
                if (nextTextView2 != null) {
                    nextTextView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23419x7, c6Var));
                }
            }
        }
        n10 n10Var2 = this.d;
        if (n10Var2 != null) {
            Object tag = n10Var2.getTag();
            if (tag instanceof Integer) {
                int intValue = ((Integer) tag).intValue();
                for (int i12 = 0; i12 < 2; i12++) {
                    n10 n10Var3 = this.d;
                    if (i12 == 0) {
                        nextTextView = n10Var3.getTextView();
                    } else {
                        nextTextView = n10Var3.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.g6.v0(intValue, c6Var));
                        CharSequence text = nextTextView.getText();
                        if ((text instanceof Spanned) && (t41VarArr = (t41[]) ((Spanned) text).getSpans(0, text.length(), t41.class)) != null) {
                            for (t41 t41Var : t41VarArr) {
                                t41Var.f32867b = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23347t7, c6Var);
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
        boolean z11 = this.f26413v0;
        int i10 = 0;
        this.f26413v0 = false;
        while (true) {
            org.telegram.ui.ActionBar.u0[] u0VarArr = this.E;
            if (i10 < u0VarArr.length) {
                org.telegram.ui.ActionBar.c6 c6Var = this.f26401l0;
                if (!z11 && Math.abs(playbackSpeed - I0[i10]) < 0.05f) {
                    org.telegram.ui.ActionBar.u0 u0Var = u0VarArr[i10];
                    int i11 = org.telegram.ui.ActionBar.g6.Qh;
                    u0Var.a(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
                } else {
                    org.telegram.ui.ActionBar.u0 u0Var2 = u0VarArr[i10];
                    int i12 = org.telegram.ui.ActionBar.g6.E8;
                    u0Var2.a(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
                }
                i10++;
            } else {
                this.D.d(playbackSpeed, z10);
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
        if (this.P != i10) {
            b();
            int i15 = this.P;
            cd cdVar = this.f26385a;
            boolean z12 = true;
            if (i15 == 3 || i15 == 1) {
                t10 D0 = org.telegram.ui.ActionBar.g6.D0();
                ArrayList arrayList = D0.f32800l;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    D0.d = D0.f32792b;
                    D0.f32792b = null;
                    D0.f32793c = null;
                }
                if (cdVar.f27454u) {
                    cdVar.f27454u = false;
                    jf.j.d().f(cdVar.F);
                }
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().unregisterStateListener(this);
                }
                vd.k kVar = this.G0;
                if (kVar != null) {
                    kVar.i(null, true);
                }
            }
            this.P = i10;
            m10 m10Var = this.f26407r;
            if (i10 != 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            m10Var.setWillNotDraw(z10);
            if (i10 != 4) {
                this.f26390c0 = false;
            }
            h9 h9Var = this.T;
            if (h9Var != null) {
                h9Var.setStyle(this.P);
                this.T.setLayoutParams(i7.f6.e(108, getStyleHeight(), 51));
            }
            this.f26407r.setLayoutParams(i7.f6.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
            float f9 = this.N;
            if (f9 > 0.0f && f9 != AndroidUtilities.dp2(getStyleHeight())) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.f26401l0;
            if (i10 == 6) {
                this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                this.f26407r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.nk, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ok, c6Var)}));
                this.f26407r.setTag(null);
                this.f26392e.setVisibility(8);
                this.H.setVisibility(8);
                this.A.setVisibility(8);
                this.f26387b.setVisibility(8);
                this.f26416x.setVisibility(8);
                this.f26414w.setVisibility(8);
                this.f26414w.i();
                this.T.setVisibility(8);
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.A7));
                for (int i16 = 0; i16 < 2; i16++) {
                    n10 n10Var = this.d;
                    if (i16 == 0) {
                        nextTextView5 = n10Var.getTextView();
                    } else {
                        nextTextView5 = n10Var.getNextTextView();
                    }
                    if (nextTextView5 != null) {
                        nextTextView5.setGravity(19);
                        nextTextView5.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var));
                        nextTextView5.setTypeface(AndroidUtilities.bold());
                        nextTextView5.setTextSize(1, 15.0f);
                    }
                }
                this.d.setLayoutParams(i7.f6.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            } else if (i10 == 5) {
                this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                this.f26407r.setBackgroundColor(0);
                this.f26407r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23384v7));
                for (int i17 = 0; i17 < 2; i17++) {
                    n10 n10Var2 = this.d;
                    if (i17 == 0) {
                        nextTextView4 = n10Var2.getTextView();
                    } else {
                        nextTextView4 = n10Var2.getNextTextView();
                    }
                    if (nextTextView4 != null) {
                        nextTextView4.setGravity(19);
                        nextTextView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23366u7, c6Var));
                        nextTextView4.setTypeface(Typeface.DEFAULT);
                        nextTextView4.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23366u7));
                this.f26392e.setVisibility(8);
                this.H.setVisibility(8);
                this.A.setVisibility(8);
                this.f26387b.setVisibility(8);
                this.f26416x.setVisibility(8);
                this.T.setVisibility(8);
                this.f26414w.setVisibility(0);
                this.f26414w.d();
                this.A.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                org.telegram.ui.ActionBar.w0 w0Var = this.B;
                if (w0Var != null) {
                    w0Var.setVisibility(8);
                    this.B.setTag(null);
                }
                this.d.setLayoutParams(i7.f6.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            } else if (i10 != 0 && i10 != 2) {
                if (i10 == 4) {
                    this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    this.f26407r.setBackgroundColor(0);
                    this.f26407r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23384v7));
                    this.f26416x.setVisibility(8);
                    this.f26392e.setVisibility(0);
                    for (int i18 = 0; i18 < 2; i18++) {
                        n10 n10Var3 = this.d;
                        if (i18 == 0) {
                            nextTextView3 = n10Var3.getTextView();
                        } else {
                            nextTextView3 = n10Var3.getNextTextView();
                        }
                        if (nextTextView3 != null) {
                            nextTextView3.setGravity(51);
                            nextTextView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23347t7, c6Var));
                            nextTextView3.setTypeface(AndroidUtilities.bold());
                            nextTextView3.setTextSize(1, 15.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23347t7));
                    this.d.setPadding(0, 0, this.I, 0);
                    this.f26414w.setVisibility(8);
                    this.f26414w.i();
                    ug ugVar = this.f26402n;
                    z12 = (ugVar == null || ugVar.getGroupCall() == null || ugVar.getGroupCall().call == null || !ugVar.getGroupCall().call.rtmp_stream) ? false : false;
                    h9 h9Var2 = this.T;
                    if (!z12) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    h9Var2.setVisibility(i14);
                    if (this.T.getVisibility() != 8) {
                        n(false);
                    } else {
                        this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                        this.f26392e.setTranslationX(-AndroidUtilities.dp(36.0f));
                    }
                    this.A.setVisibility(8);
                    this.f26387b.setVisibility(8);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.B;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                        this.B.setTag(null);
                    }
                } else if (i10 == 1 || i10 == 3) {
                    this.v.setBackground(null);
                    o();
                    boolean hasRtmpStream = VoIPService.hasRtmpStream();
                    h9 h9Var3 = this.T;
                    if (!hasRtmpStream) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    h9Var3.setVisibility(i11);
                    if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().registerStateListener(this);
                    }
                    if (this.T.getVisibility() != 8) {
                        n(false);
                    } else {
                        this.d.setTranslationX(0.0f);
                        this.f26392e.setTranslationX(0.0f);
                    }
                    p10 p10Var = this.f26416x;
                    if (!hasRtmpStream) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    p10Var.setVisibility(i12);
                    if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.K = z11;
                    xi0 xi0Var = this.f26418y;
                    if (z11) {
                        i13 = 15;
                    } else {
                        i13 = 29;
                    }
                    xi0Var.N(i13);
                    xi0 xi0Var2 = this.f26418y;
                    xi0Var2.L(xi0Var2.f34739f - 1, false, true);
                    this.f26416x.invalidate();
                    this.f26407r.setBackground(null);
                    this.f26407r.setBackgroundColor(0);
                    this.f26414w.setVisibility(8);
                    this.f26414w.i();
                    ArrayList arrayList2 = org.telegram.ui.ActionBar.g6.D0().f32800l;
                    if (!arrayList2.contains(this)) {
                        arrayList2.add(this);
                    }
                    if (!cdVar.f27454u) {
                        cdVar.f27454u = true;
                        cdVar.f27453t = SystemClock.elapsedRealtime();
                        jf.j.d().a(60, cdVar.F);
                    }
                    invalidate();
                    for (int i19 = 0; i19 < 2; i19++) {
                        n10 n10Var4 = this.d;
                        if (i19 == 0) {
                            nextTextView2 = n10Var4.getTextView();
                        } else {
                            nextTextView2 = n10Var4.getNextTextView();
                        }
                        if (nextTextView2 != null) {
                            nextTextView2.setGravity(19);
                            nextTextView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var));
                            nextTextView2.setTypeface(AndroidUtilities.bold());
                            nextTextView2.setTextSize(1, 14.0f);
                        }
                    }
                    this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.A7));
                    this.A.setVisibility(8);
                    this.f26387b.setVisibility(8);
                    this.f26392e.setVisibility(8);
                    this.H.setVisibility(8);
                    this.d.setLayoutParams(i7.f6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
                    this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.I, 0);
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.B;
                    if (w0Var3 != null) {
                        w0Var3.setVisibility(8);
                        this.B.setTag(null);
                    }
                }
            } else {
                this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                this.f26407r.setBackgroundColor(0);
                this.f26407r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23384v7));
                this.f26392e.setVisibility(8);
                this.H.setVisibility(8);
                this.A.setVisibility(0);
                this.f26387b.setVisibility(0);
                this.f26416x.setVisibility(8);
                this.f26414w.setVisibility(8);
                this.f26414w.i();
                this.T.setVisibility(8);
                for (int i20 = 0; i20 < 2; i20++) {
                    n10 n10Var5 = this.d;
                    if (i20 == 0) {
                        nextTextView = n10Var5.getTextView();
                    } else {
                        nextTextView = n10Var5.getNextTextView();
                    }
                    if (nextTextView != null) {
                        nextTextView.setGravity(19);
                        nextTextView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23366u7, c6Var));
                        nextTextView.setTypeface(Typeface.DEFAULT);
                        nextTextView.setTextSize(1, 15.0f);
                    }
                }
                this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23366u7));
                if (i10 == 6) {
                    this.f26387b.setLayoutParams(i7.f6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(i7.f6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.A.setVisibility(8);
                } else if (i10 == 0) {
                    this.f26387b.setLayoutParams(i7.f6.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(i7.f6.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                    h();
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.B;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(0);
                        this.B.setTag(1);
                    }
                    this.A.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                } else {
                    this.f26387b.setLayoutParams(i7.f6.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(i7.f6.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.A.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                }
            }
        }
    }

    public void setDelegate(r10 r10Var) {
        this.f26400k0 = r10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.D0 = z10;
    }

    public void setLeftMargin(float f9) {
        if (this.f26407r == null) {
            this.F0 = f9;
            return;
        }
        ImageView imageView = this.f26387b;
        if (imageView != null) {
            imageView.setTranslationX(f9);
        }
        aj0 aj0Var = this.f26414w;
        if (aj0Var != null) {
            aj0Var.setTranslationX(f9);
        }
        n10 n10Var = this.d;
        if (n10Var != null) {
            n10Var.setTranslationX(f9);
        }
        n10 n10Var2 = this.f26392e;
        if (n10Var2 != null) {
            n10Var2.setTranslationX(f9);
        }
        h9 h9Var = this.T;
        if (h9Var != null) {
            h9Var.setTranslationX(f9);
        }
    }

    public void setSupportsCalls(boolean z10) {
        this.S = z10;
    }

    public void setTopPadding(float f9) {
        this.N = f9;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.N);
        if (i10 == 8) {
            this.B0 = false;
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.o2 o2Var, View view, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26385a = new cd();
        this.E = new org.telegram.ui.ActionBar.u0[6];
        this.L = -1;
        this.P = -1;
        this.S = true;
        this.f26393e0 = new n6(false, true, true, false);
        this.f26397h0 = new l10(this);
        this.f26398i0 = UserConfig.selectedAccount;
        this.f26403n0 = -1;
        this.f26404o0 = new lh.m7(this, 23);
        this.f26405p0 = new AnimationNotificationsLocker();
        this.f26406q0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.C0 = new Paint(1);
        this.E0 = 0;
        this.G0 = new vd.k(new f10(this), jr.h, 450L);
        this.H0 = 0;
        this.f26401l0 = c6Var;
        this.h = o2Var;
        if (o2Var instanceof ug) {
            this.f26402n = (ug) o2Var;
        }
        this.O = true;
        this.f26399j0 = z10;
        if (view == null) {
            ((ViewGroup) o2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
