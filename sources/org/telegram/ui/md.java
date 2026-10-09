package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class md extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.l50 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.m4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.ck0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.x90 P;
    public org.telegram.ui.Cells.j6 Q;
    public org.telegram.ui.Cells.j6 R;
    public org.telegram.ui.Cells.e9 S;
    public TextView T;
    public org.telegram.ui.Cells.y1 U;
    public org.telegram.ui.Cells.m4 V;
    public int W;
    public String X;
    public org.telegram.ui.ActionBar.p Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.v0 f39838a;
    public boolean f39839a0;
    public org.telegram.ui.Components.gs f39840b;
    public boolean f39841b0;
    public org.telegram.ui.Components.zu f39842c;
    public TLRPC.TL_chatInviteExported f39843c0;
    public org.telegram.ui.Cells.b7 d;
    public boolean f39844d0;
    public ai.z5 f39845e;
    public org.telegram.ui.Cells.e9 f39846e0;
    public ci.r6 f39847f;
    public final ArrayList f39848f0;
    public org.telegram.ui.Cells.s4 f39849g0;
    public jd h;
    public final int f39850h0;
    public final long f39851i0;
    public boolean f39852j0;
    public final Boolean f39853k0;
    public TLRPC.InputFile f39854l0;
    public TLRPC.InputFile m0;
    public AnimatorSet f39855n;
    public TLRPC.VideoSize f39856n0;
    public String f39857o0;
    public double f39858p0;
    public boolean f39859q0;
    public kd f39860r;
    public boolean f39861r0;
    public final org.telegram.ui.Components.j9 f39862s;
    public Integer f39863s0;
    public Utilities.Callback2 f39864t0;
    public org.telegram.ui.ActionBar.b2 f39865u0;
    public final org.telegram.ui.Components.m50 v;
    public final dd f39866v0;
    public EditTextBoldCursor f39867w;
    public ValueAnimator f39868w0;
    public TLRPC.FileLocation f39869x;
    public TLRPC.FileLocation f39870y;

    public md(Bundle bundle) {
        super(bundle);
        this.f39848f0 = new ArrayList();
        this.f39852j0 = true;
        this.f39866v0 = new dd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f39850h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f39853k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f39862s = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
            this.v = new org.telegram.ui.Components.m50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new cd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f39852j0 = z10;
            this.f39839a0 = !z10;
            if (!z10 && !this.f39844d0) {
                this.f39844d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new cd(this, 0));
            }
        }
        this.f39851i0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(md mdVar, org.telegram.ui.ActionBar.b2 b2Var) {
        mdVar.f39861r0 = false;
        mdVar.f39859q0 = false;
        if (mdVar.f39863s0 != null) {
            ConnectionsManager.getInstance(mdVar.currentAccount).cancelRequest(mdVar.f39863s0.intValue(), true);
            mdVar.f39863s0 = null;
        }
        mdVar.g0(false);
        b2Var.dismiss();
    }

    public static void V(md mdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(mdVar.currentAccount).sendRequest(tL_channels_updateUsername, new cd(mdVar, 1), 64);
    }

    public static void W(md mdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(mdVar.currentAccount).getInputChannel(mdVar.f39851i0);
        mdVar.W = ConnectionsManager.getInstance(mdVar.currentAccount).sendRequest(tL_channels_checkUsername, new ba(mdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(md mdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        b2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o(6, mdVar, currentChannel));
        mdVar.showDialog(b2Var);
    }

    public static void Y(md mdVar) {
        if (mdVar.f39865u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new z0(mdVar, 12));
        mdVar.f39865u0 = alertDialog$Builder.o();
    }

    @Override
    public final void D(float f7) {
        kd kdVar = this.f39860r;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        kd kdVar = this.f39860r;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f7;
        float f10;
        int i15;
        float f11;
        float f12;
        int i16;
        float f13;
        float f14;
        int i17;
        float f15;
        float f16;
        float f17;
        float f18;
        int i18;
        int i19;
        int i20;
        md mdVar = this;
        org.telegram.ui.Components.zu zuVar = mdVar.f39842c;
        if (zuVar != null) {
            zuVar.o();
        }
        mdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        mdVar.actionBar.setAllowOverlayTitle(true);
        mdVar.actionBar.setActionBarMenuOnItemClick(new hd(mdVar));
        org.telegram.ui.ActionBar.z o9 = mdVar.actionBar.o();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.i6.f21130v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.gs gsVar = new org.telegram.ui.Components.gs(mutate, new org.telegram.ui.Components.jq(org.telegram.ui.ActionBar.i6.x0(null, i21, false)));
        mdVar.f39840b = gsVar;
        mdVar.f39838a = o9.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), gsVar);
        int i22 = mdVar.f39850h0;
        if (i22 == 0) {
            mdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            id idVar = new id(0, context, mdVar);
            idVar.setOnTouchListener(new bi.d(2));
            mdVar.fragmentView = idVar;
            int i23 = org.telegram.ui.ActionBar.i6.f20797d6;
            idVar.setTag(Integer.valueOf(i23));
            mdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            mdVar.K = linearLayout;
            linearLayout.setOrientation(1);
            idVar.addView(mdVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            mdVar.K.addView(frameLayout, w7.x5.n(-1, -2));
            ai.z5 z5Var = new ai.z5(mdVar, context, 5);
            mdVar.f39845e = z5Var;
            z5Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.j9 j9Var = mdVar.f39862s;
            j9Var.n(5L, null, null);
            mdVar.f39845e.setImageDrawable(j9Var);
            ai.z5 z5Var2 = mdVar.f39845e;
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i24 = i14 | 48;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = 16.0f;
            }
            if (z11) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout.addView(z5Var2, w7.x5.a(64.0f, f7, 12.0f, f10, 12.0f, 64, i24));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ci.r6 r6Var = new ci.r6(mdVar, context, paint, 2);
            mdVar.f39847f = r6Var;
            r6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ci.r6 r6Var2 = mdVar.f39847f;
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i25 = i15 | 48;
            if (z12) {
                f11 = 0.0f;
            } else {
                f11 = 16.0f;
            }
            if (z12) {
                f12 = 16.0f;
            } else {
                f12 = 0.0f;
            }
            frameLayout.addView(r6Var2, w7.x5.a(64.0f, f11, 12.0f, f12, 12.0f, 64, i25));
            mdVar.f39847f.setOnClickListener(new ed(mdVar, 1));
            mdVar.J = new org.telegram.ui.Components.ck0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            jd jdVar = new jd(mdVar, context, 0);
            mdVar.h = jdVar;
            jdVar.setScaleType(ImageView.ScaleType.CENTER);
            mdVar.h.setAnimation(mdVar.J);
            mdVar.h.setEnabled(false);
            mdVar.h.setClickable(false);
            mdVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            jd jdVar2 = mdVar.h;
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i26 = i16 | 48;
            if (z13) {
                f13 = 0.0f;
            } else {
                f13 = 15.0f;
            }
            if (z13) {
                f14 = 15.0f;
            } else {
                f14 = 0.0f;
            }
            frameLayout.addView(jdVar2, w7.x5.a(64.0f, f13, 12.0f, f14, 12.0f, 64, i26));
            kd kdVar = new kd(mdVar, context, 0);
            mdVar.f39860r = kdVar;
            kdVar.setSize(AndroidUtilities.dp(30.0f));
            mdVar.f39860r.setProgressColor(-1);
            mdVar.f39860r.setNoProgress(false);
            kd kdVar2 = mdVar.f39860r;
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i27 = i17 | 48;
            if (z14) {
                f15 = 0.0f;
            } else {
                f15 = 16.0f;
            }
            if (z14) {
                f16 = 16.0f;
            } else {
                f16 = 0.0f;
            }
            frameLayout.addView(kdVar2, w7.x5.a(64.0f, f15, 12.0f, f16, 12.0f, 64, i27));
            mdVar.e0(false, false);
            org.telegram.ui.Components.zu zuVar2 = new org.telegram.ui.Components.zu(context, idVar, this, 0, false, null);
            mdVar = this;
            mdVar.f39842c = zuVar2;
            zuVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = mdVar.E;
            if (str != null) {
                mdVar.f39842c.setText(str);
                mdVar.E = null;
            }
            mdVar.f39842c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            mdVar.f39842c.getEditText().setSingleLine(true);
            mdVar.f39842c.getEditText().setImeOptions(5);
            mdVar.f39842c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) {
                public final md f37513b;

                {
                    this.f37513b = mdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (r2) {
                        case 0:
                            md mdVar2 = this.f37513b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(mdVar2.f39842c.getEditText().getText())) {
                                    mdVar2.f39867w.requestFocus();
                                    return true;
                                }
                            } else {
                                mdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (v0Var = this.f37513b.f39838a) != null) {
                                v0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.zu zuVar3 = mdVar.f39842c;
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                f17 = 5.0f;
            } else {
                f17 = 96.0f;
            }
            if (z15) {
                f18 = 96.0f;
            } else {
                f18 = 5.0f;
            }
            frameLayout.addView(zuVar3, w7.x5.a(-2.0f, f17, 0.0f, f18, 0.0f, -1, 16));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            mdVar.f39867w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            mdVar.f39867w.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = mdVar.f39867w;
            int i28 = org.telegram.ui.ActionBar.i6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i28, false));
            mdVar.f39867w.setBackgroundDrawable(null);
            mdVar.f39867w.setLineColors(mdVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20925k6), mdVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20943l6), mdVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21018p7));
            mdVar.f39867w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = mdVar.f39867w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            mdVar.f39867w.setInputType(180225);
            mdVar.f39867w.setImeOptions(6);
            mdVar.f39867w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            mdVar.f39867w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            mdVar.f39867w.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i28, false));
            mdVar.f39867w.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.f39867w.setCursorWidth(1.5f);
            mdVar.K.addView(mdVar.f39867w, w7.x5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            mdVar.f39867w.setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) {
                public final md f37513b;

                {
                    this.f37513b = mdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (r2) {
                        case 0:
                            md mdVar2 = this.f37513b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(mdVar2.f39842c.getEditText().getText())) {
                                    mdVar2.f39867w.requestFocus();
                                    return true;
                                }
                            } else {
                                mdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (v0Var = this.f37513b.f39838a) != null) {
                                v0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            mdVar.f39867w.addTextChangedListener(new ld(0));
            TextView textView = new TextView(context);
            mdVar.T = textView;
            textView.setTextSize(1, 15.0f);
            mdVar.T.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.F6, false));
            TextView textView2 = mdVar.T;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19);
            mdVar.T.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = mdVar.K;
            TextView textView3 = mdVar.T;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            linearLayout2.addView(textView3, w7.x5.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            mdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            mdVar.K = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(mdVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = mdVar.getMessagesController();
            long j3 = mdVar.f39851i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z10 = true;
            } else {
                z10 = false;
            }
            mdVar.I = z10;
            org.telegram.ui.ActionBar.k kVar = mdVar.actionBar;
            if (z10) {
                i10 = R.string.GroupSettingsTitle;
            } else {
                i10 = R.string.ChannelSettingsTitle;
            }
            kVar.setTitle(LocaleController.getString(i10));
            View view = mdVar.fragmentView;
            int i29 = org.telegram.ui.ActionBar.i6.f20741a7;
            view.setTag(Integer.valueOf(i29));
            mdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i29, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            mdVar.G = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = mdVar.G;
            int i30 = org.telegram.ui.ActionBar.i6.f20797d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i30, false));
            org.telegram.ui.Cells.m4 m4Var3 = mdVar.G;
            if (mdVar.I) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            m4Var3.setText(LocaleController.getString(i11));
            mdVar.K.addView(mdVar.G);
            LinearLayout linearLayout4 = new LinearLayout(context);
            mdVar.F = linearLayout4;
            linearLayout4.setOrientation(1);
            mdVar.F.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i30, false));
            mdVar.K.addView(mdVar.F, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
            mdVar.Q = j6Var;
            j6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
            Boolean bool = mdVar.f39853k0;
            if (bool != null && !bool.booleanValue()) {
                mdVar.f39839a0 = true;
            }
            if (mdVar.I) {
                mdVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !mdVar.f39839a0);
            } else {
                mdVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !mdVar.f39839a0);
            }
            mdVar.Q.setOnClickListener(new ed(mdVar, 2));
            if (bool == null || bool.booleanValue()) {
                mdVar.F.addView(mdVar.Q, w7.x5.n(-1, -2));
            }
            org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
            mdVar.R = j6Var2;
            j6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
            if (bool != null && bool.booleanValue()) {
                mdVar.f39839a0 = false;
            }
            if (mdVar.I) {
                mdVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, mdVar.f39839a0);
            } else {
                mdVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, mdVar.f39839a0);
            }
            mdVar.R.setOnClickListener(new ed(mdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                mdVar.F.addView(mdVar.R, w7.x5.n(-1, -2));
            }
            org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            mdVar.d = b7Var;
            mdVar.K.addView(b7Var, w7.x5.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            mdVar.M = linearLayout5;
            linearLayout5.setOrientation(1);
            mdVar.M.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i30, false));
            mdVar.K.addView(mdVar.M, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
            mdVar.V = m4Var4;
            mdVar.M.addView(m4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            mdVar.N = linearLayout6;
            linearLayout6.setOrientation(0);
            mdVar.M.addView(mdVar.N, w7.x5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            mdVar.H = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/");
            mdVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = mdVar.H;
            int i31 = org.telegram.ui.ActionBar.i6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = mdVar.H;
            int i32 = org.telegram.ui.ActionBar.i6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i32, false));
            mdVar.H.setMaxLines(1);
            mdVar.H.setLines(1);
            mdVar.H.setEnabled(false);
            mdVar.H.setBackgroundDrawable(null);
            mdVar.H.setPadding(0, 0, 0, 0);
            mdVar.H.setSingleLine(true);
            mdVar.H.setInputType(163840);
            mdVar.H.setImeOptions(6);
            mdVar.N.addView(mdVar.H, w7.x5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            mdVar.f39867w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            mdVar.f39867w.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i31, false));
            mdVar.f39867w.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i32, false));
            mdVar.f39867w.setMaxLines(1);
            mdVar.f39867w.setLines(1);
            mdVar.f39867w.setBackgroundDrawable(null);
            mdVar.f39867w.setPadding(0, 0, 0, 0);
            mdVar.f39867w.setSingleLine(true);
            mdVar.f39867w.setInputType(163872);
            mdVar.f39867w.setImeOptions(6);
            mdVar.f39867w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            mdVar.f39867w.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i32, false));
            mdVar.f39867w.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.f39867w.setCursorWidth(1.5f);
            mdVar.N.addView(mdVar.f39867w, w7.x5.n(-1, 36));
            mdVar.f39867w.addTextChangedListener(new m0(mdVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            mdVar.O = linearLayout7;
            linearLayout7.setOrientation(1);
            mdVar.M.addView(mdVar.O, w7.x5.n(-1, -2));
            org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(context, mdVar, null, true, ChatObject.isChannel(mdVar.getMessagesController().getChat(Long.valueOf(j3))));
            mdVar.P = x90Var;
            x90Var.b(true);
            mdVar.P.d(0, null, false);
            mdVar.O.addView(mdVar.P);
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(mdVar, context, 3);
            mdVar.U = y1Var;
            y1Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.J6, false));
            mdVar.U.setHighlightColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.K6, false));
            mdVar.U.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.y1 y1Var2 = mdVar.U;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            y1Var2.setGravity(i12);
            mdVar.U.setVisibility(8);
            mdVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = mdVar.M;
            org.telegram.ui.Cells.y1 y1Var3 = mdVar.U;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout8.addView(y1Var3, w7.x5.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            mdVar.S = e9Var;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.i6.f20761b7;
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, i33, i34));
            mdVar.K.addView(mdVar.S, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            mdVar.f39849g0 = s4Var;
            mdVar.K.addView(s4Var, w7.x5.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            mdVar.L = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i30, false));
            mdVar.L.setOrientation(1);
            mdVar.K.addView(mdVar.L, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            mdVar.f39846e0 = e9Var2;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider_bottom, i34));
            mdVar.K.addView(mdVar.f39846e0, w7.x5.n(-1, -2));
            mdVar.h0();
        }
        return mdVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.length() > 0) {
            this.U.setVisibility(0);
        } else {
            this.U.setVisibility(8);
        }
        org.telegram.ui.ActionBar.p pVar = this.Y;
        if (pVar != null) {
            AndroidUtilities.cancelRunOnUIThread(pVar);
            this.Y = null;
            this.X = null;
            if (this.W != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
            }
        }
        this.Z = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        org.telegram.ui.Cells.y1 y1Var = this.U;
                        int i11 = org.telegram.ui.ActionBar.i6.f21018p7;
                        y1Var.setTag(Integer.valueOf(i11));
                        this.U.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.y1 y1Var2 = this.U;
                        int i12 = org.telegram.ui.ActionBar.i6.f21018p7;
                        y1Var2.setTag(Integer.valueOf(i12));
                        this.U.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.y1 y1Var3 = this.U;
                int i13 = org.telegram.ui.ActionBar.i6.f21018p7;
                y1Var3.setTag(Integer.valueOf(i13));
                this.U.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.y1 y1Var4 = this.U;
                int i14 = org.telegram.ui.ActionBar.i6.f21018p7;
                y1Var4.setTag(Integer.valueOf(i14));
                this.U.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
                return false;
            }
            this.U.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.y1 y1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.i6.F6;
            y1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
            this.X = str;
            org.telegram.ui.ActionBar.p pVar2 = new org.telegram.ui.ActionBar.p(23, this, str);
            this.Y = pVar2;
            AndroidUtilities.runOnUIThread(pVar2, 300L);
            return true;
        }
        this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.y1 y1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.i6.f21018p7;
        y1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f39865u0;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                    this.f39865u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            g0(false);
            this.f39861r0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.b2 b2Var2 = this.f39865u0;
            if (b2Var2 != null) {
                try {
                    b2Var2.dismiss();
                    this.f39865u0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f39852j0);
            Boolean bool = this.f39853k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f39854l0 != null || this.m0 != null || this.f39856n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f39854l0, this.m0, this.f39856n0, this.f39858p0, this.f39857o0, this.f39869x, this.f39870y, null);
            }
            md mdVar = new md(bundle);
            mdVar.f39864t0 = this.f39864t0;
            presentFragment(mdVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.m50 m50Var = this.v;
        if (m50Var != null && m50Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.m50 m50Var = this.v;
        if ((m50Var == null || dialog != m50Var.f28684c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.h == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39855n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f39855n.cancel();
            this.f39855n = null;
        }
        if (z11) {
            this.f39855n = new AnimatorSet();
            if (z10) {
                this.f39860r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f39855n;
                jd jdVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(jdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f39860r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39855n;
                jd jdVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(jdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f39860r, property2, 0.0f));
            }
            this.f39855n.setDuration(180L);
            this.f39855n.addListener(new ai.n(27, this, z10));
            this.f39855n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f39860r.setAlpha(1.0f);
            this.f39860r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f39860r.setAlpha(0.0f);
            this.f39860r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f47294v0 = true;
        j0Var.H0 = new dd(this, 0);
        showDialog(j0Var);
    }

    public final void g0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f39866v0);
        }
        if (this.f39840b != null) {
            ValueAnimator valueAnimator = this.f39868w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f39840b.f26867c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39868w0 = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 4));
            ValueAnimator valueAnimator2 = this.f39868w0;
            float f12 = this.f39840b.f26867c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f39868w0.setInterpolator(org.telegram.ui.Components.hs.f27118f);
            this.f39868w0.start();
        }
    }

    @Override
    public final ev0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f39842c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21075s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        org.telegram.ui.Components.zu zuVar = this.f39842c;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(zuVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.zu zuVar2 = this.f39842c;
        int i12 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(zuVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.zu zuVar3 = this.f39842c;
        int i13 = org.telegram.ui.ActionBar.i6.f20925k6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(zuVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.zu zuVar4 = this.f39842c;
        int i14 = org.telegram.ui.ActionBar.i6.f20943l6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(zuVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39867w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39867w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39867w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39867w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.i6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.b7 b7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.i6.f20761b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(b7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.i6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.V, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.G, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.y1 y1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.i6.f21018p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(y1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.i6.f21146w6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39846e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.i6.f20888i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39849g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20869h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.i6.f20854g7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.i6.f20870h7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.i6.f21199z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.i6.f21181y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.f21049r0, eVar, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        return arrayList;
    }

    public final void h0() {
        int i10;
        int i11;
        int i12;
        int i13;
        int dp;
        int i14;
        int i15;
        if (this.d == null) {
            return;
        }
        String str = null;
        int i16 = 8;
        if (!this.f39839a0 && !this.f39852j0) {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.S;
            int i17 = org.telegram.ui.ActionBar.i6.f21018p7;
            e9Var.setTag(Integer.valueOf(i17));
            this.S.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i17, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f39844d0) {
                this.f39849g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var2 = this.S;
                e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(e9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20761b7));
                this.f39846e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.e9 e9Var3 = this.S;
                e9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(e9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f20761b7));
                this.f39849g0.setVisibility(8);
                this.L.setVisibility(0);
                this.f39846e0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var4 = this.S;
            int i18 = org.telegram.ui.ActionBar.i6.B6;
            e9Var4.setTag(Integer.valueOf(i18));
            this.S.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i18, false));
            this.d.setVisibility(0);
            this.f39846e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.e9 e9Var5 = this.S;
            e9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(e9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20761b7));
            this.M.setVisibility(0);
            this.f39849g0.setVisibility(8);
            if (this.I) {
                org.telegram.ui.Cells.e9 e9Var6 = this.S;
                if (this.f39839a0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                e9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.m4 m4Var = this.V;
                if (this.f39839a0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.e9 e9Var7 = this.S;
                if (this.f39839a0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                e9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.m4 m4Var2 = this.V;
                if (this.f39839a0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                m4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.N;
            if (this.f39839a0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.O;
            if (this.f39839a0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.M;
            if (this.f39839a0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.x90 x90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f39843c0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            x90Var.setLink(str);
            org.telegram.ui.Cells.y1 y1Var = this.U;
            if (!this.f39839a0 && y1Var.length() != 0) {
                i16 = 0;
            }
            y1Var.setVisibility(i16);
        }
        this.Q.a(!this.f39839a0);
        this.R.a(this.f39839a0);
        this.f39867w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f39867w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.m50 m50Var = this.v;
        if (m50Var != null) {
            m50Var.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.zu zuVar = this.f39842c;
        if (zuVar == null || !zuVar.f33652e) {
            return true;
        }
        if (z10) {
            zuVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f39850h0 == 1 && !this.f39841b0 && this.f39843c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j3 = this.f39851i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull != null) {
                this.f39843c0 = chatFull.exported_invite;
            }
            if (this.f39843c0 == null) {
                this.f39841b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new cd(this, 3));
            }
        }
        org.telegram.ui.Components.m50 m50Var = this.v;
        if (m50Var != null) {
            m50Var.f28682a = this;
            m50Var.f28683b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f39863s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39863s0.intValue(), true);
            this.f39863s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.m50 m50Var = this.v;
        if (m50Var != null) {
            m50Var.d();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.zu zuVar = this.f39842c;
        if (zuVar != null) {
            zuVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.zu zuVar = this.f39842c;
        if (zuVar != null) {
            zuVar.r();
        }
        org.telegram.ui.Components.m50 m50Var = this.v;
        if (m50Var != null) {
            m50Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.m50 m50Var = this.v;
        if (m50Var != null) {
            m50Var.j(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.zu zuVar = this.f39842c;
        if (zuVar != null) {
            zuVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.m50 m50Var = this.v;
        if (m50Var != null) {
            m50Var.k();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f39850h0 != 1) {
            this.f39842c.requestFocus();
            org.telegram.ui.Components.uu uuVar = this.f39842c.f33649a;
            uuVar.requestFocus();
            AndroidUtilities.showKeyboard(uuVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f39850h0 == 0) {
            org.telegram.ui.Components.m50 m50Var = this.v;
            if (m50Var != null) {
                m50Var.f28686f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.zu zuVar = this.f39842c;
                if (zuVar != null) {
                    zuVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f39850h0 == 0) {
            org.telegram.ui.Components.m50 m50Var = this.v;
            if (m50Var != null && (str = m50Var.f28686f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.zu zuVar = this.f39842c;
            if (zuVar != null) {
                String obj = zuVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void P() {
    }
}
