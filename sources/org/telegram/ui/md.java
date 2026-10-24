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
import java.util.HashSet;
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
import org.telegram.ui.Components.RadialProgressView;
public final class md extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.b50 {
    public TLRPC.FileLocation E;
    public String F;
    public LinearLayout G;
    public org.telegram.ui.Cells.l4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public org.telegram.ui.Components.xj0 K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public org.telegram.ui.Components.p90 Q;
    public org.telegram.ui.Cells.j6 R;
    public org.telegram.ui.Cells.j6 S;
    public org.telegram.ui.Cells.e9 T;
    public TextView U;
    public org.telegram.ui.Cells.x1 V;
    public org.telegram.ui.Cells.l4 W;
    public int X;
    public String Y;
    public h0 Z;
    public org.telegram.ui.ActionBar.u0 f39534a;
    public boolean f39535a0;
    public org.telegram.ui.Components.yr f39536b;
    public boolean f39537b0;
    public org.telegram.ui.Components.cq f39538c;
    public boolean f39539c0;
    public org.telegram.ui.Components.ou d;
    public TLRPC.TL_chatInviteExported f39540d0;
    public org.telegram.ui.Cells.b7 e;
    public boolean f39541e0;
    public ci.j4 f39542f;
    public org.telegram.ui.Cells.e9 f39543f0;
    public final ArrayList f39544g0;
    public ei.g6 h;
    public org.telegram.ui.Cells.r4 f39545h0;
    public final int f39546i0;
    public final long f39547j0;
    public boolean f39548k0;
    public final Boolean f39549l0;
    public TLRPC.InputFile m0;
    public jd f39550n;
    public TLRPC.InputFile f39551n0;
    public TLRPC.VideoSize f39552o0;
    public String f39553p0;
    public double f39554q0;
    public AnimatorSet f39555r;
    public boolean f39556r0;
    public kd f39557s;
    public boolean f39558s0;
    public Integer f39559t0;
    public Utilities.Callback2 f39560u0;
    public final org.telegram.ui.Components.f9 v;
    public org.telegram.ui.ActionBar.c2 f39561v0;
    public final org.telegram.ui.Components.c50 f39562w;
    public final cd f39563w0;
    public EditTextBoldCursor f39564x;
    public ValueAnimator f39565x0;
    public TLRPC.FileLocation f39566y;
    public int f39567y0;

    public md(Bundle bundle) {
        super(bundle);
        this.f39544g0 = new ArrayList();
        this.f39548k0 = true;
        this.f39563w0 = new cd(this, 0);
        int i10 = bundle.getInt("step", 0);
        this.f39546i0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f39549l0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.v = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
            this.f39562w = new org.telegram.ui.Components.c50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new dd(this, 1));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f39548k0 = z10;
            this.f39537b0 = !z10;
            if (!z10 && !this.f39541e0) {
                this.f39541e0 = true;
                i0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new dd(this, 0));
            }
        }
        this.f39547j0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(md mdVar, org.telegram.ui.ActionBar.c2 c2Var) {
        mdVar.f39558s0 = false;
        mdVar.f39556r0 = false;
        if (mdVar.f39559t0 != null) {
            ConnectionsManager.getInstance(mdVar.currentAccount).cancelRequest(mdVar.f39559t0.intValue(), true);
            mdVar.f39559t0 = null;
        }
        mdVar.h0(false);
        c2Var.dismiss();
    }

    public static void V(md mdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(mdVar.currentAccount).sendRequest(tL_channels_updateUsername, new dd(mdVar, 2), 64);
    }

    public static void W(md mdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(mdVar.currentAccount).getInputChannel(mdVar.f39547j0);
        mdVar.X = ConnectionsManager.getInstance(mdVar.currentAccount).sendRequest(tL_channels_checkUsername, new ca(mdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(md mdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.w0(10, mdVar, currentChannel));
        mdVar.showDialog(c2Var);
    }

    public static void Y(md mdVar) {
        if (mdVar.f39561v0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mdVar.getParentActivity());
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new a1(mdVar, 12));
        mdVar.f39561v0 = alertDialog$Builder.p();
    }

    @Override
    public final void E(float f7) {
        kd kdVar = this.f39557s;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        kd kdVar = this.f39557s;
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
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21572y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21257h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21238g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        float f10;
        int i16;
        float f11;
        float f12;
        int i17;
        float f13;
        float f14;
        int i18;
        float f15;
        float f16;
        float f17;
        float f18;
        int i19;
        int i20;
        int i21;
        md mdVar = this;
        org.telegram.ui.Components.ou ouVar = mdVar.d;
        if (ouVar != null) {
            ouVar.o();
        }
        mdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        mdVar.actionBar.setAllowOverlayTitle(true);
        mdVar.actionBar.setActionBarMenuOnItemClick(new hd(mdVar));
        org.telegram.ui.ActionBar.y m10 = mdVar.actionBar.m();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i22 = org.telegram.ui.ActionBar.k6.f21519v8;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i22, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(org.telegram.ui.ActionBar.k6.x0(null, i22, false));
        mdVar.f39538c = cqVar;
        org.telegram.ui.Components.yr yrVar = new org.telegram.ui.Components.yr(mutate, cqVar);
        mdVar.f39536b = yrVar;
        org.telegram.ui.ActionBar.u0 i23 = m10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), yrVar);
        mdVar.f39534a = i23;
        org.telegram.ui.ActionBar.r6.z(i23, mutate, i22, null, mode);
        int i24 = mdVar.f39546i0;
        if (i24 == 0) {
            mdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            id idVar = new id(0, context, mdVar);
            idVar.setOnTouchListener(new di.d(2));
            mdVar.fragmentView = idVar;
            int i25 = org.telegram.ui.ActionBar.k6.f21184d6;
            idVar.setTag(Integer.valueOf(i25));
            org.telegram.ui.ActionBar.r6.i(i25, mdVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            mdVar.L = linearLayout;
            linearLayout.setOrientation(1);
            idVar.addView(mdVar.L, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            mdVar.L.addView(frameLayout, w7.z5.n(-1, -2));
            ci.j4 j4Var = new ci.j4(mdVar, context, 5);
            mdVar.f39542f = j4Var;
            j4Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.f9 f9Var = mdVar.v;
            f9Var.n(5L, null, null);
            mdVar.f39542f.setImageDrawable(f9Var);
            ci.j4 j4Var2 = mdVar.f39542f;
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i26 = i15 | 48;
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
            frameLayout.addView(j4Var2, w7.z5.d(64, 64.0f, i26, f7, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ei.g6 g6Var = new ei.g6(mdVar, context, paint, 2);
            mdVar.h = g6Var;
            g6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ei.g6 g6Var2 = mdVar.h;
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i27 = i16 | 48;
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
            frameLayout.addView(g6Var2, w7.z5.d(64, 64.0f, i27, f11, 12.0f, f12, 12.0f));
            mdVar.h.setOnClickListener(new ed(mdVar, 1));
            mdVar.K = new org.telegram.ui.Components.xj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            jd jdVar = new jd(mdVar, context, 0);
            mdVar.f39550n = jdVar;
            jdVar.setScaleType(ImageView.ScaleType.CENTER);
            mdVar.f39550n.setAnimation(mdVar.K);
            mdVar.f39550n.setEnabled(false);
            mdVar.f39550n.setClickable(false);
            mdVar.f39550n.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            jd jdVar2 = mdVar.f39550n;
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i28 = i17 | 48;
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
            frameLayout.addView(jdVar2, w7.z5.d(64, 64.0f, i28, f13, 12.0f, f14, 12.0f));
            kd kdVar = new kd(mdVar, context, 0);
            mdVar.f39557s = kdVar;
            kdVar.setSize(AndroidUtilities.dp(30.0f));
            mdVar.f39557s.setProgressColor(-1);
            mdVar.f39557s.setNoProgress(false);
            kd kdVar2 = mdVar.f39557s;
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i29 = i18 | 48;
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
            frameLayout.addView(kdVar2, w7.z5.d(64, 64.0f, i29, f15, 12.0f, f16, 12.0f));
            mdVar.f0(false, false);
            org.telegram.ui.Components.ou ouVar2 = new org.telegram.ui.Components.ou(context, idVar, this, 0, false, null);
            mdVar = this;
            mdVar.d = ouVar2;
            ouVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = mdVar.F;
            if (str != null) {
                mdVar.d.setText(str);
                mdVar.F = null;
            }
            mdVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            mdVar.d.getEditText().setSingleLine(true);
            mdVar.d.getEditText().setImeOptions(5);
            mdVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) {
                public final md f37304b;

                {
                    this.f37304b = mdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i30, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            md mdVar2 = this.f37304b;
                            if (i30 == 5) {
                                if (!TextUtils.isEmpty(mdVar2.d.getEditText().getText())) {
                                    mdVar2.f39564x.requestFocus();
                                    return true;
                                }
                            } else {
                                mdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i30 == 6 && (u0Var = this.f37304b.f39534a) != null) {
                                u0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.ou ouVar3 = mdVar.d;
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
            frameLayout.addView(ouVar3, w7.z5.d(-1, -2.0f, 16, f17, 0.0f, f18, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            mdVar.f39564x = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.F(mdVar.f39564x, org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = mdVar.f39564x;
            int i30 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor2, i30, null);
            mdVar.f39564x.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.H(mdVar.f39564x, org.telegram.ui.ActionBar.k6.f21311k6, org.telegram.ui.ActionBar.k6.f21328l6, org.telegram.ui.ActionBar.k6.f21405p7, mdVar.getResourceProvider());
            mdVar.f39564x.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = mdVar.f39564x;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            editTextBoldCursor3.setGravity(i19);
            mdVar.f39564x.setInputType(180225);
            mdVar.f39564x.setImeOptions(6);
            mdVar.f39564x.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            mdVar.f39564x.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            org.telegram.ui.ActionBar.r6.x(mdVar.f39564x, i30, null);
            mdVar.f39564x.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.f39564x.setCursorWidth(1.5f);
            mdVar.L.addView(mdVar.f39564x, w7.z5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            mdVar.f39564x.setOnEditorActionListener(new TextView.OnEditorActionListener(mdVar) {
                public final md f37304b;

                {
                    this.f37304b = mdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i302, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            md mdVar2 = this.f37304b;
                            if (i302 == 5) {
                                if (!TextUtils.isEmpty(mdVar2.d.getEditText().getText())) {
                                    mdVar2.f39564x.requestFocus();
                                    return true;
                                }
                            } else {
                                mdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i302 == 6 && (u0Var = this.f37304b.f39534a) != null) {
                                u0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            mdVar.f39564x.addTextChangedListener(new ld(0));
            TextView textView = new TextView(context);
            mdVar.U = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.W(mdVar.U, org.telegram.ui.ActionBar.k6.F6, null);
            TextView textView2 = mdVar.U;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            textView2.setGravity(i20);
            mdVar.U.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = mdVar.L;
            TextView textView3 = mdVar.U;
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            linearLayout2.addView(textView3, w7.z5.t(-2, -2, i21, 24, 10, 24, 20));
        } else if (i24 == 1) {
            ScrollView scrollView = new ScrollView(context);
            mdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            mdVar.L = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(mdVar.L, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = mdVar.getMessagesController();
            long j10 = mdVar.f39547j0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z10 = true;
            } else {
                z10 = false;
            }
            mdVar.J = z10;
            org.telegram.ui.ActionBar.k kVar = mdVar.actionBar;
            if (z10) {
                i10 = R.string.GroupSettingsTitle;
            } else {
                i10 = R.string.ChannelSettingsTitle;
            }
            kVar.setTitle(LocaleController.getString(i10));
            View view = mdVar.fragmentView;
            int i31 = org.telegram.ui.ActionBar.k6.f21126a7;
            view.setTag(Integer.valueOf(i31));
            org.telegram.ui.ActionBar.r6.i(i31, mdVar.fragmentView, null);
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
            mdVar.H = l4Var;
            l4Var.setHeight(46);
            org.telegram.ui.Cells.l4 l4Var2 = mdVar.H;
            int i32 = org.telegram.ui.ActionBar.k6.f21184d6;
            org.telegram.ui.ActionBar.r6.i(i32, l4Var2, null);
            org.telegram.ui.Cells.l4 l4Var3 = mdVar.H;
            if (mdVar.J) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            l4Var3.setText(LocaleController.getString(i11));
            mdVar.L.addView(mdVar.H);
            LinearLayout linearLayout4 = new LinearLayout(context);
            mdVar.G = linearLayout4;
            linearLayout4.setOrientation(1);
            org.telegram.ui.ActionBar.r6.i(i32, mdVar.G, null);
            mdVar.L.addView(mdVar.G, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
            mdVar.R = j6Var;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(false);
            int i33 = org.telegram.ui.ActionBar.k6.f21273i6;
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i33);
            j6Var.setBackground(M0);
            org.telegram.ui.ActionBar.r6.k(j6Var, M0, null, O, null);
            Boolean bool = mdVar.f39549l0;
            if (bool != null && !bool.booleanValue()) {
                mdVar.f39537b0 = true;
            }
            if (mdVar.J) {
                i12 = 1;
                mdVar.R.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !mdVar.f39537b0);
            } else {
                i12 = 1;
                mdVar.R.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !mdVar.f39537b0);
            }
            mdVar.R.setOnClickListener(new ed(mdVar, 2));
            if (bool == null || bool.booleanValue()) {
                mdVar.G.addView(mdVar.R, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
            mdVar.S = j6Var2;
            org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.k6.M0(false);
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i33);
            j6Var2.setBackground(M02);
            org.telegram.ui.ActionBar.r6.k(j6Var2, M02, null, O2, null);
            if (bool != null && bool.booleanValue()) {
                mdVar.f39537b0 = false;
            }
            if (mdVar.J) {
                mdVar.S.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, mdVar.f39537b0);
            } else {
                mdVar.S.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, mdVar.f39537b0);
            }
            mdVar.S.setOnClickListener(new ed(mdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                mdVar.G.addView(mdVar.S, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
            mdVar.e = b7Var;
            mdVar.L.addView(b7Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            mdVar.N = linearLayout5;
            linearLayout5.setOrientation(i12);
            org.telegram.ui.ActionBar.r6.i(i32, mdVar.N, null);
            mdVar.L.addView(mdVar.N, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.l4 l4Var4 = new org.telegram.ui.Cells.l4(context);
            mdVar.W = l4Var4;
            mdVar.N.addView(l4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            mdVar.O = linearLayout6;
            linearLayout6.setOrientation(0);
            mdVar.N.addView(mdVar.O, w7.z5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            mdVar.I = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(mdVar.currentAccount).linkPrefix + "/");
            mdVar.I.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = mdVar.I;
            int i34 = org.telegram.ui.ActionBar.k6.H6;
            org.telegram.ui.ActionBar.r6.F(editTextBoldCursor5, i34, null);
            EditTextBoldCursor editTextBoldCursor6 = mdVar.I;
            int i35 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor6, i35, null);
            mdVar.I.setMaxLines(1);
            mdVar.I.setLines(1);
            mdVar.I.setEnabled(false);
            mdVar.I.setBackgroundDrawable(null);
            mdVar.I.setPadding(0, 0, 0, 0);
            mdVar.I.setSingleLine(true);
            mdVar.I.setInputType(163840);
            mdVar.I.setImeOptions(6);
            mdVar.O.addView(mdVar.I, w7.z5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            mdVar.f39564x = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.F(mdVar.f39564x, i34, null);
            org.telegram.ui.ActionBar.r6.W(mdVar.f39564x, i35, null);
            mdVar.f39564x.setMaxLines(1);
            mdVar.f39564x.setLines(1);
            mdVar.f39564x.setBackgroundDrawable(null);
            mdVar.f39564x.setPadding(0, 0, 0, 0);
            mdVar.f39564x.setSingleLine(true);
            mdVar.f39564x.setInputType(163872);
            mdVar.f39564x.setImeOptions(6);
            mdVar.f39564x.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            org.telegram.ui.ActionBar.r6.x(mdVar.f39564x, i35, null);
            mdVar.f39564x.setCursorSize(AndroidUtilities.dp(20.0f));
            mdVar.f39564x.setCursorWidth(1.5f);
            mdVar.O.addView(mdVar.f39564x, w7.z5.n(-1, 36));
            mdVar.f39564x.addTextChangedListener(new n0(mdVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            mdVar.P = linearLayout7;
            linearLayout7.setOrientation(1);
            mdVar.N.addView(mdVar.P, w7.z5.n(-1, -2));
            org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(context, mdVar, null, true, ChatObject.isChannel(mdVar.getMessagesController().getChat(Long.valueOf(j10))));
            mdVar.Q = p90Var;
            p90Var.b(true);
            mdVar.Q.d(0, null, false);
            mdVar.P.addView(mdVar.Q);
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(mdVar, context, 3);
            mdVar.V = x1Var;
            org.telegram.ui.ActionBar.r6.I(x1Var, org.telegram.ui.ActionBar.k6.J6, null);
            org.telegram.ui.ActionBar.r6.E(mdVar.V, org.telegram.ui.ActionBar.k6.K6, null);
            mdVar.V.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.x1 x1Var2 = mdVar.V;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            x1Var2.setGravity(i13);
            mdVar.V.setVisibility(8);
            mdVar.V.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = mdVar.N;
            org.telegram.ui.Cells.x1 x1Var3 = mdVar.V;
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            linearLayout8.addView(x1Var3, w7.z5.t(-2, -2, i14, 18, 3, 18, 7));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            mdVar.T = e9Var;
            int i36 = R.drawable.greydivider_bottom;
            int i37 = org.telegram.ui.ActionBar.k6.f21146b7;
            org.telegram.ui.ActionBar.r6.b0(i36, i37, context, e9Var, null);
            mdVar.L.addView(mdVar.T, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
            mdVar.f39545h0 = r4Var;
            mdVar.L.addView(r4Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            mdVar.M = linearLayout9;
            org.telegram.ui.ActionBar.r6.i(i32, linearLayout9, null);
            mdVar.M.setOrientation(1);
            mdVar.L.addView(mdVar.M, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            mdVar.f39543f0 = e9Var2;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, i37, context, e9Var2, null);
            mdVar.L.addView(mdVar.f39543f0, w7.z5.n(-1, -2));
            mdVar.i0();
        }
        return mdVar.fragmentView;
    }

    public final void d0() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O7, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P7, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q7, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false);
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S7, false);
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false);
        int x08 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U7, false) + ((x07 + ((x06 + ((x05 + ((x04 + ((x03 + ((x02 + (org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x08 != this.f39567y0) {
            this.f39567y0 = x08;
            LinearLayout linearLayout = this.M;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.M.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.k(nVar.f22742n, nVar.f22741f);
                        nVar.f22738a.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.c2 c2Var = this.f39561v0;
            if (c2Var != null) {
                try {
                    c2Var.dismiss();
                    this.f39561v0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            h0(false);
            this.f39558s0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.c2 c2Var2 = this.f39561v0;
            if (c2Var2 != null) {
                try {
                    c2Var2.dismiss();
                    this.f39561v0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f39548k0);
            Boolean bool = this.f39549l0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.m0 != null || this.f39551n0 != null || this.f39552o0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.m0, this.f39551n0, this.f39552o0, this.f39554q0, this.f39553p0, this.f39566y, this.E, null);
            }
            md mdVar = new md(bundle);
            mdVar.f39560u0 = this.f39560u0;
            presentFragment(mdVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.c50 c50Var = this.f39562w;
        if (c50Var != null && c50Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.c50 c50Var = this.f39562w;
        if ((c50Var == null || dialog != c50Var.f25187c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final boolean e0(String str) {
        if (str != null && str.length() > 0) {
            this.V.setVisibility(0);
        } else {
            this.V.setVisibility(8);
        }
        h0 h0Var = this.Z;
        if (h0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h0Var);
            this.Z = null;
            this.Y = null;
            if (this.X != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.X, true);
            }
        }
        this.f39535a0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        this.V.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        org.telegram.ui.Cells.x1 x1Var = this.V;
                        int i11 = org.telegram.ui.ActionBar.k6.f21405p7;
                        x1Var.setTag(Integer.valueOf(i11));
                        org.telegram.ui.ActionBar.r6.W(this.V, i11, null);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.V.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.x1 x1Var2 = this.V;
                        int i12 = org.telegram.ui.ActionBar.k6.f21405p7;
                        x1Var2.setTag(Integer.valueOf(i12));
                        org.telegram.ui.ActionBar.r6.W(this.V, i12, null);
                        return false;
                    }
                }
            } else {
                this.V.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.x1 x1Var3 = this.V;
                int i13 = org.telegram.ui.ActionBar.k6.f21405p7;
                x1Var3.setTag(Integer.valueOf(i13));
                org.telegram.ui.ActionBar.r6.W(this.V, i13, null);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.V.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.x1 x1Var4 = this.V;
                int i14 = org.telegram.ui.ActionBar.k6.f21405p7;
                x1Var4.setTag(Integer.valueOf(i14));
                org.telegram.ui.ActionBar.r6.W(this.V, i14, null);
                return false;
            }
            this.V.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.x1 x1Var5 = this.V;
            int i15 = org.telegram.ui.ActionBar.k6.F6;
            x1Var5.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.r6.W(this.V, i15, null);
            this.Y = str;
            h0 h0Var2 = new h0(18, this, str);
            this.Z = h0Var2;
            AndroidUtilities.runOnUIThread(h0Var2, 300L);
            return true;
        }
        this.V.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.x1 x1Var6 = this.V;
        int i16 = org.telegram.ui.ActionBar.k6.f21405p7;
        x1Var6.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.r6.W(this.V, i16, null);
        return false;
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.f39550n == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39555r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f39555r.cancel();
            this.f39555r = null;
        }
        if (z11) {
            this.f39555r = new AnimatorSet();
            if (z10) {
                this.f39557s.setVisibility(0);
                AnimatorSet animatorSet2 = this.f39555r;
                jd jdVar = this.f39550n;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(jdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f39557s, property, 1.0f));
            } else {
                if (this.f39550n.getVisibility() != 0) {
                    this.f39550n.setAlpha(0.0f);
                }
                this.f39550n.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39555r;
                jd jdVar2 = this.f39550n;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(jdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f39557s, property2, 0.0f));
            }
            this.f39555r.setDuration(180L);
            this.f39555r.addListener(new ah.p0(28, this, z10));
            this.f39555r.start();
        } else if (z10) {
            this.f39550n.setAlpha(1.0f);
            this.f39550n.setVisibility(4);
            this.f39557s.setAlpha(1.0f);
            this.f39557s.setVisibility(0);
        } else {
            this.f39550n.setAlpha(1.0f);
            this.f39550n.setVisibility(0);
            this.f39557s.setAlpha(0.0f);
            this.f39557s.setVisibility(4);
        }
    }

    public final void g0() {
        if (getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f46725v0 = true;
        j0Var.H0 = new cd(this, 1);
        showDialog(j0Var);
    }

    @Override
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.ou ouVar = this.d;
        int i10 = org.telegram.ui.ActionBar.k6.f21311k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(ouVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.Components.ou ouVar2 = this.d;
        int i11 = org.telegram.ui.ActionBar.k6.f21328l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(ouVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39564x, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39564x, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21146b7));
        LinearLayout linearLayout = this.P;
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f39545h0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21256h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        return arrayList;
    }

    public final void h0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f39563w0);
        }
        if (this.f39536b != null) {
            ValueAnimator valueAnimator = this.f39565x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f39536b.f33027c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39565x0 = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 4));
            ValueAnimator valueAnimator2 = this.f39565x0;
            float f12 = this.f39536b.f33027c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f39565x0.setInterpolator(org.telegram.ui.Components.zr.f33337f);
            this.f39565x0.start();
        }
    }

    public final void i0() {
        int i10;
        int i11;
        int i12;
        int i13;
        int dp;
        int i14;
        int i15;
        if (this.e == null) {
            return;
        }
        String str = null;
        int i16 = 8;
        if (!this.f39537b0 && !this.f39548k0) {
            this.T.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.T;
            int i17 = org.telegram.ui.ActionBar.k6.f21405p7;
            e9Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.r6.W(this.T.getTextView(), i17, null);
            this.N.setVisibility(8);
            this.e.setVisibility(8);
            if (this.f39541e0) {
                this.f39545h0.setVisibility(0);
                this.M.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var2 = this.T;
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7, e9Var2.getContext(), e9Var2, null);
                this.f39543f0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.e9 e9Var3 = this.T;
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21146b7, e9Var3.getContext(), e9Var3, null);
                this.f39545h0.setVisibility(8);
                this.M.setVisibility(0);
                this.f39543f0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var4 = this.T;
            int i18 = org.telegram.ui.ActionBar.k6.B6;
            e9Var4.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.r6.W(this.T.getTextView(), i18, null);
            this.e.setVisibility(0);
            this.f39543f0.setVisibility(8);
            this.M.setVisibility(8);
            org.telegram.ui.Cells.e9 e9Var5 = this.T;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7, e9Var5.getContext(), e9Var5, null);
            this.N.setVisibility(0);
            this.f39545h0.setVisibility(8);
            if (this.J) {
                org.telegram.ui.Cells.e9 e9Var6 = this.T;
                if (this.f39537b0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                e9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.l4 l4Var = this.W;
                if (this.f39537b0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                l4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.e9 e9Var7 = this.T;
                if (this.f39537b0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                e9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.l4 l4Var2 = this.W;
                if (this.f39537b0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                l4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.O;
            if (this.f39537b0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.P;
            if (this.f39537b0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.N;
            if (this.f39537b0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.p90 p90Var = this.Q;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f39540d0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            p90Var.setLink(str);
            org.telegram.ui.Cells.x1 x1Var = this.V;
            if (!this.f39537b0 && x1Var.length() != 0) {
                i16 = 0;
            }
            x1Var.setVisibility(i16);
        }
        this.R.a(!this.f39537b0);
        this.S.a(this.f39537b0);
        this.f39564x.clearFocus();
        AndroidUtilities.hideKeyboard(this.f39564x);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.c50 c50Var = this.f39562w;
        if (c50Var != null) {
            c50Var.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ou ouVar = this.d;
        if (ouVar == null || !ouVar.e) {
            return true;
        }
        if (z10) {
            ouVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f39546i0 == 1 && !this.f39539c0 && this.f39540d0 == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f39547j0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.f39540d0 = chatFull.exported_invite;
            }
            if (this.f39540d0 == null) {
                this.f39539c0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new dd(this, 3));
            }
        }
        org.telegram.ui.Components.c50 c50Var = this.f39562w;
        if (c50Var != null) {
            c50Var.f25185a = this;
            c50Var.f25186b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f39559t0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39559t0.intValue(), true);
            this.f39559t0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.c50 c50Var = this.f39562w;
        if (c50Var != null) {
            c50Var.d();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.ou ouVar = this.d;
        if (ouVar != null) {
            ouVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ou ouVar = this.d;
        if (ouVar != null) {
            ouVar.r();
        }
        org.telegram.ui.Components.c50 c50Var = this.f39562w;
        if (c50Var != null) {
            c50Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.c50 c50Var = this.f39562w;
        if (c50Var != null) {
            c50Var.j(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ou ouVar = this.d;
        if (ouVar != null) {
            ouVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.c50 c50Var = this.f39562w;
        if (c50Var != null) {
            c50Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d0();
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            org.telegram.ui.Components.cq cqVar = this.f39538c;
            if (cqVar != null) {
                cqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21519v8, false));
            }
            org.telegram.ui.Cells.r4 r4Var = this.f39545h0;
            if (r4Var != null && r4Var.getChildCount() > 0 && (this.f39545h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f39545h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21256h6, false));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f39546i0 != 1) {
            this.d.requestFocus();
            org.telegram.ui.Components.ju juVar = this.d.f29381a;
            juVar.requestFocus();
            AndroidUtilities.showKeyboard(juVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f39546i0 == 0) {
            org.telegram.ui.Components.c50 c50Var = this.f39562w;
            if (c50Var != null) {
                c50Var.f25188f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.ou ouVar = this.d;
                if (ouVar != null) {
                    ouVar.setText(string);
                } else {
                    this.F = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f39546i0 == 0) {
            org.telegram.ui.Components.c50 c50Var = this.f39562w;
            if (c50Var != null && (str = c50Var.f25188f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.ou ouVar = this.d;
            if (ouVar != null) {
                String obj = ouVar.getText().toString();
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
