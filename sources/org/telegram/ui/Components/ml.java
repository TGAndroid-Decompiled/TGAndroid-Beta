package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ml extends mi implements org.telegram.ui.ActionBar.b6, org.telegram.messenger.gs {
    public static final int G0 = 0;
    public float A0;
    public final hl B0;
    public int C0;
    public int D0;
    public org.telegram.messenger.ea E;
    public int E0;
    public org.telegram.messenger.ya F;
    public int F0;
    public org.telegram.messenger.ta G;
    public float H;
    public boolean I;
    public final View J;
    public final bi.e3 K;
    public final jg.r0 L;
    public final di.b1 M;
    public final ek0 N;
    public final kl O;
    public final ImageView P;
    public final kg.d0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final long W;
    public final Paint f37546a0;
    public AnimatorSet f37547b0;
    public boolean f37548c0;
    public boolean f37549d0;
    public boolean f37550e0;
    public boolean f37551f0;
    public boolean f37552g0;
    public boolean f37553h0;
    public Location f37554i0;
    public Location f37555j0;
    public int f37556k0;
    public boolean f37557l0;
    public boolean m0;
    public final ImageView f37558n;
    public boolean f37559n0;
    public ll f37560o0;
    public final int f37561p0;
    public int f37562q0;
    public final org.telegram.ui.ActionBar.q0 f37563r;
    public int f37564r0;
    public final LinearLayout f37565s;
    public int f37566s0;
    public int f37567t0;
    public float f37568u0;
    public float f37569v0;
    public final TextView f37570w;
    public final int[] f37571w0;
    public final org.telegram.ui.ActionBar.q0 f37572x;
    public int f37573x0;
    public boolean f37574y;
    public int f37575y0;
    public int f37576z0;

    public ml(ui uiVar, Context context, final org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, h6Var, uiVar);
        final org.telegram.ui.bn bnVar;
        boolean z11;
        boolean z12;
        this.S = true;
        this.T = false;
        this.U = false;
        this.V = true;
        this.f37546a0 = new Paint();
        this.f37548c0 = true;
        int currentActionBarHeight = (org.telegram.messenger.g0.f24046q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.f37562q0 = currentActionBarHeight;
        this.f37564r0 = currentActionBarHeight;
        this.f37566s0 = -1;
        this.f37567t0 = Integer.MAX_VALUE;
        this.f37568u0 = Float.NaN;
        this.f37569v0 = 1.0f;
        this.f37571w0 = new int[2];
        this.f37575y0 = Integer.MAX_VALUE;
        this.A0 = -1.0f;
        this.B0 = new hl(0, this);
        this.E0 = -1;
        this.F0 = -1;
        org.telegram.messenger.g0.a0();
        ui uiVar2 = this.f37519b;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar2.f40367a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            bnVar = (org.telegram.ui.bn) g2Var;
        } else {
            bnVar = null;
        }
        long c12 = uiVar2.c1();
        this.W = c12;
        if (this.f37519b.J1) {
            this.f37561p0 = 7;
        } else if (z10 && bnVar != null && bnVar.h == null && !bnVar.c() && !org.telegram.messenger.p10.C(bnVar.j())) {
            this.f37561p0 = 1;
        } else {
            this.f37561p0 = 0;
        }
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25423y4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25430z4);
        this.f37550e0 = false;
        this.f37549d0 = false;
        this.f37551f0 = false;
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        kl klVar = this.O;
        if (klVar != null) {
            klVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.U = z11;
        org.telegram.ui.ActionBar.q0 a10 = this.f37519b.V2.s().a(0, 2131232488);
        a10.O();
        a10.I = new bi.w1(this, 8);
        this.f37572x = a10;
        this.f37519b.getClass();
        a10.setVisibility(0);
        a10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        a10.setContentDescription(org.telegram.messenger.hd.N0(2131745640, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i7 = org.telegram.ui.ActionBar.m6.f29489j5;
        org.telegram.ui.ActionBar.t6.U(searchField, i7, h6Var);
        org.telegram.ui.ActionBar.t6.v(searchField, i7, h6Var);
        org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Me, h6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(21.0f)).gravity = 83;
        bi.e3 e3Var = new bi.e3(15, context, this);
        this.K = e3Var;
        e3Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new sc(org.telegram.ui.ActionBar.m6.D0().q()));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lj, this.f37518a), false, h6Var);
        this.f37563r = q0Var;
        q0Var.setClickable(true);
        q0Var.setSubMenuOpenSide(2);
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(10.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(10.0f));
        q0Var.d(2, 2131232215, null, org.telegram.messenger.hd.N0(2131748497, null), true, false, h6Var);
        q0Var.d(3, 2131232351, null, org.telegram.messenger.hd.N0(2131745752, null), true, false, h6Var);
        q0Var.d(4, 2131232186, null, org.telegram.messenger.hd.N0(2131749082, null), true, false, h6Var);
        q0Var.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        int L = org.telegram.messenger.g0.L(40.0f);
        int i10 = org.telegram.ui.ActionBar.m6.nj;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, this.f37518a);
        int i11 = org.telegram.ui.ActionBar.m6.oj;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.m6.j0(L, w02, org.telegram.ui.ActionBar.m6.w0(i11, this.f37518a));
        c8.ra.a(q0Var);
        q0Var.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        bg.q0 q0Var2 = bg.u0.f3362a;
        q0Var.setOutlineProvider(q0Var2);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i11);
        q0Var.setBackground(j02);
        org.telegram.ui.ActionBar.t6.j(q0Var, j02, M, M2, h6Var);
        q0Var.setIcon(2131232216);
        e3Var.addView(q0Var, c8.ma.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        q0Var.setOnClickListener(new o0(this, 7));
        q0Var.setDelegate(new bl(this));
        ImageView imageView = new ImageView(context);
        this.f37558n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.m6.w0(i10, this.f37518a), org.telegram.ui.ActionBar.m6.w0(i11, this.f37518a));
        c8.ra.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        imageView.setOutlineProvider(q0Var2);
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i11);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.t6.j(imageView, j03, M3, M4, h6Var);
        imageView.setImageResource(2131232107);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.m6.mj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i12, h6Var, mode);
        imageView.setTag(Integer.valueOf(i12));
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131754830, null));
        e3Var.addView(imageView, c8.ma.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new m8(2, this, h6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37565s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.ma.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new gi.a(16));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231641);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.W5, h6Var, mode);
        linearLayout.addView(imageView2, c8.ma.o(-2, -2));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.m6.X5;
        org.telegram.ui.ActionBar.t6.U(textView, i13, h6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        i5.c.r(17.0f, 1, 2131747986, textView, null);
        TextView f10 = org.telegram.messenger.o10.f(linearLayout, textView, c8.ma.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f37570w = f10;
        org.telegram.ui.ActionBar.t6.U(f10, i13, h6Var);
        f10.setGravity(17);
        f10.setTextSize(1, 15.0f);
        f10.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(f10, c8.ma.t(-2, -2, 17, 0, 6, 0, 0));
        di.b1 b1Var = new di.b1(this, context, h6Var, 16);
        this.M = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.f37522f = true;
        b1Var.setClipToPadding(false);
        jg.r0 r0Var2 = new jg.r0(context, this.f37561p0, c12, true, h6Var, this.f37519b.J1, false, false);
        this.L = r0Var2;
        b1Var.setAdapter(r0Var2);
        ui uiVar3 = this.f37519b;
        if (uiVar3 != null && (uiVar3.C1 || uiVar3.K1)) {
            z12 = true;
        } else {
            z12 = false;
        }
        r0Var2.X = z12;
        b1Var.setItemAnimator(null);
        r0Var2.O(this.U, this.T);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.r1();
        kg.d0 d0Var = new kg.d0(this, b1Var);
        this.Q = d0Var;
        b1Var.setLayoutManager(d0Var);
        addView(b1Var, c8.ma.e(-1, -1, 51));
        b1Var.setOnScrollListener(new jl(this, 0));
        b1Var.setOnItemClickListener(new qj0(this) {
            public final ml f34213b;

            {
                this.f34213b = this;
            }

            @Override
            public final void c(int i14, View view2) {
                switch (r4) {
                    case 0:
                        ml.U(this.f34213b, bnVar, h6Var, i14);
                        return;
                    default:
                        ml.W(this.f34213b, bnVar, h6Var, i14);
                        return;
                }
            }
        });
        r0Var2.P(this.f37562q0);
        addView(e3Var, indexOfChild(b1Var), c8.ma.e(-1, -1, 51));
        org.telegram.messenger.ya onCreateMapView = ((pb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.F = onCreateMapView;
        a8.r7 r7Var = (a8.r7) onCreateMapView;
        r7Var.f618c = new bl(this);
        r7Var.d = new h2(9, this, h6Var);
        new Thread(new dl(this, onCreateMapView, 0)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(2131231648);
        e3Var.addView(imageView3, c8.ma.e(28, 48, 49));
        ek0 ek0Var = new ek0(context, h6Var);
        this.N = ek0Var;
        ek0Var.setSections(true);
        ek0Var.setClipToPadding(false);
        ek0Var.setVisibility(8);
        ek0Var.setLayoutManager(new v4.c0(1, false));
        kl klVar2 = new kl(this, context, h6Var, this.f37519b.J1);
        this.O = klVar2;
        klVar2.f17435n = new bl(this);
        ek0Var.setItemAnimator(null);
        addView(ek0Var, c8.ma.e(-1, -1, 51));
        ek0Var.setOnScrollListener(new jl(this, 1));
        ek0Var.setOnItemClickListener(new qj0(this) {
            public final ml f34213b;

            {
                this.f34213b = this;
            }

            @Override
            public final void c(int i14, View view2) {
                switch (r4) {
                    case 0:
                        ml.U(this.f34213b, bnVar, h6Var, i14);
                        return;
                    default:
                        ml.W(this.f34213b, bnVar, h6Var, i14);
                        return;
                }
            }
        });
        j0();
    }

    public static void P(ml mlVar, org.telegram.ui.ActionBar.h6 h6Var) {
        ImageView imageView = mlVar.f37558n;
        Activity parentActivity = mlVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            c5.A(mlVar.getParentActivity()).show();
        } else if (mlVar.f37554i0 != null && mlVar.E != null) {
            int i7 = org.telegram.ui.ActionBar.m6.mj;
            org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i7));
            mlVar.L.L(null);
            mlVar.m0 = false;
            mlVar.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.bb(mlVar.f37554i0.getLatitude(), mlVar.f37554i0.getLongitude())));
        }
    }

    public static void Q(ml mlVar, org.telegram.ui.bn bnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.h6 h6Var) {
        if (bnVar != null && bnVar.c()) {
            c5.J(mlVar.getParentActivity(), bnVar.a(), new el(mlVar, tL_messageMediaVenue, 1), h6Var);
            return;
        }
        mlVar.f37560o0.b(tL_messageMediaVenue, mlVar.f37561p0, true, 0, 0L);
        mlVar.f37519b.a(true);
    }

    public static void R(ml mlVar) {
        if (mlVar.getParentActivity() != null) {
            try {
                mlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    public static void S(ml mlVar, org.telegram.messenger.ya yaVar) {
        if (mlVar.F != null && mlVar.getParentActivity() != null) {
            try {
                ((a8.r7) yaVar).y();
                ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f26931b);
                ((a8.r7) mlVar.F).t(new fl(mlVar, 0));
                mlVar.f37552g0 = true;
                if (mlVar.f37553h0) {
                    ((a8.r7) mlVar.F).F();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static void T(ml mlVar) {
        di.b1 b1Var = mlVar.M;
        bi.e3 e3Var = mlVar.K;
        if (mlVar.F != null && e3Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e3Var.getLayoutParams();
            if (layoutParams != null) {
                int i7 = layoutParams.height;
                int i10 = mlVar.f37564r0;
                if (i7 != i10) {
                    layoutParams.height = i10;
                    e3Var.setLayoutParams(layoutParams);
                }
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.l0) ((a8.r7) mlVar.F).f617b).getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != mlVar.getMapContentHeight()) {
                layoutParams2.height = mlVar.getMapContentHeight();
                ((ai.l0) ((a8.r7) mlVar.F).f617b).setLayoutParams(layoutParams2);
            }
            mlVar.L.P(mlVar.f37562q0);
            v4.f1 K = b1Var.K(0);
            if (K != null) {
                View view = K.f59165a;
                if (view.getLayoutParams() != null && view.getLayoutParams().height != mlVar.f37562q0) {
                    view.getLayoutParams().height = mlVar.f37562q0;
                    view.requestLayout();
                }
            }
            kg.d0 d0Var = mlVar.Q;
            d0Var.M = 0;
            d0Var.p1();
            b1Var.requestLayout();
            mlVar.i0();
        }
    }

    public static void U(ml mlVar, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        ml mlVar2;
        org.telegram.ui.bn bnVar2;
        org.telegram.ui.ActionBar.h6 h6Var2;
        TLRPC.User user;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = mlVar.W;
        jg.r0 r0Var = mlVar.L;
        ui uiVar = mlVar.f37519b;
        int i10 = mlVar.f37561p0;
        if (i10 == 7) {
            if (i7 == 1 && (tL_messageMediaVenue2 = r0Var.V) != null) {
                mlVar.f37560o0.b(tL_messageMediaVenue2, i10, true, 0, 0L);
                uiVar.a(true);
                return;
            } else if (i7 == 2 && (tL_messageMediaVenue = r0Var.W) != null) {
                mlVar.f37560o0.b(tL_messageMediaVenue, i10, true, 0, 0L);
                uiVar.a(true);
                return;
            } else {
                mlVar2 = mlVar;
                bnVar2 = bnVar;
                h6Var2 = h6Var;
            }
        } else if (i7 == 1) {
            if (mlVar.f37560o0 != null && mlVar.f37555j0 != null) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(mlVar.f37555j0.getLatitude());
                tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(mlVar.f37555j0.getLongitude());
                c5.X(uiVar.H3, uiVar.Y0() + 1, uiVar.c1(), new bi.m2(mlVar, bnVar, tL_messageMediaGeo, h6Var, 7));
                return;
            } else if (mlVar.U) {
                c5.A(mlVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            mlVar2 = mlVar;
            bnVar2 = bnVar;
            h6Var2 = h6Var;
            if (i7 == 2 && i10 == 1) {
                if (mlVar2.getLocationController().i(j3)) {
                    mlVar2.getLocationController().k(j3);
                    uiVar.a(true);
                    return;
                } else if (mlVar2.f37554i0 == null && mlVar2.U) {
                    c5.A(mlVar2.getParentActivity()).show();
                    return;
                } else if (mlVar2.f37560o0 != null && mlVar2.getParentActivity() != null && mlVar2.f37554i0 != null) {
                    if (org.telegram.messenger.n5.E(j3)) {
                        user = uiVar.f40367a2.getMessagesController().c2(Long.valueOf(j3));
                    } else {
                        user = null;
                    }
                    c5.B(mlVar2.getParentActivity(), false, user, new org.telegram.messenger.or() {
                        @Override
                        public final void a(int i11) {
                            ml mlVar3 = ml.this;
                            ui uiVar2 = mlVar3.f37519b;
                            c5.X(uiVar2.H3, uiVar2.Y0() + 1, uiVar2.c1(), new ai.b2(mlVar3, i11, 6));
                        }
                    }, mlVar2.f37518a).show();
                    return;
                } else {
                    return;
                }
            }
        }
        Object I = r0Var.I(i7);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            c5.X(uiVar.H3, uiVar.Y0() + 1, uiVar.c1(), new bi.m2(mlVar2, bnVar2, (TLRPC.TL_messageMediaVenue) I, h6Var2, 8));
        }
    }

    public static void V(ml mlVar) {
        jg.r0 r0Var = mlVar.L;
        ui uiVar = mlVar.f37519b;
        if (mlVar.f37548c0) {
            int i7 = Build.VERSION.SDK_INT;
            Activity parentActivity = mlVar.getParentActivity();
            if (parentActivity != null) {
                mlVar.f37548c0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!uiVar.J1 || uiVar.f40446x4 == null || i7 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    mlVar.T = true;
                    if (r0Var != null) {
                        r0Var.O(mlVar.U, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i7 >= 29 && uiVar.J1 && uiVar.f40446x4 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    mlVar.T = true;
                    if (r0Var != null) {
                        r0Var.O(mlVar.U, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void W(ml mlVar, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        ui uiVar = mlVar.f37519b;
        TLRPC.TL_messageMediaVenue H = mlVar.O.H(i7);
        if (H != null && mlVar.f37561p0 != 7) {
            uiVar.V2.n(true);
            TLRPC.GeoPoint geoPoint = H.geo;
            mlVar.h0(geoPoint.lat, geoPoint._long);
        } else if (H != null && mlVar.f37560o0 != null) {
            if (bnVar != null && bnVar.c()) {
                c5.J(mlVar.getParentActivity(), bnVar.a(), new el(mlVar, H, 0), h6Var);
                return;
            }
            mlVar.f37560o0.b(H, mlVar.f37561p0, true, 0, 0L);
            uiVar.a(true);
        }
    }

    public static void X(ml mlVar, Location location) {
        int i7;
        ui uiVar = mlVar.f37519b;
        if (uiVar != null && uiVar.f40367a2 != null) {
            mlVar.g0(location);
            jg.r0 r0Var = mlVar.L;
            if (r0Var != null && (((i7 = mlVar.f37561p0) == 7 || i7 == 8) && !mlVar.m0)) {
                r0Var.L(mlVar.f37555j0);
            }
            mlVar.getLocationController().n(location, mlVar.V);
            mlVar.V = false;
        }
    }

    public static void Y(ml mlVar, org.telegram.ui.bn bnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.h6 h6Var, Long l10) {
        if (bnVar != null && bnVar.c()) {
            c5.J(mlVar.getParentActivity(), bnVar.a(), new a3.h(mlVar, tL_messageMediaGeo, l10, 28), h6Var);
            return;
        }
        mlVar.f37560o0.b(tL_messageMediaGeo, mlVar.f37561p0, true, 0, l10.longValue());
        mlVar.f37519b.a(true);
    }

    public static void Z(ml mlVar, org.telegram.messenger.ea eaVar) {
        PackageManager packageManager;
        mlVar.E = eaVar;
        al alVar = new al(mlVar, 3);
        k8.a aVar = eaVar.f23691a;
        org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(alVar, 5);
        l8.e eVar = (l8.e) aVar.f18214b;
        try {
            k8.c cVar = new k8.c(j1Var, (byte) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 42);
            if (org.telegram.ui.ActionBar.m6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, mlVar.f37518a)) < 0.721f) {
                mlVar.R = true;
                mlVar.E.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f26931b, 2131624086));
            }
            if (mlVar.E != null) {
                Location location = new Location("network");
                mlVar.f37555j0 = location;
                location.setLatitude(20.659322d);
                mlVar.f37555j0.setLongitude(-11.40625d);
                try {
                    mlVar.E.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                mlVar.E.g().w2();
                mlVar.E.g().B2();
                mlVar.E.g().r2();
                mlVar.E.l(new bl(mlVar));
                org.telegram.messenger.ea eaVar2 = mlVar.E;
                al alVar2 = new al(mlVar, 4);
                k8.a aVar2 = eaVar2.f23691a;
                org.telegram.messenger.j1 j1Var2 = new org.telegram.messenger.j1(alVar2, 8);
                l8.e eVar2 = (l8.e) aVar2.f18214b;
                try {
                    k8.c cVar2 = new k8.c(j1Var2, (short) 0);
                    Parcel p13 = eVar2.p1();
                    v7.b.c(p13, cVar2);
                    eVar2.t1(p13, 99);
                    org.telegram.messenger.ea eaVar3 = mlVar.E;
                    fl flVar = new fl(mlVar, 1);
                    k8.a aVar3 = eaVar3.f23691a;
                    org.telegram.messenger.j1 j1Var3 = new org.telegram.messenger.j1(flVar, 6);
                    l8.e eVar3 = (l8.e) aVar3.f18214b;
                    try {
                        k8.c cVar3 = new k8.c(j1Var3);
                        Parcel p14 = eVar3.p1();
                        v7.b.c(p14, cVar3);
                        eVar3.t1(p14, 36);
                        mlVar.E.m(new l2(20));
                        mlVar.f0();
                        org.telegram.messenger.g0.h3(new al(mlVar, 5), 200L);
                        if (mlVar.S && mlVar.getParentActivity() != null) {
                            mlVar.S = false;
                            Activity parentActivity = mlVar.getParentActivity();
                            if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                                try {
                                    if (!((LocationManager) org.telegram.messenger.t0.f26931b.getSystemService("location")).isProviderEnabled("gps")) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mlVar.getParentActivity(), mlVar.f37518a);
                                        int i7 = org.telegram.ui.ActionBar.m6.L5;
                                        alertDialog$Builder.m(2131624120, 72, org.telegram.ui.ActionBar.m6.w0(i7, mlVar.f37518a), null);
                                        alertDialog$Builder.n(i7, mlVar.f37518a);
                                        alertDialog$Builder.f28777a.U = org.telegram.messenger.hd.N0(2131749354, null);
                                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751794, null), new bl(mlVar));
                                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                        alertDialog$Builder.p();
                                    }
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                            } else {
                                return;
                            }
                        }
                        mlVar.i0();
                    } catch (RemoteException e12) {
                        throw new RuntimeException(e12);
                    }
                } catch (RemoteException e13) {
                    throw new RuntimeException(e13);
                }
            }
        } catch (RemoteException e14) {
            throw new RuntimeException(e14);
        }
    }

    public static void a0(ml mlVar) {
        jg.r0 r0Var = mlVar.L;
        di.b1 b1Var = mlVar.M;
        if (mlVar.F != null && mlVar.K != null && mlVar.getMeasuredHeight() != 0) {
            v4.f1 K = b1Var.K(0);
            if (K != null) {
                View view = K.f59165a;
                int bottom = view.getBottom();
                int b10 = r0Var.b();
                int i7 = 1;
                while (true) {
                    if (i7 < b10) {
                        if (r0Var.d(i7) != 11) {
                            v4.f1 K2 = b1Var.K(i7);
                            if (K2 == null) {
                                break;
                            }
                            bottom = Math.max(bottom, K2.f59165a.getBottom());
                        }
                        i7++;
                    } else {
                        mlVar.f37566s0 = bottom - view.getBottom();
                        break;
                    }
                }
            }
            int i10 = mlVar.f37566s0;
            if (i10 < 0) {
                int L = org.telegram.messenger.g0.L(66.0f);
                int i11 = mlVar.f37561p0;
                if (i11 != 1 && i11 != 7 && i11 != 8) {
                    i10 = L;
                } else {
                    i10 = org.telegram.messenger.g0.L(66.0f) + L;
                }
            }
            int measuredHeight = (b1Var.getMeasuredHeight() - mlVar.getDefaultBottomInset()) - i10;
            int measuredHeight2 = mlVar.getMeasuredHeight() + mlVar.getMapExtraTop();
            int max = Math.max(org.telegram.messenger.g0.L(120.0f), measuredHeight - b1Var.getPaddingTop());
            if (measuredHeight2 != mlVar.f37564r0 || max != mlVar.f37562q0) {
                mlVar.f37564r0 = measuredHeight2;
                mlVar.f37562q0 = max;
                org.telegram.messenger.g0.g3(new al(mlVar, 0));
            }
        }
    }

    private int getBottomInset() {
        d0();
        return org.telegram.messenger.g0.W1(0.0f, getDefaultBottomInset(), getMinBottomInset());
    }

    private int getDefaultBottomInset() {
        if (d0()) {
            return org.telegram.messenger.g0.L(8.0f) + this.f37521e;
        }
        return getMinBottomInset();
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f26931b.getSystemService("location");
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

    private org.telegram.messenger.rd getLocationController() {
        return this.f37519b.f40367a2.getLocationController();
    }

    private int getMapContentHeight() {
        return org.telegram.messenger.g0.L(10.0f) + this.f37564r0 + this.D0;
    }

    private int getMapExtraTop() {
        return org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24040m;
    }

    private org.telegram.messenger.bb getMapTarget() {
        Location location;
        if (this.m0 && (location = this.f37555j0) != null) {
            return new org.telegram.messenger.bb(location.getLatitude(), this.f37555j0.getLongitude());
        }
        Location location2 = this.f37554i0;
        if (location2 != null) {
            return new org.telegram.messenger.bb(location2.getLatitude(), this.f37554i0.getLongitude());
        }
        return null;
    }

    private org.telegram.messenger.np getMessagesController() {
        return this.f37519b.f40367a2.getMessagesController();
    }

    private int getMinBottomInset() {
        if (d0()) {
            return getDefaultBottomInset();
        }
        return Math.min(this.f37521e, org.telegram.messenger.g0.f24041n);
    }

    private Activity getParentActivity() {
        org.telegram.ui.ActionBar.g2 g2Var;
        ui uiVar = this.f37519b;
        if (uiVar != null && (g2Var = uiVar.f40367a2) != null) {
            return g2Var.getParentActivity();
        }
        return null;
    }

    private org.telegram.messenger.k10 getUserConfig() {
        return this.f37519b.f40367a2.getUserConfig();
    }

    @Override
    public final void A() {
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.f37552g0) {
            try {
                ((a8.r7) yaVar).B();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.f37553h0 = false;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ml.B(int, int):void");
    }

    @Override
    public final void C() {
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.f37552g0) {
            try {
                ((a8.r7) yaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f37553h0 = true;
    }

    @Override
    public final void F(float f10, float f11) {
        if (this.f37568u0 == f10 && this.f37569v0 == f11) {
            return;
        }
        this.f37568u0 = f10;
        this.f37569v0 = f11;
        e0();
    }

    @Override
    public final void I(mi miVar) {
        long j3;
        ui uiVar = this.f37519b;
        uiVar.V2.setTitle(org.telegram.messenger.hd.N0(2131745260, null));
        if (((ai.l0) ((a8.r7) this.F).f617b).getParent() == null) {
            FrameLayout.LayoutParams e10 = c8.ma.e(-1, org.telegram.messenger.g0.L(10.0f) + this.f37562q0, 51);
            bi.e3 e3Var = this.K;
            e3Var.addView((ai.l0) ((a8.r7) this.F).f617b, 0, e10);
            e3Var.addView(this.J, 1, c8.ma.c(-1.0f, -1));
        }
        this.f37572x.setVisibility(0);
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.f37552g0) {
            try {
                ((a8.r7) yaVar).F();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f37553h0 = true;
        org.telegram.messenger.ea eaVar = this.E;
        if (eaVar != null) {
            try {
                eaVar.k(true);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        c0();
        boolean g02 = uiVar.X3.g0();
        al alVar = new al(this, 1);
        if (g02) {
            j3 = 200;
        } else {
            j3 = 0;
        }
        org.telegram.messenger.g0.h3(alVar, j3);
        this.Q.h1(0, 0);
        i0();
    }

    @Override
    public final void K() {
        this.M.y0(0);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29562n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29324a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
    }

    public final void b0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.f37563r;
        if (q0Var != null) {
            q0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.lj, this.f37518a));
            this.f37563r.I(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.f37518a));
            this.f37563r.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.f37518a), true);
            this.f37563r.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.f37518a), false);
        }
        if (this.E != null) {
            if (org.telegram.ui.ActionBar.m6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, this.f37518a)) < 0.721f) {
                if (!this.R) {
                    this.R = true;
                    this.E.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f26931b, 2131624086));
                }
            } else if (this.R) {
                this.R = false;
                this.E.i(null);
            }
        }
    }

    public final void c0() {
        if (getMeasuredHeight() != 0 && this.F != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            di.b1 b1Var = this.M;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
            layoutParams.topMargin = currentActionBarHeight;
            b1Var.setLayoutParams(layoutParams);
            bi.e3 e3Var = this.K;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e3Var.getLayoutParams();
            layoutParams2.topMargin = 0;
            layoutParams2.height = this.f37564r0;
            e3Var.setLayoutParams(layoutParams2);
            ek0 ek0Var = this.N;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ek0Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            ek0Var.setLayoutParams(layoutParams3);
            int i7 = this.f37562q0;
            jg.r0 r0Var = this.L;
            r0Var.P(i7);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ai.l0) ((a8.r7) this.F).f617b).getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = org.telegram.messenger.g0.L(10.0f) + this.f37564r0;
                ((ai.l0) ((a8.r7) this.F).f617b).setLayoutParams(layoutParams4);
            }
            r0Var.f();
            i0();
        }
    }

    public final boolean d0() {
        uh uhVar = this.f37519b.f40437v3;
        if (uhVar != null && uhVar.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.f25423y4;
        jg.r0 r0Var = this.L;
        if (i7 == i11) {
            this.U = false;
            this.T = false;
            f0();
            if (r0Var != null) {
                r0Var.O(this.U, this.T);
            }
            org.telegram.messenger.ea eaVar = this.E;
            if (eaVar != null) {
                try {
                    eaVar.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25430z4) {
            this.U = true;
            this.T = false;
            if (r0Var != null) {
                r0Var.O(true, false);
            }
        }
        c0();
        this.f37519b.getClass();
        this.f37572x.setVisibility(0);
    }

    @Override
    public final boolean e() {
        return !d0();
    }

    public final void e0() {
        bi.e3 e3Var;
        di.b1 b1Var;
        int i7;
        int mapContentHeight;
        org.telegram.messenger.bb bbVar;
        if (this.F != null && (e3Var = this.K) != null && (b1Var = this.M) != null) {
            v4.f1 K = b1Var.K(0);
            if (K != null) {
                i7 = K.f59165a.getTop() + b1Var.getTop();
            } else {
                i7 = Integer.MAX_VALUE;
            }
            if (K != null && i7 < getMeasuredHeight()) {
                if (((ai.l0) ((a8.r7) this.F).f617b).getVisibility() == 4) {
                    ((ai.l0) ((a8.r7) this.F).f617b).setVisibility(0);
                    e3Var.setVisibility(0);
                }
                float f10 = i7;
                boolean z10 = true;
                if (this.f37569v0 < 1.0f) {
                    int[] iArr = this.f37571w0;
                    getLocationInWindow(iArr);
                    f10 = Math.min(i7, org.telegram.messenger.g0.W1(this.f37569v0, -iArr[1], i7));
                }
                int max = (int) Math.max(f10, -getMapExtraTop());
                int max2 = (Math.max(0, K.f59165a.getTop()) + b1Var.getTop()) - max;
                int min = (Math.min(this.f37567t0, b1Var.getMeasuredHeight()) + b1Var.getTop()) - max;
                this.f37573x0 = org.telegram.messenger.g0.L(32.0f) + max2;
                this.f37575y0 = min;
                this.f37576z0 = Math.max(0, this.f37564r0 - (getMeasuredHeight() - max));
                float f11 = max;
                e3Var.setTranslationY(f11);
                e3Var.invalidate();
                this.f37563r.setTranslationY(max2);
                this.f37558n.setTranslationY(-Math.max(0, this.f37564r0 - min));
                int top = b1Var.getTop();
                int i10 = min + max;
                float f12 = (top + i10) / 2.0f;
                float max3 = Math.max(f12, ((b1Var.getPaddingTop() + top) + i10) / 2.0f);
                int ceil = (int) Math.ceil(max3 - f12);
                if (ceil != this.D0) {
                    this.D0 = ceil;
                    org.telegram.messenger.g0.g3(new al(this, 0));
                }
                float C = a8.p0.C(max + max2 + i10, 2.0f, max3, f12);
                int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
                float f13 = C - ceil2;
                ((ai.l0) ((a8.r7) this.F).f617b).setTranslationY(f13 - f11);
                int L = ((int) (C - f11)) - org.telegram.messenger.g0.L(48.0f);
                if (L != this.f37556k0) {
                    this.f37556k0 = L;
                    this.P.setTranslationY(L);
                }
                if (((ai.l0) ((a8.r7) this.F).f617b).getMeasuredHeight() > 0) {
                    mapContentHeight = ((ai.l0) ((a8.r7) this.F).f617b).getMeasuredHeight();
                } else {
                    mapContentHeight = getMapContentHeight();
                }
                int max4 = Math.max(0, (int) (mapContentHeight - (i10 - f13)));
                int i11 = ((ceil2 * 2) - mapContentHeight) + max4;
                org.telegram.messenger.ea eaVar = this.E;
                if (eaVar != null) {
                    int i12 = this.E0;
                    if (i11 != i12 || max4 != this.F0) {
                        if (i12 >= 0) {
                            z10 = false;
                        }
                        if (z10) {
                            bbVar = getMapTarget();
                        } else if (ceil2 != this.C0) {
                            eaVar.d();
                            bbVar = (org.telegram.messenger.bb) this.E.d().f15539b;
                        } else {
                            bbVar = null;
                        }
                        this.C0 = ceil2;
                        this.E0 = i11;
                        this.F0 = max4;
                        this.E.n(0, org.telegram.messenger.g0.L(6.0f) + i11, 0, org.telegram.messenger.g0.L(6.0f) + max4);
                        if (bbVar != null) {
                            this.E.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(bbVar));
                        }
                    }
                }
            } else if (((ai.l0) ((a8.r7) this.F).f617b).getVisibility() == 0) {
                ((ai.l0) ((a8.r7) this.F).f617b).setVisibility(4);
                e3Var.setVisibility(4);
            }
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final void f0() {
        ml mlVar;
        ui uiVar = this.f37519b;
        if (uiVar.J1) {
            if (uiVar.f40450y4 != null) {
                org.telegram.messenger.g0.g3(new al(this, 2));
                return;
            } else if (!this.U) {
                File file = uiVar.f40446x4;
                boolean z10 = uiVar.f40442w4;
                if (file != null) {
                    if (z10) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.r7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        mlVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            org.telegram.messenger.g0.g3(new mf(15, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        mlVar.f37554i0 = lastLocation;
                        g0(lastLocation);
                        return;
                    }
                }
                mlVar = this;
                Location lastLocation2 = getLastLocation();
                mlVar.f37554i0 = lastLocation2;
                g0(lastLocation2);
                return;
            } else {
                org.telegram.messenger.g0.g3(new al(this, 7));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f37554i0 = lastLocation3;
        g0(lastLocation3);
    }

    public final void g0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f37554i0 = location2;
            org.telegram.messenger.ea eaVar = this.E;
            jg.r0 r0Var = this.L;
            if (eaVar != null) {
                org.telegram.messenger.bb bbVar = new org.telegram.messenger.bb(location.getLatitude(), location.getLongitude());
                if (r0Var != null) {
                    r0Var.M(this.f37554i0);
                }
                if (!this.m0) {
                    this.f37555j0 = new Location(location);
                    if (this.f37559n0) {
                        this.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(bbVar));
                        return;
                    }
                    this.f37559n0 = true;
                    this.E.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(bbVar, this.E.e() - 4.0f));
                    return;
                }
                return;
            }
            r0Var.M(location2);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override
    public int getCurrentItemTop() {
        di.b1 b1Var = this.M;
        if (b1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        mj0 mj0Var = (mj0) b1Var.K(0);
        if (mj0Var != null) {
            i7 = Math.max((int) mj0Var.f59165a.getY(), 0);
        }
        return org.telegram.messenger.g0.L(56.0f) + i7;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.M.getPaddingTop();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.v6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.v6> arrayList = new ArrayList<>();
        x6 x6Var = new x6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29454h5));
        int i7 = org.telegram.ui.ActionBar.m6.A5;
        di.b1 b1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        org.telegram.ui.ActionBar.q0 q0Var = this.f37572x;
        if (q0Var != null) {
            editTextBoldCursor = q0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29489j5));
        int i10 = org.telegram.ui.ActionBar.m6.nj;
        ImageView imageView = this.f37558n;
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        int i11 = org.telegram.ui.ActionBar.m6.oj;
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        int i12 = org.telegram.ui.ActionBar.m6.lj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f37563r;
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(q0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.pj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(b1Var, 196608, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Hi));
        return arrayList;
    }

    public final void h0(double d, double d2) {
        org.telegram.messenger.ta newCameraUpdateLatLngZoom;
        if (this.E != null) {
            int i7 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i7 != 0 && d2 != 0.0d) {
                Location location = new Location("");
                this.f37555j0 = location;
                location.reset();
                this.f37555j0.setLatitude(d);
                this.f37555j0.setLongitude(d2);
            } else {
                Location location2 = new Location("");
                this.f37554i0 = location2;
                location2.reset();
                this.f37554i0.setLatitude(d);
                this.f37554i0.setLongitude(d2);
            }
            org.telegram.messenger.bb bbVar = new org.telegram.messenger.bb(d, d2);
            if (i7 != 0 && d2 != 0.0d) {
                newCameraUpdateLatLngZoom = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(bbVar, this.E.e() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(bbVar, this.E.f());
            }
            this.G = newCameraUpdateLatLngZoom;
            this.E.h(newCameraUpdateLatLngZoom);
            jg.r0 r0Var = this.L;
            if (i7 != 0 && d2 != 0.0d) {
                r0Var.L(this.f37555j0);
            } else {
                r0Var.M(this.f37554i0);
            }
            r0Var.H();
            this.M.w0(0, 1, null);
            this.f37557l0 = true;
            if (i7 != 0 && d2 != 0.0d) {
                this.m0 = true;
            }
        }
    }

    public final void i0() {
        bi.e3 e3Var;
        if (this.F != null && (e3Var = this.K) != null) {
            di.b1 b1Var = this.M;
            v4.f1 K = b1Var.K(0);
            if (K != null) {
                K.f59165a.getTop();
            } else {
                e3Var.getMeasuredHeight();
            }
            int i7 = this.f37566s0;
            if (i7 < 0) {
                int L = org.telegram.messenger.g0.L(66.0f);
                int i10 = this.f37561p0;
                if (i10 != 1 && i10 != 7 && i10 != 8) {
                    i7 = L;
                } else {
                    i7 = org.telegram.messenger.g0.L(66.0f) + L;
                }
            }
            int measuredHeight = (b1Var.getMeasuredHeight() - getBottomInset()) - i7;
            this.f37567t0 = measuredHeight;
            if (K != null) {
                int bottom = measuredHeight - K.f59165a.getBottom();
                int childCount = b1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = b1Var.getChildAt(i11);
                    if (RecyclerView.R(childAt) > 0) {
                        childAt.setTranslationY(bottom);
                    }
                }
            }
            e0();
        }
    }

    @Override
    public final int j() {
        return 1;
    }

    public final void j0() {
        boolean z10 = this.f37549d0;
        LinearLayout linearLayout = this.f37565s;
        if (z10) {
            boolean z11 = this.f37551f0;
            ek0 ek0Var = this.N;
            if (z11) {
                ek0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            ek0Var.setEmptyView(linearLayout);
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.B0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (z10) {
            c0();
        }
    }

    @Override
    public final void p() {
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25423y4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25430z4);
        this.f37574y = true;
        bi.e3 e3Var = this.K;
        if (e3Var != null) {
            e3Var.invalidate();
        }
        try {
            org.telegram.messenger.ea eaVar = this.E;
            if (eaVar != null) {
                eaVar.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null) {
            ((ai.l0) ((a8.r7) yaVar).f617b).setTranslationY((-org.telegram.messenger.g0.f24046q.y) * 3);
        }
        try {
            org.telegram.messenger.ya yaVar2 = this.F;
            if (yaVar2 != null) {
                ((a8.r7) yaVar2).B();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.ya yaVar3 = this.F;
            if (yaVar3 != null) {
                ((a8.r7) yaVar3).A();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        kl klVar = this.O;
        if (klVar != null) {
            klVar.F();
        }
        ui uiVar = this.f37519b;
        uiVar.V2.n(true);
        uiVar.V2.s().removeView(this.f37572x);
    }

    @Override
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(ll llVar) {
        this.f37560o0 = llVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37519b.f30176b.invalidate();
        i0();
    }

    @Override
    public final void u() {
        this.f37572x.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            b0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f37572x;
        if (q0Var != null) {
            try {
                if (q0Var.getSearchField() != null) {
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29489j5, this.f37518a));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    @Override
    public final void y() {
        boolean z10;
        ui uiVar = this.f37519b;
        if (uiVar != null && !uiVar.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L.U = z10;
    }

    @Override
    public final void z(int i7, boolean z10) {
        if (z10) {
            this.L.U = false;
        }
    }
}
