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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public final class ad extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, org.telegram.ui.Components.e30 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public String G;
    public LinearLayout H;
    public org.telegram.ui.Cells.n4 I;
    public EditTextBoldCursor J;
    public boolean K;
    public org.telegram.ui.Components.ch0 L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public org.telegram.ui.Components.m70 R;
    public org.telegram.ui.Cells.g6 S;
    public org.telegram.ui.Cells.g6 T;
    public org.telegram.ui.Cells.y8 U;
    public TextView V;
    public org.telegram.ui.Cells.b2 W;
    public org.telegram.ui.Cells.n4 X;
    public int Y;
    public String Z;
    public org.telegram.ui.ActionBar.q0 f43725a;
    public sc f43726a0;
    public org.telegram.ui.Components.wq f43727b;
    public boolean f43728b0;
    public org.telegram.ui.Components.cp f43729c;
    public boolean f43730c0;
    public org.telegram.ui.Components.jt d;
    public boolean f43731d0;
    public org.telegram.ui.Cells.x6 f43732e;
    public TLRPC.TL_chatInviteExported f43733e0;
    public ei.d4 f43734f;
    public boolean f43735f0;
    public org.telegram.ui.Cells.y8 f43736g0;
    public gi.n5 h;
    public final ArrayList f43737h0;
    public org.telegram.ui.Cells.t4 f43738i0;
    public final int f43739j0;
    public final long f43740k0;
    public boolean f43741l0;
    public final Boolean m0;
    public xc f43742n;
    public TLRPC.InputFile f43743n0;
    public TLRPC.InputFile f43744o0;
    public TLRPC.VideoSize f43745p0;
    public String f43746q0;
    public AnimatorSet f43747r;
    public double f43748r0;
    public yc f43749s;
    public boolean f43750s0;
    public boolean f43751t0;
    public Integer f43752u0;
    public org.telegram.messenger.n10 f43753v0;
    public final org.telegram.ui.Components.u8 f43754w;
    public org.telegram.ui.ActionBar.s1 f43755w0;
    public final org.telegram.ui.Components.f30 f43756x;
    public final qc f43757x0;
    public EditTextBoldCursor f43758y;
    public ValueAnimator f43759y0;
    public int f43760z0;

    public ad(Bundle bundle) {
        super(bundle);
        this.f43737h0 = new ArrayList();
        this.f43741l0 = true;
        this.f43757x0 = new qc(this, 0);
        int i3 = bundle.getInt("step", 0);
        this.f43739j0 = i3;
        if (bundle.containsKey("forcePublic")) {
            this.m0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i3 == 0) {
            this.f43754w = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            this.f43756x = new org.telegram.ui.Components.f30(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new rc(this, 1));
            return;
        }
        if (i3 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f43741l0 = z10;
            this.f43730c0 = !z10;
            if (!z10 && !this.f43735f0) {
                this.f43735f0 = true;
                n0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new rc(this, 0));
            }
        }
        this.f43740k0 = bundle.getLong("chat_id", 0L);
    }

    public static void Z(ad adVar, org.telegram.ui.ActionBar.s1 s1Var) {
        adVar.f43751t0 = false;
        adVar.f43750s0 = false;
        if (adVar.f43752u0 != null) {
            ConnectionsManager.getInstance(adVar.currentAccount).cancelRequest(adVar.f43752u0.intValue(), true);
            adVar.f43752u0 = null;
        }
        adVar.m0(false);
        s1Var.dismiss();
    }

    public static void a0(ad adVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = org.telegram.messenger.hp.i1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(adVar.currentAccount).sendRequest(tL_channels_updateUsername, new rc(adVar, 2), 64);
    }

    public static void b0(ad adVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = org.telegram.messenger.hp.s1(adVar.currentAccount).h1(adVar.f43740k0);
        adVar.Y = ConnectionsManager.getInstance(adVar.currentAccount).sendRequest(tL_channels_checkUsername, new y9(adVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void c0(ad adVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131689472, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        if (currentChannel.megagroup) {
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("RevokeLinkAlert", null, 2131746032, org.telegram.messenger.hp.s1(adVar.currentAccount).V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
        } else {
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("RevokeLinkAlertChannel", null, 2131746031, org.telegram.messenger.hp.s1(adVar.currentAccount).V2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746034, null), new mi.d4(17, adVar, currentChannel));
        adVar.showDialog(s1Var);
    }

    public static void d0(ad adVar) {
        if (adVar.f43755w0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131744842, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131744843, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743223, null), null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131744851, null), new x0(adVar, 14));
        adVar.f43755w0 = alertDialog$Builder.p();
    }

    @Override
    public final void H(float f10) {
        yc ycVar = this.f43749s;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        yc ycVar = this.f43749s;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        int i3;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        float f11;
        int i16;
        float f12;
        float f13;
        int i17;
        float f14;
        float f15;
        int i18;
        float f16;
        float f17;
        float f18;
        float f19;
        int i19;
        int i20;
        int i21;
        ad adVar = this;
        org.telegram.ui.Components.jt jtVar = adVar.d;
        if (jtVar != null) {
            jtVar.o();
        }
        adVar.actionBar.setBackButtonImage(2131231240);
        adVar.actionBar.setAllowOverlayTitle(true);
        adVar.actionBar.setActionBarMenuOnItemClick(new o9(adVar, 5));
        org.telegram.ui.ActionBar.x q10 = adVar.actionBar.q();
        Drawable g7 = k2.p1.g(context, 2131231242);
        int i22 = org.telegram.ui.ActionBar.k6.f28216v8;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i22, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        g7.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(org.telegram.ui.ActionBar.k6.x0(null, i22, false));
        adVar.f43729c = cpVar;
        org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(g7, cpVar);
        adVar.f43727b = wqVar;
        int L = org.telegram.messenger.g0.L(56.0f);
        String M0 = org.telegram.messenger.bd.M0(2131751355, null);
        org.telegram.ui.ActionBar.k kVar = q10.f28786b;
        if (q10.f28787c) {
            i3 = kVar.f27735r0;
        } else {
            i3 = kVar.f27732q0;
        }
        org.telegram.ui.ActionBar.q0 b10 = q10.b(1, 0, null, i3, wqVar, L, M0, null);
        adVar.f43725a = b10;
        org.telegram.ui.ActionBar.r6.y(b10, g7, i22, null, mode);
        int i23 = adVar.f43739j0;
        if (i23 == 0) {
            adVar.actionBar.setTitle(org.telegram.messenger.bd.M0(2131748294, null));
            wc wcVar = new wc(0, context, adVar);
            wcVar.setOnTouchListener(new fi.a(2));
            adVar.fragmentView = wcVar;
            int i24 = org.telegram.ui.ActionBar.k6.f27878d6;
            wcVar.setTag(Integer.valueOf(i24));
            org.telegram.ui.ActionBar.r6.i(i24, adVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            adVar.M = linearLayout;
            linearLayout.setOrientation(1);
            wcVar.addView(adVar.M, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            adVar.M.addView(frameLayout, b8.mf.o(-1, -2));
            ei.d4 d4Var = new ei.d4(5, context, adVar);
            adVar.f43734f = d4Var;
            d4Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
            org.telegram.ui.Components.u8 u8Var = adVar.f43754w;
            u8Var.k(5L, null, null, null);
            adVar.f43734f.setImageDrawable(u8Var);
            ei.d4 d4Var2 = adVar.f43734f;
            boolean z11 = org.telegram.messenger.bd.f21784a0;
            if (z11) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i25 = i15 | 48;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 16.0f;
            }
            if (z11) {
                f11 = 16.0f;
            } else {
                f11 = 0.0f;
            }
            frameLayout.addView(d4Var2, b8.mf.d(64, 64.0f, i25, f10, 12.0f, f11, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            gi.n5 n5Var = new gi.n5(adVar, context, paint, 3);
            adVar.h = n5Var;
            n5Var.setContentDescription(org.telegram.messenger.bd.M0(2131752212, null));
            gi.n5 n5Var2 = adVar.h;
            boolean z12 = org.telegram.messenger.bd.f21784a0;
            if (z12) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i26 = i16 | 48;
            if (z12) {
                f12 = 0.0f;
            } else {
                f12 = 16.0f;
            }
            if (z12) {
                f13 = 16.0f;
            } else {
                f13 = 0.0f;
            }
            frameLayout.addView(n5Var2, b8.mf.d(64, 64.0f, i26, f12, 12.0f, f13, 12.0f));
            adVar.h.setOnClickListener(new tc(adVar, 1));
            adVar.L = new org.telegram.ui.Components.ch0(2131623959, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
            xc xcVar = new xc(0, context, adVar);
            adVar.f43742n = xcVar;
            xcVar.setScaleType(ImageView.ScaleType.CENTER);
            adVar.f43742n.setAnimation(adVar.L);
            adVar.f43742n.setEnabled(false);
            adVar.f43742n.setClickable(false);
            adVar.f43742n.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
            xc xcVar2 = adVar.f43742n;
            boolean z13 = org.telegram.messenger.bd.f21784a0;
            if (z13) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i27 = i17 | 48;
            if (z13) {
                f14 = 0.0f;
            } else {
                f14 = 15.0f;
            }
            if (z13) {
                f15 = 15.0f;
            } else {
                f15 = 0.0f;
            }
            frameLayout.addView(xcVar2, b8.mf.d(64, 64.0f, i27, f14, 12.0f, f15, 12.0f));
            yc ycVar = new yc(adVar, context, 0);
            adVar.f43749s = ycVar;
            ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
            adVar.f43749s.setProgressColor(-1);
            adVar.f43749s.setNoProgress(false);
            yc ycVar2 = adVar.f43749s;
            boolean z14 = org.telegram.messenger.bd.f21784a0;
            if (z14) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i28 = i18 | 48;
            if (z14) {
                f16 = 0.0f;
            } else {
                f16 = 16.0f;
            }
            if (z14) {
                f17 = 16.0f;
            } else {
                f17 = 0.0f;
            }
            frameLayout.addView(ycVar2, b8.mf.d(64, 64.0f, i28, f16, 12.0f, f17, 12.0f));
            adVar.k0(false, false);
            org.telegram.ui.Components.jt jtVar2 = new org.telegram.ui.Components.jt(context, wcVar, adVar, 0, false, null);
            adVar = adVar;
            adVar.d = jtVar2;
            jtVar2.setHint(org.telegram.messenger.bd.M0(2131751125, null));
            String str = adVar.G;
            if (str != null) {
                adVar.d.setText(str);
                adVar.G = null;
            }
            adVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            adVar.d.getEditText().setSingleLine(true);
            adVar.d.getEditText().setImeOptions(5);
            adVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(adVar) {
                public final ad f50038b;

                {
                    this.f50038b = adVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i29, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (r2) {
                        case 0:
                            ad adVar2 = this.f50038b;
                            if (i29 == 5) {
                                if (!TextUtils.isEmpty(adVar2.d.getEditText().getText())) {
                                    adVar2.f43758y.requestFocus();
                                    return true;
                                }
                            } else {
                                adVar2.getClass();
                            }
                            return false;
                        default:
                            if (i29 == 6 && (q0Var = this.f50038b.f43725a) != null) {
                                q0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.jt jtVar3 = adVar.d;
            boolean z15 = org.telegram.messenger.bd.f21784a0;
            if (z15) {
                f18 = 5.0f;
            } else {
                f18 = 96.0f;
            }
            if (z15) {
                f19 = 96.0f;
            } else {
                f19 = 5.0f;
            }
            frameLayout.addView(jtVar3, b8.mf.d(-1, -2.0f, 16, f18, 0.0f, f19, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            adVar.f43758y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.E(adVar.f43758y, org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = adVar.f43758y;
            int i29 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i29, null);
            adVar.f43758y.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.G(adVar.f43758y, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, adVar.getResourceProvider());
            adVar.f43758y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = adVar.f43758y;
            if (org.telegram.messenger.bd.f21784a0) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            editTextBoldCursor3.setGravity(i19);
            adVar.f43758y.setInputType(180225);
            adVar.f43758y.setImeOptions(6);
            adVar.f43758y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            adVar.f43758y.setHint(org.telegram.messenger.bd.M0(2131751460, null));
            org.telegram.ui.ActionBar.r6.w(adVar.f43758y, i29, null);
            adVar.f43758y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            adVar.f43758y.setCursorWidth(1.5f);
            adVar.M.addView(adVar.f43758y, b8.mf.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            adVar.f43758y.setOnEditorActionListener(new TextView.OnEditorActionListener(adVar) {
                public final ad f50038b;

                {
                    this.f50038b = adVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i292, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (r2) {
                        case 0:
                            ad adVar2 = this.f50038b;
                            if (i292 == 5) {
                                if (!TextUtils.isEmpty(adVar2.d.getEditText().getText())) {
                                    adVar2.f43758y.requestFocus();
                                    return true;
                                }
                            } else {
                                adVar2.getClass();
                            }
                            return false;
                        default:
                            if (i292 == 6 && (q0Var = this.f50038b.f43725a) != null) {
                                q0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            adVar.f43758y.addTextChangedListener(new zc(0));
            TextView textView = new TextView(context);
            adVar.V = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(adVar.V, org.telegram.ui.ActionBar.k6.F6, null);
            TextView textView2 = adVar.V;
            if (org.telegram.messenger.bd.f21784a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            textView2.setGravity(i20);
            adVar.V.setText(org.telegram.messenger.bd.M0(2131751463, null));
            LinearLayout linearLayout2 = adVar.M;
            TextView textView3 = adVar.V;
            if (org.telegram.messenger.bd.f21784a0) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            linearLayout2.addView(textView3, b8.mf.t(-2, -2, i21, 24, 10, 24, 20));
        } else if (i23 == 1) {
            ScrollView scrollView = new ScrollView(context);
            adVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            adVar.M = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(adVar.M, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.messenger.hp messagesController = adVar.getMessagesController();
            long j10 = adVar.f43740k0;
            TLRPC.Chat M02 = messagesController.M0(Long.valueOf(j10));
            if (M02 != null && (!org.telegram.messenger.t3.T(M02) || org.telegram.messenger.t3.n0(M02))) {
                z10 = true;
            } else {
                z10 = false;
            }
            adVar.K = z10;
            org.telegram.ui.ActionBar.k kVar2 = adVar.actionBar;
            if (z10) {
                i10 = 2131749408;
            } else {
                i10 = 2131752297;
            }
            kVar2.setTitle(org.telegram.messenger.bd.M0(i10, null));
            View view = adVar.fragmentView;
            int i30 = org.telegram.ui.ActionBar.k6.f27824a7;
            view.setTag(Integer.valueOf(i30));
            org.telegram.ui.ActionBar.r6.i(i30, adVar.fragmentView, null);
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
            adVar.I = n4Var;
            n4Var.setHeight(46);
            org.telegram.ui.Cells.n4 n4Var2 = adVar.I;
            int i31 = org.telegram.ui.ActionBar.k6.f27878d6;
            org.telegram.ui.ActionBar.r6.i(i31, n4Var2, null);
            org.telegram.ui.Cells.n4 n4Var3 = adVar.I;
            if (adVar.K) {
                i11 = 2131749399;
            } else {
                i11 = 2131752275;
            }
            n4Var3.setText(org.telegram.messenger.bd.M0(i11, null));
            adVar.M.addView(adVar.I);
            LinearLayout linearLayout4 = new LinearLayout(context);
            adVar.H = linearLayout4;
            linearLayout4.setOrientation(1);
            org.telegram.ui.ActionBar.r6.i(i31, adVar.H, null);
            adVar.M.addView(adVar.H, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, false);
            adVar.S = g6Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(false);
            int i32 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i32);
            g6Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(g6Var, N0, null, N, null);
            Boolean bool = adVar.m0;
            if (bool != null && !bool.booleanValue()) {
                adVar.f43730c0 = true;
            }
            if (adVar.K) {
                i12 = 1;
                adVar.S.b(org.telegram.messenger.bd.M0(2131748646, null), org.telegram.messenger.bd.M0(2131748645, null), false, !adVar.f43730c0);
            } else {
                i12 = 1;
                adVar.S.b(org.telegram.messenger.bd.M0(2131752318, null), org.telegram.messenger.bd.M0(2131752315, null), false, !adVar.f43730c0);
            }
            adVar.S.setOnClickListener(new tc(adVar, 2));
            if (bool == null || bool.booleanValue()) {
                adVar.H.addView(adVar.S, b8.mf.o(-1, -2));
            }
            org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, false);
            adVar.T = g6Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(false);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i32);
            g6Var2.setBackground(N02);
            org.telegram.ui.ActionBar.r6.k(g6Var2, N02, null, N2, null);
            if (bool != null && bool.booleanValue()) {
                adVar.f43730c0 = false;
            }
            if (adVar.K) {
                adVar.T.b(org.telegram.messenger.bd.M0(2131748649, null), org.telegram.messenger.bd.M0(2131748648, null), false, adVar.f43730c0);
            } else {
                adVar.T.b(org.telegram.messenger.bd.M0(2131752329, null), org.telegram.messenger.bd.M0(2131752328, null), false, adVar.f43730c0);
            }
            adVar.T.setOnClickListener(new tc(adVar, 3));
            if (bool == null || !bool.booleanValue()) {
                adVar.H.addView(adVar.T, b8.mf.o(-1, -2));
            }
            org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
            adVar.f43732e = x6Var;
            adVar.M.addView(x6Var, b8.mf.o(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            adVar.O = linearLayout5;
            linearLayout5.setOrientation(i12);
            org.telegram.ui.ActionBar.r6.i(i31, adVar.O, null);
            adVar.M.addView(adVar.O, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
            adVar.X = n4Var4;
            adVar.O.addView(n4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            adVar.P = linearLayout6;
            linearLayout6.setOrientation(0);
            adVar.O.addView(adVar.P, b8.mf.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            adVar.J = editTextBoldCursor4;
            editTextBoldCursor4.setText(org.telegram.messenger.hp.s1(adVar.currentAccount).V2 + "/");
            adVar.J.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = adVar.J;
            int i33 = org.telegram.ui.ActionBar.k6.H6;
            org.telegram.ui.ActionBar.r6.E(editTextBoldCursor5, i33, null);
            EditTextBoldCursor editTextBoldCursor6 = adVar.J;
            int i34 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor6, i34, null);
            adVar.J.setMaxLines(1);
            adVar.J.setLines(1);
            adVar.J.setEnabled(false);
            adVar.J.setBackgroundDrawable(null);
            adVar.J.setPadding(0, 0, 0, 0);
            adVar.J.setSingleLine(true);
            adVar.J.setInputType(163840);
            adVar.J.setImeOptions(6);
            adVar.P.addView(adVar.J, b8.mf.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            adVar.f43758y = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.E(adVar.f43758y, i33, null);
            org.telegram.ui.ActionBar.r6.V(adVar.f43758y, i34, null);
            adVar.f43758y.setMaxLines(1);
            adVar.f43758y.setLines(1);
            adVar.f43758y.setBackgroundDrawable(null);
            adVar.f43758y.setPadding(0, 0, 0, 0);
            adVar.f43758y.setSingleLine(true);
            adVar.f43758y.setInputType(163872);
            adVar.f43758y.setImeOptions(6);
            adVar.f43758y.setHint(org.telegram.messenger.bd.M0(2131752266, null));
            org.telegram.ui.ActionBar.r6.w(adVar.f43758y, i34, null);
            adVar.f43758y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            adVar.f43758y.setCursorWidth(1.5f);
            adVar.P.addView(adVar.f43758y, b8.mf.o(-1, 36));
            adVar.f43758y.addTextChangedListener(new n0(adVar, 2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            adVar.Q = linearLayout7;
            linearLayout7.setOrientation(1);
            adVar.O.addView(adVar.Q, b8.mf.o(-1, -2));
            org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(context, adVar, null, true, org.telegram.messenger.t3.T(adVar.getMessagesController().M0(Long.valueOf(j10))));
            adVar.R = m70Var;
            m70Var.b(true);
            adVar.R.d(0, null, false);
            adVar.Q.addView(adVar.R);
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(3, context, adVar);
            adVar.W = b2Var;
            org.telegram.ui.ActionBar.r6.H(b2Var, org.telegram.ui.ActionBar.k6.J6, null);
            org.telegram.ui.ActionBar.r6.D(adVar.W, org.telegram.ui.ActionBar.k6.K6, null);
            adVar.W.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.b2 b2Var2 = adVar.W;
            if (org.telegram.messenger.bd.f21784a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            b2Var2.setGravity(i13);
            adVar.W.setVisibility(8);
            adVar.W.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
            LinearLayout linearLayout8 = adVar.O;
            org.telegram.ui.Cells.b2 b2Var3 = adVar.W;
            if (org.telegram.messenger.bd.f21784a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            linearLayout8.addView(b2Var3, b8.mf.t(-2, -2, i14, 18, 3, 18, 7));
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            adVar.U = y8Var;
            int i35 = org.telegram.ui.ActionBar.k6.f27843b7;
            org.telegram.ui.ActionBar.r6.a0(y8Var, context, 2131231230, i35);
            adVar.M.addView(adVar.U, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
            adVar.f43738i0 = t4Var;
            adVar.M.addView(t4Var, b8.mf.o(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            adVar.N = linearLayout9;
            org.telegram.ui.ActionBar.r6.i(i31, linearLayout9, null);
            adVar.N.setOrientation(1);
            adVar.M.addView(adVar.N, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
            adVar.f43736g0 = y8Var2;
            org.telegram.ui.ActionBar.r6.a0(y8Var2, context, 2131231230, i35);
            adVar.M.addView(adVar.f43736g0, b8.mf.o(-1, -2));
            adVar.n0();
        }
        return adVar.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.S) {
            org.telegram.ui.ActionBar.s1 s1Var = this.f43755w0;
            if (s1Var != null) {
                try {
                    s1Var.dismiss();
                    this.f43755w0 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            m0(false);
            this.f43751t0 = false;
        } else if (i3 == org.telegram.messenger.hs.R) {
            org.telegram.ui.ActionBar.s1 s1Var2 = this.f43755w0;
            if (s1Var2 != null) {
                try {
                    s1Var2.dismiss();
                    this.f43755w0 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f43741l0);
            Boolean bool = this.m0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f43743n0 != null || this.f43744o0 != null || this.f43745p0 != null) {
                org.telegram.messenger.hp.s1(this.currentAccount).B(longValue, null, this.f43743n0, this.f43744o0, this.f43745p0, this.f43748r0, this.f43746q0, this.E, this.F, null);
            }
            ad adVar = new ad(bundle);
            adVar.f43753v0 = this.f43753v0;
            presentFragment(adVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.f30 f30Var = this.f43756x;
        if (f30Var != null && f30Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.f30 f30Var = this.f43756x;
        if ((f30Var == null || dialog != f30Var.f33683c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final mq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.jt jtVar = this.d;
        int i3 = org.telegram.ui.ActionBar.k6.f28007k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(jtVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        org.telegram.ui.Components.jt jtVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.k6.f28026l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(jtVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43758y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43758y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43732e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27843b7));
        LinearLayout linearLayout = this.Q;
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43738i0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        return arrayList;
    }

    public final void i0() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O7, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P7, false);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q7, false);
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false);
        int x06 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S7, false);
        int x07 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false);
        int x08 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U7, false) + ((x07 + ((x06 + ((x05 + ((x04 + ((x03 + ((x02 + (org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x08 != this.f43760z0) {
            this.f43760z0 = x08;
            LinearLayout linearLayout = this.N;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.N.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f29646f);
                        nVar.f29642a.invalidate();
                    }
                }
            }
        }
    }

    public final boolean j0(String str) {
        if (str != null && str.length() > 0) {
            this.W.setVisibility(0);
        } else {
            this.W.setVisibility(8);
        }
        sc scVar = this.f43726a0;
        if (scVar != null) {
            org.telegram.messenger.g0.r(scVar);
            this.f43726a0 = null;
            this.Z = null;
            if (this.Y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            }
        }
        this.f43728b0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    if (i3 == 0 && charAt >= '0' && charAt <= '9') {
                        this.W.setText(org.telegram.messenger.bd.M0(2131748913, null));
                        org.telegram.ui.Cells.b2 b2Var = this.W;
                        int i10 = org.telegram.ui.ActionBar.k6.f28102p7;
                        b2Var.setTag(Integer.valueOf(i10));
                        org.telegram.ui.ActionBar.r6.V(this.W, i10, null);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.W.setText(org.telegram.messenger.bd.M0(2131748917, null));
                        org.telegram.ui.Cells.b2 b2Var2 = this.W;
                        int i11 = org.telegram.ui.ActionBar.k6.f28102p7;
                        b2Var2.setTag(Integer.valueOf(i11));
                        org.telegram.ui.ActionBar.r6.V(this.W, i11, null);
                        return false;
                    }
                }
            } else {
                this.W.setText(org.telegram.messenger.bd.M0(2131748917, null));
                org.telegram.ui.Cells.b2 b2Var3 = this.W;
                int i12 = org.telegram.ui.ActionBar.k6.f28102p7;
                b2Var3.setTag(Integer.valueOf(i12));
                org.telegram.ui.ActionBar.r6.V(this.W, i12, null);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.W.setText(org.telegram.messenger.bd.M0(2131748916, null));
                org.telegram.ui.Cells.b2 b2Var4 = this.W;
                int i13 = org.telegram.ui.ActionBar.k6.f28102p7;
                b2Var4.setTag(Integer.valueOf(i13));
                org.telegram.ui.ActionBar.r6.V(this.W, i13, null);
                return false;
            }
            this.W.setText(org.telegram.messenger.bd.M0(2131748930, null));
            org.telegram.ui.Cells.b2 b2Var5 = this.W;
            int i14 = org.telegram.ui.ActionBar.k6.F6;
            b2Var5.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.r6.V(this.W, i14, null);
            this.Z = str;
            sc scVar2 = new sc(0, this, str);
            this.f43726a0 = scVar2;
            org.telegram.messenger.g0.i3(scVar2, 300L);
            return true;
        }
        this.W.setText(org.telegram.messenger.bd.M0(2131748915, null));
        org.telegram.ui.Cells.b2 b2Var6 = this.W;
        int i15 = org.telegram.ui.ActionBar.k6.f28102p7;
        b2Var6.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.r6.V(this.W, i15, null);
        return false;
    }

    public final void k0(boolean z10, boolean z11) {
        if (this.f43742n == null) {
            return;
        }
        AnimatorSet animatorSet = this.f43747r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f43747r.cancel();
            this.f43747r = null;
        }
        if (z11) {
            this.f43747r = new AnimatorSet();
            if (z10) {
                this.f43749s.setVisibility(0);
                AnimatorSet animatorSet2 = this.f43747r;
                xc xcVar = this.f43742n;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, property, 0.0f), ObjectAnimator.ofFloat(this.f43749s, property, 1.0f));
            } else {
                if (this.f43742n.getVisibility() != 0) {
                    this.f43742n.setAlpha(0.0f);
                }
                this.f43742n.setVisibility(0);
                AnimatorSet animatorSet3 = this.f43747r;
                xc xcVar2 = this.f43742n;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(xcVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f43749s, property2, 0.0f));
            }
            this.f43747r.setDuration(180L);
            this.f43747r.addListener(new dh.x(27, this, z10));
            this.f43747r.start();
        } else if (z10) {
            this.f43742n.setAlpha(1.0f);
            this.f43742n.setVisibility(4);
            this.f43749s.setAlpha(1.0f);
            this.f43749s.setVisibility(0);
        } else {
            this.f43742n.setAlpha(1.0f);
            this.f43742n.setVisibility(0);
            this.f43749s.setAlpha(0.0f);
            this.f43749s.setVisibility(4);
        }
    }

    public final void l0() {
        if (getParentActivity() == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(2, this.currentAccount, getParentActivity(), this, null);
        i0Var.f56664o2 = true;
        i0Var.A2 = new qc(this, 1);
        showDialog(i0Var);
    }

    public final void m0(boolean z10) {
        float f10;
        if (!z10) {
            org.telegram.messenger.g0.r(this.f43757x0);
        }
        if (this.f43727b != null) {
            ValueAnimator valueAnimator = this.f43759y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f43727b.f40055c;
            float f12 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f43759y0 = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 3));
            ValueAnimator valueAnimator2 = this.f43759y0;
            float f13 = this.f43727b.f40055c;
            if (z10) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.f43759y0.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            this.f43759y0.start();
        }
    }

    public final void n0() {
        int i3;
        String M0;
        int i10;
        int i11;
        int L;
        int i12;
        String M02;
        if (this.f43732e == null) {
            return;
        }
        int i13 = 8;
        String str = null;
        if (!this.f43730c0 && !this.f43741l0) {
            this.U.setText(org.telegram.messenger.bd.M0(2131752533, null));
            org.telegram.ui.Cells.y8 y8Var = this.U;
            int i14 = org.telegram.ui.ActionBar.k6.f28102p7;
            y8Var.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.r6.V(this.U.getTextView(), i14, null);
            this.O.setVisibility(8);
            this.f43732e.setVisibility(8);
            if (this.f43735f0) {
                this.f43738i0.setVisibility(0);
                this.N.setVisibility(8);
                org.telegram.ui.Cells.y8 y8Var2 = this.U;
                org.telegram.ui.ActionBar.r6.a0(y8Var2, y8Var2.getContext(), 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
                this.f43736g0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.y8 y8Var3 = this.U;
                org.telegram.ui.ActionBar.r6.a0(y8Var3, y8Var3.getContext(), 2131231229, org.telegram.ui.ActionBar.k6.f27843b7);
                this.f43738i0.setVisibility(8);
                this.N.setVisibility(0);
                this.f43736g0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var4 = this.U;
            int i15 = org.telegram.ui.ActionBar.k6.B6;
            y8Var4.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.r6.V(this.U.getTextView(), i15, null);
            this.f43732e.setVisibility(0);
            this.f43736g0.setVisibility(8);
            this.N.setVisibility(8);
            org.telegram.ui.Cells.y8 y8Var5 = this.U;
            org.telegram.ui.ActionBar.r6.a0(y8Var5, y8Var5.getContext(), 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
            this.O.setVisibility(0);
            this.f43738i0.setVisibility(8);
            if (this.K) {
                org.telegram.ui.Cells.y8 y8Var6 = this.U;
                if (this.f43730c0) {
                    i12 = 2131748647;
                } else {
                    i12 = 2131748644;
                }
                y8Var6.setText(org.telegram.messenger.bd.M0(i12, null));
                org.telegram.ui.Cells.n4 n4Var = this.X;
                if (this.f43730c0) {
                    M02 = org.telegram.messenger.bd.M0(2131752403, null);
                } else {
                    M02 = org.telegram.messenger.bd.M0(2131752385, null);
                }
                n4Var.setText(M02);
            } else {
                org.telegram.ui.Cells.y8 y8Var7 = this.U;
                if (this.f43730c0) {
                    i3 = 2131752327;
                } else {
                    i3 = 2131752267;
                }
                y8Var7.setText(org.telegram.messenger.bd.M0(i3, null));
                org.telegram.ui.Cells.n4 n4Var2 = this.X;
                if (this.f43730c0) {
                    M0 = org.telegram.messenger.bd.M0(2131752403, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131752385, null);
                }
                n4Var2.setText(M0);
            }
            LinearLayout linearLayout = this.P;
            if (this.f43730c0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            linearLayout.setVisibility(i10);
            LinearLayout linearLayout2 = this.Q;
            if (this.f43730c0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
            LinearLayout linearLayout3 = this.O;
            if (this.f43730c0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            org.telegram.ui.Components.m70 m70Var = this.R;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f43733e0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            m70Var.setLink(str);
            org.telegram.ui.Cells.b2 b2Var = this.W;
            if (!this.f43730c0 && b2Var.length() != 0) {
                i13 = 0;
            }
            b2Var.setVisibility(i13);
        }
        this.S.a(!this.f43730c0);
        this.T.a(this.f43730c0);
        this.f43758y.clearFocus();
        org.telegram.messenger.g0.v1(this.f43758y);
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        org.telegram.ui.Components.f30 f30Var = this.f43756x;
        if (f30Var != null) {
            f30Var.h(i3, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jt jtVar = this.d;
        if (jtVar == null || !jtVar.f35191e) {
            return true;
        }
        if (z10) {
            jtVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.R);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.S);
        if (this.f43739j0 == 1 && !this.f43731d0 && this.f43733e0 == null) {
            org.telegram.messenger.hp messagesController = getMessagesController();
            long j10 = this.f43740k0;
            TLRPC.ChatFull N0 = messagesController.N0(j10);
            if (N0 != null) {
                this.f43733e0 = N0.exported_invite;
            }
            if (this.f43733e0 == null) {
                this.f43731d0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new rc(this, 3));
            }
        }
        org.telegram.ui.Components.f30 f30Var = this.f43756x;
        if (f30Var != null) {
            f30Var.f33681a = this;
            f30Var.f33682b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f43752u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f43752u0.intValue(), true);
            this.f43752u0 = null;
        }
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.R);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.S);
        org.telegram.ui.Components.f30 f30Var = this.f43756x;
        if (f30Var != null) {
            f30Var.d();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.jt jtVar = this.d;
        if (jtVar != null) {
            jtVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.jt jtVar = this.d;
        if (jtVar != null) {
            jtVar.r();
        }
        org.telegram.ui.Components.f30 f30Var = this.f43756x;
        if (f30Var != null) {
            f30Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.f30 f30Var = this.f43756x;
        if (f30Var != null) {
            f30Var.j(i3, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.jt jtVar = this.d;
        if (jtVar != null) {
            jtVar.s();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.f30 f30Var = this.f43756x;
        if (f30Var != null) {
            f30Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            i0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.cp cpVar = this.f43729c;
            if (cpVar != null) {
                cpVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28216v8, false));
            }
            org.telegram.ui.Cells.t4 t4Var = this.f43738i0;
            if (t4Var != null && t4Var.getChildCount() > 0 && (this.f43738i0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f43738i0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27955h6, false));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f43739j0 != 1) {
            this.d.requestFocus();
            org.telegram.ui.Components.dt dtVar = this.d.f35188a;
            dtVar.requestFocus();
            org.telegram.messenger.g0.K3(dtVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f43739j0 == 0) {
            org.telegram.ui.Components.f30 f30Var = this.f43756x;
            if (f30Var != null) {
                f30Var.f33685f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.jt jtVar = this.d;
                if (jtVar != null) {
                    jtVar.setText(string);
                } else {
                    this.G = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f43739j0 == 0) {
            org.telegram.ui.Components.f30 f30Var = this.f43756x;
            if (f30Var != null && (str = f30Var.f33685f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.jt jtVar = this.d;
            if (jtVar != null) {
                String obj = jtVar.getText().toString();
                if (obj.length() != 0) {
                    bundle.putString("nameTextView", obj);
                }
            }
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void T() {
    }
}
