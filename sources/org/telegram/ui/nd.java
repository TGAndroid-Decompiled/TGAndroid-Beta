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
public final class nd extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.m4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.hj0 J;
    public LinearLayout K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public org.telegram.ui.Components.f90 P;
    public org.telegram.ui.Cells.k6 Q;
    public org.telegram.ui.Cells.k6 R;
    public org.telegram.ui.Cells.f9 S;
    public TextView T;
    public org.telegram.ui.Cells.x1 U;
    public org.telegram.ui.Cells.m4 V;
    public int W;
    public String X;
    public n Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.w0 f35218a;
    public boolean f35219a0;
    public org.telegram.ui.Components.vr f35220b;
    public boolean f35221b0;
    public org.telegram.ui.Components.nu f35222c;
    public TLRPC.TL_chatInviteExported f35223c0;
    public org.telegram.ui.Cells.c7 d;
    public boolean f35224d0;
    public gg.i1 e;
    public org.telegram.ui.Cells.f9 f35225e0;
    public bi.s7 f35226f;
    public final ArrayList f35227f0;
    public org.telegram.ui.Cells.s4 f35228g0;
    public kd h;
    public final int f35229h0;
    public final long f35230i0;
    public boolean f35231j0;
    public final Boolean f35232k0;
    public TLRPC.InputFile f35233l0;
    public TLRPC.InputFile m0;
    public AnimatorSet f35234n;
    public TLRPC.VideoSize f35235n0;
    public String f35236o0;
    public double f35237p0;
    public boolean f35238q0;
    public ld f35239r;
    public boolean f35240r0;
    public final org.telegram.ui.Components.g9 f35241s;
    public Integer f35242s0;
    public Utilities.Callback2 f35243t0;
    public org.telegram.ui.ActionBar.d2 f35244u0;
    public final org.telegram.ui.Components.e50 v;
    public final ed f35245v0;
    public EditTextBoldCursor f35246w;
    public ValueAnimator f35247w0;
    public TLRPC.FileLocation f35248x;
    public TLRPC.FileLocation f35249y;

    public nd(Bundle bundle) {
        super(bundle);
        this.f35227f0 = new ArrayList();
        this.f35231j0 = true;
        this.f35245v0 = new ed(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f35229h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f35232k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f35241s = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
            this.v = new org.telegram.ui.Components.e50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new dd(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f35231j0 = z10;
            this.f35219a0 = !z10;
            if (!z10 && !this.f35224d0) {
                this.f35224d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new dd(this, 0));
            }
        }
        this.f35230i0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(nd ndVar, org.telegram.ui.ActionBar.d2 d2Var) {
        ndVar.f35240r0 = false;
        ndVar.f35238q0 = false;
        if (ndVar.f35242s0 != null) {
            ConnectionsManager.getInstance(ndVar.currentAccount).cancelRequest(ndVar.f35242s0.intValue(), true);
            ndVar.f35242s0 = null;
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
        tL_channels_checkUsername.channel = MessagesController.getInstance(ndVar.currentAccount).getInputChannel(ndVar.f35230i0);
        ndVar.W = ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_checkUsername, new aa(ndVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(nd ndVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new bi.cb(29, ndVar, currentChannel));
        ndVar.showDialog(d2Var);
    }

    public static void Y(nd ndVar) {
        if (ndVar.f35244u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new a1(ndVar, 12));
        ndVar.f35244u0 = alertDialog$Builder.o();
    }

    @Override
    public final void C(float f7) {
        ld ldVar = this.f35239r;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        ld ldVar = this.f35239r;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ei.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
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
        org.telegram.ui.Components.nu nuVar = ndVar.f35222c;
        if (nuVar != null) {
            nuVar.o();
        }
        ndVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ndVar.actionBar.setAllowOverlayTitle(true);
        ndVar.actionBar.setActionBarMenuOnItemClick(new id(ndVar));
        org.telegram.ui.ActionBar.z n10 = ndVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.j6.f18256v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.vr vrVar = new org.telegram.ui.Components.vr(mutate, new org.telegram.ui.Components.zp(org.telegram.ui.ActionBar.j6.w0(null, i21, false)));
        ndVar.f35220b = vrVar;
        ndVar.f35218a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), vrVar);
        int i22 = ndVar.f35229h0;
        if (i22 == 0) {
            ndVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            jd jdVar = new jd(0, context, ndVar);
            jdVar.setOnTouchListener(new ai.h(2));
            ndVar.fragmentView = jdVar;
            int i23 = org.telegram.ui.ActionBar.j6.f17928d6;
            jdVar.setTag(Integer.valueOf(i23));
            ndVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            ndVar.K = linearLayout;
            linearLayout.setOrientation(1);
            jdVar.addView(ndVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            ndVar.K.addView(frameLayout, w7.a6.n(-1, -2));
            gg.i1 i1Var = new gg.i1(ndVar, context, 4);
            ndVar.e = i1Var;
            i1Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.g9 g9Var = ndVar.f35241s;
            g9Var.n(5L, null, null);
            ndVar.e.setImageDrawable(g9Var);
            gg.i1 i1Var2 = ndVar.e;
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
            frameLayout.addView(i1Var2, w7.a6.d(64, 64.0f, i24, f7, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            bi.s7 s7Var = new bi.s7(ndVar, context, paint, 2);
            ndVar.f35226f = s7Var;
            s7Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            bi.s7 s7Var2 = ndVar.f35226f;
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
            frameLayout.addView(s7Var2, w7.a6.d(64, 64.0f, i25, f11, 12.0f, f12, 12.0f));
            ndVar.f35226f.setOnClickListener(new fd(ndVar, 1));
            ndVar.J = new org.telegram.ui.Components.hj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
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
            frameLayout.addView(kdVar2, w7.a6.d(64, 64.0f, i26, f13, 12.0f, f14, 12.0f));
            ld ldVar = new ld(ndVar, context, 0);
            ndVar.f35239r = ldVar;
            ldVar.setSize(AndroidUtilities.dp(30.0f));
            ndVar.f35239r.setProgressColor(-1);
            ndVar.f35239r.setNoProgress(false);
            ld ldVar2 = ndVar.f35239r;
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
            frameLayout.addView(ldVar2, w7.a6.d(64, 64.0f, i27, f15, 12.0f, f16, 12.0f));
            ndVar.e0(false, false);
            org.telegram.ui.Components.nu nuVar2 = new org.telegram.ui.Components.nu(context, jdVar, ndVar, 0, false, null);
            ndVar = ndVar;
            ndVar.f35222c = nuVar2;
            nuVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = ndVar.E;
            if (str != null) {
                ndVar.f35222c.setText(str);
                ndVar.E = null;
            }
            ndVar.f35222c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            ndVar.f35222c.getEditText().setSingleLine(true);
            ndVar.f35222c.getEditText().setImeOptions(5);
            ndVar.f35222c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) {
                public final nd f33061b;

                {
                    this.f33061b = ndVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            nd ndVar2 = this.f33061b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(ndVar2.f35222c.getEditText().getText())) {
                                    ndVar2.f35246w.requestFocus();
                                    return true;
                                }
                            } else {
                                ndVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (w0Var = this.f33061b.f35218a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.nu nuVar3 = ndVar.f35222c;
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
            frameLayout.addView(nuVar3, w7.a6.d(-1, -2.0f, 16, f17, 0.0f, f18, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            ndVar.f35246w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            ndVar.f35246w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = ndVar.f35246w;
            int i28 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i28, false));
            ndVar.f35246w.setBackgroundDrawable(null);
            ndVar.f35246w.setLineColors(ndVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18055k6), ndVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18073l6), ndVar.getThemedColor(org.telegram.ui.ActionBar.j6.f18144p7));
            ndVar.f35246w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = ndVar.f35246w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            ndVar.f35246w.setInputType(180225);
            ndVar.f35246w.setImeOptions(6);
            ndVar.f35246w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            ndVar.f35246w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            ndVar.f35246w.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i28, false));
            ndVar.f35246w.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.f35246w.setCursorWidth(1.5f);
            ndVar.K.addView(ndVar.f35246w, w7.a6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            ndVar.f35246w.setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) {
                public final nd f33061b;

                {
                    this.f33061b = ndVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            nd ndVar2 = this.f33061b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(ndVar2.f35222c.getEditText().getText())) {
                                    ndVar2.f35246w.requestFocus();
                                    return true;
                                }
                            } else {
                                ndVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (w0Var = this.f33061b.f35218a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            ndVar.f35246w.addTextChangedListener(new md(0));
            TextView textView = new TextView(context);
            ndVar.T = textView;
            textView.setTextSize(1, 15.0f);
            ndVar.T.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
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
            linearLayout2.addView(textView3, w7.a6.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            ndVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            ndVar.K = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(ndVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = ndVar.getMessagesController();
            long j3 = ndVar.f35230i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ndVar.I = z10;
            org.telegram.ui.ActionBar.l lVar = ndVar.actionBar;
            if (z10) {
                i10 = R.string.GroupSettingsTitle;
            } else {
                i10 = R.string.ChannelSettingsTitle;
            }
            lVar.setTitle(LocaleController.getString(i10));
            View view = ndVar.fragmentView;
            int i29 = org.telegram.ui.ActionBar.j6.f17872a7;
            view.setTag(Integer.valueOf(i29));
            ndVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i29, false));
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
            ndVar.G = m4Var;
            m4Var.setHeight(46);
            org.telegram.ui.Cells.m4 m4Var2 = ndVar.G;
            int i30 = org.telegram.ui.ActionBar.j6.f17928d6;
            m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
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
            ndVar.F.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            ndVar.K.addView(ndVar.F, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, false);
            ndVar.Q = k6Var;
            k6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            Boolean bool = ndVar.f35232k0;
            if (bool != null && !bool.booleanValue()) {
                ndVar.f35219a0 = true;
            }
            if (ndVar.I) {
                ndVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !ndVar.f35219a0);
            } else {
                ndVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !ndVar.f35219a0);
            }
            ndVar.Q.setOnClickListener(new fd(ndVar, 2));
            if (bool == null || bool.booleanValue()) {
                ndVar.F.addView(ndVar.Q, w7.a6.n(-1, -2));
            }
            org.telegram.ui.Cells.k6 k6Var2 = new org.telegram.ui.Cells.k6(context, false);
            ndVar.R = k6Var2;
            k6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
            if (bool != null && bool.booleanValue()) {
                ndVar.f35219a0 = false;
            }
            if (ndVar.I) {
                ndVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, ndVar.f35219a0);
            } else {
                ndVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, ndVar.f35219a0);
            }
            ndVar.R.setOnClickListener(new fd(ndVar, 3));
            if (bool == null || !bool.booleanValue()) {
                ndVar.F.addView(ndVar.R, w7.a6.n(-1, -2));
            }
            org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
            ndVar.d = c7Var;
            ndVar.K.addView(c7Var, w7.a6.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            ndVar.M = linearLayout5;
            linearLayout5.setOrientation(1);
            ndVar.M.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            ndVar.K.addView(ndVar.M, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.m4 m4Var4 = new org.telegram.ui.Cells.m4(context);
            ndVar.V = m4Var4;
            ndVar.M.addView(m4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            ndVar.N = linearLayout6;
            linearLayout6.setOrientation(0);
            ndVar.M.addView(ndVar.N, w7.a6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            ndVar.H = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/");
            ndVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = ndVar.H;
            int i31 = org.telegram.ui.ActionBar.j6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = ndVar.H;
            int i32 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i32, false));
            ndVar.H.setMaxLines(1);
            ndVar.H.setLines(1);
            ndVar.H.setEnabled(false);
            ndVar.H.setBackgroundDrawable(null);
            ndVar.H.setPadding(0, 0, 0, 0);
            ndVar.H.setSingleLine(true);
            ndVar.H.setInputType(163840);
            ndVar.H.setImeOptions(6);
            ndVar.N.addView(ndVar.H, w7.a6.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            ndVar.f35246w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            ndVar.f35246w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i31, false));
            ndVar.f35246w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i32, false));
            ndVar.f35246w.setMaxLines(1);
            ndVar.f35246w.setLines(1);
            ndVar.f35246w.setBackgroundDrawable(null);
            ndVar.f35246w.setPadding(0, 0, 0, 0);
            ndVar.f35246w.setSingleLine(true);
            ndVar.f35246w.setInputType(163872);
            ndVar.f35246w.setImeOptions(6);
            ndVar.f35246w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            ndVar.f35246w.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i32, false));
            ndVar.f35246w.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.f35246w.setCursorWidth(1.5f);
            ndVar.N.addView(ndVar.f35246w, w7.a6.n(-1, 36));
            ndVar.f35246w.addTextChangedListener(new m0(ndVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            ndVar.O = linearLayout7;
            linearLayout7.setOrientation(1);
            ndVar.M.addView(ndVar.O, w7.a6.n(-1, -2));
            org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(context, ndVar, null, true, ChatObject.isChannel(ndVar.getMessagesController().getChat(Long.valueOf(j3))));
            ndVar.P = f90Var;
            f90Var.b(true);
            ndVar.P.d(0, null, false);
            ndVar.O.addView(ndVar.P);
            org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(ndVar, context, 3);
            ndVar.U = x1Var;
            x1Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            ndVar.U.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
            ndVar.U.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.x1 x1Var2 = ndVar.U;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            x1Var2.setGravity(i12);
            ndVar.U.setVisibility(8);
            ndVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = ndVar.M;
            org.telegram.ui.Cells.x1 x1Var3 = ndVar.U;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout8.addView(x1Var3, w7.a6.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            ndVar.S = f9Var;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.j6.f17892b7;
            f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i33, i34));
            ndVar.K.addView(ndVar.S, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.s4 s4Var = new org.telegram.ui.Cells.s4(context);
            ndVar.f35228g0 = s4Var;
            ndVar.K.addView(s4Var, w7.a6.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            ndVar.L = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i30, false));
            ndVar.L.setOrientation(1);
            ndVar.K.addView(ndVar.L, w7.a6.n(-1, -2));
            org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context);
            ndVar.f35225e0 = f9Var2;
            f9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i34));
            ndVar.K.addView(ndVar.f35225e0, w7.a6.n(-1, -2));
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
        n nVar = this.Y;
        if (nVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nVar);
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
                        int i11 = org.telegram.ui.ActionBar.j6.f18144p7;
                        x1Var.setTag(Integer.valueOf(i11));
                        this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.x1 x1Var2 = this.U;
                        int i12 = org.telegram.ui.ActionBar.j6.f18144p7;
                        x1Var2.setTag(Integer.valueOf(i12));
                        this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.x1 x1Var3 = this.U;
                int i13 = org.telegram.ui.ActionBar.j6.f18144p7;
                x1Var3.setTag(Integer.valueOf(i13));
                this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.x1 x1Var4 = this.U;
                int i14 = org.telegram.ui.ActionBar.j6.f18144p7;
                x1Var4.setTag(Integer.valueOf(i14));
                this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                return false;
            }
            this.U.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.x1 x1Var5 = this.U;
            int i15 = org.telegram.ui.ActionBar.j6.F6;
            x1Var5.setTag(Integer.valueOf(i15));
            this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.X = str;
            n nVar2 = new n(19, this, str);
            this.Y = nVar2;
            AndroidUtilities.runOnUIThread(nVar2, 300L);
            return true;
        }
        this.U.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.x1 x1Var6 = this.U;
        int i16 = org.telegram.ui.ActionBar.j6.f18144p7;
        x1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.d2 d2Var = this.f35244u0;
            if (d2Var != null) {
                try {
                    d2Var.dismiss();
                    this.f35244u0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.f35240r0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.d2 d2Var2 = this.f35244u0;
            if (d2Var2 != null) {
                try {
                    d2Var2.dismiss();
                    this.f35244u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f35231j0);
            Boolean bool = this.f35232k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f35233l0 != null || this.m0 != null || this.f35235n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f35233l0, this.m0, this.f35235n0, this.f35237p0, this.f35236o0, this.f35248x, this.f35249y, null);
            }
            nd ndVar = new nd(bundle);
            ndVar.f35243t0 = this.f35243t0;
            presentFragment(ndVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null && e50Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if ((e50Var == null || dialog != e50Var.f22554c) && super.dismissDialogOnPause(dialog)) {
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
        AnimatorSet animatorSet = this.f35234n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f35234n.cancel();
            this.f35234n = null;
        }
        if (z11) {
            this.f35234n = new AnimatorSet();
            if (z10) {
                this.f35239r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f35234n;
                kd kdVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f35239r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f35234n;
                kd kdVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f35239r, property2, 0.0f));
            }
            this.f35234n.setDuration(180L);
            this.f35234n.addListener(new ai.e(23, this, z10));
            this.f35234n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f35239r.setAlpha(1.0f);
            this.f35239r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f35239r.setAlpha(0.0f);
            this.f35239r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        qg.k0 k0Var = new qg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f40784v0 = true;
        k0Var.H0 = new ed(this, 0);
        showDialog(k0Var);
    }

    public final void g0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f35245v0);
        }
        if (this.f35220b != null) {
            ValueAnimator valueAnimator = this.f35247w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f35220b.f28591c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f35247w0 = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 4));
            ValueAnimator valueAnimator2 = this.f35247w0;
            float f12 = this.f35220b.f28591c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f35247w0.setInterpolator(org.telegram.ui.Components.wr.f28819f);
            this.f35247w0.start();
        }
    }

    @Override
    public final ev0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f35222c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        org.telegram.ui.Components.nu nuVar = this.f35222c;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nuVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.nu nuVar2 = this.f35222c;
        int i12 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nuVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.nu nuVar3 = this.f35222c;
        int i13 = org.telegram.ui.ActionBar.j6.f18055k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nuVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.nu nuVar4 = this.f35222c;
        int i14 = org.telegram.ui.ActionBar.j6.f18073l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(nuVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35246w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35246w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35246w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35246w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.j6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.c7 c7Var = this.d;
        int i16 = org.telegram.ui.ActionBar.j6.f17892b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(c7Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.j6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.V, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.G, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.H, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.x1 x1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.j6.f18144p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(x1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.j6.f18271w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.S, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35225e0, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.j6.f18017i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.O, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35228g0, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f17999h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.j6.f17983g7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.j6.f18000h7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.j6.f18325z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.Q, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.R, 4, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.j6.f18306y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f18174r0, eVar, org.telegram.ui.ActionBar.j6.J7));
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
        if (!this.f35219a0 && !this.f35231j0) {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.f9 f9Var = this.S;
            int i17 = org.telegram.ui.ActionBar.j6.f18144p7;
            f9Var.setTag(Integer.valueOf(i17));
            this.S.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f35224d0) {
                this.f35228g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.f9 f9Var2 = this.S;
                f9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(f9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
                this.f35225e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.f9 f9Var3 = this.S;
                f9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(f9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f17892b7));
                this.f35228g0.setVisibility(8);
                this.L.setVisibility(0);
                this.f35225e0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.f9 f9Var4 = this.S;
            int i18 = org.telegram.ui.ActionBar.j6.B6;
            f9Var4.setTag(Integer.valueOf(i18));
            this.S.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
            this.d.setVisibility(0);
            this.f35225e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.f9 f9Var5 = this.S;
            f9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(f9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
            this.M.setVisibility(0);
            this.f35228g0.setVisibility(8);
            if (this.I) {
                org.telegram.ui.Cells.f9 f9Var6 = this.S;
                if (this.f35219a0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                f9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.m4 m4Var = this.V;
                if (this.f35219a0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                m4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.f9 f9Var7 = this.S;
                if (this.f35219a0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                f9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.m4 m4Var2 = this.V;
                if (this.f35219a0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                m4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.N;
            if (this.f35219a0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.O;
            if (this.f35219a0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.M;
            if (this.f35219a0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.f90 f90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f35223c0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            f90Var.setLink(str);
            org.telegram.ui.Cells.x1 x1Var = this.U;
            if (!this.f35219a0 && x1Var.length() != 0) {
                i16 = 0;
            }
            x1Var.setVisibility(i16);
        }
        this.Q.a(!this.f35219a0);
        this.R.a(this.f35219a0);
        this.f35246w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f35246w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.nu nuVar = this.f35222c;
        if (nuVar == null || !nuVar.e) {
            return true;
        }
        if (z10) {
            nuVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f35229h0 == 1 && !this.f35221b0 && this.f35223c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j3 = this.f35230i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j3);
            if (chatFull != null) {
                this.f35223c0 = chatFull.exported_invite;
            }
            if (this.f35223c0 == null) {
                this.f35221b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new dd(this, 3));
            }
        }
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.f22552a = this;
            e50Var.f22553b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f35242s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f35242s0.intValue(), true);
            this.f35242s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.nu nuVar = this.f35222c;
        if (nuVar != null) {
            nuVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.nu nuVar = this.f35222c;
        if (nuVar != null) {
            nuVar.r();
        }
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.j();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.k(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.nu nuVar = this.f35222c;
        if (nuVar != null) {
            nuVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f35229h0 != 1) {
            this.f35222c.requestFocus();
            org.telegram.ui.Components.iu iuVar = this.f35222c.f25595a;
            iuVar.requestFocus();
            AndroidUtilities.showKeyboard(iuVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f35229h0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.v;
            if (e50Var != null) {
                e50Var.f22555f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.nu nuVar = this.f35222c;
                if (nuVar != null) {
                    nuVar.setText(string);
                } else {
                    this.E = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f35229h0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.v;
            if (e50Var != null && (str = e50Var.f22555f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.nu nuVar = this.f35222c;
            if (nuVar != null) {
                String obj = nuVar.getText().toString();
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
