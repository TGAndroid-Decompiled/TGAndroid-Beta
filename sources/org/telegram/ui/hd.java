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
public final class hd extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.r40 {
    public String A;
    public LinearLayout B;
    public org.telegram.ui.Cells.k4 C;
    public EditTextBoldCursor D;
    public boolean E;
    public org.telegram.ui.Components.xi0 F;
    public LinearLayout G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public org.telegram.ui.Components.r80 L;
    public org.telegram.ui.Cells.g6 M;
    public org.telegram.ui.Cells.g6 N;
    public org.telegram.ui.Cells.y8 O;
    public TextView P;
    public org.telegram.ui.Cells.w1 Q;
    public org.telegram.ui.Cells.k4 R;
    public int S;
    public String T;
    public org.telegram.ui.ActionBar.c U;
    public boolean V;
    public boolean W;
    public boolean X;
    public TLRPC.TL_chatInviteExported Y;
    public boolean Z;
    public org.telegram.ui.ActionBar.w0 f38849a;
    public org.telegram.ui.Cells.y8 f38850a0;
    public org.telegram.ui.Components.ir f38851b;
    public final ArrayList f38852b0;
    public org.telegram.ui.Components.au f38853c;
    public org.telegram.ui.Cells.q4 f38854c0;
    public org.telegram.ui.Cells.x6 d;
    public final int f38855d0;
    public lh.y3 f38856e;
    public final long f38857e0;
    public cg.i0 f38858f;
    public boolean f38859f0;
    public final Boolean f38860g0;
    public ed h;
    public TLRPC.InputFile f38861h0;
    public TLRPC.InputFile f38862i0;
    public TLRPC.VideoSize f38863j0;
    public String f38864k0;
    public double f38865l0;
    public boolean m0;
    public AnimatorSet f38866n;
    public boolean f38867n0;
    public Integer f38868o0;
    public Utilities.Callback2 f38869p0;
    public org.telegram.ui.ActionBar.c2 f38870q0;
    public fd f38871r;
    public final yc f38872r0;
    public final org.telegram.ui.Components.e9 f38873s;
    public ValueAnimator f38874s0;
    public final org.telegram.ui.Components.s40 v;
    public EditTextBoldCursor f38875w;
    public TLRPC.FileLocation f38876x;
    public TLRPC.FileLocation f38877y;

    public hd(Bundle bundle) {
        super(bundle);
        this.f38852b0 = new ArrayList();
        this.f38859f0 = true;
        this.f38872r0 = new yc(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f38855d0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f38860g0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f38873s = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            this.v = new org.telegram.ui.Components.s40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new xc(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f38859f0 = z10;
            this.W = !z10;
            if (!z10 && !this.Z) {
                this.Z = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new xc(this, 0));
            }
        }
        this.f38857e0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(hd hdVar, org.telegram.ui.ActionBar.c2 c2Var) {
        hdVar.f38867n0 = false;
        hdVar.m0 = false;
        if (hdVar.f38868o0 != null) {
            ConnectionsManager.getInstance(hdVar.currentAccount).cancelRequest(hdVar.f38868o0.intValue(), true);
            hdVar.f38868o0 = null;
        }
        hdVar.g0(false);
        c2Var.dismiss();
    }

    public static void V(hd hdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(hdVar.currentAccount).sendRequest(tL_channels_updateUsername, new xc(hdVar, 1), 64);
    }

    public static void W(hd hdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(hdVar.currentAccount).getInputChannel(hdVar.f38857e0);
        hdVar.S = ConnectionsManager.getInstance(hdVar.currentAccount).sendRequest(tL_channels_checkUsername, new x9(hdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(hd hdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hdVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(hdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(hdVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new kg.w(13, hdVar, currentChannel));
        hdVar.showDialog(c2Var);
    }

    public static void Y(hd hdVar) {
        if (hdVar.f38870q0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hdVar.getParentActivity());
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new c1(hdVar, 12));
        hdVar.f38870q0 = alertDialog$Builder.o();
    }

    @Override
    public final void D(float f9) {
        fd fdVar = this.f38871r;
        if (fdVar == null) {
            return;
        }
        fdVar.setProgress(f9);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        fd fdVar = this.f38871r;
        if (fdVar == null) {
            return;
        }
        fdVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new wc(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 0));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f9;
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
        hd hdVar = this;
        org.telegram.ui.Components.au auVar = hdVar.f38853c;
        if (auVar != null) {
            auVar.o();
        }
        hdVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        hdVar.actionBar.setAllowOverlayTitle(true);
        hdVar.actionBar.setActionBarMenuOnItemClick(new cd(hdVar));
        org.telegram.ui.ActionBar.a0 n10 = hdVar.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i21 = org.telegram.ui.ActionBar.g6.f23385v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i21, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(mutate, new org.telegram.ui.Components.np(org.telegram.ui.ActionBar.g6.w0(null, i21, false)));
        hdVar.f38851b = irVar;
        hdVar.f38849a = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), irVar);
        int i22 = hdVar.f38855d0;
        if (i22 == 0) {
            hdVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            dd ddVar = new dd(0, context, hdVar);
            ddVar.setOnTouchListener(new mh.d(2));
            hdVar.fragmentView = ddVar;
            int i23 = org.telegram.ui.ActionBar.g6.f23062d6;
            ddVar.setTag(Integer.valueOf(i23));
            hdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
            LinearLayout linearLayout = new LinearLayout(context);
            hdVar.G = linearLayout;
            linearLayout.setOrientation(1);
            ddVar.addView(hdVar.G, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            hdVar.G.addView(frameLayout, i7.f6.n(-1, -2));
            lh.y3 y3Var = new lh.y3(hdVar, context, 4);
            hdVar.f38856e = y3Var;
            y3Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.e9 e9Var = hdVar.f38873s;
            e9Var.n(5L, null, null);
            hdVar.f38856e.setImageDrawable(e9Var);
            lh.y3 y3Var2 = hdVar.f38856e;
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            int i24 = i14 | 48;
            if (z11) {
                f9 = 0.0f;
            } else {
                f9 = 16.0f;
            }
            if (z11) {
                f10 = 16.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout.addView(y3Var2, i7.f6.d(64, 64.0f, i24, f9, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            cg.i0 i0Var = new cg.i0(hdVar, context, paint, 2);
            hdVar.f38858f = i0Var;
            i0Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            cg.i0 i0Var2 = hdVar.f38858f;
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
            frameLayout.addView(i0Var2, i7.f6.d(64, 64.0f, i25, f11, 12.0f, f12, 12.0f));
            hdVar.f38858f.setOnClickListener(new zc(hdVar, 1));
            int i26 = R.raw.camera;
            hdVar.F = new org.telegram.ui.Components.xi0(i26, "" + R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            ed edVar = new ed(hdVar, context, 0);
            hdVar.h = edVar;
            edVar.setScaleType(ImageView.ScaleType.CENTER);
            hdVar.h.setAnimation(hdVar.F);
            hdVar.h.setEnabled(false);
            hdVar.h.setClickable(false);
            hdVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            ed edVar2 = hdVar.h;
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i27 = i16 | 48;
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
            frameLayout.addView(edVar2, i7.f6.d(64, 64.0f, i27, f13, 12.0f, f14, 12.0f));
            fd fdVar = new fd(hdVar, context, 0);
            hdVar.f38871r = fdVar;
            fdVar.setSize(AndroidUtilities.dp(30.0f));
            hdVar.f38871r.setProgressColor(-1);
            hdVar.f38871r.setNoProgress(false);
            fd fdVar2 = hdVar.f38871r;
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i28 = i17 | 48;
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
            frameLayout.addView(fdVar2, i7.f6.d(64, 64.0f, i28, f15, 12.0f, f16, 12.0f));
            hdVar.e0(false, false);
            org.telegram.ui.Components.au auVar2 = new org.telegram.ui.Components.au(context, ddVar, hdVar, 0, false, null);
            hdVar = hdVar;
            hdVar.f38853c = auVar2;
            auVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = hdVar.A;
            if (str != null) {
                hdVar.f38853c.setText(str);
                hdVar.A = null;
            }
            hdVar.f38853c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            hdVar.f38853c.getEditText().setSingleLine(true);
            hdVar.f38853c.getEditText().setImeOptions(5);
            hdVar.f38853c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(hdVar) {
                public final hd f36511b;

                {
                    this.f36511b = hdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i29, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            hd hdVar2 = this.f36511b;
                            if (i29 == 5) {
                                if (!TextUtils.isEmpty(hdVar2.f38853c.getEditText().getText())) {
                                    hdVar2.f38875w.requestFocus();
                                    return true;
                                }
                            } else {
                                hdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i29 == 6 && (w0Var = this.f36511b.f38849a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.au auVar3 = hdVar.f38853c;
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
            frameLayout.addView(auVar3, i7.f6.d(-1, -2.0f, 16, f17, 0.0f, f18, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            hdVar.f38875w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            hdVar.f38875w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = hdVar.f38875w;
            int i29 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i29, false));
            hdVar.f38875w.setBackgroundDrawable(null);
            hdVar.f38875w.setLineColors(hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23189k6), hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23206l6), hdVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7));
            hdVar.f38875w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = hdVar.f38875w;
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            editTextBoldCursor3.setGravity(i18);
            hdVar.f38875w.setInputType(180225);
            hdVar.f38875w.setImeOptions(6);
            hdVar.f38875w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            hdVar.f38875w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            hdVar.f38875w.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i29, false));
            hdVar.f38875w.setCursorSize(AndroidUtilities.dp(20.0f));
            hdVar.f38875w.setCursorWidth(1.5f);
            hdVar.G.addView(hdVar.f38875w, i7.f6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            hdVar.f38875w.setOnEditorActionListener(new TextView.OnEditorActionListener(hdVar) {
                public final hd f36511b;

                {
                    this.f36511b = hdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i292, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            hd hdVar2 = this.f36511b;
                            if (i292 == 5) {
                                if (!TextUtils.isEmpty(hdVar2.f38853c.getEditText().getText())) {
                                    hdVar2.f38875w.requestFocus();
                                    return true;
                                }
                            } else {
                                hdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i292 == 6 && (w0Var = this.f36511b.f38849a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            hdVar.f38875w.addTextChangedListener(new gd(0));
            TextView textView = new TextView(context);
            hdVar.P = textView;
            textView.setTextSize(1, 15.0f);
            hdVar.P.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.F6, false));
            TextView textView2 = hdVar.P;
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19);
            hdVar.P.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = hdVar.G;
            TextView textView3 = hdVar.P;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            linearLayout2.addView(textView3, i7.f6.t(-2, -2, i20, 24, 10, 24, 20));
        } else if (i22 == 1) {
            ScrollView scrollView = new ScrollView(context);
            hdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            hdVar.G = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(hdVar.G, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = hdVar.getMessagesController();
            long j10 = hdVar.f38857e0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z10 = true;
            } else {
                z10 = false;
            }
            hdVar.E = z10;
            org.telegram.ui.ActionBar.l lVar = hdVar.actionBar;
            if (z10) {
                i10 = R.string.GroupSettingsTitle;
            } else {
                i10 = R.string.ChannelSettingsTitle;
            }
            lVar.setTitle(LocaleController.getString(i10));
            View view = hdVar.fragmentView;
            int i30 = org.telegram.ui.ActionBar.g6.f23009a7;
            view.setTag(Integer.valueOf(i30));
            hdVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i30, false));
            org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, 23);
            hdVar.C = k4Var;
            k4Var.setHeight(46);
            org.telegram.ui.Cells.k4 k4Var2 = hdVar.C;
            int i31 = org.telegram.ui.ActionBar.g6.f23062d6;
            k4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i31, false));
            org.telegram.ui.Cells.k4 k4Var3 = hdVar.C;
            if (hdVar.E) {
                i11 = R.string.GroupTypeHeader;
            } else {
                i11 = R.string.ChannelTypeHeader;
            }
            k4Var3.setText(LocaleController.getString(i11));
            hdVar.G.addView(hdVar.C);
            LinearLayout linearLayout4 = new LinearLayout(context);
            hdVar.B = linearLayout4;
            linearLayout4.setOrientation(1);
            hdVar.B.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i31, false));
            hdVar.G.addView(hdVar.B, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, false);
            hdVar.M = g6Var;
            g6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            Boolean bool = hdVar.f38860g0;
            if (bool != null && !bool.booleanValue()) {
                hdVar.W = true;
            }
            if (hdVar.E) {
                hdVar.M.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !hdVar.W);
            } else {
                hdVar.M.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !hdVar.W);
            }
            hdVar.M.setOnClickListener(new zc(hdVar, 2));
            if (bool == null || bool.booleanValue()) {
                hdVar.B.addView(hdVar.M, i7.f6.n(-1, -2));
            }
            org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, false);
            hdVar.N = g6Var2;
            g6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            if (bool != null && bool.booleanValue()) {
                hdVar.W = false;
            }
            if (hdVar.E) {
                hdVar.N.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, hdVar.W);
            } else {
                hdVar.N.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, hdVar.W);
            }
            hdVar.N.setOnClickListener(new zc(hdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                hdVar.B.addView(hdVar.N, i7.f6.n(-1, -2));
            }
            org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (b) null);
            hdVar.d = x6Var;
            hdVar.G.addView(x6Var, i7.f6.n(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            hdVar.I = linearLayout5;
            linearLayout5.setOrientation(1);
            hdVar.I.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i31, false));
            hdVar.G.addView(hdVar.I, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.k4 k4Var4 = new org.telegram.ui.Cells.k4(context);
            hdVar.R = k4Var4;
            hdVar.I.addView(k4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            hdVar.J = linearLayout6;
            linearLayout6.setOrientation(0);
            hdVar.I.addView(hdVar.J, i7.f6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            hdVar.D = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(hdVar.currentAccount).linkPrefix + "/");
            hdVar.D.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = hdVar.D;
            int i32 = org.telegram.ui.ActionBar.g6.H6;
            editTextBoldCursor5.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i32, false));
            EditTextBoldCursor editTextBoldCursor6 = hdVar.D;
            int i33 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor6.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i33, false));
            hdVar.D.setMaxLines(1);
            hdVar.D.setLines(1);
            hdVar.D.setEnabled(false);
            hdVar.D.setBackgroundDrawable(null);
            hdVar.D.setPadding(0, 0, 0, 0);
            hdVar.D.setSingleLine(true);
            hdVar.D.setInputType(163840);
            hdVar.D.setImeOptions(6);
            hdVar.J.addView(hdVar.D, i7.f6.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            hdVar.f38875w = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            hdVar.f38875w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i32, false));
            hdVar.f38875w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i33, false));
            hdVar.f38875w.setMaxLines(1);
            hdVar.f38875w.setLines(1);
            hdVar.f38875w.setBackgroundDrawable(null);
            hdVar.f38875w.setPadding(0, 0, 0, 0);
            hdVar.f38875w.setSingleLine(true);
            hdVar.f38875w.setInputType(163872);
            hdVar.f38875w.setImeOptions(6);
            hdVar.f38875w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            hdVar.f38875w.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i33, false));
            hdVar.f38875w.setCursorSize(AndroidUtilities.dp(20.0f));
            hdVar.f38875w.setCursorWidth(1.5f);
            hdVar.J.addView(hdVar.f38875w, i7.f6.n(-1, 36));
            hdVar.f38875w.addTextChangedListener(new p0(hdVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            hdVar.K = linearLayout7;
            linearLayout7.setOrientation(1);
            hdVar.I.addView(hdVar.K, i7.f6.n(-1, -2));
            org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(context, hdVar, null, true, ChatObject.isChannel(hdVar.getMessagesController().getChat(Long.valueOf(j10))));
            hdVar.L = r80Var;
            r80Var.b(true);
            hdVar.L.d(0, null, false);
            hdVar.K.addView(hdVar.L);
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(hdVar, context, 3);
            hdVar.Q = w1Var;
            w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            hdVar.Q.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
            hdVar.Q.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.w1 w1Var2 = hdVar.Q;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            w1Var2.setGravity(i12);
            hdVar.Q.setVisibility(8);
            hdVar.Q.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = hdVar.I;
            org.telegram.ui.Cells.w1 w1Var3 = hdVar.Q;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            linearLayout8.addView(w1Var3, i7.f6.t(-2, -2, i13, 18, 3, 18, 7));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            hdVar.O = y8Var;
            int i34 = R.drawable.greydivider_bottom;
            int i35 = org.telegram.ui.ActionBar.g6.f23028b7;
            y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i34, i35));
            hdVar.G.addView(hdVar.O, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
            hdVar.f38854c0 = q4Var;
            hdVar.G.addView(q4Var, i7.f6.n(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            hdVar.H = linearLayout9;
            linearLayout9.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i31, false));
            hdVar.H.setOrientation(1);
            hdVar.G.addView(hdVar.H, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            hdVar.f38850a0 = y8Var2;
            y8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i35));
            hdVar.G.addView(hdVar.f38850a0, i7.f6.n(-1, -2));
            hdVar.h0();
        }
        return hdVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str != null && str.length() > 0) {
            this.Q.setVisibility(0);
        } else {
            this.Q.setVisibility(8);
        }
        org.telegram.ui.ActionBar.c cVar = this.U;
        if (cVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cVar);
            this.U = null;
            this.T = null;
            if (this.S != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.S, true);
            }
        }
        this.V = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        this.Q.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        org.telegram.ui.Cells.w1 w1Var = this.Q;
                        int i11 = org.telegram.ui.ActionBar.g6.f23279p7;
                        w1Var.setTag(Integer.valueOf(i11));
                        this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.Q.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.w1 w1Var2 = this.Q;
                        int i12 = org.telegram.ui.ActionBar.g6.f23279p7;
                        w1Var2.setTag(Integer.valueOf(i12));
                        this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                        return false;
                    }
                }
            } else {
                this.Q.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.w1 w1Var3 = this.Q;
                int i13 = org.telegram.ui.ActionBar.g6.f23279p7;
                w1Var3.setTag(Integer.valueOf(i13));
                this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.Q.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.w1 w1Var4 = this.Q;
                int i14 = org.telegram.ui.ActionBar.g6.f23279p7;
                w1Var4.setTag(Integer.valueOf(i14));
                this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                return false;
            }
            this.Q.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.w1 w1Var5 = this.Q;
            int i15 = org.telegram.ui.ActionBar.g6.F6;
            w1Var5.setTag(Integer.valueOf(i15));
            this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            this.T = str;
            org.telegram.ui.ActionBar.c cVar2 = new org.telegram.ui.ActionBar.c(25, this, str);
            this.U = cVar2;
            AndroidUtilities.runOnUIThread(cVar2, 300L);
            return true;
        }
        this.Q.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.w1 w1Var6 = this.Q;
        int i16 = org.telegram.ui.ActionBar.g6.f23279p7;
        w1Var6.setTag(Integer.valueOf(i16));
        this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.c2 c2Var = this.f38870q0;
            if (c2Var != null) {
                try {
                    c2Var.dismiss();
                    this.f38870q0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            g0(false);
            this.f38867n0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.c2 c2Var2 = this.f38870q0;
            if (c2Var2 != null) {
                try {
                    c2Var2.dismiss();
                    this.f38870q0 = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f38859f0);
            Boolean bool = this.f38860g0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f38861h0 != null || this.f38862i0 != null || this.f38863j0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.f38861h0, this.f38862i0, this.f38863j0, this.f38865l0, this.f38864k0, this.f38876x, this.f38877y, null);
            }
            hd hdVar = new hd(bundle);
            hdVar.f38869p0 = this.f38869p0;
            presentFragment(hdVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null && s40Var.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.s40 s40Var = this.v;
        if ((s40Var == null || dialog != s40Var.f32471c) && super.dismissDialogOnPause(dialog)) {
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
        AnimatorSet animatorSet = this.f38866n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f38866n.cancel();
            this.f38866n = null;
        }
        if (z11) {
            this.f38866n = new AnimatorSet();
            if (z10) {
                this.f38871r.setVisibility(0);
                AnimatorSet animatorSet2 = this.f38866n;
                ed edVar = this.h;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(edVar, property, 0.0f), ObjectAnimator.ofFloat(this.f38871r, property, 1.0f));
            } else {
                if (this.h.getVisibility() != 0) {
                    this.h.setAlpha(0.0f);
                }
                this.h.setVisibility(0);
                AnimatorSet animatorSet3 = this.f38866n;
                ed edVar2 = this.h;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(edVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f38871r, property2, 0.0f));
            }
            this.f38866n.setDuration(180L);
            this.f38866n.addListener(new bg.z2(27, this, z10));
            this.f38866n.start();
        } else if (z10) {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(4);
            this.f38871r.setAlpha(1.0f);
            this.f38871r.setVisibility(0);
        } else {
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f38871r.setAlpha(0.0f);
            this.f38871r.setVisibility(4);
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        cg.v0 v0Var = new cg.v0(2, this.currentAccount, getParentActivity(), this, null);
        v0Var.f3417r0 = true;
        v0Var.D0 = new yc(this, 0);
        showDialog(v0Var);
    }

    public final void g0(boolean z10) {
        float f9;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f38872r0);
        }
        if (this.f38851b != null) {
            ValueAnimator valueAnimator = this.f38874s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f38851b.f29455c;
            float f11 = 0.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f38874s0 = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 4));
            ValueAnimator valueAnimator2 = this.f38874s0;
            float f12 = this.f38851b.f29455c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f38874s0.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            this.f38874s0.start();
        }
    }

    @Override
    public final zt0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f38853c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        org.telegram.ui.Components.au auVar = this.f38853c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.au auVar2 = this.f38853c;
        int i12 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.au auVar3 = this.f38853c;
        int i13 = org.telegram.ui.ActionBar.g6.f23189k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.au auVar4 = this.f38853c;
        int i14 = org.telegram.ui.ActionBar.g6.f23206l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38875w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38875w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38875w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38875w, 65568, null, null, null, null, i14));
        TextView textView = this.P;
        int i15 = org.telegram.ui.ActionBar.g6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.x6 x6Var = this.d;
        int i16 = org.telegram.ui.ActionBar.g6.f23028b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(x6Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.w1 w1Var = this.Q;
        int i18 = org.telegram.ui.ActionBar.g6.f23279p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262148, null, null, null, null, org.telegram.ui.ActionBar.g6.f23401w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38850a0, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.K;
        int i19 = org.telegram.ui.ActionBar.g6.f23152i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38854c0, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23134h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.f23118g7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.g6.f23135h7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.g6.f23450z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.g6.f23433y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23305r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
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
        if (!this.W && !this.f38859f0) {
            this.O.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.y8 y8Var = this.O;
            int i17 = org.telegram.ui.ActionBar.g6.f23279p7;
            y8Var.setTag(Integer.valueOf(i17));
            this.O.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            this.I.setVisibility(8);
            this.d.setVisibility(8);
            if (this.Z) {
                this.f38854c0.setVisibility(0);
                this.H.setVisibility(8);
                org.telegram.ui.Cells.y8 y8Var2 = this.O;
                y8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(y8Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
                this.f38850a0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.y8 y8Var3 = this.O;
                y8Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(y8Var3.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7));
                this.f38854c0.setVisibility(8);
                this.H.setVisibility(0);
                this.f38850a0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var4 = this.O;
            int i18 = org.telegram.ui.ActionBar.g6.B6;
            y8Var4.setTag(Integer.valueOf(i18));
            this.O.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
            this.d.setVisibility(0);
            this.f38850a0.setVisibility(8);
            this.H.setVisibility(8);
            org.telegram.ui.Cells.y8 y8Var5 = this.O;
            y8Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(y8Var5.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
            this.I.setVisibility(0);
            this.f38854c0.setVisibility(8);
            if (this.E) {
                org.telegram.ui.Cells.y8 y8Var6 = this.O;
                if (this.W) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                y8Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.k4 k4Var = this.R;
                if (this.W) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                k4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.y8 y8Var7 = this.O;
                if (this.W) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                y8Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.k4 k4Var2 = this.R;
                if (this.W) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                k4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.J;
            if (this.W) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.K;
            if (this.W) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.I;
            if (this.W) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.r80 r80Var = this.L;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.Y;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            r80Var.setLink(str);
            org.telegram.ui.Cells.w1 w1Var = this.Q;
            if (!this.W && w1Var.length() != 0) {
                i16 = 0;
            }
            w1Var.setVisibility(i16);
        }
        this.M.a(!this.W);
        this.N.a(this.W);
        this.f38875w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f38875w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.au auVar = this.f38853c;
        if (auVar == null || !auVar.f26885e) {
            return true;
        }
        if (z10) {
            auVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f38855d0 == 1 && !this.X && this.Y == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f38857e0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.Y = chatFull.exported_invite;
            }
            if (this.Y == null) {
                this.X = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new xc(this, 3));
            }
        }
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.f32469a = this;
            s40Var.f32470b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f38868o0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f38868o0.intValue(), true);
            this.f38868o0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.au auVar = this.f38853c;
        if (auVar != null) {
            auVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.au auVar = this.f38853c;
        if (auVar != null) {
            auVar.r();
        }
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.j();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.k(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.au auVar = this.f38853c;
        if (auVar != null) {
            auVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.s40 s40Var = this.v;
        if (s40Var != null) {
            s40Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f38855d0 != 1) {
            this.f38853c.requestFocus();
            org.telegram.ui.Components.vt vtVar = this.f38853c.f26882a;
            vtVar.requestFocus();
            AndroidUtilities.showKeyboard(vtVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f38855d0 == 0) {
            org.telegram.ui.Components.s40 s40Var = this.v;
            if (s40Var != null) {
                s40Var.f32473f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.au auVar = this.f38853c;
                if (auVar != null) {
                    auVar.setText(string);
                } else {
                    this.A = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f38855d0 == 0) {
            org.telegram.ui.Components.s40 s40Var = this.v;
            if (s40Var != null && (str = s40Var.f32473f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.au auVar = this.f38853c;
            if (auVar != null) {
                String obj = auVar.getText().toString();
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
