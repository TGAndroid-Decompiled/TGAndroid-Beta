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
public final class ld extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.t40 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.l4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.xi0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.v80 P;
    public org.telegram.ui.Cells.i6 Q;
    public org.telegram.ui.Cells.i6 R;
    public org.telegram.ui.Cells.e9 S;
    public TextView T;
    public org.telegram.ui.Cells.x1 U;
    public org.telegram.ui.Cells.l4 V;
    public int W;
    public String X;
    public l4 Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.v0 f35436a;
    public boolean f35437a0;
    public org.telegram.ui.Components.pr f35438b;
    public boolean f35439b0;
    public org.telegram.ui.Components.ju f35440c;
    public TLRPC.TL_chatInviteExported f35441c0;
    public org.telegram.ui.Cells.a7 d;
    public boolean f35442d0;
    public ai.z5 e;
    public org.telegram.ui.Cells.e9 f35443e0;
    public ci.s6 f35444f;
    public final ArrayList f35445f0;
    public org.telegram.ui.Cells.r4 f35446g0;
    public id h;
    public final int f35447h0;
    public final long f35448i0;
    public boolean f35449j0;
    public final Boolean f35450k0;
    public TLRPC.InputFile f35451l0;
    public TLRPC.InputFile m0;
    public AnimatorSet f35452n;
    public TLRPC.VideoSize f35453n0;
    public String f35454o0;
    public double f35455p0;
    public boolean f35456q0;
    public jd f35457r;
    public boolean f35458r0;
    public final org.telegram.ui.Components.f9 f35459s;
    public Integer f35460s0;
    public Utilities.Callback2 f35461t0;
    public org.telegram.ui.ActionBar.b2 f35462u0;
    public final org.telegram.ui.Components.u40 v;
    public final cd f35463v0;
    public EditTextBoldCursor f35464w;
    public ValueAnimator f35465w0;
    public TLRPC.FileLocation f35466x;
    public TLRPC.FileLocation f35467y;

    public ld(Bundle bundle) {
        super(bundle);
        this.f35445f0 = new ArrayList();
        this.f35449j0 = true;
        this.f35463v0 = new cd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f35447h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f35450k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f35459s = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
            this.v = new org.telegram.ui.Components.u40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new bd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f35449j0 = z10;
            this.f35437a0 = !z10;
            if (!z10 && !this.f35442d0) {
                this.f35442d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new bd(this, 0));
            }
        }
        this.f35448i0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(ld ldVar, org.telegram.ui.ActionBar.b2 b2Var) {
        ldVar.f35458r0 = false;
        ldVar.f35456q0 = false;
        if (ldVar.f35460s0 != null) {
            ConnectionsManager.getInstance(ldVar.currentAccount).cancelRequest(ldVar.f35460s0.intValue(), true);
            ldVar.f35460s0 = null;
        }
        ldVar.g0(false);
        b2Var.dismiss();
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
        tL_channels_checkUsername.channel = MessagesController.getInstance(ldVar.currentAccount).getInputChannel(ldVar.f35448i0);
        ldVar.W = ConnectionsManager.getInstance(ldVar.currentAccount).sendRequest(tL_channels_checkUsername, new aa(ldVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(ld ldVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ldVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
        b2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(ldVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(ldVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new x5(3, ldVar, currentChannel));
        ldVar.showDialog(b2Var);
    }

    public static void Y(ld ldVar) {
        if (ldVar.f35462u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ldVar.getParentActivity());
        alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f18437a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new y0(ldVar, 12));
        ldVar.f35462u0 = alertDialog$Builder.o();
    }

    @Override
    public final void B(float f7) {
        jd jdVar = this.f35457r;
        if (jdVar == null) {
            return;
        }
        jdVar.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        jd jdVar = this.f35457r;
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
        org.telegram.ui.Components.ju juVar = ldVar.f35440c;
        if (juVar != null) {
            juVar.o();
        }
        ldVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ldVar.actionBar.setAllowOverlayTitle(true);
        ldVar.actionBar.setActionBarMenuOnItemClick(new gd(ldVar));
        org.telegram.ui.ActionBar.z n10 = ldVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.i6.f19168v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.i6.w0(null, i21, false)));
        ldVar.f35438b = prVar;
        ldVar.f35436a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), prVar);
        int i22 = ldVar.f35447h0;
        if (i22 == 0) {
            ldVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            hd hdVar = new hd(0, context, ldVar);
            hdVar.setOnTouchListener(new bi.d(2));
            ldVar.fragmentView = hdVar;
            int i23 = org.telegram.ui.ActionBar.i6.f18836d6;
            hdVar.setTag(Integer.valueOf(i23));
            ldVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            ldVar.K = linearLayout;
            linearLayout.setOrientation(1);
            hdVar.addView(ldVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            ldVar.K.addView(frameLayout, w7.x5.n(-1, -2));
            ai.z5 z5Var = new ai.z5(ldVar, context, 5);
            ldVar.e = z5Var;
            z5Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.f9 f9Var = ldVar.f35459s;
            f9Var.n(5L, null, null);
            ldVar.e.setImageDrawable(f9Var);
            ai.z5 z5Var2 = ldVar.e;
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
            frameLayout.addView(z5Var2, w7.x5.d(64, 64.0f, i24, f7, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ci.s6 s6Var = new ci.s6(ldVar, context, paint, 2);
            ldVar.f35444f = s6Var;
            s6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ci.s6 s6Var2 = ldVar.f35444f;
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
            frameLayout.addView(s6Var2, w7.x5.d(64, 64.0f, i25, f11, 12.0f, f12, 12.0f));
            ldVar.f35444f.setOnClickListener(new dd(ldVar, 1));
            ldVar.J = new org.telegram.ui.Components.xi0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
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
            frameLayout.addView(idVar2, w7.x5.d(64, 64.0f, i26, f13, 12.0f, f14, 12.0f));
            jd jdVar = new jd(ldVar, context, 0);
            ldVar.f35457r = jdVar;
            jdVar.setSize(AndroidUtilities.dp(30.0f));
            ldVar.f35457r.setProgressColor(-1);
            ldVar.f35457r.setNoProgress(false);
            jd jdVar2 = ldVar.f35457r;
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
            frameLayout.addView(jdVar2, w7.x5.d(64, 64.0f, i27, f15, 12.0f, f16, 12.0f));
            ldVar.e0(false, false);
            org.telegram.ui.Components.ju juVar2 = new org.telegram.ui.Components.ju(context, hdVar, this, 0, false, null);
            ldVar = this;
            ldVar.f35440c = juVar2;
            juVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = ldVar.E;
            if (str != null) {
                ldVar.f35440c.setText(str);
                ldVar.E = null;
            }
            ldVar.f35440c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            ldVar.f35440c.getEditText().setSingleLine(true);
            ldVar.f35440c.getEditText().setImeOptions(5);
            ldVar.f35440c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(ldVar) {
                public final ld f33312b;

                {
                    this.f33312b = ldVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (r2) {
                        case 0:
                            ld ldVar2 = this.f33312b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(ldVar2.f35440c.getEditText().getText())) {
                                    ldVar2.f35464w.requestFocus();
                                    return true;
                                }
                            } else {
                                ldVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (v0Var = this.f33312b.f35436a) != null) {
                                v0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.ju juVar3 = ldVar.f35440c;
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
            frameLayout.addView(juVar3, w7.x5.d(-1, -2.0f, 16, f17, 0.0f, f18, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            ldVar.f35464w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            ldVar.f35464w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = ldVar.f35464w;
            int i28 = org.telegram.ui.ActionBar.i6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i28, false));
            ldVar.f35464w.setBackgroundDrawable(null);
            ldVar.f35464w.setLineColors(ldVar.getThemedColor(org.telegram.ui.ActionBar.i6.f18964k6), ldVar.getThemedColor(org.telegram.ui.ActionBar.i6.f18982l6), ldVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19056p7));
            ldVar.f35464w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = ldVar.f35464w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            ldVar.f35464w.setInputType(180225);
            ldVar.f35464w.setImeOptions(6);
            ldVar.f35464w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            ldVar.f35464w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            ldVar.f35464w.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i28, false));
            ldVar.f35464w.setCursorSize(AndroidUtilities.dp(20.0f));
            ldVar.f35464w.setCursorWidth(1.5f);
            ldVar.K.addView(ldVar.f35464w, w7.x5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            ldVar.f35464w.setOnEditorActionListener(new TextView.OnEditorActionListener(ldVar) {
                public final ld f33312b;

                {
                    this.f33312b = ldVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (r2) {
                        case 0:
                            ld ldVar2 = this.f33312b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(ldVar2.f35440c.getEditText().getText())) {
                                    ldVar2.f35464w.requestFocus();
                                    return true;
                                }
                            } else {
                                ldVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (v0Var = this.f33312b.f35436a) != null) {
                                v0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            ldVar.f35464w.addTextChangedListener(new kd(0));
            TextView textView = new TextView(context);
            ldVar.T = textView;
            textView.setTextSize(1, 15.0f);
            ldVar.T.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.F6, false));
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
            linearLayout2.addView(textView3, w7.x5.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            ldVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            ldVar.K = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(ldVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = ldVar.getMessagesController();
            long j3 = ldVar.f35448i0;
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
            int i29 = org.telegram.ui.ActionBar.i6.f18780a7;
            view.setTag(Integer.valueOf(i29));
            ldVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i29, false));
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
            ldVar.G = l4Var;
            l4Var.setHeight(46);
            org.telegram.ui.Cells.l4 l4Var2 = ldVar.G;
            int i30 = org.telegram.ui.ActionBar.i6.f18836d6;
            l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i30, false));
            org.telegram.ui.Cells.l4 l4Var3 = ldVar.G;
            if (ldVar.I) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            l4Var3.setText(LocaleController.getString(i11));
            ldVar.K.addView(ldVar.G);
            LinearLayout linearLayout4 = new LinearLayout(context);
            ldVar.F = linearLayout4;
            linearLayout4.setOrientation(1);
            ldVar.F.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i30, false));
            ldVar.K.addView(ldVar.F, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
            ldVar.Q = i6Var;
            i6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
            Boolean bool = ldVar.f35450k0;
            if (bool != null && !bool.booleanValue()) {
                ldVar.f35437a0 = true;
            }
            if (ldVar.I) {
                ldVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !ldVar.f35437a0);
            } else {
                ldVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !ldVar.f35437a0);
            }
            ldVar.Q.setOnClickListener(new dd(ldVar, 2));
            if (bool == null || bool.booleanValue()) {
                ldVar.F.addView(ldVar.Q, w7.x5.n(-1, -2));
            }
            org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
            ldVar.R = i6Var2;
            i6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
            if (bool != null && bool.booleanValue()) {
                ldVar.f35437a0 = false;
            }
            if (ldVar.I) {
                ldVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, ldVar.f35437a0);
            } else {
                ldVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, ldVar.f35437a0);
            }
            ldVar.R.setOnClickListener(new dd(ldVar, 3));
            if (bool == null || !bool.booleanValue()) {
                ldVar.F.addView(ldVar.R, w7.x5.n(-1, -2));
            }
            org.telegram.ui.Cells.a7 a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            ldVar.d = a7Var;
            ldVar.K.addView(a7Var, w7.x5.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            ldVar.M = linearLayout5;
            linearLayout5.setOrientation(1);
            ldVar.M.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i30, false));
            ldVar.K.addView(ldVar.M, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.l4 l4Var4 = new org.telegram.ui.Cells.l4(context);
            ldVar.V = l4Var4;
            ldVar.M.addView(l4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            ldVar.N = linearLayout6;
            linearLayout6.setOrientation(0);
            ldVar.M.addView(ldVar.N, w7.x5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            ldVar.H = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(ldVar.currentAccount).linkPrefix + "/");
            ldVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = ldVar.H;
            int i31 = org.telegram.ui.ActionBar.i6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = ldVar.H;
            int i32 = org.telegram.ui.ActionBar.i6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i32, false));
            ldVar.H.setMaxLines(1);
            ldVar.H.setLines(1);
            ldVar.H.setEnabled(false);
            ldVar.H.setBackgroundDrawable(null);
            ldVar.H.setPadding(0, 0, 0, 0);
            ldVar.H.setSingleLine(true);
            ldVar.H.setInputType(163840);
            ldVar.H.setImeOptions(6);
            ldVar.N.addView(ldVar.H, w7.x5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            ldVar.f35464w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            ldVar.f35464w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i31, false));
            ldVar.f35464w.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i32, false));
            ldVar.f35464w.setMaxLines(1);
            ldVar.f35464w.setLines(1);
            ldVar.f35464w.setBackgroundDrawable(null);
            ldVar.f35464w.setPadding(0, 0, 0, 0);
            ldVar.f35464w.setSingleLine(true);
            ldVar.f35464w.setInputType(163872);
            ldVar.f35464w.setImeOptions(6);
            ldVar.f35464w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            ldVar.f35464w.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i32, false));
            ldVar.f35464w.setCursorSize(AndroidUtilities.dp(20.0f));
            ldVar.f35464w.setCursorWidth(1.5f);
            ldVar.N.addView(ldVar.f35464w, w7.x5.n(-1, 36));
            ldVar.f35464w.addTextChangedListener(new l0(ldVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            ldVar.O = linearLayout7;
            linearLayout7.setOrientation(1);
            ldVar.M.addView(ldVar.O, w7.x5.n(-1, -2));
            org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(context, ldVar, null, true, ChatObject.isChannel(ldVar.getMessagesController().getChat(Long.valueOf(j3))));
            ldVar.P = v80Var;
            v80Var.b(true);
            ldVar.P.d(0, null, false);
            ldVar.O.addView(ldVar.P);
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(ldVar, context, 3);
            ldVar.U = x1Var;
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
            ldVar.U.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.K6, false));
            ldVar.U.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.x1 x1Var2 = ldVar.U;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            x1Var2.setGravity(i12);
            ldVar.U.setVisibility(8);
            ldVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = ldVar.M;
            org.telegram.ui.Cells.x1 x1Var3 = ldVar.U;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout8.addView(x1Var3, w7.x5.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            ldVar.S = e9Var;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.i6.f18800b7;
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, i33, i34));
            ldVar.K.addView(ldVar.S, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
            ldVar.f35446g0 = r4Var;
            ldVar.K.addView(r4Var, w7.x5.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            ldVar.L = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i30, false));
            ldVar.L.setOrientation(1);
            ldVar.K.addView(ldVar.L, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
            ldVar.f35443e0 = e9Var2;
            e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, i34));
            ldVar.K.addView(ldVar.f35443e0, w7.x5.n(-1, -2));
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
        l4 l4Var = this.Y;
        if (l4Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l4Var);
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
                        org.telegram.ui.Cells.x1 x1Var = this.U;
                        int i11 = org.telegram.ui.ActionBar.i6.f19056p7;
                        x1Var.setTag(Integer.valueOf(i11));
                        this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.x1 x1Var2 = this.U;
                        int i12 = org.telegram.ui.ActionBar.i6.f19056p7;
                        x1Var2.setTag(Integer.valueOf(i12));
                        this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.x1 x1Var3 = this.U;
                int i13 = org.telegram.ui.ActionBar.i6.f19056p7;
                x1Var3.setTag(Integer.valueOf(i13));
                this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.x1 x1Var4 = this.U;
                int i14 = org.telegram.ui.ActionBar.i6.f19056p7;
                x1Var4.setTag(Integer.valueOf(i14));
                this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
                return false;
            }
            this.U.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.x1 x1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.i6.F6;
            x1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
            this.X = str;
            l4 l4Var2 = new l4(16, this, str);
            this.Y = l4Var2;
            AndroidUtilities.runOnUIThread(l4Var2, 300L);
            return true;
        }
        this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.x1 x1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.i6.f19056p7;
        x1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f35462u0;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                    this.f35462u0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.f35458r0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.b2 b2Var2 = this.f35462u0;
            if (b2Var2 != null) {
                try {
                    b2Var2.dismiss();
                    this.f35462u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f35449j0);
            Boolean bool = this.f35450k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f35451l0 != null || this.m0 != null || this.f35453n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f35451l0, this.m0, this.f35453n0, this.f35455p0, this.f35454o0, this.f35466x, this.f35467y, null);
            }
            ld ldVar = new ld(bundle);
            ldVar.f35461t0 = this.f35461t0;
            presentFragment(ldVar, true);
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
        if ((u40Var == null || dialog != u40Var.f28285c) && super.dismissDialogOnPause(dialog)) {
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
        AnimatorSet animatorSet = this.f35452n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f35452n.cancel();
            this.f35452n = null;
        }
        if (z11) {
            this.f35452n = new AnimatorSet();
            if (z10) {
                this.f35457r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f35452n;
                id idVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(idVar, property, 0.0f), ObjectAnimator.ofFloat(this.f35457r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f35452n;
                id idVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(idVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f35457r, property2, 0.0f));
            }
            this.f35452n.setDuration(180L);
            this.f35452n.addListener(new ai.n(27, this, z10));
            this.f35452n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f35457r.setAlpha(1.0f);
            this.f35457r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f35457r.setAlpha(0.0f);
            this.f35457r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        rg.j0 j0Var = new rg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f42330v0 = true;
        j0Var.H0 = new cd(this, 0);
        showDialog(j0Var);
    }

    public final void g0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f35463v0);
        }
        if (this.f35438b != null) {
            ValueAnimator valueAnimator = this.f35465w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f35438b.f27132c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f35465w0 = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 4));
            ValueAnimator valueAnimator2 = this.f35465w0;
            float f12 = this.f35438b.f27132c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f35465w0.setInterpolator(org.telegram.ui.Components.qr.f27423f);
            this.f35465w0.start();
        }
    }

    @Override
    public final dv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f35440c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f18836d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.i6.f18780a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19113s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19168v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19132t8));
        org.telegram.ui.Components.ju juVar = this.f35440c;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(juVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.ju juVar2 = this.f35440c;
        int i12 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(juVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.ju juVar3 = this.f35440c;
        int i13 = org.telegram.ui.ActionBar.i6.f18964k6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(juVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.ju juVar4 = this.f35440c;
        int i14 = org.telegram.ui.ActionBar.i6.f18982l6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(juVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35464w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35464w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35464w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35464w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.i6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.a7 a7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.i6.f18800b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(a7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.i6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.V, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.G, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.H, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.x1 x1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.i6.f19056p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(x1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.i6.f19184w6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35443e0, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.i6.f18926i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.O, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35446g0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f18908h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.i6.f18891g7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.i6.f18909h7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.i6.f19237z6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Q, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.i6.f19218y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.f19086r0, eVar, org.telegram.ui.ActionBar.i6.J7));
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
        if (!this.f35437a0 && !this.f35449j0) {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.e9 e9Var = this.S;
            int i17 = org.telegram.ui.ActionBar.i6.f19056p7;
            e9Var.setTag(Integer.valueOf(i17));
            this.S.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f35442d0) {
                this.f35446g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.e9 e9Var2 = this.S;
                e9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(e9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f18800b7));
                this.f35443e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.e9 e9Var3 = this.S;
                e9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(e9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f18800b7));
                this.f35446g0.setVisibility(8);
                this.L.setVisibility(0);
                this.f35443e0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.e9 e9Var4 = this.S;
            int i18 = org.telegram.ui.ActionBar.i6.B6;
            e9Var4.setTag(Integer.valueOf(i18));
            this.S.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i18, false));
            this.d.setVisibility(0);
            this.f35443e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.e9 e9Var5 = this.S;
            e9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(e9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f18800b7));
            this.M.setVisibility(0);
            this.f35446g0.setVisibility(8);
            if (this.I) {
                org.telegram.ui.Cells.e9 e9Var6 = this.S;
                if (this.f35437a0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                e9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.l4 l4Var = this.V;
                if (this.f35437a0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                l4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.e9 e9Var7 = this.S;
                if (this.f35437a0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                e9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.l4 l4Var2 = this.V;
                if (this.f35437a0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                l4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.N;
            if (this.f35437a0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.O;
            if (this.f35437a0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.M;
            if (this.f35437a0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.v80 v80Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f35441c0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            v80Var.setLink(str);
            org.telegram.ui.Cells.x1 x1Var = this.U;
            if (!this.f35437a0 && x1Var.length() != 0) {
                i16 = 0;
            }
            x1Var.setVisibility(i16);
        }
        this.Q.a(!this.f35437a0);
        this.R.a(this.f35437a0);
        this.f35464w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f35464w);
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
        org.telegram.ui.Components.ju juVar = this.f35440c;
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
        if (this.f35447h0 == 1 && !this.f35439b0 && this.f35441c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j3 = this.f35448i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull != null) {
                this.f35441c0 = chatFull.exported_invite;
            }
            if (this.f35441c0 == null) {
                this.f35439b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new bd(this, 3));
            }
        }
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.f28283a = this;
            u40Var.f28284b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f35460s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f35460s0.intValue(), true);
            this.f35460s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.u40 u40Var = this.v;
        if (u40Var != null) {
            u40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.ju juVar = this.f35440c;
        if (juVar != null) {
            juVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ju juVar = this.f35440c;
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
        org.telegram.ui.Components.ju juVar = this.f35440c;
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
        if (z10 && this.f35447h0 != 1) {
            this.f35440c.requestFocus();
            org.telegram.ui.Components.eu euVar = this.f35440c.f25422a;
            euVar.requestFocus();
            AndroidUtilities.showKeyboard(euVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f35447h0 == 0) {
            org.telegram.ui.Components.u40 u40Var = this.v;
            if (u40Var != null) {
                u40Var.f28286f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.ju juVar = this.f35440c;
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
        if (this.f35447h0 == 0) {
            org.telegram.ui.Components.u40 u40Var = this.v;
            if (u40Var != null && (str = u40Var.f28286f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.ju juVar = this.f35440c;
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
