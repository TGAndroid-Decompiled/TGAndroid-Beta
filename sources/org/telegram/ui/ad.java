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
public final class ad extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs, org.telegram.ui.Components.t30 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public String G;
    public LinearLayout H;
    public org.telegram.ui.Cells.n4 I;
    public EditTextBoldCursor J;
    public boolean K;
    public org.telegram.ui.Components.mh0 L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public org.telegram.ui.Components.e80 R;
    public org.telegram.ui.Cells.h6 S;
    public org.telegram.ui.Cells.h6 T;
    public org.telegram.ui.Cells.z8 U;
    public TextView V;
    public org.telegram.ui.Cells.b2 W;
    public org.telegram.ui.Cells.n4 X;
    public int Y;
    public String Z;
    public org.telegram.ui.ActionBar.r0 f45538a;
    public k9 f45539a0;
    public org.telegram.ui.Components.kr f45540b;
    public boolean f45541b0;
    public org.telegram.ui.Components.sp f45542c;
    public boolean f45543c0;
    public org.telegram.ui.Components.wt d;
    public boolean f45544d0;
    public org.telegram.ui.Cells.y6 f45545e;
    public TLRPC.TL_chatInviteExported f45546e0;
    public fi.t3 f45547f;
    public boolean f45548f0;
    public org.telegram.ui.Cells.z8 f45549g0;
    public hi.m5 h;
    public final ArrayList f45550h0;
    public org.telegram.ui.Cells.t4 f45551i0;
    public final int f45552j0;
    public final long f45553k0;
    public boolean f45554l0;
    public final Boolean m0;
    public xc f45555n;
    public TLRPC.InputFile f45556n0;
    public TLRPC.InputFile f45557o0;
    public TLRPC.VideoSize f45558p0;
    public String f45559q0;
    public AnimatorSet f45560r;
    public double f45561r0;
    public yc f45562s;
    public boolean f45563s0;
    public boolean f45564t0;
    public Integer f45565u0;
    public org.telegram.messenger.q10 f45566v0;
    public final org.telegram.ui.Components.b9 f45567w;
    public org.telegram.ui.ActionBar.u1 f45568w0;
    public final org.telegram.ui.Components.u30 f45569x;
    public final rc f45570x0;
    public EditTextBoldCursor f45571y;
    public ValueAnimator f45572y0;
    public int f45573z0;

    public ad(Bundle bundle) {
        super(bundle);
        this.f45550h0 = new ArrayList();
        this.f45554l0 = true;
        this.f45570x0 = new rc(this, 0);
        int i7 = bundle.getInt("step", 0);
        this.f45552j0 = i7;
        if (bundle.containsKey("forcePublic")) {
            this.m0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i7 == 0) {
            this.f45567w = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
            this.f45569x = new org.telegram.ui.Components.u30(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new sc(this, 1));
            return;
        }
        if (i7 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f45554l0 = z10;
            this.f45543c0 = !z10;
            if (!z10 && !this.f45548f0) {
                this.f45548f0 = true;
                n0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new sc(this, 0));
            }
        }
        this.f45553k0 = bundle.getLong("chat_id", 0L);
    }

    public static void Z(ad adVar, org.telegram.ui.ActionBar.u1 u1Var) {
        adVar.f45564t0 = false;
        adVar.f45563s0 = false;
        if (adVar.f45565u0 != null) {
            ConnectionsManager.getInstance(adVar.currentAccount).cancelRequest(adVar.f45565u0.intValue(), true);
            adVar.f45565u0 = null;
        }
        adVar.m0(false);
        u1Var.dismiss();
    }

    public static void a0(ad adVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = org.telegram.messenger.mp.k1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(adVar.currentAccount).sendRequest(tL_channels_updateUsername, new sc(adVar, 2), 64);
    }

    public static void b0(ad adVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = org.telegram.messenger.mp.u1(adVar.currentAccount).j1(adVar.f45553k0);
        adVar.Y = ConnectionsManager.getInstance(adVar.currentAccount).sendRequest(tL_channels_checkUsername, new z9(adVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void c0(ad adVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        if (currentChannel.megagroup) {
            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlert", null, 2131745827, org.telegram.messenger.mp.u1(adVar.currentAccount).X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
        } else {
            u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("RevokeLinkAlertChannel", null, 2131745826, org.telegram.messenger.mp.u1(adVar.currentAccount).X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745829, null), new oi.e0(9, adVar, currentChannel));
        adVar.showDialog(u1Var);
    }

    public static void d0(ad adVar) {
        if (adVar.f45568w0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131744597, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131744598, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131742976, null), null);
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131744606, null), new w0(adVar, 14));
        adVar.f45568w0 = alertDialog$Builder.p();
    }

    @Override
    public final void I(float f10) {
        yc ycVar = this.f45562s;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
        yc ycVar = this.f45562s;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.l(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 1));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29807z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
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
        final ad adVar = this;
        org.telegram.ui.Components.wt wtVar = adVar.d;
        if (wtVar != null) {
            wtVar.o();
        }
        adVar.actionBar.setBackButtonImage(2131231240);
        adVar.actionBar.setAllowOverlayTitle(true);
        adVar.actionBar.setActionBarMenuOnItemClick(new x7(adVar, 7));
        org.telegram.ui.ActionBar.z t6 = adVar.actionBar.t();
        Drawable g10 = i5.c.g(context, 2131231242);
        int i22 = org.telegram.ui.ActionBar.n6.f29733v8;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i22, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        g10.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.sp spVar = new org.telegram.ui.Components.sp(org.telegram.ui.ActionBar.n6.x0(null, i22, false));
        adVar.f45542c = spVar;
        org.telegram.ui.Components.kr krVar = new org.telegram.ui.Components.kr(g10, spVar);
        adVar.f45540b = krVar;
        int L = org.telegram.messenger.g0.L(56.0f);
        String M0 = org.telegram.messenger.gd.M0(2131751343, null);
        org.telegram.ui.ActionBar.k kVar = t6.f30299b;
        if (t6.f30300c) {
            i7 = kVar.f29095r0;
        } else {
            i7 = kVar.f29092q0;
        }
        org.telegram.ui.ActionBar.r0 b10 = t6.b(1, 0, null, i7, krVar, L, M0, null);
        adVar.f45538a = b10;
        org.telegram.ui.ActionBar.u6.x(b10, g10, i22, null, mode);
        int i23 = adVar.f45552j0;
        if (i23 == 0) {
            adVar.actionBar.setTitle(org.telegram.messenger.gd.M0(2131748094, null));
            wc wcVar = new wc(0, context, adVar);
            wcVar.setOnTouchListener(new gi.a(2));
            adVar.fragmentView = wcVar;
            int i24 = org.telegram.ui.ActionBar.n6.f29396d6;
            wcVar.setTag(Integer.valueOf(i24));
            org.telegram.ui.ActionBar.u6.h(i24, adVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            adVar.M = linearLayout;
            linearLayout.setOrientation(1);
            wcVar.addView(adVar.M, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            adVar.M.addView(frameLayout, c8.ma.o(-1, -2));
            fi.t3 t3Var = new fi.t3(5, context, adVar);
            adVar.f45547f = t3Var;
            t3Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
            org.telegram.ui.Components.b9 b9Var = adVar.f45567w;
            b9Var.k(5L, null, null, null);
            adVar.f45547f.setImageDrawable(b9Var);
            fi.t3 t3Var2 = adVar.f45547f;
            boolean z11 = org.telegram.messenger.gd.f24216a0;
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
            frameLayout.addView(t3Var2, c8.ma.d(64, 64.0f, i25, f10, 12.0f, f11, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            hi.m5 m5Var = new hi.m5(adVar, context, paint, 3);
            adVar.h = m5Var;
            m5Var.setContentDescription(org.telegram.messenger.gd.M0(2131752201, null));
            hi.m5 m5Var2 = adVar.h;
            boolean z12 = org.telegram.messenger.gd.f24216a0;
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
            frameLayout.addView(m5Var2, c8.ma.d(64, 64.0f, i26, f12, 12.0f, f13, 12.0f));
            adVar.h.setOnClickListener(new tc(adVar, 1));
            adVar.L = new org.telegram.ui.Components.mh0(2131623959, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
            xc xcVar = new xc(0, context, adVar);
            adVar.f45555n = xcVar;
            xcVar.setScaleType(ImageView.ScaleType.CENTER);
            adVar.f45555n.setAnimation(adVar.L);
            adVar.f45555n.setEnabled(false);
            adVar.f45555n.setClickable(false);
            adVar.f45555n.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
            xc xcVar2 = adVar.f45555n;
            boolean z13 = org.telegram.messenger.gd.f24216a0;
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
            frameLayout.addView(xcVar2, c8.ma.d(64, 64.0f, i27, f14, 12.0f, f15, 12.0f));
            yc ycVar = new yc(adVar, context, 0);
            adVar.f45562s = ycVar;
            ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
            adVar.f45562s.setProgressColor(-1);
            adVar.f45562s.setNoProgress(false);
            yc ycVar2 = adVar.f45562s;
            boolean z14 = org.telegram.messenger.gd.f24216a0;
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
            frameLayout.addView(ycVar2, c8.ma.d(64, 64.0f, i28, f16, 12.0f, f17, 12.0f));
            adVar.k0(false, false);
            org.telegram.ui.Components.wt wtVar2 = new org.telegram.ui.Components.wt(context, wcVar, adVar, 0, false, null);
            adVar = adVar;
            adVar.d = wtVar2;
            wtVar2.setHint(org.telegram.messenger.gd.M0(2131751113, null));
            String str = adVar.G;
            if (str != null) {
                adVar.d.setText(str);
                adVar.G = null;
            }
            adVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            adVar.d.getEditText().setSingleLine(true);
            adVar.d.getEditText().setImeOptions(5);
            adVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(adVar) {
                public final ad f52519b;

                {
                    this.f52519b = adVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i29, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.r0 r0Var;
                    switch (r2) {
                        case 0:
                            ad adVar2 = this.f52519b;
                            if (i29 == 5) {
                                if (!TextUtils.isEmpty(adVar2.d.getEditText().getText())) {
                                    adVar2.f45571y.requestFocus();
                                    return true;
                                }
                            } else {
                                adVar2.getClass();
                            }
                            return false;
                        default:
                            if (i29 == 6 && (r0Var = this.f52519b.f45538a) != null) {
                                r0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.wt wtVar3 = adVar.d;
            boolean z15 = org.telegram.messenger.gd.f24216a0;
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
            frameLayout.addView(wtVar3, c8.ma.d(-1, -2.0f, 16, f18, 0.0f, f19, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            adVar.f45571y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.u6.D(adVar.f45571y, org.telegram.ui.ActionBar.n6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = adVar.f45571y;
            int i29 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor2, i29, null);
            adVar.f45571y.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.u6.F(adVar.f45571y, org.telegram.ui.ActionBar.n6.f29525k6, org.telegram.ui.ActionBar.n6.f29543l6, org.telegram.ui.ActionBar.n6.f29617p7, adVar.getResourceProvider());
            adVar.f45571y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = adVar.f45571y;
            if (org.telegram.messenger.gd.f24216a0) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            editTextBoldCursor3.setGravity(i19);
            adVar.f45571y.setInputType(180225);
            adVar.f45571y.setImeOptions(6);
            adVar.f45571y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            adVar.f45571y.setHint(org.telegram.messenger.gd.M0(2131751448, null));
            org.telegram.ui.ActionBar.u6.v(adVar.f45571y, i29, null);
            adVar.f45571y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            adVar.f45571y.setCursorWidth(1.5f);
            adVar.M.addView(adVar.f45571y, c8.ma.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            adVar.f45571y.setOnEditorActionListener(new TextView.OnEditorActionListener(adVar) {
                public final ad f52519b;

                {
                    this.f52519b = adVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i292, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.r0 r0Var;
                    switch (r2) {
                        case 0:
                            ad adVar2 = this.f52519b;
                            if (i292 == 5) {
                                if (!TextUtils.isEmpty(adVar2.d.getEditText().getText())) {
                                    adVar2.f45571y.requestFocus();
                                    return true;
                                }
                            } else {
                                adVar2.getClass();
                            }
                            return false;
                        default:
                            if (i292 == 6 && (r0Var = this.f52519b.f45538a) != null) {
                                r0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            adVar.f45571y.addTextChangedListener(new zc(0));
            TextView textView = new TextView(context);
            adVar.V = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.u6.U(adVar.V, org.telegram.ui.ActionBar.n6.F6, null);
            TextView textView2 = adVar.V;
            if (org.telegram.messenger.gd.f24216a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            textView2.setGravity(i20);
            adVar.V.setText(org.telegram.messenger.gd.M0(2131751451, null));
            LinearLayout linearLayout2 = adVar.M;
            TextView textView3 = adVar.V;
            if (org.telegram.messenger.gd.f24216a0) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            linearLayout2.addView(textView3, c8.ma.t(-2, -2, i21, 24, 10, 24, 20));
        } else if (i23 == 1) {
            ScrollView scrollView = new ScrollView(context);
            adVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            adVar.M = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(adVar.M, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.messenger.mp messagesController = adVar.getMessagesController();
            long j3 = adVar.f45553k0;
            TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
            if (O0 != null && (!org.telegram.messenger.v3.T(O0) || org.telegram.messenger.v3.n0(O0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            adVar.K = z10;
            org.telegram.ui.ActionBar.k kVar2 = adVar.actionBar;
            if (z10) {
                i10 = 2131749208;
            } else {
                i10 = 2131752286;
            }
            kVar2.setTitle(org.telegram.messenger.gd.M0(i10, null));
            View view = adVar.fragmentView;
            int i30 = org.telegram.ui.ActionBar.n6.f29339a7;
            view.setTag(Integer.valueOf(i30));
            org.telegram.ui.ActionBar.u6.h(i30, adVar.fragmentView, null);
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
            adVar.I = n4Var;
            n4Var.setHeight(46);
            org.telegram.ui.Cells.n4 n4Var2 = adVar.I;
            int i31 = org.telegram.ui.ActionBar.n6.f29396d6;
            org.telegram.ui.ActionBar.u6.h(i31, n4Var2, null);
            org.telegram.ui.Cells.n4 n4Var3 = adVar.I;
            if (adVar.K) {
                i11 = 2131749199;
            } else {
                i11 = 2131752264;
            }
            n4Var3.setText(org.telegram.messenger.gd.M0(i11, null));
            adVar.M.addView(adVar.I);
            LinearLayout linearLayout4 = new LinearLayout(context);
            adVar.H = linearLayout4;
            linearLayout4.setOrientation(1);
            org.telegram.ui.ActionBar.u6.h(i31, adVar.H, null);
            adVar.M.addView(adVar.H, c8.ma.o(-1, -2));
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
            adVar.S = h6Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.n6.N0(false);
            int i32 = org.telegram.ui.ActionBar.n6.f29488i6;
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i32);
            h6Var.setBackground(N0);
            org.telegram.ui.ActionBar.u6.j(h6Var, N0, null, M, null);
            Boolean bool = adVar.m0;
            if (bool != null && !bool.booleanValue()) {
                adVar.f45543c0 = true;
            }
            if (adVar.K) {
                i12 = 1;
                adVar.S.b(org.telegram.messenger.gd.M0(2131748446, null), org.telegram.messenger.gd.M0(2131748445, null), false, !adVar.f45543c0);
            } else {
                i12 = 1;
                adVar.S.b(org.telegram.messenger.gd.M0(2131752307, null), org.telegram.messenger.gd.M0(2131752304, null), false, !adVar.f45543c0);
            }
            adVar.S.setOnClickListener(new tc(adVar, 2));
            if (bool == null || bool.booleanValue()) {
                adVar.H.addView(adVar.S, c8.ma.o(-1, -2));
            }
            org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
            adVar.T = h6Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.n6.N0(false);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i32);
            h6Var2.setBackground(N02);
            org.telegram.ui.ActionBar.u6.j(h6Var2, N02, null, M2, null);
            if (bool != null && bool.booleanValue()) {
                adVar.f45543c0 = false;
            }
            if (adVar.K) {
                adVar.T.b(org.telegram.messenger.gd.M0(2131748449, null), org.telegram.messenger.gd.M0(2131748448, null), false, adVar.f45543c0);
            } else {
                adVar.T.b(org.telegram.messenger.gd.M0(2131752318, null), org.telegram.messenger.gd.M0(2131752317, null), false, adVar.f45543c0);
            }
            adVar.T.setOnClickListener(new tc(adVar, 3));
            if (bool == null || !bool.booleanValue()) {
                adVar.H.addView(adVar.T, c8.ma.o(-1, -2));
            }
            org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
            adVar.f45545e = y6Var;
            adVar.M.addView(y6Var, c8.ma.o(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            adVar.O = linearLayout5;
            linearLayout5.setOrientation(i12);
            org.telegram.ui.ActionBar.u6.h(i31, adVar.O, null);
            adVar.M.addView(adVar.O, c8.ma.o(-1, -2));
            org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(context);
            adVar.X = n4Var4;
            adVar.O.addView(n4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            adVar.P = linearLayout6;
            linearLayout6.setOrientation(0);
            adVar.O.addView(adVar.P, c8.ma.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            adVar.J = editTextBoldCursor4;
            editTextBoldCursor4.setText(org.telegram.messenger.mp.u1(adVar.currentAccount).X2 + "/");
            adVar.J.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = adVar.J;
            int i33 = org.telegram.ui.ActionBar.n6.H6;
            org.telegram.ui.ActionBar.u6.D(editTextBoldCursor5, i33, null);
            EditTextBoldCursor editTextBoldCursor6 = adVar.J;
            int i34 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor6, i34, null);
            adVar.J.setMaxLines(1);
            adVar.J.setLines(1);
            adVar.J.setEnabled(false);
            adVar.J.setBackgroundDrawable(null);
            adVar.J.setPadding(0, 0, 0, 0);
            adVar.J.setSingleLine(true);
            adVar.J.setInputType(163840);
            adVar.J.setImeOptions(6);
            adVar.P.addView(adVar.J, c8.ma.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            adVar.f45571y = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.u6.D(adVar.f45571y, i33, null);
            org.telegram.ui.ActionBar.u6.U(adVar.f45571y, i34, null);
            adVar.f45571y.setMaxLines(1);
            adVar.f45571y.setLines(1);
            adVar.f45571y.setBackgroundDrawable(null);
            adVar.f45571y.setPadding(0, 0, 0, 0);
            adVar.f45571y.setSingleLine(true);
            adVar.f45571y.setInputType(163872);
            adVar.f45571y.setImeOptions(6);
            adVar.f45571y.setHint(org.telegram.messenger.gd.M0(2131752255, null));
            org.telegram.ui.ActionBar.u6.v(adVar.f45571y, i34, null);
            adVar.f45571y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            adVar.f45571y.setCursorWidth(1.5f);
            adVar.P.addView(adVar.f45571y, c8.ma.o(-1, 36));
            adVar.f45571y.addTextChangedListener(new m0(adVar, 2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            adVar.Q = linearLayout7;
            linearLayout7.setOrientation(1);
            adVar.O.addView(adVar.Q, c8.ma.o(-1, -2));
            org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(context, adVar, null, true, org.telegram.messenger.v3.T(adVar.getMessagesController().O0(Long.valueOf(j3))));
            adVar.R = e80Var;
            e80Var.b(true);
            adVar.R.d(0, null, false);
            adVar.Q.addView(adVar.R);
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(3, context, adVar);
            adVar.W = b2Var;
            org.telegram.ui.ActionBar.u6.G(b2Var, org.telegram.ui.ActionBar.n6.J6, null);
            org.telegram.ui.ActionBar.u6.C(adVar.W, org.telegram.ui.ActionBar.n6.K6, null);
            adVar.W.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.b2 b2Var2 = adVar.W;
            if (org.telegram.messenger.gd.f24216a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            b2Var2.setGravity(i13);
            adVar.W.setVisibility(8);
            adVar.W.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
            LinearLayout linearLayout8 = adVar.O;
            org.telegram.ui.Cells.b2 b2Var3 = adVar.W;
            if (org.telegram.messenger.gd.f24216a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            linearLayout8.addView(b2Var3, c8.ma.t(-2, -2, i14, 18, 3, 18, 7));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            adVar.U = z8Var;
            int i35 = org.telegram.ui.ActionBar.n6.f29360b7;
            org.telegram.ui.ActionBar.u6.Z(z8Var, context, 2131231230, i35);
            adVar.M.addView(adVar.U, c8.ma.o(-1, -2));
            org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
            adVar.f45551i0 = t4Var;
            adVar.M.addView(t4Var, c8.ma.o(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            adVar.N = linearLayout9;
            org.telegram.ui.ActionBar.u6.h(i31, linearLayout9, null);
            adVar.N.setOrientation(1);
            adVar.M.addView(adVar.N, c8.ma.o(-1, -2));
            org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
            adVar.f45549g0 = z8Var2;
            org.telegram.ui.ActionBar.u6.Z(z8Var2, context, 2131231230, i35);
            adVar.M.addView(adVar.f45549g0, c8.ma.o(-1, -2));
            adVar.n0();
        }
        return adVar.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.S) {
            org.telegram.ui.ActionBar.u1 u1Var = this.f45568w0;
            if (u1Var != null) {
                try {
                    u1Var.dismiss();
                    this.f45568w0 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            m0(false);
            this.f45564t0 = false;
        } else if (i7 == org.telegram.messenger.ks.R) {
            org.telegram.ui.ActionBar.u1 u1Var2 = this.f45568w0;
            if (u1Var2 != null) {
                try {
                    u1Var2.dismiss();
                    this.f45568w0 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f45554l0);
            Boolean bool = this.m0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f45556n0 != null || this.f45557o0 != null || this.f45558p0 != null) {
                org.telegram.messenger.mp.u1(this.currentAccount).B(longValue, null, this.f45556n0, this.f45557o0, this.f45558p0, this.f45561r0, this.f45559q0, this.E, this.F, null);
            }
            ad adVar = new ad(bundle);
            adVar.f45566v0 = this.f45566v0;
            presentFragment(adVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.u30 u30Var = this.f45569x;
        if (u30Var != null && u30Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.u30 u30Var = this.f45569x;
        if ((u30Var == null || dialog != u30Var.f40197c) && super.dismissDialogOnPause(dialog)) {
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
        org.telegram.ui.Components.wt wtVar = this.d;
        int i7 = org.telegram.ui.ActionBar.n6.f29525k6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(wtVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        org.telegram.ui.Components.wt wtVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.n6.f29543l6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(wtVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45571y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45571y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45545e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29360b7));
        LinearLayout linearLayout = this.Q;
        int i11 = org.telegram.ui.ActionBar.n6.f29488i6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(linearLayout, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f45551i0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29470h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        return arrayList;
    }

    public final void i0() {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O7, false);
        int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.P7, false);
        int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Q7, false);
        int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.R7, false);
        int x06 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.S7, false);
        int x07 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T7, false);
        int x08 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.U7, false) + ((x07 + ((x06 + ((x05 + ((x04 + ((x03 + ((x02 + (org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x08 != this.f45573z0) {
            this.f45573z0 = x08;
            LinearLayout linearLayout = this.N;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.N.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f31098f);
                        nVar.f31094a.invalidate();
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
        k9 k9Var = this.f45539a0;
        if (k9Var != null) {
            org.telegram.messenger.g0.r(k9Var);
            this.f45539a0 = null;
            this.Z = null;
            if (this.Y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            }
        }
        this.f45541b0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        this.W.setText(org.telegram.messenger.gd.M0(2131748713, null));
                        org.telegram.ui.Cells.b2 b2Var = this.W;
                        int i10 = org.telegram.ui.ActionBar.n6.f29617p7;
                        b2Var.setTag(Integer.valueOf(i10));
                        org.telegram.ui.ActionBar.u6.U(this.W, i10, null);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.W.setText(org.telegram.messenger.gd.M0(2131748717, null));
                        org.telegram.ui.Cells.b2 b2Var2 = this.W;
                        int i11 = org.telegram.ui.ActionBar.n6.f29617p7;
                        b2Var2.setTag(Integer.valueOf(i11));
                        org.telegram.ui.ActionBar.u6.U(this.W, i11, null);
                        return false;
                    }
                }
            } else {
                this.W.setText(org.telegram.messenger.gd.M0(2131748717, null));
                org.telegram.ui.Cells.b2 b2Var3 = this.W;
                int i12 = org.telegram.ui.ActionBar.n6.f29617p7;
                b2Var3.setTag(Integer.valueOf(i12));
                org.telegram.ui.ActionBar.u6.U(this.W, i12, null);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.W.setText(org.telegram.messenger.gd.M0(2131748716, null));
                org.telegram.ui.Cells.b2 b2Var4 = this.W;
                int i13 = org.telegram.ui.ActionBar.n6.f29617p7;
                b2Var4.setTag(Integer.valueOf(i13));
                org.telegram.ui.ActionBar.u6.U(this.W, i13, null);
                return false;
            }
            this.W.setText(org.telegram.messenger.gd.M0(2131748730, null));
            org.telegram.ui.Cells.b2 b2Var5 = this.W;
            int i14 = org.telegram.ui.ActionBar.n6.F6;
            b2Var5.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.u6.U(this.W, i14, null);
            this.Z = str;
            k9 k9Var2 = new k9(10, this, str);
            this.f45539a0 = k9Var2;
            org.telegram.messenger.g0.h3(k9Var2, 300L);
            return true;
        }
        this.W.setText(org.telegram.messenger.gd.M0(2131748715, null));
        org.telegram.ui.Cells.b2 b2Var6 = this.W;
        int i15 = org.telegram.ui.ActionBar.n6.f29617p7;
        b2Var6.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.u6.U(this.W, i15, null);
        return false;
    }

    public final void k0(boolean z10, boolean z11) {
        if (this.f45555n == null) {
            return;
        }
        AnimatorSet animatorSet = this.f45560r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f45560r.cancel();
            this.f45560r = null;
        }
        if (z11) {
            this.f45560r = new AnimatorSet();
            if (z10) {
                this.f45562s.setVisibility(0);
                AnimatorSet animatorSet2 = this.f45560r;
                xc xcVar = this.f45555n;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, property, 0.0f), ObjectAnimator.ofFloat(this.f45562s, property, 1.0f));
            } else {
                if (this.f45555n.getVisibility() != 0) {
                    this.f45555n.setAlpha(0.0f);
                }
                this.f45555n.setVisibility(0);
                AnimatorSet animatorSet3 = this.f45560r;
                xc xcVar2 = this.f45555n;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(xcVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f45562s, property2, 0.0f));
            }
            this.f45560r.setDuration(180L);
            this.f45560r.addListener(new bi.e7(28, this, z10));
            this.f45560r.start();
        } else if (z10) {
            this.f45555n.setAlpha(1.0f);
            this.f45555n.setVisibility(4);
            this.f45562s.setAlpha(1.0f);
            this.f45562s.setVisibility(0);
        } else {
            this.f45555n.setAlpha(1.0f);
            this.f45555n.setVisibility(0);
            this.f45562s.setAlpha(0.0f);
            this.f45562s.setVisibility(4);
        }
    }

    public final void l0() {
        if (getParentActivity() == null) {
            return;
        }
        ug.l0 l0Var = new ug.l0(2, this.currentAccount, getParentActivity(), this, null);
        l0Var.f58744r2 = true;
        l0Var.D2 = new rc(this, 1);
        showDialog(l0Var);
    }

    public final void m0(boolean z10) {
        float f10;
        if (!z10) {
            org.telegram.messenger.g0.r(this.f45570x0);
        }
        if (this.f45540b != null) {
            ValueAnimator valueAnimator = this.f45572y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f45540b.f36865c;
            float f12 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f45572y0 = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 3));
            ValueAnimator valueAnimator2 = this.f45572y0;
            float f13 = this.f45540b.f36865c;
            if (z10) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.f45572y0.setInterpolator(org.telegram.ui.Components.lr.f37208f);
            this.f45572y0.start();
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
        if (this.f45545e == null) {
            return;
        }
        int i13 = 8;
        String str = null;
        if (!this.f45543c0 && !this.f45554l0) {
            this.U.setText(org.telegram.messenger.gd.M0(2131752522, null));
            org.telegram.ui.Cells.z8 z8Var = this.U;
            int i14 = org.telegram.ui.ActionBar.n6.f29617p7;
            z8Var.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.u6.U(this.U.getTextView(), i14, null);
            this.O.setVisibility(8);
            this.f45545e.setVisibility(8);
            if (this.f45548f0) {
                this.f45551i0.setVisibility(0);
                this.N.setVisibility(8);
                org.telegram.ui.Cells.z8 z8Var2 = this.U;
                org.telegram.ui.ActionBar.u6.Z(z8Var2, z8Var2.getContext(), 2131231230, org.telegram.ui.ActionBar.n6.f29360b7);
                this.f45549g0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.z8 z8Var3 = this.U;
                org.telegram.ui.ActionBar.u6.Z(z8Var3, z8Var3.getContext(), 2131231229, org.telegram.ui.ActionBar.n6.f29360b7);
                this.f45551i0.setVisibility(8);
                this.N.setVisibility(0);
                this.f45549g0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var4 = this.U;
            int i15 = org.telegram.ui.ActionBar.n6.B6;
            z8Var4.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.u6.U(this.U.getTextView(), i15, null);
            this.f45545e.setVisibility(0);
            this.f45549g0.setVisibility(8);
            this.N.setVisibility(8);
            org.telegram.ui.Cells.z8 z8Var5 = this.U;
            org.telegram.ui.ActionBar.u6.Z(z8Var5, z8Var5.getContext(), 2131231230, org.telegram.ui.ActionBar.n6.f29360b7);
            this.O.setVisibility(0);
            this.f45551i0.setVisibility(8);
            if (this.K) {
                org.telegram.ui.Cells.z8 z8Var6 = this.U;
                if (this.f45543c0) {
                    i12 = 2131748447;
                } else {
                    i12 = 2131748444;
                }
                z8Var6.setText(org.telegram.messenger.gd.M0(i12, null));
                org.telegram.ui.Cells.n4 n4Var = this.X;
                if (this.f45543c0) {
                    M02 = org.telegram.messenger.gd.M0(2131752392, null);
                } else {
                    M02 = org.telegram.messenger.gd.M0(2131752374, null);
                }
                n4Var.setText(M02);
            } else {
                org.telegram.ui.Cells.z8 z8Var7 = this.U;
                if (this.f45543c0) {
                    i7 = 2131752316;
                } else {
                    i7 = 2131752256;
                }
                z8Var7.setText(org.telegram.messenger.gd.M0(i7, null));
                org.telegram.ui.Cells.n4 n4Var2 = this.X;
                if (this.f45543c0) {
                    M0 = org.telegram.messenger.gd.M0(2131752392, null);
                } else {
                    M0 = org.telegram.messenger.gd.M0(2131752374, null);
                }
                n4Var2.setText(M0);
            }
            LinearLayout linearLayout = this.P;
            if (this.f45543c0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            linearLayout.setVisibility(i10);
            LinearLayout linearLayout2 = this.Q;
            if (this.f45543c0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
            LinearLayout linearLayout3 = this.O;
            if (this.f45543c0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            org.telegram.ui.Components.e80 e80Var = this.R;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f45546e0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            e80Var.setLink(str);
            org.telegram.ui.Cells.b2 b2Var = this.W;
            if (!this.f45543c0 && b2Var.length() != 0) {
                i13 = 0;
            }
            b2Var.setVisibility(i13);
        }
        this.S.a(!this.f45543c0);
        this.T.a(this.f45543c0);
        this.f45571y.clearFocus();
        org.telegram.messenger.g0.v1(this.f45571y);
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.u30 u30Var = this.f45569x;
        if (u30Var != null) {
            u30Var.h(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar == null || !wtVar.f41789e) {
            return true;
        }
        if (z10) {
            wtVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.R);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.S);
        if (this.f45552j0 == 1 && !this.f45544d0 && this.f45546e0 == null) {
            org.telegram.messenger.mp messagesController = getMessagesController();
            long j3 = this.f45553k0;
            TLRPC.ChatFull P0 = messagesController.P0(j3);
            if (P0 != null) {
                this.f45546e0 = P0.exported_invite;
            }
            if (this.f45546e0 == null) {
                this.f45544d0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().l1(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().s1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new sc(this, 3));
            }
        }
        org.telegram.ui.Components.u30 u30Var = this.f45569x;
        if (u30Var != null) {
            u30Var.f40195a = this;
            u30Var.f40196b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f45565u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45565u0.intValue(), true);
            this.f45565u0 = null;
        }
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.R);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.S);
        org.telegram.ui.Components.u30 u30Var = this.f45569x;
        if (u30Var != null) {
            u30Var.d();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.r();
        }
        org.telegram.ui.Components.u30 u30Var = this.f45569x;
        if (u30Var != null) {
            u30Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.u30 u30Var = this.f45569x;
        if (u30Var != null) {
            u30Var.j(i7, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.u30 u30Var = this.f45569x;
        if (u30Var != null) {
            u30Var.k();
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
            org.telegram.ui.Components.sp spVar = this.f45542c;
            if (spVar != null) {
                spVar.b(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29733v8, false));
            }
            org.telegram.ui.Cells.t4 t4Var = this.f45551i0;
            if (t4Var != null && t4Var.getChildCount() > 0 && (this.f45551i0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f45551i0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29470h6, false));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f45552j0 != 1) {
            this.d.requestFocus();
            org.telegram.ui.Components.rt rtVar = this.d.f41786a;
            rtVar.requestFocus();
            org.telegram.messenger.g0.I3(rtVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f45552j0 == 0) {
            org.telegram.ui.Components.u30 u30Var = this.f45569x;
            if (u30Var != null) {
                u30Var.f40199f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.wt wtVar = this.d;
                if (wtVar != null) {
                    wtVar.setText(string);
                } else {
                    this.G = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f45552j0 == 0) {
            org.telegram.ui.Components.u30 u30Var = this.f45569x;
            if (u30Var != null && (str = u30Var.f40199f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.wt wtVar = this.d;
            if (wtVar != null) {
                String obj = wtVar.getText().toString();
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
    public final void U() {
    }
}
