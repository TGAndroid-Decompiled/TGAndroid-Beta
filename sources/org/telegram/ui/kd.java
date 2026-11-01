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
public final class kd extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, org.telegram.ui.Components.a40 {
    public TLRPC.FileLocation D;
    public TLRPC.FileLocation E;
    public String F;
    public LinearLayout G;
    public org.telegram.ui.Cells.p4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public org.telegram.ui.Components.ci0 K;
    public LinearLayout L;
    public LinearLayout M;
    public LinearLayout N;
    public LinearLayout O;
    public LinearLayout P;
    public org.telegram.ui.Components.j80 Q;
    public org.telegram.ui.Cells.l6 R;
    public org.telegram.ui.Cells.l6 S;
    public org.telegram.ui.Cells.b9 T;
    public TextView U;
    public org.telegram.ui.Cells.b2 V;
    public org.telegram.ui.Cells.p4 W;
    public int X;
    public String Y;
    public h0 Z;
    public org.telegram.ui.ActionBar.t0 f38806a;
    public boolean f38807a0;
    public org.telegram.ui.Components.fr f38808b;
    public boolean f38809b0;
    public org.telegram.ui.Components.kp f38810c;
    public boolean f38811c0;
    public org.telegram.ui.Components.wt d;
    public TLRPC.TL_chatInviteExported f38812d0;
    public org.telegram.ui.Cells.c7 e;
    public boolean f38813e0;
    public ag.d2 f38814f;
    public org.telegram.ui.Cells.b9 f38815f0;
    public final ArrayList f38816g0;
    public kg.f0 h;
    public org.telegram.ui.Cells.v4 f38817h0;
    public final int f38818i0;
    public final long f38819j0;
    public boolean f38820k0;
    public final Boolean f38821l0;
    public TLRPC.InputFile m0;
    public hd f38822n;
    public TLRPC.InputFile f38823n0;
    public TLRPC.VideoSize f38824o0;
    public String f38825p0;
    public double f38826q0;
    public AnimatorSet f38827r;
    public boolean f38828r0;
    public id f38829s;
    public boolean f38830s0;
    public Integer f38831t0;
    public org.telegram.messenger.k20 f38832u0;
    public org.telegram.ui.ActionBar.x1 f38833v0;
    public final org.telegram.ui.Components.r8 f38834w;
    public final ad f38835w0;
    public final org.telegram.ui.Components.b40 f38836x;
    public ValueAnimator f38837x0;
    public EditTextBoldCursor f38838y;
    public int f38839y0;

    public kd(Bundle bundle) {
        super(bundle);
        this.f38816g0 = new ArrayList();
        this.f38820k0 = true;
        this.f38835w0 = new ad(this, 0);
        int i10 = bundle.getInt("step", 0);
        this.f38818i0 = i10;
        if (bundle.containsKey("forcePublic")) {
            this.f38821l0 = Boolean.valueOf(bundle.getBoolean("forcePublic", false));
        }
        if (i10 == 0) {
            this.f38834w = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            this.f38836x = new org.telegram.ui.Components.b40(1, true, true);
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_checkUsername, new bd(this, 1));
            return;
        }
        if (i10 == 1) {
            boolean z10 = bundle.getBoolean("canCreatePublic", true);
            this.f38820k0 = z10;
            this.f38809b0 = !z10;
            if (!z10 && !this.f38813e0) {
                this.f38813e0 = true;
                n0();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new bd(this, 0));
            }
        }
        this.f38819j0 = bundle.getLong("chat_id", 0L);
    }

    public static void Z(kd kdVar, org.telegram.ui.ActionBar.x1 x1Var) {
        kdVar.f38830s0 = false;
        kdVar.f38828r0 = false;
        if (kdVar.f38831t0 != null) {
            ConnectionsManager.getInstance(kdVar.currentAccount).cancelRequest(kdVar.f38831t0.intValue(), true);
            kdVar.f38831t0 = null;
        }
        kdVar.m0(false);
        x1Var.dismiss();
    }

    public static void a0(kd kdVar, TLRPC.Chat chat) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = org.telegram.messenger.wp.h1(chat);
        tL_channels_updateUsername.username = "";
        ConnectionsManager.getInstance(kdVar.currentAccount).sendRequest(tL_channels_updateUsername, new bd(kdVar, 2), 64);
    }

    public static void b0(kd kdVar, String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = org.telegram.messenger.wp.r1(kdVar.currentAccount).g1(kdVar.f38819j0);
        kdVar.X = ConnectionsManager.getInstance(kdVar.currentAccount).sendRequest(tL_channels_checkUsername, new aa(kdVar, str, tL_channels_checkUsername, 2), 2);
    }

    public static void c0(kd kdVar, View view) {
        TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.m) view.getParent()).getCurrentChannel();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kdVar.getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131689472, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        if (currentChannel.megagroup) {
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("RevokeLinkAlert", null, 2131746039, org.telegram.messenger.wp.r1(kdVar.currentAccount).U2 + "/" + org.telegram.messenger.w3.K(currentChannel, false), currentChannel.title));
        } else {
            x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("RevokeLinkAlertChannel", null, 2131746038, org.telegram.messenger.wp.r1(kdVar.currentAccount).U2 + "/" + org.telegram.messenger.w3.K(currentChannel, false), currentChannel.title));
        }
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746041, null), new ng.d(7, kdVar, currentChannel));
        kdVar.showDialog(x1Var);
    }

    public static void d0(kd kdVar) {
        if (kdVar.f38833v0 != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kdVar.getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131744850, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131744851, null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131743239, null), null);
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131744859, null), new y0(kdVar, 14));
        kdVar.f38833v0 = alertDialog$Builder.p();
    }

    @Override
    public final void I(float f7) {
        id idVar = this.f38829s;
        if (idVar == null) {
            return;
        }
        idVar.setProgress(f7);
    }

    @Override
    public final void P(boolean z10, boolean z11) {
        id idVar = this.f38829s;
        if (idVar == null) {
            return;
        }
        idVar.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 0));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21004h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20987g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
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
        kd kdVar = this;
        org.telegram.ui.Components.wt wtVar = kdVar.d;
        if (wtVar != null) {
            wtVar.o();
        }
        kdVar.actionBar.setBackButtonImage(2131231241);
        kdVar.actionBar.setAllowOverlayTitle(true);
        kdVar.actionBar.setActionBarMenuOnItemClick(new ag.e(kdVar, 24));
        org.telegram.ui.ActionBar.y p5 = kdVar.actionBar.p();
        Drawable f19 = i0.a.f(context, 2131231243);
        int i23 = org.telegram.ui.ActionBar.t6.f21262v8;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i23, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        f19.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(org.telegram.ui.ActionBar.t6.x0(null, i23, false));
        kdVar.f38810c = kpVar;
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(f19, kpVar);
        kdVar.f38808b = frVar;
        int L = org.telegram.messenger.i0.L(56.0f);
        String L0 = org.telegram.messenger.dd.L0(2131751355, null);
        org.telegram.ui.ActionBar.l lVar = p5.f21535b;
        if (p5.f21536c) {
            i10 = lVar.f20504q0;
        } else {
            i10 = lVar.f20502p0;
        }
        org.telegram.ui.ActionBar.t0 b10 = p5.b(1, 0, null, i10, frVar, L, L0, null);
        kdVar.f38806a = b10;
        org.telegram.ui.ActionBar.a7.y(b10, f19, i23, null, mode);
        int i24 = kdVar.f38818i0;
        if (i24 == 0) {
            kdVar.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748300, null));
            gd gdVar = new gd(0, context, kdVar);
            gdVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
            kdVar.fragmentView = gdVar;
            int i25 = org.telegram.ui.ActionBar.t6.f20930d6;
            gdVar.setTag(Integer.valueOf(i25));
            org.telegram.ui.ActionBar.a7.i(i25, kdVar.fragmentView, null);
            LinearLayout linearLayout = new LinearLayout(context);
            kdVar.L = linearLayout;
            linearLayout.setOrientation(1);
            gdVar.addView(kdVar.L, new FrameLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout = new FrameLayout(context);
            kdVar.L.addView(frameLayout, w7.b6.o(-1, -2));
            ag.d2 d2Var = new ag.d2(kdVar, context, 4);
            kdVar.f38814f = d2Var;
            d2Var.setRoundRadius(org.telegram.messenger.i0.L(32.0f));
            org.telegram.ui.Components.r8 r8Var = kdVar.f38834w;
            r8Var.k(5L, null, null, null);
            kdVar.f38814f.setImageDrawable(r8Var);
            ag.d2 d2Var2 = kdVar.f38814f;
            boolean z11 = org.telegram.messenger.dd.X;
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
            frameLayout.addView(d2Var2, w7.b6.d(64, 64.0f, i26, f7, 12.0f, f10, 12.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            kg.f0 f0Var = new kg.f0(kdVar, context, paint, 2);
            kdVar.h = f0Var;
            f0Var.setContentDescription(org.telegram.messenger.dd.L0(2131752212, null));
            kg.f0 f0Var2 = kdVar.h;
            boolean z12 = org.telegram.messenger.dd.X;
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
            frameLayout.addView(f0Var2, w7.b6.d(64, 64.0f, i27, f11, 12.0f, f12, 12.0f));
            kdVar.h.setOnClickListener(new cd(kdVar, 1));
            kdVar.K = new org.telegram.ui.Components.ci0(2131623959, org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f), false, null);
            hd hdVar = new hd(kdVar, context, 0);
            kdVar.f38822n = hdVar;
            hdVar.setScaleType(ImageView.ScaleType.CENTER);
            kdVar.f38822n.setAnimation(kdVar.K);
            kdVar.f38822n.setEnabled(false);
            kdVar.f38822n.setClickable(false);
            kdVar.f38822n.setPadding(org.telegram.messenger.i0.L(0.0f), 0, 0, org.telegram.messenger.i0.L(1.0f));
            hd hdVar2 = kdVar.f38822n;
            boolean z13 = org.telegram.messenger.dd.X;
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
            frameLayout.addView(hdVar2, w7.b6.d(64, 64.0f, i28, f13, 12.0f, f14, 12.0f));
            id idVar = new id(kdVar, context, 0);
            kdVar.f38829s = idVar;
            idVar.setSize(org.telegram.messenger.i0.L(30.0f));
            kdVar.f38829s.setProgressColor(-1);
            kdVar.f38829s.setNoProgress(false);
            id idVar2 = kdVar.f38829s;
            boolean z14 = org.telegram.messenger.dd.X;
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
            frameLayout.addView(idVar2, w7.b6.d(64, 64.0f, i29, f15, 12.0f, f16, 12.0f));
            kdVar.k0(false, false);
            org.telegram.ui.Components.wt wtVar2 = new org.telegram.ui.Components.wt(context, gdVar, kdVar, 0, false, null);
            kdVar = kdVar;
            kdVar.d = wtVar2;
            wtVar2.setHint(org.telegram.messenger.dd.L0(2131751125, null));
            String str = kdVar.F;
            if (str != null) {
                kdVar.d.setText(str);
                kdVar.F = null;
            }
            kdVar.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
            kdVar.d.getEditText().setSingleLine(true);
            kdVar.d.getEditText().setImeOptions(5);
            kdVar.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(kdVar) {
                public final kd f36560b;

                {
                    this.f36560b = kdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i30, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.t0 t0Var;
                    switch (r2) {
                        case 0:
                            kd kdVar2 = this.f36560b;
                            if (i30 == 5) {
                                if (!TextUtils.isEmpty(kdVar2.d.getEditText().getText())) {
                                    kdVar2.f38838y.requestFocus();
                                    return true;
                                }
                            } else {
                                kdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i30 == 6 && (t0Var = this.f36560b.f38806a) != null) {
                                t0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            org.telegram.ui.Components.wt wtVar3 = kdVar.d;
            boolean z15 = org.telegram.messenger.dd.X;
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
            frameLayout.addView(wtVar3, w7.b6.d(-1, -2.0f, 16, f17, 0.0f, f18, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            kdVar.f38838y = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.a7.E(kdVar.f38838y, org.telegram.ui.ActionBar.t6.H6, null);
            EditTextBoldCursor editTextBoldCursor2 = kdVar.f38838y;
            int i30 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor2, i30, null);
            kdVar.f38838y.setBackgroundDrawable(null);
            org.telegram.ui.ActionBar.a7.G(kdVar.f38838y, org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, kdVar.getResourceProvider());
            kdVar.f38838y.setPadding(0, 0, 0, org.telegram.messenger.i0.L(6.0f));
            EditTextBoldCursor editTextBoldCursor3 = kdVar.f38838y;
            if (org.telegram.messenger.dd.X) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            editTextBoldCursor3.setGravity(i20);
            kdVar.f38838y.setInputType(180225);
            kdVar.f38838y.setImeOptions(6);
            kdVar.f38838y.setFilters(new InputFilter[]{new InputFilter.LengthFilter(120)});
            kdVar.f38838y.setHint(org.telegram.messenger.dd.L0(2131751460, null));
            org.telegram.ui.ActionBar.a7.w(kdVar.f38838y, i30, null);
            kdVar.f38838y.setCursorSize(org.telegram.messenger.i0.L(20.0f));
            kdVar.f38838y.setCursorWidth(1.5f);
            kdVar.L.addView(kdVar.f38838y, w7.b6.k(24.0f, 18.0f, 24.0f, 0.0f, -1, -2));
            kdVar.f38838y.setOnEditorActionListener(new TextView.OnEditorActionListener(kdVar) {
                public final kd f36560b;

                {
                    this.f36560b = kdVar;
                }

                @Override
                public final boolean onEditorAction(TextView textView, int i302, KeyEvent keyEvent) {
                    org.telegram.ui.ActionBar.t0 t0Var;
                    switch (r2) {
                        case 0:
                            kd kdVar2 = this.f36560b;
                            if (i302 == 5) {
                                if (!TextUtils.isEmpty(kdVar2.d.getEditText().getText())) {
                                    kdVar2.f38838y.requestFocus();
                                    return true;
                                }
                            } else {
                                kdVar2.getClass();
                            }
                            return false;
                        default:
                            if (i302 == 6 && (t0Var = this.f36560b.f38806a) != null) {
                                t0Var.performClick();
                                return true;
                            }
                            return false;
                    }
                }
            });
            kdVar.f38838y.addTextChangedListener(new jd(0));
            TextView textView = new TextView(context);
            kdVar.U = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.a7.V(kdVar.U, org.telegram.ui.ActionBar.t6.F6, null);
            TextView textView2 = kdVar.U;
            if (org.telegram.messenger.dd.X) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            textView2.setGravity(i21);
            kdVar.U.setText(org.telegram.messenger.dd.L0(2131751463, null));
            LinearLayout linearLayout2 = kdVar.L;
            TextView textView3 = kdVar.U;
            if (org.telegram.messenger.dd.X) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            linearLayout2.addView(textView3, w7.b6.t(-2, -2, i22, 24, 10, 24, 20));
        } else if (i24 == 1) {
            ScrollView scrollView = new ScrollView(context);
            kdVar.fragmentView = scrollView;
            scrollView.setFillViewport(true);
            LinearLayout linearLayout3 = new LinearLayout(context);
            kdVar.L = linearLayout3;
            linearLayout3.setOrientation(1);
            scrollView.addView(kdVar.L, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.messenger.wp messagesController = kdVar.getMessagesController();
            long j10 = kdVar.f38819j0;
            TLRPC.Chat L02 = messagesController.L0(Long.valueOf(j10));
            if (L02 != null && (!org.telegram.messenger.w3.T(L02) || org.telegram.messenger.w3.n0(L02))) {
                z10 = true;
            } else {
                z10 = false;
            }
            kdVar.J = z10;
            org.telegram.ui.ActionBar.l lVar2 = kdVar.actionBar;
            if (z10) {
                i11 = 2131749409;
            } else {
                i11 = 2131752297;
            }
            lVar2.setTitle(org.telegram.messenger.dd.L0(i11, null));
            View view = kdVar.fragmentView;
            int i31 = org.telegram.ui.ActionBar.t6.f20873a7;
            view.setTag(Integer.valueOf(i31));
            org.telegram.ui.ActionBar.a7.i(i31, kdVar.fragmentView, null);
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, 23);
            kdVar.H = p4Var;
            p4Var.setHeight(46);
            org.telegram.ui.Cells.p4 p4Var2 = kdVar.H;
            int i32 = org.telegram.ui.ActionBar.t6.f20930d6;
            org.telegram.ui.ActionBar.a7.i(i32, p4Var2, null);
            org.telegram.ui.Cells.p4 p4Var3 = kdVar.H;
            if (kdVar.J) {
                i12 = 2131749400;
            } else {
                i12 = 2131752275;
            }
            p4Var3.setText(org.telegram.messenger.dd.L0(i12, null));
            kdVar.L.addView(kdVar.H);
            LinearLayout linearLayout4 = new LinearLayout(context);
            kdVar.G = linearLayout4;
            linearLayout4.setOrientation(1);
            org.telegram.ui.ActionBar.a7.i(i32, kdVar.G, null);
            kdVar.L.addView(kdVar.G, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(context, false);
            kdVar.R = l6Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(false);
            int i33 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i33);
            l6Var.setBackground(N0);
            org.telegram.ui.ActionBar.a7.k(l6Var, N0, null, N, null);
            Boolean bool = kdVar.f38821l0;
            if (bool != null && !bool.booleanValue()) {
                kdVar.f38809b0 = true;
            }
            if (kdVar.J) {
                i13 = 1;
                kdVar.R.b(org.telegram.messenger.dd.L0(2131748653, null), org.telegram.messenger.dd.L0(2131748652, null), false, !kdVar.f38809b0);
            } else {
                i13 = 1;
                kdVar.R.b(org.telegram.messenger.dd.L0(2131752318, null), org.telegram.messenger.dd.L0(2131752315, null), false, !kdVar.f38809b0);
            }
            kdVar.R.setOnClickListener(new cd(kdVar, 2));
            if (bool == null || bool.booleanValue()) {
                kdVar.G.addView(kdVar.R, w7.b6.o(-1, -2));
            }
            org.telegram.ui.Cells.l6 l6Var2 = new org.telegram.ui.Cells.l6(context, false);
            kdVar.S = l6Var2;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.t6.N0(false);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i33);
            l6Var2.setBackground(N02);
            org.telegram.ui.ActionBar.a7.k(l6Var2, N02, null, N2, null);
            if (bool != null && bool.booleanValue()) {
                kdVar.f38809b0 = false;
            }
            if (kdVar.J) {
                kdVar.S.b(org.telegram.messenger.dd.L0(2131748656, null), org.telegram.messenger.dd.L0(2131748655, null), false, kdVar.f38809b0);
            } else {
                kdVar.S.b(org.telegram.messenger.dd.L0(2131752329, null), org.telegram.messenger.dd.L0(2131752328, null), false, kdVar.f38809b0);
            }
            kdVar.S.setOnClickListener(new cd(kdVar, 3));
            if (bool == null || !bool.booleanValue()) {
                kdVar.G.addView(kdVar.S, w7.b6.o(-1, -2));
            }
            org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
            kdVar.e = c7Var;
            kdVar.L.addView(c7Var, w7.b6.o(-1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            kdVar.N = linearLayout5;
            linearLayout5.setOrientation(i13);
            org.telegram.ui.ActionBar.a7.i(i32, kdVar.N, null);
            kdVar.L.addView(kdVar.N, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.p4 p4Var4 = new org.telegram.ui.Cells.p4(context);
            kdVar.W = p4Var4;
            kdVar.N.addView(p4Var4);
            LinearLayout linearLayout6 = new LinearLayout(context);
            kdVar.O = linearLayout6;
            linearLayout6.setOrientation(0);
            kdVar.N.addView(kdVar.O, w7.b6.k(21.0f, 7.0f, 21.0f, 0.0f, -1, 36));
            EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
            kdVar.I = editTextBoldCursor4;
            editTextBoldCursor4.setText(org.telegram.messenger.wp.r1(kdVar.currentAccount).U2 + "/");
            kdVar.I.setTextSize(1, 18.0f);
            EditTextBoldCursor editTextBoldCursor5 = kdVar.I;
            int i34 = org.telegram.ui.ActionBar.t6.H6;
            org.telegram.ui.ActionBar.a7.E(editTextBoldCursor5, i34, null);
            EditTextBoldCursor editTextBoldCursor6 = kdVar.I;
            int i35 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(editTextBoldCursor6, i35, null);
            kdVar.I.setMaxLines(1);
            kdVar.I.setLines(1);
            kdVar.I.setEnabled(false);
            kdVar.I.setBackgroundDrawable(null);
            kdVar.I.setPadding(0, 0, 0, 0);
            kdVar.I.setSingleLine(true);
            kdVar.I.setInputType(163840);
            kdVar.I.setImeOptions(6);
            kdVar.O.addView(kdVar.I, w7.b6.o(-2, 36));
            EditTextBoldCursor editTextBoldCursor7 = new EditTextBoldCursor(context);
            kdVar.f38838y = editTextBoldCursor7;
            editTextBoldCursor7.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.a7.E(kdVar.f38838y, i34, null);
            org.telegram.ui.ActionBar.a7.V(kdVar.f38838y, i35, null);
            kdVar.f38838y.setMaxLines(1);
            kdVar.f38838y.setLines(1);
            kdVar.f38838y.setBackgroundDrawable(null);
            kdVar.f38838y.setPadding(0, 0, 0, 0);
            kdVar.f38838y.setSingleLine(true);
            kdVar.f38838y.setInputType(163872);
            kdVar.f38838y.setImeOptions(6);
            kdVar.f38838y.setHint(org.telegram.messenger.dd.L0(2131752266, null));
            org.telegram.ui.ActionBar.a7.w(kdVar.f38838y, i35, null);
            kdVar.f38838y.setCursorSize(org.telegram.messenger.i0.L(20.0f));
            kdVar.f38838y.setCursorWidth(1.5f);
            kdVar.O.addView(kdVar.f38838y, w7.b6.o(-1, 36));
            kdVar.f38838y.addTextChangedListener(new n0(kdVar, 2));
            LinearLayout linearLayout7 = new LinearLayout(context);
            kdVar.P = linearLayout7;
            linearLayout7.setOrientation(1);
            kdVar.N.addView(kdVar.P, w7.b6.o(-1, -2));
            org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, kdVar, null, true, org.telegram.messenger.w3.T(kdVar.getMessagesController().L0(Long.valueOf(j10))));
            kdVar.Q = j80Var;
            j80Var.b(true);
            kdVar.Q.d(0, null, false);
            kdVar.P.addView(kdVar.Q);
            org.telegram.ui.Cells.b2 b2Var = new org.telegram.ui.Cells.b2(kdVar, context, 3);
            kdVar.V = b2Var;
            org.telegram.ui.ActionBar.a7.H(b2Var, org.telegram.ui.ActionBar.t6.J6, null);
            org.telegram.ui.ActionBar.a7.D(kdVar.V, org.telegram.ui.ActionBar.t6.K6, null);
            kdVar.V.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.b2 b2Var2 = kdVar.V;
            if (org.telegram.messenger.dd.X) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            b2Var2.setGravity(i14);
            kdVar.V.setVisibility(8);
            kdVar.V.setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), 0);
            LinearLayout linearLayout8 = kdVar.N;
            org.telegram.ui.Cells.b2 b2Var3 = kdVar.V;
            if (org.telegram.messenger.dd.X) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            linearLayout8.addView(b2Var3, w7.b6.t(-2, -2, i15, 18, 3, 18, 7));
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            kdVar.T = b9Var;
            int i36 = org.telegram.ui.ActionBar.t6.f20893b7;
            org.telegram.ui.ActionBar.a7.a0(b9Var, context, 2131231231, i36);
            kdVar.L.addView(kdVar.T, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.v4 v4Var = new org.telegram.ui.Cells.v4(context);
            kdVar.f38817h0 = v4Var;
            kdVar.L.addView(v4Var, w7.b6.o(-1, -2));
            LinearLayout linearLayout9 = new LinearLayout(context);
            kdVar.M = linearLayout9;
            org.telegram.ui.ActionBar.a7.i(i32, linearLayout9, null);
            kdVar.M.setOrientation(1);
            kdVar.L.addView(kdVar.M, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
            kdVar.f38815f0 = b9Var2;
            org.telegram.ui.ActionBar.a7.a0(b9Var2, context, 2131231231, i36);
            kdVar.L.addView(kdVar.f38815f0, w7.b6.o(-1, -2));
            kdVar.n0();
        }
        return kdVar.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.S) {
            org.telegram.ui.ActionBar.x1 x1Var = this.f38833v0;
            if (x1Var != null) {
                try {
                    x1Var.dismiss();
                    this.f38833v0 = null;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            m0(false);
            this.f38830s0 = false;
        } else if (i10 == org.telegram.messenger.at.R) {
            org.telegram.ui.ActionBar.x1 x1Var2 = this.f38833v0;
            if (x1Var2 != null) {
                try {
                    x1Var2.dismiss();
                    this.f38833v0 = null;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
            long longValue = ((Long) objArr[0]).longValue();
            Bundle bundle = new Bundle();
            bundle.putInt("step", 1);
            bundle.putLong("chat_id", longValue);
            bundle.putBoolean("canCreatePublic", this.f38820k0);
            Boolean bool = this.f38821l0;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            if (this.m0 != null || this.f38823n0 != null || this.f38824o0 != null) {
                org.telegram.messenger.wp.r1(this.currentAccount).B(longValue, null, this.m0, this.f38823n0, this.f38824o0, this.f38826q0, this.f38825p0, this.D, this.E, null);
            }
            kd kdVar = new kd(bundle);
            kdVar.f38832u0 = this.f38832u0;
            presentFragment(kdVar, true);
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        org.telegram.ui.Components.b40 b40Var = this.f38836x;
        if (b40Var != null && b40Var.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        org.telegram.ui.Components.b40 b40Var = this.f38836x;
        if ((b40Var == null || dialog != b40Var.f24620c) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final fs0 getCloseIntoObject() {
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
        int i10 = org.telegram.ui.ActionBar.t6.f21059k6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(wtVar, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.Components.wt wtVar2 = this.d;
        int i11 = org.telegram.ui.ActionBar.t6.f21077l6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(wtVar2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38838y, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38838y, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.e, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20893b7));
        LinearLayout linearLayout = this.P;
        int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(linearLayout, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f38817h0, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.R, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        return arrayList;
    }

    public final void i0() {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O7, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P7, false);
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Q7, false);
        int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.R7, false);
        int x06 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.S7, false);
        int x07 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T7, false);
        int x08 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.U7, false) + ((x07 + ((x06 + ((x05 + ((x04 + ((x03 + ((x02 + (org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J7, false) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        if (x08 != this.f38839y0) {
            this.f38839y0 = x08;
            LinearLayout linearLayout = this.M;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.M.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.m) {
                        org.telegram.ui.Cells.m mVar = (org.telegram.ui.Cells.m) childAt;
                        mVar.d.q(mVar.f22273f);
                        mVar.f22270a.invalidate();
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
        h0 h0Var = this.Z;
        if (h0Var != null) {
            org.telegram.messenger.i0.r(h0Var);
            this.Z = null;
            this.Y = null;
            if (this.X != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.X, true);
            }
        }
        this.f38807a0 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        this.V.setText(org.telegram.messenger.dd.L0(2131748915, null));
                        org.telegram.ui.Cells.b2 b2Var = this.V;
                        int i11 = org.telegram.ui.ActionBar.t6.f21154p7;
                        b2Var.setTag(Integer.valueOf(i11));
                        org.telegram.ui.ActionBar.a7.V(this.V, i11, null);
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        this.V.setText(org.telegram.messenger.dd.L0(2131748919, null));
                        org.telegram.ui.Cells.b2 b2Var2 = this.V;
                        int i12 = org.telegram.ui.ActionBar.t6.f21154p7;
                        b2Var2.setTag(Integer.valueOf(i12));
                        org.telegram.ui.ActionBar.a7.V(this.V, i12, null);
                        return false;
                    }
                }
            } else {
                this.V.setText(org.telegram.messenger.dd.L0(2131748919, null));
                org.telegram.ui.Cells.b2 b2Var3 = this.V;
                int i13 = org.telegram.ui.ActionBar.t6.f21154p7;
                b2Var3.setTag(Integer.valueOf(i13));
                org.telegram.ui.ActionBar.a7.V(this.V, i13, null);
                return false;
            }
        }
        if (str != null && str.length() >= 4) {
            if (str.length() > 32) {
                this.V.setText(org.telegram.messenger.dd.L0(2131748918, null));
                org.telegram.ui.Cells.b2 b2Var4 = this.V;
                int i14 = org.telegram.ui.ActionBar.t6.f21154p7;
                b2Var4.setTag(Integer.valueOf(i14));
                org.telegram.ui.ActionBar.a7.V(this.V, i14, null);
                return false;
            }
            this.V.setText(org.telegram.messenger.dd.L0(2131748932, null));
            org.telegram.ui.Cells.b2 b2Var5 = this.V;
            int i15 = org.telegram.ui.ActionBar.t6.F6;
            b2Var5.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.a7.V(this.V, i15, null);
            this.Y = str;
            h0 h0Var2 = new h0(19, this, str);
            this.Z = h0Var2;
            org.telegram.messenger.i0.h3(h0Var2, 300L);
            return true;
        }
        this.V.setText(org.telegram.messenger.dd.L0(2131748917, null));
        org.telegram.ui.Cells.b2 b2Var6 = this.V;
        int i16 = org.telegram.ui.ActionBar.t6.f21154p7;
        b2Var6.setTag(Integer.valueOf(i16));
        org.telegram.ui.ActionBar.a7.V(this.V, i16, null);
        return false;
    }

    public final void k0(boolean z10, boolean z11) {
        if (this.f38822n == null) {
            return;
        }
        AnimatorSet animatorSet = this.f38827r;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f38827r.cancel();
            this.f38827r = null;
        }
        if (z11) {
            this.f38827r = new AnimatorSet();
            if (z10) {
                this.f38829s.setVisibility(0);
                AnimatorSet animatorSet2 = this.f38827r;
                hd hdVar = this.f38822n;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(hdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f38829s, property, 1.0f));
            } else {
                if (this.f38822n.getVisibility() != 0) {
                    this.f38822n.setAlpha(0.0f);
                }
                this.f38822n.setVisibility(0);
                AnimatorSet animatorSet3 = this.f38827r;
                hd hdVar2 = this.f38822n;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(hdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f38829s, property2, 0.0f));
            }
            this.f38827r.setDuration(180L);
            this.f38827r.addListener(new eg.m(13, this, z10));
            this.f38827r.start();
        } else if (z10) {
            this.f38822n.setAlpha(1.0f);
            this.f38822n.setVisibility(4);
            this.f38829s.setAlpha(1.0f);
            this.f38829s.setVisibility(0);
        } else {
            this.f38822n.setAlpha(1.0f);
            this.f38822n.setVisibility(0);
            this.f38829s.setAlpha(0.0f);
            this.f38829s.setVisibility(4);
        }
    }

    public final void l0() {
        if (getParentActivity() == null) {
            return;
        }
        kg.q0 q0Var = new kg.q0(2, this.currentAccount, getParentActivity(), this, null);
        q0Var.f11238n2 = true;
        q0Var.f11250z2 = new ad(this, 1);
        showDialog(q0Var);
    }

    public final void m0(boolean z10) {
        float f7;
        if (!z10) {
            org.telegram.messenger.i0.r(this.f38835w0);
        }
        if (this.f38808b != null) {
            ValueAnimator valueAnimator = this.f38837x0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f38808b.f26208c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f38837x0 = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 3));
            ValueAnimator valueAnimator2 = this.f38837x0;
            float f12 = this.f38808b.f26208c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.f38837x0.setInterpolator(org.telegram.ui.Components.gr.f26523f);
            this.f38837x0.start();
        }
    }

    public final void n0() {
        int i10;
        String L0;
        int i11;
        int i12;
        int L;
        int i13;
        String L02;
        if (this.e == null) {
            return;
        }
        int i14 = 8;
        String str = null;
        if (!this.f38809b0 && !this.f38820k0) {
            this.T.setText(org.telegram.messenger.dd.L0(2131752533, null));
            org.telegram.ui.Cells.b9 b9Var = this.T;
            int i15 = org.telegram.ui.ActionBar.t6.f21154p7;
            b9Var.setTag(Integer.valueOf(i15));
            org.telegram.ui.ActionBar.a7.V(this.T.getTextView(), i15, null);
            this.N.setVisibility(8);
            this.e.setVisibility(8);
            if (this.f38813e0) {
                this.f38817h0.setVisibility(0);
                this.M.setVisibility(8);
                org.telegram.ui.Cells.b9 b9Var2 = this.T;
                org.telegram.ui.ActionBar.a7.a0(b9Var2, b9Var2.getContext(), 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
                this.f38815f0.setVisibility(8);
            } else {
                org.telegram.ui.Cells.b9 b9Var3 = this.T;
                org.telegram.ui.ActionBar.a7.a0(b9Var3, b9Var3.getContext(), 2131231230, org.telegram.ui.ActionBar.t6.f20893b7);
                this.f38817h0.setVisibility(8);
                this.M.setVisibility(0);
                this.f38815f0.setVisibility(0);
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var4 = this.T;
            int i16 = org.telegram.ui.ActionBar.t6.B6;
            b9Var4.setTag(Integer.valueOf(i16));
            org.telegram.ui.ActionBar.a7.V(this.T.getTextView(), i16, null);
            this.e.setVisibility(0);
            this.f38815f0.setVisibility(8);
            this.M.setVisibility(8);
            org.telegram.ui.Cells.b9 b9Var5 = this.T;
            org.telegram.ui.ActionBar.a7.a0(b9Var5, b9Var5.getContext(), 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
            this.N.setVisibility(0);
            this.f38817h0.setVisibility(8);
            if (this.J) {
                org.telegram.ui.Cells.b9 b9Var6 = this.T;
                if (this.f38809b0) {
                    i13 = 2131748654;
                } else {
                    i13 = 2131748651;
                }
                b9Var6.setText(org.telegram.messenger.dd.L0(i13, null));
                org.telegram.ui.Cells.p4 p4Var = this.W;
                if (this.f38809b0) {
                    L02 = org.telegram.messenger.dd.L0(2131752403, null);
                } else {
                    L02 = org.telegram.messenger.dd.L0(2131752385, null);
                }
                p4Var.setText(L02);
            } else {
                org.telegram.ui.Cells.b9 b9Var7 = this.T;
                if (this.f38809b0) {
                    i10 = 2131752327;
                } else {
                    i10 = 2131752267;
                }
                b9Var7.setText(org.telegram.messenger.dd.L0(i10, null));
                org.telegram.ui.Cells.p4 p4Var2 = this.W;
                if (this.f38809b0) {
                    L0 = org.telegram.messenger.dd.L0(2131752403, null);
                } else {
                    L0 = org.telegram.messenger.dd.L0(2131752385, null);
                }
                p4Var2.setText(L0);
            }
            LinearLayout linearLayout = this.O;
            if (this.f38809b0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
            LinearLayout linearLayout2 = this.P;
            if (this.f38809b0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            linearLayout2.setVisibility(i12);
            LinearLayout linearLayout3 = this.N;
            if (this.f38809b0) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(7.0f);
            }
            linearLayout3.setPadding(0, 0, 0, L);
            org.telegram.ui.Components.j80 j80Var = this.Q;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.f38812d0;
            if (tL_chatInviteExported != null) {
                str = tL_chatInviteExported.link;
            }
            j80Var.setLink(str);
            org.telegram.ui.Cells.b2 b2Var = this.V;
            if (!this.f38809b0 && b2Var.length() != 0) {
                i14 = 0;
            }
            b2Var.setVisibility(i14);
        }
        this.R.a(!this.f38809b0);
        this.S.a(this.f38809b0);
        this.f38838y.clearFocus();
        org.telegram.messenger.i0.v1(this.f38838y);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.b40 b40Var = this.f38836x;
        if (b40Var != null) {
            b40Var.h(i10, i11, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar == null || !wtVar.e) {
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
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.R);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.S);
        if (this.f38818i0 == 1 && !this.f38811c0 && this.f38812d0 == null) {
            org.telegram.messenger.wp messagesController = getMessagesController();
            long j10 = this.f38819j0;
            TLRPC.ChatFull M0 = messagesController.M0(j10);
            if (M0 != null) {
                this.f38812d0 = M0.exported_invite;
            }
            if (this.f38812d0 == null) {
                this.f38811c0 = true;
                TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
                tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-j10);
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
                tL_messages_getExportedChatInvites.limit = 1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getExportedChatInvites, new bd(this, 3));
            }
        }
        org.telegram.ui.Components.b40 b40Var = this.f38836x;
        if (b40Var != null) {
            b40Var.f24618a = this;
            b40Var.f24619b = this;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f38831t0 != null) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f38831t0.intValue(), true);
            this.f38831t0 = null;
        }
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.R);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.S);
        org.telegram.ui.Components.b40 b40Var = this.f38836x;
        if (b40Var != null) {
            b40Var.d();
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
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
        org.telegram.ui.Components.b40 b40Var = this.f38836x;
        if (b40Var != null) {
            b40Var.i();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.Components.b40 b40Var = this.f38836x;
        if (b40Var != null) {
            b40Var.j(i10, strArr, iArr);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        org.telegram.ui.Components.b40 b40Var = this.f38836x;
        if (b40Var != null) {
            b40Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            i0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.ui.Components.kp kpVar = this.f38810c;
            if (kpVar != null) {
                kpVar.b(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21262v8, false));
            }
            org.telegram.ui.Cells.v4 v4Var = this.f38817h0;
            if (v4Var != null && v4Var.getChildCount() > 0 && (this.f38817h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.f38817h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21003h6, false));
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f38818i0 != 1) {
            this.d.requestFocus();
            org.telegram.ui.Components.rt rtVar = this.d.f32308a;
            rtVar.requestFocus();
            org.telegram.messenger.i0.J3(rtVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        if (this.f38818i0 == 0) {
            org.telegram.ui.Components.b40 b40Var = this.f38836x;
            if (b40Var != null) {
                b40Var.f24621f = bundle.getString("path");
            }
            String string = bundle.getString("nameTextView");
            if (string != null) {
                org.telegram.ui.Components.wt wtVar = this.d;
                if (wtVar != null) {
                    wtVar.setText(string);
                } else {
                    this.F = string;
                }
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        if (this.f38818i0 == 0) {
            org.telegram.ui.Components.b40 b40Var = this.f38836x;
            if (b40Var != null && (str = b40Var.f24621f) != null) {
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
    public final boolean y() {
        return false;
    }

    @Override
    public final void U() {
    }
}
