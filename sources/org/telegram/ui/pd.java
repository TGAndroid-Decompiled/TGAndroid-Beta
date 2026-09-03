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
public final class pd extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.w40 {
    public String B;
    public LinearLayout C;
    public org.telegram.ui.Cells.l4 D;
    public EditTextBoldCursor E;
    public boolean F;
    public org.telegram.ui.Components.gj0 G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public LinearLayout L;
    public org.telegram.ui.Components.x80 M;
    public org.telegram.ui.Cells.h6 N;
    public org.telegram.ui.Cells.h6 O;
    public org.telegram.ui.Cells.z8 P;
    public TextView Q;
    public org.telegram.ui.Cells.w1 R;
    public org.telegram.ui.Cells.l4 S;
    public int T;
    public String U;
    public hc V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public TLRPC.TL_chatInviteExported Z;
    public org.telegram.ui.ActionBar.w0 f37075a;
    public boolean f37076a0;
    public org.telegram.ui.Components.lr f37077b;
    public org.telegram.ui.Cells.z8 f37078b0;
    public org.telegram.ui.Components.cu f37079c;
    public final ArrayList f37080c0;
    public org.telegram.ui.Cells.y6 d;
    public org.telegram.ui.Cells.r4 f37081d0;
    public nh.y3 e;
    public final int f37082e0;
    public eg.i0 f37083f;
    public final long f37084f0;
    public boolean f37085g0;
    public md h;
    public final Boolean f37086h0;
    public TLRPC.InputFile f37087i0;
    public TLRPC.InputFile f37088j0;
    public TLRPC.VideoSize f37089k0;
    public String f37090l0;
    public double m0;
    public AnimatorSet f37091n;
    public boolean f37092n0;
    public boolean f37093o0;
    public Integer f37094p0;
    public Utilities.Callback2 f37095q0;
    public nd f37096r;
    public org.telegram.ui.ActionBar.d2 f37097r0;
    public final org.telegram.ui.Components.z8 f37098s;
    public final gd f37099s0;
    public ValueAnimator f37100t0;
    public final org.telegram.ui.Components.x40 v;
    public EditTextBoldCursor f37101w;
    public TLRPC.FileLocation f37102x;
    public TLRPC.FileLocation f37103y;

    public pd(Bundle bundle) {
        super(bundle);
        this.f37080c0 = new ArrayList();
        this.f37085g0 = true;
        this.f37099s0 = new gd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f37082e0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f37086h0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f37098s = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            this.v = new org.telegram.ui.Components.x40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new fd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z4 = bundle.getBoolean("canCreatePublic", true);
            this.f37085g0 = z4;
            this.X = !z4;
            if (!z4 && !this.f37076a0) {
                this.f37076a0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new fd(this, 0));
            }
        }
        this.f37084f0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(pd pdVar, org.telegram.ui.ActionBar.d2 d2Var) {
        pdVar.f37093o0 = false;
        pdVar.f37092n0 = false;
        if (pdVar.f37094p0 != null) {
            ConnectionsManager.getInstance(pdVar.currentAccount).cancelRequest(pdVar.f37094p0.intValue(), true);
            pdVar.f37094p0 = null;
        }
        pdVar.g0(false);
        d2Var.dismiss();
    }

    public static void V(pd pdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(pdVar.currentAccount).sendRequest(tL_channels_updateUsername, new fd(pdVar, 1), 64);
    }

    public static void W(pd pdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(pdVar.currentAccount).getInputChannel(pdVar.f37084f0);
        pdVar.T = ConnectionsManager.getInstance(pdVar.currentAccount).sendRequest(tL_channels_checkUsername, new da(pdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(pd pdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(pdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(pdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new mg.w(12, pdVar, currentChannel));
        pdVar.showDialog(d2Var);
    }

    public static void Y(pd pdVar) {
        if (pdVar.f37097r0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pdVar.getParentActivity());
        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new c1(pdVar, 12));
        pdVar.f37097r0 = alertDialog$Builder.o();
    }

    @Override
    public final void D(float f10) {
        nd ndVar = this.f37096r;
        if (ndVar == null) {
            return;
        }
        ndVar.setProgress(f10);
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        nd ndVar = this.f37096r;
        if (ndVar == null) {
            return;
        }
        ndVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ed(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 0));
    }

    @Override
    public final View createView(Context context) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        float f11;
        int i15;
        float f12;
        float f13;
        int i16;
        float f14;
        float f15;
        int i17;
        float f16;
        float f17;
        float f18;
        float f19;
        int i18;
        int i19;
        int i20;
        pd pdVar = this;
        org.telegram.ui.Components.cu cuVar = pdVar.f37079c;
        if (cuVar != null) {
            cuVar.o();
        }
        pdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        pdVar.actionBar.setAllowOverlayTitle(true);
        pdVar.actionBar.setActionBarMenuOnItemClick(new kd(pdVar));
        org.telegram.ui.ActionBar.z n10 = pdVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.j6.f20202v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.lr lrVar = new org.telegram.ui.Components.lr(mutate, new org.telegram.ui.Components.qp(org.telegram.ui.ActionBar.j6.w0(null, i21, false)));
        pdVar.f37077b = lrVar;
        pdVar.f37075a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), lrVar);
        int i22 = pdVar.f37082e0;
        if (i22 == 0) {
            pdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            ld ldVar = new ld(0, context, pdVar);
            ldVar.setOnTouchListener(new oh.d(2));
            pdVar.fragmentView = ldVar;
            int i23 = org.telegram.ui.ActionBar.j6.f19881d6;
            ldVar.setTag(Integer.valueOf(i23));
            pdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            pdVar.H = linearLayout;
            linearLayout.setOrientation(1);
            ldVar.addView(pdVar.H, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            pdVar.H.addView(frameLayout, k7.b6.n(-1, -2));
            nh.y3 y3Var = new nh.y3(pdVar, context, 4);
            pdVar.e = y3Var;
            y3Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.z8 z8Var = pdVar.f37098s;
            z8Var.n(5L, null, null);
            pdVar.e.setImageDrawable(z8Var);
            nh.y3 y3Var2 = pdVar.e;
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i24 = i14 | 48;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 16.0f;
            }
            if (z10) {
                f11 = 16.0f;
            } else {
                f11 = 0.0f;
            }
            frameLayout.addView(y3Var2, k7.b6.d(64, 64.0f, i24, f10, 12.0f, f11, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            eg.i0 i0Var = new eg.i0(pdVar, context, paint, 1);
            pdVar.f37083f = i0Var;
            i0Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            eg.i0 i0Var2 = pdVar.f37083f;
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i25 = i15 | 48;
            if (z11) {
                f12 = 0.0f;
            } else {
                f12 = 16.0f;
            }
            if (z11) {
                f13 = 16.0f;
            } else {
                f13 = 0.0f;
            }
            frameLayout.addView(i0Var2, k7.b6.d(64, 64.0f, i25, f12, 12.0f, f13, 12.0f));
            pdVar.f37083f.setOnClickListener(new hd(pdVar, 1));
            pdVar.G = new org.telegram.ui.Components.gj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            md mdVar = new md(pdVar, context, 0);
            pdVar.h = mdVar;
            mdVar.setScaleType(ImageView.ScaleType.CENTER);
            pdVar.h.setAnimation(pdVar.G);
            pdVar.h.setEnabled(false);
            pdVar.h.setClickable(false);
            pdVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            md mdVar2 = pdVar.h;
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i26 = i16 | 48;
            if (z12) {
                f14 = 0.0f;
            } else {
                f14 = 15.0f;
            }
            if (z12) {
                f15 = 15.0f;
            } else {
                f15 = 0.0f;
            }
            frameLayout.addView(mdVar2, k7.b6.d(64, 64.0f, i26, f14, 12.0f, f15, 12.0f));
            nd ndVar = new nd(pdVar, context, 0);
            pdVar.f37096r = ndVar;
            ndVar.setSize(AndroidUtilities.dp(30.0f));
            pdVar.f37096r.setProgressColor(-1);
            pdVar.f37096r.setNoProgress(false);
            nd ndVar2 = pdVar.f37096r;
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i27 = i17 | 48;
            if (z13) {
                f16 = 0.0f;
            } else {
                f16 = 16.0f;
            }
            if (z13) {
                f17 = 16.0f;
            } else {
                f17 = 0.0f;
            }
            frameLayout.addView(ndVar2, k7.b6.d(64, 64.0f, i27, f16, 12.0f, f17, 12.0f));
            pdVar.e0(false, false);
            org.telegram.ui.Components.cu cuVar2 = new org.telegram.ui.Components.cu(context, ldVar, pdVar, 0, false, null);
            pdVar = pdVar;
            pdVar.f37079c = cuVar2;
            cuVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = pdVar.B;
            if (str != null) {
                pdVar.f37079c.setText(str);
                pdVar.B = null;
            }
            pdVar.f37079c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            pdVar.f37079c.getEditText().setSingleLine(true);
            pdVar.f37079c.getEditText().setImeOptions(5);
            pdVar.f37079c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(pdVar) {
                public final pd f34903b;

                {
                    this.f34903b = pdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            pd pdVar2 = this.f34903b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(pdVar2.f37079c.getEditText().getText())) {
                                    pdVar2.f37101w.requestFocus();
                                    return true;
                                }
                            } else {
                                pdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (w0Var = this.f34903b.f37075a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.cu cuVar3 = pdVar.f37079c;
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                f18 = 5.0f;
            } else {
                f18 = 96.0f;
            }
            if (z14) {
                f19 = 96.0f;
            } else {
                f19 = 5.0f;
            }
            frameLayout.addView(cuVar3, k7.b6.d(-1, -2.0f, 16, f18, 0.0f, f19, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            pdVar.f37101w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            pdVar.f37101w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = pdVar.f37101w;
            int i28 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i28, false));
            pdVar.f37101w.setBackgroundDrawable(null);
            pdVar.f37101w.setLineColors(pdVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20006k6), pdVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20024l6), pdVar.getThemedColor(org.telegram.ui.ActionBar.j6.f20097p7));
            pdVar.f37101w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = pdVar.f37101w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            pdVar.f37101w.setInputType(180225);
            pdVar.f37101w.setImeOptions(6);
            pdVar.f37101w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            pdVar.f37101w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            pdVar.f37101w.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i28, false));
            pdVar.f37101w.setCursorSize(AndroidUtilities.dp(20.0f));
            pdVar.f37101w.setCursorWidth(1.5f);
            pdVar.H.addView(pdVar.f37101w, k7.b6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            pdVar.f37101w.setOnEditorActionListener(new TextView.OnEditorActionListener(pdVar) {
                public final pd f34903b;

                {
                    this.f34903b = pdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            pd pdVar2 = this.f34903b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(pdVar2.f37079c.getEditText().getText())) {
                                    pdVar2.f37101w.requestFocus();
                                    return true;
                                }
                            } else {
                                pdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (w0Var = this.f34903b.f37075a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            pdVar.f37101w.addTextChangedListener(new od(0));
            TextView textView = new TextView(context);
            pdVar.Q = textView;
            textView.setTextSize(1, 15.0f);
            pdVar.Q.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
            TextView textView2 = pdVar.Q;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19);
            pdVar.Q.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = pdVar.H;
            TextView textView3 = pdVar.Q;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            linearLayout2.addView(textView3, k7.b6.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            pdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            pdVar.H = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(pdVar.H, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = pdVar.getMessagesController();
            long j10 = pdVar.f37084f0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z4 = true;
            } else {
                z4 = false;
            }
            pdVar.F = z4;
            org.telegram.ui.ActionBar.k kVar = pdVar.actionBar;
            if (z4) {
                i10 = R.string.GroupSettingsTitle;
            } else {
                i10 = R.string.ChannelSettingsTitle;
            }
            kVar.setTitle(LocaleController.getString(i10));
            View view = pdVar.fragmentView;
            int i29 = org.telegram.ui.ActionBar.j6.f19827a7;
            view.setTag(Integer.valueOf(i29));
            pdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i29, false));
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
            pdVar.D = l4Var;
            l4Var.setHeight(46);
            org.telegram.ui.Cells.l4 l4Var2 = pdVar.D;
            int i30 = org.telegram.ui.ActionBar.j6.f19881d6;
            l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            org.telegram.ui.Cells.l4 l4Var3 = pdVar.D;
            if (pdVar.F) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            l4Var3.setText(LocaleController.getString(i11));
            pdVar.H.addView(pdVar.D);
            LinearLayout linearLayout4 = new LinearLayout(context);
            pdVar.C = linearLayout4;
            linearLayout4.setOrientation(1);
            pdVar.C.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            pdVar.H.addView(pdVar.C, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
            pdVar.N = h6Var;
            h6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            Boolean bool = pdVar.f37086h0;
            if (bool != null && !bool.booleanValue()) {
                pdVar.X = true;
            }
            if (pdVar.F) {
                pdVar.N.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !pdVar.X);
            } else {
                pdVar.N.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !pdVar.X);
            }
            pdVar.N.setOnClickListener(new hd(pdVar, 2));
            if (bool == null || bool.booleanValue()) {
                pdVar.C.addView(pdVar.N, k7.b6.n(-1, -2));
            }
            org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
            pdVar.O = h6Var2;
            h6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            if (bool != null && bool.booleanValue()) {
                pdVar.X = false;
            }
            if (pdVar.F) {
                pdVar.O.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, pdVar.X);
            } else {
                pdVar.O.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, pdVar.X);
            }
            pdVar.O.setOnClickListener(new hd(pdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                pdVar.C.addView(pdVar.O, k7.b6.n(-1, -2));
            }
            org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (b) null);
            pdVar.d = y6Var;
            pdVar.H.addView(y6Var, k7.b6.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            pdVar.J = linearLayout5;
            linearLayout5.setOrientation(1);
            pdVar.J.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            pdVar.H.addView(pdVar.J, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.l4 l4Var4 = new org.telegram.ui.Cells.l4(context);
            pdVar.S = l4Var4;
            pdVar.J.addView(l4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            pdVar.K = linearLayout6;
            linearLayout6.setOrientation(0);
            pdVar.J.addView(pdVar.K, k7.b6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            pdVar.E = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(pdVar.currentAccount).linkPrefix + "/");
            pdVar.E.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = pdVar.E;
            int i31 = org.telegram.ui.ActionBar.j6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = pdVar.E;
            int i32 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i32, false));
            pdVar.E.setMaxLines(1);
            pdVar.E.setLines(1);
            pdVar.E.setEnabled(false);
            pdVar.E.setBackgroundDrawable(null);
            pdVar.E.setPadding(0, 0, 0, 0);
            pdVar.E.setSingleLine(true);
            pdVar.E.setInputType(163840);
            pdVar.E.setImeOptions(6);
            pdVar.K.addView(pdVar.E, k7.b6.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            pdVar.f37101w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            pdVar.f37101w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i31, false));
            pdVar.f37101w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i32, false));
            pdVar.f37101w.setMaxLines(1);
            pdVar.f37101w.setLines(1);
            pdVar.f37101w.setBackgroundDrawable(null);
            pdVar.f37101w.setPadding(0, 0, 0, 0);
            pdVar.f37101w.setSingleLine(true);
            pdVar.f37101w.setInputType(163872);
            pdVar.f37101w.setImeOptions(6);
            pdVar.f37101w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            pdVar.f37101w.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i32, false));
            pdVar.f37101w.setCursorSize(AndroidUtilities.dp(20.0f));
            pdVar.f37101w.setCursorWidth(1.5f);
            pdVar.K.addView(pdVar.f37101w, k7.b6.n(-1, 36));
            pdVar.f37101w.addTextChangedListener(new p0(pdVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            pdVar.L = linearLayout7;
            linearLayout7.setOrientation(1);
            pdVar.J.addView(pdVar.L, k7.b6.n(-1, -2));
            org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(context, pdVar, null, true, ChatObject.isChannel(pdVar.getMessagesController().getChat(Long.valueOf(j10))));
            pdVar.M = x80Var;
            x80Var.b(true);
            pdVar.M.d(0, null, false);
            pdVar.L.addView(pdVar.M);
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(pdVar, context, 3);
            pdVar.R = w1Var;
            w1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            pdVar.R.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
            pdVar.R.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.w1 w1Var2 = pdVar.R;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            w1Var2.setGravity(i12);
            pdVar.R.setVisibility(8);
            pdVar.R.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = pdVar.J;
            org.telegram.ui.Cells.w1 w1Var3 = pdVar.R;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout8.addView(w1Var3, k7.b6.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            pdVar.P = z8Var2;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.j6.f19846b7;
            z8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i33, i34));
            pdVar.H.addView(pdVar.P, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
            pdVar.f37081d0 = r4Var;
            pdVar.H.addView(r4Var, k7.b6.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            pdVar.I = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            pdVar.I.setOrientation(1);
            pdVar.H.addView(pdVar.I, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.z8 z8Var3 = new org.telegram.ui.Cells.z8(context);
            pdVar.f37078b0 = z8Var3;
            z8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i34));
            pdVar.H.addView(pdVar.f37078b0, k7.b6.n(-1, -2));
            pdVar.h0();
        }
        return pdVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.length() > 0) {
            this.R.setVisibility(0);
        } else {
            this.R.setVisibility(8);
        }
        hc hcVar = this.V;
        if (hcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(hcVar);
            this.V = null;
            this.U = null;
            if (this.T != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.T, true);
            }
        }
        this.W = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        this.R.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        org.telegram.ui.Cells.w1 w1Var = this.R;
                        int i11 = org.telegram.ui.ActionBar.j6.f20097p7;
                        w1Var.setTag(Integer.valueOf(i11));
                        this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.R.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.w1 w1Var2 = this.R;
                        int i12 = org.telegram.ui.ActionBar.j6.f20097p7;
                        w1Var2.setTag(Integer.valueOf(i12));
                        this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.R.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.w1 w1Var3 = this.R;
                int i13 = org.telegram.ui.ActionBar.j6.f20097p7;
                w1Var3.setTag(Integer.valueOf(i13));
                this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.R.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.w1 w1Var4 = this.R;
                int i14 = org.telegram.ui.ActionBar.j6.f20097p7;
                w1Var4.setTag(Integer.valueOf(i14));
                this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                return false;
            }
            this.R.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.w1 w1Var5 = this.R;
            int i15 = org.telegram.ui.ActionBar.j6.F6;
            w1Var5.setTag(Integer.valueOf(i15));
            this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.U = str;
            hc hcVar2 = new hc(3, this, str);
            this.V = hcVar2;
            AndroidUtilities.runOnUIThread(hcVar2, 300L);
            return true;
        }
        this.R.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.w1 w1Var6 = this.R;
        int i16 = org.telegram.ui.ActionBar.j6.f20097p7;
        w1Var6.setTag(Integer.valueOf(i16));
        this.R.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f37097r0;
            if (d2Var != null) {
                try {
                    d2Var.dismiss();
                    this.f37097r0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.f37093o0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.d2 d2Var2 = this.f37097r0;
            if (d2Var2 != null) {
                try {
                    d2Var2.dismiss();
                    this.f37097r0 = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f37085g0);
            Boolean bool = this.f37086h0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f37087i0 != null || this.f37088j0 != null || this.f37089k0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f37087i0, this.f37088j0, this.f37089k0, this.m0, this.f37090l0, this.f37102x, this.f37103y, null);
            }
            pd pdVar = new pd(bundle);
            pdVar.f37095q0 = this.f37095q0;
            presentFragment(pdVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.x40 x40Var = this.v;
        if (x40Var != null && x40Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.x40 x40Var = this.v;
        if ((x40Var == null || dialog != x40Var.f30468c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z4, boolean z10) {
        if (this.h == null) {
            return;
        }
        AnimatorSet animatorSet = this.f37091n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f37091n.cancel();
            this.f37091n = null;
        }
        if (z10) {
            this.f37091n = new AnimatorSet();
            if (z4) {
                this.f37096r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f37091n;
                md mdVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(mdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f37096r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f37091n;
                md mdVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(mdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f37096r, property2, 0.0f));
            }
            this.f37091n.setDuration(180L);
            this.f37091n.addListener(new dg.w2(19, this, z4));
            this.f37091n.start();
        } else if (z4) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f37096r.setAlpha(1.0f);
            this.f37096r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f37096r.setAlpha(0.0f);
            this.f37096r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        eg.v0 v0Var = new eg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.f5540s0 = true;
        v0Var.E0 = new gd(this, 0);
        showDialog(v0Var);
    }

    public final void g0(boolean z4) {
        float f10;
        if (!z4) {
            AndroidUtilities.cancelRunOnUIThread(this.f37099s0);
        }
        if (this.f37077b != null) {
            ValueAnimator valueAnimator = this.f37100t0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f37077b.f26868c;
            float f12 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f37100t0 = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 4));
            ValueAnimator valueAnimator2 = this.f37100t0;
            float f13 = this.f37077b.f26868c;
            if (z4) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.f37100t0.setInterpolator(org.telegram.ui.Components.mr.f27122f);
            this.f37100t0.start();
        }
    }

    @Override
    public final qu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f37079c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        org.telegram.ui.Components.cu cuVar = this.f37079c;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(cuVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.cu cuVar2 = this.f37079c;
        int i12 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(cuVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.cu cuVar3 = this.f37079c;
        int i13 = org.telegram.ui.ActionBar.j6.f20006k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(cuVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.cu cuVar4 = this.f37079c;
        int i14 = org.telegram.ui.ActionBar.j6.f20024l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(cuVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37101w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37101w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37101w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37101w, 65568, null, null, null, null, i14));
        TextView textView = this.Q;
        int i15 = org.telegram.ui.ActionBar.j6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.C, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.J, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.y6 y6Var = this.d;
        int i16 = org.telegram.ui.ActionBar.j6.f19846b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y6Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.D, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.w1 w1Var = this.R;
        int i18 = org.telegram.ui.ActionBar.j6.f20097p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 262148, null, null, null, null, org.telegram.ui.ActionBar.j6.f20219w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.P, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37078b0, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.L;
        int i19 = org.telegram.ui.ActionBar.j6.f19971i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37081d0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19953h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.f19936g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.j6.f19954h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.j6.f20273z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 4, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.j6.f20256y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.I, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f20126r0, fVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
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
        if (!this.X && !this.f37085g0) {
            this.P.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.z8 z8Var = this.P;
            int i17 = org.telegram.ui.ActionBar.j6.f20097p7;
            z8Var.setTag(Integer.valueOf(i17));
            this.P.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
            this.J.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f37076a0) {
                this.f37081d0.setVisibility(0);
                this.I.setVisibility(8);
                org.telegram.ui.Cells.z8 z8Var2 = this.P;
                z8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(z8Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
                this.f37078b0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.z8 z8Var3 = this.P;
                z8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(z8Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19846b7));
                this.f37081d0.setVisibility(8);
                this.I.setVisibility(0);
                this.f37078b0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var4 = this.P;
            int i18 = org.telegram.ui.ActionBar.j6.B6;
            z8Var4.setTag(Integer.valueOf(i18));
            this.P.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            this.d.setVisibility(0);
            this.f37078b0.setVisibility(8);
            this.I.setVisibility(8);
            org.telegram.ui.Cells.z8 z8Var5 = this.P;
            z8Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(z8Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
            this.J.setVisibility(0);
            this.f37081d0.setVisibility(8);
            if (this.F) {
                org.telegram.ui.Cells.z8 z8Var6 = this.P;
                if (this.X) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                z8Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.l4 l4Var = this.S;
                if (this.X) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                l4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.z8 z8Var7 = this.P;
                if (this.X) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                z8Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.l4 l4Var2 = this.S;
                if (this.X) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                l4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.K;
            if (this.X) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.L;
            if (this.X) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.J;
            if (this.X) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.x80 x80Var = this.M;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.Z;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            x80Var.setLink(str);
            org.telegram.ui.Cells.w1 w1Var = this.R;
            if (!this.X && w1Var.length() != 0) {
                i16 = 0;
            }
            w1Var.setVisibility(i16);
        }
        this.N.a(!this.X);
        this.O.a(this.X);
        this.f37101w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f37101w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.x40 x40Var = this.v;
        if (x40Var != null) {
            x40Var.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.cu cuVar = this.f37079c;
        if (cuVar == null || !cuVar.e) {
            return true;
        }
        if (z4) {
            cuVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f37082e0 == 1 && !this.Y && this.Z == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f37084f0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.Z = chatFull.exported_invite;
            }
            if (this.Z == null) {
                this.Y = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new fd(this, 3));
            }
        }
        org.telegram.ui.Components.x40 x40Var = this.v;
        if (x40Var != null) {
            x40Var.f30466a = this;
            x40Var.f30467b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f37094p0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f37094p0.intValue(), true);
            this.f37094p0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.x40 x40Var = this.v;
        if (x40Var != null) {
            x40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.cu cuVar = this.f37079c;
        if (cuVar != null) {
            cuVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.cu cuVar = this.f37079c;
        if (cuVar != null) {
            cuVar.r();
        }
        org.telegram.ui.Components.x40 x40Var = this.v;
        if (x40Var != null) {
            x40Var.j();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.x40 x40Var = this.v;
        if (x40Var != null) {
            x40Var.k(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.cu cuVar = this.f37079c;
        if (cuVar != null) {
            cuVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.x40 x40Var = this.v;
        if (x40Var != null) {
            x40Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && this.f37082e0 != 1) {
            this.f37079c.requestFocus();
            org.telegram.ui.Components.xt xtVar = this.f37079c.f24030a;
            xtVar.requestFocus();
            AndroidUtilities.showKeyboard(xtVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f37082e0 == 0) {
            org.telegram.ui.Components.x40 x40Var = this.v;
            if (x40Var != null) {
                x40Var.f30469f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.cu cuVar = this.f37079c;
                if (cuVar != null) {
                    cuVar.setText(string);
                } else {
                    this.B = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f37082e0 == 0) {
            org.telegram.ui.Components.x40 x40Var = this.v;
            if (x40Var != null && (str = x40Var.f30469f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.cu cuVar = this.f37079c;
            if (cuVar != null) {
                String obj = cuVar.getText().toString();
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
