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
public final class od extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50 {
    public String E;
    public LinearLayout F;
    public org.telegram.ui.Cells.l4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public org.telegram.ui.Components.uj0 J;
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
    public org.telegram.ui.ActionBar.u0 f39723a;
    public boolean f39724a0;
    public org.telegram.ui.Components.as f39725b;
    public boolean f39726b0;
    public org.telegram.ui.Components.qu f39727c;
    public TLRPC.TL_chatInviteExported f39728c0;
    public org.telegram.ui.Cells.z6 d;
    public boolean f39729d0;
    public ci.j4 e;
    public org.telegram.ui.Cells.d9 f39730e0;
    public ei.g6 f39731f;
    public final ArrayList f39732f0;
    public org.telegram.ui.Cells.r4 f39733g0;
    public ld h;
    public final int f39734h0;
    public final long f39735i0;
    public boolean f39736j0;
    public final Boolean f39737k0;
    public TLRPC.InputFile f39738l0;
    public TLRPC.InputFile m0;
    public AnimatorSet f39739n;
    public TLRPC.VideoSize f39740n0;
    public String f39741o0;
    public double f39742p0;
    public boolean f39743q0;
    public md f39744r;
    public boolean f39745r0;
    public final org.telegram.ui.Components.h9 f39746s;
    public Integer f39747s0;
    public Utilities.Callback2 f39748t0;
    public org.telegram.ui.ActionBar.b2 f39749u0;
    public final org.telegram.ui.Components.e50 v;
    public final fd f39750v0;
    public EditTextBoldCursor f39751w;
    public ValueAnimator f39752w0;
    public TLRPC.FileLocation f39753x;
    public TLRPC.FileLocation f39754y;

    public od(Bundle bundle) {
        super(bundle);
        this.f39732f0 = new ArrayList();
        this.f39736j0 = true;
        this.f39750v0 = new fd(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f39734h0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f39737k0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f39746s = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            this.v = new org.telegram.ui.Components.e50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new ed(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f39736j0 = z10;
            this.f39724a0 = !z10;
            if (!z10 && !this.f39729d0) {
                this.f39729d0 = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ed(this, 0));
            }
        }
        this.f39735i0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(od odVar, org.telegram.ui.ActionBar.b2 b2Var) {
        odVar.f39745r0 = false;
        odVar.f39743q0 = false;
        if (odVar.f39747s0 != null) {
            ConnectionsManager.getInstance(odVar.currentAccount).cancelRequest(odVar.f39747s0.intValue(), true);
            odVar.f39747s0 = null;
        }
        odVar.g0(false);
        b2Var.dismiss();
    }

    public static void V(od odVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(odVar.currentAccount).sendRequest(tL_channels_updateUsername, new ed(odVar, 1), 64);
    }

    public static void W(od odVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(odVar.currentAccount).getInputChannel(odVar.f39735i0);
        odVar.W = ConnectionsManager.getInstance(odVar.currentAccount).sendRequest(tL_channels_checkUsername, new ea(odVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(od odVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(odVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        b2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(odVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(odVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.w0(10, odVar, currentChannel));
        odVar.showDialog(b2Var);
    }

    public static void Y(od odVar) {
        if (odVar.f39749u0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(odVar.getParentActivity());
        alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new b1(odVar, 12));
        odVar.f39749u0 = alertDialog$Builder.o();
    }

    @Override
    public final void F(float f7) {
        md mdVar = this.f39744r;
        if (mdVar == null) {
            return;
        }
        mdVar.setProgress(f7);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        md mdVar = this.f39744r;
        if (mdVar == null) {
            return;
        }
        mdVar.setProgress(0.0f);
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
        od odVar = this;
        org.telegram.ui.Components.qu quVar = odVar.f39727c;
        if (quVar != null) {
            quVar.o();
        }
        odVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        odVar.actionBar.setAllowOverlayTitle(true);
        odVar.actionBar.setActionBarMenuOnItemClick(new jd(odVar));
        org.telegram.ui.ActionBar.y n10 = odVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.h6.f21321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.as asVar = new org.telegram.ui.Components.as(mutate, new org.telegram.ui.Components.dq(org.telegram.ui.ActionBar.h6.x0(null, i21, false)));
        odVar.f39725b = asVar;
        odVar.f39723a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), asVar);
        int i22 = odVar.f39734h0;
        if (i22 == 0) {
            odVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            kd kdVar = new kd(0, context, odVar);
            kdVar.setOnTouchListener(new di.d(2));
            odVar.fragmentView = kdVar;
            int i23 = org.telegram.ui.ActionBar.h6.f20986d6;
            kdVar.setTag(Integer.valueOf(i23));
            odVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            odVar.K = linearLayout;
            linearLayout.setOrientation(1);
            kdVar.addView(odVar.K, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            odVar.K.addView(frameLayout, w7.z5.n(-1, -2));
            ci.j4 j4Var = new ci.j4(odVar, context, 5);
            odVar.e = j4Var;
            j4Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.h9 h9Var = odVar.f39746s;
            h9Var.n(5L, null, null);
            odVar.e.setImageDrawable(h9Var);
            ci.j4 j4Var2 = odVar.e;
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
            frameLayout.addView(j4Var2, w7.z5.d(64, 64.0f, i24, f7, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ei.g6 g6Var = new ei.g6(odVar, context, paint, 2);
            odVar.f39731f = g6Var;
            g6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ei.g6 g6Var2 = odVar.f39731f;
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
            odVar.f39731f.setOnClickListener(new gd(odVar, 1));
            odVar.J = new org.telegram.ui.Components.uj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            ld ldVar = new ld(odVar, context, 0);
            odVar.h = ldVar;
            ldVar.setScaleType(ImageView.ScaleType.CENTER);
            odVar.h.setAnimation(odVar.J);
            odVar.h.setEnabled(false);
            odVar.h.setClickable(false);
            odVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            ld ldVar2 = odVar.h;
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
            frameLayout.addView(ldVar2, w7.z5.d(64, 64.0f, i26, f13, 12.0f, f14, 12.0f));
            md mdVar = new md(odVar, context, 0);
            odVar.f39744r = mdVar;
            mdVar.setSize(AndroidUtilities.dp(30.0f));
            odVar.f39744r.setProgressColor(-1);
            odVar.f39744r.setNoProgress(false);
            md mdVar2 = odVar.f39744r;
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
            frameLayout.addView(mdVar2, w7.z5.d(64, 64.0f, i27, f15, 12.0f, f16, 12.0f));
            odVar.e0(false, false);
            org.telegram.ui.Components.qu quVar2 = new org.telegram.ui.Components.qu(context, kdVar, this, 0, false, null);
            odVar = this;
            odVar.f39727c = quVar2;
            quVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = odVar.E;
            if (str != null) {
                odVar.f39727c.setText(str);
                odVar.E = null;
            }
            odVar.f39727c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            odVar.f39727c.getEditText().setSingleLine(true);
            odVar.f39727c.getEditText().setImeOptions(5);
            odVar.f39727c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(odVar) {
                public final od f37496b;

                {
                    this.f37496b = odVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i28, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            od odVar2 = this.f37496b;
                            if (i28 == 5) {
                                if (!TextUtils.isEmpty(odVar2.f39727c.getEditText().getText())) {
                                    odVar2.f39751w.requestFocus();
                                    return true;
                                }
                            } else {
                                odVar2.getClass();
                            }
                            return false;
                        default:
                            if (i28 == 6 && (u0Var = this.f37496b.f39723a) != null) {
                                u0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.qu quVar3 = odVar.f39727c;
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
            odVar.f39751w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            odVar.f39751w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = odVar.f39751w;
            int i28 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i28, false));
            odVar.f39751w.setBackgroundDrawable(null);
            odVar.f39751w.setLineColors(odVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21113k6), odVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21130l6), odVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21207p7));
            odVar.f39751w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = odVar.f39751w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            odVar.f39751w.setInputType(180225);
            odVar.f39751w.setImeOptions(6);
            odVar.f39751w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            odVar.f39751w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            odVar.f39751w.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i28, false));
            odVar.f39751w.setCursorSize(AndroidUtilities.dp(20.0f));
            odVar.f39751w.setCursorWidth(1.5f);
            odVar.K.addView(odVar.f39751w, w7.z5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            odVar.f39751w.setOnEditorActionListener(new TextView.OnEditorActionListener(odVar) {
                public final od f37496b;

                {
                    this.f37496b = odVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i282, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (r2) {
                        case 0:
                            od odVar2 = this.f37496b;
                            if (i282 == 5) {
                                if (!TextUtils.isEmpty(odVar2.f39727c.getEditText().getText())) {
                                    odVar2.f39751w.requestFocus();
                                    return true;
                                }
                            } else {
                                odVar2.getClass();
                            }
                            return false;
                        default:
                            if (i282 == 6 && (u0Var = this.f37496b.f39723a) != null) {
                                u0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            odVar.f39751w.addTextChangedListener(new nd(0));
            TextView textView = new TextView(context);
            odVar.T = textView;
            textView.setTextSize(1, 15.0f);
            odVar.T.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.F6, false));
            TextView textView2 = odVar.T;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19);
            odVar.T.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = odVar.K;
            TextView textView3 = odVar.T;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            linearLayout2.addView(textView3, w7.z5.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            odVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            odVar.K = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(odVar.K, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = odVar.getMessagesController();
            long j10 = odVar.f39735i0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z10 = true;
            } else {
                z10 = false;
            }
            odVar.I = z10;
            org.telegram.ui.ActionBar.k kVar = odVar.actionBar;
            if (z10) {
                i10 = R.string.GroupSettingsTitle;
            } else {
                i10 = R.string.ChannelSettingsTitle;
            }
            kVar.setTitle(LocaleController.getString(i10));
            View view = odVar.fragmentView;
            int i29 = org.telegram.ui.ActionBar.h6.f20928a7;
            view.setTag(Integer.valueOf(i29));
            odVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i29, false));
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
            odVar.G = l4Var;
            l4Var.setHeight(46);
            org.telegram.ui.Cells.l4 l4Var2 = odVar.G;
            int i30 = org.telegram.ui.ActionBar.h6.f20986d6;
            l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i30, false));
            org.telegram.ui.Cells.l4 l4Var3 = odVar.G;
            if (odVar.I) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            l4Var3.setText(LocaleController.getString(i11));
            odVar.K.addView(odVar.G);
            LinearLayout linearLayout4 = new LinearLayout(context);
            odVar.F = linearLayout4;
            linearLayout4.setOrientation(1);
            odVar.F.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i30, false));
            odVar.K.addView(odVar.F, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
            odVar.Q = i6Var;
            i6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
            Boolean bool = odVar.f39737k0;
            if (bool != null && !bool.booleanValue()) {
                odVar.f39724a0 = true;
            }
            if (odVar.I) {
                odVar.Q.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !odVar.f39724a0);
            } else {
                odVar.Q.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !odVar.f39724a0);
            }
            odVar.Q.setOnClickListener(new gd(odVar, 2));
            if (bool == null || bool.booleanValue()) {
                odVar.F.addView(odVar.Q, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
            odVar.R = i6Var2;
            i6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
            if (bool != null && bool.booleanValue()) {
                odVar.f39724a0 = false;
            }
            if (odVar.I) {
                odVar.R.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, odVar.f39724a0);
            } else {
                odVar.R.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, odVar.f39724a0);
            }
            odVar.R.setOnClickListener(new gd(odVar, 3));
            if (bool == null || !bool.booleanValue()) {
                odVar.F.addView(odVar.R, w7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
            odVar.d = z6Var;
            odVar.K.addView(z6Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            odVar.M = linearLayout5;
            linearLayout5.setOrientation(1);
            odVar.M.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i30, false));
            odVar.K.addView(odVar.M, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.l4 l4Var4 = new org.telegram.ui.Cells.l4(context);
            odVar.V = l4Var4;
            odVar.M.addView(l4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            odVar.N = linearLayout6;
            linearLayout6.setOrientation(0);
            odVar.M.addView(odVar.N, w7.z5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            odVar.H = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(odVar.currentAccount).linkPrefix + "/");
            odVar.H.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = odVar.H;
            int i31 = org.telegram.ui.ActionBar.h6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i31, false));
            EditTextBoldCursor editTextBoldCursor6 = odVar.H;
            int i32 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i32, false));
            odVar.H.setMaxLines(1);
            odVar.H.setLines(1);
            odVar.H.setEnabled(false);
            odVar.H.setBackgroundDrawable(null);
            odVar.H.setPadding(0, 0, 0, 0);
            odVar.H.setSingleLine(true);
            odVar.H.setInputType(163840);
            odVar.H.setImeOptions(6);
            odVar.N.addView(odVar.H, w7.z5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            odVar.f39751w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            odVar.f39751w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i31, false));
            odVar.f39751w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i32, false));
            odVar.f39751w.setMaxLines(1);
            odVar.f39751w.setLines(1);
            odVar.f39751w.setBackgroundDrawable(null);
            odVar.f39751w.setPadding(0, 0, 0, 0);
            odVar.f39751w.setSingleLine(true);
            odVar.f39751w.setInputType(163872);
            odVar.f39751w.setImeOptions(6);
            odVar.f39751w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            odVar.f39751w.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i32, false));
            odVar.f39751w.setCursorSize(AndroidUtilities.dp(20.0f));
            odVar.f39751w.setCursorWidth(1.5f);
            odVar.N.addView(odVar.f39751w, w7.z5.n(-1, 36));
            odVar.f39751w.addTextChangedListener(new o0(odVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            odVar.O = linearLayout7;
            linearLayout7.setOrientation(1);
            odVar.M.addView(odVar.O, w7.z5.n(-1, -2));
            org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(context, odVar, null, true, ChatObject.isChannel(odVar.getMessagesController().getChat(Long.valueOf(j10))));
            odVar.P = q90Var;
            q90Var.b(true);
            odVar.P.d(0, null, false);
            odVar.O.addView(odVar.P);
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(odVar, context, 3);
            odVar.U = y1Var;
            y1Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
            odVar.U.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.K6, false));
            odVar.U.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.y1 y1Var2 = odVar.U;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            y1Var2.setGravity(i12);
            odVar.U.setVisibility(8);
            odVar.U.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = odVar.M;
            org.telegram.ui.Cells.y1 y1Var3 = odVar.U;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout8.addView(y1Var3, w7.z5.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            odVar.S = d9Var;
            int i33 = R.drawable.greydivider_bottom;
            int i34 = org.telegram.ui.ActionBar.h6.f20948b7;
            d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i33, i34));
            odVar.K.addView(odVar.S, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.r4 r4Var = new org.telegram.ui.Cells.r4(context);
            odVar.f39733g0 = r4Var;
            odVar.K.addView(r4Var, w7.z5.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            odVar.L = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i30, false));
            odVar.L.setOrientation(1);
            odVar.K.addView(odVar.L, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
            odVar.f39730e0 = d9Var2;
            d9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i34));
            odVar.K.addView(odVar.f39730e0, w7.z5.n(-1, -2));
            odVar.h0();
        }
        return odVar.fragmentView;
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
                        int i11 = org.telegram.ui.ActionBar.h6.f21207p7;
                        y1Var.setTag(Integer.valueOf(i11));
                        this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.y1 y1Var2 = this.U;
                        int i12 = org.telegram.ui.ActionBar.h6.f21207p7;
                        y1Var2.setTag(Integer.valueOf(i12));
                        this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.U.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.y1 y1Var3 = this.U;
                int i13 = org.telegram.ui.ActionBar.h6.f21207p7;
                y1Var3.setTag(Integer.valueOf(i13));
                this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.U.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.y1 y1Var4 = this.U;
                int i14 = org.telegram.ui.ActionBar.h6.f21207p7;
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
        int i16 = org.telegram.ui.ActionBar.h6.f21207p7;
        y1Var6.setTag(Integer.valueOf(i16));
        this.U.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f39749u0;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                    this.f39749u0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            g0(false);
            this.f39745r0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.b2 b2Var2 = this.f39749u0;
            if (b2Var2 != null) {
                try {
                    b2Var2.dismiss();
                    this.f39749u0 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f39736j0);
            Boolean bool = this.f39737k0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f39738l0 != null || this.m0 != null || this.f39740n0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f39738l0, this.m0, this.f39740n0, this.f39742p0, this.f39741o0, this.f39753x, this.f39754y, null);
            }
            od odVar = new od(bundle);
            odVar.f39748t0 = this.f39748t0;
            presentFragment(odVar, true);
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
        if ((e50Var == null || dialog != e50Var.f25807c) && super.dismissDialogOnPause(dialog)) {
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
        AnimatorSet animatorSet = this.f39739n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f39739n.cancel();
            this.f39739n = null;
        }
        if (z11) {
            this.f39739n = new AnimatorSet();
            if (z10) {
                this.f39744r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f39739n;
                ld ldVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(ldVar, property, 0.0f), ObjectAnimator.ofFloat(this.f39744r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39739n;
                ld ldVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ldVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f39744r, property2, 0.0f));
            }
            this.f39739n.setDuration(180L);
            this.f39739n.addListener(new ah.p0(28, this, z10));
            this.f39739n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f39744r.setAlpha(1.0f);
            this.f39744r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f39744r.setAlpha(0.0f);
            this.f39744r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        sg.k0 k0Var = new sg.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f46299v0 = true;
        k0Var.H0 = new fd(this, 0);
        showDialog(k0Var);
    }

    public final void g0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f39750v0);
        }
        if (this.f39725b != null) {
            ValueAnimator valueAnimator = this.f39752w0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f39725b.f24703c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39752w0 = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 4));
            ValueAnimator valueAnimator2 = this.f39752w0;
            float f12 = this.f39725b.f24703c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f39752w0.setInterpolator(org.telegram.ui.Components.bs.f25030f);
            this.f39752w0.start();
        }
    }

    @Override
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f39727c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20986d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.f20928a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21265s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21321v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
        org.telegram.ui.Components.qu quVar = this.f39727c;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.qu quVar2 = this.f39727c;
        int i12 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.qu quVar3 = this.f39727c;
        int i13 = org.telegram.ui.ActionBar.h6.f21113k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.qu quVar4 = this.f39727c;
        int i14 = org.telegram.ui.ActionBar.h6.f21130l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39751w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39751w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39751w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39751w, 65568, null, null, null, null, i14));
        TextView textView = this.T;
        int i15 = org.telegram.ui.ActionBar.h6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.M, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.z6 z6Var = this.d;
        int i16 = org.telegram.ui.ActionBar.h6.f20948b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(z6Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.h6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.y1 y1Var = this.U;
        int i18 = org.telegram.ui.ActionBar.h6.f21207p7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(y1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 262148, null, null, null, null, org.telegram.ui.ActionBar.h6.f21338w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.S, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39730e0, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.O;
        int i19 = org.telegram.ui.ActionBar.h6.f21075i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39733g0, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21058h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.h6.f21040g7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.h6.f21059h7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.h6.f21391z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 8192, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 16384, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 4, new Class[]{org.telegram.ui.Cells.i6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.h6.f21374y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f21237r0, eVar, org.telegram.ui.ActionBar.h6.J7));
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
        if (!this.f39724a0 && !this.f39736j0) {
            this.S.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.d9 d9Var = this.S;
            int i17 = org.telegram.ui.ActionBar.h6.f21207p7;
            d9Var.setTag(Integer.valueOf(i17));
            this.S.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
            this.M.setVisibility(8);
            this.d.setVisibility(8);
            if (this.f39729d0) {
                this.f39733g0.setVisibility(0);
                this.L.setVisibility(8);
                org.telegram.ui.Cells.d9 d9Var2 = this.S;
                d9Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(d9Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20948b7));
                this.f39730e0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.d9 d9Var3 = this.S;
                d9Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(d9Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20948b7));
                this.f39733g0.setVisibility(8);
                this.L.setVisibility(0);
                this.f39730e0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.d9 d9Var4 = this.S;
            int i18 = org.telegram.ui.ActionBar.h6.B6;
            d9Var4.setTag(Integer.valueOf(i18));
            this.S.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
            this.d.setVisibility(0);
            this.f39730e0.setVisibility(8);
            this.L.setVisibility(8);
            org.telegram.ui.Cells.d9 d9Var5 = this.S;
            d9Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(d9Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20948b7));
            this.M.setVisibility(0);
            this.f39733g0.setVisibility(8);
            if (this.I) {
                org.telegram.ui.Cells.d9 d9Var6 = this.S;
                if (this.f39724a0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                d9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.l4 l4Var = this.V;
                if (this.f39724a0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                l4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.d9 d9Var7 = this.S;
                if (this.f39724a0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                d9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.l4 l4Var2 = this.V;
                if (this.f39724a0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                l4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.N;
            if (this.f39724a0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.O;
            if (this.f39724a0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.M;
            if (this.f39724a0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.q90 q90Var = this.P;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f39728c0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            q90Var.setLink(str);
            org.telegram.ui.Cells.y1 y1Var = this.U;
            if (!this.f39724a0 && y1Var.length() != 0) {
                i16 = 0;
            }
            y1Var.setVisibility(i16);
        }
        this.Q.a(!this.f39724a0);
        this.R.a(this.f39724a0);
        this.f39751w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f39751w);
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
        org.telegram.ui.Components.qu quVar = this.f39727c;
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
        if (this.f39734h0 == 1 && !this.f39726b0 && this.f39728c0 == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f39735i0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.f39728c0 = chatFull.exported_invite;
            }
            if (this.f39728c0 == null) {
                this.f39726b0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new ed(this, 3));
            }
        }
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.f25805a = this;
            e50Var.f25806b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f39747s0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39747s0.intValue(), true);
            this.f39747s0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.e50 e50Var = this.v;
        if (e50Var != null) {
            e50Var.d();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.qu quVar = this.f39727c;
        if (quVar != null) {
            quVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.qu quVar = this.f39727c;
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
        org.telegram.ui.Components.qu quVar = this.f39727c;
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
        if (z10 && this.f39734h0 != 1) {
            this.f39727c.requestFocus();
            org.telegram.ui.Components.lu luVar = this.f39727c.f29742a;
            luVar.requestFocus();
            AndroidUtilities.showKeyboard(luVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f39734h0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.v;
            if (e50Var != null) {
                e50Var.f25808f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.qu quVar = this.f39727c;
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
        if (this.f39734h0 == 0) {
            org.telegram.ui.Components.e50 e50Var = this.v;
            if (e50Var != null && (str = e50Var.f25808f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.qu quVar = this.f39727c;
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
