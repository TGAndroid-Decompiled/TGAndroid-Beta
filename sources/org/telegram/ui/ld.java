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
public final class ld extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.v40 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.m4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.jj0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.h90 P;
    public org.telegram.ui.Cells.j6 Q;
    public org.telegram.ui.Cells.j6 R;
    public org.telegram.ui.Cells.e9 S;
    public TextView T;
    public org.telegram.ui.Cells.y1 U;
    public org.telegram.ui.Cells.m4 V;
    public int W;
    public String X;
    public org.telegram.ui.ActionBar.a6 Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.u0 f35298a;
    public boolean f35299a0;
    public org.telegram.ui.Components.rr f35300b;
    public boolean f35301b0;
    public org.telegram.ui.Components.lu f35302c;
    public TLRPC.TL_chatInviteExported f35303c0;
    public org.telegram.ui.Cells.b7 d;
    public boolean f35304d0;
    public ai.y5 e;
    public org.telegram.ui.Cells.e9 f35305e0;
    public ci.r6 f35306f;
    public final ArrayList f35307f0;
    public org.telegram.ui.Cells.s4 f35308g0;
    public id h;
    public final int f35309h0;
    public final long f35310i0;
    public boolean f35311j0;
    public final Boolean f35312k0;
    public TLRPC.InputFile f35313l0;
    public TLRPC.InputFile m0;
    public AnimatorSet f35314n;
    public TLRPC.VideoSize f35315n0;
    public String f35316o0;
    public double f35317p0;
    public boolean f35318q0;
    public jd f35319r;
    public boolean f35320r0;
    public final org.telegram.ui.Components.h9 f35321s;
    public Integer f35322s0;
    public Utilities.Callback2 f35323t0;
    public org.telegram.ui.ActionBar.a2 f35324u0;
    public final org.telegram.ui.Components.w40 v;
    public final cd f35325v0;
    public EditTextBoldCursor f35326w;
    public ValueAnimator f35327w0;
    public TLRPC.FileLocation f35328x;
    public TLRPC.FileLocation f35329y;

    public ld(Bundle bundle) {
        super(bundle);
        this.f35307f0 = new ArrayList();
        this.f35311j0 = true;
        this.f35325v0 = new cd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f35309h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f35312k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f35321s = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            this.v = new org.telegram.ui.Components.w40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new bd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f35311j0 = z10;
            this.f35299a0 = !z10;
            if (!z10 && !this.f35304d0) {
                this.f35304d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new bd(this, 0));
            }
        }
        this.f35310i0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(ld ldVar, org.telegram.ui.ActionBar.a2 a2Var) {
        ldVar.f35320r0 = false;
        ldVar.f35318q0 = false;
        if (ldVar.f35322s0 != null) {
            ConnectionsManager.getInstance(ldVar.currentAccount).cancelRequest(ldVar.f35322s0.intValue(), true);
            ldVar.f35322s0 = null;
        }
        ldVar.g0(false);
        a2Var.dismiss();
    }

    public static void V(ld ldVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(ldVar.currentAccount).sendRequest(tL_channels_updateUsername, new bd(ldVar, 1), 64);
    }

    public static void W(ld ldVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(ldVar.currentAccount).getInputChannel(ldVar.f35310i0);
        ldVar.W = ConnectionsManager.getInstance(ldVar.currentAccount).sendRequest(tL_channels_checkUsername, new aa(ldVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(ld ldVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ldVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
        a2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(ldVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(ldVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new o(6, ldVar, currentChannel));
        ldVar.showDialog(a2Var);
    }

    public static void Y(ld ldVar) {
        if (ldVar.f35324u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ldVar.getParentActivity());
        alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new z0(ldVar, 12));
        ldVar.f35324u0 = alertDialog$Builder.o();
    }

    @Override
    public final void B(float f7) {
        jd jdVar = this.f35319r;
        if (jdVar == null) {
            return;
        }
        jdVar.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        jd jdVar = this.f35319r;
        if (jdVar == null) {
            return;
        }
        jdVar.setProgress(0.0f);
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
        ld ldVar = this;
        org.telegram.ui.Components.lu luVar = ldVar.f35302c;
        if (luVar != null) {
            luVar.o();
        }
        ldVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ldVar.actionBar.setAllowOverlayTitle(true);
        ldVar.actionBar.setActionBarMenuOnItemClick(new gd(ldVar));
        org.telegram.ui.ActionBar.y n10 = ldVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.h6.f19392v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.rr rrVar = new org.telegram.ui.Components.rr(mutate, new org.telegram.ui.Components.vp(org.telegram.ui.ActionBar.h6.w0(null, i21, false)));
        ldVar.f35300b = rrVar;
        ldVar.f35298a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), rrVar);
        int i22 = ldVar.f35309h0;
        if (i22 == 0) {
            ldVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            hd hdVar = new hd(0, context, ldVar);
            hdVar.setOnTouchListener(new bi.d(2));
            ldVar.fragmentView = hdVar;
            int i23 = org.telegram.ui.ActionBar.h6.f19059d6;
            hdVar.setTag(Integer.valueOf(i23));
            ldVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            ldVar.K = linearLayout;
            linearLayout.setOrientation(1);
            hdVar.addView(ldVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            ldVar.K.addView(frameLayout, w7.y5.n(-1, -2));
            ai.y5 y5Var = new ai.y5(ldVar, context, 5);
            ldVar.e = y5Var;
            y5Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.h9 h9Var = ldVar.f35321s;
            h9Var.n(5L, null, null);
            ldVar.e.setImageDrawable(h9Var);
            ai.y5 y5Var2 = ldVar.e;
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
            frameLayout.addView(y5Var2, w7.y5.d(64, 64.0f, i24, f7, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ci.r6 r6Var = new ci.r6(ldVar, context, paint, 2);
            ldVar.f35306f = r6Var;
            r6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ci.r6 r6Var2 = ldVar.f35306f;
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
            frameLayout.addView(r6Var2, w7.y5.d(64, 64.0f, i25, f11, 12.0f, f12, 12.0f));
            ldVar.f35306f.setOnClickListener(new dd(ldVar, 1));
            ldVar.J = new org.telegram.ui.Components.jj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            id idVar = new id(ldVar, context, 0);
            ldVar.h = idVar;
            idVar.setScaleType(ImageView.ScaleType.CENTER);
            ldVar.h.setAnimation(ldVar.J);
            ldVar.h.setEnabled(false);
            ldVar.h.setClickable(false);
            ldVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            id idVar2 = ldVar.h;
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
            frameLayout.addView(idVar2, w7.y5.d(64, 64.0f, i26, f13, 12.0f, f14, 12.0f));
            jd jdVar = new jd(ldVar, context, 0);
            ldVar.f35319r = jdVar;
            jdVar.setSize(AndroidUtilities.dp(30.0f));
            ldVar.f35319r.setProgressColor(-1);
            ldVar.f35319r.setNoProgress(false);
            jd jdVar2 = ldVar.f35319r;
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
            frameLayout.addView(jdVar2, w7.y5.d(64, 64.0f, i27, f15, 12.0f, f16, 12.0f));
            ldVar.e0(false, false);
            org.telegram.ui.Components.lu luVar2 = new org.telegram.ui.Components.lu(context, hdVar, this, 0, false, null);
            ldVar = this;
            ldVar.f35302c = luVar2;
            luVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = ldVar.E;
            if (str != null) {
                ldVar.f35302c.setText(str);
                ldVar.E = null;
            }
            ldVar.f35302c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            ldVar.f35302c.getEditText().setSingleLine(true);
            ldVar.f35302c.getEditText().setImeOptions(5);
            ldVar.f35302c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(ldVar) {
                public final ld f33370b;

                {
                    this.f33370b = ldVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            ld ldVar2 = this.f33370b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(ldVar2.f35302c.getEditText().getText())) {
                                    ldVar2.f35326w.requestFocus();
                                    return true;
                                }
                            } else {
                                ldVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (u0Var = this.f33370b.f35298a) != null) {
                                u0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.lu luVar3 = ldVar.f35302c;
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
            frameLayout.addView(luVar3, w7.y5.d(-1, -2.0f, 16, f17, 0.0f, f18, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            ldVar.f35326w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            ldVar.f35326w.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = ldVar.f35326w;
            int i28 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i28, false));
            ldVar.f35326w.setBackgroundDrawable(null);
            ldVar.f35326w.setLineColors(ldVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19186k6), ldVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19204l6), ldVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19279p7));
            ldVar.f35326w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = ldVar.f35326w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            ldVar.f35326w.setInputType(180225);
            ldVar.f35326w.setImeOptions(6);
            ldVar.f35326w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            ldVar.f35326w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            ldVar.f35326w.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i28, false));
            ldVar.f35326w.setCursorSize(AndroidUtilities.dp(20.0f));
            ldVar.f35326w.setCursorWidth(1.5f);
            ldVar.K.addView(ldVar.f35326w, w7.y5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            ldVar.f35326w.setOnEditorActionListener(new TextView.OnEditorActionListener(ldVar) {
                public final ld f33370b;

                {
                    this.f33370b = ldVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            ld ldVar2 = this.f33370b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(ldVar2.f35302c.getEditText().getText())) {
                                    ldVar2.f35326w.requestFocus();
                                    return true;
                                }
                            } else {
                                ldVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (u0Var = this.f33370b.f35298a) != null) {
                                u0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            ldVar.f35326w.addTextChangedListener(new kd(0));
            TextView textView = new TextView(context);
            ldVar.T = textView;
            textView.setTextSize(1, 15.0f);
            ldVar.T.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.F6, false));
            TextView textView2 = ldVar.T;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19);
            ldVar.T.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = ldVar.K;
            TextView textView3 = ldVar.T;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            linearLayout2.addView(textView3, w7.y5.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            ldVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            ldVar.K = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(ldVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = ldVar.getMessagesController();
            long j3 = ldVar.f35310i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ldVar.I = z10;
            org.telegram.ui.ActionBar.k kVar = ldVar.actionBar;
            if (z10) {
                i10 = R.string.GroupSettingsTitle;
            } else {
                i10 = R.string.ChannelSettingsTitle;
            }
            kVar.setTitle(LocaleController.getString(i10));
            View view = ldVar.fragmentView;
            int i29 = org.telegram.ui.ActionBar.h6.f19003a7;
            view.setTag(Integer.valueOf(i29));
            ldVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i29, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            ldVar.G = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = ldVar.G;
            int i30 = org.telegram.ui.ActionBar.h6.f19059d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i30, false));
            org.telegram.ui.Cells.m4 m4Var3 = ldVar.G;
            if (ldVar.I) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            m4Var3.setText(LocaleController.getString(i11));
            ldVar.K.addView(ldVar.G);
            LinearLayout linearLayout4 = new LinearLayout(context);
            ldVar.F = linearLayout4;
            linearLayout4.setOrientation(1);
            ldVar.F.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i30, false));
            ldVar.K.addView(ldVar.F, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, false);
            ldVar.Q = j6Var;
            j6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
            Boolean bool = ldVar.f35312k0;
            if (bool != null && !bool.booleanValue()) {
                ldVar.f35299a0 = true;
            }
            if (ldVar.I) {
                ldVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !ldVar.f35299a0);
            } else {
                ldVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !ldVar.f35299a0);
            }
            ldVar.Q.setOnClickListener(new dd(ldVar, 2));
            if (bool == null || bool.booleanValue()) {
                ldVar.F.addView(ldVar.Q, w7.y5.n(-1, -2));
            }
            org.telegram.ui.Cells.j6 j6Var2 = new org.telegram.ui.Cells.j6(context, false);
            ldVar.R = j6Var2;
            j6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
            if (bool != null && bool.booleanValue()) {
                ldVar.f35299a0 = false;
            }
            if (ldVar.I) {
                ldVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, ldVar.f35299a0);
            } else {
                ldVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, ldVar.f35299a0);
            }
            ldVar.R.setOnClickListener(new dd(ldVar, 3));
            if (bool == null || !bool.booleanValue()) {
                ldVar.F.addView(ldVar.R, w7.y5.n(-1, -2));
            }
            org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            ldVar.d = b7Var;
            ldVar.K.addView(b7Var, w7.y5.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            ldVar.M = linearLayout5;
            linearLayout5.setOrientation(1);
            ldVar.M.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i30, false));
            ldVar.K.addView(ldVar.M, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
            ldVar.V = m4Var4;
            ldVar.M.addView(m4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            ldVar.N = linearLayout6;
            linearLayout6.setOrientation(0);
            ldVar.M.addView(ldVar.N, w7.y5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            ldVar.H = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(ldVar.currentAccount).linkPrefix + "/");
            ldVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = ldVar.H;
            int i31 = org.telegram.ui.ActionBar.h6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = ldVar.H;
            int i32 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i32, false));
            ldVar.H.setMaxLines(1);
            ldVar.H.setLines(1);
            ldVar.H.setEnabled(false);
            ldVar.H.setBackgroundDrawable(null);
            ldVar.H.setPadding(0, 0, 0, 0);
            ldVar.H.setSingleLine(true);
            ldVar.H.setInputType(163840);
            ldVar.H.setImeOptions(6);
            ldVar.N.addView(ldVar.H, w7.y5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            ldVar.f35326w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            ldVar.f35326w.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i31, false));
            ldVar.f35326w.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i32, false));
            ldVar.f35326w.setMaxLines(1);
            ldVar.f35326w.setLines(1);
            ldVar.f35326w.setBackgroundDrawable(null);
            ldVar.f35326w.setPadding(0, 0, 0, 0);
            ldVar.f35326w.setSingleLine(true);
            ldVar.f35326w.setInputType(163872);
            ldVar.f35326w.setImeOptions(6);
            ldVar.f35326w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            ldVar.f35326w.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i32, false));
            ldVar.f35326w.setCursorSize(AndroidUtilities.dp(20.0f));
            ldVar.f35326w.setCursorWidth(1.5f);
            ldVar.N.addView(ldVar.f35326w, w7.y5.n(-1, 36));
            ldVar.f35326w.addTextChangedListener(new m0(ldVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            ldVar.O = linearLayout7;
            linearLayout7.setOrientation(1);
            ldVar.M.addView(ldVar.O, w7.y5.n(-1, -2));
            org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90(context, ldVar, null, true, ChatObject.isChannel(ldVar.getMessagesController().getChat(Long.valueOf(j3))));
            ldVar.P = h90Var;
            h90Var.b(true);
            ldVar.P.d(0, null, false);
            ldVar.O.addView(ldVar.P);
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(ldVar, context, 3);
            ldVar.U = y1Var;
            y1Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J6, false));
            ldVar.U.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.K6, false));
            ldVar.U.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.y1 y1Var2 = ldVar.U;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            y1Var2.setGravity(i12);
            ldVar.U.setVisibility(8);
            ldVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = ldVar.M;
            org.telegram.ui.Cells.y1 y1Var3 = ldVar.U;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout8.addView(y1Var3, w7.y5.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            ldVar.S = e9Var;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.h6.f19023b7;
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, i33, i34));
            ldVar.K.addView(ldVar.S, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            ldVar.f35308g0 = s4Var;
            ldVar.K.addView(s4Var, w7.y5.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            ldVar.L = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i30, false));
            ldVar.L.setOrientation(1);
            ldVar.K.addView(ldVar.L, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            ldVar.f35305e0 = e9Var2;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, i34));
            ldVar.K.addView(ldVar.f35305e0, w7.y5.n(-1, -2));
            ldVar.h0();
        }
        return ldVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.length() > 0) {
            this.U.setVisibility(0);
        } else {
            this.U.setVisibility(8);
        }
        org.telegram.ui.ActionBar.a6 a6Var = this.Y;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
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
                        int i11 = org.telegram.ui.ActionBar.h6.f19279p7;
                        y1Var.setTag(Integer.valueOf(i11));
                        this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.y1 y1Var2 = this.U;
                        int i12 = org.telegram.ui.ActionBar.h6.f19279p7;
                        y1Var2.setTag(Integer.valueOf(i12));
                        this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.y1 y1Var3 = this.U;
                int i13 = org.telegram.ui.ActionBar.h6.f19279p7;
                y1Var3.setTag(Integer.valueOf(i13));
                this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.y1 y1Var4 = this.U;
                int i14 = org.telegram.ui.ActionBar.h6.f19279p7;
                y1Var4.setTag(Integer.valueOf(i14));
                this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
                return false;
            }
            this.U.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.y1 y1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.h6.F6;
            y1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
            this.X = str;
            org.telegram.ui.ActionBar.a6 a6Var2 = new org.telegram.ui.ActionBar.a6(21, this, str);
            this.Y = a6Var2;
            AndroidUtilities.runOnUIThread(a6Var2, 300L);
            return true;
        }
        this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.y1 y1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.h6.f19279p7;
        y1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.a2 a2Var = this.f35324u0;
            if (a2Var != null) {
                try {
                    a2Var.dismiss();
                    this.f35324u0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.f35320r0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.a2 a2Var2 = this.f35324u0;
            if (a2Var2 != null) {
                try {
                    a2Var2.dismiss();
                    this.f35324u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f35311j0);
            Boolean bool = this.f35312k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f35313l0 != null || this.m0 != null || this.f35315n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f35313l0, this.m0, this.f35315n0, this.f35317p0, this.f35316o0, this.f35328x, this.f35329y, null);
            }
            ld ldVar = new ld(bundle);
            ldVar.f35323t0 = this.f35323t0;
            presentFragment(ldVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null && w40Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.w40 w40Var = this.v;
        if ((w40Var == null || dialog != w40Var.f29843c) && super.dismissDialogOnPause(dialog)) {
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
        AnimatorSet animatorSet = this.f35314n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f35314n.cancel();
            this.f35314n = null;
        }
        if (z11) {
            this.f35314n = new AnimatorSet();
            if (z10) {
                this.f35319r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f35314n;
                id idVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(idVar, property, 0.0f), ObjectAnimator.ofFloat(this.f35319r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f35314n;
                id idVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(idVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f35319r, property2, 0.0f));
            }
            this.f35314n.setDuration(180L);
            this.f35314n.addListener(new ai.n(27, this, z10));
            this.f35314n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f35319r.setAlpha(1.0f);
            this.f35319r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f35319r.setAlpha(0.0f);
            this.f35319r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f42613v0 = true;
        j0Var.H0 = new cd(this, 0);
        showDialog(j0Var);
    }

    public final void g0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f35325v0);
        }
        if (this.f35300b != null) {
            ValueAnimator valueAnimator = this.f35327w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f35300b.f28047c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f35327w0 = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 4));
            ValueAnimator valueAnimator2 = this.f35327w0;
            float f12 = this.f35300b.f28047c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f35327w0.setInterpolator(org.telegram.ui.Components.sr.f28339f);
            this.f35327w0.start();
        }
    }

    @Override
    public final vu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f35302c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f19059d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.f19003a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19356t8));
        org.telegram.ui.Components.lu luVar = this.f35302c;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(luVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.lu luVar2 = this.f35302c;
        int i12 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(luVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.lu luVar3 = this.f35302c;
        int i13 = org.telegram.ui.ActionBar.h6.f19186k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(luVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.lu luVar4 = this.f35302c;
        int i14 = org.telegram.ui.ActionBar.h6.f19204l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(luVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35326w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35326w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35326w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35326w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.h6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.b7 b7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.h6.f19023b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(b7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.y1 y1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.h6.f19279p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(y1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.h6.f19408w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35305e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.h6.f19148i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35308g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19130h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.h6.f19114g7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.h6.f19131h7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.h6.f19461z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.h6.f19442y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f19310r0, eVar, org.telegram.ui.ActionBar.h6.J7));
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
        if (!this.f35299a0 && !this.f35311j0) {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.S;
            int i17 = org.telegram.ui.ActionBar.h6.f19279p7;
            e9Var.setTag(Integer.valueOf(i17));
            this.S.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i17, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f35304d0) {
                this.f35308g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var2 = this.S;
                e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(e9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19023b7));
                this.f35305e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.e9 e9Var3 = this.S;
                e9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(e9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f19023b7));
                this.f35308g0.setVisibility(8);
                this.L.setVisibility(0);
                this.f35305e0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var4 = this.S;
            int i18 = org.telegram.ui.ActionBar.h6.B6;
            e9Var4.setTag(Integer.valueOf(i18));
            this.S.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i18, false));
            this.d.setVisibility(0);
            this.f35305e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.e9 e9Var5 = this.S;
            e9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(e9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19023b7));
            this.M.setVisibility(0);
            this.f35308g0.setVisibility(8);
            if (this.I) {
                org.telegram.ui.Cells.e9 e9Var6 = this.S;
                if (this.f35299a0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                e9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.m4 m4Var = this.V;
                if (this.f35299a0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.e9 e9Var7 = this.S;
                if (this.f35299a0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                e9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.m4 m4Var2 = this.V;
                if (this.f35299a0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                m4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.N;
            if (this.f35299a0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.O;
            if (this.f35299a0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.M;
            if (this.f35299a0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.h90 h90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f35303c0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            h90Var.setLink(str);
            org.telegram.ui.Cells.y1 y1Var = this.U;
            if (!this.f35299a0 && y1Var.length() != 0) {
                i16 = 0;
            }
            y1Var.setVisibility(i16);
        }
        this.Q.a(!this.f35299a0);
        this.R.a(this.f35299a0);
        this.f35326w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f35326w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.lu luVar = this.f35302c;
        if (luVar == null || !luVar.e) {
            return true;
        }
        if (z10) {
            luVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f35309h0 == 1 && !this.f35301b0 && this.f35303c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j3 = this.f35310i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull != null) {
                this.f35303c0 = chatFull.exported_invite;
            }
            if (this.f35303c0 == null) {
                this.f35301b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new bd(this, 3));
            }
        }
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.f29841a = this;
            w40Var.f29842b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f35322s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f35322s0.intValue(), true);
            this.f35322s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.lu luVar = this.f35302c;
        if (luVar != null) {
            luVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.lu luVar = this.f35302c;
        if (luVar != null) {
            luVar.r();
        }
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.j();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.k(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.lu luVar = this.f35302c;
        if (luVar != null) {
            luVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.w40 w40Var = this.v;
        if (w40Var != null) {
            w40Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f35309h0 != 1) {
            this.f35302c.requestFocus();
            org.telegram.ui.Components.gu guVar = this.f35302c.f26172a;
            guVar.requestFocus();
            AndroidUtilities.showKeyboard(guVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f35309h0 == 0) {
            org.telegram.ui.Components.w40 w40Var = this.v;
            if (w40Var != null) {
                w40Var.f29844f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.lu luVar = this.f35302c;
                if (luVar != null) {
                    luVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f35309h0 == 0) {
            org.telegram.ui.Components.w40 w40Var = this.v;
            if (w40Var != null && (str = w40Var.f29844f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.lu luVar = this.f35302c;
            if (luVar != null) {
                String obj = luVar.getText().toString();
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
