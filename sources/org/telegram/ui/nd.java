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
public final class nd extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.x40 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.m4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.kj0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.j90 P;
    public org.telegram.ui.Cells.j6 Q;
    public org.telegram.ui.Cells.j6 R;
    public org.telegram.ui.Cells.e9 S;
    public TextView T;
    public org.telegram.ui.Cells.y1 U;
    public org.telegram.ui.Cells.m4 V;
    public int W;
    public String X;
    public org.telegram.ui.ActionBar.g6 Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.v0 f38903a;
    public boolean f38904a0;
    public org.telegram.ui.Components.sr f38905b;
    public boolean f38906b0;
    public org.telegram.ui.Components.mu f38907c;
    public TLRPC.TL_chatInviteExported f38908c0;
    public org.telegram.ui.Cells.b7 d;
    public boolean f38909d0;
    public ai.y5 f38910e;
    public org.telegram.ui.Cells.e9 f38911e0;
    public ci.r6 f38912f;
    public final ArrayList f38913f0;
    public org.telegram.ui.Cells.s4 f38914g0;
    public kd h;
    public final int f38915h0;
    public final long f38916i0;
    public boolean f38917j0;
    public final Boolean f38918k0;
    public TLRPC.InputFile f38919l0;
    public TLRPC.InputFile m0;
    public AnimatorSet f38920n;
    public TLRPC.VideoSize f38921n0;
    public String f38922o0;
    public double f38923p0;
    public boolean f38924q0;
    public ld f38925r;
    public boolean f38926r0;
    public final org.telegram.ui.Components.h9 f38927s;
    public Integer f38928s0;
    public Utilities.Callback2 f38929t0;
    public org.telegram.ui.ActionBar.b2 f38930u0;
    public final org.telegram.ui.Components.y40 v;
    public final ed f38931v0;
    public EditTextBoldCursor f38932w;
    public ValueAnimator f38933w0;
    public TLRPC.FileLocation f38934x;
    public TLRPC.FileLocation f38935y;

    public nd(Bundle bundle) {
        super(bundle);
        this.f38913f0 = new ArrayList();
        this.f38917j0 = true;
        this.f38931v0 = new ed(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f38915h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f38918k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f38927s = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            this.v = new org.telegram.ui.Components.y40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new dd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f38917j0 = z10;
            this.f38904a0 = !z10;
            if (!z10 && !this.f38909d0) {
                this.f38909d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new dd(this, 0));
            }
        }
        this.f38916i0 = bundle.getLong("chat_id", 0L);
    }

    public static void S(nd ndVar, org.telegram.ui.ActionBar.b2 b2Var) {
        ndVar.f38926r0 = false;
        ndVar.f38924q0 = false;
        if (ndVar.f38928s0 != null) {
            ConnectionsManager.getInstance(ndVar.currentAccount).cancelRequest(ndVar.f38928s0.intValue(), true);
            ndVar.f38928s0 = null;
        }
        ndVar.g0(false);
        b2Var.dismiss();
    }

    public static void T(nd ndVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_updateUsername, new dd(ndVar, 1), 64);
    }

    public static void U(nd ndVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(ndVar.currentAccount).getInputChannel(ndVar.f38916i0);
        ndVar.W = ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_checkUsername, new ca(ndVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void W(nd ndVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
        b2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o(6, ndVar, currentChannel));
        ndVar.showDialog(b2Var);
    }

    public static void X(nd ndVar) {
        if (ndVar.f38930u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new z0(ndVar, 14));
        ndVar.f38930u0 = alertDialog$Builder.o();
    }

    @Override
    public final void B(float f7) {
        ld ldVar = this.f38925r;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f7);
    }

    @Override
    public final void I(boolean z10, boolean z11) {
        ld ldVar = this.f38925r;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override
    public final void O(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
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
        nd ndVar = this;
        org.telegram.ui.Components.mu muVar = ndVar.f38907c;
        if (muVar != null) {
            muVar.o();
        }
        ndVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ndVar.actionBar.setAllowOverlayTitle(true);
        ndVar.actionBar.setActionBarMenuOnItemClick(new id(ndVar));
        org.telegram.ui.ActionBar.z n10 = ndVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.i6.f21154v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.sr srVar = new org.telegram.ui.Components.sr(mutate, new org.telegram.ui.Components.wp(org.telegram.ui.ActionBar.i6.w0(null, i21, false)));
        ndVar.f38905b = srVar;
        ndVar.f38903a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), srVar);
        int i22 = ndVar.f38915h0;
        if (i22 == 0) {
            ndVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            jd jdVar = new jd(0, context, ndVar);
            jdVar.setOnTouchListener(new bi.d(2));
            ndVar.fragmentView = jdVar;
            int i23 = org.telegram.ui.ActionBar.i6.f20817d6;
            jdVar.setTag(Integer.valueOf(i23));
            ndVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            ndVar.K = linearLayout;
            linearLayout.setOrientation(1);
            jdVar.addView(ndVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            ndVar.K.addView(frameLayout, w7.z5.n(-1, -2));
            ai.y5 y5Var = new ai.y5(ndVar, context, 5);
            ndVar.f38910e = y5Var;
            y5Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.h9 h9Var = ndVar.f38927s;
            h9Var.n(5L, null, null);
            ndVar.f38910e.setImageDrawable(h9Var);
            ai.y5 y5Var2 = ndVar.f38910e;
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
            frameLayout.addView(y5Var2, w7.z5.d(64, 64.0f, i24, f7, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ci.r6 r6Var = new ci.r6(ndVar, context, paint, 3);
            ndVar.f38912f = r6Var;
            r6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ci.r6 r6Var2 = ndVar.f38912f;
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
            frameLayout.addView(r6Var2, w7.z5.d(64, 64.0f, i25, f11, 12.0f, f12, 12.0f));
            ndVar.f38912f.setOnClickListener(new fd(ndVar, 1));
            ndVar.J = new org.telegram.ui.Components.kj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            kd kdVar = new kd(ndVar, context, 0);
            ndVar.h = kdVar;
            kdVar.setScaleType(ImageView.ScaleType.CENTER);
            ndVar.h.setAnimation(ndVar.J);
            ndVar.h.setEnabled(false);
            ndVar.h.setClickable(false);
            ndVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            kd kdVar2 = ndVar.h;
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
            frameLayout.addView(kdVar2, w7.z5.d(64, 64.0f, i26, f13, 12.0f, f14, 12.0f));
            ld ldVar = new ld(ndVar, context, 0);
            ndVar.f38925r = ldVar;
            ldVar.setSize(AndroidUtilities.dp(30.0f));
            ndVar.f38925r.setProgressColor(-1);
            ndVar.f38925r.setNoProgress(false);
            ld ldVar2 = ndVar.f38925r;
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
            frameLayout.addView(ldVar2, w7.z5.d(64, 64.0f, i27, f15, 12.0f, f16, 12.0f));
            ndVar.e0(false, false);
            org.telegram.ui.Components.mu muVar2 = new org.telegram.ui.Components.mu(context, jdVar, this, 0, false, null);
            ndVar = this;
            ndVar.f38907c = muVar2;
            muVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = ndVar.E;
            if (str != null) {
                ndVar.f38907c.setText(str);
                ndVar.E = null;
            }
            ndVar.f38907c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            ndVar.f38907c.getEditText().setSingleLine(true);
            ndVar.f38907c.getEditText().setImeOptions(5);
            ndVar.f38907c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) {
                public final nd f36560b;

                {
                    this.f36560b = ndVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (r2) {
                        case 0:
                            nd ndVar2 = this.f36560b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(ndVar2.f38907c.getEditText().getText())) {
                                    ndVar2.f38932w.requestFocus();
                                    return true;
                                }
                            } else {
                                ndVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (v0Var = this.f36560b.f38903a) != null) {
                                v0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.mu muVar3 = ndVar.f38907c;
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
            frameLayout.addView(muVar3, w7.z5.d(-1, -2.0f, 16, f17, 0.0f, f18, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            ndVar.f38932w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            ndVar.f38932w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = ndVar.f38932w;
            int i28 = org.telegram.ui.ActionBar.i6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i28, false));
            ndVar.f38932w.setBackgroundDrawable(null);
            ndVar.f38932w.setLineColors(ndVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20946k6), ndVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20964l6), ndVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21039p7));
            ndVar.f38932w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = ndVar.f38932w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            ndVar.f38932w.setInputType(180225);
            ndVar.f38932w.setImeOptions(6);
            ndVar.f38932w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            ndVar.f38932w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            ndVar.f38932w.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i28, false));
            ndVar.f38932w.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.f38932w.setCursorWidth(1.5f);
            ndVar.K.addView(ndVar.f38932w, w7.z5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            ndVar.f38932w.setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) {
                public final nd f36560b;

                {
                    this.f36560b = ndVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (r2) {
                        case 0:
                            nd ndVar2 = this.f36560b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(ndVar2.f38907c.getEditText().getText())) {
                                    ndVar2.f38932w.requestFocus();
                                    return true;
                                }
                            } else {
                                ndVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (v0Var = this.f36560b.f38903a) != null) {
                                v0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            ndVar.f38932w.addTextChangedListener(new md(0));
            TextView textView = new TextView(context);
            ndVar.T = textView;
            textView.setTextSize(1, 15.0f);
            ndVar.T.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.F6, false));
            TextView textView2 = ndVar.T;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19);
            ndVar.T.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = ndVar.K;
            TextView textView3 = ndVar.T;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            linearLayout2.addView(textView3, w7.z5.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            ndVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            ndVar.K = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(ndVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = ndVar.getMessagesController();
            long j3 = ndVar.f38916i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ndVar.I = z10;
            org.telegram.ui.ActionBar.k kVar = ndVar.actionBar;
            if (z10) {
                i10 = R.string.GroupSettingsTitle;
            } else {
                i10 = R.string.ChannelSettingsTitle;
            }
            kVar.setTitle(LocaleController.getString(i10));
            View view = ndVar.fragmentView;
            int i29 = org.telegram.ui.ActionBar.i6.f20761a7;
            view.setTag(Integer.valueOf(i29));
            ndVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i29, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            ndVar.G = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = ndVar.G;
            int i30 = org.telegram.ui.ActionBar.i6.f20817d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i30, false));
            org.telegram.ui.Cells.m4 m4Var3 = ndVar.G;
            if (ndVar.I) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            m4Var3.setText(LocaleController.getString(i11));
            ndVar.K.addView(ndVar.G);
            LinearLayout linearLayout4 = new LinearLayout(context);
            ndVar.F = linearLayout4;
            linearLayout4.setOrientation(1);
            ndVar.F.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i30, false));
            ndVar.K.addView(ndVar.F, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
            ndVar.Q = j6Var;
            j6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
            Boolean bool = ndVar.f38918k0;
            if (bool != null && !bool.booleanValue()) {
                ndVar.f38904a0 = true;
            }
            if (ndVar.I) {
                ndVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !ndVar.f38904a0);
            } else {
                ndVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !ndVar.f38904a0);
            }
            ndVar.Q.setOnClickListener(new fd(ndVar, 2));
            if (bool == null || bool.booleanValue()) {
                ndVar.F.addView(ndVar.Q, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
            ndVar.R = j6Var2;
            j6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
            if (bool != null && bool.booleanValue()) {
                ndVar.f38904a0 = false;
            }
            if (ndVar.I) {
                ndVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, ndVar.f38904a0);
            } else {
                ndVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, ndVar.f38904a0);
            }
            ndVar.R.setOnClickListener(new fd(ndVar, 3));
            if (bool == null || !bool.booleanValue()) {
                ndVar.F.addView(ndVar.R, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            ndVar.d = b7Var;
            ndVar.K.addView(b7Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            ndVar.M = linearLayout5;
            linearLayout5.setOrientation(1);
            ndVar.M.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i30, false));
            ndVar.K.addView(ndVar.M, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
            ndVar.V = m4Var4;
            ndVar.M.addView(m4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            ndVar.N = linearLayout6;
            linearLayout6.setOrientation(0);
            ndVar.M.addView(ndVar.N, w7.z5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            ndVar.H = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/");
            ndVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = ndVar.H;
            int i31 = org.telegram.ui.ActionBar.i6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = ndVar.H;
            int i32 = org.telegram.ui.ActionBar.i6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i32, false));
            ndVar.H.setMaxLines(1);
            ndVar.H.setLines(1);
            ndVar.H.setEnabled(false);
            ndVar.H.setBackgroundDrawable(null);
            ndVar.H.setPadding(0, 0, 0, 0);
            ndVar.H.setSingleLine(true);
            ndVar.H.setInputType(163840);
            ndVar.H.setImeOptions(6);
            ndVar.N.addView(ndVar.H, w7.z5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            ndVar.f38932w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            ndVar.f38932w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i31, false));
            ndVar.f38932w.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i32, false));
            ndVar.f38932w.setMaxLines(1);
            ndVar.f38932w.setLines(1);
            ndVar.f38932w.setBackgroundDrawable(null);
            ndVar.f38932w.setPadding(0, 0, 0, 0);
            ndVar.f38932w.setSingleLine(true);
            ndVar.f38932w.setInputType(163872);
            ndVar.f38932w.setImeOptions(6);
            ndVar.f38932w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            ndVar.f38932w.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i32, false));
            ndVar.f38932w.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.f38932w.setCursorWidth(1.5f);
            ndVar.N.addView(ndVar.f38932w, w7.z5.n(-1, 36));
            ndVar.f38932w.addTextChangedListener(new m0(ndVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            ndVar.O = linearLayout7;
            linearLayout7.setOrientation(1);
            ndVar.M.addView(ndVar.O, w7.z5.n(-1, -2));
            org.telegram.ui.Components.j90 j90Var = new org.telegram.ui.Components.j90(context, ndVar, null, true, ChatObject.isChannel(ndVar.getMessagesController().getChat(Long.valueOf(j3))));
            ndVar.P = j90Var;
            j90Var.b(true);
            ndVar.P.d(0, null, false);
            ndVar.O.addView(ndVar.P);
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(ndVar, context, 3);
            ndVar.U = y1Var;
            y1Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
            ndVar.U.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.K6, false));
            ndVar.U.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.y1 y1Var2 = ndVar.U;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            y1Var2.setGravity(i12);
            ndVar.U.setVisibility(8);
            ndVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = ndVar.M;
            org.telegram.ui.Cells.y1 y1Var3 = ndVar.U;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout8.addView(y1Var3, w7.z5.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            ndVar.S = e9Var;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.i6.f20781b7;
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, i33, i34));
            ndVar.K.addView(ndVar.S, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            ndVar.f38914g0 = s4Var;
            ndVar.K.addView(s4Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            ndVar.L = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i30, false));
            ndVar.L.setOrientation(1);
            ndVar.K.addView(ndVar.L, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            ndVar.f38911e0 = e9Var2;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, i34));
            ndVar.K.addView(ndVar.f38911e0, w7.z5.n(-1, -2));
            ndVar.h0();
        }
        return ndVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.length() > 0) {
            this.U.setVisibility(0);
        } else {
            this.U.setVisibility(8);
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.Y;
        if (g6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g6Var);
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
                        int i11 = org.telegram.ui.ActionBar.i6.f21039p7;
                        y1Var.setTag(Integer.valueOf(i11));
                        this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.y1 y1Var2 = this.U;
                        int i12 = org.telegram.ui.ActionBar.i6.f21039p7;
                        y1Var2.setTag(Integer.valueOf(i12));
                        this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.y1 y1Var3 = this.U;
                int i13 = org.telegram.ui.ActionBar.i6.f21039p7;
                y1Var3.setTag(Integer.valueOf(i13));
                this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.y1 y1Var4 = this.U;
                int i14 = org.telegram.ui.ActionBar.i6.f21039p7;
                y1Var4.setTag(Integer.valueOf(i14));
                this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                return false;
            }
            this.U.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.y1 y1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.i6.F6;
            y1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
            this.X = str;
            org.telegram.ui.ActionBar.g6 g6Var2 = new org.telegram.ui.ActionBar.g6(20, this, str);
            this.Y = g6Var2;
            AndroidUtilities.runOnUIThread(g6Var2, 300L);
            return true;
        }
        this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.y1 y1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.i6.f21039p7;
        y1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f38930u0;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                    this.f38930u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            g0(false);
            this.f38926r0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.b2 b2Var2 = this.f38930u0;
            if (b2Var2 != null) {
                try {
                    b2Var2.dismiss();
                    this.f38930u0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f38917j0);
            Boolean bool = this.f38918k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f38919l0 != null || this.m0 != null || this.f38921n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f38919l0, this.m0, this.f38921n0, this.f38923p0, this.f38922o0, this.f38934x, this.f38935y, null);
            }
            nd ndVar = new nd(bundle);
            ndVar.f38929t0 = this.f38929t0;
            presentFragment(ndVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null && y40Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.y40 y40Var = this.v;
        if ((y40Var == null || dialog != y40Var.f33043c) && super.dismissDialogOnPause(dialog)) {
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
        AnimatorSet animatorSet = this.f38920n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f38920n.cancel();
            this.f38920n = null;
        }
        if (z11) {
            this.f38920n = new AnimatorSet();
            if (z10) {
                this.f38925r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f38920n;
                kd kdVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f38925r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f38920n;
                kd kdVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f38925r, property2, 0.0f));
            }
            this.f38920n.setDuration(180L);
            this.f38920n.addListener(new ai.n(27, this, z10));
            this.f38920n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f38925r.setAlpha(1.0f);
            this.f38925r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f38925r.setAlpha(0.0f);
            this.f38925r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        rg.k0 k0Var = new rg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f46163v0 = true;
        k0Var.H0 = new ed(this, 0);
        showDialog(k0Var);
    }

    public final void g0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f38931v0);
        }
        if (this.f38905b != null) {
            ValueAnimator valueAnimator = this.f38933w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f38905b.f30863c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f38933w0 = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 3));
            ValueAnimator valueAnimator2 = this.f38933w0;
            float f12 = this.f38905b.f30863c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f38933w0.setInterpolator(org.telegram.ui.Components.tr.f31140f);
            this.f38933w0.start();
        }
    }

    @Override
    public final yu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f38907c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20817d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.i6.f20761a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21099s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21154v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21118t8));
        org.telegram.ui.Components.mu muVar = this.f38907c;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(muVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.mu muVar2 = this.f38907c;
        int i12 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(muVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.mu muVar3 = this.f38907c;
        int i13 = org.telegram.ui.ActionBar.i6.f20946k6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(muVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.mu muVar4 = this.f38907c;
        int i14 = org.telegram.ui.ActionBar.i6.f20964l6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(muVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38932w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38932w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38932w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38932w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.i6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.b7 b7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.i6.f20781b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(b7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.i6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.V, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.G, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.y1 y1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.i6.f21039p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(y1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.i6.f21170w6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38911e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.i6.f20908i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38914g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20890h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.i6.f20873g7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.i6.f20891h7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.i6.f21223z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.i6.f21204y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.f21071r0, eVar, org.telegram.ui.ActionBar.i6.J7));
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
        if (!this.f38904a0 && !this.f38917j0) {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.S;
            int i17 = org.telegram.ui.ActionBar.i6.f21039p7;
            e9Var.setTag(Integer.valueOf(i17));
            this.S.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f38909d0) {
                this.f38914g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var2 = this.S;
                e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(e9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20781b7));
                this.f38911e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.e9 e9Var3 = this.S;
                e9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(e9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f20781b7));
                this.f38914g0.setVisibility(8);
                this.L.setVisibility(0);
                this.f38911e0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var4 = this.S;
            int i18 = org.telegram.ui.ActionBar.i6.B6;
            e9Var4.setTag(Integer.valueOf(i18));
            this.S.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i18, false));
            this.d.setVisibility(0);
            this.f38911e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.e9 e9Var5 = this.S;
            e9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(e9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20781b7));
            this.M.setVisibility(0);
            this.f38914g0.setVisibility(8);
            if (this.I) {
                org.telegram.ui.Cells.e9 e9Var6 = this.S;
                if (this.f38904a0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                e9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.m4 m4Var = this.V;
                if (this.f38904a0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.e9 e9Var7 = this.S;
                if (this.f38904a0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                e9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.m4 m4Var2 = this.V;
                if (this.f38904a0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                m4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.N;
            if (this.f38904a0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.O;
            if (this.f38904a0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.M;
            if (this.f38904a0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.j90 j90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38908c0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            j90Var.setLink(str);
            org.telegram.ui.Cells.y1 y1Var = this.U;
            if (!this.f38904a0 && y1Var.length() != 0) {
                i16 = 0;
            }
            y1Var.setVisibility(i16);
        }
        this.Q.a(!this.f38904a0);
        this.R.a(this.f38904a0);
        this.f38932w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f38932w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null) {
            y40Var.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.mu muVar = this.f38907c;
        if (muVar == null || !muVar.f28707e) {
            return true;
        }
        if (z10) {
            muVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f38915h0 == 1 && !this.f38906b0 && this.f38908c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j3 = this.f38916i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull != null) {
                this.f38908c0 = chatFull.exported_invite;
            }
            if (this.f38908c0 == null) {
                this.f38906b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new dd(this, 3));
            }
        }
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null) {
            y40Var.f33041a = this;
            y40Var.f33042b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f38928s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f38928s0.intValue(), true);
            this.f38928s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null) {
            y40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.mu muVar = this.f38907c;
        if (muVar != null) {
            muVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.mu muVar = this.f38907c;
        if (muVar != null) {
            muVar.r();
        }
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null) {
            y40Var.j();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null) {
            y40Var.k(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.mu muVar = this.f38907c;
        if (muVar != null) {
            muVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null) {
            y40Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f38915h0 != 1) {
            this.f38907c.requestFocus();
            org.telegram.ui.Components.hu huVar = this.f38907c.f28704a;
            huVar.requestFocus();
            AndroidUtilities.showKeyboard(huVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f38915h0 == 0) {
            org.telegram.ui.Components.y40 y40Var = this.v;
            if (y40Var != null) {
                y40Var.f33045f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.mu muVar = this.f38907c;
                if (muVar != null) {
                    muVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f38915h0 == 0) {
            org.telegram.ui.Components.y40 y40Var = this.v;
            if (y40Var != null && (str = y40Var.f33045f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.mu muVar = this.f38907c;
            if (muVar != null) {
                String obj = muVar.getText().toString();
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
    public final void N() {
    }
}
