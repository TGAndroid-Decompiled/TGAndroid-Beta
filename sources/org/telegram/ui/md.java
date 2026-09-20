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
public final class md extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.t40 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.n4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.hj0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.d90 P;
    public org.telegram.ui.Cells.k6 Q;
    public org.telegram.ui.Cells.k6 R;
    public org.telegram.ui.Cells.f9 S;
    public TextView T;
    public org.telegram.ui.Cells.y1 U;
    public org.telegram.ui.Cells.n4 V;
    public int W;
    public String X;
    public org.telegram.ui.ActionBar.c6 Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.v0 f35657a;
    public boolean f35658a0;
    public org.telegram.ui.Components.pr f35659b;
    public boolean f35660b0;
    public org.telegram.ui.Components.ju f35661c;
    public TLRPC.TL_chatInviteExported f35662c0;
    public org.telegram.ui.Cells.c7 d;
    public boolean f35663d0;
    public ai.z5 e;
    public org.telegram.ui.Cells.f9 f35664e0;
    public ci.s6 f35665f;
    public final ArrayList f35666f0;
    public org.telegram.ui.Cells.t4 f35667g0;
    public jd h;
    public final int f35668h0;
    public final long f35669i0;
    public boolean f35670j0;
    public final Boolean f35671k0;
    public TLRPC.InputFile f35672l0;
    public TLRPC.InputFile m0;
    public AnimatorSet f35673n;
    public TLRPC.VideoSize f35674n0;
    public String f35675o0;
    public double f35676p0;
    public boolean f35677q0;
    public kd f35678r;
    public boolean f35679r0;
    public final org.telegram.ui.Components.g9 f35680s;
    public Integer f35681s0;
    public Utilities.Callback2 f35682t0;
    public org.telegram.ui.ActionBar.b2 f35683u0;
    public final org.telegram.ui.Components.u40 v;
    public final dd f35684v0;
    public EditTextBoldCursor f35685w;
    public ValueAnimator f35686w0;
    public TLRPC.FileLocation f35687x;
    public TLRPC.FileLocation f35688y;

    public md(Bundle bundle) {
        super(bundle);
        this.f35666f0 = new ArrayList();
        this.f35670j0 = true;
        this.f35684v0 = new dd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f35668h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f35671k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f35680s = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
            this.v = new org.telegram.ui.Components.u40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new cd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f35670j0 = z10;
            this.f35658a0 = !z10;
            if (!z10 && !this.f35663d0) {
                this.f35663d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new cd(this, 0));
            }
        }
        this.f35669i0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(md mdVar, org.telegram.ui.ActionBar.b2 b2Var) {
        mdVar.f35679r0 = false;
        mdVar.f35677q0 = false;
        if (mdVar.f35681s0 != null) {
            ConnectionsManager.getInstance(mdVar.currentAccount).cancelRequest(mdVar.f35681s0.intValue(), true);
            mdVar.f35681s0 = null;
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
        tL_channels_checkUsername.channel = MessagesController.getInstance(mdVar.currentAccount).getInputChannel(mdVar.f35669i0);
        mdVar.W = ConnectionsManager.getInstance(mdVar.currentAccount).sendRequest(tL_channels_checkUsername, new ba(mdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(md mdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
        b2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new l4(4, mdVar, currentChannel));
        mdVar.showDialog(b2Var);
    }

    public static void Y(md mdVar) {
        if (mdVar.f35683u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new y0(mdVar, 13));
        mdVar.f35683u0 = alertDialog$Builder.o();
    }

    @Override
    public final void B(float f7) {
        kd kdVar = this.f35678r;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        kd kdVar = this.f35678r;
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
        org.telegram.ui.Components.ju juVar = mdVar.f35661c;
        if (juVar != null) {
            juVar.o();
        }
        mdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        mdVar.actionBar.setAllowOverlayTitle(true);
        mdVar.actionBar.setActionBarMenuOnItemClick(new hd(mdVar));
        org.telegram.ui.ActionBar.z n10 = mdVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.j6.f19427v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.j6.w0(null, i21, false)));
        mdVar.f35659b = prVar;
        mdVar.f35657a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), prVar);
        int i22 = mdVar.f35668h0;
        if (i22 == 0) {
            mdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            id idVar = new id(0, context, mdVar);
            idVar.setOnTouchListener(new bi.d(2));
            mdVar.fragmentView = idVar;
            int i23 = org.telegram.ui.ActionBar.j6.f19094d6;
            idVar.setTag(Integer.valueOf(i23));
            mdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            mdVar.K = linearLayout;
            linearLayout.setOrientation(1);
            idVar.addView(mdVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            mdVar.K.addView(frameLayout, w7.y5.n(-1, -2));
            ai.z5 z5Var = new ai.z5(mdVar, context, 5);
            mdVar.e = z5Var;
            z5Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.g9 g9Var = mdVar.f35680s;
            g9Var.n(5L, null, null);
            mdVar.e.setImageDrawable(g9Var);
            ai.z5 z5Var2 = mdVar.e;
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
            frameLayout.addView(z5Var2, w7.y5.d(64, 64.0f, i24, f7, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ci.s6 s6Var = new ci.s6(mdVar, context, paint, 2);
            mdVar.f35665f = s6Var;
            s6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ci.s6 s6Var2 = mdVar.f35665f;
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
            frameLayout.addView(s6Var2, w7.y5.d(64, 64.0f, i25, f11, 12.0f, f12, 12.0f));
            mdVar.f35665f.setOnClickListener(new ed(mdVar, 1));
            mdVar.J = new org.telegram.ui.Components.hj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
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
            frameLayout.addView(jdVar2, w7.y5.d(64, 64.0f, i26, f13, 12.0f, f14, 12.0f));
            kd kdVar = new kd(mdVar, context, 0);
            mdVar.f35678r = kdVar;
            kdVar.setSize(AndroidUtilities.dp(30.0f));
            mdVar.f35678r.setProgressColor(-1);
            mdVar.f35678r.setNoProgress(false);
            kd kdVar2 = mdVar.f35678r;
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
            frameLayout.addView(kdVar2, w7.y5.d(64, 64.0f, i27, f15, 12.0f, f16, 12.0f));
            mdVar.e0(false, false);
            org.telegram.ui.Components.ju juVar2 = new org.telegram.ui.Components.ju(context, idVar, this, 0, false, null);
            mdVar = this;
            mdVar.f35661c = juVar2;
            juVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = mdVar.E;
            if (str != null) {
                mdVar.f35661c.setText(str);
                mdVar.E = null;
            }
            mdVar.f35661c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            mdVar.f35661c.getEditText().setSingleLine(true);
            mdVar.f35661c.getEditText().setImeOptions(5);
            mdVar.f35661c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) {
                public final md f33573b;

                {
                    this.f33573b = mdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (r2) {
                        case 0:
                            md mdVar2 = this.f33573b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(mdVar2.f35661c.getEditText().getText())) {
                                    mdVar2.f35685w.requestFocus();
                                    return true;
                                }
                            } else {
                                mdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (v0Var = this.f33573b.f35657a) != null) {
                                v0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.ju juVar3 = mdVar.f35661c;
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
            frameLayout.addView(juVar3, w7.y5.d(-1, -2.0f, 16, f17, 0.0f, f18, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            mdVar.f35685w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            mdVar.f35685w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = mdVar.f35685w;
            int i28 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i28, false));
            mdVar.f35685w.setBackgroundDrawable(null);
            mdVar.f35685w.setLineColors(mdVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19222k6), mdVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19240l6), mdVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19315p7));
            mdVar.f35685w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = mdVar.f35685w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            mdVar.f35685w.setInputType(180225);
            mdVar.f35685w.setImeOptions(6);
            mdVar.f35685w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            mdVar.f35685w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            mdVar.f35685w.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i28, false));
            mdVar.f35685w.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.f35685w.setCursorWidth(1.5f);
            mdVar.K.addView(mdVar.f35685w, w7.y5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            mdVar.f35685w.setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) {
                public final md f33573b;

                {
                    this.f33573b = mdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (r2) {
                        case 0:
                            md mdVar2 = this.f33573b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(mdVar2.f35661c.getEditText().getText())) {
                                    mdVar2.f35685w.requestFocus();
                                    return true;
                                }
                            } else {
                                mdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (v0Var = this.f33573b.f35657a) != null) {
                                v0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            mdVar.f35685w.addTextChangedListener(new ld(0));
            TextView textView = new TextView(context);
            mdVar.T = textView;
            textView.setTextSize(1, 15.0f);
            mdVar.T.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
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
            linearLayout2.addView(textView3, w7.y5.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            mdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            mdVar.K = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(mdVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = mdVar.getMessagesController();
            long j3 = mdVar.f35669i0;
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
            int i29 = org.telegram.ui.ActionBar.j6.f19038a7;
            view.setTag(Integer.valueOf(i29));
            mdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i29, false));
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
            mdVar.G = n4Var;
            n4Var.setHeight(46);
            org.telegram.ui.Cells.n4 n4Var2 = mdVar.G;
            int i30 = org.telegram.ui.ActionBar.j6.f19094d6;
            n4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            org.telegram.ui.Cells.n4 n4Var3 = mdVar.G;
            if (mdVar.I) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            n4Var3.setText(LocaleController.getString(i11));
            mdVar.K.addView(mdVar.G);
            LinearLayout linearLayout4 = new LinearLayout(context);
            mdVar.F = linearLayout4;
            linearLayout4.setOrientation(1);
            mdVar.F.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            mdVar.K.addView(mdVar.F, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, false);
            mdVar.Q = k6Var;
            k6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            Boolean bool = mdVar.f35671k0;
            if (bool != null && !bool.booleanValue()) {
                mdVar.f35658a0 = true;
            }
            if (mdVar.I) {
                mdVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !mdVar.f35658a0);
            } else {
                mdVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !mdVar.f35658a0);
            }
            mdVar.Q.setOnClickListener(new ed(mdVar, 2));
            if (bool == null || bool.booleanValue()) {
                mdVar.F.addView(mdVar.Q, w7.y5.n(-1, -2));
            }
            org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, false);
            mdVar.R = k6Var2;
            k6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            if (bool != null && bool.booleanValue()) {
                mdVar.f35658a0 = false;
            }
            if (mdVar.I) {
                mdVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, mdVar.f35658a0);
            } else {
                mdVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, mdVar.f35658a0);
            }
            mdVar.R.setOnClickListener(new ed(mdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                mdVar.F.addView(mdVar.R, w7.y5.n(-1, -2));
            }
            org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
            mdVar.d = c7Var;
            mdVar.K.addView(c7Var, w7.y5.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            mdVar.M = linearLayout5;
            linearLayout5.setOrientation(1);
            mdVar.M.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            mdVar.K.addView(mdVar.M, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
            mdVar.V = n4Var4;
            mdVar.M.addView(n4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            mdVar.N = linearLayout6;
            linearLayout6.setOrientation(0);
            mdVar.M.addView(mdVar.N, w7.y5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            mdVar.H = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/");
            mdVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = mdVar.H;
            int i31 = org.telegram.ui.ActionBar.j6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = mdVar.H;
            int i32 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i32, false));
            mdVar.H.setMaxLines(1);
            mdVar.H.setLines(1);
            mdVar.H.setEnabled(false);
            mdVar.H.setBackgroundDrawable(null);
            mdVar.H.setPadding(0, 0, 0, 0);
            mdVar.H.setSingleLine(true);
            mdVar.H.setInputType(163840);
            mdVar.H.setImeOptions(6);
            mdVar.N.addView(mdVar.H, w7.y5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            mdVar.f35685w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            mdVar.f35685w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i31, false));
            mdVar.f35685w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i32, false));
            mdVar.f35685w.setMaxLines(1);
            mdVar.f35685w.setLines(1);
            mdVar.f35685w.setBackgroundDrawable(null);
            mdVar.f35685w.setPadding(0, 0, 0, 0);
            mdVar.f35685w.setSingleLine(true);
            mdVar.f35685w.setInputType(163872);
            mdVar.f35685w.setImeOptions(6);
            mdVar.f35685w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            mdVar.f35685w.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i32, false));
            mdVar.f35685w.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.f35685w.setCursorWidth(1.5f);
            mdVar.N.addView(mdVar.f35685w, w7.y5.n(-1, 36));
            mdVar.f35685w.addTextChangedListener(new l0(mdVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            mdVar.O = linearLayout7;
            linearLayout7.setOrientation(1);
            mdVar.M.addView(mdVar.O, w7.y5.n(-1, -2));
            org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, mdVar, null, true, ChatObject.isChannel(mdVar.getMessagesController().getChat(Long.valueOf(j3))));
            mdVar.P = d90Var;
            d90Var.b(true);
            mdVar.P.d(0, null, false);
            mdVar.O.addView(mdVar.P);
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(mdVar, context, 3);
            mdVar.U = y1Var;
            y1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            mdVar.U.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
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
            linearLayout8.addView(y1Var3, w7.y5.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            mdVar.S = f9Var;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.j6.f19058b7;
            f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i33, i34));
            mdVar.K.addView(mdVar.S, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
            mdVar.f35667g0 = t4Var;
            mdVar.K.addView(t4Var, w7.y5.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            mdVar.L = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            mdVar.L.setOrientation(1);
            mdVar.K.addView(mdVar.L, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context);
            mdVar.f35664e0 = f9Var2;
            f9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i34));
            mdVar.K.addView(mdVar.f35664e0, w7.y5.n(-1, -2));
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
        org.telegram.ui.ActionBar.c6 c6Var = this.Y;
        if (c6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(c6Var);
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
                        int i11 = org.telegram.ui.ActionBar.j6.f19315p7;
                        y1Var.setTag(Integer.valueOf(i11));
                        this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.y1 y1Var2 = this.U;
                        int i12 = org.telegram.ui.ActionBar.j6.f19315p7;
                        y1Var2.setTag(Integer.valueOf(i12));
                        this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.y1 y1Var3 = this.U;
                int i13 = org.telegram.ui.ActionBar.j6.f19315p7;
                y1Var3.setTag(Integer.valueOf(i13));
                this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.y1 y1Var4 = this.U;
                int i14 = org.telegram.ui.ActionBar.j6.f19315p7;
                y1Var4.setTag(Integer.valueOf(i14));
                this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                return false;
            }
            this.U.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.y1 y1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.j6.F6;
            y1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.X = str;
            org.telegram.ui.ActionBar.c6 c6Var2 = new org.telegram.ui.ActionBar.c6(22, this, str);
            this.Y = c6Var2;
            AndroidUtilities.runOnUIThread(c6Var2, 300L);
            return true;
        }
        this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.y1 y1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.j6.f19315p7;
        y1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f35683u0;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                    this.f35683u0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.f35679r0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.b2 b2Var2 = this.f35683u0;
            if (b2Var2 != null) {
                try {
                    b2Var2.dismiss();
                    this.f35683u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f35670j0);
            Boolean bool = this.f35671k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f35672l0 != null || this.m0 != null || this.f35674n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f35672l0, this.m0, this.f35674n0, this.f35676p0, this.f35675o0, this.f35687x, this.f35688y, null);
            }
            md mdVar = new md(bundle);
            mdVar.f35682t0 = this.f35682t0;
            presentFragment(mdVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null && u40Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.u40 u40Var = this.v;
        if ((u40Var == null || dialog != u40Var.f28533c) && super.dismissDialogOnPause(dialog)) {
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
        AnimatorSet animatorSet = this.f35673n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f35673n.cancel();
            this.f35673n = null;
        }
        if (z11) {
            this.f35673n = new AnimatorSet();
            if (z10) {
                this.f35678r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f35673n;
                jd jdVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(jdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f35678r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f35673n;
                jd jdVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(jdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f35678r, property2, 0.0f));
            }
            this.f35673n.setDuration(180L);
            this.f35673n.addListener(new ai.n(27, this, z10));
            this.f35673n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f35678r.setAlpha(1.0f);
            this.f35678r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f35678r.setAlpha(0.0f);
            this.f35678r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f42628v0 = true;
        j0Var.H0 = new dd(this, 0);
        showDialog(j0Var);
    }

    public final void g0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f35684v0);
        }
        if (this.f35659b != null) {
            ValueAnimator valueAnimator = this.f35686w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f35659b.f27431c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f35686w0 = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 3));
            ValueAnimator valueAnimator2 = this.f35686w0;
            float f12 = this.f35659b.f27431c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f35686w0.setInterpolator(org.telegram.ui.Components.qr.f27642f);
            this.f35686w0.start();
        }
    }

    @Override
    public final dv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f35661c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19094d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f19038a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19372s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19427v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19391t8));
        org.telegram.ui.Components.ju juVar = this.f35661c;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(juVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.ju juVar2 = this.f35661c;
        int i12 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(juVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.ju juVar3 = this.f35661c;
        int i13 = org.telegram.ui.ActionBar.j6.f19222k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(juVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.ju juVar4 = this.f35661c;
        int i14 = org.telegram.ui.ActionBar.j6.f19240l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(juVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35685w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35685w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35685w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35685w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.j6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.c7 c7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.j6.f19058b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(c7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.y1 y1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.j6.f19315p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.j6.f19443w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35664e0, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.j6.f19184i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35667g0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19166h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.f19149g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.j6.f19167h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.j6.f19496z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.j6.f19477y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f19345r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
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
        if (!this.f35658a0 && !this.f35670j0) {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.f9 f9Var = this.S;
            int i17 = org.telegram.ui.ActionBar.j6.f19315p7;
            f9Var.setTag(Integer.valueOf(i17));
            this.S.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f35663d0) {
                this.f35667g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.f9 f9Var2 = this.S;
                f9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(f9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19058b7));
                this.f35664e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.f9 f9Var3 = this.S;
                f9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(f9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19058b7));
                this.f35667g0.setVisibility(8);
                this.L.setVisibility(0);
                this.f35664e0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.f9 f9Var4 = this.S;
            int i18 = org.telegram.ui.ActionBar.j6.B6;
            f9Var4.setTag(Integer.valueOf(i18));
            this.S.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            this.d.setVisibility(0);
            this.f35664e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.f9 f9Var5 = this.S;
            f9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(f9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19058b7));
            this.M.setVisibility(0);
            this.f35667g0.setVisibility(8);
            if (this.I) {
                org.telegram.ui.Cells.f9 f9Var6 = this.S;
                if (this.f35658a0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                f9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.n4 n4Var = this.V;
                if (this.f35658a0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                n4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.f9 f9Var7 = this.S;
                if (this.f35658a0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                f9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.n4 n4Var2 = this.V;
                if (this.f35658a0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                n4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.N;
            if (this.f35658a0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.O;
            if (this.f35658a0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.M;
            if (this.f35658a0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.d90 d90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f35662c0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            d90Var.setLink(str);
            org.telegram.ui.Cells.y1 y1Var = this.U;
            if (!this.f35658a0 && y1Var.length() != 0) {
                i16 = 0;
            }
            y1Var.setVisibility(i16);
        }
        this.Q.a(!this.f35658a0);
        this.R.a(this.f35658a0);
        this.f35685w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f35685w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ju juVar = this.f35661c;
        if (juVar == null || !juVar.e) {
            return true;
        }
        if (z10) {
            juVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f35668h0 == 1 && !this.f35660b0 && this.f35662c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j3 = this.f35669i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull != null) {
                this.f35662c0 = chatFull.exported_invite;
            }
            if (this.f35662c0 == null) {
                this.f35660b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new cd(this, 3));
            }
        }
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.f28531a = this;
            u40Var.f28532b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f35681s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f35681s0.intValue(), true);
            this.f35681s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.ju juVar = this.f35661c;
        if (juVar != null) {
            juVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ju juVar = this.f35661c;
        if (juVar != null) {
            juVar.r();
        }
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.j();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.k(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ju juVar = this.f35661c;
        if (juVar != null) {
            juVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f35668h0 != 1) {
            this.f35661c.requestFocus();
            org.telegram.ui.Components.eu euVar = this.f35661c.f25453a;
            euVar.requestFocus();
            AndroidUtilities.showKeyboard(euVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f35668h0 == 0) {
            org.telegram.ui.Components.u40 u40Var = this.v;
            if (u40Var != null) {
                u40Var.f28534f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.ju juVar = this.f35661c;
                if (juVar != null) {
                    juVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f35668h0 == 0) {
            org.telegram.ui.Components.u40 u40Var = this.v;
            if (u40Var != null && (str = u40Var.f28534f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.ju juVar = this.f35661c;
            if (juVar != null) {
                String obj = juVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void P() {
    }
}
