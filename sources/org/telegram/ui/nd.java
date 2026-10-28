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
public final class nd extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.f50 {
    public TLRPC.FileLocation E;
    public String F;
    public LinearLayout G;
    public org.telegram.ui.Cells.q4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public org.telegram.ui.Components.yj0 K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public org.telegram.ui.Components.s90 Q;
    public org.telegram.ui.Cells.n6 R;
    public org.telegram.ui.Cells.n6 S;
    public org.telegram.ui.Cells.i9 T;
    public TextView U;
    public org.telegram.ui.Cells.w1 V;
    public org.telegram.ui.Cells.q4 W;
    public int X;
    public String Y;
    public org.telegram.messenger.voip.m0 Z;
    public org.telegram.ui.ActionBar.w0 f41743a;
    public boolean f41744a0;
    public org.telegram.ui.Components.cs f41745b;
    public boolean f41746b0;
    public org.telegram.ui.Components.gq f41747c;
    public boolean f41748c0;
    public org.telegram.ui.Components.ru d;
    public TLRPC.TL_chatInviteExported f41749d0;
    public org.telegram.ui.Cells.f7 e;
    public boolean f41750e0;
    public di.k4 f41751f;
    public org.telegram.ui.Cells.i9 f41752f0;
    public final ArrayList f41753g0;
    public fi.f6 h;
    public org.telegram.ui.Cells.w4 f41754h0;
    public final int f41755i0;
    public final long f41756j0;
    public boolean f41757k0;
    public final Boolean f41758l0;
    public TLRPC.InputFile m0;
    public kd f41759n;
    public TLRPC.InputFile f41760n0;
    public TLRPC.VideoSize f41761o0;
    public String f41762p0;
    public double f41763q0;
    public AnimatorSet f41764r;
    public boolean f41765r0;
    public ld f41766s;
    public boolean f41767s0;
    public Integer f41768t0;
    public Utilities.Callback2 f41769u0;
    public final org.telegram.ui.Components.j9 v;
    public org.telegram.ui.ActionBar.e2 f41770v0;
    public final org.telegram.ui.Components.g50 f41771w;
    public final cd f41772w0;
    public EditTextBoldCursor f41773x;
    public ValueAnimator f41774x0;
    public TLRPC.FileLocation f41775y;
    public int f41776y0;

    public nd(Bundle bundle) {
        super(bundle);
        this.f41753g0 = new ArrayList();
        this.f41757k0 = true;
        this.f41772w0 = new cd(this, 0);
        int i10 = bundle.getInt("step", 0);
        this.f41755i0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f41758l0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.v = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            this.f41771w = new org.telegram.ui.Components.g50(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new dd(this, 1));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f41757k0 = z10;
            this.f41746b0 = !z10;
            if (!z10 && !this.f41750e0) {
                this.f41750e0 = true;
                j0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new dd(this, 0));
            }
        }
        this.f41756j0 = bundle.getLong("chat_id", 0L);
    }

    public static void V(nd ndVar, org.telegram.ui.ActionBar.e2 e2Var) {
        ndVar.f41767s0 = false;
        ndVar.f41765r0 = false;
        if (ndVar.f41768t0 != null) {
            ConnectionsManager.getInstance(ndVar.currentAccount).cancelRequest(ndVar.f41768t0.intValue(), true);
            ndVar.f41768t0 = null;
        }
        ndVar.i0(false);
        e2Var.dismiss();
    }

    public static void W(nd ndVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_updateUsername, new dd(ndVar, 2), 64);
    }

    public static void X(nd ndVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = MessagesController.getInstance(ndVar.currentAccount).getInputChannel(ndVar.f41756j0);
        ndVar.X = ConnectionsManager.getInstance(ndVar.currentAccount).sendRequest(tL_channels_checkUsername, new ea(ndVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void Y(nd ndVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        if (currentChannel.megagroup) {
            int i10 = R.string.RevokeLinkAlert;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i10, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        } else {
            int i11 = R.string.RevokeLinkAlertChannel;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i11, MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.s0(12, ndVar, currentChannel));
        ndVar.showDialog(e2Var);
    }

    public static void Z(nd ndVar) {
        if (ndVar.f41770v0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ndVar.getParentActivity());
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.StopLoadingTitle);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.StopLoading);
        alertDialog$Builder.k(LocaleController.getString(R.string.WaitMore), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new y0(ndVar, 14));
        ndVar.f41770v0 = alertDialog$Builder.p();
    }

    @Override
    public final void F(float f7) {
        ld ldVar = this.f41766s;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        ld ldVar = this.f41766s;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23749y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23430h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f7;
        float f10;
        int i17;
        float f11;
        float f12;
        int i18;
        float f13;
        float f14;
        int i19;
        float f15;
        float f16;
        float f17;
        float f18;
        int i20;
        int i21;
        int i22;
        nd ndVar = this;
        org.telegram.ui.Components.ru ruVar = ndVar.d;
        if (ruVar != null) {
            ruVar.o();
        }
        ndVar.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ndVar.actionBar.setAllowOverlayTitle(true);
        ndVar.actionBar.setActionBarMenuOnItemClick(new id(ndVar));
        org.telegram.ui.ActionBar.z l4 = ndVar.actionBar.l();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i23 = org.telegram.ui.ActionBar.y6.f23695v8;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i23, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.gq gqVar = new org.telegram.ui.Components.gq(org.telegram.ui.ActionBar.y6.x0(null, i23, false));
        ndVar.f41747c = gqVar;
        org.telegram.ui.Components.cs csVar = new org.telegram.ui.Components.cs(mutate, gqVar);
        ndVar.f41745b = csVar;
        int dp = AndroidUtilities.dp(56.0f);
        String string = LocaleController.getString(R.string.Done);
        org.telegram.ui.ActionBar.k kVar = l4.f23779b;
        if (l4.f23780c) {
            i10 = kVar.f22781q0;
        } else {
            i10 = kVar.f22779p0;
        }
        org.telegram.ui.ActionBar.w0 b10 = l4.b(1, 0, null, i10, csVar, dp, string, null);
        ndVar.f41743a = b10;
        org.telegram.ui.ActionBar.f7.y(b10, mutate, i23, null, mode);
        int i24 = ndVar.f41755i0;
        if (i24 == 0) {
            ndVar.actionBar.setTitle(LocaleController.getString(R.string.NewChannel));
            jd jdVar = new jd(0, context, ndVar);
            jdVar.setOnTouchListener(new ei.d(2));
            ndVar.fragmentView = jdVar;
            int i25 = org.telegram.ui.ActionBar.y6.f23357d6;
            jdVar.setTag(Integer.valueOf(i25));
            org.telegram.ui.ActionBar.f7.i(i25, ndVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            ndVar.L = linearLayout;
            linearLayout.setOrientation(1);
            jdVar.addView(ndVar.L, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            ndVar.L.addView(frameLayout, org.telegram.ui.Components.kb1.r(-1, -2));
            di.k4 k4Var = new di.k4(ndVar, context, 5);
            ndVar.f41751f = k4Var;
            k4Var.setRoundRadius(AndroidUtilities.dp(32.0f));
            org.telegram.ui.Components.j9 j9Var = ndVar.v;
            j9Var.n(5L, null, null);
            ndVar.f41751f.setImageDrawable(j9Var);
            di.k4 k4Var2 = ndVar.f41751f;
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i26 = i16 | 48;
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
            frameLayout.addView(k4Var2, org.telegram.ui.Components.kb1.h(64, 64.0f, i26, f7, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            fi.f6 f6Var = new fi.f6(ndVar, context, paint, 3);
            ndVar.h = f6Var;
            f6Var.setContentDescription(LocaleController.getString(R.string.ChatSetPhotoOrVideo));
            fi.f6 f6Var2 = ndVar.h;
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i27 = i17 | 48;
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
            frameLayout.addView(f6Var2, org.telegram.ui.Components.kb1.h(64, 64.0f, i27, f11, 12.0f, f12, 12.0f));
            ndVar.h.setOnClickListener(new fd(ndVar, 1));
            ndVar.K = new org.telegram.ui.Components.yj0(R.raw.camera, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false, null);
            kd kdVar = new kd(ndVar, context, 0);
            ndVar.f41759n = kdVar;
            kdVar.setScaleType(ImageView.ScaleType.CENTER);
            ndVar.f41759n.setAnimation(ndVar.K);
            ndVar.f41759n.setEnabled(false);
            ndVar.f41759n.setClickable(false);
            ndVar.f41759n.setPadding(AndroidUtilities.dp(0.0f), 0, 0, AndroidUtilities.dp(1.0f));
            kd kdVar2 = ndVar.f41759n;
            boolean z13 = LocaleController.isRTL;
            if (z13) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i28 = i18 | 48;
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
            frameLayout.addView(kdVar2, org.telegram.ui.Components.kb1.h(64, 64.0f, i28, f13, 12.0f, f14, 12.0f));
            ld ldVar = new ld(ndVar, context, 0);
            ndVar.f41766s = ldVar;
            ldVar.setSize(AndroidUtilities.dp(30.0f));
            ndVar.f41766s.setProgressColor(-1);
            ndVar.f41766s.setNoProgress(false);
            ld ldVar2 = ndVar.f41766s;
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            int i29 = i19 | 48;
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
            frameLayout.addView(ldVar2, org.telegram.ui.Components.kb1.h(64, 64.0f, i29, f15, 12.0f, f16, 12.0f));
            ndVar.g0(false, false);
            org.telegram.ui.Components.ru ruVar2 = new org.telegram.ui.Components.ru(context, jdVar, this, 0, false, null);
            ndVar = this;
            ndVar.d = ruVar2;
            ruVar2.setHint(LocaleController.getString(R.string.EnterChannelName));
            String str = ndVar.F;
            if (str != null) {
                ndVar.d.setText(str);
                ndVar.F = null;
            }
            ndVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            ndVar.d.getEditText().setSingleLine(true);
            ndVar.d.getEditText().setImeOptions(5);
            ndVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) {
                public final nd f39588b;

                {
                    this.f39588b = ndVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i30, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            nd ndVar2 = this.f39588b;
                            if (i30 == 5) {
                                if (!TextUtils.isEmpty(ndVar2.d.getEditText().getText())) {
                                    ndVar2.f41773x.requestFocus();
                                    return true;
                                }
                            } else {
                                ndVar2.getClass();
                            }
                            return false;
                        default:
                            if (i30 == 6 && (w0Var = this.f39588b.f41743a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.ru ruVar3 = ndVar.d;
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
            frameLayout.addView(ruVar3, org.telegram.ui.Components.kb1.h(-1, -2.0f, 16, f17, 0.0f, f18, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            ndVar.f41773x = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.f7.E(ndVar.f41773x, org.telegram.ui.ActionBar.y6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = ndVar.f41773x;
            int i30 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor2, i30, null);
            ndVar.f41773x.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.f7.G(ndVar.f41773x, org.telegram.ui.ActionBar.y6.f23485k6, org.telegram.ui.ActionBar.y6.f23503l6, org.telegram.ui.ActionBar.y6.f23582p7, ndVar.getResourceProvider());
            ndVar.f41773x.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = ndVar.f41773x;
            if (LocaleController.isRTL) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            editTextBoldCursor3.setGravity(i20);
            ndVar.f41773x.setInputType(180225);
            ndVar.f41773x.setImeOptions(6);
            ndVar.f41773x.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            ndVar.f41773x.setHint(LocaleController.getString(R.string.DescriptionPlaceholder));
            org.telegram.ui.ActionBar.f7.w(ndVar.f41773x, i30, null);
            ndVar.f41773x.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.f41773x.setCursorWidth(1.5f);
            ndVar.L.addView(ndVar.f41773x, org.telegram.ui.Components.kb1.o(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            ndVar.f41773x.setOnEditorActionListener(new TextView.OnEditorActionListener(ndVar) {
                public final nd f39588b;

                {
                    this.f39588b = ndVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i302, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (r2) {
                        case 0:
                            nd ndVar2 = this.f39588b;
                            if (i302 == 5) {
                                if (!TextUtils.isEmpty(ndVar2.d.getEditText().getText())) {
                                    ndVar2.f41773x.requestFocus();
                                    return true;
                                }
                            } else {
                                ndVar2.getClass();
                            }
                            return false;
                        default:
                            if (i302 == 6 && (w0Var = this.f39588b.f41743a) != null) {
                                w0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            ndVar.f41773x.addTextChangedListener(new md(0));
            TextView textView = new TextView(context);
            ndVar.U = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.f7.V(ndVar.U, org.telegram.ui.ActionBar.y6.F6, null);
            TextView textView2 = ndVar.U;
            if (LocaleController.isRTL) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            textView2.setGravity(i21);
            ndVar.U.setText(LocaleController.getString(R.string.DescriptionInfo));
            LinearLayout linearLayout2 = ndVar.L;
            TextView textView3 = ndVar.U;
            if (LocaleController.isRTL) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            linearLayout2.addView(textView3, org.telegram.ui.Components.kb1.x(-2, -2, i22, 24, 10, 24, 20));
        } else if (i24 == 1) {
            ScrollView scrollView = new ScrollView(context);
            ndVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            ndVar.L = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(ndVar.L, new FrameLayout.LayoutParams(-1, -2));
            MessagesController messagesController = ndVar.getMessagesController();
            long j10 = ndVar.f41756j0;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
            if (chat != null && (!ChatObject.isChannel(chat) || ChatObject.isMegagroup(chat))) {
                z10 = true;
            } else {
                z10 = false;
            }
            ndVar.J = z10;
            org.telegram.ui.ActionBar.k kVar2 = ndVar.actionBar;
            if (z10) {
                i11 = R.string.GroupSettingsTitle;
            } else {
                i11 = R.string.ChannelSettingsTitle;
            }
            kVar2.setTitle(LocaleController.getString(i11));
            View view = ndVar.fragmentView;
            int i31 = org.telegram.ui.ActionBar.y6.f23300a7;
            view.setTag(Integer.valueOf(i31));
            org.telegram.ui.ActionBar.f7.i(i31, ndVar.fragmentView, null);
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, 23);
            ndVar.H = q4Var;
            q4Var.setHeight(46);
            org.telegram.ui.Cells.q4 q4Var2 = ndVar.H;
            int i32 = org.telegram.ui.ActionBar.y6.f23357d6;
            org.telegram.ui.ActionBar.f7.i(i32, q4Var2, null);
            org.telegram.ui.Cells.q4 q4Var3 = ndVar.H;
            if (ndVar.J) {
                i12 = R.string.GroupTypeHeader;
            } else {
                i12 = R.string.ChannelTypeHeader;
            }
            q4Var3.setText(LocaleController.getString(i12));
            ndVar.L.addView(ndVar.H);
            LinearLayout linearLayout4 = new LinearLayout(context);
            ndVar.G = linearLayout4;
            linearLayout4.setOrientation(1);
            org.telegram.ui.ActionBar.f7.i(i32, ndVar.G, null);
            ndVar.L.addView(ndVar.G, org.telegram.ui.Components.kb1.r(-1, -2));
            org.telegram.ui.Cells.n6 n6Var = new org.telegram.ui.Cells.n6(context, false);
            ndVar.R = n6Var;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(false);
            int i33 = org.telegram.ui.ActionBar.y6.f23449i6;
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i33);
            n6Var.setBackground(M0);
            org.telegram.ui.ActionBar.f7.k(n6Var, M0, null, N, null);
            Boolean bool = ndVar.f41758l0;
            if (bool != null && !bool.booleanValue()) {
                ndVar.f41746b0 = true;
            }
            if (ndVar.J) {
                i13 = 1;
                ndVar.R.b(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !ndVar.f41746b0);
            } else {
                i13 = 1;
                ndVar.R.b(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !ndVar.f41746b0);
            }
            ndVar.R.setOnClickListener(new fd(ndVar, 2));
            if (bool == null || bool.booleanValue()) {
                ndVar.G.addView(ndVar.R, org.telegram.ui.Components.kb1.r(-1, -2));
            }
            org.telegram.ui.Cells.n6 n6Var2 = new org.telegram.ui.Cells.n6(context, false);
            ndVar.S = n6Var2;
            org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.y6.M0(false);
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i33);
            n6Var2.setBackground(M02);
            org.telegram.ui.ActionBar.f7.k(n6Var2, M02, null, N2, null);
            if (bool != null && bool.booleanValue()) {
                ndVar.f41746b0 = false;
            }
            if (ndVar.J) {
                ndVar.S.b(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, ndVar.f41746b0);
            } else {
                ndVar.S.b(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, ndVar.f41746b0);
            }
            ndVar.S.setOnClickListener(new fd(ndVar, 3));
            if (bool == null || !bool.booleanValue()) {
                ndVar.G.addView(ndVar.S, org.telegram.ui.Components.kb1.r(-1, -2));
            }
            org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, (d3) null);
            ndVar.e = f7Var;
            ndVar.L.addView(f7Var, org.telegram.ui.Components.kb1.r(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            ndVar.N = linearLayout5;
            linearLayout5.setOrientation(i13);
            org.telegram.ui.ActionBar.f7.i(i32, ndVar.N, null);
            ndVar.L.addView(ndVar.N, org.telegram.ui.Components.kb1.r(-1, -2));
            org.telegram.ui.Cells.q4 q4Var4 = new org.telegram.ui.Cells.q4(context);
            ndVar.W = q4Var4;
            ndVar.N.addView(q4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            ndVar.O = linearLayout6;
            linearLayout6.setOrientation(0);
            ndVar.N.addView(ndVar.O, org.telegram.ui.Components.kb1.o(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            ndVar.I = editTextBoldCursor4;
            editTextBoldCursor4.setText(MessagesController.getInstance(ndVar.currentAccount).linkPrefix + "/");
            ndVar.I.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = ndVar.I;
            int i34 = org.telegram.ui.ActionBar.y6.H6;
            org.telegram.ui.ActionBar.f7.E(editTextBoldCursor5, i34, null);
            EditTextBoldCursor editTextBoldCursor6 = ndVar.I;
            int i35 = org.telegram.ui.ActionBar.y6.G6;
            org.telegram.ui.ActionBar.f7.V(editTextBoldCursor6, i35, null);
            ndVar.I.setMaxLines(1);
            ndVar.I.setLines(1);
            ndVar.I.setEnabled(false);
            ndVar.I.setBackgroundDrawable(null);
            ndVar.I.setPadding(0, 0, 0, 0);
            ndVar.I.setSingleLine(true);
            ndVar.I.setInputType(163840);
            ndVar.I.setImeOptions(6);
            ndVar.O.addView(ndVar.I, org.telegram.ui.Components.kb1.r(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            ndVar.f41773x = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.f7.E(ndVar.f41773x, i34, null);
            org.telegram.ui.ActionBar.f7.V(ndVar.f41773x, i35, null);
            ndVar.f41773x.setMaxLines(1);
            ndVar.f41773x.setLines(1);
            ndVar.f41773x.setBackgroundDrawable(null);
            ndVar.f41773x.setPadding(0, 0, 0, 0);
            ndVar.f41773x.setSingleLine(true);
            ndVar.f41773x.setInputType(163872);
            ndVar.f41773x.setImeOptions(6);
            ndVar.f41773x.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
            org.telegram.ui.ActionBar.f7.w(ndVar.f41773x, i35, null);
            ndVar.f41773x.setCursorSize(AndroidUtilities.dp(20.0f));
            ndVar.f41773x.setCursorWidth(1.5f);
            ndVar.O.addView(ndVar.f41773x, org.telegram.ui.Components.kb1.r(-1, 36));
            ndVar.f41773x.addTextChangedListener(new m0(ndVar, 1));
            LinearLayout linearLayout7 = new LinearLayout(context);
            ndVar.P = linearLayout7;
            linearLayout7.setOrientation(1);
            ndVar.N.addView(ndVar.P, org.telegram.ui.Components.kb1.r(-1, -2));
            org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(context, ndVar, null, true, ChatObject.isChannel(ndVar.getMessagesController().getChat(Long.valueOf(j10))));
            ndVar.Q = s90Var;
            s90Var.b(true);
            ndVar.Q.d(0, null, false);
            ndVar.P.addView(ndVar.Q);
            org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(ndVar, context, 3);
            ndVar.V = w1Var;
            org.telegram.ui.ActionBar.f7.H(w1Var, org.telegram.ui.ActionBar.y6.J6, null);
            org.telegram.ui.ActionBar.f7.D(ndVar.V, org.telegram.ui.ActionBar.y6.K6, null);
            ndVar.V.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.w1 w1Var2 = ndVar.V;
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            w1Var2.setGravity(i14);
            ndVar.V.setVisibility(8);
            ndVar.V.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
            LinearLayout linearLayout8 = ndVar.N;
            org.telegram.ui.Cells.w1 w1Var3 = ndVar.V;
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            linearLayout8.addView(w1Var3, org.telegram.ui.Components.kb1.x(-2, -2, i15, 18, 3, 18, 7));
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context);
            ndVar.T = i9Var;
            int i36 = R.drawable.greydivider_bottom;
            int i37 = org.telegram.ui.ActionBar.y6.f23319b7;
            org.telegram.ui.ActionBar.f7.a0(i36, i37, context, i9Var, null);
            ndVar.L.addView(ndVar.T, org.telegram.ui.Components.kb1.r(-1, -2));
            org.telegram.ui.Cells.w4 w4Var = new org.telegram.ui.Cells.w4(context);
            ndVar.f41754h0 = w4Var;
            ndVar.L.addView(w4Var, org.telegram.ui.Components.kb1.r(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            ndVar.M = linearLayout9;
            org.telegram.ui.ActionBar.f7.i(i32, linearLayout9, null);
            ndVar.M.setOrientation(1);
            ndVar.L.addView(ndVar.M, org.telegram.ui.Components.kb1.r(-1, -2));
            org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context);
            ndVar.f41752f0 = i9Var2;
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, i37, context, i9Var2, null);
            ndVar.L.addView(ndVar.f41752f0, org.telegram.ui.Components.kb1.r(-1, -2));
            ndVar.j0();
        }
        return ndVar.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatDidFailCreate) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f41770v0;
            if (e2Var != null) {
                try {
                    e2Var.dismiss();
                    this.f41770v0 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            i0(false);
            this.f41767s0 = false;
        } else if (i10 == NotificationCenter.chatDidCreated) {
            org.telegram.ui.ActionBar.e2 e2Var2 = this.f41770v0;
            if (e2Var2 != null) {
                try {
                    e2Var2.dismiss();
                    this.f41770v0 = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f41757k0);
            Boolean bool = this.f41758l0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.m0 != null || this.f41760n0 != null || this.f41761o0 != null) {
                MessagesController.getInstance(this.currentAccount).changeChatAvatar(longValue, null, this.m0, this.f41760n0, this.f41761o0, this.f41763q0, this.f41762p0, this.f41775y, this.E, null);
            }
            nd ndVar = new nd(bundle);
            ndVar.f41769u0 = this.f41769u0;
            presentFragment(ndVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.g50 g50Var = this.f41771w;
        if (g50Var != null && g50Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.g50 g50Var = this.f41771w;
        if ((g50Var == null || dialog != g50Var.f28390c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0() {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.O7, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.P7, false);
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Q7, false);
        int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.R7, false);
        int x06 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.S7, false);
        int x07 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.T7, false);
        int x08 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.U7, false) + ((x07 + ((x06 + ((x05 + ((x04 + ((x03 + ((x02 + (org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x08 != this.f41776y0) {
            this.f41776y0 = x08;
            LinearLayout linearLayout = this.M;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.M.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.k(nVar.f24497n, nVar.f24496f);
                        nVar.f24493a.invalidate();
                    }
                }
            }
        }
    }

    public final boolean f0(String str) {
        if (str != null && str.length() > 0) {
            this.V.setVisibility(0);
        } else {
            this.V.setVisibility(8);
        }
        org.telegram.messenger.voip.m0 m0Var = this.Z;
        if (m0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m0Var);
            this.Z = null;
            this.Y = null;
            if (this.X != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.X, true);
            }
        }
        this.f41744a0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        this.V.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                        org.telegram.ui.Cells.w1 w1Var = this.V;
                        int i11 = org.telegram.ui.ActionBar.y6.f23582p7;
                        w1Var.setTag(Integer.valueOf(i11));
                        org.telegram.ui.ActionBar.f7.V(this.V, i11, null);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.V.setText(LocaleController.getString(R.string.LinkInvalid));
                        org.telegram.ui.Cells.w1 w1Var2 = this.V;
                        int i12 = org.telegram.ui.ActionBar.y6.f23582p7;
                        w1Var2.setTag(Integer.valueOf(i12));
                        org.telegram.ui.ActionBar.f7.V(this.V, i12, null);
                        return false;
                    }
                }
            } else {
                this.V.setText(LocaleController.getString(R.string.LinkInvalid));
                org.telegram.ui.Cells.w1 w1Var3 = this.V;
                int i13 = org.telegram.ui.ActionBar.y6.f23582p7;
                w1Var3.setTag(Integer.valueOf(i13));
                org.telegram.ui.ActionBar.f7.V(this.V, i13, null);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.V.setText(LocaleController.getString(R.string.LinkInvalidLong));
                org.telegram.ui.Cells.w1 w1Var4 = this.V;
                int i14 = org.telegram.ui.ActionBar.y6.f23582p7;
                w1Var4.setTag(Integer.valueOf(i14));
                org.telegram.ui.ActionBar.f7.V(this.V, i14, null);
                return false;
            }
            this.V.setText(LocaleController.getString(R.string.LinkChecking));
            org.telegram.ui.Cells.w1 w1Var5 = this.V;
            int i15 = org.telegram.ui.ActionBar.y6.F6;
            w1Var5.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.f7.V(this.V, i15, null);
            this.Y = str;
            org.telegram.messenger.voip.m0 m0Var2 = new org.telegram.messenger.voip.m0(29, this, str);
            this.Z = m0Var2;
            AndroidUtilities.runOnUIThread(m0Var2, 300L);
            return true;
        }
        this.V.setText(LocaleController.getString(R.string.LinkInvalidShort));
        org.telegram.ui.Cells.w1 w1Var6 = this.V;
        int i16 = org.telegram.ui.ActionBar.y6.f23582p7;
        w1Var6.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.f7.V(this.V, i16, null);
        return false;
    }

    public final void g0(boolean z10, boolean z11) {
        if (this.f41759n == null) {
            return;
        }
        AnimatorSet animatorSet = this.f41764r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f41764r.cancel();
            this.f41764r = null;
        }
        if (z11) {
            this.f41764r = new AnimatorSet();
            if (z10) {
                this.f41766s.setVisibility(0);
                AnimatorSet animatorSet2 = this.f41764r;
                kd kdVar = this.f41759n;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f41766s, property, 1.0f));
            } else {
                if (this.f41759n.getVisibility() != 0) {
                    this.f41759n.setAlpha(0.0f);
                }
                this.f41759n.setVisibility(0);
                AnimatorSet animatorSet3 = this.f41764r;
                kd kdVar2 = this.f41759n;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f41766s, property2, 0.0f));
            }
            this.f41764r.setDuration(180L);
            this.f41764r.addListener(new bh.f0(28, this, z10));
            this.f41764r.start();
        } else if (z10) {
            this.f41759n.setAlpha(1.0f);
            this.f41759n.setVisibility(4);
            this.f41766s.setAlpha(1.0f);
            this.f41766s.setVisibility(0);
        } else {
            this.f41759n.setAlpha(1.0f);
            this.f41759n.setVisibility(0);
            this.f41766s.setAlpha(0.0f);
            this.f41766s.setVisibility(4);
        }
    }

    @Override
    public final su0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.ru ruVar = this.d;
        int i10 = org.telegram.ui.ActionBar.y6.f23485k6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(ruVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        org.telegram.ui.Components.ru ruVar2 = this.d;
        int i11 = org.telegram.ui.ActionBar.y6.f23503l6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(ruVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41773x, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41773x, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23319b7));
        LinearLayout linearLayout = this.P;
        int i12 = org.telegram.ui.ActionBar.y6.f23449i6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(linearLayout, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f41754h0, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23429h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        return arrayList;
    }

    public final void h0() {
        if (getParentActivity() == null) {
            return;
        }
        tg.j0 j0Var = new tg.j0(2, this.currentAccount, getParentActivity(), this, null);
        j0Var.f48939v0 = true;
        j0Var.H0 = new cd(this, 1);
        showDialog(j0Var);
    }

    public final void i0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.f41772w0);
        }
        if (this.f41745b != null) {
            ValueAnimator valueAnimator = this.f41774x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f41745b.f27241c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f41774x0 = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 3));
            ValueAnimator valueAnimator2 = this.f41774x0;
            float f12 = this.f41745b.f27241c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f41774x0.setInterpolator(org.telegram.ui.Components.ds.f27530f);
            this.f41774x0.start();
        }
    }

    public final void j0() {
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
        if (!this.f41746b0 && !this.f41757k0) {
            this.T.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            org.telegram.ui.Cells.i9 i9Var = this.T;
            int i17 = org.telegram.ui.ActionBar.y6.f23582p7;
            i9Var.setTag(Integer.valueOf(i17));
            org.telegram.ui.ActionBar.f7.V(this.T.getTextView(), i17, null);
            this.N.setVisibility(8);
            this.e.setVisibility(8);
            if (this.f41750e0) {
                this.f41754h0.setVisibility(0);
                this.M.setVisibility(8);
                org.telegram.ui.Cells.i9 i9Var2 = this.T;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23319b7, i9Var2.getContext(), i9Var2, null);
                this.f41752f0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.i9 i9Var3 = this.T;
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, org.telegram.ui.ActionBar.y6.f23319b7, i9Var3.getContext(), i9Var3, null);
                this.f41754h0.setVisibility(8);
                this.M.setVisibility(0);
                this.f41752f0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.i9 i9Var4 = this.T;
            int i18 = org.telegram.ui.ActionBar.y6.B6;
            i9Var4.setTag(Integer.valueOf(i18));
            org.telegram.ui.ActionBar.f7.V(this.T.getTextView(), i18, null);
            this.e.setVisibility(0);
            this.f41752f0.setVisibility(8);
            this.M.setVisibility(8);
            org.telegram.ui.Cells.i9 i9Var5 = this.T;
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23319b7, i9Var5.getContext(), i9Var5, null);
            this.N.setVisibility(0);
            this.f41754h0.setVisibility(8);
            if (this.J) {
                org.telegram.ui.Cells.i9 i9Var6 = this.T;
                if (this.f41746b0) {
                    i14 = R.string.MegaPrivateLinkHelp;
                } else {
                    i14 = R.string.MegaUsernameHelp;
                }
                i9Var6.setText(LocaleController.getString(i14));
                org.telegram.ui.Cells.q4 q4Var = this.W;
                if (this.f41746b0) {
                    i15 = R.string.ChannelInviteLinkTitle;
                } else {
                    i15 = R.string.ChannelLinkTitle;
                }
                q4Var.setText(LocaleController.getString(i15));
            } else {
                org.telegram.ui.Cells.i9 i9Var7 = this.T;
                if (this.f41746b0) {
                    i10 = R.string.ChannelPrivateLinkHelp;
                } else {
                    i10 = R.string.ChannelUsernameHelp;
                }
                i9Var7.setText(LocaleController.getString(i10));
                org.telegram.ui.Cells.q4 q4Var2 = this.W;
                if (this.f41746b0) {
                    i11 = R.string.ChannelInviteLinkTitle;
                } else {
                    i11 = R.string.ChannelLinkTitle;
                }
                q4Var2.setText(LocaleController.getString(i11));
            }
            LinearLayout linearLayout = this.O;
            if (this.f41746b0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            linearLayout.setVisibility(i12);
            LinearLayout linearLayout2 = this.P;
            if (this.f41746b0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout2.setVisibility(i13);
            LinearLayout linearLayout3 = this.N;
            if (this.f41746b0) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, dp);
            org.telegram.ui.Components.s90 s90Var = this.Q;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f41749d0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            s90Var.setLink(str);
            org.telegram.ui.Cells.w1 w1Var = this.V;
            if (!this.f41746b0 && w1Var.length() != 0) {
                i16 = 0;
            }
            w1Var.setVisibility(i16);
        }
        this.R.a(!this.f41746b0);
        this.S.a(this.f41746b0);
        this.f41773x.clearFocus();
        AndroidUtilities.hideKeyboard(this.f41773x);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.g50 g50Var = this.f41771w;
        if (g50Var != null) {
            g50Var.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ru ruVar = this.d;
        if (ruVar == null || !ruVar.e) {
            return true;
        }
        if (z10) {
            ruVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.chatDidFailCreate);
        if (this.f41755i0 == 1 && !this.f41748c0 && this.f41749d0 == null) {
            MessagesController messagesController = getMessagesController();
            long j10 = this.f41756j0;
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull != null) {
                this.f41749d0 = chatFull.exported_invite;
            }
            if (this.f41749d0 == null) {
                this.f41748c0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new dd(this, 3));
            }
        }
        org.telegram.ui.Components.g50 g50Var = this.f41771w;
        if (g50Var != null) {
            g50Var.f28388a = this;
            g50Var.f28389b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f41768t0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f41768t0.intValue(), true);
            this.f41768t0 = null;
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.g50 g50Var = this.f41771w;
        if (g50Var != null) {
            g50Var.d();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.ru ruVar = this.d;
        if (ruVar != null) {
            ruVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.ru ruVar = this.d;
        if (ruVar != null) {
            ruVar.r();
        }
        org.telegram.ui.Components.g50 g50Var = this.f41771w;
        if (g50Var != null) {
            g50Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.g50 g50Var = this.f41771w;
        if (g50Var != null) {
            g50Var.j(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ru ruVar = this.d;
        if (ruVar != null) {
            ruVar.s();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.g50 g50Var = this.f41771w;
        if (g50Var != null) {
            g50Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            e0();
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            org.telegram.ui.Components.gq gqVar = this.f41747c;
            if (gqVar != null) {
                gqVar.b(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23695v8, false));
            }
            org.telegram.ui.Cells.w4 w4Var = this.f41754h0;
            if (w4Var != null && w4Var.getChildCount() > 0 && (this.f41754h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f41754h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23429h6, false));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f41755i0 != 1) {
            this.d.requestFocus();
            org.telegram.ui.Components.mu muVar = this.d.f32365a;
            muVar.requestFocus();
            AndroidUtilities.showKeyboard(muVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f41755i0 == 0) {
            org.telegram.ui.Components.g50 g50Var = this.f41771w;
            if (g50Var != null) {
                g50Var.f28391f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.ru ruVar = this.d;
                if (ruVar != null) {
                    ruVar.setText(string);
                } else {
                    this.F = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f41755i0 == 0) {
            org.telegram.ui.Components.g50 g50Var = this.f41771w;
            if (g50Var != null && (str = g50Var.f28391f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.ru ruVar = this.d;
            if (ruVar != null) {
                String obj = ruVar.getText().toString();
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
    public final void Q() {
    }
}
