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

public final class id extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.i40 {
    public String A;
    public LinearLayout B;
    public org.telegram.ui.Cells.j4 C;
    public EditTextBoldCursor D;
    public boolean E;
    public org.telegram.ui.Components.oi0 F;
    public LinearLayout G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public org.telegram.ui.Components.i80 L;
    public org.telegram.ui.Cells.f6 M;
    public org.telegram.ui.Cells.f6 N;
    public org.telegram.ui.Cells.x8 O;
    public TextView P;
    public org.telegram.ui.Cells.w1 Q;
    public org.telegram.ui.Cells.j4 R;
    public int S;
    public String T;
    public org.telegram.messenger.voip.l0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public TLRPC.TL_chatInviteExported Y;
    public boolean Z;

    public org.telegram.ui.ActionBar.v0 f39029a;

    public org.telegram.ui.Cells.x8 f39030a0;

    public org.telegram.ui.Components.dr f39031b;

    public final ArrayList f39032b0;

    public org.telegram.ui.Components.tt f39033c;

    public org.telegram.ui.Cells.p4 f39034c0;
    public org.telegram.ui.Cells.w6 d;

    public final int f39035d0;

    public jh.z3 f39036e;

    public final long f39037e0;

    public ag.t0 f39038f;

    public boolean f39039f0;

    public final Boolean f39040g0;
    public fd h;

    public TLRPC.InputFile f39041h0;

    public TLRPC.InputFile f39042i0;

    public TLRPC.VideoSize f39043j0;

    public String f39044k0;

    public double f39045l0;
    public boolean m0;

    public AnimatorSet f39046n;

    public boolean f39047n0;

    public Integer f39048o0;

    public Utilities.Callback2 f39049p0;

    public org.telegram.ui.ActionBar.b2 f39050q0;

    public gd f39051r;

    public final zc f39052r0;

    public final org.telegram.ui.Components.y8 f39053s;

    public ValueAnimator f39054s0;
    public final org.telegram.ui.Components.j40 v;

    public EditTextBoldCursor f39055w;

    public TLRPC.FileLocation f39056x;

    public TLRPC.FileLocation f39057y;

    public id(Bundle bundle) {
        super(bundle);
        this.f39032b0 = new ArrayList();
        this.f39039f0 = true;
        this.f39052r0 = new zc(this, 2);
        int i10 = bundle.getInt("step", 0);
        this.f39035d0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f39040g0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f39053s = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            this.v = new org.telegram.ui.Components.j40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new yc(this, 2));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f39039f0 = z10;
            this.W = !z10;
            if (!z10 && !this.Z) {
                this.Z = true;
                h0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new yc(this, 0));
            }
        }
        this.f39037e0 = bundle.getLong("chat_id", 0L);
    }

    public static void U(id idVar, org.telegram.ui.ActionBar.b2 b2Var) {
        idVar.f39047n0 = false;
        idVar.m0 = false;
        if (idVar.f39048o0 != null) {
            ConnectionsManager.getInstance(idVar.currentAccount).cancelRequest(idVar.f39048o0.intValue(), true);
            idVar.f39048o0 = null;
        }
        idVar.g0(false);
        b2Var.dismiss();
    }

    public static void V(id idVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(idVar.currentAccount).sendRequest(tL_channels_updateUsername, new yc(idVar, 1), 64);
    }

    public static void W(id idVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(idVar.currentAccount).getInputChannel(idVar.f39037e0);
        idVar.S = ConnectionsManager.getInstance(idVar.currentAccount).sendRequest(tL_channels_checkUsername, new z9(idVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void X(id idVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(idVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        if (currentChannel.megagroup) {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(idVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(idVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new jh.z1(13, idVar, currentChannel));
        idVar.showDialog(b2Var);
    }

    public static void Y(id idVar) {
        if (idVar.f39050q0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(idVar.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new c1(idVar, 12));
        idVar.f39050q0 = alertDialog$Builder.o();
    }

    @Override
    public final void E(float f10) {
        gd gdVar = this.f39051r;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        gd gdVar = this.f39051r;
        if (gdVar == null) {
            return;
        }
        gdVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new oh.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override
    public final View createView(Context context) {
        final id idVar = this;
        org.telegram.ui.Components.tt ttVar = idVar.f39033c;
        if (ttVar != null) {
            ttVar.o();
        }
        idVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        idVar.actionBar.setAllowOverlayTitle(true);
        idVar.actionBar.setActionBarMenuOnItemClick(new dd(idVar));
        org.telegram.ui.ActionBar.z zVarN = idVar.actionBar.n();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.g6.f23375v8;
        final int i12 = 0;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.dr drVar = new org.telegram.ui.Components.dr(drawableMutate, new org.telegram.ui.Components.hp(org.telegram.ui.ActionBar.g6.w0(null, i11, false)));
        idVar.f39031b = drVar;
        idVar.f39029a = zVarN.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), drVar);
        int i13 = 2;
        int i14 = 3;
        int i15 = idVar.f39035d0;
        if (i15 == 0) {
            idVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            ed edVar = new ed(i12, context, idVar);
            edVar.setOnTouchListener(new kh.e(i13));
            idVar.fragmentView = edVar;
            int i16 = org.telegram.ui.ActionBar.g6.f23053d6;
            edVar.setTag(Integer.valueOf(i16));
            idVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
            LinearLayout linearLayout = new LinearLayout(context);
            idVar.G = linearLayout;
            linearLayout.setOrientation(1);
            edVar.addView(idVar.G, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            idVar.G.addView(frameLayout, h7.z5.n(-1, -2));
            jh.z3 z3Var = new jh.z3(idVar, context, 4);
            idVar.f39036e = z3Var;
            z3Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.y8 y8Var = idVar.f39053s;
            y8Var.n(5L, null, null);
            idVar.f39036e.setImageDrawable(y8Var);
            jh.z3 z3Var2 = idVar.f39036e;
            boolean z10 = LocaleController.isRTL;
            frameLayout.addView(z3Var2, h7.z5.d(64, 64.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ag.t0 t0Var = new ag.t0(idVar, context, paint, i14);
            idVar.f39038f = t0Var;
            t0Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            ag.t0 t0Var2 = idVar.f39038f;
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(t0Var2, h7.z5.d(64, 64.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 12.0f));
            idVar.f39038f.setOnClickListener(new ad(idVar, i10));
            idVar.F = new org.telegram.ui.Components.oi0(R.raw.camera, "" + R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            fd fdVar = new fd(idVar, context, 0);
            idVar.h = fdVar;
            fdVar.setScaleType(ImageView.ScaleType.CENTER);
            idVar.h.setAnimation(idVar.F);
            idVar.h.setEnabled(false);
            idVar.h.setClickable(false);
            idVar.h.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            fd fdVar2 = idVar.h;
            boolean z12 = LocaleController.isRTL;
            frameLayout.addView(fdVar2, h7.z5.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 15.0f, 12.0f, z12 ? 15.0f : 0.0f, 12.0f));
            gd gdVar = new gd(idVar, context, i12);
            idVar.f39051r = gdVar;
            gdVar.setSize(AndroidUtilities.dp(30.0f));
            idVar.f39051r.setProgressColor(-1);
            idVar.f39051r.setNoProgress(false);
            gd gdVar2 = idVar.f39051r;
            boolean z13 = LocaleController.isRTL;
            frameLayout.addView(gdVar2, h7.z5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f));
            idVar.e0(false, false);
            org.telegram.ui.Components.tt ttVar2 = new org.telegram.ui.Components.tt(context, edVar, idVar, 0, false, null);
            idVar = idVar;
            idVar.f39033c = ttVar2;
            ttVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = idVar.A;
            if (str != null) {
                idVar.f39033c.setText(str);
                idVar.A = null;
            }
            idVar.f39033c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            idVar.f39033c.getEditText().setSingleLine(true);
            idVar.f39033c.getEditText().setImeOptions(5);
            idVar.f39033c.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(idVar) {

                public final id f36780b;

                {
                    this.f36780b = idVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i17, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (i12) {
                        case 0:
                            id idVar2 = this.f36780b;
                            if (i17 != 5) {
                                idVar2.getClass();
                            } else if (!TextUtils.isEmpty(idVar2.f39033c.getEditText().getText())) {
                                idVar2.f39055w.requestFocus();
                                return true;
                            }
                            return false;
                        default:
                            if (i17 != 6 || (v0Var = this.f36780b.f39029a) == null) {
                                return false;
                            }
                            v0Var.performClick();
                            return true;
                    }
                }
            });
            org.telegram.ui.Components.tt ttVar3 = idVar.f39033c;
            boolean z14 = LocaleController.isRTL;
            frameLayout.addView(ttVar3, h7.z5.d(-1, -2.0f, 16, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            idVar.f39055w = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            idVar.f39055w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor2 = idVar.f39055w;
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            idVar.f39055w.setBackgroundDrawable(null);
            idVar.f39055w.setLineColors(idVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23181k6), idVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23198l6), idVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
            idVar.f39055w.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            idVar.f39055w.setGravity(LocaleController.isRTL ? 5 : 3);
            idVar.f39055w.setInputType(180225);
            idVar.f39055w.setImeOptions(6);
            idVar.f39055w.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            idVar.f39055w.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            idVar.f39055w.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            idVar.f39055w.setCursorSize(AndroidUtilities.dp(20.0f));
            idVar.f39055w.setCursorWidth(1.5f);
            idVar.G.addView(idVar.f39055w, h7.z5.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            idVar.f39055w.setOnEditorActionListener(new TextView.OnEditorActionListener(idVar) {

                public final id f36780b;

                {
                    this.f36780b = idVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i18, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.v0 v0Var;
                    switch (i10) {
                        case 0:
                            id idVar2 = this.f36780b;
                            if (i18 != 5) {
                                idVar2.getClass();
                            } else if (!TextUtils.isEmpty(idVar2.f39033c.getEditText().getText())) {
                                idVar2.f39055w.requestFocus();
                                return true;
                            }
                            return false;
                        default:
                            if (i18 != 6 || (v0Var = this.f36780b.f39029a) == null) {
                                return false;
                            }
                            v0Var.performClick();
                            return true;
                    }
                }
            });
            idVar.f39055w.addTextChangedListener(new hd(0));
            TextView textView = new TextView(context);
            idVar.P = textView;
            textView.setTextSize(1, 15.0f);
            idVar.P.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.F6, false));
            idVar.P.setGravity(LocaleController.isRTL ? 5 : 3);
            idVar.P.setText(LocaleController.getString(R.string.DescriptionInfo));
            idVar.G.addView(idVar.P, h7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 24, 10, 24, 20));
        } else if (i15 == 1) {
            ScrollView scrollView = new ScrollView(context);
            idVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout2 = new LinearLayout(context);
            idVar.G = linearLayout2;
            linearLayout2.setOrientation(1);
            scrollView.addView(idVar.G, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = idVar.getMessagesController();
            long j10 = idVar.f39037e0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            boolean z15 = chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat));
            idVar.E = z15;
            idVar.actionBar.setTitle(LocaleController.getString(z15 ? R.string.GroupSettingsTitle : R.string.ChannelSettingsTitle));
            View view = idVar.fragmentView;
            int i18 = org.telegram.ui.ActionBar.g6.f22999a7;
            view.setTag(Integer.valueOf(i18));
            idVar.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, 23);
            idVar.C = j4Var;
            j4Var.setHeight(46);
            org.telegram.ui.Cells.j4 j4Var2 = idVar.C;
            int i19 = org.telegram.ui.ActionBar.g6.f23053d6;
            j4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            idVar.C.setText(LocaleController.getString(idVar.E ? R.string.GroupTypeHeader : R.string.ChannelTypeHeader));
            idVar.G.addView(idVar.C);
            LinearLayout linearLayout3 = new LinearLayout(context);
            idVar.B = linearLayout3;
            linearLayout3.setOrientation(1);
            idVar.B.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            idVar.G.addView(idVar.B, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, false);
            idVar.M = f6Var;
            f6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            Boolean bool = idVar.f39040g0;
            if (bool != null && !bool.booleanValue()) {
                idVar.W = true;
            }
            if (idVar.E) {
                idVar.M.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !idVar.W);
            } else {
                idVar.M.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !idVar.W);
            }
            idVar.M.setOnClickListener(new ad(idVar, i13));
            if (bool == null || bool.booleanValue()) {
                idVar.B.addView(idVar.M, h7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.f6 f6Var2 = new org.telegram.ui.Cells.f6(context, false);
            idVar.N = f6Var2;
            f6Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            if (bool != null && bool.booleanValue()) {
                idVar.W = false;
            }
            if (idVar.E) {
                idVar.N.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, idVar.W);
            } else {
                idVar.N.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, idVar.W);
            }
            idVar.N.setOnClickListener(new ad(idVar, 3));
            if (bool == null || !bool.booleanValue()) {
                idVar.B.addView(idVar.N, h7.z5.n(-1, -2));
            }
            org.telegram.ui.Cells.w6 w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
            idVar.d = w6Var;
            idVar.G.addView(w6Var, h7.z5.n(-1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            idVar.I = linearLayout4;
            linearLayout4.setOrientation(1);
            idVar.I.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            idVar.G.addView(idVar.I, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.j4 j4Var3 = new org.telegram.ui.Cells.j4(context);
            idVar.R = j4Var3;
            idVar.I.addView(j4Var3);
            LinearLayout linearLayout5 = new LinearLayout(context);
            idVar.J = linearLayout5;
            linearLayout5.setOrientation(0);
            idVar.I.addView(idVar.J, h7.z5.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
            idVar.D = editTextBoldCursor3;
            editTextBoldCursor3.setText(MessagesController.getInstance(idVar.currentAccount).linkPrefix + "/");
            idVar.D.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor4 = idVar.D;
            int i20 = org.telegram.ui.ActionBar.g6.H6;
            editTextBoldCursor4.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            EditTextBoldCursor editTextBoldCursor5 = idVar.D;
            int i21 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
            idVar.D.setMaxLines(1);
            idVar.D.setLines(1);
            idVar.D.setEnabled(false);
            idVar.D.setBackgroundDrawable(null);
            idVar.D.setPadding(0, 0, 0, 0);
            idVar.D.setSingleLine(true);
            idVar.D.setInputType(163840);
            idVar.D.setImeOptions(6);
            idVar.J.addView(idVar.D, h7.z5.n(-2, 36));
            EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
            idVar.f39055w = editTextBoldCursor6;
            editTextBoldCursor6.setTextSize(1, 18.0f);
            idVar.f39055w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            idVar.f39055w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
            idVar.f39055w.setMaxLines(1);
            idVar.f39055w.setLines(1);
            idVar.f39055w.setBackgroundDrawable(null);
            idVar.f39055w.setPadding(0, 0, 0, 0);
            idVar.f39055w.setSingleLine(true);
            idVar.f39055w.setInputType(163872);
            idVar.f39055w.setImeOptions(6);
            idVar.f39055w.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            idVar.f39055w.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i21, false));
            idVar.f39055w.setCursorSize(AndroidUtilities.dp(20.0f));
            idVar.f39055w.setCursorWidth(1.5f);
            idVar.J.addView(idVar.f39055w, h7.z5.n(-1, 36));
            idVar.f39055w.addTextChangedListener(new p0(idVar, i10));
            LinearLayout linearLayout6 = new LinearLayout(context);
            idVar.K = linearLayout6;
            linearLayout6.setOrientation(1);
            idVar.I.addView(idVar.K, h7.z5.n(-1, -2));
            org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(context, idVar, null, true, ChatObject.isChannel(idVar.getMessagesController().getChat(Long.valueOf(j10))));
            idVar.L = i80Var;
            i80Var.b(true);
            idVar.L.d(0, null, false);
            idVar.K.addView(idVar.L);
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(idVar, context, 3);
            idVar.Q = w1Var;
            w1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            idVar.Q.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
            idVar.Q.setTextSize(1, 15.0f);
            idVar.Q.setGravity(LocaleController.isRTL ? 5 : 3);
            idVar.Q.setVisibility(8);
            idVar.Q.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            idVar.I.addView(idVar.Q, h7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 18, 3, 18, 7));
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            idVar.O = x8Var;
            int i22 = R.drawable.greydivider_bottom;
            int i23 = org.telegram.ui.ActionBar.g6.f23018b7;
            x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i22, i23));
            idVar.G.addView(idVar.O, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
            idVar.f39034c0 = p4Var;
            idVar.G.addView(p4Var, h7.z5.n(-1, -2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            idVar.H = linearLayout7;
            linearLayout7.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            idVar.H.setOrientation(1);
            idVar.G.addView(idVar.H, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
            idVar.f39030a0 = x8Var2;
            x8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i23));
            idVar.G.addView(idVar.f39030a0, h7.z5.n(-1, -2));
            idVar.h0();
        }
        return idVar.fragmentView;
    }

    public final boolean d0(String str) {
        if (str == null || str.length() <= 0) {
            this.Q.setVisibility(8);
        } else {
            this.Q.setVisibility(0);
        }
        org.telegram.messenger.voip.l0 l0Var = this.U;
        if (l0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l0Var);
            this.U = null;
            this.T = null;
            if (this.S != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.S, true);
            }
        }
        this.V = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.Q.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.w1 w1Var = this.Q;
                int i10 = org.telegram.ui.ActionBar.g6.f23269p7;
                w1Var.setTag(Integer.valueOf(i10));
                this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                return false;
            }
            for (int i11 = 0; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (i11 == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    this.Q.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    org.telegram.ui.Cells.w1 w1Var2 = this.Q;
                    int i12 = org.telegram.ui.ActionBar.g6.f23269p7;
                    w1Var2.setTag(Integer.valueOf(i12));
                    this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    return false;
                }
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    this.Q.setText(LocaleController.getString(R.string.LinkInvalid));
                    org.telegram.ui.Cells.w1 w1Var3 = this.Q;
                    int i13 = org.telegram.ui.ActionBar.g6.f23269p7;
                    w1Var3.setTag(Integer.valueOf(i13));
                    this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            this.Q.setText(LocaleController.getString(R.string.LinkInvalidShort));
            org.telegram.ui.Cells.w1 w1Var4 = this.Q;
            int i14 = org.telegram.ui.ActionBar.g6.f23269p7;
            w1Var4.setTag(Integer.valueOf(i14));
            this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            return false;
        }
        if (str.length() > 32) {
            this.Q.setText(LocaleController.getString(R.string.LinkInvalidLong));
            org.telegram.ui.Cells.w1 w1Var5 = this.Q;
            int i15 = org.telegram.ui.ActionBar.g6.f23269p7;
            w1Var5.setTag(Integer.valueOf(i15));
            this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            return false;
        }
        this.Q.setText(LocaleController.getString(R.string.LinkChecking));
        org.telegram.ui.Cells.w1 w1Var6 = this.Q;
        int i16 = org.telegram.ui.ActionBar.g6.F6;
        w1Var6.setTag(Integer.valueOf(i16));
        this.Q.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.T = str;
        org.telegram.messenger.voip.l0 l0Var2 = new org.telegram.messenger.voip.l0(28, this, str);
        this.U = l0Var2;
        AndroidUtilities.runOnUIThread(l0Var2, 300L);
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.b2 b2Var = this.f39050q0;
            if (b2Var != null) {
                try {
                    b2Var.dismiss();
                    this.f39050q0 = null;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            g0(false);
            this.f39047n0 = false;
            return;
        }
        if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.b2 b2Var2 = this.f39050q0;
            if (b2Var2 != null) {
                try {
                    b2Var2.dismiss();
                    this.f39050q0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            long jLongValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", jLongValue);
            bundle.putBoolean("canCreatePublic", this.f39039f0);
            Boolean bool = this.f39040g0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f39041h0 != null || this.f39042i0 != null || this.f39043j0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(jLongValue, null, this.f39041h0, this.f39042i0, this.f39043j0, this.f39045l0, this.f39044k0, this.f39056x, this.f39057y, null);
            }
            id idVar = new id(bundle);
            idVar.f39049p0 = this.f39049p0;
            presentFragment(idVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var == null || !j40Var.g(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.j40 j40Var = this.v;
        return (j40Var == null || dialog != j40Var.f29571c) && super.dismissDialogOnPause(dialog);
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.h == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39046n;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f39046n.cancel();
            this.f39046n = null;
        }
        if (!z11) {
            if (z10) {
                this.h.setAlpha(1.0f);
                this.h.setVisibility(4);
                this.f39051r.setAlpha(1.0f);
                this.f39051r.setVisibility(0);
                return;
            }
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.f39051r.setAlpha(0.0f);
            this.f39051r.setVisibility(4);
            return;
        }
        this.f39046n = new AnimatorSet();
        if (z10) {
            this.f39051r.setVisibility(0);
            AnimatorSet animatorSet2 = this.f39046n;
            fd fdVar = this.h;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(fdVar, (Property<fd, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.f39051r, (Property<gd, Float>) property, 1.0f));
        } else {
            if (this.h.getVisibility() != 0) {
                this.h.setAlpha(0.0f);
            }
            this.h.setVisibility(0);
            AnimatorSet animatorSet3 = this.f39046n;
            fd fdVar2 = this.h;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(fdVar2, (Property<fd, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f39051r, (Property<gd, Float>) property2, 0.0f));
        }
        this.f39046n.setDuration(180L);
        this.f39046n.addListener(new ag.x(28, this, z10));
        this.f39046n.start();
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        ag.i1 i1Var = new ag.i1(2, this.currentAccount, getParentActivity(), this, null);
        i1Var.f445r0 = true;
        i1Var.D0 = new zc(this, 0);
        showDialog(i1Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f39052r0);
        }
        if (this.f39031b != null) {
            ValueAnimator valueAnimator = this.f39054s0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f39031b.f27834c, z10 ? 1.0f : 0.0f);
            this.f39054s0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g3(this, 4));
            this.f39054s0.setDuration((long) (Math.abs(this.f39031b.f27834c - (z10 ? 1.0f : 0.0f)) * 200.0f));
            this.f39054s0.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.f39054s0.start();
        }
    }

    @Override
    public final cu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f39033c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 3);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        org.telegram.ui.Components.tt ttVar = this.f39033c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ttVar, 4, null, null, null, null, i11));
        org.telegram.ui.Components.tt ttVar2 = this.f39033c;
        int i12 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ttVar2, 8388608, null, null, null, null, i12));
        org.telegram.ui.Components.tt ttVar3 = this.f39033c;
        int i13 = org.telegram.ui.ActionBar.g6.f23181k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ttVar3, 32, null, null, null, null, i13));
        org.telegram.ui.Components.tt ttVar4 = this.f39033c;
        int i14 = org.telegram.ui.ActionBar.g6.f23198l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ttVar4, 65568, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39055w, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39055w, 8388608, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39055w, 32, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39055w, 65568, null, null, null, null, i14));
        TextView textView = this.P;
        int i15 = org.telegram.ui.ActionBar.g6.F6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.I, 1, null, null, null, null, i10));
        org.telegram.ui.Cells.w6 w6Var = this.d;
        int i16 = org.telegram.ui.ActionBar.g6.f23018b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w6Var, 32, null, null, null, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 8388608, null, null, null, null, i12));
        org.telegram.ui.Cells.w1 w1Var = this.Q;
        int i18 = org.telegram.ui.ActionBar.g6.f23269p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w1Var, 262148, null, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262148, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 262148, null, null, null, null, org.telegram.ui.ActionBar.g6.f23391w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39030a0, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 1, null, null, null, null, i10));
        LinearLayout linearLayout = this.K;
        int i19 = org.telegram.ui.ActionBar.g6.f23144i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 0, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39034c0, 0, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4096, null, null, null, null, i19));
        int i20 = org.telegram.ui.ActionBar.g6.f23109g7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 8192, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        int i21 = org.telegram.ui.ActionBar.g6.f23126h7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 16384, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i22 = org.telegram.ui.ActionBar.g6.f23441z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4096, null, null, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 8192, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 16384, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"radioButton"}, null, null, -1, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 4, new Class[]{org.telegram.ui.Cells.f6.class}, new String[]{"valueTextView"}, null, null, -1, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i23 = org.telegram.ui.ActionBar.g6.f23423y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 4, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 2, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 8, new Class[]{org.telegram.ui.Cells.n.class}, new String[]{"deleteButton"}, null, null, -1, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23295r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    public final void h0() {
        if (this.d == null) {
            return;
        }
        int i10 = 8;
        if (this.W || this.f39039f0) {
            org.telegram.ui.Cells.x8 x8Var = this.O;
            int i11 = org.telegram.ui.ActionBar.g6.B6;
            x8Var.setTag(Integer.valueOf(i11));
            this.O.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.d.setVisibility(0);
            this.f39030a0.setVisibility(8);
            this.H.setVisibility(8);
            org.telegram.ui.Cells.x8 x8Var2 = this.O;
            x8Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(x8Var2.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
            this.I.setVisibility(0);
            this.f39034c0.setVisibility(8);
            if (this.E) {
                this.O.setText(LocaleController.getString(this.W ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.R.setText(LocaleController.getString(this.W ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.O.setText(LocaleController.getString(this.W ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.R.setText(LocaleController.getString(this.W ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.J.setVisibility(this.W ? 8 : 0);
            this.K.setVisibility(this.W ? 0 : 8);
            this.I.setPadding(0, 0, 0, this.W ? 0 : AndroidUtilities.dp(7.0f));
            org.telegram.ui.Components.i80 i80Var = this.L;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.Y;
            i80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            org.telegram.ui.Cells.w1 w1Var = this.Q;
            if (!this.W && w1Var.length() != 0) {
                i10 = 0;
            }
            w1Var.setVisibility(i10);
        } else {
            this.O.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.x8 x8Var3 = this.O;
            int i12 = org.telegram.ui.ActionBar.g6.f23269p7;
            x8Var3.setTag(Integer.valueOf(i12));
            this.O.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.I.setVisibility(8);
            this.d.setVisibility(8);
            if (this.Z) {
                this.f39034c0.setVisibility(0);
                this.H.setVisibility(8);
                org.telegram.ui.Cells.x8 x8Var4 = this.O;
                x8Var4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(x8Var4.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                this.f39030a0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.x8 x8Var5 = this.O;
                x8Var5.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(x8Var5.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
                this.f39034c0.setVisibility(8);
                this.H.setVisibility(0);
                this.f39030a0.setVisibility(0);
            }
        }
        this.M.a(!this.W);
        this.N.a(this.W);
        this.f39055w.clearFocus();
        AndroidUtilities.hideKeyboard(this.f39055w);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.i(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.tt ttVar = this.f39033c;
        if (ttVar == null || !ttVar.f32878e) {
            return true;
        }
        if (!z10) {
            return false;
        }
        ttVar.k(true);
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f39035d0 == 1 && !this.X && this.Y == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f39037e0;
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new yc(this, 3));
            }
        }
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.f29569a = this;
            j40Var.f29570b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f39048o0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39048o0.intValue(), true);
            this.f39048o0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.e();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.tt ttVar = this.f39033c;
        if (ttVar != null) {
            ttVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.tt ttVar = this.f39033c;
        if (ttVar != null) {
            ttVar.r();
        }
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.j();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.k(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.tt ttVar = this.f39033c;
        if (ttVar != null) {
            ttVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.j40 j40Var = this.v;
        if (j40Var != null) {
            j40Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.f39035d0 == 1) {
            return;
        }
        this.f39033c.requestFocus();
        org.telegram.ui.Components.ot otVar = this.f39033c.f32875a;
        otVar.requestFocus();
        AndroidUtilities.showKeyboard(otVar);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f39035d0 == 0) {
            org.telegram.ui.Components.j40 j40Var = this.v;
            if (j40Var != null) {
                j40Var.f29573f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.tt ttVar = this.f39033c;
                if (ttVar != null) {
                    ttVar.setText(string);
                } else {
                    this.A = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f39035d0 == 0) {
            org.telegram.ui.Components.j40 j40Var = this.v;
            if (j40Var != null && (str = j40Var.f29573f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.tt ttVar = this.f39033c;
            if (ttVar != null) {
                String string = ttVar.getText().toString();
                if (string.length() != 0) {
                    bundle.putString("nameTextView", string);
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
