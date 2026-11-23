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
public final class ad extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs, org.telegram.ui.Components.w30 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public String G;
    public LinearLayout H;
    public org.telegram.ui.Cells.o4 I;
    public EditTextBoldCursor J;
    public boolean K;
    public org.telegram.ui.Components.oh0 L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public org.telegram.ui.Components.g80 R;
    public org.telegram.ui.Cells.i6 S;
    public org.telegram.ui.Cells.i6 T;
    public org.telegram.ui.Cells.a9 U;
    public TextView V;
    public org.telegram.ui.Cells.c2 W;
    public org.telegram.ui.Cells.o4 X;
    public int Y;
    public String Z;
    public org.telegram.ui.ActionBar.q0 f45575a;
    public u8 f45576a0;
    public org.telegram.ui.Components.mr f45577b;
    public boolean f45578b0;
    public org.telegram.ui.Components.up f45579c;
    public boolean f45580c0;
    public org.telegram.ui.Components.yt d;
    public boolean f45581d0;
    public org.telegram.ui.Cells.z6 f45582e;
    public TLRPC.TL_chatInviteExported f45583e0;
    public fi.t3 f45584f;
    public boolean f45585f0;
    public org.telegram.ui.Cells.a9 f45586g0;
    public hi.l5 h;
    public final ArrayList f45587h0;
    public org.telegram.ui.Cells.u4 f45588i0;
    public final int f45589j0;
    public final long f45590k0;
    public boolean f45591l0;
    public final Boolean m0;
    public xc f45592n;
    public TLRPC.InputFile f45593n0;
    public TLRPC.InputFile f45594o0;
    public TLRPC.VideoSize f45595p0;
    public String f45596q0;
    public AnimatorSet f45597r;
    public double f45598r0;
    public yc f45599s;
    public boolean f45600s0;
    public boolean f45601t0;
    public Integer f45602u0;
    public org.telegram.messenger.r10 f45603v0;
    public final org.telegram.ui.Components.b9 f45604w;
    public org.telegram.ui.ActionBar.t1 f45605w0;
    public final org.telegram.ui.Components.x30 f45606x;
    public final rc f45607x0;
    public EditTextBoldCursor f45608y;
    public ValueAnimator f45609y0;
    public int f45610z0;

    public ad(Bundle bundle) {
        super(bundle);
        this.f45587h0 = new ArrayList();
        this.f45591l0 = true;
        this.f45607x0 = new rc(this, 0);
        int i7 = bundle.getInt("step", 0);
        this.f45589j0 = i7;
        if (bundle.containsKey("forcePublic")) {
            this.m0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i7 == 0) {
            this.f45604w = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
            this.f45606x = new org.telegram.ui.Components.x30(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new sc(this, 1));
            return;
        }
        if (i7 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f45591l0 = z10;
            this.f45580c0 = !z10;
            if (!z10 && !this.f45585f0) {
                this.f45585f0 = true;
                n0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new sc(this, 0));
            }
        }
        this.f45590k0 = bundle.getLong("chat_id", 0L);
    }

    public static void Z(ad adVar, org.telegram.ui.ActionBar.t1 t1Var) {
        adVar.f45601t0 = false;
        adVar.f45600s0 = false;
        if (adVar.f45602u0 != null) {
            ConnectionsManager.getInstance(adVar.currentAccount).cancelRequest(adVar.f45602u0.intValue(), true);
            adVar.f45602u0 = null;
        }
        adVar.m0(false);
        t1Var.dismiss();
    }

    public static void a0(ad adVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = org.telegram.messenger.np.k1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(adVar.currentAccount).sendRequest(tL_channels_updateUsername, new sc(adVar, 2), 64);
    }

    public static void b0(ad adVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = org.telegram.messenger.np.u1(adVar.currentAccount).j1(adVar.f45590k0);
        adVar.Y = ConnectionsManager.getInstance(adVar.currentAccount).sendRequest(tL_channels_checkUsername, new z9(adVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void c0(ad adVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
        String N0 = org.telegram.messenger.hd.N0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        if (currentChannel.megagroup) {
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("RevokeLinkAlert", null, 2131745826, org.telegram.messenger.np.u1(adVar.currentAccount).X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
        } else {
            t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("RevokeLinkAlertChannel", null, 2131745825, org.telegram.messenger.np.u1(adVar.currentAccount).X2 + "/" + org.telegram.messenger.v3.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131745828, null), new oi.f0(9, adVar, currentChannel));
        adVar.showDialog(t1Var);
    }

    public static void d0(ad adVar) {
        if (adVar.f45605w0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
        String N0 = org.telegram.messenger.hd.N0(2131744589, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.hd.N0(2131744590, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131742968, null), null);
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131744598, null), new w0(adVar, 14));
        adVar.f45605w0 = alertDialog$Builder.p();
    }

    @Override
    public final void I(float f10) {
        yc ycVar = this.f45599s;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
        yc ycVar = this.f45599s;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29773y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29437g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
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
        org.telegram.ui.Components.yt ytVar = adVar.d;
        if (ytVar != null) {
            ytVar.o();
        }
        adVar.actionBar.setBackButtonImage(2131231240);
        adVar.actionBar.setAllowOverlayTitle(true);
        adVar.actionBar.setActionBarMenuOnItemClick(new x7(adVar, 7));
        org.telegram.ui.ActionBar.y s5 = adVar.actionBar.s();
        Drawable g10 = i5.c.g(context, 2131231242);
        int i22 = org.telegram.ui.ActionBar.m6.f29718v8;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i22, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        g10.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.up upVar = new org.telegram.ui.Components.up(org.telegram.ui.ActionBar.m6.x0(null, i22, false));
        adVar.f45579c = upVar;
        org.telegram.ui.Components.mr mrVar = new org.telegram.ui.Components.mr(g10, upVar);
        adVar.f45577b = mrVar;
        int L = org.telegram.messenger.g0.L(56.0f);
        String N0 = org.telegram.messenger.hd.N0(2131751342, null);
        org.telegram.ui.ActionBar.k kVar = s5.f30283b;
        if (s5.f30284c) {
            i7 = kVar.f29157r0;
        } else {
            i7 = kVar.f29154q0;
        }
        org.telegram.ui.ActionBar.q0 b10 = s5.b(1, 0, null, i7, mrVar, L, N0, null);
        adVar.f45575a = b10;
        org.telegram.ui.ActionBar.t6.x(b10, g10, i22, null, mode);
        int i23 = adVar.f45589j0;
        if (i23 == 0) {
            adVar.actionBar.setTitle(org.telegram.messenger.hd.N0(2131748093, null));
            wc wcVar = new wc(0, context, adVar);
            wcVar.setOnTouchListener(new gi.a(2));
            adVar.fragmentView = wcVar;
            int i24 = org.telegram.ui.ActionBar.m6.f29381d6;
            wcVar.setTag(Integer.valueOf(i24));
            org.telegram.ui.ActionBar.t6.h(i24, adVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            adVar.M = linearLayout;
            linearLayout.setOrientation(1);
            wcVar.addView(adVar.M, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            adVar.M.addView(frameLayout, c8.ma.o(-1, -2));
            fi.t3 t3Var = new fi.t3(5, context, adVar);
            adVar.f45584f = t3Var;
            t3Var.setRoundRadius(org.telegram.messenger.g0.L(32.0f));
            org.telegram.ui.Components.b9 b9Var = adVar.f45604w;
            b9Var.k(5L, null, null, null);
            adVar.f45584f.setImageDrawable(b9Var);
            fi.t3 t3Var2 = adVar.f45584f;
            boolean z11 = org.telegram.messenger.hd.f24444a0;
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
            hi.l5 l5Var = new hi.l5(adVar, context, paint, 3);
            adVar.h = l5Var;
            l5Var.setContentDescription(org.telegram.messenger.hd.N0(2131752200, null));
            hi.l5 l5Var2 = adVar.h;
            boolean z12 = org.telegram.messenger.hd.f24444a0;
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
            frameLayout.addView(l5Var2, c8.ma.d(64, 64.0f, i26, f12, 12.0f, f13, 12.0f));
            adVar.h.setOnClickListener(new tc(adVar, 1));
            adVar.L = new org.telegram.ui.Components.oh0(2131623959, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), false, null);
            xc xcVar = new xc(0, context, adVar);
            adVar.f45592n = xcVar;
            xcVar.setScaleType(ImageView.ScaleType.CENTER);
            adVar.f45592n.setAnimation(adVar.L);
            adVar.f45592n.setEnabled(false);
            adVar.f45592n.setClickable(false);
            adVar.f45592n.setPadding(org.telegram.messenger.g0.L(0.0f), 0, 0, org.telegram.messenger.g0.L(1.0f));
            xc xcVar2 = adVar.f45592n;
            boolean z13 = org.telegram.messenger.hd.f24444a0;
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
            adVar.f45599s = ycVar;
            ycVar.setSize(org.telegram.messenger.g0.L(30.0f));
            adVar.f45599s.setProgressColor(-1);
            adVar.f45599s.setNoProgress(false);
            yc ycVar2 = adVar.f45599s;
            boolean z14 = org.telegram.messenger.hd.f24444a0;
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
            org.telegram.ui.Components.yt ytVar2 = new org.telegram.ui.Components.yt(context, wcVar, adVar, 0, false, null);
            adVar = adVar;
            adVar.d = ytVar2;
            ytVar2.setHint(org.telegram.messenger.hd.N0(2131751112, null));
            String str = adVar.G;
            if (str != null) {
                adVar.d.setText(str);
                adVar.G = null;
            }
            adVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            adVar.d.getEditText().setSingleLine(true);
            adVar.d.getEditText().setImeOptions(5);
            adVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(adVar) {
                public final ad f52534b;

                {
                    this.f52534b = adVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i29, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (r2) {
                        case 0:
                            ad adVar2 = this.f52534b;
                            if (i29 == 5) {
                                if (!TextUtils.isEmpty(adVar2.d.getEditText().getText())) {
                                    adVar2.f45608y.requestFocus();
                                    return true;
                                }
                            } else {
                                adVar2.getClass();
                            }
                            return false;
                        default:
                            if (i29 == 6 && (q0Var = this.f52534b.f45575a) != null) {
                                q0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.yt ytVar3 = adVar.d;
            boolean z15 = org.telegram.messenger.hd.f24444a0;
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
            frameLayout.addView(ytVar3, c8.ma.d(-1, -2.0f, 16, f18, 0.0f, f19, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            adVar.f45608y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.t6.D(adVar.f45608y, org.telegram.ui.ActionBar.m6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = adVar.f45608y;
            int i29 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(editTextBoldCursor2, i29, null);
            adVar.f45608y.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.t6.F(adVar.f45608y, org.telegram.ui.ActionBar.m6.f29510k6, org.telegram.ui.ActionBar.m6.f29528l6, org.telegram.ui.ActionBar.m6.f29602p7, adVar.getResourceProvider());
            adVar.f45608y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = adVar.f45608y;
            if (org.telegram.messenger.hd.f24444a0) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            editTextBoldCursor3.setGravity(i19);
            adVar.f45608y.setInputType(180225);
            adVar.f45608y.setImeOptions(6);
            adVar.f45608y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            adVar.f45608y.setHint(org.telegram.messenger.hd.N0(2131751447, null));
            org.telegram.ui.ActionBar.t6.v(adVar.f45608y, i29, null);
            adVar.f45608y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            adVar.f45608y.setCursorWidth(1.5f);
            adVar.M.addView(adVar.f45608y, c8.ma.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            adVar.f45608y.setOnEditorActionListener(new TextView.OnEditorActionListener(adVar) {
                public final ad f52534b;

                {
                    this.f52534b = adVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i292, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (r2) {
                        case 0:
                            ad adVar2 = this.f52534b;
                            if (i292 == 5) {
                                if (!TextUtils.isEmpty(adVar2.d.getEditText().getText())) {
                                    adVar2.f45608y.requestFocus();
                                    return true;
                                }
                            } else {
                                adVar2.getClass();
                            }
                            return false;
                        default:
                            if (i292 == 6 && (q0Var = this.f52534b.f45575a) != null) {
                                q0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            adVar.f45608y.addTextChangedListener(new zc(0));
            TextView textView = new TextView(context);
            adVar.V = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.t6.U(adVar.V, org.telegram.ui.ActionBar.m6.F6, null);
            TextView textView2 = adVar.V;
            if (org.telegram.messenger.hd.f24444a0) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            textView2.setGravity(i20);
            adVar.V.setText(org.telegram.messenger.hd.N0(2131751450, null));
            LinearLayout linearLayout2 = adVar.M;
            TextView textView3 = adVar.V;
            if (org.telegram.messenger.hd.f24444a0) {
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
            org.telegram.messenger.np messagesController = adVar.getMessagesController();
            long j3 = adVar.f45590k0;
            TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
            if (O0 != null && (!org.telegram.messenger.v3.T(O0) || org.telegram.messenger.v3.n0(O0))) {
                z10 = true;
            } else {
                z10 = false;
            }
            adVar.K = z10;
            org.telegram.ui.ActionBar.k kVar2 = adVar.actionBar;
            if (z10) {
                i10 = 2131749207;
            } else {
                i10 = 2131752285;
            }
            kVar2.setTitle(org.telegram.messenger.hd.N0(i10, null));
            View view = adVar.fragmentView;
            int i30 = org.telegram.ui.ActionBar.m6.f29324a7;
            view.setTag(Integer.valueOf(i30));
            org.telegram.ui.ActionBar.t6.h(i30, adVar.fragmentView, null);
            org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 23);
            adVar.I = o4Var;
            o4Var.setHeight(46);
            org.telegram.ui.Cells.o4 o4Var2 = adVar.I;
            int i31 = org.telegram.ui.ActionBar.m6.f29381d6;
            org.telegram.ui.ActionBar.t6.h(i31, o4Var2, null);
            org.telegram.ui.Cells.o4 o4Var3 = adVar.I;
            if (adVar.K) {
                i11 = 2131749198;
            } else {
                i11 = 2131752263;
            }
            o4Var3.setText(org.telegram.messenger.hd.N0(i11, null));
            adVar.M.addView(adVar.I);
            LinearLayout linearLayout4 = new LinearLayout(context);
            adVar.H = linearLayout4;
            linearLayout4.setOrientation(1);
            org.telegram.ui.ActionBar.t6.h(i31, adVar.H, null);
            adVar.M.addView(adVar.H, c8.ma.o(-1, -2));
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
            adVar.S = i6Var;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.m6.N0(false);
            int i32 = org.telegram.ui.ActionBar.m6.f29473i6;
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i32);
            i6Var.setBackground(N02);
            org.telegram.ui.ActionBar.t6.j(i6Var, N02, null, M, null);
            Boolean bool = adVar.m0;
            if (bool != null && !bool.booleanValue()) {
                adVar.f45580c0 = true;
            }
            if (adVar.K) {
                i12 = 1;
                adVar.S.b(org.telegram.messenger.hd.N0(2131748445, null), org.telegram.messenger.hd.N0(2131748444, null), false, !adVar.f45580c0);
            } else {
                i12 = 1;
                adVar.S.b(org.telegram.messenger.hd.N0(2131752306, null), org.telegram.messenger.hd.N0(2131752303, null), false, !adVar.f45580c0);
            }
            adVar.S.setOnClickListener(new tc(adVar, 2));
            if (bool == null || bool.booleanValue()) {
                adVar.H.addView(adVar.S, c8.ma.o(-1, -2));
            }
            org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
            adVar.T = i6Var2;
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.m6.N0(false);
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i32);
            i6Var2.setBackground(N03);
            org.telegram.ui.ActionBar.t6.j(i6Var2, N03, null, M2, null);
            if (bool != null && bool.booleanValue()) {
                adVar.f45580c0 = false;
            }
            if (adVar.K) {
                adVar.T.b(org.telegram.messenger.hd.N0(2131748448, null), org.telegram.messenger.hd.N0(2131748447, null), false, adVar.f45580c0);
            } else {
                adVar.T.b(org.telegram.messenger.hd.N0(2131752317, null), org.telegram.messenger.hd.N0(2131752316, null), false, adVar.f45580c0);
            }
            adVar.T.setOnClickListener(new tc(adVar, 3));
            if (bool == null || !bool.booleanValue()) {
                adVar.H.addView(adVar.T, c8.ma.o(-1, -2));
            }
            org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
            adVar.f45582e = z6Var;
            adVar.M.addView(z6Var, c8.ma.o(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            adVar.O = linearLayout5;
            linearLayout5.setOrientation(i12);
            org.telegram.ui.ActionBar.t6.h(i31, adVar.O, null);
            adVar.M.addView(adVar.O, c8.ma.o(-1, -2));
            org.telegram.ui.Cells.o4 o4Var4 = new org.telegram.ui.Cells.o4(context);
            adVar.X = o4Var4;
            adVar.O.addView(o4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            adVar.P = linearLayout6;
            linearLayout6.setOrientation(0);
            adVar.O.addView(adVar.P, c8.ma.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            adVar.J = editTextBoldCursor4;
            editTextBoldCursor4.setText(org.telegram.messenger.np.u1(adVar.currentAccount).X2 + "/");
            adVar.J.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = adVar.J;
            int i33 = org.telegram.ui.ActionBar.m6.H6;
            org.telegram.ui.ActionBar.t6.D(editTextBoldCursor5, i33, null);
            EditTextBoldCursor editTextBoldCursor6 = adVar.J;
            int i34 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(editTextBoldCursor6, i34, null);
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
            adVar.f45608y = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.t6.D(adVar.f45608y, i33, null);
            org.telegram.ui.ActionBar.t6.U(adVar.f45608y, i34, null);
            adVar.f45608y.setMaxLines(1);
            adVar.f45608y.setLines(1);
            adVar.f45608y.setBackgroundDrawable(null);
            adVar.f45608y.setPadding(0, 0, 0, 0);
            adVar.f45608y.setSingleLine(true);
            adVar.f45608y.setInputType(163872);
            adVar.f45608y.setImeOptions(6);
            adVar.f45608y.setHint(org.telegram.messenger.hd.N0(2131752254, null));
            org.telegram.ui.ActionBar.t6.v(adVar.f45608y, i34, null);
            adVar.f45608y.setCursorSize(org.telegram.messenger.g0.L(20.0f));
            adVar.f45608y.setCursorWidth(1.5f);
            adVar.P.addView(adVar.f45608y, c8.ma.o(-1, 36));
            adVar.f45608y.addTextChangedListener(new m0(adVar, 2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            adVar.Q = linearLayout7;
            linearLayout7.setOrientation(1);
            adVar.O.addView(adVar.Q, c8.ma.o(-1, -2));
            org.telegram.ui.Components.g80 g80Var = new org.telegram.ui.Components.g80(context, adVar, null, true, org.telegram.messenger.v3.T(adVar.getMessagesController().O0(Long.valueOf(j3))));
            adVar.R = g80Var;
            g80Var.b(true);
            adVar.R.d(0, null, false);
            adVar.Q.addView(adVar.R);
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(3, context, adVar);
            adVar.W = c2Var;
            org.telegram.ui.ActionBar.t6.G(c2Var, org.telegram.ui.ActionBar.m6.J6, null);
            org.telegram.ui.ActionBar.t6.C(adVar.W, org.telegram.ui.ActionBar.m6.K6, null);
            adVar.W.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.c2 c2Var2 = adVar.W;
            if (org.telegram.messenger.hd.f24444a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            c2Var2.setGravity(i13);
            adVar.W.setVisibility(8);
            adVar.W.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
            LinearLayout linearLayout8 = adVar.O;
            org.telegram.ui.Cells.c2 c2Var3 = adVar.W;
            if (org.telegram.messenger.hd.f24444a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            linearLayout8.addView(c2Var3, c8.ma.t(-2, -2, i14, 18, 3, 18, 7));
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            adVar.U = a9Var;
            int i35 = org.telegram.ui.ActionBar.m6.f29345b7;
            org.telegram.ui.ActionBar.t6.Z(a9Var, context, 2131231230, i35);
            adVar.M.addView(adVar.U, c8.ma.o(-1, -2));
            org.telegram.ui.Cells.u4 u4Var = new org.telegram.ui.Cells.u4(context);
            adVar.f45588i0 = u4Var;
            adVar.M.addView(u4Var, c8.ma.o(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            adVar.N = linearLayout9;
            org.telegram.ui.ActionBar.t6.h(i31, linearLayout9, null);
            adVar.N.setOrientation(1);
            adVar.M.addView(adVar.N, c8.ma.o(-1, -2));
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
            adVar.f45586g0 = a9Var2;
            org.telegram.ui.ActionBar.t6.Z(a9Var2, context, 2131231230, i35);
            adVar.M.addView(adVar.f45586g0, c8.ma.o(-1, -2));
            adVar.n0();
        }
        return adVar.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.S) {
            org.telegram.ui.ActionBar.t1 t1Var = this.f45605w0;
            if (t1Var != null) {
                try {
                    t1Var.dismiss();
                    this.f45605w0 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            m0(false);
            this.f45601t0 = false;
        } else if (i7 == org.telegram.messenger.ls.R) {
            org.telegram.ui.ActionBar.t1 t1Var2 = this.f45605w0;
            if (t1Var2 != null) {
                try {
                    t1Var2.dismiss();
                    this.f45605w0 = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f45591l0);
            Boolean bool = this.m0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.f45593n0 != null || this.f45594o0 != null || this.f45595p0 != null) {
                org.telegram.messenger.np.u1(this.currentAccount).B(longValue, null, this.f45593n0, this.f45594o0, this.f45595p0, this.f45598r0, this.f45596q0, this.E, this.F, null);
            }
            ad adVar = new ad(bundle);
            adVar.f45603v0 = this.f45603v0;
            presentFragment(adVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.x30 x30Var = this.f45606x;
        if (x30Var != null && x30Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.x30 x30Var = this.f45606x;
        if ((x30Var == null || dialog != x30Var.f41960c) && super.dismissDialogOnPause(dialog)) {
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
        org.telegram.ui.Components.yt ytVar = this.d;
        int i7 = org.telegram.ui.ActionBar.m6.f29510k6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(ytVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        org.telegram.ui.Components.yt ytVar2 = this.d;
        int i10 = org.telegram.ui.ActionBar.m6.f29528l6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(ytVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45608y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45608y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45582e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29345b7));
        LinearLayout linearLayout = this.Q;
        int i11 = org.telegram.ui.ActionBar.m6.f29473i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(linearLayout, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45588i0, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29455h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        return arrayList;
    }

    public final void i0() {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.O7, false);
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P7, false);
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Q7, false);
        int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.R7, false);
        int x06 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.S7, false);
        int x07 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T7, false);
        int x08 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.U7, false) + ((x07 + ((x06 + ((x05 + ((x04 + ((x03 + ((x02 + (org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x08 != this.f45610z0) {
            this.f45610z0 = x08;
            LinearLayout linearLayout = this.N;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.N.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f31123f);
                        nVar.f31119a.invalidate();
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
        u8 u8Var = this.f45576a0;
        if (u8Var != null) {
            org.telegram.messenger.g0.r(u8Var);
            this.f45576a0 = null;
            this.Z = null;
            if (this.Y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            }
        }
        this.f45578b0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        this.W.setText(org.telegram.messenger.hd.N0(2131748712, null));
                        org.telegram.ui.Cells.c2 c2Var = this.W;
                        int i10 = org.telegram.ui.ActionBar.m6.f29602p7;
                        c2Var.setTag(Integer.valueOf(i10));
                        org.telegram.ui.ActionBar.t6.U(this.W, i10, null);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.W.setText(org.telegram.messenger.hd.N0(2131748716, null));
                        org.telegram.ui.Cells.c2 c2Var2 = this.W;
                        int i11 = org.telegram.ui.ActionBar.m6.f29602p7;
                        c2Var2.setTag(Integer.valueOf(i11));
                        org.telegram.ui.ActionBar.t6.U(this.W, i11, null);
                        return false;
                    }
                }
            } else {
                this.W.setText(org.telegram.messenger.hd.N0(2131748716, null));
                org.telegram.ui.Cells.c2 c2Var3 = this.W;
                int i12 = org.telegram.ui.ActionBar.m6.f29602p7;
                c2Var3.setTag(Integer.valueOf(i12));
                org.telegram.ui.ActionBar.t6.U(this.W, i12, null);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.W.setText(org.telegram.messenger.hd.N0(2131748715, null));
                org.telegram.ui.Cells.c2 c2Var4 = this.W;
                int i13 = org.telegram.ui.ActionBar.m6.f29602p7;
                c2Var4.setTag(Integer.valueOf(i13));
                org.telegram.ui.ActionBar.t6.U(this.W, i13, null);
                return false;
            }
            this.W.setText(org.telegram.messenger.hd.N0(2131748729, null));
            org.telegram.ui.Cells.c2 c2Var5 = this.W;
            int i14 = org.telegram.ui.ActionBar.m6.F6;
            c2Var5.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.t6.U(this.W, i14, null);
            this.Z = str;
            u8 u8Var2 = new u8(12, this, str);
            this.f45576a0 = u8Var2;
            org.telegram.messenger.g0.h3(u8Var2, 300L);
            return true;
        }
        this.W.setText(org.telegram.messenger.hd.N0(2131748714, null));
        org.telegram.ui.Cells.c2 c2Var6 = this.W;
        int i15 = org.telegram.ui.ActionBar.m6.f29602p7;
        c2Var6.setTag(Integer.valueOf(i15));
        org.telegram.ui.ActionBar.t6.U(this.W, i15, null);
        return false;
    }

    public final void k0(boolean z10, boolean z11) {
        if (this.f45592n == null) {
            return;
        }
        AnimatorSet animatorSet = this.f45597r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f45597r.cancel();
            this.f45597r = null;
        }
        if (z11) {
            this.f45597r = new AnimatorSet();
            if (z10) {
                this.f45599s.setVisibility(0);
                AnimatorSet animatorSet2 = this.f45597r;
                xc xcVar = this.f45592n;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, property, 0.0f), ObjectAnimator.ofFloat(this.f45599s, property, 1.0f));
            } else {
                if (this.f45592n.getVisibility() != 0) {
                    this.f45592n.setAlpha(0.0f);
                }
                this.f45592n.setVisibility(0);
                AnimatorSet animatorSet3 = this.f45597r;
                xc xcVar2 = this.f45592n;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(xcVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f45599s, property2, 0.0f));
            }
            this.f45597r.setDuration(180L);
            this.f45597r.addListener(new bi.g7(28, this, z10));
            this.f45597r.start();
        } else if (z10) {
            this.f45592n.setAlpha(1.0f);
            this.f45592n.setVisibility(4);
            this.f45599s.setAlpha(1.0f);
            this.f45599s.setVisibility(0);
        } else {
            this.f45592n.setAlpha(1.0f);
            this.f45592n.setVisibility(0);
            this.f45599s.setAlpha(0.0f);
            this.f45599s.setVisibility(4);
        }
    }

    public final void l0() {
        if (getParentActivity() == null) {
            return;
        }
        ug.k0 k0Var = new ug.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.f58784r2 = true;
        k0Var.D2 = new rc(this, 1);
        showDialog(k0Var);
    }

    public final void m0(boolean z10) {
        float f10;
        if (!z10) {
            org.telegram.messenger.g0.r(this.f45607x0);
        }
        if (this.f45577b != null) {
            ValueAnimator valueAnimator = this.f45609y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f45577b.f37619c;
            float f12 = 0.0f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f45609y0 = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 3));
            ValueAnimator valueAnimator2 = this.f45609y0;
            float f13 = this.f45577b.f37619c;
            if (z10) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.f45609y0.setInterpolator(org.telegram.ui.Components.nr.f37960f);
            this.f45609y0.start();
        }
    }

    public final void n0() {
        int i7;
        String N0;
        int i10;
        int i11;
        int L;
        int i12;
        String N02;
        if (this.f45582e == null) {
            return;
        }
        int i13 = 8;
        String str = null;
        if (!this.f45580c0 && !this.f45591l0) {
            this.U.setText(org.telegram.messenger.hd.N0(2131752521, null));
            org.telegram.ui.Cells.a9 a9Var = this.U;
            int i14 = org.telegram.ui.ActionBar.m6.f29602p7;
            a9Var.setTag(Integer.valueOf(i14));
            org.telegram.ui.ActionBar.t6.U(this.U.getTextView(), i14, null);
            this.O.setVisibility(8);
            this.f45582e.setVisibility(8);
            if (this.f45585f0) {
                this.f45588i0.setVisibility(0);
                this.N.setVisibility(8);
                org.telegram.ui.Cells.a9 a9Var2 = this.U;
                org.telegram.ui.ActionBar.t6.Z(a9Var2, a9Var2.getContext(), 2131231230, org.telegram.ui.ActionBar.m6.f29345b7);
                this.f45586g0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.a9 a9Var3 = this.U;
                org.telegram.ui.ActionBar.t6.Z(a9Var3, a9Var3.getContext(), 2131231229, org.telegram.ui.ActionBar.m6.f29345b7);
                this.f45588i0.setVisibility(8);
                this.N.setVisibility(0);
                this.f45586g0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var4 = this.U;
            int i15 = org.telegram.ui.ActionBar.m6.B6;
            a9Var4.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.t6.U(this.U.getTextView(), i15, null);
            this.f45582e.setVisibility(0);
            this.f45586g0.setVisibility(8);
            this.N.setVisibility(8);
            org.telegram.ui.Cells.a9 a9Var5 = this.U;
            org.telegram.ui.ActionBar.t6.Z(a9Var5, a9Var5.getContext(), 2131231230, org.telegram.ui.ActionBar.m6.f29345b7);
            this.O.setVisibility(0);
            this.f45588i0.setVisibility(8);
            if (this.K) {
                org.telegram.ui.Cells.a9 a9Var6 = this.U;
                if (this.f45580c0) {
                    i12 = 2131748446;
                } else {
                    i12 = 2131748443;
                }
                a9Var6.setText(org.telegram.messenger.hd.N0(i12, null));
                org.telegram.ui.Cells.o4 o4Var = this.X;
                if (this.f45580c0) {
                    N02 = org.telegram.messenger.hd.N0(2131752391, null);
                } else {
                    N02 = org.telegram.messenger.hd.N0(2131752373, null);
                }
                o4Var.setText(N02);
            } else {
                org.telegram.ui.Cells.a9 a9Var7 = this.U;
                if (this.f45580c0) {
                    i7 = 2131752315;
                } else {
                    i7 = 2131752255;
                }
                a9Var7.setText(org.telegram.messenger.hd.N0(i7, null));
                org.telegram.ui.Cells.o4 o4Var2 = this.X;
                if (this.f45580c0) {
                    N0 = org.telegram.messenger.hd.N0(2131752391, null);
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131752373, null);
                }
                o4Var2.setText(N0);
            }
            LinearLayout linearLayout = this.P;
            if (this.f45580c0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            linearLayout.setVisibility(i10);
            LinearLayout linearLayout2 = this.Q;
            if (this.f45580c0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout2.setVisibility(i11);
            LinearLayout linearLayout3 = this.O;
            if (this.f45580c0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            org.telegram.ui.Components.g80 g80Var = this.R;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f45583e0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            g80Var.setLink(str);
            org.telegram.ui.Cells.c2 c2Var = this.W;
            if (!this.f45580c0 && c2Var.length() != 0) {
                i13 = 0;
            }
            c2Var.setVisibility(i13);
        }
        this.S.a(!this.f45580c0);
        this.T.a(this.f45580c0);
        this.f45608y.clearFocus();
        org.telegram.messenger.g0.v1(this.f45608y);
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        org.telegram.ui.Components.x30 x30Var = this.f45606x;
        if (x30Var != null) {
            x30Var.h(i7, i10, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.yt ytVar = this.d;
        if (ytVar == null || !ytVar.f42537e) {
            return true;
        }
        if (z10) {
            ytVar.k(true);
            return false;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.R);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.S);
        if (this.f45589j0 == 1 && !this.f45581d0 && this.f45583e0 == null) {
            org.telegram.messenger.np messagesController = getMessagesController();
            long j3 = this.f45590k0;
            TLRPC.ChatFull P0 = messagesController.P0(j3);
            if (P0 != null) {
                this.f45583e0 = P0.exported_invite;
            }
            if (this.f45583e0 == null) {
                this.f45581d0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().l1(-j3);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().s1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new sc(this, 3));
            }
        }
        org.telegram.ui.Components.x30 x30Var = this.f45606x;
        if (x30Var != null) {
            x30Var.f41958a = this;
            x30Var.f41959b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f45602u0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f45602u0.intValue(), true);
            this.f45602u0 = null;
        }
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.R);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.S);
        org.telegram.ui.Components.x30 x30Var = this.f45606x;
        if (x30Var != null) {
            x30Var.d();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.yt ytVar = this.d;
        if (ytVar != null) {
            ytVar.o();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.yt ytVar = this.d;
        if (ytVar != null) {
            ytVar.r();
        }
        org.telegram.ui.Components.x30 x30Var = this.f45606x;
        if (x30Var != null) {
            x30Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.x30 x30Var = this.f45606x;
        if (x30Var != null) {
            x30Var.j(i7, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.yt ytVar = this.d;
        if (ytVar != null) {
            ytVar.s();
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.x30 x30Var = this.f45606x;
        if (x30Var != null) {
            x30Var.k();
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
            org.telegram.ui.Components.up upVar = this.f45579c;
            if (upVar != null) {
                upVar.b(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29718v8, false));
            }
            org.telegram.ui.Cells.u4 u4Var = this.f45588i0;
            if (u4Var != null && u4Var.getChildCount() > 0 && (this.f45588i0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f45588i0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29455h6, false));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f45589j0 != 1) {
            this.d.requestFocus();
            org.telegram.ui.Components.tt ttVar = this.d.f42534a;
            ttVar.requestFocus();
            org.telegram.messenger.g0.I3(ttVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f45589j0 == 0) {
            org.telegram.ui.Components.x30 x30Var = this.f45606x;
            if (x30Var != null) {
                x30Var.f41962f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.yt ytVar = this.d;
                if (ytVar != null) {
                    ytVar.setText(string);
                } else {
                    this.G = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f45589j0 == 0) {
            org.telegram.ui.Components.x30 x30Var = this.f45606x;
            if (x30Var != null && (str = x30Var.f41962f) != null) {
                bundle.putString("path", str);
            }
            org.telegram.ui.Components.yt ytVar = this.d;
            if (ytVar != null) {
                String obj = ytVar.getText().toString();
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
