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
public final class md extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.l4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.vj0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.q90 P;
    public org.telegram.ui.Cells.i6 Q;
    public org.telegram.ui.Cells.i6 R;
    public org.telegram.ui.Cells.d9 S;
    public TextView T;
    public org.telegram.ui.Cells.y1 U;
    public org.telegram.ui.Cells.l4 V;
    public int W;
    public String X;
    public i0 Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.u0 f39178a;
    public boolean f39179a0;
    public org.telegram.ui.Components.as f39180b;
    public boolean f39181b0;
    public org.telegram.ui.Components.qu f39182c;
    public TLRPC.TL_chatInviteExported f39183c0;
    public org.telegram.ui.Cells.z6 d;
    public boolean f39184d0;
    public ci.k4 e;
    public org.telegram.ui.Cells.d9 f39185e0;
    public ei.g6 f39186f;
    public final ArrayList f39187f0;
    public org.telegram.ui.Cells.r4 f39188g0;
    public jd h;
    public final int f39189h0;
    public final long f39190i0;
    public boolean f39191j0;
    public final Boolean f39192k0;
    public TLRPC.InputFile f39193l0;
    public TLRPC.InputFile m0;
    public AnimatorSet f39194n;
    public TLRPC.VideoSize f39195n0;
    public String f39196o0;
    public double f39197p0;
    public boolean f39198q0;
    public kd f39199r;
    public boolean f39200r0;
    public final org.telegram.ui.Components.h9 f39201s;
    public Integer f39202s0;
    public Utilities.Callback2 f39203t0;
    public org.telegram.ui.ActionBar.b2 f39204u0;
    public final org.telegram.ui.Components.e50 v;
    public final dd f39205v0;
    public EditTextBoldCursor f39206w;
    public ValueAnimator f39207w0;
    public TLRPC.FileLocation f39208x;
    public TLRPC.FileLocation f39209y;

    public md(Bundle bundle) {
        super(bundle);
        this.f39187f0 = new ArrayList();
        this.f39191j0 = true;
        this.f39205v0 = new dd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f39189h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f39192k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f39201s = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            this.v = new org.telegram.ui.Components.e50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new cd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f39191j0 = z10;
            this.f39179a0 = !z10;
            if (!z10 && !this.f39184d0) {
                this.f39184d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new cd(this, 0));
            }
        }
        this.f39190i0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(md mdVar, org.telegram.ui.ActionBar.b2 b2Var) {
        mdVar.f39200r0 = false;
        mdVar.f39198q0 = false;
        if (mdVar.f39202s0 != null) {
            ConnectionsManager.getInstance(mdVar.currentAccount).cancelRequest(mdVar.f39202s0.intValue(), true);
            mdVar.f39202s0 = null;
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
        tL_channels_checkUsername.channel = MessagesController.getInstance(mdVar.currentAccount).getInputChannel(mdVar.f39190i0);
        mdVar.W = ConnectionsManager.getInstance(mdVar.currentAccount).sendRequest(tL_channels_checkUsername, new ca(mdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(md mdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
        b2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.w0(10, mdVar, currentChannel));
        mdVar.showDialog(b2Var);
    }

    public static void Y(md mdVar) {
        if (mdVar.f39204u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new b1(mdVar, 12));
        mdVar.f39204u0 = alertDialog$Builder.o();
    }

    @Override
    public final void E(float f7) {
        kd kdVar = this.f39199r;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        kd kdVar = this.f39199r;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
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
        org.telegram.ui.Components.qu quVar = mdVar.f39182c;
        if (quVar != null) {
            quVar.o();
        }
        mdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        mdVar.actionBar.setAllowOverlayTitle(true);
        mdVar.actionBar.setActionBarMenuOnItemClick(new hd(mdVar));
        org.telegram.ui.ActionBar.y n10 = mdVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.h6.f21325v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(mutate, new org.telegram.ui.Components.dq(org.telegram.ui.ActionBar.h6.x0(null, i21, false)));
        mdVar.f39180b = asVar;
        mdVar.f39178a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), asVar);
        int i22 = mdVar.f39189h0;
        if (i22 == 0) {
            mdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            id idVar = new id(0, context, mdVar);
            idVar.setOnTouchListener(new di.d(2));
            mdVar.fragmentView = idVar;
            int i23 = org.telegram.ui.ActionBar.h6.f20990d6;
            idVar.setTag(Integer.valueOf(i23));
            mdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            mdVar.K = linearLayout;
            linearLayout.setOrientation(1);
            idVar.addView(mdVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            mdVar.K.addView(frameLayout, w7.z5.n(-1, -2));
            ci.k4 k4Var = new ci.k4(mdVar, context, 5);
            mdVar.e = k4Var;
            k4Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.h9 h9Var = mdVar.f39201s;
            h9Var.n(5L, null, null);
            mdVar.e.setImageDrawable(h9Var);
            ci.k4 k4Var2 = mdVar.e;
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
            frameLayout.addView(k4Var2, w7.z5.d(64, 64.0f, i24, f7, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ei.g6 g6Var = new ei.g6(mdVar, context, paint, 2);
            mdVar.f39186f = g6Var;
            g6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ei.g6 g6Var2 = mdVar.f39186f;
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
            frameLayout.addView(g6Var2, w7.z5.d(64, 64.0f, i25, f11, 12.0f, f12, 12.0f));
            mdVar.f39186f.setOnClickListener(new ed(mdVar, 1));
            mdVar.J = new org.telegram.ui.Components.vj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
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
            frameLayout.addView(jdVar2, w7.z5.d(64, 64.0f, i26, f13, 12.0f, f14, 12.0f));
            kd kdVar = new kd(mdVar, context, 0);
            mdVar.f39199r = kdVar;
            kdVar.setSize(AndroidUtilities.dp(30.0f));
            mdVar.f39199r.setProgressColor(-1);
            mdVar.f39199r.setNoProgress(false);
            kd kdVar2 = mdVar.f39199r;
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
            frameLayout.addView(kdVar2, w7.z5.d(64, 64.0f, i27, f15, 12.0f, f16, 12.0f));
            mdVar.e0(false, false);
            org.telegram.ui.Components.qu quVar2 = new org.telegram.ui.Components.qu(context, idVar, this, 0, false, null);
            mdVar = this;
            mdVar.f39182c = quVar2;
            quVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = mdVar.E;
            if (str != null) {
                mdVar.f39182c.setText(str);
                mdVar.E = null;
            }
            mdVar.f39182c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            mdVar.f39182c.getEditText().setSingleLine(true);
            mdVar.f39182c.getEditText().setImeOptions(5);
            mdVar.f39182c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) {
                public final md f36970b;

                {
                    this.f36970b = mdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            md mdVar2 = this.f36970b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(mdVar2.f39182c.getEditText().getText())) {
                                    mdVar2.f39206w.requestFocus();
                                    return true;
                                }
                            } else {
                                mdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (u0Var = this.f36970b.f39178a) != null) {
                                u0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.qu quVar3 = mdVar.f39182c;
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
            frameLayout.addView(quVar3, w7.z5.d(-1, -2.0f, 16, f17, 0.0f, f18, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            mdVar.f39206w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            mdVar.f39206w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = mdVar.f39206w;
            int i28 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i28, false));
            mdVar.f39206w.setBackgroundDrawable(null);
            mdVar.f39206w.setLineColors(mdVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21117k6), mdVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21134l6), mdVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21211p7));
            mdVar.f39206w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = mdVar.f39206w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            mdVar.f39206w.setInputType(180225);
            mdVar.f39206w.setImeOptions(6);
            mdVar.f39206w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            mdVar.f39206w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            mdVar.f39206w.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i28, false));
            mdVar.f39206w.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.f39206w.setCursorWidth(1.5f);
            mdVar.K.addView(mdVar.f39206w, w7.z5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            mdVar.f39206w.setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) {
                public final md f36970b;

                {
                    this.f36970b = mdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            md mdVar2 = this.f36970b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(mdVar2.f39182c.getEditText().getText())) {
                                    mdVar2.f39206w.requestFocus();
                                    return true;
                                }
                            } else {
                                mdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (u0Var = this.f36970b.f39178a) != null) {
                                u0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            mdVar.f39206w.addTextChangedListener(new ld(0));
            TextView textView = new TextView(context);
            mdVar.T = textView;
            textView.setTextSize(1, 15.0f);
            mdVar.T.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F6, false));
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
            linearLayout2.addView(textView3, w7.z5.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            mdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            mdVar.K = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(mdVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = mdVar.getMessagesController();
            long j10 = mdVar.f39190i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
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
            int i29 = org.telegram.ui.ActionBar.h6.f20932a7;
            view.setTag(Integer.valueOf(i29));
            mdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i29, false));
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
            mdVar.G = l4Var;
            l4Var.setHeight(46);
            org.telegram.ui.Cells.l4 l4Var2 = mdVar.G;
            int i30 = org.telegram.ui.ActionBar.h6.f20990d6;
            l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i30, false));
            org.telegram.ui.Cells.l4 l4Var3 = mdVar.G;
            if (mdVar.I) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            l4Var3.setText(LocaleController.getString(i11));
            mdVar.K.addView(mdVar.G);
            LinearLayout linearLayout4 = new LinearLayout(context);
            mdVar.F = linearLayout4;
            linearLayout4.setOrientation(1);
            mdVar.F.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i30, false));
            mdVar.K.addView(mdVar.F, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
            mdVar.Q = i6Var;
            i6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
            Boolean bool = mdVar.f39192k0;
            if (bool != null && !bool.booleanValue()) {
                mdVar.f39179a0 = true;
            }
            if (mdVar.I) {
                mdVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !mdVar.f39179a0);
            } else {
                mdVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !mdVar.f39179a0);
            }
            mdVar.Q.setOnClickListener(new ed(mdVar, 2));
            if (bool == null || bool.booleanValue()) {
                mdVar.F.addView(mdVar.Q, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
            mdVar.R = i6Var2;
            i6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
            if (bool != null && bool.booleanValue()) {
                mdVar.f39179a0 = false;
            }
            if (mdVar.I) {
                mdVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, mdVar.f39179a0);
            } else {
                mdVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, mdVar.f39179a0);
            }
            mdVar.R.setOnClickListener(new ed(mdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                mdVar.F.addView(mdVar.R, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
            mdVar.d = z6Var;
            mdVar.K.addView(z6Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            mdVar.M = linearLayout5;
            linearLayout5.setOrientation(1);
            mdVar.M.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i30, false));
            mdVar.K.addView(mdVar.M, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.l4 l4Var4 = new org.telegram.ui.Cells.l4(context);
            mdVar.V = l4Var4;
            mdVar.M.addView(l4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            mdVar.N = linearLayout6;
            linearLayout6.setOrientation(0);
            mdVar.M.addView(mdVar.N, w7.z5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            mdVar.H = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/");
            mdVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = mdVar.H;
            int i31 = org.telegram.ui.ActionBar.h6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = mdVar.H;
            int i32 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i32, false));
            mdVar.H.setMaxLines(1);
            mdVar.H.setLines(1);
            mdVar.H.setEnabled(false);
            mdVar.H.setBackgroundDrawable(null);
            mdVar.H.setPadding(0, 0, 0, 0);
            mdVar.H.setSingleLine(true);
            mdVar.H.setInputType(163840);
            mdVar.H.setImeOptions(6);
            mdVar.N.addView(mdVar.H, w7.z5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            mdVar.f39206w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            mdVar.f39206w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i31, false));
            mdVar.f39206w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i32, false));
            mdVar.f39206w.setMaxLines(1);
            mdVar.f39206w.setLines(1);
            mdVar.f39206w.setBackgroundDrawable(null);
            mdVar.f39206w.setPadding(0, 0, 0, 0);
            mdVar.f39206w.setSingleLine(true);
            mdVar.f39206w.setInputType(163872);
            mdVar.f39206w.setImeOptions(6);
            mdVar.f39206w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            mdVar.f39206w.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i32, false));
            mdVar.f39206w.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.f39206w.setCursorWidth(1.5f);
            mdVar.N.addView(mdVar.f39206w, w7.z5.n(-1, 36));
            mdVar.f39206w.addTextChangedListener(new o0(mdVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            mdVar.O = linearLayout7;
            linearLayout7.setOrientation(1);
            mdVar.M.addView(mdVar.O, w7.z5.n(-1, -2));
            org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(context, mdVar, null, true, ChatObject.isChannel(mdVar.getMessagesController().getChat(Long.valueOf(j10))));
            mdVar.P = q90Var;
            q90Var.b(true);
            mdVar.P.d(0, null, false);
            mdVar.O.addView(mdVar.P);
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(mdVar, context, 3);
            mdVar.U = y1Var;
            y1Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
            mdVar.U.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.K6, false));
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
            linearLayout8.addView(y1Var3, w7.z5.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            mdVar.S = d9Var;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.h6.f20952b7;
            d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i33, i34));
            mdVar.K.addView(mdVar.S, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
            mdVar.f39188g0 = r4Var;
            mdVar.K.addView(r4Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            mdVar.L = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i30, false));
            mdVar.L.setOrientation(1);
            mdVar.K.addView(mdVar.L, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            mdVar.f39185e0 = d9Var2;
            d9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i34));
            mdVar.K.addView(mdVar.f39185e0, w7.z5.n(-1, -2));
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
        i0 i0Var = this.Y;
        if (i0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i0Var);
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
                        int i11 = org.telegram.ui.ActionBar.h6.f21211p7;
                        y1Var.setTag(Integer.valueOf(i11));
                        this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.y1 y1Var2 = this.U;
                        int i12 = org.telegram.ui.ActionBar.h6.f21211p7;
                        y1Var2.setTag(Integer.valueOf(i12));
                        this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.y1 y1Var3 = this.U;
                int i13 = org.telegram.ui.ActionBar.h6.f21211p7;
                y1Var3.setTag(Integer.valueOf(i13));
                this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.y1 y1Var4 = this.U;
                int i14 = org.telegram.ui.ActionBar.h6.f21211p7;
                y1Var4.setTag(Integer.valueOf(i14));
                this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
                return false;
            }
            this.U.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.y1 y1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.h6.F6;
            y1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            this.X = str;
            i0 i0Var2 = new i0(18, this, str);
            this.Y = i0Var2;
            AndroidUtilities.runOnUIThread(i0Var2, 300L);
            return true;
        }
        this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.y1 y1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.h6.f21211p7;
        y1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f39204u0;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                    this.f39204u0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.f39200r0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.b2 b2Var2 = this.f39204u0;
            if (b2Var2 != null) {
                try {
                    b2Var2.dismiss();
                    this.f39204u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f39191j0);
            Boolean bool = this.f39192k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f39193l0 != null || this.m0 != null || this.f39195n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f39193l0, this.m0, this.f39195n0, this.f39197p0, this.f39196o0, this.f39208x, this.f39209y, null);
            }
            md mdVar = new md(bundle);
            mdVar.f39203t0 = this.f39203t0;
            presentFragment(mdVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null && e50Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if ((e50Var == null || dialog != e50Var.f25722c) && super.dismissDialogOnPause(dialog)) {
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
        AnimatorSet animatorSet = this.f39194n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f39194n.cancel();
            this.f39194n = null;
        }
        if (z11) {
            this.f39194n = new AnimatorSet();
            if (z10) {
                this.f39199r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f39194n;
                jd jdVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(jdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f39199r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39194n;
                jd jdVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(jdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f39199r, property2, 0.0f));
            }
            this.f39194n.setDuration(180L);
            this.f39194n.addListener(new ah.p0(28, this, z10));
            this.f39194n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f39199r.setAlpha(1.0f);
            this.f39199r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f39199r.setAlpha(0.0f);
            this.f39199r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        sg.k0 k0Var = new sg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f46306v0 = true;
        k0Var.H0 = new dd(this, 0);
        showDialog(k0Var);
    }

    public final void g0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f39205v0);
        }
        if (this.f39180b != null) {
            ValueAnimator valueAnimator = this.f39207w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f39180b.f24707c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39207w0 = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 4));
            ValueAnimator valueAnimator2 = this.f39207w0;
            float f12 = this.f39180b.f24707c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f39207w0.setInterpolator(org.telegram.ui.Components.bs.f25021f);
            this.f39207w0.start();
        }
    }

    @Override
    public final ju0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f39182c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20990d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.f20932a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21269s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21325v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21288t8));
        org.telegram.ui.Components.qu quVar = this.f39182c;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.qu quVar2 = this.f39182c;
        int i12 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.qu quVar3 = this.f39182c;
        int i13 = org.telegram.ui.ActionBar.h6.f21117k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.qu quVar4 = this.f39182c;
        int i14 = org.telegram.ui.ActionBar.h6.f21134l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39206w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39206w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39206w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39206w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.h6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.z6 z6Var = this.d;
        int i16 = org.telegram.ui.ActionBar.h6.f20952b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(z6Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.y1 y1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.h6.f21211p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(y1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.h6.f21342w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39185e0, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.h6.f21079i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39188g0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21062h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.h6.f21044g7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.h6.f21063h7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.h6.f21395z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.h6.f21378y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f21241r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
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
        if (!this.f39179a0 && !this.f39191j0) {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.d9 d9Var = this.S;
            int i17 = org.telegram.ui.ActionBar.h6.f21211p7;
            d9Var.setTag(Integer.valueOf(i17));
            this.S.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f39184d0) {
                this.f39188g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.d9 d9Var2 = this.S;
                d9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(d9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20952b7));
                this.f39185e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.d9 d9Var3 = this.S;
                d9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(d9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20952b7));
                this.f39188g0.setVisibility(8);
                this.L.setVisibility(0);
                this.f39185e0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.d9 d9Var4 = this.S;
            int i18 = org.telegram.ui.ActionBar.h6.B6;
            d9Var4.setTag(Integer.valueOf(i18));
            this.S.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
            this.d.setVisibility(0);
            this.f39185e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.d9 d9Var5 = this.S;
            d9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(d9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20952b7));
            this.M.setVisibility(0);
            this.f39188g0.setVisibility(8);
            if (this.I) {
                org.telegram.ui.Cells.d9 d9Var6 = this.S;
                if (this.f39179a0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                d9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.l4 l4Var = this.V;
                if (this.f39179a0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                l4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.d9 d9Var7 = this.S;
                if (this.f39179a0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                d9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.l4 l4Var2 = this.V;
                if (this.f39179a0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                l4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.N;
            if (this.f39179a0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.O;
            if (this.f39179a0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.M;
            if (this.f39179a0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.q90 q90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f39183c0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            q90Var.setLink(str);
            org.telegram.ui.Cells.y1 y1Var = this.U;
            if (!this.f39179a0 && y1Var.length() != 0) {
                i16 = 0;
            }
            y1Var.setVisibility(i16);
        }
        this.Q.a(!this.f39179a0);
        this.R.a(this.f39179a0);
        this.f39206w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f39206w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.qu quVar = this.f39182c;
        if (quVar == null || !quVar.e) {
            return true;
        }
        if (z10) {
            quVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f39189h0 == 1 && !this.f39181b0 && this.f39183c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f39190i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.f39183c0 = chatFull.exported_invite;
            }
            if (this.f39183c0 == null) {
                this.f39181b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new cd(this, 3));
            }
        }
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.f25720a = this;
            e50Var.f25721b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f39202s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39202s0.intValue(), true);
            this.f39202s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.d();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.qu quVar = this.f39182c;
        if (quVar != null) {
            quVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.qu quVar = this.f39182c;
        if (quVar != null) {
            quVar.r();
        }
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.j(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.qu quVar = this.f39182c;
        if (quVar != null) {
            quVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.k();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f39189h0 != 1) {
            this.f39182c.requestFocus();
            org.telegram.ui.Components.lu luVar = this.f39182c.f29710a;
            luVar.requestFocus();
            AndroidUtilities.showKeyboard(luVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f39189h0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.v;
            if (e50Var != null) {
                e50Var.f25723f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.qu quVar = this.f39182c;
                if (quVar != null) {
                    quVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f39189h0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.v;
            if (e50Var != null && (str = e50Var.f25723f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.qu quVar = this.f39182c;
            if (quVar != null) {
                String obj = quVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void P() {
    }
}
