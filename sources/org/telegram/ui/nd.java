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
public final class nd extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.x40 {
    public String B;
    public LinearLayout C;
    public org.telegram.ui.Cells.m4 D;
    public EditTextBoldCursor E;
    public boolean F;
    public org.telegram.ui.Components.ij0 G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public LinearLayout L;
    public org.telegram.ui.Components.y80 M;
    public org.telegram.ui.Cells.i6 N;
    public org.telegram.ui.Cells.i6 O;
    public org.telegram.ui.Cells.a9 P;
    public TextView Q;
    public org.telegram.ui.Cells.x1 R;
    public org.telegram.ui.Cells.m4 S;
    public int T;
    public String U;
    public fc V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public TLRPC.TL_chatInviteExported Z;
    public org.telegram.ui.ActionBar.w0 f39383a;
    public boolean f39384a0;
    public org.telegram.ui.Components.or f39385b;
    public org.telegram.ui.Cells.a9 f39386b0;
    public org.telegram.ui.Components.fu f39387c;
    public final ArrayList f39388c0;
    public org.telegram.ui.Cells.z6 d;
    public org.telegram.ui.Cells.s4 f39389d0;
    public oh.a4 f39390e;
    public final int f39391e0;
    public fg.i0 f39392f;
    public final long f39393f0;
    public boolean f39394g0;
    public kd h;
    public final Boolean f39395h0;
    public TLRPC.InputFile f39396i0;
    public TLRPC.InputFile f39397j0;
    public TLRPC.VideoSize f39398k0;
    public String f39399l0;
    public double m0;
    public AnimatorSet f39400n;
    public boolean f39401n0;
    public boolean f39402o0;
    public Integer f39403p0;
    public Utilities.Callback2 f39404q0;
    public ld f39405r;
    public org.telegram.ui.ActionBar.d2 f39406r0;
    public final org.telegram.ui.Components.z8 f39407s;
    public final ed f39408s0;
    public ValueAnimator f39409t0;
    public final org.telegram.ui.Components.y40 v;
    public EditTextBoldCursor f39410w;
    public TLRPC.FileLocation f39411x;
    public TLRPC.FileLocation f39412y;

    public nd(Bundle bundle) {
        super(bundle);
        this.f39388c0 = new ArrayList();
        this.f39394g0 = true;
        this.f39408s0 = new ed(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f39391e0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f39395h0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f39407s = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
            this.v = new org.telegram.ui.Components.y40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new dd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z4 = bundle.getBoolean("canCreatePublic", true);
            this.f39394g0 = z4;
            this.X = !z4;
            if (!z4 && !this.f39384a0) {
                this.f39384a0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new dd(this, 0));
            }
        }
        this.f39393f0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(nd ndVar, org.telegram.ui.ActionBar.d2 d2Var) {
        ndVar.f39402o0 = false;
        ndVar.f39401n0 = false;
        if (ndVar.f39403p0 != null) {
            ConnectionsManager.getInstance(ndVar.currentAccount).cancelRequest(ndVar.f39403p0.intValue(), true);
            ndVar.f39403p0 = null;
        }
        ndVar.g0(false);
        d2Var.dismiss();
    }

    public static void V(nd ndVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_updateUsername, new dd(ndVar, 1), 64);
    }

    public static void W(nd ndVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(ndVar.currentAccount).getInputChannel(ndVar.f39393f0);
        ndVar.T = ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_checkUsername, new ba(ndVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(nd ndVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ng.w(12, ndVar, currentChannel));
        ndVar.showDialog(d2Var);
    }

    public static void Y(nd ndVar) {
        if (ndVar.f39406r0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new a1(ndVar, 12));
        ndVar.f39406r0 = alertDialog$Builder.o();
    }

    @Override
    public final void D(float f10) {
        ld ldVar = this.f39405r;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f10);
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        ld ldVar = this.f39405r;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 0));
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
        nd ndVar = this;
        org.telegram.ui.Components.fu fuVar = ndVar.f39387c;
        if (fuVar != null) {
            fuVar.o();
        }
        ndVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ndVar.actionBar.setAllowOverlayTitle(true);
        ndVar.actionBar.setActionBarMenuOnItemClick(new id(ndVar));
        org.telegram.ui.ActionBar.z n10 = ndVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.k6.f21981v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.k6.w0(null, i21, false)));
        ndVar.f39385b = orVar;
        ndVar.f39383a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), orVar);
        int i22 = ndVar.f39391e0;
        if (i22 == 0) {
            ndVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            jd jdVar = new jd(0, context, ndVar);
            jdVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
            ndVar.fragmentView = jdVar;
            int i23 = org.telegram.ui.ActionBar.k6.f21659d6;
            jdVar.setTag(Integer.valueOf(i23));
            ndVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            ndVar.H = linearLayout;
            linearLayout.setOrientation(1);
            jdVar.addView(ndVar.H, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            ndVar.H.addView(frameLayout, k7.c6.n(-1, -2));
            oh.a4 a4Var = new oh.a4(ndVar, context, 4);
            ndVar.f39390e = a4Var;
            a4Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.z8 z8Var = ndVar.f39407s;
            z8Var.n(5L, null, null);
            ndVar.f39390e.setImageDrawable(z8Var);
            oh.a4 a4Var2 = ndVar.f39390e;
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
            frameLayout.addView(a4Var2, k7.c6.d(64, 64.0f, i24, f10, 12.0f, f11, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            fg.i0 i0Var = new fg.i0(ndVar, context, paint, 1);
            ndVar.f39392f = i0Var;
            i0Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            fg.i0 i0Var2 = ndVar.f39392f;
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
            frameLayout.addView(i0Var2, k7.c6.d(64, 64.0f, i25, f12, 12.0f, f13, 12.0f));
            ndVar.f39392f.setOnClickListener(new fd(ndVar, 1));
            int i26 = R.raw.camera;
            ndVar.G = new org.telegram.ui.Components.ij0(i26, "" + R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            kd kdVar = new kd(ndVar, context, 0);
            ndVar.h = kdVar;
            kdVar.setScaleType(ImageView.ScaleType.CENTER);
            ndVar.h.setAnimation(ndVar.G);
            ndVar.h.setEnabled(false);
            ndVar.h.setClickable(false);
            ndVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            kd kdVar2 = ndVar.h;
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i27 = i16 | 48;
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
            frameLayout.addView(kdVar2, k7.c6.d(64, 64.0f, i27, f14, 12.0f, f15, 12.0f));
            ld ldVar = new ld(ndVar, context, 0);
            ndVar.f39405r = ldVar;
            ldVar.setSize(AndroidUtilities.dp(30.0f));
            ndVar.f39405r.setProgressColor(-1);
            ndVar.f39405r.setNoProgress(false);
            ld ldVar2 = ndVar.f39405r;
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i28 = i17 | 48;
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
            frameLayout.addView(ldVar2, k7.c6.d(64, 64.0f, i28, f16, 12.0f, f17, 12.0f));
            ndVar.e0(false, false);
            org.telegram.ui.Components.fu fuVar2 = new org.telegram.ui.Components.fu(context, jdVar, this, 0, false, null);
            ndVar = this;
            ndVar.f39387c = fuVar2;
            fuVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = ndVar.B;
            if (str != null) {
                ndVar.f39387c.setText(str);
                ndVar.B = null;
            }
            ndVar.f39387c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            ndVar.f39387c.getEditText().setSingleLine(true);
            ndVar.f39387c.getEditText().setImeOptions(5);
            ndVar.f39387c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) {
                public final nd f37160b;

                {
                    this.f37160b = ndVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i29, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            nd ndVar2 = this.f37160b;
                            if (i29 == 5) {
                                if (!TextUtils.isEmpty(ndVar2.f39387c.getEditText().getText())) {
                                    ndVar2.f39410w.requestFocus();
                                    return true;
                                }
                            } else {
                                ndVar2.getClass();
                            }
                            return false;
                        default:
                            if (i29 == 6 && (w0Var = this.f37160b.f39383a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.fu fuVar3 = ndVar.f39387c;
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
            frameLayout.addView(fuVar3, k7.c6.d(-1, -2.0f, 16, f18, 0.0f, f19, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            ndVar.f39410w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            ndVar.f39410w.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = ndVar.f39410w;
            int i29 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i29, false));
            ndVar.f39410w.setBackgroundDrawable(null);
            ndVar.f39410w.setLineColors(ndVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21785k6), ndVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21803l6), ndVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21876p7));
            ndVar.f39410w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = ndVar.f39410w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            ndVar.f39410w.setInputType(180225);
            ndVar.f39410w.setImeOptions(6);
            ndVar.f39410w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            ndVar.f39410w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            ndVar.f39410w.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i29, false));
            ndVar.f39410w.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.f39410w.setCursorWidth(1.5f);
            ndVar.H.addView(ndVar.f39410w, k7.c6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            ndVar.f39410w.setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) {
                public final nd f37160b;

                {
                    this.f37160b = ndVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i292, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            nd ndVar2 = this.f37160b;
                            if (i292 == 5) {
                                if (!TextUtils.isEmpty(ndVar2.f39387c.getEditText().getText())) {
                                    ndVar2.f39410w.requestFocus();
                                    return true;
                                }
                            } else {
                                ndVar2.getClass();
                            }
                            return false;
                        default:
                            if (i292 == 6 && (w0Var = this.f37160b.f39383a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            ndVar.f39410w.addTextChangedListener(new md(0));
            TextView textView = new TextView(context);
            ndVar.Q = textView;
            textView.setTextSize(1, 15.0f);
            ndVar.Q.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.F6, false));
            TextView textView2 = ndVar.Q;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19);
            ndVar.Q.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = ndVar.H;
            TextView textView3 = ndVar.Q;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            linearLayout2.addView(textView3, k7.c6.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            ndVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            ndVar.H = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(ndVar.H, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = ndVar.getMessagesController();
            long j10 = ndVar.f39393f0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z4 = true;
            } else {
                z4 = false;
            }
            ndVar.F = z4;
            org.telegram.ui.ActionBar.k kVar = ndVar.actionBar;
            if (z4) {
                i10 = R.string.GroupSettingsTitle;
            } else {
                i10 = R.string.ChannelSettingsTitle;
            }
            kVar.setTitle(LocaleController.getString(i10));
            View view = ndVar.fragmentView;
            int i30 = org.telegram.ui.ActionBar.k6.f21605a7;
            view.setTag(Integer.valueOf(i30));
            ndVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i30, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            ndVar.D = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = ndVar.D;
            int i31 = org.telegram.ui.ActionBar.k6.f21659d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i31, false));
            org.telegram.ui.Cells.m4 m4Var3 = ndVar.D;
            if (ndVar.F) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            m4Var3.setText(LocaleController.getString(i11));
            ndVar.H.addView(ndVar.D);
            LinearLayout linearLayout4 = new LinearLayout(context);
            ndVar.C = linearLayout4;
            linearLayout4.setOrientation(1);
            ndVar.C.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i31, false));
            ndVar.H.addView(ndVar.C, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
            ndVar.N = i6Var;
            i6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
            Boolean bool = ndVar.f39395h0;
            if (bool != null && !bool.booleanValue()) {
                ndVar.X = true;
            }
            if (ndVar.F) {
                ndVar.N.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !ndVar.X);
            } else {
                ndVar.N.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !ndVar.X);
            }
            ndVar.N.setOnClickListener(new fd(ndVar, 2));
            if (bool == null || bool.booleanValue()) {
                ndVar.C.addView(ndVar.N, k7.c6.n(-1, -2));
            }
            org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
            ndVar.O = i6Var2;
            i6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
            if (bool != null && bool.booleanValue()) {
                ndVar.X = false;
            }
            if (ndVar.F) {
                ndVar.O.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, ndVar.X);
            } else {
                ndVar.O.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, ndVar.X);
            }
            ndVar.O.setOnClickListener(new fd(ndVar, 3));
            if (bool == null || !bool.booleanValue()) {
                ndVar.C.addView(ndVar.O, k7.c6.n(-1, -2));
            }
            org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
            ndVar.d = z6Var;
            ndVar.H.addView(z6Var, k7.c6.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            ndVar.J = linearLayout5;
            linearLayout5.setOrientation(1);
            ndVar.J.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i31, false));
            ndVar.H.addView(ndVar.J, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
            ndVar.S = m4Var4;
            ndVar.J.addView(m4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            ndVar.K = linearLayout6;
            linearLayout6.setOrientation(0);
            ndVar.J.addView(ndVar.K, k7.c6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            ndVar.E = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/");
            ndVar.E.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = ndVar.E;
            int i32 = org.telegram.ui.ActionBar.k6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i32, false));
            EditTextBoldCursor editTextBoldCursor6 = ndVar.E;
            int i33 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i33, false));
            ndVar.E.setMaxLines(1);
            ndVar.E.setLines(1);
            ndVar.E.setEnabled(false);
            ndVar.E.setBackgroundDrawable(null);
            ndVar.E.setPadding(0, 0, 0, 0);
            ndVar.E.setSingleLine(true);
            ndVar.E.setInputType(163840);
            ndVar.E.setImeOptions(6);
            ndVar.K.addView(ndVar.E, k7.c6.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            ndVar.f39410w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            ndVar.f39410w.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i32, false));
            ndVar.f39410w.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i33, false));
            ndVar.f39410w.setMaxLines(1);
            ndVar.f39410w.setLines(1);
            ndVar.f39410w.setBackgroundDrawable(null);
            ndVar.f39410w.setPadding(0, 0, 0, 0);
            ndVar.f39410w.setSingleLine(true);
            ndVar.f39410w.setInputType(163872);
            ndVar.f39410w.setImeOptions(6);
            ndVar.f39410w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            ndVar.f39410w.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i33, false));
            ndVar.f39410w.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.f39410w.setCursorWidth(1.5f);
            ndVar.K.addView(ndVar.f39410w, k7.c6.n(-1, 36));
            ndVar.f39410w.addTextChangedListener(new n0(ndVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            ndVar.L = linearLayout7;
            linearLayout7.setOrientation(1);
            ndVar.J.addView(ndVar.L, k7.c6.n(-1, -2));
            org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, ndVar, null, true, ChatObject.isChannel(ndVar.getMessagesController().getChat(Long.valueOf(j10))));
            ndVar.M = y80Var;
            y80Var.b(true);
            ndVar.M.d(0, null, false);
            ndVar.L.addView(ndVar.M);
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(ndVar, context, 3);
            ndVar.R = x1Var;
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
            ndVar.R.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.K6, false));
            ndVar.R.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.x1 x1Var2 = ndVar.R;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            x1Var2.setGravity(i12);
            ndVar.R.setVisibility(8);
            ndVar.R.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = ndVar.J;
            org.telegram.ui.Cells.x1 x1Var3 = ndVar.R;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout8.addView(x1Var3, k7.c6.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            ndVar.P = a9Var;
            int i34 = R.drawable.greydivider_bottom;
            int i35 = org.telegram.ui.ActionBar.k6.f21624b7;
            a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i34, i35));
            ndVar.H.addView(ndVar.P, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            ndVar.f39389d0 = s4Var;
            ndVar.H.addView(s4Var, k7.c6.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            ndVar.I = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i31, false));
            ndVar.I.setOrientation(1);
            ndVar.H.addView(ndVar.I, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            ndVar.f39386b0 = a9Var2;
            a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i35));
            ndVar.H.addView(ndVar.f39386b0, k7.c6.n(-1, -2));
            ndVar.h0();
        }
        return ndVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.length() > 0) {
            this.R.setVisibility(0);
        } else {
            this.R.setVisibility(8);
        }
        fc fcVar = this.V;
        if (fcVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fcVar);
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
                        org.telegram.ui.Cells.x1 x1Var = this.R;
                        int i11 = org.telegram.ui.ActionBar.k6.f21876p7;
                        x1Var.setTag(Integer.valueOf(i11));
                        this.R.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.R.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.x1 x1Var2 = this.R;
                        int i12 = org.telegram.ui.ActionBar.k6.f21876p7;
                        x1Var2.setTag(Integer.valueOf(i12));
                        this.R.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.R.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.x1 x1Var3 = this.R;
                int i13 = org.telegram.ui.ActionBar.k6.f21876p7;
                x1Var3.setTag(Integer.valueOf(i13));
                this.R.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.R.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.x1 x1Var4 = this.R;
                int i14 = org.telegram.ui.ActionBar.k6.f21876p7;
                x1Var4.setTag(Integer.valueOf(i14));
                this.R.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
                return false;
            }
            this.R.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.x1 x1Var5 = this.R;
            int i15 = org.telegram.ui.ActionBar.k6.F6;
            x1Var5.setTag(Integer.valueOf(i15));
            this.R.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
            this.U = str;
            fc fcVar2 = new fc(3, this, str);
            this.V = fcVar2;
            AndroidUtilities.runOnUIThread(fcVar2, 300L);
            return true;
        }
        this.R.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.x1 x1Var6 = this.R;
        int i16 = org.telegram.ui.ActionBar.k6.f21876p7;
        x1Var6.setTag(Integer.valueOf(i16));
        this.R.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f39406r0;
            if (d2Var != null) {
                try {
                    d2Var.dismiss();
                    this.f39406r0 = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            g0(false);
            this.f39402o0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.d2 d2Var2 = this.f39406r0;
            if (d2Var2 != null) {
                try {
                    d2Var2.dismiss();
                    this.f39406r0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f39394g0);
            Boolean bool = this.f39395h0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f39396i0 != null || this.f39397j0 != null || this.f39398k0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f39396i0, this.f39397j0, this.f39398k0, this.m0, this.f39399l0, this.f39411x, this.f39412y, null);
            }
            nd ndVar = new nd(bundle);
            ndVar.f39404q0 = this.f39404q0;
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
        if ((y40Var == null || dialog != y40Var.f33296c) && super.dismissDialogOnPause(dialog)) {
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
        AnimatorSet animatorSet = this.f39400n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f39400n.cancel();
            this.f39400n = null;
        }
        if (z10) {
            this.f39400n = new AnimatorSet();
            if (z4) {
                this.f39405r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f39400n;
                kd kdVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f39405r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39400n;
                kd kdVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f39405r, property2, 0.0f));
            }
            this.f39400n.setDuration(180L);
            this.f39400n.addListener(new eg.u2(17, this, z4));
            this.f39400n.start();
        } else if (z4) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f39405r.setAlpha(1.0f);
            this.f39405r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f39405r.setAlpha(0.0f);
            this.f39405r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        fg.v0 v0Var = new fg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.f6598s0 = true;
        v0Var.E0 = new ed(this, 0);
        showDialog(v0Var);
    }

    public final void g0(boolean z4) {
        float f10;
        if (!z4) {
            AndroidUtilities.cancelRunOnUIThread(this.f39408s0);
        }
        if (this.f39385b != null) {
            ValueAnimator valueAnimator = this.f39409t0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f39385b.f29840c;
            float f12 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f39409t0 = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 4));
            ValueAnimator valueAnimator2 = this.f39409t0;
            float f13 = this.f39385b.f29840c;
            if (z4) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.f39409t0.setInterpolator(org.telegram.ui.Components.pr.f30183f);
            this.f39409t0.start();
        }
    }

    @Override
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f39387c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        org.telegram.ui.Components.fu fuVar = this.f39387c;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fuVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.fu fuVar2 = this.f39387c;
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fuVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.fu fuVar3 = this.f39387c;
        int i13 = org.telegram.ui.ActionBar.k6.f21785k6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fuVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.fu fuVar4 = this.f39387c;
        int i14 = org.telegram.ui.ActionBar.k6.f21803l6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fuVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39410w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39410w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39410w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39410w, 65568, null, null, null, null, i14));
        TextView textView = this.Q;
        int i15 = org.telegram.ui.ActionBar.k6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.J, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.z6 z6Var = this.d;
        int i16 = org.telegram.ui.ActionBar.k6.f21624b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(z6Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.k6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.S, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.D, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.x1 x1Var = this.R;
        int i18 = org.telegram.ui.ActionBar.k6.f21876p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(x1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 262148, null, null, null, null, org.telegram.ui.ActionBar.k6.f21998w6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39386b0, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.L;
        int i19 = org.telegram.ui.ActionBar.k6.f21750i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.L, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39389d0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21732h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.k6.f21715g7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.k6.f21733h7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.k6.f22053z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.k6.f22036y6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, org.telegram.ui.ActionBar.k6.f21906r0, fVar, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
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
        if (!this.X && !this.f39394g0) {
            this.P.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.a9 a9Var = this.P;
            int i17 = org.telegram.ui.ActionBar.k6.f21876p7;
            a9Var.setTag(Integer.valueOf(i17));
            this.P.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
            this.J.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f39384a0) {
                this.f39389d0.setVisibility(0);
                this.I.setVisibility(8);
                org.telegram.ui.Cells.a9 a9Var2 = this.P;
                a9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(a9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
                this.f39386b0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.a9 a9Var3 = this.P;
                a9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(a9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21624b7));
                this.f39389d0.setVisibility(8);
                this.I.setVisibility(0);
                this.f39386b0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var4 = this.P;
            int i18 = org.telegram.ui.ActionBar.k6.B6;
            a9Var4.setTag(Integer.valueOf(i18));
            this.P.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i18, false));
            this.d.setVisibility(0);
            this.f39386b0.setVisibility(8);
            this.I.setVisibility(8);
            org.telegram.ui.Cells.a9 a9Var5 = this.P;
            a9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(a9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
            this.J.setVisibility(0);
            this.f39389d0.setVisibility(8);
            if (this.F) {
                org.telegram.ui.Cells.a9 a9Var6 = this.P;
                if (this.X) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                a9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.m4 m4Var = this.S;
                if (this.X) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.a9 a9Var7 = this.P;
                if (this.X) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                a9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.m4 m4Var2 = this.S;
                if (this.X) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                m4Var2.setText(LocaleController.getString(i11));
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
            org.telegram.ui.Components.y80 y80Var = this.M;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.Z;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            y80Var.setLink(str);
            org.telegram.ui.Cells.x1 x1Var = this.R;
            if (!this.X && x1Var.length() != 0) {
                i16 = 0;
            }
            x1Var.setVisibility(i16);
        }
        this.N.a(!this.X);
        this.O.a(this.X);
        this.f39410w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f39410w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null) {
            y40Var.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.fu fuVar = this.f39387c;
        if (fuVar == null || !fuVar.f27004e) {
            return true;
        }
        if (z4) {
            fuVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f39391e0 == 1 && !this.Y && this.Z == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f39393f0;
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new dd(this, 3));
            }
        }
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null) {
            y40Var.f33294a = this;
            y40Var.f33295b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f39403p0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39403p0.intValue(), true);
            this.f39403p0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null) {
            y40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.fu fuVar = this.f39387c;
        if (fuVar != null) {
            fuVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.fu fuVar = this.f39387c;
        if (fuVar != null) {
            fuVar.r();
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
        org.telegram.ui.Components.fu fuVar = this.f39387c;
        if (fuVar != null) {
            fuVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.y40 y40Var = this.v;
        if (y40Var != null) {
            y40Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && this.f39391e0 != 1) {
            this.f39387c.requestFocus();
            org.telegram.ui.Components.au auVar = this.f39387c.f27001a;
            auVar.requestFocus();
            AndroidUtilities.showKeyboard(auVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f39391e0 == 0) {
            org.telegram.ui.Components.y40 y40Var = this.v;
            if (y40Var != null) {
                y40Var.f33298f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.fu fuVar = this.f39387c;
                if (fuVar != null) {
                    fuVar.setText(string);
                } else {
                    this.B = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f39391e0 == 0) {
            org.telegram.ui.Components.y40 y40Var = this.v;
            if (y40Var != null && (str = y40Var.f33298f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.fu fuVar = this.f39387c;
            if (fuVar != null) {
                String obj = fuVar.getText().toString();
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
