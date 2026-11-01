package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bl extends uh implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.vs {
    public static final int B0 = 0;
    public final Bitmap[] A0;
    public final yk D;
    public boolean E;
    public org.telegram.messenger.ha F;
    public org.telegram.messenger.ab G;
    public org.telegram.messenger.va H;
    public float I;
    public boolean J;
    public final View K;
    public final jg.l0 L;
    public final zf.h0 M;
    public final ag.b1 N;
    public final uk0 O;
    public final vk P;
    public final ImageView Q;
    public final ag.d1 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final long f24850a0;
    public final Paint f24851b0;
    public final ArrayList f24852c0;
    public AnimatorSet f24853d0;
    public org.telegram.messenger.ga f24854e0;
    public al f24855f0;
    public FrameLayout f24856g0;
    public boolean f24857h0;
    public boolean f24858i0;
    public boolean f24859j0;
    public boolean f24860k0;
    public boolean f24861l0;
    public boolean m0;
    public final ImageView f24862n;
    public Location f24863n0;
    public Location f24864o0;
    public int f24865p0;
    public boolean f24866q0;
    public final org.telegram.ui.ActionBar.t0 f24867r;
    public boolean f24868r0;
    public final zk f24869s;
    public boolean f24870s0;
    public boolean f24871t0;
    public wk f24872u0;
    public final int f24873v0;
    public final LinearLayout f24874w;
    public int f24875w0;
    public final TextView f24876x;
    public int f24877x0;
    public final org.telegram.ui.ActionBar.t0 f24878y;
    public int f24879y0;
    public int f24880z0;

    public bl(bi biVar, Context context, final org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, p6Var, biVar);
        final org.telegram.ui.un unVar;
        boolean z11;
        int i10;
        boolean z12;
        this.T = true;
        this.U = false;
        this.V = false;
        this.W = true;
        this.f24851b0 = new Paint();
        this.f24852c0 = new ArrayList();
        this.f24857h0 = true;
        int currentActionBarHeight = (org.telegram.messenger.i0.f16172q.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(66.0f);
        this.f24875w0 = currentActionBarHeight;
        this.f24877x0 = currentActionBarHeight;
        this.A0 = new Bitmap[7];
        org.telegram.messenger.i0.a0();
        bi biVar2 = this.f30964b;
        org.telegram.ui.ActionBar.k2 k2Var = biVar2.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            unVar = (org.telegram.ui.un) k2Var;
        } else {
            unVar = null;
        }
        long a12 = biVar2.a1();
        this.f24850a0 = a12;
        if (this.f30964b.F1) {
            this.f24873v0 = 7;
        } else if (z10 && unVar != null && unVar.h == null && !unVar.c() && !org.telegram.messenger.i20.B(unVar.j())) {
            this.f24873v0 = 1;
        } else {
            this.f24873v0 = 0;
        }
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14804v4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14811w4);
        this.f24859j0 = false;
        this.f24858i0 = false;
        this.f24860k0 = false;
        zf.h0 h0Var = this.M;
        if (h0Var != null) {
            h0Var.F();
        }
        vk vkVar = this.P;
        if (vkVar != null) {
            vkVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.V = z11;
        org.telegram.ui.ActionBar.y p5 = this.f30964b.R2.p();
        this.D = new yk(this, context);
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, 2131232485);
        a2.N();
        a2.H = new ag.l3(this, 7);
        this.f24878y = a2;
        if (this.V && !this.f30964b.F1) {
            i10 = 8;
        } else {
            this.f30964b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        a2.setContentDescription(org.telegram.messenger.dd.L0(2131745853, null));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.V(searchField, i11, p6Var);
        org.telegram.ui.ActionBar.a7.w(searchField, i11, p6Var);
        org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Je, p6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.L(21.0f)).gravity = 83;
        jg.l0 l0Var = new jg.l0(this, context, 13);
        this.L = l0Var;
        l0Var.setWillNotDraw(false);
        View view = new View(context);
        this.K = view;
        view.setBackgroundDrawable(new jh.g(org.telegram.ui.ActionBar.t6.D0().q()));
        ?? textView = new TextView(context);
        this.f24869s = textView;
        textView.setTranslationX(-org.telegram.messenger.i0.L(80.0f));
        textView.setVisibility(4);
        int L = org.telegram.messenger.i0.L(40.0f);
        int i12 = org.telegram.ui.ActionBar.t6.kj;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i12, this.f30963a);
        int i13 = org.telegram.ui.ActionBar.t6.lj;
        int w03 = org.telegram.ui.ActionBar.t6.w0(i13, this.f30963a);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, w03, w03);
        w7.e6.a(textView);
        textView.setTranslationZ(org.telegram.messenger.i0.L(2.0f));
        bi.d2 d2Var = rf.e0.f46537a;
        textView.setOutlineProvider(d2Var);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView, k02, N, N2, p6Var);
        int i14 = org.telegram.ui.ActionBar.t6.jj;
        org.telegram.ui.ActionBar.a7.V(textView, i14, p6Var);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(org.telegram.messenger.dd.L0(2131747237, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
        l0Var.addView((View) textView, w7.b6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final bl f30325b;

            {
                this.f30325b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        bl blVar = this.f30325b;
                        blVar.g0(false);
                        blVar.M.H(null, blVar.f24864o0, true);
                        blVar.f24870s0 = true;
                        blVar.f0();
                        return;
                    default:
                        this.f30325b.f24867r.U(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ij, this.f30963a), false, p6Var);
        this.f24867r = t0Var;
        t0Var.setClickable(true);
        t0Var.setSubMenuOpenSide(2);
        t0Var.setAdditionalXOffset(org.telegram.messenger.i0.L(10.0f));
        t0Var.setAdditionalYOffset(-org.telegram.messenger.i0.L(10.0f));
        t0Var.d(2, 2131232212, null, org.telegram.messenger.dd.L0(2131748705, null), true, false, p6Var);
        t0Var.d(3, 2131232348, null, org.telegram.messenger.dd.L0(2131745965, null), true, false, p6Var);
        t0Var.d(4, 2131232183, null, org.telegram.messenger.dd.L0(2131749284, null), true, false, p6Var);
        t0Var.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(40.0f), org.telegram.ui.ActionBar.t6.w0(i12, this.f30963a), org.telegram.ui.ActionBar.t6.w0(i13, this.f30963a));
        w7.e6.a(t0Var);
        t0Var.setTranslationZ(org.telegram.messenger.i0.L(2.0f));
        t0Var.setOutlineProvider(d2Var);
        org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 N4 = org.telegram.ui.ActionBar.a7.N(i13);
        t0Var.setBackground(j02);
        org.telegram.ui.ActionBar.a7.k(t0Var, j02, N3, N4, p6Var);
        t0Var.setIcon(2131232213);
        l0Var.addView(t0Var, w7.b6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        t0Var.setOnClickListener(new View.OnClickListener(this) {
            public final bl f30325b;

            {
                this.f30325b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        bl blVar = this.f30325b;
                        blVar.g0(false);
                        blVar.M.H(null, blVar.f24864o0, true);
                        blVar.f24870s0 = true;
                        blVar.f0();
                        return;
                    default:
                        this.f30325b.f24867r.U(null, null);
                        return;
                }
            }
        });
        t0Var.setDelegate(new mk(this, 0));
        ImageView imageView = new ImageView(context);
        this.f24862n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(40.0f), org.telegram.ui.ActionBar.t6.w0(i12, this.f30963a), org.telegram.ui.ActionBar.t6.w0(i13, this.f30963a));
        w7.e6.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.i0.L(2.0f));
        imageView.setOutlineProvider(d2Var);
        org.telegram.ui.ActionBar.w6 N5 = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.w6 N6 = org.telegram.ui.ActionBar.a7.N(i13);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.a7.k(imageView, j03, N5, N6, p6Var);
        imageView.setImageResource(2131232104);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i14, p6Var, mode);
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(org.telegram.messenger.dd.L0(2131754831, null));
        l0Var.addView(imageView, w7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new org.telegram.ui.ud(22, this, p6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f24874w = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.b6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new org.telegram.ui.ActionBar.n2(14));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231639);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.W5, p6Var, mode);
        linearLayout.addView(imageView2, w7.b6.o(-2, -2));
        TextView textView2 = new TextView(context);
        int i15 = org.telegram.ui.ActionBar.t6.X5;
        org.telegram.ui.ActionBar.a7.V(textView2, i15, p6Var);
        textView2.setGravity(17);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        sc.e.u(textView2, 1, 17.0f, null, 2131748196);
        TextView f7 = org.telegram.messenger.a30.f(linearLayout, textView2, w7.b6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f24876x = f7;
        org.telegram.ui.ActionBar.a7.V(f7, i15, p6Var);
        f7.setGravity(17);
        f7.setTextSize(1, 15.0f);
        f7.setPadding(org.telegram.messenger.i0.L(40.0f), 0, org.telegram.messenger.i0.L(40.0f), 0);
        linearLayout.addView(f7, w7.b6.t(-2, -2, 17, 0, 6, 0, 0));
        ag.b1 b1Var = new ag.b1(this, context, p6Var, 11);
        this.N = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.f30966f = true;
        b1Var.setClipToPadding(false);
        zf.h0 h0Var2 = new zf.h0(context, this.f24873v0, a12, true, p6Var, this.f30964b.F1, false, false);
        this.M = h0Var2;
        b1Var.setAdapter(h0Var2);
        bi biVar3 = this.f30964b;
        if (biVar3 != null && (biVar3.f24835y1 || biVar3.G1)) {
            z12 = true;
        } else {
            z12 = false;
        }
        h0Var2.f55534f0 = z12;
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(gr.h);
        jVar.C = false;
        jVar.f47938m = false;
        b1Var.setItemAnimator(jVar);
        h0Var2.P(this.V, this.U);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.r1();
        ag.d1 d1Var = new ag.d1(this, b1Var);
        this.R = d1Var;
        b1Var.setLayoutManager(d1Var);
        addView(b1Var, w7.b6.e(-1, -1, 51));
        b1Var.setOnScrollListener(new uk(this, 0));
        b1Var.setOnItemClickListener(new hk0(this) {
            public final bl f28905b;

            {
                this.f28905b = this;
            }

            @Override
            public final void f(int i16, View view2) {
                switch (r4) {
                    case 0:
                        bl.Q(this.f28905b, unVar, p6Var, i16);
                        return;
                    default:
                        bl.R(this.f28905b, unVar, p6Var, i16);
                        return;
                }
            }
        });
        mk mkVar = new mk(this, 1);
        h0Var2.H = a12;
        h0Var2.D = mkVar;
        h0Var2.Q(org.telegram.messenger.i0.L(16.0f) + this.f24875w0);
        addView(l0Var, w7.b6.e(-1, -1, 51));
        org.telegram.messenger.ab onCreateMapView = ((t7.u) org.telegram.messenger.w0.k()).onCreateMapView(context);
        this.G = onCreateMapView;
        bh.d dVar = (bh.d) onCreateMapView;
        dVar.f2778b = new mk(this, 2);
        dVar.f2779c = new f2(6, this, p6Var);
        new Thread(new ok(this, onCreateMapView, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.Q = imageView3;
        imageView3.setImageResource(2131231646);
        l0Var.addView(imageView3, w7.b6.e(28, 48, 49));
        uk0 uk0Var = new uk0(context, p6Var);
        this.O = uk0Var;
        uk0Var.setSections(true);
        uk0Var.setClipToPadding(false);
        uk0Var.setVisibility(8);
        uk0Var.setLayoutManager(new s4.a0(1, false));
        vk vkVar2 = new vk(this, context, p6Var, this.f30964b.F1);
        this.P = vkVar2;
        boolean z13 = this.V;
        if (vkVar2.M != z13) {
            vkVar2.M = z13;
        }
        mk mkVar2 = new mk(this, 6);
        vkVar2.H = 0L;
        vkVar2.D = mkVar2;
        uk0Var.setItemAnimator(null);
        addView(uk0Var, w7.b6.e(-1, -1, 51));
        uk0Var.setOnScrollListener(new uk(this, 1));
        uk0Var.setOnItemClickListener(new hk0(this) {
            public final bl f28905b;

            {
                this.f28905b = this;
            }

            @Override
            public final void f(int i16, View view2) {
                switch (r4) {
                    case 0:
                        bl.Q(this.f28905b, unVar, p6Var, i16);
                        return;
                    default:
                        bl.R(this.f28905b, unVar, p6Var, i16);
                        return;
                }
            }
        });
        i0();
    }

    public static void N(bl blVar, org.telegram.messenger.ha haVar) {
        PackageManager packageManager;
        blVar.F = haVar;
        lk lkVar = new lk(blVar, 2);
        n4.q qVar = haVar.f16038a;
        org.telegram.messenger.s1 s1Var = new org.telegram.messenger.s1(lkVar, 4);
        i8.f fVar = (i8.f) qVar.f13527a;
        try {
            h8.b bVar = new h8.b(s1Var);
            Parcel P0 = fVar.P0();
            s7.b.c(P0, bVar);
            fVar.T0(P0, 42);
            if (org.telegram.ui.ActionBar.t6.I.q() || org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, blVar.f30963a)) < 0.721f) {
                blVar.S = true;
                blVar.F.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.f18945b, 2131624083));
            }
            if (blVar.F != null) {
                Location location = new Location("network");
                blVar.f24864o0 = location;
                location.setLatitude(20.659322d);
                blVar.f24864o0.setLongitude(-11.40625d);
                try {
                    blVar.F.l(true);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                blVar.F.h().u0();
                blVar.F.h().v0();
                blVar.F.h().t0();
                blVar.F.n(new mk(blVar, 3));
                org.telegram.messenger.ha haVar2 = blVar.F;
                lk lkVar2 = new lk(blVar, 4);
                n4.q qVar2 = haVar2.f16038a;
                org.telegram.messenger.s1 s1Var2 = new org.telegram.messenger.s1(lkVar2, 6);
                i8.f fVar2 = (i8.f) qVar2.f13527a;
                try {
                    h8.b bVar2 = new h8.b(s1Var2, 0);
                    Parcel P02 = fVar2.P0();
                    s7.b.c(P02, bVar2);
                    fVar2.T0(P02, 99);
                    blVar.F.p(new rk(blVar, 1));
                    blVar.F.o(new mk(blVar, 4));
                    blVar.F.m(new lk(blVar, 5));
                    blVar.c0();
                    org.telegram.messenger.i0.h3(new lk(blVar, 6), 200L);
                    if (blVar.T && blVar.getParentActivity() != null) {
                        blVar.T = false;
                        Activity parentActivity = blVar.getParentActivity();
                        if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                            try {
                                if (!((LocationManager) org.telegram.messenger.w0.f18945b.getSystemService("location")).isProviderEnabled("gps")) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, blVar.getParentActivity(), blVar.f30963a);
                                    int i10 = org.telegram.ui.ActionBar.t6.L5;
                                    alertDialog$Builder.m(2131624117, 72, org.telegram.ui.ActionBar.t6.w0(i10, blVar.f30963a), null);
                                    alertDialog$Builder.n(i10, blVar.f30963a);
                                    alertDialog$Builder.f20135a.T = org.telegram.messenger.dd.L0(2131749539, null);
                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751806, null), new mk(blVar, 5));
                                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    alertDialog$Builder.p();
                                }
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                            }
                        } else {
                            return;
                        }
                    }
                    blVar.h0();
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } catch (RemoteException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static void O(bl blVar, org.telegram.ui.un unVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.p6 p6Var, Long l4) {
        if (unVar != null && unVar.c()) {
            s4.L(blVar.getParentActivity(), unVar.a(), new androidx.car.app.utils.a(blVar, tL_messageMediaGeo, l4, 19), p6Var);
            return;
        }
        blVar.f24872u0.d(tL_messageMediaGeo, blVar.f24873v0, true, 0, l4.longValue());
        blVar.f30964b.a(true);
    }

    public static void P(bl blVar) {
        zf.h0 h0Var = blVar.M;
        bi biVar = blVar.f30964b;
        if (blVar.f24857h0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = blVar.getParentActivity();
            if (parentActivity != null) {
                blVar.f24857h0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!biVar.F1 || biVar.f24818t4 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    blVar.U = true;
                    if (h0Var != null) {
                        h0Var.P(blVar.V, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i10 >= 29 && biVar.F1 && biVar.f24818t4 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    blVar.U = true;
                    if (h0Var != null) {
                        h0Var.P(blVar.V, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void Q(bl blVar, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        bl blVar2;
        org.telegram.ui.un unVar2;
        org.telegram.ui.ActionBar.p6 p6Var2;
        TLRPC.User user;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = blVar.f24850a0;
        zf.h0 h0Var = blVar.M;
        bi biVar = blVar.f30964b;
        int i11 = blVar.f24873v0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = h0Var.f55532d0) != null) {
                blVar.f24872u0.d(tL_messageMediaVenue2, i11, true, 0, 0L);
                biVar.a(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = h0Var.f55533e0) != null) {
                blVar.f24872u0.d(tL_messageMediaVenue, i11, true, 0, 0L);
                biVar.a(true);
                return;
            } else {
                blVar2 = blVar;
                unVar2 = unVar;
                p6Var2 = p6Var;
            }
        } else if (i10 == 1) {
            if (blVar.f24872u0 != null && blVar.f24864o0 != null) {
                FrameLayout frameLayout = blVar.f24856g0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.i0.b0(blVar.f24864o0.getLatitude());
                tL_messageMediaGeo.geo._long = org.telegram.messenger.i0.b0(blVar.f24864o0.getLongitude());
                s4.Z(biVar.D3, biVar.W0() + 1, biVar.a1(), new ag.m2(blVar, unVar, tL_messageMediaGeo, p6Var, 6));
                return;
            } else if (blVar.V) {
                s4.C(blVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            blVar2 = blVar;
            unVar2 = unVar;
            p6Var2 = p6Var;
            if (i10 == 2 && i11 == 1) {
                if (blVar2.getLocationController().i(j10)) {
                    blVar2.getLocationController().k(j10);
                    biVar.a(true);
                    return;
                } else if (blVar2.f24863n0 == null && blVar2.V) {
                    s4.C(blVar2.getParentActivity()).show();
                    return;
                } else if (blVar2.f24872u0 != null && blVar2.getParentActivity() != null && blVar2.f24863n0 != null) {
                    if (org.telegram.messenger.o5.E(j10)) {
                        user = biVar.W1.getMessagesController().Z1(Long.valueOf(j10));
                    } else {
                        user = null;
                    }
                    s4.D(blVar2.getParentActivity(), false, user, new org.telegram.messenger.cs() {
                        @Override
                        public final void a(int i12) {
                            bl blVar3 = bl.this;
                            bi biVar2 = blVar3.f30964b;
                            s4.Z(biVar2.D3, biVar2.W0() + 1, biVar2.a1(), new ag.s2(blVar3, i12, 2));
                        }
                    }, blVar2.f30963a).show();
                    return;
                } else {
                    return;
                }
            }
        }
        Object J = h0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            s4.Z(biVar.D3, biVar.W0() + 1, biVar.a1(), new ag.m2(blVar2, unVar2, (TLRPC.TL_messageMediaVenue) J, p6Var2, 7));
        }
    }

    public static void R(bl blVar, org.telegram.ui.un unVar, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = blVar.P.I(i10);
        if (I != null && blVar.f24872u0 != null) {
            if (unVar != null && unVar.c()) {
                s4.L(blVar.getParentActivity(), unVar.a(), new pk(blVar, I, 0), p6Var);
                return;
            }
            blVar.f24872u0.d(I, blVar.f24873v0, true, 0, 0L);
            blVar.f30964b.a(true);
        }
    }

    public static void S(bl blVar, org.telegram.ui.un unVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.p6 p6Var) {
        if (unVar != null && unVar.c()) {
            s4.L(blVar.getParentActivity(), unVar.a(), new pk(blVar, tL_messageMediaVenue, 1), p6Var);
            return;
        }
        blVar.f24872u0.d(tL_messageMediaVenue, blVar.f24873v0, true, 0, 0L);
        blVar.f30964b.a(true);
    }

    public static void T(bl blVar, Location location) {
        int i10;
        bi biVar = blVar.f30964b;
        if (biVar != null && biVar.W1 != null) {
            blVar.d0(location);
            zf.h0 h0Var = blVar.M;
            if (h0Var != null && (((i10 = blVar.f24873v0) == 7 || i10 == 8) && !blVar.f24868r0)) {
                h0Var.M(blVar.f24864o0);
            }
            blVar.getLocationController().n(location, blVar.W);
            blVar.W = false;
        }
    }

    public static void U(bl blVar, org.telegram.messenger.ab abVar) {
        if (blVar.G != null && blVar.getParentActivity() != null) {
            try {
                ((bh.d) abVar).z();
                ((t7.u) org.telegram.messenger.w0.k()).initializeMaps(org.telegram.messenger.w0.f18945b);
                ((bh.d) blVar.G).w(new rk(blVar, 0));
                blVar.f24861l0 = true;
                if (blVar.m0) {
                    ((bh.d) blVar.G).F();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public static void V(bl blVar, org.telegram.ui.ActionBar.p6 p6Var) {
        zf.h0 h0Var = blVar.M;
        ImageView imageView = blVar.f24862n;
        Activity parentActivity = blVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            s4.C(blVar.getParentActivity()).show();
            return;
        }
        if (blVar.f24863n0 != null && blVar.F != null) {
            int i10 = org.telegram.ui.ActionBar.t6.jj;
            org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i10));
            h0Var.M(null);
            blVar.f24868r0 = false;
            blVar.g0(false);
            blVar.F.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(new org.telegram.messenger.db(blVar.f24863n0.getLatitude(), blVar.f24863n0.getLongitude())));
            if (blVar.f24870s0) {
                Location location = blVar.f24863n0;
                if (location != null && blVar.f24873v0 != 8) {
                    h0Var.H(null, location, true);
                }
                blVar.f24870s0 = false;
                blVar.f0();
            }
        }
        if (blVar.f24854e0 != null) {
            blVar.Q.setVisibility(0);
            yk ykVar = blVar.D;
            org.telegram.messenger.ga gaVar = blVar.f24854e0;
            HashMap hashMap = ykVar.f32862a;
            View view = (View) hashMap.get(gaVar);
            if (view != null) {
                ykVar.removeView(view);
                hashMap.remove(gaVar);
            }
            blVar.f24854e0 = null;
            blVar.f24855f0 = null;
            blVar.f24856g0 = null;
        }
    }

    public static void W(bl blVar) {
        if (blVar.getParentActivity() != null) {
            try {
                blVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    public static Activity X(bl blVar) {
        return blVar.getParentActivity();
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.f18945b.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location location = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            location = locationManager.getLastKnownLocation(providers.get(size));
            if (location != null) {
                return location;
            }
        }
        return location;
    }

    private org.telegram.messenger.od getLocationController() {
        return this.f30964b.W1.getLocationController();
    }

    private org.telegram.messenger.wp getMessagesController() {
        return this.f30964b.W1.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.k2 k2Var;
        bi biVar = this.f30964b;
        if (biVar != null && (k2Var = biVar.W1) != null) {
            return k2Var.getParentActivity();
        }
        return null;
    }

    private org.telegram.messenger.e20 getUserConfig() {
        return this.f30964b.W1.getUserConfig();
    }

    @Override
    public final void A() {
        org.telegram.messenger.ab abVar = this.G;
        if (abVar != null && this.f24861l0) {
            try {
                ((bh.d) abVar).D();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        this.m0 = false;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bl.B(int, int):void");
    }

    @Override
    public final void C() {
        org.telegram.messenger.ab abVar = this.G;
        if (abVar != null && this.f24861l0) {
            try {
                ((bh.d) abVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        this.m0 = true;
    }

    @Override
    public final void G(uh uhVar) {
        long j10;
        bi biVar = this.f30964b;
        biVar.R2.setTitle(org.telegram.messenger.dd.L0(2131745474, null));
        if (((fg.i) ((bh.d) this.G).f2777a).getParent() == null) {
            FrameLayout.LayoutParams e = w7.b6.e(-1, org.telegram.messenger.i0.L(10.0f) + this.f24875w0, 51);
            jg.l0 l0Var = this.L;
            l0Var.addView((fg.i) ((bh.d) this.G).f2777a, 0, e);
            l0Var.addView(this.D, 1, w7.b6.e(-1, org.telegram.messenger.i0.L(10.0f) + this.f24875w0, 51));
            l0Var.addView(this.K, 2, w7.b6.c(-1.0f, -1));
        }
        this.f24878y.setVisibility(0);
        org.telegram.messenger.ab abVar = this.G;
        if (abVar != null && this.f24861l0) {
            try {
                ((bh.d) abVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.f8.g(th2, true);
            }
        }
        this.m0 = true;
        org.telegram.messenger.ha haVar = this.F;
        if (haVar != null) {
            try {
                haVar.l(true);
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
        a0();
        boolean D = biVar.T3.D();
        lk lkVar = new lk(this, 1);
        if (D) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        org.telegram.messenger.i0.h3(lkVar, j10);
        this.R.h1(0, 0);
        h0();
    }

    @Override
    public final void I() {
        this.N.y0(0);
    }

    @Override
    public final boolean K() {
        return !this.V;
    }

    public final void Y() {
        org.telegram.ui.ActionBar.t0 t0Var = this.f24867r;
        if (t0Var != null) {
            t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ij, this.f30963a));
            this.f24867r.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, this.f30963a));
            this.f24867r.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, this.f30963a), true);
            this.f24867r.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.f30963a), false);
        }
        if (this.F != null) {
            if (org.telegram.ui.ActionBar.t6.I.q() || org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.f30963a)) < 0.721f) {
                if (!this.S) {
                    this.S = true;
                    this.F.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.f18945b, 2131624083));
                }
            } else if (this.S) {
                this.S = false;
                this.F.j(null);
            }
        }
    }

    public final Bitmap Z(int i10) {
        Bitmap[] bitmapArr = this.A0;
        Bitmap bitmap = bitmapArr[i10 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.x4.a(i10));
            canvas.drawCircle(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
            return null;
        }
    }

    public final void a0() {
        int i10;
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() != 0 && this.G != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            int i11 = org.telegram.messenger.i0.f16172q.y - currentActionBarHeight;
            int L = org.telegram.messenger.i0.L(66.0f);
            int i12 = this.f24873v0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                L += org.telegram.messenger.i0.L(66.0f);
            }
            int L2 = (i11 - L) - org.telegram.messenger.i0.L(90.0f);
            int L3 = org.telegram.messenger.i0.L(189.0f);
            this.f24875w0 = L3;
            if (!this.V || !b0()) {
                L2 = Math.min(org.telegram.messenger.i0.L(310.0f), L2);
            }
            this.f24877x0 = Math.max(L3, L2);
            if (this.V && b0()) {
                this.f24875w0 = this.f24877x0;
            }
            ag.b1 b1Var = this.N;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            b1Var.setLayoutParams(layoutParams2);
            jg.l0 l0Var = this.L;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) l0Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.f24877x0;
            l0Var.setLayoutParams(layoutParams3);
            uk0 uk0Var = this.O;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) uk0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            uk0Var.setLayoutParams(layoutParams4);
            if (this.V && b0()) {
                i10 = this.f24875w0 - b1Var.getPaddingTop();
            } else {
                i10 = this.f24875w0;
            }
            int L4 = org.telegram.messenger.i0.L(16.0f) + i10;
            zf.h0 h0Var = this.M;
            h0Var.Q(L4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) ((fg.i) ((bh.d) this.G).f2777a).getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = org.telegram.messenger.i0.L(10.0f) + this.f24877x0;
                ((fg.i) ((bh.d) this.G).f2777a).setLayoutParams(layoutParams5);
            }
            yk ykVar = this.D;
            if (ykVar != null && (layoutParams = (FrameLayout.LayoutParams) ykVar.getLayoutParams()) != null) {
                layoutParams.height = org.telegram.messenger.i0.L(10.0f) + this.f24877x0;
                ykVar.setLayoutParams(layoutParams);
            }
            h0Var.f();
            h0();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21115n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20873a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
    }

    public final boolean b0() {
        int i10 = this.f24873v0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void c0() {
        bl blVar;
        bi biVar = this.f30964b;
        if (biVar.F1) {
            if (biVar.f24822u4 != null) {
                org.telegram.messenger.i0.g3(new lk(this, 0));
                return;
            } else if (!this.V) {
                File file = biVar.f24818t4;
                boolean z10 = biVar.f24814s4;
                if (file != null) {
                    if (z10) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    org.telegram.messenger.i0.g3(new org.telegram.ui.Cells.u7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        blVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            org.telegram.messenger.i0.g3(new cd(17, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        blVar.f24863n0 = lastLocation;
                        d0(lastLocation);
                        return;
                    }
                }
                blVar = this;
                Location lastLocation2 = getLastLocation();
                blVar.f24863n0 = lastLocation2;
                d0(lastLocation2);
                return;
            } else {
                org.telegram.messenger.i0.g3(new lk(this, 7));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f24863n0 = lastLocation3;
        d0(lastLocation3);
    }

    public final void d0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f24863n0 = location2;
            org.telegram.messenger.ha haVar = this.F;
            zf.h0 h0Var = this.M;
            if (haVar != null) {
                org.telegram.messenger.db dbVar = new org.telegram.messenger.db(location.getLatitude(), location.getLongitude());
                if (h0Var != null) {
                    if (!this.f24870s0 && this.f24873v0 != 8) {
                        h0Var.H(null, this.f24863n0, true);
                    }
                    h0Var.N(this.f24863n0);
                }
                if (!this.f24868r0) {
                    this.f24864o0 = new Location(location);
                    if (this.f24871t0) {
                        this.F.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(dbVar));
                        return;
                    }
                    this.f24871t0 = true;
                    this.F.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(dbVar, this.F.e() - 4.0f));
                    return;
                }
                return;
            }
            h0Var.N(location2);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        int i12 = org.telegram.messenger.at.f14804v4;
        vk vkVar = this.P;
        zf.h0 h0Var = this.M;
        int i13 = 0;
        if (i10 == i12) {
            this.V = false;
            this.U = false;
            c0();
            if (h0Var != null) {
                h0Var.P(this.V, this.U);
            }
            if (vkVar != null && vkVar.M != (z11 = this.V)) {
                vkVar.M = z11;
            }
            org.telegram.messenger.ha haVar = this.F;
            if (haVar != null) {
                try {
                    haVar.l(true);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14811w4) {
            this.V = true;
            this.U = false;
            if (h0Var != null) {
                h0Var.P(true, false);
            }
            if (vkVar != null && vkVar.M != (z10 = this.V)) {
                vkVar.M = z10;
            }
        }
        a0();
        boolean z12 = this.V;
        bi biVar = this.f30964b;
        if (z12 && !biVar.F1) {
            i13 = 8;
        } else {
            biVar.getClass();
        }
        this.f24878y.setVisibility(i13);
    }

    public final void e0(double d, double d10) {
        org.telegram.messenger.va newCameraUpdateLatLngZoom;
        if (this.F != null) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f24864o0 = location;
                location.reset();
                this.f24864o0.setLatitude(d);
                this.f24864o0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f24863n0 = location2;
                location2.reset();
                this.f24863n0.setLatitude(d);
                this.f24863n0.setLongitude(d10);
            }
            org.telegram.messenger.db dbVar = new org.telegram.messenger.db(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(dbVar, this.F.e() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(dbVar, this.F.f());
            }
            this.H = newCameraUpdateLatLngZoom;
            this.F.i(newCameraUpdateLatLngZoom);
            zf.h0 h0Var = this.M;
            if (i10 != 0 && d10 != 0.0d) {
                h0Var.M(this.f24864o0);
            } else {
                h0Var.N(this.f24863n0);
            }
            h0Var.I();
            this.N.w0(0, 1, null);
            this.f24866q0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f24868r0 = true;
                g0(false);
                if (this.f24873v0 != 8) {
                    h0Var.H(null, this.f24864o0, true);
                }
                this.f24870s0 = true;
                f0();
            }
        }
    }

    public final void f0() {
        if (this.M.b() != 0 && this.R.L0() == 0) {
            ag.b1 b1Var = this.N;
            View childAt = b1Var.getChildAt(0);
            int top = childAt.getTop() + org.telegram.messenger.i0.L(258.0f);
            if (top >= 0 && top <= org.telegram.messenger.i0.L(258.0f)) {
                b1Var.w0(0, top, null);
            }
        }
    }

    public final void g0(boolean z10) {
        int i10;
        Integer num;
        float f7;
        Location location;
        Location location2;
        if (this.V) {
            z10 = false;
        }
        zk zkVar = this.f24869s;
        if (z10 && zkVar != null && zkVar.getTag() == null && ((location = this.f24863n0) == null || (location2 = this.f24864o0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f24873v0 == 8) {
            z10 = false;
        }
        if (zkVar != null) {
            if (!z10 || zkVar.getTag() == null) {
                if (z10 || zkVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    zkVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    zkVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -org.telegram.messenger.i0.L(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(zkVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(gr.f26524g);
                    animatorSet.start();
                }
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.i0.L(56.0f);
    }

    @Override
    public int getCurrentItemTop() {
        ag.b1 b1Var = this.N;
        if (b1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        dk0 dk0Var = (dk0) b1Var.K(0);
        if (dk0Var != null) {
            i10 = Math.max(((int) dk0Var.f47909a.getY()) - this.f24880z0, 0);
        }
        return org.telegram.messenger.i0.L(56.0f) + i10;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.N.getPaddingTop();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.c7> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.c7> arrayList = new ArrayList<>();
        o6 o6Var = new o6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h5));
        int i10 = org.telegram.ui.ActionBar.t6.A5;
        ag.b1 b1Var = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.ActionBar.t0 t0Var = this.f24878y;
        if (t0Var != null) {
            editTextBoldCursor = t0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21038j5));
        int i11 = org.telegram.ui.ActionBar.t6.kj;
        ImageView imageView = this.f24862n;
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.lj;
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        int i13 = org.telegram.ui.ActionBar.t6.ij;
        org.telegram.ui.ActionBar.t0 t0Var2 = this.f24867r;
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(t0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f24869s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f24869s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 196608, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 0, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 8, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(b1Var, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.X5));
        return arrayList;
    }

    public final void h0() {
        jg.l0 l0Var;
        int i10;
        int i11;
        org.telegram.messenger.db dbVar;
        Location location;
        org.telegram.messenger.ha haVar;
        if (this.G != null && (l0Var = this.L) != null) {
            ag.b1 b1Var = this.N;
            s4.c1 K = b1Var.K(0);
            if (K != null) {
                i10 = (int) K.f47909a.getY();
                i11 = Math.min(i10, 0) + this.f24875w0;
            } else {
                i10 = -l0Var.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) l0Var.getLayoutParams()) != null) {
                yk ykVar = this.D;
                if (i11 <= 0) {
                    if (((fg.i) ((bh.d) this.G).f2777a).getVisibility() == 0) {
                        ((fg.i) ((bh.d) this.G).f2777a).setVisibility(4);
                        l0Var.setVisibility(4);
                        if (ykVar != null) {
                            ykVar.setVisibility(4);
                        }
                    }
                    ((fg.i) ((bh.d) this.G).f2777a).setTranslationY(i10);
                    return;
                }
                if (((fg.i) ((bh.d) this.G).f2777a).getVisibility() == 4) {
                    ((fg.i) ((bh.d) this.G).f2777a).setVisibility(0);
                    l0Var.setVisibility(0);
                    if (ykVar != null) {
                        ykVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.f24877x0) + this.f24875w0)) / 2);
                int i12 = this.f24877x0 - this.f24875w0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (b1Var.getPaddingTop() - i10) / (b1Var.getPaddingTop() - i12)));
                int i13 = this.f24879y0;
                if (this.V && b0()) {
                    i12 += Math.min(i10, b1Var.getPaddingTop());
                }
                this.f24879y0 = (int) (i12 * max2);
                float f7 = max;
                ((fg.i) ((bh.d) this.G).f2777a).setTranslationY(f7);
                this.f24880z0 = i12 - this.f24879y0;
                l0Var.invalidate();
                l0Var.setTranslationY(i10 - this.f24880z0);
                org.telegram.messenger.ha haVar2 = this.F;
                if (haVar2 != null) {
                    haVar2.q(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f) + this.f24879y0);
                }
                if (ykVar != null) {
                    ykVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.f24880z0 - i10, 0);
                int i14 = this.f24877x0;
                org.telegram.ui.ActionBar.t0 t0Var = this.f24867r;
                float C = org.telegram.messenger.a30.C(80.0f, i14 - t0Var.getMeasuredHeight(), max3);
                t0Var.setTranslationY(C);
                zk zkVar = this.f24869s;
                zkVar.f33178b = C;
                zkVar.setTranslationY(C + zkVar.f33177a);
                this.f24862n.setTranslationY(-this.f24879y0);
                int D = org.telegram.messenger.a30.D(48.0f, (this.f24877x0 - this.f24879y0) / 2, max);
                this.f24865p0 = D;
                this.Q.setTranslationY(D);
                if (i13 != this.f24879y0) {
                    org.telegram.messenger.ga gaVar = this.f24854e0;
                    if (gaVar != null) {
                        dbVar = new org.telegram.messenger.db(gaVar.a().f15333a, this.f24854e0.a().f15334b);
                    } else if (this.f24868r0 && (location = this.f24864o0) != null) {
                        dbVar = new org.telegram.messenger.db(location.getLatitude(), this.f24864o0.getLongitude());
                    } else {
                        Location location2 = this.f24863n0;
                        if (location2 != null) {
                            dbVar = new org.telegram.messenger.db(location2.getLatitude(), this.f24863n0.getLongitude());
                        } else {
                            dbVar = null;
                        }
                    }
                    if (dbVar != null && (haVar = this.F) != null) {
                        haVar.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(dbVar));
                    }
                }
                if (this.V && b0()) {
                    int b10 = this.M.b();
                    for (int i15 = 1; i15 < b10; i15++) {
                        s4.c1 K2 = b1Var.K(i15);
                        if (K2 != null) {
                            K2.f47909a.setTranslationY(b1Var.getPaddingTop() - i10);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final int i() {
        return 1;
    }

    public final void i0() {
        boolean z10 = this.f24858i0;
        LinearLayout linearLayout = this.f24874w;
        if (z10) {
            boolean z11 = this.f24860k0;
            uk0 uk0Var = this.O;
            if (z11) {
                uk0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            uk0Var.setEmptyView(linearLayout);
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override
    public final void o() {
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14804v4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14811w4);
        this.E = true;
        jg.l0 l0Var = this.L;
        if (l0Var != null) {
            l0Var.invalidate();
        }
        try {
            org.telegram.messenger.ha haVar = this.F;
            if (haVar != null) {
                haVar.l(false);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.messenger.ab abVar = this.G;
        if (abVar != null) {
            ((fg.i) ((bh.d) abVar).f2777a).setTranslationY((-org.telegram.messenger.i0.f16172q.y) * 3);
        }
        try {
            org.telegram.messenger.ab abVar2 = this.G;
            if (abVar2 != null) {
                ((bh.d) abVar2).D();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.ab abVar3 = this.G;
            if (abVar3 != null) {
                ((bh.d) abVar3).B();
                this.G = null;
            }
        } catch (Exception unused2) {
        }
        zf.h0 h0Var = this.M;
        if (h0Var != null) {
            h0Var.F();
        }
        vk vkVar = this.P;
        if (vkVar != null) {
            vkVar.F();
        }
        bi biVar = this.f30964b;
        biVar.R2.k(true);
        biVar.R2.p().removeView(this.f24878y);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            a0();
        }
    }

    @Override
    public final boolean p() {
        o();
        return false;
    }

    public void setDelegate(wk wkVar) {
        this.f24872u0 = wkVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30964b.f21587b.invalidate();
        h0();
    }

    @Override
    public final void t() {
        this.f24878y.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Y();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.f24878y;
        if (t0Var != null) {
            try {
                if (t0Var.getSearchField() != null) {
                    t0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21038j5, this.f30963a));
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
        }
    }

    @Override
    public final void y() {
        boolean z10;
        bi biVar = this.f30964b;
        if (biVar != null && !biVar.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.M.f55531c0 = z10;
    }

    @Override
    public final void z(int i10, boolean z10) {
        if (z10) {
            this.M.f55531c0 = false;
        }
    }
}
