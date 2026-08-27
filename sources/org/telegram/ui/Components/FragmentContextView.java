package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
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
import org.telegram.messenger.Utilities;
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
    public org.telegram.ui.ActionBar.v0 B;
    public boolean B0;
    public af.g C;
    public final Paint C0;
    public org.telegram.ui.ActionBar.b1 D;
    public boolean D0;
    public final org.telegram.ui.ActionBar.t0[] E;
    public int E0;
    public FrameLayout F;
    public float F0;
    public ImageView G;
    public final ud.j G0;
    public org.telegram.ui.ik H;
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
    public b9 T;
    public Paint U;
    public LinearGradient V;
    public Matrix W;

    public final vc f26370a;

    public int f26371a0;

    public ImageView f26372b;

    public TextPaint f26373b0;

    public tf0 f26374c;

    public boolean f26375c0;
    public f10 d;

    public boolean f26376d0;

    public f10 f26377e;

    public final i6 f26378e0;

    public AnimatorSet f26379f;

    public nc f26380f0;

    public boolean f26381g0;
    public final org.telegram.ui.ActionBar.n2 h;

    public final d10 f26382h0;

    public final int f26383i0;

    public final boolean f26384j0;

    public j10 f26385k0;

    public final org.telegram.ui.ActionBar.c6 f26386l0;
    public boolean m0;

    public final ng f26387n;

    public int f26388n0;

    public final m.i3 f26389o0;

    public final AnimationNotificationsLocker f26390p0;

    public final AnimationNotificationsLocker f26391q0;

    public e10 f26392r;

    public boolean f26393r0;

    public ag.d f26394s;

    public boolean f26395s0;

    public boolean f26396t0;

    public boolean f26397u0;
    public View v;

    public boolean f26398v0;

    public ri0 f26399w;

    public org.telegram.ui.yi f26400w0;

    public h10 f26401x;

    public long f26402x0;

    public oi0 f26403y;

    public float f26404y0;

    public float f26405z0;

    public FragmentContextView(Context context, org.telegram.ui.gy gyVar, boolean z10) {
        this(context, gyVar, null, z10, null);
    }

    private int getTitleTextColor() {
        int i10 = this.P;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26386l0;
        if (i10 == 4) {
            return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23340t7, c6Var);
        }
        return (i10 == 1 || i10 == 3) ? org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23358u7, c6Var);
    }

    public static boolean i(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.05f;
    }

    public static boolean j() {
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        return playingMessageObject != null && playingMessageObject.isVoice();
    }

    public final void a(boolean z10) {
        boolean z11;
        ChatObject.Call groupCall;
        boolean z12;
        ChatObject.Call call;
        int i10;
        int i11;
        boolean z13;
        AnimatorSet animatorSet;
        boolean z14;
        ChatObject.Call groupCall2;
        TLRPC.Chat chatG;
        TLRPC.GroupCall groupCall3;
        int i12;
        String str;
        int i13;
        boolean z15;
        TLRPC.GroupCall groupCall4;
        boolean z16;
        boolean z17;
        int i14;
        int i15;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.O && this.P == 5 && (sharedInstance == null || sharedInstance.isHangingUp())) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        View fragmentView = n2Var.getFragmentView();
        boolean z18 = (z10 || fragmentView == null || (fragmentView.getParent() != null && ((View) fragmentView.getParent()).getVisibility() == 0)) ? z10 : true;
        boolean zC = n20.c();
        ng ngVar = this.f26387n;
        if (!zC) {
            z11 = (org.telegram.ui.s50.A3 || !this.S || sharedInstance == null || sharedInstance.isHangingUp()) ? false : true;
            if (sharedInstance != null && (call = sharedInstance.groupCall) != null && (call.call instanceof TLRPC.TL_groupCallDiscarded)) {
                z11 = false;
            }
            if (!j() && !org.telegram.ui.s50.A3 && this.S && !z11 && ngVar != null && (groupCall = ngVar.getGroupCall()) != null && groupCall.shouldShowPanel()) {
                z11 = true;
                z12 = true;
            }
            AnimationNotificationsLocker animationNotificationsLocker = this.f26390p0;
            if (!z11) {
                z17 = this.O;
                if (!z17 && ((z18 && this.P == -1) || (i15 = this.P) == 4 || i15 == 3 || i15 == 1)) {
                    this.O = false;
                    if (z18) {
                        if (getVisibility() != 8) {
                            setVisibility(8);
                        }
                        setTopPadding(0.0f);
                    } else {
                        AnimatorSet animatorSet2 = this.f26379f;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                            this.f26379f = null;
                        }
                        animationNotificationsLocker.lock();
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        this.f26379f = animatorSet3;
                        animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                        this.f26379f.setDuration(220L);
                        this.f26379f.setInterpolator(er.f28122f);
                        this.f26379f.addListener(new c10(this, 9));
                        this.f26379f.start();
                    }
                } else if (z17 && ((i14 = this.P) == -1 || i14 == 4 || i14 == 3 || i14 == 1)) {
                    this.O = false;
                    setVisibility(8);
                }
                if (z18 || ngVar == null || !ngVar.G() || n20.c()) {
                    return;
                }
                org.telegram.messenger.y1.q(R.string.InviteExpired, mc.a0(n2Var), R.raw.linkbroken, 36);
                return;
            }
            b();
            if (z12) {
                i10 = 4;
            } else if (sharedInstance.groupCall != null) {
                i10 = 3;
            } else {
                i10 = 1;
            }
            i11 = this.P;
            if (i10 == i11 && this.f26379f != null && !z18) {
                this.f26393r0 = true;
                return;
            }
            if (i10 == i11 && this.O && !z18) {
                AnimatorSet animatorSet4 = this.f26379f;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                    this.f26379f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet5 = new AnimatorSet();
                this.f26379f = animatorSet5;
                animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f26379f.setDuration(220L);
                this.f26379f.setInterpolator(er.f28122f);
                this.f26379f.addListener(new c10(this, 10));
                this.f26379f.start();
                return;
            }
            if (z12) {
                if (i11 == 4 || !this.O) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                r(4);
                groupCall2 = ngVar.getGroupCall();
                chatG = ngVar.g();
                if (groupCall2.isScheduled()) {
                    if (this.U == null) {
                        TextPaint textPaint = new TextPaint(1);
                        this.f26373b0 = textPaint;
                        textPaint.setColor(-1);
                        this.f26373b0.setTextSize(AndroidUtilities.dp(14.0f));
                        this.f26373b0.setTypeface(AndroidUtilities.bold());
                        Paint paint = new Paint(1);
                        this.U = paint;
                        paint.setColor(-1);
                        this.W = new Matrix();
                    }
                    this.f26375c0 = true;
                    LocaleController.getString(R.string.VoipChatNotify);
                    groupCall4 = groupCall2.call;
                    if (groupCall4 == null && groupCall4.schedule_start_subscribed) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    this.f26376d0 = z16;
                    this.H.setVisibility(8);
                    if (!TextUtils.isEmpty(groupCall2.call.title)) {
                        this.d.b(groupCall2.call.title, false);
                    } else if (ChatObject.isChannelOrGiga(chatG)) {
                        this.d.b(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                    } else {
                        this.d.b(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                    }
                    this.f26377e.b(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                    if (!this.f26381g0) {
                        this.f26381g0 = true;
                        this.f26382h0.run();
                    }
                } else {
                    this.f26375c0 = false;
                    this.H.setVisibility(0);
                    this.H.setText(LocaleController.getString(R.string.VoipChatJoin));
                    if (!TextUtils.isEmpty(groupCall2.call.title)) {
                        this.d.b(groupCall2.call.title, false);
                    } else if (groupCall2.call.rtmp_stream && !ChatObject.isChannelOrGiga(chatG)) {
                        this.d.b(LocaleController.getString(R.string.VoipGroupVoiceChat), false);
                    } else {
                        this.d.b(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                    }
                    groupCall3 = groupCall2.call;
                    i12 = groupCall3.participants_count;
                    if (i12 == 0) {
                        f10 f10Var = this.f26377e;
                        if (groupCall3.rtmp_stream) {
                            i13 = R.string.ViewersWatchingNobody;
                        } else {
                            i13 = R.string.MembersTalkingNobody;
                        }
                        f10Var.b(LocaleController.getString(i13), false);
                    } else {
                        f10 f10Var2 = this.f26377e;
                        if (groupCall3.rtmp_stream) {
                            str = "ViewersWatching";
                        } else {
                            str = "Participants";
                        }
                        f10Var2.b(LocaleController.formatPluralString(str, i12, new Object[0]), false);
                    }
                    this.f26392r.invalidate();
                }
                if (this.T.f27049a.d || !z14) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                n(z15);
            } else if (sharedInstance != null || sharedInstance.groupCall == null) {
                if (i11 == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n(z13);
                r(1);
            } else {
                n(i11 == 3);
                r(3);
            }
            if (this.O) {
            }
            if (z18) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                m();
            } else {
                animatorSet = this.f26379f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26379f = null;
                }
                this.f26379f = new AnimatorSet();
                this.f26391q0.lock();
                this.f26379f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f26379f.setDuration(220L);
                this.f26379f.setInterpolator(er.f28122f);
                this.f26379f.addListener(new c10(this, 11));
                this.f26379f.start();
            }
            this.O = true;
            setVisibility(0);
        }
        z11 = false;
        z12 = false;
        AnimationNotificationsLocker animationNotificationsLocker2 = this.f26390p0;
        if (!z11) {
            z17 = this.O;
            if (!z17) {
                if (z17) {
                    this.O = false;
                    setVisibility(8);
                }
            } else if (z17) {
                this.O = false;
                setVisibility(8);
            }
            if (z18) {
                return;
            } else {
                return;
            }
        }
        b();
        if (z12) {
            i10 = 4;
        } else if (sharedInstance.groupCall != null) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        i11 = this.P;
        if (i10 == i11) {
        }
        if (i10 == i11) {
        }
        if (z12) {
            if (i11 == 4) {
                z14 = false;
            } else {
                z14 = false;
            }
            r(4);
            groupCall2 = ngVar.getGroupCall();
            chatG = ngVar.g();
            if (groupCall2.isScheduled()) {
                if (this.U == null) {
                    TextPaint textPaint2 = new TextPaint(1);
                    this.f26373b0 = textPaint2;
                    textPaint2.setColor(-1);
                    this.f26373b0.setTextSize(AndroidUtilities.dp(14.0f));
                    this.f26373b0.setTypeface(AndroidUtilities.bold());
                    Paint paint2 = new Paint(1);
                    this.U = paint2;
                    paint2.setColor(-1);
                    this.W = new Matrix();
                }
                this.f26375c0 = true;
                LocaleController.getString(R.string.VoipChatNotify);
                groupCall4 = groupCall2.call;
                if (groupCall4 == null) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                this.f26376d0 = z16;
                this.H.setVisibility(8);
                if (!TextUtils.isEmpty(groupCall2.call.title)) {
                    this.d.b(groupCall2.call.title, false);
                } else if (ChatObject.isChannelOrGiga(chatG)) {
                    this.d.b(LocaleController.getString(R.string.VoipChannelScheduledVoiceChat), false);
                } else {
                    this.d.b(LocaleController.getString(R.string.VoipGroupScheduledVoiceChat), false);
                }
                this.f26377e.b(LocaleController.formatStartsTime(groupCall2.call.schedule_date, 4), false);
                if (!this.f26381g0) {
                    this.f26381g0 = true;
                    this.f26382h0.run();
                }
            } else {
                this.f26375c0 = false;
                this.H.setVisibility(0);
                this.H.setText(LocaleController.getString(R.string.VoipChatJoin));
                if (!TextUtils.isEmpty(groupCall2.call.title)) {
                    this.d.b(groupCall2.call.title, false);
                } else if (groupCall2.call.rtmp_stream) {
                    this.d.b(LocaleController.getString(R.string.VoipChannelVoiceChat), false);
                } else {
                    this.d.b(LocaleController.getString(R.string.VoipGroupVoiceChat), false);
                }
                groupCall3 = groupCall2.call;
                i12 = groupCall3.participants_count;
                if (i12 == 0) {
                    f10 f10Var3 = this.f26377e;
                    if (groupCall3.rtmp_stream) {
                        i13 = R.string.ViewersWatchingNobody;
                    } else {
                        i13 = R.string.MembersTalkingNobody;
                    }
                    f10Var3.b(LocaleController.getString(i13), false);
                } else {
                    f10 f10Var4 = this.f26377e;
                    if (groupCall3.rtmp_stream) {
                        str = "ViewersWatching";
                    } else {
                        str = "Participants";
                    }
                    f10Var4.b(LocaleController.formatPluralString(str, i12, new Object[0]), false);
                }
                this.f26392r.invalidate();
            }
            if (this.T.f27049a.d) {
                z15 = false;
            } else {
                z15 = false;
            }
            n(z15);
        } else if (sharedInstance != null) {
            if (i11 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            n(z13);
            r(1);
        } else {
            if (i11 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            n(z13);
            r(1);
        }
        if (this.O) {
            if (z18) {
                animatorSet = this.f26379f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26379f = null;
                }
                this.f26379f = new AnimatorSet();
                this.f26391q0.lock();
                this.f26379f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f26379f.setDuration(220L);
                this.f26379f.setInterpolator(er.f28122f);
                this.f26379f.addListener(new c10(this, 11));
                this.f26379f.start();
            } else {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                m();
            }
            this.O = true;
            setVisibility(0);
        }
    }

    public final void b() {
        if (this.f26392r != null) {
            return;
        }
        Context context = getContext();
        e10 e10Var = new e10(this, context);
        this.f26392r = e10Var;
        this.f26380f0 = new nc(e10Var);
        int i10 = AndroidUtilities.displaySize.x;
        i6 i6Var = this.f26378e0;
        i6Var.G = i10;
        i6Var.v = 0.4f;
        i6Var.setCallback(e10Var);
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        addView(this.f26392r, h7.z5.d(-1, 36.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.v = view;
        this.f26392r.addView(view, h7.z5.c(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        this.f26372b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.f26372b;
        int i11 = org.telegram.ui.ActionBar.g6.f23392w7;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26386l0;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        ImageView imageView3 = this.f26372b;
        tf0 tf0Var = new tf0(16);
        this.f26374c = tf0Var;
        imageView3.setImageDrawable(tf0Var);
        this.f26372b.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i11, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        addView(this.f26372b, h7.z5.e(36, 36, 51));
        final int i12 = 2;
        this.f26372b.setOnClickListener(new View.OnClickListener(this) {

            public final FragmentContextView f34750b;

            {
                this.f34750b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int currentAccount;
                long jA;
                TL_stories.StoryItem storyItemU;
                int i13 = i12;
                FragmentContextView fragmentContextView = this.f34750b;
                switch (i13) {
                    case 0:
                        ng ngVar = fragmentContextView.f26387n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.f26386l0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.P != 2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            b2Var.N = string;
                            if (n2Var instanceof org.telegram.ui.gy) {
                                b2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat chatG = ngVar.g();
                                TLRPC.User userI = ngVar.i();
                                if (chatG != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, chatG.title));
                                } else if (userI != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(userI)));
                                } else {
                                    b2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new x00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var2));
                            }
                        }
                        break;
                    case 1:
                        ng ngVar2 = fragmentContextView.f26387n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.f26386l0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i14 = fragmentContextView.P;
                        int i15 = 6;
                        if (i14 == 6) {
                            jh.d1 d1Var = jh.d1.S;
                            if (d1Var != null) {
                                long j10 = d1Var.f13175b;
                                int i16 = d1Var.f13177e;
                                if (i16 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i16);
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                if (n2VarU != null && (storyItemU = MessagesController.getInstance(i16).getStoriesController().u(d1Var.f13176c, j10)) != null) {
                                    storyItemU.dialogId = j10;
                                    n2VarU.getOrCreateStoryViewer(i16).B(i16, fragmentContextView.getContext(), storyItemU, null);
                                }
                                break;
                            }
                        } else if (i14 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity activityFindActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (activityFindActivity instanceof LaunchActivity) {
                                        new b8(activityFindActivity, c6Var3).show();
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new b8(LaunchActivity.C1, c6Var3).show();
                                    }
                                } else if (playingMessageObject.getDialogId() != (ngVar2 != null ? ngVar2.a() : 0L)) {
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
                                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle), n2Var2 instanceof org.telegram.ui.rn);
                                } else {
                                    fragmentContextView.f26387n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                }
                                break;
                            }
                        } else if (i14 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i14 == 2) {
                            int i17 = UserConfig.selectedAccount;
                            if (ngVar2 != null) {
                                jA = ngVar2.a();
                                currentAccount = n2Var2.getCurrentAccount();
                            } else if (LocationController.getLocationsCount() == 1) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= 4) {
                                        currentAccount = i17;
                                        jA = 0;
                                    } else if (LocationController.getInstance(i18).sharingLocationsUI.isEmpty()) {
                                        i18++;
                                    } else {
                                        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i18).sharingLocationsUI.get(0);
                                        long j11 = sharingLocationInfo.did;
                                        currentAccount = sharingLocationInfo.messageObject.currentAccount;
                                        jA = j11;
                                    }
                                }
                            } else {
                                currentAccount = i17;
                                jA = 0;
                            }
                            if (jA == 0) {
                                n2Var2.showDialog(new lu0(fragmentContextView.getContext(), new x00(fragmentContextView), c6Var3));
                            } else {
                                fragmentContextView.k(LocationController.getInstance(currentAccount).getSharingLocationInfo(jA));
                            }
                            break;
                        } else if (i14 != 3) {
                            if (i14 == 4) {
                                if (n2Var2.getParentActivity() != null && (groupCall = ngVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                }
                                break;
                            } else if (i14 == 5) {
                                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                                if (n2Var2.getSendMessagesHelper().getImportingHistory(rnVar.a()) != null) {
                                    l40 l40Var = new l40(fragmentContextView.getContext(), null, rnVar, c6Var3);
                                    l40Var.setOnHideListener(new a1(fragmentContextView, i15));
                                    n2Var2.showDialog(l40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.s50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
                            if (!MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                            } else {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
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
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.f26403y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26403y.K(0);
                                } else {
                                    fragmentContextView.f26403y.K(14);
                                }
                            }
                            fragmentContextView.f26401x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView.f26370a.f(true);
                            try {
                                fragmentContextView.f26401x.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ri0 ri0Var = new ri0(context);
        this.f26399w = ri0Var;
        ri0Var.setScaleType(scaleType);
        this.f26399w.setAutoRepeat(true);
        this.f26399w.f(R.raw.import_progress, 30, 30, null);
        this.f26399w.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        addView(this.f26399w, h7.z5.d(22, 22.0f, 51, 7.0f, 7.0f, 0.0f, 0.0f));
        f10 f10Var = new f10(this, context, context, 0);
        this.d = f10Var;
        addView(f10Var, h7.z5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
        f10 f10Var2 = new f10(this, context, context, 1);
        this.f26377e = f10Var2;
        addView(f10Var2, h7.z5.d(-1, 36.0f, 51, 35.0f, 10.0f, 36, 0.0f));
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.J = hVar;
        hVar.f33592g = 1.0f;
        hVar.f33594j = false;
        org.telegram.ui.ik ikVar = new org.telegram.ui.ik(this, context, 1);
        this.H = ikVar;
        ikVar.setText(LocaleController.getString(R.string.VoipChatJoin));
        this.H.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, c6Var));
        org.telegram.ui.ik ikVar2 = this.H;
        int iDp = AndroidUtilities.dp(16.0f);
        int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
        int iV2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var);
        ikVar2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iV1, iV2, iV2));
        this.H.setTextSize(1, 14.0f);
        this.H.setTypeface(AndroidUtilities.bold());
        this.H.setGravity(17);
        this.H.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(this.H, h7.z5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
        final int i13 = 3;
        this.H.setOnClickListener(new View.OnClickListener(this) {

            public final FragmentContextView f34750b;

            {
                this.f34750b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int currentAccount;
                long jA;
                TL_stories.StoryItem storyItemU;
                int i14 = i13;
                FragmentContextView fragmentContextView = this.f34750b;
                switch (i14) {
                    case 0:
                        ng ngVar = fragmentContextView.f26387n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.f26386l0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.P != 2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            b2Var.N = string;
                            if (n2Var instanceof org.telegram.ui.gy) {
                                b2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat chatG = ngVar.g();
                                TLRPC.User userI = ngVar.i();
                                if (chatG != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, chatG.title));
                                } else if (userI != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(userI)));
                                } else {
                                    b2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new x00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var2));
                            }
                        }
                        break;
                    case 1:
                        ng ngVar2 = fragmentContextView.f26387n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.f26386l0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i15 = fragmentContextView.P;
                        int i16 = 6;
                        if (i15 == 6) {
                            jh.d1 d1Var = jh.d1.S;
                            if (d1Var != null) {
                                long j10 = d1Var.f13175b;
                                int i17 = d1Var.f13177e;
                                if (i17 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i17);
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                if (n2VarU != null && (storyItemU = MessagesController.getInstance(i17).getStoriesController().u(d1Var.f13176c, j10)) != null) {
                                    storyItemU.dialogId = j10;
                                    n2VarU.getOrCreateStoryViewer(i17).B(i17, fragmentContextView.getContext(), storyItemU, null);
                                }
                                break;
                            }
                        } else if (i15 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity activityFindActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (activityFindActivity instanceof LaunchActivity) {
                                        new b8(activityFindActivity, c6Var3).show();
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new b8(LaunchActivity.C1, c6Var3).show();
                                    }
                                } else if (playingMessageObject.getDialogId() != (ngVar2 != null ? ngVar2.a() : 0L)) {
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
                                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle), n2Var2 instanceof org.telegram.ui.rn);
                                } else {
                                    fragmentContextView.f26387n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                }
                                break;
                            }
                        } else if (i15 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i15 == 2) {
                            int i18 = UserConfig.selectedAccount;
                            if (ngVar2 != null) {
                                jA = ngVar2.a();
                                currentAccount = n2Var2.getCurrentAccount();
                            } else if (LocationController.getLocationsCount() == 1) {
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= 4) {
                                        currentAccount = i18;
                                        jA = 0;
                                    } else if (LocationController.getInstance(i19).sharingLocationsUI.isEmpty()) {
                                        i19++;
                                    } else {
                                        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i19).sharingLocationsUI.get(0);
                                        long j11 = sharingLocationInfo.did;
                                        currentAccount = sharingLocationInfo.messageObject.currentAccount;
                                        jA = j11;
                                    }
                                }
                            } else {
                                currentAccount = i18;
                                jA = 0;
                            }
                            if (jA == 0) {
                                n2Var2.showDialog(new lu0(fragmentContextView.getContext(), new x00(fragmentContextView), c6Var3));
                            } else {
                                fragmentContextView.k(LocationController.getInstance(currentAccount).getSharingLocationInfo(jA));
                            }
                            break;
                        } else if (i15 != 3) {
                            if (i15 == 4) {
                                if (n2Var2.getParentActivity() != null && (groupCall = ngVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                }
                                break;
                            } else if (i15 == 5) {
                                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                                if (n2Var2.getSendMessagesHelper().getImportingHistory(rnVar.a()) != null) {
                                    l40 l40Var = new l40(fragmentContextView.getContext(), null, rnVar, c6Var3);
                                    l40Var.setOnHideListener(new a1(fragmentContextView, i16));
                                    n2Var2.showDialog(l40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.s50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
                            if (!MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                            } else {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
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
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.f26403y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26403y.K(0);
                                } else {
                                    fragmentContextView.f26403y.K(14);
                                }
                            }
                            fragmentContextView.f26401x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView.f26370a.f(true);
                            try {
                                fragmentContextView.f26401x.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                }
            }
        });
        if (this.A0) {
            m();
        }
        this.F = new FrameLayout(context);
        ImageView imageView4 = new ImageView(context);
        this.G = imageView4;
        imageView4.setImageResource(R.drawable.msg_mute);
        ImageView imageView5 = this.G;
        int i14 = org.telegram.ui.ActionBar.g6.f23407x7;
        imageView5.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
        this.F.addView(this.G, h7.z5.e(20, 20, 17));
        this.F.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i14, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.F.setContentDescription(LocaleController.getString(R.string.Unmute));
        this.F.setOnClickListener(new ag.l2(15));
        this.F.setVisibility(8);
        addView(this.F, h7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        if (!this.f26384j0) {
            h();
        }
        b9 b9Var = new b9(context, false);
        this.T = b9Var;
        b9Var.setAvatarsTextSize(AndroidUtilities.dp(21.0f));
        this.T.setDelegate(new b10(this, 1));
        this.T.setVisibility(8);
        addView(this.T, h7.z5.e(108, 36, 51));
        this.f26403y = new oi0(R.raw.voice_muted, "" + R.raw.voice_muted, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), true, null);
        h10 h10Var = new h10(this, context);
        this.f26401x = h10Var;
        h10Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var), PorterDuff.Mode.SRC_IN));
        this.f26401x.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i14, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.f26401x.setAnimation(this.f26403y);
        this.f26401x.setScaleType(scaleType);
        this.f26401x.setVisibility(8);
        addView(this.f26401x, h7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
        final int i15 = 4;
        this.f26401x.setOnClickListener(new View.OnClickListener(this) {

            public final FragmentContextView f34750b;

            {
                this.f34750b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int currentAccount;
                long jA;
                TL_stories.StoryItem storyItemU;
                int i16 = i15;
                FragmentContextView fragmentContextView = this.f34750b;
                switch (i16) {
                    case 0:
                        ng ngVar = fragmentContextView.f26387n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.f26386l0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.P != 2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            b2Var.N = string;
                            if (n2Var instanceof org.telegram.ui.gy) {
                                b2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat chatG = ngVar.g();
                                TLRPC.User userI = ngVar.i();
                                if (chatG != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, chatG.title));
                                } else if (userI != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(userI)));
                                } else {
                                    b2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new x00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var2));
                            }
                        }
                        break;
                    case 1:
                        ng ngVar2 = fragmentContextView.f26387n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.f26386l0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i17 = fragmentContextView.P;
                        int i18 = 6;
                        if (i17 == 6) {
                            jh.d1 d1Var = jh.d1.S;
                            if (d1Var != null) {
                                long j10 = d1Var.f13175b;
                                int i19 = d1Var.f13177e;
                                if (i19 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i19);
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                if (n2VarU != null && (storyItemU = MessagesController.getInstance(i19).getStoriesController().u(d1Var.f13176c, j10)) != null) {
                                    storyItemU.dialogId = j10;
                                    n2VarU.getOrCreateStoryViewer(i19).B(i19, fragmentContextView.getContext(), storyItemU, null);
                                }
                                break;
                            }
                        } else if (i17 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity activityFindActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (activityFindActivity instanceof LaunchActivity) {
                                        new b8(activityFindActivity, c6Var3).show();
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new b8(LaunchActivity.C1, c6Var3).show();
                                    }
                                } else if (playingMessageObject.getDialogId() != (ngVar2 != null ? ngVar2.a() : 0L)) {
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
                                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle), n2Var2 instanceof org.telegram.ui.rn);
                                } else {
                                    fragmentContextView.f26387n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                }
                                break;
                            }
                        } else if (i17 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i17 == 2) {
                            int i110 = UserConfig.selectedAccount;
                            if (ngVar2 != null) {
                                jA = ngVar2.a();
                                currentAccount = n2Var2.getCurrentAccount();
                            } else if (LocationController.getLocationsCount() == 1) {
                                int i111 = 0;
                                while (true) {
                                    if (i111 >= 4) {
                                        currentAccount = i110;
                                        jA = 0;
                                    } else if (LocationController.getInstance(i111).sharingLocationsUI.isEmpty()) {
                                        i111++;
                                    } else {
                                        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i111).sharingLocationsUI.get(0);
                                        long j11 = sharingLocationInfo.did;
                                        currentAccount = sharingLocationInfo.messageObject.currentAccount;
                                        jA = j11;
                                    }
                                }
                            } else {
                                currentAccount = i110;
                                jA = 0;
                            }
                            if (jA == 0) {
                                n2Var2.showDialog(new lu0(fragmentContextView.getContext(), new x00(fragmentContextView), c6Var3));
                            } else {
                                fragmentContextView.k(LocationController.getInstance(currentAccount).getSharingLocationInfo(jA));
                            }
                            break;
                        } else if (i17 != 3) {
                            if (i17 == 4) {
                                if (n2Var2.getParentActivity() != null && (groupCall = ngVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                }
                                break;
                            } else if (i17 == 5) {
                                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                                if (n2Var2.getSendMessagesHelper().getImportingHistory(rnVar.a()) != null) {
                                    l40 l40Var = new l40(fragmentContextView.getContext(), null, rnVar, c6Var3);
                                    l40Var.setOnHideListener(new a1(fragmentContextView, i18));
                                    n2Var2.showDialog(l40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.s50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
                            if (!MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                            } else {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
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
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.f26403y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26403y.K(0);
                                } else {
                                    fragmentContextView.f26403y.K(14);
                                }
                            }
                            fragmentContextView.f26401x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView.f26370a.f(true);
                            try {
                                fragmentContextView.f26401x.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.A = imageView6;
        imageView6.setImageResource(R.drawable.miniplayer_close);
        this.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), mode));
        this.A.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i14, c6Var) & 436207615, 1, AndroidUtilities.dp(14.0f)));
        this.A.setScaleType(scaleType);
        addView(this.A, h7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
        final int i16 = 0;
        this.A.setOnClickListener(new View.OnClickListener(this) {

            public final FragmentContextView f34750b;

            {
                this.f34750b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int currentAccount;
                long jA;
                TL_stories.StoryItem storyItemU;
                int i17 = i16;
                FragmentContextView fragmentContextView = this.f34750b;
                switch (i17) {
                    case 0:
                        ng ngVar = fragmentContextView.f26387n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.f26386l0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.P != 2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            b2Var.N = string;
                            if (n2Var instanceof org.telegram.ui.gy) {
                                b2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat chatG = ngVar.g();
                                TLRPC.User userI = ngVar.i();
                                if (chatG != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, chatG.title));
                                } else if (userI != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(userI)));
                                } else {
                                    b2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new x00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var2));
                            }
                        }
                        break;
                    case 1:
                        ng ngVar2 = fragmentContextView.f26387n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.f26386l0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i18 = fragmentContextView.P;
                        int i19 = 6;
                        if (i18 == 6) {
                            jh.d1 d1Var = jh.d1.S;
                            if (d1Var != null) {
                                long j10 = d1Var.f13175b;
                                int i110 = d1Var.f13177e;
                                if (i110 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i110);
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                if (n2VarU != null && (storyItemU = MessagesController.getInstance(i110).getStoriesController().u(d1Var.f13176c, j10)) != null) {
                                    storyItemU.dialogId = j10;
                                    n2VarU.getOrCreateStoryViewer(i110).B(i110, fragmentContextView.getContext(), storyItemU, null);
                                }
                                break;
                            }
                        } else if (i18 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity activityFindActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (activityFindActivity instanceof LaunchActivity) {
                                        new b8(activityFindActivity, c6Var3).show();
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new b8(LaunchActivity.C1, c6Var3).show();
                                    }
                                } else if (playingMessageObject.getDialogId() != (ngVar2 != null ? ngVar2.a() : 0L)) {
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
                                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle), n2Var2 instanceof org.telegram.ui.rn);
                                } else {
                                    fragmentContextView.f26387n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                }
                                break;
                            }
                        } else if (i18 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i18 == 2) {
                            int i111 = UserConfig.selectedAccount;
                            if (ngVar2 != null) {
                                jA = ngVar2.a();
                                currentAccount = n2Var2.getCurrentAccount();
                            } else if (LocationController.getLocationsCount() == 1) {
                                int i112 = 0;
                                while (true) {
                                    if (i112 >= 4) {
                                        currentAccount = i111;
                                        jA = 0;
                                    } else if (LocationController.getInstance(i112).sharingLocationsUI.isEmpty()) {
                                        i112++;
                                    } else {
                                        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i112).sharingLocationsUI.get(0);
                                        long j11 = sharingLocationInfo.did;
                                        currentAccount = sharingLocationInfo.messageObject.currentAccount;
                                        jA = j11;
                                    }
                                }
                            } else {
                                currentAccount = i111;
                                jA = 0;
                            }
                            if (jA == 0) {
                                n2Var2.showDialog(new lu0(fragmentContextView.getContext(), new x00(fragmentContextView), c6Var3));
                            } else {
                                fragmentContextView.k(LocationController.getInstance(currentAccount).getSharingLocationInfo(jA));
                            }
                            break;
                        } else if (i18 != 3) {
                            if (i18 == 4) {
                                if (n2Var2.getParentActivity() != null && (groupCall = ngVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                }
                                break;
                            } else if (i18 == 5) {
                                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                                if (n2Var2.getSendMessagesHelper().getImportingHistory(rnVar.a()) != null) {
                                    l40 l40Var = new l40(fragmentContextView.getContext(), null, rnVar, c6Var3);
                                    l40Var.setOnHideListener(new a1(fragmentContextView, i19));
                                    n2Var2.showDialog(l40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.s50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
                            if (!MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                            } else {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
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
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.f26403y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26403y.K(0);
                                } else {
                                    fragmentContextView.f26403y.K(14);
                                }
                            }
                            fragmentContextView.f26401x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView.f26370a.f(true);
                            try {
                                fragmentContextView.f26401x.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ag.d dVar = new ag.d(getContext(), 14);
        this.f26394s = dVar;
        addView(dVar, h7.z5.d(-1, -2.0f, 48, 96.0f, 3.0f, 96.0f, 0.0f));
        final int i17 = 1;
        setOnClickListener(new View.OnClickListener(this) {

            public final FragmentContextView f34750b;

            {
                this.f34750b = this;
            }

            @Override
            public final void onClick(View view2) {
                ChatObject.Call groupCall;
                int currentAccount;
                long jA;
                TL_stories.StoryItem storyItemU;
                int i18 = i17;
                FragmentContextView fragmentContextView = this.f34750b;
                switch (i18) {
                    case 0:
                        ng ngVar = fragmentContextView.f26387n;
                        org.telegram.ui.ActionBar.c6 c6Var2 = fragmentContextView.f26386l0;
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
                        if (fragmentContextView.P != 2) {
                            MediaController.getInstance().cleanupPlayer(true, true);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, c6Var2);
                            String string = LocaleController.getString(R.string.StopLiveLocationAlertToTitle);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            b2Var.N = string;
                            if (n2Var instanceof org.telegram.ui.gy) {
                                b2Var.P = LocaleController.getString(R.string.StopLiveLocationAlertAllText);
                            } else {
                                TLRPC.Chat chatG = ngVar.g();
                                TLRPC.User userI = ngVar.i();
                                if (chatG != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToGroupText", R.string.StopLiveLocationAlertToGroupText, chatG.title));
                                } else if (userI != null) {
                                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("StopLiveLocationAlertToUserText", R.string.StopLiveLocationAlertToUserText, UserObject.getFirstName(userI)));
                                } else {
                                    b2Var.P = LocaleController.getString(R.string.AreYouSure);
                                }
                            }
                            alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new x00(fragmentContextView));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var2));
                            }
                        }
                        break;
                    case 1:
                        ng ngVar2 = fragmentContextView.f26387n;
                        org.telegram.ui.ActionBar.c6 c6Var3 = fragmentContextView.f26386l0;
                        org.telegram.ui.ActionBar.n2 n2Var2 = fragmentContextView.h;
                        int i19 = fragmentContextView.P;
                        int i110 = 6;
                        if (i19 == 6) {
                            jh.d1 d1Var = jh.d1.S;
                            if (d1Var != null) {
                                long j10 = d1Var.f13175b;
                                int i111 = d1Var.f13177e;
                                if (i111 != UserConfig.selectedAccount) {
                                    LaunchActivity launchActivity = LaunchActivity.C1;
                                    if (launchActivity != null) {
                                        launchActivity.K0(i111);
                                    }
                                }
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                if (n2VarU != null && (storyItemU = MessagesController.getInstance(i111).getStoriesController().u(d1Var.f13176c, j10)) != null) {
                                    storyItemU.dialogId = j10;
                                    n2VarU.getOrCreateStoryViewer(i111).B(i111, fragmentContextView.getContext(), storyItemU, null);
                                }
                                break;
                            }
                        } else if (i19 == 0) {
                            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                            if (n2Var2 != null && playingMessageObject != null) {
                                if (playingMessageObject.isMusic()) {
                                    Activity activityFindActivity = AndroidUtilities.findActivity(fragmentContextView.getContext());
                                    if (activityFindActivity instanceof LaunchActivity) {
                                        new b8(activityFindActivity, c6Var3).show();
                                    } else if (AndroidUtilities.isContextSafe(LaunchActivity.C1)) {
                                        new b8(LaunchActivity.C1, c6Var3).show();
                                    }
                                } else if (playingMessageObject.getDialogId() != (ngVar2 != null ? ngVar2.a() : 0L)) {
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
                                    n2Var2.presentFragment(new org.telegram.ui.rn(bundle), n2Var2 instanceof org.telegram.ui.rn);
                                } else {
                                    fragmentContextView.f26387n.j(playingMessageObject.getId(), 0, false, 0, true, 0);
                                }
                                break;
                            }
                        } else if (i19 == 1) {
                            fragmentContextView.getContext().startActivity(new Intent(fragmentContextView.getContext(), (Class<?>) LaunchActivity.class).setAction("voip"));
                            break;
                        } else if (i19 == 2) {
                            int i112 = UserConfig.selectedAccount;
                            if (ngVar2 != null) {
                                jA = ngVar2.a();
                                currentAccount = n2Var2.getCurrentAccount();
                            } else if (LocationController.getLocationsCount() == 1) {
                                int i113 = 0;
                                while (true) {
                                    if (i113 >= 4) {
                                        currentAccount = i112;
                                        jA = 0;
                                    } else if (LocationController.getInstance(i113).sharingLocationsUI.isEmpty()) {
                                        i113++;
                                    } else {
                                        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i113).sharingLocationsUI.get(0);
                                        long j11 = sharingLocationInfo.did;
                                        currentAccount = sharingLocationInfo.messageObject.currentAccount;
                                        jA = j11;
                                    }
                                }
                            } else {
                                currentAccount = i112;
                                jA = 0;
                            }
                            if (jA == 0) {
                                n2Var2.showDialog(new lu0(fragmentContextView.getContext(), new x00(fragmentContextView), c6Var3));
                            } else {
                                fragmentContextView.k(LocationController.getInstance(currentAccount).getSharingLocationInfo(jA));
                            }
                            break;
                        } else if (i19 != 3) {
                            if (i19 == 4) {
                                if (n2Var2.getParentActivity() != null && (groupCall = ngVar2.getGroupCall()) != null) {
                                    TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(groupCall.chatId));
                                    TLRPC.GroupCall groupCall2 = groupCall.call;
                                    org.telegram.ui.Components.voip.e2.m(chat, null, false, Boolean.valueOf((groupCall2 == null || groupCall2.rtmp_stream) ? false : true), n2Var2.getParentActivity(), n2Var2, n2Var2.getAccountInstance());
                                }
                                break;
                            } else if (i19 == 5) {
                                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) n2Var2;
                                if (n2Var2.getSendMessagesHelper().getImportingHistory(rnVar.a()) != null) {
                                    l40 l40Var = new l40(fragmentContextView.getContext(), null, rnVar, c6Var3);
                                    l40Var.setOnHideListener(new a1(fragmentContextView, i110));
                                    n2Var2.showDialog(l40Var);
                                    fragmentContextView.c(false);
                                    break;
                                }
                            }
                        } else if (VoIPService.getSharedInstance() != null && (fragmentContextView.getContext() instanceof LaunchActivity)) {
                            org.telegram.ui.s50.c1((LaunchActivity) fragmentContextView.getContext(), AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                            break;
                        }
                        break;
                    case 2:
                        if (fragmentContextView.P == 0) {
                            if (!MediaController.getInstance().isMessagePaused()) {
                                MediaController.getInstance().lambda$startAudioAgain$7(MediaController.getInstance().getPlayingMessageObject());
                            } else {
                                MediaController.getInstance().playMessage(MediaController.getInstance().getPlayingMessageObject());
                            }
                        }
                        break;
                    case 3:
                        float[] fArr = FragmentContextView.I0;
                        fragmentContextView.callOnClick();
                        break;
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
                                }
                            }
                            boolean z10 = !sharedInstance.isMicMute();
                            fragmentContextView.K = z10;
                            sharedInstance.setMicMute(z10, false, true);
                            if (fragmentContextView.f26403y.N(fragmentContextView.K ? 15 : 29)) {
                                if (fragmentContextView.K) {
                                    fragmentContextView.f26403y.K(0);
                                } else {
                                    fragmentContextView.f26403y.K(14);
                                }
                            }
                            fragmentContextView.f26401x.d();
                            org.telegram.ui.ActionBar.g6.D0().c(true);
                            fragmentContextView.f26370a.f(true);
                            try {
                                fragmentContextView.f26401x.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                                return;
                            }
                            break;
                        }
                        break;
                }
            }
        });
        setLeftMargin(this.F0);
    }

    public final void c(boolean z10) {
        int i10;
        ng ngVar = this.f26387n;
        if (ngVar != null) {
            if (this.O && ((i10 = this.P) == 1 || i10 == 3)) {
                return;
            }
            b();
            org.telegram.ui.ActionBar.n2 n2Var = this.h;
            SendMessagesHelper.ImportingHistory importingHistory = n2Var.getSendMessagesHelper().getImportingHistory(ngVar.a());
            View fragmentView = n2Var.getFragmentView();
            if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
                z10 = true;
            }
            Dialog visibleDialog = n2Var.getVisibleDialog();
            if ((j() || ngVar.n() || ((visibleDialog instanceof l40) && !((l40) visibleDialog).isDismissed())) && importingHistory != null) {
                importingHistory = null;
            }
            AnimationNotificationsLocker animationNotificationsLocker = this.f26390p0;
            if (importingHistory == null) {
                if (!this.O || ((!z10 || this.P != -1) && this.P != 5)) {
                    int i11 = this.P;
                    if (i11 == -1 || i11 == 5) {
                        this.O = false;
                        setVisibility(8);
                        return;
                    }
                    return;
                }
                this.O = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f26379f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26379f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26379f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f26379f.setDuration(220L);
                this.f26379f.setInterpolator(er.f28122f);
                this.f26379f.addListener(new c10(this, 4));
                this.f26379f.start();
                return;
            }
            if (this.P != 5 && this.f26379f != null && !z10) {
                this.f26397u0 = true;
                return;
            }
            r(5);
            if (z10 && this.N == 0.0f) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                j10 j10Var = this.f26385k0;
                if (j10Var != null) {
                    ((cq0) j10Var).a(true);
                    ((cq0) this.f26385k0).a(false);
                }
            }
            if (!this.O) {
                if (!z10) {
                    AnimatorSet animatorSet3 = this.f26379f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f26379f = null;
                    }
                    animationNotificationsLocker.lock();
                    this.f26379f = new AnimatorSet();
                    j10 j10Var2 = this.f26385k0;
                    if (j10Var2 != null) {
                        ((cq0) j10Var2).a(true);
                    }
                    this.f26379f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f26379f.setDuration(200L);
                    this.f26379f.addListener(new c10(this, 5));
                    this.f26379f.start();
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

    public final void d(boolean z10) {
        String pluralString;
        String string;
        org.telegram.ui.ActionBar.n2 n2Var = this.h;
        View fragmentView = n2Var.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = n2Var instanceof org.telegram.ui.gy;
        boolean zIsSharingLocation = z11 ? LocationController.getLocationsCount() != 0 : LocationController.getInstance(n2Var.getCurrentAccount()).isSharingLocation(this.f26387n.a());
        m.i3 i3Var = this.f26389o0;
        if (!zIsSharingLocation) {
            this.f26388n0 = -1;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
            if (this.O) {
                this.O = false;
                if (z10) {
                    if (getVisibility() != 8) {
                        setVisibility(8);
                    }
                    setTopPadding(0.0f);
                    return;
                }
                AnimatorSet animatorSet = this.f26379f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26379f = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26379f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f26379f.setDuration(200L);
                this.f26379f.addListener(new c10(this, 0));
                this.f26379f.start();
                return;
            }
            return;
        }
        b();
        r(2);
        this.f26372b.setImageDrawable(new tp0(getContext(), 1));
        if (z10 && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        if (!this.O) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f26379f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f26379f = null;
                }
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.f26379f = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f26379f.setDuration(200L);
                this.f26379f.addListener(new c10(this, 1));
                this.f26379f.start();
            }
            this.O = true;
            setVisibility(0);
        }
        if (!z11) {
            i3Var.run();
            f();
            return;
        }
        String string2 = LocaleController.getString(R.string.LiveLocationContext);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 4; i10++) {
            arrayList.addAll(LocationController.getInstance(i10).sharingLocationsUI);
        }
        if (arrayList.size() == 1) {
            LocationController.SharingLocationInfo sharingLocationInfo = (LocationController.SharingLocationInfo) arrayList.get(0);
            long dialogId = sharingLocationInfo.messageObject.getDialogId();
            if (DialogObject.isUserDialog(dialogId)) {
                pluralString = UserObject.getFirstName(MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getUser(Long.valueOf(dialogId)));
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharing);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(sharingLocationInfo.messageObject.currentAccount).getChat(Long.valueOf(-dialogId));
                pluralString = chat != null ? chat.title : "";
                string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChat);
            }
        } else {
            pluralString = LocaleController.formatPluralString("Chats", arrayList.size(), new Object[0]);
            string = LocaleController.getString(R.string.AttachLiveLocationIsSharingChats);
        }
        String str = String.format(string, string2, pluralString);
        int iIndexOf = str.indexOf(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i11 = 0;
        while (i11 < 2) {
            f10 f10Var = this.d;
            TextView textView = i11 == 0 ? f10Var.getTextView() : f10Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i11++;
        }
        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23340t7, this.f26386l0)), iIndexOf, string2.length() + iIndexOf, 18);
        this.d.b(spannableStringBuilder, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        VoIPService sharedInstance;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (i10 == NotificationCenter.liveLocationsChanged) {
            d(false);
            return;
        }
        if (i10 == NotificationCenter.liveStoryUpdated) {
            e(false);
            return;
        }
        int i12 = NotificationCenter.liveLocationsCacheChanged;
        ng ngVar = this.f26387n;
        if (i10 == i12) {
            if (ngVar != null) {
                if (ngVar.a() == ((Long) objArr[0]).longValue()) {
                    f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.messagePlayingDidStart || i10 == NotificationCenter.messagePlayingPlayStateChanged || i10 == NotificationCenter.messagePlayingDidReset || i10 == NotificationCenter.didEndCall) {
            int i13 = this.P;
            if (i13 == 1 || i13 == 3 || i13 == 4) {
                a(false);
            }
            g(false);
            return;
        }
        int i14 = NotificationCenter.didStartedCall;
        if (i10 == i14 || i10 == NotificationCenter.groupCallUpdated || i10 == NotificationCenter.groupCallVisibilityChanged) {
            a(false);
            if (this.P != 3 || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.groupCall == null) {
                return;
            }
            if (i10 == i14) {
                sharedInstance.registerStateListener(this);
            }
            int callState = sharedInstance.getCallState();
            if (callState == 1 || callState == 2 || callState == 6 || callState == 5 || this.f26401x == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.participants.f(sharedInstance.getSelfId())) == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) {
                return;
            }
            sharedInstance.setMicMute(true, false, false);
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.f26401x.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            return;
        }
        if (i10 == NotificationCenter.groupCallTypingsUpdated) {
            b();
            if (this.O && this.P == 4) {
                ChatObject.Call groupCall = ngVar.getGroupCall();
                if (groupCall != null && this.f26377e != null) {
                    if (groupCall.isScheduled()) {
                        this.f26377e.b(LocaleController.formatStartsTime(groupCall.call.schedule_date, 4), false);
                    } else {
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        int i15 = groupCall2.participants_count;
                        if (i15 == 0) {
                            this.f26377e.b(LocaleController.getString(groupCall2.rtmp_stream ? R.string.ViewersWatchingNobody : R.string.MembersTalkingNobody), false);
                        } else {
                            this.f26377e.b(LocaleController.formatPluralString(groupCall2.rtmp_stream ? "ViewersWatching" : "Participants", i15, new Object[0]), false);
                        }
                    }
                }
                n(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.historyImportProgressChanged) {
            int i16 = this.P;
            if (i16 == 1 || i16 == 3 || i16 == 4) {
                a(false);
            }
            c(false);
            return;
        }
        if (i10 == NotificationCenter.messagePlayingSpeedChanged) {
            q(true);
            return;
        }
        int i17 = NotificationCenter.webRtcMicAmplitudeEvent;
        vc vcVar = this.f26370a;
        if (i10 == i17) {
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
                this.f26405z0 = 0.0f;
            } else {
                this.f26405z0 = Math.min(8500.0f, ((Float) objArr[0]).floatValue() * 4000.0f) / 8500.0f;
            }
            if (VoIPService.getSharedInstance() != null) {
                org.telegram.ui.ActionBar.g6.D0().a(Math.max(this.f26404y0, this.f26405z0));
                vcVar.d(Math.max(this.f26404y0, this.f26405z0));
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            if (i10 == NotificationCenter.messagePlayingProgressDidChanged && this.P == 0) {
                invalidate();
                return;
            }
            return;
        }
        b();
        this.f26404y0 = Math.max(0.0f, Math.min((((Float) objArr[0]).floatValue() * 15.0f) / 80.0f, 1.0f));
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            this.f26405z0 = 0.0f;
        }
        if (VoIPService.getSharedInstance() != null) {
            org.telegram.ui.ActionBar.g6.D0().a(Math.max(this.f26404y0, this.f26405z0));
            vcVar.d(Math.max(this.f26404y0, this.f26405z0));
        }
        this.T.invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        long j10;
        float f12;
        boolean z11;
        float f13;
        float f14;
        k10 k10Var;
        float f15;
        MessageObject playingMessageObject;
        if (this.f26392r == null) {
            return;
        }
        if (!this.D0 || getVisibility() == 0) {
            int i10 = this.P;
            float f16 = 1.0f;
            if (i10 == 3 || i10 == 1) {
                org.telegram.ui.ActionBar.g6.D0().c(this.B0);
                this.f26370a.f(this.B0);
                AndroidUtilities.dp(getStyleHeight());
                l10 l10VarD0 = org.telegram.ui.ActionBar.g6.D0();
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                Path path = l10VarD0.f30256n;
                Paint paint = l10VarD0.f30255m;
                int i11 = 0;
                while (true) {
                    k10[] k10VarArr = l10VarD0.f30245a;
                    if (i11 >= k10VarArr.length) {
                        break;
                    }
                    k10 k10Var2 = k10VarArr[i11];
                    int i12 = k10Var2.f29885i;
                    if (i12 == 0) {
                        if (k10Var2.f29886j != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.f29889m, false) || k10Var2.f29887k != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.f29890n, false)) {
                            k10Var2.a();
                        }
                    } else if (i12 == 1) {
                        if (k10Var2.f29886j != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.f29891o, false) || k10Var2.f29887k != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.f29892p, false)) {
                            k10Var2.a();
                        }
                    } else if (i12 == 3 && (k10Var2.f29886j != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.f29893q, false) || k10Var2.f29887k != org.telegram.ui.ActionBar.g6.w0(null, k10Var2.f29894r, false))) {
                        k10Var2.a();
                    }
                    i11++;
                }
                boolean z12 = l10VarD0.f30254l.size() > 0;
                if (0.0f <= measuredHeight) {
                    k10 k10Var3 = l10VarD0.f30246b;
                    if (k10Var3 == null || (k10Var = l10VarD0.f30247c) == null) {
                        z10 = false;
                    } else {
                        int i13 = k10Var.f29885i;
                        int i14 = k10Var3.f29885i;
                        if ((i14 == 1 && i13 == 0) || (i13 == 1 && i14 == 0)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    boolean z13 = z12;
                    if (z12) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        f10 = measuredWidth;
                        f11 = 0.0f;
                        long j11 = jElapsedRealtime - l10VarD0.f30252j;
                        l10VarD0.f30252j = jElapsedRealtime;
                        if (j11 > 20) {
                            j11 = 17;
                        }
                        j10 = j11;
                        if (j11 < 3) {
                            z13 = false;
                        }
                    } else {
                        f10 = measuredWidth;
                        f11 = 0.0f;
                        j10 = 0;
                    }
                    if (z13) {
                        float f17 = l10VarD0.f30250g;
                        float f18 = l10VarD0.f30248e;
                        if (f17 != f18) {
                            float f19 = l10VarD0.h;
                            float f20 = (j10 * f19) + f18;
                            l10VarD0.f30248e = f20;
                            if (f19 > 0.0f) {
                                if (f20 > f17) {
                                    l10VarD0.f30248e = f17;
                                }
                            } else if (f20 < f17) {
                                l10VarD0.f30248e = f17;
                            }
                            invalidate();
                        }
                        float f21 = l10VarD0.f30250g;
                        float f22 = l10VarD0.f30249f;
                        if (f21 != f22) {
                            float f23 = l10VarD0.f30251i;
                            float f24 = (j10 * f23) + f22;
                            l10VarD0.f30249f = f24;
                            if (f23 > 0.0f) {
                                if (f24 > f21) {
                                    l10VarD0.f30249f = f21;
                                }
                            } else if (f24 < f21) {
                                l10VarD0.f30249f = f21;
                            }
                            invalidate();
                        }
                        if (l10VarD0.f30247c != null) {
                            float f25 = (j10 / 250.0f) + l10VarD0.f30253k;
                            l10VarD0.f30253k = f25;
                            if (f25 > 1.0f) {
                                l10VarD0.f30253k = 1.0f;
                                l10VarD0.f30247c = null;
                            }
                            invalidate();
                        }
                    }
                    int i15 = 0;
                    while (i15 < 2) {
                        if (i15 == 0 && l10VarD0.f30247c == null) {
                            z11 = z10;
                            f14 = f10;
                        } else {
                            if (i15 == 0) {
                                f13 = f16 - l10VarD0.f30253k;
                                l10VarD0.f30247c.b(paint);
                                z11 = z10;
                            } else {
                                k10 k10Var4 = l10VarD0.f30246b;
                                if (k10Var4 == null) {
                                    break;
                                }
                                float f26 = l10VarD0.f30247c != null ? l10VarD0.f30253k : 1.0f;
                                if (z13) {
                                    int i16 = (int) (measuredHeight - f11);
                                    int i17 = (int) (f10 - 0.0f);
                                    float f27 = l10VarD0.f30248e;
                                    Matrix matrix = k10Var4.h;
                                    int i18 = k10Var4.f29885i;
                                    if (i18 == 2) {
                                        f12 = f26;
                                        z11 = z10;
                                    } else {
                                        float f28 = k10Var4.f29882e;
                                        if (f28 == 0.0f || k10Var4.f29883f >= f28) {
                                            f12 = f26;
                                            k10Var4.f29882e = Utilities.random.nextInt(700) + 500;
                                            k10Var4.f29883f = 0.0f;
                                            if (k10Var4.f29879a != -1.0f) {
                                                z11 = z10;
                                            } else if (i18 == 3) {
                                                z11 = z10;
                                                k10Var4.f29879a = a9.p.d(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                k10Var4.f29880b = a9.p.d(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                            } else {
                                                z11 = z10;
                                                if (i18 == 0) {
                                                    k10Var4.f29879a = a9.p.d(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                    k10Var4.f29880b = a9.p.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                                } else {
                                                    k10Var4.f29879a = s3.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                    k10Var4.f29880b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                                }
                                            }
                                            k10Var4.f29881c = k10Var4.f29879a;
                                            k10Var4.d = k10Var4.f29880b;
                                            if (i18 == 3) {
                                                k10Var4.f29879a = a9.p.d(Utilities.random.nextInt(100), 0.05f, 100.0f, -0.3f);
                                                k10Var4.f29880b = a9.p.d(Utilities.random.nextInt(100), 0.05f, 100.0f, 0.7f);
                                            } else if (i18 == 0) {
                                                k10Var4.f29879a = a9.p.d(Utilities.random.nextInt(100), 0.2f, 100.0f, -0.3f);
                                                k10Var4.f29880b = a9.p.d(Utilities.random.nextInt(100), 0.3f, 100.0f, 0.7f);
                                            } else {
                                                k10Var4.f29879a = s3.c.c(Utilities.random.nextInt(100), 100.0f, 0.2f, 1.1f);
                                                k10Var4.f29880b = (Utilities.random.nextInt(100) * 4.0f) / 100.0f;
                                            }
                                        } else {
                                            f12 = f26;
                                            z11 = z10;
                                        }
                                        float f29 = j10;
                                        float f30 = (f29 * 0.02f * f27) + (f29 * 1.0f) + k10Var4.f29883f;
                                        k10Var4.f29883f = f30;
                                        float f31 = k10Var4.f29882e;
                                        if (f30 > f31) {
                                            k10Var4.f29883f = f31;
                                        }
                                        float interpolation = er.f28123g.getInterpolation(k10Var4.f29883f / f31);
                                        float f32 = i17;
                                        float f33 = k10Var4.f29881c;
                                        float f34 = ((((k10Var4.f29879a - f33) * interpolation) + f33) * f32) - 200.0f;
                                        float f35 = k10Var4.d;
                                        float f36 = ((((k10Var4.f29880b - f35) * interpolation) + f35) * i16) - 200.0f;
                                        float f37 = (f32 / 400.0f) * ((i18 == 0 || i18 == 3) ? 3.0f : 1.5f);
                                        matrix.reset();
                                        matrix.postTranslate(f34, f36);
                                        matrix.postScale(f37, f37, f34 + 200.0f, f36 + 200.0f);
                                        k10Var4.f29884g.setLocalMatrix(matrix);
                                    }
                                } else {
                                    f12 = f26;
                                    z11 = z10;
                                }
                                l10VarD0.f30246b.b(paint);
                                f13 = f12;
                            }
                            if (!(i15 == 1 && z11) && i15 == 1) {
                                paint.setAlpha((int) (255.0f * f13));
                            } else {
                                paint.setAlpha(255);
                            }
                            if (i15 == 1 && z11) {
                                path.rewind();
                                float f38 = f10;
                                path.addCircle(f10 - AndroidUtilities.dp(18.0f), com.google.android.recaptcha.internal.a.A(measuredHeight, 0.0f, 2.0f, 0.0f), org.telegram.messenger.y1.z(f38, 0.0f, 1.1f, f13), Path.Direction.CW);
                                canvas.save();
                                canvas.clipPath(path);
                                f14 = f38;
                                canvas.drawRoundRect(0.0f, 0.0f, f14, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                                canvas.restore();
                            } else {
                                f14 = f10;
                                canvas.drawRoundRect(0.0f, 0.0f, f14, measuredHeight, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
                            }
                        }
                        i15++;
                        j10 = j10;
                        z10 = z11;
                        f16 = 1.0f;
                        f11 = 0.0f;
                        f10 = f14;
                    }
                }
                f15 = 1.0f;
                invalidate();
            } else {
                f15 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (this.P == 0 && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                float f39 = -AndroidUtilities.dpf2(f15);
                float fLerp = AndroidUtilities.lerp(f39, AndroidUtilities.dpf2(f15) + getMeasuredWidth(), playingMessageObject.audioProgress);
                float measuredHeight2 = getMeasuredHeight();
                float fDpf2 = measuredHeight2 - AndroidUtilities.dpf2(2.0f);
                int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hl, this.f26386l0);
                Paint paint2 = this.C0;
                paint2.setColor(iV0);
                canvas.drawRoundRect(f39, fDpf2, fLerp, measuredHeight2, AndroidUtilities.dpf2(f15), AndroidUtilities.dpf2(f15), paint2);
            }
            this.B0 = true;
        }
    }

    public final void e(boolean z10) {
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        jh.d1 d1Var = jh.d1.S;
        AnimationNotificationsLocker animationNotificationsLocker = this.f26390p0;
        if (d1Var != null) {
            b();
            int i10 = this.P;
            if (6 != i10 && this.f26379f != null && !z10) {
                this.f26395s0 = true;
                return;
            }
            if (6 != i10 && this.O && !z10) {
                AnimatorSet animatorSet = this.f26379f;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f26379f = null;
                }
                animationNotificationsLocker.lock();
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f26379f = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                this.f26379f.setDuration(220L);
                this.f26379f.setInterpolator(er.f28122f);
                this.f26379f.addListener(new c10(this, 7));
                this.f26379f.start();
                return;
            }
            r(6);
            if (this.O) {
                setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                setVisibility(0);
            } else {
                if (z10) {
                    setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
                    m();
                } else {
                    AnimatorSet animatorSet3 = this.f26379f;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.f26379f = null;
                    }
                    this.f26379f = new AnimatorSet();
                    this.f26391q0.lock();
                    this.f26379f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                    this.f26379f.setDuration(220L);
                    this.f26379f.setInterpolator(er.f28122f);
                    this.f26379f.addListener(new c10(this, 8));
                    this.f26379f.start();
                }
                this.O = true;
                setVisibility(0);
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
                    AnimatorSet animatorSet4 = this.f26379f;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                        this.f26379f = null;
                    }
                    animationNotificationsLocker.lock();
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    this.f26379f = animatorSet5;
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
                    this.f26379f.setDuration(220L);
                    this.f26379f.setInterpolator(er.f28122f);
                    this.f26379f.addListener(new c10(this, 6));
                    this.f26379f.start();
                }
            } else if (z11 && this.P == -1) {
                this.O = false;
                setVisibility(8);
            }
        }
        jh.d1 d1Var2 = jh.d1.S;
        if (d1Var2 == null || this.P != 6) {
            return;
        }
        f10 f10Var = this.d;
        TLRPC.GroupCall groupCall = d1Var2.v;
        f10Var.setText(LocaleController.formatPluralStringComma("LiveStoryTopPanelWatching", Math.max(1, groupCall != null ? groupCall.participants_count : 0)));
    }

    public final void f() {
        int i10;
        String str;
        ng ngVar = this.f26387n;
        if (ngVar == null || this.d == null) {
            return;
        }
        b();
        long jA = ngVar.a();
        int currentAccount = this.h.getCurrentAccount();
        ArrayList arrayList = (ArrayList) LocationController.getInstance(currentAccount).locationsCache.f(jA);
        if (!this.m0) {
            LocationController.getInstance(currentAccount).loadLiveLocations(jA);
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
        if (this.f26388n0 == i10) {
            return;
        }
        this.f26388n0 = i10;
        String string = LocaleController.getString(R.string.LiveLocationContext);
        if (i10 == 0) {
            str = string;
        } else {
            int i12 = i10 - 1;
            if (!LocationController.getInstance(currentAccount).isSharingLocation(jA)) {
                str = i12 != 0 ? String.format("%1$s - %2$s %3$s", string, UserObject.getFirstName(user), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, UserObject.getFirstName(user));
            } else if (i12 != 0) {
                str = (i12 != 1 || user == null) ? String.format("%1$s - %2$s %3$s", string, LocaleController.getString(R.string.ChatYourSelfName), LocaleController.formatPluralString("AndOther", i12, new Object[0])) : String.format("%1$s - %2$s", string, LocaleController.formatString("SharingYouAndOtherName", R.string.SharingYouAndOtherName, UserObject.getFirstName(user)));
            } else {
                str = String.format("%1$s - %2$s", string, LocaleController.getString(R.string.ChatYourSelfName));
            }
        }
        if (str.equals(this.Q)) {
            return;
        }
        this.Q = str;
        int iIndexOf = str.indexOf(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int i13 = 0;
        while (i13 < 2) {
            f10 f10Var = this.d;
            TextView textView = i13 == 0 ? f10Var.getTextView() : f10Var.getNextTextView();
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
            i13++;
        }
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23340t7, this.f26386l0)), iIndexOf, string.length() + iIndexOf, 18);
        }
        this.d.b(spannableStringBuilder, false);
    }

    public final void g(boolean z10) {
        ng ngVar;
        SpannableStringBuilder spannableStringBuilder;
        if (this.O) {
            int i10 = this.P;
            if (i10 == 1 || i10 == 3) {
                return;
            }
            if ((i10 == 4 || i10 == 5) && !j()) {
                return;
            }
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        View fragmentView = this.h.getFragmentView();
        if (!z10 && fragmentView != null && (fragmentView.getParent() == null || ((View) fragmentView.getParent()).getVisibility() != 0)) {
            z10 = true;
        }
        boolean z11 = this.O;
        AnimationNotificationsLocker animationNotificationsLocker = this.f26390p0;
        if (playingMessageObject == null || playingMessageObject.getId() == 0 || playingMessageObject.isVideo()) {
            this.M = null;
            boolean z12 = (!this.S || VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || n20.c()) ? false : true;
            if (!j() && !z12 && (ngVar = this.f26387n) != null && !n20.c()) {
                ChatObject.Call groupCall = ngVar.getGroupCall();
                z12 = groupCall != null && groupCall.shouldShowPanel();
            }
            if (z12) {
                a(false);
                return;
            }
            if (!this.O) {
                setVisibility(8);
                return;
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.B;
            if (v0Var != null && v0Var.t()) {
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
            AnimatorSet animatorSet = this.f26379f;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f26379f = null;
            }
            animationNotificationsLocker.lock();
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f26379f = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "topPadding", 0.0f));
            this.f26379f.setDuration(200L);
            j10 j10Var = this.f26385k0;
            if (j10Var != null) {
                ((cq0) j10Var).a(true);
            }
            this.f26379f.addListener(new c10(this, 2));
            this.f26379f.start();
            return;
        }
        b();
        int i11 = this.P;
        if (i11 != 0 && this.f26379f != null && !z10) {
            this.f26396t0 = true;
            return;
        }
        r(0);
        if (z10 && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
            j10 j10Var2 = this.f26385k0;
            if (j10Var2 != null) {
                ((cq0) j10Var2).a(true);
                ((cq0) this.f26385k0).a(false);
            }
        }
        if (!this.O) {
            if (!z10) {
                AnimatorSet animatorSet3 = this.f26379f;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.f26379f = null;
                }
                animationNotificationsLocker.lock();
                this.f26379f = new AnimatorSet();
                j10 j10Var3 = this.f26385k0;
                if (j10Var3 != null) {
                    ((cq0) j10Var3).a(true);
                }
                this.f26379f.playTogether(ObjectAnimator.ofFloat(this, "topPadding", AndroidUtilities.dp2(getStyleHeight())));
                this.f26379f.setDuration(200L);
                this.f26379f.addListener(new c10(this, 3));
                this.f26379f.start();
            }
            this.O = true;
            setVisibility(0);
        }
        if (MediaController.getInstance().isMessagePaused()) {
            this.f26374c.a(false, !z10);
            this.f26372b.setContentDescription(LocaleController.getString(R.string.AccActionPlay));
        } else {
            this.f26374c.a(true, !z10);
            this.f26372b.setContentDescription(LocaleController.getString(R.string.AccActionPause));
        }
        if (this.M == playingMessageObject && i11 == 0) {
            return;
        }
        this.M = playingMessageObject;
        if (playingMessageObject.isVoice() || this.M.isRoundVideo()) {
            this.R = false;
            org.telegram.ui.ActionBar.v0 v0Var2 = this.B;
            if (v0Var2 != null) {
                v0Var2.setAlpha(1.0f);
                this.B.setEnabled(true);
            }
            this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.I, 0);
            spannableStringBuilder = new SpannableStringBuilder(a9.p.w(playingMessageObject.getMusicAuthor(), " ", playingMessageObject.getMusicTitle()));
            int i12 = 0;
            while (i12 < 2) {
                f10 f10Var = this.d;
                TextView textView = i12 == 0 ? f10Var.getTextView() : f10Var.getNextTextView();
                if (textView != null) {
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                }
                i12++;
            }
            q(false);
        } else {
            this.R = true;
            if (this.B == null) {
                this.d.setPadding(0, 0, this.I, 0);
            } else if (playingMessageObject.getDuration() >= 600.0d) {
                this.B.setAlpha(1.0f);
                this.B.setEnabled(true);
                this.d.setPadding(0, 0, AndroidUtilities.dp(44.0f) + this.I, 0);
                q(false);
            } else {
                this.B.setAlpha(0.0f);
                this.B.setEnabled(false);
                this.d.setPadding(0, 0, this.I, 0);
            }
            spannableStringBuilder = new SpannableStringBuilder(a9.p.w(playingMessageObject.getMusicAuthor(), " - ", playingMessageObject.getMusicTitle()));
            int i13 = 0;
            while (i13 < 2) {
                f10 f10Var2 = this.d;
                TextView textView2 = i13 == 0 ? f10Var2.getTextView() : f10Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                }
                i13++;
            }
        }
        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold(), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23340t7, this.f26386l0)), 0, playingMessageObject.getMusicAuthor().length(), 18);
        this.d.b(spannableStringBuilder, !z10 && z11 && this.R);
    }

    public vc getCapsuleBlobDrawable() {
        return this.f26370a;
    }

    public int getCurrentStyle() {
        return this.P;
    }

    public int getStyleHeight() {
        return this.P == 4 ? 48 : 36;
    }

    public float getTopPadding() {
        return this.N;
    }

    public final void h() {
        if (this.B != null) {
            return;
        }
        Context context = getContext();
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26386l0;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), false, this.f26386l0);
        this.B = v0Var;
        v0Var.setAdditionalYOffset(AndroidUtilities.dp(30.0f));
        int i11 = 0;
        this.B.setLongClickEnabled(false);
        this.B.setVisibility(8);
        this.B.setTag(null);
        this.B.setShowSubmenuByMove(false);
        this.B.setContentDescription(LocaleController.getString(R.string.AccDescrPlayerSpeed));
        this.B.setDelegate(new x00(this));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.B;
        af.g gVar = new af.g();
        this.C = gVar;
        v0Var2.setIcon(gVar);
        float[] fArr = {1.0f, 1.5f, 2.0f};
        org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(getContext(), c6Var);
        this.D = b1Var;
        b1Var.setRoundRadiusDp(6.0f);
        this.D.setDrawShadow(true);
        this.D.setOnValueChange(new d(this, 13));
        org.telegram.ui.ActionBar.t0 t0VarU = this.B.u(0, R.drawable.msg_speed_slow, LocaleController.getString(R.string.SpeedSlow));
        org.telegram.ui.ActionBar.t0[] t0VarArr = this.E;
        t0VarArr[0] = t0VarU;
        t0VarArr[1] = this.B.u(1, R.drawable.msg_speed_normal, LocaleController.getString(R.string.SpeedNormal));
        t0VarArr[2] = this.B.u(2, R.drawable.msg_speed_medium, LocaleController.getString(R.string.SpeedMedium));
        t0VarArr[3] = this.B.u(3, R.drawable.msg_speed_fast, LocaleController.getString(R.string.SpeedFast));
        t0VarArr[4] = this.B.u(4, R.drawable.msg_speed_veryfast, LocaleController.getString(R.string.SpeedVeryFast));
        t0VarArr[5] = this.B.u(5, R.drawable.msg_speed_superfast, LocaleController.getString(R.string.SpeedSuperFast));
        if (AndroidUtilities.density >= 3.0f) {
            this.B.setPadding(0, 1, 0, 0);
        }
        this.B.setAdditionalXOffset(AndroidUtilities.dp(8.0f));
        addView(this.B, h7.z5.d(36, 36.0f, 53, 0.0f, 0.0f, 36.0f, 0.0f));
        this.B.setOnClickListener(new q2(21, this, fArr));
        this.B.setOnLongClickListener(new a10(this, i11));
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
            org.telegram.ui.ActionBar.n2 n2Var = this.h;
            if (n2Var.getParentActivity() instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) n2Var.getParentActivity();
                launchActivity.K0(sharingLocationInfo.messageObject.currentAccount);
                org.telegram.ui.tc0 tc0Var = new org.telegram.ui.tc0(2);
                tc0Var.u0(sharingLocationInfo.messageObject);
                tc0Var.B0 = new d3.e(sharingLocationInfo, sharingLocationInfo.messageObject.getDialogId(), 5);
                launchActivity.p0(tc0Var);
            }
        }
    }

    public final void l(float f10, float f11, boolean z10) {
        String string;
        int i10;
        if (i(f10, f11)) {
            return;
        }
        if (Math.abs(f11 - 1.0f) < 0.05f) {
            if (f10 < f11) {
                return;
            }
            string = LocaleController.getString(R.string.AudioSpeedNormal);
            if (Math.abs(f10 - 2.0f) < 0.05f) {
                i10 = R.raw.speed_2to1;
            } else {
                i10 = f11 < f10 ? R.raw.speed_slow : R.raw.speed_fast;
            }
        } else if (z10 && i(f11, 1.5f) && i(f10, 1.0f)) {
            string = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, af.g.a(f11));
            i10 = R.raw.speed_1to15;
        } else if (z10 && i(f11, 2.0f) && i(f10, 1.5f)) {
            string = LocaleController.getString(R.string.AudioSpeedFast);
            i10 = R.raw.speed_15to2;
        } else {
            string = LocaleController.formatString("AudioSpeedCustom", R.string.AudioSpeedCustom, af.g.a(f11));
            i10 = f11 < 1.0f ? R.raw.speed_slow : R.raw.speed_fast;
        }
        mc.a0(this.h).Q(i10, 36, string).j();
    }

    public final void m() {
        org.telegram.ui.Components.voip.h hVar = this.J;
        if (hVar == null || hVar.f33592g < 1.0f) {
            this.A0 = true;
        } else {
            this.A0 = false;
            AndroidUtilities.runOnUIThread(new b10(this, 0), 150L);
        }
    }

    public final void n(boolean z10) {
        ChatObject.Call groupCall;
        int account;
        TLRPC.User user;
        ValueAnimator valueAnimator;
        b();
        if (!z10 && (valueAnimator = this.T.f27049a.f26666f) != null) {
            valueAnimator.cancel();
            this.T.f27049a.f26666f = null;
        }
        a9 a9Var = this.T.f27049a;
        if (a9Var.f26666f != null) {
            a9Var.f26667g = true;
            return;
        }
        int i10 = this.P;
        int currentAccount = this.f26383i0;
        ng ngVar = this.f26387n;
        if (i10 == 4) {
            if (ngVar != null) {
                groupCall = ngVar.getGroupCall();
                currentAccount = this.h.getCurrentAccount();
            } else {
                groupCall = null;
            }
            account = currentAccount;
            user = null;
        } else if (VoIPService.getSharedInstance() != null) {
            groupCall = VoIPService.getSharedInstance().groupCall;
            user = ngVar != null ? null : VoIPService.getSharedInstance().getUser();
            account = VoIPService.getSharedInstance().getAccount();
        } else {
            groupCall = null;
            account = currentAccount;
            user = null;
        }
        if (groupCall != null) {
            int size = groupCall.sortedParticipants.size();
            for (int i11 = 0; i11 < 3; i11++) {
                if (i11 < size) {
                    this.T.b(i11, groupCall.sortedParticipants.get(i11), account);
                } else {
                    this.T.b(i11, null, account);
                }
            }
        } else if (user != null) {
            this.T.b(0, user, account);
            for (int i12 = 1; i12 < 3; i12++) {
                this.T.b(i12, null, account);
            }
        } else {
            for (int i13 = 0; i13 < 3; i13++) {
                this.T.b(i13, null, account);
            }
        }
        this.T.a(z10);
        if (this.P != 4 || groupCall == null) {
            return;
        }
        int iMin = groupCall.call.rtmp_stream ? 0 : Math.min(3, groupCall.sortedParticipants.size());
        int iE = (iMin == 0 ? 10 : i0.a.e(iMin, 1, 24, 52)) + 3;
        if (z10) {
            int i14 = ((FrameLayout.LayoutParams) this.d.getLayoutParams()).leftMargin;
            float f10 = iE;
            if (AndroidUtilities.dp(f10) != i14) {
                float translationX = (this.d.getTranslationX() + i14) - AndroidUtilities.dp(f10);
                this.d.setTranslationX(translationX);
                this.f26377e.setTranslationX(translationX);
                ViewPropertyAnimator duration = this.d.animate().translationX(0.0f).setDuration(220L);
                er erVar = er.f28122f;
                duration.setInterpolator(erVar);
                this.f26377e.animate().translationX(0.0f).setDuration(220L).setInterpolator(erVar);
            }
        } else {
            this.d.animate().cancel();
            this.f26377e.animate().cancel();
            this.d.setTranslationX(0.0f);
            this.f26377e.setTranslationX(0.0f);
        }
        float f11 = iE;
        this.d.setLayoutParams(h7.z5.d(-1, 20.0f, 51, f11, 5.0f, groupCall.isScheduled() ? 90 : 36, 0.0f));
        this.f26377e.setLayoutParams(h7.z5.d(-1, 20.0f, 51, f11, 25.0f, groupCall.isScheduled() ? 90 : 36, 0.0f));
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
                    return;
                }
                if (sharedInstance.isConference() && (call = sharedInstance.groupCall) != null) {
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
                    return;
                }
                TLRPC.Chat chat = sharedInstance.getChat();
                ng ngVar = this.f26387n;
                if (chat == null) {
                    if (sharedInstance.getUser() != null) {
                        TLRPC.User user = sharedInstance.getUser();
                        if (ngVar == null || ngVar.i() == null || ngVar.i().f22527id != user.f22527id) {
                            this.d.setText(ContactsController.formatName(user.first_name, user.last_name));
                            return;
                        } else {
                            this.d.setText(LocaleController.getString(R.string.ReturnToCall));
                            return;
                        }
                    }
                    return;
                }
                if (!TextUtils.isEmpty(sharedInstance.groupCall.call.title)) {
                    this.d.b(sharedInstance.groupCall.call.title, false);
                    return;
                }
                if (ngVar == null || ngVar.g() == null || ngVar.g().f22380id != sharedInstance.getChat().f22380id) {
                    this.d.b(sharedInstance.getChat().title, false);
                    return;
                }
                TLRPC.Chat chatG = ngVar.g();
                if (VoIPService.hasRtmpStream()) {
                    this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else if (ChatObject.isChannelOrGiga(chatG)) {
                    this.d.b(LocaleController.getString(R.string.VoipChannelViewVoiceChat), false);
                } else {
                    this.d.b(LocaleController.getString(R.string.VoipGroupViewVoiceChat), false);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f26384j0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsCacheChanged);
            d(true);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.groupCallTypingsUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.historyImportProgressChanged);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
                GroupCallMessagesController.getInstance(i10).subscribeToCallMessages(0L, this);
            }
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.messagePlayingSpeedChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didStartedCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.groupCallVisibilityChanged);
            if (jh.d1.S != null) {
                e(true);
            } else if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isHangingUp() || VoIPService.getSharedInstance().getCallState() == 15 || n20.c()) {
                ng ngVar = this.f26387n;
                if (ngVar != null && this.h.getSendMessagesHelper().getImportingHistory(ngVar.a()) != null && !j()) {
                    c(true);
                } else if (ngVar == null || ngVar.getGroupCall() == null || !ngVar.getGroupCall().shouldShowPanel() || n20.c() || j()) {
                    a(true);
                    g(true);
                    q(false);
                } else {
                    a(true);
                }
            } else {
                a(true);
            }
        }
        int i11 = this.P;
        if (i11 == 3 || i11 == 1) {
            ArrayList arrayList = org.telegram.ui.ActionBar.g6.D0().f30254l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            vc vcVar = this.f26370a;
            if (!vcVar.f33366u) {
                vcVar.f33366u = true;
                vcVar.f33365t = SystemClock.elapsedRealtime();
                gf.k.d().a(60, vcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            if (this.K != z10 && this.f26401x != null) {
                this.K = z10;
                this.f26403y.N(z10 ? 15 : 29);
                oi0 oi0Var = this.f26403y;
                oi0Var.L(oi0Var.f31314f - 1, false, true);
                this.f26401x.invalidate();
            }
        } else if (i11 == 4 && !this.f26381g0) {
            this.f26381g0 = true;
            this.f26382h0.run();
        }
        if (this.O && this.N == 0.0f) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        this.f26404y0 = 0.0f;
        this.f26405z0 = 0.0f;
    }

    @Override
    public final void onAudioSettingsChanged() {
        boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        boolean z11 = this.K;
        vc vcVar = this.f26370a;
        if (z11 != z10) {
            this.K = z10;
            this.f26403y.N(z10 ? 15 : 29);
            oi0 oi0Var = this.f26403y;
            oi0Var.L(oi0Var.f31314f - 1, false, true);
            this.f26401x.invalidate();
            org.telegram.ui.ActionBar.g6.D0().c(this.O);
            vcVar.f(this.O);
        }
        if (this.K) {
            this.f26405z0 = 0.0f;
            org.telegram.ui.ActionBar.g6.D0().a(0.0f);
            vcVar.d(0.0f);
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
        AnimatorSet animatorSet = this.f26379f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f26379f = null;
        }
        if (this.f26381g0) {
            AndroidUtilities.cancelRunOnUIThread(this.f26382h0);
            this.f26381g0 = false;
        }
        this.O = false;
        this.f26390p0.unlock();
        this.N = 0.0f;
        if (this.f26384j0) {
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
            l10 l10VarD0 = org.telegram.ui.ActionBar.g6.D0();
            ArrayList arrayList = l10VarD0.f30254l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                l10VarD0.d = l10VarD0.f30246b;
                l10VarD0.f30246b = null;
                l10VarD0.f30247c = null;
            }
            vc vcVar = this.f26370a;
            if (vcVar.f33366u) {
                vcVar.f33366u = false;
                gf.k.d().g(vcVar.F);
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
        if (this.f26394s == null) {
            return;
        }
        int i10 = this.P;
        if ((i10 == 1 || i10 == 3) && VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getGroupCallID() == j10) {
            this.H0++;
            if (groupCallMessage.isOut()) {
                return;
            }
            this.G0.i(new i10(this.f26394s, groupCallMessage), true);
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
        k41[] k41VarArr;
        int i10 = !i(MediaController.getInstance().getPlaybackSpeed(this.R), 1.0f) ? org.telegram.ui.ActionBar.g6.Qh : org.telegram.ui.ActionBar.g6.f23407x7;
        org.telegram.ui.ActionBar.c6 c6Var = this.f26386l0;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        af.g gVar = this.C;
        if (gVar != null) {
            ((i6) gVar.f272b).r(iV0);
            Paint paint = (Paint) gVar.f273c;
            if (paint != null) {
                paint.setColor(iV0);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.setBackground(org.telegram.ui.ActionBar.g6.f0(iV0 & 436207615, 1, AndroidUtilities.dp(14.0f)));
        }
        ImageView imageView = this.f26372b;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23392w7, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23407x7, c6Var), PorterDuff.Mode.MULTIPLY));
        }
        if (this.f26377e != null) {
            int i11 = 0;
            while (i11 < 2) {
                f10 f10Var = this.f26377e;
                TextView textView = i11 == 0 ? f10Var.getTextView() : f10Var.getNextTextView();
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23407x7, c6Var));
                }
                i11++;
            }
        }
        f10 f10Var2 = this.d;
        if (f10Var2 != null) {
            Object tag = f10Var2.getTag();
            if (tag instanceof Integer) {
                int iIntValue = ((Integer) tag).intValue();
                int i12 = 0;
                while (i12 < 2) {
                    f10 f10Var3 = this.d;
                    TextView textView2 = i12 == 0 ? f10Var3.getTextView() : f10Var3.getNextTextView();
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(iIntValue, c6Var));
                        CharSequence text = textView2.getText();
                        if ((text instanceof Spanned) && (k41VarArr = (k41[]) ((Spanned) text).getSpans(0, text.length(), k41.class)) != null) {
                            for (k41 k41Var : k41VarArr) {
                                k41Var.f29945b = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23340t7, c6Var);
                            }
                        }
                    }
                    i12++;
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
        boolean z11 = this.f26398v0;
        int i10 = 0;
        this.f26398v0 = false;
        while (true) {
            org.telegram.ui.ActionBar.t0[] t0VarArr = this.E;
            if (i10 >= t0VarArr.length) {
                this.D.d(playbackSpeed, z10);
                return;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.f26386l0;
            if (z11 || Math.abs(playbackSpeed - I0[i10]) >= 0.05f) {
                org.telegram.ui.ActionBar.t0 t0Var = t0VarArr[i10];
                int i11 = org.telegram.ui.ActionBar.g6.E8;
                t0Var.a(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            } else {
                org.telegram.ui.ActionBar.t0 t0Var2 = t0VarArr[i10];
                int i12 = org.telegram.ui.ActionBar.g6.Qh;
                t0Var2.a(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
            }
            i10++;
        }
    }

    public final void r(int i10) {
        if (this.P == i10) {
            return;
        }
        b();
        int i11 = this.P;
        vc vcVar = this.f26370a;
        if (i11 == 3 || i11 == 1) {
            l10 l10VarD0 = org.telegram.ui.ActionBar.g6.D0();
            ArrayList arrayList = l10VarD0.f30254l;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                l10VarD0.d = l10VarD0.f30246b;
                l10VarD0.f30246b = null;
                l10VarD0.f30247c = null;
            }
            if (vcVar.f33366u) {
                vcVar.f33366u = false;
                gf.k.d().g(vcVar.F);
            }
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().unregisterStateListener(this);
            }
            ud.j jVar = this.G0;
            if (jVar != null) {
                jVar.i(null, true);
            }
        }
        this.P = i10;
        this.f26392r.setWillNotDraw(i10 != 4);
        if (i10 != 4) {
            this.f26375c0 = false;
        }
        b9 b9Var = this.T;
        if (b9Var != null) {
            b9Var.setStyle(this.P);
            this.T.setLayoutParams(h7.z5.e(108, getStyleHeight(), 51));
        }
        this.f26392r.setLayoutParams(h7.z5.d(-1, getStyleHeight(), 51, 0.0f, 0.0f, 0.0f, 0.0f));
        float f10 = this.N;
        if (f10 > 0.0f && f10 != AndroidUtilities.dp2(getStyleHeight())) {
            setTopPadding(AndroidUtilities.dp2(getStyleHeight()));
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f26386l0;
        if (i10 == 6) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.f26392r.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.nk, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ok, c6Var)}));
            this.f26392r.setTag(null);
            this.f26377e.setVisibility(8);
            this.H.setVisibility(8);
            this.A.setVisibility(8);
            this.f26372b.setVisibility(8);
            this.f26401x.setVisibility(8);
            this.f26399w.setVisibility(8);
            this.f26399w.i();
            this.T.setVisibility(8);
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.A7));
            int i12 = 0;
            while (i12 < 2) {
                f10 f10Var = this.d;
                TextView textView = i12 == 0 ? f10Var.getTextView() : f10Var.getNextTextView();
                if (textView != null) {
                    textView.setGravity(19);
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                }
                i12++;
            }
            this.d.setLayoutParams(h7.z5.d(-2, -2.0f, 17, 0.0f, -1.0f, 0, 0.0f));
            return;
        }
        if (i10 == 5) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.f26392r.setBackgroundColor(0);
            this.f26392r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23374v7));
            int i13 = 0;
            while (i13 < 2) {
                f10 f10Var2 = this.d;
                TextView textView2 = i13 == 0 ? f10Var2.getTextView() : f10Var2.getNextTextView();
                if (textView2 != null) {
                    textView2.setGravity(19);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23358u7, c6Var));
                    textView2.setTypeface(Typeface.DEFAULT);
                    textView2.setTextSize(1, 15.0f);
                }
                i13++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23358u7));
            this.f26377e.setVisibility(8);
            this.H.setVisibility(8);
            this.A.setVisibility(8);
            this.f26372b.setVisibility(8);
            this.f26401x.setVisibility(8);
            this.T.setVisibility(8);
            this.f26399w.setVisibility(0);
            this.f26399w.d();
            this.A.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
            org.telegram.ui.ActionBar.v0 v0Var = this.B;
            if (v0Var != null) {
                v0Var.setVisibility(8);
                this.B.setTag(null);
            }
            this.d.setLayoutParams(h7.z5.d(-1, 36.0f, 51, 35.0f, 0.0f, 36, 0.0f));
            return;
        }
        if (i10 == 0 || i10 == 2) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.f26392r.setBackgroundColor(0);
            this.f26392r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23374v7));
            this.f26377e.setVisibility(8);
            this.H.setVisibility(8);
            this.A.setVisibility(0);
            this.f26372b.setVisibility(0);
            this.f26401x.setVisibility(8);
            this.f26399w.setVisibility(8);
            this.f26399w.i();
            this.T.setVisibility(8);
            int i14 = 0;
            while (i14 < 2) {
                f10 f10Var3 = this.d;
                TextView textView3 = i14 == 0 ? f10Var3.getTextView() : f10Var3.getNextTextView();
                if (textView3 != null) {
                    textView3.setGravity(19);
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23358u7, c6Var));
                    textView3.setTypeface(Typeface.DEFAULT);
                    textView3.setTextSize(1, 15.0f);
                }
                i14++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23358u7));
            if (i10 == 6) {
                this.f26372b.setLayoutParams(h7.z5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(h7.z5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                this.A.setVisibility(8);
                return;
            } else {
                if (i10 != 0) {
                    this.f26372b.setLayoutParams(h7.z5.d(36, 36.0f, 51, 8.0f, 0.0f, 0.0f, 0.0f));
                    this.d.setLayoutParams(h7.z5.d(-1, 36.0f, 51, 51.0f, 0.0f, 36, 0.0f));
                    this.A.setContentDescription(LocaleController.getString(R.string.AccDescrStopLiveLocation));
                    return;
                }
                this.f26372b.setLayoutParams(h7.z5.d(36, 36.0f, 51, 3.0f, 0.0f, 0.0f, 0.0f));
                this.d.setLayoutParams(h7.z5.d(-1, 36.0f, 51, 37.0f, 0.0f, 36, 0.0f));
                h();
                org.telegram.ui.ActionBar.v0 v0Var2 = this.B;
                if (v0Var2 != null) {
                    v0Var2.setVisibility(0);
                    this.B.setTag(1);
                }
                this.A.setContentDescription(LocaleController.getString(R.string.AccDescrClosePlayer));
                return;
            }
        }
        if (i10 == 4) {
            this.v.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            this.f26392r.setBackgroundColor(0);
            this.f26392r.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23374v7));
            this.f26401x.setVisibility(8);
            this.f26377e.setVisibility(0);
            int i15 = 0;
            while (i15 < 2) {
                f10 f10Var4 = this.d;
                TextView textView4 = i15 == 0 ? f10Var4.getTextView() : f10Var4.getNextTextView();
                if (textView4 != null) {
                    textView4.setGravity(51);
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23340t7, c6Var));
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setTextSize(1, 15.0f);
                }
                i15++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23340t7));
            this.d.setPadding(0, 0, this.I, 0);
            this.f26399w.setVisibility(8);
            this.f26399w.i();
            ng ngVar = this.f26387n;
            this.T.setVisibility(!((ngVar == null || ngVar.getGroupCall() == null || ngVar.getGroupCall().call == null || !ngVar.getGroupCall().call.rtmp_stream) ? false : true) ? 0 : 8);
            if (this.T.getVisibility() != 8) {
                n(false);
            } else {
                this.d.setTranslationX(-AndroidUtilities.dp(36.0f));
                this.f26377e.setTranslationX(-AndroidUtilities.dp(36.0f));
            }
            this.A.setVisibility(8);
            this.f26372b.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0Var3 = this.B;
            if (v0Var3 != null) {
                v0Var3.setVisibility(8);
                this.B.setTag(null);
                return;
            }
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.v.setBackground(null);
            o();
            boolean zHasRtmpStream = VoIPService.hasRtmpStream();
            this.T.setVisibility(!zHasRtmpStream ? 0 : 8);
            if (i10 == 3 && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().registerStateListener(this);
            }
            if (this.T.getVisibility() != 8) {
                n(false);
            } else {
                this.d.setTranslationX(0.0f);
                this.f26377e.setTranslationX(0.0f);
            }
            this.f26401x.setVisibility(!zHasRtmpStream ? 0 : 8);
            boolean z10 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
            this.K = z10;
            this.f26403y.N(z10 ? 15 : 29);
            oi0 oi0Var = this.f26403y;
            oi0Var.L(oi0Var.f31314f - 1, false, true);
            this.f26401x.invalidate();
            this.f26392r.setBackground(null);
            this.f26392r.setBackgroundColor(0);
            this.f26399w.setVisibility(8);
            this.f26399w.i();
            ArrayList arrayList2 = org.telegram.ui.ActionBar.g6.D0().f30254l;
            if (!arrayList2.contains(this)) {
                arrayList2.add(this);
            }
            if (!vcVar.f33366u) {
                vcVar.f33366u = true;
                vcVar.f33365t = SystemClock.elapsedRealtime();
                gf.k.d().a(60, vcVar.F);
            }
            invalidate();
            int i16 = 0;
            while (i16 < 2) {
                f10 f10Var5 = this.d;
                TextView textView5 = i16 == 0 ? f10Var5.getTextView() : f10Var5.getNextTextView();
                if (textView5 != null) {
                    textView5.setGravity(19);
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A7, c6Var));
                    textView5.setTypeface(AndroidUtilities.bold());
                    textView5.setTextSize(1, 14.0f);
                }
                i16++;
            }
            this.d.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.A7));
            this.A.setVisibility(8);
            this.f26372b.setVisibility(8);
            this.f26377e.setVisibility(8);
            this.H.setVisibility(8);
            this.d.setLayoutParams(h7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0, 0.0f));
            this.d.setPadding(AndroidUtilities.dp(88.0f), 0, AndroidUtilities.dp(88.0f) + this.I, 0);
            org.telegram.ui.ActionBar.v0 v0Var4 = this.B;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
                this.B.setTag(null);
            }
        }
    }

    public void setDelegate(j10 j10Var) {
        this.f26385k0 = j10Var;
    }

    public void setDrawOverlay(boolean z10) {
        this.D0 = z10;
    }

    public void setLeftMargin(float f10) {
        if (this.f26392r == null) {
            this.F0 = f10;
            return;
        }
        ImageView imageView = this.f26372b;
        if (imageView != null) {
            imageView.setTranslationX(f10);
        }
        ri0 ri0Var = this.f26399w;
        if (ri0Var != null) {
            ri0Var.setTranslationX(f10);
        }
        f10 f10Var = this.d;
        if (f10Var != null) {
            f10Var.setTranslationX(f10);
        }
        f10 f10Var2 = this.f26377e;
        if (f10Var2 != null) {
            f10Var2.setTranslationX(f10);
        }
        b9 b9Var = this.T;
        if (b9Var != null) {
            b9Var.setTranslationX(f10);
        }
    }

    public void setSupportsCalls(boolean z10) {
        this.S = z10;
    }

    public void setTopPadding(float f10) {
        this.N = f10;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        setTopPadding(this.N);
        if (i10 == 8) {
            this.B0 = false;
        }
    }

    public FragmentContextView(Context context, org.telegram.ui.ActionBar.n2 n2Var, View view, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26370a = new vc();
        this.E = new org.telegram.ui.ActionBar.t0[6];
        this.L = -1;
        this.P = -1;
        this.S = true;
        this.f26378e0 = new i6(false, true, true, false);
        this.f26382h0 = new d10(this);
        this.f26383i0 = UserConfig.selectedAccount;
        this.f26388n0 = -1;
        this.f26389o0 = new m.i3(this, 20);
        this.f26390p0 = new AnimationNotificationsLocker();
        this.f26391q0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.messagesDidLoad});
        this.C0 = new Paint(1);
        this.E0 = 0;
        this.G0 = new ud.j(new x00(this), er.h, 450L);
        this.H0 = 0;
        this.f26386l0 = c6Var;
        this.h = n2Var;
        if (n2Var instanceof ng) {
            this.f26387n = (ng) n2Var;
        }
        this.O = true;
        this.f26384j0 = z10;
        if (view == null) {
            ((ViewGroup) n2Var.getFragmentView()).setClipToPadding(false);
        }
        setTag(1);
    }
}
