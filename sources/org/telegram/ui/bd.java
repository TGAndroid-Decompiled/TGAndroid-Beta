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
public final class bd extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.i30 {
    public TLRPC.FileLocation D;
    public TLRPC.FileLocation E;
    public String F;
    public LinearLayout G;
    public org.telegram.ui.Cells.n4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public org.telegram.ui.Components.zg0 K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public org.telegram.ui.Components.q70 Q;
    public org.telegram.ui.Cells.h6 R;
    public org.telegram.ui.Cells.h6 S;
    public org.telegram.ui.Cells.z8 T;
    public TextView U;
    public org.telegram.ui.Cells.b2 V;
    public org.telegram.ui.Cells.n4 W;
    public int X;
    public String Y;
    public org.telegram.ui.ActionBar.p Z;
    public org.telegram.ui.ActionBar.r0 f44250a;
    public boolean f44251a0;
    public org.telegram.ui.Components.wq f44252b;
    public boolean f44253b0;
    public org.telegram.ui.Components.cp f44254c;
    public boolean f44255c0;
    public org.telegram.ui.Components.kt d;
    public TLRPC.TL_chatInviteExported f44256d0;
    public org.telegram.ui.Cells.y6 f44257e;
    public boolean f44258e0;
    public di.c4 f44259f;
    public org.telegram.ui.Cells.z8 f44260f0;
    public final ArrayList f44261g0;
    public fi.p5 h;
    public org.telegram.ui.Cells.t4 f44262h0;
    public final int f44263i0;
    public final long f44264j0;
    public boolean f44265k0;
    public final Boolean f44266l0;
    public TLRPC.InputFile m0;
    public yc f44267n;
    public TLRPC.InputFile f44268n0;
    public TLRPC.VideoSize f44269o0;
    public String f44270p0;
    public double f44271q0;
    public AnimatorSet f44272r;
    public boolean f44273r0;
    public zc f44274s;
    public boolean f44275s0;
    public Integer f44276t0;
    public org.telegram.messenger.v10 f44277u0;
    public org.telegram.ui.ActionBar.u1 f44278v0;
    public final org.telegram.ui.Components.w8 f44279w;
    public final sc f44280w0;
    public final org.telegram.ui.Components.j30 f44281x;
    public ValueAnimator f44282x0;
    public EditTextBoldCursor f44283y;
    public int f44284y0;

    public bd(Bundle bundle) {
        super(bundle);
        this.f44261g0 = new ArrayList();
        this.f44265k0 = true;
        this.f44280w0 = new sc(this, 0);
        int i7 = bundle.getInt("step", 0);
        this.f44263i0 = i7;
        if (bundle.containsKey("forcePublic")) {
            this.f44266l0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i7 == 0) {
            this.f44279w = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
            this.f44281x = new org.telegram.ui.Components.j30(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new tc(this, 1));
            return;
        }
        if (i7 == 1) {
            boolean z9 = bundle.getBoolean("canCreatePublic", true);
            this.f44265k0 = z9;
            this.f44253b0 = !z9;
            if (!z9 && !this.f44258e0) {
                this.f44258e0 = true;
                n0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new tc(this, 0));
            }
        }
        this.f44264j0 = bundle.getLong("chat_id", 0L);
    }

    public static void Z(bd bdVar, org.telegram.ui.ActionBar.u1 u1Var) {
        bdVar.f44275s0 = false;
        bdVar.f44273r0 = false;
        if (bdVar.f44276t0 != null) {
            ConnectionsManager.getInstance(bdVar.currentAccount).cancelRequest(bdVar.f44276t0.intValue(), true);
            bdVar.f44276t0 = null;
        }
        bdVar.m0(false);
        u1Var.dismiss();
    }

    public static void a0(bd bdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = org.telegram.messenger.qp.i1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(bdVar.currentAccount).sendRequest(tL_channels_updateUsername, new tc(bdVar, 2), 64);
    }

    public static void b0(bd bdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = org.telegram.messenger.qp.s1(bdVar.currentAccount).h1(bdVar.f44264j0);
        bdVar.X = ConnectionsManager.getInstance(bdVar.currentAccount).sendRequest(tL_channels_checkUsername, new z9(bdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void c0(bd bdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bdVar.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        if (currentChannel.megagroup) {
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("RevokeLinkAlert", null, 2131746023, org.telegram.messenger.qp.s1(bdVar.currentAccount).U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
        } else {
            u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("RevokeLinkAlertChannel", null, 2131746022, org.telegram.messenger.qp.s1(bdVar.currentAccount).U2 + "/" + org.telegram.messenger.t3.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746025, null), new ni.c(7, bdVar, currentChannel));
        bdVar.showDialog(u1Var);
    }

    public static void d0(bd bdVar) {
        if (bdVar.f44278v0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bdVar.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131744833, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131744834, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131743214, null), null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131744842, null), new w0(bdVar, 14));
        bdVar.f44278v0 = alertDialog$Builder.p();
    }

    @Override
    public final void H(float f10) {
        zc zcVar = this.f44274s;
        if (zcVar == null) {
            return;
        }
        zcVar.setProgress(f10);
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        zc zcVar = this.f44274s;
        if (zcVar == null) {
            return;
        }
        zcVar.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28259z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27905g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        boolean z9;
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
        final bd bdVar = this;
        org.telegram.ui.Components.kt ktVar = bdVar.d;
        if (ktVar != null) {
            ktVar.o();
        }
        bdVar.actionBar.setBackButtonImage(2131231240);
        bdVar.actionBar.setAllowOverlayTitle(true);
        bdVar.actionBar.setActionBarMenuOnItemClick(new w9(bdVar, 4));
        org.telegram.ui.ActionBar.y q10 = bdVar.actionBar.q();
        Drawable h = jg.g.h(context, 2131231242);
        int i22 = org.telegram.ui.ActionBar.k6.f28186v8;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i22, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        h.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(org.telegram.ui.ActionBar.k6.x0(null, i22, false));
        bdVar.f44254c = cpVar;
        org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(h, cpVar);
        bdVar.f44252b = wqVar;
        int L = org.telegram.messenger.g0.L(56.0f);
        String M0 = org.telegram.messenger.hd.M0(2131751355, null);
        org.telegram.ui.ActionBar.k kVar = q10.f28756b;
        if (q10.f28757c) {
            i7 = kVar.f27682q0;
        } else {
            i7 = kVar.f27680p0;
        }
        org.telegram.ui.ActionBar.r0 b10 = q10.b(1, 0, null, i7, wqVar, L, M0, null);
        bdVar.f44250a = b10;
        org.telegram.ui.ActionBar.r6.y(b10, h, i22, null, mode);
        int i23 = bdVar.f44263i0;
        if (i23 == 0) {
            bdVar.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748285, null));
            xc xcVar = new xc(0, context, bdVar);
            xcVar.setOnTouchListener(new ei.b(2));
            bdVar.fragmentView = xcVar;
            int i24 = org.telegram.ui.ActionBar.k6.f27849d6;
            xcVar.setTag(Integer.valueOf(i24));
            org.telegram.ui.ActionBar.r6.i(i24, bdVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            bdVar.L = linearLayout;
            linearLayout.setOrientation(1);
            xcVar.addView(bdVar.L, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            bdVar.L.addView(frameLayout, c8.ha.o(-1, -2));
            di.c4 c4Var = new di.c4(5, context, bdVar);
            bdVar.f44259f = c4Var;
            c4Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
            org.telegram.ui.Components.w8 w8Var = bdVar.f44279w;
            w8Var.k(5L, null, null, null);
            bdVar.f44259f.setImageDrawable(w8Var);
            di.c4 c4Var2 = bdVar.f44259f;
            boolean z10 = org.telegram.messenger.hd.f22878a0;
            if (z10) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i25 = i15 | 48;
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
            frameLayout.addView(c4Var2, c8.ha.d(64, 64.0f, i25, f10, 12.0f, f11, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            fi.p5 p5Var = new fi.p5(bdVar, context, paint, 3);
            bdVar.h = p5Var;
            p5Var.setContentDescription(org.telegram.messenger.hd.M0(2131752212, null));
            fi.p5 p5Var2 = bdVar.h;
            boolean z11 = org.telegram.messenger.hd.f22878a0;
            if (z11) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i26 = i16 | 48;
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
            frameLayout.addView(p5Var2, c8.ha.d(64, 64.0f, i26, f12, 12.0f, f13, 12.0f));
            bdVar.h.setOnClickListener(new uc(bdVar, 1));
            bdVar.K = new org.telegram.ui.Components.zg0(2131623959, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
            yc ycVar = new yc(0, context, bdVar);
            bdVar.f44267n = ycVar;
            ycVar.setScaleType(ImageView.ScaleType.CENTER);
            bdVar.f44267n.setAnimation(bdVar.K);
            bdVar.f44267n.setEnabled(false);
            bdVar.f44267n.setClickable(false);
            bdVar.f44267n.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
            yc ycVar2 = bdVar.f44267n;
            boolean z12 = org.telegram.messenger.hd.f22878a0;
            if (z12) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i27 = i17 | 48;
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
            frameLayout.addView(ycVar2, c8.ha.d(64, 64.0f, i27, f14, 12.0f, f15, 12.0f));
            zc zcVar = new zc(bdVar, context, 0);
            bdVar.f44274s = zcVar;
            zcVar.setSize(org.telegram.messenger.g0.L(30.0f));
            bdVar.f44274s.setProgressColor(-1);
            bdVar.f44274s.setNoProgress(false);
            zc zcVar2 = bdVar.f44274s;
            boolean z13 = org.telegram.messenger.hd.f22878a0;
            if (z13) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            int i28 = i18 | 48;
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
            frameLayout.addView(zcVar2, c8.ha.d(64, 64.0f, i28, f16, 12.0f, f17, 12.0f));
            bdVar.k0(false, false);
            org.telegram.ui.Components.kt ktVar2 = new org.telegram.ui.Components.kt(context, xcVar, bdVar, 0, false, null);
            bdVar = bdVar;
            bdVar.d = ktVar2;
            ktVar2.setHint(org.telegram.messenger.hd.M0(2131751125, null));
            String str = bdVar.F;
            if (str != null) {
                bdVar.d.setText(str);
                bdVar.F = null;
            }
            bdVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            bdVar.d.getEditText().setSingleLine(true);
            bdVar.d.getEditText().setImeOptions(5);
            bdVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(bdVar) {
                public final bd f50692b;

                {
                    this.f50692b = bdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i29, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.r0 r0Var;
                    switch (r2) {
                        case 0:
                            bd bdVar2 = this.f50692b;
                            if (i29 == 5) {
                                if (!TextUtils.isEmpty(bdVar2.d.getEditText().getText())) {
                                    bdVar2.f44283y.requestFocus();
                                    return true;
                                }
                            } else {
                                bdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i29 == 6 && (r0Var = this.f50692b.f44250a) != null) {
                                r0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.kt ktVar3 = bdVar.d;
            boolean z14 = org.telegram.messenger.hd.f22878a0;
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
            frameLayout.addView(ktVar3, c8.ha.d(-1, -2.0f, 16, f18, 0.0f, f19, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            bdVar.f44283y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.E(bdVar.f44283y, org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = bdVar.f44283y;
            int i29 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i29, null);
            bdVar.f44283y.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.r6.G(bdVar.f44283y, org.telegram.ui.ActionBar.k6.f27978k6, org.telegram.ui.ActionBar.k6.f27996l6, org.telegram.ui.ActionBar.k6.f28070p7, bdVar.getResourceProvider());
            bdVar.f44283y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = bdVar.f44283y;
            if (org.telegram.messenger.hd.f22878a0) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            editTextBoldCursor3.setGravity(i19);
            bdVar.f44283y.setInputType(180225);
            bdVar.f44283y.setImeOptions(6);
            bdVar.f44283y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            bdVar.f44283y.setHint(org.telegram.messenger.hd.M0(2131751460, null));
            org.telegram.ui.ActionBar.r6.w(bdVar.f44283y, i29, null);
            bdVar.f44283y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            bdVar.f44283y.setCursorWidth(1.5f);
            bdVar.L.addView(bdVar.f44283y, c8.ha.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            bdVar.f44283y.setOnEditorActionListener(new TextView.OnEditorActionListener(bdVar) {
                public final bd f50692b;

                {
                    this.f50692b = bdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i292, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.r0 r0Var;
                    switch (r2) {
                        case 0:
                            bd bdVar2 = this.f50692b;
                            if (i292 == 5) {
                                if (!TextUtils.isEmpty(bdVar2.d.getEditText().getText())) {
                                    bdVar2.f44283y.requestFocus();
                                    return true;
                                }
                            } else {
                                bdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i292 == 6 && (r0Var = this.f50692b.f44250a) != null) {
                                r0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            bdVar.f44283y.addTextChangedListener(new ad(0));
            TextView textView = new TextView(context);
            bdVar.U = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(bdVar.U, org.telegram.ui.ActionBar.k6.F6, null);
            TextView textView2 = bdVar.U;
            if (org.telegram.messenger.hd.f22878a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            textView2.setGravity(i20);
            bdVar.U.setText(org.telegram.messenger.hd.M0(2131751463, null));
            LinearLayout linearLayout2 = bdVar.L;
            TextView textView3 = bdVar.U;
            if (org.telegram.messenger.hd.f22878a0) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            linearLayout2.addView(textView3, c8.ha.t(-2, -2, i21, 24, 10, 24, 20));
        } else if (i23 == 1) {
            ScrollView scrollView = new ScrollView(context);
            bdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            bdVar.L = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(bdVar.L, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.messenger.qp messagesController = bdVar.getMessagesController();
            long j3 = bdVar.f44264j0;
            TLRPC.Chat M02 = messagesController.M0(Long.valueOf(j3));
            if (M02 != null && (!org.telegram.messenger.t3.T(M02) || org.telegram.messenger.t3.n0(M02))) {
                z9 = true;
            } else {
                z9 = false;
            }
            bdVar.J = z9;
            org.telegram.ui.ActionBar.k kVar2 = bdVar.actionBar;
            if (z9) {
                i10 = 2131749399;
            } else {
                i10 = 2131752297;
            }
            kVar2.setTitle(org.telegram.messenger.hd.M0(i10, null));
            View view = bdVar.fragmentView;
            int i30 = org.telegram.ui.ActionBar.k6.f27793a7;
            view.setTag(Integer.valueOf(i30));
            org.telegram.ui.ActionBar.r6.i(i30, bdVar.fragmentView, null);
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
            bdVar.H = n4Var;
            n4Var.setHeight(46);
            org.telegram.ui.Cells.n4 n4Var2 = bdVar.H;
            int i31 = org.telegram.ui.ActionBar.k6.f27849d6;
            org.telegram.ui.ActionBar.r6.i(i31, n4Var2, null);
            org.telegram.ui.Cells.n4 n4Var3 = bdVar.H;
            if (bdVar.J) {
                i11 = 2131749390;
            } else {
                i11 = 2131752275;
            }
            n4Var3.setText(org.telegram.messenger.hd.M0(i11, null));
            bdVar.L.addView(bdVar.H);
            LinearLayout linearLayout4 = new LinearLayout(context);
            bdVar.G = linearLayout4;
            linearLayout4.setOrientation(1);
            org.telegram.ui.ActionBar.r6.i(i31, bdVar.G, null);
            bdVar.L.addView(bdVar.G, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
            bdVar.R = h6Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(false);
            int i32 = org.telegram.ui.ActionBar.k6.f27941i6;
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i32);
            h6Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(h6Var, N0, null, N, null);
            Boolean bool = bdVar.f44266l0;
            if (bool != null && !bool.booleanValue()) {
                bdVar.f44253b0 = true;
            }
            if (bdVar.J) {
                i12 = 1;
                bdVar.R.b(org.telegram.messenger.hd.M0(2131748637, null), org.telegram.messenger.hd.M0(2131748636, null), false, !bdVar.f44253b0);
            } else {
                i12 = 1;
                bdVar.R.b(org.telegram.messenger.hd.M0(2131752318, null), org.telegram.messenger.hd.M0(2131752315, null), false, !bdVar.f44253b0);
            }
            bdVar.R.setOnClickListener(new uc(bdVar, 2));
            if (bool == null || bool.booleanValue()) {
                bdVar.G.addView(bdVar.R, c8.ha.o(-1, -2));
            }
            org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
            bdVar.S = h6Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(false);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i32);
            h6Var2.setBackground(N02);
            org.telegram.ui.ActionBar.r6.k(h6Var2, N02, null, N2, null);
            if (bool != null && bool.booleanValue()) {
                bdVar.f44253b0 = false;
            }
            if (bdVar.J) {
                bdVar.S.b(org.telegram.messenger.hd.M0(2131748640, null), org.telegram.messenger.hd.M0(2131748639, null), false, bdVar.f44253b0);
            } else {
                bdVar.S.b(org.telegram.messenger.hd.M0(2131752329, null), org.telegram.messenger.hd.M0(2131752328, null), false, bdVar.f44253b0);
            }
            bdVar.S.setOnClickListener(new uc(bdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                bdVar.G.addView(bdVar.S, c8.ha.o(-1, -2));
            }
            org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
            bdVar.f44257e = y6Var;
            bdVar.L.addView(y6Var, c8.ha.o(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            bdVar.N = linearLayout5;
            linearLayout5.setOrientation(i12);
            org.telegram.ui.ActionBar.r6.i(i31, bdVar.N, null);
            bdVar.L.addView(bdVar.N, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
            bdVar.W = n4Var4;
            bdVar.N.addView(n4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            bdVar.O = linearLayout6;
            linearLayout6.setOrientation(0);
            bdVar.N.addView(bdVar.O, c8.ha.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            bdVar.I = editTextBoldCursor4;
            editTextBoldCursor4.setText(org.telegram.messenger.qp.s1(bdVar.currentAccount).U2 + "/");
            bdVar.I.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = bdVar.I;
            int i33 = org.telegram.ui.ActionBar.k6.H6;
            org.telegram.ui.ActionBar.r6.E(editTextBoldCursor5, i33, null);
            EditTextBoldCursor editTextBoldCursor6 = bdVar.I;
            int i34 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor6, i34, null);
            bdVar.I.setMaxLines(1);
            bdVar.I.setLines(1);
            bdVar.I.setEnabled(false);
            bdVar.I.setBackgroundDrawable(null);
            bdVar.I.setPadding(0, 0, 0, 0);
            bdVar.I.setSingleLine(true);
            bdVar.I.setInputType(163840);
            bdVar.I.setImeOptions(6);
            bdVar.O.addView(bdVar.I, c8.ha.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            bdVar.f44283y = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.E(bdVar.f44283y, i33, null);
            org.telegram.ui.ActionBar.r6.V(bdVar.f44283y, i34, null);
            bdVar.f44283y.setMaxLines(1);
            bdVar.f44283y.setLines(1);
            bdVar.f44283y.setBackgroundDrawable(null);
            bdVar.f44283y.setPadding(0, 0, 0, 0);
            bdVar.f44283y.setSingleLine(true);
            bdVar.f44283y.setInputType(163872);
            bdVar.f44283y.setImeOptions(6);
            bdVar.f44283y.setHint(org.telegram.messenger.hd.M0(2131752266, null));
            org.telegram.ui.ActionBar.r6.w(bdVar.f44283y, i34, null);
            bdVar.f44283y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            bdVar.f44283y.setCursorWidth(1.5f);
            bdVar.O.addView(bdVar.f44283y, c8.ha.o(-1, 36));
            bdVar.f44283y.addTextChangedListener(new m0(bdVar, 2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            bdVar.P = linearLayout7;
            linearLayout7.setOrientation(1);
            bdVar.N.addView(bdVar.P, c8.ha.o(-1, -2));
            org.telegram.ui.Components.q70 q70Var = new org.telegram.ui.Components.q70(context, bdVar, null, true, org.telegram.messenger.t3.T(bdVar.getMessagesController().M0(Long.valueOf(j3))));
            bdVar.Q = q70Var;
            q70Var.b(true);
            bdVar.Q.d(0, null, false);
            bdVar.P.addView(bdVar.Q);
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(3, context, bdVar);
            bdVar.V = b2Var;
            org.telegram.ui.ActionBar.r6.H(b2Var, org.telegram.ui.ActionBar.k6.J6, null);
            org.telegram.ui.ActionBar.r6.D(bdVar.V, org.telegram.ui.ActionBar.k6.K6, null);
            bdVar.V.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.b2 b2Var2 = bdVar.V;
            if (org.telegram.messenger.hd.f22878a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            b2Var2.setGravity(i13);
            bdVar.V.setVisibility(8);
            bdVar.V.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
            LinearLayout linearLayout8 = bdVar.N;
            org.telegram.ui.Cells.b2 b2Var3 = bdVar.V;
            if (org.telegram.messenger.hd.f22878a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            linearLayout8.addView(b2Var3, c8.ha.t(-2, -2, i14, 18, 3, 18, 7));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            bdVar.T = z8Var;
            int i35 = org.telegram.ui.ActionBar.k6.f27813b7;
            org.telegram.ui.ActionBar.r6.a0(z8Var, context, 2131231230, i35);
            bdVar.L.addView(bdVar.T, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
            bdVar.f44262h0 = t4Var;
            bdVar.L.addView(t4Var, c8.ha.o(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            bdVar.M = linearLayout9;
            org.telegram.ui.ActionBar.r6.i(i31, linearLayout9, null);
            bdVar.M.setOrientation(1);
            bdVar.L.addView(bdVar.M, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            bdVar.f44260f0 = z8Var2;
            org.telegram.ui.ActionBar.r6.a0(z8Var2, context, 2131231230, i35);
            bdVar.L.addView(bdVar.f44260f0, c8.ha.o(-1, -2));
            bdVar.n0();
        }
        return bdVar.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.S) {
            org.telegram.ui.ActionBar.u1 u1Var = this.f44278v0;
            if (u1Var != null) {
                try {
                    u1Var.dismiss();
                    this.f44278v0 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            m0(false);
            this.f44275s0 = false;
        } else if (i7 == org.telegram.messenger.qs.R) {
            org.telegram.ui.ActionBar.u1 u1Var2 = this.f44278v0;
            if (u1Var2 != null) {
                try {
                    u1Var2.dismiss();
                    this.f44278v0 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f44265k0);
            Boolean bool = this.f44266l0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.m0 != null || this.f44268n0 != null || this.f44269o0 != null) {
                org.telegram.messenger.qp.s1(this.currentAccount).B(longValue, null, this.m0, this.f44268n0, this.f44269o0, this.f44271q0, this.f44270p0, this.D, this.E, null);
            }
            bd bdVar = new bd(bundle);
            bdVar.f44277u0 = this.f44277u0;
            presentFragment(bdVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.j30 j30Var = this.f44281x;
        if (j30Var != null && j30Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.j30 j30Var = this.f44281x;
        if ((j30Var == null || dialog != j30Var.f34860c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.d.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.kt ktVar = this.d;
        int i7 = org.telegram.ui.ActionBar.k6.f27978k6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(ktVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        org.telegram.ui.Components.kt ktVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.k6.f27996l6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(ktVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44283y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44283y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44257e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27813b7));
        LinearLayout linearLayout = this.P;
        int i11 = org.telegram.ui.ActionBar.k6.f27941i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44262h0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27923h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
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
        if (x08 != this.f44284y0) {
            this.f44284y0 = x08;
            LinearLayout linearLayout = this.M;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.M.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f29586f);
                        nVar.f29582a.invalidate();
                    }
                }
            }
        }
    }

    public final boolean j0(String str) {
        if (str != null && str.length() > 0) {
            this.V.setVisibility(0);
        } else {
            this.V.setVisibility(8);
        }
        org.telegram.ui.ActionBar.p pVar = this.Z;
        if (pVar != null) {
            org.telegram.messenger.g0.r(pVar);
            this.Z = null;
            this.Y = null;
            if (this.X != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.X, true);
            }
        }
        this.f44251a0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        this.V.setText(org.telegram.messenger.hd.M0(2131748904, null));
                        org.telegram.ui.Cells.b2 b2Var = this.V;
                        int i10 = org.telegram.ui.ActionBar.k6.f28070p7;
                        b2Var.setTag(Integer.valueOf(i10));
                        org.telegram.ui.ActionBar.r6.V(this.V, i10, null);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.V.setText(org.telegram.messenger.hd.M0(2131748908, null));
                        org.telegram.ui.Cells.b2 b2Var2 = this.V;
                        int i11 = org.telegram.ui.ActionBar.k6.f28070p7;
                        b2Var2.setTag(Integer.valueOf(i11));
                        org.telegram.ui.ActionBar.r6.V(this.V, i11, null);
                        return false;
                    }
                }
            } else {
                this.V.setText(org.telegram.messenger.hd.M0(2131748908, null));
                org.telegram.ui.Cells.b2 b2Var3 = this.V;
                int i12 = org.telegram.ui.ActionBar.k6.f28070p7;
                b2Var3.setTag(Integer.valueOf(i12));
                org.telegram.ui.ActionBar.r6.V(this.V, i12, null);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.V.setText(org.telegram.messenger.hd.M0(2131748907, null));
                org.telegram.ui.Cells.b2 b2Var4 = this.V;
                int i13 = org.telegram.ui.ActionBar.k6.f28070p7;
                b2Var4.setTag(Integer.valueOf(i13));
                org.telegram.ui.ActionBar.r6.V(this.V, i13, null);
                return false;
            }
            this.V.setText(org.telegram.messenger.hd.M0(2131748921, null));
            org.telegram.ui.Cells.b2 b2Var5 = this.V;
            int i14 = org.telegram.ui.ActionBar.k6.F6;
            b2Var5.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.r6.V(this.V, i14, null);
            this.Y = str;
            org.telegram.ui.ActionBar.p pVar2 = new org.telegram.ui.ActionBar.p(25, this, str);
            this.Z = pVar2;
            org.telegram.messenger.g0.i3(pVar2, 300L);
            return true;
        }
        this.V.setText(org.telegram.messenger.hd.M0(2131748906, null));
        org.telegram.ui.Cells.b2 b2Var6 = this.V;
        int i15 = org.telegram.ui.ActionBar.k6.f28070p7;
        b2Var6.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.r6.V(this.V, i15, null);
        return false;
    }

    public final void k0(boolean z9, boolean z10) {
        if (this.f44267n == null) {
            return;
        }
        AnimatorSet animatorSet = this.f44272r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f44272r.cancel();
            this.f44272r = null;
        }
        if (z10) {
            this.f44272r = new AnimatorSet();
            if (z9) {
                this.f44274s.setVisibility(0);
                AnimatorSet animatorSet2 = this.f44272r;
                yc ycVar = this.f44267n;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(ycVar, property, 0.0f), ObjectAnimator.ofFloat(this.f44274s, property, 1.0f));
            } else {
                if (this.f44267n.getVisibility() != 0) {
                    this.f44267n.setAlpha(0.0f);
                }
                this.f44267n.setVisibility(0);
                AnimatorSet animatorSet3 = this.f44272r;
                yc ycVar2 = this.f44267n;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ycVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f44274s, property2, 0.0f));
            }
            this.f44272r.setDuration(180L);
            this.f44272r.addListener(new ch.y(27, this, z9));
            this.f44272r.start();
        } else if (z9) {
            this.f44267n.setAlpha(1.0f);
            this.f44267n.setVisibility(4);
            this.f44274s.setAlpha(1.0f);
            this.f44274s.setVisibility(0);
        } else {
            this.f44267n.setAlpha(1.0f);
            this.f44267n.setVisibility(0);
            this.f44274s.setAlpha(0.0f);
            this.f44274s.setVisibility(4);
        }
    }

    public final void l0() {
        if (getParentActivity() == null) {
            return;
        }
        ug.i0 i0Var = new ug.i0(2, this.currentAccount, getParentActivity(), this, null);
        i0Var.f56523n2 = true;
        i0Var.f56535z2 = new sc(this, 1);
        showDialog(i0Var);
    }

    public final void m0(boolean z9) {
        float f10;
        if (!z9) {
            org.telegram.messenger.g0.r(this.f44280w0);
        }
        if (this.f44252b != null) {
            ValueAnimator valueAnimator = this.f44282x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f44252b.f40080c;
            float f12 = 0.0f;
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f44282x0 = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 3));
            ValueAnimator valueAnimator2 = this.f44282x0;
            float f13 = this.f44252b.f40080c;
            if (z9) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.f44282x0.setInterpolator(org.telegram.ui.Components.xq.f40345f);
            this.f44282x0.start();
        }
    }

    public final void n0() {
        int i7;
        String M0;
        int i10;
        int i11;
        int L;
        int i12;
        String M02;
        if (this.f44257e == null) {
            return;
        }
        int i13 = 8;
        String str = null;
        if (!this.f44253b0 && !this.f44265k0) {
            this.T.setText(org.telegram.messenger.hd.M0(2131752533, null));
            org.telegram.ui.Cells.z8 z8Var = this.T;
            int i14 = org.telegram.ui.ActionBar.k6.f28070p7;
            z8Var.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.r6.V(this.T.getTextView(), i14, null);
            this.N.setVisibility(8);
            this.f44257e.setVisibility(8);
            if (this.f44258e0) {
                this.f44262h0.setVisibility(0);
                this.M.setVisibility(8);
                org.telegram.ui.Cells.z8 z8Var2 = this.T;
                org.telegram.ui.ActionBar.r6.a0(z8Var2, z8Var2.getContext(), 2131231230, org.telegram.ui.ActionBar.k6.f27813b7);
                this.f44260f0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.z8 z8Var3 = this.T;
                org.telegram.ui.ActionBar.r6.a0(z8Var3, z8Var3.getContext(), 2131231229, org.telegram.ui.ActionBar.k6.f27813b7);
                this.f44262h0.setVisibility(8);
                this.M.setVisibility(0);
                this.f44260f0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var4 = this.T;
            int i15 = org.telegram.ui.ActionBar.k6.B6;
            z8Var4.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.r6.V(this.T.getTextView(), i15, null);
            this.f44257e.setVisibility(0);
            this.f44260f0.setVisibility(8);
            this.M.setVisibility(8);
            org.telegram.ui.Cells.z8 z8Var5 = this.T;
            org.telegram.ui.ActionBar.r6.a0(z8Var5, z8Var5.getContext(), 2131231230, org.telegram.ui.ActionBar.k6.f27813b7);
            this.N.setVisibility(0);
            this.f44262h0.setVisibility(8);
            if (this.J) {
                org.telegram.ui.Cells.z8 z8Var6 = this.T;
                if (this.f44253b0) {
                    i12 = 2131748638;
                } else {
                    i12 = 2131748635;
                }
                z8Var6.setText(org.telegram.messenger.hd.M0(i12, null));
                org.telegram.ui.Cells.n4 n4Var = this.W;
                if (this.f44253b0) {
                    M02 = org.telegram.messenger.hd.M0(2131752403, null);
                } else {
                    M02 = org.telegram.messenger.hd.M0(2131752385, null);
                }
                n4Var.setText(M02);
            } else {
                org.telegram.ui.Cells.z8 z8Var7 = this.T;
                if (this.f44253b0) {
                    i7 = 2131752327;
                } else {
                    i7 = 2131752267;
                }
                z8Var7.setText(org.telegram.messenger.hd.M0(i7, null));
                org.telegram.ui.Cells.n4 n4Var2 = this.W;
                if (this.f44253b0) {
                    M0 = org.telegram.messenger.hd.M0(2131752403, null);
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131752385, null);
                }
                n4Var2.setText(M0);
            }
            LinearLayout linearLayout = this.O;
            if (this.f44253b0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            linearLayout.setVisibility(i10);
            LinearLayout linearLayout2 = this.P;
            if (this.f44253b0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
            LinearLayout linearLayout3 = this.N;
            if (this.f44253b0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            org.telegram.ui.Components.q70 q70Var = this.Q;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f44256d0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            q70Var.setLink(str);
            org.telegram.ui.Cells.b2 b2Var = this.V;
            if (!this.f44253b0 && b2Var.length() != 0) {
                i13 = 0;
            }
            b2Var.setVisibility(i13);
        }
        this.R.a(!this.f44253b0);
        this.S.a(this.f44253b0);
        this.f44283y.clearFocus();
        org.telegram.messenger.g0.v1(this.f44283y);
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.j30 j30Var = this.f44281x;
        if (j30Var != null) {
            j30Var.h(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.kt ktVar = this.d;
        if (ktVar == null || !ktVar.f35410e) {
            return true;
        }
        if (z9) {
            ktVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.R);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.S);
        if (this.f44263i0 == 1 && !this.f44255c0 && this.f44256d0 == null) {
            org.telegram.messenger.qp messagesController = getMessagesController();
            long j3 = this.f44264j0;
            TLRPC.ChatFull N0 = messagesController.N0(j3);
            if (N0 != null) {
                this.f44256d0 = N0.exported_invite;
            }
            if (this.f44256d0 == null) {
                this.f44255c0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new tc(this, 3));
            }
        }
        org.telegram.ui.Components.j30 j30Var = this.f44281x;
        if (j30Var != null) {
            j30Var.f34858a = this;
            j30Var.f34859b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f44276t0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f44276t0.intValue(), true);
            this.f44276t0 = null;
        }
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.R);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.S);
        org.telegram.ui.Components.j30 j30Var = this.f44281x;
        if (j30Var != null) {
            j30Var.d();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.kt ktVar = this.d;
        if (ktVar != null) {
            ktVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.kt ktVar = this.d;
        if (ktVar != null) {
            ktVar.r();
        }
        org.telegram.ui.Components.j30 j30Var = this.f44281x;
        if (j30Var != null) {
            j30Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.j30 j30Var = this.f44281x;
        if (j30Var != null) {
            j30Var.j(i7, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.kt ktVar = this.d;
        if (ktVar != null) {
            ktVar.s();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.j30 j30Var = this.f44281x;
        if (j30Var != null) {
            j30Var.k();
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
            org.telegram.ui.Components.cp cpVar = this.f44254c;
            if (cpVar != null) {
                cpVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28186v8, false));
            }
            org.telegram.ui.Cells.t4 t4Var = this.f44262h0;
            if (t4Var != null && t4Var.getChildCount() > 0 && (this.f44262h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f44262h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27923h6, false));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && this.f44263i0 != 1) {
            this.d.requestFocus();
            org.telegram.ui.Components.et etVar = this.d.f35407a;
            etVar.requestFocus();
            org.telegram.messenger.g0.K3(etVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f44263i0 == 0) {
            org.telegram.ui.Components.j30 j30Var = this.f44281x;
            if (j30Var != null) {
                j30Var.f34862f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.kt ktVar = this.d;
                if (ktVar != null) {
                    ktVar.setText(string);
                } else {
                    this.F = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f44263i0 == 0) {
            org.telegram.ui.Components.j30 j30Var = this.f44281x;
            if (j30Var != null && (str = j30Var.f34862f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.kt ktVar = this.d;
            if (ktVar != null) {
                String obj = ktVar.getText().toString();
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
